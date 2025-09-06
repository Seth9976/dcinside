package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzo;
import d4.c;

public final class SearchAdView extends ViewGroup {
    @c
    private final zzel zza;

    public SearchAdView(@NonNull Context context0) {
        super(context0);
        this.zza = new zzel(this);
    }

    public SearchAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.zza = new zzel(this, attributeSet0, false);
    }

    public SearchAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.zza = new zzel(this, attributeSet0, false);
    }

    public void destroy() {
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

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest0) {
        AdSize adSize0 = this.getAdSize();
        if(!AdSize.SEARCH.equals(adSize0)) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        zzei zzei0 = dynamicHeightSearchAdRequest0.zza();
        this.zza.zzm(zzei0);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull SearchAdRequest searchAdRequest0) {
        this.zza.zzm(searchAdRequest0.zza());
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
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(@NonNull AdListener adListener0) {
        this.zza.zzr(adListener0);
    }

    public void setAdSize(@NonNull AdSize adSize0) {
        this.zza.zzs(new AdSize[]{adSize0});
    }

    public void setAdUnitId(@NonNull String s) {
        this.zza.zzu(s);
    }
}

