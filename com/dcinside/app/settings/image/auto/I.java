package com.dcinside.app.settings.image.auto;

import android.view.View.OnClickListener;
import android.view.View;

public final class i implements View.OnClickListener {
    public final MyAutoImageActivity a;

    public i(MyAutoImageActivity myAutoImageActivity0) {
        this.a = myAutoImageActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MyAutoImageActivity.R2(this.a, view0);
    }
}

