package io.realm;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.JsonReader;
import io.reactivex.l;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.m;
import io.realm.internal.r;
import io.realm.internal.s;
import io.realm.internal.t;
import io.realm.internal.u;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.TWR;
import o3.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class F0 extends a {
    public static abstract class c extends g {
        @Override  // io.realm.a$g
        public void a(Throwable throwable0) {
            super.a(throwable0);
        }

        @Override  // io.realm.a$g
        public void b(a a0) {
            this.c(((F0)a0));
        }

        public abstract void c(F0 arg1);
    }

    public interface d {
        public static class io.realm.F0.d.a {
            public void a(Exception exception0) {
            }

            public void b() {
            }
        }

        public interface b {
            void onError(Throwable arg1);
        }

        public interface io.realm.F0.d.c {
            void onSuccess();
        }

        void a(F0 arg1);
    }

    private final h1 r;
    private static final String s = "A non-null RealmConfiguration must be provided";
    public static final String t = "default.realm";
    public static final int u = 0x40;
    private static final Object v;
    private static Q0 w;

    static {
        F0.v = new Object();
    }

    private F0(O0 o00, io.realm.internal.OsSharedRealm.a osSharedRealm$a0) {
        super(o00, F0.Y2(o00.l().s()), osSharedRealm$a0);
        this.r = new V(this, new io.realm.internal.b(this.c.s(), this.e.getSchemaInfo()));
        if(this.c.x()) {
            t t0 = this.c.s();
            for(Object object0: t0.m()) {
                String s = Table.T(t0.o(((Class)object0)));
                if(!this.e.hasTable(s)) {
                    this.e.close();
                    Locale locale0 = Locale.US;
                    Object[] arr_object = {Table.D(s)};
                    throw new RealmMigrationNeededException(this.c.n(), String.format(locale0, "Cannot open the read only Realm. \'%s\' is missing.", arr_object));
                }
                if(false) {
                    break;
                }
            }
        }
    }

    private F0(OsSharedRealm osSharedRealm0) {
        super(osSharedRealm0);
        this.r = new V(this, new io.realm.internal.b(this.c.s(), osSharedRealm0.getSchemaInfo()));
    }

    public List A2(Iterable iterable0, W[] arr_w) {
        if(iterable0 == null) {
            return new ArrayList(0);
        }
        List list0 = iterable0 instanceof Collection ? new ArrayList(((Collection)iterable0).size()) : new ArrayList();
        HashMap hashMap0 = new HashMap();
        Set set0 = Util.o(arr_w);
        for(Object object0: iterable0) {
            this.N1(((X0)object0));
            ((ArrayList)list0).add(this.j2(((X0)object0), true, hashMap0, set0));
        }
        return list0;
    }

    public static void A4() {
        synchronized(F0.v) {
            F0.w = null;
        }
    }

    public void B3(Class class0, InputStream inputStream0) {
        if(class0 != null && inputStream0 != null) {
            this.k();
            this.u1(class0);
            Scanner scanner0 = null;
            try {
                try {
                    scanner0 = this.i4(inputStream0);
                    JSONArray jSONArray0 = new JSONArray(scanner0.next());
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                        this.c.s().f(class0, this, jSONObject0, true);
                    }
                }
                catch(JSONException jSONException0) {
                    throw new RealmException("Failed to read JSON", jSONException0);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(scanner0, throwable0);
                throw throwable0;
            }
            scanner0.close();
        }
    }

    public static void B4(Q0 q00) {
        if(q00 == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        synchronized(F0.v) {
            F0.w = q00;
        }
    }

    public void C2(Class class0, InputStream inputStream0) throws IOException {
        if(class0 != null && inputStream0 != null) {
            this.k();
            try(JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, "UTF-8"))) {
                jsonReader0.beginArray();
                while(true) {
                    if(!jsonReader0.hasNext()) {
                        break;
                    }
                    this.c.s().g(class0, this, jsonReader0);
                }
                jsonReader0.endArray();
            }
        }
    }

    public void C3(Class class0, String s) {
        JSONArray jSONArray0;
        if(class0 != null && s != null && s.length() != 0) {
            this.k();
            this.u1(class0);
            try {
                jSONArray0 = new JSONArray(s);
            }
            catch(JSONException jSONException0) {
                throw new RealmException("Could not create JSON array from string", jSONException0);
            }
            this.E3(class0, jSONArray0);
        }
    }

    public RealmQuery C4(Class class0) {
        this.k();
        return RealmQuery.P(this, class0);
    }

    @Override  // io.realm.a
    public boolean E0() {
        return super.E0();
    }

    public void E3(Class class0, JSONArray jSONArray0) {
        if(class0 != null && jSONArray0 != null) {
            this.k();
            this.u1(class0);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    this.c.s().f(class0, this, jSONObject0, true);
                }
                catch(JSONException jSONException0) {
                    throw new RealmException("Could not map JSON", jSONException0);
                }
            }
        }
    }

    public X0 F3(Class class0, InputStream inputStream0) {
        X0 x00;
        Scanner scanner0 = null;
        if(class0 != null && inputStream0 != null) {
            this.k();
            this.u1(class0);
            try {
                try {
                    scanner0 = this.i4(inputStream0);
                    x00 = this.S3(class0, new JSONObject(scanner0.next()));
                }
                catch(JSONException jSONException0) {
                    throw new RealmException("Failed to read JSON", jSONException0);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(scanner0, throwable0);
                throw throwable0;
            }
            scanner0.close();
            return x00;
        }
        return null;
    }

    public void I2(Class class0, String s) {
        JSONArray jSONArray0;
        if(class0 != null && s != null && s.length() != 0) {
            try {
                jSONArray0 = new JSONArray(s);
            }
            catch(JSONException jSONException0) {
                throw new RealmException("Could not create JSON array from string", jSONException0);
            }
            this.L2(class0, jSONArray0);
        }
    }

    private void J1(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("maxDepth must be > 0. It was: " + v);
        }
    }

    @Override  // io.realm.a
    public static void L0(Q0 q00, @h W0 w00) throws FileNotFoundException {
        a.L0(q00, w00);
    }

    public void L2(Class class0, JSONArray jSONArray0) {
        if(class0 != null && jSONArray0 != null) {
            this.k();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    this.c.s().f(class0, this, jSONObject0, false);
                }
                catch(JSONException jSONException0) {
                    throw new RealmException("Could not map JSON", jSONException0);
                }
            }
        }
    }

    private void N1(X0 x00) {
        if(x00 == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    public X0 N3(Class class0, String s) {
        if(class0 != null && s != null && s.length() != 0) {
            this.k();
            this.u1(class0);
            try {
                return this.S3(class0, new JSONObject(s));
            }
            catch(JSONException jSONException0) {
                throw new RealmException("Could not create Json object from string", jSONException0);
            }
        }
        return null;
    }

    private X0 P2(X0 x00, int v, Map map0) {
        this.k();
        return this.c.s().e(x00, v, map0);
    }

    private void Q1(X0 x00) {
        if(x00 == null) {
            throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
        }
        if(!d1.H5(x00) || !d1.I5(x00)) {
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        if(x00 instanceof G) {
            throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
        }
    }

    public X0 R2(Class class0, X0 x00, String s) {
        this.k();
        Util.e(x00, "parentObject");
        Util.b(s, "parentProperty");
        if(!d1.H5(x00) || !d1.I5(x00)) {
            throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
        }
        String s1 = this.r.m(class0).p();
        Class class1 = x00.getClass();
        f1 f10 = this.r.m(class1);
        u u0 = this.Y(s1, ((s)x00), s, this.r, f10);
        io.realm.internal.c c0 = this.r.j(class0);
        return this.c.s().x(class0, this, u0, c0, true, Collections.EMPTY_LIST);
    }

    public X0 S3(Class class0, JSONObject jSONObject0) {
        if(class0 != null && jSONObject0 != null) {
            this.k();
            this.u1(class0);
            try {
                return this.c.s().f(class0, this, jSONObject0, true);
            }
            catch(JSONException jSONException0) {
                throw new RealmException("Could not map JSON", jSONException0);
            }
        }
        return null;
    }

    @Override  // io.realm.a
    public Q0 T() {
        return super.T();
    }

    @Override  // io.realm.a
    public void T0() {
        super.T0();
    }

    public void T3(Class class0) {
        this.k();
        this.r.o(class0).h();
    }

    private static OsSchemaInfo Y2(t t0) {
        return new OsSchemaInfo(t0.j().values());
    }

    public void Y3(d f0$d0) {
        if(f0$d0 != null) {
            this.k();
            this.i();
            this.beginTransaction();
            try {
                f0$d0.a(this);
                this.p();
                return;
            }
            catch(Throwable throwable0) {
                if(this.E0()) {
                    this.e();
                }
                else {
                    RealmLog.w("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw throwable0;
            }
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }

    public N0 Z3(d f0$d0) {
        return this.c4(f0$d0, null, null);
    }

    public N0 a4(d f0$d0, b f0$d$b0) {
        if(f0$d$b0 == null) {
            throw new IllegalArgumentException("onError callback can\'t be null");
        }
        return this.c4(f0$d0, null, f0$d$b0);
    }

    @Override  // io.realm.a
    public void b1(boolean z) {
        super.b1(z);
    }

    static F0 b3(O0 o00, io.realm.internal.OsSharedRealm.a osSharedRealm$a0) {
        return new F0(o00, osSharedRealm$a0);
    }

    public N0 b4(d f0$d0, io.realm.F0.d.c f0$d$c0) {
        if(f0$d$c0 == null) {
            throw new IllegalArgumentException("onSuccess callback can\'t be null");
        }
        return this.c4(f0$d0, f0$d$c0, null);
    }

    @Override  // io.realm.a
    public void beginTransaction() {
        super.beginTransaction();
    }

    @Override  // io.realm.a
    public l c() {
        return this.c.r().f(this);
    }

    @Override  // io.realm.a
    @Deprecated
    public void c1() {
        super.c1();
    }

    public N0 c4(d f0$d0, @h io.realm.F0.d.c f0$d$c0, @h b f0$d$b0) {
        class io.realm.F0.a implements Runnable {
            final Q0 a;
            final d b;
            final boolean c;
            final io.realm.F0.d.c d;
            final RealmNotifier e;
            final b f;
            final F0 g;

            io.realm.F0.a(Q0 q00, d f0$d0, boolean z, io.realm.F0.d.c f0$d$c0, RealmNotifier realmNotifier0, b f0$d$b0) {
                this.a = q00;
                this.b = f0$d0;
                this.c = z;
                this.d = f0$d$c0;
                this.e = realmNotifier0;
                this.f = f0$d$b0;
                super();
            }

            @Override
            public void run() {
                class io.realm.F0.a.a implements Runnable {
                    final io.realm.internal.OsSharedRealm.a a;
                    final io.realm.F0.a b;

                    io.realm.F0.a.a(io.realm.internal.OsSharedRealm.a osSharedRealm$a0) {
                        this.a = osSharedRealm$a0;
                        super();
                    }

                    @Override
                    public void run() {
                        class io.realm.F0.a.a.a implements Runnable {
                            final io.realm.F0.a.a a;

                            @Override
                            public void run() {
                                io.realm.F0.a.this.d.onSuccess();
                            }
                        }

                        if(F0.this.isClosed()) {
                            io.realm.F0.a.this.d.onSuccess();
                            return;
                        }
                        if(F0.this.e.getVersionID().a(this.a) < 0) {
                            F0.this.e.realmNotifier.addTransactionCallback(new io.realm.F0.a.a.a(this));
                            return;
                        }
                        io.realm.F0.a.this.d.onSuccess();
                    }
                }


                class io.realm.F0.a.b implements Runnable {
                    final Throwable a;
                    final io.realm.F0.a b;

                    io.realm.F0.a.b(Throwable throwable0) {
                        this.a = throwable0;
                        super();
                    }

                    @Override
                    public void run() {
                        b f0$d$b0 = io.realm.F0.a.this.f;
                        if(f0$d$b0 == null) {
                            throw new RealmException("Async transaction failed", this.a);
                        }
                        f0$d$b0.onError(this.a);
                    }
                }

                io.realm.internal.OsSharedRealm.a osSharedRealm$a0;
                if(Thread.currentThread().isInterrupted()) {
                    return;
                }
                F0 f00 = F0.k4(this.a);
                f00.beginTransaction();
                Throwable throwable0 = null;
                try {
                    this.b.a(f00);
                    if(!Thread.currentThread().isInterrupted()) {
                        f00.p();
                        osSharedRealm$a0 = f00.e.getVersionID();
                        goto label_21;
                    }
                    goto label_40;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f00.E0()) {
                            f00.e();
                        }
                    }
                    catch(Throwable throwable2) {
                        TWR.safeClose$NT(f00, throwable2);
                        throw throwable2;
                    }
                    f00.close();
                    osSharedRealm$a0 = null;
                    throwable0 = throwable1;
                    goto label_28;
                }
                try {
                label_21:
                    if(f00.E0()) {
                        f00.e();
                    }
                }
                catch(Throwable throwable3) {
                    TWR.safeClose$NT(f00, throwable3);
                    throw throwable3;
                }
                f00.close();
            label_28:
                if(this.c) {
                    if(osSharedRealm$a0 != null && this.d != null) {
                        io.realm.F0.a.a f0$a$a0 = new io.realm.F0.a.a(this, osSharedRealm$a0);
                        this.e.post(f0$a$a0);
                        return;
                    }
                    if(throwable0 == null) {
                        return;
                    }
                    io.realm.F0.a.b f0$a$b0 = new io.realm.F0.a.b(this, throwable0);
                    this.e.post(f0$a$b0);
                    return;
                }
                if(throwable0 != null) {
                    throw new RealmException("Async transaction failed", throwable0);
                }
                return;
                try {
                label_40:
                    if(f00.E0()) {
                        f00.e();
                    }
                }
                catch(Throwable throwable4) {
                    TWR.safeClose$NT(f00, throwable4);
                    throw throwable4;
                }
                f00.close();
            }
        }

        this.k();
        if(f0$d0 == null) {
            throw new IllegalArgumentException("Transaction should not be null");
        }
        if(this.x0()) {
            throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
        }
        boolean z = this.e.capabilities.b();
        if(f0$d$c0 != null || f0$d$b0 != null) {
            this.e.capabilities.c("Callback cannot be delivered on current thread.");
        }
        io.realm.F0.a f0$a0 = new io.realm.F0.a(this, this.T(), f0$d0, z, f0$d$c0, this.e.realmNotifier, f0$d$b0);
        return new io.realm.internal.async.c(a.o.e(f0$a0), a.o);
    }

    @Override  // io.realm.a
    public void close() {
        super.close();
    }

    @Override  // io.realm.a
    public long d0() {
        return super.d0();
    }

    @Override  // io.realm.a
    @Deprecated
    public boolean d1() {
        return super.d1();
    }

    public X0 d2(X0 x00) {
        return this.e2(x00, 0x7FFFFFFF);
    }

    public F0 d4() {
        io.realm.internal.OsSharedRealm.a osSharedRealm$a0 = this.e.getVersionID();
        return (F0)O0.f(this.c, F0.class, osSharedRealm$a0);
    }

    @Override  // io.realm.a
    public void e() {
        super.e();
    }

    @Override  // io.realm.a
    public h1 e0() {
        return this.r;
    }

    public X0 e2(X0 x00, int v) {
        this.J1(v);
        this.Q1(x00);
        return this.P2(x00, v, new HashMap());
    }

    // 检测为 Lambda 实现
    static F0 e3(OsSharedRealm osSharedRealm0) [...]

    @h
    public static Context e4() {
        return a.n;
    }

    @h
    public static Q0 f4() {
        synchronized(F0.v) {
        }
        return F0.w;
    }

    public List g2(Iterable iterable0) {
        return this.i2(iterable0, 0x7FFFFFFF);
    }

    public static F0 g4() {
        Q0 q00 = F0.f4();
        if(q00 == null) {
            throw a.n == null ? new IllegalStateException("Call `Realm.init(Context)` before calling this method.") : new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
        }
        return (F0)O0.e(q00, F0.class);
    }

    @Override  // io.realm.a
    public String getPath() {
        return super.getPath();
    }

    @Override  // io.realm.a
    public long h0() {
        return super.h0();
    }

    @Override  // io.realm.a
    public void h1(File file0) {
        super.h1(file0);
    }

    @h
    public static Object h4() {
        try {
            Constructor constructor0 = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor0.setAccessible(true);
            return constructor0.newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", invocationTargetException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", illegalAccessException0);
        }
    }

    @Override  // io.realm.a
    public void i1(File file0, byte[] arr_b) {
        super.i1(file0, arr_b);
    }

    public List i2(Iterable iterable0, int v) {
        this.J1(v);
        if(iterable0 == null) {
            return new ArrayList(0);
        }
        List list0 = iterable0 instanceof Collection ? new ArrayList(((Collection)iterable0).size()) : new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: iterable0) {
            this.Q1(((X0)object0));
            ((ArrayList)list0).add(this.P2(((X0)object0), v, hashMap0));
        }
        return list0;
    }

    public X0 i3(Class class0) {
        this.k();
        t t0 = this.c.s();
        if(t0.w(class0)) {
            throw new IllegalArgumentException("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  " + t0.o(class0));
        }
        return this.y3(class0, true, Collections.emptyList());
    }

    private Scanner i4(InputStream inputStream0) {
        return new Scanner(inputStream0, "UTF-8").useDelimiter("\\A");
    }

    @Override  // io.realm.a
    public boolean isClosed() {
        return super.isClosed();
    }

    private X0 j2(X0 x00, boolean z, Map map0, Set set0) {
        this.k();
        if(!this.E0()) {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        }
        Class class0 = Util.h(x00.getClass());
        if(!this.c.s().w(class0)) {
            try {
                return this.c.s().c(this, x00, z, map0, set0);
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getMessage().startsWith("Attempting to create an object of type")) {
                    throw new RealmPrimaryKeyConstraintException(runtimeException0.getMessage());
                }
                throw runtimeException0;
            }
        }
        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
    }

    public static int j4(Q0 q00) {
        class io.realm.F0.b implements io.realm.O0.c {
            final AtomicInteger a;

            io.realm.F0.b(AtomicInteger atomicInteger0) {
            }

            @Override  // io.realm.O0$c
            public void a(int v) {
                this.a.set(v);
            }
        }

        AtomicInteger atomicInteger0 = new AtomicInteger(0);
        O0.q(q00, new io.realm.F0.b(atomicInteger0));
        return atomicInteger0.get();
    }

    public static F0 k4(Q0 q00) {
        if(q00 == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        return (F0)O0.e(q00, F0.class);
    }

    @Override  // io.realm.a
    public boolean l0() {
        return super.l0();
    }

    public void l1(P0 p00) {
        this.b(p00);
    }

    public static N0 l4(Q0 q00, c f0$c0) {
        if(q00 == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        return O0.g(q00, f0$c0, F0.class);
    }

    public static int m4(Q0 q00) {
        return O0.m(q00);
    }

    public X0 n3(Class class0, @h Object object0) {
        this.k();
        t t0 = this.c.s();
        if(t0.w(class0)) {
            throw new IllegalArgumentException("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  " + t0.o(class0));
        }
        return this.v3(class0, object0, true, Collections.emptyList());
    }

    Table n4(Class class0) {
        return this.r.o(class0);
    }

    public X0 o2(X0 x00, W[] arr_w) {
        this.N1(x00);
        return this.j2(x00, false, new HashMap(), Util.o(arr_w));
    }

    boolean o4(Class class0) {
        return this.c.s().q(class0);
    }

    @Override  // io.realm.a
    public void p() {
        super.p();
    }

    public List p2(Iterable iterable0, W[] arr_w) {
        if(iterable0 == null) {
            return new ArrayList();
        }
        List list0 = iterable0 instanceof Collection ? new ArrayList(((Collection)iterable0).size()) : new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: iterable0) {
            this.N1(((X0)object0));
            ((ArrayList)list0).add(this.j2(((X0)object0), false, hashMap0, Util.o(arr_w)));
        }
        return list0;
    }

    @h
    public X0 p3(Class class0, InputStream inputStream0) throws IOException {
        X0 x00;
        Scanner scanner0 = null;
        if(class0 != null && inputStream0 != null) {
            this.k();
            if(OsObjectStore.c(this.e, this.c.s().o(class0)) != null) {
                try {
                    try {
                        scanner0 = this.i4(inputStream0);
                        JSONObject jSONObject0 = new JSONObject(scanner0.next());
                        x00 = this.c.s().f(class0, this, jSONObject0, false);
                    }
                    catch(JSONException jSONException0) {
                        throw new RealmException("Failed to read JSON", jSONException0);
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(scanner0, throwable0);
                    throw throwable0;
                }
                scanner0.close();
                return x00;
            }
            try(JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, "UTF-8"))) {
                return this.c.s().g(class0, this, jsonReader0);
            }
        }
        return null;
    }

    public static void p4(Context context0) {
        synchronized(F0.class) {
            F0.q4(context0, "");
        }
    }

    @Override  // io.realm.a
    public static boolean q(Q0 q00) {
        return a.q(q00);
    }

    private static void q4(Context context0, String s) {
        if(a.n == null) {
            if(context0 == null) {
                throw new IllegalArgumentException("Non-null context required.");
            }
            F0.t1(context0);
            if(F0.v4(context0)) {
                throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
            }
            r.c(context0);
            F0.B4(new io.realm.Q0.a(context0).e());
            m.g().j(context0, s, (Q0 q00, io.realm.internal.OsSharedRealm.a osSharedRealm$a0) -> ((F0)O0.f(q00, F0.class, osSharedRealm$a0)), (OsSharedRealm osSharedRealm0) -> new F0(osSharedRealm0));
            a.n = context0.getApplicationContext() == null ? context0 : context0.getApplicationContext();
            OsSharedRealm.initialize(new File(context0.getFilesDir(), ".realm.temp"));
        }
    }

    @h
    public X0 r3(Class class0, String s) {
        if(class0 != null && s != null && s.length() != 0) {
            try {
                return this.s3(class0, new JSONObject(s));
            }
            catch(JSONException jSONException0) {
                throw new RealmException("Could not create Json object from string", jSONException0);
            }
        }
        return null;
    }

    public void r4(X0 x00) {
        this.n();
        if(x00 == null) {
            throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
        }
        HashMap hashMap0 = new HashMap();
        this.c.s().s(this, x00, hashMap0);
    }

    @h
    public X0 s3(Class class0, JSONObject jSONObject0) {
        if(class0 != null && jSONObject0 != null) {
            this.k();
            try {
                return this.c.s().f(class0, this, jSONObject0, false);
            }
            catch(JSONException jSONException0) {
                throw new RealmException("Could not map JSON", jSONException0);
            }
        }
        return null;
    }

    public void s4(Collection collection0) {
        this.n();
        if(collection0 == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        }
        if(collection0.isEmpty()) {
            return;
        }
        this.c.s().t(this, collection0);
    }

    @Override  // io.realm.a
    public void t() {
        super.t();
    }

    private static void t1(Context context0) {
        File file0 = context0.getFilesDir();
        if(file0 != null) {
            if(file0.exists()) {
                return;
            }
            try {
                file0.mkdirs();
            }
            catch(SecurityException unused_ex) {
            }
        }
        if(file0 == null || !file0.exists()) {
            long v = 0L;
            int v1 = -1;
            while(context0.getFilesDir() == null || !context0.getFilesDir().exists()) {
                ++v1;
                long v2 = new long[]{1L, 2L, 5L, 10L, 16L}[Math.min(v1, 4)];
                SystemClock.sleep(v2);
                v += v2;
                if(v > 200L) {
                    break;
                }
            }
        }
        if(context0.getFilesDir() == null || !context0.getFilesDir().exists()) {
            throw new IllegalStateException("Context.getFilesDir() returns " + context0.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        }
    }

    public X0 t2(X0 x00, W[] arr_w) {
        this.N1(x00);
        this.u1(x00.getClass());
        return this.j2(x00, true, new HashMap(), Util.o(arr_w));
    }

    public void t4(X0 x00) {
        this.n();
        if(x00 == null) {
            throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
        }
        HashMap hashMap0 = new HashMap();
        this.c.s().u(this, x00, hashMap0);
    }

    @Override  // io.realm.a
    public boolean u0() {
        this.k();
        for(Object object0: this.r.i()) {
            if(!((f1)object0).p().startsWith("__") && ((f1)object0).w().A0() > 0L) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private void u1(Class class0) {
        if(!this.o4(class0)) {
            throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + class0.toString());
        }
    }

    public void u4(Collection collection0) {
        this.n();
        if(collection0 == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        }
        if(collection0.isEmpty()) {
            return;
        }
        this.c.s().v(this, collection0);
    }

    @Override  // io.realm.a
    public static boolean v(Q0 q00) {
        return a.v(q00);
    }

    X0 v3(Class class0, @h Object object0, boolean z, List list0) {
        UncheckedRow uncheckedRow0 = OsObject.createWithPrimaryKey(this.r.o(class0), object0);
        io.realm.internal.c c0 = this.r.j(class0);
        return this.c.s().x(class0, this, uncheckedRow0, c0, z, list0);
    }

    private static boolean v4(Context context0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return context0.getPackageManager().isInstantApp();
        }
        try {
            return ((Boolean)Class.forName("com.google.android.gms.instantapps.PackageManagerCompat").getMethod("isInstantApp", null).invoke(Class.forName("com.google.android.gms.instantapps.InstantApps").getMethod("getPackageManagerCompat", Context.class).invoke(null, context0), null)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    // 检测为 Lambda 实现
    private static F0 w4(Q0 q00, io.realm.internal.OsSharedRealm.a osSharedRealm$a0) [...]

    @Override  // io.realm.a
    public a x() {
        return this.d4();
    }

    @Override  // io.realm.a
    public boolean x0() {
        return super.x0();
    }

    public static void x4(Q0 q00) throws FileNotFoundException {
        F0.L0(q00, null);
    }

    X0 y3(Class class0, boolean z, List list0) {
        Table table0 = this.r.o(class0);
        if(OsObjectStore.c(this.e, this.c.s().o(class0)) != null) {
            throw new RealmException(String.format(Locale.US, "\'%s\' has a primary key, use \'createObject(Class<E>, Object)\' instead.", table0.C()));
        }
        UncheckedRow uncheckedRow0 = OsObject.create(table0);
        io.realm.internal.c c0 = this.r.j(class0);
        return this.c.s().x(class0, this, uncheckedRow0, c0, z, list0);
    }

    public void y4() {
        this.Y0();
    }

    public void z4(P0 p00) {
        this.a1(p00);
    }
}

