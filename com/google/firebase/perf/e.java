package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import h2.b;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import r3.f;

@f
public class e implements com.google.firebase.perf.f {
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final String m1 = "GET";
        public static final String n1 = "PUT";
        public static final String o1 = "POST";
        public static final String p1 = "DELETE";
        public static final String q1 = "HEAD";
        public static final String r1 = "PATCH";
        public static final String s1 = "OPTIONS";
        public static final String t1 = "TRACE";
        public static final String u1 = "CONNECT";

    }

    private final Map a;
    private final com.google.firebase.perf.config.a b;
    private final com.google.firebase.perf.util.e c;
    @Nullable
    private Boolean d;
    private final h e;
    private final b f;
    private final k g;
    private final b h;
    private static final com.google.firebase.perf.logging.a i = null;
    private static final int j = 5;
    private static final int k = 40;
    private static final int l = 100;
    public static final int m = 100;

    static {
        e.i = com.google.firebase.perf.logging.a.e();
    }

    @VisibleForTesting
    @r3.a
    e(h h0, b b0, k k0, b b1, RemoteConfigManager remoteConfigManager0, com.google.firebase.perf.config.a a0, SessionManager sessionManager0) {
        this.a = new ConcurrentHashMap();
        this.d = null;
        this.e = h0;
        this.f = b0;
        this.g = k0;
        this.h = b1;
        if(h0 == null) {
            this.d = Boolean.FALSE;
            this.b = a0;
            this.c = new com.google.firebase.perf.util.e(new Bundle());
            return;
        }
        com.google.firebase.perf.transport.k.l().t(h0, k0, b1);
        Context context0 = h0.n();
        com.google.firebase.perf.util.e e0 = e.b(context0);
        this.c = e0;
        remoteConfigManager0.setFirebaseRemoteConfigProvider(b0);
        this.b = a0;
        a0.V(e0);
        a0.R(context0);
        sessionManager0.setApplicationContext(context0);
        this.d = a0.k();
        com.google.firebase.perf.logging.a a1 = e.i;
        if(a1.h() && this.e()) {
            a1.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", com.google.firebase.perf.logging.b.b(h0.s().n(), "com.dcinside.app.android")));
        }
    }

    private void a(@Nullable String s, @Nullable String s1) {
        if(s == null || s1 == null) {
            throw new IllegalArgumentException("Attribute must not have null key or value.");
        }
        if(!this.a.containsKey(s) && this.a.size() >= 5) {
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
        com.google.firebase.perf.metrics.validator.e.d(s, s1);
    }

    private static com.google.firebase.perf.util.e b(Context context0) {
        try {
            Bundle bundle0 = context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
            return bundle0 == null ? new com.google.firebase.perf.util.e() : new com.google.firebase.perf.util.e(bundle0);
        }
        catch(PackageManager.NameNotFoundException | NullPointerException packageManager$NameNotFoundException0) {
            Log.d("isEnabled", "No perf enable meta data found " + packageManager$NameNotFoundException0.getMessage());
            return new com.google.firebase.perf.util.e();
        }
    }

    @NonNull
    public static e c() {
        return (e)h.p().l(e.class);
    }

    @VisibleForTesting
    Boolean d() {
        return this.d;
    }

    public boolean e() {
        Boolean boolean0 = this.d;
        return boolean0 == null ? h.p().A() : boolean0.booleanValue();
    }

    @NonNull
    public i f(@NonNull String s, @NonNull String s1) {
        return new i(s, s1, com.google.firebase.perf.transport.k.l(), new Timer());
    }

    @NonNull
    public i g(@NonNull URL uRL0, @NonNull String s) {
        return new i(uRL0, s, com.google.firebase.perf.transport.k.l(), new Timer());
    }

    @Override  // com.google.firebase.perf.f
    @Nullable
    public String getAttribute(@NonNull String s) {
        return (String)this.a.get(s);
    }

    @Override  // com.google.firebase.perf.f
    @NonNull
    public Map getAttributes() {
        return new HashMap(this.a);
    }

    @NonNull
    public Trace h(@NonNull String s) {
        return Trace.d(s);
    }

    public void i(@Nullable Boolean boolean0) {
        synchronized(this) {
            try {
                h.p();
            }
            catch(IllegalStateException unused_ex) {
                return;
            }
        }
        if(this.b.j().booleanValue()) {
            e.i.f("Firebase Performance is permanently disabled");
            return;
        }
        this.b.U(boolean0);
        this.d = boolean0 == null ? this.b.k() : boolean0;
        if(Boolean.TRUE.equals(this.d)) {
            e.i.f("Firebase Performance is Enabled");
        }
        else if(Boolean.FALSE.equals(this.d)) {
            e.i.f("Firebase Performance is Disabled");
        }
    }

    public void j(boolean z) {
        this.i(Boolean.valueOf(z));
    }

    @NonNull
    public static Trace k(@NonNull String s) {
        Trace trace0 = Trace.d(s);
        trace0.start();
        return trace0;
    }

    @Override  // com.google.firebase.perf.f
    public void putAttribute(@NonNull String s, @NonNull String s1) {
        try {
            boolean z = false;
            s = s.trim();
            s1 = s1.trim();
            this.a(s, s1);
            z = true;
        }
        catch(Exception exception0) {
            e.i.d("Can not set attribute %s with value %s (%s)", new Object[]{s, s1, exception0.getMessage()});
        }
        if(z) {
            this.a.put(s, s1);
        }
    }

    @Override  // com.google.firebase.perf.f
    public void removeAttribute(@NonNull String s) {
        this.a.remove(s);
    }
}

