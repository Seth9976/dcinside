package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import w4.d;

public final class zzag extends zzja {
    private Boolean zza;
    private String zzb;
    private zzai zzc;
    private Boolean zzd;

    zzag(zzhy zzhy0) {
        super(zzhy0);
        this.zzc = new zzaf();
    }

    private final String zza(String s, String s1) {
        try {
            String s2 = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, s1);
            Preconditions.checkNotNull(s2);
            return s2;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            this.zzj().zzg().zza("Could not find SystemProperties class", classNotFoundException0);
            return s1;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            this.zzj().zzg().zza("Could not find SystemProperties.get() method", noSuchMethodException0);
            return s1;
        }
        catch(IllegalAccessException illegalAccessException0) {
            this.zzj().zzg().zza("Could not access SystemProperties.get()", illegalAccessException0);
            return s1;
        }
        catch(InvocationTargetException invocationTargetException0) {
            this.zzj().zzg().zza("SystemProperties.get() threw an exception", invocationTargetException0);
            return s1;
        }
    }

    @WorkerThread
    public final double zza(String s, zzfz zzfz0) {
        if(TextUtils.isEmpty(s)) {
            return (double)(((Double)zzfz0.zza(null)));
        }
        String s1 = this.zzc.zza(s, zzfz0.zza());
        if(TextUtils.isEmpty(s1)) {
            return (double)(((Double)zzfz0.zza(null)));
        }
        try {
            return (double)(((Double)zzfz0.zza(Double.parseDouble(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (double)(((Double)zzfz0.zza(null)));
        }
    }

    final int zza(@Size(min = 1L) String s) {
        return this.zza(s, zzbh.zzaj, 500, 2000);
    }

    @WorkerThread
    public final int zza(String s, zzfz zzfz0, int v, int v1) {
        return Math.max(Math.min(this.zzb(s, zzfz0), v1), v);
    }

    // 去混淆评级： 低(20)
    final int zza(String s, boolean z) {
        return z ? this.zza(s, zzbh.zzat, 100, 500) : 500;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Context zza() {
        return super.zza();
    }

    final void zza(zzai zzai0) {
        this.zzc = zzai0;
    }

    public final boolean zza(zzfz zzfz0) {
        return this.zzf(null, zzfz0);
    }

    @VisibleForTesting
    private final Bundle zzaa() {
        try {
            if(this.zza().getPackageManager() == null) {
                this.zzj().zzg().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo0 = Wrappers.packageManager(this.zza()).getApplicationInfo("com.dcinside.app.android", 0x80);
            if(applicationInfo0 == null) {
                this.zzj().zzg().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo0.metaData;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        this.zzj().zzg().zza("Failed to load metadata: Package name not found", packageManager$NameNotFoundException0);
        return null;
    }

    public final int zzb(@Size(min = 1L) String s) {
        return this.zza(s, zzbh.zzak, 25, 100);
    }

    @WorkerThread
    public final int zzb(String s, zzfz zzfz0) {
        if(TextUtils.isEmpty(s)) {
            return (int)(((Integer)zzfz0.zza(null)));
        }
        String s1 = this.zzc.zza(s, zzfz0.zza());
        if(TextUtils.isEmpty(s1)) {
            return (int)(((Integer)zzfz0.zza(null)));
        }
        try {
            return (int)(((Integer)zzfz0.zza(Integer.parseInt(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (int)(((Integer)zzfz0.zza(null)));
        }
    }

    final int zzb(String s, boolean z) {
        return Math.max(this.zza(s, z), 0x100);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    // 去混淆评级： 低(20)
    public final int zzc() {
        return this.zzq().zza(201500000, true) ? 100 : 25;
    }

    @WorkerThread
    public final int zzc(@Size(min = 1L) String s) {
        return this.zzb(s, zzbh.zzo);
    }

    @WorkerThread
    public final long zzc(String s, zzfz zzfz0) {
        if(TextUtils.isEmpty(s)) {
            return (long)(((Long)zzfz0.zza(null)));
        }
        String s1 = this.zzc.zza(s, zzfz0.zza());
        if(TextUtils.isEmpty(s1)) {
            return (long)(((Long)zzfz0.zza(null)));
        }
        try {
            return (long)(((Long)zzfz0.zza(Long.parseLong(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (long)(((Long)zzfz0.zza(null)));
        }
    }

    public final zzjh zzc(String s, boolean z) {
        Object object0;
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.zzaa();
        if(bundle0 == null) {
            this.zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            object0 = null;
        }
        else {
            object0 = bundle0.get(s);
        }
        if(object0 == null) {
            return zzjh.zza;
        }
        if(Boolean.TRUE.equals(object0)) {
            return zzjh.zzd;
        }
        if(Boolean.FALSE.equals(object0)) {
            return zzjh.zzc;
        }
        if(z && "eu_consent_policy".equals(object0)) {
            return zzjh.zzb;
        }
        this.zzj().zzu().zza("Invalid manifest metadata for", s);
        return zzjh.zza;
    }

    @WorkerThread
    final long zzd(String s) {
        return this.zzc(s, zzbh.zza);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    // 去混淆评级： 低(20)
    @WorkerThread
    public final String zzd(String s, zzfz zzfz0) {
        return TextUtils.isEmpty(s) ? ((String)zzfz0.zza(null)) : ((String)zzfz0.zza(this.zzc.zza(s, zzfz0.zza())));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @VisibleForTesting
    final Boolean zze(@Size(min = 1L) String s) {
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.zzaa();
        if(bundle0 == null) {
            this.zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        return bundle0.containsKey(s) ? Boolean.valueOf(bundle0.getBoolean(s)) : null;
    }

    public final boolean zze(String s, zzfz zzfz0) {
        return this.zzf(s, zzfz0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @WorkerThread
    final String zzf(String s) {
        return this.zzd(s, zzbh.zzan);
    }

    @WorkerThread
    public final boolean zzf(String s, zzfz zzfz0) {
        if(TextUtils.isEmpty(s)) {
            return ((Boolean)zzfz0.zza(null)).booleanValue();
        }
        String s1 = this.zzc.zza(s, zzfz0.zza());
        return TextUtils.isEmpty(s1) ? ((Boolean)zzfz0.zza(null)).booleanValue() : ((Boolean)zzfz0.zza(Boolean.valueOf("1".equals(s1)))).booleanValue();
    }

    public static long zzg() {
        return (long)(((Long)zzbh.zzd.zza(null)));
    }

    @VisibleForTesting
    final List zzg(@Size(min = 1L) String s) {
        Integer integer0;
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.zzaa();
        if(bundle0 == null) {
            this.zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            integer0 = null;
        }
        else {
            integer0 = bundle0.containsKey(s) ? bundle0.getInt(s) : null;
        }
        if(integer0 == null) {
            return null;
        }
        try {
            String[] arr_s = this.zza().getResources().getStringArray(((int)integer0));
            return arr_s == null ? null : Arrays.asList(arr_s);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            this.zzj().zzg().zza("Failed to load string array from metadata: resource not found", resources$NotFoundException0);
            return null;
        }
    }

    public static long zzh() {
        return (long)(((int)(((Integer)zzbh.zzk.zza(null)))));
    }

    public final void zzh(String s) {
        this.zzb = s;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @WorkerThread
    final boolean zzi(String s) {
        return this.zzf(s, zzbh.zzam);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    public final boolean zzj(String s) {
        return "1".equals(this.zzc.zza(s, "gaia_collection_enabled"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    public final boolean zzk(String s) {
        return "1".equals(this.zzc.zza(s, "measurement.event_sampling_enabled"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    public static long zzm() {
        return (long)(((Long)zzbh.zzae.zza(null)));
    }

    public static long zzn() {
        return (long)(((Long)zzbh.zzz.zza(null)));
    }

    public final String zzo() {
        return this.zza("debug.firebase.analytics.app", "");
    }

    public final String zzp() {
        return this.zza("debug.deferred.deeplink", "");
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

    public final String zzu() {
        return this.zzb;
    }

    public final boolean zzv() {
        Boolean boolean0 = this.zze("google_analytics_adid_collection_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zzw() {
        Boolean boolean0 = this.zze("google_analytics_automatic_screen_reporting_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zzx() {
        Boolean boolean0 = this.zze("firebase_analytics_collection_deactivated");
        return boolean0 != null && boolean0.booleanValue();
    }

    @WorkerThread
    final boolean zzy() {
        if(this.zza == null) {
            Boolean boolean0 = this.zze("app_measurement_lite");
            this.zza = boolean0;
            if(boolean0 == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzag();
    }

    @h4.d({"this.isMainProcess"})
    public final boolean zzz() {
        if(this.zzd == null) {
            synchronized(this) {
                if(this.zzd == null) {
                    ApplicationInfo applicationInfo0 = this.zza().getApplicationInfo();
                    String s = ProcessUtils.getMyProcessName();
                    if(applicationInfo0 != null) {
                        this.zzd = Boolean.valueOf(applicationInfo0.processName != null && applicationInfo0.processName.equals(s));
                    }
                    if(this.zzd == null) {
                        this.zzd = Boolean.TRUE;
                        this.zzj().zzg().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzd.booleanValue();
    }
}

