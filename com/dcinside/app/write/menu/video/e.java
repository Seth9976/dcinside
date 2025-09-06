package com.dcinside.app.write.menu.video;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class e implements TextView.OnEditorActionListener {
    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return VideoSettingActivity.S1(textView0, v, keyEvent0);
    }
}

