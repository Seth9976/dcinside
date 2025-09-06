package com.google.android.material.textfield;

import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class b implements View.OnFocusChangeListener {
    public final f a;

    public b(f f0) {
        this.a = f0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        this.a.H(view0, z);
    }
}

