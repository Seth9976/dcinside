package androidx.compose.foundation.lazy.layout;

import A3.o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval;
import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.w;
import kotlin.y;
import y4.l;
import y4.m;

public final class LazyLayoutBeyondBoundsModifierLocal implements BeyondBoundsLayout, ModifierLocalProvider {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final BeyondBoundsState a;
    @l
    private final LazyListBeyondBoundsInfo b;
    private final boolean c;
    @l
    private final LayoutDirection d;
    @l
    private final Orientation e;
    @l
    public static final Companion f;
    @l
    private static final LazyLayoutBeyondBoundsModifierLocal.Companion.emptyBeyondBoundsScope.1 g;

    static {
        LazyLayoutBeyondBoundsModifierLocal.f = new Companion(null);
        LazyLayoutBeyondBoundsModifierLocal.g = new LazyLayoutBeyondBoundsModifierLocal.Companion.emptyBeyondBoundsScope.1();
    }

    public LazyLayoutBeyondBoundsModifierLocal(@l BeyondBoundsState beyondBoundsState0, @l LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, boolean z, @l LayoutDirection layoutDirection0, @l Orientation orientation0) {
        L.p(beyondBoundsState0, "state");
        L.p(lazyListBeyondBoundsInfo0, "beyondBoundsInfo");
        L.p(layoutDirection0, "layoutDirection");
        L.p(orientation0, "orientation");
        super();
        this.a = beyondBoundsState0;
        this.b = lazyListBeyondBoundsInfo0;
        this.c = z;
        this.d = layoutDirection0;
        this.e = orientation0;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.ui.layout.BeyondBoundsLayout
    @m
    public Object a(int v, @l Function1 function10) {
        L.p(function10, "block");
        if(this.a.getItemCount() > 0 && this.a.b()) {
            h l0$h0 = new h();
            int v1 = this.a.c();
            int v2 = this.a.d();
            l0$h0.a = this.b.a(v1, v2);
            Object object0;
            for(object0 = null; object0 == null && this.j(((Interval)l0$h0.a), v); object0 = function10.invoke(() -> {
                if(this.a.n(this.c)) {
                    return false;
                }
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(this.c, 1)) {
                    return LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a));
                }
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(this.c, 2)) {
                    return LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a);
                }
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(this.c, 5)) {
                    return this.a.c ? LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a) : LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a));
                }
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(this.c, 6)) {
                    return this.a.c ? LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a)) : LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a);
                }
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(this.c, 3)) {
                    switch(this.a.d) {
                        case 1: {
                            return this.a.c ? LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a) : LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a));
                        }
                        case 2: {
                            return this.a.c ? LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a)) : LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(this.c, 4)) {
                    switch(this.a.d) {
                        case 1: {
                            return this.a.c ? LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a)) : LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a);
                        }
                        case 2: {
                            return this.a.c ? LazyLayoutBeyondBoundsModifierLocal.l(((Interval)this.b.a), this.a) : LazyLayoutBeyondBoundsModifierLocal.m(((Interval)this.b.a));
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                LazyLayoutBeyondBoundsModifierLocalKt.b();
                throw new y();
            })) {
                Interval lazyListBeyondBoundsInfo$Interval0 = this.d(((Interval)l0$h0.a), v);
                this.b.e(((Interval)l0$h0.a));
                l0$h0.a = lazyListBeyondBoundsInfo$Interval0;
                this.a.a();
            }
            this.b.e(((Interval)l0$h0.a));
            this.a.a();
            return object0;
        }
        return function10.invoke(LazyLayoutBeyondBoundsModifierLocal.g);

        public final class androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.layout.2 implements BeyondBoundsScope {
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.layout.2(LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal0, h l0$h0, int v) {
            }

            @Override  // androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope
            public boolean a() {
                return this.a.j(((Interval)this.b.a), this.c);
            }
        }

    }

    private final Interval d(Interval lazyListBeyondBoundsInfo$Interval0, int v) {
        int v1 = lazyListBeyondBoundsInfo$Interval0.f();
        int v2 = lazyListBeyondBoundsInfo$Interval0.e();
        if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 1)) {
            return this.b.a(v1 - 1, v2);
        }
        if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 2)) {
            return this.b.a(v1, v2 + 1);
        }
        if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 5)) {
            return this.c ? this.b.a(v1, v2 + 1) : this.b.a(v1 - 1, v2);
        }
        if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 6)) {
            return this.c ? this.b.a(v1 - 1, v2) : this.b.a(v1, v2 + 1);
        }
        if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 3)) {
            switch(WhenMappings.a[this.d.ordinal()]) {
                case 1: {
                    return this.c ? this.b.a(v1, v2 + 1) : this.b.a(v1 - 1, v2);
                }
                case 2: {
                    return this.c ? this.b.a(v1 - 1, v2) : this.b.a(v1, v2 + 1);
                }
                default: {
                    return this.b.a(v1, v2);
                }
            }
        }
        if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 4)) {
            switch(WhenMappings.a[this.d.ordinal()]) {
                case 1: {
                    return this.c ? this.b.a(v1 - 1, v2) : this.b.a(v1, v2 + 1);
                }
                case 2: {
                    return this.c ? this.b.a(v1, v2 + 1) : this.b.a(v1 - 1, v2);
                }
                default: {
                    return this.b.a(v1, v2);
                }
            }
        }
        LazyLayoutBeyondBoundsModifierLocalKt.b();
        throw new y();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return BeyondBoundsLayoutKt.a();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this;
    }

    @l
    public BeyondBoundsLayout i() [...] // Inlined contents

    // 检测为 Lambda 实现
    private final boolean j(Interval lazyListBeyondBoundsInfo$Interval0, int v) [...]

    private static final boolean l(Interval lazyListBeyondBoundsInfo$Interval0, LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal0) {
        return lazyListBeyondBoundsInfo$Interval0.e() < lazyLayoutBeyondBoundsModifierLocal0.a.getItemCount() - 1;
    }

    private static final boolean m(Interval lazyListBeyondBoundsInfo$Interval0) {
        return lazyListBeyondBoundsInfo$Interval0.f() > 0;
    }

    private final boolean n(int v) {
        boolean z = true;
        if((androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 5) ? true : androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 6))) {
            return this.e == Orientation.b;
        }
        if((androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 3) ? true : androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 4))) {
            return this.e == Orientation.a;
        }
        if(!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 1)) {
            z = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.j(v, 2);
        }
        if(z) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.b();
        throw new y();
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

