package com.google.crypto.tink;

import O1.a;
import O1.l;
import androidx.annotation.RequiresApi;
import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.proto.m2;
import com.google.crypto.tink.proto.r2.b;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.proto.s2;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.subtle.g;
import com.google.gson.j;
import com.google.gson.n;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

public final class m implements y {
    private final InputStream a;
    private boolean b;
    private static final Charset c = null;
    private static final long d = 0xFFFFFFFFL;
    private static final long e = 0xFFFFFFFF80000000L;

    static {
        m.c = Charset.forName("UTF-8");
    }

    private m(InputStream inputStream0) {
        this.b = false;
        this.a = inputStream0;
    }

    @Override  // com.google.crypto.tink.y
    public W0 a() throws IOException {
        InputStream inputStream0;
        W0 w00;
        try {
            try {
                w00 = this.b(JsonParser.c(new String(U.c(this.a), m.c)).n());
                inputStream0 = this.a;
            }
            catch(n | IllegalStateException n0) {
                throw new IOException(n0);
            }
        }
        catch(Throwable throwable0) {
            InputStream inputStream1 = this.a;
            if(inputStream1 != null) {
                inputStream1.close();
            }
            throw throwable0;
        }
        if(inputStream0 != null) {
            inputStream0.close();
        }
        return w00;
    }

    private W0 b(com.google.gson.m m0) throws IOException {
        m.l(m0);
        byte[] arr_b = this.b ? g.j(m0.G("encryptedKeyset").t()) : g.a(m0.G("encryptedKeyset").t());
        return m0.K("keysetInfo") ? ((W0)W0.N2().T1(u.p(arr_b)).V1(m.k(m0.I("keysetInfo"))).B1()) : ((W0)W0.N2().T1(u.p(arr_b)).B1());
    }

