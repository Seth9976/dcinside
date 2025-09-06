package com.google.android.material.textfield;

import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class m implements View.OnFocusChangeListener {
    public final p a;

    public m(p p0) {
        this.a = p0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        this.a.K(view0, z);
    }
}

