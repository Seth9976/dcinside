package com.google.android.gms.common.api.internal;

import P1.a;
import com.google.android.gms.common.ConnectionResult;

final class zaam extends zabg {
    final ConnectionResult zaa;
    final zaao zab;

    zaam(zaao zaao0, zabf zabf0, ConnectionResult connectionResult0) {
        this.zab = zaao0;
        this.zaa = connectionResult0;
        super(zabf0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabg
    @a("lock")
    public final void zaa() {
        this.zab.zaa.zaD(this.zaa);
    }
}

