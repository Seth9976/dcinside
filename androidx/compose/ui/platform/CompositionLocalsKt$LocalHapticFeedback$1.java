package androidx.compose.ui.platform;

import A3.a;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import kotlin.jvm.internal.N;
import kotlin.y;
import y4.l;

final class CompositionLocalsKt.LocalHapticFeedback.1 extends N implements a {
    public static final CompositionLocalsKt.LocalHapticFeedback.1 e;

    static {
        CompositionLocalsKt.LocalHapticFeedback.1.e = new CompositionLocalsKt.LocalHapticFeedback.1();
    }

    CompositionLocalsKt.LocalHapticFeedback.1() {
        super(0);
    }

    @l
    public final HapticFeedback b() {
        CompositionLocalsKt.y("LocalHapticFeedback");
        throw new y();
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

