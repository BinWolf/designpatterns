package com.wolf.designpatterns.facadepattern;

/**
 * Created by wolf on 16/5/12.
 *
 * 本类就是一个相当于门面一样,把通信的整个过程固定死,不然别人可能会不按套路来,那样信就会有问题
 *
 * 需要寄信的人只要负责写好信的内容和地址就行,其它事情他不用担心,就连塞信封都有这个门面帮做
 *
 */
public class ModenPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {

        letterProcess.writeContext(context);

        letterProcess.fillEnvelope(address);

        letterProcess.letterIntoEnvelope();

        letterProcess.sendLetter();

    }
}
