package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class IntrinsicSizeModifier.measure.1 extends N implements Function1 {
    final Placeable e;

    IntrinsicSizeModifier.measure.1(Placeable placeable0) {
        this.e = placeable0;
        super(1);
    }

    public final void a(@l PlacementScope placeable$PlacementScope0) {
        L.p(placeable$PlacementScope0, "$this$layout");
        PlacementScope.x(placeable$PlacementScope0, this.e, 0L, 0.0f, 2, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((PlacementScope)object0));
        return S0.a;
    }
}

