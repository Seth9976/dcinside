package com.google.android.gms.internal.measurement;

final class zzkq implements zzlt {
    private static final zzkz zza;
    private final zzkz zzb;

    static {
        zzkq.zza = new zzkp();
    }

    public zzkq() {
        this(new zzkr(new zzkz[]{zzju.zza(), zzkq.zza}));
    }

    private zzkq(zzkz zzkz0) {
        this.zzb = (zzkz)zzjv.zza(zzkz0, "messageInfoFactory");
    }

    @Override  // com.google.android.gms.internal.measurement.zzlt
    public final zzlu zza(Class class0) {
        zzla zzla0 = this.zzb.zza(class0);
        if(zzla0.zzc()) {
            return zzli.zza(zzlw.zza(), zzjj.zza(), zzla0.zza());
        }
        zzlk zzlk0 = zzlm.zza();
        zzkm zzkm0 = zzko.zza();
        zzmk zzmk0 = zzlw.zza();
        return zzks.zza[zzla0.zzb().ordinal()] == 1 ? zzlg.zza(class0, zzla0, zzlk0, zzkm0, zzmk0, null, zzkx.zza()) : zzlg.zza(class0, zzla0, zzlk0, zzkm0, zzmk0, zzjj.zza(), zzkx.zza());
    }
}

