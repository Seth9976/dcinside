package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
public final class Api29Impl {
    @l
    public static final Api29Impl a;

    static {
        Api29Impl.a = new Api29Impl();
    }

    @DoNotInline
    public final int a(@l AccessibilityManager accessibilityManager0, int v, int v1) {
        L.p(accessibilityManager0, "accessibilityManager");
        return accessibilityManager0.getRecommendedTimeoutMillis(v, v1);
    }
}

