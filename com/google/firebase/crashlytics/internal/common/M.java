package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.g;
import com.google.firebase.sessions.api.b.a;
import com.google.firebase.sessions.api.b;

public class m implements b {
    private final I a;
    private final l b;

    public m(I i0, g g0) {
        this.a = i0;
        this.b = new l(g0);
    }

    @Override  // com.google.firebase.sessions.api.b
    public boolean a() {
        return this.a.d();
    }

    @Override  // com.google.firebase.sessions.api.b
    @NonNull
    public a b() {
        return a.a;
    }

    @Override  // com.google.firebase.sessions.api.b
    public void c(@NonNull com.google.firebase.sessions.api.b.b b$b0) {
        com.google.firebase.crashlytics.internal.g.f().b("App Quality Sessions session changed: " + b$b0);
        this.b.h(b$b0.d());
    }

    @Nullable
    public String d(@NonNull String s) {
        return this.b.c(s);
    }

    public void e(@Nullable String s) {
        this.b.i(s);
    }
}

