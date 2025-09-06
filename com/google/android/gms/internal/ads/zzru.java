package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import java.nio.ByteBuffer;

final class zzru extends zzhh {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzru() {
        super(2, 0);
        this.zzi = 0x20;
    }

    @Override  // com.google.android.gms.internal.ads.zzhh
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(@IntRange(from = 1L) int v) {
        this.zzi = v;
    }

    public final boolean zzp(zzhh zzhh0) {
        zzcw.zzd(!zzhh0.zzd(0x40000000));
        zzcw.zzd(!zzhh0.zzd(0x10000000));
        zzcw.zzd(!zzhh0.zzd(4));
        if(this.zzq() && (this.zzh >= this.zzi || zzhh0.zzc != null && (this.zzc != null && this.zzc.position() + zzhh0.zzc.remaining() > 3072000))) {
            return false;
        }
        int v = this.zzh;
        this.zzh = v + 1;
        if(v == 0) {
            this.zze = zzhh0.zze;
            if(zzhh0.zzd(1)) {
                this.zzc(1);
            }
        }
        ByteBuffer byteBuffer0 = zzhh0.zzc;
        if(byteBuffer0 != null) {
            this.zzj(byteBuffer0.remaining());
            this.zzc.put(byteBuffer0);
        }
        this.zzg = zzhh0.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}

