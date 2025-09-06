package com.dcinside.app.write.menu.series;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class u implements TextView.OnEditorActionListener {
    public final SeriesManageActivity a;

    public u(SeriesManageActivity seriesManageActivity0) {
        this.a = seriesManageActivity0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return SeriesManageActivity.G2(this.a, textView0, v, keyEvent0);
    }
}

