package com.dcinside.app.gif.view;

import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer;

public final class d implements MediaPlayer.OnInfoListener {
    public final TextureVideoView a;

    public d(TextureVideoView textureVideoView0) {
        this.a = textureVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        return TextureVideoView.u(this.a, mediaPlayer0, v, v1);
    }
}

