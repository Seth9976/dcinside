package io.realm;

import android.content.Context;
import android.os.Looper;
import io.reactivex.l;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm.InitializationCallback;
import io.realm.internal.OsSharedRealm.MigrationCallback;
import io.realm.internal.OsSharedRealm.SchemaChangedCallback;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.async.d;
import io.realm.internal.c;
import io.realm.internal.s;
import io.realm.internal.t;
import io.realm.internal.u;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class a implements Closeable {
    class io.realm.a.a implements SchemaChangedCallback {
        final a a;

        @Override  // io.realm.internal.OsSharedRealm$SchemaChangedCallback
        public void onSchemaChanged() {
            h1 h10 = a.this.e0();
            if(h10 != null) {
                h10.t();
            }
            if(a.this instanceof F0) {
                h10.f();
            }
        }
    }

    public static abstract class g {
        public void a(Throwable throwable0) {
            throw new RealmException("Exception happens when initializing Realm in the background thread.", throwable0);
        }

        public abstract void b(a arg1);
    }

    public static final class h {
        private a a;
        private u b;
        private c c;
        private boolean d;
        private List e;

        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = false;
            this.e = null;
        }

        public boolean b() {
            return this.d;
        }

        public c c() {
            return this.c;
        }

        public List d() {
            return this.e;
        }

        a e() {
            return this.a;
        }

        public u f() {
            return this.b;
        }

        public void g(a a0, u u0, c c0, boolean z, List list0) {
            this.a = a0;
            this.b = u0;
            this.c = c0;
            this.d = z;
            this.e = list0;
        }
    }

    static final class i extends ThreadLocal {
        protected h a() {
            return new h();
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    final boolean a;
    final long b;
    protected final Q0 c;
    private O0 d;
    public OsSharedRealm e;
    private boolean f;
    private SchemaChangedCallback g;
    private static final String h = "Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.";
    static final String i = "Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.";
    static final String j = "This Realm instance has already been closed, making it unusable.";
    private static final String k = "Changing Realm data can only be done from inside a transaction.";
    static final String l = "Listeners cannot be used on current thread.";
    static final String m = "This API is not supported by partially synchronized Realms. Either unsubscribe using \'Realm.unsubscribeAsync()\' or delete the objects using a query and \'RealmResults.deleteAllFromRealm()\'";
    static volatile Context n;
    static final d o;
    public static final d p;
    public static final i q;

    static {
        a.o = d.c();
        a.p = d.d();
        a.q = new i();
    }

    a(O0 o00, @o3.h OsSchemaInfo osSchemaInfo0, io.realm.internal.OsSharedRealm.a osSharedRealm$a0) {
        this(o00.l(), osSchemaInfo0, osSharedRealm$a0);
        this.d = o00;
    }

    a(Q0 q00, @o3.h OsSchemaInfo osSchemaInfo0, io.realm.internal.OsSharedRealm.a osSharedRealm$a0) {
        class b implements InitializationCallback {
            final io.realm.F0.d a;
            final a b;

            b(io.realm.F0.d f0$d0) {
                this.a = f0$d0;
                super();
            }

            @Override  // io.realm.internal.OsSharedRealm$InitializationCallback
            public void onInit(OsSharedRealm osSharedRealm0) {
                F0 f00 = F0.e3(osSharedRealm0);
                this.a.a(f00);
            }
        }

        this.g = new io.realm.a.a(this);
        this.b = Thread.currentThread().getId();
        this.c = q00;
        b a$b0 = null;
        this.d = null;
        MigrationCallback osSharedRealm$MigrationCallback0 = osSchemaInfo0 == null || q00.l() == null ? null : a.s(q00.l());
        io.realm.F0.d f0$d0 = q00.i();
        if(f0$d0 != null) {
            a$b0 = new b(this, f0$d0);
        }
        OsSharedRealm osSharedRealm0 = OsSharedRealm.getInstance(new io.realm.internal.OsRealmConfig.b(q00).c(new File(a.n.getFilesDir(), ".realm.temp")).a(true).e(osSharedRealm$MigrationCallback0).f(osSchemaInfo0).d(a$b0), osSharedRealm$a0);
        this.e = osSharedRealm0;
        this.a = osSharedRealm0.isFrozen();
        this.f = true;
        this.e.registerSchemaChangedCallback(this.g);
    }

    a(OsSharedRealm osSharedRealm0) {
        this.g = new io.realm.a.a(this);
        this.b = Thread.currentThread().getId();
        this.c = osSharedRealm0.getConfiguration();
        this.d = null;
        this.e = osSharedRealm0;
        this.a = osSharedRealm0.isFrozen();
        this.f = false;
    }

    public boolean E0() {
        this.k();
        return this.e.isInTransaction();
    }

    X0 L(Class class0, long v, boolean z, List list0) {
        UncheckedRow uncheckedRow0 = this.e0().o(class0).U(v);
        c c0 = this.e0().j(class0);
        return this.c.s().x(class0, this, uncheckedRow0, c0, z, list0);
    }

    protected static void L0(Q0 q00, @o3.h W0 w00) throws FileNotFoundException {
        class e implements io.realm.O0.c {
            final Q0 a;
            final AtomicBoolean b;
            final W0 c;

            e(Q0 q00, AtomicBoolean atomicBoolean0, W0 w00) {
                this.b = atomicBoolean0;
                this.c = w00;
                super();
            }

            @Override  // io.realm.O0$c
            public void a(int v) {
                if(v != 0) {
                    throw new IllegalStateException("Cannot migrate a Realm file that is already open: " + this.a.n());
                }
                if(!new File(this.a.n()).exists()) {
                    this.b.set(true);
                    return;
                }
                OsSchemaInfo osSchemaInfo0 = new OsSchemaInfo(this.a.s().j().values());
                W0 w00 = this.c == null ? this.a.l() : this.c;
                MigrationCallback osSharedRealm$MigrationCallback0 = w00 == null ? null : a.s(w00);
                OsSharedRealm osSharedRealm0 = OsSharedRealm.getInstance(new io.realm.internal.OsRealmConfig.b(this.a).a(false).f(osSchemaInfo0).e(osSharedRealm$MigrationCallback0), io.realm.internal.OsSharedRealm.a.c);
                if(osSharedRealm0 != null) {
                    osSharedRealm0.close();
                }
            }
        }

        if(q00 == null) {
            throw new IllegalArgumentException("RealmConfiguration must be provided");
        }
        if(w00 == null && q00.l() == null) {
            throw new RealmMigrationNeededException(q00.n(), "RealmMigration must be provided.");
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        O0.q(q00, new e(q00, atomicBoolean0, w00));
        if(atomicBoolean0.get()) {
            throw new FileNotFoundException("Cannot migrate a Realm file which doesn\'t exist: " + q00.n());
        }
    }

    X0 Q(@o3.h Class class0, @o3.h String s, long v) {
        Table table0 = s == null ? this.e0().p(s) : this.e0().o(class0);
        if(s != null) {
            return v == -1L ? new G(this, io.realm.internal.i.a) : new G(this, table0.B(v));
        }
        t t0 = this.c.s();
        return v == -1L ? t0.x(class0, this, io.realm.internal.i.a, this.e0().j(class0), false, Collections.emptyList()) : t0.x(class0, this, table0.U(v), this.e0().j(class0), false, Collections.emptyList());
    }

    X0 R(@o3.h Class class0, @o3.h String s, UncheckedRow uncheckedRow0) {
        if(s != null) {
            return new G(this, CheckedRow.x(uncheckedRow0));
        }
        c c0 = this.e0().j(class0);
        List list0 = Collections.emptyList();
        return this.c.s().x(class0, this, uncheckedRow0, c0, false, list0);
    }

    public Q0 T() {
        return this.c;
    }

    public void T0() {
        this.k();
        this.f();
        if(this.E0()) {
            throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
        }
        this.e.refresh();
    }

    u Y(String s, s s1, String s2, h1 h10, f1 f10) {
        long v = f10.q(s2);
        RealmFieldType realmFieldType0 = f10.t(s2);
        u u0 = s1.R3().g();
        if(!f10.D(f10.t(s2))) {
            throw new IllegalArgumentException(String.format("Field \'%s\' does not contain a valid link", s2));
        }
        String s3 = f10.v(s2);
        if(!s3.equals(s)) {
            throw new IllegalArgumentException(String.format("Parent type %s expects that property \'%s\' be of type %s but was %s.", f10.p(), s2, s3, s));
        }
        long v1 = u0.H(v, realmFieldType0);
        return h10.p(s).B(v1);
    }

    protected void Y0() {
        if(this.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", new Object[]{this.c.n()});
        }
        this.e.realmNotifier.removeChangeListeners(this);
    }

    protected void a1(P0 p00) {
        if(p00 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if(this.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", new Object[]{this.c.n()});
        }
        this.e.realmNotifier.removeChangeListener(this, p00);
    }

    protected void b(P0 p00) {
        if(p00 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.k();
        this.e.capabilities.c("Listeners cannot be used on current thread.");
        if(this.a) {
            throw new IllegalStateException("It is not possible to add a change listener to a frozen Realm since it never changes.");
        }
        this.e.realmNotifier.addChangeListener(this, p00);
    }

    public void b1(boolean z) {
        this.k();
        this.e.setAutoRefresh(z);
    }

    public void beginTransaction() {
        this.k();
        this.e.beginTransaction();
    }

    public abstract l c();

    @Deprecated
    public void c1() {
        class io.realm.a.c implements io.realm.O0.b {
            final a a;

            @Override  // io.realm.O0$b
            public void a() {
                OsSharedRealm osSharedRealm0 = a.this.e;
                if(osSharedRealm0 == null || osSharedRealm0.isClosed()) {
                    throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
                }
                a.this.e.stopWaitForChange();
            }
        }

        O0 o00 = this.d;
        if(o00 == null) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        o00.r(new io.realm.a.c(this));
    }

    @Override
    public void close() {
        if(!this.a && this.b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        O0 o00 = this.d;
        if(o00 != null) {
            o00.t(this);
            return;
        }
        this.w();
    }

    public long d0() {
        this.k();
        return this.f0().getNumberOfVersions();
    }

    @Deprecated
    public boolean d1() {
        this.k();
        if(this.E0()) {
            throw new IllegalStateException("Cannot wait for changes inside of a transaction.");
        }
        if(Looper.myLooper() != null) {
            throw new IllegalStateException("Cannot wait for changes inside a Looper thread. Use RealmChangeListeners instead.");
        }
        boolean z = this.e.waitForChange();
        if(z) {
            this.e.refresh();
        }
        return z;
    }

    public void e() {
        this.k();
        this.e.cancelTransaction();
    }

    public abstract h1 e0();

    protected void f() {
        if(this.f0().capabilities.a() && !this.T().v()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting \'RealmConfiguration.Builder.allowQueriesOnUiThread(true)\'.");
        }
    }

    OsSharedRealm f0() {
        return this.e;
    }

    @Override
    protected void finalize() throws Throwable {
        if(this.f && (this.e != null && !this.e.isClosed())) {
            RealmLog.w("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", new Object[]{this.c.n()});
            O0 o00 = this.d;
            if(o00 != null) {
                o00.s();
            }
        }
        super.finalize();
    }

    public String getPath() {
        return this.c.n();
    }

    public long h0() {
        return OsObjectStore.d(this.e);
    }

    public void h1(File file0) {
        if(file0 == null) {
            throw new IllegalArgumentException("The destination argument cannot be null");
        }
        this.k();
        this.e.writeCopy(file0, null);
    }

    protected void i() {
        if(this.f0().capabilities.a() && !this.T().w()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting \'RealmConfiguration.Builder.allowWritesOnUiThread(true)\'.");
        }
    }

    public void i1(File file0, byte[] arr_b) {
        if(file0 == null) {
            throw new IllegalArgumentException("The destination argument cannot be null");
        }
        this.k();
        this.e.writeCopy(file0, arr_b);
    }

    public boolean isClosed() {
        if(!this.a && this.b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        return this.e == null || this.e.isClosed();
    }

    protected void j() {
        if(!this.e.isInTransaction()) {
            throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
        }
    }

    protected void k() {
        if(this.e == null || this.e.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        if(!this.a && this.b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    public boolean l0() {
        return this.e.isAutoRefresh();
    }

    protected void n() {
        if(!this.E0()) {
            throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
        }
    }

    void o() {
    }

    public void p() {
        this.k();
        this.e.commitTransaction();
    }

    static boolean q(Q0 q00) {
        OsSharedRealm osSharedRealm0 = OsSharedRealm.getInstance(q00, io.realm.internal.OsSharedRealm.a.c);
        boolean z = osSharedRealm0.compact();
        osSharedRealm0.close();
        return z;
    }

    private static MigrationCallback s(W0 w00) {
        class f implements MigrationCallback {
            final W0 a;

            f(W0 w00) {
            }

            @Override  // io.realm.internal.OsSharedRealm$MigrationCallback
            public void onMigrationNeeded(OsSharedRealm osSharedRealm0, long v, long v1) {
                E e0 = E.u1(osSharedRealm0);
                this.a.a(e0, v, v1);
            }
        }

        return new f(w00);
    }

    public void t() {
        this.k();
        for(Object object0: this.e0().i()) {
            this.e0().p(((f1)object0).p()).h();
        }
    }

    public abstract boolean u0();

    static boolean v(Q0 q00) {
        class io.realm.a.d implements Runnable {
            final Q0 a;
            final AtomicBoolean b;

            io.realm.a.d(Q0 q00, AtomicBoolean atomicBoolean0) {
                this.b = atomicBoolean0;
                super();
            }

            @Override
            public void run() {
                File file0 = this.a.o();
                String s = this.a.p();
                boolean z = Util.f(this.a.n(), file0, s);
                this.b.set(z);
            }
        }

        AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
        if(!OsObjectStore.a(q00, new io.realm.a.d(q00, atomicBoolean0))) {
            throw new IllegalStateException("It\'s not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: " + q00.n());
        }
        return atomicBoolean0.get();
    }

    void w() {
        this.d = null;
        OsSharedRealm osSharedRealm0 = this.e;
        if(osSharedRealm0 != null && this.f) {
            osSharedRealm0.close();
            this.e = null;
        }
    }

    public abstract a x();

    public boolean x0() {
        if(this.e == null || this.e.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        return this.a;
    }
}

