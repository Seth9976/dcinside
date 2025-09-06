package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class e implements a {
    @NonNull
    private final com.google.firebase.analytics.connector.a a;
    static final String b = "clx";

    public e(@NonNull com.google.firebase.analytics.connector.a a0) {
        this.a = a0;
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@NonNull String s, @Nullable Bundle bundle0) {
        this.a.a("clx", s, bundle0);
    }
}

