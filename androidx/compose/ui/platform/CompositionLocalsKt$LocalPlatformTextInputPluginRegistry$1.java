package androidx.compose.ui.platform;

import A3.a;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistry;
import kotlin.jvm.internal.N;
import y4.l;

final class CompositionLocalsKt.LocalPlatformTextInputPluginRegistry.1 extends N implements a {
    public static final CompositionLocalsKt.LocalPlatformTextInputPluginRegistry.1 e;

    static {
        CompositionLocalsKt.LocalPlatformTextInputPluginRegistry.1.e = new CompositionLocalsKt.LocalPlatformTextInputPluginRegistry.1();
    }

    CompositionLocalsKt.LocalPlatformTextInputPluginRegistry.1() {
        super(0);
    }

    @l
    public final PlatformTextInputPluginRegistry b() {
        throw new IllegalStateException("No PlatformTextInputServiceProvider provided");
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

