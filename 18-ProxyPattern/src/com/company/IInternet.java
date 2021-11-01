package com.company;

interface IInternet {
    public void connectTo(String serverhost) throws Exception;
}

class RealInternet implements IInternet {
//    connecting to server
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
    }
}
