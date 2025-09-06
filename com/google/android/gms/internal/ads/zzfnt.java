package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzfnt {
    private final Context zza;
    private final Looper zzb;

    public zzfnt(@NonNull Context context0, @NonNull Looper looper0) {
        this.zza = context0;
        this.zzb = looper0;
    }

    public final void zza(@NonNull String s) {
        zzfog zzfog0 = zzfoj.zza();
        zzfog0.zza("com.dcinside.app.android");
        zzfog0.zzc(2);
        zzfod zzfod0 = zzfof.zza();
        zzfod0.zza(s);
        zzfod0.zzb(2);
        zzfog0.zzb(zzfod0);
        zzfoj zzfoj0 = (zzfoj)zzfog0.zzbn();
        new zzfnu(this.zza, this.zzb, zzfoj0).zza();
    }
}

