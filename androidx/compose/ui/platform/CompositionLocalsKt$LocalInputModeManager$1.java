package androidx.compose.ui.platform;

import A3.a;
import androidx.compose.ui.input.InputModeManager;
import kotlin.jvm.internal.N;
import kotlin.y;
import y4.l;

final class CompositionLocalsKt.LocalInputModeManager.1 extends N implements a {
    public static final CompositionLocalsKt.LocalInputModeManager.1 e;

    static {
        CompositionLocalsKt.LocalInputModeManager.1.e = new CompositionLocalsKt.LocalInputModeManager.1();
    }

    CompositionLocalsKt.LocalInputModeManager.1() {
        super(0);
    }

    @l
    public final InputModeManager b() {
        CompositionLocalsKt.y("LocalInputManager");
        throw new y();
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

