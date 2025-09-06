package androidx.lifecycle;

import A3.a;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.b;
import z3.j;

public final class ViewModelLazy implements D {
    @l
    private final d a;
    @l
    private final a b;
    @l
    private final a c;
    @l
    private final a d;
    @m
    private ViewModel e;

    @j
    public ViewModelLazy(@l d d0, @l a a0, @l a a1) {
        L.p(d0, "viewModelClass");
        L.p(a0, "storeProducer");
        L.p(a1, "factoryProducer");
        this(d0, a0, a1, null, 8, null);
    }

    @j
    public ViewModelLazy(@l d d0, @l a a0, @l a a1, @l a a2) {
        L.p(d0, "viewModelClass");
        L.p(a0, "storeProducer");
        L.p(a1, "factoryProducer");
        L.p(a2, "extrasProducer");
        super();
        this.a = d0;
        this.b = a0;
        this.c = a1;
        this.d = a2;
    }

    public ViewModelLazy(d d0, a a0, a a1, a a2, int v, w w0) {
        if((v & 8) != 0) {
            a2 = androidx.lifecycle.ViewModelLazy.1.e;
        }
        this(d0, a0, a1, a2);

        final class androidx.lifecycle.ViewModelLazy.1 extends N implements a {
            public static final androidx.lifecycle.ViewModelLazy.1 e;

            static {
                androidx.lifecycle.ViewModelLazy.1.e = new androidx.lifecycle.ViewModelLazy.1();
            }

            androidx.lifecycle.ViewModelLazy.1() {
                super(0);
            }

            @l
            public final Empty b() {
                return Empty.b;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    @l
    public ViewModel a() {
        ViewModel viewModel0 = this.e;
        if(viewModel0 == null) {
            Factory viewModelProvider$Factory0 = (Factory)this.c.invoke();
            viewModel0 = new ViewModelProvider(((ViewModelStore)this.b.invoke()), viewModelProvider$Factory0, ((CreationExtras)this.d.invoke())).a(b.e(this.a));
            this.e = viewModel0;
        }
        return viewModel0;
    }

    @Override  // kotlin.D
    public Object getValue() {
        return this.a();
    }

    @Override  // kotlin.D
    public boolean isInitialized() {
        return this.e != null;
    }
}

