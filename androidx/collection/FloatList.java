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

@s0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class FloatList {
    @l
    @f
    public float[] a;
    @f
    public int b;

    private FloatList(int v) {
        this.a = v == 0 ? FloatSetKt.g() : new float[v];
    }

    public FloatList(int v, w w0) {
        this(v);
    }

    public final int A(@l Function1 function10) {
        L.p(function10, "predicate");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
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
        return FloatList.P(this, null, null, null, 0, null, 0x1F, null);
    }

    @l
    @j
    public final String E(@l CharSequence charSequence0) {
        L.p(charSequence0, "separator");
        return FloatList.P(this, charSequence0, null, null, 0, null, 30, null);
    }

    @l
    @j
    public final String F(@l CharSequence charSequence0, @l CharSequence charSequence1) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        return FloatList.P(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @l
    @j
    public final String G(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return FloatList.P(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @l
    @j
    public final String H(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return FloatList.P(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
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
        float[] arr_f = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            float f = arr_f[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(f);
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
        float[] arr_f = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            float f = arr_f[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
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
        float[] arr_f = this.a;
        int v1 = this.b;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            float f = arr_f[v2];
            if(v2 == v) {
                stringBuilder0.append("...");
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
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
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append(charSequence2);
                break;
            }
            float f = arr_f[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
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
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            float f = arr_f[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
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
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            float f = arr_f[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
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
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            float f = arr_f[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String P(FloatList floatList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return floatList0.I(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3);
    }

    public static String Q(FloatList floatList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        float[] arr_f = floatList0.a;
        int v2 = floatList0.b;
        for(int v3 = 0; true; ++v3) {
            if(v3 >= v2) {
                stringBuilder0.append(charSequence2);
                break;
            }
            float f = arr_f[v3];
            if(v3 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v3 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(f)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final float R() {
        if(this.B()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final float S(@l Function1 function10) {
        L.p(function10, "predicate");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final int T(float f) {
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(arr_f[v] == f) {
                return v;
            }
        }
        return -1;
    }

    public final boolean U() {
        return this.B();
    }

    public final boolean V(@l Function1 function10) {
        L.p(function10, "predicate");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
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
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((float)arr_f[v1]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(float f) {
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_f[v1] == f) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@l FloatList floatList0) {
        L.p(floatList0, "elements");
        kotlin.ranges.l l0 = s.W1(0, floatList0.b);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                if(!this.c(floatList0.s(v))) {
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
        if(object0 instanceof FloatList) {
            int v = this.b;
            if(((FloatList)object0).b == v) {
                float[] arr_f = this.a;
                float[] arr_f1 = ((FloatList)object0).a;
                kotlin.ranges.l l0 = s.W1(0, v);
                int v1 = l0.g();
                int v2 = l0.h();
                if(v1 <= v2) {
                    while(arr_f[v1] == arr_f1[v1]) {
                        if(v1 == v2) {
                            return true;
                        }
                        ++v1;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int f(@l Function1 function10) {
        L.p(function10, "predicate");
        float[] arr_f = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((float)arr_f[v1]))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    public final float g(@IntRange(from = 0L) int v) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
        }
        return this.a[v];
    }

    public final float h(@IntRange(from = 0L) int v, @l Function1 function10) {
        L.p(function10, "defaultValue");
        return v < 0 || v >= this.b ? ((Number)function10.invoke(v)).floatValue() : this.a[v];
    }

    @Override
    public int hashCode() {
        float[] arr_f = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += Float.floatToIntBits(arr_f[v1]) * 0x1F;
        }
        return v2;
    }

    public final float i() {
        if(this.B()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.a[0];
    }

    public final float j(@l Function1 function10) {
        L.p(function10, "predicate");
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            float f = arr_f[v1];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final Object k(Object object0, @l o o0) {
        L.p(o0, "operation");
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, ((float)arr_f[v1]));
        }
        return object0;
    }

    public final Object l(Object object0, @l p p0) {
        L.p(p0, "operation");
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, ((float)arr_f[v1]));
        }
        return object0;
    }

    public final Object m(Object object0, @l o o0) {
        L.p(o0, "operation");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            object0 = o0.invoke(((float)arr_f[v]), object0);
        }
        return object0;
    }

    public final Object n(Object object0, @l p p0) {
        L.p(p0, "operation");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            object0 = p0.invoke(v, ((float)arr_f[v]), object0);
        }
        return object0;
    }

    public final void o(@l Function1 function10) {
        L.p(function10, "block");
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(((float)arr_f[v1]));
        }
    }

    public final void p(@l o o0) {
        L.p(o0, "block");
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, ((float)arr_f[v1]));
        }
    }

    public final void q(@l Function1 function10) {
        L.p(function10, "block");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            function10.invoke(((float)arr_f[v]));
        }
    }

    public final void r(@l o o0) {
        L.p(o0, "block");
        float[] arr_f = this.a;
        for(int v = this.b - 1; -1 < v; --v) {
            o0.invoke(v, ((float)arr_f[v]));
        }
    }

    public final float s(@IntRange(from = 0L) int v) {
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
        return FloatList.P(this, null, "[", "]", 0, null, 25, null);
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

    public final int y(float f) {
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(f == arr_f[v1]) {
                return v1;
            }
        }
        return -1;
    }

    public final int z(@l Function1 function10) {
        L.p(function10, "predicate");
        float[] arr_f = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((float)arr_f[v1]))).booleanValue()) {
                return v1;
            }
        }
        return -1;
    }
}

