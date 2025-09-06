package com.dcinside.app.gif.view;

import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;

public final class a implements MediaPlayer.OnVideoSizeChangedListener {
    public final TextureVideoView a;

    public a(TextureVideoView textureVideoView0) {
        this.a = textureVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        TextureVideoView.w(this.a, mediaPlayer0, v, v1);
    }
}

