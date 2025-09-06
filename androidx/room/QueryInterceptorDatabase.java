package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    @l
    private final SupportSQLiteDatabase a;
    @l
    private final Executor b;
    @l
    private final QueryCallback c;

    public QueryInterceptorDatabase(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l Executor executor0, @l QueryCallback roomDatabase$QueryCallback0) {
        L.p(supportSQLiteDatabase0, "delegate");
        L.p(executor0, "queryCallbackExecutor");
        L.p(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteDatabase0;
        this.b = executor0;
        this.c = roomDatabase$QueryCallback0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void F2(@l SQLiteTransactionListener sQLiteTransactionListener0) {
        L.p(sQLiteTransactionListener0, "transactionListener");
        q q0 = () -> {
            L.p(this, "this$0");
            List list0 = u.H();
            this.c.a("BEGIN EXCLUSIVE TRANSACTION", list0);
        };
        this.b.execute(q0);
        this.a.F2(sQLiteTransactionListener0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long G0() {
        return this.a.G0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int H0(@l String s, @m String s1, @m Object[] arr_object) {
        L.p(s, "table");
        return this.a.H0(s, s1, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void H2() {
        g g0 = () -> {
            L.p(this, "this$0");
            List list0 = u.H();
            this.c.a("END TRANSACTION", list0);
        };
        this.b.execute(g0);
        this.a.H2();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @m
    public List I0() {
        return this.a.I0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void I3(@l SQLiteTransactionListener sQLiteTransactionListener0) {
        L.p(sQLiteTransactionListener0, "transactionListener");
        h h0 = () -> {
            L.p(this, "this$0");
            List list0 = u.H();
            this.c.a("BEGIN DEFERRED TRANSACTION", list0);
        };
        this.b.execute(h0);
        this.a.I3(sQLiteTransactionListener0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void J0() {
        this.a.J0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean J3() {
        return this.a.J3();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor K0(@l SupportSQLiteQuery supportSQLiteQuery0, @m CancellationSignal cancellationSignal0) {
        L.p(supportSQLiteQuery0, "query");
        QueryInterceptorProgram queryInterceptorProgram0 = new QueryInterceptorProgram();
        supportSQLiteQuery0.c(queryInterceptorProgram0);
        r r0 = () -> {
            L.p(this, "this$0");
            L.p(supportSQLiteQuery0, "$query");
            L.p(queryInterceptorProgram0, "$queryInterceptorProgram");
            String s = supportSQLiteQuery0.b();
            this.c.a(s, queryInterceptorProgram0.a());
        };
        this.b.execute(r0);
        return this.a.Q0(supportSQLiteQuery0);
    }

    // 检测为 Lambda 实现
    private static final void L(QueryInterceptorDatabase queryInterceptorDatabase0, String s) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void M0() {
        n n0 = () -> {
            L.p(this, "this$0");
            List list0 = u.H();
            this.c.a("BEGIN DEFERRED TRANSACTION", list0);
        };
        this.b.execute(n0);
        this.a.M0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean M3() {
        return this.a.M3();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean N0() {
        return this.a.N0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean O0() {
        return this.a.O0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void O3(int v) {
        this.a.O3(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean P0(int v) {
        return this.a.P0(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void P3(long v) {
        this.a.P3(v);
    }

    // 检测为 Lambda 实现
    private static final void Q(QueryInterceptorDatabase queryInterceptorDatabase0, String s, List list0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor Q0(@l SupportSQLiteQuery supportSQLiteQuery0) {
        L.p(supportSQLiteQuery0, "query");
        QueryInterceptorProgram queryInterceptorProgram0 = new QueryInterceptorProgram();
        supportSQLiteQuery0.c(queryInterceptorProgram0);
        p p0 = () -> {
            L.p(this, "this$0");
            L.p(supportSQLiteQuery0, "$query");
            L.p(queryInterceptorProgram0, "$queryInterceptorProgram");
            String s = supportSQLiteQuery0.b();
            List list0 = queryInterceptorProgram0.a();
            this.c.a(s, list0);
        };
        this.b.execute(p0);
        return this.a.Q0(supportSQLiteQuery0);
    }

    // 检测为 Lambda 实现
    private static final void R(QueryInterceptorDatabase queryInterceptorDatabase0, String s) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor R0(@l String s, @l Object[] arr_object) {
        L.p(s, "query");
        L.p(arr_object, "bindArgs");
        j j0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$query");
            L.p(arr_object, "$bindArgs");
            List list0 = kotlin.collections.l.Ky(arr_object);
            this.c.a(s, list0);
        };
        this.b.execute(j0);
        return this.a.R0(s, arr_object);
    }

    // 检测为 Lambda 实现
    private static final void T(QueryInterceptorDatabase queryInterceptorDatabase0, String s, Object[] arr_object) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void W1(@l String s) {
        L.p(s, "sql");
        k k0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$sql");
            List list0 = u.H();
            this.c.a(s, list0);
        };
        this.b.execute(k0);
        this.a.W1(s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void W2(@l String s, @SuppressLint({"ArrayReturn"}) @m Object[] arr_object) {
        L.p(s, "sql");
        this.a.W2(s, arr_object);
    }

    // 检测为 Lambda 实现
    private static final void Y(QueryInterceptorDatabase queryInterceptorDatabase0, SupportSQLiteQuery supportSQLiteQuery0, QueryInterceptorProgram queryInterceptorProgram0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean a2() {
        return this.a.a2();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        androidx.room.l l0 = () -> {
            L.p(this, "this$0");
            List list0 = u.H();
            this.c.a("BEGIN EXCLUSIVE TRANSACTION", list0);
        };
        this.b.execute(l0);
        this.a.beginTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean c3(long v) {
        return this.a.c3(v);
    }

    @Override
    public void close() {
        this.a.close();
    }

    // 检测为 Lambda 实现
    private static final void d0(QueryInterceptorDatabase queryInterceptorDatabase0, SupportSQLiteQuery supportSQLiteQuery0, QueryInterceptorProgram queryInterceptorProgram0) [...]

    // 检测为 Lambda 实现
    private static final void e0(QueryInterceptorDatabase queryInterceptorDatabase0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public SupportSQLiteStatement f3(@l String s) {
        L.p(s, "sql");
        return new QueryInterceptorStatement(this.a.f3(s), s, this.b, this.c);
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

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean l3() {
        return this.a.l3();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void n1(boolean z) {
        this.a.n1(z);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long p1() {
        return this.a.p1();
    }

    // 检测为 Lambda 实现
    private static final void s(QueryInterceptorDatabase queryInterceptorDatabase0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean s2() {
        return this.a.s2();
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

    // 检测为 Lambda 实现
    private static final void t(QueryInterceptorDatabase queryInterceptorDatabase0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int t3(@l String s, int v, @l ContentValues contentValues0, @m String s1, @m Object[] arr_object) {
        L.p(s, "table");
        L.p(contentValues0, "values");
        return this.a.t3(s, v, contentValues0, s1, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void u2() {
        androidx.room.m m0 = () -> {
            L.p(this, "this$0");
            List list0 = u.H();
            this.c.a("TRANSACTION SUCCESSFUL", list0);
        };
        this.b.execute(m0);
        this.a.u2();
    }

    // 检测为 Lambda 实现
    private static final void v(QueryInterceptorDatabase queryInterceptorDatabase0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void v2(@l String s, @l Object[] arr_object) {
        L.p(s, "sql");
        L.p(arr_object, "bindArgs");
        List list0 = u.i();
        u.s0(list0, arr_object);
        List list1 = u.a(list0);
        o o0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$sql");
            L.p(list1, "$inputArguments");
            this.c.a(s, list1);
        };
        this.b.execute(o0);
        Object[] arr_object1 = list1.toArray(new Object[0]);
        this.a.v2(s, arr_object1);
    }

    // 检测为 Lambda 实现
    private static final void w(QueryInterceptorDatabase queryInterceptorDatabase0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long w2(long v) {
        return this.a.w2(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean w3() {
        return this.a.w3();
    }

    // 检测为 Lambda 实现
    private static final void x(QueryInterceptorDatabase queryInterceptorDatabase0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor x3(@l String s) {
        L.p(s, "query");
        i i0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$query");
            List list0 = u.H();
            this.c.a(s, list0);
        };
        this.b.execute(i0);
        return this.a.x3(s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long y1(@l String s, int v, @l ContentValues contentValues0) {
        L.p(s, "table");
        L.p(contentValues0, "values");
        return this.a.y1(s, v, contentValues0);
    }
}

