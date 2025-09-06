package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzeoa implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    zzeoa(zzgcs zzgcs0, Context context0) {
        this.zza = zzgcs0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 14;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    @SuppressLint({"UnprotectedReceiver"})
    public final t0 zzb() {
        zzenz zzenz0 = () -> {
            double f = -1.0;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlS)).booleanValue()) {
                BatteryManager batteryManager0 = (BatteryManager)this.zzb.getSystemService("batterymanager");
                if(batteryManager0 != null) {
                    f = ((double)batteryManager0.getIntProperty(4)) / 100.0;
                }
                return Build.VERSION.SDK_INT < 23 || batteryManager0 == null ? new zzeob(f, zzeoa.zze(this.zzd())) : new zzeob(f, batteryManager0.isCharging());
            }
            Intent intent0 = this.zzd();
            boolean z = zzeoa.zze(intent0);
            if(intent0 != null) {
                f = ((double)intent0.getIntExtra("level", -1)) / ((double)intent0.getIntExtra("scale", -1));
            }
            return new zzeob(f, z);
        };
        return this.zza.zzb(zzenz0);
    }

    // 检测为 Lambda 实现
    final zzeob zzc() throws Exception [...]

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33 ? this.zzb.registerReceiver(null, intentFilter0) : this.zzb.registerReceiver(null, intentFilter0, 4);
    }

    private static final boolean zze(Intent intent0) {
        if(intent0 != null) {
            switch(intent0.getIntExtra("status", -1)) {
                case 2: 
                case 5: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

