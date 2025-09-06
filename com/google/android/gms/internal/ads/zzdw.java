package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzdw {
    @Nullable
    private static zzdw zza;
    private final Handler zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    @GuardedBy("networkTypeLock")
    private int zze;

    private zzdw(Context context0) {
        this.zzb = new Handler(Looper.getMainLooper());
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context0.registerReceiver(new zzdu(this, null), intentFilter0);
    }

    public final int zza() {
        synchronized(this.zzd) {
        }
        return this.zze;
    }

    public static zzdw zzb(Context context0) {
        synchronized(zzdw.class) {
            if(zzdw.zza == null) {
                zzdw.zza = new zzdw(context0);
            }
            return zzdw.zza;
        }
    }

    static void zzc(zzdw zzdw0, int v) {
        synchronized(zzdw0.zzd) {
            if(zzdw0.zze == v) {
                return;
            }
            zzdw0.zze = v;
        }
        for(Object object1: zzdw0.zzc) {
            WeakReference weakReference0 = (WeakReference)object1;
            zzyl zzyl0 = (zzyl)weakReference0.get();
            if(zzyl0 == null) {
                zzdw0.zzc.remove(weakReference0);
            }
            else {
                zzyl0.zza.zzl(v);
            }
        }
    }

    public final void zzd(zzyl zzyl0) {
        for(Object object0: this.zzc) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0.get() == null) {
                this.zzc.remove(weakReference0);
            }
        }
        WeakReference weakReference1 = new WeakReference(zzyl0);
        this.zzc.add(weakReference1);
        zzds zzds0 = new zzds(this, zzyl0);
        this.zzb.post(zzds0);
    }
}

