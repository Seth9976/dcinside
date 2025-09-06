package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzalv {
    public static final Pattern zza;
    private static final Pattern zzb;
    private static final Map zzc;
    private static final Map zzd;

    static {
        zzalv.zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        zzalv.zzb = Pattern.compile("(\\S+?):(\\S+)");
        HashMap hashMap0 = new HashMap();
        hashMap0.put("white", Color.rgb(0xFF, 0xFF, 0xFF));
        hashMap0.put("lime", Color.rgb(0, 0xFF, 0));
        hashMap0.put("cyan", Color.rgb(0, 0xFF, 0xFF));
        hashMap0.put("red", Color.rgb(0xFF, 0, 0));
        hashMap0.put("yellow", Color.rgb(0xFF, 0xFF, 0));
        hashMap0.put("magenta", Color.rgb(0xFF, 0, 0xFF));
        hashMap0.put("blue", Color.rgb(0, 0, 0xFF));
        hashMap0.put("black", 0xFF000000);
        zzalv.zzc = DesugarCollections.unmodifiableMap(hashMap0);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("bg_white", Color.rgb(0xFF, 0xFF, 0xFF));
        hashMap1.put("bg_lime", Color.rgb(0, 0xFF, 0));
        hashMap1.put("bg_cyan", Color.rgb(0, 0xFF, 0xFF));
        hashMap1.put("bg_red", Color.rgb(0xFF, 0, 0));
        hashMap1.put("bg_yellow", Color.rgb(0xFF, 0xFF, 0));
        hashMap1.put("bg_magenta", Color.rgb(0xFF, 0, 0xFF));
        hashMap1.put("bg_blue", Color.rgb(0, 0, 0xFF));
        hashMap1.put("bg_black", 0xFF000000);
        zzalv.zzd = DesugarCollections.unmodifiableMap(hashMap1);
    }

    // This method was un-flattened
    static SpannedString zza(@Nullable String s, String s1, List list0) {
        int v5;
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        while(v < s1.length()) {
            int v1 = v + 1;
            int v2 = s1.charAt(v);
            switch(v2) {
                case 38: {
                    int v3 = s1.indexOf(59, v1);
                    int v4 = s1.indexOf(0x20, v1);
                    if(v3 == -1) {
                        v3 = v4;
                    }
                    else if(v4 != -1) {
                        v3 = Math.min(v3, v4);
                    }
                    if(v3 == -1) {
                        spannableStringBuilder0.append('&');
                        break;
                    }
                    else {
                        String s2 = s1.substring(v1, v3);
                    alab1:
                        switch(s2) {
                            case "amp": {
                                v5 = 3;
                                goto label_29;
                            }
                            case "gt": {
                                v5 = 1;
                                goto label_29;
                            }
                            case "lt": {
                                v5 = 0;
                                spannableStringBuilder0.append('<');
                                break;
                            }
                            case "nbsp": {
                                v5 = 2;
                            label_29:
                                switch(v5) {
                                    case 1: {
                                        spannableStringBuilder0.append('>');
                                        break alab1;
                                    }
                                    case 2: {
                                        spannableStringBuilder0.append(' ');
                                        break alab1;
                                    }
                                    default: {
                                        if(v5 == 3) {
                                            spannableStringBuilder0.append('&');
                                        }
                                        else {
                                            zzdo.zzf("WebvttCueParser", "ignoring unsupported entity: \'&" + s2 + ";\'");
                                        }
                                        break alab1;
                                    }
                                }
                            }
                            default: {
                                goto label_29;
                            }
                        }
                        if(v3 == v4) {
                            spannableStringBuilder0.append(" ");
                        }
                        v = v3 + 1;
                        continue;
                    }
                    goto label_44;
                }
                case 60: {
                label_44:
                    if(v1 < s1.length()) {
                        int v6 = s1.charAt(v1);
                        int v7 = s1.indexOf(62, v1);
                        v1 = v7 == -1 ? s1.length() : v7 + 1;
                        int v8 = v1 - 2;
                        boolean z = s1.charAt(v8) == 0x2F;
                        if(!z) {
                            v8 = v1 - 1;
                        }
                        String s3 = s1.substring(v + (v6 == 0x2F ? 2 : 1), v8);
                        if(!s3.trim().isEmpty()) {
                            String s4 = s3.trim();
                            zzcw.zzd(!s4.isEmpty());
                            String s5 = s4.split("[ \\.]", 2)[0];
                            switch(s5) {
                                case "b": 
                                case "c": 
                                case "i": 
                                case "lang": 
                                case "rt": 
                                case "ruby": 
                                case "u": 
                                case "v": {
                                    if(v6 == 0x2F) {
                                        while(true) {
                                            if(arrayDeque0.isEmpty()) {
                                                break;
                                            }
                                            zzalr zzalr0 = (zzalr)arrayDeque0.pop();
                                            zzalv.zzg(s, zzalr0, arrayList0, spannableStringBuilder0, list0);
                                            if(arrayDeque0.isEmpty()) {
                                                arrayList0.clear();
                                            }
                                            else {
                                                arrayList0.add(new zzalq(zzalr0, spannableStringBuilder0.length(), null));
                                            }
                                            if(zzalr0.zza.equals(s5)) {
                                                break;
                                            }
                                        }
                                    }
                                    else if(!z) {
                                        arrayDeque0.push(zzalr.zza(s3, spannableStringBuilder0.length()));
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                default: {
                    spannableStringBuilder0.append(((char)v2));
                }
            }
            v = v1;
        }
        while(!arrayDeque0.isEmpty()) {
            zzalv.zzg(s, ((zzalr)arrayDeque0.pop()), arrayList0, spannableStringBuilder0, list0);
        }
        zzalv.zzg(s, zzalr.zzb(), Collections.emptyList(), spannableStringBuilder0, list0);
        return SpannedString.valueOf(spannableStringBuilder0);
    }

    static zzcm zzb(String s) {
        zzalt zzalt0 = new zzalt();
        zzalv.zzh(s, zzalt0);
        return zzalt0.zza();
    }

    @Nullable
    public static zzalo zzc(zzdy zzdy0, List list0) {
        Charset charset0 = StandardCharsets.UTF_8;
        String s = zzdy0.zzz(charset0);
        if(s != null) {
            Pattern pattern0 = zzalv.zza;
            Matcher matcher0 = pattern0.matcher(s);
            if(matcher0.matches()) {
                return zzalv.zze(null, matcher0, zzdy0, list0);
            }
            String s1 = zzdy0.zzz(charset0);
            if(s1 != null) {
                Matcher matcher1 = pattern0.matcher(s1);
                return matcher1.matches() ? zzalv.zze(s.trim(), matcher1, zzdy0, list0) : null;
            }
        }
        return null;
    }

    private static int zzd(List list0, @Nullable String s, zzalr zzalr0) {
        List list1 = zzalv.zzf(list0, s, zzalr0);
        for(int v = 0; v < list1.size(); ++v) {
            zzaln zzaln0 = ((zzals)list1.get(v)).zzb;
            if(zzaln0.zze() != -1) {
                return zzaln0.zze();
            }
        }
        return -1;
    }

    @Nullable
    private static zzalo zze(@Nullable String s, Matcher matcher0, zzdy zzdy0, List list0) {
        zzalt zzalt0 = new zzalt();
        try {
            String s1 = matcher0.group(1);
            if(s1 == null) {
                throw null;
            }
            zzalt0.zza = zzalx.zzb(s1);
            String s2 = matcher0.group(2);
            if(s2 == null) {
                throw null;
            }
            zzalt0.zzb = zzalx.zzb(s2);
        }
        catch(NumberFormatException unused_ex) {
            zzdo.zzf("WebvttCueParser", "Skipping cue with bad header: " + matcher0.group());
            return null;
        }
        String s3 = matcher0.group(3);
        s3.getClass();
        zzalv.zzh(s3, zzalt0);
        StringBuilder stringBuilder0 = new StringBuilder();
        for(String s4 = zzdy0.zzz(StandardCharsets.UTF_8); !TextUtils.isEmpty(s4); s4 = zzdy0.zzz(StandardCharsets.UTF_8)) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append("\n");
            }
            stringBuilder0.append(s4.trim());
        }
        zzalt0.zzc = zzalv.zza(s, stringBuilder0.toString(), list0);
        return new zzalo(zzalt0.zza().zzp(), zzalt0.zza, zzalt0.zzb);
    }

    private static List zzf(List list0, @Nullable String s, zzalr zzalr0) {
        List list1 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            zzaln zzaln0 = (zzaln)list0.get(v);
            int v1 = zzaln0.zzf(s, zzalr0.zza, zzalr0.zzd, zzalr0.zzc);
            if(v1 > 0) {
                list1.add(new zzals(v1, zzaln0));
            }
        }
        Collections.sort(list1);
        return list1;
    }

    private static void zzg(@Nullable String s, zzalr zzalr0, List list0, SpannableStringBuilder spannableStringBuilder0, List list1) {
        int v = zzalr0.zzb;
        int v1 = spannableStringBuilder0.length();
    alab1:
        switch(zzalr0.zza) {
            case "": {
                break;
            }
            case "b": {
                spannableStringBuilder0.setSpan(new StyleSpan(1), v, v1, 33);
                break;
            }
            case "c": {
                for(Object object0: zzalr0.zzd) {
                    String s1 = (String)object0;
                    Map map0 = zzalv.zzc;
                    if(map0.containsKey(s1)) {
                        spannableStringBuilder0.setSpan(new ForegroundColorSpan(((int)(((Integer)map0.get(s1))))), v, v1, 33);
                    }
                    else {
                        Map map1 = zzalv.zzd;
                        if(map1.containsKey(s1)) {
                            spannableStringBuilder0.setSpan(new BackgroundColorSpan(((int)(((Integer)map1.get(s1))))), v, v1, 33);
                        }
                    }
                }
                break;
            }
            case "i": {
                spannableStringBuilder0.setSpan(new StyleSpan(2), v, v1, 33);
                break;
            }
            case "lang": {
                break;
            }
            case "ruby": {
                int v2 = zzalv.zzd(list1, s, zzalr0);
                ArrayList arrayList0 = new ArrayList(list0.size());
                arrayList0.addAll(list0);
                Collections.sort(arrayList0, zzalq.zza);
                int v3 = zzalr0.zzb;
                int v5 = 0;
                for(int v4 = 0; true; ++v4) {
                    if(v4 >= arrayList0.size()) {
                        break alab1;
                    }
                    if("rt".equals(((zzalq)arrayList0.get(v4)).zzb.zza)) {
                        zzalq zzalq0 = (zzalq)arrayList0.get(v4);
                        int v6 = zzalv.zzd(list1, s, zzalq0.zzb);
                        if(v6 == -1) {
                            v6 = v2 == -1 ? 1 : v2;
                        }
                        int v7 = zzalq0.zzb.zzb - v5;
                        int v8 = zzalq0.zzc - v5;
                        CharSequence charSequence0 = spannableStringBuilder0.subSequence(v7, v8);
                        spannableStringBuilder0.delete(v7, v8);
                        spannableStringBuilder0.setSpan(new zzcs(charSequence0.toString(), v6), v3, v7, 33);
                        v5 += charSequence0.length();
                        v3 = v7;
                    }
                }
            }
            case "u": {
                spannableStringBuilder0.setSpan(new UnderlineSpan(), v, v1, 33);
                break;
            }
            case "v": {
                spannableStringBuilder0.setSpan(new zzcv(zzalr0.zzc), v, v1, 33);
                break;
            }
            default: {
                return;
            }
        }
        List list2 = zzalv.zzf(list1, s, zzalr0);
        for(int v9 = 0; v9 < list2.size(); ++v9) {
            zzaln zzaln0 = ((zzals)list2.get(v9)).zzb;
            if(zzaln0 != null) {
                if(zzaln0.zzg() != -1) {
                    zzct.zzb(spannableStringBuilder0, new StyleSpan(zzaln0.zzg()), v, v1, 33);
                }
                if(zzaln0.zzz()) {
                    spannableStringBuilder0.setSpan(new UnderlineSpan(), v, v1, 33);
                }
                if(zzaln0.zzy()) {
                    zzct.zzb(spannableStringBuilder0, new ForegroundColorSpan(zzaln0.zzc()), v, v1, 33);
                }
                if(zzaln0.zzx()) {
                    zzct.zzb(spannableStringBuilder0, new BackgroundColorSpan(zzaln0.zzb()), v, v1, 33);
                }
                if(zzaln0.zzr() != null) {
                    zzct.zzb(spannableStringBuilder0, new TypefaceSpan(zzaln0.zzr()), v, v1, 33);
                }
                int v10 = zzaln0.zzd();
                switch(v10) {
                    case 1: {
                        zzct.zzb(spannableStringBuilder0, new AbsoluteSizeSpan(((int)zzaln0.zza()), true), v, v1, 33);
                        break;
                    }
                    case 2: {
                        zzct.zzb(spannableStringBuilder0, new RelativeSizeSpan(zzaln0.zza()), v, v1, 33);
                        break;
                    }
                    default: {
                        if(v10 == 3) {
                            zzct.zzb(spannableStringBuilder0, new RelativeSizeSpan(zzaln0.zza() / 100.0f), v, v1, 33);
                        }
                    }
                }
                if(zzaln0.zzw()) {
                    spannableStringBuilder0.setSpan(new zzcr(), v, v1, 33);
                }
            }
        }
    }

    private static void zzh(String s, zzalt zzalt0) {
        Matcher matcher0 = zzalv.zzb.matcher(s);
        while(matcher0.find()) {
            int v = -1;
            int v1 = 1;
            String s1 = matcher0.group(1);
            s1.getClass();
            int v2 = 2;
            String s2 = matcher0.group(2);
            s2.getClass();
            try {
                if("line".equals(s1)) {
                    int v3 = s2.indexOf(44);
                    if(v3 != -1) {
                        String s3 = s2.substring(v3 + 1);
                        switch(s3) {
                            case "center": 
                            case "middle": {
                                v2 = 1;
                                break;
                            }
                            case "end": {
                                v = 3;
                            label_18:
                                if(v != 3) {
                                    zzdo.zzf("WebvttCueParser", "Invalid anchor value: " + s3);
                                    v2 = 0x80000000;
                                }
                                break;
                            }
                            case "start": {
                                v2 = 0;
                                break;
                            }
                            default: {
                                goto label_18;
                            }
                        }
                        zzalt0.zzg = v2;
                        s2 = s2.substring(0, v3);
                    }
                    if(s2.endsWith("%")) {
                        zzalt0.zze = zzalx.zza(s2);
                        zzalt0.zzf = 0;
                    }
                    else {
                        zzalt0.zze = (float)Integer.parseInt(s2);
                        zzalt0.zzf = 1;
                    }
                    continue;
                }
                if(!"align".equals(s1)) {
                    if("position".equals(s1)) {
                        int v4 = s2.indexOf(44);
                        if(v4 != -1) {
                            String s4 = s2.substring(v4 + 1);
                            switch(s4) {
                                case "center": {
                                    break;
                                }
                                case "end": {
                                    v = 5;
                                label_66:
                                    if(v != 3) {
                                        if(v == 4 || v == 5) {
                                            v1 = 2;
                                        }
                                        else {
                                            zzdo.zzf("WebvttCueParser", "Invalid anchor value: " + s4);
                                            v1 = 0x80000000;
                                        }
                                    }
                                    break;
                                }
                                case "line-left": {
                                    v1 = 0;
                                    break;
                                }
                                case "line-right": {
                                    v = 4;
                                    goto label_66;
                                }
                                case "middle": {
                                    v = 3;
                                    goto label_66;
                                }
                                case "start": {
                                    v1 = 0;
                                    break;
                                }
                                default: {
                                    goto label_66;
                                }
                            }
                            zzalt0.zzi = v1;
                            s2 = s2.substring(0, v4);
                        }
                        zzalt0.zzh = zzalx.zza(s2);
                    }
                    else if("size".equals(s1)) {
                        zzalt0.zzj = zzalx.zza(s2);
                    }
                    else if("vertical".equals(s1)) {
                        switch(s2) {
                            case "lr": {
                                v = 1;
                                break;
                            }
                            case "rl": {
                                v = 0;
                            }
                        }
                        if(v != 0) {
                            if(v == 1) {
                                v1 = 2;
                            }
                            else {
                                zzdo.zzf("WebvttCueParser", "Invalid \'vertical\' value: " + s2);
                                v1 = 0x80000000;
                            }
                        }
                        zzalt0.zzk = v1;
                    }
                    else {
                        zzdo.zzf("WebvttCueParser", "Unknown cue setting " + s1 + ":" + s2);
                    }
                    continue;
                }
            alab1:
                switch(s2) {
                    case "center": {
                        v1 = 2;
                        break;
                    }
                    case "end": {
                        v = 4;
                        goto label_88;
                    }
                    case "left": {
                        v1 = 4;
                        break;
                    }
                    case "middle": {
                        v = 3;
                        goto label_88;
                    }
                    case "right": {
                        v = 5;
                    label_88:
                        if(v != 3) {
                            switch(v) {
                                case 4: {
                                    v1 = 3;
                                    break alab1;
                                }
                                case 5: {
                                    v1 = 5;
                                    break alab1;
                                }
                                default: {
                                    zzdo.zzf("WebvttCueParser", "Invalid alignment value: " + s2);
                                }
                            }
                        }
                        v1 = 2;
                        break;
                    }
                    case "start": {
                        break;
                    }
                    default: {
                        goto label_88;
                    }
                }
                zzalt0.zzd = v1;
            }
            catch(NumberFormatException unused_ex) {
                zzdo.zzf("WebvttCueParser", "Skipping bad cue setting: " + matcher0.group());
            }
        }
    }
}

