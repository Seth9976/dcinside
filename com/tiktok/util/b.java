package com.tiktok.util;

import java.util.regex.Pattern;

public class b {
    public static boolean a(String s) {
        return Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*(\\.[a-zA-Z][a-zA-Z0-9_]*)+$").matcher(s).matches();
    }

    public static boolean b(String s) {
        return Pattern.compile("^(\\d+,)*\\d+$").matcher(s).matches();
    }
}

