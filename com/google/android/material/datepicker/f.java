package com.google.android.material.datepicker;

import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;

public final class f implements View.OnFocusChangeListener {
    public final EditText[] a;

    public f(EditText[] arr_editText) {
        this.a = arr_editText;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        h.a(this.a, view0, z);
    }
}

