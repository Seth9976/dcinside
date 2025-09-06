package androidx.compose.ui.platform;

import A3.a;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.N;
import kotlin.y;
import y4.l;

final class AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1 extends N implements a {
    public static final AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1 e;

    static {
        AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1.e = new AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1();
    }

    AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1() {
        super(0);
    }

    @l
    public final LifecycleOwner b() {
        AndroidCompositionLocals_androidKt.l("LocalLifecycleOwner");
        throw new y();
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

