package V;

import com.google.gson.annotations.c;
import g0.f.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

public final class z {
    @s0({"SMAP\nRestorePushConfigServerDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestorePushConfigServerDTO.kt\ncom/dcinside/app/backup/data/RestorePushConfigServerDTO$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n11102#2:80\n11437#2,3:81\n11102#2:86\n11437#2,3:87\n11102#2:92\n11437#2,3:93\n11102#2:98\n11437#2,3:99\n11102#2:104\n11437#2,2:105\n11439#2:111\n37#3,2:84\n37#3,2:90\n37#3,2:96\n37#3,2:102\n37#3,2:112\n1557#4:107\n1628#4,3:108\n*S KotlinDebug\n*F\n+ 1 RestorePushConfigServerDTO.kt\ncom/dcinside/app/backup/data/RestorePushConfigServerDTO$Companion\n*L\n36#1:80\n36#1:81,3\n39#1:86\n39#1:87,3\n54#1:92\n54#1:93,3\n59#1:98\n59#1:99,3\n64#1:104\n64#1:105,2\n64#1:111\n36#1:84,2\n51#1:90,2\n56#1:96,2\n61#1:102,2\n73#1:112,2\n66#1:107\n66#1:108,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final z a(@l V.l l0) {
            B[] arr_b3;
            B[] arr_b2;
            x[] arr_x;
            y[] arr_y;
            L.p(l0, "data");
            m m0 = l0.b();
            B[] arr_b = null;
            A a0 = m0 == null ? null : new A(((int)m0.h()), ((int)m0.a()), ((int)m0.d()), ((int)m0.c()), ((int)m0.b()), ((int)m0.e()), ((int)m0.g()), ((int)m0.f()));
            i[] arr_i = l0.d();
            if(arr_i == null) {
                arr_y = null;
            }
            else {
                ArrayList arrayList0 = new ArrayList(arr_i.length);
                for(int v = 0; v < arr_i.length; ++v) {
                    i i0 = arr_i[v];
                    arrayList0.add(new y(i0.b(), i0.a(), i0.c()));
                }
                arr_y = (y[])arrayList0.toArray(new y[0]);
            }
            b[] arr_b1 = l0.a();
            if(arr_b1 == null) {
                arr_x = null;
            }
            else {
                ArrayList arrayList1 = new ArrayList(arr_b1.length);
                for(int v1 = 0; v1 < arr_b1.length; ++v1) {
                    b b0 = arr_b1[v1];
                    arrayList1.add(new x(b0.c(), b0.d(), b0.e(), b0.b(), b0.f(), b0.i(), b0.a(), b0.h(), b0.g()));
                }
                arr_x = (x[])arrayList1.toArray(new x[0]);
            }
            o[] arr_o = l0.c();
            if(arr_o == null) {
                arr_b2 = null;
            }
            else {
                ArrayList arrayList2 = new ArrayList(arr_o.length);
                for(int v2 = 0; v2 < arr_o.length; ++v2) {
                    o o0 = arr_o[v2];
                    arrayList2.add(new B(o0.b(), o0.a(), null));
                }
                arr_b2 = (B[])arrayList2.toArray(new B[0]);
            }
            o[] arr_o1 = l0.e();
            if(arr_o1 == null) {
                arr_b3 = null;
            }
            else {
                ArrayList arrayList3 = new ArrayList(arr_o1.length);
                for(int v3 = 0; v3 < arr_o1.length; ++v3) {
                    o o1 = arr_o1[v3];
                    arrayList3.add(new B(o1.b(), o1.a(), null));
                }
                arr_b3 = (B[])arrayList3.toArray(new B[0]);
            }
            o[] arr_o2 = l0.f();
            if(arr_o2 != null) {
                ArrayList arrayList4 = new ArrayList(arr_o2.length);
                for(int v4 = 0; v4 < arr_o2.length; ++v4) {
                    o o2 = arr_o2[v4];
                    ArrayList arrayList5 = new ArrayList();
                    List list0 = o2.c();
                    if(list0 != null) {
                        ArrayList arrayList6 = new ArrayList(u.b0(list0, 10));
                        for(Object object0: list0) {
                            d f$d0 = new d();
                            f$d0.c(((v)object0).a());
                            f$d0.d(((v)object0).b());
                            arrayList6.add(Boolean.valueOf(arrayList5.add(f$d0)));
                        }
                    }
                    arrayList4.add(new B(o2.b(), o2.a(), arrayList5));
                }
                arr_b = (B[])arrayList4.toArray(new B[0]);
            }
            return new z(a0, arr_y, arr_x, arr_b2, arr_b3, arr_b);
        }
    }

    @c("config")
    @y4.m
    private final A a;
    @c("keyword")
    @y4.m
    private final y[] b;
    @c("article")
    @y4.m
    private final x[] c;
    @c("recomm")
    @y4.m
    private final B[] d;
    @c("notify")
    @y4.m
    private final B[] e;
    @c("user")
    @y4.m
    private final B[] f;
    @l
    public static final a g;

    static {
        z.g = new a(null);
    }

    public z(@y4.m A a0, @y4.m y[] arr_y, @y4.m x[] arr_x, @y4.m B[] arr_b, @y4.m B[] arr_b1, @y4.m B[] arr_b2) {
        this.a = a0;
        this.b = arr_y;
        this.c = arr_x;
        this.d = arr_b;
        this.e = arr_b1;
        this.f = arr_b2;
    }

    @y4.m
    public final x[] a() {
        return this.c;
    }

    @y4.m
    public final A b() {
        return this.a;
    }

    @y4.m
    public final y[] c() {
        return this.b;
    }

    @y4.m
    public final B[] d() {
        return this.e;
    }

    @y4.m
    public final B[] e() {
        return this.d;
    }

    @y4.m
    public final B[] f() {
        return this.f;
    }
}

