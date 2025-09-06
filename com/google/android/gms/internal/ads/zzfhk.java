package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class zzfhk implements Runnable {
    @VisibleForTesting
    public static final Object zza;
    @GuardedBy("enabledLock")
    @VisibleForTesting
    public static Boolean zzb;
    private static final Object zzc;
    private static final Object zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    @GuardedBy("protoLock")
    private final zzfhp zzg;
    private String zzh;
    private int zzi;
    private final zzdpj zzj;
    private final List zzk;
    @GuardedBy("initLock")
    private boolean zzl;
    private final zzbvs zzm;

    static {
        zzfhk.zza = new Object();
        zzfhk.zzc = new Object();
        zzfhk.zzd = new Object();
    }

    public zzfhk(Context context0, VersionInfoParcel versionInfoParcel0, zzdpj zzdpj0, zzdzq zzdzq0, zzbvs zzbvs0) {
        this.zzg = zzfht.zzb();
        this.zzh = "";
        this.zzl = false;
        this.zze = context0;
        this.zzf = versionInfoParcel0;
        this.zzj = zzdpj0;
        this.zzm = zzbvs0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziJ)).booleanValue()) {
            this.zzk = zzs.zzd();
            return;
        }
        this.zzk = zzfxn.zzn();
    }

    @Override
    public final void run() {
        byte[] arr_b;
        if(zzfhk.zza()) {
            Object object0 = zzfhk.zzc;
            synchronized(object0) {
                if(this.zzg.zza() == 0) {
                    return;
                }
            }
            try {
                synchronized(object0) {
                    arr_b = ((zzfht)this.zzg.zzbn()).zzaV();
                    this.zzg.zzc();
                }
                zzdzn zzdzn0 = new zzdzn(((String)zzbe.zzc().zza(zzbcl.zziD)), 60000, new HashMap(), arr_b, "application/x-protobuf", false);
                String s = this.zzf.afmaVersion;
                int v2 = Binder.getCallingUid();
                new zzdzp(this.zze, s, this.zzm, v2).zzb(zzdzn0);
            }
            catch(Exception exception0) {
                if(!(exception0 instanceof zzdvy) || ((zzdvy)exception0).zza() != 3) {
                    zzv.zzp().zzv(exception0, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public static boolean zza() {
        synchronized(zzfhk.zza) {
            if(zzfhk.zzb == null) {
                zzfhk.zzb = ((Boolean)zzbee.zzb.zze()).booleanValue() ? Boolean.valueOf(Math.random() < ((double)(((Double)zzbee.zza.zze())))) : Boolean.FALSE;
            }
        }
        return zzfhk.zzb.booleanValue();
    }

    public final void zzb(@Nullable zzfha zzfha0) {
        zzfhj zzfhj0 = () -> {
            Object object0 = zzfhk.zzd;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            if(this.zzl) {
            label_18:
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
            }
            else {
                this.zzl = true;
                if(zzfhk.zza()) {
                    try {
                        this.zzh = zzs.zzq(this.zze);
                    }
                    catch(RuntimeException | RemoteException runtimeException0) {
                        zzv.zzp().zzw(runtimeException0, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int v1 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zziE)));
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzlK)).booleanValue()) {
                        zzbzw.zzd.scheduleWithFixedDelay(this, ((long)v1), ((long)v1), TimeUnit.MILLISECONDS);
                    }
                    else {
                        zzbzw.zzd.scheduleAtFixedRate(this, ((long)v1), ((long)v1), TimeUnit.MILLISECONDS);
                    }
                    goto label_18;
                }
                else {
                    FIN.finallyExec$NT(v);
                }
            }
            if(zzfhk.zza() && zzfha0 != null) {
                synchronized(zzfhk.zzc) {
                    if(this.zzg.zza() >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zziF))))) {
                        return;
                    }
                    zzfhl zzfhl0 = zzfho.zza();
                    zzfhl0.zzu(zzfha0.zzm());
                    zzfhl0.zzq(zzfha0.zzl());
                    zzfhl0.zzg(zzfha0.zzb());
                    zzfhl0.zzw(3);
                    zzfhl0.zzn(this.zzf.afmaVersion);
                    zzfhl0.zzb(this.zzh);
                    zzfhl0.zzk(Build.VERSION.RELEASE);
                    zzfhl0.zzr(Build.VERSION.SDK_INT);
                    zzfhl0.zzv(zzfha0.zzo());
                    zzfhl0.zzj(zzfha0.zza());
                    zzfhl0.zze(((long)this.zzi));
                    zzfhl0.zzt(zzfha0.zzn());
                    zzfhl0.zzc(zzfha0.zze());
                    zzfhl0.zzf(zzfha0.zzg());
                    zzfhl0.zzh(zzfha0.zzh());
                    zzfhl0.zzi(this.zzj.zzb(zzfha0.zzh()));
                    zzfhl0.zzl(zzfha0.zzi());
                    zzfhl0.zzm(zzfha0.zzd());
                    zzfhl0.zzd(zzfha0.zzf());
                    zzfhl0.zzs(zzfha0.zzk());
                    zzfhl0.zzo(zzfha0.zzj());
                    zzfhl0.zzp(zzfha0.zzc());
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zziJ)).booleanValue()) {
                        zzfhl0.zza(this.zzk);
                    }
                    zzfhq zzfhq0 = zzfhr.zza();
                    zzfhq0.zza(zzfhl0);
                    this.zzg.zzb(zzfhq0);
                }
            }
        };
        zzbzw.zza.zza(zzfhj0);
    }

    // 检测为 Lambda 实现
    final void zzc(zzfha zzfha0) [...]
}

