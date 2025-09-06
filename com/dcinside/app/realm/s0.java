package com.dcinside.app.realm;

import android.content.Context;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.g;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.X2;
import io.realm.d1;
import io.realm.g1;
import io.realm.internal.s;
import io.realm.r1;
import java.util.Arrays;
import kotlin.S0;
import kotlin.V;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;
import z3.n;

public class s0 extends d1 implements X2 {
    @kotlin.jvm.internal.s0({"SMAP\nRecent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recent.kt\ncom/dcinside/app/realm/Recent$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,196:1\n112#2,3:197\n129#2,15:201\n116#2:216\n129#2,15:217\n192#2,7:233\n1#3:200\n37#4:232\n*S KotlinDebug\n*F\n+ 1 Recent.kt\ncom/dcinside/app/realm/Recent$Companion\n*L\n151#1:197,3\n151#1:201,15\n151#1:216\n151#1:217,15\n181#1:233,7\n151#1:200\n170#1:232\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void h(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "galleryId");
            g g0 = context0 instanceof g ? ((g)context0) : null;
            if(g0 == null) {
                return;
            }
            h l0$h0 = new h();
            F0 f00 = g0.F1();
            if(f00 != null) {
                f00.c4((F0 f00) -> {
                    L.p(s, "$galleryId");
                    L.p(l0$h0, "$galleryName");
                    L.m(f00);
                    RealmQuery realmQuery0 = f00.C4(s0.class);
                    L.o(realmQuery0, "this.where(T::class.java)");
                    s0 s00 = (s0)realmQuery0.i0("galleryId", s).r0();
                    if(s00 == null) {
                        return;
                    }
                    if(!dl.a.r0() && s00.U5() == 0 && s00.X5() == 2) {
                        s00.d6(s00.X5() + 1);
                        l0$h0.a = s00.S5();
                        return;
                    }
                    s00.d6(s00.X5() + 1);
                }, () -> {
                    L.p(l0$h0, "$galleryName");
                    L.p(g0, "$activity");
                    L.p(s, "$galleryId");
                    if(((String)l0$h0.a) != null) {
                        V[] arr_v = {r0.a("AddRecentGalleryDialog_gallery_id", s), r0.a("AddRecentGalleryDialog_gallery_name", l0$h0.a)};
                        FragmentManager fragmentManager0 = g0.getSupportFragmentManager();
                        L.o(fragmentManager0, "getSupportFragmentManager(...)");
                        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                        ClassLoader classLoader0 = com.dcinside.app.settings.recent.a.class.getClassLoader();
                        L.m(classLoader0);
                        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.settings.recent.a");
                        if(fragment0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.settings.recent.AddRecentGalleryDialog");
                        }
                        ((com.dcinside.app.settings.recent.a)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
                        ((com.dcinside.app.settings.recent.a)fragment0).show(fragmentManager0, "com.dcinside.app.settings.recent.a");
                        dl.a.k4(true);
                        return;
                    }
                    Xk.i(g0, s);
                }, (Throwable throwable0) -> {
                    L.p(context0, "$context");
                    Dl.G(context0, throwable0.getLocalizedMessage());
                });
            }
        }

        // 检测为 Lambda 实现
        private static final void i(String s, h l0$h0, F0 f00) [...]

        // 检测为 Lambda 实现
        private static final void j(h l0$h0, g g0, String s) [...]

        // 检测为 Lambda 实现
        private static final void k(Context context0, Throwable throwable0) [...]

        public final void l(boolean z) {
            Class class0;
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z1 = f00.E0();
            class0 = s0.class;
            if(z1) {
                goto label_17;
            }
            else {
                f00.beginTransaction();
                if(z) {
                    goto label_7;
                }
                else {
                    goto label_9;
                }
                goto label_10;
            }
            goto label_26;
            try {
            label_7:
                g1 g10 = f00.C4(class0).p0();
                goto label_10;
            label_9:
                g10 = f00.C4(class0).g0("pin", 0L).p0();
            label_10:
                g10.L0();
                f00.p();
                goto label_26;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_17:
                (z ? f00.C4(class0).p0() : f00.C4(class0).g0("pin", 0L).p0()).L0();
                goto label_26;
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
        label_26:
            c.a(f00, null);
        }

        @m
        public final s0 m(@l F0 f00, @m String s) {
            L.p(f00, "realm");
            return (s0)f00.C4(s0.class).i0("galleryId", s).r0();
        }

        @l
        @n
        public final g1 n(@l F0 f00) {
            L.p(f00, "realm");
            g1 g10 = f00.C4(s0.class).i2(new String[]{"pin", "time"}, new r1[]{r1.c, r1.c}).F1(100L).q0();
            L.o(g10, "findAllAsync(...)");
            return g10;
        }

        public final void o(@l F0 f00, @l s0 s00, boolean z) {
            int v = 0;
            L.p(f00, "realm");
            L.p(s00, "recent");
            if(f00.E0()) {
                if(z) {
                    Number number0 = f00.C4(s0.class).G1("pin");
                    if(number0 == null) {
                        number0 = 0;
                    }
                    v = number0.intValue() + 1;
                }
                s00.b6(v);
                s00.c6(System.currentTimeMillis());
                return;
            }
            f00.Y3((F0 f01) -> {
                L.p(f00, "$realm");
                L.p(s00, "$recent");
                int v = 0;
                if(z) {
                    Number number0 = f00.C4(s0.class).G1("pin");
                    if(number0 == null) {
                        number0 = 0;
                    }
                    v = number0.intValue() + 1;
                }
                s00.b6(v);
                s00.c6(System.currentTimeMillis());
            });
        }

        // 检测为 Lambda 实现
        private static final void p(boolean z, F0 f00, s0 s00, F0 f01) [...]

        public final void q(@l g g0, @l s0 s00) {
            static final class com.dcinside.app.realm.s0.a.a extends N implements Function1 {
                public static final com.dcinside.app.realm.s0.a.a e;

                static {
                    com.dcinside.app.realm.s0.a.a.e = new com.dcinside.app.realm.s0.a.a();
                }

                com.dcinside.app.realm.s0.a.a() {
                    super(1);
                }

                public final void a(@l com.dcinside.app.perform.p.a p$a0) {
                    L.p(p$a0, "it");
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((com.dcinside.app.perform.p.a)object0));
                    return S0.a;
                }
            }


            static final class b extends N implements Function1 {
                public static final b e;

                static {
                    b.e = new b();
                }

                b() {
                    super(1);
                }

                public final Boolean a(Integer integer0) {
                    L.m(integer0);
                    return ((int)integer0) < 0 ? false : true;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Integer)object0));
                }
            }


