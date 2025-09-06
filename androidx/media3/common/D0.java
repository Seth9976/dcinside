package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.IterationFinishedEvent;

public final class d0 implements IterationFinishedEvent {
    public final SimpleBasePlayer a;

    public d0(SimpleBasePlayer simpleBasePlayer0) {
        this.a = simpleBasePlayer0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$IterationFinishedEvent
    public final void a(Object object0, FlagSet flagSet0) {
        this.a.Y4(((Listener)object0), flagSet0);
    }
}

