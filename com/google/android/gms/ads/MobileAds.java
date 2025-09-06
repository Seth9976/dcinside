package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbyu;
import java.util.List;

public class MobileAds {
    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(@NonNull Context context0) {
        zzex.zzf().zzn(context0);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzex.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzex.zzf().zzi();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzex.zzf().zzc();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzex.zzf();
        String[] arr_s = TextUtils.split("23.6.0", "\\.");
        if(arr_s.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
        }
        catch(NumberFormatException unused_ex) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void initialize(@NonNull Context context0) {
        zzex.zzf().zzo(context0, null, null);
    }

    public static void initialize(@NonNull Context context0, @NonNull OnInitializationCompleteListener onInitializationCompleteListener0) {
        zzex.zzf().zzo(context0, null, onInitializationCompleteListener0);
    }

    public static void openAdInspector(@NonNull Context context0, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener0) {
        zzex.zzf().zzr(context0, onAdInspectorClosedListener0);
    }

    public static void openDebugMenu(@NonNull Context context0, @NonNull String s) {
        zzex.zzf().zzs(context0, s);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return zzex.zzf().zzz(z);
    }

    @Nullable
    public static CustomTabsSession registerCustomTabsSession(@NonNull Context context0, @NonNull CustomTabsClient customTabsClient0, @NonNull String s, @Nullable CustomTabsCallback customTabsCallback0) {
        zzex.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbyu zzbyu0 = zzbtv.zza(context0);
        if(zzbyu0 == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (CustomTabsSession)ObjectWrapper.unwrap(zzbyu0.zze(ObjectWrapper.wrap(context0), ObjectWrapper.wrap(customTabsClient0), s, ObjectWrapper.wrap(customTabsCallback0)));
        }
        catch(RemoteException | IllegalArgumentException remoteException0) {
            zzo.zzh("Unable to register custom tabs session. Error: ", remoteException0);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class class0) {
        zzex.zzf().zzt(class0);
    }

    public static void registerWebView(@NonNull WebView webView0) {
        zzex.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(webView0 == null) {
            zzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbyu zzbyu0 = zzbtv.zza(webView0.getContext());
        if(zzbyu0 == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zzbyu0.zzj(ObjectWrapper.wrap(webView0));
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    public static void setAppMuted(boolean z) {
        zzex.zzf().zzu(z);
    }

    public static void setAppVolume(float f) {
        zzex.zzf().zzv(f);
    }

    @KeepForSdk
    private static void setPlugin(String s) {
        zzex.zzf().zzw(s);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration0) {
        zzex.zzf().zzx(requestConfiguration0);
    }

    public static void startPreload(@NonNull Context context0, @NonNull List list0, @NonNull PreloadCallback preloadCallback0) {
        zzex.zzf().zzg(context0, list0, preloadCallback0);
    }
}

