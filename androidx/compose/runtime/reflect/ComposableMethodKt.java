package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,219:1\n185#1:232\n185#1:239\n185#1:246\n1735#2,6:220\n1549#3:226\n1620#3,3:227\n1549#3:233\n1620#3,3:234\n1549#3:240\n1620#3,3:241\n1549#3:247\n1620#3,3:248\n37#4,2:230\n37#4,2:237\n37#4,2:244\n37#4,2:251\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n201#1:232\n210#1:239\n211#1:246\n57#1:220,6\n185#1:226\n185#1:227,3\n201#1:233\n201#1:234,3\n210#1:240\n210#1:241,3\n211#1:247\n211#1:248,3\n185#1:230,2\n201#1:237,2\n210#1:244,2\n211#1:251,2\n*E\n"})
public final class ComposableMethodKt {
    private static final int a = 0x1F;

    @m
    public static final ComposableMethod b(@l Method method0) {
        L.p(method0, "<this>");
        ComposableInfo composableInfo0 = ComposableMethodKt.f(method0);
        return composableInfo0.j() ? new ComposableMethod(method0, composableInfo0) : null;
    }

    private static final int c(int v, int v1) {
        return v == 0 ? 1 : ((int)Math.ceil(((double)(v + v1)) / 10.0));
    }

    private static final int d(int v) {
        return (int)Math.ceil(((double)v) / 31.0);
    }

    private static final Object[] e(Object object0, int v) {
        kotlin.ranges.l l0 = s.W1(0, v);
        ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            ((T)iterator0).b();
            arrayList0.add(object0);
        }
        L.y(0, "T?");
        return arrayList0.toArray(new Object[0]);
    }

    private static final ComposableInfo f(Method method0) {
        Class[] arr_class = method0.getParameterTypes();
        L.o(arr_class, "parameterTypes");
        int v = arr_class.length - 1;
        if(v >= 0) {
            while(!L.g(arr_class[v], Composer.class)) {
                if(v - 1 < 0) {
                    goto label_9;
                }
                --v;
            }
        }
        else {
        label_9:
            v = -1;
        }
        boolean z = false;
        if(v == -1) {
            return new ComposableInfo(false, method0.getParameterTypes().length, 0, 0);
        }
        int v1 = ComposableMethodKt.c(v, !Modifier.isStatic(method0.getModifiers()));
        int v2 = v + 1 + v1;
        Class[] arr_class1 = method0.getParameterTypes();
        int v3 = arr_class1.length == v2 ? 0 : ComposableMethodKt.d(v);
        if(v2 + v3 == arr_class1.length) {
            z = true;
        }
        return new ComposableInfo(z, v, v1, v3);
    }

    @l
    public static final ComposableMethod g(@l Class class0, @l String s, @l Class[] arr_class) throws NoSuchMethodException {
        Method method0;
        Class class1 = Composer.class;
        L.p(class0, "<this>");
        L.p(s, "methodName");
        L.p(arr_class, "args");
        int v = ComposableMethodKt.c(arr_class.length, 0);
        try {
            t0 t00 = new t0(3);
            t00.b(arr_class);
            t00.a(class1);
            Class class2 = Integer.TYPE;
            kotlin.ranges.l l0 = s.W1(0, v);
            ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                ((T)iterator0).b();
                arrayList0.add(class2);
            }
            t00.b(arrayList0.toArray(new Class[0]));
            method0 = class0.getDeclaredMethod(s, ((Class[])t00.d(new Class[t00.c()])));
        }
        catch(ReflectiveOperationException unused_ex) {
            try {
                int v1 = ComposableMethodKt.d(arr_class.length);
                t0 t01 = new t0(4);
                t01.b(arr_class);
                t01.a(class1);
                Class class3 = Integer.TYPE;
                kotlin.ranges.l l1 = s.W1(0, v);
                ArrayList arrayList1 = new ArrayList(u.b0(l1, 10));
                Iterator iterator1 = l1.iterator();
                while(iterator1.hasNext()) {
                    ((T)iterator1).b();
                    arrayList1.add(class3);
                }
                t01.b(arrayList1.toArray(new Class[0]));
                Class class4 = Integer.TYPE;
                kotlin.ranges.l l2 = s.W1(0, v1);
                ArrayList arrayList2 = new ArrayList(u.b0(l2, 10));
                Iterator iterator2 = l2.iterator();
                while(iterator2.hasNext()) {
                    ((T)iterator2).b();
                    arrayList2.add(class4);
                }
                t01.b(arrayList2.toArray(new Class[0]));
                method0 = class0.getDeclaredMethod(s, ((Class[])t01.d(new Class[t01.c()])));
            }
            catch(ReflectiveOperationException unused_ex) {
                method0 = null;
            }
        }
        if(method0 == null) {
            throw new NoSuchMethodException(class0.getName() + '.' + s);
        }
        ComposableMethod composableMethod0 = ComposableMethodKt.b(method0);
        L.m(composableMethod0);
        return composableMethod0;
    }

    private static final Object h(Class class0) {
        switch(class0.getName()) {
            case "boolean": {
                return false;
            }
            case "byte": {
                return (byte)0;
            }
            case "char": {
                return Character.valueOf('\u0000');
            }
            case "double": {
                return 0.0;
            }
            case "float": {
                return 0.0f;
            }
            case "int": {
                return 0;
            }
            case "long": {
                return 0L;
            }
            case "short": {
                return (short)0;
            }
            default: {
                return null;
            }
        }
    }
}

