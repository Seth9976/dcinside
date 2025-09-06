package com.google.android.gms.internal.clearcut;

final class zzdd implements zzeg {
    private final zzdn zzly;
    private static final zzdn zzlz;

    static {
        zzdd.zzlz = new zzde();
    }

    public zzdd() {
        this(new zzdf(new zzdn[]{zzcf.zzay(), zzdd.zzby()}));
    }

    private zzdd(zzdn zzdn0) {
        this.zzly = (zzdn)zzci.zza(zzdn0, "messageInfoFactory");
    }

    private static boolean zza(zzdm zzdm0) {
        return zzdm0.zzcf() == zzg.zzkl;
    }

    private static zzdn zzby() {
        try {
            return (zzdn)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            return zzdd.zzlz;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzeg
    public final zzef zzd(Class class0) {
        zzeh.zzf(class0);
        zzdm zzdm0 = this.zzly.zzb(class0);
        boolean z = zzdm0.zzcg();
        Class class1 = zzcg.class;
        if(z) {
            return class1.isAssignableFrom(class0) ? zzdu.zza(zzeh.zzdo(), zzbx.zzap(), zzdm0.zzch()) : zzdu.zza(zzeh.zzdm(), zzbx.zzaq(), zzdm0.zzch());
        }
        if(class1.isAssignableFrom(class0)) {
            zzdw zzdw0 = zzdy.zzck();
            zzcy zzcy0 = zzcy.zzbw();
            zzex zzex0 = zzeh.zzdo();
            return zzdd.zza(zzdm0) ? zzds.zza(class0, zzdm0, zzdw0, zzcy0, zzex0, zzbx.zzap(), zzdl.zzcd()) : zzds.zza(class0, zzdm0, zzdw0, zzcy0, zzex0, null, zzdl.zzcd());
        }
        zzdw zzdw1 = zzdy.zzcj();
        zzcy zzcy1 = zzcy.zzbv();
        return zzdd.zza(zzdm0) ? zzds.zza(class0, zzdm0, zzdw1, zzcy1, zzeh.zzdm(), zzbx.zzaq(), zzdl.zzcc()) : zzds.zza(class0, zzdm0, zzdw1, zzcy1, zzeh.zzdn(), null, zzdl.zzcc());
    }
}