    private static int c(j j0) throws IOException {
        try {
            long v = JsonParser.a(j0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IOException(numberFormatException0);
        }
        if(v > 0xFFFFFFFFL || v < 0xFFFFFFFF80000000L) {
            throw new IOException("invalid key id");
        }
        return (int)j0.p();
    }

    private static c d(String s) {
        s.hashCode();
        switch(s) {
            case "ASYMMETRIC_PRIVATE": {
                return c.d;
            }
            case "ASYMMETRIC_PUBLIC": {
                return c.e;
            }
            case "REMOTE": {
                return c.f;
            }
            case "SYMMETRIC": {
                return c.c;
            }
            default: {
                throw new n("unknown key material type: " + s);
            }
        }
    }

    private static F2 e(String s) {
        s.hashCode();
        switch(s) {
            case "CRUNCHY": {
                return F2.f;
            }
            case "LEGACY": {
                return F2.d;
            }
            case "RAW": {
                return F2.e;
            }
            case "TINK": {
                return F2.c;
            }
            default: {
                throw new n("unknown output prefix type: " + s);
            }
        }
    }

    private static m2 f(String s) {
        s.hashCode();
        switch(s) {
            case "DESTROYED": {
                return m2.e;
            }
            case "DISABLED": {
                return m2.d;
            }
            case "ENABLED": {
                return m2.c;
            }
            default: {
                throw new n("unknown status: " + s);
            }
        }
    }

    private k2 g(com.google.gson.m m0) {
        byte[] arr_b;
        m.n(m0);
        if(this.b) {
            arr_b = g.j(m0.G("value").t());
            return (k2)k2.Q2().V1(m0.G("typeUrl").t()).X1(u.p(arr_b)).T1(m.d(m0.G("keyMaterialType").t())).B1();
        }
        arr_b = g.a(m0.G("value").t());
        return (k2)k2.Q2().V1(m0.G("typeUrl").t()).X1(u.p(arr_b)).T1(m.d(m0.G("keyMaterialType").t())).B1();
    }

    private com.google.crypto.tink.proto.r2.c h(com.google.gson.m m0) throws IOException {
        m.m(m0);
        return (com.google.crypto.tink.proto.r2.c)com.google.crypto.tink.proto.r2.c.V2().a2(m.f(m0.G("status").t())).X1(m.c(m0.G("keyId"))).Y1(m.e(m0.G("outputPrefixType").t())).W1(this.g(m0.I("keyData"))).B1();
    }

    private static com.google.crypto.tink.proto.s2.c i(com.google.gson.m m0) throws IOException {
        return (com.google.crypto.tink.proto.s2.c)com.google.crypto.tink.proto.s2.c.U2().X1(m.f(m0.G("status").t())).U1(m.c(m0.G("keyId"))).V1(m.e(m0.G("outputPrefixType").t())).Z1(m0.G("typeUrl").t()).B1();
    }

    private r2 j(com.google.gson.m m0) throws IOException {
        m.o(m0);
        b r2$b0 = r2.V2();
        if(m0.K("primaryKeyId")) {
            r2$b0.a2(m.c(m0.G("primaryKeyId")));
        }
        com.google.gson.g g0 = m0.H("key");
        for(int v = 0; v < g0.size(); ++v) {
            r2$b0.U1(this.h(g0.I(v).n()));
        }
        return (r2)r2$b0.B1();
    }

    private static s2 k(com.google.gson.m m0) throws IOException {
        com.google.crypto.tink.proto.s2.b s2$b0 = s2.V2();
        if(m0.K("primaryKeyId")) {
            s2$b0.a2(m.c(m0.G("primaryKeyId")));
        }
        if(m0.K("keyInfo")) {
            com.google.gson.g g0 = m0.H("keyInfo");
            for(int v = 0; v < g0.size(); ++v) {
                s2$b0.U1(m.i(g0.I(v).n()));
            }
        }
        return (s2)s2$b0.B1();
    }

    private static void l(com.google.gson.m m0) {
        if(!m0.K("encryptedKeyset")) {
            throw new n("invalid encrypted keyset");
        }
    }

    private static void m(com.google.gson.m m0) {
        if(!m0.K("keyData") || !m0.K("status") || !m0.K("keyId") || !m0.K("outputPrefixType")) {
            throw new n("invalid key");
        }
    }

    private static void n(com.google.gson.m m0) {
        if(!m0.K("typeUrl") || !m0.K("value") || !m0.K("keyMaterialType")) {
            throw new n("invalid keyData");
        }
    }

    private static void o(com.google.gson.m m0) {
        if(!m0.K("key") || m0.H("key").size() == 0) {
            throw new n("invalid keyset");
        }
    }

    public static m p(byte[] arr_b) {
        return new m(new ByteArrayInputStream(arr_b));
    }

    @l(imports = {"com.google.crypto.tink.JsonKeysetReader", "java.io.FileInputStream"}, replacement = "JsonKeysetReader.withInputStream(new FileInputStream(file))")
    @Deprecated
    public static m q(File file0) throws IOException {
        return m.r(new FileInputStream(file0));
    }

    public static m r(InputStream inputStream0) throws IOException {
        return new m(inputStream0);
    }

    @Override  // com.google.crypto.tink.y
    public r2 read() throws IOException {
        InputStream inputStream0;
        r2 r20;
        try {
            try {
                r20 = this.j(JsonParser.c(new String(U.c(this.a), m.c)).n());
                inputStream0 = this.a;
            }
            catch(n | IllegalStateException n0) {
                throw new IOException(n0);
            }
        }
        catch(Throwable throwable0) {
            InputStream inputStream1 = this.a;
            if(inputStream1 != null) {
                inputStream1.close();
            }
            throw throwable0;
        }
        if(inputStream0 != null) {
            inputStream0.close();
        }
        return r20;
    }

    @l(imports = {"com.google.crypto.tink.JsonKeysetReader"}, replacement = "JsonKeysetReader.withString(input.toString())")
    @Deprecated
    public static m s(Object object0) {
        return m.v(object0.toString());
    }

    @l(imports = {"com.google.crypto.tink.JsonKeysetReader", "java.io.File", "java.io.FileInputStream"}, replacement = "JsonKeysetReader.withInputStream(new FileInputStream(new File(path)))")
    @Deprecated
    public static m t(String s) throws IOException {
        return m.r(new FileInputStream(new File(s)));
    }

    @l(imports = {"com.google.crypto.tink.JsonKeysetReader", "java.io.FileInputStream"}, replacement = "JsonKeysetReader.withInputStream(new FileInputStream(path.toFile()))")
    @RequiresApi(26)
    @Deprecated
    public static m u(Path path0) throws IOException {
        return m.r(new FileInputStream(path0.toFile()));
    }

    public static m v(String s) {
        return new m(new ByteArrayInputStream(s.getBytes(m.c)));
    }

    @a
    public m w() {
        this.b = true;
        return this;
    }
}

