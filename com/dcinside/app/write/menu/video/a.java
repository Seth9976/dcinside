package com.dcinside.app.write.menu.video;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class a implements TextView.OnEditorActionListener {
    public final com.dcinside.app.write.menu.video.b.a a;

    public a(com.dcinside.app.write.menu.video.b.a b$a0) {
        this.a = b$a0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return com.dcinside.app.write.menu.video.b.a.f(this.a, textView0, v, keyEvent0);
    }
}

