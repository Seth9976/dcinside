package com.iab.omid.library.unity3d.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.g;
import com.iab.omid.library.unity3d.adsession.k;

public class e {
    private static k a;

    static {
        e.a = k.b;
    }

    public static k a() {
        return a.a() == g.b ? e.a : k.b;
    }

    public static void c(@NonNull Context context0) {
        class com.iab.omid.library.unity3d.utils.e.a extends BroadcastReceiver {
            com.iab.omid.library.unity3d.utils.e.a() {
                super();
            }

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                k k0;
                if(intent0.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int v = intent0.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    boolean z = false;
                    if(v == 0) {
                        z = true;
                        k0 = k.a;
                    }
                    else if(v == 1) {
                        z = true;
                        k0 = k.b;
                    }
                    if(z) {
                        e.a = k0;
                    }
                }
            }
        }

        IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        context0.registerReceiver(new com.iab.omid.library.unity3d.utils.e.a(), intentFilter0);
    }
}

