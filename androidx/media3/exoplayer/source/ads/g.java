package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.Timeline;
import com.google.common.collect.Q2;

public final class g implements Runnable {
    public final ServerSideAdInsertionMediaSource a;
    public final Q2 b;
    public final Timeline c;

    public g(ServerSideAdInsertionMediaSource serverSideAdInsertionMediaSource0, Q2 q20, Timeline timeline0) {
        this.a = serverSideAdInsertionMediaSource0;
        this.b = q20;
        this.c = timeline0;
    }

    @Override
    public final void run() {
        this.a.B0(this.b, this.c);
    }
}

