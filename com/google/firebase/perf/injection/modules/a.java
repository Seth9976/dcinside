package com.google.firebase.perf.injection.modules;

import a3.h;
import a3.i;
import androidx.annotation.NonNull;
import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import h2.b;

@h
public class a {
    private final com.google.firebase.h a;
    private final k b;
    private final b c;
    private final b d;

    public a(@NonNull com.google.firebase.h h0, @NonNull k k0, @NonNull b b0, @NonNull b b1) {
        this.a = h0;
        this.b = k0;
        this.c = b0;
        this.d = b1;
    }

    @i
    com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.h();
    }

    @i
    com.google.firebase.h b() {
        return this.a;
    }

    @i
    k c() {
        return this.b;
    }

    @i
    b d() {
        return this.c;
    }

    @i
    RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    @i
    SessionManager f() {
        return SessionManager.getInstance();
    }

    @i
    b g() {
        return this.d;
    }
}

