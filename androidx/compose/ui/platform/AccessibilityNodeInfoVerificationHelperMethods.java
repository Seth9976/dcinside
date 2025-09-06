package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
public final class AccessibilityNodeInfoVerificationHelperMethods {
    @l
    public static final AccessibilityNodeInfoVerificationHelperMethods a;

    static {
        AccessibilityNodeInfoVerificationHelperMethods.a = new AccessibilityNodeInfoVerificationHelperMethods();
    }

    @DoNotInline
    @RequiresApi(26)
    public final void a(@l AccessibilityNodeInfo accessibilityNodeInfo0, @l List list0) {
        L.p(accessibilityNodeInfo0, "node");
        L.p(list0, "data");
        accessibilityNodeInfo0.setAvailableExtraData(list0);
    }
}

