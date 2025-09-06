package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcqf extends zzcom {
    private final zzbhn zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcqf(zzcqy zzcqy0, zzbhn zzbhn0, Runnable runnable0, Executor executor0) {
        super(zzcqy0);
        this.zzc = zzbhn0;
        this.zzd = runnable0;
        this.zze = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final int zza() {
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final View zzd() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final zzeb zze() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzf() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzg() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final void zzh() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final void zzi(ViewGroup viewGroup0, zzs zzs0) {
    }

    // 检测为 Lambda 实现
    static void zzj(AtomicReference atomicReference0) [...]

    @Override  // com.google.android.gms.internal.ads.zzcqz
    @WorkerThread
    public final void zzk() {
        zzcqe zzcqe0 = () -> try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(() -> {
                Runnable runnable0 = (Runnable)atomicReference0.getAndSet(null);
                if(runnable0 != null) {
                    runnable0.run();
                }
            });
            if(!this.zzc.zze(iObjectWrapper0)) {
                zzcqf.zzj(((zzcqd)() -> {
                    Runnable runnable0 = (Runnable)atomicReference0.getAndSet(null);
                    if(runnable0 != null) {
                        runnable0.run();
                    }
                }).zza);
            }
        }
        catch(RemoteException unused_ex) {
            zzcqf.zzj(((zzcqd)() -> {
                Runnable runnable0 = (Runnable)atomicReference0.getAndSet(null);
                if(runnable0 != null) {
                    runnable0.run();
                }
            }).zza);
        };
        this.zze.execute(zzcqe0);
    }

    // 检测为 Lambda 实现
    final void zzl(Runnable runnable0) [...]
}

