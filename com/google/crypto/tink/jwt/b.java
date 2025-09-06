package com.google.crypto.tink.jwt;

import O1.l;
import com.google.crypto.tink.internal.i;
import com.google.crypto.tink.internal.u;
import com.google.crypto.tink.o;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.H1;
import com.google.crypto.tink.proto.M1.c;
import com.google.crypto.tink.proto.M1;
import com.google.crypto.tink.proto.V1;
import com.google.crypto.tink.proto.a2;
import com.google.crypto.tink.proto.d2;
import com.google.crypto.tink.proto.i2;
import com.google.crypto.tink.s;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.g;
import com.google.crypto.tink.w;
import com.google.gson.internal.n;
import com.google.gson.j;
import com.google.gson.m;
import j..util.Optional;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o3.h;

public final class b {
    static class a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[d2.values().length];
            a.c = arr_v;
            try {
                arr_v[d2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[d2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[d2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[V1.values().length];
            a.b = arr_v1;
            try {
                arr_v1[V1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[V1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[V1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[H1.values().length];
            a.a = arr_v2;
            try {
                arr_v2[H1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[H1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[H1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final String b = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final String c = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";

    private static m a(u u0) throws GeneralSecurityException {
        String s1;
        String s;
        M1 m10;
        try {
            m10 = M1.c3(u0.g(), V.d());
        }
        catch(y0 y00) {
            throw new GeneralSecurityException("failed to parse value as JwtEcdsaPublicKey proto", y00);
        }
        switch(a.a[m10.g().ordinal()]) {
            case 1: {
                s = "ES256";
                s1 = "P-256";
                break;
            }
            case 2: {
                s = "ES384";
                s1 = "P-384";
                break;
            }
            case 3: {
                s = "ES512";
                s1 = "P-521";
                break;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm");
            }
        }
        m m0 = new m();
        m0.D("kty", "EC");
        m0.D("crv", s1);
        m0.D("x", g.k(m10.t().a0()));
        m0.D("y", g.k(m10.u().a0()));
        m0.D("use", "sig");
        m0.D("alg", s);
        com.google.gson.g g0 = new com.google.gson.g();
        g0.D("verify");
        m0.z("key_ops", g0);
        Optional optional0 = b.j(u0.c());
        if(optional0.isPresent()) {
            m0.D("kid", ((String)optional0.get()));
            return m0;
        }
        if(m10.o()) {
            m0.D("kid", m10.l().getValue());
        }
        return m0;
    }

    private static m b(u u0) throws GeneralSecurityException {
        String s;
        a2 a20;
        try {
            a20 = a2.c3(u0.g(), V.d());
        }
        catch(y0 y00) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPkcs1PublicKey proto", y00);
        }
        switch(a20.g()) {
            case 1: {
                s = "RS256";
                break;
            }
            case 2: {
                s = "RS384";
                break;
            }
            case 3: {
                s = "RS512";
                break;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm");
            }
        }
        m m0 = new m();
        m0.D("kty", "RSA");
        m0.D("n", g.k(a20.v().a0()));
        m0.D("e", g.k(a20.k().a0()));
        m0.D("use", "sig");
        m0.D("alg", s);
        com.google.gson.g g0 = new com.google.gson.g();
        g0.D("verify");
        m0.z("key_ops", g0);
        Optional optional0 = b.j(u0.c());
        if(optional0.isPresent()) {
            m0.D("kid", ((String)optional0.get()));
            return m0;
        }
        if(a20.o()) {
            m0.D("kid", a20.l().getValue());
        }
        return m0;
    }

    private static m c(u u0) throws GeneralSecurityException {
        String s;
        i2 i20;
        try {
            i20 = i2.c3(u0.g(), V.d());
        }
        catch(y0 y00) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPssPublicKey proto", y00);
        }
        switch(a.c[i20.g().ordinal()]) {
            case 1: {
                s = "PS256";
                break;
            }
            case 2: {
                s = "PS384";
                break;
            }
            case 3: {
                s = "PS512";
                break;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm");
            }
        }
        m m0 = new m();
        m0.D("kty", "RSA");
        m0.D("n", g.k(i20.v().a0()));
        m0.D("e", g.k(i20.k().a0()));
        m0.D("use", "sig");
        m0.D("alg", s);
        com.google.gson.g g0 = new com.google.gson.g();
        g0.D("verify");
        m0.z("key_ops", g0);
        Optional optional0 = b.j(u0.c());
        if(optional0.isPresent()) {
            m0.D("kid", ((String)optional0.get()));
            return m0;
        }
        if(i20.o()) {
            m0.D("kid", i20.l().getValue());
        }
        return m0;
    }

    private static u d(m m0) throws GeneralSecurityException {
        H1 h10;
        String s = b.k(m0, "alg");
        s.hashCode();
        switch(s) {
            case "ES256": {
                b.g(m0, "crv", "P-256");
                h10 = H1.c;
                break;
            }
            case "ES384": {
                b.g(m0, "crv", "P-384");
                h10 = H1.d;
                break;
            }
            case "ES512": {
                b.g(m0, "crv", "P-521");
                h10 = H1.e;
                break;
            }
            default: {
                throw new GeneralSecurityException("Unknown Ecdsa Algorithm: " + b.k(m0, "alg"));
            }
        }
        if(m0.K("d")) {
            throw new UnsupportedOperationException("importing ECDSA private keys is not implemented");
        }
        b.g(m0, "kty", "EC");
        b.o(m0);
        b.n(m0);
        com.google.crypto.tink.proto.M1.b m1$b0 = M1.X2().a2(0).W1(h10).b2(com.google.crypto.tink.shaded.protobuf.u.p(g.j(b.k(m0, "x")))).c2(com.google.crypto.tink.shaded.protobuf.u.p(g.j(b.k(m0, "y"))));
        if(m0.K("kid")) {
            m1$b0.Z1(((c)c.J2().R1(b.k(m0, "kid")).B1()));
        }
        return u.b("type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey", ((M1)m1$b0.B1()).toByteString(), com.google.crypto.tink.proto.k2.c.e, F2.e, null);
    }

    private static u e(m m0) throws GeneralSecurityException {
        V1 v10;
        String s = b.k(m0, "alg");
        s.hashCode();
        switch(s) {
            case "RS256": {
                v10 = V1.c;
                break;
            }
            case "RS384": {
                v10 = V1.d;
                break;
            }
            case "RS512": {
                v10 = V1.e;
                break;
            }
            default: {
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + b.k(m0, "alg"));
            }
        }
        if(m0.K("p") || m0.K("q") || m0.K("dp") || m0.K("dq") || m0.K("d") || m0.K("qi")) {
            throw new UnsupportedOperationException("importing RSA private keys is not implemented");
        }
        b.g(m0, "kty", "RSA");
        b.o(m0);
        b.n(m0);
        com.google.crypto.tink.proto.a2.b a2$b0 = a2.X2().c2(0).W1(v10).a2(com.google.crypto.tink.shaded.protobuf.u.p(g.j(b.k(m0, "e")))).b2(com.google.crypto.tink.shaded.protobuf.u.p(g.j(b.k(m0, "n"))));
        if(m0.K("kid")) {
            a2$b0.Z1(((com.google.crypto.tink.proto.a2.c)com.google.crypto.tink.proto.a2.c.J2().R1(b.k(m0, "kid")).B1()));
        }
        return u.b("type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey", ((a2)a2$b0.B1()).toByteString(), com.google.crypto.tink.proto.k2.c.e, F2.e, null);
    }

    private static u f(m m0) throws GeneralSecurityException {
        d2 d20;
        String s = b.k(m0, "alg");
        s.hashCode();
        switch(s) {
            case "PS256": {
                d20 = d2.c;
                break;
            }
            case "PS384": {
                d20 = d2.d;
                break;
            }
            case "PS512": {
                d20 = d2.e;
                break;
            }
            default: {
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + b.k(m0, "alg"));
            }
        }
        if(m0.K("p") || m0.K("q") || m0.K("dq") || m0.K("dq") || m0.K("d") || m0.K("qi")) {
            throw new UnsupportedOperationException("importing RSA private keys is not implemented");
        }
        b.g(m0, "kty", "RSA");
        b.o(m0);
        b.n(m0);
        com.google.crypto.tink.proto.i2.b i2$b0 = i2.X2().c2(0).W1(d20).a2(com.google.crypto.tink.shaded.protobuf.u.p(g.j(b.k(m0, "e")))).b2(com.google.crypto.tink.shaded.protobuf.u.p(g.j(b.k(m0, "n"))));
        if(m0.K("kid")) {
            i2$b0.Z1(((com.google.crypto.tink.proto.i2.c)com.google.crypto.tink.proto.i2.c.J2().R1(b.k(m0, "kid")).B1()));
        }
        return u.b("type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey", ((i2)i2$b0.B1()).toByteString(), com.google.crypto.tink.proto.k2.c.e, F2.e, null);
    }

    private static void g(m m0, String s, String s1) throws GeneralSecurityException {
        String s2 = b.k(m0, s);
        if(!s2.equals(s1)) {
            throw new GeneralSecurityException("unexpected " + s + " value: " + s2);
        }
    }

    @l(imports = {"com.google.crypto.tink.jwt.JwkSetConverter"}, replacement = "JwkSetConverter.fromPublicKeysetHandle(handle)")
    @Deprecated
    public static String h(w w0, com.google.crypto.tink.tinkkey.a a0) throws IOException, GeneralSecurityException {
        return b.i(w0);
    }

    public static String i(w w0) throws IOException, GeneralSecurityException {
        com.google.gson.g g0 = new com.google.gson.g();
        for(int v = 0; v < w0.L(); ++v) {
            com.google.crypto.tink.w.c w$c0 = w0.q(v);
            if(w$c0.c() == s.b) {
                o o0 = w$c0.b();
                if(!(o0 instanceof i)) {
                    throw new GeneralSecurityException("only LegacyProtoKey is currently supported");
                }
                u u0 = ((i)o0).d(null);
                if(u0.e() != F2.e && u0.e() != F2.c) {
                    throw new GeneralSecurityException("only OutputPrefixType RAW and TINK are supported");
                }
                if(u0.d() != com.google.crypto.tink.proto.k2.c.e) {
                    throw new GeneralSecurityException("only public keys can be converted");
                }
                String s = u0.f();
                s.hashCode();
                switch(s) {
                    case "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey": {
                        g0.z(b.a(u0));
                        break;
                    }
                    case "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey": {
                        g0.z(b.b(u0));
                        break;
                    }
                    case "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey": {
                        g0.z(b.c(u0));
                        break;
                    }
                    default: {
                        throw new GeneralSecurityException(String.format("key type %s is not supported", u0.f()));
                    }
                }
                continue;
            }
        }
        m m0 = new m();
        m0.z("keys", g0);
        return m0.toString();
    }

    private static Optional j(@h Integer integer0) {
        return integer0 == null ? Optional.empty() : Optional.of(g.k(ByteBuffer.allocate(4).putInt(((int)integer0)).array()));
    }

    private static String k(m m0, String s) throws GeneralSecurityException {
        if(!m0.K(s)) {
            throw new GeneralSecurityException(s + " not found");
        }
        if(!m0.G(s).y() || !m0.G(s).o().D()) {
            throw new GeneralSecurityException(s + " is not a string");
        }
        return m0.G(s).t();
    }

    @l(imports = {"com.google.crypto.tink.jwt.JwkSetConverter"}, replacement = "JwkSetConverter.toPublicKeysetHandle(jwkSet)")
    @Deprecated
    public static w l(String s, com.google.crypto.tink.tinkkey.a a0) throws IOException, GeneralSecurityException {
        return b.m(s);
    }

    public static w m(String s) throws IOException, GeneralSecurityException {
        u u0;
        try {
            com.google.gson.stream.a a0 = new com.google.gson.stream.a(new StringReader(s));
            a0.E0(false);
            m m0 = n.a(a0).n();
        }
        catch(IllegalStateException | com.google.gson.n | StackOverflowError illegalStateException0) {
            throw new GeneralSecurityException("JWK set is invalid JSON", illegalStateException0);
        }
        com.google.crypto.tink.w.b w$b0 = w.C();
        for(Object object0: m0.G("keys").l()) {
            m m1 = ((j)object0).n();
            String s1 = b.k(m1, "alg").substring(0, 2);
            s1.hashCode();
            switch(s1) {
                case "ES": {
                    u0 = b.d(m1);
                    break;
                }
                case "PS": {
                    u0 = b.f(m1);
                    break;
                }
                case "RS": {
                    u0 = b.e(m1);
                    break;
                }
                default: {
                    throw new GeneralSecurityException("unexpected alg value: " + b.k(m1, "alg"));
                }
            }
            w$b0.b(w.B(new i(u0, null)).n());
        }
        if(w$b0.m() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        w$b0.i(0).k();
        return w$b0.c();
    }

    private static void n(m m0) throws GeneralSecurityException {
        if(!m0.K("key_ops")) {
            return;
        }
        if(!m0.G("key_ops").u()) {
            throw new GeneralSecurityException("key_ops is not an array");
        }
        com.google.gson.g g0 = m0.G("key_ops").l();
        if(g0.size() != 1) {
            throw new GeneralSecurityException("key_ops must contain exactly one element");
        }
        if(!g0.I(0).y() || !g0.I(0).o().D()) {
            throw new GeneralSecurityException("key_ops is not a string");
        }
        if(!g0.I(0).t().equals("verify")) {
            throw new GeneralSecurityException("unexpected keyOps value: " + g0.I(0).t());
        }
    }

    private static void o(m m0) throws GeneralSecurityException {
        if(!m0.K("use")) {
            return;
        }
        b.g(m0, "use", "sig");
    }
}

