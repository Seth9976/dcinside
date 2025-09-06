package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class PlaceableKt.DefaultLayerBlock.1 extends N implements Function1 {
    public static final PlaceableKt.DefaultLayerBlock.1 e;

    static {
        PlaceableKt.DefaultLayerBlock.1.e = new PlaceableKt.DefaultLayerBlock.1();
    }

    PlaceableKt.DefaultLayerBlock.1() {
        super(1);
    }

    public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
        L.p(graphicsLayerScope0, "$this$null");
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((GraphicsLayerScope)object0));
        return S0.a;
    }
}

