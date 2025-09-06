package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.InvocationTargetException;

public class FragmentFactory {
    private static final SimpleArrayMap a;

    static {
        FragmentFactory.a = new SimpleArrayMap();
    }

    @NonNull
    public Fragment a(@NonNull ClassLoader classLoader0, @NonNull String s) {
        try {
            return (Fragment)FragmentFactory.d(classLoader0, s).getConstructor(null).newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    static boolean b(@NonNull ClassLoader classLoader0, @NonNull String s) {
        try {
            Class class0 = FragmentFactory.c(classLoader0, s);
            return Fragment.class.isAssignableFrom(class0);
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    @NonNull
    private static Class c(@NonNull ClassLoader classLoader0, @NonNull String s) throws ClassNotFoundException {
        SimpleArrayMap simpleArrayMap0 = FragmentFactory.a;
        SimpleArrayMap simpleArrayMap1 = (SimpleArrayMap)simpleArrayMap0.get(classLoader0);
        if(simpleArrayMap1 == null) {
            simpleArrayMap1 = new SimpleArrayMap();
            simpleArrayMap0.put(classLoader0, simpleArrayMap1);
        }
        Class class0 = (Class)simpleArrayMap1.get(s);
        if(class0 == null) {
            class0 = Class.forName(s, false, classLoader0);
            simpleArrayMap1.put(s, class0);
        }
        return class0;
    }

    @NonNull
    public static Class d(@NonNull ClassLoader classLoader0, @NonNull String s) {
        try {
            return FragmentFactory.c(classLoader0, s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists", classNotFoundException0);
        }
        catch(ClassCastException classCastException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class is a valid subclass of Fragment", classCastException0);
        }
    }
}

