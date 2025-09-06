package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;

final class d implements OnEventListener {
    private final e a;

    public d(e e0) {
        this.a = e0;
        super();
    }

    @Override  // com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        if(!this.a.a.contains(s1)) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putString("events", b.c(s1));
        this.a.b.a(2, bundle1);
    }
}

