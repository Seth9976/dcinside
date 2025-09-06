package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;

final class f implements OnEventListener {
    private final g a;

    public f(g g0) {
        this.a = g0;
        super();
    }

    @Override  // com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        if(s != null && b.l(s1)) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("name", s1);
            bundle1.putLong("timestampInMillis", v);
            bundle1.putBundle("params", bundle0);
            this.a.a.a(3, bundle1);
        }
    }
}

