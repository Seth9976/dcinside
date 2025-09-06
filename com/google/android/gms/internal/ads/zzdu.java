package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

final class zzdu extends BroadcastReceiver {
    final zzdw zza;

    zzdu(zzdw zzdw0, zzdv zzdv0) {
        this.zza = zzdw0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        zzdw zzdw0;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        int v = 0;
        if(connectivityManager0 != null) {
            try {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            }
            catch(SecurityException unused_ex) {
                goto label_29;
            }
            if(networkInfo0 != null && networkInfo0.isConnected()) {
            alab1:
                switch(networkInfo0.getType()) {
                    case 1: {
                        v = 2;
                        break;
                    }
                    case 0: 
                    case 4: 
                    case 5: {
                        switch(networkInfo0.getSubtype()) {
                            case 1: 
                            case 2: {
                                v = 3;
                                break alab1;
                            }
                            case 13: {
                                v = 5;
                                break alab1;
                            }
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: 
                            case 9: 
                            case 10: 
                            case 11: 
                            case 12: 
                            case 14: 
                            case 15: 
                            case 17: {
                                v = 4;
                                break alab1;
                            }
                            case 18: {
                                v = 2;
                                break alab1;
                            }
                            case 20: {
                                if(zzei.zza >= 29) {
                                    v = 9;
                                }
                                break alab1;
                            }
                            default: {
                                v = 6;
                                break alab1;
                            }
                        }
                    }
                    case 6: {
                        v = 5;
                        break;
                    }
                    case 9: {
                        v = 7;
                        break;
                    }
                    default: {
                        v = 8;
                    }
                }
            }
            else {
                v = 1;
            }
        }
    label_29:
        if(zzei.zza >= 0x1F && v == 5) {
            try {
                zzdw0 = this.zza;
                TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
                if(telephonyManager0 == null) {
                    throw null;
                }
                zzdt zzdt0 = new zzdt(zzdw0);
                telephonyManager0.registerTelephonyCallback(context0.getMainExecutor(), zzdt0);
                telephonyManager0.unregisterTelephonyCallback(zzdt0);
            }
            catch(RuntimeException unused_ex) {
                zzdw.zzc(zzdw0, 5);
            }
            return;
        }
        zzdw.zzc(this.zza, v);
    }
}

