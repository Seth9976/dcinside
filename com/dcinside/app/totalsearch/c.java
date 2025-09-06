package com.dcinside.app.totalsearch;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class c implements TextView.OnEditorActionListener {
    public final TotalSearchActivity a;

    public c(TotalSearchActivity totalSearchActivity0) {
        this.a = totalSearchActivity0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return this.a.z2(textView0, v, keyEvent0);
    }
}

