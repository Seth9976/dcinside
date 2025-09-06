package androidx.sqlite.db;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final void a(SupportSQLiteProgram supportSQLiteProgram0, int v, Object object0) {
            if(object0 == null) {
                supportSQLiteProgram0.H1(v);
                return;
            }
            if(object0 instanceof byte[]) {
                supportSQLiteProgram0.r1(v, ((byte[])object0));
                return;
            }
            if(object0 instanceof Float) {
                supportSQLiteProgram0.f2(v, ((double)((Number)object0).floatValue()));
                return;
            }
            if(object0 instanceof Double) {
                supportSQLiteProgram0.f2(v, ((Number)object0).doubleValue());
                return;
            }
            if(object0 instanceof Long) {
                supportSQLiteProgram0.o1(v, ((Number)object0).longValue());
                return;
            }
            if(object0 instanceof Integer) {
                supportSQLiteProgram0.o1(v, ((long)((Number)object0).intValue()));
                return;
            }
            if(object0 instanceof Short) {
                supportSQLiteProgram0.o1(v, ((long)((Number)object0).shortValue()));
                return;
            }
            if(object0 instanceof Byte) {
                supportSQLiteProgram0.o1(v, ((long)((Number)object0).byteValue()));
                return;
            }
            if(object0 instanceof String) {
                supportSQLiteProgram0.S0(v, ((String)object0));
                return;
            }
            if(!(object0 instanceof Boolean)) {
                throw new IllegalArgumentException("Cannot bind " + object0 + " at index " + v + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
            supportSQLiteProgram0.o1(v, (((Boolean)object0).booleanValue() ? 1L : 0L));
        }

        @n
        public final void b(@l SupportSQLiteProgram supportSQLiteProgram0, @m Object[] arr_object) {
            L.p(supportSQLiteProgram0, "statement");
            if(arr_object == null) {
                return;
            }
            int v = 0;
            while(v < arr_object.length) {
                Object object0 = arr_object[v];
                ++v;
                this.a(supportSQLiteProgram0, v, object0);
            }
        }
    }

    @l
    private final String a;
    @m
    private final Object[] b;
    @l
    public static final Companion c;

    static {
        SimpleSQLiteQuery.c = new Companion(null);
    }

    public SimpleSQLiteQuery(@l String s) {
        L.p(s, "query");
        this(s, null);
    }

    public SimpleSQLiteQuery(@l String s, @m Object[] arr_object) {
        L.p(s, "query");
        super();
        this.a = s;
        this.b = arr_object;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public int a() {
        return this.b == null ? 0 : this.b.length;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    @l
    public String b() {
        return this.a;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public void c(@l SupportSQLiteProgram supportSQLiteProgram0) {
        L.p(supportSQLiteProgram0, "statement");
        SimpleSQLiteQuery.c.b(supportSQLiteProgram0, this.b);
    }

    @n
    public static final void d(@l SupportSQLiteProgram supportSQLiteProgram0, @m Object[] arr_object) {
        SimpleSQLiteQuery.c.b(supportSQLiteProgram0, arr_object);
    }
}

