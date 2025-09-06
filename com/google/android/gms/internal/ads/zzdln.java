package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzdln implements Consumer {
    public final zzcab zza;

    public zzdln(zzcab zzcab0) {
        this.zza = zzcab0;
    }

    @Override
    public final void accept(Object object0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("mediaUrl", ((String)object0));
        this.zza.zzc(bundle0);
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

