package com.dcinside.app.bookmark;

import android.content.Context;
import com.dcinside.app.Application;
import com.dcinside.app.base.i;
import com.dcinside.app.model.f0;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.y0;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.n;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.xk;
import io.realm.F0;
import io.realm.T0;
import io.realm.X0;
import io.realm.g1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;

@s0({"SMAP\nFavoriteBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBasket.kt\ncom/dcinside/app/bookmark/FavoriteBasket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,351:1\n1#2:352\n129#3,15:353\n129#3,15:368\n129#3,15:383\n129#3,15:398\n*S KotlinDebug\n*F\n+ 1 FavoriteBasket.kt\ncom/dcinside/app/bookmark/FavoriteBasket\n*L\n194#1:353,15\n244#1:368,15\n258#1:383,15\n288#1:398,15\n*E\n"})
public final class v implements i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @y4.m
    private List a;
    @y4.m
    private g1 b;
    @y4.m
    private g1 c;
    @y4.m
    private F0 d;
    private boolean e;
    @y4.m
    private Throwable f;
    @y4.m
    private K g;
    @y4.m
    private o h;
    @l
    private String i;
    @l
    public static final a j = null;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;

    static {
        v.j = new a(null);
    }

    public v(@y4.m F0 f00, @l K k0) {
        L.p(k0, "onChangeListener");
        super();
        this.i = "";
        this.g = k0;
        F0 f01 = f00 == null ? F0.g4() : f00;
        this.e = f00 == null;
        this.d = f01;
        g1 g10 = f01.C4(B.class).b0("flagChoose", Boolean.TRUE).p0();
        this.c = g10;
        g10.l((g1 g10) -> {
            String s1;
            kl.b(new o[]{this.h});
            B b0 = g10.size() <= 0 ? null : ((B)g10.first());
            String s = "";
            if(b0 == null) {
                s1 = "";
            }
            else {
                s1 = b0.r6();
                L.m(s1);
            }
            this.i = s1;
            if(b0 != null) {
                s = b0.j6();
                L.m(s);
            }
            this.E(s);
        });
        L.m(g10);
        this.C(g10);
    }

    @y4.m
    public final String A() {
        g1 g10 = this.c;
        if(g10 != null) {
            L.m(g10);
            if(g10.size() > 0) {
                g1 g11 = this.c;
                L.m(g11);
                B b0 = (B)g11.first();
                return b0 == null ? null : b0.m6();
            }
        }
        throw new NullPointerException();
    }

    private final void B() {
        g1 g10 = this.b;
        if(g10 == null || g10.isEmpty()) {
            this.a = null;
        }
        else {
            y0 y00 = (y0)g10.first();
            if(y00 != null) {
                this.a = y00.D5().g2(y00.Q5().p3("order"));
            }
        }
        this.D();
    }

    // 检测为 Lambda 实现
    private final void C(g1 g10) [...]

    private final void D() {
        K k0 = this.g;
        if(k0 != null) {
            k0.n(this, this.z(), this.a);
        }
    }

    public final void E(@y4.m String s) {
        static final class e extends N implements Function1 {
            final v e;

            e(v v0) {
                this.e = v0;
                super(1);
            }

            public final void a(List list0) {
                kl.b(new o[]{this.e.h});
                this.e.N();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }

        F0 f00 = this.d;
        if(f00 != null && !f00.isClosed()) {
            this.f = null;
            g1 g10 = this.b;
            if(g10 != null) {
                g10.D();
            }
            boolean z = m0.a.a.i(this.i);
            Class class0 = y0.class;
            if(z) {
                n.y();
                kl.b(new o[]{this.h});
                this.b = f00.C4(class0).i0("userId", "").p0();
                this.B();
                g1 g11 = this.b;
                if(g11 != null) {
                    g11.l((g1 g10) -> {
                        L.p(this, "this$0");
                        this.B();
                    });
                }
            }
            else if(kl.a(new o[]{this.h})) {
                y0 y00 = (y0)f00.C4(class0).i0("userId", this.i).r0();
                if(s != null && y00 != null && y00.T5() && System.currentTimeMillis() - y00.R5() < TimeUnit.SECONDS.toMillis(jl.a.S())) {
                    this.N();
                    return;
                }
                this.h = n.x(s).y5((Object object0) -> {
                    L.p(new e(this), "$tmp0");
                    new e(this).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    this.f = throwable0;
                    this.D();
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void F(v v0, g1 g10) [...]

    // 检测为 Lambda 实现
    private static final void G(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void H(v v0, Throwable throwable0) [...]

    public final void I(@y4.m List list0, @l J j0) {
        final class f extends Y {
            public static final f a;

            static {
                f.a = new f();
            }

            f() {
                super(com.dcinside.app.realm.m.class, "id", "getId()Ljava/lang/String;", 0);
            }

            @Override  // kotlin.jvm.internal.Y
            public void Q(@y4.m Object object0, @y4.m Object object1) {
                ((com.dcinside.app.realm.m)object0).V5(((String)object1));
            }

            @Override  // kotlin.jvm.internal.Y
            @y4.m
            public Object get(@y4.m Object object0) {
                return ((com.dcinside.app.realm.m)object0).R5();
            }
        }


        final class g extends H implements Function1 {
            public static final g a;

            static {
                g.a = new g();
            }

            g() {
                super(1, uk.class, "favorite", "favorite(Ljava/util/List;)Lrx/Observable;", 0);
            }

            public final rx.g a(List list0) {
                return uk.qk(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class h extends N implements Function1 {
            final v e;
            final J f;

            h(v v0, J j0) {
                this.e = v0;
                this.f = j0;
                super(1);
            }

            public final void a(f0 f00) {
                kl.b(new o[]{this.e.h});
                this.e.E(null);
                this.f.a(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        Class class0;
        L.p(j0, "l");
        if(!kl.a(new o[]{this.h})) {
            Dl.D(Application.e.c(), 0x7F1500A7);  // string:alert_favorite_change "즐겨찾기 처리 중입니다."
            return;
        }
        if(this.i.length() == 0) {
            F0 f00 = this.d;
            if(f00 == null) {
                return;
            }
            try {
                boolean z = f00.E0();
                class0 = y0.class;
                if(z) {
                    goto label_33;
                }
                else {
                    f00.beginTransaction();
                    goto label_12;
                }
                goto label_51;
            }
            catch(Exception exception0) {
                timber.log.b.a.y(exception0);
                this.f = exception0;
                j0.a(false);
                return;
            }
            try {
            label_12:
                y0 y00 = (y0)f00.C4(class0).i0("userId", "").r0();
                if(y00 == null) {
                    X0 x00 = f00.n3(class0, "");
                    L.o(x00, "createObject(...)");
                    y00 = (y0)x00;
                }
                T0 t00 = y00.Q5();
                t00.L0();
                if(list0 != null && !list0.isEmpty()) {
                    int v = list0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((com.dcinside.app.realm.m)list0.get(v1)).X5(v1);
                    }
                    t00.addAll(list0);
                }
                f00.p();
                goto label_51;
            }
            catch(Throwable throwable0) {
            }
            try {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable0;
            }
            catch(Exception exception0) {
                timber.log.b.a.y(exception0);
                this.f = exception0;
                j0.a(false);
                return;
            }
            try {
            label_33:
                y0 y01 = (y0)f00.C4(class0).i0("userId", "").r0();
                if(y01 == null) {
                    X0 x01 = f00.n3(class0, "");
                    L.o(x01, "createObject(...)");
                    y01 = (y0)x01;
                }
                T0 t01 = y01.Q5();
                t01.L0();
                if(list0 != null && !list0.isEmpty()) {
                    int v2 = list0.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        ((com.dcinside.app.realm.m)list0.get(v3)).X5(v3);
                    }
                    t01.addAll(list0);
                }
                goto label_51;
            }
            catch(Throwable throwable1) {
            }
            try {
                throw throwable1;
            label_51:
                this.f = null;
                j0.a(true);
                return;
            }
            catch(Exception exception0) {
            }
            timber.log.b.a.y(exception0);
            this.f = exception0;
            j0.a(false);
            return;
        }
        if(list0 != null && !list0.isEmpty()) {
            this.f = null;
            this.h = rx.g.y2(list0).g3((Object object0) -> {
                L.p(f.a, "$tmp0");
                return (String)f.a.invoke(object0);
            }).z6().f2((Object object0) -> {
                L.p(g.a, "$tmp0");
                return (rx.g)g.a.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new h(this, j0), "$tmp0");
                new h(this, j0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.p(j0, "$l");
                this.f = throwable0;
                j0.a(false);
                this.D();
            });
            this.D();
        }
    }

    // 检测为 Lambda 实现
    private static final void J(v v0, J j0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final String K(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final rx.g L(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M(Function1 function10, Object object0) [...]

    private final void N() {
        F0 f00 = this.d;
        if(f00 != null && !f00.isClosed()) {
            this.b = f00.C4(y0.class).i0("userId", this.i).p0();
            this.B();
            g1 g10 = this.b;
            if(g10 != null) {
                g10.l((g1 g10) -> {
                    L.p(this, "this$0");
                    this.B();
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void O(v v0, g1 g10) [...]

    private final void p(Context context0, y0 y00, String s, String s1) {
        com.dcinside.app.realm.m m0 = new com.dcinside.app.realm.m();
        m0.V5(s);
        m0.W5(s1);
        m m1 = m.d.b(s);
        switch(m1) {
            case 1: 
            case 2: {
                m0.U5(m.g.c());
                break;
            }
            case 3: 
            case 4: {
                m0.U5(m1.c());
            }
        }
        L.m(y00);
        Number number0 = y00.Q5().x4().J1("order");
        m0.X5((number0 == null ? 0 : number0.intValue() - 1));
        y00.Q5().add(m0);
        Dl.G(context0, "즐겨찾기 추가 완료");
    }

    public final void q(@l J j0) {
        static final class c extends N implements Function1 {
            final v e;
            final J f;

            c(v v0, J j0) {
                this.e = v0;
                this.f = j0;
                super(1);
            }

            public final void a(f0 f00) {
                kl.b(new o[]{this.e.h});
                this.e.E(null);
                this.f.a(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        L.p(j0, "l");
        if(!kl.a(new o[]{this.h})) {
            Dl.D(Application.e.c(), 0x7F1500A7);  // string:alert_favorite_change "즐겨찾기 처리 중입니다."
            return;
        }
        F0 f00 = this.d;
        if(f00 == null) {
            return;
        }
        int v = this.i.length();
        Class class0 = y0.class;
        if(v == 0) {
            try {
                if(f00.E0()) {
                    f00.C4(class0).p0().L0();
                }
                else {
                    f00.beginTransaction();
                    goto label_14;
                }
                goto label_21;
            }
            catch(Exception exception0) {
                timber.log.b.a.y(exception0);
                this.f = exception0;
                j0.a(false);
                return;
            }
            try {
            label_14:
                f00.C4(class0).p0().L0();
                f00.p();
                goto label_21;
            }
            catch(Throwable throwable0) {
                try {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                label_21:
                    this.f = null;
                    j0.a(true);
                    return;
                }
                catch(Exception exception0) {
                }
            }
            timber.log.b.a.y(exception0);
            this.f = exception0;
            j0.a(false);
            return;
        }
        if(f00.E0()) {
            y0 y00 = (y0)f00.C4(class0).i0("userId", this.i).r0();
            if(y00 != null) {
                y00.V5(0L);
            }
        }
        else {
            f00.beginTransaction();
            try {
                y0 y01 = (y0)f00.C4(class0).i0("userId", this.i).r0();
                if(y01 != null) {
                    y01.V5(0L);
                }
                f00.p();
            }
            catch(Throwable throwable1) {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
            }
        }
        this.f = null;
        this.h = uk.rk().y5((Object object0) -> {
            L.p(new c(this, j0), "$tmp0");
            new c(this, j0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(j0, "$l");
            this.f = throwable0;
            j0.a(false);
            this.D();
        });
        this.D();
    }

    // 检测为 Lambda 实现
    private static final void r(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.i
    public void release() {
        o o0 = this.h;
        if(o0 != null) {
            kl.b(new o[]{o0});
            this.h = null;
        }
        this.g = null;
        g1 g10 = this.c;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.c = null;
        g1 g11 = this.b;
        if(g11 != null) {
            if(!g11.s()) {
                g11 = null;
            }
            if(g11 != null) {
                g11.D();
            }
        }
        this.a = null;
        this.b = null;
        F0 f00 = this.d;
        if(this.e && f00 != null && !f00.isClosed()) {
            f00.y4();
            f00.close();
        }
    }

    // 检测为 Lambda 实现
    private static final void s(v v0, J j0, Throwable throwable0) [...]

    public final boolean t(@y4.m String s) {
        F0 f00 = this.d;
        if(f00 != null) {
            L.m(f00);
            if(!f00.isClosed() && !m0.a.a.i(s)) {
                g1 g10 = this.b;
                if(g10 != null) {
                    L.m(g10);
                    return g10.x4().i0("favoriteList.id", s).r0() != null;
                }
            }
        }
        return false;
    }

    public final void u(@y4.m Context context0, @y4.m String s, @y4.m String s1) {
        static final class d extends N implements Function1 {
            final v e;
            final Context f;

            d(v v0, Context context0) {
                this.e = v0;
                this.f = context0;
                super(1);
            }

            public final void a(@l f0 f00) {
                L.p(f00, "result");
                kl.b(new o[]{this.e.h});
                String s = this.f.getString((xk.f(f00.a()) ? 0x7F150337 : 0x7F15033A));  // string:favorite_add "즐겨찾기 추가 완료"
                Dl.G(this.f, s);
                this.e.E(null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        F0 f00 = this.d;
        if(f00 != null && context0 != null && s != null && s1 != null) {
            if(!kl.a(new o[]{this.h})) {
                Dl.D(context0, 0x7F1500A7);  // string:alert_favorite_change "즐겨찾기 처리 중입니다."
                return;
            }
            this.f = null;
            if(this.i.length() == 0) {
                boolean z = f00.E0();
                Class class0 = y0.class;
                if(z) {
                    y0 y00 = (y0)f00.C4(class0).i0("userId", "").r0();
                    if(y00 != null) {
                        com.dcinside.app.realm.m m0 = (com.dcinside.app.realm.m)y00.Q5().x4().i0("id", s1).r0();
                        if(m0 == null) {
                            this.p(context0, y00, s1, s);
                            return;
                        }
                        m0.z5();
                        Dl.G(context0, "즐겨찾기 해제 완료");
                        return;
                    }
                    this.p(context0, ((y0)f00.n3(class0, "")), s1, s);
                    return;
                }
                f00.beginTransaction();
                try {
                    y0 y01 = (y0)f00.C4(class0).i0("userId", "").r0();
                    if(y01 == null) {
                        this.p(context0, ((y0)f00.n3(class0, "")), s1, s);
                    }
                    else {
                        com.dcinside.app.realm.m m1 = (com.dcinside.app.realm.m)y01.Q5().x4().i0("id", s1).r0();
                        if(m1 == null) {
                            this.p(context0, y01, s1, s);
                        }
                        else {
                            m1.z5();
                            Dl.G(context0, "즐겨찾기 해제 완료");
                        }
                    }
                    f00.p();
                    return;
                }
                catch(Throwable throwable0) {
                }
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable0;
            }
            this.h = uk.pk(s, s1).y5((Object object0) -> {
                L.p(new d(this, context0), "$tmp0");
                new d(this, context0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.p(throwable0, "error");
                this.f = throwable0;
                this.D();
            });
            this.D();
        }
    }

    // 检测为 Lambda 实现
    private static final void v(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w(v v0, Throwable throwable0) [...]

    @y4.m
    public final Throwable x() {
        return this.f;
    }

    @y4.m
    public final List y() {
        return this.a;
    }

    private final int z() {
        if(this.f == null) {
            kl.a(new o[]{this.h});
            return 2;
        }
        return 0;
    }
}

