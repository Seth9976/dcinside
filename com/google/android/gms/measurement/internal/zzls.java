package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zznm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import w4.d;

public final class zzls extends zzh {
    private final zzmq zza;
    private zzgb zzb;
    private volatile Boolean zzc;
    private final zzav zzd;
    private final zznl zze;
    private final List zzf;
    private final zzav zzg;

    protected zzls(zzhy zzhy0) {
        super(zzhy0);
        this.zzf = new ArrayList();
        this.zze = new zznl(zzhy0.zzb());
        this.zza = new zzmq(this);
        this.zzd = new zzlt(this, zzhy0);
        this.zzg = new zzmg(this, zzhy0);
    }

    static void zza(zzls zzls0, ComponentName componentName0) {
        zzls0.zzt();
        if(zzls0.zzb != null) {
            zzls0.zzb = null;
            zzls0.zzj().zzp().zza("Disconnected from device MeasurementService", componentName0);
            zzls0.zzt();
            zzls0.zzae();
        }
    }

    static void zza(zzls zzls0, zzgb zzgb0) {
        zzls0.zzb = null;
    }

    @WorkerThread
    private final void zza(Runnable runnable0) throws IllegalStateException {
        this.zzt();
        if(this.zzal()) {
            runnable0.run();
            return;
        }
        if(((long)this.zzf.size()) >= 1000L) {
            this.zzj().zzg().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable0);
        this.zzg.zza(60000L);
        this.zzae();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    public final void zza(Bundle bundle0) {
        this.zzt();
        this.zzu();
        this.zza(new zzmf(this, this.zzc(false), bundle0));
    }

    @WorkerThread
    public final void zza(zzdo zzdo0) {
        this.zzt();
        this.zzu();
        this.zza(new zzmc(this, this.zzc(false), zzdo0));
    }

    @WorkerThread
    public final void zza(zzdo zzdo0, zzbf zzbf0, String s) {
        this.zzt();
        this.zzu();
        if(this.zzq().zza(12451000) != 0) {
            this.zzj().zzu().zza("Not bundling data. Service unavailable or out of date");
            this.zzq().zza(zzdo0, new byte[0]);
            return;
        }
        this.zza(new zzmi(this, zzbf0, s, zzdo0));
    }

    @WorkerThread
    protected final void zza(zzdo zzdo0, String s, String s1) {
        this.zzt();
        this.zzu();
        this.zza(new zzmo(this, s, s1, this.zzc(false), zzdo0));
    }

    @WorkerThread
    protected final void zza(zzdo zzdo0, String s, String s1, boolean z) {
        this.zzt();
        this.zzu();
        this.zza(new zzlw(this, s, s1, this.zzc(false), z, zzdo0));
    }

    @WorkerThread
    protected final void zza(zzae zzae0) {
        Preconditions.checkNotNull(zzae0);
        this.zzt();
        this.zzu();
        boolean z = this.zzh().zza(zzae0);
        zzae zzae1 = new zzae(zzae0);
        this.zza(new zzmm(this, true, this.zzc(true), z, zzae1, zzae0));
    }

    @WorkerThread
    protected final void zza(zzbf zzbf0, String s) {
        Preconditions.checkNotNull(zzbf0);
        this.zzt();
        this.zzu();
        boolean z = this.zzh().zza(zzbf0);
        this.zza(new zzmj(this, true, this.zzc(true), z, zzbf0, s));
    }

    @WorkerThread
    protected final void zza(zzgb zzgb0) {
        this.zzt();
        Preconditions.checkNotNull(zzgb0);
        this.zzb = zzgb0;
        this.zzar();
        this.zzaq();
    }

    @WorkerThread
    final void zza(zzgb zzgb0, AbstractSafeParcelable abstractSafeParcelable0, zzo zzo0) {
        long v7;
        long v6;
        long v5;
        int v2;
        this.zzt();
        this.zzu();
        int v = 100;
        int v1 = 0;
        while(v1 < 1001 && v == 100) {
            ArrayList arrayList0 = new ArrayList();
            List list0 = this.zzh().zza(100);
            if(list0 == null) {
                v2 = 0;
            }
            else {
                arrayList0.addAll(list0);
                v2 = list0.size();
            }
            if(abstractSafeParcelable0 != null && v2 < 100) {
                arrayList0.add(abstractSafeParcelable0);
            }
            boolean z = this.zze().zza(zzbh.zzce);
            int v3 = arrayList0.size();
            int v4 = 0;
            while(v4 < v3) {
                AbstractSafeParcelable abstractSafeParcelable1 = (AbstractSafeParcelable)arrayList0.get(v4);
                if(abstractSafeParcelable1 instanceof zzbf) {
                    if(z) {
                        try {
                            v5 = this.zzu.zzb().currentTimeMillis();
                        }
                        catch(RemoteException remoteException0) {
                            v6 = 0L;
                            v7 = 0L;
                            goto label_39;
                        }
                        try {
                            v6 = 0L;
                            v6 = this.zzu.zzb().elapsedRealtime();
                            goto label_32;
                        label_30:
                            v5 = 0L;
                            v6 = 0L;
                        label_32:
                            zzgb0.zza(((zzbf)abstractSafeParcelable1), zzo0);
                            if(z) {
                                this.zzj().zzp().zza("Logging telemetry for logEvent from database");
                                zzgm.zza(this.zzu).zza(36301, 0, v5, this.zzu.zzb().currentTimeMillis(), ((int)(this.zzu.zzb().elapsedRealtime() - v6)));
                            }
                            goto label_56;
                        }
                        catch(RemoteException remoteException0) {
                            goto label_38;
                        }
                    }
                    else {
                        goto label_30;
                    }
                    goto label_32;
                label_38:
                    v7 = v5;
                label_39:
                    this.zzj().zzg().zza("Failed to send event to the service", remoteException0);
                    if(z && v7 != 0L) {
                        zzgm.zza(this.zzu).zza(36301, 13, v7, this.zzu.zzb().currentTimeMillis(), ((int)(this.zzu.zzb().elapsedRealtime() - v6)));
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzon) {
                    try {
                        zzgb0.zza(((zzon)abstractSafeParcelable1), zzo0);
                    }
                    catch(RemoteException remoteException1) {
                        this.zzj().zzg().zza("Failed to send user property to the service", remoteException1);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzae) {
                    try {
                        zzgb0.zza(((zzae)abstractSafeParcelable1), zzo0);
                    }
                    catch(RemoteException remoteException2) {
                        this.zzj().zzg().zza("Failed to send conditional user property to the service", remoteException2);
                    }
                }
                else {
                    this.zzj().zzg().zza("Discarding data. Unrecognized parcel type.");
                }
            label_56:
                ++v4;
            }
            ++v1;
            v = v2;
        }
    }

    @WorkerThread
    protected final void zza(zzlk zzlk0) {
        this.zzt();
        this.zzu();
        this.zza(new zzmd(this, zzlk0));
    }

    @WorkerThread
    protected final void zza(zzon zzon0) {
        this.zzt();
        this.zzu();
        boolean z = this.zzh().zza(zzon0);
        this.zza(new zzlx(this, this.zzc(true), z, zzon0));
    }

    @WorkerThread
    public final void zza(AtomicReference atomicReference0) {
        this.zzt();
        this.zzu();
        this.zza(new zzlz(this, atomicReference0, this.zzc(false)));
    }

    @WorkerThread
    protected final void zza(AtomicReference atomicReference0, Bundle bundle0) {
        this.zzt();
        this.zzu();
        this.zza(new zzly(this, atomicReference0, this.zzc(false), bundle0));
    }

    @WorkerThread
    protected final void zza(AtomicReference atomicReference0, String s, String s1, String s2) {
        this.zzt();
        this.zzu();
        this.zza(new zzml(this, atomicReference0, s, s1, s2, this.zzc(false)));
    }

    @WorkerThread
    protected final void zza(AtomicReference atomicReference0, String s, String s1, String s2, boolean z) {
        this.zzt();
        this.zzu();
        this.zza(new zzmn(this, atomicReference0, s, s1, s2, this.zzc(false), z));
    }

    @WorkerThread
    protected final void zza(AtomicReference atomicReference0, boolean z) {
        this.zzt();
        this.zzu();
        this.zza(new zzlv(this, atomicReference0, this.zzc(false), z));
    }

    @WorkerThread
    protected final void zza(boolean z) {
        this.zzt();
        this.zzu();
        if((!zznm.zza() || !this.zze().zza(zzbh.zzcx)) && z) {
            this.zzh().zzaa();
        }
        if(this.zzan()) {
            this.zza(new zzmk(this, this.zzc(false)));
        }
    }

    @WorkerThread
    protected final zzaj zzaa() {
        this.zzt();
        this.zzu();
        zzgb zzgb0 = this.zzb;
        if(zzgb0 == null) {
            this.zzae();
            this.zzj().zzc().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzo0 = this.zzc(false);
        Preconditions.checkNotNull(zzo0);
        try {
            zzaj zzaj0 = zzgb0.zza(zzo0);
            this.zzar();
            return zzaj0;
        }
        catch(RemoteException remoteException0) {
            this.zzj().zzg().zza("Failed to get consents; remote exception", remoteException0);
            return null;
        }
    }

    final Boolean zzab() {
        return this.zzc;
    }

    @WorkerThread
    protected final void zzac() {
        this.zzt();
        this.zzu();
        this.zza(new zzme(this, this.zzc(true)));
    }

    @WorkerThread
    protected final void zzad() {
        this.zzt();
        this.zzu();
        zzo zzo0 = this.zzc(true);
        this.zzh().zzab();
        this.zza(new zzmb(this, zzo0));
    }

    @WorkerThread
    final void zzae() {
        this.zzt();
        this.zzu();
        if(this.zzal()) {
            return;
        }
        if(this.zzap()) {
            this.zza.zza();
            return;
        }
        if(!this.zze().zzy()) {
            List list0 = this.zza().getPackageManager().queryIntentServices(new Intent().setClassName(this.zza(), "com.google.android.gms.measurement.AppMeasurementService"), 0x10000);
            if(list0 != null && !list0.isEmpty()) {
                Intent intent0 = new Intent("com.google.android.gms.measurement.START");
                intent0.setComponent(new ComponentName(this.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent0);
                return;
            }
            this.zzj().zzg().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    @WorkerThread
    public final void zzaf() {
        this.zzt();
        this.zzu();
        this.zza.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(this.zza(), this.zza);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        this.zzb = null;
    }

    // 检测为 Lambda 实现
    final void zzag() [...]

    // 检测为 Lambda 实现
    final void zzah() [...]

    @WorkerThread
    protected final void zzai() {
        this.zzt();
        this.zzu();
        zzo zzo0 = this.zzc(false);
        this.zzh().zzaa();
        this.zza(new zzma(this, zzo0));
    }

    @WorkerThread
    protected final void zzaj() {
        this.zzt();
        this.zzu();
        this.zza(() -> {
            zzgb zzgb0 = this.zzb;
            if(zzgb0 == null) {
                this.zzj().zzg().zza("Failed to send Dma consent settings to service");
                return;
            }
            try {
                zzo zzo0 = this.zzc(false);
                Preconditions.checkNotNull(zzo0);
                zzgb0.zzg(zzo0);
                this.zzar();
            }
            catch(RemoteException remoteException0) {
                this.zzj().zzg().zza("Failed to send Dma consent settings to the service", remoteException0);
            }
        });
    }

    @WorkerThread
    protected final void zzak() {
        this.zzt();
        this.zzu();
        this.zza(new zzmh(this, this.zzc(true)));
    }

    @WorkerThread
    public final boolean zzal() {
        this.zzt();
        this.zzu();
        return this.zzb != null;
    }

    @WorkerThread
    final boolean zzam() {
        this.zzt();
        this.zzu();
        return this.zzap() ? this.zzq().zzg() >= 200900 : true;
    }

    @WorkerThread
    final boolean zzan() {
        this.zzt();
        this.zzu();
        return this.zzap() ? this.zzq().zzg() >= ((int)(((Integer)zzbh.zzbt.zza(null)))) : true;
    }

    @WorkerThread
    final boolean zzao() {
        this.zzt();
        this.zzu();
        return this.zzap() ? this.zzq().zzg() >= 241200 : true;
    }

    @WorkerThread
    final boolean zzap() {
        int v2;
        this.zzt();
        this.zzu();
        if(this.zzc == null) {
            int v = 0;
            this.zzt();
            this.zzu();
            Boolean boolean0 = this.zzk().zzp();
            boolean z = true;
            if(boolean0 == null || !boolean0.booleanValue()) {
                if(this.zzg().zzaa() == 1) {
                    v2 = 1;
                }
                else {
                    this.zzj().zzp().zza("Checking service availability");
                    int v1 = this.zzq().zza(12451000);
                    switch(v1) {
                        case 0: {
                            this.zzj().zzp().zza("Service available");
                            v2 = 1;
                            break;
                        }
                        case 1: {
                            this.zzj().zzp().zza("Service missing");
                            v2 = 1;
                            z = false;
                            break;
                        }
                        case 2: {
                            this.zzj().zzc().zza("Service container out of date");
                            if(this.zzq().zzg() < 0x4423) {
                                v2 = 1;
                                z = false;
                            }
                            else {
                                if(boolean0 != null) {
                                    z = false;
                                }
                                v2 = 0;
                            }
                            break;
                        }
                        case 3: {
                            this.zzj().zzu().zza("Service disabled");
                            v2 = 0;
                            z = false;
                            break;
                        }
                        case 9: {
                            this.zzj().zzu().zza("Service invalid");
                            v2 = 0;
                            z = false;
                            break;
                        }
                        case 18: {
                            this.zzj().zzu().zza("Service updating");
                            v2 = 1;
                            break;
                        }
                        default: {
                            this.zzj().zzu().zza("Unexpected service status", v1);
                            v2 = 0;
                            z = false;
                        }
                    }
                }
                if(z || !this.zze().zzy()) {
                    v = v2;
                }
                else {
                    this.zzj().zzg().zza("No way to upload. Consider using the full version of Analytics");
                }
                if(v != 0) {
                    this.zzk().zza(z);
                }
            }
            this.zzc = Boolean.valueOf(z);
        }
        return this.zzc.booleanValue();
    }

    @WorkerThread
    private final void zzaq() {
        this.zzt();
        this.zzj().zzp().zza("Processing queued up service tasks", this.zzf.size());
        for(Object object0: this.zzf) {
            Runnable runnable0 = (Runnable)object0;
            try {
                runnable0.run();
            }
            catch(RuntimeException runtimeException0) {
                this.zzj().zzg().zza("Task exception while flushing queue", runtimeException0);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    @WorkerThread
    private final void zzar() {
        this.zzt();
        this.zze.zzb();
        long v = (long)(((Long)zzbh.zzal.zza(null)));
        this.zzd.zza(v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @WorkerThread
    protected final void zzb(boolean z) {
        this.zzt();
        this.zzu();
        if((!zznm.zza() || !this.zze().zza(zzbh.zzcx)) && z) {
            this.zzh().zzaa();
        }
        this.zza(() -> {
            zzgb zzgb0 = this.zzb;
            if(zzgb0 == null) {
                this.zzj().zzg().zza("Failed to send storage consent settings to service");
                return;
            }
            try {
                zzo zzo0 = this.zzc(false);
                Preconditions.checkNotNull(zzo0);
                zzgb0.zzi(zzo0);
                this.zzar();
            }
            catch(RemoteException remoteException0) {
                this.zzj().zzg().zza("Failed to send storage consent settings to the service", remoteException0);
            }
        });
    }

    @WorkerThread
    private final zzo zzc(boolean z) {
        zzgg zzgg0 = this.zzg();
        return z ? zzgg0.zza(this.zzj().zzx()) : zzgg0.zza(null);
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzb zzc() {
        return super.zzc();
    }

    static void zzd(zzls zzls0) {
        zzls0.zzt();
        if(zzls0.zzal()) {
            zzls0.zzj().zzp().zza("Inactivity, disconnecting from the service");
            zzls0.zzaf();
        }
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

    @Override  // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return false;
    }
}

