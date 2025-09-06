package com.dcinside.app.util.easysnackbar;

import android.view.View.OnClickListener;
import android.view.View;

public final class f implements View.OnClickListener {
    public final EasySnackBar a;
    public final View.OnClickListener b;

    public f(EasySnackBar easySnackBar0, View.OnClickListener view$OnClickListener0) {
        this.a = easySnackBar0;
        this.b = view$OnClickListener0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.E(this.b, view0);
    }
}

