package com.google.android.gms.internal.ads;

final class zzgyu implements zzgzw {
    private static final zzgza zza;
    private final zzgza zzb;

    static {
        zzgyu.zza = new zzgys();
    }

    public zzgyu() {
        zzgyt zzgyt0 = new zzgyt(new zzgza[]{zzgxk.zza(), zzgyu.zza});
        super();
        this.zzb = zzgyt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzw
    public final zzgzv zza(Class class0) {
        zzgyz zzgyz0 = this.zzb.zzb(class0);
        if(!zzgyz0.zzb()) {
            zzgzi zzgzi0 = zzgzj.zza();
            zzgyp zzgyp0 = zzgyq.zza();
            zzhah zzhah0 = zzgzx.zzm();
            return zzgyz0.zzc() - 1 == 1 ? zzgzf.zzm(class0, zzgyz0, zzgzi0, zzgyp0, zzhah0, null, zzgyy.zza()) : zzgzf.zzm(class0, zzgyz0, zzgzi0, zzgyp0, zzhah0, zzgxe.zza(), zzgyy.zza());
        }
        return zzgzg.zzc(zzgzx.zzm(), zzgxe.zza(), zzgyz0.zza());
    }
}

