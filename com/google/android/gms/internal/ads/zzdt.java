package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

final class zzdt extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzdw zza;

    public zzdt(zzdw zzdw0) {
        this.zza = zzdw0;
    }

    @Override  // android.telephony.TelephonyCallback$DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo0) {
        int v = telephonyDisplayInfo0.getOverrideNetworkType();
        int v1 = 5;
        zzdw zzdw0 = this.zza;
        if(1 == (v != 3 && (v != 4 && v != 5) ? 0 : 1)) {
            v1 = 10;
        }
        zzdw.zzc(zzdw0, v1);
    }
}

