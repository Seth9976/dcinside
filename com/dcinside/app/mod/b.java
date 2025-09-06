package com.dcinside.app.mod;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.widget.EditText;

public final class b implements DialogInterface.OnClickListener {
    public final h a;
    public final EditText b;
    public final Activity c;

    public b(h h0, EditText editText0, Activity activity0) {
        this.a = h0;
        this.b = editText0;
        this.c = activity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.D0(this.b, this.c, dialogInterface0, v);
    }
}

