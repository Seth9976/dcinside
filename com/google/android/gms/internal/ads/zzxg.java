package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

public final class zzxg extends zzbv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxg() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zzy();
    }

    public zzxg(Context context0) {
        super.zze(context0);
        Point point0 = zzei.zzw(context0);
        super.zzf(point0.x, point0.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zzy();
    }

    zzxg(zzxh zzxh0, zzxs zzxs0) {
        super(zzxh0);
        this.zza = zzxh0.zzD;
        this.zzb = zzxh0.zzF;
        this.zzc = zzxh0.zzH;
        this.zzd = zzxh0.zzM;
        this.zze = zzxh0.zzN;
        this.zzf = zzxh0.zzO;
        this.zzg = zzxh0.zzQ;
        SparseArray sparseArray0 = zzxh0.zzS;
        SparseArray sparseArray1 = new SparseArray();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            sparseArray1.put(sparseArray0.keyAt(v), new HashMap(((Map)sparseArray0.valueAt(v))));
        }
        this.zzh = sparseArray1;
        this.zzi = zzxh0.zzT.clone();
    }

    public final zzxg zzq(int v, boolean z) {
        if(this.zzi.get(v) != z) {
            if(z) {
                this.zzi.put(v, true);
                return this;
            }
            this.zzi.delete(v);
        }
        return this;
    }

    private final void zzy() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }
}

