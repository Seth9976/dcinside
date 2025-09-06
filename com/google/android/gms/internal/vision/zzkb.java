package com.google.android.gms.internal.vision;

final class zzkb implements zzlf {
    private final zzkl zza;
    private static final zzkl zzb;

    static {
        zzkb.zzb = new zzka();
    }

    public zzkb() {
        this(new zzkd(new zzkl[]{zzjc.zza(), zzkb.zza()}));
    }

    private zzkb(zzkl zzkl0) {
        this.zza = (zzkl)zzjf.zza(zzkl0, "messageInfoFactory");
    }

    private static zzkl zza() {
        try {
            return (zzkl)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            return zzkb.zzb;
        }
    }

    private static boolean zza(zzki zzki0) {
        return zzki0.zza() == zzkz.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzlf
    public final zzlc zza(Class class0) {
        zzle.zza(class0);
        zzki zzki0 = this.zza.zzb(class0);
        boolean z = zzki0.zzb();
        Class class1 = zzjb.class;
        if(z) {
            return class1.isAssignableFrom(class0) ? zzkq.zza(zzle.zzc(), zzir.zza(), zzki0.zzc()) : zzkq.zza(zzle.zza(), zzir.zzb(), zzki0.zzc());
        }
        if(class1.isAssignableFrom(class0)) {
            return zzkb.zza(zzki0) ? zzko.zza(class0, zzki0, zzku.zzb(), zzju.zzb(), zzle.zzc(), zzir.zza(), zzkj.zzb()) : zzko.zza(class0, zzki0, zzku.zzb(), zzju.zzb(), zzle.zzc(), null, zzkj.zzb());
        }
        return zzkb.zza(zzki0) ? zzko.zza(class0, zzki0, zzku.zza(), zzju.zza(), zzle.zza(), zzir.zzb(), zzkj.zza()) : zzko.zza(class0, zzki0, zzku.zza(), zzju.zza(), zzle.zzb(), null, zzkj.zza());
    }
}

