package com.dcinside.app.voice;

import android.media.MediaRecorder.OnErrorListener;
import android.media.MediaRecorder;
import androidx.appcompat.app.AppCompatActivity;

public final class h implements MediaRecorder.OnErrorListener {
    public final m a;
    public final AppCompatActivity b;

    public h(m m0, AppCompatActivity appCompatActivity0) {
        this.a = m0;
        this.b = appCompatActivity0;
    }

    @Override  // android.media.MediaRecorder$OnErrorListener
    public final void onError(MediaRecorder mediaRecorder0, int v, int v1) {
        m.S(this.a, this.b, mediaRecorder0, v, v1);
    }
}

