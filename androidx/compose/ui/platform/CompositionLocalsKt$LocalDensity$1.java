package androidx.compose.ui.platform;

import A3.a;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.N;
import kotlin.y;
import y4.l;

final class CompositionLocalsKt.LocalDensity.1 extends N implements a {
    public static final CompositionLocalsKt.LocalDensity.1 e;

    static {
        CompositionLocalsKt.LocalDensity.1.e = new CompositionLocalsKt.LocalDensity.1();
    }

    CompositionLocalsKt.LocalDensity.1() {
        super(0);
    }

    @l
    public final Density b() {
        CompositionLocalsKt.y("LocalDensity");
        throw new y();
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

