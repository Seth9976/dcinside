package com.dcinside.app.browser;

import android.webkit.DownloadListener;

public final class g implements DownloadListener {
    public final AwesomeWebViewActivity a;

    public g(AwesomeWebViewActivity awesomeWebViewActivity0) {
        this.a = awesomeWebViewActivity0;
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        AwesomeWebViewActivity.W1(this.a, s, s1, s2, s3, v);
    }
}

