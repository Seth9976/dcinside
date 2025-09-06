package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import s3.a;
import s3.e;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@RestrictTo({Scope.c})
public final class RoomSQLiteQuery implements SupportSQLiteProgram, SupportSQLiteQuery {
    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface Binding {
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final RoomSQLiteQuery a(@l String s, int v) {
            L.p(s, "query");
            TreeMap treeMap0 = RoomSQLiteQuery.l;
            synchronized(treeMap0) {
                Map.Entry map$Entry0 = treeMap0.ceilingEntry(v);
                if(map$Entry0 != null) {
                    treeMap0.remove(map$Entry0.getKey());
                    RoomSQLiteQuery roomSQLiteQuery0 = (RoomSQLiteQuery)map$Entry0.getValue();
                    roomSQLiteQuery0.s(s, v);
                    L.o(roomSQLiteQuery0, "sqliteQuery");
                    return roomSQLiteQuery0;
                }
            }
            RoomSQLiteQuery roomSQLiteQuery1 = new RoomSQLiteQuery(v, null);
            roomSQLiteQuery1.s(s, v);
            return roomSQLiteQuery1;
        }

        @l
        @n
        public final RoomSQLiteQuery b(@l SupportSQLiteQuery supportSQLiteQuery0) {
            L.p(supportSQLiteQuery0, "supportSQLiteQuery");
            RoomSQLiteQuery roomSQLiteQuery0 = this.a(supportSQLiteQuery0.b(), supportSQLiteQuery0.a());
            supportSQLiteQuery0.c(new SupportSQLiteProgram() {
                private final RoomSQLiteQuery a;

                {
                    this.a = roomSQLiteQuery0;
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void H1(int v) {
                    this.a.H1(v);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void Q3() {
                    this.a.Q3();
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void S0(int v, @l String s) {
                    L.p(s, "value");
                    this.a.S0(v, s);
                }

                @Override
                public void close() {
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void f2(int v, double f) {
                    this.a.f2(v, f);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void o1(int v, long v1) {
                    this.a.o1(v, v1);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void r1(int v, @l byte[] arr_b) {
                    L.p(arr_b, "value");
                    this.a.r1(v, arr_b);
                }
            });
            return roomSQLiteQuery0;
        }

        @VisibleForTesting
        public static void c() {
        }

        @VisibleForTesting
        public static void d() {
        }

        @VisibleForTesting
        public static void e() {
        }

        public final void f() {
            TreeMap treeMap0 = RoomSQLiteQuery.l;
            if(treeMap0.size() > 15) {
                int v = treeMap0.size() - 10;
                Iterator iterator0 = treeMap0.descendingKeySet().iterator();
                L.o(iterator0, "queryPool.descendingKeySet().iterator()");
                while(v > 0) {
                    iterator0.next();
                    iterator0.remove();
                    --v;
                }
            }
        }
    }

    @VisibleForTesting
    private final int a;
    @m
    private volatile String b;
    @l
    @f
    public final long[] c;
    @l
    @f
    public final double[] d;
    @l
    @f
    public final String[] e;
    @l
    @f
    public final byte[][] f;
    @l
    private final int[] g;
    private int h;
    @l
    public static final Companion i = null;
    public static final int j = 15;
    public static final int k = 10;
    @l
    @f
    public static final TreeMap l = null;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;

    static {
        RoomSQLiteQuery.i = new Companion(null);
        RoomSQLiteQuery.l = new TreeMap();
    }

    private RoomSQLiteQuery(int v) {
        this.a = v;
        this.g = new int[v + 1];
        this.c = new long[v + 1];
        this.d = new double[v + 1];
        this.e = new String[v + 1];
        this.f = new byte[v + 1][];
    }

    public RoomSQLiteQuery(int v, w w0) {
        this(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void H1(int v) {
        this.g[v] = 1;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void Q3() {
        Arrays.fill(this.g, 1);
        Arrays.fill(this.e, null);
        Arrays.fill(this.f, null);
        this.b = null;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void S0(int v, @l String s) {
        L.p(s, "value");
        this.g[v] = 4;
        this.e[v] = s;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public int a() {
        return this.h;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    @l
    public String b() {
        String s = this.b;
        if(s == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return s;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public void c(@l SupportSQLiteProgram supportSQLiteProgram0) {
        L.p(supportSQLiteProgram0, "statement");
        int v = this.a();
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                switch(this.g[v1]) {
                    case 1: {
                        supportSQLiteProgram0.H1(v1);
                        break;
                    }
                    case 2: {
                        supportSQLiteProgram0.o1(v1, this.c[v1]);
                        break;
                    }
                    case 3: {
                        supportSQLiteProgram0.f2(v1, this.d[v1]);
                        break;
                    }
                    case 4: {
                        String s = this.e[v1];
                        if(s == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        supportSQLiteProgram0.S0(v1, s);
                        break;
                    }
                    case 5: {
                        byte[] arr_b = this.f[v1];
                        if(arr_b == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        supportSQLiteProgram0.r1(v1, arr_b);
                        break;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    @Override
    public void close() {
    }

    @l
    @n
    public static final RoomSQLiteQuery e(@l String s, int v) {
        return RoomSQLiteQuery.i.a(s, v);
    }

    public final void f(@l RoomSQLiteQuery roomSQLiteQuery0) {
        L.p(roomSQLiteQuery0, "other");
        int v = roomSQLiteQuery0.a();
        System.arraycopy(roomSQLiteQuery0.g, 0, this.g, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.c, 0, this.c, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.e, 0, this.e, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.f, 0, this.f, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.d, 0, this.d, 0, v + 1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void f2(int v, double f) {
        this.g[v] = 3;
        this.d[v] = f;
    }

    @l
    @n
    public static final RoomSQLiteQuery i(@l SupportSQLiteQuery supportSQLiteQuery0) {
        return RoomSQLiteQuery.i.b(supportSQLiteQuery0);
    }

    private static void j() {
    }

    @VisibleForTesting
    public static void k() {
    }

    public final int n() {
        return this.a;
    }

    @VisibleForTesting
    public static void o() {
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void o1(int v, long v1) {
        this.g[v] = 2;
        this.c[v] = v1;
    }

    @VisibleForTesting
    public static void p() {
    }

    @VisibleForTesting
    public static void q() {
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void r1(int v, @l byte[] arr_b) {
        L.p(arr_b, "value");
        this.g[v] = 5;
        this.f[v] = arr_b;
    }

    public final void release() {
        synchronized(RoomSQLiteQuery.l) {
            RoomSQLiteQuery.l.put(this.a, this);
            RoomSQLiteQuery.i.f();
        }
    }

    public final void s(@l String s, int v) {
        L.p(s, "query");
        this.b = s;
        this.h = v;
    }
}

