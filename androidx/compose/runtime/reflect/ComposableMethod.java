package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1549#2:220\n1620#2,3:221\n1804#2,4:224\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n143#1:220\n143#1:221,3\n144#1:224,4\n*E\n"})
public final class ComposableMethod {
    @l
    private final Method a;
    @l
    private final ComposableInfo b;
    public static final int c = 8;

    static {
    }

    public ComposableMethod(@l Method method0, @l ComposableInfo composableInfo0) {
        L.p(method0, "method");
        L.p(composableInfo0, "composableInfo");
        super();
        this.a = method0;
        this.b = composableInfo0;
    }

    @l
    public final Method a() {
        return this.a;
    }

    public final int b() {
        return this.b.i();
    }

    @l
    public final Class[] c() {
        Class[] arr_class = this.a.getParameterTypes();
        L.o(arr_class, "method.parameterTypes");
        return (Class[])kotlin.collections.l.l1(arr_class, 0, this.b.i());
    }

    @l
    public final Parameter[] d() {
        Parameter[] arr_parameter = this.a.getParameters();
        L.o(arr_parameter, "method.parameters");
        return (Parameter[])kotlin.collections.l.l1(arr_parameter, 0, this.b.i());
    }

    @m
    public final Object e(@l Composer composer0, @m Object object0, @l Object[] arr_object) {
        Object object2;
        L.p(composer0, "composer");
        L.p(arr_object, "args");
        int v = this.b.b();
        int v1 = this.b.d();
        Class[] arr_class = this.a.getParameterTypes();
        int v2 = this.b.c() + (v + 1);
        Integer[] arr_integer = new Integer[v1];
        for(int v4 = 0; v4 < v1; ++v4) {
            kotlin.ranges.l l0 = s.W1(v4 * 0x1F, Math.min(v4 * 0x1F + 0x1F, v));
            ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                int v5 = ((T)iterator0).b();
                arrayList0.add(((int)(v5 >= arr_object.length || arr_object[v5] == null ? 1 : 0)));
            }
            int v6 = 0;
            int v7 = 0;
            for(Object object1: arrayList0) {
                if(v7 < 0) {
                    u.Z();
                }
                v6 |= ((Number)object1).intValue() << v7;
                ++v7;
            }
            arr_integer[v4] = v6;
        }
        Object[] arr_object1 = new Object[arr_class.length];
        for(int v3 = 0; v3 < arr_class.length; ++v3) {
            if(v3 < 0 || v3 >= v) {
                if(v3 == v) {
                    object2 = composer0;
                }
                else if(v3 == v + 1 || v + 2 <= v3 && v3 < v2) {
                    object2 = 0;
                }
                else {
                    if(v2 > v3 || v3 >= arr_class.length) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    object2 = arr_integer[v3 - v2];
                }
            }
            else if(v3 < 0 || v3 > kotlin.collections.l.we(arr_object)) {
                Class class0 = this.a.getParameterTypes()[v3];
                L.o(class0, "method.parameterTypes[idx]");
                object2 = ComposableMethodKt.h(class0);
            }
            else {
                object2 = arr_object[v3];
            }
            arr_object1[v3] = object2;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object1, arr_class.length);
        return this.a.invoke(object0, arr_object2);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof ComposableMethod ? L.g(this.a, ((ComposableMethod)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

