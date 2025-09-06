package com.dcinside.app.gif.view;

import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;

public final class b implements MediaPlayer.OnPreparedListener {
    public final TextureVideoView a;

    public b(TextureVideoView textureVideoView0) {
        this.a = textureVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        TextureVideoView.v(this.a, mediaPlayer0);
    }
}

