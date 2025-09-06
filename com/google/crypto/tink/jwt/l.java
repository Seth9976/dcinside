package com.google.crypto.tink.jwt;

final class l {
    static final String a = "iss";
    static final String b = "sub";
    static final String c = "aud";
    static final String d = "exp";
    static final String e = "nbf";
    static final String f = "iat";
    static final String g = "jti";
    static final String h = "alg";
    static final String i = "kid";
    static final String j = "typ";
    static final String k = "crit";

    // 去混淆评级： 中等(70)
    static boolean a(String s) {
        return s.equals("iss") || s.equals("sub") || s.equals("aud") || s.equals("exp") || s.equals("nbf") || s.equals("iat") || s.equals("jti");
    }

    static void b(String s) {
        if(l.a(s)) {
            throw new IllegalArgumentException(String.format("claim \'%s\' is invalid because it\'s a registered name; use the corresponding setter method.", s));
        }
    }
}

