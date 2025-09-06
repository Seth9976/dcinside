package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.k;
import kotlin.text.v;
import y4.l;
import y4.m;

@NavOptionsDsl
public final class NavOptionsBuilder {
    @l
    private final Builder a;
    private boolean b;
    private boolean c;
    @IdRes
    private int d;
    @m
    private String e;
    private boolean f;
    private boolean g;

    public NavOptionsBuilder() {
        this.a = new Builder();
        this.d = -1;
    }

    public final void a(@l Function1 function10) {
        L.p(function10, "animBuilder");
        AnimBuilder animBuilder0 = new AnimBuilder();
        function10.invoke(animBuilder0);
        this.a.b(animBuilder0.a()).c(animBuilder0.b()).e(animBuilder0.c()).f(animBuilder0.d());
    }

    @l
    public final NavOptions b() {
        Builder navOptions$Builder0 = this.a;
        navOptions$Builder0.d(this.b);
        navOptions$Builder0.m(this.c);
        String s = this.e;
        if(s != null) {
            navOptions$Builder0.j(s, this.f, this.g);
            return navOptions$Builder0.a();
        }
        navOptions$Builder0.h(this.d, this.f, this.g);
        return navOptions$Builder0.a();
    }

    public final boolean c() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    @k(message = "Use the popUpToId property.")
    public static void e() {
    }

    public final int f() {
        return this.d;
    }

    @m
    public final String g() {
        return this.e;
    }

    public final boolean h() {
        return this.c;
    }

    public final void i(@IdRes int v, @l Function1 function10) {
        L.p(function10, "popUpToBuilder");
        this.o(v);
        this.p(null);
        PopUpToBuilder popUpToBuilder0 = new PopUpToBuilder();
        function10.invoke(popUpToBuilder0);
        this.f = popUpToBuilder0.a();
        this.g = popUpToBuilder0.b();
    }

    public final void j(@l String s, @l Function1 function10) {
        L.p(s, "route");
        L.p(function10, "popUpToBuilder");
        this.p(s);
        this.o(-1);
        PopUpToBuilder popUpToBuilder0 = new PopUpToBuilder();
        function10.invoke(popUpToBuilder0);
        this.f = popUpToBuilder0.a();
        this.g = popUpToBuilder0.b();
    }

    public static void k(NavOptionsBuilder navOptionsBuilder0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            function10 = androidx.navigation.NavOptionsBuilder.popUpTo.1.e;
        }
        navOptionsBuilder0.i(v, function10);

        final class androidx.navigation.NavOptionsBuilder.popUpTo.1 extends N implements Function1 {
            public static final androidx.navigation.NavOptionsBuilder.popUpTo.1 e;

            static {
                androidx.navigation.NavOptionsBuilder.popUpTo.1.e = new androidx.navigation.NavOptionsBuilder.popUpTo.1();
            }

            androidx.navigation.NavOptionsBuilder.popUpTo.1() {
                super(1);
            }

            public final void a(@l PopUpToBuilder popUpToBuilder0) {
                L.p(popUpToBuilder0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PopUpToBuilder)object0));
                return S0.a;
            }
        }

    }

    public static void l(NavOptionsBuilder navOptionsBuilder0, String s, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = androidx.navigation.NavOptionsBuilder.popUpTo.2.e;
        }
        navOptionsBuilder0.j(s, function10);

        final class androidx.navigation.NavOptionsBuilder.popUpTo.2 extends N implements Function1 {
            public static final androidx.navigation.NavOptionsBuilder.popUpTo.2 e;

            static {
                androidx.navigation.NavOptionsBuilder.popUpTo.2.e = new androidx.navigation.NavOptionsBuilder.popUpTo.2();
            }

            androidx.navigation.NavOptionsBuilder.popUpTo.2() {
                super(1);
            }

            public final void a(@l PopUpToBuilder popUpToBuilder0) {
                L.p(popUpToBuilder0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PopUpToBuilder)object0));
                return S0.a;
            }
        }

    }

    public final void m(boolean z) {
        this.b = z;
    }

    @k(message = "Use the popUpTo function and passing in the id.")
    public final void n(int v) {
        NavOptionsBuilder.k(this, v, null, 2, null);
    }

    public final void o(int v) {
        this.d = v;
        this.f = false;
    }

    private final void p(String s) {
        if(s != null) {
            if(v.x3(s)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.e = s;
            this.f = false;
        }
    }

    public final void q(boolean z) {
        this.c = z;
    }
}

