package com.dcinside.app.settings.block;

import com.dcinside.app.model.B;
import com.dcinside.app.realm.e;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.response.j;
import com.dcinside.app.util.Dl;
import io.realm.T0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import rx.g;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockValuesDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockValuesDTO.kt\ncom/dcinside/app/settings/block/BlockValuesDTO\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1557#2:207\n1628#2,3:208\n1557#2:211\n1628#2,3:212\n*S KotlinDebug\n*F\n+ 1 BlockValuesDTO.kt\ncom/dcinside/app/settings/block/BlockValuesDTO\n*L\n26#1:207\n26#1:208,3\n29#1:211\n29#1:212,3\n*E\n"})
public final class d {
    @s0({"SMAP\nBlockValuesDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockValuesDTO.kt\ncom/dcinside/app/settings/block/BlockValuesDTO$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n774#2:207\n865#2,2:208\n*S KotlinDebug\n*F\n+ 1 BlockValuesDTO.kt\ncom/dcinside/app/settings/block/BlockValuesDTO$Companion\n*L\n187#1:207\n187#1:208,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final List b(@m List list0, @l d d0, @l d d1) {
            L.p(d0, "galleryBlock");
            L.p(d1, "totalBlock");
            if(list0 != null && !list0.isEmpty() && (d0.g() || d1.g())) {
                List list1 = new ArrayList();
                for(Object object0: list0) {
                    B b0 = (B)object0;
                    int v = 1;
                    if(d0.a(b0)) {
                        v = true ^ d0.h();
                        b0.o(((boolean)v));
                    }
                    else if(d1.a(b0)) {
                        v = true ^ d1.h();
                        b0.o(((boolean)v));
                    }
                    if(v != 0) {
                        list1.add(object0);
                    }
                }
                return list1;
            }
            return u.H();
        }

        @l
        public final g c(@l List list0, @l d d0, @l d d1) {
            static final class com.dcinside.app.settings.block.d.a.a extends N implements Function1 {
                final d e;
                final d f;

                com.dcinside.app.settings.block.d.a.a(d d0, d d1) {
                    this.e = d0;
                    this.f = d1;
                    super(1);
                }

                public final Boolean a(PostItem postItem0) {
                    if(!postItem0.c() && this.e.b(postItem0)) {
                        if(this.e.h()) {
                            return false;
                        }
                        postItem0.l0(true);
                        return true;
                    }
                    if(!postItem0.c() && this.f.b(postItem0)) {
                        if(this.f.h()) {
                            return false;
                        }
                        postItem0.l0(true);
                        return true;
                    }
                    return true;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((PostItem)object0));
                }
            }

            L.p(list0, "list");
            L.p(d0, "galleryBlock");
            L.p(d1, "totalBlock");
            if(list0.isEmpty()) {
                g g0 = g.y2(list0);
                L.o(g0, "from(...)");
                return g0;
            }
            if(!d0.g() && !d1.g()) {
                g g1 = g.y2(list0);
                L.o(g1, "from(...)");
                return g1;
            }
            g g2 = g.y2(list0).Z1((Object object0) -> {
                L.p(new com.dcinside.app.settings.block.d.a.a(d0, d1), "$tmp0");
                return (Boolean)new com.dcinside.app.settings.block.d.a.a(d0, d1).invoke(object0);
            });
            L.o(g2, "filter(...)");
            return g2;
        }

        // 检测为 Lambda 实现
        private static final Boolean d(Function1 function10, Object object0) [...]
    }

    private final boolean a;
    private final boolean b;
    @m
    private final String c;
    @l
    private final Set d;
    @l
    private final Set e;
    @l
    private final Set f;
    @l
    private final Set g;
    @l
    private final Set h;
    @l
    public static final a i;

    static {
        d.i = new a(null);
    }

    public d(@m e e0) {
        this.c = e0 == null ? null : e0.T5();
        boolean z = false;
        if(e0 != null && e0.Y5()) {
            this.b = e0.Z5();
            Set set0 = u.a6(e0.X5());
            this.d = set0;
            ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
            for(Object object0: set0) {
                arrayList0.add(Dl.t(((String)object0)));
            }
            this.e = u.a6(arrayList0);
            this.f = u.a6(e0.U5());
            this.g = u.a6(e0.W5());
            T0 t00 = e0.V5();
            ArrayList arrayList1 = new ArrayList(u.b0(t00, 10));
            for(Object object1: t00) {
                L.m(((String)object1));
                arrayList1.add(v.k4(((String)object1), "."));
            }
            Set set1 = u.a6(arrayList1);
            this.h = set1;
            if(!this.d.isEmpty() || !this.f.isEmpty() || !this.g.isEmpty() || !set1.isEmpty() || e0.Y5()) {
                z = true;
            }
            this.a = z;
            return;
        }
        this.a = false;
        this.b = false;
        this.d = k0.k();
        this.e = k0.k();
        this.f = k0.k();
        this.g = k0.k();
        this.h = k0.k();
    }

    public final boolean a(@m B b0) {
        if(!this.a) {
            return false;
        }
        if(b0 == null) {
            return false;
        }
        return b0.e() == null ? d.e(this, false, b0.l(), null, null, null, null, 0x20, null) : d.e(this, false, "[" + b0.e() + "] " + b0.l(), null, null, null, null, 0x20, null);
    }

    // 去混淆评级： 低(20)
    public final boolean b(@m PostItem postItem0) {
        return this.a ? postItem0 != null && this.d(true, postItem0.K(), postItem0.z(), postItem0.N(), postItem0.u(), postItem0.e()) : false;
    }

    // 去混淆评级： 低(20)
    public final boolean c(@m j j0) {
        return this.a ? j0 != null && d.e(this, false, j0.V(), j0.X(), j0.f0(), j0.R(), null, 0x20, null) : false;
    }

    public final boolean d(boolean z, @m String s, @m String s1, @m String s2, @m String s3, @m String s4) {
        if(s1 != null && !v.x3(s1) == 1 && this.g.contains(s1)) {
            return true;
        }
        if(s2 != null && !v.x3(s2) == 1 && this.f.contains(s2)) {
            return true;
        }
        if(s3 != null && !v.x3(s3) == 1) {
            for(Object object0: this.h) {
                List list0 = v.V4(s3, new String[]{"."}, false, 0, 6, null);
                List list1 = v.V4(((String)object0), new String[]{"."}, false, 0, 6, null);
                if(list0.size() >= 2 && list1.size() >= 2 && L.g(list0.get(0), list1.get(0)) && L.g(list0.get(1), list1.get(1))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        Set set0 = z ? this.e : this.d;
        if(!set0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            if(s != null && !v.x3(s) == 1) {
                arrayList0.add(s);
            }
            if(s4 != null && !v.x3(s4) == 1) {
                arrayList0.add(s4);
            }
            if(!arrayList0.isEmpty()) {
                for(Object object1: set0) {
                    String s5 = (String)object1;
                    for(Object object2: arrayList0) {
                        if(v.W2(((String)object2), s5, false, 2, null)) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static boolean e(d d0, boolean z, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 0x20) != 0) {
            s4 = null;
        }
        return d0.d(z, s, s1, s2, s3, s4);
    }

    @m
    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }
}

