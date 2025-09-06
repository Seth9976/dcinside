package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

public abstract class zzib implements zzlc {
    protected int zza;

    public zzib() {
        this.zza = 0;
    }

    protected static void zza(Iterable iterable0, List list0) {
        zzid.zza(iterable0, list0);
    }

    int zza(zzlu zzlu0) {
        int v = this.zzby();
        if(v == -1) {
            v = zzlu0.zza(this);
            this.zzc(v);
        }
        return v;
    }

    int zzby() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final zzik zzbz() {
        try {
            zzit zzit0 = zzik.zzc(this.zzcb());
            this.zza(zzit0.zzb());
            return zzit0.zza();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "ByteString" + " threw an IOException (should never happen).", iOException0);
        }
    }

    void zzc(int v) {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzca() {
        try {
            byte[] arr_b = new byte[this.zzcb()];
            zzjc zzjc0 = zzjc.zzb(arr_b);
            this.zza(zzjc0);
            zzjc0.zzb();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "byte array" + " threw an IOException (should never happen).", iOException0);
        }
    }
}

