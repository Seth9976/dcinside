package com.google.android.gms.internal.ads;

import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.j;

@j
public final class zzbuh implements zzbuj {
    @Nullable
    @VisibleForTesting
    public static zzbuj zza;
    @Nullable
    @VisibleForTesting
    static zzbuj zzb;
    @Nullable
    @VisibleForTesting
    static zzbuj zzc;
    @Nullable
    @VisibleForTesting
    static Boolean zzd;
    private static final Object zze;
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    @Nullable
    private final PackageInfo zzk;
    private final String zzl;
    @Nullable
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    static {
        zzbuh.zze = new Object();
    }

    protected zzbuh(Context context0, VersionInfoParcel versionInfoParcel0) {
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zzg = context0;
        this.zzj = versionInfoParcel0;
        String s = null;
        PackageInfo packageInfo0 = null;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhG)).booleanValue() && context0 != null && context0.getApplicationInfo() != null) {
            try {
                packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(context0.getApplicationInfo().packageName, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        this.zzk = packageInfo0;
        this.zzl = ((Boolean)zzbe.zzc().zza(zzbcl.zzhE)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhE)).booleanValue()) {
            Context context1 = this.zzg;
            if(context1 != null) {
                try {
                    PackageInfo packageInfo1 = Wrappers.packageManager(context1).getPackageInfo("com.android.vending", 0x80);
                    if(packageInfo1 != null) {
                        s = Integer.toString(packageInfo1.versionCode);
                        this.zzm = s;
                        return;
                    }
                    this.zzm = s;
                    return;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
            }
        }
        else {
            s = "unknown";
            this.zzm = s;
            return;
        }
        this.zzm = s;
    }

    protected zzbuh(Context context0, VersionInfoParcel versionInfoParcel0, boolean z) {
        this(context0, versionInfoParcel0);
        this.zzo = true;
    }

    public static zzbuj zza(Context context0) {
        synchronized(zzbuh.zze) {
            if(zzbuh.zza == null) {
                zzbuh.zza = zzbuh.zzl(context0) ? new zzbuh(context0, VersionInfoParcel.forPackage()) : new zzbui();
            }
            return zzbuh.zza;
        }
    }

    public static zzbuj zzb(Context context0, VersionInfoParcel versionInfoParcel0) {
        boolean z = false;
        synchronized(zzbuh.zze) {
            if(zzbuh.zzc == null) {
                if(((Boolean)zzbed.zzc.zze()).booleanValue() && (!((Boolean)zzbe.zzc().zza(zzbcl.zzhz)).booleanValue() || ((Boolean)zzbed.zza.zze()).booleanValue())) {
                    z = true;
                }
                if(zzbuh.zzl(context0)) {
                    zzbuh zzbuh0 = new zzbuh(context0, versionInfoParcel0);
                    zzbuh0.zzk();
                    zzbuh0.zzj();
                    zzbuh.zzc = zzbuh0;
                }
                else if(!z || context0 == null) {
                    zzbuh.zzc = new zzbui();
                }
                else {
                    zzbuh zzbuh1 = new zzbuh(context0, versionInfoParcel0, true);
                    zzbuh1.zzk();
                    zzbuh1.zzj();
                    zzbuh.zzc = zzbuh1;
                }
            }
            return zzbuh.zzc;
        }
    }

    public static zzbuj zzc(Context context0) {
        synchronized(zzbuh.zze) {
            if(zzbuh.zzb == null) {
                zzbuh.zzb = !((Boolean)zzbe.zzc().zza(zzbcl.zzhA)).booleanValue() || ((Boolean)zzbe.zzc().zza(zzbcl.zzhz)).booleanValue() ? new zzbui() : new zzbuh(context0, VersionInfoParcel.forPackage());
            }
            return zzbuh.zzb;
        }
    }

    public static zzbuj zzd(Context context0, VersionInfoParcel versionInfoParcel0) {
        synchronized(zzbuh.zze) {
            if(zzbuh.zzb == null) {
                zzbuh.zzb = !((Boolean)zzbe.zzc().zza(zzbcl.zzhA)).booleanValue() || ((Boolean)zzbe.zzc().zza(zzbcl.zzhz)).booleanValue() ? new zzbui() : new zzbuh(context0, versionInfoParcel0);
            }
            return zzbuh.zzb;
        }
    }

    public static String zze(Throwable throwable0) {
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0));
        return stringWriter0.toString();
    }

    public static String zzf(Throwable throwable0) {
        return zzfve.zzc(zzf.zzg(zzbuh.zze(throwable0)));
    }

    protected final void zzg(Thread thread0, Throwable throwable0) {
        if(throwable0 != null) {
            Throwable throwable1 = throwable0;
            boolean z = false;
            boolean z1 = false;
            while(throwable1 != null) {
                StackTraceElement[] arr_stackTraceElement = throwable1.getStackTrace();
                for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                    StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                    z |= zzf.zzo(stackTraceElement0.getClassName());
                    z1 |= "com.google.android.gms.internal.ads.zzbuh".equals(stackTraceElement0.getClassName());
                }
                throwable1 = throwable1.getCause();
            }
            if(z && !z1) {
                if(!this.zzo) {
                    this.zzh(throwable0, "");
                }
                if(!this.zzn.getAndSet(true) && ((Boolean)zzbed.zzc.zze()).booleanValue()) {
                    zzbbv.zzc(this.zzg);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(Throwable throwable0, String s) {
        if(this.zzo) {
            return;
        }
        this.zzi(throwable0, s, 1.0f);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(Throwable throwable0, String s, float f) {
        Throwable throwable1;
        boolean z = false;
        if(!this.zzo) {
            if(((Boolean)zzbeu.zzf.zze()).booleanValue()) {
                throwable1 = throwable0;
                goto label_36;
            }
            else {
                LinkedList linkedList0 = new LinkedList();
                for(Throwable throwable2 = throwable0; throwable2 != null; throwable2 = throwable2.getCause()) {
                    linkedList0.push(throwable2);
                }
                throwable1 = null;
                while(!linkedList0.isEmpty()) {
                    Throwable throwable3 = (Throwable)linkedList0.pop();
                    StackTraceElement[] arr_stackTraceElement = throwable3.getStackTrace();
                    boolean z1 = ((Boolean)zzbe.zzc().zza(zzbcl.zzcs)).booleanValue() && arr_stackTraceElement != null && arr_stackTraceElement.length == 0 && zzf.zzo(throwable3.getClass().getName());
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(new StackTraceElement(throwable3.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                        StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                        if(zzf.zzo(stackTraceElement0.getClassName())) {
                            arrayList0.add(stackTraceElement0);
                            z1 = true;
                        }
                        else {
                            String s1 = stackTraceElement0.getClassName();
                            if(!TextUtils.isEmpty(s1) && (s1.startsWith("android.") || s1.startsWith("java."))) {
                                arrayList0.add(stackTraceElement0);
                            }
                            else {
                                arrayList0.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            }
                        }
                    }
                    if(z1) {
                        throwable1 = throwable1 == null ? new Throwable(throwable3.getMessage()) : new Throwable(throwable3.getMessage(), throwable1);
                        throwable1.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[0])));
                    }
                }
            label_36:
                if(throwable1 != null) {
                    String s2 = throwable0.getClass().getName();
                    String s3 = zzbuh.zze(throwable0);
                    String s4 = ((Boolean)zzbe.zzc().zza(zzbcl.zziI)).booleanValue() ? zzbuh.zzf(throwable0) : "";
                    int v1 = Float.compare(f, 0.0f) <= 0 ? 1 : ((int)(1.0f / f));
                    if(Math.random() < ((double)f)) {
                        ArrayList arrayList1 = new ArrayList();
                        try {
                            z = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                        }
                        catch(Throwable throwable4) {
                            zzo.zzh("Error fetching instant app info", throwable4);
                        }
                        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                        int v2 = Build.VERSION.SDK_INT;
                        String s5 = "1";
                        Uri.Builder uri$Builder1 = uri$Builder0.appendQueryParameter("api", "33").appendQueryParameter("device", (Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL)).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", "com.dcinside.app.android").appendQueryParameter("exceptiontype", s2).appendQueryParameter("stacktrace", s3).appendQueryParameter("eids", TextUtils.join(",", zzbe.zza().zza())).appendQueryParameter("exceptionkey", s).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(v1)).appendQueryParameter("pb_tm", "1.0").appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg))).appendQueryParameter("lite", (this.zzj.isLiteSdk ? "1" : "0"));
                        if(!TextUtils.isEmpty(s4)) {
                            uri$Builder1.appendQueryParameter("hash", s4);
                        }
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhF)).booleanValue()) {
                            ActivityManager.MemoryInfo activityManager$MemoryInfo0 = zzf.zzc(this.zzg);
                            if(activityManager$MemoryInfo0 != null) {
                                uri$Builder1.appendQueryParameter("available_memory", Long.toString(activityManager$MemoryInfo0.availMem));
                                uri$Builder1.appendQueryParameter("total_memory", Long.toString(activityManager$MemoryInfo0.totalMem));
                                if(!activityManager$MemoryInfo0.lowMemory) {
                                    s5 = "0";
                                }
                                uri$Builder1.appendQueryParameter("is_low_memory", s5);
                            }
                        }
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhE)).booleanValue()) {
                            if(!TextUtils.isEmpty(this.zzl)) {
                                uri$Builder1.appendQueryParameter("countrycode", this.zzl);
                            }
                            if(!TextUtils.isEmpty(this.zzm)) {
                                uri$Builder1.appendQueryParameter("psv", this.zzm);
                            }
                            PackageInfo packageInfo0 = null;
                            Context context0 = this.zzg;
                            if(v2 >= 26) {
                                packageInfo0 = WebView.getCurrentWebViewPackage();
                            }
                            else if(context0 != null) {
                                try {
                                    packageInfo0 = Wrappers.packageManager(context0).getPackageInfo("com.android.webview", 0x80);
                                }
                                catch(PackageManager.NameNotFoundException unused_ex) {
                                }
                            }
                            if(packageInfo0 != null) {
                                uri$Builder1.appendQueryParameter("wvvc", Integer.toString(packageInfo0.versionCode));
                                uri$Builder1.appendQueryParameter("wvvn", packageInfo0.versionName);
                                uri$Builder1.appendQueryParameter("wvpn", packageInfo0.packageName);
                            }
                        }
                        PackageInfo packageInfo1 = this.zzk;
                        if(packageInfo1 != null) {
                            uri$Builder1.appendQueryParameter("appvc", String.valueOf(packageInfo1.versionCode));
                            uri$Builder1.appendQueryParameter("appvn", this.zzk.versionName);
                        }
                        arrayList1.add(uri$Builder1.toString());
                        for(Object object0: arrayList1) {
                            zzbue zzbue0 = new zzbue(new zzu(null), ((String)object0));
                            this.zzi.execute(zzbue0);
                        }
                    }
                }
            }
        }
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbuf(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread0 = Looper.getMainLooper().getThread();
        if(thread0 == null) {
            return;
        }
        synchronized(this.zzf) {
            this.zzh.put(thread0, Boolean.TRUE);
        }
        thread0.setUncaughtExceptionHandler(new zzbug(this, thread0.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context0) {
        if(context0 == null) {
            return false;
        }
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzmE)).booleanValue()) {
            return ((Boolean)zzbeu.zze.zze()).booleanValue() && !((Boolean)zzbe.zzc().zza(zzbcl.zzhz)).booleanValue();
        }
        synchronized(zzbuh.zze) {
            if(zzbuh.zzd == null) {
                zzbuh.zzd = Boolean.valueOf(zzbc.zze().nextInt(100) < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmB)))));
            }
        }
        return zzbuh.zzd.booleanValue() && !((Boolean)zzbe.zzc().zza(zzbcl.zzhz)).booleanValue();
    }
}

