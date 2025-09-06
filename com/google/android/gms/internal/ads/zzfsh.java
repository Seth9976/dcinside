package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzfsh implements Consumer {
    public final Bundle zza;

    public zzfsh(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.putString("sessionToken", ((String)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

