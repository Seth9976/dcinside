package com.dcinside.app.settings.image;

import com.dcinside.app.realm.B;
import com.dcinside.app.util.uk;
import io.realm.F0;
import io.realm.g1;
import io.realm.r1;
import j0.c;
import j0.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rx.g;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nAutoImageUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoImageUtil.kt\ncom/dcinside/app/settings/image/AutoImageUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n774#2:148\n865#2,2:149\n295#2,2:151\n*S KotlinDebug\n*F\n+ 1 AutoImageUtil.kt\ncom/dcinside/app/settings/image/AutoImageUtil\n*L\n114#1:148\n114#1:149,2\n118#1:151,2\n*E\n"})
public final class i {
    static final class a extends N implements A3.a {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(0);
        }

        @l
        public final g b() {
            @s0({"SMAP\nAutoImageUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoImageUtil.kt\ncom/dcinside/app/settings/image/AutoImageUtil$autoImageCache$1$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n120#2,3:148\n124#2:156\n1#3:151\n1863#4,2:152\n1863#4,2:154\n*S KotlinDebug\n*F\n+ 1 AutoImageUtil.kt\ncom/dcinside/app/settings/image/AutoImageUtil$autoImageCache$1$1\n*L\n31#1:148,3\n31#1:156\n31#1:151\n33#1:152,2\n52#1:154,2\n*E\n"})
            static final class com.dcinside.app.settings.image.i.a.a extends N implements Function1 {
                public static final com.dcinside.app.settings.image.i.a.a e;

                static {
                    com.dcinside.app.settings.image.i.a.a.e = new com.dcinside.app.settings.image.i.a.a();
                }

                com.dcinside.app.settings.image.i.a.a() {
                    super(1);
                }

                public final e a(d d0) {
                    e e0;
                    String s2;
                    F0 f00 = F0.g4();
                    try {
                        L.m(f00);
                        HashMap hashMap0 = new HashMap();
                        for(Object object0: d0.l()) {
                            boolean z = j0.a.k.a("1");
                            hashMap0.put("", new AutoImageData(((c)object0).k(), "", false, j0.a.k.a("1") || L.g("", "X"), z, ((c)object0).l(), "", ""));
                        }
                        g1 g10 = f00.C4(com.dcinside.app.realm.l.class).p0();
                        L.m(g10);
                        Iterator iterator1 = g10.iterator();
                        while(iterator1.hasNext()) {
                            String s = "";
                            Object object1 = iterator1.next();
                            com.dcinside.app.realm.l l0 = (com.dcinside.app.realm.l)object1;
                            if(L.g(l0.R5(), "__DC_GLOBAL_DEF_IMAGE_ID")) {
                                s2 = "X";
                            }
                            else {
                                String s1 = l0.R5();
                                s2 = s1 == null ? "" : s1;
                            }
                            AutoImageData autoImageData0 = (AutoImageData)hashMap0.get(s2);
                            if(autoImageData0 == null) {
                                i i1 = i.a;
                                String s4 = l0.R5();
                                if(s4 == null) {
                                    s4 = "";
                                }
                                String s5 = i1.e(f00, s4, l0.W5());
                                boolean z1 = l0.T5() != null;
                                boolean z2 = l0.W5();
                                String s6 = l0.R5();
                                String s7 = l0.S5();
                                hashMap0.put(s2, new AutoImageData(null, s5, z1, false, z2, 0, (s6 == null ? "" : s6), (s7 == null ? "" : s7), 41, null));
                            }
                            else {
                                if(!autoImageData0.s()) {
                                    autoImageData0.x(l0.T5() != null);
                                }
                                i i0 = i.a;
                                String s3 = l0.R5();
                                if(s3 != null) {
                                    s = s3;
                                }
                                autoImageData0.y(i0.e(f00, s, autoImageData0.w()));
                            }
                        }
                        e0 = new b(new com.dcinside.app.settings.image.d(hashMap0, ((AutoImageData)hashMap0.get("X"))));
                    }
                    catch(Throwable throwable0) {
                        kotlin.io.c.a(f00, throwable0);
                        throw throwable0;
                    }
                    kotlin.io.c.a(f00, null);
                    return e0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((d)object0));
                }
            }

