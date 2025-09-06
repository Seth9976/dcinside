package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzfuc;

public final class zzaj implements zzfuc {
    public final Uri zza;

    public zzaj(zzau zzau0, Uri uri0) {
        this.zza = uri0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        return zzau.zzQ(this.zza, ((String)object0));
    }
}

