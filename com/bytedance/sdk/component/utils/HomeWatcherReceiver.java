package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HomeWatcherReceiver extends BroadcastReceiver {
    public interface PjT {
        void PjT();

        void Zh();
    }

    private PjT PjT;

    public void PjT(PjT homeWatcherReceiver$PjT0) {
        this.PjT = homeWatcherReceiver$PjT0;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        try {
            String s = intent0.getAction();
            Log.i("HomeReceiver", "onReceive: action: " + s);
            if("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(s)) {
                String s1 = intent0.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: " + s1);
                if("homekey".equals(s1)) {
                    Log.i("HomeReceiver", "homekey");
                    PjT homeWatcherReceiver$PjT1 = this.PjT;
                    if(homeWatcherReceiver$PjT1 != null) {
                        homeWatcherReceiver$PjT1.PjT();
                    }
                }
                else if("recentapps".equals(s1)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    PjT homeWatcherReceiver$PjT0 = this.PjT;
                    if(homeWatcherReceiver$PjT0 != null) {
                        homeWatcherReceiver$PjT0.Zh();
                    }
                }
                else if("assist".equals(s1)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

