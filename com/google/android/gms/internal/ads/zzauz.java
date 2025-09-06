package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zzauz extends zzauy {
    private zzauz(Context context0, zzaux zzaux0) {
        super(context0, zzaux0);
    }

    @Override  // com.google.android.gms.internal.ads.zzauy
    protected final List zzq(zzawd zzawd0, Context context0, zzasc zzasc0, zzarp zzarp0) {
        if(zzawd0.zzk() != null && this.zzu.zza) {
            int v = zzawd0.zza();
            List list0 = new ArrayList();
            list0.addAll(super.zzq(zzawd0, context0, zzasc0, null));
            list0.add(new zzawv(zzawd0, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzasc0, v, 24));
            return list0;
        }
        return super.zzq(zzawd0, context0, zzasc0, null);
    }

    public static zzauz zzu(Context context0, zzaux zzaux0) {
        zzauy.zzs(context0, zzaux0);
        return new zzauz(context0, zzaux0);
    }
}

