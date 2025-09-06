package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzceo;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfbo;
import com.google.android.gms.internal.ads.zzfbr;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzhfk;
import com.google.common.util.concurrent.t0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzs {
    public static final zzfqw zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicBoolean zze;
    private boolean zzf;
    private final Object zzg;
    @GuardedBy("userAgentLock")
    private String zzh;
    private volatile String zzi;
    private boolean zzj;
    private boolean zzk;
    private final Executor zzl;

    static {
        zzs.zza = new zzf(Looper.getMainLooper());
    }

    public zzs() {
        this.zzb = new AtomicReference(null);
        this.zzc = new AtomicReference(null);
        this.zzd = new AtomicReference(new Bundle());
        this.zze = new AtomicBoolean();
        this.zzf = true;
        this.zzg = new Object();
        this.zzj = false;
        this.zzk = false;
        this.zzl = Executors.newSingleThreadExecutor();
    }

    @Nullable
    public static final zzbr zzA(Context context0) {
        Object object0;
        try {
            object0 = context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception exception0) {
            zzv.zzp().zzw(exception0, "Failed to instantiate WorkManagerUtil");
            return null;
        }
        if(!(object0 instanceof IBinder)) {
            zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        }
        if(((IBinder)object0) != null) {
            IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterface0 instanceof zzbr ? ((zzbr)iInterface0) : new zzbp(((IBinder)object0));
        }
        return null;
    }

    public static final boolean zzB(Context context0, String s) {
        return Wrappers.packageManager(zzbvu.zza(context0)).checkPermission(s, "com.dcinside.app.android") == 0;
    }

    public static final boolean zzC(Context context0) {
        try {
            return DeviceProperties.isBstar(context0);
        }
        catch(NoSuchMethodError unused_ex) {
            return false;
        }
    }

    public static final boolean zzD(String s) {
        if(!zzl.zzk()) {
            return false;
        }
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeY)).booleanValue()) {
            return false;
        }
        String s1 = (String)zzbe.zzc().zza(zzbcl.zzfa);
        if(!s1.isEmpty()) {
            String[] arr_s = s1.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                if(arr_s[v].equals(s)) {
                    return false;
                }
            }
        }
        String s2 = (String)zzbe.zzc().zza(zzbcl.zzeZ);
        if(s2.isEmpty()) {
            return true;
        }
        String[] arr_s1 = s2.split(";");
        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
            if(arr_s1[v1].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzE(Context context0) {
        if(context0 == null) {
            return false;
        }
        KeyguardManager keyguardManager0 = zzs.zzY(context0);
        return keyguardManager0 != null && keyguardManager0.isKeyguardLocked();
    }

    public static final boolean zzF(Context context0) {
        try {
            context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        }
        catch(ClassNotFoundException unused_ex) {
            return true;
        }
        catch(Throwable throwable0) {
            zzo.zzh("Error loading class.", throwable0);
            zzv.zzp().zzw(throwable0, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        switch(Process.myUid()) {
            case 0: 
            case 1000: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean zzH(Context context0) {
        try {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
            if(activityManager0 != null && keyguardManager0 != null) {
                List list0 = activityManager0.getRunningAppProcesses();
                if(list0 == null) {
                    return false;
                }
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(Process.myPid() == activityManager$RunningAppProcessInfo0.pid) {
                        if(activityManager$RunningAppProcessInfo0.importance != 100 || keyguardManager0.inKeyguardRestrictedInputMode()) {
                            break;
                        }
                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                        return powerManager0 == null || !powerManager0.isScreenOn();
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static final boolean zzI(Context context0) {
        try {
            Bundle bundle0 = zzs.zzZ(context0);
            String s = bundle0.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if(TextUtils.isEmpty(zzs.zzaa(bundle0)) && !TextUtils.isEmpty(s)) {
                return true;
            }
        }
        catch(RemoteException unused_ex) {
        }
        return false;
    }

    public static final boolean zzJ(Context context0) {
        if(!(context0 instanceof Activity)) {
            return false;
        }
        Window window0 = ((Activity)context0).getWindow();
        if(window0 != null && window0.getDecorView() != null) {
            Rect rect0 = new Rect();
            Rect rect1 = new Rect();
            window0.getDecorView().getGlobalVisibleRect(rect0, null);
            window0.getDecorView().getWindowVisibleDisplayFrame(rect1);
            return rect0.bottom != 0 && rect1.bottom != 0 && rect0.top == rect1.top;
        }
        return false;
    }

    public static final void zzK(View view0, int v, MotionEvent motionEvent0) {
        String s2;
        int v3;
        int v2;
        int v1;
        String s;
        int[] arr_v = new int[2];
        Rect rect0 = new Rect();
        try {
            if(view0 instanceof zzdoz) {
                view0 = ((zzdoz)view0).getChildAt(0);
            }
            if(view0 instanceof zzj) {
                s = "NATIVE";
                v1 = 1;
            }
            else if(!(view0 instanceof NativeAdView)) {
                s = "UNKNOWN";
                v1 = 0;
            }
            else {
                s = "NATIVE";
                v1 = 1;
            }
            if(view0.getLocalVisibleRect(rect0)) {
                v2 = rect0.width();
                v3 = rect0.height();
            }
            else {
                v3 = 0;
                v2 = 0;
            }
            String s1 = "none";
            long v4 = zzs.zzx(view0);
            view0.getLocationOnScreen(arr_v);
            int v5 = arr_v[0];
            int v6 = arr_v[1];
            if(view0 instanceof zzcga) {
                zzfbr zzfbr0 = ((zzcga)view0).zzR();
                if(zzfbr0 == null) {
                    s2 = "none";
                }
                else {
                    s2 = zzfbr0.zzb;
                    view0.setContentDescription(s2 + ":" + view0.hashCode());
                }
            }
            else {
                s2 = "none";
            }
            if(view0 instanceof zzceo) {
                zzfbo zzfbo0 = ((zzceo)view0).zzD();
                if(zzfbo0 != null) {
                    s = zzfbo.zza(zzfbo0.zzb);
                    v1 = zzfbo0.zze;
                    s1 = zzfbo0.zzE;
                }
            }
            zzo.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", view0.hashCode(), "com.dcinside.app.android", s1, s2, s, v1, view0.getClass().getName(), v5, v6, view0.getWidth(), view0.getHeight(), v2, v3, v4, Integer.toString(v, 2)));
            return;
        }
        catch(Exception exception0) {
        }
        zzo.zzh("Failure getting view location.", exception0);
    }

    public static final AlertDialog.Builder zzL(Context context0) {
        return new AlertDialog.Builder(context0, 0x1030226);
    }

    public static final void zzM(Context context0, String s, String s1) {
        new zzbw(context0, s, s1, null, null).zzb();
    }

    public static final void zzN(Context context0, Throwable throwable0) {
        if(context0 != null) {
            try {
                if(((Boolean)zzbeu.zzb.zze()).booleanValue()) {
                    goto label_2;
                }
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
        label_2:
            CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
        }
    }

    public static final int zzO(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException numberFormatException0) {
            zzo.zzj(("Could not parse value:" + numberFormatException0.toString()));
            return 0;
        }
    }

    // 检测为 Lambda 实现
    @Nullable
    public static final Map zzP(Uri uri0) [...]

    public static final int[] zzQ(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            return view0 == null ? zzs.zzv() : new int[]{view0.getWidth(), view0.getHeight()};
        }
        return zzs.zzv();
    }

    public static final int[] zzR(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            if(view0 != null) {
                new int[]{view0.getTop(), view0.getBottom()};
                int v = view0.getTop();
                int v1 = view0.getBottom();
                return new int[]{zzbc.zzb().zzb(activity0, v), zzbc.zzb().zzb(activity0, v1)};
            }
        }
        int[] arr_v = zzs.zzv();
        return new int[]{zzbc.zzb().zzb(activity0, arr_v[0]), zzbc.zzb().zzb(activity0, arr_v[1])};
    }

    public static final boolean zzS(View view0, PowerManager powerManager0, KeyguardManager keyguardManager0) {
        boolean z;
        if(zzv.zzq().zzf || keyguardManager0 == null) {
            z = true;
        }
        else if(keyguardManager0.inKeyguardRestrictedInputMode() && !zzs.zzo(view0)) {
            z = false;
        }
        else {
            z = true;
        }
        long v = zzs.zzx(view0);
        return view0.getVisibility() == 0 && view0.isShown() && (powerManager0 == null || powerManager0.isScreenOn()) ? z && (!((Boolean)zzbe.zzc().zza(zzbcl.zzbu)).booleanValue() || view0.getLocalVisibleRect(new Rect()) || view0.getGlobalVisibleRect(new Rect())) && (!((Boolean)zzbe.zzc().zza(zzbcl.zzkv)).booleanValue() || v >= ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkx))))))) : false;
    }

    public static final void zzT(Context context0, Intent intent0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkS)).booleanValue()) {
            try {
                zzs.zzad(context0, intent0);
            }
            catch(SecurityException securityException0) {
                zzo.zzk("", securityException0);
                zzv.zzp().zzw(securityException0, "AdUtil.startActivityWithUnknownContext");
            }
            return;
        }
        zzs.zzad(context0, intent0);
    }

    public static final void zzU(Context context0, Uri uri0) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            Bundle bundle0 = new Bundle();
            intent0.putExtras(bundle0);
            zzs.zzp(context0, intent0);
            bundle0.putString("com.android.browser.application_id", "com.dcinside.app.android");
            context0.startActivity(intent0);
            zzo.zze(("Opening " + uri0.toString() + " in a new browser."));
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzo.zzh("No browser is found.", activityNotFoundException0);
        }
    }

    public static final int[] zzV(Activity activity0) {
        int[] arr_v = zzs.zzQ(activity0);
        return new int[]{zzbc.zzb().zzb(activity0, arr_v[0]), zzbc.zzb().zzb(activity0, arr_v[1])};
    }

    public static final boolean zzW(View view0, Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? zzs.zzS(view0, null, zzs.zzY(context0)) : zzs.zzS(view0, ((PowerManager)context1.getSystemService("power")), zzs.zzY(context0));
    }

    public static final void zzX(Context context0, Intent intent0, @Nullable zzdrw zzdrw0, String s) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmU)).booleanValue() && context0 instanceof zzcgq) {
            try {
                Uri uri0 = intent0.getData();
                if(uri0 != null && uri0.toString() != null && uri0.toString().matches(((String)zzbe.zzc().zza(zzbcl.zzmW)))) {
                    ((zzcgq)context0).zzc(intent0, 0xEC);
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzmV)).booleanValue() && zzdrw0 != null) {
                        zzdrv zzdrv0 = zzdrw0.zza();
                        zzdrv0.zzb("action", "hila");
                        zzdrv0.zzb("gqi", zzfve.zzc(s));
                        zzdrv0.zzf();
                        return;
                    }
                    return;
                }
                zzs.zzT(context0, intent0);
                return;
            }
            catch(ActivityNotFoundException | SecurityException activityNotFoundException0) {
            }
            catch(Exception exception0) {
                zzo.zzh("Error occurred while starting activity for result", exception0);
                zzv.zzp().zzw(exception0, "AdUtil.startActivityForResult");
                zzs.zzT(context0, intent0);
                return;
            }
            zzo.zzh("Error occurred while starting activity for result", activityNotFoundException0);
            zzv.zzp().zzw(activityNotFoundException0, "AdUtil.startActivityForResult");
            zzs.zzT(context0, intent0);
            return;
        }
        zzs.zzT(context0, intent0);
    }

    @Nullable
    private static KeyguardManager zzY(Context context0) {
        Object object0 = context0.getSystemService("keyguard");
        return object0 == null || !(object0 instanceof KeyguardManager) ? null : ((KeyguardManager)object0);
    }

    @Nullable
    private static Bundle zzZ(Context context0) throws RemoteException {
        try {
            return Wrappers.packageManager(context0).getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
        }
        catch(PackageManager.NameNotFoundException | NullPointerException packageManager$NameNotFoundException0) {
            zze.zzb("Error getting metadata", packageManager$NameNotFoundException0);
            return null;
        }
    }

    public static int zza(int v) {
        if(v >= 5000) {
            return v;
        }
        if(v > 0) {
            zzo.zzj(("HTTP timeout too low: " + v + " milliseconds. Reverting to default timeout: 60000 milliseconds."));
        }
        return 60000;
    }

    private static String zzaa(Bundle bundle0) {
        if(bundle0 != null) {
            String s = bundle0.getString("com.google.android.gms.ads.APPLICATION_ID");
            return TextUtils.isEmpty(s) || !s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") && !s.matches("^/\\d+~.+$") ? "" : s;
        }
        return "";
    }

    private static boolean zzab(String s, AtomicReference atomicReference0, String s1) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Pattern pattern0 = (Pattern)atomicReference0.get();
            if(pattern0 == null || !s1.equals(pattern0.pattern())) {
                pattern0 = Pattern.compile(s1);
                atomicReference0.set(pattern0);
            }
            return pattern0.matcher(s).matches();
        }
        catch(PatternSyntaxException unused_ex) {
            return false;
        }
    }

    private static final void zzac(Context context0, Uri uri0) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(uri0);
        intent0.addFlags(0x10000000);
        context0.startActivity(intent0);
    }

    private static final void zzad(Context context0, Intent intent0) {
        try {
            context0.startActivity(intent0);
        }
        catch(Throwable unused_ex) {
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
        }
    }

    private static final String zzae(Context context0, String s) {
        String s2;
        String s1;
        if(s != null) {
            try {
                zzcg zzcg0 = zzcg.zza();
                if(TextUtils.isEmpty(zzcg0.zza)) {
                    zzcg0.zza = (String)zzcd.zza(context0, new zzcf(GooglePlayServicesUtilLight.getRemoteContext(context0), context0));
                }
                s1 = zzcg0.zza;
            }
            catch(Exception unused_ex) {
                s1 = null;
            }
            if(TextUtils.isEmpty(s1)) {
                s1 = WebSettings.getDefaultUserAgent(context0);
            }
            if(TextUtils.isEmpty(s1)) {
                s1 = zzs.zzr();
            }
            try {
                s2 = s1 + " (Mobile; " + s;
                if(Wrappers.packageManager(context0).isCallerInstantApp()) {
                    return s2 + ";aia" + ")";
                }
            }
            catch(Exception exception0) {
                zzv.zzp().zzw(exception0, "AdUtil.getUserAgent");
            }
            return s2 + ")";
        }
        return zzs.zzr();
    }

    public final t0 zzb(Uri uri0) {
        return zzgch.zzj(() -> {
            if(uri0 == null) {
                return null;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzp)).booleanValue()) {
                Map map0 = new HashMap();
                if(!uri0.isOpaque()) {
                    String s = uri0.getEncodedQuery();
                    if(s != null) {
                        for(int v = 0; true; v = v1 + 1) {
                            int v1 = s.indexOf(38, v);
                            int v2 = v1 == -1 ? s.length() : v1;
                            int v3 = s.indexOf(61, v);
                            v3 = v3 <= v2 && v3 != -1 ? s.indexOf(61, v) : v2;
                            ((HashMap)map0).put(Uri.decode(s.substring(v, v3)), (v3 == v2 ? "" : Uri.decode(s.substring(v3 + 1, v2))));
                            if(v1 == -1) {
                                break;
                            }
                        }
                    }
                }
                return map0;
            }
            Map map1 = new HashMap();
            for(Object object0: uri0.getQueryParameterNames()) {
                String s1 = (String)object0;
                if(!TextUtils.isEmpty(s1)) {
                    ((HashMap)map1).put(s1, uri0.getQueryParameter(s1));
                }
            }
            return map1;
        }, this.zzl);
    }

    public final String zzc(Context context0, String s) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzle)).booleanValue()) {
            if(this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzs.zzae(context0, s);
            return this.zzi;
        }
        synchronized(this.zzg) {
            String s1 = this.zzh;
            if(s1 != null) {
                return s1;
            }
            String s2 = zzs.zzae(context0, s);
            this.zzh = s2;
            return s2;
        }
    }

    public static List zzd() {
        List list0 = zzbe.zza().zzb();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            for(Object object1: zzfvc.zzb(zzfty.zzc(',')).zzd(((String)object0))) {
                String s = (String)object1;
                try {
                    list1.add(Long.valueOf(s));
                }
                catch(NumberFormatException unused_ex) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return list1;
    }

    public final void zzf(Context context0, String s, boolean z, HttpURLConnection httpURLConnection0, boolean z1, int v) {
        int v1 = zzs.zza(v);
        zzo.zzi(("HTTP timeout: " + v1 + " milliseconds."));
        httpURLConnection0.setConnectTimeout(v1);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setReadTimeout(v1);
        if(TextUtils.isEmpty(httpURLConnection0.getRequestProperty("User-Agent"))) {
            httpURLConnection0.setRequestProperty("User-Agent", this.zzc(context0, s));
        }
        httpURLConnection0.setUseCaches(false);
    }

    // 检测为 Lambda 实现
    final void zzg(Context context0, String s, SharedPreferences sharedPreferences0, String s1) [...]

    public static void zzh(Runnable runnable0) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable0.run();
            return;
        }
        zzbzw.zza.execute(runnable0);
    }

    public final void zzi(Context context0, @Nullable String s, String s1, Bundle bundle0, boolean z) {
        bundle0.putString("device", zzs.zzs());
        bundle0.putString("eids", TextUtils.join(",", zzbe.zza().zza()));
        if(bundle0.isEmpty()) {
            zzo.zze("Empty or null bundle.");
        }
        else {
            String s2 = (String)zzbe.zzc().zza(zzbcl.zzkt);
            if(!this.zze.getAndSet(true)) {
                Bundle bundle1 = zzad.zza(context0, s2, (SharedPreferences sharedPreferences0, String s1) -> {
                    Bundle bundle0 = zzad.zzb(context0, s2);
                    this.zzd.set(bundle0);
                });
                this.zzd.set(bundle1);
            }
            bundle0.putAll(((Bundle)this.zzd.get()));
        }
        com.google.android.gms.ads.internal.util.client.zzf.zzw(context0, s, "gmob-apps", bundle0, true, new com.google.android.gms.ads.internal.util.zzl(context0, s));
    }

    public final boolean zzj(String s) {
        String s1 = (String)zzbe.zzc().zza(zzbcl.zzao);
        return zzs.zzab(s, this.zzb, s1);
    }

    public final boolean zzk(String s) {
        String s1 = (String)zzbe.zzc().zza(zzbcl.zzap);
        return zzs.zzab(s, this.zzc, s1);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context0) {
        if(this.zzk) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbcl.zza(context0);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context0.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter0);
        }
        else {
            context0.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter0, 4);
        }
        this.zzk = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzm(Context context0) {
        if(this.zzj) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        zzbcl.zza(context0);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context0.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter0);
        }
        else {
            context0.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter0, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(Context context0, Uri uri0) {
        if(context0 == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if(!(context0 instanceof Activity)) {
            zzs.zzac(context0, uri0);
            return 2;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
            CustomTabsIntent customTabsIntent0 = new Builder(zzv.zzf().zza()).d();
            String s = zzhfk.zza(context0);
            customTabsIntent0.a.setPackage(s);
            customTabsIntent0.t(context0, uri0);
            return 5;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeE)).booleanValue()) {
            zzbdm zzbdm0 = new zzbdm();
            zzbdm0.zze(new com.google.android.gms.ads.internal.util.zzo(this, zzbdm0, context0, uri0));
            zzbdm0.zzb(((Activity)context0));
            return 5;
        }
        zzs.zzac(context0, uri0);
        return 9;
    }

    public static final boolean zzo(View view0) {
        Activity activity0;
        View view1 = view0.getRootView();
        WindowManager.LayoutParams windowManager$LayoutParams0 = null;
        if(view1 == null) {
            activity0 = null;
        }
        else {
            Context context0 = view1.getContext();
            activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
        }
        if(activity0 == null) {
            return false;
        }
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            windowManager$LayoutParams0 = window0.getAttributes();
        }
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x80000) != 0;
    }

    public static final void zzp(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        Bundle bundle0 = intent0.getExtras() == null ? new Bundle() : intent0.getExtras();
        bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle0.putString("com.android.browser.application_id", "com.dcinside.app.android");
        intent0.putExtras(bundle0);
    }

    public static final String zzq(Context context0) throws RemoteException {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        return zzs.zzaa(zzs.zzZ(context0));
    }

    static final String zzr() {
        StringBuilder stringBuilder0 = new StringBuilder(0x100);
        stringBuilder0.append("Mozilla/5.0 (Linux; U; Android");
        String s = Build.VERSION.RELEASE;
        if(s != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(s);
        }
        stringBuilder0.append("; ");
        stringBuilder0.append(Locale.getDefault());
        String s1 = Build.DEVICE;
        if(s1 != null) {
            stringBuilder0.append("; ");
            stringBuilder0.append(s1);
            String s2 = Build.DISPLAY;
            if(s2 != null) {
                stringBuilder0.append(" Build/");
                stringBuilder0.append(s2);
            }
        }
        stringBuilder0.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    public static final String zzs() {
        return Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL;
    }

    @Nullable
    public static final Integer zzt(Context context0) {
        Object object0 = context0.getSystemService("display");
        return object0 instanceof DisplayManager ? ((int)((DisplayManager)object0).getDisplays().length) : null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0;
    }

    protected static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final Map zzw(String s) {
        JSONObject jSONObject0;
        Map map0 = new HashMap();
        try {
            jSONObject0 = new JSONObject(s);
        }
        catch(JSONException jSONException0) {
            zzv.zzp().zzw(jSONException0, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map0;
        }
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            HashSet hashSet0 = new HashSet();
            JSONArray jSONArray0 = jSONObject0.optJSONArray(s1);
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s2 = jSONArray0.optString(v);
                    if(s2 != null) {
                        hashSet0.add(s2);
                    }
                }
                map0.put(s1, hashSet0);
            }
        }
        return map0;
    }

    public static final long zzx(View view0) {
        float f1;
        float f = 3.402823E+38f;
        do {
            f1 = 0.0f;
            if(!(view0 instanceof View)) {
                break;
            }
            f = Math.min(f, view0.getAlpha());
            view0 = view0.getParent();
        }
        while(f > 0.0f);
        if(f >= 0.0f) {
            f1 = f;
        }
        return (long)Math.round(f1 * 100.0f);
    }

    @Nullable
    public static final WebResourceResponse zzy(Context context0, String s, String s1) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("User-Agent", zzv.zzq().zzc(context0, s));
            hashMap0.put("Cache-Control", "max-stale=3600");
            String s2 = (String)new zzbo(context0).zzb(0, s1, hashMap0, null).get(60L, TimeUnit.SECONDS);
            if(s2 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(s2.getBytes("UTF-8")));
            }
        }
        catch(IOException | ExecutionException | InterruptedException | TimeoutException iOException0) {
            zzo.zzk("Could not fetch MRAID JS.", iOException0);
        }
        return null;
    }

    public static final String zzz() {
        Resources resources0 = zzv.zzp().zze();
        return resources0 == null ? "Test Ad" : resources0.getString(string.s7);
    }
}

