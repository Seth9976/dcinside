package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class NativeCallback {
    private Method _callback;
    private static AtomicInteger _callbackCount;
    private String _id;
    private final INativeCallbackSubject _nativeCallbackSubject;

    static {
        NativeCallback._callbackCount = new AtomicInteger(0);
    }

    public NativeCallback(Method method0) {
        this(method0, SharedInstances.INSTANCE.getWebViewAppNativeCallbackSubject());
    }

    public NativeCallback(Method method0, INativeCallbackSubject iNativeCallbackSubject0) {
        this._callback = method0;
        this._id = this._callback.getName().toUpperCase(Locale.US) + "_" + NativeCallback._callbackCount.getAndIncrement();
        this._nativeCallbackSubject = iNativeCallbackSubject0;
    }

    public String getId() {
        return this._id;
    }

    public void invoke(String s, Object[] arr_object) throws InvocationTargetException, IllegalAccessException, IllegalArgumentException {
        Object[] arr_object1;
        CallbackStatus callbackStatus0;
        try {
            callbackStatus0 = CallbackStatus.valueOf(s);
        }
        catch(Exception exception0) {
            DeviceLog.error("Illegal status");
            this._nativeCallbackSubject.remove(this);
            throw exception0;
        }
        if(arr_object == null) {
            arr_object1 = new Object[]{callbackStatus0};
        }
        else {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_object));
            arrayList0.add(0, callbackStatus0);
            arr_object1 = arrayList0.toArray();
        }
        this._callback.invoke(null, arr_object1);
        this._nativeCallbackSubject.remove(this);
    }
}

