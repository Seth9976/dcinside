package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import java.util.List;
import java.util.Map;

public abstract class NativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private View zzk;
    private View zzl;
    private Bundle zzm;
    private boolean zzn;
    private boolean zzo;
    private float zzp;

    public NativeAdMapper() {
        this.zzm = new Bundle();
    }

    @NonNull
    public View getAdChoicesContent() {
        return this.zzk;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.zzf;
    }

    @NonNull
    public final String getBody() {
        return this.zzc;
    }

    @NonNull
    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() [...] // Inlined contents

    public float getDuration() [...] // Inlined contents

    @NonNull
    public final Bundle getExtras() {
        return this.zzm;
    }

    @NonNull
    public final String getHeadline() {
        return this.zza;
    }

    @NonNull
    public final Image getIcon() {
        return this.zzd;
    }

    @NonNull
    public final List getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzp;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzo;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzn;
    }

    @NonNull
    public final String getPrice() {
        return this.zzi;
    }

    @NonNull
    public final Double getStarRating() {
        return this.zzg;
    }

    @NonNull
    public final String getStore() {
        return this.zzh;
    }

    public void handleClick(@NonNull View view0) {
    }

    public boolean hasVideoContent() {
        return this.zzj;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@NonNull View view0) {
        this.zzk = view0;
    }

    public final void setAdvertiser(@NonNull String s) {
        this.zzf = s;
    }

    public final void setBody(@NonNull String s) {
        this.zzc = s;
    }

    public final void setCallToAction(@NonNull String s) {
        this.zze = s;
    }

    public final void setExtras(@NonNull Bundle bundle0) {
        this.zzm = bundle0;
    }

    public void setHasVideoContent(boolean z) {
        this.zzj = z;
    }

    public final void setHeadline(@NonNull String s) {
        this.zza = s;
    }

    public final void setIcon(@NonNull Image nativeAd$Image0) {
        this.zzd = nativeAd$Image0;
    }

    public final void setImages(@NonNull List list0) {
        this.zzb = list0;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzp = f;
    }

    public void setMediaView(@NonNull View view0) {
        this.zzl = view0;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzo = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzn = z;
    }

    public final void setPrice(@NonNull String s) {
        this.zzi = s;
    }

    public final void setStarRating(@NonNull Double double0) {
        this.zzg = double0;
    }

    public final void setStore(@NonNull String s) {
        this.zzh = s;
    }

    public void trackViews(@NonNull View view0, @NonNull Map map0, @NonNull Map map1) {
    }

    public void untrackView(@NonNull View view0) {
    }

    @NonNull
    public final View zza() {
        return this.zzl;
    }
}

