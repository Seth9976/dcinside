package com.kakao.adfit.l;

import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer;

public final class h implements MediaPlayer.OnInfoListener {
    public final a a;

    public h(a a0) {
        this.a = a0;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        return a.b(this.a, mediaPlayer0, v, v1);
    }
}

