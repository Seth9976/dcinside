package com.google.android.gms.internal.ads;

import android.media.AudioFormat.Builder;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j..util.Objects;
import java.util.Set;

final class zzoh {
    public static final zzoh zza;
    public final int zzb;
    public final int zzc;
    @Nullable
    private final zzfxs zzd;

    static {
        zzoh zzoh0;
        if(zzei.zza >= 33) {
            zzfxr zzfxr0 = new zzfxr();
            for(int v = 1; v <= 10; ++v) {
                zzfxr0.zzf(zzei.zzi(v));
            }
            zzoh0 = new zzoh(2, zzfxr0.zzi());
        }
        else {
            zzoh0 = new zzoh(2, 10);
        }
        zzoh.zza = zzoh0;
    }

    public zzoh(int v, int v1) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = null;
    }

    @RequiresApi(33)
    public zzoh(int v, Set set0) {
        this.zzb = v;
        zzfxs zzfxs0 = zzfxs.zzl(set0);
        this.zzd = zzfxs0;
        int v1 = 0;
        zzfzt zzfzt0 = zzfxs0.zze();
        while(zzfzt0.hasNext()) {
            Object object0 = zzfzt0.next();
            v1 = Math.max(v1, Integer.bitCount(((int)(((Integer)object0)))));
        }
        this.zzc = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzoh ? this.zzb == ((zzoh)object0).zzb && this.zzc == ((zzoh)object0).zzc && Objects.equals(this.zzd, ((zzoh)object0).zzd) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzd == null ? (this.zzb * 0x1F + this.zzc) * 0x1F : (this.zzb * 0x1F + this.zzc) * 0x1F + this.zzd.hashCode();
    }

    @Override
    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + this.zzd + "]";
    }

    public final int zza(int v, zze zze0) {
        if(this.zzd != null) {
            return this.zzc;
        }
        if(zzei.zza >= 29) {
            int v1 = this.zzb;
            for(int v2 = 10; v2 > 0; --v2) {
                int v3 = zzei.zzi(v2);
                if(v3 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(v1).setSampleRate(v).setChannelMask(v3).build(), zze0.zza().zza)) {
                    return v2;
                }
            }
            return 0;
        }
        Integer integer0 = (Integer)zzoi.zzb.getOrDefault(this.zzb, 0);
        integer0.getClass();
        return (int)integer0;
    }

    public final boolean zzb(int v) {
        if(this.zzd == null) {
            return v <= this.zzc;
        }
        int v1 = zzei.zzi(v);
        return v1 == 0 ? false : this.zzd.contains(v1);
    }
}

