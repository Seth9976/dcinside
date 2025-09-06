package com.dcinside.app.read.tools;

import android.graphics.Bitmap;
import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;

public final class p implements MediaScannerConnection.OnScanCompletedListener {
    public final String a;
    public final s b;
    public final Bitmap c;
    public final String d;

    public p(String s, s s1, Bitmap bitmap0, String s2) {
        this.a = s;
        this.b = s1;
        this.c = bitmap0;
        this.d = s2;
    }

    @Override  // android.media.MediaScannerConnection$OnScanCompletedListener
    public final void onScanCompleted(String s, Uri uri0) {
        s.O(this.a, this.b, this.c, this.d, s, uri0);
    }
}

