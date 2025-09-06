package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkuDetailsParamsBridge extends GenericBridge {
    public static class BuilderBridge extends GenericBridge {
        private Object _skuDetailsParamsBuilderInternalInstance;
        private static final String buildMethodName = "build";
        private static final String setSkusListMethodName = "setSkusList";
        private static final String setTypeMethodName = "setType";

        public BuilderBridge(Object object0) {
            super(new com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.1());
            this._skuDetailsParamsBuilderInternalInstance = object0;

            class com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.1 extends HashMap {
                com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.1() {
                    this.put("build", new Class[0]);
                    this.put("setSkusList", new Class[]{List.class});
                    this.put("setType", new Class[]{String.class});
                }
            }

        }

        public SkuDetailsParamsBridge build() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
            return new SkuDetailsParamsBridge(this.callNonVoidMethod("build", this._skuDetailsParamsBuilderInternalInstance, new Object[0]));
        }

        @Override  // com.unity3d.services.core.reflection.GenericBridge
        protected String getClassName() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        public BuilderBridge setSkuList(List list0) {
            this._skuDetailsParamsBuilderInternalInstance = this.callNonVoidMethod("setSkusList", this._skuDetailsParamsBuilderInternalInstance, new Object[]{list0});
            return this;
        }

        public BuilderBridge setType(String s) {
            this._skuDetailsParamsBuilderInternalInstance = this.callNonVoidMethod("setType", this._skuDetailsParamsBuilderInternalInstance, new Object[]{s});
            return this;
        }
    }

    private final Object _skuDetailsParamsInternalInstance;
    private static final String newBuilderMethodName = "newBuilder";
    private static final Map staticMethods;

    static {
        SkuDetailsParamsBridge.staticMethods = new HashMap() {
            {
                this.put("newBuilder", new Class[0]);
            }
        };
    }

    public SkuDetailsParamsBridge(Object object0) {
        super(new com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.2());
        this._skuDetailsParamsInternalInstance = object0;

        class com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.2 extends HashMap {
            com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.2() {
                this.put("newBuilder", new Class[0]);
            }
        }

    }

    public static Object callNonVoidStaticMethod(String s, Object[] arr_object) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return SkuDetailsParamsBridge.getClassForBridge().getMethod(s, ((Class[])SkuDetailsParamsBridge.staticMethods.get(s))).invoke(null, arr_object);
    }

    public static Class getClassForBridge() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsParams");
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    public Object getInternalInstance() {
        return this._skuDetailsParamsInternalInstance;
    }

    public static BuilderBridge newBuilder() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new BuilderBridge(SkuDetailsParamsBridge.callNonVoidStaticMethod("newBuilder", new Object[0]));
    }
}

