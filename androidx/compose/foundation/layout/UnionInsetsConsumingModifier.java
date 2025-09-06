package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {
    @l
    private final WindowInsets e;

    public UnionInsetsConsumingModifier(@l WindowInsets windowInsets0, @l Function1 function10) {
        L.p(windowInsets0, "insets");
        L.p(function10, "inspectorInfo");
        super(function10, null);
        this.e = windowInsets0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof UnionInsetsConsumingModifier ? L.g(((UnionInsetsConsumingModifier)object0).e, this.e) : false;
    }

    @Override
    public int hashCode() {
        return this.e.hashCode();
    }

    @Override  // androidx.compose.foundation.layout.InsetsConsumingModifier
    @l
    public WindowInsets j(@l WindowInsets windowInsets0) {
        L.p(windowInsets0, "modifierLocalInsets");
        return WindowInsetsKt.k(this.e, windowInsets0);
    }
}

