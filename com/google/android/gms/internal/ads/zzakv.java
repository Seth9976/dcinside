package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzakv implements zzakf {
    private static final Pattern zza;
    private final boolean zzb;
    @Nullable
    private final zzaku zzc;
    private final zzdy zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    static {
        zzakv.zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    }

    public zzakv() {
        this(null);
    }

    public zzakv(@Nullable List list0) {
        this.zzf = -3.402823E+38f;
        this.zzg = -3.402823E+38f;
        this.zzd = new zzdy();
        if(list0 != null && !list0.isEmpty()) {
            this.zzb = true;
            String s = zzei.zzB(((byte[])list0.get(0)));
            zzcw.zzd(s.startsWith("Format:"));
            zzaku zzaku0 = zzaku.zza(s);
            zzaku0.getClass();
            this.zzc = zzaku0;
            this.zze(new zzdy(((byte[])list0.get(1))), StandardCharsets.UTF_8);
            return;
        }
        this.zzb = false;
        this.zzc = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        int v8;
        int v7;
        Layout.Alignment layout$Alignment0;
        long v5;
        zzaku zzaku1;
        zzdy zzdy1;
        Charset charset1;
        zzaky zzaky0;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        this.zzd.zzJ(arr_b, v + v1);
        this.zzd.zzL(v);
        Charset charset0 = this.zzd.zzC();
        if(charset0 == null) {
            charset0 = StandardCharsets.UTF_8;
        }
        if(!this.zzb) {
            this.zze(this.zzd, charset0);
        }
        zzdy zzdy0 = this.zzd;
        zzaku zzaku0 = this.zzb ? this.zzc : null;
        String s;
        while((s = zzdy0.zzz(charset0)) != null) {
            if(s.startsWith("Format:")) {
                zzaku0 = zzaku.zza(s);
            }
            else {
                if(s.startsWith("Dialogue:")) {
                    if(zzaku0 == null) {
                        zzdo.zzf("SsaParser", "Skipping dialogue line before complete format: " + s);
                    }
                    else {
                        zzcw.zzd(s.startsWith("Dialogue:"));
                        String[] arr_s = s.substring(9).split(",", zzaku0.zze);
                        if(arr_s.length == zzaku0.zze) {
                            long v2 = zzakv.zzd(arr_s[zzaku0.zza]);
                            if(v2 == 0x8000000000000001L) {
                                zzdo.zzf("SsaParser", "Skipping invalid timing: " + s);
                            }
                            else {
                                long v3 = zzakv.zzd(arr_s[zzaku0.zzb]);
                                if(v3 == 0x8000000000000001L) {
                                    zzdo.zzf("SsaParser", "Skipping invalid timing: " + s);
                                }
                                else {
                                    Map map0 = this.zze;
                                    if(map0 == null) {
                                        zzaky0 = null;
                                    }
                                    else {
                                        int v4 = zzaku0.zzc;
                                        if(v4 != -1) {
                                            zzaky0 = (zzaky)map0.get(arr_s[v4].trim());
                                        }
                                    }
                                    String s1 = arr_s[zzaku0.zzd];
                                    zzakx zzakx0 = zzakx.zza(s1);
                                    String s2 = zzakx.zzb(s1).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = this.zzf;
                                    float f1 = this.zzg;
                                    SpannableString spannableString0 = new SpannableString(s2);
                                    zzcm zzcm0 = new zzcm();
                                    zzcm0.zzl(spannableString0);
                                    charset1 = charset0;
                                    if(zzaky0 == null) {
                                        zzdy1 = zzdy0;
                                        zzaku1 = zzaku0;
                                        v5 = v3;
                                    }
                                    else {
                                        Integer integer0 = zzaky0.zzc;
                                        zzdy1 = zzdy0;
                                        if(integer0 == null) {
                                            zzaku1 = zzaku0;
                                            v5 = v3;
                                        }
                                        else {
                                            zzaku1 = zzaku0;
                                            v5 = v3;
                                            spannableString0.setSpan(new ForegroundColorSpan(((int)integer0)), 0, spannableString0.length(), 33);
                                        }
                                        if(zzaky0.zzj == 3) {
                                            Integer integer1 = zzaky0.zzd;
                                            if(integer1 != null) {
                                                spannableString0.setSpan(new BackgroundColorSpan(((int)integer1)), 0, spannableString0.length(), 33);
                                            }
                                        }
                                        float f2 = zzaky0.zze;
                                        if(f2 != -3.402823E+38f && f1 != -3.402823E+38f) {
                                            zzcm0.zzn(f2 / f1, 1);
                                        }
                                        if(zzaky0.zzf) {
                                            if(zzaky0.zzg) {
                                                spannableString0.setSpan(new StyleSpan(3), 0, spannableString0.length(), 33);
                                            }
                                            else {
                                                spannableString0.setSpan(new StyleSpan(1), 0, spannableString0.length(), 33);
                                            }
                                        }
                                        else if(zzaky0.zzg) {
                                            spannableString0.setSpan(new StyleSpan(2), 0, spannableString0.length(), 33);
                                        }
                                        if(zzaky0.zzh) {
                                            spannableString0.setSpan(new UnderlineSpan(), 0, spannableString0.length(), 33);
                                        }
                                        if(zzaky0.zzi) {
                                            spannableString0.setSpan(new StrikethroughSpan(), 0, spannableString0.length(), 33);
                                        }
                                    }
                                    int v6 = zzakx0.zza;
                                    if(v6 == -1) {
                                        v6 = zzaky0 == null ? -1 : zzaky0.zzb;
                                    }
                                    switch(v6) {
                                        case -1: {
                                            layout$Alignment0 = null;
                                            break;
                                        }
                                        case 1: 
                                        case 4: 
                                        case 7: {
                                            layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        }
                                        case 2: 
                                        case 5: 
                                        case 8: {
                                            layout$Alignment0 = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        }
                                        case 3: 
                                        case 6: 
                                        case 9: {
                                            layout$Alignment0 = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                        }
                                        default: {
                                            zzdo.zzf("SsaParser", "Unknown alignment: " + v6);
                                            layout$Alignment0 = null;
                                        }
                                    }
                                    zzcm0.zzm(layout$Alignment0);
                                    switch(v6) {
                                        case -1: {
                                            v7 = 0x80000000;
                                            break;
                                        }
                                        case 1: 
                                        case 4: 
                                        case 7: {
                                            v7 = 0;
                                            break;
                                        }
                                        case 2: 
                                        case 5: 
                                        case 8: {
                                            v7 = 1;
                                            break;
                                        }
                                        case 3: 
                                        case 6: 
                                        case 9: {
                                            v7 = 2;
                                            break;
                                        }
                                        default: {
                                            zzdo.zzf("SsaParser", "Unknown alignment: " + v6);
                                            v7 = 0x80000000;
                                        }
                                    }
                                    zzcm0.zzi(v7);
                                    switch(v6) {
                                        case -1: {
                                            v8 = 0x80000000;
                                            break;
                                        }
                                        case 1: 
                                        case 2: 
                                        case 3: {
                                            v8 = 2;
                                            break;
                                        }
                                        case 4: 
                                        case 5: 
                                        case 6: {
                                            v8 = 1;
                                            break;
                                        }
                                        case 7: 
                                        case 8: 
                                        case 9: {
                                            v8 = 0;
                                            break;
                                        }
                                        default: {
                                            zzdo.zzf("SsaParser", "Unknown alignment: " + v6);
                                            v8 = 0x80000000;
                                        }
                                    }
                                    zzcm0.zzf(v8);
                                    PointF pointF0 = zzakx0.zzb;
                                    if(pointF0 == null || f1 == -3.402823E+38f || f == -3.402823E+38f) {
                                        zzcm0.zzh(zzakv.zzb(zzcm0.zzb()));
                                        zzcm0.zze(zzakv.zzb(zzcm0.zza()), 0);
                                    }
                                    else {
                                        zzcm0.zzh(pointF0.x / f);
                                        zzcm0.zze(zzakx0.zzb.y / f1, 0);
                                    }
                                    zzco zzco0 = zzcm0.zzp();
                                    int v9 = zzakv.zzc(v2, arrayList1, arrayList0);
                                    int v10 = zzakv.zzc(v5, arrayList1, arrayList0);
                                    while(v9 < v10) {
                                        ((List)arrayList0.get(v9)).add(zzco0);
                                        ++v9;
                                    }
                                    goto label_139;
                                }
                            }
                        }
                        else {
                            zzdo.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: " + s);
                        }
                    }
                }
                charset1 = charset0;
                zzdy1 = zzdy0;
                zzaku1 = zzaku0;
            label_139:
                charset0 = charset1;
                zzdy0 = zzdy1;
                zzaku0 = zzaku1;
            }
        }
        int v11 = 0;
        while(v11 < arrayList0.size()) {
            List list0 = (List)arrayList0.get(v11);
            if(!list0.isEmpty()) {
            label_149:
                if(v11 == arrayList0.size() - 1) {
                    throw new IllegalStateException();
                }
                zzdb0.zza(new zzajx(list0, ((long)(((Long)arrayList1.get(v11)))), ((long)(((Long)arrayList1.get(v11 + 1)))) - ((long)(((Long)arrayList1.get(v11))))));
            }
            else if(v11 == 0) {
                v11 = 0;
                goto label_149;
            }
            ++v11;
        }
    }

    private static float zzb(int v) {
        switch(v) {
            case 0: {
                return 0.05f;
            }
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 0.95f;
            }
            default: {
                return -3.402823E+38f;
            }
        }
    }

    private static int zzc(long v, List list0, List list1) {
        int v1 = 0;
        int v2 = list0.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            if(((long)(((Long)list0.get(v2)))) == v) {
                return v2;
            }
            if(((long)(((Long)list0.get(v2)))) < v) {
                v1 = v2 + 1;
                break;
            }
        }
        list0.add(v1, v);
        list1.add(v1, (v1 == 0 ? new ArrayList() : new ArrayList(((Collection)list1.get(v1 - 1)))));
        return v1;
    }

    private static long zzd(String s) {
        Matcher matcher0 = zzakv.zza.matcher(s.trim());
        return matcher0.matches() ? Long.parseLong(matcher0.group(1)) * 3600000000L + Long.parseLong(matcher0.group(2)) * 60000000L + Long.parseLong(matcher0.group(3)) * 1000000L + Long.parseLong(matcher0.group(4)) * 10000L : 0x8000000000000001L;
    }

    private final void zze(zzdy zzdy0, Charset charset0) {
        String s1;
    alab1:
        while(true) {
            do {
            label_0:
                String s = zzdy0.zzz(charset0);
                if(s == null) {
                    break alab1;
                }
                if(!"[Script Info]".equalsIgnoreCase(s)) {
                    goto label_16;
                }
            label_3:
                s1 = zzdy0.zzz(charset0);
            }
            while(s1 == null || zzdy0.zzb() != 0 && zzdy0.zza(charset0) == 91);
            String[] arr_s = s1.split(":");
            if(arr_s.length != 2) {
                goto label_3;
            }
            switch(zzftt.zza(arr_s[0].trim())) {
                case "playresx": {
                    try {
                        this.zzf = Float.parseFloat(arr_s[1].trim());
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    goto label_3;
                }
                case "playresy": {
                    this.zzg = Float.parseFloat(arr_s[1].trim());
                    goto label_3;
                }
                default: {
                    goto label_3;
                }
            }
        label_16:
            if("[V4+ Styles]".equalsIgnoreCase(s)) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                zzakw zzakw0 = null;
                while(true) {
                    String s2 = zzdy0.zzz(charset0);
                    if(s2 == null || zzdy0.zzb() != 0 && zzdy0.zza(charset0) == 91) {
                        break;
                    }
                    if(s2.startsWith("Format:")) {
                        zzakw0 = zzakw.zza(s2);
                    }
                    else if(!s2.startsWith("Style:")) {
                    }
                    else if(zzakw0 == null) {
                        zzdo.zzf("SsaParser", "Skipping \'Style:\' line before \'Format:\' line: " + s2);
                    }
                    else {
                        zzaky zzaky0 = zzaky.zzb(s2, zzakw0);
                        if(zzaky0 != null) {
                            linkedHashMap0.put(zzaky0.zza, zzaky0);
                        }
                    }
                }
                this.zze = linkedHashMap0;
                goto label_0;
            }
            if("[V4 Styles]".equalsIgnoreCase(s)) {
                zzdo.zze("SsaParser", "[V4 Styles] are not supported");
                goto label_0;
            }
            if(!"[Events]".equalsIgnoreCase(s)) {
                goto label_0;
            }
            break;
        }
    }
}

