package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzbcl;

@TargetApi(24)
public class zzu extends zzt {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzd(Activity activity0, Configuration configuration0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeR)).booleanValue()) {
            return false;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeT)).booleanValue()) {
            return activity0.isInMultiWindowMode();
        }
        int v = zzf.zzx(activity0, configuration0.screenHeightDp);
        int v1 = zzf.zzx(activity0, configuration0.screenWidthDp);
        DisplayMetrics displayMetrics0 = zzs.zzu(((WindowManager)activity0.getApplicationContext().getSystemService("window")));
        int v2 = displayMetrics0.heightPixels;
        int v3 = displayMetrics0.widthPixels;
        int v4 = activity0.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int v5 = v4 <= 0 ? 0 : activity0.getResources().getDimensionPixelSize(v4);
        int v6 = ((int)Math.round(((double)activity0.getResources().getDisplayMetrics().density) + 0.5)) * ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzeP))));
        return !zzu.zze(v2, v + v5, v6) || !zzu.zze(v3, v1, v6);
    }

    @VisibleForTesting
    static final boolean zze(int v, int v1, int v2) {
        return Math.abs(v - v1) <= v2;
    }
}

