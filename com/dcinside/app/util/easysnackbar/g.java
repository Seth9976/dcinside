package com.dcinside.app.util.easysnackbar;

import android.os.Handler.Callback;
import android.os.Message;

public final class g implements Handler.Callback {
    public final h a;

    public g(h h0) {
        this.a = h0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.a.j(message0);
    }
}

