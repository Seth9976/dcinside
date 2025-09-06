package com.fsn.cauly.blackdragoncore.devicemonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
import android.net.NetworkInfo;

public class BDNetworkMonitor extends BroadcastReceiver {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[NetworkInfo.State.values().length];
            a.a = arr_v;
            try {
                arr_v[NetworkInfo.State.UNKNOWN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[NetworkInfo.State.DISCONNECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public interface b {
        void a(String arg1);
    }

    private Context a;
    private b b;

    public String a() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 != null) {
            switch(a.a[networkInfo0.getState().ordinal()]) {
                case 1: {
                    return "unknown";
                }
                case 2: {
                    break;
                }
                default: {
                    int v = networkInfo0.getType();
                    if(v == 0) {
                        return "cell";
                    }
                    return v == 1 ? "wifi" : "unknown";
                }
            }
        }
        return "offline";
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.b.a(this.a());
        }
    }
}

