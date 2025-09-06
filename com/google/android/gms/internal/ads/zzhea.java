package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class zzhea extends zzhdy implements zzaqz {
    private int zzg;

    protected zzhea(String s) {
        super("mvhd");
    }

    public final int zzg() {
        if(!this.zzb) {
            this.zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer0) {
        this.zzg = zzaqy.zzc(byteBuffer0.get());
        zzaqy.zzd(byteBuffer0);
        byteBuffer0.get();
        return 4L;
    }
}

