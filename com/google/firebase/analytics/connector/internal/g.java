package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a.b;
import java.util.Set;

public final class g implements a {
    private b a;
    private AppMeasurementSdk b;
    private f c;

    public g(AppMeasurementSdk appMeasurementSdk0, b a$b0) {
        this.a = a$b0;
        this.b = appMeasurementSdk0;
        f f0 = new f(this);
        this.c = f0;
        this.b.registerOnMeasurementEventListener(f0);
    }

    @Override  // com.google.firebase.analytics.connector.internal.a
    public final void a(Set set0) {
    }

    @Override  // com.google.firebase.analytics.connector.internal.a
    public final b zza() {
        return this.a;
    }

    @Override  // com.google.firebase.analytics.connector.internal.a
    public final void zzb() {
    }
}

