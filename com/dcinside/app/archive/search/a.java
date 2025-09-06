package com.dcinside.app.archive.search;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class a implements TextView.OnEditorActionListener {
    public final ArchiveSearchActivity a;

    public a(ArchiveSearchActivity archiveSearchActivity0) {
        this.a = archiveSearchActivity0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return ArchiveSearchActivity.O1(this.a, textView0, v, keyEvent0);
    }
}

