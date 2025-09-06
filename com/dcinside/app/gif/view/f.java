package com.dcinside.app.gif.view;

import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer;

public final class f implements MediaPlayer.OnBufferingUpdateListener {
    public final TextureVideoView a;

    public f(TextureVideoView textureVideoView0) {
        this.a = textureVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
        TextureVideoView.r(this.a, mediaPlayer0, v);
    }
}

