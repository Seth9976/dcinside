package com.iab.omid.library.vungle.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.g;
import com.iab.omid.library.vungle.adsession.l;

public class e {
    private static l a;

    static {
        e.a = l.b;
    }

    public static l a() {
        return a.a() == g.b ? e.a : l.b;
    }

    public static void c(@NonNull Context context0) {
        class com.iab.omid.library.vungle.utils.e.a extends BroadcastReceiver {
            com.iab.omid.library.vungle.utils.e.a() {
                super();
            }

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                l l0;
                if(intent0.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int v = intent0.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    boolean z = false;
                    if(v == 0) {
                        z = true;
                        l0 = l.a;
                    }
                    else if(v == 1) {
                        z = true;
                        l0 = l.b;
                    }
                    if(z) {
                        e.a = l0;
                    }
                }
            }
        }

        IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        context0.registerReceiver(new com.iab.omid.library.vungle.utils.e.a(), intentFilter0);
    }
}

