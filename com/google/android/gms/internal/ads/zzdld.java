package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

public final class zzdld implements zzfuc {
    public final String zza;
    public final double zzb;
    public final int zzc;
    public final int zzd;

    public zzdld(String s, double f, int v, int v1) {
        this.zza = s;
        this.zzb = f;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        return new zzbfj(new BitmapDrawable(Resources.getSystem(), ((Bitmap)object0)), Uri.parse(this.zza), this.zzb, this.zzc, this.zzd);
    }
}

