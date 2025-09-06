package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.o;
import h2.a;
import h2.b;

public class l {
    private final a a;

    public l(a a0) {
        this.a = a0;
    }

    // 检测为 Lambda 实现
    private static void b(e e0, b b0) [...]

    public void c(o o0) {
        if(o0 == null) {
            g.f().m("Didn\'t successfully register with UserMetadata for rollouts listener");
            return;
        }
        k k0 = (b b0) -> {
            ((t2.a)b0.get()).a("firebase", new e(o0));
            g.f().b("Registering RemoteConfig Rollouts subscriber");
        };
        this.a.a(k0);
    }
}

