package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zzbql extends zzbps {
    private final UnifiedNativeAdMapper zza;

    public zzbql(UnifiedNativeAdMapper unifiedNativeAdMapper0) {
        this.zza = unifiedNativeAdMapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzA() {
        return this.zza.getOverrideClickHandling();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzB() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final double zze() {
        return this.zza.getStarRating() == null ? -1.0 : ((double)this.zza.getStarRating());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final float zzf() {
        return this.zza.getMediaContentAspectRatio();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final float zzg() {
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final float zzh() {
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final Bundle zzi() {
        return this.zza.getExtras();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    @Nullable
    public final zzeb zzj() {
        return this.zza.zzb() == null ? null : this.zza.zzb().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    @Nullable
    public final zzbfp zzk() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    @Nullable
    public final zzbfw zzl() {
        Image nativeAd$Image0 = this.zza.getIcon();
        return nativeAd$Image0 != null ? new zzbfj(nativeAd$Image0.getDrawable(), nativeAd$Image0.getUri(), nativeAd$Image0.getScale(), nativeAd$Image0.zzb(), nativeAd$Image0.zza()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    @Nullable
    public final IObjectWrapper zzm() {
        View view0 = this.zza.getAdChoicesContent();
        return view0 == null ? null : ObjectWrapper.wrap(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    @Nullable
    public final IObjectWrapper zzn() {
        View view0 = this.zza.zza();
        return view0 == null ? null : ObjectWrapper.wrap(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    @Nullable
    public final IObjectWrapper zzo() {
        Object object0 = this.zza.zzc();
        return object0 == null ? null : ObjectWrapper.wrap(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzp() {
        return this.zza.getAdvertiser();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzq() {
        return this.zza.getBody();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzr() {
        return this.zza.getCallToAction();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzs() {
        return this.zza.getHeadline();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzt() {
        return this.zza.getPrice();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzu() {
        return this.zza.getStore();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final List zzv() {
        List list0 = this.zza.getImages();
        List list1 = new ArrayList();
        if(list0 != null) {
            for(Object object0: list0) {
                list1.add(new zzbfj(((Image)object0).getDrawable(), ((Image)object0).getUri(), ((Image)object0).getScale(), ((Image)object0).zzb(), ((Image)object0).zza()));
            }
        }
        return list1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzw(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzx() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzy(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        HashMap hashMap0 = (HashMap)ObjectWrapper.unwrap(iObjectWrapper1);
        HashMap hashMap1 = (HashMap)ObjectWrapper.unwrap(iObjectWrapper2);
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.trackViews(view0, hashMap0, hashMap1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzz(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
    }
}