            i.c = B.E.k0();
            g g0 = uk.zk().M3(rx.schedulers.c.a()).g3((Object object0) -> {
                L.p(com.dcinside.app.settings.image.i.a.a.e, "$tmp0");
                return (e)com.dcinside.app.settings.image.i.a.a.e.invoke(object0);
            });
            L.o(g0, "map(...)");
            return g0;
        }

        // 检测为 Lambda 实现
        private static final e c(Function1 function10, Object object0) [...]

        @Override  // A3.a
        public Object invoke() {
            return this.b();
        }
    }

    static final class com.dcinside.app.settings.image.i.b extends N implements Function1 {
        public static final com.dcinside.app.settings.image.i.b e;

        static {
            com.dcinside.app.settings.image.i.b.e = new com.dcinside.app.settings.image.i.b();
        }

        com.dcinside.app.settings.image.i.b() {
            super(1);
        }

        @l
        public final e a(@l Throwable throwable0) {
            L.p(throwable0, "it");
            return new com.dcinside.app.settings.image.e.a(throwable0);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.a(((Throwable)object0));
        }
    }

    @l
    public static final i a = null;
    public static final int b = 20;
    @m
    private static String c;
    @l
    private static final com.dcinside.app.rx.g d;

    static {
        i.a = new i();
        i.d = new com.dcinside.app.rx.g(TimeUnit.HOURS.toMillis(2L), a.e, com.dcinside.app.settings.image.i.b.e);
    }

    public static void a(Throwable throwable0) {
    }

    @n
    public static final void d() {
        i.d.c();
    }

    @l
    public final String e(@l F0 f00, @l String s, boolean z) {
        String s1;
        L.p(f00, "realm");
        L.p(s, "galleryId");
        g1 g10 = f00.C4(com.dcinside.app.realm.l.class).i0("galleryId", s).g2("pick", r1.c).p0();
        L.m(g10);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: g10) {
            if(((com.dcinside.app.realm.l)object0).V5() != null) {
                arrayList0.add(object0);
            }
        }
        if(z) {
            com.dcinside.app.realm.l l0 = (com.dcinside.app.realm.l)u.G2(u.l(arrayList0));
            if(l0 != null) {
                s1 = l0.V5();
                return s1 == null ? "" : s1;
            }
        }
        else {
            Object object1 = null;
            for(Object object2: arrayList0) {
                if(((com.dcinside.app.realm.l)object2).U5()) {
                    object1 = object2;
                    break;
                }
            }
            if(((com.dcinside.app.realm.l)object1) != null) {
                s1 = ((com.dcinside.app.realm.l)object1).V5();
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    public static String f(i i0, F0 f00, String s, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return i0.e(f00, s, z);
    }

    @l
    @n
    public static final g g() {
        if(!L.g(i.c, B.E.k0())) {
            i.d();
        }
        return i.d.d();
    }

    public final void h() {
        static final class com.dcinside.app.settings.image.i.c extends N implements Function1 {
            public static final com.dcinside.app.settings.image.i.c e;

            static {
                com.dcinside.app.settings.image.i.c.e = new com.dcinside.app.settings.image.i.c();
            }

            com.dcinside.app.settings.image.i.c() {
                super(1);
            }

            public final void a(e e0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        i.g().y5((Object object0) -> {
            L.p(com.dcinside.app.settings.image.i.c.e, "$tmp0");
            com.dcinside.app.settings.image.i.c.e.invoke(object0);
        }, new com.dcinside.app.settings.image.g());
    }

    // 检测为 Lambda 实现
    private static final void i(Function1 function10, Object object0) [...]

    private static final void j(Throwable throwable0) {
    }
}

