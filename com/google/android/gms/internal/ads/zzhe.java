package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;
import androidx.annotation.Nullable;

public final class zzhe {
    @Nullable
    public byte[] zza;
    @Nullable
    public byte[] zzb;
    public int zzc;
    @Nullable
    public int[] zzd;
    @Nullable
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    @Nullable
    private final zzhc zzj;

    public zzhe() {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = new MediaCodec.CryptoInfo();
        this.zzi = mediaCodec$CryptoInfo0;
        this.zzj = zzei.zza < 24 ? null : new zzhc(mediaCodec$CryptoInfo0, null);
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int v) {
        if(v == 0) {
            return;
        }
        if(this.zzd == null) {
            int[] arr_v = new int[1];
            this.zzd = arr_v;
            this.zzi.numBytesOfClearData = arr_v;
        }
        this.zzd[0] += v;
    }

    public final void zzc(int v, int[] arr_v, int[] arr_v1, byte[] arr_b, byte[] arr_b1, int v1, int v2, int v3) {
        this.zzf = v;
        this.zzd = arr_v;
        this.zze = arr_v1;
        this.zzb = arr_b;
        this.zza = arr_b1;
        this.zzc = v1;
        this.zzg = v2;
        this.zzh = v3;
        this.zzi.numSubSamples = v;
        this.zzi.numBytesOfClearData = arr_v;
        this.zzi.numBytesOfEncryptedData = arr_v1;
        this.zzi.key = arr_b;
        this.zzi.iv = arr_b1;
        this.zzi.mode = v1;
        if(zzei.zza >= 24) {
            this.zzj.getClass();
            zzhc.zza(this.zzj, v2, v3);
        }
    }
}

