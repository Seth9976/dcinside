package com.dcinside.app.gif.view;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer;

public final class e implements MediaPlayer.OnErrorListener {
    public final TextureVideoView a;

    public e(TextureVideoView textureVideoView0) {
        this.a = textureVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        return TextureVideoView.t(this.a, mediaPlayer0, v, v1);
    }
}

