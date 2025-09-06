package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.H;
import com.google.firebase.crashlytics.internal.common.I;
import com.google.firebase.crashlytics.internal.common.J;
import com.google.firebase.crashlytics.internal.common.N;
import com.google.firebase.crashlytics.internal.common.g0;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class g implements k {
    private final Context a;
    private final l b;
    private final i c;
    private final H d;
    private final a e;
    private final m f;
    private final I g;
    private final AtomicReference h;
    private final AtomicReference i;
    private static final String j = "existing_instance_identifier";
    private static final String k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";

    g(Context context0, l l0, H h0, i i0, a a0, m m0, I i1) {
        AtomicReference atomicReference0 = new AtomicReference();
        this.h = atomicReference0;
        this.i = new AtomicReference(new TaskCompletionSource());
        this.a = context0;
        this.b = l0;
        this.d = h0;
        this.c = i0;
        this.e = a0;
        this.f = m0;
        this.g = i1;
        atomicReference0.set(b.b(h0));
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.k
    public d a() {
        return (d)this.h.get();
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.k
    public Task b() {
        return ((TaskCompletionSource)this.i.get()).getTask();
    }

    boolean k() {
        return !this.n().equals(this.b.f);
    }

    public static g l(Context context0, String s, N n0, W1.b b0, String s1, String s2, com.google.firebase.crashlytics.internal.persistence.g g0, I i0) {
        String s3 = n0.g();
        g0 g00 = new g0();
        i i1 = new i(g00);
        a a0 = new a(g0);
        c c0 = new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", s), b0);
        return new g(context0, new l(s, n0.h(), n0.i(), n0.j(), n0, com.google.firebase.crashlytics.internal.common.i.h(new String[]{com.google.firebase.crashlytics.internal.common.i.n(context0), s, s2, s1}), s2, s1, J.b(s3).c()), g00, i1, a0, c0, i0);
    }

    private d m(e e0) {
        d d1;
        d d0 = null;
        try {
            if(!e.b.equals(e0)) {
                JSONObject jSONObject0 = this.e.b();
                if(jSONObject0 == null) {
                    com.google.firebase.crashlytics.internal.g.f().b("No cached settings data found.");
                    return null;
                }
                d1 = this.c.b(jSONObject0);
                if(d1 == null) {
                    com.google.firebase.crashlytics.internal.g.f().e("Failed to parse cached settings data.", null);
                    return null;
                }
                this.q(jSONObject0, "Loaded cached settings: ");
                long v = this.d.a();
                if(!e.c.equals(e0) && d1.a(v)) {
                    com.google.firebase.crashlytics.internal.g.f().k("Cached settings have expired.");
                    return null;
                }
                goto label_17;
            }
        }
        catch(Exception exception0) {
            com.google.firebase.crashlytics.internal.g.f().e("Failed to get cached settings", exception0);
        }
        return d0;
        try {
        label_17:
            com.google.firebase.crashlytics.internal.g.f().k("Returning cached settings.");
            return d1;
        }
        catch(Exception exception0) {
            d0 = d1;
        }
        com.google.firebase.crashlytics.internal.g.f().e("Failed to get cached settings", exception0);
        return d0;
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.i.r(this.a).getString("existing_instance_identifier", "");
    }

    public Task o(com.google.firebase.crashlytics.internal.concurrency.l l0) {
        return this.p(e.a, l0);
    }

    public Task p(e e0, com.google.firebase.crashlytics.internal.concurrency.l l0) {
        class com.google.firebase.crashlytics.internal.settings.g.a implements SuccessContinuation {
            final com.google.firebase.crashlytics.internal.concurrency.l a;
            final g b;

            com.google.firebase.crashlytics.internal.settings.g.a(com.google.firebase.crashlytics.internal.concurrency.l l0) {
                this.a = l0;
                super();
            }

            // 检测为 Lambda 实现
            private JSONObject b() throws Exception [...]

            @NonNull
            public Task c(@Nullable Void void0) throws Exception {
                f f0 = () -> g.this.f.a(g.this.b, true);
                JSONObject jSONObject0 = (JSONObject)this.a.d.i().submit(f0).get();
                if(jSONObject0 != null) {
                    d d0 = g.this.c.b(jSONObject0);
                    g.this.e.c(d0.c, jSONObject0);
                    g.this.q(jSONObject0, "Loaded settings: ");
                    g.this.r(g.this.b.f);
                    g.this.h.set(d0);
                    ((TaskCompletionSource)g.this.i.get()).trySetResult(d0);
                }
                return Tasks.forResult(null);
            }

            @Override  // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task then(@Nullable Object object0) throws Exception {
                return this.c(((Void)object0));
            }
        }

        if(!this.k()) {
            d d0 = this.m(e0);
            if(d0 != null) {
                this.h.set(d0);
                ((TaskCompletionSource)this.i.get()).trySetResult(d0);
                return Tasks.forResult(null);
            }
        }
        d d1 = this.m(e.c);
        if(d1 != null) {
            this.h.set(d1);
            ((TaskCompletionSource)this.i.get()).trySetResult(d1);
        }
        Task task0 = this.g.k();
        com.google.firebase.crashlytics.internal.settings.g.a g$a0 = new com.google.firebase.crashlytics.internal.settings.g.a(this, l0);
        return task0.onSuccessTask(l0.a, g$a0);
    }

    private void q(JSONObject jSONObject0, String s) {
        com.google.firebase.crashlytics.internal.g.f().b(s + jSONObject0.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    private boolean r(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = com.google.firebase.crashlytics.internal.common.i.r(this.a).edit();
        sharedPreferences$Editor0.putString("existing_instance_identifier", s);
        sharedPreferences$Editor0.apply();
        return true;
    }
}

