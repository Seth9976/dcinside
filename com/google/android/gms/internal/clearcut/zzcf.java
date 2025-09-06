package com.google.android.gms.internal.clearcut;

final class zzcf implements zzdn {
    private static final zzcf zzjo;

    static {
        zzcf.zzjo = new zzcf();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdn
    public final boolean zza(Class class0) {
        return zzcg.class.isAssignableFrom(class0);
    }

    public static zzcf zzay() {
        return zzcf.zzjo;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdn
    public final zzdm zzb(Class class0) {
        Class class1 = zzcg.class;
        if(!class1.isAssignableFrom(class0)) {
            String s = class0.getName();
            throw new IllegalArgumentException((s.length() == 0 ? new String("Unsupported message type: ") : "Unsupported message type: " + s));
        }
        try {
            return (zzdm)zzcg.zzc(class0.asSubclass(class1)).zza(zzg.zzkf, null, null);
        }
        catch(Exception exception0) {
            String s1 = class0.getName();
            throw new RuntimeException((s1.length() == 0 ? new String("Unable to get message info for ") : "Unable to get message info for " + s1), exception0);
        }
    }
}

