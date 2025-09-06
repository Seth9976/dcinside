package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.cz;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class iZZ {
    public interface PjT {
        void PjT(Context arg1, Intent arg2, boolean arg3, int arg4);
    }

    static class Zh extends BroadcastReceiver {
        private Zh() {
        }

        Zh(com.bytedance.sdk.component.utils.iZZ.1 iZZ$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            boolean z = false;
            boolean z1 = intent0.getBooleanExtra("noConnectivity", false);
            if(iZZ.Zh != null && iZZ.Zh.size() > 0) {
                z = true;
            }
            iZZ.Zh(context0, intent0, z, z1);
        }
    }

    private static final AtomicBoolean Au;
    private static volatile long JQp;
    private static final Object PjT;
    private static AtomicBoolean ReZ;
    private static Owx XX;
    private static final Map Zh;
    private static volatile int cr;
    private static volatile int cz;

    static {
        iZZ.PjT = new Object();
        iZZ.Zh = new ConcurrentHashMap();
        iZZ.ReZ = new AtomicBoolean(false);
        iZZ.cr = -1;
        iZZ.JQp = 0L;
        iZZ.cz = 60000;
        iZZ.XX = null;
        iZZ.Au = new AtomicBoolean(false);
    }

    public static int PjT(Context context0, long v) {
        long v1 = SystemClock.elapsedRealtime();
        if(iZZ.JQp + v <= v1) {
            return iZZ.Zh(context0);
        }
        if(iZZ.cr == -1) {
            return iZZ.Zh(context0);
        }
        if(v1 - iZZ.JQp >= ((long)iZZ.cz)) {
            iZZ.Zh(context0, null, false, false);
        }
        return iZZ.cr;
    }

    public static void PjT(PjT iZZ$PjT0) {
        if(iZZ$PjT0 == null) {
            return;
        }
        iZZ.Zh.remove(iZZ$PjT0);
    }

    public static void PjT(PjT iZZ$PjT0, Context context0) {
        if(iZZ$PjT0 == null) {
            return;
        }
        if(!iZZ.ReZ.get()) {
            try {
                IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                context0.registerReceiver(new Zh(null), intentFilter0);
                iZZ.ReZ.set(true);
            }
            catch(Throwable unused_ex) {
            }
        }
        iZZ.Zh.put(iZZ$PjT0, iZZ.PjT);
    }

    private static int ReZ(Context context0) {
        try {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isAvailable()) {
                return 0;
            }
            switch(networkInfo0.getType()) {
                case 0: {
                    TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
                    switch(networkInfo0.getSubtype()) {
                        case 1: 
                        case 2: 
                        case 4: 
                        case 7: 
                        case 11: 
                        case 16: {
                            return 2;
                        }
                        case 3: 
                        case 5: 
                        case 6: 
                        case 8: 
                        case 9: 
                        case 10: 
                        case 12: 
                        case 14: 
                        case 15: 
                        case 17: {
                            return 3;
                        }
                        case 13: 
                        case 18: 
                        case 19: {
                            return iZZ.XX != null && iZZ.XX.PjT(context0, telephonyManager0) ? 6 : 5;
                        }
                        case 20: {
                            return 6;
                        }
                        default: {
                            String s = networkInfo0.getSubtypeName();
                            return TextUtils.isEmpty(s) || !s.equalsIgnoreCase("TD-SCDMA") && !s.equalsIgnoreCase("WCDMA") && !s.equalsIgnoreCase("CDMA2000") ? 1 : 3;
                        }
                    }
                }
                case 1: {
                    return 4;
                }
                default: {
                    return 1;
                }
            }
        }
        catch(Throwable unused_ex) {
            return 1;
        }
    }

    private static int Zh(Context context0) {
        iZZ.cr = iZZ.ReZ(context0);
        iZZ.JQp = SystemClock.elapsedRealtime();
        return iZZ.cr;
    }

    private static void Zh(Context context0, Intent intent0, int v, boolean z) {
        Map map0 = iZZ.Zh;
        if(map0 != null && map0.size() > 0) {
            for(Object object0: map0.keySet()) {
                PjT iZZ$PjT0 = (PjT)object0;
                if(iZZ$PjT0 != null) {
                    iZZ$PjT0.PjT(context0, intent0, !z, v);
                }
            }
        }
    }

    private static void Zh(Context context0, Intent intent0, boolean z, boolean z1) {
        if(!z && z1) {
            iZZ.cr = 0;
            return;
        }
        if(iZZ.Au.compareAndSet(false, true)) {
            cz.Zh(new Au("getNetworkType") {
                @Override
                public void run() {
                    iZZ.cr = z1 ? 0 : iZZ.Zh(context0);
                    iZZ.Au.set(false);
                    if(z) {
                        iZZ.Zh(context0, intent0, iZZ.cr, z1);
                    }
                }
            });
        }
    }
}

