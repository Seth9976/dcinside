package androidx.media3.exoplayer;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class f0 implements Event {
    public final AudioAttributes a;

    public f0(AudioAttributes audioAttributes0) {
        this.a = audioAttributes0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.o4(this.a, ((Listener)object0));
    }
}

