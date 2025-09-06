package kotlin.jvm.internal;

import A3.a;
import A3.o;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.k;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n*E\n"})
@i(name = "CollectionToArray")
public final class v {
    @l
    private static final Object[] a = null;
    private static final int b = 0x7FFFFFFD;

    static {
        v.a = new Object[0];
    }

    @k(message = "This function will be made internal in a future release")
    @kotlin.l(warningSince = "1.9")
    @l
    @i(name = "toArray")
    public static final Object[] a(@l Collection collection0) {
        L.p(collection0, "collection");
        int v = collection0.size();
        if(v != 0) {
            Iterator iterator0 = collection0.iterator();
            if(iterator0.hasNext()) {
                Object[] arr_object = new Object[v];
                for(int v1 = 0; true; ++v1) {
                    Object object0 = iterator0.next();
                    arr_object[v1] = object0;
                    if(v1 + 1 >= arr_object.length) {
                        if(!iterator0.hasNext()) {
                            return arr_object;
                        }
                        int v2 = (v1 + 1) * 3 + 1 >>> 1;
                        if(v2 <= v1 + 1 && v1 + 1 >= 0x7FFFFFFD) {
                            throw new OutOfMemoryError();
                        }
                        arr_object = Arrays.copyOf(arr_object, v2);
                        L.o(arr_object, "copyOf(...)");
                    }
                    else if(!iterator0.hasNext()) {
                        Object[] arr_object1 = Arrays.copyOf(arr_object, v1 + 1);
                        L.o(arr_object1, "copyOf(...)");
                        return arr_object1;
                    }
                }
            }
        }
        return v.a;
    }

    @k(message = "This function will be made internal in a future release")
    @kotlin.l(warningSince = "1.9")
    @l
    @i(name = "toArray")
    public static final Object[] b(@l Collection collection0, @m Object[] arr_object) {
        Object[] arr_object1;
        L.p(collection0, "collection");
        arr_object.getClass();
        int v = collection0.size();
        if(v == 0) {
            if(arr_object.length <= 0) {
                return arr_object;
            }
            arr_object[0] = null;
            return arr_object;
        }
        Iterator iterator0 = collection0.iterator();
        if(!iterator0.hasNext()) {
            if(arr_object.length <= 0) {
                return arr_object;
            }
            arr_object[0] = null;
            return arr_object;
        }
        if(v <= arr_object.length) {
            arr_object1 = arr_object;
        }
        else {
            Object object0 = Array.newInstance(arr_object.getClass().getComponentType(), v);
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object1 = (Object[])object0;
        }
        for(int v1 = 0; true; ++v1) {
            Object object1 = iterator0.next();
            arr_object1[v1] = object1;
            if(v1 + 1 >= arr_object1.length) {
                if(!iterator0.hasNext()) {
                    return arr_object1;
                }
                int v2 = (v1 + 1) * 3 + 1 >>> 1;
                if(v2 <= v1 + 1 && v1 + 1 >= 0x7FFFFFFD) {
                    throw new OutOfMemoryError();
                }
                arr_object1 = Arrays.copyOf(arr_object1, v2);
                L.o(arr_object1, "copyOf(...)");
            }
            else if(!iterator0.hasNext()) {
                if(arr_object1 == arr_object) {
                    arr_object[v1 + 1] = null;
                    return arr_object;
                }
                arr_object = Arrays.copyOf(arr_object1, v1 + 1);
                L.o(arr_object, "copyOf(...)");
                return arr_object;
            }
        }
    }

    private static final Object[] c(Collection collection0, a a0, Function1 function10, o o0) {
        int v = collection0.size();
        if(v == 0) {
            return (Object[])a0.invoke();
        }
        Iterator iterator0 = collection0.iterator();
        if(!iterator0.hasNext()) {
            return (Object[])a0.invoke();
        }
        Object[] arr_object = (Object[])function10.invoke(v);
        for(int v1 = 0; true; ++v1) {
            Object object0 = iterator0.next();
            arr_object[v1] = object0;
            if(v1 + 1 >= arr_object.length) {
                if(!iterator0.hasNext()) {
                    return arr_object;
                }
                int v2 = (v1 + 1) * 3 + 1 >>> 1;
                if(v2 <= v1 + 1 && v1 + 1 >= 0x7FFFFFFD) {
                    throw new OutOfMemoryError();
                }
                arr_object = Arrays.copyOf(arr_object, v2);
                L.o(arr_object, "copyOf(...)");
            }
            else if(!iterator0.hasNext()) {
                return (Object[])o0.invoke(arr_object, ((int)(v1 + 1)));
            }
        }
    }
}

