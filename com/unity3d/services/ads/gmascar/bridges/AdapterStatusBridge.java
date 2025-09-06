package com.unity3d.services.ads.gmascar.bridges;

import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.HashMap;

public class AdapterStatusBridge extends GenericBridge {
    private Class _adapterStateClass;
    private static final String initializeStateMethodName = "getInitializationState";

    public AdapterStatusBridge() {
        super(new com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.1());
        this._adapterStateClass = State.class;

        class com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.1 extends HashMap {
            com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.1() {
                this.put("getInitializationState", new Class[0]);
            }
        }

    }

    public Object[] getAdapterStatesEnum() {
        return this._adapterStateClass.getEnumConstants();
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    public boolean isGMAInitialized(Object object0) {
        Object[] arr_object = this.getAdapterStatesEnum();
        if(arr_object == null) {
            DeviceLog.debug("ERROR: Could not get adapter states enum from AdapterStatus.State");
            return false;
        }
        return this.callNonVoidMethod("getInitializationState", object0, new Object[0]) == arr_object[1];
    }
}

