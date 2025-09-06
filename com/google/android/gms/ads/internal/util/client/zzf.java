package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzfqw;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzf {
    public static final Handler zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    private static final String zzg;
    private float zzh;

    static {
        zzf.zza = new zzfqw(Looper.getMainLooper());
        zzf.zzb = "com.google.android.gms.ads.AdView";
        zzf.zzc = "com.google.android.gms.ads.interstitial.InterstitialAd";
        zzf.zzd = "com.google.android.gms.ads.admanager.AdManagerAdView";
        zzf.zze = "com.google.android.gms.ads.admanager.AdManagerInterstitialAd";
        zzf.zzf = "com.google.android.gms.ads.search.SearchAdView";
        zzf.zzg = "com.google.android.gms.ads.AdLoader";
    }

    public zzf() {
        this.zzh = -1.0f;
    }

    private final JSONArray zzA(Collection collection0) throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: collection0) {
            this.zzB(jSONArray0, object0);
        }
        return jSONArray0;
    }

    private final void zzB(JSONArray jSONArray0, @Nullable Object object0) throws JSONException {
        if(object0 instanceof Bundle) {
            jSONArray0.put(this.zzi(((Bundle)object0)));
            return;
        }
        if(object0 instanceof Map) {
            jSONArray0.put(this.zzj(((Map)object0)));
            return;
        }
        if(object0 instanceof Collection) {
            jSONArray0.put(this.zzA(((Collection)object0)));
            return;
        }
        if(object0 instanceof Object[]) {
            jSONArray0.put(this.zzh(((Object[])object0)));
            return;
        }
        jSONArray0.put(object0);
    }

    private final void zzC(JSONObject jSONObject0, String s, @Nullable Object object0) throws JSONException {
        Boolean[] arr_boolean;
        Long[] arr_long;
        Double[] arr_double;
        Integer[] arr_integer;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzo)).booleanValue()) {
            s = String.valueOf(s);
        }
        int v = 0;
        if(object0 instanceof Bundle) {
            jSONObject0.put(s, this.zzi(((Bundle)object0)));
            return;
        }
        if(object0 instanceof Map) {
            jSONObject0.put(s, this.zzj(((Map)object0)));
            return;
        }
        if(object0 instanceof Collection) {
            jSONObject0.put(String.valueOf(s), this.zzA(((Collection)object0)));
            return;
        }
        if(object0 instanceof Object[]) {
            jSONObject0.put(s, this.zzA(Arrays.asList(((Object[])object0))));
            return;
        }
        if(object0 instanceof int[]) {
            if(((int[])object0) == null) {
                arr_integer = new Integer[0];
            }
            else {
                Integer[] arr_integer1 = new Integer[((int[])object0).length];
                while(v < ((int[])object0).length) {
                    arr_integer1[v] = (int)((int[])object0)[v];
                    ++v;
                }
                arr_integer = arr_integer1;
            }
            jSONObject0.put(s, this.zzh(arr_integer));
            return;
        }
        if(object0 instanceof double[]) {
            if(((double[])object0) == null) {
                arr_double = new Double[0];
            }
            else {
                Double[] arr_double1 = new Double[((double[])object0).length];
                while(v < ((double[])object0).length) {
                    arr_double1[v] = (double)((double[])object0)[v];
                    ++v;
                }
                arr_double = arr_double1;
            }
            jSONObject0.put(s, this.zzh(arr_double));
            return;
        }
        if(object0 instanceof long[]) {
            if(((long[])object0) == null) {
                arr_long = new Long[0];
            }
            else {
                Long[] arr_long1 = new Long[((long[])object0).length];
                while(v < ((long[])object0).length) {
                    arr_long1[v] = (long)((long[])object0)[v];
                    ++v;
                }
                arr_long = arr_long1;
            }
            jSONObject0.put(s, this.zzh(arr_long));
            return;
        }
        if(object0 instanceof boolean[]) {
            if(((boolean[])object0) == null) {
                arr_boolean = new Boolean[0];
            }
            else {
                Boolean[] arr_boolean1 = new Boolean[((boolean[])object0).length];
                while(v < ((boolean[])object0).length) {
                    arr_boolean1[v] = Boolean.valueOf(((boolean[])object0)[v]);
                    ++v;
                }
                arr_boolean = arr_boolean1;
            }
            jSONObject0.put(s, this.zzh(arr_boolean));
            return;
        }
        jSONObject0.put(s, object0);
    }

    private static final void zzD(ViewGroup viewGroup0, zzs zzs0, @Nullable String s, int v, int v1) {
        if(viewGroup0.getChildCount() != 0) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        TextView textView0 = new TextView(context0);
        textView0.setGravity(17);
        textView0.setText(s);
        textView0.setTextColor(v);
        textView0.setBackgroundColor(v1);
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setBackgroundColor(v);
        int v2 = zzf.zzx(context0, 3);
        frameLayout0.addView(textView0, new FrameLayout.LayoutParams(zzs0.zzf - v2, zzs0.zzc - v2, 17));
        viewGroup0.addView(frameLayout0, zzs0.zzf, zzs0.zzc);
    }

    public static int zza(Context context0, int v) {
        if(context0 != null) {
            if(context0.getApplicationContext() != null) {
                context0 = context0.getApplicationContext();
            }
            Resources resources0 = context0.getResources();
            if(resources0 != null) {
                DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                if(displayMetrics0 != null) {
                    Configuration configuration0 = resources0.getConfiguration();
                    if(configuration0 != null) {
                        int v1 = configuration0.orientation;
                        if(v == 0) {
                            v = v1;
                        }
                        return v == v1 ? Math.round(((float)displayMetrics0.heightPixels) / displayMetrics0.density) : Math.round(((float)displayMetrics0.widthPixels) / displayMetrics0.density);
                    }
                }
            }
        }
        return -1;
    }

    public final int zzb(Context context0, int v) {
        if(this.zzh < 0.0f) {
            synchronized(this) {
                if(this.zzh < 0.0f) {
                    WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                    if(windowManager0 == null) {
                        return 0;
                    }
                    Display display0 = windowManager0.getDefaultDisplay();
                    DisplayMetrics displayMetrics0 = new DisplayMetrics();
                    display0.getMetrics(displayMetrics0);
                    this.zzh = displayMetrics0.density;
                }
            }
        }
        return Math.round(((float)v) / this.zzh);
    }

    @Nullable
    public static ActivityManager.MemoryInfo zzc(Context context0) {
        if(context0 == null) {
            return null;
        }
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        if(activityManager0 == null) {
            return null;
        }
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        try {
            activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
        }
        catch(NullPointerException unused_ex) {
            zzo.zzj("Error retrieving the memory information.");
        }
        return activityManager$MemoryInfo0;
    }

    public static AdSize zzd(Context context0, int v, int v1, int v2) {
        int v3 = zzf.zza(context0, v2);
        if(v3 == -1) {
            return AdSize.INVALID;
        }
        int v4 = Math.min(90, Math.round(((float)v3) * 0.15f));
        if(v > 0x28F) {
            return new AdSize(v, Math.max(Math.min(Math.round(((float)v) / 728.0f * 90.0f), v4), 50));
        }
        if(v > 632) {
            return new AdSize(v, Math.max(Math.min(81, v4), 50));
        }
        if(v > 0x20E) {
            return new AdSize(v, Math.max(Math.min(Math.round(((float)v) / 468.0f * 60.0f), v4), 50));
        }
        return v <= 0x1B0 ? new AdSize(v, Math.max(Math.min(Math.round(((float)v) / 320.0f * 50.0f), v4), 50)) : new AdSize(v, Math.max(Math.min(68, v4), 50));
    }

    public static String zze() [...] // 潜在的解密器

    @Nullable
    public static String zzf(String s) {
        return zzf.zzz(s, "MD5");
    }

    @Nullable
    public static String zzg(String s) {
        return zzf.zzz(s, "SHA-256");
    }

    @VisibleForTesting
    final JSONArray zzh(Object[] arr_object) throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_object.length; ++v) {
            this.zzB(jSONArray0, arr_object[v]);
        }
        return jSONArray0;
    }

    public final JSONObject zzi(Bundle bundle0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            this.zzC(jSONObject0, ((String)object0), bundle0.get(((String)object0)));
        }
        return jSONObject0;
    }

    public final JSONObject zzj(Map map0) throws JSONException {
        try {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: map0.keySet()) {
                this.zzC(jSONObject0, ((String)object0), map0.get(((String)object0)));
            }
            return jSONObject0;
        }
        catch(ClassCastException classCastException0) {
            throw new JSONException("Could not convert map to JSON: " + classCastException0.getMessage());
        }
    }

    public final JSONObject zzk(@Nullable Bundle bundle0, JSONObject jSONObject0) {
        if(bundle0 != null) {
            try {
                return this.zzi(bundle0);
            }
            catch(JSONException jSONException0) {
                zzo.zzh("Error converting Bundle to JSON", jSONException0);
            }
        }
        return null;
    }

    public final void zzl(ViewGroup viewGroup0, zzs zzs0, @Nullable String s, @Nullable String s1) {
        if(s1 != null) {
            zzo.zzj(s1);
        }
        zzf.zzD(viewGroup0, zzs0, s, 0xFFFF0000, 0xFF000000);
    }

    public final void zzm(ViewGroup viewGroup0, zzs zzs0, @Nullable String s) {
        zzf.zzD(viewGroup0, zzs0, "Ads by Google", 0xFF000000, -1);
    }

    public final void zzn(Context context0, @Nullable String s, String s1, Bundle bundle0, boolean z) {
        zzf.zzw(context0, s, "gmob-apps", bundle0, true, new zzc(this));
    }

    // 去混淆评级： 低(40)
    @VisibleForTesting
    public static boolean zzo(String s) {
        return TextUtils.isEmpty(s) ? false : s.startsWith("com.google.");
    }

    public static final int zzp(DisplayMetrics displayMetrics0, int v) {
        return (int)TypedValue.applyDimension(1, ((float)v), displayMetrics0);
    }

    @Nullable
    @VisibleForTesting
    public static final String zzq(StackTraceElement[] arr_stackTraceElement, String s) {
        String s1;
        for(int v = 0; true; ++v) {
            s1 = null;
            if(v + 1 >= arr_stackTraceElement.length) {
                break;
            }
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            String s2 = stackTraceElement0.getClassName();
            if("loadAd".equalsIgnoreCase(stackTraceElement0.getMethodName()) && (zzf.zzb.equalsIgnoreCase(s2) || zzf.zzc.equalsIgnoreCase(s2) || zzf.zzd.equalsIgnoreCase(s2) || zzf.zze.equalsIgnoreCase(s2) || zzf.zzf.equalsIgnoreCase(s2) || zzf.zzg.equalsIgnoreCase(s2))) {
                s1 = arr_stackTraceElement[v + 1].getClassName();
                break;
            }
        }
        if(s != null) {
            StringTokenizer stringTokenizer0 = new StringTokenizer(s, ".");
            StringBuilder stringBuilder0 = new StringBuilder();
            if(stringTokenizer0.hasMoreElements()) {
                stringBuilder0.append(stringTokenizer0.nextToken());
                for(int v1 = 2; v1 > 0 && stringTokenizer0.hasMoreElements(); --v1) {
                    stringBuilder0.append(".");
                    stringBuilder0.append(stringTokenizer0.nextToken());
                }
                s = stringBuilder0.toString();
            }
            return s1 == null || s1.contains(s) ? null : s1;
        }
        return null;
    }

    // 去混淆评级： 中等(50)
    public static final boolean zzr() {
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzlm)).booleanValue();
        return Build.VERSION.SDK_INT < 0x1F ? Build.DEVICE.startsWith("generic") : z && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzs(Context context0, int v) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, v) == 0;
    }

    public static final boolean zzt(Context context0) {
        switch(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, 12451000)) {
            case 0: 
            case 2: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean zzu() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzv(DisplayMetrics displayMetrics0, int v) {
        return Math.round(((float)v) / displayMetrics0.density);
    }

    public static final void zzw(Context context0, @Nullable String s, String s1, Bundle bundle0, boolean z, zze zze0) {
        boolean z1 = context0.getApplicationContext() != null;
        bundle0.putString("os", Build.VERSION.RELEASE);
        bundle0.putString("api", "33");
        bundle0.putString("appid", "com.dcinside.app.android");
        if(s == null) {
            s = GoogleApiAvailabilityLight.getInstance().getApkVersion(context0) + ".244410000";
        }
        bundle0.putString("js", s);
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for(Object object0: bundle0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
        }
        zze0.zza(uri$Builder0.toString());
    }

    public static final int zzx(Context context0, int v) {
        return zzf.zzp(context0.getResources().getDisplayMetrics(), v);
    }

    @Nullable
    public static final String zzy(Context context0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
        if(s == null || zzf.zzr()) {
            s = "emulator";
        }
        return zzf.zzz(s, "MD5");
    }

    @Nullable
    private static String zzz(String s, String s1) {
        for(int v = 0; true; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance(s1);
                messageDigest0.update(s.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest()));
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
            catch(ArithmeticException unused_ex) {
                break;
            }
        }
        return null;
    }
}

