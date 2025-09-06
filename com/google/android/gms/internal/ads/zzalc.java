package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class zzalc {
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    @Nullable
    public final zzali zzf;
    public final String zzg;
    @Nullable
    public final String zzh;
    @Nullable
    public final zzalc zzi;
    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalc(@Nullable String s, @Nullable String s1, long v, long v1, @Nullable zzali zzali0, @Nullable String[] arr_s, String s2, @Nullable String s3, @Nullable zzalc zzalc0) {
        this.zza = s;
        this.zzb = s1;
        this.zzh = s3;
        this.zzf = zzali0;
        this.zzj = arr_s;
        this.zzc = s1 != null;
        this.zzd = v;
        this.zze = v1;
        s2.getClass();
        this.zzg = s2;
        this.zzi = zzalc0;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public final int zza() {
        return this.zzm == null ? 0 : this.zzm.size();
    }

    public static zzalc zzb(@Nullable String s, long v, long v1, @Nullable zzali zzali0, @Nullable String[] arr_s, String s1, @Nullable String s2, @Nullable zzalc zzalc0) {
        return new zzalc(s, null, v, v1, zzali0, arr_s, s1, s2, zzalc0);
    }

    public static zzalc zzc(String s) {
        return new zzalc(null, s.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), 0x8000000000000001L, 0x8000000000000001L, null, null, "", null, null);
    }

    public final zzalc zzd(int v) {
        List list0 = this.zzm;
        if(list0 == null) {
            throw new IndexOutOfBoundsException();
        }
        return (zzalc)list0.get(v);
    }

    public final List zze(long v, Map map0, Map map1, Map map2) {
        ArrayList arrayList0 = new ArrayList();
        this.zzk(v, this.zzg, arrayList0);
        TreeMap treeMap0 = new TreeMap();
        this.zzm(v, false, this.zzg, treeMap0);
        this.zzl(v, map0, map1, this.zzg, treeMap0);
        List list0 = new ArrayList();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Pair pair0 = (Pair)arrayList0.get(v2);
            String s = (String)map2.get(pair0.second);
            if(s != null) {
                byte[] arr_b = Base64.decode(s, 0);
                Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                zzalg zzalg0 = (zzalg)map1.get(pair0.first);
                zzalg0.getClass();
                zzcm zzcm0 = new zzcm();
                zzcm0.zzc(bitmap0);
                zzcm0.zzh(zzalg0.zzb);
                zzcm0.zzi(0);
                zzcm0.zze(zzalg0.zzc, 0);
                zzcm0.zzf(zzalg0.zze);
                zzcm0.zzk(zzalg0.zzf);
                zzcm0.zzd(zzalg0.zzg);
                zzcm0.zzo(zzalg0.zzj);
                list0.add(zzcm0.zzp());
            }
        }
        for(Object object0: treeMap0.entrySet()) {
            zzalg zzalg1 = (zzalg)map1.get(((Map.Entry)object0).getKey());
            zzalg1.getClass();
            zzcm zzcm1 = (zzcm)((Map.Entry)object0).getValue();
            CharSequence charSequence0 = zzcm1.zzq();
            charSequence0.getClass();
            SpannableStringBuilder spannableStringBuilder0 = (SpannableStringBuilder)charSequence0;
            zzala[] arr_zzala = (zzala[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), zzala.class);
            for(int v3 = 0; v3 < arr_zzala.length; ++v3) {
                zzala zzala0 = arr_zzala[v3];
                spannableStringBuilder0.replace(spannableStringBuilder0.getSpanStart(zzala0), spannableStringBuilder0.getSpanEnd(zzala0), "");
            }
            for(int v4 = 0; v4 < spannableStringBuilder0.length(); ++v4) {
                if(spannableStringBuilder0.charAt(v4) == 0x20) {
                    int v5;
                    for(v5 = v4 + 1; v5 < spannableStringBuilder0.length() && spannableStringBuilder0.charAt(v5) == 0x20; ++v5) {
                    }
                    int v6 = v5 - (v4 + 1);
                    if(v6 > 0) {
                        spannableStringBuilder0.delete(v4, v6 + v4);
                    }
                }
            }
            if(spannableStringBuilder0.length() > 0 && spannableStringBuilder0.charAt(0) == 0x20) {
                spannableStringBuilder0.delete(0, 1);
            }
            for(int v7 = 0; v7 < spannableStringBuilder0.length() - 1; ++v7) {
                if(spannableStringBuilder0.charAt(v7) == 10 && spannableStringBuilder0.charAt(v7 + 1) == 0x20) {
                    spannableStringBuilder0.delete(v7 + 1, v7 + 2);
                }
            }
            if(spannableStringBuilder0.length() > 0 && spannableStringBuilder0.charAt(spannableStringBuilder0.length() - 1) == 0x20) {
                spannableStringBuilder0.delete(spannableStringBuilder0.length() - 1, spannableStringBuilder0.length());
            }
            for(int v8 = 0; v8 < spannableStringBuilder0.length() - 1; ++v8) {
                if(spannableStringBuilder0.charAt(v8) == 0x20 && spannableStringBuilder0.charAt(v8 + 1) == 10) {
                    spannableStringBuilder0.delete(v8, v8 + 1);
                }
            }
            if(spannableStringBuilder0.length() > 0 && spannableStringBuilder0.charAt(spannableStringBuilder0.length() - 1) == 10) {
                spannableStringBuilder0.delete(spannableStringBuilder0.length() - 1, spannableStringBuilder0.length());
            }
            zzcm1.zze(zzalg1.zzc, zzalg1.zzd);
            zzcm1.zzf(zzalg1.zze);
            zzcm1.zzh(zzalg1.zzb);
            zzcm1.zzk(zzalg1.zzf);
            zzcm1.zzn(zzalg1.zzi, zzalg1.zzh);
            zzcm1.zzo(zzalg1.zzj);
            list0.add(zzcm1.zzp());
        }
        return list0;
    }

    public final void zzf(zzalc zzalc0) {
        if(this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalc0);
    }

    public final boolean zzg(long v) {
        long v1 = this.zzd;
        if(v1 == 0x8000000000000001L) {
            if(this.zze != 0x8000000000000001L) {
                v1 = 0x8000000000000001L;
                goto label_6;
            }
            return true;
        }
    label_6:
        int v2 = Long.compare(v1, v);
        return v2 <= 0 && this.zze == 0x8000000000000001L || v1 == 0x8000000000000001L && v < this.zze || v2 <= 0 && v < this.zze;
    }

    public final long[] zzh() {
        TreeSet treeSet0 = new TreeSet();
        int v = 0;
        this.zzj(treeSet0, false);
        long[] arr_v = new long[treeSet0.size()];
        for(Object object0: treeSet0) {
            arr_v[v] = (long)(((Long)object0));
            ++v;
        }
        return arr_v;
    }

    private static SpannableStringBuilder zzi(String s, Map map0) {
        if(!map0.containsKey(s)) {
            zzcm zzcm0 = new zzcm();
            zzcm0.zzl(new SpannableStringBuilder());
            map0.put(s, zzcm0);
        }
        CharSequence charSequence0 = ((zzcm)map0.get(s)).zzq();
        charSequence0.getClass();
        return (SpannableStringBuilder)charSequence0;
    }

    private final void zzj(TreeSet treeSet0, boolean z) {
        boolean z1 = "p".equals(this.zza);
        if(z || z1 || "div".equals(this.zza) && this.zzh != null) {
            long v = this.zzd;
            if(v != 0x8000000000000001L) {
                treeSet0.add(v);
            }
            long v1 = this.zze;
            if(v1 != 0x8000000000000001L) {
                treeSet0.add(v1);
            }
        }
        if(this.zzm != null) {
            for(int v2 = 0; v2 < this.zzm.size(); ++v2) {
                ((zzalc)this.zzm.get(v2)).zzj(treeSet0, z || z1);
            }
        }
    }

    private final void zzk(long v, String s, List list0) {
        if(!"".equals(this.zzg)) {
            s = this.zzg;
        }
        if(this.zzg(v) && "div".equals(this.zza)) {
            String s1 = this.zzh;
            if(s1 != null) {
                list0.add(new Pair(s, s1));
                return;
            }
        }
        for(int v1 = 0; v1 < this.zza(); ++v1) {
            this.zzd(v1).zzk(v, s, list0);
        }
    }

    private final void zzl(long v, Map map0, Map map1, String s, Map map2) {
        zzalc zzalc1;
        int v5;
        Iterator iterator1;
        if(this.zzg(v)) {
            String s1 = "".equals(this.zzg) ? s : this.zzg;
            Iterator iterator0 = this.zzl.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s2 = (String)((Map.Entry)object0).getKey();
                int v1 = this.zzk.containsKey(s2) ? ((int)(((Integer)this.zzk.get(s2)))) : 0;
                int v2 = (int)(((Integer)((Map.Entry)object0).getValue()));
                if(v1 != v2) {
                    zzcm zzcm0 = (zzcm)map2.get(s2);
                    zzcm0.getClass();
                    zzalg zzalg0 = (zzalg)map1.get(s1);
                    zzalg0.getClass();
                    int v3 = zzalg0.zzj;
                    zzali zzali0 = zzalh.zza(this.zzf, this.zzj, map0);
                    SpannableStringBuilder spannableStringBuilder0 = (SpannableStringBuilder)zzcm0.zzq();
                    if(spannableStringBuilder0 == null) {
                        spannableStringBuilder0 = new SpannableStringBuilder();
                        zzcm0.zzl(spannableStringBuilder0);
                    }
                    if(zzali0 != null) {
                        zzalc zzalc0 = this.zzi;
                        if(zzali0.zzh() != -1) {
                            spannableStringBuilder0.setSpan(new StyleSpan(zzali0.zzh()), v1, v2, 33);
                        }
                        if(zzali0.zzI()) {
                            spannableStringBuilder0.setSpan(new StrikethroughSpan(), v1, v2, 33);
                        }
                        if(zzali0.zzJ()) {
                            spannableStringBuilder0.setSpan(new UnderlineSpan(), v1, v2, 33);
                        }
                        if(zzali0.zzH()) {
                            zzct.zzb(spannableStringBuilder0, new ForegroundColorSpan(zzali0.zzd()), v1, v2, 33);
                        }
                        if(zzali0.zzG()) {
                            zzct.zzb(spannableStringBuilder0, new BackgroundColorSpan(zzali0.zzc()), v1, v2, 33);
                        }
                        if(zzali0.zzD() != null) {
                            zzct.zzb(spannableStringBuilder0, new TypefaceSpan(zzali0.zzD()), v1, v2, 33);
                        }
                        if(zzali0.zzk() == null) {
                            iterator1 = iterator0;
                        }
                        else {
                            zzalb zzalb0 = zzali0.zzk();
                            zzalb0.getClass();
                            int v4 = zzalb0.zza;
                            iterator1 = iterator0;
                            if(v4 == -1) {
                                v4 = v3 != 1 && v3 != 2 ? 1 : 3;
                                v5 = 1;
                            }
                            else {
                                v5 = zzalb0.zzb;
                            }
                            zzct.zzb(spannableStringBuilder0, new zzcu(v4, v5, (zzalb0.zzc == -2 ? 1 : zzalb0.zzc)), v1, v2, 33);
                        }
                        switch(zzali0.zzg()) {
                            case 2: {
                                while(true) {
                                    if(zzalc0 != null) {
                                        zzali zzali1 = zzalh.zza(zzalc0.zzf, zzalc0.zzj, map0);
                                        if(zzali1 != null && zzali1.zzg() == 1) {
                                            break;
                                        }
                                        else {
                                            zzalc0 = zzalc0.zzi;
                                            continue;
                                        }
                                    }
                                    zzalc0 = null;
                                    break;
                                }
                                if(zzalc0 != null) {
                                    ArrayDeque arrayDeque0 = new ArrayDeque();
                                    arrayDeque0.push(zzalc0);
                                    while(true) {
                                        zzalc1 = null;
                                        if(!arrayDeque0.isEmpty()) {
                                            zzalc zzalc2 = (zzalc)arrayDeque0.pop();
                                            zzali zzali2 = zzalh.zza(zzalc2.zzf, zzalc2.zzj, map0);
                                            if(zzali2 == null || zzali2.zzg() != 3) {
                                                for(int v6 = zzalc2.zza() - 1; v6 >= 0; --v6) {
                                                    arrayDeque0.push(zzalc2.zzd(v6));
                                                }
                                                continue;
                                            }
                                            else {
                                                zzalc1 = zzalc2;
                                            }
                                        }
                                        break;
                                    }
                                    if(zzalc1 != null) {
                                        if(zzalc1.zza() != 1 || zzalc1.zzd(0).zzb == null) {
                                            zzdo.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                        }
                                        else {
                                            String s3 = zzalc1.zzd(0).zzb;
                                            zzali zzali3 = zzalh.zza(zzalc1.zzf, zzalc1.zzj, map0);
                                            int v7 = zzali3 == null ? -1 : zzali3.zzf();
                                            if(v7 == -1) {
                                                zzali zzali4 = zzalh.zza(zzalc0.zzf, zzalc0.zzj, map0);
                                                if(zzali4 != null) {
                                                    v7 = zzali4.zzf();
                                                }
                                            }
                                            spannableStringBuilder0.setSpan(new zzcs(s3, v7), v1, v2, 33);
                                        }
                                    }
                                }
                                break;
                            }
                            case 3: 
                            case 4: {
                                spannableStringBuilder0.setSpan(new zzala(), v1, v2, 33);
                            }
                        }
                        if(zzali0.zzF()) {
                            zzct.zzb(spannableStringBuilder0, new zzcr(), v1, v2, 33);
                        }
                        int v8 = zzali0.zze();
                        switch(v8) {
                            case 1: {
                                zzct.zzb(spannableStringBuilder0, new AbsoluteSizeSpan(((int)zzali0.zza()), true), v1, v2, 33);
                                break;
                            }
                            case 2: {
                                zzct.zzb(spannableStringBuilder0, new RelativeSizeSpan(zzali0.zza()), v1, v2, 33);
                                break;
                            }
                            default: {
                                if(v8 == 3) {
                                    zzct.zza(spannableStringBuilder0, zzali0.zza() / 100.0f, v1, v2, 33);
                                }
                            }
                        }
                        if("p".equals(this.zza)) {
                            if(zzali0.zzb() != 3.402823E+38f) {
                                zzcm0.zzj(zzali0.zzb() * -90.0f / 100.0f);
                            }
                            if(zzali0.zzj() != null) {
                                zzcm0.zzm(zzali0.zzj());
                            }
                            if(zzali0.zzi() != null) {
                                zzcm0.zzg(zzali0.zzi());
                            }
                        }
                        iterator0 = iterator1;
                    }
                }
            }
            for(int v9 = 0; v9 < this.zza(); ++v9) {
                this.zzd(v9).zzl(v, map0, map1, s1, map2);
            }
        }
    }

    private final void zzm(long v, boolean z, String s, Map map0) {
        this.zzk.clear();
        this.zzl.clear();
        if(!"metadata".equals(this.zza)) {
            if(!"".equals(this.zzg)) {
                s = this.zzg;
            }
            if(this.zzc && z) {
                SpannableStringBuilder spannableStringBuilder0 = zzalc.zzi(s, map0);
                this.zzb.getClass();
                spannableStringBuilder0.append(this.zzb);
                return;
            }
            if("br".equals(this.zza) && z) {
                zzalc.zzi(s, map0).append('\n');
                return;
            }
            if(this.zzg(v)) {
                for(Object object0: map0.entrySet()) {
                    String s1 = (String)((Map.Entry)object0).getKey();
                    CharSequence charSequence0 = ((zzcm)((Map.Entry)object0).getValue()).zzq();
                    charSequence0.getClass();
                    Integer integer0 = charSequence0.length();
                    this.zzk.put(s1, integer0);
                }
                boolean z1 = "p".equals(this.zza);
                for(int v1 = 0; v1 < this.zza(); ++v1) {
                    this.zzd(v1).zzm(v, z || z1, s, map0);
                }
                if(z1) {
                    SpannableStringBuilder spannableStringBuilder1 = zzalc.zzi(s, map0);
                    int v2 = spannableStringBuilder1.length();
                    do {
                        --v2;
                    }
                    while(v2 >= 0 && spannableStringBuilder1.charAt(v2) == 0x20);
                    if(v2 >= 0 && spannableStringBuilder1.charAt(v2) != 10) {
                        spannableStringBuilder1.append('\n');
                    }
                }
                for(Object object1: map0.entrySet()) {
                    String s2 = (String)((Map.Entry)object1).getKey();
                    CharSequence charSequence1 = ((zzcm)((Map.Entry)object1).getValue()).zzq();
                    charSequence1.getClass();
                    Integer integer1 = charSequence1.length();
                    this.zzl.put(s2, integer1);
                }
            }
        }
    }
}

