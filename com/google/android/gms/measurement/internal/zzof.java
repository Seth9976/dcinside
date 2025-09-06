package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzof implements zzor {
    final zznv zza;

    zzof(zznv zznv0) {
        this.zza = zznv0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zzor
    public final void zza(String s, String s1, Bundle bundle0) {
        if(!TextUtils.isEmpty(s)) {
            this.zza.zzl().zzb(new zzoh(this, s, s1, bundle0));
        }
        else if(this.zza.zzm != null) {
            this.zza.zzm.zzj().zzg().zza("AppId not known when logging event", s1);
        }
    }
}

