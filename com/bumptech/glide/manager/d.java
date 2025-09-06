package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

final class d implements b {
    private final Context a;
    final a b;

    d(@NonNull Context context0, @NonNull a b$a0) {
        this.a = context0.getApplicationContext();
        this.b = b$a0;
    }

    private void a() {
        r.a(this.a).d(this.b);
    }

    private void b() {
        r.a(this.a).f(this.b);
    }

    @Override  // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStart() {
        this.a();
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStop() {
        this.b();
    }
}

