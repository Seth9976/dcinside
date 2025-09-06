package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.L;
import y4.l;

final class a extends BroadcastReceiver {
    @l
    private final A3.a a;
    @l
    private final A3.a b;

    public a(@l A3.a a0, @l A3.a a1) {
        L.p(a0, "onNetworkAvailable");
        L.p(a1, "onNetworkUnavailable");
        super();
        this.a = a0;
        this.b = a1;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@l Context context0, @l Intent intent0) {
        L.p(context0, "context");
        L.p(intent0, "intent");
        if(e.b(context0)) {
            this.a.invoke();
            return;
        }
        this.b.invoke();
    }
}

