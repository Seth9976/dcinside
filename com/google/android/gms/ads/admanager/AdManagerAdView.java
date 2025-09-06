package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbuh;

public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context0) {
        super(context0, 0);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0, true);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v, 0, true);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.zza.zzC();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(this.getContext());
        if(((Boolean)zzbej.zzf.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zzb zzb0 = () -> try {
                this.zza.zzm(adManagerAdRequest0.zza());
            }
            catch(IllegalStateException illegalStateException0) {
                zzbuh.zza(this.getContext()).zzh(illegalStateException0, "AdManagerAdView.loadAd");
            };
            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(zzb0);
            return;
        }
        this.zza.zzm(adManagerAdRequest0.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(@NonNull AdSize[] arr_adSize) {
        if(arr_adSize == null || arr_adSize.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzt(arr_adSize);
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener0) {
        this.zza.zzv(appEventListener0);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzw(z);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions0) {
        this.zza.zzy(videoOptions0);
    }

    // 检测为 Lambda 实现
    final void zza(AdManagerAdRequest adManagerAdRequest0) [...]

    public final boolean zzb(zzby zzby0) {
        return this.zza.zzz(zzby0);
    }
}

