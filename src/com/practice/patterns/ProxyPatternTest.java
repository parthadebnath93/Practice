package com.practice.patterns;

import java.util.ArrayList;
import java.util.List;

interface Internet{
    public void connect(String url);
}
class ConnectToInternet implements Internet{

    @Override
    public void connect(String url) {
        System.out.println("Connecting to "+url);
    }
}
class ConnectToInternetProxy implements Internet{
    Internet internet=new ConnectToInternet();
    static List<String> list=new ArrayList<>();
    static {
        list.add("www.facebook.com");
        list.add("www.youtube.com");
        list.add("www.twitter.com");
        list.add("www.tiktok.com");
    }
    @Override
    public void connect(String url) {
        if(list.contains(url)){
            throw new UnsupportedOperationException("Cannot connect to the site "+url);
        }
        else {
            internet.connect(url);
        }
    }
}
public class ProxyPatternTest {
    public static void main(String[] args) {
        Internet internet=new ConnectToInternetProxy();
       // internet.connect("www.facebook.com");
        internet.connect("www.google.com");
    }
}
