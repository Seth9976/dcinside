package androidx.media3.exoplayer.audio;

import android.media.AudioRouting.OnRoutingChangedListener;
import android.media.AudioRouting;

public final class h0 implements AudioRouting.OnRoutingChangedListener {
    public final OnRoutingChangedListenerApi24 a;

    public h0(OnRoutingChangedListenerApi24 defaultAudioSink$OnRoutingChangedListenerApi240) {
        this.a = defaultAudioSink$OnRoutingChangedListenerApi240;
    }

    @Override  // android.media.AudioRouting$OnRoutingChangedListener
    public final void onRoutingChanged(AudioRouting audioRouting0) {
        this.a.b(audioRouting0);
    }
}

