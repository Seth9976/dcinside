package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.internal.ui.h;
import kotlin.jvm.internal.L;
import y4.m;

public final class s extends BroadcastReceiver {
    @m
    private h webClient;

    @m
    public final h getWebClient() {
        return this.webClient;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@m Context context0, @m Intent intent0) {
        try {
            if(L.g((intent0 == null ? null : intent0.getAction()), "android.media.RINGER_MODE_CHANGED")) {
                int v = intent0.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                p.Companion.d("RingerModeReceiver", "receive ringermode: " + v);
                switch(v) {
                    case 0: {
                        h h1 = this.webClient;
                        if(h1 != null) {
                            h1.notifySilentModeChange(true);
                            return;
                        }
                        break;
                    }
                    case 1: {
                        h h2 = this.webClient;
                        if(h2 != null) {
                            h2.notifySilentModeChange(true);
                            return;
                        }
                        break;
                    }
                    default: {
                        if(v == 2) {
                            h h0 = this.webClient;
                            if(h0 != null) {
                                h0.notifySilentModeChange(false);
                            }
                        }
                    }
                }
            }
        }
        catch(Exception exception0) {
            String s = exception0.getLocalizedMessage();
            if(s != null) {
                p.Companion.e("RingerModeReceiver", s);
            }
        }
    }

    public final void setWebClient(@m h h0) {
        this.webClient = h0;
    }
}

