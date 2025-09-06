package com.dcinside.app.dccon.setting.tag;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class f implements TextView.OnEditorActionListener {
    public final i a;

    public f(i i0) {
        this.a = i0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return i.w(this.a, textView0, v, keyEvent0);
    }
}

