package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.provider.Settings.Secure;
import java.util.concurrent.Callable;

public final class zzemt implements Callable {
    public final ContentResolver zza;

    public zzemt(ContentResolver contentResolver0) {
        this.zza = contentResolver0;
    }

    @Override
    public final Object call() {
        return new zzemv(Settings.Secure.getString(this.zza, "advertising_id"), Settings.Secure.getInt(this.zza, "limit_ad_tracking", 0) == 1);
    }
}

