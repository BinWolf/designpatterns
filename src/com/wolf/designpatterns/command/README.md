命令模式
Command 抽象类:客户发给我们的命令,定义三个工作组的成员变量,供子类使用;定义一个抽象方法 execute,由子类来实现;
Invoker 实现类:项目接头人,setComand 接受客户发给我我们的命令,action 方法是执行客户的命令 
(方法名写成是 action 是与 command 的 execute 区分开,避免混淆)