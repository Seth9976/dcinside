package org.mp4parser.aj.lang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Aspects {
    private static final String ASPECTOF = "aspectOf";
    private static final Class[] EMPTY_CLASS_ARRAY = null;
    private static final Object[] EMPTY_OBJECT_ARRAY = null;
    private static final String HASASPECT = "hasAspect";
    private static final Class[] PEROBJECT_CLASS_ARRAY;
    private static final Class[] PERTYPEWITHIN_CLASS_ARRAY;

    static {
        Aspects.EMPTY_CLASS_ARRAY = new Class[0];
        Aspects.PEROBJECT_CLASS_ARRAY = new Class[]{Object.class};
        Aspects.PERTYPEWITHIN_CLASS_ARRAY = new Class[]{Class.class};
        Aspects.EMPTY_OBJECT_ARRAY = new Object[0];
    }

    public static Object aspectOf(Class class0) throws NoAspectBoundException {
        try {
            return Aspects.getSingletonOrThreadAspectOf(class0).invoke(null, Aspects.EMPTY_OBJECT_ARRAY);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new NoAspectBoundException(class0.getName(), invocationTargetException0);
        }
        catch(Exception exception0) {
            throw new NoAspectBoundException(class0.getName(), exception0);
        }
    }

    public static Object aspectOf(Class class0, Class class1) throws NoAspectBoundException {
        try {
            return Aspects.getPerTypeWithinAspectOf(class0).invoke(null, class1);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new NoAspectBoundException(class0.getName(), invocationTargetException0);
        }
        catch(Exception exception0) {
            throw new NoAspectBoundException(class0.getName(), exception0);
        }
    }

    public static Object aspectOf(Class class0, Object object0) throws NoAspectBoundException {
        try {
            return Aspects.getPerObjectAspectOf(class0).invoke(null, object0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new NoAspectBoundException(class0.getName(), invocationTargetException0);
        }
        catch(Exception exception0) {
            throw new NoAspectBoundException(class0.getName(), exception0);
        }
    }

    private static Method checkAspectOf(Method method0, Class class0) throws NoSuchMethodException {
        method0.setAccessible(true);
        if(!method0.isAccessible() || !Modifier.isPublic(method0.getModifiers()) || !Modifier.isStatic(method0.getModifiers())) {
            throw new NoSuchMethodException(class0.getName() + ".aspectOf(..) is not accessible public static");
        }
        return method0;
    }

    private static Method checkHasAspect(Method method0, Class class0) throws NoSuchMethodException {
        method0.setAccessible(true);
        if(!method0.isAccessible() || !Modifier.isPublic(method0.getModifiers()) || !Modifier.isStatic(method0.getModifiers())) {
            throw new NoSuchMethodException(class0.getName() + ".hasAspect(..) is not accessible public static");
        }
        return method0;
    }

    private static Method getPerObjectAspectOf(Class class0) throws NoSuchMethodException {
        return Aspects.checkAspectOf(class0.getDeclaredMethod("aspectOf", Aspects.PEROBJECT_CLASS_ARRAY), class0);
    }

    private static Method getPerObjectHasAspect(Class class0) throws NoSuchMethodException {
        return Aspects.checkHasAspect(class0.getDeclaredMethod("hasAspect", Aspects.PEROBJECT_CLASS_ARRAY), class0);
    }

    private static Method getPerTypeWithinAspectOf(Class class0) throws NoSuchMethodException {
        return Aspects.checkAspectOf(class0.getDeclaredMethod("aspectOf", Aspects.PERTYPEWITHIN_CLASS_ARRAY), class0);
    }

    private static Method getPerTypeWithinHasAspect(Class class0) throws NoSuchMethodException {
        return Aspects.checkHasAspect(class0.getDeclaredMethod("hasAspect", Aspects.PERTYPEWITHIN_CLASS_ARRAY), class0);
    }

    private static Method getSingletonOrThreadAspectOf(Class class0) throws NoSuchMethodException {
        return Aspects.checkAspectOf(class0.getDeclaredMethod("aspectOf", Aspects.EMPTY_CLASS_ARRAY), class0);
    }

    private static Method getSingletonOrThreadHasAspect(Class class0) throws NoSuchMethodException {
        return Aspects.checkHasAspect(class0.getDeclaredMethod("hasAspect", Aspects.EMPTY_CLASS_ARRAY), class0);
    }

    public static boolean hasAspect(Class class0) throws NoAspectBoundException {
        try {
            return ((Boolean)Aspects.getSingletonOrThreadHasAspect(class0).invoke(null, Aspects.EMPTY_OBJECT_ARRAY)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static boolean hasAspect(Class class0, Class class1) throws NoAspectBoundException {
        try {
            return ((Boolean)Aspects.getPerTypeWithinHasAspect(class0).invoke(null, class1)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static boolean hasAspect(Class class0, Object object0) throws NoAspectBoundException {
        try {
            return ((Boolean)Aspects.getPerObjectHasAspect(class0).invoke(null, object0)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }
}

