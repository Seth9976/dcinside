package com.kakao.adfit.m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.L;

public final class u {
    public static final u a;

    static {
        u.a = new u();
    }

    private static final int a(int v) {
        switch(v) {
            case 1: 
            case 2: 
            case 4: 
            case 7: 
            case 11: 
            case 16: {
                return 1;
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
                return 2;
            }
            case 13: 
            case 18: {
                return 3;
            }
            case 20: {
                return 4;
            }
            default: {
                return 0;
            }
        }
    }

    public static final int a(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("phone");
            L.n(object0, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return Build.VERSION.SDK_INT < 24 ? u.a(((TelephonyManager)object0).getNetworkType()) : u.a(((TelephonyManager)object0).getDataNetworkType());
        }
        catch(Exception unused_ex) {
            try {
                Object object1 = context0.getSystemService("connectivity");
                L.n(object1, "null cannot be cast to non-null type android.net.ConnectivityManager");
                NetworkInfo networkInfo0 = ((ConnectivityManager)object1).getActiveNetworkInfo();
                NetworkInfo networkInfo1 = null;
                if(networkInfo0 == null) {
                label_14:
                    NetworkInfo[] arr_networkInfo = ((ConnectivityManager)object1).getAllNetworkInfo();
                    if(arr_networkInfo != null) {
                        int v = 0;
                        while(v < arr_networkInfo.length) {
                            NetworkInfo networkInfo2 = arr_networkInfo[v];
                            if(networkInfo2.getType() == 0) {
                                networkInfo1 = networkInfo2;
                                if(true) {
                                    break;
                                }
                            }
                            else {
                                ++v;
                            }
                        }
                    }
                }
                else {
                    if(networkInfo0.getType() != 0) {
                        networkInfo0 = null;
                    }
                    if(networkInfo0 != null) {
                        networkInfo1 = networkInfo0;
                        return networkInfo1 == null ? 0 : u.a(networkInfo1.getSubtype());
                    }
                    goto label_14;
                }
                return networkInfo1 == null ? 0 : u.a(networkInfo1.getSubtype());
            }
            catch(Exception unused_ex) {
            }
            return 0;
        }
    }

    public static final int b(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("connectivity");
            L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            if(Build.VERSION.SDK_INT >= 23) {
                Network network0 = ((ConnectivityManager)object0).getActiveNetwork();
                NetworkCapabilities networkCapabilities0 = network0 == null ? null : ((ConnectivityManager)object0).getNetworkCapabilities(network0);
                if(networkCapabilities0 == null) {
                    return 0;
                }
                if(networkCapabilities0.hasTransport(0)) {
                    return 1;
                }
                if(networkCapabilities0.hasTransport(1)) {
                    return 2;
                }
                return networkCapabilities0.hasTransport(3) ? 3 : 0;
            }
            NetworkInfo networkInfo0 = ((ConnectivityManager)object0).getActiveNetworkInfo();
            if(networkInfo0 == null) {
                return 0;
            }
            int v = networkInfo0.getType();
            switch(v) {
                case 0: {
                    return 1;
                }
                case 1: {
                    return 2;
                }
                default: {
                    break;
                }
            }
            return v == 9 ? 3 : 0;
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    public static final boolean c(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("connectivity");
            L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo networkInfo0 = ((ConnectivityManager)object0).getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static final boolean d(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("connectivity");
            L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            if(Build.VERSION.SDK_INT < 28) {
                goto label_9;
            }
            Network network0 = ((ConnectivityManager)object0).getActiveNetwork();
            if(network0 != null) {
                NetworkInfo networkInfo0 = ((ConnectivityManager)object0).getNetworkInfo(network0);
                NetworkCapabilities networkCapabilities0 = ((ConnectivityManager)object0).getNetworkCapabilities(network0);
                return networkInfo0 != null && networkInfo0.isConnected() && networkCapabilities0 != null && networkCapabilities0.hasTransport(1);
            label_9:
                NetworkInfo networkInfo1 = ((ConnectivityManager)object0).getActiveNetworkInfo();
                return networkInfo1 != null && networkInfo1.isConnected() && networkInfo1.getType() == 1;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }
}

