package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;

@KeepForSdkWithMembers
public class MobileAdsInitProvider extends ContentProvider {
    private final zzey zza;

    public MobileAdsInitProvider() {
        this.zza = new zzey();
    }

    @Override  // android.content.ContentProvider
    public void attachInfo(@NonNull Context context0, @NonNull ProviderInfo providerInfo0) {
        this.zza.attachInfo(context0, providerInfo0);
    }

    @Override  // android.content.ContentProvider
    public int delete(@NonNull Uri uri0, @NonNull String s, @NonNull String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri0, @NonNull ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri0, @NonNull String[] arr_s, @NonNull String s, @NonNull String[] arr_s1, @NonNull String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(@NonNull Uri uri0, @NonNull ContentValues contentValues0, @NonNull String s, @NonNull String[] arr_s) {
        return 0;
    }
}

