package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public final class zzegq {
    private final Clock zza;
    private final zzegs zzb;
    private final zzfja zzc;
    @GuardedBy("this")
    private final LinkedHashMap zzd;
    private final boolean zze;
    private final zzedb zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzegq(Clock clock0, zzegs zzegs0, zzedb zzedb0, zzfja zzfja0) {
        this.zzd = new LinkedHashMap();
        this.zza = clock0;
        this.zzb = zzegs0;
        this.zze = ((Boolean)zzbe.zzc().zza(zzbcl.zzgG)).booleanValue();
        this.zzf = zzedb0;
        this.zzc = zzfja0;
    }

    public final long zza() {
        synchronized(this) {
        }
        return this.zzh;
    }

    final t0 zzf(zzfca zzfca0, zzfbo zzfbo0, t0 t00, zzfiv zzfiv0) {
        synchronized(this) {
            zzfbr zzfbr0 = zzfca0.zzb.zzb;
            long v1 = this.zza.elapsedRealtime();
            String s = zzfbo0.zzw;
            if(s != null) {
                zzegp zzegp0 = new zzegp(s, zzfbo0.zzaf, 9, 0L, null);
                this.zzd.put(zzfbo0, zzegp0);
                zzgch.zzr(t00, new zzego(this, v1, zzfbr0, zzfbo0, s, zzfiv0, zzfca0), zzbzw.zzg);
            }
            return t00;
        }
    }

    public final String zzg() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.zzd.entrySet()) {
                zzegp zzegp0 = (zzegp)((Map.Entry)object0).getValue();
                if(zzegp0.zzc != 0x7FFFFFFF) {
                    arrayList0.add(zzegp0.toString());
                }
            }
            return TextUtils.join("_", arrayList0);
        }
    }

    public final void zzi(@Nullable zzfbo zzfbo0) {
        synchronized(this) {
            this.zzh = this.zza.elapsedRealtime() - this.zzi;
            if(zzfbo0 != null) {
                this.zzf.zze(zzfbo0);
            }
            this.zzg = true;
        }
    }

    public final void zzj() {
        synchronized(this) {
            this.zzh = this.zza.elapsedRealtime() - this.zzi;
        }
    }

    public final void zzk(List list0) {
        synchronized(this) {
            this.zzi = this.zza.elapsedRealtime();
            for(Object object0: list0) {
                zzfbo zzfbo0 = (zzfbo)object0;
                if(!TextUtils.isEmpty(zzfbo0.zzw)) {
                    zzegp zzegp0 = new zzegp(zzfbo0.zzw, zzfbo0.zzaf, 0x7FFFFFFF, 0L, null);
                    this.zzd.put(zzfbo0, zzegp0);
                }
            }
        }
    }

    public final void zzl() {
        synchronized(this) {
            this.zzi = this.zza.elapsedRealtime();
        }
    }

    public final void zzm(zzfbo zzfbo0) {
        synchronized(this) {
            zzegp zzegp0 = (zzegp)this.zzd.get(zzfbo0);
            if(zzegp0 != null && !this.zzg) {
                zzegp0.zzc = 8;
            }
        }
    }

    private final boolean zzq(zzfbo zzfbo0) {
        synchronized(this) {
            zzegp zzegp0 = (zzegp)this.zzd.get(zzfbo0);
            return zzegp0 == null ? false : zzegp0.zzc == 8;
        }
    }
}

