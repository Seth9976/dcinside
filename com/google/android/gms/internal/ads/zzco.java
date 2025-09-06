package com.google.android.gms.internal.ads;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzco {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    @Nullable
    public final CharSequence zza;
    @Nullable
    public final Layout.Alignment zzb;
    @Nullable
    public final Layout.Alignment zzc;
    @Nullable
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    private static final String zzp;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    static {
        zzcm zzcm0 = new zzcm();
        zzcm0.zzl("");
        zzcm0.zzp();
        zzco.zzp = "0";
        zzco.zzq = "h";
        zzco.zzr = "1";
        zzco.zzs = "2";
        zzco.zzt = "i";
        zzco.zzu = "4";
        zzco.zzv = "5";
        zzco.zzw = "6";
        zzco.zzx = "7";
        zzco.zzy = "8";
        zzco.zzz = "9";
        zzco.zzA = "a";
        zzco.zzB = "b";
        zzco.zzC = "c";
        zzco.zzD = "d";
        zzco.zzE = "e";
        zzco.zzF = "f";
        zzco.zzG = "g";
    }

    zzco(CharSequence charSequence0, Layout.Alignment layout$Alignment0, Layout.Alignment layout$Alignment1, Bitmap bitmap0, float f, int v, int v1, float f1, int v2, int v3, float f2, float f3, float f4, boolean z, int v4, int v5, float f5, zzcn zzcn0) {
        if(charSequence0 == null) {
            bitmap0.getClass();
        }
        else {
            zzcw.zzd(bitmap0 == null);
        }
        if(charSequence0 instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence0);
        }
        else {
            this.zza = charSequence0 == null ? null : charSequence0.toString();
        }
        this.zzb = layout$Alignment0;
        this.zzc = layout$Alignment1;
        this.zzd = bitmap0;
        this.zze = f;
        this.zzf = v;
        this.zzg = v1;
        this.zzh = f1;
        this.zzi = v2;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = v3;
        this.zzm = f2;
        this.zzn = v5;
        this.zzo = f5;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzco.class == class0 && TextUtils.equals(this.zza, ((zzco)object0).zza) && this.zzb == ((zzco)object0).zzb && this.zzc == ((zzco)object0).zzc) {
                Bitmap bitmap0 = this.zzd;
                if(bitmap0 == null) {
                    return ((zzco)object0).zzd == null ? this.zze == ((zzco)object0).zze && this.zzf == ((zzco)object0).zzf && this.zzg == ((zzco)object0).zzg && this.zzh == ((zzco)object0).zzh && this.zzi == ((zzco)object0).zzi && this.zzj == ((zzco)object0).zzj && this.zzk == ((zzco)object0).zzk && this.zzl == ((zzco)object0).zzl && this.zzm == ((zzco)object0).zzm && this.zzn == ((zzco)object0).zzn && this.zzo == ((zzco)object0).zzo : false;
                }
                Bitmap bitmap1 = ((zzco)object0).zzd;
                return bitmap1 == null || !bitmap0.sameAs(bitmap1) ? false : this.zze == ((zzco)object0).zze && this.zzf == ((zzco)object0).zzf && this.zzg == ((zzco)object0).zzg && this.zzh == ((zzco)object0).zzh && this.zzi == ((zzco)object0).zzi && this.zzj == ((zzco)object0).zzj && this.zzk == ((zzco)object0).zzk && this.zzl == ((zzco)object0).zzl && this.zzm == ((zzco)object0).zzm && this.zzn == ((zzco)object0).zzn && this.zzo == ((zzco)object0).zzo;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, Boolean.FALSE, 0xFF000000, this.zzl, this.zzm, this.zzn, this.zzo});
    }

    public final Bundle zza() {
        Bundle bundle0 = new Bundle();
        CharSequence charSequence0 = this.zza;
        if(charSequence0 != null) {
            bundle0.putCharSequence("0", charSequence0);
            CharSequence charSequence1 = this.zza;
            if(charSequence1 instanceof Spanned) {
                ArrayList arrayList0 = zzcq.zza(((Spanned)charSequence1));
                if(!arrayList0.isEmpty()) {
                    bundle0.putParcelableArrayList("h", arrayList0);
                }
            }
        }
        bundle0.putSerializable("1", this.zzb);
        bundle0.putSerializable("2", this.zzc);
        bundle0.putFloat("4", this.zze);
        bundle0.putInt("5", this.zzf);
        bundle0.putInt("6", this.zzg);
        bundle0.putFloat("7", this.zzh);
        bundle0.putInt("8", this.zzi);
        bundle0.putInt("9", this.zzl);
        bundle0.putFloat("a", this.zzm);
        bundle0.putFloat("b", this.zzj);
        bundle0.putFloat("c", this.zzk);
        bundle0.putBoolean("e", false);
        bundle0.putInt("d", 0xFF000000);
        bundle0.putInt("f", this.zzn);
        bundle0.putFloat("g", this.zzo);
        if(this.zzd != null) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            zzcw.zzf(this.zzd.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream0));
            bundle0.putByteArray("i", byteArrayOutputStream0.toByteArray());
        }
        return bundle0;
    }

    public final zzcm zzb() {
        return new zzcm(this, null);
    }
}

