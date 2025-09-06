package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class AndroidViewConfiguration implements ViewConfiguration {
    @l
    private final android.view.ViewConfiguration a;
    public static final int b = 8;

    static {
    }

    public AndroidViewConfiguration(@l android.view.ViewConfiguration viewConfiguration0) {
        L.p(viewConfiguration0, "viewConfiguration");
        super();
        this.a = viewConfiguration0;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long a() {
        return 40L;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public float b() {
        return (float)this.a.getScaledTouchSlop();
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long c() {
        return 300L;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long d() {
        return (long)android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long e() {
        return H0.a(this);
    }
}

