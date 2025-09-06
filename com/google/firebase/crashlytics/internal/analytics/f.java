package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.g;

public class f implements a {
    @Override  // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@NonNull String s, @Nullable Bundle bundle0) {
        g.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}

