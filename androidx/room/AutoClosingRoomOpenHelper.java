package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat.Api19Impl;
import androidx.sqlite.db.SupportSQLiteCompat.Api23Impl;
import androidx.sqlite.db.SupportSQLiteCompat.Api29Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import i.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;

public final class AutoClosingRoomOpenHelper implements DelegatingOpenHelper, SupportSQLiteOpenHelper {
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        @l
        private final AutoCloser a;

        public AutoClosingSupportSQLiteDatabase(@l AutoCloser autoCloser0) {
            L.p(autoCloser0, "autoCloser");
            super();
            this.a = autoCloser0;
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void F2(@l SQLiteTransactionListener sQLiteTransactionListener0) {
            L.p(sQLiteTransactionListener0, "transactionListener");
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.n();
            try {
                supportSQLiteDatabase0.F2(sQLiteTransactionListener0);
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long G0() {
            return ((Number)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.1.a)).longValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.1 extends Y {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.1 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.1.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.1() {
                    super(SupportSQLiteDatabase.class, "pageSize", "getPageSize()J", 0);
                }

                @Override  // kotlin.jvm.internal.Y
                public void Q(@m Object object0, @m Object object1) {
                    ((SupportSQLiteDatabase)object0).P3(((Number)object1).longValue());
                }

                @Override  // kotlin.jvm.internal.Y
                @m
                public Object get(@m Object object0) {
                    return ((SupportSQLiteDatabase)object0).G0();
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public int H0(@l String s, @m String s1, @m Object[] arr_object) {
            L.p(s, "table");
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.delete.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$10 = new Function1(s1, arr_object) {
                final String e;
                final String f;
                final Object[] g;

                {
                    this.e = s;
                    this.f = s1;
                    this.g = arr_object;
                    super(1);
                }

                @l
                public final Integer a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    return supportSQLiteDatabase0.H0(this.e, this.f, this.g);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            return ((Number)this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$10)).intValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void H2() {
            if(this.a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.h();
                L.m(supportSQLiteDatabase0);
                supportSQLiteDatabase0.H2();
            }
            finally {
                this.a.e();
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @m
        public List I0() {
            return (List)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.attachedDbs.1.e);

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.attachedDbs.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.attachedDbs.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.attachedDbs.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.attachedDbs.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.attachedDbs.1() {
                    super(1);
                }

                @m
                public final List a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "obj");
                    return supportSQLiteDatabase0.I0();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void I3(@l SQLiteTransactionListener sQLiteTransactionListener0) {
            L.p(sQLiteTransactionListener0, "transactionListener");
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.n();
            try {
                supportSQLiteDatabase0.I3(sQLiteTransactionListener0);
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void J0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean J3() {
            return this.a.h() == null ? false : ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.inTransaction.1.a)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.inTransaction.1 extends H implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.inTransaction.1 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.inTransaction.1.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.inTransaction.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.inTransaction.1() {
                    super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "p0");
                    return Boolean.valueOf(supportSQLiteDatabase0.J3());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        @l
        public Cursor K0(@l SupportSQLiteQuery supportSQLiteQuery0, @m CancellationSignal cancellationSignal0) {
            L.p(supportSQLiteQuery0, "query");
            try {
                return new KeepAliveCursor(this.a.n().K0(supportSQLiteQuery0, cancellationSignal0), this.a);
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void M0() {
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.n();
            try {
                supportSQLiteDatabase0.M0();
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public boolean M3() {
            return ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isWriteAheadLoggingEnabled.1.e)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isWriteAheadLoggingEnabled.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isWriteAheadLoggingEnabled.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isWriteAheadLoggingEnabled.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isWriteAheadLoggingEnabled.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isWriteAheadLoggingEnabled.1() {
                    super(1);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    return Boolean.valueOf(supportSQLiteDatabase0.M3());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean N0() {
            return false;
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean O0() {
            return this.a.h() == null ? false : ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDbLockedByCurrentThread.1.a)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDbLockedByCurrentThread.1 extends h0 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDbLockedByCurrentThread.1 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDbLockedByCurrentThread.1.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDbLockedByCurrentThread.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDbLockedByCurrentThread.1() {
                    super(SupportSQLiteDatabase.class, "isDbLockedByCurrentThread", "isDbLockedByCurrentThread()Z", 0);
                }

                @Override  // kotlin.jvm.internal.h0
                @m
                public Object get(@m Object object0) {
                    return Boolean.valueOf(((SupportSQLiteDatabase)object0).O0());
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void O3(int v) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaxSqlCacheSize.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$10 = new Function1() {
                final int e;

                {
                    this.e = v;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.O3(this.e);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$10);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean P0(int v) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.needUpgrade.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$10 = new Function1() {
                final int e;

                {
                    this.e = v;
                    super(1);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    return Boolean.valueOf(supportSQLiteDatabase0.P0(this.e));
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            return ((Boolean)this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$10)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void P3(long v) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pageSize.2 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$20 = new Function1() {
                final long e;

                {
                    this.e = v;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.P3(this.e);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$20);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @l
        public Cursor Q0(@l SupportSQLiteQuery supportSQLiteQuery0) {
            L.p(supportSQLiteQuery0, "query");
            try {
                return new KeepAliveCursor(this.a.n().Q0(supportSQLiteQuery0), this.a);
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @l
        public Cursor R0(@l String s, @l Object[] arr_object) {
            L.p(s, "query");
            L.p(arr_object, "bindArgs");
            try {
                return new KeepAliveCursor(this.a.n().R0(s, arr_object), this.a);
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void W1(@l String s) throws SQLException {
            L.p(s, "sql");
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$10 = new Function1() {
                final String e;

                {
                    this.e = s;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.W1(this.e);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$10);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void W2(String s, Object[] arr_object) {
            a.a(this, s, arr_object);
        }

        public final void a() {
            this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen.1.e);

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen.1() {
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "it");
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean a2() {
            return ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDatabaseIntegrityOk.1.e)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDatabaseIntegrityOk.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDatabaseIntegrityOk.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDatabaseIntegrityOk.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDatabaseIntegrityOk.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isDatabaseIntegrityOk.1() {
                    super(1);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "obj");
                    return Boolean.valueOf(supportSQLiteDatabase0.a2());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.n();
            try {
                supportSQLiteDatabase0.beginTransaction();
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean c3(long v) {
            return ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.2.a)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.2 extends H implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.2 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.2.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.2();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.2() {
                    super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "p0");
                    return Boolean.valueOf(supportSQLiteDatabase0.w3());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override
        public void close() throws IOException {
            this.a.d();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @l
        public SupportSQLiteStatement f3(@l String s) {
            L.p(s, "sql");
            return new AutoClosingSupportSqliteStatement(s, this.a);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @m
        public String getPath() {
            return (String)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.path.1.e);

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.path.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.path.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.path.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.path.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.path.1() {
                    super(1);
                }

                @m
                public final String a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "obj");
                    return supportSQLiteDatabase0.getPath();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.1.a)).intValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.1 extends Y {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.1 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.1.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.1() {
                    super(SupportSQLiteDatabase.class, "version", "getVersion()I", 0);
                }

                @Override  // kotlin.jvm.internal.Y
                public void Q(@m Object object0, @m Object object1) {
                    ((SupportSQLiteDatabase)object0).setVersion(((Number)object1).intValue());
                }

                @Override  // kotlin.jvm.internal.Y
                @m
                public Object get(@m Object object0) {
                    return ((SupportSQLiteDatabase)object0).getVersion();
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.h();
            return supportSQLiteDatabase0 == null ? false : supportSQLiteDatabase0.isOpen();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean l3() {
            return ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isReadOnly.1.e)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isReadOnly.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isReadOnly.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isReadOnly.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isReadOnly.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.isReadOnly.1() {
                    super(1);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "obj");
                    return Boolean.valueOf(supportSQLiteDatabase0.l3());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public void n1(boolean z) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setForeignKeyConstraintsEnabled.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$10 = new Function1() {
                final boolean e;

                {
                    this.e = z;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.n1(this.e);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$10);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long p1() {
            return ((Number)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.maximumSize.1.a)).longValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.maximumSize.1 extends h0 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.maximumSize.1 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.maximumSize.1.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.maximumSize.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.maximumSize.1() {
                    super(SupportSQLiteDatabase.class, "maximumSize", "getMaximumSize()J", 0);
                }

                @Override  // kotlin.jvm.internal.h0
                @m
                public Object get(@m Object object0) {
                    return ((SupportSQLiteDatabase)object0).p1();
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean s2() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(@l Locale locale0) {
            L.p(locale0, "locale");
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setLocale.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$10 = new Function1() {
                final Locale e;

                {
                    this.e = locale0;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.setLocale(this.e);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$10);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(int v) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.version.2 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$20 = new Function1() {
                final int e;

                {
                    this.e = v;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.setVersion(this.e);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$20);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public int t3(@l String s, int v, @l ContentValues contentValues0, @m String s1, @m Object[] arr_object) {
            L.p(s, "table");
            L.p(contentValues0, "values");
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.update.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$10 = new Function1(v, contentValues0, s1, arr_object) {
                final String e;
                final int f;
                final ContentValues g;
                final String h;
                final Object[] i;

                {
                    this.e = s;
                    this.f = v;
                    this.g = contentValues0;
                    this.h = s1;
                    this.i = arr_object;
                    super(1);
                }

                @l
                public final Integer a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    return supportSQLiteDatabase0.t3(this.e, this.f, this.g, this.h, this.i);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            return ((Number)this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$10)).intValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void u2() {
            S0 s00;
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.h();
            if(supportSQLiteDatabase0 == null) {
                s00 = null;
            }
            else {
                supportSQLiteDatabase0.u2();
                s00 = S0.a;
            }
            if(s00 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void v2(@l String s, @l Object[] arr_object) throws SQLException {
            L.p(s, "sql");
            L.p(arr_object, "bindArgs");
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL.2 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$20 = new Function1(arr_object) {
                final String e;
                final Object[] f;

                {
                    this.e = s;
                    this.f = arr_object;
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    supportSQLiteDatabase0.v2(this.e, this.f);
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$20);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long w2(long v) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaximumSize.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$10 = new Function1() {
                final long e;

                {
                    this.e = v;
                    super(1);
                }

                @l
                public final Long a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    return supportSQLiteDatabase0.w2(this.e);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            return ((Number)this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$10)).longValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean w3() {
            return ((Boolean)this.a.g(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.1.a)).booleanValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.1 extends H implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.1 a;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.1.a = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.yieldIfContendedSafely.1() {
                    super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
                }

                @l
                public final Boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "p0");
                    return Boolean.valueOf(supportSQLiteDatabase0.w3());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @l
        public Cursor x3(@l String s) {
            L.p(s, "query");
            try {
                return new KeepAliveCursor(this.a.n().x3(s), this.a);
            }
            catch(Throwable throwable0) {
                this.a.e();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long y1(@l String s, int v, @l ContentValues contentValues0) throws SQLException {
            L.p(s, "table");
            L.p(contentValues0, "values");
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.insert.1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$10 = new Function1(v, contentValues0) {
                final String e;
                final int f;
                final ContentValues g;

                {
                    this.e = s;
                    this.f = v;
                    this.g = contentValues0;
                    super(1);
                }

                @l
                public final Long a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    return supportSQLiteDatabase0.y1(this.e, this.f, this.g);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            return ((Number)this.a.g(autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$10)).longValue();
        }
    }

    @s0({"SMAP\nAutoClosingRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,571:1\n1864#2,3:572\n*S KotlinDebug\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n*L\n478#1:572,3\n*E\n"})
    static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        @l
        private final String a;
        @l
        private final AutoCloser b;
        @l
        private final ArrayList c;

        public AutoClosingSupportSqliteStatement(@l String s, @l AutoCloser autoCloser0) {
            L.p(s, "sql");
            L.p(autoCloser0, "autoCloser");
            super();
            this.a = s;
            this.b = autoCloser0;
            this.c = new ArrayList();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteStatement
        public long D0() {
            return ((Number)this.e(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForLong.1.e)).longValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForLong.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForLong.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForLong.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForLong.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForLong.1() {
                    super(1);
                }

                @l
                public final Long a(@l SupportSQLiteStatement supportSQLiteStatement0) {
                    L.p(supportSQLiteStatement0, "obj");
                    return supportSQLiteStatement0.D0();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteStatement)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteStatement
        @m
        public String E2() {
            return (String)this.e(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForString.1.e);

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForString.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForString.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForString.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForString.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.simpleQueryForString.1() {
                    super(1);
                }

                @m
                public final String a(@l SupportSQLiteStatement supportSQLiteStatement0) {
                    L.p(supportSQLiteStatement0, "obj");
                    return supportSQLiteStatement0.E2();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteStatement)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteProgram
        public void H1(int v) {
            this.f(v, null);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteStatement
        public int O() {
            return ((Number)this.e(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeUpdateDelete.1.e)).intValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeUpdateDelete.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeUpdateDelete.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeUpdateDelete.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeUpdateDelete.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeUpdateDelete.1() {
                    super(1);
                }

                @l
                public final Integer a(@l SupportSQLiteStatement supportSQLiteStatement0) {
                    L.p(supportSQLiteStatement0, "obj");
                    return supportSQLiteStatement0.O();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteStatement)object0));
                }
            }

        }

        @Override  // androidx.sqlite.db.SupportSQLiteProgram
        public void Q3() {
            this.c.clear();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteProgram
        public void S0(int v, @l String s) {
            L.p(s, "value");
            this.f(v, s);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteStatement
        public long Z2() {
            return ((Number)this.e(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeInsert.1.e)).longValue();

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeInsert.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeInsert.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeInsert.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeInsert.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeInsert.1() {
                    super(1);
                }

                @l
                public final Long a(@l SupportSQLiteStatement supportSQLiteStatement0) {
                    L.p(supportSQLiteStatement0, "obj");
                    return supportSQLiteStatement0.Z2();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteStatement)object0));
                }
            }

        }

        private final void c(SupportSQLiteStatement supportSQLiteStatement0) {
            Iterator iterator0 = this.c.iterator();
            for(int v = 0; iterator0.hasNext(); ++v) {
                iterator0.next();
                if(v < 0) {
                    u.Z();
                }
                Object object0 = this.c.get(v);
                if(object0 == null) {
                    supportSQLiteStatement0.H1(v + 1);
                }
                else if(object0 instanceof Long) {
                    supportSQLiteStatement0.o1(v + 1, ((Number)object0).longValue());
                }
                else if(object0 instanceof Double) {
                    supportSQLiteStatement0.f2(v + 1, ((Number)object0).doubleValue());
                }
                else if(object0 instanceof String) {
                    supportSQLiteStatement0.S0(v + 1, ((String)object0));
                }
                else if(object0 instanceof byte[]) {
                    supportSQLiteStatement0.r1(v + 1, ((byte[])object0));
                }
            }
        }

        @Override
        public void close() throws IOException {
        }

        private final Object e(Function1 function10) {
            androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.executeSqliteStatementWithRefCount.1 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$10 = new Function1(function10) {
                final AutoClosingSupportSqliteStatement e;
                final Function1 f;

                {
                    this.e = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement0;
                    this.f = function10;
                    super(1);
                }

                public final Object a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    SupportSQLiteStatement supportSQLiteStatement0 = supportSQLiteDatabase0.f3(this.e.a);
                    this.e.c(supportSQLiteStatement0);
                    return this.f.invoke(supportSQLiteStatement0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteDatabase)object0));
                }
            };
            return this.b.g(autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$10);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            this.e(androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.execute.1.e);

            final class androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.execute.1 extends N implements Function1 {
                public static final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.execute.1 e;

                static {
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.execute.1.e = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.execute.1();
                }

                androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.execute.1() {
                    super(1);
                }

                @m
                public final Object a(@l SupportSQLiteStatement supportSQLiteStatement0) {
                    L.p(supportSQLiteStatement0, "statement");
                    supportSQLiteStatement0.execute();
                    return null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((SupportSQLiteStatement)object0));
                }
            }

        }

        private final void f(int v, Object object0) {
            if(v - 1 >= this.c.size()) {
                int v1 = this.c.size();
                if(v1 <= v - 1) {
                    while(true) {
                        this.c.add(null);
                        if(v1 == v - 1) {
                            break;
                        }
                        ++v1;
                    }
                }
            }
            this.c.set(v - 1, object0);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteProgram
        public void f2(int v, double f) {
            this.f(v, f);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteProgram
        public void o1(int v, long v1) {
            this.f(v, v1);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteProgram
        public void r1(int v, @l byte[] arr_b) {
            L.p(arr_b, "value");
            this.f(v, arr_b);
        }
    }

    static final class KeepAliveCursor implements Cursor {
        @l
        private final Cursor a;
        @l
        private final AutoCloser b;

        public KeepAliveCursor(@l Cursor cursor0, @l AutoCloser autoCloser0) {
            L.p(cursor0, "delegate");
            L.p(autoCloser0, "autoCloser");
            super();
            this.a = cursor0;
            this.b = autoCloser0;
        }

        @Override  // android.database.Cursor
        public void close() {
            this.a.close();
            this.b.e();
        }

        @Override  // android.database.Cursor
        public void copyStringToBuffer(int v, CharArrayBuffer charArrayBuffer0) {
            this.a.copyStringToBuffer(v, charArrayBuffer0);
        }

        @Override  // android.database.Cursor
        @k(message = "Deprecated in Java")
        public void deactivate() {
            this.a.deactivate();
        }

        @Override  // android.database.Cursor
        public byte[] getBlob(int v) {
            return this.a.getBlob(v);
        }

        @Override  // android.database.Cursor
        public int getColumnCount() {
            return this.a.getColumnCount();
        }

        @Override  // android.database.Cursor
        public int getColumnIndex(String s) {
            return this.a.getColumnIndex(s);
        }

        @Override  // android.database.Cursor
        public int getColumnIndexOrThrow(String s) {
            return this.a.getColumnIndexOrThrow(s);
        }

        @Override  // android.database.Cursor
        public String getColumnName(int v) {
            return this.a.getColumnName(v);
        }

        @Override  // android.database.Cursor
        public String[] getColumnNames() {
            return this.a.getColumnNames();
        }

        @Override  // android.database.Cursor
        public int getCount() {
            return this.a.getCount();
        }

        @Override  // android.database.Cursor
        public double getDouble(int v) {
            return this.a.getDouble(v);
        }

        @Override  // android.database.Cursor
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @Override  // android.database.Cursor
        public float getFloat(int v) {
            return this.a.getFloat(v);
        }

        @Override  // android.database.Cursor
        public int getInt(int v) {
            return this.a.getInt(v);
        }

        @Override  // android.database.Cursor
        public long getLong(int v) {
            return this.a.getLong(v);
        }

        @Override  // android.database.Cursor
        @RequiresApi(api = 19)
        @l
        public Uri getNotificationUri() {
            return Api19Impl.a(this.a);
        }

        @Override  // android.database.Cursor
        @RequiresApi(api = 29)
        @l
        public List getNotificationUris() {
            return Api29Impl.a(this.a);
        }

        @Override  // android.database.Cursor
        public int getPosition() {
            return this.a.getPosition();
        }

        @Override  // android.database.Cursor
        public short getShort(int v) {
            return this.a.getShort(v);
        }

        @Override  // android.database.Cursor
        public String getString(int v) {
            return this.a.getString(v);
        }

        @Override  // android.database.Cursor
        public int getType(int v) {
            return this.a.getType(v);
        }

        @Override  // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.a.getWantsAllOnMoveCalls();
        }

        @Override  // android.database.Cursor
        public boolean isAfterLast() {
            return this.a.isAfterLast();
        }

        @Override  // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.a.isBeforeFirst();
        }

        @Override  // android.database.Cursor
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override  // android.database.Cursor
        public boolean isFirst() {
            return this.a.isFirst();
        }

        @Override  // android.database.Cursor
        public boolean isLast() {
            return this.a.isLast();
        }

        @Override  // android.database.Cursor
        public boolean isNull(int v) {
            return this.a.isNull(v);
        }

        @Override  // android.database.Cursor
        public boolean move(int v) {
            return this.a.move(v);
        }

        @Override  // android.database.Cursor
        public boolean moveToFirst() {
            return this.a.moveToFirst();
        }

        @Override  // android.database.Cursor
        public boolean moveToLast() {
            return this.a.moveToLast();
        }

        @Override  // android.database.Cursor
        public boolean moveToNext() {
            return this.a.moveToNext();
        }

        @Override  // android.database.Cursor
        public boolean moveToPosition(int v) {
            return this.a.moveToPosition(v);
        }

        @Override  // android.database.Cursor
        public boolean moveToPrevious() {
            return this.a.moveToPrevious();
        }

        @Override  // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver0) {
            this.a.registerContentObserver(contentObserver0);
        }

        @Override  // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver0) {
            this.a.registerDataSetObserver(dataSetObserver0);
        }

        @Override  // android.database.Cursor
        @k(message = "Deprecated in Java")
        public boolean requery() {
            return this.a.requery();
        }

        @Override  // android.database.Cursor
        public Bundle respond(Bundle bundle0) {
            return this.a.respond(bundle0);
        }

        @Override  // android.database.Cursor
        @RequiresApi(api = 23)
        public void setExtras(@l Bundle bundle0) {
            L.p(bundle0, "extras");
            Api23Impl.a(this.a, bundle0);
        }

        @Override  // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver0, Uri uri0) {
            this.a.setNotificationUri(contentResolver0, uri0);
        }

        @Override  // android.database.Cursor
        @RequiresApi(api = 29)
        public void setNotificationUris(@l ContentResolver contentResolver0, @l List list0) {
            L.p(contentResolver0, "cr");
            L.p(list0, "uris");
            Api29Impl.b(this.a, contentResolver0, list0);
        }

        @Override  // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver0) {
            this.a.unregisterContentObserver(contentObserver0);
        }

        @Override  // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
            this.a.unregisterDataSetObserver(dataSetObserver0);
        }
    }

    @l
    private final SupportSQLiteOpenHelper a;
    @l
    @f
    public final AutoCloser b;
    @l
    private final AutoClosingSupportSQLiteDatabase c;

    public AutoClosingRoomOpenHelper(@l SupportSQLiteOpenHelper supportSQLiteOpenHelper0, @l AutoCloser autoCloser0) {
        L.p(supportSQLiteOpenHelper0, "delegate");
        L.p(autoCloser0, "autoCloser");
        super();
        this.a = supportSQLiteOpenHelper0;
        this.b = autoCloser0;
        autoCloser0.o(this.getDelegate());
        this.c = new AutoClosingSupportSQLiteDatabase(autoCloser0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        this.c.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m
    public String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override  // androidx.room.DelegatingOpenHelper
    @l
    public SupportSQLiteOpenHelper getDelegate() {
        return this.a;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @l
    public SupportSQLiteDatabase getReadableDatabase() {
        this.c.a();
        return this.c;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @l
    public SupportSQLiteDatabase getWritableDatabase() {
        this.c.a();
        return this.c;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}

