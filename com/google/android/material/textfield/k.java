package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView.OnDismissListener;

public final class k implements AutoCompleteTextView.OnDismissListener {
    public final p a;

    public k(p p0) {
        this.a = p0;
    }

    @Override  // android.widget.AutoCompleteTextView$OnDismissListener
    public final void onDismiss() {
        this.a.N();
    }
}

