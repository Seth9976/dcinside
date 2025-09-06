package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.d;
import java.nio.ByteBuffer;

public class zzhh extends zzhb {
    @Nullable
    public zzab zza;
    public final zzhe zzb;
    @Nullable
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    @Nullable
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzas.zzb("media3.decoder");
    }

    public zzhh(int v, int v1) {
        this.zzb = new zzhe();
        this.zzg = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzhb
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer0 = this.zzc;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
        ByteBuffer byteBuffer1 = this.zzf;
        if(byteBuffer1 != null) {
            byteBuffer1.clear();
        }
        this.zzd = false;
    }

    @d({"data"})
    public final void zzj(int v) {
        ByteBuffer byteBuffer0 = this.zzc;
        if(byteBuffer0 == null) {
            this.zzc = this.zzm(v);
            return;
        }
        int v1 = byteBuffer0.position();
        int v2 = v + v1;
        if(byteBuffer0.capacity() >= v2) {
            this.zzc = byteBuffer0;
            return;
        }
        ByteBuffer byteBuffer1 = this.zzm(v2);
        byteBuffer1.order(byteBuffer0.order());
        if(v1 > 0) {
            byteBuffer0.flip();
            byteBuffer1.put(byteBuffer0);
        }
        this.zzc = byteBuffer1;
    }

    public final void zzk() {
        ByteBuffer byteBuffer0 = this.zzc;
        if(byteBuffer0 != null) {
            byteBuffer0.flip();
        }
        ByteBuffer byteBuffer1 = this.zzf;
        if(byteBuffer1 != null) {
            byteBuffer1.flip();
        }
    }

    public final boolean zzl() {
        return this.zzd(0x40000000);
    }

    private final ByteBuffer zzm(int v) {
        int v1 = this.zzg;
        if(v1 == 1) {
            return ByteBuffer.allocate(v);
        }
        if(v1 != 2) {
            throw new zzhg((this.zzc == null ? 0 : this.zzc.capacity()), v);
        }
        return ByteBuffer.allocateDirect(v);
    }
}

