package com.test3;
abstract class nUrl{
    abstract void navigateURL();
}

class Chrome extends nUrl{
    @Override
    void navigateURL() {
        System.out.println("Chrome Url");
    }
}

class Firefox extends nUrl{
    @Override
    void navigateURL() {
        System.out.println("Firefox Url");
    }
}

class Edge extends nUrl{
    @Override
    void navigateURL() {
        System.out.println("Edge Url");
    }
}
public class MainDemo10 {
    public static void main(String[] args) {
        nUrl navigateURL = null;

        Chrome chrome = new Chrome();
        Firefox firefox = new Firefox();
        Edge edge = new Edge();

        navigateURL = chrome;
        chrome.navigateURL();

        navigateURL = firefox;
        firefox.navigateURL();

        navigateURL = edge;
        edge.navigateURL();
    }
}
