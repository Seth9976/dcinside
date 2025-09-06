package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzxt extends zzxy implements zzll {
    @Nullable
    public final Context zza;
    public static final int zzb;
    private static final zzfyy zzc;
    private final Object zzd;
    private final boolean zze;
    @GuardedBy("lock")
    private zzxh zzf;
    @GuardedBy("lock")
    @Nullable
    private zzxl zzg;
    @GuardedBy("lock")
    private zze zzh;
    private final zzwp zzi;

    static {
        zzxt.zzc = zzfyy.zzb(new zzwt());
    }

    public zzxt(Context context0) {
        zzwp zzwp0 = new zzwp();
        zzxh zzxh0 = zzxh.zzd(context0);
        super();
        this.zzd = new Object();
        this.zza = context0 == null ? null : context0.getApplicationContext();
        this.zzi = zzwp0;
        this.zzf = zzxh0;
        this.zzh = zze.zza;
        boolean z = context0 != null && zzei.zzM(context0);
        this.zze = z;
        if(!z && context0 != null && zzei.zza >= 0x20) {
            this.zzg = zzxl.zza(context0);
        }
        if(this.zzf.zzN && context0 == null) {
            zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzll
    public final void zza(zzlj zzlj0) {
        synchronized(this.zzd) {
        }
    }

    static int zzb(int v, int v1) {
        return v == 0 || v != v1 ? Integer.bitCount(v & v1) : 0x7FFFFFFF;
    }

    protected static int zzc(zzab zzab0, @Nullable String s, boolean z) {
        if(!TextUtils.isEmpty(s) && s.equals(zzab0.zzd)) {
            return 4;
        }
        String s1 = zzxt.zzh(s);
        String s2 = zzxt.zzh(zzab0.zzd);
        if(s2 != null && s1 != null) {
            if(!s2.startsWith(s1) && !s1.startsWith(s2)) {
                return s2.split("-", 2)[0].equals(s1.split("-", 2)[0]) ? 2 : 0;
            }
            return 3;
        }
        return !z || s2 != null ? 0 : 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzxy
    protected final Pair zzd(zzxx zzxx0, int[][][] arr3_v, int[] arr_v, zzug zzug0, zzbq zzbq0) throws zzib {
        zzxh zzxh0;
        int v13;
        zzxw zzxw0;
        boolean z;
        synchronized(this.zzd) {
            zzxh0 = this.zzf;
            if(zzxh0.zzN && zzei.zza >= 0x20) {
                zzxl zzxl0 = this.zzg;
                if(zzxl0 != null) {
                    Looper looper0 = Looper.myLooper();
                    zzcw.zzb(looper0);
                    zzxl0.zzb(this, looper0);
                }
            }
        }
        zzxu[] arr_zzxu = new zzxu[2];
        for(int v1 = 0; true; ++v1) {
            z = false;
            if(v1 >= 2) {
                break;
            }
            if(zzxx0.zzc(v1) == 2 && zzxx0.zzd(v1).zzb > 0) {
                z = true;
                break;
            }
        }
        Pair pair0 = zzxt.zzv(1, zzxx0, arr3_v, new zzwy(this, zzxh0, z, arr_v), new zzwz());
        if(pair0 != null) {
            arr_zzxu[((int)(((Integer)pair0.second)))] = (zzxu)pair0.first;
        }
        String s = pair0 == null ? null : ((zzxu)pair0.first).zza.zzb(((zzxu)pair0.first).zzb[0]).zzd;
        Pair pair1 = zzxt.zzv(2, zzxx0, arr3_v, new zzww(zzxh0, s, arr_v), new zzwx());
        Pair pair2 = pair1 == null ? zzxt.zzv(4, zzxx0, arr3_v, new zzwu(zzxh0), new zzwv()) : null;
        if(pair2 != null) {
            arr_zzxu[((int)(((Integer)pair2.second)))] = (zzxu)pair2.first;
        }
        else if(pair1 != null) {
            arr_zzxu[((int)(((Integer)pair1.second)))] = (zzxu)pair1.first;
        }
        Pair pair3 = zzxt.zzv(3, zzxx0, arr3_v, new zzxb(zzxh0, s), new zzxc());
        if(pair3 != null) {
            arr_zzxu[((int)(((Integer)pair3.second)))] = (zzxu)pair3.first;
        }
        for(int v2 = 0; v2 < 2; ++v2) {
            switch(zzxx0.zzc(v2)) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    break;
                }
                default: {
                    zzwj zzwj0 = zzxx0.zzd(v2);
                    int[][] arr2_v = arr3_v[v2];
                    int v3 = 0;
                    zzbr zzbr0 = null;
                    int v4 = 0;
                    for(zzxf zzxf0 = null; v3 < zzwj0.zzb; zzxf0 = zzxf1) {
                        zzbr zzbr1 = zzwj0.zzb(v3);
                        int[] arr_v1 = arr2_v[v3];
                        zzxf zzxf1 = zzxf0;
                        for(int v5 = 0; v5 < zzbr1.zza; ++v5) {
                            if(zzlk.zza(arr_v1[v5], zzxh0.zzO)) {
                                zzxf zzxf2 = new zzxf(zzbr1.zzb(v5), arr_v1[v5]);
                                if(zzxf1 == null || zzxf2.zza(zzxf1) > 0) {
                                    v4 = v5;
                                    zzxf1 = zzxf2;
                                    zzbr0 = zzbr1;
                                }
                            }
                        }
                        ++v3;
                    }
                    arr_zzxu[v2] = zzbr0 == null ? null : new zzxu(zzbr0, new int[]{v4}, 0);
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(int v6 = 0; v6 < 2; ++v6) {
            zzxt.zzt(zzxx0.zzd(v6), zzxh0, hashMap0);
        }
        zzxt.zzt(zzxx0.zze(), zzxh0, hashMap0);
        for(int v7 = 0; v7 < 2; ++v7) {
            if(((zzbs)hashMap0.get(zzxx0.zzc(v7))) != null) {
                throw null;
            }
        }
        for(int v8 = 0; v8 < 2; ++v8) {
            zzwj zzwj1 = zzxx0.zzd(v8);
            if(zzxh0.zzg(v8, zzwj1)) {
                if(zzxh0.zze(v8, zzwj1) != null) {
                    throw null;
                }
                arr_zzxu[v8] = null;
                continue;
            }
        }
        for(int v9 = 0; v9 < 2; ++v9) {
            int v10 = zzxx0.zzc(v9);
            if(zzxh0.zzf(v9) || zzxh0.zzC.contains(v10)) {
                arr_zzxu[v9] = null;
            }
        }
        zzwp zzwp0 = this.zzi;
        zzyj zzyj0 = this.zzq();
        zzfxn zzfxn0 = zzwq.zzh(arr_zzxu);
        zzxv[] arr_zzxv = new zzxv[2];
        for(int v11 = 0; v11 < 2; v11 = v13 + 1) {
            zzxu zzxu0 = arr_zzxu[v11];
            if(zzxu0 == null) {
                v13 = v11;
            }
            else {
                int[] arr_v2 = zzxu0.zzb;
                int v12 = arr_v2.length;
                if(v12 != 0) {
                    if(v12 == 1) {
                        zzxw0 = new zzxw(zzxu0.zza, arr_v2[0], 0, 0, null);
                        v13 = v11;
                    }
                    else {
                        v13 = v11;
                        zzfxn zzfxn1 = (zzfxn)zzfxn0.get(v11);
                        zzxw0 = zzwp0.zza(zzxu0.zza, arr_v2, 0, zzyj0, zzfxn1);
                    }
                    arr_zzxv[v13] = zzxw0;
                }
            }
        }
        zzln[] arr_zzln = new zzln[2];
        for(int v14 = 0; v14 < 2; ++v14) {
            int v15 = zzxx0.zzc(v14);
            arr_zzln[v14] = zzxh0.zzf(v14) || zzxh0.zzC.contains(v15) || zzxx0.zzc(v14) != -2 && arr_zzxv[v14] == null ? null : zzln.zza;
        }
        return Pair.create(arr_zzln, arr_zzxv);
    }

    @Override  // com.google.android.gms.internal.ads.zzyb
    @Nullable
    public final zzll zze() {
        return this;
    }

    public final zzxh zzf() {
        synchronized(this.zzd) {
        }
        return this.zzf;
    }

    // 去混淆评级： 低(20)
    @Nullable
    protected static String zzh(@Nullable String s) {
        return TextUtils.isEmpty(s) || TextUtils.equals(s, "und") ? null : s;
    }

    @Override  // com.google.android.gms.internal.ads.zzyb
    public final void zzj() {
        synchronized(this.zzd) {
            if(zzei.zza >= 0x20) {
                zzxl zzxl0 = this.zzg;
                if(zzxl0 != null) {
                    zzxl0.zzc();
                }
            }
        }
        super.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzyb
    public final void zzk(zze zze0) {
        synchronized(this.zzd) {
            boolean z = this.zzh.equals(zze0);
            this.zzh = zze0;
        }
        if(!z) {
            this.zzu();
        }
    }

    public final void zzl(zzxg zzxg0) {
        zzxh zzxh0 = new zzxh(zzxg0, null);
        synchronized(this.zzd) {
            boolean z = this.zzf.equals(zzxh0);
            this.zzf = zzxh0;
        }
        if(!z) {
            if(zzxh0.zzN && this.zza == null) {
                zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            this.zzs();
        }
    }

    public static boolean zzm(zzxt zzxt0, zzab zzab0) {
        int v = -1;
        boolean z = true;
        synchronized(zzxt0.zzd) {
            if(zzxt0.zzf.zzN && !zzxt0.zze && (zzab0.zzD != -1 && zzab0.zzD > 2)) {
                String s = zzab0.zzo;
                if(s == null) {
                label_18:
                    if(zzei.zza < 0x20 || (zzxt0.zzg == null || !zzxt0.zzg.zzg() || !zzxt0.zzg.zze() || !zzxt0.zzg.zzf() || !zzxt0.zzg.zzd(zzxt0.zzh, zzab0))) {
                        z = false;
                    }
                }
                else {
                    switch(s) {
                        case "audio/ac3": {
                            v = 0;
                            break;
                        }
                        case "audio/ac4": {
                            v = 3;
                            break;
                        }
                        case "audio/eac3": {
                            v = 1;
                            break;
                        }
                        case "audio/eac3-joc": {
                            v = 2;
                        }
                    }
                    if(v != 0 && v != 1 && v != 2 && v != 3 || zzei.zza >= 0x20 && (zzxt0.zzg != null && zzxt0.zzg.zzg())) {
                        goto label_18;
                    }
                }
            }
            return z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyb
    public final boolean zzn() {
        return true;
    }

    private static void zzt(zzwj zzwj0, zzbw zzbw0, Map map0) {
        for(int v = 0; v < zzwj0.zzb; ++v) {
            zzbr zzbr0 = zzwj0.zzb(v);
            if(((zzbs)zzbw0.zzB.get(zzbr0)) != null) {
                throw null;
            }
        }
    }

    private final void zzu() {
        boolean z = false;
        synchronized(this.zzd) {
            if(this.zzf.zzN && !this.zze && zzei.zza >= 0x20 && (this.zzg != null && this.zzg.zzg())) {
                z = true;
            }
        }
        if(z) {
            this.zzs();
        }
    }

    @Nullable
    private static final Pair zzv(int v, zzxx zzxx0, int[][][] arr3_v, zzxn zzxn0, Comparator comparator0) {
        zzfxn zzfxn0;
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < 2; ++v1) {
            if(v == zzxx0.zzc(v1)) {
                zzwj zzwj0 = zzxx0.zzd(v1);
                for(int v2 = 0; v2 < zzwj0.zzb; ++v2) {
                    zzbr zzbr0 = zzwj0.zzb(v2);
                    List list0 = zzxn0.zza(v1, zzbr0, arr3_v[v1][v2]);
                    boolean[] arr_z = new boolean[zzbr0.zza];
                    for(int v3 = 0; v3 < zzbr0.zza; ++v3) {
                        zzxo zzxo0 = (zzxo)list0.get(v3);
                        int v4 = zzxo0.zzb();
                        if(!arr_z[v3] && v4 != 0) {
                            if(v4 == 1) {
                                zzfxn0 = zzfxn.zzo(zzxo0);
                            }
                            else {
                                ArrayList arrayList1 = new ArrayList();
                                arrayList1.add(zzxo0);
                                for(int v5 = v3 + 1; v5 < zzbr0.zza; ++v5) {
                                    zzxo zzxo1 = (zzxo)list0.get(v5);
                                    if(zzxo1.zzb() == 2 && zzxo0.zzc(zzxo1)) {
                                        arrayList1.add(zzxo1);
                                        arr_z[v5] = true;
                                    }
                                }
                                zzfxn0 = arrayList1;
                            }
                            arrayList0.add(zzfxn0);
                        }
                    }
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return null;
        }
        List list1 = (List)Collections.max(arrayList0, comparator0);
        int[] arr_v = new int[list1.size()];
        for(int v6 = 0; v6 < list1.size(); ++v6) {
            arr_v[v6] = ((zzxo)list1.get(v6)).zzc;
        }
        zzxo zzxo2 = (zzxo)list1.get(0);
        return Pair.create(new zzxu(zzxo2.zzb, arr_v, 0), zzxo2.zza);
    }
}

