package com.unity3d.services.core.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public abstract class GenericListenerProxy implements InvocationHandler {
    public abstract Class getProxyClass() throws ClassNotFoundException;

    public Object getProxyInstance() throws ClassNotFoundException {
        return Proxy.newProxyInstance(this.getProxyClass().getClassLoader(), new Class[]{this.getProxyClass()}, this);
    }

    @Override
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        return method0.invoke(this, arr_object);
    }
}

