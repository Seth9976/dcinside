package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class zzarc extends zzhea {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhek zzm;
    private long zzn;

    public zzarc() {
        super("mvhd");
        this.zzk = 1.0;
        this.zzl = 1.0f;
        this.zzm = zzhek.zza;
    }

    @Override
    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzhdy
    public final void zze(ByteBuffer byteBuffer0) {
        this.zzh(byteBuffer0);
        if(this.zzg() == 1) {
            this.zzg = zzhef.zza(zzaqy.zzf(byteBuffer0));
            this.zzh = zzhef.zza(zzaqy.zzf(byteBuffer0));
            this.zzi = zzaqy.zze(byteBuffer0);
            this.zzj = zzaqy.zzf(byteBuffer0);
        }
        else {
            this.zzg = zzhef.zza(zzaqy.zze(byteBuffer0));
            this.zzh = zzhef.zza(zzaqy.zze(byteBuffer0));
            this.zzi = zzaqy.zze(byteBuffer0);
            this.zzj = zzaqy.zze(byteBuffer0);
        }
        this.zzk = zzaqy.zzb(byteBuffer0);
        byte[] arr_b = new byte[2];
        byteBuffer0.get(arr_b);
        this.zzl = ((float)(((short)(arr_b[1] & 0xFF | ((short)(0xFF00 & arr_b[0] << 8)))))) / 256.0f;
        zzaqy.zzd(byteBuffer0);
        zzaqy.zze(byteBuffer0);
        zzaqy.zze(byteBuffer0);
        double f = zzaqy.zzb(byteBuffer0);
        double f1 = zzaqy.zzb(byteBuffer0);
        double f2 = zzaqy.zza(byteBuffer0);
        double f3 = zzaqy.zzb(byteBuffer0);
        double f4 = zzaqy.zzb(byteBuffer0);
        double f5 = zzaqy.zza(byteBuffer0);
        double f6 = zzaqy.zzb(byteBuffer0);
        double f7 = zzaqy.zzb(byteBuffer0);
        this.zzm = new zzhek(f, f1, f3, f4, f2, f5, zzaqy.zza(byteBuffer0), f6, f7);
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        this.zzn = zzaqy.zze(byteBuffer0);
    }
}

