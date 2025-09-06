package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzbqk implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbfl zzg;
    private final List zzh;
    private final boolean zzi;
    private final Map zzj;

    public zzbqk(@Nullable Date date0, int v, @Nullable Set set0, @Nullable Location location0, boolean z, int v1, zzbfl zzbfl0, List list0, boolean z1, int v2, String s) {
        this.zza = date0;
        this.zzb = v;
        this.zzc = set0;
        this.zze = location0;
        this.zzd = z;
        this.zzf = v1;
        this.zzg = zzbfl0;
        this.zzi = z1;
        this.zzh = new ArrayList();
        this.zzj = new HashMap();
        if(list0 != null) {
            for(Object object0: list0) {
                String s1 = (String)object0;
                if(s1.startsWith("custom:")) {
                    String[] arr_s = s1.split(":", 3);
                    if(arr_s.length != 3) {
                        continue;
                    }
                    if("true".equals(arr_s[2])) {
                        this.zzj.put(arr_s[1], Boolean.TRUE);
                    }
                    else {
                        if(!"false".equals(arr_s[2])) {
                            continue;
                        }
                        this.zzj.put(arr_s[1], Boolean.FALSE);
                    }
                }
                else {
                    this.zzh.add(s1);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzex.zzf().zza();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        Builder nativeAdOptions$Builder0 = new Builder();
        zzbfl zzbfl0 = this.zzg;
        if(zzbfl0 == null) {
            return nativeAdOptions$Builder0.build();
        }
        switch(zzbfl0.zza) {
            case 2: {
                nativeAdOptions$Builder0.setAdChoicesPlacement(zzbfl0.zze);
                nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbfl0.zzb);
                nativeAdOptions$Builder0.setImageOrientation(zzbfl0.zzc);
                nativeAdOptions$Builder0.setRequestMultipleImages(zzbfl0.zzd);
                return nativeAdOptions$Builder0.build();
            }
            case 3: {
                break;
            }
            case 4: {
                nativeAdOptions$Builder0.setRequestCustomMuteThisAd(zzbfl0.zzg);
                nativeAdOptions$Builder0.setMediaAspectRatio(zzbfl0.zzh);
                break;
            }
            default: {
                nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbfl0.zzb);
                nativeAdOptions$Builder0.setImageOrientation(zzbfl0.zzc);
                nativeAdOptions$Builder0.setRequestMultipleImages(zzbfl0.zzd);
                return nativeAdOptions$Builder0.build();
            }
        }
        zzga zzga0 = zzbfl0.zzf;
        if(zzga0 != null) {
            nativeAdOptions$Builder0.setVideoOptions(new VideoOptions(zzga0));
        }
        nativeAdOptions$Builder0.setAdChoicesPlacement(zzbfl0.zze);
        nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbfl0.zzb);
        nativeAdOptions$Builder0.setImageOrientation(zzbfl0.zzc);
        nativeAdOptions$Builder0.setRequestMultipleImages(zzbfl0.zzd);
        return nativeAdOptions$Builder0.build();
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    @NonNull
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbfl.zza(this.zzg);
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzex.zzf().zzy();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}

