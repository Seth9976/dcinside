package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.d;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.C;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.g;
import com.google.firebase.components.k;
import com.google.firebase.components.t;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.P;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class h {
    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean arg1);
    }

    @TargetApi(14)
    static class b implements BackgroundStateChangeListener {
        private static AtomicReference a;

        static {
            b.a = new AtomicReference();
        }

        private static void b(Context context0) {
            if(context0.getApplicationContext() instanceof Application) {
                Application application0 = (Application)context0.getApplicationContext();
                if(b.a.get() == null) {
                    b h$b0 = new b();
                    if(d.a(b.a, null, h$b0)) {
                        BackgroundDetector.initialize(application0);
                        BackgroundDetector.getInstance().addListener(h$b0);
                    }
                }
            }
        }

        @Override  // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized(h.m) {
                for(Object object1: new ArrayList(h.n.values())) {
                    h h0 = (h)object1;
                    if(h0.e.get()) {
                        h0.F(z);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    static class c extends BroadcastReceiver {
        private final Context a;
        private static AtomicReference b;

        static {
            c.b = new AtomicReference();
        }

        public c(Context context0) {
            this.a = context0;
        }

        private static void b(Context context0) {
            if(c.b.get() == null) {
                c h$c0 = new c(context0);
                if(d.a(c.b, null, h$c0)) {
                    context0.registerReceiver(h$c0, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            synchronized(h.m) {
                for(Object object1: h.n.values()) {
                    ((h)object1).v();
                }
            }
            this.c();
        }
    }

    private final Context a;
    private final String b;
    private final s c;
    private final t d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final C g;
    private final h2.b h;
    private final List i;
    private final List j;
    private static final String k = "FirebaseApp";
    @NonNull
    public static final String l = "[DEFAULT]";
    private static final Object m;
    @GuardedBy("LOCK")
    static final Map n;

    static {
        h.m = new Object();
        h.n = new ArrayMap();
    }

    protected h(Context context0, String s, s s1) {
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.a = (Context)Preconditions.checkNotNull(context0);
        this.b = Preconditions.checkNotEmpty(s);
        this.c = (s)Preconditions.checkNotNull(s1);
        u u0 = FirebaseInitProvider.b();
        v2.c.b("Firebase");
        v2.c.b("ComponentDiscovery");
        List list0 = k.d(context0, ComponentDiscoveryService.class).c();
        v2.c.a();
        v2.c.b("Runtime");
        com.google.firebase.components.t.b t$b0 = t.p(P.a).d(list0).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(g.D(context0, Context.class, new Class[0])).b(g.D(this, h.class, new Class[0])).b(g.D(s1, s.class, new Class[0])).g(new v2.b());
        if(UserManagerCompat.a(context0) && FirebaseInitProvider.c()) {
            t$b0.b(g.D(u0, u.class, new Class[0]));
        }
        t t0 = t$b0.e();
        this.d = t0;
        v2.c.a();
        this.g = new C(() -> new m2.a(context0, this.t(), ((e2.c)this.d.a(e2.c.class))));
        this.h = t0.e(com.google.firebase.heartbeatinfo.g.class);
        this.g((boolean z) -> if(!z) {
            ((com.google.firebase.heartbeatinfo.g)this.h.get()).l();
        });
        v2.c.a();
    }

    @KeepForSdk
    public boolean A() {
        this.i();
        return ((m2.a)this.g.get()).b();
    }

    @VisibleForTesting
    @KeepForSdk
    public boolean B() {
        return "[DEFAULT]".equals(this.r());
    }

    // 检测为 Lambda 实现
    private m2.a C(Context context0) [...]

    // 检测为 Lambda 实现
    private void D(boolean z) [...]

    private static String E(@NonNull String s) {
        return s.trim();
    }

    private void F(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for(Object object0: this.i) {
            ((a)object0).onBackgroundStateChanged(z);
        }
    }

    private void G() {
        for(Object object0: this.j) {
            ((i)object0).a(this.b, this.c);
        }
    }

    @KeepForSdk
    public void H(a h$a0) {
        this.i();
        this.i.remove(h$a0);
    }

    @KeepForSdk
    public void I(@NonNull i i0) {
        this.i();
        Preconditions.checkNotNull(i0);
        this.j.remove(i0);
    }

    public void J(boolean z) {
        this.i();
        if(this.e.compareAndSet(!z, z)) {
            boolean z1 = BackgroundDetector.getInstance().isInBackground();
            if(z && z1) {
                this.F(true);
                return;
            }
            if(!z && z1) {
                this.F(false);
            }
        }
    }

    @KeepForSdk
    public void K(Boolean boolean0) {
        this.i();
        ((m2.a)this.g.get()).e(boolean0);
    }

    @KeepForSdk
    @Deprecated
    public void L(boolean z) {
        this.K(Boolean.valueOf(z));
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof h)) {
            return false;
        }
        String s = ((h)object0).r();
        return this.b.equals(s);
    }

    @KeepForSdk
    public void g(a h$a0) {
        this.i();
        if(this.e.get() && BackgroundDetector.getInstance().isInBackground()) {
            h$a0.onBackgroundStateChanged(true);
        }
        this.i.add(h$a0);
    }

    @KeepForSdk
    public void h(@NonNull i i0) {
        this.i();
        Preconditions.checkNotNull(i0);
        this.j.add(i0);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    private void i() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    @VisibleForTesting
    public static void j() {
        synchronized(h.m) {
            h.n.clear();
        }
    }

    public void k() {
        if(!this.f.compareAndSet(false, true)) {
            return;
        }
        synchronized(h.m) {
            h.n.remove(this.b);
        }
        this.G();
    }

    @KeepForSdk
    public Object l(Class class0) {
        this.i();
        return this.d.a(class0);
    }

    private static List m() {
        List list0 = new ArrayList();
        synchronized(h.m) {
            for(Object object1: h.n.values()) {
                list0.add(((h)object1).r());
            }
        }
        Collections.sort(list0);
        return list0;
    }

    @NonNull
    public Context n() {
        this.i();
        return this.a;
    }

    @NonNull
    public static List o(@NonNull Context context0) {
        synchronized(h.m) {
        }
        return new ArrayList(h.n.values());
    }

    @NonNull
    public static h p() {
        synchronized(h.m) {
            h h0 = (h)h.n.get("[DEFAULT]");
            if(h0 != null) {
                ((com.google.firebase.heartbeatinfo.g)h0.h.get()).l();
                return h0;
            }
        }
        throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
    }

    @NonNull
    public static h q(@NonNull String s) {
        synchronized(h.m) {
            h h0 = (h)h.n.get(h.E(s));
            if(h0 != null) {
                ((com.google.firebase.heartbeatinfo.g)h0.h.get()).l();
                return h0;
            }
            List list0 = h.m();
            if(!list0.isEmpty()) {
                String s1 = "Available app names: " + TextUtils.join(", ", list0);
            }
        }
        throw new IllegalStateException(String.format("FirebaseApp with name %s doesn\'t exist. %s", s, ""));
    }

    @NonNull
    public String r() {
        this.i();
        return this.b;
    }

    @NonNull
    public s s() {
        this.i();
        return this.c;
    }

    @KeepForSdk
    public String t() {
        return Base64Utils.encodeUrlSafeNoPadding(this.r().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(this.s().j().getBytes(Charset.defaultCharset()));
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }

    @KeepForSdk
    public static String u(String s, s s1) {
        return Base64Utils.encodeUrlSafeNoPadding(s.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(s1.j().getBytes(Charset.defaultCharset()));
    }

    private void v() {
        if(!UserManagerCompat.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + this.r());
            c.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + this.r());
        boolean z = this.B();
        this.d.u(z);
        ((com.google.firebase.heartbeatinfo.g)this.h.get()).l();
    }

    @RestrictTo({Scope.e})
    @VisibleForTesting
    void w() {
        this.d.t();
    }

    @Nullable
    public static h x(@NonNull Context context0) {
        s s0;
        synchronized(h.m) {
            if(h.n.containsKey("[DEFAULT]")) {
                return h.p();
            }
            s0 = s.h(context0);
            if(s0 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
        }
        return h.y(context0, s0);
    }

    @NonNull
    public static h y(@NonNull Context context0, @NonNull s s0) {
        return h.z(context0, s0, "[DEFAULT]");
    }

    @NonNull
    public static h z(@NonNull Context context0, @NonNull s s0, @NonNull String s1) {
        h h0;
        b.b(context0);
        String s2 = h.E(s1);
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(h.m) {
            Preconditions.checkState(!h.n.containsKey(s2), "FirebaseApp name " + s2 + " already exists!");
            Preconditions.checkNotNull(context0, "Application context cannot be null.");
            h0 = new h(context0, s2, s0);
            h.n.put(s2, h0);
        }
        h0.v();
        return h0;
    }
}

