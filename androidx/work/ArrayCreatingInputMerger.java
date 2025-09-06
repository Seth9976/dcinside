package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class ArrayCreatingInputMerger extends InputMerger {
    @Override  // androidx.work.InputMerger
    @l
    public Data a(@l List list0) {
        L.p(list0, "inputs");
        Builder data$Builder0 = new Builder();
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            for(Object object1: ((Data)object0).m().entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                Object object2 = ((Map.Entry)object1).getValue();
                Class class0 = object2 == null ? String.class : object2.getClass();
                Object object3 = hashMap0.get(s);
                if(object3 != null) {
                    Class class1 = object3.getClass();
                    if(L.g(class1, class0)) {
                        L.n(object2, "null cannot be cast to non-null type kotlin.Any");
                        object2 = this.c(object3, object2);
                    }
                    else {
                        if(!L.g(class1.getComponentType(), class0)) {
                            throw new IllegalArgumentException();
                        }
                        object2 = this.b(object3, object2, class0);
                    }
                }
                else if(class0.isArray()) {
                    L.n(object2, "null cannot be cast to non-null type kotlin.Any");
                }
                else {
                    object2 = this.d(object2, class0);
                }
                hashMap0.put(s, object2);
            }
        }
        data$Builder0.d(hashMap0);
        return data$Builder0.a();
    }

    private final Object b(Object object0, Object object1, Class class0) {
        int v = Array.getLength(object0);
        Object object2 = Array.newInstance(class0, v + 1);
        System.arraycopy(object0, 0, object2, 0, v);
        Array.set(object2, v, object1);
        L.o(object2, "newArray");
        return object2;
    }

    private final Object c(Object object0, Object object1) {
        int v = Array.getLength(object0);
        int v1 = Array.getLength(object1);
        Class class0 = object0.getClass().getComponentType();
        L.m(class0);
        Object object2 = Array.newInstance(class0, v + v1);
        System.arraycopy(object0, 0, object2, 0, v);
        System.arraycopy(object1, 0, object2, v, v1);
        L.o(object2, "newArray");
        return object2;
    }

    private final Object d(Object object0, Class class0) {
        Object object1 = Array.newInstance(class0, 1);
        Array.set(object1, 0, object0);
        L.o(object1, "newArray");
        return object1;
    }
}

