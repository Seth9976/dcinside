package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.o;
import okio.internal.i;
import okio.internal.k;
import y4.l;
import y4.m;

@s0({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class okio.s0 extends v {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final e0 a() {
            return okio.s0.j;
        }
    }

    @l
    private final e0 e;
    @l
    private final v f;
    @l
    private final Map g;
    @m
    private final String h;
    @l
    private static final a i;
    @l
    private static final e0 j;

    static {
        okio.s0.i = new a(null);
        okio.s0.j = okio.e0.a.h(e0.b, "/", false, 1, null);
    }

    public okio.s0(@l e0 e00, @l v v0, @l Map map0, @m String s) {
        L.p(e00, "zipPath");
        L.p(v0, "fileSystem");
        L.p(map0, "entries");
        super();
        this.e = e00;
        this.f = v0;
        this.g = map0;
        this.h = s;
    }

    @Override  // okio.v
    @m
    public u E(@l e0 e00) {
        Throwable throwable4;
        u u1;
        n n0;
        L.p(e00, "path");
        e0 e01 = this.O(e00);
        k k0 = (k)this.g.get(e01);
        Throwable throwable0 = null;
        if(k0 == null) {
            return null;
        }
        u u0 = new u(!k0.j(), k0.j(), null, (k0.j() ? null : k0.i()), null, k0.g(), null, null, 0x80, null);
        if(k0.h() == -1L) {
            return u0;
        }
        t t0 = this.f.F(this.e);
        try {
            n0 = Z.e(t0.f0(k0.h()));
        }
        catch(Throwable throwable1) {
            goto label_33;
        }
        try {
            u1 = okio.internal.l.i(n0, u0);
        }
        catch(Throwable throwable2) {
            if(n0 != null) {
                try {
                    n0.close();
                }
                catch(Throwable throwable3) {
                    try {
                        o.a(throwable2, throwable3);
                        throwable4 = throwable2;
                        u1 = null;
                        goto label_28;
                    }
                    catch(Throwable throwable1) {
                        goto label_33;
                    }
                }
            }
            throwable4 = throwable2;
            u1 = null;
            goto label_28;
        }
        if(n0 != null) {
            try {
                n0.close();
            }
            catch(Throwable throwable4) {
                goto label_28;
            }
        }
        throwable4 = null;
        try {
        label_28:
            if(throwable4 != null) {
                throw throwable4;
            }
            L.m(u1);
            goto label_41;
        label_33:
            if(t0 != null) {
                goto label_34;
            }
            u1 = null;
            throwable0 = throwable1;
            goto label_44;
        }
        catch(Throwable throwable1) {
            goto label_33;
        }
        try {
        label_34:
            t0.close();
        }
        catch(Throwable throwable5) {
            o.a(throwable1, throwable5);
        }
        u1 = null;
        throwable0 = throwable1;
        goto label_44;
        try {
        label_41:
            t0.close();
        }
        catch(Throwable throwable0) {
        }
    label_44:
        if(throwable0 != null) {
            throw throwable0;
        }
        L.m(u1);
        return u1;
    }

    @Override  // okio.v
    @l
    public t F(@l e0 e00) {
        L.p(e00, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override  // okio.v
    @l
    public t H(@l e0 e00, boolean z, boolean z1) {
        L.p(e00, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override  // okio.v
    @l
    public m0 K(@l e0 e00, boolean z) {
        L.p(e00, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.v
    @l
    public o0 M(@l e0 e00) throws IOException {
        n n0;
        L.p(e00, "file");
        e0 e01 = this.O(e00);
        k k0 = (k)this.g.get(e01);
        if(k0 == null) {
            throw new FileNotFoundException("no such file: " + e00);
        }
        t t0 = this.f.F(this.e);
        Throwable throwable0 = null;
        try {
            n0 = Z.e(t0.f0(k0.h()));
        }
        catch(Throwable throwable1) {
            if(t0 != null) {
                try {
                    t0.close();
                }
                catch(Throwable throwable2) {
                    o.a(throwable1, throwable2);
                }
            }
            n0 = null;
            throwable0 = throwable1;
            goto label_20;
        }
        try {
            t0.close();
        }
        catch(Throwable throwable0) {
        }
    label_20:
        if(throwable0 != null) {
            throw throwable0;
        }
        L.m(n0);
        okio.internal.l.l(n0);
        return k0.e() == 0 ? new i(n0, k0.i(), true) : new i(new E(new i(n0, k0.d(), true), new Inflater(true)), k0.i(), false);
    }

    private final e0 O(e0 e00) {
        return okio.s0.j.B(e00, true);
    }

    private final List P(e0 e00, boolean z) {
        e0 e01 = this.O(e00);
        k k0 = (k)this.g.get(e01);
        if(k0 == null) {
            if(z) {
                throw new IOException("not a directory: " + e00);
            }
            return null;
        }
        return kotlin.collections.u.V5(k0.b());
    }

    @Override  // okio.v
    @l
    public m0 e(@l e0 e00, boolean z) {
        L.p(e00, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.v
    public void g(@l e0 e00, @l e0 e01) {
        L.p(e00, "source");
        L.p(e01, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.v
    @l
    public e0 h(@l e0 e00) {
        L.p(e00, "path");
        e0 e01 = this.O(e00);
        if(!this.g.containsKey(e01)) {
            throw new FileNotFoundException(String.valueOf(e00));
        }
        return e01;
    }

    @Override  // okio.v
    public void n(@l e0 e00, boolean z) {
        L.p(e00, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.v
    public void p(@l e0 e00, @l e0 e01) {
        L.p(e00, "source");
        L.p(e01, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.v
    public void r(@l e0 e00, boolean z) {
        L.p(e00, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.v
    @l
    public List y(@l e0 e00) {
        L.p(e00, "dir");
        List list0 = this.P(e00, true);
        L.m(list0);
        return list0;
    }

    @Override  // okio.v
    @m
    public List z(@l e0 e00) {
        L.p(e00, "dir");
        return this.P(e00, false);
    }
}

