package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    private final int a;
    private final AccessibilityNodeInfoCompat b;
    private final int c;
    @RestrictTo({Scope.c})
    public static final String d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    @RestrictTo({Scope.c})
    public AccessibilityClickableSpanCompat(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, int v1) {
        this.a = v;
        this.b = accessibilityNodeInfoCompat0;
        this.c = v1;
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.T0(this.c, bundle0);
    }
}

