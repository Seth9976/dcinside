package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzft extends zzfr {
    @Nullable
    private Uri zza;
    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfs zzf;

    public zzft(byte[] arr_b) {
        zzfs zzfs0 = new zzfs(arr_b);
        boolean z = false;
        super(false);
        this.zzf = zzfs0;
        if(arr_b.length > 0) {
            z = true;
        }
        zzcw.zzd(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.zzd;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        byte[] arr_b1 = this.zzb;
        zzcw.zzb(arr_b1);
        System.arraycopy(arr_b1, this.zzc, arr_b, v, v3);
        this.zzc += v3;
        this.zzd -= v3;
        this.zzg(v3);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        this.zzi(zzgd0);
        this.zza = zzgd0.zza;
        this.zzb = this.zzf.zza;
        long v = zzgd0.zze;
        if(v > ((long)this.zzf.zza.length)) {
            throw new zzfz(2008);
        }
        this.zzc = (int)v;
        int v1 = this.zzf.zza.length - ((int)v);
        this.zzd = v1;
        long v2 = zzgd0.zzf;
        if(v2 != -1L) {
            this.zzd = (int)Math.min(v1, v2);
        }
        this.zze = true;
        this.zzj(zzgd0);
        return zzgd0.zzf == -1L ? ((long)this.zzd) : zzgd0.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        if(this.zze) {
            this.zze = false;
            this.zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}

