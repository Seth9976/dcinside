package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.c;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import z3.n;

public final class c0 extends c implements RandomAccess {
    @s0({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final void a(long v, l l0, int v1, List list0, int v2, int v3, List list1) {
            l l2;
            int v15;
            int v14;
            int v6;
            int v5;
            if(v2 >= v3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for(int v4 = v2; v4 < v3; ++v4) {
                if(((o)list0.get(v4)).h0() < v1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            o o0 = (o)list0.get(v2);
            o o1 = (o)list0.get(v3 - 1);
            if(v1 == o0.h0()) {
                v5 = v2 + 1;
                v6 = ((Number)list1.get(v2)).intValue();
                o0 = (o)list0.get(v2 + 1);
            }
            else {
                v5 = v2;
                v6 = -1;
            }
            if(o0.r(v1) != o1.r(v1)) {
                int v7 = v5 + 1;
                int v8 = 1;
                while(v7 < v3) {
                    if(((o)list0.get(v7 - 1)).r(v1) != ((o)list0.get(v7)).r(v1)) {
                        ++v8;
                    }
                    ++v7;
                }
                long v9 = v + this.c(l0) + 2L + ((long)(v8 * 2));
                l0.j2(v8);
                l0.j2(v6);
                for(int v10 = v5; v10 < v3; ++v10) {
                    int v11 = ((o)list0.get(v10)).r(v1);
                    if(v10 == v5 || v11 != ((o)list0.get(v10 - 1)).r(v1)) {
                        l0.j2(v11 & 0xFF);
                    }
                }
                l l1 = new l();
                while(v5 < v3) {
                    int v12 = ((o)list0.get(v5)).r(v1);
                    int v13 = v5 + 1;
                    while(true) {
                        if(v13 < v3) {
                            if(v12 == ((o)list0.get(v13)).r(v1)) {
                                ++v13;
                                continue;
                            }
                            else {
                                v14 = v13;
                                break;
                            }
                        }
                        v14 = v3;
                        break;
                    }
                    if(v5 + 1 != v14 || v1 + 1 != ((o)list0.get(v5)).h0()) {
                        l0.j2(-((int)(v9 + this.c(l1))));
                        v15 = v14;
                        l2 = l1;
                        this.a(v9, l1, v1 + 1, list0, v5, v14, list1);
                    }
                    else {
                        l0.j2(((Number)list1.get(v5)).intValue());
                        v15 = v14;
                        l2 = l1;
                    }
                    l1 = l2;
                    v5 = v15;
                }
                l0.K2(l1);
                return;
            }
            int v16 = Math.min(o0.h0(), o1.h0());
            int v17 = 0;
            for(int v18 = v1; v18 < v16 && o0.r(v18) == o1.r(v18); ++v18) {
                ++v17;
            }
            long v19 = v + this.c(l0) + 2L + ((long)v17) + 1L;
            l0.j2(-v17);
            l0.j2(v6);
            int v20 = v17 + v1;
            while(v1 < v20) {
                l0.j2(o0.r(v1) & 0xFF);
                ++v1;
            }
            if(v5 + 1 == v3) {
                if(v20 != ((o)list0.get(v5)).h0()) {
                    throw new IllegalStateException("Check failed.");
                }
                l0.j2(((Number)list1.get(v5)).intValue());
                return;
            }
            l l3 = new l();
            l0.j2(-((int)(this.c(l3) + v19)));
            this.a(v19, l3, v20, list0, v5, v3, list1);
            l0.K2(l3);
        }

        static void b(a c0$a0, long v, l l0, int v1, List list0, int v2, int v3, List list1, int v4, Object object0) {
            c0$a0.a(((v4 & 1) == 0 ? v : 0L), l0, ((v4 & 4) == 0 ? v1 : 0), list0, ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? v3 : list0.size()), list1);
        }

        private final long c(l l0) {
            return l0.size() / 4L;
        }

        @y4.l
        @n
        public final c0 d(@y4.l o[] arr_o) {
            L.p(arr_o, "byteStrings");
            if(arr_o.length == 0) {
                return new c0(new o[0], new int[]{0, -1}, null);
            }
            List list0 = kotlin.collections.l.Uy(arr_o);
            u.m0(list0);
            ArrayList arrayList0 = new ArrayList(arr_o.length);
            for(int v1 = 0; v1 < arr_o.length; ++v1) {
                o o0 = arr_o[v1];
                arrayList0.add(-1);
            }
            Integer[] arr_integer = (Integer[])arrayList0.toArray(new Integer[0]);
            List list1 = u.S(Arrays.copyOf(arr_integer, arr_integer.length));
            int v2 = 0;
            for(int v3 = 0; v2 < arr_o.length; ++v3) {
                list1.set(u.y(list0, arr_o[v2], 0, 0, 6, null), v3);
                ++v2;
            }
            if(((o)list0.get(0)).h0() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            for(int v4 = 0; v4 < list0.size(); ++v4) {
                o o1 = (o)list0.get(v4);
                int v5 = v4 + 1;
                while(v5 < list0.size()) {
                    o o2 = (o)list0.get(v5);
                    if(!o2.i0(o1)) {
                        break;
                    }
                    if(o2.h0() == o1.h0()) {
                        throw new IllegalArgumentException(("duplicate option: " + o2).toString());
                    }
                    if(((Number)list1.get(v5)).intValue() > ((Number)list1.get(v4)).intValue()) {
                        list0.remove(v5);
                        list1.remove(v5);
                    }
                    else {
                        ++v5;
                    }
                }
            }
            l l0 = new l();
            a.b(this, 0L, l0, 0, list0, 0, 0, list1, 53, null);
            int[] arr_v = new int[((int)this.c(l0))];
            for(int v = 0; !l0.j3(); ++v) {
                arr_v[v] = l0.readInt();
            }
            Object[] arr_object = Arrays.copyOf(arr_o, arr_o.length);
            L.o(arr_object, "copyOf(this, size)");
            return new c0(((o[])arr_object), arr_v, null);
        }
    }

    @y4.l
    private final o[] c;
    @y4.l
    private final int[] d;
    @y4.l
    public static final a e;

    static {
        c0.e = new a(null);
    }

    private c0(o[] arr_o, int[] arr_v) {
        this.c = arr_o;
        this.d = arr_v;
    }

    public c0(o[] arr_o, int[] arr_v, w w0) {
        this(arr_o, arr_v);
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.c.length;
    }

    public boolean b(o o0) {
        return super.contains(o0);
    }

    @y4.l
    public o c(int v) {
        return this.c[v];
    }

    @Override  // kotlin.collections.a
    public final boolean contains(Object object0) {
        return object0 instanceof o ? this.b(((o)object0)) : false;
    }

    @y4.l
    public final o[] d() {
        return this.c;
    }

    @y4.l
    public final int[] g() {
        return this.d;
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        return this.c(v);
    }

    public int h(o o0) {
        return super.indexOf(o0);
    }

    public int i(o o0) {
        return super.lastIndexOf(o0);
    }

    @Override  // kotlin.collections.c
    public final int indexOf(Object object0) {
        return object0 instanceof o ? this.h(((o)object0)) : -1;
    }

    @y4.l
    @n
    public static final c0 j(@y4.l o[] arr_o) {
        return c0.e.d(arr_o);
    }

    @Override  // kotlin.collections.c
    public final int lastIndexOf(Object object0) {
        return object0 instanceof o ? this.i(((o)object0)) : -1;
    }
}

