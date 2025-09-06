package com.dcinside.app.youtube;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class l implements TextView.OnEditorActionListener {
    public final YoutubeSearchActivity a;

    public l(YoutubeSearchActivity youtubeSearchActivity0) {
        this.a = youtubeSearchActivity0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return YoutubeSearchActivity.e2(this.a, textView0, v, keyEvent0);
    }
}

