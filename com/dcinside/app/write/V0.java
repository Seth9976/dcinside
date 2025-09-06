package com.dcinside.app.write;

import android.view.View.OnClickListener;
import android.view.View;

public final class v0 implements View.OnClickListener {
    public final PostWriteActivity a;
    public final String b;
    public final String c;

    public v0(PostWriteActivity postWriteActivity0, String s, String s1) {
        this.a = postWriteActivity0;
        this.b = s;
        this.c = s1;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        PostWriteActivity.H9(this.a, this.b, this.c, view0);
    }
}

