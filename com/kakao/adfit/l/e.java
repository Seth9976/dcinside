package com.kakao.adfit.l;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;

public final class e implements MediaPlayer.OnCompletionListener {
    public final a a;

    public e(a a0) {
        this.a = a0;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        a.b(this.a, mediaPlayer0);
    }
}

