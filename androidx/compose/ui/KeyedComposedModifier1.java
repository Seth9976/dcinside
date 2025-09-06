package androidx.compose.ui;

import A3.p;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class KeyedComposedModifier1 extends ComposedModifier {
    @l
    private final String e;
    @m
    private final Object f;

    public KeyedComposedModifier1(@l String s, @m Object object0, @l Function1 function10, @l p p0) {
        L.p(s, "fqName");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        super(function10, p0);
        this.e = s;
        this.f = object0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof KeyedComposedModifier1 && L.g(this.e, ((KeyedComposedModifier1)object0).e) && L.g(this.f, ((KeyedComposedModifier1)object0).f);
    }

    @Override
    public int hashCode() {
        int v = this.e.hashCode();
        return this.f == null ? v * 0x1F : v * 0x1F + this.f.hashCode();
    }

    @l
    public final String l() {
        return this.e;
    }

    @m
    public final Object m() {
        return this.f;
    }
}

