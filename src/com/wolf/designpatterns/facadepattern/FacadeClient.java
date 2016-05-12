package com.wolf.designpatterns.facadepattern;

/**
 * Created by wolf on 16/5/12.
 */
public class FacadeClient {

    public static void main(String[] args) {
        ModenPostOffice hellRaodPostOffice = new ModenPostOffice();

        String address = "GuangDong SZ China";

        String text = "I like living in here";

        hellRaodPostOffice.sendLetter(text, address);
    }
}
