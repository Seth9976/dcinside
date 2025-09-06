package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.HashMap;
import java.util.Map;

public class InitializationStatusBridge extends GenericBridge {
    private static final String adapterStatusMapMethodName = "getAdapterStatusMap";

    public InitializationStatusBridge() {
        super(new com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge.1());

        class com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge.1 extends HashMap {
            com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge.1() {
                this.put("getAdapterStatusMap", new Class[0]);
            }
        }

    }

    public Map getAdapterStatusMap(Object object0) {
        return (Map)this.callNonVoidMethod("getAdapterStatusMap", object0, new Object[0]);
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }
}

