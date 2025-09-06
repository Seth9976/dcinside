package com.dcinside.app.realm;

import com.dcinside.app.util.Bk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import io.realm.F0;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.x2;
import j..time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public class z extends d1 implements x2 {
    @s0({"SMAP\nImageDownloadInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDownloadInfo.kt\ncom/dcinside/app/realm/ImageDownloadInfo$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n112#2,3:117\n129#2,3:121\n132#2,12:125\n116#2:137\n129#2,15:138\n1#3:120\n1#3:124\n*S KotlinDebug\n*F\n+ 1 ImageDownloadInfo.kt\ncom/dcinside/app/realm/ImageDownloadInfo$Companion\n*L\n71#1:117,3\n71#1:121,3\n71#1:125,12\n71#1:137\n71#1:138,15\n71#1:120\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final z a(int v, @m String s, int v1, @m String s1, @m String s2, boolean z) {
            z z1 = new z();
            z1.g6(System.currentTimeMillis());
            z1.i6(s2);
            z1.a6(s);
            z1.d6(v1);
            z1.f6(s1);
            LocalDateTime localDateTime0 = LocalDateTime.now();
            L.o(localDateTime0, "now(...)");
            String s3 = Bk.a.b(localDateTime0);
            String s4 = z ? String.format(Locale.ENGLISH, "%s-%s-%03d", Arrays.copyOf(new Object[]{s, s3, v}, 3)) : String.format(Locale.ENGLISH, "%s-%s-%03d-resize", Arrays.copyOf(new Object[]{s, s3, v}, 3));
            L.o(s4, "format(...)");
            z1.c6(s4);
            return z1;
        }

        public final void b(@l z[] arr_z) {
            long v3;
            long v;
            Class class0;
            L.p(arr_z, "args");
            if(arr_z.length == 0) {
                return;
            }
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = z.class;
            if(z) {
                goto label_34;
            }
            else {
                f00.beginTransaction();
                goto label_9;
            }
            goto label_61;
            try {
            label_9:
                z z1 = (z)f00.C4(class0).f0("state", 1).d2().f0("state", 2).r0();
                if(z1 == null) {
                    long v1 = dl.a.y0();
                    dl.a.r4(v1 + 1L);
                    v = v1 + 1L;
                }
                else {
                    v = z1.S5();
                }
                String s = ll.i();
                ArrayList arrayList0 = new ArrayList();
                for(int v2 = 0; v2 < arr_z.length; ++v2) {
                    z z2 = arr_z[v2];
                    z2.b6(v);
                    z2.h6(s);
                    z2.e6(1);
                    arrayList0.add(z2);
                }
                f00.p2(arrayList0, new W[0]);
                f00.p();
                goto label_61;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_34:
                z z3 = (z)f00.C4(class0).f0("state", 1).d2().f0("state", 2).r0();
                if(z3 == null) {
                    long v4 = dl.a.y0();
                    dl.a.r4(v4 + 1L);
                    v3 = v4 + 1L;
                }
                else {
                    v3 = z3.S5();
                }
                String s1 = ll.i();
                ArrayList arrayList1 = new ArrayList();
                for(int v5 = 0; v5 < arr_z.length; ++v5) {
                    z z4 = arr_z[v5];
                    z4.b6(v3);
                    z4.h6(s1);
                    z4.e6(1);
                    arrayList1.add(z4);
                }
                f00.p2(arrayList1, new W[0]);
                goto label_61;
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable3) {
                c.a(f00, throwable0);
                throw throwable3;
            }
        label_61:
            c.a(f00, null);
        }
    }

    private long d;
    private long e;
    private int f;
    @m
    private String g;
    @m
    private String h;
    @m
    private String i;
    @m
    private String j;
    @m
    private String k;
    private int l;
    @l
    public static final a m = null;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;

    static {
        z.m = new a(null);
    }

    public z() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.x2
    public void G1(String s) {
        this.k = s;
    }

    @Override  // io.realm.x2
    public long G4() {
        return this.d;
    }

    @l
    @n
    public static final z Q5(int v, @m String s, int v1, @m String s1, @m String s2, boolean z) {
        return z.m.a(v, s, v1, s1, s2, z);
    }

    @m
    public String R5() {
        return this.a();
    }

    @Override  // io.realm.x2
    public String S0() {
        return this.k;
    }

    public long S5() {
        return this.G4();
    }

    @m
    public String T5() {
        return this.f();
    }

    public int U5() {
        return this.g();
    }

    public int V5() {
        return this.f4();
    }

    @m
    public String W5() {
        return this.k();
    }

    public long X5() {
        return this.d();
    }

    @m
    public String Y5() {
        return this.S0();
    }

    @Override  // io.realm.x2
    public void Z4(long v) {
        this.d = v;
    }

    @m
    public String Z5() {
        return this.l4();
    }

    @Override  // io.realm.x2
    public String a() {
        return this.g;
    }

    public void a6(@m String s) {
        this.b(s);
    }

    @Override  // io.realm.x2
    public void b(String s) {
        this.g = s;
    }

    public void b6(long v) {
        this.Z4(v);
    }

    @Override  // io.realm.x2
    public void c(long v) {
        this.e = v;
    }

    public void c6(@m String s) {
        this.e(s);
    }

    @Override  // io.realm.x2
    public long d() {
        return this.e;
    }

    public void d6(int v) {
        this.o(v);
    }

    @Override  // io.realm.x2
    public void e(String s) {
        this.j = s;
    }

    public void e6(int v) {
        this.m4(v);
    }

    @Override  // io.realm.x2
    public String f() {
        return this.j;
    }

    @Override  // io.realm.x2
    public int f4() {
        return this.l;
    }

    public void f6(@m String s) {
        this.l(s);
    }

    @Override  // io.realm.x2
    public int g() {
        return this.f;
    }

    @Override  // io.realm.x2
    public void g1(String s) {
        this.h = s;
    }

    public void g6(long v) {
        this.c(v);
    }

    public void h6(@m String s) {
        this.G1(s);
    }

    public void i6(@m String s) {
        this.g1(s);
    }

    @Override  // io.realm.x2
    public String k() {
        return this.i;
    }

    @Override  // io.realm.x2
    public void l(String s) {
        this.i = s;
    }

    @Override  // io.realm.x2
    public String l4() {
        return this.h;
    }

    @Override  // io.realm.x2
    public void m4(int v) {
        this.l = v;
    }

    @Override  // io.realm.x2
    public void o(int v) {
        this.f = v;
    }
}

