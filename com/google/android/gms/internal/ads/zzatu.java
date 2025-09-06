package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager.OnChecksumsReadyListener;
import java.util.List;

public final class zzatu implements PackageManager.OnChecksumsReadyListener {
    final zzgdb zza;

    public zzatu() {
        this.zza = zzgdb.zze();
    }

    @Override  // android.content.pm.PackageManager$OnChecksumsReadyListener
    public final void onChecksumsReady(List list0) {
        if(list0 == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ApkChecksum apkChecksum0 = a.a(list0.get(v1));
                if(apkChecksum0.getType() == 8) {
                    zzgaa zzgaa0 = zzgaa.zzi().zzf();
                    byte[] arr_b = apkChecksum0.getValue();
                    String s = zzgaa0.zzj(arr_b, 0, arr_b.length);
                    this.zza.zzc(s);
                    return;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        this.zza.zzc("");
    }
}

