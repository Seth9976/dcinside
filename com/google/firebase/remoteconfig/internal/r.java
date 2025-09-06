package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.remoteconfig.d;
import com.google.firebase.remoteconfig.e;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class r {
    public class a implements e {
        private final d a;
        final r b;

        public a(d d0) {
            this.a = d0;
        }

        @Override  // com.google.firebase.remoteconfig.e
        public void remove() {
            r.this.d(this.a);
        }
    }

    @GuardedBy("this")
    private final Set a;
    @GuardedBy("this")
    private final u b;
    private final n c;
    private final h d;
    private final k e;
    private final g f;
    private final Context g;
    private final String h;
    private final q i;
    private final ScheduledExecutorService j;

    public r(h h0, k k0, n n0, g g0, Context context0, String s, q q0, ScheduledExecutorService scheduledExecutorService0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        this.a = linkedHashSet0;
        this.b = new u(h0, k0, n0, g0, context0, s, linkedHashSet0, q0, scheduledExecutorService0);
        this.d = h0;
        this.c = n0;
        this.e = k0;
        this.f = g0;
        this.g = context0;
        this.h = s;
        this.i = q0;
        this.j = scheduledExecutorService0;
    }

    @NonNull
    public e b(@NonNull d d0) {
        synchronized(this) {
            this.a.add(d0);
            this.c();
            return () -> synchronized(r.this) {
                r.this.a.remove(d0);
            };
        }
    }

    private void c() {
        synchronized(this) {
            if(!this.a.isEmpty()) {
                this.b.E();
            }
        }
    }

    // 检测为 Lambda 实现
    private void d(d d0) [...]

    public void e(boolean z) {
        synchronized(this) {
            this.b.B(z);
            if(!z) {
                this.c();
            }
        }
    }
}

