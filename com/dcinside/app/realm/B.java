package com.dcinside.app.realm;

import com.dcinside.app.model.f;
import com.dcinside.app.util.jl;
import h3.e;
import io.realm.F0;
import io.realm.N1;
import io.realm.T0;
import io.realm.W;
import io.realm.d1;
import io.realm.g1;
import io.realm.internal.s;
import io.realm.r1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class b extends d1 implements N1 {
    @s0({"SMAP\nAiPromptHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPromptHistory.kt\ncom/dcinside/app/realm/AiPromptHistory$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,102:1\n1#2:103\n177#3,9:104\n*S KotlinDebug\n*F\n+ 1 AiPromptHistory.kt\ncom/dcinside/app/realm/AiPromptHistory$Companion\n*L\n95#1:104,9\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final void b(F0 f00) {
            b b0;
            g1 g10 = f00.C4(b.class).g2("time", r1.b).p0();
            int v = g10.size();
            int v1 = jl.a.C();
            if(v > v1) {
                try {
                    b0 = null;
                    b0 = (b)g10.get(v - v1 - 1);
                }
                catch(Exception unused_ex) {
                }
                if(b0 == null) {
                    return;
                }
                long v2 = b0.X5();
                g10.x4().v1("time", v2).p0().L0();
            }
        }

        // 去混淆评级： 低(40)
        private final b c(F0 f00, b b0) {
            return (b)f00.C4(b.class).i0("positive", "").i0("negative", "").r0();
        }

        public final void d(@m F0 f00, @l f f0) {
            L.p(f0, "args");
            if(f00 == null) {
                return;
            }
            b b0 = new b();
            b0.g6(System.currentTimeMillis());
            b0.d6(f0.d());
            String s = f0.c();
            b0.c6((s != null && s.length() > 0 ? f0.c() : null));
            b0.e6(f0.i());
            b0.h6(f0.j());
            b0.b6((f0.b() == null ? "" : f0.b()));
            f00.Y3((F0 f01) -> {
                L.p(b0, "$history");
                a b$a0 = b.m;
                b b1 = b$a0.c(f00, b0);
                if(b1 != null) {
                    b1.z5();
                }
                f01.t2(b0, new W[0]);
                L.m(f01);
                b$a0.b(f01);
            });
        }

        // 检测为 Lambda 实现
        private static final void e(F0 f00, b b0, F0 f01) [...]
    }

    @e
    private long d;
    @m
    private String e;
    @l
    private T0 f;
    @m
    private String g;
    @l
    private T0 h;
    @l
    private String i;
    @m
    private String j;
    @m
    private String k;
    private boolean l;
    @l
    public static final a m;

    static {
        b.m = new a(null);
    }

    public b() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.X0("");
        this.Z1(new T0());
        this.q0("");
        this.q3(new T0());
        this.j3("");
        this.a5("");
        this.z2("");
    }

    @Override  // io.realm.N1
    public void M0(boolean z) {
        this.l = z;
    }

    @Override  // io.realm.N1
    public String N1() [...] // 潜在的解密器

    @Override  // io.realm.N1
    public String O1() [...] // 潜在的解密器

    @l
    public T0 Q5() {
        return this.R1();
    }

    @Override  // io.realm.N1
    public T0 R1() {
        return this.h;
    }

    @l
    public T0 R5() {
        return this.W4();
    }

    // 去混淆评级： 低(20)
    @l
    public String S5() {
        return "";
    }

    // 去混淆评级： 低(20)
    @m
    public String T5() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @m
    public String U5() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @m
    public String V5() {
        return "";
    }

    @Override  // io.realm.N1
    public T0 W4() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    @m
    public String W5() {
        return "";
    }

    @Override  // io.realm.N1
    public void X0(String s) {
        this.e = s;
    }

    @Override  // io.realm.N1
    public String X1() [...] // 潜在的解密器

    public long X5() {
        return this.d();
    }

    public boolean Y5() {
        return this.h5();
    }

    @Override  // io.realm.N1
    public void Z1(T0 t00) {
        this.f = t00;
    }

    public void Z5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.q3(t00);
    }

    @Override  // io.realm.N1
    public void a5(String s) {
        this.j = s;
    }

    public void a6(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.Z1(t00);
    }

    public void b6(@l String s) {
        L.p(s, "<set-?>");
        this.j3(s);
    }

    @Override  // io.realm.N1
    public void c(long v) {
        this.d = v;
    }

    public void c6(@m String s) {
        this.q0(s);
    }

    @Override  // io.realm.N1
    public long d() {
        return this.d;
    }

    public void d6(@m String s) {
        this.X0(s);
    }

    public void e6(@m String s) {
        this.a5(s);
    }

    public void f6(@m String s) {
        this.z2(s);
    }

    public void g6(long v) {
        this.c(v);
    }

    @Override  // io.realm.N1
    public boolean h5() {
        return this.l;
    }

    public void h6(boolean z) {
        this.M0(z);
    }

    @Override  // io.realm.N1
    public void j3(String s) {
        this.i = s;
    }

    @Override  // io.realm.N1
    public String l3() [...] // 潜在的解密器

    @Override  // io.realm.N1
    public void q0(String s) {
        this.g = s;
    }

    @Override  // io.realm.N1
    public void q3(T0 t00) {
        this.h = t00;
    }

    @Override  // io.realm.N1
    public String s2() [...] // 潜在的解密器

    @Override  // io.realm.N1
    public void z2(String s) {
        this.k = s;
    }
}

