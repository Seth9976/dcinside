package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o3.j;

@j
public final class zzbzm {
    private final Object zza;
    private final zzj zzb;
    private final zzbzq zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    @Nullable
    private zzbcq zzh;
    @Nullable
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbzk zzl;
    private final Object zzm;
    @GuardedBy("grantedPermissionLock")
    private t0 zzn;
    private final AtomicBoolean zzo;

    public zzbzm() {
        this.zza = new Object();
        zzj zzj0 = new zzj();
        this.zzb = zzj0;
        this.zzc = new zzbzq(zzbc.zzd(), zzj0);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbzk(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final boolean zzA(Context context0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzim)).booleanValue()) {
            return this.zzo.get();
        }
        NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    @Nullable
    public final Context zzd() {
        return this.zze;
    }

    @Nullable
    public final Resources zze() {
        if(this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkL)).booleanValue()) {
                return zzs.zza(this.zze).getResources();
            }
            zzs.zza(this.zze).getResources();
            return null;
        }
        catch(zzr zzr0) {
        }
        zzo.zzk("Cannot load resource from dynamite apk or local jar", zzr0);
        return null;
    }

    @Nullable
    public final zzbcq zzg() {
        synchronized(this.zza) {
        }
        return this.zzh;
    }

    public final zzbzq zzh() {
        return this.zzc;
    }

    public final zzg zzi() {
        synchronized(this.zza) {
        }
        return this.zzb;
    }

    public final t0 zzk() {
        if(this.zze != null && !((Boolean)zzbe.zzc().zza(zzbcl.zzcW)).booleanValue()) {
            Object object0 = this.zzm;
            synchronized(object0) {
                t0 t00 = this.zzn;
                if(t00 != null) {
                    return t00;
                }
                zzbzh zzbzh0 = () -> {
                    PackageInfo packageInfo0;
                    Context context0 = zzbvu.zza(this.zze);
                    ArrayList arrayList0 = new ArrayList();
                    try {
                        packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(context0.getApplicationInfo().packageName, 0x1000);
                        if(packageInfo0.requestedPermissions != null && packageInfo0.requestedPermissionsFlags != null) {
                            goto label_4;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                    return arrayList0;
                label_4:
                    for(int v = 0; true; ++v) {
                        String[] arr_s = packageInfo0.requestedPermissions;
                        if(v >= arr_s.length) {
                            break;
                        }
                        if((packageInfo0.requestedPermissionsFlags[v] & 2) != 0) {
                            arrayList0.add(arr_s[v]);
                        }
                    }
                    return arrayList0;
                };
                t0 t01 = zzbzw.zza.zzb(zzbzh0);
                this.zzn = t01;
                return t01;
            }
        }
        return zzgch.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        synchronized(this.zza) {
        }
        return this.zzi;
    }

    public final String zzn() {
        return this.zzg;
    }

    // 检测为 Lambda 实现
    final ArrayList zzo() throws Exception [...]

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzu(Context context0, VersionInfoParcel versionInfoParcel0) {
        zzbcq zzbcq0;
        synchronized(this.zza) {
            if(!this.zzd) {
                this.zze = context0.getApplicationContext();
                this.zzf = versionInfoParcel0;
                zzv.zzb().zzc(this.zzc);
                this.zzb.zzp(this.zze);
                zzbuh.zzb(this.zze, this.zzf);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzcf)).booleanValue()) {
                    zzbcq0 = new zzbcq();
                }
                else {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbcq0 = null;
                }
                this.zzh = zzbcq0;
                if(zzbcq0 != null) {
                    zzbzz.zza(new zzbzi(this).zzb(), "AppState.registerCsiReporter");
                }
                Context context1 = this.zze;
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzim)).booleanValue()) {
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)context1.getSystemService("connectivity");
                    try {
                        connectivityManager0.registerDefaultNetworkCallback(new zzbzj(this));
                    }
                    catch(RuntimeException runtimeException0) {
                        zzo.zzk("Failed to register network callback", runtimeException0);
                        this.zzo.set(true);
                    }
                }
                this.zzd = true;
                this.zzk();
            }
        }
        zzv.zzq().zzc(context0, versionInfoParcel0.afmaVersion);
    }

    public final void zzv(Throwable throwable0, String s) {
        zzbuh.zzb(this.zze, this.zzf).zzi(throwable0, s, ((Double)zzbeu.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable throwable0, String s) {
        zzbuh.zzb(this.zze, this.zzf).zzh(throwable0, s);
    }

    public final void zzx(Throwable throwable0, String s) {
        zzbuh.zzd(this.zze, this.zzf).zzh(throwable0, s);
    }

    public final void zzy(Boolean boolean0) {
        synchronized(this.zza) {
            this.zzi = boolean0;
        }
    }

    public final void zzz(String s) {
        this.zzg = s;
    }
}

