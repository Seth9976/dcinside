package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

final class zzaki implements zzadt {
    private final zzadt zza;
    private final zzakd zzb;
    private final zzdy zzc;
    private int zzd;
    private int zze;
    private byte[] zzf;
    @Nullable
    private zzakf zzg;
    private zzab zzh;

    public zzaki(zzadt zzadt0, zzakd zzakd0) {
        this.zza = zzadt0;
        this.zzb = zzakd0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = zzei.zzf;
        this.zzc = new zzdy();
    }

    // 检测为 Lambda 实现
    final void zza(long v, int v1, zzajx zzajx0) [...]

    private final void zzb(int v) {
        int v1 = this.zze;
        if(this.zzf.length - v1 >= v) {
            return;
        }
        int v2 = v1 - this.zzd;
        int v3 = Math.max(v2 + v2, v + v2);
        byte[] arr_b = this.zzf;
        byte[] arr_b1 = v3 > arr_b.length ? new byte[v3] : arr_b;
        System.arraycopy(arr_b, this.zzd, arr_b1, 0, v2);
        this.zzd = 0;
        this.zze = v2;
        this.zzf = arr_b1;
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final int zzf(zzl zzl0, int v, boolean z) {
        return zzadr.zza(this, zzl0, v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final int zzg(zzl zzl0, int v, boolean z, int v1) throws IOException {
        if(this.zzg == null) {
            return this.zza.zzg(zzl0, v, z, 0);
        }
        this.zzb(v);
        int v2 = zzl0.zza(this.zzf, this.zze, v);
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        this.zze += v2;
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzl(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzm(zzab zzab0) {
        zzab0.zzo.getClass();
        zzcw.zzd(zzbb.zzb(zzab0.zzo) == 3);
        if(!zzab0.equals(this.zzh)) {
            this.zzh = zzab0;
            this.zzg = this.zzb.zzc(zzab0) ? this.zzb.zzb(zzab0) : null;
        }
        if(this.zzg == null) {
            this.zza.zzm(zzab0);
            return;
        }
        zzz zzz0 = zzab0.zzb();
        zzz0.zzaa("application/x-media3-cues");
        zzz0.zzA(zzab0.zzo);
        zzz0.zzae(0x7FFFFFFFFFFFFFFFL);
        zzz0.zzE(this.zzb.zza(zzab0));
        zzab zzab1 = zzz0.zzag();
        this.zza.zzm(zzab1);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzr(zzdy zzdy0, int v) {
        zzadr.zzb(this, zzdy0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzs(zzdy zzdy0, int v, int v1) {
        if(this.zzg == null) {
            this.zza.zzs(zzdy0, v, v1);
            return;
        }
        this.zzb(v);
        zzdy0.zzH(this.zzf, this.zze, v);
        this.zze += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzt(long v, int v1, int v2, int v3, @Nullable zzads zzads0) {
        if(this.zzg == null) {
            this.zza.zzt(v, v1, v2, v3, zzads0);
            return;
        }
        zzcw.zze(zzads0 == null, "DRM on subtitles is not supported");
        int v4 = this.zze - v3 - v2;
        this.zzg.zza(this.zzf, v4, v2, zzake.zza(), (zzajx zzajx0) -> {
            zzcw.zzb(this.zzh);
            long v2 = zzajx0.zzc;
            ArrayList arrayList0 = new ArrayList(zzajx0.zza.size());
            for(Object object0: zzajx0.zza) {
                arrayList0.add(((zzco)object0).zza());
            }
            Bundle bundle0 = new Bundle();
            bundle0.putParcelableArrayList("c", arrayList0);
            bundle0.putLong("d", v2);
            Parcel parcel0 = Parcel.obtain();
            parcel0.writeBundle(bundle0);
            byte[] arr_b = parcel0.marshall();
            parcel0.recycle();
            this.zzc.zzJ(arr_b, arr_b.length);
            this.zza.zzr(this.zzc, arr_b.length);
            long v3 = zzajx0.zzb;
            if(v3 == 0x8000000000000001L) {
                zzcw.zzf(this.zzh.zzt == 0x7FFFFFFFFFFFFFFFL);
            }
            else {
                long v4 = this.zzh.zzt;
                v = v4 == 0x7FFFFFFFFFFFFFFFL ? v + v3 : v3 + v4;
            }
            this.zza.zzt(v, v1, arr_b.length, 0, null);
        });
        int v5 = v4 + v2;
        this.zzd = v5;
        if(v5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}

