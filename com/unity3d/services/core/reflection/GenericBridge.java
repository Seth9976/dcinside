package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public abstract class GenericBridge {
    private final String _className;
    private final Map _functionAndParameters;
    private final Map _methodMap;
    private boolean _methodMapBuilt;

    public GenericBridge(Map map0) {
        this._methodMapBuilt = false;
        this._className = this.getClassName();
        this._functionAndParameters = map0;
        this._methodMap = new HashMap();
        this.buildMethodMap();
    }

    private void buildMethodMap() {
        boolean z = true;
        for(Object object0: this.getFunctionMap().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Class[] arr_class = (Class[])map$Entry0.getValue();
            try {
                Method method0 = this.getReflectiveMethod(this.classForName(), ((String)map$Entry0.getKey()), arr_class);
                if(method0 == null) {
                    continue;
                }
                String s = (String)map$Entry0.getKey();
                this._methodMap.put(s, method0);
            }
            catch(Exception unused_ex) {
                Object object1 = map$Entry0.getKey();
                DeviceLog.debug("ERROR: Could not find %s class with method %s and parameters : %s", new Object[]{this._className, object1, arr_class});
                z = false;
            }
        }
        this._methodMapBuilt = z;
    }

    public Object callNonVoidMethod(String s, Object object0, Object[] arr_object) {
        Method method0 = this.getMethod(s);
        if(method0 == null) {
            DeviceLog.debug("ERROR: Could not find method %s", new Object[]{s});
            return null;
        }
        try {
            return method0.invoke(object0, arr_object);
        }
        catch(Exception exception0) {
            DeviceLog.debug("ERROR: Could not invoke method %s : %s", new Object[]{s, exception0.getLocalizedMessage()});
            return null;
        }
    }

    public void callVoidMethod(String s, Object object0, Object[] arr_object) {
        Method method0 = this.getMethod(s);
        if(method0 == null) {
            DeviceLog.debug("ERROR: Could not find method %s", new Object[]{s});
            return;
        }
        try {
            method0.invoke(object0, arr_object);
        }
        catch(Exception exception0) {
            DeviceLog.debug("ERROR: Could not invoke method %s : %s", new Object[]{s, exception0.getLocalizedMessage()});
        }
    }

    public Class classForName() {
        try {
            return Class.forName(this._className);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            DeviceLog.debug("ERROR: Could not find Class %s %s", new Object[]{this._className, classNotFoundException0.getLocalizedMessage()});
            return null;
        }
    }

    public boolean exists() {
        if(this.classForName() == null) {
            DeviceLog.debug("ERROR: Could not find class %s", new Object[]{this._className});
            return false;
        }
        if(!this._methodMapBuilt) {
            this.buildMethodMap();
        }
        return this._methodMap.size() == this.getFunctionMap().size();
    }

    protected abstract String getClassName();

    public Map getFunctionMap() {
        return this._functionAndParameters;
    }

    private Method getMethod(String s) {
        return (Method)this._methodMap.get(s);
    }

    private Method getReflectiveMethod(Class class0, String s, Class[] arr_class) {
        try {
            return class0.getDeclaredMethod(s, arr_class);
        }
        catch(Exception exception0) {
            DeviceLog.debug("ERROR: Could not find method %s in %s", new Object[]{s, class0.getName() + " " + exception0.getLocalizedMessage()});
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, c.F, new Object[0]);
            return null;
        }
    }
}

