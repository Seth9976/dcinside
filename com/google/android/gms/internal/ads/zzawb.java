package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

final class zzawb implements Runnable {
    final int zza;
    final zzawd zzb;

    zzawb(zzawd zzawd0, int v, boolean z) {
        this.zza = v;
        this.zzb = zzawd0;
        super();
    }

    @Override
    public final void run() {
        zzasy zzasy0;
        int v = this.zza;
        zzawd zzawd0 = this.zzb;
        if(v > 0) {
            try {
                Thread.sleep(v * 1000);
            }
            catch(InterruptedException unused_ex) {
            }
        }
        try {
            PackageInfo packageInfo0 = zzawd0.zza.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
            zzasy0 = null;
            zzasy0 = zzfnq.zza(zzawd0.zza, "com.dcinside.app.android", Integer.toString(packageInfo0.versionCode));
        }
        catch(Throwable unused_ex) {
        }
        this.zzb.zzm = zzasy0;
        if(this.zza < 4 && (zzasy0 == null || !zzasy0.zzaj() || !zzasy0.zzak() || !zzasy0.zzf().zzg() || zzasy0.zzf().zza() == -2L)) {
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}

