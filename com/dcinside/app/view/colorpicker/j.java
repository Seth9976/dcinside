package com.dcinside.app.view.colorpicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class j implements View.OnClickListener {
    public final SelectedColorView a;

    public j(SelectedColorView selectedColorView0) {
        this.a = selectedColorView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SelectedColorView.f(this.a, view0);
    }
}

