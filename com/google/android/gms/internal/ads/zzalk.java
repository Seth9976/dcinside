package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class zzalk implements zzakf {
    private final zzdy zza;
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalk(List list0) {
        this.zza = new zzdy();
        String s = "sans-serif";
        boolean z = false;
        if(list0.size() == 1) {
            switch(((byte[])list0.get(0)).length) {
                case 0x30: 
                case 53: {
                    byte[] arr_b = (byte[])list0.get(0);
                    this.zzc = arr_b[24];
                    this.zzd = (arr_b[26] & 0xFF) << 24 | (arr_b[27] & 0xFF) << 16 | (arr_b[28] & 0xFF) << 8 | arr_b[29] & 0xFF;
                    if("Serif".equals(zzei.zzC(arr_b, 43, arr_b.length - 43))) {
                        s = "serif";
                    }
                    this.zze = s;
                    int v = arr_b[25] * 20;
                    this.zzg = v;
                    if((arr_b[0] & 0x20) != 0) {
                        z = true;
                    }
                    this.zzb = z;
                    if(z) {
                        this.zzf = Math.max(0.0f, Math.min(((float)(arr_b[11] & 0xFF | (arr_b[10] & 0xFF) << 8)) / ((float)v), 0.95f));
                        return;
                    }
                    this.zzf = 0.85f;
                    return;
                }
            }
        }
        this.zzc = 0;
        this.zzd = -1;
        this.zze = "sans-serif";
        this.zzb = false;
        this.zzf = 0.85f;
        this.zzg = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        int v18;
        int v17;
        String s;
        this.zza.zzJ(arr_b, v + v1);
        this.zza.zzL(v);
        zzdy zzdy0 = this.zza;
        zzcw.zzd(zzdy0.zzb() >= 2);
        int v2 = zzdy0.zzq();
        if(v2 == 0) {
            s = "";
        }
        else {
            int v3 = zzdy0.zzd();
            Charset charset0 = zzdy0.zzC();
            int v4 = zzdy0.zzd();
            if(charset0 == null) {
                charset0 = StandardCharsets.UTF_8;
            }
            s = zzdy0.zzB(v2 - (v4 - v3), charset0);
        }
        if(s.isEmpty()) {
            zzdb0.zza(new zzajx(zzfxn.zzn(), 0x8000000000000001L, 0x8000000000000001L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s);
        int v5 = spannableStringBuilder0.length();
        zzalk.zzc(spannableStringBuilder0, this.zzc, 0, 0, v5, 0xFF0000);
        int v6 = spannableStringBuilder0.length();
        zzalk.zzb(spannableStringBuilder0, this.zzd, -1, 0, v6, 0xFF0000);
        String s1 = this.zze;
        int v7 = spannableStringBuilder0.length();
        if(s1 != "sans-serif") {
            spannableStringBuilder0.setSpan(new TypefaceSpan(s1), 0, v7, 0xFF0021);
        }
        float f = this.zzf;
        while(true) {
            zzdy zzdy1 = this.zza;
            if(zzdy1.zzb() < 8) {
                break;
            }
            int v8 = zzdy1.zzd();
            int v9 = zzdy1.zzg();
            int v10 = this.zza.zzg();
            if(v10 == 1937013100) {
                zzcw.zzd(this.zza.zzb() >= 2);
                int v11 = this.zza.zzq();
                int v12 = 0;
                while(v12 < v11) {
                    zzcw.zzd(this.zza.zzb() >= 12);
                    int v13 = this.zza.zzq();
                    int v14 = this.zza.zzq();
                    this.zza.zzM(2);
                    int v15 = this.zza.zzm();
                    this.zza.zzM(1);
                    int v16 = this.zza.zzg();
                    if(v14 > spannableStringBuilder0.length()) {
                        v17 = v11;
                        zzdo.zzf("Tx3gParser", "Truncating styl end (" + v14 + ") to cueText.length() (" + spannableStringBuilder0.length() + ").");
                        v18 = spannableStringBuilder0.length();
                    }
                    else {
                        v17 = v11;
                        v18 = v14;
                    }
                    if(v13 >= v18) {
                        zzdo.zzf("Tx3gParser", "Ignoring styl with start (" + v13 + ") >= end (" + v18 + ").");
                    }
                    else {
                        zzalk.zzc(spannableStringBuilder0, v15, this.zzc, v13, v18, 0);
                        zzalk.zzb(spannableStringBuilder0, v16, this.zzd, v13, v18, 0);
                    }
                    ++v12;
                    v11 = v17;
                }
            }
            else if(v10 == 1952608120 && this.zzb) {
                zzcw.zzd(this.zza.zzb() >= 2);
                f = Math.max(0.0f, Math.min(((float)this.zza.zzq()) / ((float)this.zzg), 0.95f));
            }
            this.zza.zzL(v8 + v9);
        }
        zzcm zzcm0 = new zzcm();
        zzcm0.zzl(spannableStringBuilder0);
        zzcm0.zze(f, 0);
        zzcm0.zzf(0);
        zzdb0.zza(new zzajx(zzfxn.zzo(zzcm0.zzp()), 0x8000000000000001L, 0x8000000000000001L));
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder0, int v, int v1, int v2, int v3, int v4) {
        if(v != v1) {
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v >>> 8 | (v & 0xFF) << 24), v2, v3, v4 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder0, int v, int v1, int v2, int v3, int v4) {
        boolean z = true;
        if(v != v1) {
            if((v & 1) == 0) {
                if((v & 2) == 0) {
                    z = false;
                }
                else {
                    spannableStringBuilder0.setSpan(new StyleSpan(2), v2, v3, v4 | 33);
                }
            }
            else if((v & 2) != 0) {
                spannableStringBuilder0.setSpan(new StyleSpan(3), v2, v3, v4 | 33);
            }
            else {
                spannableStringBuilder0.setSpan(new StyleSpan(1), v2, v3, v4 | 33);
                z = false;
            }
            if((v & 4) != 0) {
                spannableStringBuilder0.setSpan(new UnderlineSpan(), v2, v3, v4 | 33);
            }
            else if((v & 1) == 0 && !z) {
                spannableStringBuilder0.setSpan(new StyleSpan(0), v2, v3, v4 | 33);
            }
        }
    }
}

