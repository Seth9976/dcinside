package com.dcinside.app.read.holder;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class q implements TextView.OnEditorActionListener {
    public final r a;

    public q(r r0) {
        this.a = r0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return r.j(this.a, textView0, v, keyEvent0);
    }
}

