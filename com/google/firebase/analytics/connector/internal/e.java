package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a.b;
import java.util.HashSet;
import java.util.Set;

public final class e implements a {
    Set a;
    private b b;
    private AppMeasurementSdk c;
    private d d;

    public e(AppMeasurementSdk appMeasurementSdk0, b a$b0) {
        this.b = a$b0;
        this.c = appMeasurementSdk0;
        d d0 = new d(this);
        this.d = d0;
        this.c.registerOnMeasurementEventListener(d0);
        this.a = new HashSet();
    }

    @Override  // com.google.firebase.analytics.connector.internal.a
    public final void a(Set set0) {
        this.a.clear();
        Set set1 = this.a;
        HashSet hashSet0 = new HashSet();
        for(Object object0: set0) {
            String s = (String)object0;
            if(hashSet0.size() >= 50) {
                break;
            }
            if(com.google.firebase.analytics.connector.internal.b.j(s) && com.google.firebase.analytics.connector.internal.b.k(s)) {
                String s1 = com.google.firebase.analytics.connector.internal.b.g(s);
                Preconditions.checkNotNull(s1);
                hashSet0.add(s1);
            }
        }
        set1.addAll(hashSet0);
    }

    @Override  // com.google.firebase.analytics.connector.internal.a
    public final b zza() {
        return this.b;
    }

    @Override  // com.google.firebase.analytics.connector.internal.a
    public final void zzb() {
        this.a.clear();
    }
}

