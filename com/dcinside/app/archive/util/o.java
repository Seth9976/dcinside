package com.dcinside.app.archive.util;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;

public final class o implements TextView.OnEditorActionListener {
    public final AlertDialog a;

    public o(AlertDialog alertDialog0) {
        this.a = alertDialog0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return u.B(this.a, textView0, v, keyEvent0);
    }
}

