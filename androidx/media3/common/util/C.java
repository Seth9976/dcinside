package androidx.media3.common.util;

import java.util.concurrent.CopyOnWriteArraySet;

public final class c implements Runnable {
    public final CopyOnWriteArraySet a;
    public final int b;
    public final Event c;

    public c(CopyOnWriteArraySet copyOnWriteArraySet0, int v, Event listenerSet$Event0) {
        this.a = copyOnWriteArraySet0;
        this.b = v;
        this.c = listenerSet$Event0;
    }

    @Override
    public final void run() {
        ListenerSet.i(this.a, this.b, this.c);
    }
}

