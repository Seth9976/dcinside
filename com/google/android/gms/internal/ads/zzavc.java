package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

public final class zzavc implements Callable {
    public final Context zza;

    public zzavc(zzavd zzavd0, Context context0) {
        this.zza = context0;
    }

    @Override
    public final Object call() {
        try {
            PackageInfo packageInfo0 = this.zza.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
            return zzfnq.zza(this.zza, "com.dcinside.app.android", Integer.toString(packageInfo0.versionCode));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

