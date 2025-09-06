package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpz;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import w4.d;

public final class zzgg extends zzh {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private long zzf;
    private List zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;
    private String zzn;

    zzgg(zzhy zzhy0, long v) {
        super(zzhy0);
        this.zzm = 0L;
        this.zzn = null;
        this.zzf = v;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    final zzo zza(String s) {
        String s10;
        int v8;
        boolean z3;
        long v7;
        String s9;
        List list1;
        this.zzt();
        String s1 = this.zzad();
        String s2 = this.zzae();
        this.zzu();
        String s3 = this.zzb;
        long v = (long)this.zzab();
        this.zzu();
        Preconditions.checkNotNull(this.zzd);
        String s4 = this.zzd;
        this.zzu();
        this.zzt();
        if(this.zze == 0L) {
            this.zze = this.zzu.zzt().zza(this.zza(), "com.dcinside.app.android");
        }
        long v1 = this.zze;
        boolean z = this.zzu.zzac();
        int v2 = !this.zzk().zzm;
        this.zzt();
        String s5 = this.zzu.zzac() ? this.zzah() : null;
        long v3 = this.zzu.zzn().zzc.zza();
        long v4 = v3 == 0L ? this.zzu.zza : Math.min(this.zzu.zza, v3);
        int v5 = this.zzaa();
        boolean z1 = this.zze().zzv();
        zzha zzha0 = this.zzk();
        zzha0.zzt();
        boolean z2 = zzha0.zzg().getBoolean("deferred_analytics_collection", false);
        String s6 = this.zzac();
        Boolean boolean0 = this.zze().zze("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolean1 = boolean0 == null ? null : Boolean.valueOf(!boolean0.booleanValue());
        long v6 = this.zzf;
        List list0 = this.zzg;
        String s7 = this.zzk().zzo().zzf();
        if(this.zzh == null) {
            this.zzh = this.zzq().zzp();
        }
        String s8 = this.zzh;
        if(zznm.zza()) {
            list1 = list0;
            s9 = s8;
            if(!this.zze().zza(zzbh.zzcx) || this.zzk().zzo().zza(zza.zzb)) {
                goto label_45;
            }
            else {
                v7 = v6;
                z3 = z;
                v8 = v2;
                s10 = null;
            }
        }
        else {
            list1 = list0;
            s9 = s8;
        label_45:
            this.zzt();
            v7 = v6;
            if(this.zzm == 0L) {
                z3 = z;
                v8 = v2;
            }
            else {
                z3 = z;
                v8 = v2;
                long v9 = this.zzb().currentTimeMillis() - this.zzm;
                if(this.zzl != null && v9 > 86400000L && this.zzn == null) {
                    this.zzag();
                }
            }
            if(this.zzl == null) {
                this.zzag();
            }
            s10 = this.zzl;
        }
        Boolean boolean2 = this.zze().zze("google_analytics_sgtm_upload_enabled");
        boolean z4 = boolean2 == null ? false : boolean2.booleanValue();
        long v10 = this.zzq().zzc(this.zzad());
        int v11 = this.zzk().zzo().zza();
        String s11 = this.zzk().zzn().zzf();
        if(zzpn.zza() && this.zze().zza(zzbh.zzci)) {
            this.zzq();
            int v12 = zzos.zzc();
            return !zzpn.zza() || !this.zze().zza(zzbh.zzci) ? new zzo(s1, s2, s3, v, s4, 106000L, v1, s, z3, ((boolean)v8), s5, 0L, v4, v5, z1, z2, s6, boolean1, v7, list1, null, s7, s9, s10, z4, v10, v11, s11, v12, 0L, this.zze().zzu(), new zzf(this.zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb()) : new zzo(s1, s2, s3, v, s4, 106000L, v1, s, z3, ((boolean)v8), s5, 0L, v4, v5, z1, z2, s6, boolean1, v7, list1, null, s7, s9, s10, z4, v10, v11, s11, v12, this.zzq().zzm(), this.zze().zzu(), new zzf(this.zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb());
        }
        return !zzpn.zza() || !this.zze().zza(zzbh.zzci) ? new zzo(s1, s2, s3, v, s4, 106000L, v1, s, z3, ((boolean)v8), s5, 0L, v4, v5, z1, z2, s6, boolean1, v7, list1, null, s7, s9, s10, z4, v10, v11, s11, 0, 0L, this.zze().zzu(), new zzf(this.zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb()) : new zzo(s1, s2, s3, v, s4, 106000L, v1, s, z3, ((boolean)v8), s5, 0L, v4, v5, z1, z2, s6, boolean1, v7, list1, null, s7, s9, s10, z4, v10, v11, s11, 0, this.zzq().zzm(), this.zze().zzu(), new zzf(this.zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb());
    }

    @WorkerThread
    final int zzaa() {
        this.zzu();
        return this.zzi;
    }

    @WorkerThread
    final int zzab() {
        this.zzu();
        return this.zzc;
    }

    @WorkerThread
    final String zzac() {
        this.zzu();
        return this.zzk;
    }

    @WorkerThread
    final String zzad() {
        this.zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    final String zzae() {
        this.zzt();
        this.zzu();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    @WorkerThread
    final List zzaf() {
        return this.zzg;
    }

    @WorkerThread
    final void zzag() {
        String s;
        this.zzt();
        if(this.zzk().zzo().zza(zza.zzb)) {
            byte[] arr_b = new byte[16];
            this.zzq().zzv().nextBytes(arr_b);
            s = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        else {
            this.zzj().zzc().zza("Analytics Storage consent is not granted");
            s = null;
        }
        this.zzj().zzc().zza(String.format("Resetting session stitching token to %s", (s == null ? "null" : "not null")));
        this.zzl = s;
        this.zzm = this.zzb().currentTimeMillis();
    }

    @VisibleForTesting
    @WorkerThread
    private final String zzah() {
        Object object0;
        Class class0;
        if(zzpz.zza() && this.zze().zza(zzbh.zzbr)) {
            this.zzj().zzp().zza("Disabled IID for tests.");
            return null;
        }
        try {
            class0 = this.zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if(class0 == null) {
                return null;
            }
            goto label_6;
        }
        catch(ClassNotFoundException unused_ex) {
        }
        return null;
        try {
        label_6:
            object0 = class0.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zza());
        }
        catch(Exception unused_ex) {
            this.zzj().zzw().zza("Failed to obtain Firebase Analytics instance");
            return null;
        }
        if(object0 == null) {
            return null;
        }
        try {
            return (String)class0.getDeclaredMethod("getFirebaseInstanceId", null).invoke(object0, null);
        }
        catch(Exception unused_ex) {
            this.zzj().zzv().zza("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    final boolean zzb(String s) {
        boolean z = this.zzn != null && !this.zzn.equals(s);
        this.zzn = s;
        return z;
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

    @Override  // com.google.android.gms.measurement.internal.zzh
    @WorkerThread
    @h4.d({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    protected final void zzx() {
        PackageManager packageManager0 = this.zza().getPackageManager();
        String s = "";
        String s1 = "unknown";
        String s2 = "Unknown";
        int v = 0x80000000;
        if(packageManager0 == null) {
            this.zzj().zzg().zza("PackageManager is null, app identity information might be inaccurate. appId", zzgo.zza("com.dcinside.app.android"));
        }
        else {
            try {
                s1 = packageManager0.getInstallerPackageName("com.dcinside.app.android");
            }
            catch(IllegalArgumentException unused_ex) {
                this.zzj().zzg().zza("Error retrieving app installer package name. appId", zzgo.zza("com.dcinside.app.android"));
            }
            if(s1 == null) {
                s1 = "manual_install";
            }
            else if("com.android.vending".equals(s1)) {
                s1 = "";
            }
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.dcinside.app.android", 0);
                if(packageInfo0 != null) {
                    CharSequence charSequence0 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo);
                    if(!TextUtils.isEmpty(charSequence0)) {
                        charSequence0.toString();
                    }
                    s2 = packageInfo0.versionName;
                    v = packageInfo0.versionCode;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                this.zzj().zzg().zza("Error retrieving package info. appId, appName", zzgo.zza("com.dcinside.app.android"), "Unknown");
            }
        }
        this.zza = "com.dcinside.app.android";
        this.zzd = s1;
        this.zzb = s2;
        this.zzc = v;
        this.zze = 0L;
        boolean z = true;
        boolean z1 = !TextUtils.isEmpty(this.zzu.zzu()) && "am".equals(this.zzu.zzv());
        int v1 = this.zzu.zzc();
        switch(v1) {
            case 0: {
                this.zzj().zzp().zza("App measurement collection enabled");
                break;
            }
            case 1: {
                this.zzj().zzo().zza("App measurement deactivated via the manifest");
                break;
            }
            case 2: {
                this.zzj().zzp().zza("App measurement deactivated via the init parameters");
                break;
            }
            case 3: {
                this.zzj().zzo().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            }
            case 4: {
                this.zzj().zzo().zza("App measurement disabled via the manifest");
                break;
            }
            case 5: {
                this.zzj().zzp().zza("App measurement disabled via the init parameters");
                break;
            }
            case 6: {
                this.zzj().zzv().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            }
            case 7: {
                this.zzj().zzo().zza("App measurement disabled via the global data collection setting");
                break;
            }
            case 8: {
                this.zzj().zzo().zza("App measurement disabled due to denied storage consent");
                break;
            }
            default: {
                this.zzj().zzo().zza("App measurement disabled");
                this.zzj().zzn().zza("Invalid scion state in identity");
            }
        }
        if(v1 != 0) {
            z = false;
        }
        this.zzj = "";
        this.zzk = "";
        if(z1) {
            this.zzk = this.zzu.zzu();
        }
        try {
            String s3 = new zzhs(this.zza(), this.zzu.zzx()).zza("google_app_id");
            if(!TextUtils.isEmpty(s3)) {
                s = s3;
            }
            this.zzj = s;
            if(!TextUtils.isEmpty(s3)) {
                this.zzk = new zzhs(this.zza(), this.zzu.zzx()).zza("admob_app_id");
            }
            if(z) {
                this.zzj().zzp().zza("App measurement enabled for app package, google app id", this.zza, (TextUtils.isEmpty(this.zzj) ? this.zzk : this.zzj));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            this.zzj().zzg().zza("Fetching Google App Id failed with exception. appId", zzgo.zza("com.dcinside.app.android"), illegalStateException0);
        }
        this.zzg = null;
        List list0 = this.zze().zzg("analytics.safelisted_events");
        if(list0 == null) {
            this.zzg = null;
        }
        else if(list0.isEmpty()) {
            this.zzj().zzv().zza("Safelisted event list is empty. Ignoring");
        }
        else {
            for(Object object0: list0) {
                if(this.zzq().zzb("safelisted event", ((String)object0))) {
                    continue;
                }
                goto label_85;
            }
            this.zzg = list0;
        }
    label_85:
        if(packageManager0 != null) {
            this.zzi = InstantApps.isInstantApp(this.zza());
            return;
        }
        this.zzi = 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return true;
    }
}

