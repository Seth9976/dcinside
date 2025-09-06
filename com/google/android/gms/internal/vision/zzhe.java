package com.google.android.gms.internal.vision;

import java.io.IOException;

public abstract class zzhe implements zzkn {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zza();
    }

    public abstract zzhe zza();

    protected abstract zzhe zza(zzhf arg1);

    public abstract zzhe zza(zzif arg1, zzio arg2) throws IOException;

    public zzhe zza(byte[] arr_b, int v, int v1, zzio zzio0) throws zzjk {
        try {
            zzif zzif0 = zzif.zza(arr_b, 0, v1, false);
            this.zza(zzif0, zzio0);
            zzif0.zza(0);
            return this;
        }
        catch(zzjk zzjk0) {
            throw zzjk0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading " + this.getClass().getName() + " from a " + "byte array" + " threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzkn
    public final zzkn zza(zzkk zzkk0) {
        if(!this.zzr().getClass().isInstance(zzkk0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return this.zza(((zzhf)zzkk0));
    }
}

