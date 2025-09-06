package androidx.collection;

import A3.o;
import A3.p;
import androidx.annotation.IntRange;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
public abstract class ObjectList {
    @l
    @f
    public Object[] a;
    @f
    public int b;

    private ObjectList(int v) {
        this.a = v == 0 ? ObjectListKt.a : new Object[v];
    }

    public ObjectList(int v, w w0) {
        this(v);
    }

    @l
    public final kotlin.ranges.l A() {
        return s.W1(0, this.b);
    }

    @IntRange(from = -1L)
    public final int B() {
        return this.b - 1;
    }

    @IntRange(from = 0L)
    public final int C() {
        return this.b;
    }

    @b0
    public static void D() {
    }

    public final int E(Object object0) {
        int v = 0;
        if(object0 == null) {
            Object[] arr_object = this.a;
            int v1 = this.b;
            while(v < v1) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        Object[] arr_object1 = this.a;
        int v2 = this.b;
        while(v < v2) {
            if(object0.equals(arr_object1[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public final int F(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                return v1;
            }
        }
        return -1;
    }

    public final int G(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public final boolean H() {
        return this.b == 0;
    }

    public final boolean I() {
        return this.b != 0;
    }

    @l
    @j
    public final String J() {
        return ObjectList.Q(this, null, null, null, 0, null, null, 0x3F, null);
    }

    @l
    @j
    public final String K(@l CharSequence charSequence0) {
        L.p(charSequence0, "separator");
        return ObjectList.Q(this, charSequence0, null, null, 0, null, null, 62, null);
    }

    @l
    @j
    public final String L(@l CharSequence charSequence0, @l CharSequence charSequence1) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        return ObjectList.Q(this, charSequence0, charSequence1, null, 0, null, null, 60, null);
    }

    @l
    @j
    public final String M(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ObjectList.Q(this, charSequence0, charSequence1, charSequence2, 0, null, null, 56, null);
    }

    @l
    @j
    public final String N(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ObjectList.Q(this, charSequence0, charSequence1, charSequence2, v, null, null, 0x30, null);
    }

    @l
    @j
    public final String O(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        return ObjectList.Q(this, charSequence0, charSequence1, charSequence2, v, charSequence3, null, 0x20, null);
    }

    @l
    @j
    public final String P(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            Object object0 = arr_object[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            if(function10 == null) {
                stringBuilder0.append(object0);
            }
            else {
                stringBuilder0.append(((CharSequence)function10.invoke(object0)));
            }
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String Q(ObjectList objectList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return objectList0.P(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    public final Object R() {
        if(this.H()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final Object S(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final int T(Object object0) {
        if(object0 == null) {
            Object[] arr_object = this.a;
            for(int v = this.b - 1; -1 < v; --v) {
                if(arr_object[v] == null) {
                    return v;
                }
            }
            return -1;
        }
        Object[] arr_object1 = this.a;
        for(int v1 = this.b - 1; -1 < v1; --v1) {
            if(object0.equals(arr_object1[v1])) {
                return v1;
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @m
    public final Object U() {
        return this.H() ? null : this.a[this.b - 1];
    }

    @m
    public final Object V(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    public final boolean W() {
        return this.H();
    }

    public final boolean X(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.I();
    }

    public final boolean b(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public abstract List c();

    public final boolean d(Object object0) {
        return this.E(object0) >= 0;
    }

    public final boolean e(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        Object[] arr_object = objectList0.a;
        int v = objectList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.d(arr_object[v1])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 instanceof ObjectList) {
            int v = this.b;
            if(((ObjectList)object0).b == v) {
                Object[] arr_object = this.a;
                Object[] arr_object1 = ((ObjectList)object0).a;
                kotlin.ranges.l l0 = s.W1(0, v);
                int v1 = l0.g();
                int v2 = l0.h();
                if(v1 <= v2) {
                    while(true) {
                        if(!L.g(arr_object[v1], arr_object1[v1])) {
                            return false;
                        }
                        if(v1 == v2) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        for(Object object0: iterable0) {
            if(!this.d(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean g(@l List list0) {
        L.p(list0, "elements");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.d(list0.get(v1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            if(!this.d(arr_object[v])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            v2 += (object0 == null ? 0 : object0.hashCode()) * 0x1F;
        }
        return v2;
    }

    public final int i() {
        return this.b;
    }

    public final int j(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    public final Object k(@IntRange(from = 0L) int v) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
        }
        return this.a[v];
    }

    public final Object l(@IntRange(from = 0L) int v, @l Function1 function10) {
        L.p(function10, "defaultValue");
        return v < 0 || v >= this.b ? function10.invoke(v) : this.a[v];
    }

    public final Object m() {
        if(this.H()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final Object n(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    // 去混淆评级： 低(20)
    @m
    public final Object o() {
        return this.H() ? null : this.y(0);
    }

    @m
    public final Object p(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    public final Object q(Object object0, @l o o0) {
        L.p(o0, "operation");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, arr_object[v1]);
        }
        return object0;
    }

    public final Object r(Object object0, @l p p0) {
        L.p(p0, "operation");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, arr_object[v1]);
        }
        return object0;
    }

    public final Object s(Object object0, @l o o0) {
        L.p(o0, "operation");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            object0 = o0.invoke(arr_object[v], object0);
        }
        return object0;
    }

    public final Object t(Object object0, @l p p0) {
        L.p(p0, "operation");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            object0 = p0.invoke(v, arr_object[v], object0);
        }
        return object0;
    }

    @Override
    @l
    public String toString() {
        return ObjectList.Q(this, null, "[", "]", 0, null, new Function1() {
            final ObjectList e;

            {
                this.e = objectList0;
                super(1);
            }

            @l
            public final CharSequence a(Object object0) {
                return object0 == this.e ? "(this)" : String.valueOf(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }, 25, null);
    }

    public final void u(@l Function1 function10) {
        L.p(function10, "block");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(arr_object[v1]);
        }
    }

    public final void v(@l o o0) {
        L.p(o0, "block");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, arr_object[v1]);
        }
    }

    public final void w(@l Function1 function10) {
        L.p(function10, "block");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            function10.invoke(arr_object[v]);
        }
    }

    public final void x(@l o o0) {
        L.p(o0, "block");
        Object[] arr_object = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            o0.invoke(v, arr_object[v]);
        }
    }

    public final Object y(@IntRange(from = 0L) int v) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
        }
        return this.a[v];
    }

    @b0
    public static void z() {
    }
}

