package com.google.android.material.motion;

import android.os.Build.VERSION;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.Objects;

@RestrictTo({Scope.b})
public final class c {
    static class a {
    }

    @RequiresApi(33)
    static class b implements d {
        @Nullable
        private OnBackInvokedCallback a;

        private b() {
        }

        b(a c$a0) {
        }

        @Override  // com.google.android.material.motion.c$d
        @DoNotInline
        public void a(@NonNull View view0) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 == null) {
                return;
            }
            onBackInvokedDispatcher0.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }

        @Override  // com.google.android.material.motion.c$d
        @DoNotInline
        public void b(@NonNull com.google.android.material.motion.b b0, @NonNull View view0, boolean z) {
            if(this.a != null) {
                return;
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 == null) {
                return;
            }
            OnBackInvokedCallback onBackInvokedCallback0 = this.c(b0);
            this.a = onBackInvokedCallback0;
            onBackInvokedDispatcher0.registerOnBackInvokedCallback((z ? 1000000 : 0), onBackInvokedCallback0);
        }

        OnBackInvokedCallback c(@NonNull com.google.android.material.motion.b b0) {
            Objects.requireNonNull(b0);
            return new e(b0);
        }

        boolean d() {
            return this.a != null;
        }
    }

    @RequiresApi(34)
    static class com.google.android.material.motion.c.c extends b {
        private com.google.android.material.motion.c.c() {
            super(null);
        }

        com.google.android.material.motion.c.c(a c$a0) {
        }

        @Override  // com.google.android.material.motion.c$b
        OnBackInvokedCallback c(@NonNull com.google.android.material.motion.b b0) {
            class com.google.android.material.motion.c.c.a implements OnBackAnimationCallback {
                final com.google.android.material.motion.b a;
                final com.google.android.material.motion.c.c b;

                com.google.android.material.motion.c.c.a(com.google.android.material.motion.b b0) {
                    this.a = b0;
                    super();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    if(!com.google.android.material.motion.c.c.this.d()) {
                        return;
                    }
                    this.a.f();
                }

                @Override  // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    this.a.d();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackProgressed(@NonNull BackEvent backEvent0) {
                    if(!com.google.android.material.motion.c.c.this.d()) {
                        return;
                    }
                    BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
                    this.a.c(backEventCompat0);
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackStarted(@NonNull BackEvent backEvent0) {
                    if(!com.google.android.material.motion.c.c.this.d()) {
                        return;
                    }
                    BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
                    this.a.b(backEventCompat0);
                }
            }

            return new com.google.android.material.motion.c.c.a(this, b0);
        }
    }

    interface d {
        void a(@NonNull View arg1);

        void b(@NonNull com.google.android.material.motion.b arg1, @NonNull View arg2, boolean arg3);
    }

    @Nullable
    private final d a;
    @NonNull
    private final com.google.android.material.motion.b b;
    @NonNull
    private final View c;

    public c(@NonNull View view0) {
        this(((com.google.android.material.motion.b)view0), view0);
    }

    public c(@NonNull com.google.android.material.motion.b b0, @NonNull View view0) {
        this.a = c.a();
        this.b = b0;
        this.c = view0;
    }

    @Nullable
    private static d a() {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            return new com.google.android.material.motion.c.c(null);
        }
        return v >= 33 ? new b(null) : null;
    }

    public boolean b() {
        return this.a != null;
    }

    public void c() {
        this.d(false);
    }

    private void d(boolean z) {
        d c$d0 = this.a;
        if(c$d0 != null) {
            c$d0.b(this.b, this.c, z);
        }
    }

    public void e() {
        this.d(true);
    }

    public void f() {
        d c$d0 = this.a;
        if(c$d0 != null) {
            c$d0.a(this.c);
        }
    }
}

