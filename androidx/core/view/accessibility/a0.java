package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import j..time.Duration;
import j..time.TimeConversions;

public final class a0 {
    public static Duration a(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return TimeConversions.convert(accessibilityNodeInfo0.getMinDurationBetweenContentChanges());
    }
}

