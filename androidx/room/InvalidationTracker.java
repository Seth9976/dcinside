package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import jeb.synthetic.FIN;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.i;

@s0({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
public class InvalidationTracker {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "database");
            if(supportSQLiteDatabase0.M3()) {
                supportSQLiteDatabase0.M0();
                return;
            }
            supportSQLiteDatabase0.beginTransaction();
        }

        @VisibleForTesting
        public static void b() {
        }

        @VisibleForTesting
        public static void c() {
        }

        @l
        public final String d(@l String s, @l String s1) {
            L.p(s, "tableName");
            L.p(s1, "triggerType");
            return "`room_table_modification_trigger_" + s + '_' + s1 + '`';
        }
    }

    @s0({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    public static final class ObservedTableTracker {
        public static final class androidx.room.InvalidationTracker.ObservedTableTracker.Companion {
            private androidx.room.InvalidationTracker.ObservedTableTracker.Companion() {
            }

            public androidx.room.InvalidationTracker.ObservedTableTracker.Companion(w w0) {
            }
        }

        @l
        private final long[] a;
        @l
        private final boolean[] b;
        @l
        private final int[] c;
        private boolean d;
        @l
        public static final androidx.room.InvalidationTracker.ObservedTableTracker.Companion e = null;
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;

        static {
            ObservedTableTracker.e = new androidx.room.InvalidationTracker.ObservedTableTracker.Companion(null);
        }

        public ObservedTableTracker(int v) {
            this.a = new long[v];
            this.b = new boolean[v];
            this.c = new int[v];
        }

        public final boolean a() {
            return this.d;
        }

        @l
        public final long[] b() {
            return this.a;
        }

        @VisibleForTesting
        @m
        @i(name = "getTablesToSync")
        public final int[] c() {
            int[] arr_v2;
            __monitor_enter(this);
            try {
                if(this.d) {
                    long[] arr_v = this.a;
                    int v = 0;
                    for(int v1 = 0; true; ++v1) {
                        int v2 = 1;
                        if(v >= arr_v.length) {
                            break;
                        }
                        boolean z = arr_v[v] > 0L;
                        boolean[] arr_z = this.b;
                        if(z == arr_z[v1]) {
                            this.c[v1] = 0;
                        }
                        else {
                            int[] arr_v1 = this.c;
                            if(!z) {
                                v2 = 2;
                            }
                            arr_v1[v1] = v2;
                        }
                        arr_z[v1] = z;
                        ++v;
                    }
                    this.d = false;
                    arr_v2 = (int[])this.c.clone();
                    goto label_26;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        label_26:
            __monitor_exit(this);
            return arr_v2;
        label_28:
            __monitor_exit(this);
            return null;
        }

        public final boolean d(@l int[] arr_v) {
            L.p(arr_v, "tableIds");
            synchronized(this) {
                boolean z = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v2 = arr_v[v1];
                    long v3 = this.a[v2];
                    this.a[v2] = v3 + 1L;
                    if(v3 == 0L) {
                        z = true;
                        this.d = true;
                    }
                }
                return z;
            }
        }

        public final boolean e(@l int[] arr_v) {
            L.p(arr_v, "tableIds");
            synchronized(this) {
                boolean z = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v2 = arr_v[v1];
                    long v3 = this.a[v2];
                    this.a[v2] = v3 - 1L;
                    if(v3 == 1L) {
                        z = true;
                        this.d = true;
                    }
                }
                return z;
            }
        }

        public final void f() {
            synchronized(this) {
                Arrays.fill(this.b, false);
                this.d = true;
            }
        }

        public final void g(boolean z) {
            this.d = z;
        }
    }

    @s0({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    public static abstract class Observer {
        @l
        private final String[] a;

        protected Observer(@l String s, @l String[] arr_s) {
            L.p(s, "firstTable");
            L.p(arr_s, "rest");
            List list0 = u.i();
            u.s0(list0, arr_s);
            list0.add(s);
            this(((String[])u.a(list0).toArray(new String[0])));
        }

        public Observer(@l String[] arr_s) {
            L.p(arr_s, "tables");
            super();
            this.a = arr_s;
        }

        @l
        public final String[] a() {
            return this.a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(@l Set arg1);
    }

    @s0({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    public static final class ObserverWrapper {
        @l
        private final Observer a;
        @l
        private final int[] b;
        @l
        private final String[] c;
        @l
        private final Set d;

        public ObserverWrapper(@l Observer invalidationTracker$Observer0, @l int[] arr_v, @l String[] arr_s) {
            L.p(invalidationTracker$Observer0, "observer");
            L.p(arr_v, "tableIds");
            L.p(arr_s, "tableNames");
            super();
            this.a = invalidationTracker$Observer0;
            this.b = arr_v;
            this.c = arr_s;
            this.d = arr_s.length == 0 ? k0.k() : k0.f(arr_s[0]);
            if(arr_v.length != arr_s.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @l
        public final Observer a() {
            return this.a;
        }

        @l
        public final int[] b() {
            return this.b;
        }

        public final void c(@l Set set0) {
            Set set2;
            int v = 0;
            L.p(set0, "invalidatedTablesIds");
            int[] arr_v = this.b;
            switch(arr_v.length) {
                case 0: {
                    set2 = k0.k();
                    break;
                }
                case 1: {
                    set2 = set0.contains(((int)arr_v[0])) ? this.d : k0.k();
                    break;
                }
                default: {
                    Set set1 = k0.d();
                    int[] arr_v1 = this.b;
                    for(int v1 = 0; v < arr_v1.length; ++v1) {
                        if(set0.contains(((int)arr_v1[v]))) {
                            set1.add(this.c[v1]);
                        }
                        ++v;
                    }
                    set2 = k0.a(set1);
                }
            }
            if(!set2.isEmpty()) {
                this.a.c(set2);
            }
        }

        public final void d(@l String[] arr_s) {
            Set set1;
            L.p(arr_s, "tables");
        alab1:
            switch(this.c.length) {
                case 0: {
                    set1 = k0.k();
                    break;
                }
                case 1: {
                    int v2 = 0;
                    while(true) {
                        if(v2 < arr_s.length) {
                            if(v.O1(arr_s[v2], this.c[0], true)) {
                                set1 = this.d;
                                break alab1;
                            }
                            ++v2;
                            continue;
                        }
                        set1 = k0.k();
                        break alab1;
                    }
                }
                default: {
                    Set set0 = k0.d();
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s = arr_s[v];
                        String[] arr_s1 = this.c;
                        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                            String s1 = arr_s1[v1];
                            if(v.O1(s1, s, true)) {
                                set0.add(s1);
                            }
                        }
                    }
                    set1 = k0.a(set0);
                }
            }
            if(!set1.isEmpty()) {
                this.a.c(set1);
            }
        }
    }

    public static final class WeakObserver extends Observer {
        @l
        private final InvalidationTracker b;
        @l
        private final WeakReference c;

        public WeakObserver(@l InvalidationTracker invalidationTracker0, @l Observer invalidationTracker$Observer0) {
            L.p(invalidationTracker0, "tracker");
            L.p(invalidationTracker$Observer0, "delegate");
            super(invalidationTracker$Observer0.a());
            this.b = invalidationTracker0;
            this.c = new WeakReference(invalidationTracker$Observer0);
        }

        @Override  // androidx.room.InvalidationTracker$Observer
        public void c(@l Set set0) {
            L.p(set0, "tables");
            Observer invalidationTracker$Observer0 = (Observer)this.c.get();
            if(invalidationTracker$Observer0 == null) {
                this.b.t(this);
                return;
            }
            invalidationTracker$Observer0.c(set0);
        }

        @l
        public final WeakReference d() {
            return this.c;
        }

        @l
        public final InvalidationTracker e() {
            return this.b;
        }
    }

    @l
    private final RoomDatabase a;
    @l
    private final Map b;
    @l
    private final Map c;
    @l
    private final Map d;
    @l
    private final String[] e;
    @m
    private AutoCloser f;
    @RestrictTo({Scope.a})
    @l
    private final AtomicBoolean g;
    private volatile boolean h;
    @m
    private volatile SupportSQLiteStatement i;
    @l
    private final ObservedTableTracker j;
    @l
    private final InvalidationLiveDataContainer k;
    @GuardedBy("observerMap")
    @l
    private final SafeIterableMap l;
    @m
    private MultiInstanceInvalidationClient m;
    @l
    private final Object n;
    @l
    private final Object o;
    @RestrictTo({Scope.a})
    @l
    @f
    public final Runnable p;
    @l
    public static final Companion q = null;
    @l
    private static final String[] r = null;
    @l
    private static final String s = "room_table_modification_log";
    @l
    private static final String t = "table_id";
    @l
    private static final String u = "invalidated";
    @l
    private static final String v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @l
    public static final String w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    @l
    public static final String x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    static {
        InvalidationTracker.q = new Companion(null);
        InvalidationTracker.r = new String[]{"UPDATE", "DELETE", "INSERT"};
    }

    @RestrictTo({Scope.c})
    public InvalidationTracker(@l RoomDatabase roomDatabase0, @l Map map0, @l Map map1, @l String[] arr_s) {
        L.p(roomDatabase0, "database");
        String s3;
        L.p(map0, "shadowTablesMap");
        L.p(map1, "viewTables");
        L.p(arr_s, "tableNames");
        super();
        this.a = roomDatabase0;
        this.b = map0;
        this.c = map1;
        this.g = new AtomicBoolean(false);
        this.j = new ObservedTableTracker(arr_s.length);
        this.k = new InvalidationLiveDataContainer(roomDatabase0);
        this.l = new SafeIterableMap();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        String[] arr_s1 = new String[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(s1, v);
            String s2 = (String)this.b.get(arr_s[v]);
            if(s2 == null) {
                s3 = null;
            }
            else {
                L.o(locale0, "US");
                s3 = s2.toLowerCase(locale0);
                L.o(s3, "this as java.lang.String).toLowerCase(locale)");
            }
            if(s3 != null) {
                s1 = s3;
            }
            arr_s1[v] = s1;
        }
        this.e = arr_s1;
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s4 = (String)map$Entry0.getValue();
            Locale locale1 = Locale.US;
            L.o(locale1, "US");
            String s5 = s4.toLowerCase(locale1);
            L.o(s5, "this as java.lang.String).toLowerCase(locale)");
            if(this.d.containsKey(s5)) {
                String s6 = (String)map$Entry0.getKey();
                L.o(locale1, "US");
                String s7 = s6.toLowerCase(locale1);
                L.o(s7, "this as java.lang.String).toLowerCase(locale)");
                Object object1 = Y.K(this.d, s5);
                this.d.put(s7, object1);
            }
        }
        this.p = new Runnable() {
            private final Set a() {
                Set set0 = k0.d();
                Cursor cursor0 = RoomDatabase.M(this.a.i(), new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
                try {
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            goto label_10;
                        }
                        set0.add(cursor0.getInt(0));
                    }
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    c.a(cursor0, throwable0);
                    throw throwable1;
                }
            label_10:
                c.a(cursor0, null);
                Set set1 = k0.a(set0);
                if(!set1.isEmpty()) {
                    if(this.a.h() == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    SupportSQLiteStatement supportSQLiteStatement0 = this.a.h();
                    if(supportSQLiteStatement0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    supportSQLiteStatement0.O();
                    return set1;
                }
                return set1;
            }

            @Override
            public void run() {
                Set set0;
                Lock lock0 = this.a.i().o();
                lock0.lock();
                try {
                    try {
                        if(this.a.g()) {
                            if(this.a.k().compareAndSet(true, false)) {
                                if(!this.a.i().z()) {
                                    SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.i().s().getWritableDatabase();
                                    supportSQLiteDatabase0.M0();
                                    try {
                                        set0 = this.a();
                                        supportSQLiteDatabase0.u2();
                                    }
                                    finally {
                                        supportSQLiteDatabase0.H2();
                                    }
                                    goto label_36;
                                }
                                goto label_54;
                            }
                            goto label_59;
                        }
                        goto label_64;
                    }
                    catch(IllegalStateException illegalStateException0) {
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_23;
                    }
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
                    set0 = k0.k();
                }
                catch(Throwable throwable0) {
                    goto label_31;
                }
                lock0.unlock();
                AutoCloser autoCloser0 = this.a.f;
                if(autoCloser0 != null) {
                    autoCloser0.e();
                    goto label_40;
                    try {
                    label_23:
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
                        set0 = k0.k();
                    }
                    catch(Throwable throwable0) {
                        goto label_31;
                    }
                    lock0.unlock();
                    autoCloser0 = this.a.f;
                    if(autoCloser0 != null) {
                        autoCloser0.e();
                        goto label_40;
                    label_31:
                        lock0.unlock();
                        AutoCloser autoCloser1 = this.a.f;
                        if(autoCloser1 != null) {
                            autoCloser1.e();
                        }
                        throw throwable0;
                    label_36:
                        lock0.unlock();
                        autoCloser0 = this.a.f;
                        if(autoCloser0 != null) {
                            autoCloser0.e();
                        }
                    }
                }
            label_40:
                if(!set0.isEmpty()) {
                    synchronized(this.a.j()) {
                        for(Object object0: this.a.j()) {
                            ((ObserverWrapper)((Map.Entry)object0).getValue()).c(set0);
                        }
                    }
                    return;
                }
                return;
            label_54:
                lock0.unlock();
                AutoCloser autoCloser2 = this.a.f;
                if(autoCloser2 != null) {
                    autoCloser2.e();
                }
                return;
            label_59:
                lock0.unlock();
                AutoCloser autoCloser3 = this.a.f;
                if(autoCloser3 != null) {
                    autoCloser3.e();
                }
                return;
            label_64:
                lock0.unlock();
                AutoCloser autoCloser4 = this.a.f;
                if(autoCloser4 != null) {
                    autoCloser4.e();
                }
            }
        };
    }

    @RestrictTo({Scope.c})
    public InvalidationTracker(@l RoomDatabase roomDatabase0, @l String[] arr_s) {
        L.p(roomDatabase0, "database");
        L.p(arr_s, "tableNames");
        this(roomDatabase0, Y.z(), Y.z(), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    private final void A(SupportSQLiteDatabase supportSQLiteDatabase0, int v) {
        String s = this.e[v];
        String[] arr_s = InvalidationTracker.r;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = "DROP TRIGGER IF EXISTS " + InvalidationTracker.q.d(s, arr_s[v1]);
            L.o(s1, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase0.W1(s1);
        }
    }

    public final void B() {
        if(!this.a.H()) {
            return;
        }
        this.C(this.a.s().getWritableDatabase());
    }

    public final void C(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        int v;
        Lock lock0;
        L.p(supportSQLiteDatabase0, "database");
        if(supportSQLiteDatabase0.J3()) {
            return;
        }
        try {
            lock0 = this.a.o();
            lock0.lock();
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_40;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_43;
        }
        try {
            Object object0 = this.n;
            __monitor_enter(object0);
            v = FIN.finallyOpen$NT();
            int[] arr_v = this.j.c();
            if(arr_v != null) {
                InvalidationTracker.q.a(supportSQLiteDatabase0);
                try {
                    int v2 = 0;
                    for(int v3 = 0; v2 < arr_v.length; ++v3) {
                        switch(arr_v[v2]) {
                            case 1: {
                                this.y(supportSQLiteDatabase0, v3);
                                break;
                            }
                            case 2: {
                                this.A(supportSQLiteDatabase0, v3);
                            }
                        }
                        ++v2;
                    }
                    supportSQLiteDatabase0.u2();
                }
                finally {
                    supportSQLiteDatabase0.H2();
                }
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                goto label_30;
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        try {
        label_30:
            lock0.unlock();
            return;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_40;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_43;
        }
        try {
        label_32:
            FIN.finallyExec$NT(v);
            goto label_37;
        }
        catch(Throwable throwable0) {
            try {
            label_35:
                lock0.unlock();
                throw throwable0;
            label_37:
                lock0.unlock();
                return;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(SQLiteException sQLiteException0) {
                goto label_43;
            }
        }
    label_40:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
        return;
    label_43:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
    }

    private final String[] D(String[] arr_s) {
        String[] arr_s1 = this.u(arr_s);
        for(int v = 0; v < arr_s1.length; ++v) {
            String s = arr_s1[v];
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            if(!this.d.containsKey(s1)) {
                throw new IllegalArgumentException(("There is no table with name " + s).toString());
            }
        }
        return arr_s1;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void c(@l Observer invalidationTracker$Observer0) {
        L.p(invalidationTracker$Observer0, "observer");
        String[] arr_s = this.u(invalidationTracker$Observer0.a());
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            Integer integer0 = (Integer)this.d.get(s1);
            if(integer0 == null) {
                throw new IllegalArgumentException("There is no table with name " + s);
            }
            arrayList0.add(integer0);
        }
        int[] arr_v = u.U5(arrayList0);
        ObserverWrapper invalidationTracker$ObserverWrapper0 = new ObserverWrapper(invalidationTracker$Observer0, arr_v, arr_s);
        synchronized(this.l) {
            ObserverWrapper invalidationTracker$ObserverWrapper1 = (ObserverWrapper)this.l.h(invalidationTracker$Observer0, invalidationTracker$ObserverWrapper0);
        }
        if(invalidationTracker$ObserverWrapper1 == null) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.j.d(arr_v1)) {
                this.B();
            }
        }
    }

    @RestrictTo({Scope.c})
    public void d(@l Observer invalidationTracker$Observer0) {
        L.p(invalidationTracker$Observer0, "observer");
        this.c(new WeakObserver(this, invalidationTracker$Observer0));
    }

    @RestrictTo({Scope.c})
    @k(message = "Use [createLiveData(String[], boolean, Callable)]")
    @l
    public LiveData e(@l String[] arr_s, @l Callable callable0) {
        L.p(arr_s, "tableNames");
        L.p(callable0, "computeFunction");
        return this.f(arr_s, false, callable0);
    }

    @RestrictTo({Scope.c})
    @l
    public LiveData f(@l String[] arr_s, boolean z, @l Callable callable0) {
        L.p(arr_s, "tableNames");
        L.p(callable0, "computeFunction");
        String[] arr_s1 = this.D(arr_s);
        return this.k.a(arr_s1, z, callable0);
    }

    public final boolean g() {
        if(!this.a.H()) {
            return false;
        }
        if(!this.h) {
            this.a.s().getWritableDatabase();
        }
        if(!this.h) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    @m
    public final SupportSQLiteStatement h() {
        return this.i;
    }

    @l
    public final RoomDatabase i() {
        return this.a;
    }

    @l
    public final SafeIterableMap j() {
        return this.l;
    }

    @RestrictTo({Scope.a})
    @l
    public final AtomicBoolean k() {
        return this.g;
    }

    @VisibleForTesting
    public static void l() {
    }

    @l
    public final Map m() {
        return this.d;
    }

    @l
    public final String[] n() {
        return this.e;
    }

    public final void o(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "database");
        synchronized(this.o) {
            if(this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase0.W1("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase0.W1("PRAGMA recursive_triggers=\'ON\';");
            supportSQLiteDatabase0.W1("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            this.C(supportSQLiteDatabase0);
            this.i = supportSQLiteDatabase0.f3("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
        }
    }

    @RestrictTo({Scope.a})
    public final void p(@l String[] arr_s) {
        L.p(arr_s, "tables");
        synchronized(this.l) {
            for(Object object0: this.l) {
                L.o(((Map.Entry)object0), "(observer, wrapper)");
                Observer invalidationTracker$Observer0 = (Observer)((Map.Entry)object0).getKey();
                ObserverWrapper invalidationTracker$ObserverWrapper0 = (ObserverWrapper)((Map.Entry)object0).getValue();
                if(!invalidationTracker$Observer0.b()) {
                    invalidationTracker$ObserverWrapper0.d(arr_s);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private final void q() [...]

    public void r() {
        if(this.g.compareAndSet(false, true)) {
            AutoCloser autoCloser0 = this.f;
            if(autoCloser0 != null) {
                autoCloser0.n();
            }
            this.a.t().execute(this.p);
        }
    }

    @RestrictTo({Scope.c})
    @WorkerThread
    public void s() {
        AutoCloser autoCloser0 = this.f;
        if(autoCloser0 != null) {
            autoCloser0.n();
        }
        this.B();
        this.p.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void t(@l Observer invalidationTracker$Observer0) {
        ObserverWrapper invalidationTracker$ObserverWrapper0;
        L.p(invalidationTracker$Observer0, "observer");
        synchronized(this.l) {
            invalidationTracker$ObserverWrapper0 = (ObserverWrapper)this.l.i(invalidationTracker$Observer0);
        }
        if(invalidationTracker$ObserverWrapper0 != null) {
            int[] arr_v = invalidationTracker$ObserverWrapper0.b();
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.j.e(arr_v1)) {
                this.B();
            }
        }
    }

    private final String[] u(String[] arr_s) {
        Set set0 = k0.d();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            if(this.c.containsKey(s1)) {
                L.o(locale0, "US");
                String s2 = s.toLowerCase(locale0);
                L.o(s2, "this as java.lang.String).toLowerCase(locale)");
                Object object0 = this.c.get(s2);
                L.m(object0);
                set0.addAll(((Collection)object0));
            }
            else {
                set0.add(s);
            }
        }
        return (String[])k0.a(set0).toArray(new String[0]);
    }

    public final void v(@l AutoCloser autoCloser0) {
        L.p(autoCloser0, "autoCloser");
        this.f = autoCloser0;
        autoCloser0.q(() -> synchronized(this.o) {
            this.h = false;
            this.j.f();
            SupportSQLiteStatement supportSQLiteStatement0 = this.i;
            if(supportSQLiteStatement0 != null) {
                supportSQLiteStatement0.close();
            }
        });
    }

    public final void w(@m SupportSQLiteStatement supportSQLiteStatement0) {
        this.i = supportSQLiteStatement0;
    }

    public final void x(@l Context context0, @l String s, @l Intent intent0) {
        L.p(context0, "context");
        L.p(s, "name");
        L.p(intent0, "serviceIntent");
        this.m = new MultiInstanceInvalidationClient(context0, s, intent0, this, this.a.t());
    }

    private final void y(SupportSQLiteDatabase supportSQLiteDatabase0, int v) {
        supportSQLiteDatabase0.W1("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + v + ", 0)");
        String s = this.e[v];
        String[] arr_s = InvalidationTracker.r;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = arr_s[v1];
            String s2 = "CREATE TEMP TRIGGER IF NOT EXISTS " + InvalidationTracker.q.d(s, s1) + " AFTER " + s1 + " ON `" + s + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + v + " AND " + "invalidated" + " = 0" + "; END";
            L.o(s2, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase0.W1(s2);
        }
    }

    public final void z() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient0 = this.m;
        if(multiInstanceInvalidationClient0 != null) {
            multiInstanceInvalidationClient0.s();
        }
        this.m = null;
    }
}

