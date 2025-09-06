package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzbp {
    public static final Object zza;
    public Object zzb;
    @Nullable
    @Deprecated
    public Object zzc;
    public zzar zzd;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Nullable
    public zzal zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    private static final zzar zzp;

    static {
        zzbp.zza = new Object();
        zzaf zzaf0 = new zzaf();
        zzaf0.zza("androidx.media3.common.Timeline");
        zzaf0.zzb(Uri.EMPTY);
        zzbp.zzp = zzaf0.zzc();
    }

    public zzbp() {
        this.zzb = zzbp.zza;
        this.zzd = zzbp.zzp;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzbp.class.equals(class0) && Objects.equals(this.zzb, ((zzbp)object0).zzb) && Objects.equals(this.zzd, ((zzbp)object0).zzd) && Objects.equals(this.zzj, ((zzbp)object0).zzj) && this.zze == ((zzbp)object0).zze && this.zzf == ((zzbp)object0).zzf && this.zzg == ((zzbp)object0).zzg && this.zzh == ((zzbp)object0).zzh && this.zzi == ((zzbp)object0).zzi && this.zzk == ((zzbp)object0).zzk && this.zzm == ((zzbp)object0).zzm && this.zzn == ((zzbp)object0).zzn && this.zzo == ((zzbp)object0).zzo;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb.hashCode();
        int v1 = this.zzd.hashCode();
        return this.zzj == null ? (((((((((((v + 0xD9) * 0x1F + v1) * 0x745F + ((int)(this.zze ^ this.zze >>> 0x20))) * 0x1F + ((int)(this.zzf ^ this.zzf >>> 0x20))) * 0x1F + ((int)(this.zzg ^ this.zzg >>> 0x20))) * 0x1F + this.zzh) * 0x1F + this.zzi) * 0x1F + this.zzk) * 961 + ((int)(this.zzm ^ this.zzm >>> 0x20))) * 0x1F + this.zzn) * 0x1F + this.zzo) * 0x1F : ((((((((((v * 0x745F + v1 * 961 + 0x70713408) * 0x1F + ((int)(this.zze ^ this.zze >>> 0x20))) * 0x1F + ((int)(this.zzf ^ this.zzf >>> 0x20))) * 0x1F + ((int)(this.zzg ^ this.zzg >>> 0x20))) * 0x1F + this.zzh) * 0x1F + this.zzi) * 0x1F + this.zzk) * 961 + ((int)(this.zzm ^ this.zzm >>> 0x20))) * 0x1F + this.zzn) * 0x1F + this.zzo) * 0x1F;
    }

    public final zzbp zza(Object object0, @Nullable zzar zzar0, @Nullable Object object1, long v, long v1, long v2, boolean z, boolean z1, @Nullable zzal zzal0, long v3, long v4, int v5, int v6, long v7) {
        this.zzb = object0;
        this.zzd = zzar0 == null ? zzbp.zzp : zzar0;
        this.zzc = null;
        this.zze = 0x8000000000000001L;
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = z;
        this.zzi = z1;
        this.zzj = zzal0;
        this.zzl = 0L;
        this.zzm = v4;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}

