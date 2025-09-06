package com.unity3d.services.ads.gmascar.bridges;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class InitializeListenerBridge extends GenericBridge {
    private IInitializationStatusListener _initializationStatusListener;
    private static final String initializationCompleteMethodName = "onInitializationComplete";

    public InitializeListenerBridge() {
        super(new com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.1());

        class com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.1 extends HashMap {
            com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.1() throws RuntimeException, Error {
                try {
                    this.put("onInitializationComplete", new Class[]{InitializationStatus.class});
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", new Object[]{classNotFoundException0.getLocalizedMessage()});
                }
            }
        }

    }

    public Object createInitializeListenerProxy() {
        try {
            return Proxy.newProxyInstance(this.classForName().getClassLoader(), new Class[]{this.classForName()}, new InvocationHandler() {
                @Override
                public Object invoke(Object object0, Method method0, Object[] arr_object) {
                    if(method0.getName().equals("onInitializationComplete") && InitializeListenerBridge.this._initializationStatusListener != null) {
                        InitializeListenerBridge.this._initializationStatusListener.onInitializationComplete(arr_object[0]);
                    }
                    return null;
                }
            });
        }
        catch(Exception unused_ex) {
            DeviceLog.debug("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    public void setStatusListener(IInitializationStatusListener iInitializationStatusListener0) {
        this._initializationStatusListener = iInitializationStatusListener0;
    }
}

