package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

public class AccessibilityNodeProviderCompat {
    static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {
        final AccessibilityNodeProviderCompat a;

        AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat0) {
            this.a = accessibilityNodeProviderCompat0;
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.a.b(v);
            return accessibilityNodeInfoCompat0 == null ? null : accessibilityNodeInfoCompat0.s2();
        }

        // 去混淆评级： 低(20)
        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String s, int v) {
            return null;
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int v) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.a.d(v);
            return accessibilityNodeInfoCompat0 == null ? null : accessibilityNodeInfoCompat0.s2();
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int v, int v1, Bundle bundle0) {
            return this.a.f(v, v1, bundle0);
        }
    }

    @RequiresApi(26)
    static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat0) {
            super(accessibilityNodeProviderCompat0);
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s, Bundle bundle0) {
            AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
        }
    }

    private final Object a;
    public static final int b = -1;

    public AccessibilityNodeProviderCompat() {
        if(Build.VERSION.SDK_INT >= 26) {
            this.a = new AccessibilityNodeProviderApi26(this);
            return;
        }
        this.a = new AccessibilityNodeProviderApi19(this);
    }

    public AccessibilityNodeProviderCompat(Object object0) {
        this.a = object0;
    }

    public void a(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, String s, Bundle bundle0) {
    }

    public AccessibilityNodeInfoCompat b(int v) {
        return null;
    }

    public List c(String s, int v) [...] // Inlined contents

    public AccessibilityNodeInfoCompat d(int v) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int v, int v1, Bundle bundle0) {
        return false;
    }
}