            static final class com.dcinside.app.realm.s0.a.c extends N implements Function1 {
                final g e;
                final s0 f;
                final boolean g;

                com.dcinside.app.realm.s0.a.c(g g0, s0 s00, boolean z) {
                    this.e = g0;
                    this.f = s00;
                    this.g = z;
                    super(1);
                }

                public final void b(Integer integer0) {
                    F0 f00 = this.e.F1();
                    if(f00 == null) {
                        return;
                    }
                    String s = this.f.R5();
                    s0 s00 = (s0)f00.C4(s0.class).i0("galleryId", s).r0();
                    if(s00 == null) {
                        return;
                    }
                    f00.Y3((F0 f00) -> {
                        L.p(s00, "$found");
                        if(integer0 != null && ((int)integer0) == 0) {
                            L.m(f00);
                            s0.j.o(f00, s00, !this.g);
                            return;
                        }
                        if(integer0 != null && ((int)integer0) == 1) {
                            s00.z5();
                            com.dcinside.app.realm.helper.a.a.f();
                        }
                    });
                }

                // 检测为 Lambda 实现
                private static final void c(Integer integer0, s0 s00, boolean z, F0 f00) [...]

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.b(((Integer)object0));
                    return S0.a;
                }
            }

            L.p(g0, "activity");
            L.p(s00, "recent");
            boolean z = s00.U5() > 0;
            com.dcinside.app.perform.e.a e$a0 = e.e.a(g0).n(com.dcinside.app.realm.s0.a.a.e);
            String[] arr_s = g0.getResources().getStringArray((z ? 0x7F03000C : 0x7F03000B));  // array:fix_gallery_remove
            L.o(arr_s, "getStringArray(...)");
            com.dcinside.app.perform.e.a.w(e$a0, arr_s, 0, 2, null).d().Z1((Object object0) -> {
                L.p(b.e, "$tmp0");
                return (Boolean)b.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.realm.s0.a.c(g0, s00, z), "$tmp0");
                new com.dcinside.app.realm.s0.a.c(g0, s00, z).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(g0, "$activity");
                Dl.G(g0, throwable0.getMessage());
            });
        }

        // 检测为 Lambda 实现
        private static final Boolean r(Function1 function10, Object object0) [...]

        // 检测为 Lambda 实现
        private static final void s(Function1 function10, Object object0) [...]

        // 检测为 Lambda 实现
        private static final void t(g g0, Throwable throwable0) [...]
    }

    @h3.e
    @m
    private String d;
    @m
    private String e;
    @h3.c
    private long f;
    private int g;
    private int h;
    private int i;
    @l
    public static final a j;

    static {
        s0.j = new a(null);
    }

    public s0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.X2
    public int H() {
        return this.g;
    }

    @Override  // io.realm.X2
    public void N(int v) {
        this.g = v;
    }

    @Override  // io.realm.X2
    public void O4(int v) {
        this.i = v;
    }

    @n
    public static final void Q5(@l Context context0, @l String s) {
        s0.j.h(context0, s);
    }

    @m
    public final String R5() {
        return this.a();
    }

    @m
    public final String S5() {
        return this.j();
    }

    public final int T5() {
        return this.H();
    }

    public final int U5() {
        return this.u4();
    }

    @Override  // io.realm.X2
    public int V3() {
        return this.i;
    }

    @l
    @n
    public static final g1 V5(@l F0 f00) {
        return s0.j.n(f00);
    }

    public final long W5() {
        return this.d();
    }

    public final int X5() {
        return this.V3();
    }

    public final void Y5(@m String s) {
        this.b(s);
    }

    public final void Z5(@m String s) {
        this.h(s);
    }

    @Override  // io.realm.X2
    public String a() {
        return this.d;
    }

    public final void a6(int v) {
        this.N(v);
    }

    @Override  // io.realm.X2
    public void b(String s) {
        this.d = s;
    }

    public final void b6(int v) {
        this.c2(v);
    }

    @Override  // io.realm.X2
    public void c(long v) {
        this.f = v;
    }

    @Override  // io.realm.X2
    public void c2(int v) {
        this.h = v;
    }

    public final void c6(long v) {
        this.c(v);
    }

    @Override  // io.realm.X2
    public long d() {
        return this.f;
    }

    public final void d6(int v) {
        this.O4(v);
    }

    @Override  // io.realm.X2
    public void h(String s) {
        this.e = s;
    }

    @Override  // io.realm.X2
    public String j() {
        return this.e;
    }

    @Override  // io.realm.X2
    public int u4() {
        return this.h;
    }
}

