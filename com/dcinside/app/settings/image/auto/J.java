package com.dcinside.app.settings.image.auto;

import android.view.View.OnClickListener;
import android.view.View;

public final class j implements View.OnClickListener {
    public final MyAutoImageActivity a;

    public j(MyAutoImageActivity myAutoImageActivity0) {
        this.a = myAutoImageActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MyAutoImageActivity.S2(this.a, view0);
    }
}

