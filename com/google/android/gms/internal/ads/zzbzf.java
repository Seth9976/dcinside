package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzbzf {
    private final Clock zza;
    private final zzbzq zzb;
    private final LinkedList zzc;
    private final Object zzd;
    private final String zze;
    private final String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    zzbzf(Clock clock0, zzbzq zzbzq0, String s, String s1) {
        this.zzd = new Object();
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = 0L;
        this.zzj = -1L;
        this.zzk = -1L;
        this.zza = clock0;
        this.zzb = zzbzq0;
        this.zze = s;
        this.zzf = s1;
        this.zzc = new LinkedList();
    }

    public final Bundle zza() {
        synchronized(this.zzd) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("seq_num", this.zze);
            bundle0.putString("slotid", this.zzf);
            bundle0.putBoolean("ismediation", false);
            bundle0.putLong("treq", this.zzj);
            bundle0.putLong("tresponse", this.zzk);
            bundle0.putLong("timp", this.zzg);
            bundle0.putLong("tload", this.zzh);
            bundle0.putLong("pcc", this.zzi);
            bundle0.putLong("tfetch", -1L);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: this.zzc) {
                arrayList0.add(((zzbze)object1).zzb());
            }
            bundle0.putParcelableArrayList("tclick", arrayList0);
            return bundle0;
        }
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized(this.zzd) {
            if(this.zzk != -1L) {
                zzbze zzbze0 = new zzbze(this);
                zzbze0.zzd();
                this.zzc.add(zzbze0);
                ++this.zzi;
                this.zzb.zzf();
                this.zzb.zze(this);
            }
        }
    }

    public final void zze() {
        synchronized(this.zzd) {
            if(this.zzk != -1L && !this.zzc.isEmpty()) {
                zzbze zzbze0 = (zzbze)this.zzc.getLast();
                if(zzbze0.zza() == -1L) {
                    zzbze0.zzc();
                    this.zzb.zze(this);
                }
            }
        }
    }

    public final void zzf() {
        synchronized(this.zzd) {
            if(this.zzk != -1L && this.zzg == -1L) {
                this.zzg = this.zza.elapsedRealtime();
                this.zzb.zze(this);
            }
            this.zzb.zzg();
        }
    }

    public final void zzg() {
        synchronized(this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z) {
        synchronized(this.zzd) {
            if(this.zzk != -1L) {
                this.zzh = this.zza.elapsedRealtime();
            }
        }
    }

    public final void zzi() {
        synchronized(this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(zzm zzm0) {
        synchronized(this.zzd) {
            long v1 = this.zza.elapsedRealtime();
            this.zzj = v1;
            this.zzb.zzj(zzm0, v1);
        }
    }

    public final void zzk(long v) {
        synchronized(this.zzd) {
            this.zzk = v;
            if(v != -1L) {
                this.zzb.zze(this);
            }
        }
    }
}

