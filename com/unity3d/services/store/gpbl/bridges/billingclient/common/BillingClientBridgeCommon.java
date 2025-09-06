package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract class BillingClientBridgeCommon extends GenericBridge implements IBillingClient {
    protected final Object _billingClientInternalInstance;
    protected static final String endConnectionMethodName = "endConnection";
    protected static final String isFeatureSupportedMethodName = "isFeatureSupported";
    protected static final String isReadyMethodName = "isReady";
    protected static final String newBuilderMethodName = "newBuilder";
    protected static final String queryPurchaseHistoryAsyncMethodName = "queryPurchaseHistoryAsync";
    protected static final String querySkuDetailsAsyncMethodName = "querySkuDetailsAsync";
    protected static final String startConnectionMethodName = "startConnection";
    private static final Map staticMethods;

    static {
        BillingClientBridgeCommon.staticMethods = new HashMap() {
            {
                this.put("newBuilder", new Class[]{Context.class});
            }
        };
    }

    public BillingClientBridgeCommon(Object object0, Map map0) throws ClassNotFoundException {
        super(BillingClientBridgeCommon.appendFunctionAnParameters(map0));
        this._billingClientInternalInstance = object0;
    }

    private static Map appendFunctionAnParameters(Map map0) throws ClassNotFoundException {
        map0.putAll(new HashMap() {
            {
                this.put("newBuilder", new Class[]{Context.class});
                this.put("startConnection", new Class[]{BillingClientStateListenerProxy.getProxyListenerClass()});
                this.put("endConnection", new Class[0]);
                this.put("querySkuDetailsAsync", new Class[]{SkuDetailsParamsBridge.getClassForBridge(), SkuDetailsResponseListenerProxy.getProxyListenerClass()});
                Class class0 = PurchaseHistoryResponseListenerProxy.getProxyListenerClass();
                this.put("queryPurchaseHistoryAsync", new Class[]{String.class, class0});
                this.put("isFeatureSupported", new Class[]{String.class});
                this.put("isReady", new Class[0]);
            }
        });
        return map0;
    }

    public static Object callNonVoidStaticMethod(String s, Object[] arr_object) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return BillingClientBridgeCommon.getClassForBridge().getMethod(s, ((Class[])BillingClientBridgeCommon.staticMethods.get(s))).invoke(null, arr_object);
    }

    public void endConnection() {
        this.callVoidMethod("endConnection", this._billingClientInternalInstance, new Object[0]);
    }

    protected static Class getClassForBridge() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClient");
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.BillingClient";
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public BillingResultResponseCode isFeatureSupported(String s) {
        return new BillingResultBridge(this.callNonVoidMethod("isFeatureSupported", this._billingClientInternalInstance, new Object[]{s})).getResponseCode();
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public boolean isReady() {
        return ((Boolean)this.callNonVoidMethod("isReady", this._billingClientInternalInstance, new Object[0])).booleanValue();
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchaseHistoryAsync(String s, PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy0) throws ClassNotFoundException {
        Object[] arr_object = {s, purchaseHistoryResponseListenerProxy0.getProxyInstance()};
        this.callVoidMethod("queryPurchaseHistoryAsync", this._billingClientInternalInstance, arr_object);
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(SkuDetailsParamsBridge skuDetailsParamsBridge0, SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy0) throws ClassNotFoundException {
        Object[] arr_object = {skuDetailsParamsBridge0.getInternalInstance(), skuDetailsResponseListenerProxy0.getProxyInstance()};
        this.callVoidMethod("querySkuDetailsAsync", this._billingClientInternalInstance, arr_object);
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void startConnection(BillingClientStateListenerProxy billingClientStateListenerProxy0) throws ClassNotFoundException {
        Object[] arr_object = {billingClientStateListenerProxy0.getProxyInstance()};
        this.callVoidMethod("startConnection", this._billingClientInternalInstance, arr_object);
    }
}

