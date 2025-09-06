package com.kakao.adfit.m;

import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import com.kakao.adfit.ads.R.string;
import kotlin.jvm.internal.L;

public final class a {
    public static final class com.kakao.adfit.m.a.a extends View.AccessibilityDelegate {
        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
            L.p(view0, "host");
            L.p(accessibilityNodeInfo0, "info");
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
            if(accessibilityNodeInfo0.isClickable()) {
                accessibilityNodeInfo0.setClassName("android.widget.Button");
                accessibilityNodeInfo0.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, view0.getContext().getText(string.adfit_ad_info_click_hint)));
            }
        }
    }

    public static final class b extends View.AccessibilityDelegate {
        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
            L.p(view0, "host");
            L.p(accessibilityNodeInfo0, "info");
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
            if(accessibilityNodeInfo0.isClickable()) {
                accessibilityNodeInfo0.setClassName("android.widget.Button");
                accessibilityNodeInfo0.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, view0.getContext().getText(string.adfit_ad_click_hint)));
            }
        }
    }

    public static final a a;
    private static final View.AccessibilityDelegate b;
    private static final View.AccessibilityDelegate c;

    static {
        a.a = new a();
        a.b = new b();
        a.c = new com.kakao.adfit.m.a.a();
    }

    public final View.AccessibilityDelegate a() {
        return a.c;
    }

    public final View.AccessibilityDelegate b() {
        return a.b;
    }
}

