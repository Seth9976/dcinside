package org.mp4parser.aj.lang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Aspects14 {
    private static final String ASPECTOF = "aspectOf";
    private static final Class[] EMPTY_CLASS_ARRAY = null;
    private static final Object[] EMPTY_OBJECT_ARRAY = null;
    private static final String HASASPECT = "hasAspect";
    private static final Class[] PEROBJECT_CLASS_ARRAY;
    private static final Class[] PERTYPEWITHIN_CLASS_ARRAY;
    static Class class$java$lang$Class;
    static Class class$java$lang$Object;

    static {
        Aspects14.EMPTY_CLASS_ARRAY = new Class[0];
        Class class0 = Aspects14.class$java$lang$Object;
        if(class0 == null) {
            class0 = Aspects14.class$("java.lang.Object");
            Aspects14.class$java$lang$Object = class0;
        }
        Aspects14.PEROBJECT_CLASS_ARRAY = new Class[]{class0};
        Class class1 = Aspects14.class$java$lang$Class;
        if(class1 == null) {
            class1 = Aspects14.class$("java.lang.Class");
            Aspects14.class$java$lang$Class = class1;
        }
        Aspects14.PERTYPEWITHIN_CLASS_ARRAY = new Class[]{class1};
        Aspects14.EMPTY_OBJECT_ARRAY = new Object[0];
    }

    public static Object aspectOf(Class class0) throws NoAspectBoundException {
        try {
            return Aspects14.getSingletonOrThreadAspectOf(class0).invoke(null, Aspects14.EMPTY_OBJECT_ARRAY);
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
            return Aspects14.getPerTypeWithinAspectOf(class0).invoke(null, class1);
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
            return Aspects14.getPerObjectAspectOf(class0).invoke(null, object0);
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

    static Class class$(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new NoClassDefFoundError(classNotFoundException0.getMessage());
        }
    }

    private static Method getPerObjectAspectOf(Class class0) throws NoSuchMethodException {
        return Aspects14.checkAspectOf(class0.getDeclaredMethod("aspectOf", Aspects14.PEROBJECT_CLASS_ARRAY), class0);
    }

    private static Method getPerObjectHasAspect(Class class0) throws NoSuchMethodException {
        return Aspects14.checkHasAspect(class0.getDeclaredMethod("hasAspect", Aspects14.PEROBJECT_CLASS_ARRAY), class0);
    }

    private static Method getPerTypeWithinAspectOf(Class class0) throws NoSuchMethodException {
        return Aspects14.checkAspectOf(class0.getDeclaredMethod("aspectOf", Aspects14.PERTYPEWITHIN_CLASS_ARRAY), class0);
    }

    private static Method getPerTypeWithinHasAspect(Class class0) throws NoSuchMethodException {
        return Aspects14.checkHasAspect(class0.getDeclaredMethod("hasAspect", Aspects14.PERTYPEWITHIN_CLASS_ARRAY), class0);
    }

    private static Method getSingletonOrThreadAspectOf(Class class0) throws NoSuchMethodException {
        return Aspects14.checkAspectOf(class0.getDeclaredMethod("aspectOf", Aspects14.EMPTY_CLASS_ARRAY), class0);
    }

    private static Method getSingletonOrThreadHasAspect(Class class0) throws NoSuchMethodException {
        return Aspects14.checkHasAspect(class0.getDeclaredMethod("hasAspect", Aspects14.EMPTY_CLASS_ARRAY), class0);
    }

    public static boolean hasAspect(Class class0) throws NoAspectBoundException {
        try {
            return ((Boolean)Aspects14.getSingletonOrThreadHasAspect(class0).invoke(null, Aspects14.EMPTY_OBJECT_ARRAY)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static boolean hasAspect(Class class0, Class class1) throws NoAspectBoundException {
        try {
            return ((Boolean)Aspects14.getPerTypeWithinHasAspect(class0).invoke(null, class1)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static boolean hasAspect(Class class0, Object object0) throws NoAspectBoundException {
        try {
            return ((Boolean)Aspects14.getPerObjectHasAspect(class0).invoke(null, object0)).booleanValue();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }
}

