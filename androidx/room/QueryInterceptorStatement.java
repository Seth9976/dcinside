package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    @l
    private final SupportSQLiteStatement a;
    @l
    private final String b;
    @l
    private final Executor c;
    @l
    private final QueryCallback d;
    @l
    private final List e;

    public QueryInterceptorStatement(@l SupportSQLiteStatement supportSQLiteStatement0, @l String s, @l Executor executor0, @l QueryCallback roomDatabase$QueryCallback0) {
        L.p(supportSQLiteStatement0, "delegate");
        L.p(s, "sqlStatement");
        L.p(executor0, "queryCallbackExecutor");
        L.p(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteStatement0;
        this.b = s;
        this.c = executor0;
        this.d = roomDatabase$QueryCallback0;
        this.e = new ArrayList();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long D0() {
        s s0 = () -> {
            L.p(this, "this$0");
            this.d.a(this.b, this.e);
        };
        this.c.execute(s0);
        return this.a.D0();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    @m
    public String E2() {
        u u0 = () -> {
            L.p(this, "this$0");
            this.d.a(this.b, this.e);
        };
        this.c.execute(u0);
        return this.a.E2();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void H1(int v) {
        this.n(v, null);
        this.a.H1(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public int O() {
        w w0 = () -> {
            L.p(this, "this$0");
            this.d.a(this.b, this.e);
        };
        this.c.execute(w0);
        return this.a.O();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void Q3() {
        this.e.clear();
        this.a.Q3();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void S0(int v, @l String s) {
        L.p(s, "value");
        this.n(v, s);
        this.a.S0(v, s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long Z2() {
        t t0 = () -> {
            L.p(this, "this$0");
            this.d.a(this.b, this.e);
        };
        this.c.execute(t0);
        return this.a.Z2();
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        v v0 = () -> {
            L.p(this, "this$0");
            this.d.a(this.b, this.e);
        };
        this.c.execute(v0);
        this.a.execute();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void f2(int v, double f) {
        this.n(v, f);
        this.a.f2(v, f);
    }

    // 检测为 Lambda 实现
    private static final void i(QueryInterceptorStatement queryInterceptorStatement0) [...]

    // 检测为 Lambda 实现
    private static final void j(QueryInterceptorStatement queryInterceptorStatement0) [...]

    // 检测为 Lambda 实现
    private static final void k(QueryInterceptorStatement queryInterceptorStatement0) [...]

    private final void n(int v, Object object0) {
        if(v - 1 >= this.e.size()) {
            int v1 = this.e.size();
            for(int v2 = 0; v2 < v - 1 - v1 + 1; ++v2) {
                this.e.add(null);
            }
        }
        this.e.set(v - 1, object0);
    }

    // 检测为 Lambda 实现
    private static final void o(QueryInterceptorStatement queryInterceptorStatement0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void o1(int v, long v1) {
        this.n(v, v1);
        this.a.o1(v, v1);
    }

    // 检测为 Lambda 实现
    private static final void p(QueryInterceptorStatement queryInterceptorStatement0) [...]

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void r1(int v, @l byte[] arr_b) {
        L.p(arr_b, "value");
        this.n(v, arr_b);
        this.a.r1(v, arr_b);
    }
}

