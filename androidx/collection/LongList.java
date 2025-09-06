package androidx.collection;

import A3.o;
import A3.p;
import androidx.annotation.IntRange;
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

@s0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class LongList {
    @l
    @f
    public long[] a;
    @f
    public int b;

    private LongList(int v) {
        this.a = v == 0 ? LongSetKt.b() : new long[v];
    }

    public LongList(int v, w w0) {
        this(v);
    }

    public final int A(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public final boolean B() {
        return this.b == 0;
    }

    public final boolean C() {
        return this.b != 0;
    }

    @l
    @j
    public final String D() {
        return LongList.P(this, null, null, null, 0, null, 0x1F, null);
    }

    @l
    @j
    public final String E(@l CharSequence charSequence0) {
        L.p(charSequence0, "separator");
        return LongList.P(this, charSequence0, null, null, 0, null, 30, null);
    }

    @l
    @j
    public final String F(@l CharSequence charSequence0, @l CharSequence charSequence1) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        return LongList.P(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @l
    @j
    public final String G(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return LongList.P(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @l
    @j
    public final String H(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return LongList.P(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @l
    @j
    public final String I(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        long[] arr_v = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            long v3 = arr_v[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(v3);
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String J(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @l Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        long[] arr_v = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            long v3 = arr_v[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v3)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String K(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        long[] arr_v = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            long v3 = arr_v[v2];
            if(v2 == v) {
                stringBuilder0.append("...");
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v3)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String L(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, @l Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append(charSequence2);
                break;
            }
            long v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String M(@l CharSequence charSequence0, @l CharSequence charSequence1, @l Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            long v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String N(@l CharSequence charSequence0, @l Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            long v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String O(@l Function1 function10) {
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            long v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String P(LongList longList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return longList0.I(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3);
    }

    public static String Q(LongList longList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        if((v1 & 2) != 0) {
            charSequence1 = "";
        }
        if((v1 & 4) != 0) {
            charSequence2 = "";
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        L.p(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        long[] arr_v = longList0.a;
        int v2 = longList0.b;
        for(int v3 = 0; true; ++v3) {
            if(v3 >= v2) {
                stringBuilder0.append(charSequence2);
                break;
            }
            long v4 = arr_v[v3];
            if(v3 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v3 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v4)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final long R() {
        if(this.B()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final long S(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final int T(long v) {
        long[] arr_v = this.a;
        for(int v1 = this.b - 1; -1 < v1; --v1) {
            if(arr_v[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    public final boolean U() {
        return this.B();
    }

    public final boolean V(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.C();
    }

    public final boolean b(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((long)arr_v[v1]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(long v) {
        long[] arr_v = this.a;
        int v1 = this.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(arr_v[v2] == v) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@l LongList longList0) {
        L.p(longList0, "elements");
        kotlin.ranges.l l0 = s.W1(0, longList0.b);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                if(!this.c(longList0.s(v))) {
                    return false;
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return true;
    }

    public final int e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 instanceof LongList) {
            int v = this.b;
            if(((LongList)object0).b == v) {
                long[] arr_v = this.a;
                long[] arr_v1 = ((LongList)object0).a;
                kotlin.ranges.l l0 = s.W1(0, v);
                int v1 = l0.g();
                int v2 = l0.h();
                if(v1 <= v2) {
                    while(true) {
                        if(arr_v[v1] != arr_v1[v1]) {
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

    public final int f(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((long)arr_v[v1]))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    public final long g(@IntRange(from = 0L) int v) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
        }
        return this.a[v];
    }

    public final long h(@IntRange(from = 0L) int v, @l Function1 function10) {
        L.p(function10, "defaultValue");
        return v < 0 || v >= this.b ? ((Number)function10.invoke(v)).longValue() : this.a[v];
    }

    @Override
    public int hashCode() {
        long[] arr_v = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += a.a(arr_v[v1]) * 0x1F;
        }
        return v2;
    }

    public final long i() {
        if(this.B()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.a[0];
    }

    public final long j(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = arr_v[v1];
            if(((Boolean)function10.invoke(v2)).booleanValue()) {
                return v2;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final Object k(Object object0, @l o o0) {
        L.p(o0, "operation");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, ((long)arr_v[v1]));
        }
        return object0;
    }

    public final Object l(Object object0, @l p p0) {
        L.p(p0, "operation");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, ((long)arr_v[v1]));
        }
        return object0;
    }

    public final Object m(Object object0, @l o o0) {
        L.p(o0, "operation");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            object0 = o0.invoke(((long)arr_v[v]), object0);
        }
        return object0;
    }

    public final Object n(Object object0, @l p p0) {
        L.p(p0, "operation");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            object0 = p0.invoke(v, ((long)arr_v[v]), object0);
        }
        return object0;
    }

    public final void o(@l Function1 function10) {
        L.p(function10, "block");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(((long)arr_v[v1]));
        }
    }

    public final void p(@l o o0) {
        L.p(o0, "block");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, ((long)arr_v[v1]));
        }
    }

    public final void q(@l Function1 function10) {
        L.p(function10, "block");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            function10.invoke(((long)arr_v[v]));
        }
    }

    public final void r(@l o o0) {
        L.p(o0, "block");
        long[] arr_v = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            o0.invoke(v, ((long)arr_v[v]));
        }
    }

    public final long s(@IntRange(from = 0L) int v) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
        }
        return this.a[v];
    }

    @b0
    public static void t() {
    }

    @Override
    @l
    public String toString() {
        return LongList.P(this, null, "[", "]", 0, null, 25, null);
    }

    @l
    public final kotlin.ranges.l u() {
        return s.W1(0, this.b);
    }

    @IntRange(from = -1L)
    public final int v() {
        return this.b - 1;
    }

    @IntRange(from = 0L)
    public final int w() {
        return this.b;
    }

    @b0
    public static void x() {
    }

    public final int y(long v) {
        long[] arr_v = this.a;
        int v1 = this.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v == arr_v[v2]) {
                return v2;
            }
        }
        return -1;
    }

    public final int z(@l Function1 function10) {
        L.p(function10, "predicate");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((long)arr_v[v1]))).booleanValue()) {
                return v1;
            }
        }
        return -1;
    }
}

