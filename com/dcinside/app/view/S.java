package com.dcinside.app.view;

import android.view.View.OnClickListener;
import android.view.View;

public final class s implements View.OnClickListener {
    public final NewGalleriesView a;

    public s(NewGalleriesView newGalleriesView0) {
        this.a = newGalleriesView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.f(view0);
    }
}

