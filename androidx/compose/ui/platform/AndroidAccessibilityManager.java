package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class AndroidAccessibilityManager implements AccessibilityManager {
    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final android.view.accessibility.AccessibilityManager a;
    @l
    private static final Companion b = null;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    @Deprecated
    public static final int e = 4;

    static {
        AndroidAccessibilityManager.b = new Companion(null);
    }

    public AndroidAccessibilityManager(@l Context context0) {
        L.p(context0, "context");
        super();
        Object object0 = context0.getSystemService("accessibility");
        L.n(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (android.view.accessibility.AccessibilityManager)object0;
    }

    @Override  // androidx.compose.ui.platform.AccessibilityManager
    public long a(long v, boolean z, boolean z1, boolean z2) {
        if(v >= 0x7FFFFFFFL) {
            return v;
        }
        if(z1) {
            z |= 2;
        }
        if(z2) {
            z |= 4;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            int v1 = Api29Impl.a.a(this.a, ((int)v), ((int)z));
            return v1 == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)v1);
        }
        return z2 && this.a.isTouchExplorationEnabled() ? 0x7FFFFFFFFFFFFFFFL : v;
    }
}

