package com.kakao.adfit.common.inappbrowser.widget;

import android.content.Context;
import android.webkit.DownloadListener;

public final class a implements DownloadListener {
    public final Context a;

    public a(Context context0) {
        this.a = context0;
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        IABLayout.a(this.a, s, s1, s2, s3, v);
    }
}

