package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n+ 2 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,61:1\n360#2,15:62\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n*L\n52#1:62,15\n*E\n"})
public final class MeasureScope.layout.1 implements MeasureResult {
    private final int a;
    private final int b;
    @l
    private final Map c;
    final int d;
    final MeasureScope e;
    final Function1 f;

    MeasureScope.layout.1(int v, int v1, Map map0, MeasureScope measureScope0, Function1 function10) {
        this.d = v;
        this.e = measureScope0;
        this.f = function10;
        super();
        this.a = v;
        this.b = v1;
        this.c = map0;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @l
    public Map k() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void l() {
        LayoutDirection layoutDirection0 = this.e.getLayoutDirection();
        LookaheadCapablePlaceable lookaheadCapablePlaceable0 = this.e instanceof LookaheadCapablePlaceable ? ((LookaheadCapablePlaceable)this.e) : null;
        LayoutCoordinates layoutCoordinates0 = PlacementScope.e;
        LayoutDirection layoutDirection1 = PlacementScope.a.m();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = PlacementScope.f;
        PlacementScope.d = this.d;
        PlacementScope.c = layoutDirection0;
        boolean z = PlacementScope.a.J(lookaheadCapablePlaceable0);
        this.f.invoke(PlacementScope.a);
        if(lookaheadCapablePlaceable0 != null) {
            lookaheadCapablePlaceable0.e2(z);
        }
        PlacementScope.d = 0;
        PlacementScope.c = layoutDirection1;
        PlacementScope.e = layoutCoordinates0;
        PlacementScope.f = layoutNodeLayoutDelegate0;
    }
}

