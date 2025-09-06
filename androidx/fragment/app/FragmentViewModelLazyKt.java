package androidx.fragment.app;

import A3.a;
import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.k;
import kotlin.m;
import kotlin.reflect.d;
import y4.l;

public final class FragmentViewModelLazyKt {
    @MainThread
    @k(level = m.c, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    public static final D c(Fragment fragment0, a a0) {
        L.p(fragment0, "<this>");
        L.y(4, "VM");
        d d0 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.1 fragmentViewModelLazyKt$activityViewModels$10 = new a(fragment0) {
            final Fragment e;

            {
                this.e = fragment0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.requireActivity().getViewModelStore();
                L.o(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.2 fragmentViewModelLazyKt$activityViewModels$20 = new a(fragment0) {
            final Fragment e;

            {
                this.e = fragment0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                CreationExtras creationExtras0 = this.e.requireActivity().getDefaultViewModelCreationExtras();
                L.o(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                return creationExtras0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a0 == null) {
            a0 = new a(fragment0) {
                final Fragment e;

                {
                    this.e = fragment0;
                    super(0);
                }

                @l
                public final Factory b() {
                    Factory viewModelProvider$Factory0 = this.e.requireActivity().getDefaultViewModelProviderFactory();
                    L.o(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d0, fragmentViewModelLazyKt$activityViewModels$10, fragmentViewModelLazyKt$activityViewModels$20, a0);
    }

    @MainThread
    public static final D d(Fragment fragment0, a a0, a a1) {
        L.p(fragment0, "<this>");
        L.y(4, "VM");
        d d0 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.4 fragmentViewModelLazyKt$activityViewModels$40 = new a(fragment0) {
            final Fragment e;

            {
                this.e = fragment0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.requireActivity().getViewModelStore();
                L.o(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.5 fragmentViewModelLazyKt$activityViewModels$50 = new a(a0, fragment0) {
            final a e;
            final Fragment f;

            {
                this.e = a0;
                this.f = fragment0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                CreationExtras creationExtras0;
                a a0 = this.e;
                if(a0 == null) {
                    creationExtras0 = this.f.requireActivity().getDefaultViewModelCreationExtras();
                    L.o(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                }
                else {
                    creationExtras0 = (CreationExtras)a0.invoke();
                    if(creationExtras0 == null) {
                        creationExtras0 = this.f.requireActivity().getDefaultViewModelCreationExtras();
                        L.o(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                        return creationExtras0;
                    }
                }
                return creationExtras0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a1 == null) {
            a1 = new a(fragment0) {
                final Fragment e;

                {
                    this.e = fragment0;
                    super(0);
                }

                @l
                public final Factory b() {
                    Factory viewModelProvider$Factory0 = this.e.requireActivity().getDefaultViewModelProviderFactory();
                    L.o(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d0, fragmentViewModelLazyKt$activityViewModels$40, fragmentViewModelLazyKt$activityViewModels$50, a1);
    }

    public static D e(Fragment fragment0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        L.p(fragment0, "<this>");
        L.y(4, "VM");
        d d0 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.1 fragmentViewModelLazyKt$activityViewModels$10 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.1(fragment0);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.2 fragmentViewModelLazyKt$activityViewModels$20 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.2(fragment0);
        if(a0 == null) {
            a0 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.3(fragment0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d0, fragmentViewModelLazyKt$activityViewModels$10, fragmentViewModelLazyKt$activityViewModels$20, a0);
    }

    public static D f(Fragment fragment0, a a0, a a1, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        if((v & 2) != 0) {
            a1 = null;
        }
        L.p(fragment0, "<this>");
        L.y(4, "VM");
        d d0 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.4 fragmentViewModelLazyKt$activityViewModels$40 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.4(fragment0);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.5 fragmentViewModelLazyKt$activityViewModels$50 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.5(a0, fragment0);
        if(a1 == null) {
            a1 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.6(fragment0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d0, fragmentViewModelLazyKt$activityViewModels$40, fragmentViewModelLazyKt$activityViewModels$50, a1);
    }

    @MainThread
    @k(level = m.c, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    public static final D g(Fragment fragment0, d d0, a a0, a a1) {
        L.p(fragment0, "<this>");
        L.p(d0, "viewModelClass");
        L.p(a0, "storeProducer");
        return FragmentViewModelLazyKt.h(fragment0, d0, a0, new a(fragment0) {
            final Fragment e;

            {
                this.e = fragment0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                CreationExtras creationExtras0 = this.e.getDefaultViewModelCreationExtras();
                L.o(creationExtras0, "defaultViewModelCreationExtras");
                return creationExtras0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, a1);
    }

    @MainThread
    @l
    public static final D h(@l Fragment fragment0, @l d d0, @l a a0, @l a a1, @y4.m a a2) {
        L.p(fragment0, "<this>");
        L.p(d0, "viewModelClass");
        L.p(a0, "storeProducer");
        L.p(a1, "extrasProducer");
        if(a2 == null) {
            a2 = new a(fragment0) {
                final Fragment e;

                {
                    this.e = fragment0;
                    super(0);
                }

                @l
                public final Factory b() {
                    Factory viewModelProvider$Factory0 = this.e.getDefaultViewModelProviderFactory();
                    L.o(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return new ViewModelLazy(d0, a0, a2, a1);
    }

    public static D i(Fragment fragment0, d d0, a a0, a a1, int v, Object object0) {
        if((v & 4) != 0) {
            a1 = null;
        }
        return FragmentViewModelLazyKt.g(fragment0, d0, a0, a1);
    }

    public static D j(Fragment fragment0, d d0, a a0, a a1, a a2, int v, Object object0) {
        if((v & 4) != 0) {
            a1 = new a(fragment0) {
                final Fragment e;

                {
                    this.e = fragment0;
                    super(0);
                }

                @l
                public final CreationExtras b() {
                    CreationExtras creationExtras0 = this.e.getDefaultViewModelCreationExtras();
                    L.o(creationExtras0, "defaultViewModelCreationExtras");
                    return creationExtras0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        if((v & 8) != 0) {
            a2 = null;
        }
        return FragmentViewModelLazyKt.h(fragment0, d0, a0, a1, a2);
    }

    @MainThread
    @k(level = m.c, message = "Superseded by viewModels that takes a CreationExtras producer")
    public static final D k(Fragment fragment0, a a0, a a1) {
        L.p(fragment0, "<this>");
        L.p(a0, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.2 fragmentViewModelLazyKt$viewModels$owner$20 = new a(a0) {
            final a e;

            {
                this.e = a0;
                super(0);
            }

            @l
            public final ViewModelStoreOwner b() {
                return (ViewModelStoreOwner)this.e.invoke();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        D d0 = E.c(H.c, fragmentViewModelLazyKt$viewModels$owner$20);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.2 fragmentViewModelLazyKt$viewModels$20 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = FragmentViewModelLazyKt.o(this.e).getViewModelStore();
                L.o(viewModelStore0, "owner.viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.3 fragmentViewModelLazyKt$viewModels$30 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.o(this.e);
                CreationExtras creationExtras0 = null;
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                if(hasDefaultViewModelProviderFactory0 != null) {
                    creationExtras0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelCreationExtras();
                }
                return creationExtras0 == null ? Empty.b : creationExtras0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a1 == null) {
            a1 = new a(fragment0, d0) {
                final Fragment e;
                final D f;

                {
                    this.e = fragment0;
                    this.f = d0;
                    super(0);
                }

                @l
                public final Factory b() {
                    Factory viewModelProvider$Factory0;
                    ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.o(this.f);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                    if(hasDefaultViewModelProviderFactory0 == null) {
                        viewModelProvider$Factory0 = this.e.getDefaultViewModelProviderFactory();
                    }
                    else {
                        viewModelProvider$Factory0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelProviderFactory();
                        if(viewModelProvider$Factory0 == null) {
                            viewModelProvider$Factory0 = this.e.getDefaultViewModelProviderFactory();
                        }
                    }
                    L.o(viewModelProvider$Factory0, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, fragmentViewModelLazyKt$viewModels$20, fragmentViewModelLazyKt$viewModels$30, a1);
    }

    @MainThread
    public static final D l(Fragment fragment0, a a0, a a1, a a2) {
        L.p(fragment0, "<this>");
        L.p(a0, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.4 fragmentViewModelLazyKt$viewModels$owner$40 = new a(a0) {
            final a e;

            {
                this.e = a0;
                super(0);
            }

            @l
            public final ViewModelStoreOwner b() {
                return (ViewModelStoreOwner)this.e.invoke();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        D d0 = E.c(H.c, fragmentViewModelLazyKt$viewModels$owner$40);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.6 fragmentViewModelLazyKt$viewModels$60 = new a(d0) {
            final D e;

            {
                this.e = d0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = FragmentViewModelLazyKt.p(this.e).getViewModelStore();
                L.o(viewModelStore0, "owner.viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.7 fragmentViewModelLazyKt$viewModels$70 = new a(a1, d0) {
            final a e;
            final D f;

            {
                this.e = a0;
                this.f = d0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                CreationExtras creationExtras0;
                a a0 = this.e;
                if(a0 == null) {
                label_4:
                    ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.p(this.f);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                    creationExtras0 = hasDefaultViewModelProviderFactory0 == null ? null : hasDefaultViewModelProviderFactory0.getDefaultViewModelCreationExtras();
                    if(creationExtras0 == null) {
                        return Empty.b;
                    }
                }
                else {
                    creationExtras0 = (CreationExtras)a0.invoke();
                    if(creationExtras0 == null) {
                        goto label_4;
                    }
                }
                return creationExtras0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(a2 == null) {
            a2 = new a(fragment0, d0) {
                final Fragment e;
                final D f;

                {
                    this.e = fragment0;
                    this.f = d0;
                    super(0);
                }

                @l
                public final Factory b() {
                    Factory viewModelProvider$Factory0;
                    ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.p(this.f);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                    if(hasDefaultViewModelProviderFactory0 == null) {
                        viewModelProvider$Factory0 = this.e.getDefaultViewModelProviderFactory();
                    }
                    else {
                        viewModelProvider$Factory0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelProviderFactory();
                        if(viewModelProvider$Factory0 == null) {
                            viewModelProvider$Factory0 = this.e.getDefaultViewModelProviderFactory();
                        }
                    }
                    L.o(viewModelProvider$Factory0, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, fragmentViewModelLazyKt$viewModels$60, fragmentViewModelLazyKt$viewModels$70, a2);
    }

    public static D m(Fragment fragment0, a a0, a a1, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = new a(fragment0) {
                final Fragment e;

                {
                    this.e = fragment0;
                    super(0);
                }

                @l
                public final Fragment b() {
                    return this.e;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        if((v & 2) != 0) {
            a1 = null;
        }
        L.p(fragment0, "<this>");
        L.p(a0, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.2 fragmentViewModelLazyKt$viewModels$owner$20 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.2(a0);
        D d0 = E.c(H.c, fragmentViewModelLazyKt$viewModels$owner$20);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.2 fragmentViewModelLazyKt$viewModels$20 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.2(d0);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.3 fragmentViewModelLazyKt$viewModels$30 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.3(d0);
        if(a1 == null) {
            a1 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.4(fragment0, d0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, fragmentViewModelLazyKt$viewModels$20, fragmentViewModelLazyKt$viewModels$30, a1);
    }

    public static D n(Fragment fragment0, a a0, a a1, a a2, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = new a(fragment0) {
                final Fragment e;

                {
                    this.e = fragment0;
                    super(0);
                }

                @l
                public final Fragment b() {
                    return this.e;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        if((v & 2) != 0) {
            a1 = null;
        }
        if((v & 4) != 0) {
            a2 = null;
        }
        L.p(fragment0, "<this>");
        L.p(a0, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.4 fragmentViewModelLazyKt$viewModels$owner$40 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.4(a0);
        D d0 = E.c(H.c, fragmentViewModelLazyKt$viewModels$owner$40);
        L.y(4, "VM");
        d d1 = m0.d(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.6 fragmentViewModelLazyKt$viewModels$60 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.6(d0);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.7 fragmentViewModelLazyKt$viewModels$70 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.7(a1, d0);
        if(a2 == null) {
            a2 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.8(fragment0, d0);
        }
        return FragmentViewModelLazyKt.h(fragment0, d1, fragmentViewModelLazyKt$viewModels$60, fragmentViewModelLazyKt$viewModels$70, a2);
    }

    private static final ViewModelStoreOwner o(D d0) {
        return (ViewModelStoreOwner)d0.getValue();
    }

    private static final ViewModelStoreOwner p(D d0) {
        return (ViewModelStoreOwner)d0.getValue();
    }
}

