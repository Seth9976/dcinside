package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    @NonNull
    public static final AdSize BANNER = null;
    @NonNull
    public static final AdSize FLUID = null;
    @NonNull
    public static final AdSize FULL_BANNER = null;
    public static final int FULL_WIDTH = -1;
    @NonNull
    public static final AdSize INVALID;
    @NonNull
    public static final AdSize LARGE_BANNER;
    @NonNull
    public static final AdSize LEADERBOARD;
    @NonNull
    public static final AdSize MEDIUM_RECTANGLE;
    @NonNull
    public static final AdSize SEARCH;
    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER;
    @NonNull
    public static final AdSize WIDE_SKYSCRAPER;
    @NonNull
    public static final AdSize zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        AdSize.BANNER = new AdSize(320, 50, "320x50_mb");
        AdSize.FULL_BANNER = new AdSize(468, 60, "468x60_as");
        AdSize.LARGE_BANNER = new AdSize(320, 100, "320x100_as");
        AdSize.LEADERBOARD = new AdSize(728, 90, "728x90_as");
        AdSize.MEDIUM_RECTANGLE = new AdSize(300, 0xFA, "300x250_as");
        AdSize.WIDE_SKYSCRAPER = new AdSize(0xA0, 600, "160x600_as");
        AdSize.SMART_BANNER = new AdSize(-1, -2, "smart_banner");
        AdSize.FLUID = new AdSize(-3, -4, "fluid");
        AdSize.INVALID = new AdSize(0, 0, "invalid");
        AdSize.zza = new AdSize(50, 50, "50x50_mb");
        AdSize.SEARCH = new AdSize(-3, 0, "search_v2");
    }

    public AdSize(int v, int v1) {
        this(v, v1, (v == -1 ? "FULL" : String.valueOf(v)) + "x" + (v1 == -2 ? "AUTO" : String.valueOf(v1)) + "_as");
    }

    AdSize(int v, int v1, String s) {
        if(v < 0 && (v != -3 && v != -1)) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + v);
        }
        if(v1 < 0 && (v1 != -4 && v1 != -2)) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + v1);
        }
        this.zzb = v;
        this.zzc = v1;
        this.zzd = s;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof AdSize ? this.zzb == ((AdSize)object0).zzb && this.zzc == ((AdSize)object0).zzc && this.zzd.equals(((AdSize)object0).zzd) : false;
    }

    @NonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context0, int v) {
        AdSize adSize0 = zzf.zzd(context0, v, 50, 0);
        adSize0.zze = true;
        return adSize0;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context0, int v) {
        int v1 = zzf.zza(context0, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.zzg = v1;
        adSize0.zzf = true;
        return adSize0;
    }

    @NonNull
    @Deprecated
    public static AdSize getCurrentOrientationInterscrollerAdSize(@NonNull Context context0, int v) {
        return AdSize.zzj(v, zzf.zza(context0, 0));
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@NonNull Context context0) {
        int v = this.zzc;
        switch(v) {
            case -4: 
            case -3: {
                return -1;
            }
            case -2: {
                return zzs.zza(context0.getResources().getDisplayMetrics());
            }
            default: {
                return zzf.zzx(context0, v);
            }
        }
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int v, int v1) {
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.zzg = v1;
        adSize0.zzf = true;
        if(v1 < 0x20) {
            zzo.zzj(("The maximum height set for the inline adaptive ad size was " + v1 + " dp, which is below the minimum recommended value of 32 dp."));
        }
        return adSize0;
    }

    @NonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context0, int v) {
        AdSize adSize0 = zzf.zzd(context0, v, 50, 2);
        adSize0.zze = true;
        return adSize0;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context0, int v) {
        int v1 = zzf.zza(context0, 2);
        AdSize adSize0 = new AdSize(v, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        adSize0.zzg = v1;
        adSize0.zzf = true;
        return adSize0;
    }

    @NonNull
    @Deprecated
    public static AdSize getLandscapeInterscrollerAdSize(@NonNull Context context0, int v) {
        return AdSize.zzj(v, zzf.zza(context0, 2));
    }

    @NonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context0, int v) {
        AdSize adSize0 = zzf.zzd(context0, v, 50, 1);
        adSize0.zze = true;
        return adSize0;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context0, int v) {
        int v1 = zzf.zza(context0, 1);
        AdSize adSize0 = new AdSize(v, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        adSize0.zzg = v1;
        adSize0.zzf = true;
        return adSize0;
    }

    @NonNull
    @Deprecated
    public static AdSize getPortraitInterscrollerAdSize(@NonNull Context context0, int v) {
        return AdSize.zzj(v, zzf.zza(context0, 1));
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@NonNull Context context0) {
        int v = this.zzb;
        switch(v) {
            case -3: {
                return -1;
            }
            case -1: {
                return context0.getResources().getDisplayMetrics().widthPixels;
            }
            default: {
                return zzf.zzx(context0, v);
            }
        }
    }

    @Override
    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @Override
    @NonNull
    public String toString() {
        return this.zzd;
    }

    final int zza() {
        return this.zzi;
    }

    final int zzb() {
        return this.zzg;
    }

    final void zzc(int v) {
        this.zzg = v;
    }

    final void zzd(int v) {
        this.zzi = v;
    }

    final void zze(boolean z) {
        this.zzf = true;
    }

    final void zzf(boolean z) {
        this.zzh = true;
    }

    final boolean zzg() {
        return this.zze;
    }

    final boolean zzh() {
        return this.zzf;
    }

    final boolean zzi() {
        return this.zzh;
    }

    private static AdSize zzj(int v, int v1) {
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.zzi = v1;
        adSize0.zzh = true;
        return adSize0;
    }
}

