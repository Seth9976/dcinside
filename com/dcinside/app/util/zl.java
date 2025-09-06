package com.dcinside.app.util;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class zl implements TextView.OnEditorActionListener {
    public final a a;

    public zl(a al$a0) {
        this.a = al$a0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return a.E(this.a, textView0, v, keyEvent0);
    }
}

