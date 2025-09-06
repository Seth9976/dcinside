package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcex;

@VisibleForTesting
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcex zzcex0) throws zzg {
        this.zzb = zzcex0.getLayoutParams();
        ViewParent viewParent0 = zzcex0.getParent();
        this.zzd = zzcex0.zzE();
        if(viewParent0 == null || !(viewParent0 instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.zzc = (ViewGroup)viewParent0;
        this.zza = ((ViewGroup)viewParent0).indexOfChild(zzcex0.zzF());
        ((ViewGroup)viewParent0).removeView(zzcex0.zzF());
        zzcex0.zzaq(true);
    }
}

