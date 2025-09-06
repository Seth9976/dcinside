package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat {
    static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {
        final AccessibilityDelegateCompat a;

        AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat0) {
            this.a = accessibilityDelegateCompat0;
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            return this.a.a(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view0) {
            AccessibilityNodeProviderCompat accessibilityNodeProviderCompat0 = this.a.b(view0);
            return accessibilityNodeProviderCompat0 == null ? null : ((AccessibilityNodeProvider)accessibilityNodeProviderCompat0.e());
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            this.a.f(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
            accessibilityNodeInfoCompat0.Y1(ViewCompat.f1(view0));
            accessibilityNodeInfoCompat0.B1(ViewCompat.S0(view0));
            accessibilityNodeInfoCompat0.Q1(ViewCompat.L(view0));
            accessibilityNodeInfoCompat0.e2(ViewCompat.A0(view0));
            this.a.g(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.f(accessibilityNodeInfo0.getText(), view0);
            List list0 = AccessibilityDelegateCompat.c(view0);
            for(int v = 0; v < list0.size(); ++v) {
                accessibilityNodeInfoCompat0.b(((AccessibilityActionCompat)list0.get(v)));
            }
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            this.a.h(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return this.a.i(viewGroup0, view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
            return this.a.j(view0, v, bundle0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void sendAccessibilityEvent(View view0, int v) {
            this.a.l(view0, v);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view0, AccessibilityEvent accessibilityEvent0) {
            this.a.m(view0, accessibilityEvent0);
        }
    }

    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;
    private static final View.AccessibilityDelegate c;

    static {
        AccessibilityDelegateCompat.c = new View.AccessibilityDelegate();
    }

    public AccessibilityDelegateCompat() {
        this(AccessibilityDelegateCompat.c);
    }

    @RestrictTo({Scope.c})
    public AccessibilityDelegateCompat(View.AccessibilityDelegate view$AccessibilityDelegate0) {
        this.a = view$AccessibilityDelegate0;
        this.b = new AccessibilityDelegateAdapter(this);
    }

    public boolean a(View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public AccessibilityNodeProviderCompat b(View view0) {
        AccessibilityNodeProvider accessibilityNodeProvider0 = this.a.getAccessibilityNodeProvider(view0);
        return accessibilityNodeProvider0 == null ? null : new AccessibilityNodeProviderCompat(accessibilityNodeProvider0);
    }

    static List c(View view0) {
        List list0 = (List)view0.getTag(id.tag_accessibility_actions);
        return list0 == null ? Collections.emptyList() : list0;
    }

    View.AccessibilityDelegate d() {
        return this.b;
    }

    private boolean e(ClickableSpan clickableSpan0, View view0) {
        if(clickableSpan0 != null) {
            ClickableSpan[] arr_clickableSpan = AccessibilityNodeInfoCompat.z(view0.createAccessibilityNodeInfo().getText());
            for(int v = 0; arr_clickableSpan != null && v < arr_clickableSpan.length; ++v) {
                if(clickableSpan0.equals(arr_clickableSpan[v])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = accessibilityNodeInfoCompat0.s2();
        this.a.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
    }

    public void h(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public boolean i(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    public boolean j(View view0, int v, Bundle bundle0) {
        List list0 = AccessibilityDelegateCompat.c(view0);
        boolean z = false;
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = (AccessibilityActionCompat)list0.get(v1);
            if(accessibilityNodeInfoCompat$AccessibilityActionCompat0.b() == v) {
                z = accessibilityNodeInfoCompat$AccessibilityActionCompat0.d(view0, bundle0);
                break;
            }
        }
        if(!z) {
            z = this.a.performAccessibilityAction(view0, v, bundle0);
        }
        return z || v != id.accessibility_action_clickable_span || bundle0 == null ? z : this.k(bundle0.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view0);
    }

    private boolean k(int v, View view0) {
        SparseArray sparseArray0 = (SparseArray)view0.getTag(id.tag_accessibility_clickable_spans);
        if(sparseArray0 != null) {
            WeakReference weakReference0 = (WeakReference)sparseArray0.get(v);
            if(weakReference0 != null) {
                ClickableSpan clickableSpan0 = (ClickableSpan)weakReference0.get();
                if(this.e(clickableSpan0, view0)) {
                    clickableSpan0.onClick(view0);
                    return true;
                }
            }
        }
        return false;
    }

    public void l(View view0, int v) {
        this.a.sendAccessibilityEvent(view0, v);
    }

    public void m(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }
}

