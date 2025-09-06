package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class SupportSQLiteQueryBuilder {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final SupportSQLiteQueryBuilder a(@l String s) {
            L.p(s, "tableName");
            return new SupportSQLiteQueryBuilder(s, null);
        }
    }

    @l
    private final String a;
    private boolean b;
    @m
    private String[] c;
    @m
    private String d;
    @m
    private Object[] e;
    @m
    private String f;
    @m
    private String g;
    @m
    private String h;
    @m
    private String i;
    @l
    public static final Companion j;
    private static final Pattern k;

    static {
        SupportSQLiteQueryBuilder.j = new Companion(null);
        SupportSQLiteQueryBuilder.k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }

    private SupportSQLiteQueryBuilder(String s) {
        this.a = s;
    }

    public SupportSQLiteQueryBuilder(String s, w w0) {
        this(s);
    }

    private final void a(StringBuilder stringBuilder0, String s, String s1) {
        if(s1 != null && s1.length() != 0) {
            stringBuilder0.append(s);
            stringBuilder0.append(s1);
        }
    }

    private final void b(StringBuilder stringBuilder0, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(s);
        }
        stringBuilder0.append(' ');
    }

    @l
    @n
    public static final SupportSQLiteQueryBuilder c(@l String s) {
        return SupportSQLiteQueryBuilder.j.a(s);
    }

    @l
    public final SupportSQLiteQueryBuilder d(@m String[] arr_s) {
        this.c = arr_s;
        return this;
    }

    @l
    public final SupportSQLiteQuery e() {
        if((this.f == null || this.f.length() == 0) && (this.g != null && this.g.length() != 0)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder stringBuilder0 = new StringBuilder(120);
        stringBuilder0.append("SELECT ");
        if(this.b) {
            stringBuilder0.append("DISTINCT ");
        }
        String[] arr_s = this.c;
        if(arr_s == null || arr_s.length == 0) {
            stringBuilder0.append("* ");
        }
        else {
            L.m(arr_s);
            this.b(stringBuilder0, arr_s);
        }
        stringBuilder0.append("FROM ");
        stringBuilder0.append(this.a);
        this.a(stringBuilder0, " WHERE ", this.d);
        this.a(stringBuilder0, " GROUP BY ", this.f);
        this.a(stringBuilder0, " HAVING ", this.g);
        this.a(stringBuilder0, " ORDER BY ", this.h);
        this.a(stringBuilder0, " LIMIT ", this.i);
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder(capacity).…builderAction).toString()");
        return new SimpleSQLiteQuery(s, this.e);
    }

    @l
    public final SupportSQLiteQueryBuilder f() {
        this.b = true;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder g(@m String s) {
        this.f = s;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder h(@m String s) {
        this.g = s;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder i(@l String s) {
        L.p(s, "limit");
        boolean z = SupportSQLiteQueryBuilder.k.matcher(s).matches();
        if(s.length() != 0 && !z) {
            throw new IllegalArgumentException(("invalid LIMIT clauses:" + s).toString());
        }
        this.i = s;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder j(@m String s) {
        this.h = s;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder k(@m String s, @m Object[] arr_object) {
        this.d = s;
        this.e = arr_object;
        return this;
    }
}

