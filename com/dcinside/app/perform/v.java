package com.dcinside.app.perform;

import android.media.MediaPlayer;
import rx.functions.b;

public final class v implements b {
    public final c a;

    public v(c r$c0) {
        this.a = r$c0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        this.a.r(((MediaPlayer)object0));
    }
}

