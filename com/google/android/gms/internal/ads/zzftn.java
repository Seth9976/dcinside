package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

final class zzftn {
    private final zzfvf zza;
    private final Context zzb;
    private final zzfto zzc;
    private final String zzd;
    private final List zze;
    private boolean zzf;
    private final Intent zzg;
    private final IBinder.DeathRecipient zzh;
    @Nullable
    private ServiceConnection zzi;
    @Nullable
    private IInterface zzj;

    zzftn(Context context0, zzfto zzfto0, String s, Intent intent0, zzfss zzfss0) {
        this.zze = new ArrayList();
        this.zzb = context0;
        this.zzc = zzfto0;
        this.zzd = "OverlayDisplayService";
        this.zzg = intent0;
        this.zza = zzfvj.zza(new zzfte("OverlayDisplayService"));
        this.zzh = () -> {
            this.zzc.zzc("%s : Binder has died.", new Object[]{this.zzd});
            synchronized(this.zze) {
                this.zze.clear();
            }
        };
    }

    @Nullable
    public final IInterface zzc() {
        return this.zzj;
    }

    static void zzf(zzftn zzftn0, boolean z) {
        zzftn0.zzf = false;
    }

    public final void zzi(Runnable runnable0) {
        this.zzo(() -> {
            if(this.zzj == null && !this.zzf) {
                this.zzc.zzc("Initiate binding to the service.", new Object[0]);
                synchronized(this.zze) {
                    this.zze.add(runnable0);
                }
                zzftl zzftl0 = new zzftl(this, null);
                this.zzi = zzftl0;
                this.zzf = true;
                if(!this.zzb.bindService(this.zzg, zzftl0, 1)) {
                    this.zzc.zzc("Failed to bind to the service.", new Object[0]);
                    this.zzf = false;
                    synchronized(this.zze) {
                        this.zze.clear();
                    }
                    return;
                }
                return;
            }
            if(this.zzf) {
                this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
                synchronized(this.zze) {
                    this.zze.add(runnable0);
                }
                return;
            }
            runnable0.run();
        });
    }

    // 检测为 Lambda 实现
    final void zzj(Runnable runnable0) [...]

    // 检测为 Lambda 实现
    final void zzk() [...]

    // 检测为 Lambda 实现
    final void zzl(Runnable runnable0) [...]

    // 检测为 Lambda 实现
    final void zzm() [...]

    public final void zzn() {
        this.zzo(() -> if(this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new Object[0]);
            ServiceConnection serviceConnection0 = this.zzi;
            serviceConnection0.getClass();
            this.zzb.unbindService(serviceConnection0);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized(this.zze) {
                this.zze.clear();
            }
        });
    }

    private final void zzo(Runnable runnable0) {
        ((Handler)this.zza.zza()).post(() -> try {
            runnable0.run();
        }
        catch(RuntimeException runtimeException0) {
            this.zzc.zza("error caused by ", new Object[]{runtimeException0});
        });
    }
}

