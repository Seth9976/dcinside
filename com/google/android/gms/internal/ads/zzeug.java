package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzeug implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeug(zzgcs zzgcs0, Context context0) {
        this.zza = zzgcs0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 39;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeuf zzeuf0 = () -> {
            int v2;
            TelephonyManager telephonyManager0 = (TelephonyManager)this.zzb.getSystemService("phone");
            String s = telephonyManager0.getNetworkOperator();
            int v = telephonyManager0.getPhoneType();
            int v1 = -1;
            if(zzs.zzB(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zzb.getSystemService("connectivity");
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                if(networkInfo0 == null) {
                    v2 = -1;
                }
                else {
                    v2 = networkInfo0.getType();
                    v1 = networkInfo0.getDetailedState().ordinal();
                }
                boolean z = connectivityManager0.isActiveNetworkMetered();
                return new zzeue(s, v2, zzv.zzr().zzm(this.zzb), v, z, v1);
            }
            return new zzeue(s, -2, zzv.zzr().zzm(this.zzb), v, false, -1);
        };
        return this.zza.zzb(zzeuf0);
    }

    // 检测为 Lambda 实现
    final zzeue zzc() throws Exception [...]
}

