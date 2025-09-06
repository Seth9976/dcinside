package androidx.activity;

import A3.a;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class ActivityViewModelLazyKt {
    @MainThread
    @k(level = m.c, message = "Superseded by viewModels that takes a CreationExtras")
    public static final D a(ComponentActivity componentActivity0, a a0) {
        L.p(componentActivity0, "<this>");
        if(a0 == null) {
            a0 = new a(componentActivity0) {
                final ComponentActivity e;

                {
                    this.e = componentActivity0;
                    super(0);
                }

                @l
                public final Factory b() {
                    return this.e.getDefaultViewModelProviderFactory();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        L.y(4, "VM");
        return new ViewModelLazy(m0.d(ViewModel.class), new a(componentActivity0) {
            final ComponentActivity e;

            {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return this.e.getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, a0, new a(componentActivity0) {
            final ComponentActivity e;

            {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                return this.e.getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    @MainThread
    public static final D b(ComponentActivity componentActivity0, a a0, a a1) {
        L.p(componentActivity0, "<this>");
        if(a1 == null) {
            a1 = new a(componentActivity0) {
                final ComponentActivity e;

                {
                    this.e = componentActivity0;
                    super(0);
                }

                @l
                public final Factory b() {
                    return this.e.getDefaultViewModelProviderFactory();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
        }
        L.y(4, "VM");
        return new ViewModelLazy(m0.d(ViewModel.class), new a(componentActivity0) {
            final ComponentActivity e;

            {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return this.e.getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, a1, new a(a0, componentActivity0) {
            final a e;
            final ComponentActivity f;

            {
                this.e = a0;
                this.f = componentActivity0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                a a0 = this.e;
                if(a0 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)a0.invoke();
                    return creationExtras0 == null ? this.f.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.f.getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    public static D c(ComponentActivity componentActivity0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        L.p(componentActivity0, "<this>");
        if(a0 == null) {
            a0 = new androidx.activity.ActivityViewModelLazyKt.viewModels.factoryPromise.1(componentActivity0);
        }
        L.y(4, "VM");
        return new ViewModelLazy(m0.d(ViewModel.class), new androidx.activity.ActivityViewModelLazyKt.viewModels.1(componentActivity0), a0, new androidx.activity.ActivityViewModelLazyKt.viewModels.2(componentActivity0));
    }

    public static D d(ComponentActivity componentActivity0, a a0, a a1, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        if((v & 2) != 0) {
            a1 = null;
        }
        L.p(componentActivity0, "<this>");
        if(a1 == null) {
            a1 = new androidx.activity.ActivityViewModelLazyKt.viewModels.factoryPromise.2(componentActivity0);
        }
        L.y(4, "VM");
        return new ViewModelLazy(m0.d(ViewModel.class), new androidx.activity.ActivityViewModelLazyKt.viewModels.3(componentActivity0), a1, new androidx.activity.ActivityViewModelLazyKt.viewModels.4(a0, componentActivity0));
    }
}

