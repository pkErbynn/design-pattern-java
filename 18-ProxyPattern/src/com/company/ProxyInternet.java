package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet {
    private IInternet internet = new RealInternet();    // real class composition reference

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("whatever.com");
        bannedSites.add("whenever.com");
        bannedSites.add("whichever.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {   // proxy is similar to decorator but it adds an access layer
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverhost);
    }
}
