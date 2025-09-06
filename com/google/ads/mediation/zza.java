package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

final class zza extends UnifiedNativeAdMapper {
    public zza(UnifiedNativeAd unifiedNativeAd0) {
        this.setHeadline(unifiedNativeAd0.zzh());
        this.setImages(unifiedNativeAd0.zzk());
        this.setBody(unifiedNativeAd0.zzf());
        this.setIcon(unifiedNativeAd0.zzb());
        this.setCallToAction(unifiedNativeAd0.zzg());
        this.setAdvertiser(unifiedNativeAd0.zze());
        this.setStarRating(unifiedNativeAd0.zzc());
        this.setStore(unifiedNativeAd0.zzj());
        this.setPrice(unifiedNativeAd0.zzi());
        this.zzd(unifiedNativeAd0.zzd());
        this.setOverrideImpressionRecording(true);
        this.setOverrideClickHandling(true);
        this.zze(unifiedNativeAd0.zza());
    }

    @Override  // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view0, Map map0, Map map1) {
        if(view0 instanceof zzj || ((zze)zze.zza.get(view0)) != null) {
            throw null;
        }
    }
}

