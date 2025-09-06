package androidx.compose.ui;

import A3.p;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class KeyedComposedModifier3 extends ComposedModifier {
    @l
    private final String e;
    @m
    private final Object f;
    @m
    private final Object g;
    @m
    private final Object h;

    public KeyedComposedModifier3(@l String s, @m Object object0, @m Object object1, @m Object object2, @l Function1 function10, @l p p0) {
        L.p(s, "fqName");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        super(function10, p0);
        this.e = s;
        this.f = object0;
        this.g = object1;
        this.h = object2;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof KeyedComposedModifier3 && L.g(this.e, ((KeyedComposedModifier3)object0).e) && L.g(this.f, ((KeyedComposedModifier3)object0).f) && L.g(this.g, ((KeyedComposedModifier3)object0).g) && L.g(this.h, ((KeyedComposedModifier3)object0).h);
    }

    @Override
    public int hashCode() {
        int v = this.e.hashCode();
        int v1 = 0;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        int v3 = this.g == null ? 0 : this.g.hashCode();
        Object object0 = this.h;
        if(object0 != null) {
            v1 = object0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @l
    public final String l() {
        return this.e;
    }

    @m
    public final Object m() {
        return this.f;
    }

    @m
    public final Object n() {
        return this.g;
    }

    @m
    public final Object p() {
        return this.h;
    }
}

