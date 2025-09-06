package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class zzce {
    private final zzfxn zza;
    private final List zzb;
    private ByteBuffer[] zzc;
    private boolean zzd;

    public zzce(zzfxn zzfxn0) {
        this.zza = zzfxn0;
        this.zzb = new ArrayList();
        this.zzc = new ByteBuffer[0];
        this.zzd = false;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzce)) {
            return false;
        }
        if(this.zza.size() == ((zzce)object0).zza.size()) {
            for(int v = 0; v < this.zza.size(); ++v) {
                if(this.zza.get(v) != ((zzce)object0).zza.get(v)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    // 去混淆评级： 中等(60)
    public final zzcf zza(zzcf zzcf0) throws zzcg {
        throw new zzcg("Unhandled input format:", zzcf0);
    }

    public final ByteBuffer zzb() {
        if(!this.zzh()) {
            return zzch.zza;
        }
        ByteBuffer byteBuffer0 = this.zzc[this.zzi()];
        if(byteBuffer0.hasRemaining()) {
            return byteBuffer0;
        }
        this.zzj(zzch.zza);
        return this.zzc[this.zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for(int v1 = 0; v1 < this.zza.size(); ++v1) {
            zzch zzch0 = (zzch)this.zza.get(v1);
            zzch0.zzc();
            if(zzch0.zzg()) {
                this.zzb.add(zzch0);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for(int v = 0; v <= this.zzi(); ++v) {
            ByteBuffer[] arr_byteBuffer = this.zzc;
            arr_byteBuffer[v] = ((zzch)this.zzb.get(v)).zzb();
        }
    }

    public final void zzd() {
        if(this.zzh() && !this.zzd) {
            this.zzd = true;
            ((zzch)this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer0) {
        if(this.zzh() && !this.zzd) {
            this.zzj(byteBuffer0);
        }
    }

    public final void zzf() {
        for(int v = 0; v < this.zza.size(); ++v) {
            zzch zzch0 = (zzch)this.zza.get(v);
            zzch0.zzc();
            zzch0.zzf();
        }
        this.zzc = new ByteBuffer[0];
        this.zzd = false;
    }

    // 去混淆评级： 低(30)
    public final boolean zzg() {
        return this.zzd && ((zzch)this.zzb.get(this.zzi())).zzh() && !this.zzc[this.zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        do {
            int v1 = 0;
            for(int v = 0; v <= this.zzi(); ++v) {
                if(!this.zzc[v].hasRemaining()) {
                    zzch zzch0 = (zzch)this.zzb.get(v);
                    if(!zzch0.zzh()) {
                        if(v > 0) {
                            byteBuffer1 = this.zzc[v - 1];
                        }
                        else {
                            byteBuffer1 = byteBuffer0.hasRemaining() ? byteBuffer0 : zzch.zza;
                        }
                        zzch0.zze(byteBuffer1);
                        ByteBuffer[] arr_byteBuffer = this.zzc;
                        arr_byteBuffer[v] = zzch0.zzb();
                        v1 |= (this.zzc[v].hasRemaining() ? 1 : 0);
                    }
                    else if(!this.zzc[v].hasRemaining() && v < this.zzi()) {
                        ((zzch)this.zzb.get(v + 1)).zzd();
                    }
                }
            }
        }
        while(v1 != 0);
    }
}

