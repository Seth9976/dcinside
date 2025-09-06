package com.iab.omid.library.bytedance2.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;

public class e {
    private static OutputDeviceStatus a;

    static {
        e.a = OutputDeviceStatus.UNKNOWN;
    }

    public static OutputDeviceStatus a() {
        return a.a() == DeviceCategory.CTV ? e.a : OutputDeviceStatus.UNKNOWN;
    }

    public static void a(@NonNull Context context0) {
        class com.iab.omid.library.bytedance2.utils.e.a extends BroadcastReceiver {
            com.iab.omid.library.bytedance2.utils.e.a() {
                super();
            }

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if(intent0.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int v = intent0.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if(v == 0) {
                        e.a = OutputDeviceStatus.NOT_DETECTED;
                        return;
                    }
                    if(v == 1) {
                        e.a = OutputDeviceStatus.UNKNOWN;
                    }
                }
            }
        }

        IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        context0.registerReceiver(new com.iab.omid.library.bytedance2.utils.e.a(), intentFilter0);
    }
}

