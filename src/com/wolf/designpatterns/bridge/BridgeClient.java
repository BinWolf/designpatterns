package com.wolf.designpatterns.bridge;

/**
 * Created by wolf on 16/5/15.
 */
public class BridgeClient {

    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp = new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("-------山寨公司生产的衣服是这样运行的-------");
        ShanZhaiCorp clothes = new ShanZhaiCorp(new Clothes());
        clothes.makeMoney();
        System.out.println("\n");

        System.out.println("-------山寨公司生产的ipad是这样运行的-------");
        ShanZhaiCorp ipad = new ShanZhaiCorp(new IPod());
        ipad.makeMoney();
    }
}
