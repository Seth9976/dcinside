package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.List;

public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7;
    protected static final double MIN_WIDTH_RATIO = 0.5;

    @Nullable
    public static AdSize findClosestSize(@NonNull Context context0, @NonNull AdSize adSize0, @NonNull List list0) {
        AdSize adSize1 = null;
        if(list0 != null && adSize0 != null) {
            if(!adSize0.zzh() && !adSize0.zzi()) {
                float f = context0.getResources().getDisplayMetrics().density;
                adSize0 = new AdSize(Math.round(((float)adSize0.getWidthInPixels(context0)) / f), Math.round(((float)adSize0.getHeightInPixels(context0)) / f));
            }
            for(Object object0: list0) {
                AdSize adSize2 = (AdSize)object0;
                if(adSize2 != null) {
                    int v = adSize0.getWidth();
                    int v1 = adSize2.getWidth();
                    int v2 = adSize0.getHeight();
                    int v3 = adSize2.getHeight();
                    if(((double)v) * 0.5 <= ((double)v1) && v >= v1) {
                        if(adSize0.zzi()) {
                            if(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzhL)))) > v1 || ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzhM)))) > v3 || adSize0.zza() < v3) {
                                continue;
                            }
                        }
                        else if(!adSize0.zzh()) {
                            if(((double)v2) * 0.7 <= ((double)v3) && v2 >= v3) {
                                goto label_22;
                            }
                            continue;
                        }
                        else if(adSize0.zzb() < v3) {
                            continue;
                        }
                    label_22:
                        if(adSize1 == null || adSize1.getWidth() * adSize1.getHeight() <= adSize2.getWidth() * adSize2.getHeight()) {
                            adSize1 = adSize2;
                        }
                    }
                }
            }
        }
        return adSize1;
    }
}

