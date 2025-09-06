package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.subtle.g;
import com.google.gson.m;
import j..util.Optional;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.security.InvalidAlgorithmParameterException;

final class e {
    static class a {
        String a;
        byte[] b;
        String c;
        String d;

        a(String s, byte[] arr_b, String s1, String s2) {
            this.a = s;
            this.b = arr_b;
            this.c = s1;
            this.d = s2;
        }
    }

    static String a(String s, Optional optional0, Optional optional1) throws InvalidAlgorithmParameterException {
        e.q(s);
        m m0 = new m();
        if(optional1.isPresent()) {
            m0.D("kid", ((String)optional1.get()));
        }
        m0.D("alg", s);
        if(optional0.isPresent()) {
            m0.D("typ", ((String)optional0.get()));
        }
        return g.k(m0.toString().getBytes(z.a));
    }

    static String b(String s, byte[] arr_b) {
        return s + "." + e.h(arr_b);
    }

    static String c(String s, Optional optional0, y y0) throws InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.g {
        String s1 = y0.k();
        return y0.E() ? e.a(s, Optional.of(y0.r()), optional0) + "." + e.g(s1) : e.a(s, Optional.empty(), optional0) + "." + e.g(s1);
    }

    static String d(String s) throws com.google.crypto.tink.jwt.g {
        byte[] arr_b = e.o(s);
        e.t(arr_b);
        return new String(arr_b, z.a);
    }

    static String e(String s) throws com.google.crypto.tink.jwt.g {
        byte[] arr_b = e.o(s);
        e.t(arr_b);
        return new String(arr_b, z.a);
    }

    static byte[] f(String s) throws com.google.crypto.tink.jwt.g {
        return e.o(s);
    }

    static String g(String s) {
        return g.k(s.getBytes(z.a));
    }

    static String h(byte[] arr_b) {
        return g.k(arr_b);
    }

    static Optional i(String s) {
        byte[] arr_b = g.j(s);
        return arr_b.length == 4 ? Optional.of(ByteBuffer.wrap(arr_b).getInt()) : Optional.empty();
    }

    static Optional j(int v, F2 f20) throws com.google.crypto.tink.jwt.g {
        if(f20 == F2.e) {
            return Optional.empty();
        }
        if(f20 != F2.c) {
            throw new com.google.crypto.tink.jwt.g("unsupported output prefix type");
        }
        return Optional.of(g.k(ByteBuffer.allocate(4).putInt(v).array()));
    }

    private static String k(m m0, String s) throws com.google.crypto.tink.jwt.g {
        if(!m0.K(s)) {
            throw new com.google.crypto.tink.jwt.g("header " + s + " does not exist");
        }
        if(!m0.G(s).y() || !m0.G(s).o().D()) {
            throw new com.google.crypto.tink.jwt.g("header " + s + " is not a string");
        }
        return m0.G(s).t();
    }

    // 去混淆评级： 低(20)
    static Optional l(m m0) throws com.google.crypto.tink.jwt.g {
        return m0.K("typ") ? Optional.of(e.k(m0, "typ")) : Optional.empty();
    }

    // 去混淆评级： 低(30)
    static boolean m(char c) {
        return c >= 97 && c <= 0x7A || c >= 65 && c <= 90 || c >= 0x30 && c <= 57 || (c == 45 || c == 0x5F);
    }

    static a n(String s) throws com.google.crypto.tink.jwt.g {
        e.p(s);
        int v = s.lastIndexOf(46);
        if(v < 0) {
            throw new com.google.crypto.tink.jwt.g("only tokens in JWS compact serialization format are supported");
        }
        String s1 = s.substring(0, v);
        byte[] arr_b = e.f(s.substring(v + 1));
        int v1 = s1.indexOf(46);
        if(v1 < 0) {
            throw new com.google.crypto.tink.jwt.g("only tokens in JWS compact serialization format are supported");
        }
        String s2 = s1.substring(0, v1);
        String s3 = s1.substring(v1 + 1);
        if(s3.indexOf(46) > 0) {
            throw new com.google.crypto.tink.jwt.g("only tokens in JWS compact serialization format are supported");
        }
        return new a(s1, arr_b, e.d(s2), e.e(s3));
    }

    static byte[] o(String s) throws com.google.crypto.tink.jwt.g {
        for(int v = 0; v < s.length(); ++v) {
            if(!e.m(s.charAt(v))) {
                throw new com.google.crypto.tink.jwt.g("invalid encoding");
            }
        }
        try {
            return g.j(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new com.google.crypto.tink.jwt.g("invalid encoding: " + illegalArgumentException0);
        }
    }

    static void p(String s) throws com.google.crypto.tink.jwt.g {
        for(int v = 0; v < s.length(); ++v) {
            if((s.charAt(v) & 0x80) > 0) {
                throw new com.google.crypto.tink.jwt.g("Non ascii character");
            }
        }
    }

    // 去混淆评级： 低(30)
    private static void q(String s) throws InvalidAlgorithmParameterException {
        s.hashCode();
        switch(s) {
            case "ES256": 
            case "ES384": 
            case "ES512": 
            case "HS256": 
            case "HS384": 
            case "HS512": 
            case "PS256": 
            case "PS384": 
            case "PS512": 
            case "RS256": 
            case "RS384": 
            case "RS512": {
                return;
            }
            default: {
                throw new InvalidAlgorithmParameterException("invalid algorithm: " + s);
            }
        }
    }

    static void r(String s, Optional optional0, Optional optional1, m m0) throws InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.g {
        e.q(s);
        String s1 = e.k(m0, "alg");
        if(!s1.equals(s)) {
            throw new InvalidAlgorithmParameterException(String.format("invalid algorithm; expected %s, got %s", s, s1));
        }
        if(m0.K("crit")) {
            throw new com.google.crypto.tink.jwt.g("all tokens with crit headers are rejected");
        }
        if(optional0.isPresent() && optional1.isPresent()) {
            throw new com.google.crypto.tink.jwt.g("custom_kid can only be set for RAW keys.");
        }
        boolean z = m0.K("kid");
        if(optional0.isPresent()) {
            if(!z) {
                throw new com.google.crypto.tink.jwt.g("missing kid in header");
            }
            e.s(((String)optional0.get()), m0);
        }
        if(optional1.isPresent() && z) {
            e.s(((String)optional1.get()), m0);
        }
    }

    private static void s(String s, m m0) throws com.google.crypto.tink.jwt.g {
        if(!e.k(m0, "kid").equals(s)) {
            throw new com.google.crypto.tink.jwt.g("invalid kid in header");
        }
    }

    static void t(byte[] arr_b) throws com.google.crypto.tink.jwt.g {
        CharsetDecoder charsetDecoder0 = z.a.newDecoder();
        try {
            charsetDecoder0.decode(ByteBuffer.wrap(arr_b));
        }
        catch(CharacterCodingException characterCodingException0) {
            throw new com.google.crypto.tink.jwt.g(characterCodingException0.getMessage());
        }
    }
}

