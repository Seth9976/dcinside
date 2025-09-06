package com.fsn.cauly.blackdragoncore.devicemonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;

public class BDOrientationMonitor extends BroadcastReceiver {
    public interface a {
        void a(int arg1);
    }

    private Context a;
    private int b;
    private a c;

    public int a() {
        switch(((WindowManager)this.a.getSystemService("window")).getDefaultDisplay().getOrientation()) {
            case 1: {
                return 90;
            }
            case 2: {
                return 180;
            }
            case 3: {
                return 270;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
            int v = this.a();
            if(v != this.b) {
                this.b = v;
                this.c.a(v);
            }
        }
    }
}

