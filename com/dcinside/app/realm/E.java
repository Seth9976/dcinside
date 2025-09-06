package com.dcinside.app.realm;

import io.realm.F0;
import io.realm.T0;
import io.realm.W;
import io.realm.Z1;
import io.realm.d1;
import io.realm.internal.s;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public class e extends d1 implements Z1 {
    @s0({"SMAP\nBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Block.kt\ncom/dcinside/app/realm/Block$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,142:1\n129#2,15:143\n*S KotlinDebug\n*F\n+ 1 Block.kt\ncom/dcinside/app/realm/Block$Companion\n*L\n123#1:143,15\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        @n
        public final boolean a(@m e e0) {
            return e0 != null && e0.Y5() && (e0.X5().size() > 0 || e0.V5().size() > 0 || e0.U5().size() > 0 || e0.W5().size() > 0);
        }

        @n
        public final boolean b(@m e e0, @m String s, @m String s1, @m String s2, @m String s3) {
            if(e0 == null) {
                return false;
            }
            if(s1 != null && !v.x3(s1) == 1 && e0.W5().contains(s1)) {
                return true;
            }
            if(s2 != null && !v.x3(s2) == 1 && e0.U5().contains(s2)) {
                return true;
            }
            if(s3 != null && !v.x3(s3) == 1) {
                for(Object object0: e0.V5()) {
                    L.m(((String)object0));
                    String s4 = v.k4(((String)object0), ".");
                    List list0 = v.V4(s3, new String[]{"."}, false, 0, 6, null);
                    List list1 = v.V4(s4, new String[]{"."}, false, 0, 6, null);
                    if(list0.size() >= 2 && list1.size() >= 2 && L.g(list0.get(0), list1.get(0)) && L.g(list0.get(1), list1.get(1))) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(s != null && !v.x3(s) == 1) {
                for(Object object1: e0.X5()) {
                    L.m(((String)object1));
                    if(v.W2(s, ((String)object1), false, 2, null)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }

        @m
        @n
        public final e c(@l F0 f00, @m String s) {
            L.p(f00, "realm");
            try {
                e e0 = (e)f00.C4(e.class).i0("galleryId", s).r0();
                if(e0 != null) {
                    return e0;
                }
                if(f00.E0()) {
                    e e1 = new e();
                    e1.b6(s);
                    e1.g6(new T0());
                    e1.d6(new T0());
                    e1.e6(new T0());
                    e1.f6(new T0());
                    e1.c6(true);
                    e1.a6(true);
                    return (e)f00.t2(e1, new W[0]);
                }
                f00.beginTransaction();
                try {
                    e e2 = new e();
                    e2.b6(s);
                    e2.g6(new T0());
                    e2.d6(new T0());
                    e2.e6(new T0());
                    e2.f6(new T0());
                    e2.c6(true);
                    e2.a6(true);
                    e e3 = (e)f00.t2(e2, new W[0]);
                    f00.p();
                    return e3;
                }
                catch(Throwable throwable0) {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                }
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
    }

    @h3.e
    @m
    private String d;
    private boolean e;
    private boolean f;
    @l
    private T0 g;
    @l
    private T0 h;
    @l
    private T0 i;
    @l
    private T0 j;
    @l
    public static final a k;

    static {
        e.k = new a(null);
    }

    public e() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.G(new T0());
        this.e4(new T0());
        this.I0(new T0());
        this.B3(new T0());
    }

    @Override  // io.realm.Z1
    public void B3(T0 t00) {
        this.j = t00;
    }

    @Override  // io.realm.Z1
    public T0 F() {
        return this.g;
    }

    @Override  // io.realm.Z1
    public void G(T0 t00) {
        this.g = t00;
    }

    @Override  // io.realm.Z1
    public void I0(T0 t00) {
        this.i = t00;
    }

    @Override  // io.realm.Z1
    public T0 L2() {
        return this.h;
    }

    @Override  // io.realm.Z1
    public T0 Q1() {
        return this.i;
    }

    @n
    public static final boolean Q5(@m e e0) {
        return e.k.a(e0);
    }

    @n
    public static final boolean R5(@m e e0, @m String s, @m String s1, @m String s2, @m String s3) {
        return e.k.b(e0, s, s1, s2, s3);
    }

    @m
    @n
    public static final e S5(@l F0 f00, @m String s) {
        return e.k.c(f00, s);
    }

    @m
    public String T5() {
        return this.a();
    }

    @l
    public T0 U5() {
        return this.L2();
    }

    @l
    public T0 V5() {
        return this.v0();
    }

    @l
    public T0 W5() {
        return this.Q1();
    }

    @Override  // io.realm.Z1
    public void X3(boolean z) {
        this.e = z;
    }

    @l
    public T0 X5() {
        return this.F();
    }

    public boolean Y5() {
        return this.h2();
    }

    public boolean Z5() {
        return this.q2();
    }

    @Override  // io.realm.Z1
    public String a() {
        return this.d;
    }

    public void a6(boolean z) {
        this.X3(z);
    }

    @Override  // io.realm.Z1
    public void b(String s) {
        this.d = s;
    }

    public void b6(@m String s) {
        this.b(s);
    }

    public void c6(boolean z) {
        this.r0(z);
    }

    public void d6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.e4(t00);
    }

    @Override  // io.realm.Z1
    public void e4(T0 t00) {
        this.h = t00;
    }

    public void e6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.B3(t00);
    }

    public void f6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.I0(t00);
    }

    public void g6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.G(t00);
    }

    @Override  // io.realm.Z1
    public boolean h2() {
        return this.e;
    }

    @Override  // io.realm.Z1
    public boolean q2() {
        return this.f;
    }

    @Override  // io.realm.Z1
    public void r0(boolean z) {
        this.f = z;
    }

    @Override  // io.realm.Z1
    public T0 v0() {
        return this.j;
    }
}

