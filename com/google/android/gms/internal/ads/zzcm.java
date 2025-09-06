package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;
import androidx.annotation.Nullable;
import w4.d;

public final class zzcm {
    @Nullable
    private CharSequence zza;
    @Nullable
    private Bitmap zzb;
    @Nullable
    private Layout.Alignment zzc;
    @Nullable
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcm() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.402823E+38f;
        this.zzf = 0x80000000;
        this.zzg = 0x80000000;
        this.zzh = -3.402823E+38f;
        this.zzi = 0x80000000;
        this.zzj = 0x80000000;
        this.zzk = -3.402823E+38f;
        this.zzl = -3.402823E+38f;
        this.zzm = -3.402823E+38f;
        this.zzn = 0x80000000;
    }

    zzcm(zzco zzco0, zzcn zzcn0) {
        this.zza = zzco0.zza;
        this.zzb = zzco0.zzd;
        this.zzc = zzco0.zzb;
        this.zzd = zzco0.zzc;
        this.zze = zzco0.zze;
        this.zzf = zzco0.zzf;
        this.zzg = zzco0.zzg;
        this.zzh = zzco0.zzh;
        this.zzi = zzco0.zzi;
        this.zzj = zzco0.zzl;
        this.zzk = zzco0.zzm;
        this.zzl = zzco0.zzj;
        this.zzm = zzco0.zzk;
        this.zzn = zzco0.zzn;
        this.zzo = zzco0.zzo;
    }

    @d
    public final int zza() {
        return this.zzg;
    }

    @d
    public final int zzb() {
        return this.zzi;
    }

    public final zzcm zzc(Bitmap bitmap0) {
        this.zzb = bitmap0;
        return this;
    }

    public final zzcm zzd(float f) {
        this.zzm = f;
        return this;
    }

    public final zzcm zze(float f, int v) {
        this.zze = f;
        this.zzf = v;
        return this;
    }

    public final zzcm zzf(int v) {
        this.zzg = v;
        return this;
    }

    public final zzcm zzg(@Nullable Layout.Alignment layout$Alignment0) {
        this.zzd = layout$Alignment0;
        return this;
    }

    public final zzcm zzh(float f) {
        this.zzh = f;
        return this;
    }

    public final zzcm zzi(int v) {
        this.zzi = v;
        return this;
    }

    public final zzcm zzj(float f) {
        this.zzo = f;
        return this;
    }

    public final zzcm zzk(float f) {
        this.zzl = f;
        return this;
    }

    public final zzcm zzl(CharSequence charSequence0) {
        this.zza = charSequence0;
        return this;
    }

    public final zzcm zzm(@Nullable Layout.Alignment layout$Alignment0) {
        this.zzc = layout$Alignment0;
        return this;
    }

    public final zzcm zzn(float f, int v) {
        this.zzk = f;
        this.zzj = v;
        return this;
    }

    public final zzcm zzo(int v) {
        this.zzn = v;
        return this;
    }

    public final zzco zzp() {
        return new zzco(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, 0xFF000000, this.zzn, this.zzo, null);
    }

    @Nullable
    @d
    public final CharSequence zzq() {
        return this.zza;
    }
}

