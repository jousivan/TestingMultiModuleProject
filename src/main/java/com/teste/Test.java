package com.teste;


import org.example.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(CommonCore.getCommonCore());
        System.out.println(ApiCore.getApiCore());
        System.out.println(MobileCore.getMobileCore());
        System.out.println(WebCore.getWebCore());
        System.out.println(LegacyCore.getLegacyCore());
    }
}
