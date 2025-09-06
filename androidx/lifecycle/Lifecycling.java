package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import z3.n;

@RestrictTo({Scope.c})
public final class Lifecycling {
    @l
    public static final Lifecycling a = null;
    private static final int b = 1;
    private static final int c = 2;
    @l
    private static final Map d;
    @l
    private static final Map e;

    static {
        Lifecycling.a = new Lifecycling();
        Lifecycling.d = new HashMap();
        Lifecycling.e = new HashMap();
    }

    private final GeneratedAdapter a(Constructor constructor0, Object object0) {
        try {
            Object object1 = constructor0.newInstance(object0);
            L.o(object1, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter)object1;
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    private final Constructor b(Class class0) {
        try {
            Package package0 = class0.getPackage();
            String s = class0.getCanonicalName();
            String s1 = package0 == null ? "" : package0.getName();
            L.o(s1, "fullPackage");
            if(s1.length() != 0) {
                L.o(s, "name");
                s = s.substring(s1.length() + 1);
                L.o(s, "this as java.lang.String).substring(startIndex)");
            }
            L.o(s, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String s2 = Lifecycling.c(s);
            if(s1.length() != 0) {
                s2 = s1 + '.' + s2;
            }
            Class class1 = Class.forName(s2);
            L.n(class1, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor constructor0 = class1.getDeclaredConstructor(class0);
            if(!constructor0.isAccessible()) {
                constructor0.setAccessible(true);
                return constructor0;
            }
            return constructor0;
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        return null;
    }

    @l
    @n
    public static final String c(@l String s) {
        L.p(s, "className");
        return v.l2(s, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class class0) {
        Map map0 = Lifecycling.d;
        Integer integer0 = (Integer)map0.get(class0);
        if(integer0 != null) {
            return (int)integer0;
        }
        int v = this.g(class0);
        map0.put(class0, v);
        return v;
    }

    private final boolean e(Class class0) {
        return class0 != null && LifecycleObserver.class.isAssignableFrom(class0);
    }

    @l
    @n
    public static final LifecycleEventObserver f(@l Object object0) {
        L.p(object0, "object");
        if(object0 instanceof LifecycleEventObserver && object0 instanceof DefaultLifecycleObserver) {
            return new DefaultLifecycleObserverAdapter(((DefaultLifecycleObserver)object0), ((LifecycleEventObserver)object0));
        }
        if(object0 instanceof DefaultLifecycleObserver) {
            return new DefaultLifecycleObserverAdapter(((DefaultLifecycleObserver)object0), null);
        }
        if(object0 instanceof LifecycleEventObserver) {
            return (LifecycleEventObserver)object0;
        }
        Class class0 = object0.getClass();
        Lifecycling lifecycling0 = Lifecycling.a;
        if(lifecycling0.d(class0) == 2) {
            Object object1 = Lifecycling.e.get(class0);
            L.m(object1);
            if(((List)object1).size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling0.a(((Constructor)((List)object1).get(0)), object0));
            }
            int v1 = ((List)object1).size();
            GeneratedAdapter[] arr_generatedAdapter = new GeneratedAdapter[v1];
            for(int v = 0; v < v1; ++v) {
                Constructor constructor0 = (Constructor)((List)object1).get(v);
                arr_generatedAdapter[v] = Lifecycling.a.a(constructor0, object0);
            }
            return new CompositeGeneratedAdaptersObserver(arr_generatedAdapter);
        }
        return new ReflectiveGenericLifecycleObserver(object0);
    }

    private final int g(Class class0) {
        ArrayList arrayList0;
        if(class0.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructor0 = this.b(class0);
        if(constructor0 != null) {
            List list0 = u.k(constructor0);
            Lifecycling.e.put(class0, list0);
            return 2;
        }
        if(ClassesInfoCache.c.d(class0)) {
            return 1;
        }
        Class class1 = class0.getSuperclass();
        if(this.e(class1)) {
            L.o(class1, "superclass");
            if(this.d(class1) == 1) {
                return 1;
            }
            Object object0 = Lifecycling.e.get(class1);
            L.m(object0);
            arrayList0 = new ArrayList(((Collection)object0));
        }
        else {
            arrayList0 = null;
        }
        Class[] arr_class = class0.getInterfaces();
        L.o(arr_class, "klass.interfaces");
        for(int v = 0; v < arr_class.length; ++v) {
            Class class2 = arr_class[v];
            if(this.e(class2)) {
                L.o(class2, "intrface");
                if(this.d(class2) == 1) {
                    return 1;
                }
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                Object object1 = Lifecycling.e.get(class2);
                L.m(object1);
                arrayList0.addAll(((Collection)object1));
            }
        }
        if(arrayList0 != null) {
            Lifecycling.e.put(class0, arrayList0);
            return 2;
        }
        return 1;
    }
}

