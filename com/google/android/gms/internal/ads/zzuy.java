package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class zzuy extends zzto {
    private static final zzar zza;
    private final zzui[] zzb;
    private final List zzc;
    private final zzbq[] zzd;
    private final ArrayList zze;
    private int zzf;
    private long[][] zzg;
    @Nullable
    private zzuv zzh;
    private final zztr zzi;

    static {
        zzaf zzaf0 = new zzaf();
        zzaf0.zza("MergingMediaSource");
        zzuy.zza = zzaf0.zzc();
    }

    public zzuy(boolean z, boolean z1, zztr zztr0, zzui[] arr_zzui) {
        this.zzb = arr_zzui;
        this.zzi = zztr0;
        this.zze = new ArrayList(Arrays.asList(arr_zzui));
        this.zzf = -1;
        this.zzc = new ArrayList(arr_zzui.length);
        for(int v = 0; v < arr_zzui.length; ++v) {
            ArrayList arrayList0 = new ArrayList();
            this.zzc.add(arrayList0);
        }
        this.zzd = new zzbq[arr_zzui.length];
        this.zzg = new long[0][];
        new HashMap();
        zzfyt.zzb(8).zzb(2).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    protected final void zzA(Object object0, zzui zzui0, zzbq zzbq0) {
        int v;
        if(this.zzh == null) {
            if(this.zzf == -1) {
                v = zzbq0.zzb();
                this.zzf = v;
            }
            else {
                int v1 = zzbq0.zzb();
                int v2 = this.zzf;
                if(v1 != v2) {
                    this.zzh = new zzuv(0);
                    return;
                }
                v = v2;
            }
            if(this.zzg.length == 0) {
                this.zzg = new long[v][this.zzd.length];
            }
            this.zze.remove(zzui0);
            this.zzd[((int)(((Integer)object0)))] = zzbq0;
            if(this.zze.isEmpty()) {
                this.zzo(this.zzd[0]);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzG(zzue zzue0) {
        for(int v = 0; v < this.zzb.length; ++v) {
            List list0 = (List)this.zzc.get(v);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                if(((zzuw)list0.get(v1)).zzb.equals(zzue0)) {
                    list0.remove(v1);
                    break;
                }
            }
            this.zzb[v].zzG(((zzuu)zzue0).zzn(v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final zzue zzI(zzug zzug0, zzyk zzyk0, long v) {
        zzue[] arr_zzue = new zzue[this.zzb.length];
        int v2 = this.zzd[0].zza(zzug0.zza);
        for(int v1 = 0; v1 < this.zzb.length; ++v1) {
            zzug zzug1 = zzug0.zza(this.zzd[v1].zzf(v2));
            arr_zzue[v1] = this.zzb[v1].zzI(zzug1, zzyk0, v - this.zzg[v2][v1]);
            ((List)this.zzc.get(v1)).add(new zzuw(zzug1, arr_zzue[v1], null));
        }
        return new zzuu(this.zzi, this.zzg[v2], arr_zzue);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final zzar zzJ() {
        return this.zzb.length <= 0 ? zzuy.zza : this.zzb[0].zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    protected final void zzn(@Nullable zzgy zzgy0) {
        super.zzn(zzgy0);
        for(int v = 0; true; ++v) {
            zzui[] arr_zzui = this.zzb;
            if(v >= arr_zzui.length) {
                break;
            }
            this.zzB(v, arr_zzui[v]);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, null);
        this.zzf = -1;
        this.zzh = null;
        this.zze.clear();
        Collections.addAll(this.zze, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    public final void zzt(zzar zzar0) {
        this.zzb[0].zzt(zzar0);
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    @Nullable
    protected final zzug zzy(Object object0, zzug zzug0) {
        List list0 = (List)this.zzc.get(((int)(((Integer)object0))));
        for(int v = 0; v < list0.size(); ++v) {
            if(((zzuw)list0.get(v)).zza.equals(zzug0)) {
                return ((zzuw)((List)this.zzc.get(0)).get(v)).zza;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    public final void zzz() throws IOException {
        zzuv zzuv0 = this.zzh;
        if(zzuv0 != null) {
            throw zzuv0;
        }
        super.zzz();
    }
}

