package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.a.b;
import com.google.firebase.crashlytics.internal.g;
import java.util.Locale;

class f implements b {
    private com.google.firebase.crashlytics.internal.analytics.b a;
    private com.google.firebase.crashlytics.internal.analytics.b b;
    static final String c = "_o";
    static final String d = "name";
    static final String e = "params";
    static final String f = "clx";

    @Override  // com.google.firebase.analytics.connector.a$b
    public void a(int v, @Nullable Bundle bundle0) {
        g.f().k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", v, bundle0));
        if(bundle0 == null) {
            return;
        }
        String s = bundle0.getString("name");
        if(s != null) {
            Bundle bundle1 = bundle0.getBundle("params");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            this.c(s, bundle1);
        }
    }

    private static void b(@Nullable com.google.firebase.crashlytics.internal.analytics.b b0, @NonNull String s, @NonNull Bundle bundle0) {
        if(b0 == null) {
            return;
        }
        b0.B(s, bundle0);
    }

    private void c(@NonNull String s, @NonNull Bundle bundle0) {
        f.b(("clx".equals(bundle0.getString("_o")) ? this.a : this.b), s, bundle0);
    }

    public void d(@Nullable com.google.firebase.crashlytics.internal.analytics.b b0) {
        this.b = b0;
    }

    public void e(@Nullable com.google.firebase.crashlytics.internal.analytics.b b0) {
        this.a = b0;
    }
}

