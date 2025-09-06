package androidx.lifecycle;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@Deprecated
final class ClassesInfoCache {
    @Deprecated
    static class CallbackInfo {
        final Map a;
        final Map b;

        CallbackInfo(Map map0) {
            this.b = map0;
            this.a = new HashMap();
            for(Object object0: map0.entrySet()) {
                Event lifecycle$Event0 = (Event)((Map.Entry)object0).getValue();
                List list0 = (List)this.a.get(lifecycle$Event0);
                if(list0 == null) {
                    list0 = new ArrayList();
                    this.a.put(lifecycle$Event0, list0);
                }
                list0.add(((MethodReference)((Map.Entry)object0).getKey()));
            }
        }

        void a(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0, Object object0) {
            CallbackInfo.b(((List)this.a.get(lifecycle$Event0)), lifecycleOwner0, lifecycle$Event0, object0);
            CallbackInfo.b(((List)this.a.get(Event.ON_ANY)), lifecycleOwner0, lifecycle$Event0, object0);
        }

        private static void b(List list0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0, Object object0) {
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((MethodReference)list0.get(v)).a(lifecycleOwner0, lifecycle$Event0, object0);
                }
            }
        }
    }

    @Deprecated
    static final class MethodReference {
        final int a;
        final Method b;

        MethodReference(int v, Method method0) {
            this.a = v;
            this.b = method0;
            method0.setAccessible(true);
        }

        void a(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0, Object object0) {
            try {
                switch(this.a) {
                    case 0: {
                        this.b.invoke(object0, null);
                        return;
                    }
                    case 1: {
                        this.b.invoke(object0, lifecycleOwner0);
                        return;
                    }
                    case 2: {
                        this.b.invoke(object0, lifecycleOwner0, lifecycle$Event0);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch(InvocationTargetException invocationTargetException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException(illegalAccessException0);
            }
            throw new RuntimeException("Failed to call observer method", invocationTargetException0.getCause());
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof MethodReference ? this.a == ((MethodReference)object0).a && this.b.getName().equals(((MethodReference)object0).b.getName()) : false;
        }

        @Override
        public int hashCode() {
            int v = this.b.getName().hashCode();
            return this.a * 0x1F + v;
        }
    }

    private final Map a;
    private final Map b;
    static ClassesInfoCache c = null;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;

    static {
        ClassesInfoCache.c = new ClassesInfoCache();
    }

    ClassesInfoCache() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    private CallbackInfo a(Class class0, @Nullable Method[] arr_method) {
        int v2;
        Class class1 = class0.getSuperclass();
        HashMap hashMap0 = new HashMap();
        if(class1 != null) {
            CallbackInfo classesInfoCache$CallbackInfo0 = this.c(class1);
            if(classesInfoCache$CallbackInfo0 != null) {
                hashMap0.putAll(classesInfoCache$CallbackInfo0.b);
            }
        }
        Class[] arr_class = class0.getInterfaces();
        for(int v = 0; v < arr_class.length; ++v) {
            for(Object object0: this.c(arr_class[v]).b.entrySet()) {
                this.e(hashMap0, ((MethodReference)((Map.Entry)object0).getKey()), ((Event)((Map.Entry)object0).getValue()), class0);
            }
        }
        if(arr_method == null) {
            arr_method = this.b(class0);
        }
        boolean z = false;
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            Method method0 = arr_method[v1];
            OnLifecycleEvent onLifecycleEvent0 = (OnLifecycleEvent)method0.getAnnotation(OnLifecycleEvent.class);
            if(onLifecycleEvent0 != null) {
                Class[] arr_class1 = method0.getParameterTypes();
                if(arr_class1.length > 0) {
                    if(!LifecycleOwner.class.isAssignableFrom(arr_class1[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    v2 = 1;
                }
                else {
                    v2 = 0;
                }
                Event lifecycle$Event0 = onLifecycleEvent0.value();
                if(arr_class1.length > 1) {
                    if(!Event.class.isAssignableFrom(arr_class1[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if(lifecycle$Event0 != Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    v2 = 2;
                }
                if(arr_class1.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                this.e(hashMap0, new MethodReference(v2, method0), lifecycle$Event0, class0);
                z = true;
            }
        }
        CallbackInfo classesInfoCache$CallbackInfo1 = new CallbackInfo(hashMap0);
        this.a.put(class0, classesInfoCache$CallbackInfo1);
        this.b.put(class0, Boolean.valueOf(z));
        return classesInfoCache$CallbackInfo1;
    }

    private Method[] b(Class class0) {
        try {
            return class0.getDeclaredMethods();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError0);
        }
    }

    CallbackInfo c(Class class0) {
        CallbackInfo classesInfoCache$CallbackInfo0 = (CallbackInfo)this.a.get(class0);
        return classesInfoCache$CallbackInfo0 == null ? this.a(class0, null) : classesInfoCache$CallbackInfo0;
    }

    boolean d(Class class0) {
        Boolean boolean0 = (Boolean)this.b.get(class0);
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        Method[] arr_method = this.b(class0);
        for(int v = 0; v < arr_method.length; ++v) {
            if(((OnLifecycleEvent)arr_method[v].getAnnotation(OnLifecycleEvent.class)) != null) {
                this.a(class0, arr_method);
                return true;
            }
        }
        this.b.put(class0, Boolean.FALSE);
        return false;
    }

    private void e(Map map0, MethodReference classesInfoCache$MethodReference0, Event lifecycle$Event0, Class class0) {
        Event lifecycle$Event1 = (Event)map0.get(classesInfoCache$MethodReference0);
        if(lifecycle$Event1 != null && lifecycle$Event0 != lifecycle$Event1) {
            throw new IllegalArgumentException("Method " + classesInfoCache$MethodReference0.b.getName() + " in " + class0.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lifecycle$Event1 + ", new value " + lifecycle$Event0);
        }
        if(lifecycle$Event1 == null) {
            map0.put(classesInfoCache$MethodReference0, lifecycle$Event0);
        }
    }
}

