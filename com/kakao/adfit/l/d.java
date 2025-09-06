package com.kakao.adfit.l;

import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;

public final class d implements MediaPlayer.OnPreparedListener {
    public final a a;

    public d(a a0) {
        this.a = a0;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        a.a(this.a, mediaPlayer0);
    }
}

