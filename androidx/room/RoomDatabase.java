package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat.Api19Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import j..util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;
import z3.j;
import z3.o;

@s0({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
public abstract class RoomDatabase {
    @s0({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    public static class Builder {
        @l
        private final Context a;
        @l
        private final Class b;
        @m
        private final String c;
        @l
        private final List d;
        @m
        private PrepackagedDatabaseCallback e;
        @m
        private QueryCallback f;
        @m
        private Executor g;
        @l
        private final List h;
        @l
        private List i;
        @m
        private Executor j;
        @m
        private Executor k;
        @m
        private Factory l;
        private boolean m;
        @l
        private JournalMode n;
        @m
        private Intent o;
        private boolean p;
        private boolean q;
        private long r;
        @m
        private TimeUnit s;
        @l
        private final MigrationContainer t;
        @l
        private Set u;
        @m
        private Set v;
        @m
        private String w;
        @m
        private File x;
        @m
        private Callable y;

        public Builder(@l Context context0, @l Class class0, @m String s) {
            L.p(context0, "context");
            L.p(class0, "klass");
            super();
            this.a = context0;
            this.b = class0;
            this.c = s;
            this.d = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.n = JournalMode.a;
            this.p = true;
            this.r = -1L;
            this.t = new MigrationContainer();
            this.u = new LinkedHashSet();
        }

        @l
        public Builder a(@l AutoMigrationSpec autoMigrationSpec0) {
            L.p(autoMigrationSpec0, "autoMigrationSpec");
            this.i.add(autoMigrationSpec0);
            return this;
        }

        @l
        public Builder b(@l Callback roomDatabase$Callback0) {
            L.p(roomDatabase$Callback0, "callback");
            this.d.add(roomDatabase$Callback0);
            return this;
        }

        @l
        public Builder c(@l Migration[] arr_migration) {
            L.p(arr_migration, "migrations");
            if(this.v == null) {
                this.v = new HashSet();
            }
            for(int v = 0; v < arr_migration.length; ++v) {
                Migration migration0 = arr_migration[v];
                Set set0 = this.v;
                L.m(set0);
                set0.add(migration0.a);
                Set set1 = this.v;
                L.m(set1);
                set1.add(migration0.b);
            }
            Migration[] arr_migration1 = (Migration[])Arrays.copyOf(arr_migration, arr_migration.length);
            this.t.c(arr_migration1);
            return this;
        }

        @l
        public Builder d(@l Object object0) {
            L.p(object0, "typeConverter");
            this.h.add(object0);
            return this;
        }

        @l
        public Builder e() {
            this.m = true;
            return this;
        }

        @l
        public RoomDatabase f() {
            Factory supportSQLiteOpenHelper$Factory1;
            Executor executor0 = this.j;
            if(executor0 == null && this.k == null) {
                Executor executor1 = ArchTaskExecutor.g();
                this.k = executor1;
                this.j = executor1;
            }
            else if(executor0 != null && this.k == null) {
                this.k = executor0;
            }
            else if(executor0 == null) {
                this.j = this.k;
            }
            Set set0 = this.v;
            if(set0 != null) {
                L.m(set0);
                for(Object object0: set0) {
                    int v = ((Number)object0).intValue();
                    if(this.u.contains(v)) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + v).toString());
                    }
                    if(false) {
                        break;
                    }
                }
            }
            Factory supportSQLiteOpenHelper$Factory0 = this.l;
            if(supportSQLiteOpenHelper$Factory0 == null) {
                supportSQLiteOpenHelper$Factory0 = new FrameworkSQLiteOpenHelperFactory();
            }
            if(supportSQLiteOpenHelper$Factory0 == null) {
                supportSQLiteOpenHelper$Factory0 = null;
            }
            else {
                if(this.r > 0L) {
                    if(this.c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long v1 = this.r;
                    TimeUnit timeUnit0 = this.s;
                    if(timeUnit0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.j;
                    if(executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    supportSQLiteOpenHelper$Factory0 = new AutoClosingRoomOpenHelperFactory(supportSQLiteOpenHelper$Factory0, new AutoCloser(v1, timeUnit0, executor2));
                }
                int v2 = 0;
                String s = this.w;
                if(s != null || this.x != null || this.y != null) {
                    if(this.c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    File file0 = this.x;
                    Callable callable0 = this.y;
                    if(callable0 != null) {
                        v2 = 1;
                    }
                    if((s == null ? 0 : 1) + (file0 == null ? 0 : 1) + v2 != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    supportSQLiteOpenHelper$Factory0 = new SQLiteCopyOpenHelperFactory(s, file0, callable0, supportSQLiteOpenHelper$Factory0);
                }
            }
            if(supportSQLiteOpenHelper$Factory0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            QueryCallback roomDatabase$QueryCallback0 = this.f;
            if(roomDatabase$QueryCallback0 == null) {
                supportSQLiteOpenHelper$Factory1 = supportSQLiteOpenHelper$Factory0;
            }
            else {
                Executor executor3 = this.g;
                if(executor3 == null || roomDatabase$QueryCallback0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteOpenHelper$Factory1 = new QueryInterceptorOpenHelperFactory(supportSQLiteOpenHelper$Factory0, executor3, roomDatabase$QueryCallback0);
            }
            Context context0 = this.a;
            String s1 = this.c;
            MigrationContainer roomDatabase$MigrationContainer0 = this.t;
            List list0 = this.d;
            boolean z = this.m;
            JournalMode roomDatabase$JournalMode0 = this.n.c(context0);
            Executor executor4 = this.j;
            if(executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor5 = this.k;
            if(executor5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration0 = new DatabaseConfiguration(context0, s1, supportSQLiteOpenHelper$Factory1, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor4, executor5, this.o, this.p, this.q, this.u, this.w, this.x, this.y, this.e, this.h, this.i);
            RoomDatabase roomDatabase0 = (RoomDatabase)Room.b(this.b, "_Impl");
            roomDatabase0.A(databaseConfiguration0);
            return roomDatabase0;
        }

        @l
        public Builder g(@l String s) {
            L.p(s, "databaseFilePath");
            this.w = s;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @l
        public Builder h(@l String s, @l PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
            L.p(s, "databaseFilePath");
            L.p(roomDatabase$PrepackagedDatabaseCallback0, "callback");
            this.e = roomDatabase$PrepackagedDatabaseCallback0;
            this.w = s;
            return this;
        }

        @l
        public Builder i(@l File file0) {
            L.p(file0, "databaseFile");
            this.x = file0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @l
        public Builder j(@l File file0, @l PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
            L.p(file0, "databaseFile");
            L.p(roomDatabase$PrepackagedDatabaseCallback0, "callback");
            this.e = roomDatabase$PrepackagedDatabaseCallback0;
            this.x = file0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @l
        public Builder k(@l Callable callable0) {
            L.p(callable0, "inputStreamCallable");
            this.y = callable0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @l
        public Builder l(@l Callable callable0, @l PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
            L.p(callable0, "inputStreamCallable");
            L.p(roomDatabase$PrepackagedDatabaseCallback0, "callback");
            this.e = roomDatabase$PrepackagedDatabaseCallback0;
            this.y = callable0;
            return this;
        }

        @l
        public Builder m() {
            this.o = this.c == null ? null : new Intent(this.a, MultiInstanceInvalidationService.class);
            return this;
        }

        @l
        public Builder n() {
            this.p = false;
            this.q = true;
            return this;
        }

        @l
        public Builder o(@l int[] arr_v) {
            L.p(arr_v, "startVersions");
            for(int v = 0; v < arr_v.length; ++v) {
                this.u.add(((int)arr_v[v]));
            }
            return this;
        }

        @l
        public Builder p() {
            this.p = true;
            this.q = true;
            return this;
        }

        @l
        public Builder q(@m Factory supportSQLiteOpenHelper$Factory0) {
            this.l = supportSQLiteOpenHelper$Factory0;
            return this;
        }

        @ExperimentalRoomApi
        @l
        public Builder r(@IntRange(from = 0L) long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "autoCloseTimeUnit");
            if(v < 0L) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.r = v;
            this.s = timeUnit0;
            return this;
        }

        @l
        public Builder s(@l JournalMode roomDatabase$JournalMode0) {
            L.p(roomDatabase$JournalMode0, "journalMode");
            this.n = roomDatabase$JournalMode0;
            return this;
        }

        @ExperimentalRoomApi
        @l
        public Builder t(@l Intent intent0) {
            L.p(intent0, "invalidationServiceIntent");
            if(this.c == null) {
                intent0 = null;
            }
            this.o = intent0;
            return this;
        }

        @l
        public Builder u(@l QueryCallback roomDatabase$QueryCallback0, @l Executor executor0) {
            L.p(roomDatabase$QueryCallback0, "queryCallback");
            L.p(executor0, "executor");
            this.f = roomDatabase$QueryCallback0;
            this.g = executor0;
            return this;
        }

        @l
        public Builder v(@l Executor executor0) {
            L.p(executor0, "executor");
            this.j = executor0;
            return this;
        }

        @l
        public Builder w(@l Executor executor0) {
            L.p(executor0, "executor");
            this.k = executor0;
            return this;
        }
    }

    public static abstract class Callback {
        public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }

        public void b(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }

        public void c(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static final JournalMode[] a() [...] // Inlined contents

        private final boolean b(ActivityManager activityManager0) {
            return Api19Impl.b(activityManager0);
        }

        @l
        public final JournalMode c(@l Context context0) {
            L.p(context0, "context");
            if(this != JournalMode.a) {
                return this;
            }
            Object object0 = context0.getSystemService("activity");
            ActivityManager activityManager0 = object0 instanceof ActivityManager ? ((ActivityManager)object0) : null;
            return activityManager0 == null || this.b(activityManager0) ? JournalMode.b : JournalMode.c;
        }
    }

    @s0({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    public static class MigrationContainer {
        @l
        private final Map a;

        public MigrationContainer() {
            this.a = new LinkedHashMap();
        }

        private final void a(Migration migration0) {
            int v = migration0.b;
            Map map0 = this.a;
            Integer integer0 = migration0.a;
            TreeMap treeMap0 = map0.get(integer0);
            if(treeMap0 == null) {
                treeMap0 = new TreeMap();
                map0.put(integer0, treeMap0);
            }
            if(treeMap0.containsKey(v)) {
                Log.w("ROOM", "Overriding migration " + treeMap0.get(v) + " with " + migration0);
            }
            treeMap0.put(v, migration0);
        }

        public void b(@l List list0) {
            L.p(list0, "migrations");
            for(Object object0: list0) {
                this.a(((Migration)object0));
            }
        }

        public void c(@l Migration[] arr_migration) {
            L.p(arr_migration, "migrations");
            for(int v = 0; v < arr_migration.length; ++v) {
                this.a(arr_migration[v]);
            }
        }

        public final boolean d(int v, int v1) {
            Map map0 = this.g();
            if(map0.containsKey(v)) {
                Map map1 = (Map)map0.get(v);
                if(map1 == null) {
                    map1 = Y.z();
                }
                return map1.containsKey(v1);
            }
            return false;
        }

        @m
        public List e(int v, int v1) {
            if(v == v1) {
                return u.H();
            }
            return v1 <= v ? this.f(new ArrayList(), false, v, v1) : this.f(new ArrayList(), true, v, v1);
        }

        // This method was un-flattened
        private final List f(List list0, boolean z, int v, int v1) {
            while(true) {
                if(!z) {
                    if(v > v1) {
                        goto label_4;
                    }
                    return list0;
                }
                else if(v >= v1) {
                    return list0;
                }
            label_4:
                TreeMap treeMap0 = (TreeMap)this.a.get(v);
                if(treeMap0 == null) {
                    return null;
                }
                Set set0 = z ? treeMap0.descendingKeySet() : treeMap0.keySet();
                Iterator iterator0 = set0.iterator();
            label_12:
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object0 = iterator0.next();
                Integer integer0 = (Integer)object0;
                if(z) {
                    L.o(integer0, "targetVersion");
                    int v2 = (int)integer0;
                    if(v + 1 > v2 || v2 > v1) {
                        break;
                    }
                }
                else {
                    L.o(integer0, "targetVersion");
                    int v3 = (int)integer0;
                    if(v1 <= v3 && v3 < v) {
                        goto label_23;
                    }
                    break;
                }
            label_23:
                Object object1 = treeMap0.get(integer0);
                L.m(object1);
                list0.add(object1);
                v = (int)integer0;
            }
            goto label_12;
        }

        @l
        public Map g() {
            return this.a;
        }
    }

    public static abstract class PrepackagedDatabaseCallback {
        public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }
    }

    public interface QueryCallback {
        void a(@l String arg1, @l List arg2);
    }

    @m
    @f
    protected volatile SupportSQLiteDatabase a;
    private Executor b;
    private Executor c;
    private SupportSQLiteOpenHelper d;
    @l
    private final InvalidationTracker e;
    private boolean f;
    private boolean g;
    @RestrictTo({Scope.c})
    @m
    @f
    protected List h;
    @l
    private Map i;
    @l
    private final ReentrantReadWriteLock j;
    @m
    private AutoCloser k;
    @l
    private final ThreadLocal l;
    @l
    private final Map m;
    @l
    private final Map n;
    @l
    public static final Companion o = null;
    @RestrictTo({Scope.c})
    public static final int p = 999;

    static {
        RoomDatabase.o = new Companion(null);
    }

    public RoomDatabase() {
        this.e = this.i();
        this.i = new LinkedHashMap();
        this.j = new ReentrantReadWriteLock();
        this.l = new ThreadLocal();
        Map map0 = DesugarCollections.synchronizedMap(new LinkedHashMap());
        L.o(map0, "synchronizedMap(mutableMapOf())");
        this.m = map0;
        this.n = new LinkedHashMap();
    }

    @CallSuper
    public void A(@l DatabaseConfiguration databaseConfiguration0) {
        boolean z = false;
        L.p(databaseConfiguration0, "configuration");
        this.d = this.j(databaseConfiguration0);
        Set set0 = this.u();
        BitSet bitSet0 = new BitSet();
        for(Object object0: set0) {
            Class class0 = (Class)object0;
            int v = databaseConfiguration0.s.size() - 1;
            if(v >= 0) {
                while(true) {
                    if(class0.isAssignableFrom(databaseConfiguration0.s.get(v).getClass())) {
                        bitSet0.set(v);
                        goto label_18;
                    }
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                }
            }
            v = -1;
        label_18:
            if(v < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + class0.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
            this.i.put(class0, databaseConfiguration0.s.get(v));
        }
        int v1 = databaseConfiguration0.s.size() - 1;
        if(v1 >= 0) {
            while(bitSet0.get(v1)) {
                if(v1 - 1 < 0) {
                    goto label_29;
                }
                --v1;
            }
            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
        }
    label_29:
        for(Object object1: this.m(this.i)) {
            Migration migration0 = (Migration)object1;
            if(!databaseConfiguration0.d.d(migration0.a, migration0.b)) {
                databaseConfiguration0.d.c(new Migration[]{migration0});
            }
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.s();
        SQLiteCopyOpenHelper sQLiteCopyOpenHelper0 = (SQLiteCopyOpenHelper)this.R(SQLiteCopyOpenHelper.class, supportSQLiteOpenHelper0);
        if(sQLiteCopyOpenHelper0 != null) {
            sQLiteCopyOpenHelper0.e(databaseConfiguration0);
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper1 = this.s();
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper0 = (AutoClosingRoomOpenHelper)this.R(AutoClosingRoomOpenHelper.class, supportSQLiteOpenHelper1);
        if(autoClosingRoomOpenHelper0 != null) {
            this.k = autoClosingRoomOpenHelper0.b;
            this.p().v(autoClosingRoomOpenHelper0.b);
        }
        if(databaseConfiguration0.g == JournalMode.c) {
            z = true;
        }
        this.s().setWriteAheadLoggingEnabled(z);
        this.h = databaseConfiguration0.e;
        this.b = databaseConfiguration0.h;
        this.c = new TransactionExecutor(databaseConfiguration0.i);
        this.f = databaseConfiguration0.f;
        this.g = z;
        if(databaseConfiguration0.j != null) {
            if(databaseConfiguration0.b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.p().x(databaseConfiguration0.a, databaseConfiguration0.b, databaseConfiguration0.j);
        }
        Map map0 = this.v();
        BitSet bitSet1 = new BitSet();
        for(Object object2: map0.entrySet()) {
            Class class1 = (Class)((Map.Entry)object2).getKey();
            for(Object object3: ((List)((Map.Entry)object2).getValue())) {
                Class class2 = (Class)object3;
                int v2 = databaseConfiguration0.r.size() - 1;
                if(v2 >= 0) {
                    while(true) {
                        if(class2.isAssignableFrom(databaseConfiguration0.r.get(v2).getClass())) {
                            bitSet1.set(v2);
                            goto label_77;
                        }
                        if(v2 - 1 < 0) {
                            break;
                        }
                        --v2;
                    }
                }
                v2 = -1;
            label_77:
                if(v2 < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + class2 + ") for " + class1.getCanonicalName() + " is missing in the database configuration.").toString());
                }
                Object object4 = databaseConfiguration0.r.get(v2);
                this.n.put(class2, object4);
            }
        }
        int v3 = databaseConfiguration0.r.size() - 1;
        if(v3 >= 0) {
            while(bitSet1.get(v3)) {
                if(v3 - 1 < 0) {
                    return;
                }
                --v3;
            }
            throw new IllegalArgumentException("Unexpected type converter " + databaseConfiguration0.r.get(v3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
        }
    }

    private final void B() {
        this.c();
        SupportSQLiteDatabase supportSQLiteDatabase0 = this.s().getWritableDatabase();
        this.p().C(supportSQLiteDatabase0);
        if(supportSQLiteDatabase0.M3()) {
            supportSQLiteDatabase0.M0();
            return;
        }
        supportSQLiteDatabase0.beginTransaction();
    }

    private final void C() {
        this.s().getWritableDatabase().H2();
        if(!this.z()) {
            this.p().r();
        }
    }

    protected void D(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        this.p().o(supportSQLiteDatabase0);
    }

    public final boolean E() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean F() {
        AutoCloser autoCloser0 = this.k;
        if(autoCloser0 != null) {
            return L.g(Boolean.valueOf(autoCloser0.p()), Boolean.TRUE);
        }
        SupportSQLiteDatabase supportSQLiteDatabase0 = this.a;
        return supportSQLiteDatabase0 == null ? L.g(null, Boolean.TRUE) : L.g(Boolean.valueOf(supportSQLiteDatabase0.isOpen()), Boolean.TRUE);
    }

    public static void G() {
    }

    @RestrictTo({Scope.b})
    public final boolean H() {
        return this.a != null && this.a.isOpen();
    }

    public static void I() {
    }

    @l
    @j
    public final Cursor J(@l SupportSQLiteQuery supportSQLiteQuery0) {
        L.p(supportSQLiteQuery0, "query");
        return RoomDatabase.M(this, supportSQLiteQuery0, null, 2, null);
    }

    @l
    @j
    public Cursor K(@l SupportSQLiteQuery supportSQLiteQuery0, @m CancellationSignal cancellationSignal0) {
        L.p(supportSQLiteQuery0, "query");
        this.c();
        this.d();
        return cancellationSignal0 == null ? this.s().getWritableDatabase().Q0(supportSQLiteQuery0) : this.s().getWritableDatabase().K0(supportSQLiteQuery0, cancellationSignal0);
    }

    @l
    public Cursor L(@l String s, @m Object[] arr_object) {
        L.p(s, "query");
        return this.s().getWritableDatabase().Q0(new SimpleSQLiteQuery(s, arr_object));
    }

    public static Cursor M(RoomDatabase roomDatabase0, SupportSQLiteQuery supportSQLiteQuery0, CancellationSignal cancellationSignal0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if((v & 2) != 0) {
            cancellationSignal0 = null;
        }
        return roomDatabase0.K(supportSQLiteQuery0, cancellationSignal0);
    }

    public Object N(@l Callable callable0) {
        L.p(callable0, "body");
        this.e();
        try {
            Object object0 = callable0.call();
            this.Q();
            return object0;
        }
        finally {
            this.k();
        }
    }

    public void O(@l Runnable runnable0) {
        L.p(runnable0, "body");
        this.e();
        try {
            runnable0.run();
            this.Q();
        }
        finally {
            this.k();
        }
    }

    @RestrictTo({Scope.b})
    protected final void P(@l Map map0) {
        L.p(map0, "<set-?>");
        this.i = map0;
    }

    @k(message = "setTransactionSuccessful() is deprecated", replaceWith = @c0(expression = "runInTransaction(Runnable)", imports = {}))
    public void Q() {
        this.s().getWritableDatabase().u2();
    }

    private final Object R(Class class0, SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        if(class0.isInstance(supportSQLiteOpenHelper0)) {
            return supportSQLiteOpenHelper0;
        }
        return supportSQLiteOpenHelper0 instanceof DelegatingOpenHelper ? this.R(class0, ((DelegatingOpenHelper)supportSQLiteOpenHelper0).getDelegate()) : null;
    }

    @RestrictTo({Scope.c})
    public void c() {
        if(this.f) {
            return;
        }
        if(this.E()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({Scope.b})
    public void d() {
        if(!this.z() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @k(message = "beginTransaction() is deprecated", replaceWith = @c0(expression = "runInTransaction(Runnable)", imports = {}))
    public void e() {
        this.c();
        AutoCloser autoCloser0 = this.k;
        if(autoCloser0 == null) {
            this.B();
            return;
        }
        autoCloser0.g(new Function1() {
            final RoomDatabase e;

            {
                this.e = roomDatabase0;
                super(1);
            }

            @m
            public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                L.p(supportSQLiteDatabase0, "it");
                this.e.B();
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SupportSQLiteDatabase)object0));
            }
        });
    }

    @WorkerThread
    public abstract void f();

    public void g() {
        if(this.F()) {
            ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = this.j.writeLock();
            L.o(reentrantReadWriteLock$WriteLock0, "readWriteLock.writeLock()");
            reentrantReadWriteLock$WriteLock0.lock();
            try {
                this.p().z();
                this.s().close();
            }
            finally {
                reentrantReadWriteLock$WriteLock0.unlock();
            }
        }
    }

    @l
    public SupportSQLiteStatement h(@l String s) {
        L.p(s, "sql");
        this.c();
        this.d();
        return this.s().getWritableDatabase().f3(s);
    }

    @l
    protected abstract InvalidationTracker i();

    @l
    protected abstract SupportSQLiteOpenHelper j(@l DatabaseConfiguration arg1);

    @k(message = "endTransaction() is deprecated", replaceWith = @c0(expression = "runInTransaction(Runnable)", imports = {}))
    public void k() {
        AutoCloser autoCloser0 = this.k;
        if(autoCloser0 == null) {
            this.C();
            return;
        }
        autoCloser0.g(new Function1() {
            final RoomDatabase e;

            {
                this.e = roomDatabase0;
                super(1);
            }

            @m
            public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                L.p(supportSQLiteDatabase0, "it");
                this.e.C();
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SupportSQLiteDatabase)object0));
            }
        });
    }

    @RestrictTo({Scope.b})
    @l
    protected final Map l() {
        return this.i;
    }

    @RestrictTo({Scope.b})
    @l
    @o
    public List m(@l Map map0) {
        L.p(map0, "autoMigrationSpecs");
        return u.H();
    }

    @RestrictTo({Scope.b})
    @l
    public final Map n() {
        return this.m;
    }

    @l
    public final Lock o() {
        Lock lock0 = this.j.readLock();
        L.o(lock0, "readWriteLock.readLock()");
        return lock0;
    }

    @l
    public InvalidationTracker p() {
        return this.e;
    }

    @k(message = "Will be hidden in a future release.")
    protected static void q() {
    }

    @k(message = "Will be hidden in the next release.")
    protected static void r() {
    }

    @l
    public SupportSQLiteOpenHelper s() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.d;
        if(supportSQLiteOpenHelper0 == null) {
            L.S("internalOpenHelper");
            return null;
        }
        return supportSQLiteOpenHelper0;
    }

    @l
    public Executor t() {
        Executor executor0 = this.b;
        if(executor0 == null) {
            L.S("internalQueryExecutor");
            return null;
        }
        return executor0;
    }

    @RestrictTo({Scope.b})
    @l
    public Set u() {
        return k0.k();
    }

    @RestrictTo({Scope.b})
    @l
    protected Map v() {
        return Y.z();
    }

    @RestrictTo({Scope.b})
    @l
    public final ThreadLocal w() {
        return this.l;
    }

    @l
    public Executor x() {
        Executor executor0 = this.c;
        if(executor0 == null) {
            L.S("internalTransactionExecutor");
            return null;
        }
        return executor0;
    }

    @m
    public Object y(@l Class class0) {
        L.p(class0, "klass");
        return this.n.get(class0);
    }

    public boolean z() {
        return this.s().getWritableDatabase().J3();
    }
}

