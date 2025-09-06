package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class a extends g {
    public interface com.google.android.material.resources.a.a {
        void a(Typeface arg1);
    }

    private final Typeface a;
    private final com.google.android.material.resources.a.a b;
    private boolean c;

    public a(com.google.android.material.resources.a.a a$a0, Typeface typeface0) {
        this.a = typeface0;
        this.b = a$a0;
    }

    @Override  // com.google.android.material.resources.g
    public void a(int v) {
        this.d(this.a);
    }

    @Override  // com.google.android.material.resources.g
    public void b(Typeface typeface0, boolean z) {
        this.d(typeface0);
    }

    public void c() {
        this.c = true;
    }

    private void d(Typeface typeface0) {
        if(!this.c) {
            this.b.a(typeface0);
        }
    }
}

