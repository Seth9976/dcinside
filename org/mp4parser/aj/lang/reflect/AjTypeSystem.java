package org.mp4parser.aj.lang.reflect;

import j..util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import org.mp4parser.aj.internal.lang.reflect.AjTypeImpl;

public class AjTypeSystem {
    private static Map ajTypes;

    static {
        AjTypeSystem.ajTypes = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public static AjType getAjType(Class class0) {
        WeakReference weakReference0 = (WeakReference)AjTypeSystem.ajTypes.get(class0);
        if(weakReference0 != null) {
            AjType ajType0 = (AjType)weakReference0.get();
            if(ajType0 != null) {
                return ajType0;
            }
            AjType ajType1 = new AjTypeImpl(class0);
            AjTypeSystem.ajTypes.put(class0, new WeakReference(ajType1));
            return ajType1;
        }
        AjType ajType2 = new AjTypeImpl(class0);
        AjTypeSystem.ajTypes.put(class0, new WeakReference(ajType2));
        return ajType2;
    }
}

