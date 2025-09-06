package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager.OnChecksumsReadyListener;
import java.util.List;

public final class zzaxt implements PackageManager.OnChecksumsReadyListener {
    public final zzgdb zza;

    public zzaxt(zzgdb zzgdb0) {
        this.zza = zzgdb0;
    }

    @Override  // android.content.pm.PackageManager$OnChecksumsReadyListener
    public final void onChecksumsReady(List list0) {
        zzgdb zzgdb0 = this.zza;
        if(list0 == null) {
            zzgdb0.zzc(null);
            return;
        }
        try {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ApkChecksum apkChecksum0 = a.a(list0.get(v1));
                if(apkChecksum0.getType() == 8) {
                    zzgdb0.zzc(zzawg.zzb(apkChecksum0.getValue()));
                    return;
                }
            }
            zzgdb0.zzc(null);
        }
        catch(Throwable unused_ex) {
            zzgdb0.zzc(null);
        }
    }
}

