package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

final class zzcq {
    private static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        zzcq.zza = "0";
        zzcq.zzb = "1";
        zzcq.zzc = "2";
        zzcq.zzd = "3";
        zzcq.zze = "4";
    }

    public static ArrayList zza(Spanned spanned0) {
        ArrayList arrayList0 = new ArrayList();
        zzcs[] arr_zzcs = (zzcs[])spanned0.getSpans(0, spanned0.length(), zzcs.class);
        for(int v1 = 0; v1 < arr_zzcs.length; ++v1) {
            zzcs zzcs0 = arr_zzcs[v1];
            arrayList0.add(zzcq.zzb(spanned0, zzcs0, 1, zzcs0.zza()));
        }
        zzcu[] arr_zzcu = (zzcu[])spanned0.getSpans(0, spanned0.length(), zzcu.class);
        for(int v2 = 0; v2 < arr_zzcu.length; ++v2) {
            zzcu zzcu0 = arr_zzcu[v2];
            arrayList0.add(zzcq.zzb(spanned0, zzcu0, 2, zzcu0.zza()));
        }
        zzcr[] arr_zzcr = (zzcr[])spanned0.getSpans(0, spanned0.length(), zzcr.class);
        for(int v3 = 0; v3 < arr_zzcr.length; ++v3) {
            arrayList0.add(zzcq.zzb(spanned0, arr_zzcr[v3], 3, null));
        }
        zzcv[] arr_zzcv = (zzcv[])spanned0.getSpans(0, spanned0.length(), zzcv.class);
        for(int v = 0; v < arr_zzcv.length; ++v) {
            zzcv zzcv0 = arr_zzcv[v];
            arrayList0.add(zzcq.zzb(spanned0, zzcv0, 4, zzcv0.zza()));
        }
        return arrayList0;
    }

    private static Bundle zzb(Spanned spanned0, Object object0, int v, @Nullable Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        bundle1.putInt("0", spanned0.getSpanStart(object0));
        bundle1.putInt("1", spanned0.getSpanEnd(object0));
        bundle1.putInt("2", spanned0.getSpanFlags(object0));
        bundle1.putInt("3", v);
        if(bundle0 != null) {
            bundle1.putBundle("4", bundle0);
        }
        return bundle1;
    }
}

