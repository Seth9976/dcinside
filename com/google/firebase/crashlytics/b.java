package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.a;

public final class b implements a {
    public final d a;

    public b(d d0) {
        this.a = d0;
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.a
    public final void a(String s, Bundle bundle0) {
        this.a.g(s, bundle0);
    }
}

