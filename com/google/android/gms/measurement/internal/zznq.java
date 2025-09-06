package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzcw;
import w4.d;

public final class zznq extends zznr {
    private final AlarmManager zza;
    private zzav zzb;
    private Integer zzc;

    protected zznq(zznv zznv0) {
        super(zznv0);
        this.zza = (AlarmManager)this.zza().getSystemService("alarm");
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzoo g_() {
        return super.g_();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    public final void zza(long v) {
        this.zzal();
        Context context0 = this.zza();
        if(!zzos.zza(context0)) {
            this.zzj().zzc().zza("Receiver not registered/enabled");
        }
        if(!zzos.zza(context0, false)) {
            this.zzj().zzc().zza("Service not registered/enabled");
        }
        this.zzu();
        this.zzj().zzp().zza("Scheduling upload, millis", v);
        long v1 = this.zzb().elapsedRealtime();
        if(v < Math.max(0L, ((long)(((Long)zzbh.zzy.zza(null))))) && !this.zzx().zzc()) {
            this.zzx().zza(v);
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Context context1 = this.zza();
            ComponentName componentName0 = new ComponentName(context1, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v2 = this.zzv();
            PersistableBundle persistableBundle0 = new PersistableBundle();
            persistableBundle0.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzcv.zza(context1, new JobInfo.Builder(v2, componentName0).setMinimumLatency(v).setOverrideDeadline(v << 1).setExtras(persistableBundle0).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager0 = this.zza;
        if(alarmManager0 != null) {
            alarmManager0.setInexactRepeating(2, v1 + v, Math.max(((long)(((Long)zzbh.zzt.zza(null)))), v), this.zzw());
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        AlarmManager alarmManager0 = this.zza;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.zzw());
        }
        if(Build.VERSION.SDK_INT >= 24) {
            this.zzy();
        }
        return false;
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

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzal zzh() {
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

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzhl zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzmw zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zznu zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }

    public final void zzu() {
        this.zzal();
        this.zzj().zzp().zza("Unscheduling upload");
        AlarmManager alarmManager0 = this.zza;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.zzw());
        }
        this.zzx().zza();
        if(Build.VERSION.SDK_INT >= 24) {
            this.zzy();
        }
    }

    private final int zzv() {
        if(this.zzc == null) {
            this.zzc = 0xC05EB578;
        }
        return (int)this.zzc;
    }

    private final PendingIntent zzw() {
        Context context0 = this.zza();
        return zzcw.zza(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcw.zza);
    }

    private final zzav zzx() {
        if(this.zzb == null) {
            this.zzb = new zznp(this, this.zzg.zzk());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzy() {
        JobScheduler jobScheduler0 = (JobScheduler)this.zza().getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            jobScheduler0.cancel(this.zzv());
        }
    }
}

