package com.wolf.designpatterns.facadepattern;

/**
 * Created by wolf on 16/5/12.
 *
 * 定义一个通信的过程 写信-->写信封内容-->把信塞到信封中-->寄信
 */
public interface ILetterProcess {

    /**
     * 写信内容
     * @param text
     */
    public void writeContext(String text);

    /**
     * 写信封内容
     * @param address
     */
    public void fillEnvelope(String address);

    /**
     * 把信塞进信封
     */
    public void letterIntoEnvelope();

    /**
     * 寄信
     */
    public void sendLetter();

}
