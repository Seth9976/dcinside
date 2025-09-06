package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

abstract class s {
    final TextInputLayout a;
    final r b;
    final Context c;
    final CheckableImageButton d;

    s(@NonNull r r0) {
        this.a = r0.a;
        this.b = r0;
        this.c = r0.getContext();
        this.d = r0.t();
    }

    void a(Editable editable0) {
    }

    void b(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @StringRes
    int c() {
        return 0;
    }

    @DrawableRes
    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    TouchExplorationStateChangeListener h() {
        return null;
    }

    boolean i(int v) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(@Nullable EditText editText0) {
    }

    void o(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
    }

    void p(View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
    }

    void q(boolean z) {
    }

    final void r() {
        this.b.P(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}

