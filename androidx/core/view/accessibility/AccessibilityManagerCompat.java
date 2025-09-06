package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import java.util.List;

public final class AccessibilityManagerCompat {
    @Deprecated
    public interface AccessibilityStateChangeListener {
        @Deprecated
        void onAccessibilityStateChanged(boolean arg1);
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    static class AccessibilityStateChangeListenerWrapper implements AccessibilityManager.AccessibilityStateChangeListener {
        AccessibilityStateChangeListener a;

        AccessibilityStateChangeListenerWrapper(AccessibilityStateChangeListener accessibilityManagerCompat$AccessibilityStateChangeListener0) {
            this.a = accessibilityManagerCompat$AccessibilityStateChangeListener0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof AccessibilityStateChangeListenerWrapper ? this.a.equals(((AccessibilityStateChangeListenerWrapper)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.a.onAccessibilityStateChanged(z);
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static boolean a(AccessibilityManager accessibilityManager0) {
            return accessibilityManager0.isRequestFromAccessibilityTool();
        }
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean arg1);
    }

    static final class TouchExplorationStateChangeListenerWrapper implements AccessibilityManager.TouchExplorationStateChangeListener {
        final TouchExplorationStateChangeListener a;

        TouchExplorationStateChangeListenerWrapper(TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0) {
            this.a = accessibilityManagerCompat$TouchExplorationStateChangeListener0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof TouchExplorationStateChangeListenerWrapper ? this.a.equals(((TouchExplorationStateChangeListenerWrapper)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager0, AccessibilityStateChangeListener accessibilityManagerCompat$AccessibilityStateChangeListener0) {
        return accessibilityManagerCompat$AccessibilityStateChangeListener0 == null ? false : accessibilityManager0.addAccessibilityStateChangeListener(new AccessibilityStateChangeListenerWrapper(accessibilityManagerCompat$AccessibilityStateChangeListener0));
    }

    @ReplaceWith(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager0, TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0) {
        return accessibilityManager0.addTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(accessibilityManagerCompat$TouchExplorationStateChangeListener0));
    }

    @ReplaceWith(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @Deprecated
    public static List c(AccessibilityManager accessibilityManager0, int v) {
        return accessibilityManager0.getEnabledAccessibilityServiceList(v);
    }

    @ReplaceWith(expression = "manager.getInstalledAccessibilityServiceList()")
    @Deprecated
    public static List d(AccessibilityManager accessibilityManager0) {
        return accessibilityManager0.getInstalledAccessibilityServiceList();
    }

    public static boolean e(AccessibilityManager accessibilityManager0) {
        return Build.VERSION.SDK_INT < 34 ? true : Api34Impl.a(accessibilityManager0);
    }

    @ReplaceWith(expression = "manager.isTouchExplorationEnabled()")
    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager0) {
        return accessibilityManager0.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean g(AccessibilityManager accessibilityManager0, AccessibilityStateChangeListener accessibilityManagerCompat$AccessibilityStateChangeListener0) {
        return accessibilityManagerCompat$AccessibilityStateChangeListener0 == null ? false : accessibilityManager0.removeAccessibilityStateChangeListener(new AccessibilityStateChangeListenerWrapper(accessibilityManagerCompat$AccessibilityStateChangeListener0));
    }

    @ReplaceWith(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean h(AccessibilityManager accessibilityManager0, TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0) {
        return accessibilityManager0.removeTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(accessibilityManagerCompat$TouchExplorationStateChangeListener0));
    }
}

