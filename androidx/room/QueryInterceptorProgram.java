package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    @l
    private final List a;

    public QueryInterceptorProgram() {
        this.a = new ArrayList();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void H1(int v) {
        this.b(v, null);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void Q3() {
        this.a.clear();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void S0(int v, @l String s) {
        L.p(s, "value");
        this.b(v, s);
    }

    @l
    public final List a() {
        return this.a;
    }

    private final void b(int v, Object object0) {
        if(v - 1 >= this.a.size()) {
            int v1 = this.a.size();
            if(v1 <= v - 1) {
                while(true) {
                    this.a.add(null);
                    if(v1 == v - 1) {
                        break;
                    }
                    ++v1;
                }
            }
        }
        this.a.set(v - 1, object0);
    }

    @Override
    public void close() {
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void f2(int v, double f) {
        this.b(v, f);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void o1(int v, long v1) {
        this.b(v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void r1(int v, @l byte[] arr_b) {
        L.p(arr_b, "value");
        this.b(v, arr_b);
    }
}

