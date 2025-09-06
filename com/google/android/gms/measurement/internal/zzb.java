package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;
import w4.d;

public final class zzb extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzb(zzhy zzhy0) {
        super(zzhy0);
        this.zzb = new ArrayMap();
        this.zza = new ArrayMap();
    }

    @WorkerThread
    private final void zza(long v, zzlk zzlk0) {
        if(zzlk0 == null) {
            this.zzj().zzp().zza("Not logging ad exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.zzj().zzp().zza("Not logging ad exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_xt", v);
        zzos.zza(zzlk0, bundle0, true);
        this.zzm().zzc("am", "_xa", bundle0);
    }

    static void zza(zzb zzb0, String s, long v) {
        zzb0.zzt();
        Preconditions.checkNotEmpty(s);
        if(zzb0.zzb.isEmpty()) {
            zzb0.zzc = v;
        }
        Integer integer0 = (Integer)zzb0.zzb.get(s);
        if(integer0 != null) {
            zzb0.zzb.put(s, ((int)(((int)integer0) + 1)));
            return;
        }
        if(zzb0.zzb.size() >= 100) {
            zzb0.zzj().zzu().zza("Too many ads visible");
            return;
        }
        zzb0.zzb.put(s, 1);
        zzb0.zza.put(s, v);
    }

    @WorkerThread
    private final void zza(String s, long v, zzlk zzlk0) {
        if(zzlk0 == null) {
            this.zzj().zzp().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.zzj().zzp().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s);
        bundle0.putLong("_xt", v);
        zzos.zza(zzlk0, bundle0, true);
        this.zzm().zzc("am", "_xu", bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    public final void zza(long v) {
        zzlk zzlk0 = this.zzn().zza(false);
        for(Object object0: this.zza.keySet()) {
            this.zza(((String)object0), v - ((long)(((Long)this.zza.get(((String)object0))))), zzlk0);
        }
        if(!this.zza.isEmpty()) {
            this.zza(v - this.zzc, zzlk0);
        }
        this.zzb(v);
    }

    public final void zza(String s, long v) {
        if(s != null && s.length() != 0) {
            this.zzl().zzb(new zza(this, s, v));
            return;
        }
        this.zzj().zzg().zza("Ad unit id must be a non-empty string");
    }

    @WorkerThread
    private final void zzb(long v) {
        for(Object object0: this.zza.keySet()) {
            this.zza.put(((String)object0), v);
        }
        if(!this.zza.isEmpty()) {
            this.zzc = v;
        }
    }

    static void zzb(zzb zzb0, String s, long v) {
        zzb0.zzt();
        Preconditions.checkNotEmpty(s);
        Integer integer0 = (Integer)zzb0.zzb.get(s);
        if(integer0 != null) {
            zzlk zzlk0 = zzb0.zzn().zza(false);
            int v1 = (int)integer0;
            if(v1 - 1 == 0) {
                zzb0.zzb.remove(s);
                Long long0 = (Long)zzb0.zza.get(s);
                if(long0 == null) {
                    zzb0.zzj().zzg().zza("First ad unit exposure time was never set");
                }
                else {
                    zzb0.zza.remove(s);
                    zzb0.zza(s, v - ((long)long0), zzlk0);
                }
                if(zzb0.zzb.isEmpty()) {
                    long v2 = zzb0.zzc;
                    if(v2 == 0L) {
                        zzb0.zzj().zzg().zza("First ad exposure time was never set");
                        return;
                    }
                    zzb0.zza(v - v2, zzlk0);
                    zzb0.zzc = 0L;
                }
                return;
            }
            zzb0.zzb.put(s, ((int)(v1 - 1)));
            return;
        }
        zzb0.zzj().zzg().zza("Call to endAdUnitExposure for unknown ad unit id", s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    public final void zzb(String s, long v) {
        if(s != null && s.length() != 0) {
            this.zzl().zzb(new zzd(this, s, v));
            return;
        }
        this.zzj().zzg().zza("Ad unit id must be a non-empty string");
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzb zzc() {
        return super.zzc();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzgg zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzgf zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzjq zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzlj zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzls zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zznb zzp() {
        return super.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzt() {
        super.zzt();
    }
}

