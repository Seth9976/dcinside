package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import o3.j;

@TargetApi(30)
@j
public final class zzy extends zzx {
    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzm(Context context0) {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zziy)).booleanValue() ? 0 : super.zzm(context0);
    }
}

