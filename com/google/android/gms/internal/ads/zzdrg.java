package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzdrg {
    public static Bundle zza(Pair[] arr_pair) {
        Bundle bundle0 = new Bundle();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            for(int v = 0; v < 2; ++v) {
                Pair pair0 = arr_pair[v];
                if(!TextUtils.isEmpty(((CharSequence)pair0.first)) && ((long)(((Long)pair0.second))) > 0L) {
                    bundle0.putLong(((String)pair0.first), ((long)(((Long)pair0.second))));
                }
            }
        }
        return bundle0;
    }
}

