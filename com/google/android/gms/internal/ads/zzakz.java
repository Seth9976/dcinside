package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzakz implements zzakf {
    private static final Pattern zza;
    private static final Pattern zzb;
    private final StringBuilder zzc;
    private final ArrayList zzd;
    private final zzdy zze;

    static {
        zzakz.zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
        zzakz.zzb = Pattern.compile("\\{\\\\.*?\\}");
    }

    public zzakz() {
        this.zzc = new StringBuilder();
        this.zzd = new ArrayList();
        this.zze = new zzdy();
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        zzco zzco0;
        this.zze.zzJ(arr_b, v + v1);
        this.zze.zzL(v);
        Charset charset0 = this.zze.zzC();
        if(charset0 == null) {
            charset0 = StandardCharsets.UTF_8;
        }
        String s;
        while((s = this.zze.zzz(charset0)) != null) {
            if(s.length() != 0) {
                try {
                    Integer.parseInt(s);
                }
                catch(NumberFormatException unused_ex) {
                    zzdo.zzf("SubripParser", "Skipping invalid index: " + s);
                    continue;
                }
                String s1 = this.zze.zzz(charset0);
                if(s1 == null) {
                    zzdo.zzf("SubripParser", "Unexpected end");
                    return;
                }
                Matcher matcher0 = zzakz.zza.matcher(s1);
                if(matcher0.matches()) {
                    long v2 = zzakz.zzc(matcher0, 1);
                    long v3 = zzakz.zzc(matcher0, 6);
                    this.zzc.setLength(0);
                    this.zzd.clear();
                    for(String s2 = this.zze.zzz(charset0); !TextUtils.isEmpty(s2); s2 = this.zze.zzz(charset0)) {
                        if(this.zzc.length() > 0) {
                            this.zzc.append("<br>");
                        }
                        StringBuilder stringBuilder0 = this.zzc;
                        ArrayList arrayList0 = this.zzd;
                        String s3 = s2.trim();
                        StringBuilder stringBuilder1 = new StringBuilder(s3);
                        Matcher matcher1 = zzakz.zzb.matcher(s3);
                        for(int v4 = 0; matcher1.find(); v4 += v6) {
                            String s4 = matcher1.group();
                            arrayList0.add(s4);
                            int v5 = matcher1.start();
                            int v6 = s4.length();
                            stringBuilder1.replace(v5 - v4, v5 - v4 + v6, "");
                        }
                        stringBuilder0.append(stringBuilder1.toString());
                    }
                    Spanned spanned0 = Html.fromHtml(this.zzc.toString());
                    int v7 = 0;
                    while(true) {
                        String s5 = null;
                        if(v7 < this.zzd.size()) {
                            String s6 = (String)this.zzd.get(v7);
                            if(s6.matches("\\{\\\\an[1-9]\\}")) {
                                s5 = s6;
                            }
                            else {
                                ++v7;
                                continue;
                            }
                        }
                        break;
                    }
                    zzcm zzcm0 = new zzcm();
                    zzcm0.zzl(spanned0);
                    if(s5 != null) {
                        switch(s5) {
                            case "{\an1}": {
                                zzcm0.zzi(0);
                                break;
                            }
                            case "{\an3}": {
                                zzcm0.zzi(2);
                                break;
                            }
                            case "{\an4}": {
                                zzcm0.zzi(0);
                                break;
                            }
                            case "{\an6}": {
                                zzcm0.zzi(2);
                                break;
                            }
                            case "{\an7}": {
                                zzcm0.zzi(0);
                                break;
                            }
                            case "{\an9}": {
                                zzcm0.zzi(2);
                                break;
                            }
                            default: {
                                zzcm0.zzi(1);
                            }
                        }
                        switch(s5) {
                            case "{\an1}": {
                                zzcm0.zzf(2);
                                break;
                            }
                            case "{\an2}": {
                                zzcm0.zzf(2);
                                break;
                            }
                            case "{\an3}": {
                                zzcm0.zzf(2);
                                break;
                            }
                            case "{\an7}": 
                            case "{\an8}": 
                            case "{\an9}": {
                                zzcm0.zzf(0);
                                break;
                            }
                            default: {
                                zzcm0.zzf(1);
                            }
                        }
                        zzcm0.zzh(zzakz.zzb(zzcm0.zzb()));
                        zzcm0.zze(zzakz.zzb(zzcm0.zza()), 0);
                    }
                    zzco0 = zzcm0.zzp();
                    zzdb0.zza(new zzajx(zzfxn.zzo(zzco0), v2, v3 - v2));
                }
                else {
                    zzdo.zzf("SubripParser", "Skipping invalid timing: " + s1);
                }
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static float zzb(int v) {
        switch(v) {
            case 0: {
                return 0.08f;
            }
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 0.92f;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    private static long zzc(Matcher matcher0, int v) {
        String s = matcher0.group(v + 1);
        long v1 = s == null ? 0L : Long.parseLong(s) * 3600000L;
        String s1 = matcher0.group(v + 2);
        s1.getClass();
        long v2 = Long.parseLong(s1);
        String s2 = matcher0.group(v + 3);
        s2.getClass();
        long v3 = v1 + v2 * 60000L + Long.parseLong(s2) * 1000L;
        String s3 = matcher0.group(v + 4);
        if(s3 != null) {
            v3 += Long.parseLong(s3);
        }
        return v3 * 1000L;
    }
}

