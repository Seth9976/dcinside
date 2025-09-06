package com.dcinside.app.gif.view;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;

public final class c implements MediaPlayer.OnCompletionListener {
    public final TextureVideoView a;

    public c(TextureVideoView textureVideoView0) {
        this.a = textureVideoView0;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        TextureVideoView.s(this.a, mediaPlayer0);
    }
}

