package com.google.firebase.crashlytics;

import V1.b;
import V1.c;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.analytics.e;
import com.google.firebase.crashlytics.internal.analytics.f;
import com.google.firebase.crashlytics.internal.g;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class d {
    private final a a;
    private volatile com.google.firebase.crashlytics.internal.analytics.a b;
    private volatile b c;
    @GuardedBy("this")
    private final List d;

    public d(a a0) {
        this(a0, new c(), new f());
    }

    public d(a a0, @NonNull b b0, @NonNull com.google.firebase.crashlytics.internal.analytics.a a1) {
        this.a = a0;
        this.c = b0;
        this.d = new ArrayList();
        this.b = a1;
        this.f();
    }

    public com.google.firebase.crashlytics.internal.analytics.a d() {
        return (String s, Bundle bundle0) -> this.b.a(s, bundle0);
    }

    public b e() {
        return (V1.a a0) -> synchronized(this) {
            if(this.c instanceof c) {
                this.d.add(a0);
            }
            this.c.a(a0);
        };
    }

    private void f() {
        com.google.firebase.crashlytics.c c0 = (h2.b b0) -> {
            g.f().b("AnalyticsConnector now available.");
            com.google.firebase.analytics.connector.a a0 = (com.google.firebase.analytics.connector.a)b0.get();
            e e0 = new e(a0);
            com.google.firebase.crashlytics.f f0 = new com.google.firebase.crashlytics.f();
            if(d.j(a0, f0) != null) {
                g.f().b("Registered Firebase Analytics listener.");
                com.google.firebase.crashlytics.internal.analytics.d d0 = new com.google.firebase.crashlytics.internal.analytics.d();
                com.google.firebase.crashlytics.internal.analytics.c c0 = new com.google.firebase.crashlytics.internal.analytics.c(e0, 500, TimeUnit.MILLISECONDS);
                synchronized(this) {
                    for(Object object0: this.d) {
                        d0.a(((V1.a)object0));
                    }
                    f0.d(d0);
                    f0.e(c0);
                    this.c = d0;
                    this.b = c0;
                }
                return;
            }
            g.f().m("Could not register Firebase Analytics listener; a listener is already registered.");
        };
        this.a.a(c0);
    }

    // 检测为 Lambda 实现
    private void g(String s, Bundle bundle0) [...]

    // 检测为 Lambda 实现
    private void h(V1.a a0) [...]

    // 检测为 Lambda 实现
    private void i(h2.b b0) [...]

    @T1.a
    private static com.google.firebase.analytics.connector.a.a j(@NonNull com.google.firebase.analytics.connector.a a0, @NonNull com.google.firebase.crashlytics.f f0) {
        com.google.firebase.analytics.connector.a.a a$a0 = a0.e("clx", f0);
        if(a$a0 == null) {
            g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a$a0 = a0.e("crash", f0);
            if(a$a0 != null) {
                g.f().m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a$a0;
    }
}

