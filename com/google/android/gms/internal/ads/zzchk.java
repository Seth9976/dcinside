package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

public final class zzchk implements zzher {
    public zzchk(zzcha zzcha0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setPackage("com.android.vending");
        intent0.setData(Uri.parse("https://play.google.com/d"));
        return intent0;
    }
}

