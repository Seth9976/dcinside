package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Map.Entry;
import java.util.Map;

public final class zzxh extends zzbw {
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        new zzxh(new zzxg());
    }

    private zzxh(zzxg zzxg0) {
        super(zzxg0);
        this.zzD = zzxg0.zza;
        this.zzE = false;
        this.zzF = zzxg0.zzb;
        this.zzG = false;
        this.zzH = zzxg0.zzc;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = false;
        this.zzM = zzxg0.zzd;
        this.zzN = zzxg0.zze;
        this.zzO = zzxg0.zzf;
        this.zzP = false;
        this.zzQ = zzxg0.zzg;
        this.zzR = false;
        this.zzS = zzxg0.zzh;
        this.zzT = zzxg0.zzi;
    }

    zzxh(zzxg zzxg0, zzxs zzxs0) {
        this(zzxg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbw
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzxh.class == class0 && super.equals(((zzxh)object0)) && this.zzD == ((zzxh)object0).zzD && this.zzF == ((zzxh)object0).zzF && this.zzH == ((zzxh)object0).zzH && this.zzM == ((zzxh)object0).zzM && this.zzN == ((zzxh)object0).zzN && this.zzO == ((zzxh)object0).zzO && this.zzQ == ((zzxh)object0).zzQ) {
                SparseBooleanArray sparseBooleanArray0 = this.zzT;
                SparseBooleanArray sparseBooleanArray1 = ((zzxh)object0).zzT;
                int v = sparseBooleanArray0.size();
                if(sparseBooleanArray1.size() == v) {
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(sparseBooleanArray1.indexOfKey(sparseBooleanArray0.keyAt(v1)) < 0) {
                            return false;
                        }
                    }
                    SparseArray sparseArray0 = this.zzS;
                    SparseArray sparseArray1 = ((zzxh)object0).zzS;
                    int v2 = sparseArray0.size();
                    if(sparseArray1.size() == v2) {
                        for(int v3 = 0; v3 < v2; ++v3) {
                            int v4 = sparseArray1.indexOfKey(sparseArray0.keyAt(v3));
                            if(v4 < 0) {
                                return false;
                            }
                            Map map0 = (Map)sparseArray0.valueAt(v3);
                            Map map1 = (Map)sparseArray1.valueAt(v4);
                            if(map1.size() != map0.size()) {
                                return false;
                            }
                            for(Object object1: map0.entrySet()) {
                                zzwj zzwj0 = (zzwj)((Map.Entry)object1).getKey();
                                if(!map1.containsKey(zzwj0) || !Objects.equals(((Map.Entry)object1).getValue(), map1.get(zzwj0))) {
                                    return false;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbw
    public final int hashCode() {
        return ((((((((super.hashCode() + 0x1F) * 0x1F + this.zzD) * 961 + this.zzF) * 961 + this.zzH) * 0x1B4D89F + this.zzM) * 0x1F + this.zzN) * 0x1F + this.zzO) * 961 + this.zzQ) * 0x1F;
    }

    public final zzxg zzc() {
        return new zzxg(this, null);
    }

    public static zzxh zzd(Context context0) {
        return new zzxh(new zzxg(context0));
    }

    @Nullable
    @Deprecated
    public final zzxi zze(int v, zzwj zzwj0) {
        Map map0 = (Map)this.zzS.get(v);
        return map0 == null ? null : ((zzxi)map0.get(zzwj0));
    }

    public final boolean zzf(int v) {
        return this.zzT.get(v);
    }

    @Deprecated
    public final boolean zzg(int v, zzwj zzwj0) {
        Map map0 = (Map)this.zzS.get(v);
        return map0 != null && map0.containsKey(zzwj0);
    }
}

