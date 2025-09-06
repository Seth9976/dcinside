package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfuc;
import org.json.JSONObject;

public final class zzam implements zzfuc {
    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        return ((JSONObject)object0).optString("nas");
    }
}

