package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.internal.L;
import y4.l;

final class WindowRecomposerFactory.Companion.LifecycleAware.1 implements WindowRecomposerFactory {
    public static final WindowRecomposerFactory.Companion.LifecycleAware.1 b;

    static {
        WindowRecomposerFactory.Companion.LifecycleAware.1.b = new WindowRecomposerFactory.Companion.LifecycleAware.1();
    }

    @Override  // androidx.compose.ui.platform.WindowRecomposerFactory
    @l
    public final Recomposer a(@l View view0) {
        L.p(view0, "rootView");
        return WindowRecomposer_androidKt.c(view0, null, null, 3, null);
    }
}

