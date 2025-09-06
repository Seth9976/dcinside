package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfdf {
    @GuardedBy("LiteSdkInfoRetriever.class")
    private static zzfdf zza;
    private final Context zzb;
    private final zzcw zzc;
    private final AtomicReference zzd;

    @VisibleForTesting
    zzfdf(Context context0, zzcw zzcw0) {
        this.zzd = new AtomicReference();
        this.zzb = context0;
        this.zzc = zzcw0;
    }

    @VisibleForTesting
    static zzcw zza(Context context0) {
        try {
            return zzcv.asInterface(((IBinder)context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context0)));
        }
        catch(ClassCastException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException classCastException0) {
            zzo.zzh("Failed to retrieve lite SDK info.", classCastException0);
            return null;
        }
    }

    public final zzbpe zzb() {
        return (zzbpe)this.zzd.get();
    }

    public final VersionInfoParcel zzc(int v, boolean z, int v1) {
        boolean z1 = zzs.zzF(this.zzb);
        VersionInfoParcel versionInfoParcel0 = new VersionInfoParcel(244410000, v1, true, z1);
        if(((Boolean)zzbem.zzc.zze()).booleanValue()) {
            zzfb zzfb0 = this.zzg();
            return zzfb0 == null ? versionInfoParcel0 : new VersionInfoParcel(244410000, zzfb0.zza(), true, z1);
        }
        return versionInfoParcel0;
    }

    public static zzfdf zzd(Context context0) {
        synchronized(zzfdf.class) {
            zzfdf zzfdf0 = zzfdf.zza;
            if(zzfdf0 != null) {
                return zzfdf0;
            }
            Context context1 = context0.getApplicationContext();
            long v1 = (long)(((Long)zzbem.zzb.zze()));
            zzfdf zzfdf1 = new zzfdf(context1, (v1 <= 0L || v1 > 244410203L ? null : zzfdf.zza(context1)));
            zzfdf.zza = zzfdf1;
            return zzfdf1;
        }
    }

    // 去混淆评级： 低(20)
    public final String zze() {
        return this.zzg() == null ? null : "23.6.0";
    }

    public final void zzf(zzbpe zzbpe0) {
        if(((Boolean)zzbem.zza.zze()).booleanValue()) {
            zzcw zzcw0 = this.zzc;
            zzbpe zzbpe1 = null;
            if(zzcw0 != null) {
                try {
                    zzbpe1 = zzcw0.getAdapterCreator();
                }
                catch(RemoteException unused_ex) {
                }
            }
            AtomicReference atomicReference0 = this.zzd;
            if(zzbpe1 != null) {
                zzbpe0 = zzbpe1;
            }
            zzfde.zza(atomicReference0, null, zzbpe0);
            return;
        }
        zzfde.zza(this.zzd, null, zzbpe0);
    }

    private final zzfb zzg() {
        zzcw zzcw0 = this.zzc;
        if(zzcw0 != null) {
            try {
                return zzcw0.getLiteSdkVersion();
            }
            catch(RemoteException unused_ex) {
            }
        }
        return null;
    }
}

