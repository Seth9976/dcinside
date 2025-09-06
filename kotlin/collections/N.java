package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.A0;
import kotlin.E0;
import kotlin.I0;
import kotlin.O0;
import kotlin.V;
import kotlin.b0;
import kotlin.collections.unsigned.a;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.s;
import z3.i;

@s0({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
class n extends m {
    @b0
    @h0(version = "1.3")
    @i(name = "contentDeepEquals")
    public static boolean g(@y4.m Object[] arr_object, @y4.m Object[] arr_object1) {
        if(arr_object == arr_object1) {
            return true;
        }
        if(arr_object != null && arr_object1 != null && arr_object.length == arr_object1.length) {
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                Object object1 = arr_object1[v];
                if(object0 != object1) {
                    if(object0 == null || object1 == null) {
                        return false;
                    }
                    if(object0 instanceof Object[] && object1 instanceof Object[]) {
                        if(!l.g(((Object[])object0), ((Object[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof byte[] && object1 instanceof byte[]) {
                        if(!Arrays.equals(((byte[])object0), ((byte[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof short[] && object1 instanceof short[]) {
                        if(!Arrays.equals(((short[])object0), ((short[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof int[] && object1 instanceof int[]) {
                        if(!Arrays.equals(((int[])object0), ((int[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof long[] && object1 instanceof long[]) {
                        if(!Arrays.equals(((long[])object0), ((long[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof float[] && object1 instanceof float[]) {
                        if(!Arrays.equals(((float[])object0), ((float[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof double[] && object1 instanceof double[]) {
                        if(!Arrays.equals(((double[])object0), ((double[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof char[] && object1 instanceof char[]) {
                        if(!Arrays.equals(((char[])object0), ((char[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof boolean[] && object1 instanceof boolean[]) {
                        if(!Arrays.equals(((boolean[])object0), ((boolean[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof A0 && object1 instanceof A0) {
                        if(!a.U0(((A0)object0).x(), ((A0)object1).x())) {
                            return false;
                        }
                    }
                    else if(object0 instanceof O0 && object1 instanceof O0) {
                        if(!a.S0(((O0)object0).x(), ((O0)object1).x())) {
                            return false;
                        }
                    }
                    else if(object0 instanceof E0 && object1 instanceof E0) {
                        if(!a.T0(((E0)object0).x(), ((E0)object1).x())) {
                            return false;
                        }
                    }
                    else if(object0 instanceof I0 && object1 instanceof I0) {
                        if(!a.V0(((I0)object0).x(), ((I0)object1).x())) {
                            return false;
                        }
                    }
                    else if(!L.g(object0, object1)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @b0
    @h0(version = "1.3")
    @y4.l
    @i(name = "contentDeepToString")
    public static final String h(@y4.m Object[] arr_object) {
        if(arr_object == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.B(arr_object.length, 0x19999999) * 5 + 2);
        n.i(arr_object, stringBuilder0, new ArrayList());
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    private static final void i(Object[] arr_object, StringBuilder stringBuilder0, List list0) {
        if(list0.contains(arr_object)) {
            stringBuilder0.append("[...]");
            return;
        }
        list0.add(arr_object);
        stringBuilder0.append('[');
        for(int v = 0; v < arr_object.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = arr_object[v];
            if(object0 == null) {
                stringBuilder0.append("null");
            }
            else if(object0 instanceof Object[]) {
                n.i(((Object[])object0), stringBuilder0, list0);
            }
            else if(object0 instanceof byte[]) {
                String s = Arrays.toString(((byte[])object0));
                L.o(s, "toString(...)");
                stringBuilder0.append(s);
            }
            else if(object0 instanceof short[]) {
                String s1 = Arrays.toString(((short[])object0));
                L.o(s1, "toString(...)");
                stringBuilder0.append(s1);
            }
            else if(object0 instanceof int[]) {
                String s2 = Arrays.toString(((int[])object0));
                L.o(s2, "toString(...)");
                stringBuilder0.append(s2);
            }
            else if(object0 instanceof long[]) {
                String s3 = Arrays.toString(((long[])object0));
                L.o(s3, "toString(...)");
                stringBuilder0.append(s3);
            }
            else if(object0 instanceof float[]) {
                String s4 = Arrays.toString(((float[])object0));
                L.o(s4, "toString(...)");
                stringBuilder0.append(s4);
            }
            else if(object0 instanceof double[]) {
                String s5 = Arrays.toString(((double[])object0));
                L.o(s5, "toString(...)");
                stringBuilder0.append(s5);
            }
            else if(object0 instanceof char[]) {
                String s6 = Arrays.toString(((char[])object0));
                L.o(s6, "toString(...)");
                stringBuilder0.append(s6);
            }
            else if(object0 instanceof boolean[]) {
                String s7 = Arrays.toString(((boolean[])object0));
                L.o(s7, "toString(...)");
                stringBuilder0.append(s7);
            }
            else if(object0 instanceof A0) {
                stringBuilder0.append(a.a1(((A0)object0).x()));
            }
            else if(object0 instanceof O0) {
                stringBuilder0.append(a.c1(((O0)object0).x()));
            }
            else if(object0 instanceof E0) {
                stringBuilder0.append(a.b1(((E0)object0).x()));
            }
            else if(object0 instanceof I0) {
                stringBuilder0.append(a.d1(((I0)object0).x()));
            }
            else {
                stringBuilder0.append(object0.toString());
            }
        }
        stringBuilder0.append(']');
        list0.remove(u.J(list0));
    }

    @y4.l
    public static final List j(@y4.l Object[][] arr2_object) {
        L.p(arr2_object, "<this>");
        int v2 = 0;
        for(int v1 = 0; v1 < arr2_object.length; ++v1) {
            v2 += arr2_object[v1].length;
        }
        List list0 = new ArrayList(v2);
        for(int v = 0; v < arr2_object.length; ++v) {
            u.s0(list0, arr2_object[v]);
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    private static final Object k(Object[] arr_object, A3.a a0) {
        L.p(a0, "defaultValue");
        return arr_object.length == 0 ? a0.invoke() : arr_object;
    }

    @h0(version = "1.3")
    @f
    private static final boolean l(Object[] arr_object) {
        return arr_object == null || arr_object.length == 0;
    }

    @y4.l
    public static final V m(@y4.l V[] arr_v) {
        L.p(arr_v, "<this>");
        ArrayList arrayList0 = new ArrayList(arr_v.length);
        ArrayList arrayList1 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            arrayList0.add(v1.e());
            arrayList1.add(v1.f());
        }
        return r0.a(arrayList0, arrayList1);
    }
}

