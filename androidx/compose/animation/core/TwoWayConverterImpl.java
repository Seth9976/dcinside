package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class TwoWayConverterImpl implements TwoWayConverter {
    @l
    private final Function1 a;
    @l
    private final Function1 b;

    public TwoWayConverterImpl(@l Function1 function10, @l Function1 function11) {
        L.p(function10, "convertToVector");
        L.p(function11, "convertFromVector");
        super();
        this.a = function10;
        this.b = function11;
    }

    @Override  // androidx.compose.animation.core.TwoWayConverter
    @l
    public Function1 a() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.TwoWayConverter
    @l
    public Function1 b() {
        return this.b;
    }
}

