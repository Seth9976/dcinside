package com.google.android.gms.internal.vision;

final class zzjc implements zzkl {
    private static final zzjc zza;

    static {
        zzjc.zza = new zzjc();
    }

    public static zzjc zza() {
        return zzjc.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzkl
    public final boolean zza(Class class0) {
        return zzjb.class.isAssignableFrom(class0);
    }

    @Override  // com.google.android.gms.internal.vision.zzkl
    public final zzki zzb(Class class0) {
        Class class1 = zzjb.class;
        if(!class1.isAssignableFrom(class0)) {
            String s = class0.getName();
            throw new IllegalArgumentException((s.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: " + s));
        }
        try {
            return (zzki)zzjb.zza(class0.asSubclass(class1)).zza(zzg.zzc, null, null);
        }
        catch(Exception exception0) {
            String s1 = class0.getName();
            throw new RuntimeException((s1.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for " + s1), exception0);
        }
    }
}

