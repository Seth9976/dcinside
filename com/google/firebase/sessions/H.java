package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.datatransport.e;
import com.google.android.datatransport.m;
import h2.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import y4.l;

public final class h implements i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final b a;
    @l
    public static final a b = null;
    @l
    private static final String c = "EventGDTLogger";
    @l
    private static final String d = "FIREBASE_APPQUALITY_SESSION";

    static {
        h.b = new a(null);
    }

    public h(@l b b0) {
        L.p(b0, "transportFactoryProvider");
        super();
        this.a = b0;
    }

    @Override  // com.google.firebase.sessions.i
    public void a(@l C c0) {
        L.p(c0, "sessionEvent");
        m m0 = (m)this.a.get();
        e e0 = e.b("json");
        g g0 = (C c0) -> {
            String s = D.a.d().b(c0);
            L.o(s, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
            Log.d("EventGDTLogger", "Session Event: " + s);
            byte[] arr_b = s.getBytes(f.b);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            return arr_b;
        };
        m0.b("FIREBASE_APPQUALITY_SESSION", C.class, e0, g0).b(com.google.android.datatransport.f.j(c0));
    }

    // 检测为 Lambda 实现
    private final byte[] c(C c0) [...]
}

