package com.wolf.jotm;

import org.enhydra.jdbc.standard.StandardXADataSource;
import org.objectweb.jotm.Jotm;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * jotm 实现分布式事务
 * Created by wolf on 16/4/24.
 */
public class JOTMJTATDemo {
    public static void main(String[] args) throws Exception {
        Jotm jotm = new Jotm(true, false);
        //用于多个DataSource之间事务管理
        TransactionManager transactionManager =  jotm.getTransactionManager();
        //用于开始事务、提交事务、回滚事务。
        UserTransaction userTransaction = jotm.getUserTransaction();

        //数据源1
        StandardXADataSource ds1 = new StandardXADataSource();
        ds1.setDriverName("com.mysql.jdbc.Driver");
        ds1.setUser("root");
        ds1.setPassword("root");
        ds1.setUrl("jdbc:mysql://127.0.0.1:3306/dev?useUnicode=true&characterEncoding=utf8");
        ds1.setTransactionManager(transactionManager);

        //数据源2
        StandardXADataSource ds2 = new StandardXADataSource();
        ds2.setDriverName("com.mysql.jdbc.Driver");
        ds2.setUser("test");
        ds2.setPassword("test");
        ds2.setUrl("jdbc:mysql://127.0.0.1:3306/testDB?useUnicode=true&characterEncoding=utf8");
        ds2.setTransactionManager(transactionManager);

        Connection c1 = ds1.getXAConnection().getConnection();
        Connection c2 = ds2.getXAConnection().getConnection();

        //开启事务
        userTransaction.begin();

        try {
            Statement s1 = c1.createStatement();
            Statement s2 = c2.createStatement();
            s1.execute("INSERT INTO test_jotm(id,name) VALUES (3,'wolf')");
            s2.execute("INSERT INTO test_jotm(id,name) VALUES (2,'wolf2')");
            userTransaction.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            userTransaction.rollback();
        } finally {
            if (c1 != null && !c1.isClosed())
                c1.close();
            if (c2 != null && !c2.isClosed())
                c2.close();
            jotm.stop();
        }
    }
}
