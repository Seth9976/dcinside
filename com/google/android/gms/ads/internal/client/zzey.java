package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbow;

public final class zzey extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final void attachInfo(Context context0, ProviderInfo providerInfo0) {
        String s1;
        String s;
        Bundle bundle0 = null;
        try {
            bundle0 = Wrappers.packageManager(context0).getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
        }
        catch(NullPointerException nullPointerException0) {
            zzo.zzh("Failed to load metadata: Null pointer exception.", nullPointerException0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzo.zzh("Failed to load metadata: Package name not found.", packageManager$NameNotFoundException0);
        }
        zzbow zzbow0 = zzbow.zza();
        if(bundle0 == null) {
            zzo.zzg("Metadata was null.");
        }
        else {
            try {
                s = (String)bundle0.get("com.google.android.gms.ads.APPLICATION_ID");
            }
            catch(ClassCastException classCastException0) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", classCastException0);
            }
            try {
                Boolean boolean0 = (Boolean)bundle0.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
            }
            catch(ClassCastException classCastException1) {
                throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", classCastException1);
            }
            try {
                s1 = (String)bundle0.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
            }
            catch(ClassCastException classCastException2) {
                throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", classCastException2);
            }
            if(s != null) {
                if(!s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                    throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                }
                zzo.zze(("Publisher provided Google AdMob App ID in manifest: " + s));
                if(boolean0 != null && boolean0.booleanValue()) {
                    goto label_33;
                }
                zzbow0.zzb(context0, s);
                goto label_33;
            }
            if(TextUtils.isEmpty(s1)) {
                throw new IllegalStateException("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
            }
            zzo.zze(("The Google Mobile Ads SDK is integrated by " + s1));
        }
    label_33:
        if(bundle0 != null) {
            boolean z = bundle0.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z1 = bundle0.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if(z) {
                zzo.zze("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if(z1) {
                zzo.zze("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context0, providerInfo0);
    }

    @Override  // android.content.ContentProvider
    public final int delete(@NonNull Uri uri0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri0, ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final int update(@NonNull Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return 0;
    }
}

