package com.dcinside.app.browser.helpers;

import java.net.MalformedURLException;
import java.net.URL;

public class d {
    public static String a(String s) {
        try {
            return new URL(s).getHost();
        }
        catch(MalformedURLException malformedURLException0) {
            malformedURLException0.printStackTrace();
            return s;
        }
    }
}

