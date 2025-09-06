package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzalm {
    private static final Pattern zza;
    private static final Pattern zzb;
    private final zzdy zzc;
    private final StringBuilder zzd;

    static {
        zzalm.zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        zzalm.zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }

    public zzalm() {
        this.zzc = new zzdy();
        this.zzd = new StringBuilder();
    }

    @Nullable
    static String zza(zzdy zzdy0, StringBuilder stringBuilder0) {
        zzalm.zzc(zzdy0);
        if(zzdy0.zzb() == 0) {
            return null;
        }
        String s = zzalm.zzd(zzdy0, stringBuilder0);
        return !"".equals(s) ? s : ((char)zzdy0.zzm());
    }

    public final List zzb(zzdy zzdy0) {
        String s7;
        String s1;
        this.zzd.setLength(0);
        int v = zzdy0.zzd();
        while(!TextUtils.isEmpty(zzdy0.zzz(StandardCharsets.UTF_8))) {
        }
        this.zzc.zzJ(zzdy0.zzN(), zzdy0.zzd());
        this.zzc.zzL(v);
        List list0 = new ArrayList();
        while(true) {
            zzdy zzdy1 = this.zzc;
            StringBuilder stringBuilder0 = this.zzd;
            zzalm.zzc(zzdy1);
            if(zzdy1.zzb() < 5) {
                s1 = null;
            }
            else if("::cue".equals(zzdy1.zzB(5, StandardCharsets.UTF_8))) {
                int v1 = zzdy1.zzd();
                String s = zzalm.zza(zzdy1, stringBuilder0);
                if(s == null) {
                    s1 = null;
                }
                else if("{".equals(s)) {
                    zzdy1.zzL(v1);
                    s1 = "";
                }
                else {
                    if("(".equals(s)) {
                        int v2 = zzdy1.zzd();
                        int v3 = zzdy1.zze();
                        boolean z = false;
                        while(v2 < v3 && !z) {
                            z = ((char)zzdy1.zzN()[v2]) == 41;
                            ++v2;
                        }
                        s1 = zzdy1.zzB(v2 - 1 - zzdy1.zzd(), StandardCharsets.UTF_8).trim();
                    }
                    else {
                        s1 = null;
                    }
                    if(!")".equals(zzalm.zza(zzdy1, stringBuilder0))) {
                        s1 = null;
                    }
                }
            }
            else {
                s1 = null;
            }
            if(s1 == null || !"{".equals(zzalm.zza(this.zzc, this.zzd))) {
                break;
            }
            zzaln zzaln0 = new zzaln();
            if(!"".equals(s1)) {
                int v4 = s1.indexOf(91);
                if(v4 != -1) {
                    Matcher matcher0 = zzalm.zza.matcher(s1.substring(v4));
                    if(matcher0.matches()) {
                        String s2 = matcher0.group(1);
                        s2.getClass();
                        zzaln0.zzv(s2);
                    }
                    s1 = s1.substring(0, v4);
                }
                String[] arr_s = s1.split("\\.", -1);
                String s3 = arr_s[0];
                int v5 = s3.indexOf(35);
                if(v5 == -1) {
                    zzaln0.zzu(s3);
                }
                else {
                    zzaln0.zzu(s3.substring(0, v5));
                    zzaln0.zzt(s3.substring(v5 + 1));
                }
                if(arr_s.length > 1) {
                    zzaln0.zzs(((String[])Arrays.copyOfRange(arr_s, 1, arr_s.length)));
                }
            }
            boolean z1 = false;
            String s4 = null;
            while(!z1) {
                int v6 = this.zzc.zzd();
                s4 = zzalm.zza(this.zzc, this.zzd);
                z1 = s4 == null || "}".equals(s4);
                if(!z1) {
                    this.zzc.zzL(v6);
                    zzdy zzdy2 = this.zzc;
                    StringBuilder stringBuilder1 = this.zzd;
                    zzalm.zzc(zzdy2);
                    String s5 = zzalm.zzd(zzdy2, stringBuilder1);
                    if(!"".equals(s5) && ":".equals(zzalm.zza(zzdy2, stringBuilder1))) {
                        zzalm.zzc(zzdy2);
                        StringBuilder stringBuilder2 = new StringBuilder();
                        boolean z2 = false;
                        while(true) {
                            if(!z2) {
                                int v7 = zzdy2.zzd();
                                String s6 = zzalm.zza(zzdy2, stringBuilder1);
                                if(s6 == null) {
                                    s7 = null;
                                    break;
                                }
                                else {
                                    if("}".equals(s6) || ";".equals(s6)) {
                                        zzdy2.zzL(v7);
                                        z2 = true;
                                    }
                                    else {
                                        stringBuilder2.append(s6);
                                    }
                                    continue;
                                }
                            }
                            s7 = stringBuilder2.toString();
                            break;
                        }
                        if(s7 != null && !"".equals(s7)) {
                            int v8 = zzdy2.zzd();
                            String s8 = zzalm.zza(zzdy2, stringBuilder1);
                            if(!";".equals(s8)) {
                                if(!"}".equals(s8)) {
                                    continue;
                                }
                                zzdy2.zzL(v8);
                            }
                            if("color".equals(s5)) {
                                zzaln0.zzk(zzcz.zza(s7));
                            }
                            else if("background-color".equals(s5)) {
                                zzaln0.zzh(zzcz.zza(s7));
                            }
                            else if("ruby-position".equals(s5)) {
                                if("over".equals(s7)) {
                                    zzaln0.zzp(1);
                                }
                                else {
                                    if(!"under".equals(s7)) {
                                        continue;
                                    }
                                    zzaln0.zzp(2);
                                }
                            }
                            else if("text-combine-upright".equals(s5)) {
                                zzaln0.zzj("all".equals(s7) || s7.startsWith("digits"));
                            }
                            else if("text-decoration".equals(s5)) {
                                if(!"underline".equals(s7)) {
                                    continue;
                                }
                                zzaln0.zzq(true);
                            }
                            else if("font-family".equals(s5)) {
                                zzaln0.zzl(s7);
                            }
                            else if("font-weight".equals(s5)) {
                                if(!"bold".equals(s7)) {
                                    continue;
                                }
                                zzaln0.zzi(true);
                            }
                            else if(!"font-style".equals(s5)) {
                                if(!"font-size".equals(s5)) {
                                    continue;
                                }
                                String s9 = zzftt.zza(s7);
                                Matcher matcher1 = zzalm.zzb.matcher(s9);
                                if(matcher1.matches()) {
                                    String s10 = matcher1.group(2);
                                    s10.getClass();
                                    switch(s10) {
                                        case "%": {
                                            zzaln0.zzn(3);
                                            break;
                                        }
                                        case "em": {
                                            zzaln0.zzn(2);
                                            break;
                                        }
                                        case "px": {
                                            zzaln0.zzn(1);
                                            break;
                                        }
                                        default: {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    String s11 = matcher1.group(1);
                                    s11.getClass();
                                    zzaln0.zzm(Float.parseFloat(s11));
                                }
                                else {
                                    zzdo.zzf("WebvttCssParser", "Invalid font-size: \'" + s7 + "\'.");
                                }
                            }
                            else if("italic".equals(s7)) {
                                zzaln0.zzo(true);
                            }
                        }
                    }
                }
            }
            if("}".equals(s4)) {
                list0.add(zzaln0);
            }
        }
        return list0;
    }

    static void zzc(zzdy zzdy0) {
    alab1:
        while(true) {
            boolean z = true;
        alab2:
            while(true) {
                if(zzdy0.zzb() <= 0 || !z) {
                    break alab1;
                }
                switch(((char)zzdy0.zzN()[zzdy0.zzd()])) {
                    case 9: 
                    case 10: 
                    case 12: 
                    case 13: 
                    case 0x20: {
                        break;
                    }
                    default: {
                        int v = zzdy0.zzd();
                        int v1 = zzdy0.zze();
                        byte[] arr_b = zzdy0.zzN();
                        if(v + 2 <= v1 && arr_b[v] == 0x2F) {
                            int v2 = v + 2;
                            if(arr_b[v + 1] == 42) {
                                while(v2 + 1 < v1) {
                                    if(((char)arr_b[v2]) == 42 && ((char)arr_b[v2 + 1]) == 0x2F) {
                                        v1 = v2 + 2;
                                        v2 = v1;
                                    }
                                    else {
                                        ++v2;
                                    }
                                }
                                zzdy0.zzM(v1 - zzdy0.zzd());
                                break alab2;
                            }
                        }
                        z = false;
                        continue;
                    }
                }
                zzdy0.zzM(1);
                break;
            }
        }
    }

    private static String zzd(zzdy zzdy0, StringBuilder stringBuilder0) {
        stringBuilder0.setLength(0);
        int v = zzdy0.zzd();
        int v1 = zzdy0.zze();
    alab1:
        while(true) {
            for(boolean z = false; true; z = true) {
                if(v >= v1 || z) {
                    break alab1;
                }
                int v2 = (char)zzdy0.zzN()[v];
                if(v2 >= 65 && v2 <= 90 || v2 >= 97 && v2 <= 0x7A || v2 >= 0x30 && v2 <= 57 || (v2 == 35 || v2 == 45 || v2 == 46 || v2 == 0x5F)) {
                    stringBuilder0.append(((char)v2));
                    ++v;
                    break;
                }
            }
        }
        zzdy0.zzM(v - zzdy0.zzd());
        return stringBuilder0.toString();
    }
}

