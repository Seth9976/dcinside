package androidx.compose.ui.platform;

public final class a {
    public static long a(AccessibilityManager accessibilityManager0, long v, boolean z, boolean z1, boolean z2, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
        }
        boolean z3 = (v1 & 2) == 0 ? z : false;
        boolean z4 = (v1 & 4) == 0 ? z1 : false;
        return (v1 & 8) == 0 ? accessibilityManager0.a(v, z3, z4, z2) : accessibilityManager0.a(v, z3, z4, false);
    }
}

