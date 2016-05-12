package com.wolf.designpatterns.facadepattern;

/**
 * Created by wolf on 16/5/12.
 *
 * 写信具体过程
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String text) {
        System.out.println("信的内容为:" + text);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("信封地址:" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信塞进信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("送信出去");
    }
}
