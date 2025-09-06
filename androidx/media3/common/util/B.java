package androidx.media3.common.util;

import android.os.Handler.Callback;
import android.os.Message;

public final class b implements Handler.Callback {
    public final ListenerSet a;

    public b(ListenerSet listenerSet0) {
        this.a = listenerSet0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.a.h(message0);
    }
}

