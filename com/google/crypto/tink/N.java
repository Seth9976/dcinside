package com.google.crypto.tink;

import O1.l;
import androidx.annotation.RequiresApi;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.proto.r2.c;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.proto.s2;
import com.google.crypto.tink.subtle.g;
import com.google.gson.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

public final class n implements z {
    private final OutputStream a;
    private static final Charset b;

    static {
        n.b = Charset.forName("UTF-8");
    }

    private n(OutputStream outputStream0) {
        this.a = outputStream0;
    }

    @Override  // com.google.crypto.tink.z
    public void a(r2 r20) throws IOException {
        try {
            byte[] arr_b = this.f(r20).toString().getBytes(n.b);
            this.a.write(arr_b);
            this.a.write("\r\n".getBytes(n.b));
        }
        catch(com.google.gson.n n0) {
            throw new IOException(n0);
        }
        finally {
            this.a.close();
        }
    }

    @Override  // com.google.crypto.tink.z
    public void b(W0 w00) throws IOException {
        byte[] arr_b = this.c(w00).toString().getBytes(n.b);
        this.a.write(arr_b);
        this.a.write("\r\n".getBytes(n.b));
        this.a.close();
    }

    private m c(W0 w00) {
        m m0 = new m();
        m0.D("encryptedKeyset", g.e(w00.h0().a0()));
        m0.z("keysetInfo", this.h(w00.f0()));
        return m0;
    }

    private m d(k2 k20) {
        m m0 = new m();
        m0.D("typeUrl", k20.getTypeUrl());
        m0.D("value", g.e(k20.getValue().a0()));
        m0.D("keyMaterialType", k20.E0().name());
        return m0;
    }

    private m e(c r2$c0) {
        m m0 = new m();
        m0.z("keyData", this.d(r2$c0.Z0()));
        m0.D("status", r2$c0.getStatus().name());
        m0.C("keyId", ((long)(((long)r2$c0.H()) & 0xFFFFFFFFL)));
        m0.D("outputPrefixType", r2$c0.y().name());
        return m0;
    }

    private m f(r2 r20) {
        m m0 = new m();
        m0.C("primaryKeyId", this.i(r20.M()));
        com.google.gson.g g0 = new com.google.gson.g();
        for(Object object0: r20.R0()) {
            g0.z(this.e(((c)object0)));
        }
        m0.z("key", g0);
        return m0;
    }

    private m g(com.google.crypto.tink.proto.s2.c s2$c0) {
        m m0 = new m();
        m0.D("typeUrl", s2$c0.getTypeUrl());
        m0.D("status", s2$c0.getStatus().name());
        m0.C("keyId", ((long)(((long)s2$c0.H()) & 0xFFFFFFFFL)));
        m0.D("outputPrefixType", s2$c0.y().name());
        return m0;
    }

    private m h(s2 s20) {
        m m0 = new m();
        m0.C("primaryKeyId", this.i(s20.M()));
        com.google.gson.g g0 = new com.google.gson.g();
        for(Object object0: s20.e1()) {
            g0.z(this.g(((com.google.crypto.tink.proto.s2.c)object0)));
        }
        m0.z("keyInfo", g0);
        return m0;
    }

    private long i(int v) [...] // Inlined contents

    @l(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(file))")
    @Deprecated
    public static z j(File file0) throws IOException {
        return n.k(new FileOutputStream(file0));
    }

    public static z k(OutputStream outputStream0) {
        return new n(outputStream0);
    }

    @l(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.File", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(new File(path)))")
    @Deprecated
    public static z l(String s) throws IOException {
        return n.k(new FileOutputStream(new File(s)));
    }

    @l(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(path.toFile()))")
    @RequiresApi(26)
    @Deprecated
    public static z m(Path path0) throws IOException {
        return n.k(new FileOutputStream(path0.toFile()));
    }
}

