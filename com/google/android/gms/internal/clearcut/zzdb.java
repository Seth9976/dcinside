package com.google.android.gms.internal.clearcut;

final class zzdb extends zzcy {
    private zzdb() {
        super(null);
    }

    zzdb(zzcz zzcz0) {
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcy
    final void zza(Object object0, long v) {
        zzdb.zzc(object0, v).zzv();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcy
    final void zza(Object object0, Object object1, long v) {
        zzcn zzcn0 = zzdb.zzc(object0, v);
        zzcn zzcn1 = zzdb.zzc(object1, v);
        int v1 = zzcn0.size();
        int v2 = zzcn1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzcn0.zzu()) {
                zzcn0 = zzcn0.zzi(v2 + v1);
            }
            zzcn0.addAll(zzcn1);
        }
        if(v1 > 0) {
            zzcn1 = zzcn0;
        }
        zzfd.zza(object0, v, zzcn1);
    }

    private static zzcn zzc(Object object0, long v) {
        return (zzcn)zzfd.zzo(object0, v);
    }
}

