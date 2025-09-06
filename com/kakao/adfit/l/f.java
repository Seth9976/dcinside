package com.kakao.adfit.l;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer;

public final class f implements MediaPlayer.OnErrorListener {
    public final a a;

    public f(a a0) {
        this.a = a0;
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        return a.a(this.a, mediaPlayer0, v, v1);
    }
}

