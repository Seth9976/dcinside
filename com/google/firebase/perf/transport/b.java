package com.google.firebase.perf.transport;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.l;
import com.google.android.datatransport.m;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.v1.s;

final class b {
    private final String a;
    private final h2.b b;
    private l c;
    private static final a d;

    static {
        b.d = a.e();
    }

    b(h2.b b0, String s) {
        this.a = s;
        this.b = b0;
    }

    private boolean a() {
        if(this.c == null) {
            m m0 = (m)this.b.get();
            if(m0 != null) {
                e e0 = e.b("proto");
                com.google.firebase.perf.transport.a a0 = new com.google.firebase.perf.transport.a();
                this.c = m0.b(this.a, s.class, e0, a0);
                return this.c != null;
            }
            b.d.l("Flg TransportFactory is not available at the moment");
        }
        return this.c != null;
    }

    @WorkerThread
    public void b(@NonNull s s0) {
        if(!this.a()) {
            b.d.l("Unable to dispatch event because Flg Transport is not available");
            return;
        }
        this.c.b(f.j(s0));
    }
}

