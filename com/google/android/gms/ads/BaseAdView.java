package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import d4.c;

public abstract class BaseAdView extends ViewGroup {
    @c
    protected final zzel zza;

    protected BaseAdView(@NonNull Context context0, int v) {
        super(context0);
        this.zza = new zzel(this, v);
    }

    protected BaseAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        this.zza = new zzel(this, attributeSet0, false, v);
    }

    protected BaseAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v);
        this.zza = new zzel(this, attributeSet0, false, v1);
    }

    protected BaseAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v, int v1, boolean z) {
        super(context0, attributeSet0, v);
        this.zza = new zzel(this, attributeSet0, z, v1);
    }

    protected BaseAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, boolean z) {
        super(context0, attributeSet0);
        this.zza = new zzel(this, attributeSet0, z);
    }

    public void destroy() {
        zzbcl.zza(this.getContext());
        if(((Boolean)zzbej.zze.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzkX)).booleanValue()) {
            zze zze0 = new zze(this);
            zzb.zzb.execute(zze0);
            return;
        }
        this.zza.zzk();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.zza.zza();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza.zzj();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdRequest adRequest0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(this.getContext());
        if(((Boolean)zzbej.zzf.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zzg zzg0 = new zzg(this, adRequest0);
            zzb.zzb.execute(zzg0);
            return;
        }
        this.zza.zzm(adRequest0.zza);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 != null && view0.getVisibility() != 8) {
            int v4 = view0.getMeasuredWidth();
            int v5 = view0.getMeasuredHeight();
            int v6 = (v2 - v - v4) / 2;
            int v7 = (v3 - v1 - v5) / 2;
            view0.layout(v6, v7, v4 + v6, v5 + v7);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v3;
        AdSize adSize0;
        int v2 = 0;
        View view0 = this.getChildAt(0);
        if(view0 == null || view0.getVisibility() == 8) {
            try {
                adSize0 = this.getAdSize();
            }
            catch(NullPointerException nullPointerException0) {
                zzo.zzh("Unable to retrieve ad size.", nullPointerException0);
                adSize0 = null;
            }
            if(adSize0 == null) {
                v3 = 0;
            }
            else {
                Context context0 = this.getContext();
                int v4 = adSize0.getWidthInPixels(context0);
                v3 = adSize0.getHeightInPixels(context0);
                v2 = v4;
            }
        }
        else {
            this.measureChild(view0, v, v1);
            v2 = view0.getMeasuredWidth();
            v3 = view0.getMeasuredHeight();
        }
        int v5 = Math.max(v2, this.getSuggestedMinimumWidth());
        int v6 = Math.max(v3, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSize(v5, v), View.resolveSize(v6, v1));
    }

    public void pause() {
        zzbcl.zza(this.getContext());
        if(((Boolean)zzbej.zzg.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzkY)).booleanValue()) {
            zzf zzf0 = new zzf(this);
            zzb.zzb.execute(zzf0);
            return;
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbcl.zza(this.getContext());
        if(((Boolean)zzbej.zzh.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzkW)).booleanValue()) {
            zzd zzd0 = new zzd(this);
            zzb.zzb.execute(zzd0);
            return;
        }
        this.zza.zzp();
    }

    public void setAdListener(@NonNull AdListener adListener0) {
        this.zza.zzr(adListener0);
        if(adListener0 == null) {
            this.zza.zzq(null);
            return;
        }
        if(adListener0 instanceof zza) {
            this.zza.zzq(((zza)adListener0));
        }
        if(adListener0 instanceof AppEventListener) {
            this.zza.zzv(((AppEventListener)adListener0));
        }
    }

    public void setAdSize(@NonNull AdSize adSize0) {
        this.zza.zzs(new AdSize[]{adSize0});
    }

    public void setAdUnitId(@NonNull String s) {
        this.zza.zzu(s);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener0) {
        this.zza.zzx(onPaidEventListener0);
    }
}

