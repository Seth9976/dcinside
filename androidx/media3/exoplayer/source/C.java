package androidx.media3.exoplayer.source;

import android.os.Handler.Callback;
import android.os.Message;

public final class c implements Handler.Callback {
    public final ConcatenatingMediaSource a;

    public c(ConcatenatingMediaSource concatenatingMediaSource0) {
        this.a = concatenatingMediaSource0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.a.g1(message0);
    }
}

