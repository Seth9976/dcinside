package com.coupang.ads.tools;

import J.b;
import J.d;
import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.coupang.ads.a;
import com.coupang.ads.viewmodels.AdsRequest;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;
import z3.j;

public final class r {
    @MainThread
    public static final AdsViewModel A(a a0, String s, b b0, d d0, String s1, String s2, String s3) {
        L.p(a0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        ViewModelProvider viewModelProvider0 = new ViewModelProvider(a.o.b().o(), new com.coupang.ads.tools.a(adsRequest0));
        L.y(4, "VM");
        ViewModel viewModel0 = viewModelProvider0.b(adsRequest0.toString(), AdsViewModel.class);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), VM::class.java)");
        return (AdsViewModel)viewModel0;
    }

    public static AdsViewModel B(ComponentActivity componentActivity0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            d0 = d.a;
        }
        L.p(componentActivity0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        ViewModelProvider viewModelProvider0 = new ViewModelProvider(componentActivity0.getViewModelStore(), new com.coupang.ads.tools.a(adsRequest0));
        L.y(4, "VM");
        ViewModel viewModel0 = viewModelProvider0.b(adsRequest0.toString(), AdsViewModel.class);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), VM::class.java)");
        return (AdsViewModel)viewModel0;
    }

    public static AdsViewModel C(Fragment fragment0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            d0 = d.a;
        }
        L.p(fragment0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        ViewModelProvider viewModelProvider0 = new ViewModelProvider(fragment0.getViewModelStore(), new com.coupang.ads.tools.a(adsRequest0));
        L.y(4, "VM");
        ViewModel viewModel0 = viewModelProvider0.b(adsRequest0.toString(), AdsViewModel.class);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), VM::class.java)");
        return (AdsViewModel)viewModel0;
    }

    public static AdsViewModel D(a a0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            d0 = d.a;
        }
        L.p(a0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        ViewModelProvider viewModelProvider0 = new ViewModelProvider(a.o.b().o(), new com.coupang.ads.tools.a(adsRequest0));
        L.y(4, "VM");
        ViewModel viewModel0 = viewModelProvider0.b(adsRequest0.toString(), AdsViewModel.class);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), VM::class.java)");
        return (AdsViewModel)viewModel0;
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel E(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        return r.T(componentActivity0, class0, s, b0, null, null, null, null, 120, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel F(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.T(componentActivity0, class0, s, b0, d0, null, null, null, 0x70, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel G(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.T(componentActivity0, class0, s, b0, d0, s1, null, null, 0x60, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel H(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.T(componentActivity0, class0, s, b0, d0, s1, s2, null, 0x40, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel I(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        ViewModel viewModel0 = new ViewModelProvider(componentActivity0.getViewModelStore(), new com.coupang.ads.tools.a(adsRequest0)).b(adsRequest0.toString(), class0);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), viewModelClass)");
        return (AdsViewModel)viewModel0;
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel J(@l Fragment fragment0, @l Class class0, @l String s, @l b b0) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        return r.U(fragment0, class0, s, b0, null, null, null, null, 120, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel K(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.U(fragment0, class0, s, b0, d0, null, null, null, 0x70, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel L(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.U(fragment0, class0, s, b0, d0, s1, null, null, 0x60, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel M(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.U(fragment0, class0, s, b0, d0, s1, s2, null, 0x40, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel N(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        ViewModel viewModel0 = new ViewModelProvider(fragment0.getViewModelStore(), new com.coupang.ads.tools.a(adsRequest0)).b(adsRequest0.toString(), class0);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), viewModelClass)");
        return (AdsViewModel)viewModel0;
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel O(@l a a0, @l Class class0, @l String s, @l b b0) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        return r.V(a0, class0, s, b0, null, null, null, null, 120, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel P(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.V(a0, class0, s, b0, d0, null, null, null, 0x70, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel Q(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.V(a0, class0, s, b0, d0, s1, null, null, 0x60, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel R(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.V(a0, class0, s, b0, d0, s1, s2, null, 0x40, null);
    }

    @MainThread
    @l
    @j
    public static final AdsViewModel S(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        ViewModel viewModel0 = new ViewModelProvider(a0.o(), new com.coupang.ads.tools.a(adsRequest0)).b(adsRequest0.toString(), class0);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), viewModelClass)");
        return (AdsViewModel)viewModel0;
    }

    public static AdsViewModel T(ComponentActivity componentActivity0, Class class0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        d d1 = (v & 8) == 0 ? d0 : d.a;
        String s4 = (v & 16) == 0 ? s1 : null;
        String s5 = (v & 0x20) == 0 ? s2 : null;
        return (v & 0x40) == 0 ? r.I(componentActivity0, class0, s, b0, d1, s4, s5, s3) : r.I(componentActivity0, class0, s, b0, d1, s4, s5, null);
    }

    public static AdsViewModel U(Fragment fragment0, Class class0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        d d1 = (v & 8) == 0 ? d0 : d.a;
        String s4 = (v & 16) == 0 ? s1 : null;
        String s5 = (v & 0x20) == 0 ? s2 : null;
        return (v & 0x40) == 0 ? r.N(fragment0, class0, s, b0, d1, s4, s5, s3) : r.N(fragment0, class0, s, b0, d1, s4, s5, null);
    }

    public static AdsViewModel V(a a0, Class class0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        d d1 = (v & 8) == 0 ? d0 : d.a;
        String s4 = (v & 16) == 0 ? s1 : null;
        String s5 = (v & 0x20) == 0 ? s2 : null;
        return (v & 0x40) == 0 ? r.S(a0, class0, s, b0, d1, s4, s5, s3) : r.S(a0, class0, s, b0, d1, s4, s5, null);
    }

    @MainThread
    public static final D a(ComponentActivity componentActivity0, String s, b b0, d d0, String s1, String s2, String s3) {
        public static final class com.coupang.ads.tools.r.b extends N implements A3.a {
            final ComponentActivity e;

            public com.coupang.ads.tools.r.b(ComponentActivity componentActivity0) {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.getViewModelStore();
                L.o(viewModelStore0, "viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class e extends N implements A3.a {
            final AdsRequest e;

            public e(AdsRequest adsRequest0) {
                this.e = adsRequest0;
                super(0);
            }

            @l
            public final com.coupang.ads.tools.a b() {
                return new com.coupang.ads.tools.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(componentActivity0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        e r$e0 = new e(adsRequest0);
        L.y(4, "VM");
        com.coupang.ads.tools.r.b r$b0 = new com.coupang.ads.tools.r.b(componentActivity0);
        return new com.coupang.ads.tools.b(AdsViewModel.class, adsRequest0.toString(), r$b0, r$e0);
    }

    @MainThread
    public static final D b(Fragment fragment0, String s, b b0, d d0, String s1, String s2, String s3) {
        public static final class c extends N implements A3.a {
            final Fragment e;

            public c(Fragment fragment0) {
                this.e = fragment0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.getViewModelStore();
                L.o(viewModelStore0, "viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class f extends N implements A3.a {
            final AdsRequest e;

            public f(AdsRequest adsRequest0) {
                this.e = adsRequest0;
                super(0);
            }

            @l
            public final com.coupang.ads.tools.a b() {
                return new com.coupang.ads.tools.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(fragment0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        f r$f0 = new f(adsRequest0);
        L.y(4, "VM");
        c r$c0 = new c(fragment0);
        return new com.coupang.ads.tools.b(AdsViewModel.class, adsRequest0.toString(), r$c0, r$f0);
    }

    @MainThread
    public static final D c(String s, b b0, d d0, String s1, String s2, String s3) {
        public static final class com.coupang.ads.tools.r.a extends N implements A3.a {
            public static final com.coupang.ads.tools.r.a e;

            static {
                com.coupang.ads.tools.r.a.e = new com.coupang.ads.tools.r.a();
            }

            public com.coupang.ads.tools.r.a() {
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return a.o.b().o();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class com.coupang.ads.tools.r.d extends N implements A3.a {
            final AdsRequest e;

            public com.coupang.ads.tools.r.d(AdsRequest adsRequest0) {
                this.e = adsRequest0;
                super(0);
            }

            @l
            public final com.coupang.ads.tools.a b() {
                return new com.coupang.ads.tools.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        com.coupang.ads.tools.r.d r$d0 = new com.coupang.ads.tools.r.d(adsRequest0);
        L.y(4, "VM");
        return new com.coupang.ads.tools.b(AdsViewModel.class, adsRequest0.toString(), com.coupang.ads.tools.r.a.e, r$d0);
    }

    public static D d(ComponentActivity componentActivity0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 2) != 0) {
            b0 = b.l;
        }
        if((v & 4) != 0) {
            d0 = d.a;
        }
        L.p(componentActivity0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        e r$e0 = new e(adsRequest0);
        L.y(4, "VM");
        com.coupang.ads.tools.r.b r$b0 = new com.coupang.ads.tools.r.b(componentActivity0);
        return new com.coupang.ads.tools.b(AdsViewModel.class, adsRequest0.toString(), r$b0, r$e0);
    }

    public static D e(Fragment fragment0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            d0 = d.a;
        }
        L.p(fragment0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        f r$f0 = new f(adsRequest0);
        L.y(4, "VM");
        c r$c0 = new c(fragment0);
        return new com.coupang.ads.tools.b(AdsViewModel.class, adsRequest0.toString(), r$c0, r$f0);
    }

    public static D f(String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            d0 = d.a;
        }
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        com.coupang.ads.tools.r.d r$d0 = new com.coupang.ads.tools.r.d(adsRequest0);
        L.y(4, "VM");
        return new com.coupang.ads.tools.b(AdsViewModel.class, adsRequest0.toString(), com.coupang.ads.tools.r.a.e, r$d0);
    }

    @MainThread
    @l
    @j
    public static final D g(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        return r.v(componentActivity0, class0, s, b0, null, null, null, null, 120, null);
    }

    @MainThread
    @l
    @j
    public static final D h(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.v(componentActivity0, class0, s, b0, d0, null, null, null, 0x70, null);
    }

    @MainThread
    @l
    @j
    public static final D i(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.v(componentActivity0, class0, s, b0, d0, s1, null, null, 0x60, null);
    }

    @MainThread
    @l
    @j
    public static final D j(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2) {
        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.v(componentActivity0, class0, s, b0, d0, s1, s2, null, 0x40, null);
    }

    @MainThread
    @l
    @j
    public static final D k(@l ComponentActivity componentActivity0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        static final class h extends N implements A3.a {
            final ComponentActivity e;

            h(ComponentActivity componentActivity0) {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.getViewModelStore();
                L.o(viewModelStore0, "viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class k extends N implements A3.a {
            final AdsRequest e;

            k(AdsRequest adsRequest0) {
                this.e = adsRequest0;
                super(0);
            }

            @l
            public final com.coupang.ads.tools.a b() {
                return new com.coupang.ads.tools.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(componentActivity0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        k r$k0 = new k(adsRequest0);
        return new com.coupang.ads.tools.b(class0, adsRequest0.toString(), new h(componentActivity0), r$k0);
    }

    @MainThread
    @l
    @j
    public static final D l(@l Fragment fragment0, @l Class class0, @l String s, @l b b0) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        return r.w(fragment0, class0, s, b0, null, null, null, null, 120, null);
    }

    @MainThread
    @l
    @j
    public static final D m(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.w(fragment0, class0, s, b0, d0, null, null, null, 0x70, null);
    }

    @MainThread
    @l
    @j
    public static final D n(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.w(fragment0, class0, s, b0, d0, s1, null, null, 0x60, null);
    }

    @MainThread
    @l
    @j
    public static final D o(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2) {
        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.w(fragment0, class0, s, b0, d0, s1, s2, null, 0x40, null);
    }

    @MainThread
    @l
    @j
    public static final D p(@l Fragment fragment0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        static final class i extends N implements A3.a {
            final Fragment e;

            i(Fragment fragment0) {
                this.e = fragment0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.getViewModelStore();
                L.o(viewModelStore0, "viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.tools.r.l extends N implements A3.a {
            final AdsRequest e;

            com.coupang.ads.tools.r.l(AdsRequest adsRequest0) {
                this.e = adsRequest0;
                super(0);
            }

            @l
            public final com.coupang.ads.tools.a b() {
                return new com.coupang.ads.tools.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(fragment0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        com.coupang.ads.tools.r.l r$l0 = new com.coupang.ads.tools.r.l(adsRequest0);
        return new com.coupang.ads.tools.b(class0, adsRequest0.toString(), new i(fragment0), r$l0);
    }

    @MainThread
    @l
    @j
    public static final D q(@l a a0, @l Class class0, @l String s, @l b b0) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        return r.x(a0, class0, s, b0, null, null, null, null, 120, null);
    }

    @MainThread
    @l
    @j
    public static final D r(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.x(a0, class0, s, b0, d0, null, null, null, 0x70, null);
    }

    @MainThread
    @l
    @j
    public static final D s(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.x(a0, class0, s, b0, d0, s1, null, null, 0x60, null);
    }

    @MainThread
    @l
    @j
    public static final D t(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2) {
        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return r.x(a0, class0, s, b0, d0, s1, s2, null, 0x40, null);
    }

    @MainThread
    @l
    @j
    public static final D u(@l a a0, @l Class class0, @l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        static final class g extends N implements A3.a {
            final a e;

            g(a a0) {
                this.e = a0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return this.e.o();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.tools.r.j extends N implements A3.a {
            final AdsRequest e;

            com.coupang.ads.tools.r.j(AdsRequest adsRequest0) {
                this.e = adsRequest0;
                super(0);
            }

            @l
            public final com.coupang.ads.tools.a b() {
                return new com.coupang.ads.tools.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(a0, "<this>");
        L.p(class0, "viewModelClass");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        com.coupang.ads.tools.r.j r$j0 = new com.coupang.ads.tools.r.j(adsRequest0);
        return new com.coupang.ads.tools.b(class0, adsRequest0.toString(), new g(a0), r$j0);
    }

    public static D v(ComponentActivity componentActivity0, Class class0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        d d1 = (v & 8) == 0 ? d0 : d.a;
        String s4 = (v & 16) == 0 ? s1 : null;
        String s5 = (v & 0x20) == 0 ? s2 : null;
        return (v & 0x40) == 0 ? r.k(componentActivity0, class0, s, b0, d1, s4, s5, s3) : r.k(componentActivity0, class0, s, b0, d1, s4, s5, null);
    }

    public static D w(Fragment fragment0, Class class0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        d d1 = (v & 8) == 0 ? d0 : d.a;
        String s4 = (v & 16) == 0 ? s1 : null;
        String s5 = (v & 0x20) == 0 ? s2 : null;
        return (v & 0x40) == 0 ? r.p(fragment0, class0, s, b0, d1, s4, s5, s3) : r.p(fragment0, class0, s, b0, d1, s4, s5, null);
    }

    public static D x(a a0, Class class0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        d d1 = (v & 8) == 0 ? d0 : d.a;
        String s4 = (v & 16) == 0 ? s1 : null;
        String s5 = (v & 0x20) == 0 ? s2 : null;
        return (v & 0x40) == 0 ? r.u(a0, class0, s, b0, d1, s4, s5, s3) : r.u(a0, class0, s, b0, d1, s4, s5, null);
    }

    @MainThread
    public static final AdsViewModel y(ComponentActivity componentActivity0, String s, b b0, d d0, String s1, String s2, String s3) {
        L.p(componentActivity0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        ViewModelProvider viewModelProvider0 = new ViewModelProvider(componentActivity0.getViewModelStore(), new com.coupang.ads.tools.a(adsRequest0));
        L.y(4, "VM");
        ViewModel viewModel0 = viewModelProvider0.b(adsRequest0.toString(), AdsViewModel.class);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), VM::class.java)");
        return (AdsViewModel)viewModel0;
    }

    @MainThread
    public static final AdsViewModel z(Fragment fragment0, String s, b b0, d d0, String s1, String s2, String s3) {
        L.p(fragment0, "<this>");
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        AdsRequest adsRequest0 = new AdsRequest(s, b0, d0, s1, s2, s3);
        ViewModelProvider viewModelProvider0 = new ViewModelProvider(fragment0.getViewModelStore(), new com.coupang.ads.tools.a(adsRequest0));
        L.y(4, "VM");
        ViewModel viewModel0 = viewModelProvider0.b(adsRequest0.toString(), AdsViewModel.class);
        L.o(viewModel0, "ViewModelProvider(\n     …String(), VM::class.java)");
        return (AdsViewModel)viewModel0;
    }
}

