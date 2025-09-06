package androidx.sqlite.db.framework;

import A3.q;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    @RequiresApi(30)
    public static final class Api30Impl {
        @l
        public static final Api30Impl a;

        static {
            Api30Impl.a = new Api30Impl();
        }

        @DoNotInline
        public final void a(@l SQLiteDatabase sQLiteDatabase0, @l String s, @m Object[] arr_object) {
            L.p(sQLiteDatabase0, "sQLiteDatabase");
            L.p(s, "sql");
            sQLiteDatabase0.execPerConnectionSQL(s, arr_object);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final SQLiteDatabase a;
    @l
    public static final Companion b;
    @l
    private static final String[] c;
    @l
    private static final String[] d;

    static {
        FrameworkSQLiteDatabase.b = new Companion(null);
        FrameworkSQLiteDatabase.c = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        FrameworkSQLiteDatabase.d = new String[0];
    }

    public FrameworkSQLiteDatabase(@l SQLiteDatabase sQLiteDatabase0) {
        L.p(sQLiteDatabase0, "delegate");
        super();
        this.a = sQLiteDatabase0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void F2(@l SQLiteTransactionListener sQLiteTransactionListener0) {
        L.p(sQLiteTransactionListener0, "transactionListener");
        this.a.beginTransactionWithListener(sQLiteTransactionListener0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long G0() {
        return this.a.getPageSize();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int H0(@l String s, @m String s1, @m Object[] arr_object) {
        L.p(s, "table");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("DELETE FROM ");
        stringBuilder0.append(s);
        if(s1 != null && s1.length() != 0) {
            stringBuilder0.append(" WHERE ");
            stringBuilder0.append(s1);
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatement0 = this.f3(s2);
        SimpleSQLiteQuery.c.b(supportSQLiteStatement0, arr_object);
        return supportSQLiteStatement0.O();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void H2() {
        this.a.endTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @m
    public List I0() {
        return this.a.getAttachedDbs();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void I3(@l SQLiteTransactionListener sQLiteTransactionListener0) {
        L.p(sQLiteTransactionListener0, "transactionListener");
        this.a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void J0() {
        Api16Impl.d(this.a);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean J3() {
        return this.a.inTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(16)
    @l
    public Cursor K0(@l SupportSQLiteQuery supportSQLiteQuery0, @m CancellationSignal cancellationSignal0) {
        L.p(supportSQLiteQuery0, "query");
        String s = supportSQLiteQuery0.b();
        L.m(cancellationSignal0);
        a a0 = (SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) -> {
            L.p(supportSQLiteQuery0, "$query");
            L.m(sQLiteQuery0);
            supportSQLiteQuery0.c(new FrameworkSQLiteProgram(sQLiteQuery0));
            return new SQLiteCursor(sQLiteCursorDriver0, s, sQLiteQuery0);
        };
        return Api16Impl.f(this.a, s, FrameworkSQLiteDatabase.d, null, cancellationSignal0, a0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void M0() {
        this.a.beginTransactionNonExclusive();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean M3() {
        return Api16Impl.e(this.a);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean N0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean O0() {
        return this.a.isDbLockedByCurrentThread();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void O3(int v) {
        this.a.setMaxSqlCacheSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean P0(int v) {
        return this.a.needUpgrade(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void P3(long v) {
        this.a.setPageSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor Q0(@l SupportSQLiteQuery supportSQLiteQuery0) {
        L.p(supportSQLiteQuery0, "query");
        b b0 = (SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) -> {
            L.p(new androidx.sqlite.db.framework.FrameworkSQLiteDatabase.query.cursorFactory.1(supportSQLiteQuery0), "$tmp0");
            return (Cursor)new androidx.sqlite.db.framework.FrameworkSQLiteDatabase.query.cursorFactory.1(supportSQLiteQuery0).T0(sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
        };
        String s = supportSQLiteQuery0.b();
        Cursor cursor0 = this.a.rawQueryWithFactory(b0, s, FrameworkSQLiteDatabase.d, null);
        L.o(cursor0, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursor0;

        final class androidx.sqlite.db.framework.FrameworkSQLiteDatabase.query.cursorFactory.1 extends N implements q {
            final SupportSQLiteQuery e;

            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.query.cursorFactory.1(SupportSQLiteQuery supportSQLiteQuery0) {
                this.e = supportSQLiteQuery0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((SQLiteDatabase)object0), ((SQLiteCursorDriver)object1), ((String)object2), ((SQLiteQuery)object3));
            }

            @l
            public final SQLiteCursor a(@m SQLiteDatabase sQLiteDatabase0, @m SQLiteCursorDriver sQLiteCursorDriver0, @m String s, @m SQLiteQuery sQLiteQuery0) {
                L.m(sQLiteQuery0);
                FrameworkSQLiteProgram frameworkSQLiteProgram0 = new FrameworkSQLiteProgram(sQLiteQuery0);
                this.e.c(frameworkSQLiteProgram0);
                return new SQLiteCursor(sQLiteCursorDriver0, s, sQLiteQuery0);
            }
        }

    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor R0(@l String s, @l Object[] arr_object) {
        L.p(s, "query");
        L.p(arr_object, "bindArgs");
        return this.Q0(new SimpleSQLiteQuery(s, arr_object));
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void W1(@l String s) throws SQLException {
        L.p(s, "sql");
        this.a.execSQL(s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void W2(@l String s, @m Object[] arr_object) {
        L.p(s, "sql");
        int v = Build.VERSION.SDK_INT;
        if(v < 30) {
            throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + v);
        }
        Api30Impl.a.a(this.a, s, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean a2() {
        return this.a.isDatabaseIntegrityOk();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.a.beginTransaction();
    }

    public final boolean c(@l SQLiteDatabase sQLiteDatabase0) {
        L.p(sQLiteDatabase0, "sqLiteDatabase");
        return L.g(this.a, sQLiteDatabase0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean c3(long v) {
        return this.a.yieldIfContendedSafely(v);
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    // 检测为 Lambda 实现
    private static final Cursor e(q q0, SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) [...]

    // 检测为 Lambda 实现
    private static final Cursor f(SupportSQLiteQuery supportSQLiteQuery0, SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public SupportSQLiteStatement f3(@l String s) {
        L.p(s, "sql");
        SQLiteStatement sQLiteStatement0 = this.a.compileStatement(s);
        L.o(sQLiteStatement0, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(sQLiteStatement0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @m
    public String getPath() {
        return this.a.getPath();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.a.getVersion();
    }

    public void i(long v) {
        this.a.setMaximumSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean l3() {
        return this.a.isReadOnly();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void n1(boolean z) {
        Api16Impl.g(this.a, z);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long p1() {
        return this.a.getMaximumSize();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean s2() {
        return this.a.enableWriteAheadLogging();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@l Locale locale0) {
        L.p(locale0, "locale");
        this.a.setLocale(locale0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int v) {
        this.a.setVersion(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int t3(@l String s, int v, @l ContentValues contentValues0, @m String s1, @m Object[] arr_object) {
        L.p(s, "table");
        L.p(contentValues0, "values");
        if(contentValues0.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int v1 = contentValues0.size();
        int v2 = arr_object == null ? v1 : arr_object.length + v1;
        Object[] arr_object1 = new Object[v2];
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("UPDATE ");
        stringBuilder0.append(FrameworkSQLiteDatabase.c[v]);
        stringBuilder0.append(s);
        stringBuilder0.append(" SET ");
        int v3 = 0;
        for(Object object0: contentValues0.keySet()) {
            stringBuilder0.append((v3 <= 0 ? "" : ","));
            stringBuilder0.append(((String)object0));
            arr_object1[v3] = contentValues0.get(((String)object0));
            stringBuilder0.append("=?");
            ++v3;
        }
        if(arr_object != null) {
            for(int v4 = v1; v4 < v2; ++v4) {
                arr_object1[v4] = arr_object[v4 - v1];
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(" WHERE ");
            stringBuilder0.append(s1);
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatement0 = this.f3(s2);
        SimpleSQLiteQuery.c.b(supportSQLiteStatement0, arr_object1);
        return supportSQLiteStatement0.O();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void u2() {
        this.a.setTransactionSuccessful();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void v2(@l String s, @l Object[] arr_object) throws SQLException {
        L.p(s, "sql");
        L.p(arr_object, "bindArgs");
        this.a.execSQL(s, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long w2(long v) {
        this.a.setMaximumSize(v);
        return this.a.getMaximumSize();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean w3() {
        return this.a.yieldIfContendedSafely();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor x3(@l String s) {
        L.p(s, "query");
        return this.Q0(new SimpleSQLiteQuery(s));
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long y1(@l String s, int v, @l ContentValues contentValues0) throws SQLException {
        L.p(s, "table");
        L.p(contentValues0, "values");
        return this.a.insertWithOnConflict(s, null, contentValues0, v);
    }
}

