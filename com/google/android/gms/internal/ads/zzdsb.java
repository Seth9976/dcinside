package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdsb extends zzdsf {
    private final CsiParamDefaults zzf;

    public zzdsb(Executor executor0, zzu zzu0, CsiParamDefaults csiParamDefaults0, CsiUrlBuilder csiUrlBuilder0, Context context0) {
        super(executor0, zzu0, csiUrlBuilder0, context0);
        this.zzf = csiParamDefaults0;
        csiParamDefaults0.set(this.zza);
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}

