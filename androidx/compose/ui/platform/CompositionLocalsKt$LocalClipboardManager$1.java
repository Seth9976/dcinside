package androidx.compose.ui.platform;

import A3.a;
import kotlin.jvm.internal.N;
import kotlin.y;
import y4.l;

final class CompositionLocalsKt.LocalClipboardManager.1 extends N implements a {
    public static final CompositionLocalsKt.LocalClipboardManager.1 e;

    static {
        CompositionLocalsKt.LocalClipboardManager.1.e = new CompositionLocalsKt.LocalClipboardManager.1();
    }

    CompositionLocalsKt.LocalClipboardManager.1() {
        super(0);
    }

    @l
    public final ClipboardManager b() {
        CompositionLocalsKt.y("LocalClipboardManager");
        throw new y();
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

