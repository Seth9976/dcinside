package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.mediation.NetworkExtras;
import d4.c;

@Deprecated
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    @NonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    @c
    private final zzei zza;
    private final String zzb;

    SearchAdRequest(zzb zzb0, zzc zzc0) {
        this.zzb = zzb0.zzb;
        this.zza = new zzei(zzb0.zza, this);
    }

    @Deprecated
    public int getAnchorTextColor() {
        return 0;
    }

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getBackgroundGradientBottom() {
        return 0;
    }

    @Deprecated
    public int getBackgroundGradientTop() {
        return 0;
    }

    @Deprecated
    public int getBorderColor() {
        return 0;
    }

    @Deprecated
    public int getBorderThickness() {
        return 0;
    }

    @Deprecated
    public int getBorderType() {
        return 0;
    }

    @Deprecated
    public int getCallButtonColor() {
        return 0;
    }

    @Nullable
    @Deprecated
    public String getCustomChannels() {
        return null;
    }

    @Nullable
    public Bundle getCustomEventExtrasBundle(@NonNull Class class0) {
        return this.zza.zzd(class0);
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @Nullable
    @Deprecated
    public String getFontFace() {
        return null;
    }

    @Deprecated
    public int getHeaderTextColor() {
        return 0;
    }

    @Deprecated
    public int getHeaderTextSize() {
        return 0;
    }

    @NonNull
    public Location getLocation() {
        return null;
    }

    @Nullable
    @Deprecated
    public NetworkExtras getNetworkExtras(@NonNull Class class0) {
        return this.zza.zzh(class0);
    }

    @Nullable
    public Bundle getNetworkExtrasBundle(@NonNull Class class0) {
        return this.zza.zzf(class0);
    }

    @NonNull
    public String getQuery() {
        return this.zzb;
    }

    public boolean isTestDevice(@NonNull Context context0) {
        return this.zza.zzs(context0);
    }

    final zzei zza() {
        return this.zza;
    }
}

