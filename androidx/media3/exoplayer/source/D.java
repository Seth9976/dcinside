package androidx.media3.exoplayer.source;

import android.os.Handler.Callback;
import android.os.Message;

public final class d implements Handler.Callback {
    public final ConcatenatingMediaSource2 a;

    public d(ConcatenatingMediaSource2 concatenatingMediaSource20) {
        this.a = concatenatingMediaSource20;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.a.S0(message0);
    }
}

