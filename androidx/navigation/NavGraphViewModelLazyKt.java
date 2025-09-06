package androidx.navigation;

import A3.a;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.k;
import kotlin.m;
import kotlin.reflect.d;
import y4.l;

public final class NavGraphViewModelLazyKt {
    @MainThread
    @k(level = m.c, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    public static final D e(Fragment fragment0, @IdRes int v, a a0) {
        L.p(fragment0, "<this>");
        D d0 = E.a(new a(fragment0, v) {
            final Fragment e;
            final int f;

            {
                this.e = fragment0;
                this.f = v;
                super(0);
            }

            @l
            public final NavBackStackEntry b() {
                return FragmentKt.a(this.e).D(this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return NavGraphViewModelLazyKt.m(this.e).getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.1 navGraphViewModelLazyKt$navGraphViewModels$10 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                return NavGraphViewModelLazyKt.m(this.e).getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a0 == null) {
            a0 = new a(d0) {
                final D e;

                {
                    this.e = d0;
                    super(0);
                }

                @l
                public final Factory b() {
                    return NavGraphViewModelLazyKt.m(this.e).getDefaultViewModelProviderFactory();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10, navGraphViewModelLazyKt$navGraphViewModels$10, a0);
    }

    @MainThread
    public static final D f(Fragment fragment0, @IdRes int v, a a0, a a1) {
        L.p(fragment0, "<this>");
        D d0 = E.a(new a(fragment0, v) {
            final Fragment e;
            final int f;

            {
                this.e = fragment0;
                this.f = v;
                super(0);
            }

            @l
            public final NavBackStackEntry b() {
                return FragmentKt.a(this.e).D(this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return NavGraphViewModelLazyKt.n(this.e).getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.3 navGraphViewModelLazyKt$navGraphViewModels$30 = new a(a0, d0) {
            final a e;
            final D f;

            {
                this.e = a0;
                this.f = d0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                a a0 = this.e;
                if(a0 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)a0.invoke();
                    return creationExtras0 == null ? NavGraphViewModelLazyKt.n(this.f).getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return NavGraphViewModelLazyKt.n(this.f).getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a1 == null) {
            a1 = new a(d0) {
                final D e;

                {
                    this.e = d0;
                    super(0);
                }

                @l
                public final Factory b() {
                    return NavGraphViewModelLazyKt.n(this.e).getDefaultViewModelProviderFactory();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20, navGraphViewModelLazyKt$navGraphViewModels$30, a1);
    }

    @MainThread
    @k(level = m.c, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    public static final D g(Fragment fragment0, String s, a a0) {
        L.p(fragment0, "<this>");
        L.p(s, "navGraphRoute");
        D d0 = E.a(new a(fragment0, s) {
            final Fragment e;
            final String f;

            {
                this.e = fragment0;
                this.f = s;
                super(0);
            }

            @l
            public final NavBackStackEntry b() {
                return FragmentKt.a(this.e).E(this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return NavGraphViewModelLazyKt.o(this.e).getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.5 navGraphViewModelLazyKt$navGraphViewModels$50 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                return NavGraphViewModelLazyKt.o(this.e).getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a0 == null) {
            a0 = new a(d0) {
                final D e;

                {
                    this.e = d0;
                    super(0);
                }

                @l
                public final Factory b() {
                    return NavGraphViewModelLazyKt.o(this.e).getDefaultViewModelProviderFactory();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30, navGraphViewModelLazyKt$navGraphViewModels$50, a0);
    }

    @MainThread
    public static final D h(Fragment fragment0, String s, a a0, a a1) {
        L.p(fragment0, "<this>");
        L.p(s, "navGraphRoute");
        D d0 = E.a(new a(fragment0, s) {
            final Fragment e;
            final String f;

            {
                this.e = fragment0;
                this.f = s;
                super(0);
            }

            @l
            public final NavBackStackEntry b() {
                return FragmentKt.a(this.e).E(this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return NavGraphViewModelLazyKt.p(this.e).getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.7 navGraphViewModelLazyKt$navGraphViewModels$70 = new a(a0, d0) {
            final a e;
            final D f;

            {
                this.e = a0;
                this.f = d0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                a a0 = this.e;
                if(a0 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)a0.invoke();
                    return creationExtras0 == null ? NavGraphViewModelLazyKt.p(this.f).getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return NavGraphViewModelLazyKt.p(this.f).getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a1 == null) {
            a1 = new a(d0) {
                final D e;

                {
                    this.e = d0;
                    super(0);
                }

                @l
                public final Factory b() {
                    return NavGraphViewModelLazyKt.p(this.e).getDefaultViewModelProviderFactory();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40, navGraphViewModelLazyKt$navGraphViewModels$70, a1);
    }

    public static D i(Fragment fragment0, int v, a a0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            a0 = null;
        }
        L.p(fragment0, "<this>");
        D d0 = E.a(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.2(fragment0, v));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.1(d0);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.1 navGraphViewModelLazyKt$navGraphViewModels$10 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.1(d0);
        if(a0 == null) {
            a0 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.2(d0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10, navGraphViewModelLazyKt$navGraphViewModels$10, a0);
    }

    public static D j(Fragment fragment0, int v, a a0, a a1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            a0 = null;
        }
        if((v1 & 4) != 0) {
            a1 = null;
        }
        L.p(fragment0, "<this>");
        D d0 = E.a(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.4(fragment0, v));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.2(d0);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.3 navGraphViewModelLazyKt$navGraphViewModels$30 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.3(a0, d0);
        if(a1 == null) {
            a1 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.4(d0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20, navGraphViewModelLazyKt$navGraphViewModels$30, a1);
    }

    public static D k(Fragment fragment0, String s, a a0, int v, Object object0) {
        if((v & 2) != 0) {
            a0 = null;
        }
        L.p(fragment0, "<this>");
        L.p(s, "navGraphRoute");
        D d0 = E.a(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.6(fragment0, s));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.3(d0);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.5 navGraphViewModelLazyKt$navGraphViewModels$50 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.5(d0);
        if(a0 == null) {
            a0 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.6(d0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30, navGraphViewModelLazyKt$navGraphViewModels$50, a0);
    }

    public static D l(Fragment fragment0, String s, a a0, a a1, int v, Object object0) {
        if((v & 2) != 0) {
            a0 = null;
        }
        if((v & 4) != 0) {
            a1 = null;
        }
        L.p(fragment0, "<this>");
        L.p(s, "navGraphRoute");
        D d0 = E.a(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.8(fragment0, s));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.4(d0);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.7 navGraphViewModelLazyKt$navGraphViewModels$70 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.7(a0, d0);
        if(a1 == null) {
            a1 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.8(d0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40, navGraphViewModelLazyKt$navGraphViewModels$70, a1);
    }

    private static final NavBackStackEntry m(D d0) {
        return (NavBackStackEntry)d0.getValue();
    }

    private static final NavBackStackEntry n(D d0) {
        return (NavBackStackEntry)d0.getValue();
    }

    private static final NavBackStackEntry o(D d0) {
        return (NavBackStackEntry)d0.getValue();
    }

    private static final NavBackStackEntry p(D d0) {
        return (NavBackStackEntry)d0.getValue();
    }
}

