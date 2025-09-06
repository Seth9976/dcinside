package com.kakao.adfit.l;

import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer;

public final class g implements MediaPlayer.OnSeekCompleteListener {
    public final a a;

    public g(a a0) {
        this.a = a0;
    }

    @Override  // android.media.MediaPlayer$OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer0) {
        a.c(this.a, mediaPlayer0);
    }
}

