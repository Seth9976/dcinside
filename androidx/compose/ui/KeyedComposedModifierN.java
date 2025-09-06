package androidx.compose.ui;

import A3.p;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class KeyedComposedModifierN extends ComposedModifier {
    @l
    private final String e;
    @l
    private final Object[] f;

    public KeyedComposedModifierN(@l String s, @l Object[] arr_object, @l Function1 function10, @l p p0) {
        L.p(s, "fqName");
        L.p(arr_object, "keys");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        super(function10, p0);
        this.e = s;
        this.f = arr_object;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof KeyedComposedModifierN && L.g(this.e, ((KeyedComposedModifierN)object0).e) && Arrays.equals(this.f, ((KeyedComposedModifierN)object0).f);
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.f);
        return this.e.hashCode() * 0x1F + v;
    }

    @l
    public final String l() {
        return this.e;
    }

    @l
    public final Object[] m() {
        return this.f;
    }
}

