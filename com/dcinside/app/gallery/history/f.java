package com.dcinside.app.gallery.history;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class f implements TextView.OnEditorActionListener {
    public final ManageHistoryActivity a;

    public f(ManageHistoryActivity manageHistoryActivity0) {
        this.a = manageHistoryActivity0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return ManageHistoryActivity.V1(this.a, textView0, v, keyEvent0);
    }
}

