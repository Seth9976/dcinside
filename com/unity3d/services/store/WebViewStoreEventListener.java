package com.unity3d.services.store;

import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import y4.l;
import y4.m;

@s0({"SMAP\nWebViewStoreEventListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewStoreEventListener.kt\ncom/unity3d/services/store/WebViewStoreEventListener\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,110:1\n37#2,2:111\n37#2,2:113\n*S KotlinDebug\n*F\n+ 1 WebViewStoreEventListener.kt\ncom/unity3d/services/store/WebViewStoreEventListener\n*L\n85#1:111,2\n88#1:113,2\n*E\n"})
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    @l
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int v, @l StoreWebViewEventSender storeWebViewEventSender0, boolean z) {
        L.p(storeWebViewEventSender0, "storeWebViewEventSender");
        super();
        this.operationId = v;
        this.storeWebViewEventSender = storeWebViewEventSender0;
        this.isLifecycleListener = z;
    }

    public WebViewStoreEventListener(int v, StoreWebViewEventSender storeWebViewEventSender0, boolean z, int v1, w w0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        this(v, storeWebViewEventSender0, z);
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(@l BillingResultBridge billingResultBridge0) {
        L.p(billingResultBridge0, "billingResult");
        if(billingResultBridge0.getResponseCode() == BillingResultResponseCode.OK) {
            BillingResultResponseCode billingResultResponseCode0 = billingResultBridge0.getResponseCode();
            L.o(billingResultResponseCode0, "billingResult.responseCode");
            this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, new Object[]{billingResultResponseCode0});
            return;
        }
        BillingResultResponseCode billingResultResponseCode1 = billingResultBridge0.getResponseCode();
        L.o(billingResultResponseCode1, "billingResult.responseCode");
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_FAILED, new Object[]{billingResultResponseCode1});
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int v) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, new Object[]{this.getOperationId(), v});
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        Object[] arr_object = {BillingResultResponseCode.OK.getResponseCode()};
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, arr_object);
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(@l BillingResultBridge billingResultBridge0, @m List list0) {
        JSONArray jSONArray0;
        L.p(billingResultBridge0, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender0 = this.storeWebViewEventSender;
        StoreEvent storeEvent0 = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Integer integer0 = this.getOperationId();
        BillingResultResponseCode billingResultResponseCode0 = billingResultBridge0.getResponseCode();
        L.o(billingResultResponseCode0, "billingResult.responseCode");
        if(list0 == null) {
            jSONArray0 = new JSONArray();
        }
        else {
            jSONArray0 = JsonSerializableExtensionsKt.toJsonArray(list0);
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
        }
        storeWebViewEventSender0.send(storeEvent0, new Object[]{integer0, billingResultResponseCode0, jSONArray0});
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(@l BillingResultBridge billingResultBridge0, @m List list0) {
        JSONArray jSONArray0;
        L.p(billingResultBridge0, "billingResult");
        ArrayList arrayList0 = new ArrayList();
        if(this.getOperationId() != -1) {
            arrayList0.add(this.getOperationId());
        }
        if(billingResultBridge0.getResponseCode() == BillingResultResponseCode.OK) {
            if(list0 == null) {
                jSONArray0 = new JSONArray();
            }
            else {
                jSONArray0 = JsonSerializableExtensionsKt.toJsonArray(list0);
                if(jSONArray0 == null) {
                    jSONArray0 = new JSONArray();
                }
            }
            arrayList0.add(jSONArray0);
            Object[] arr_object = arrayList0.toArray(new Object[0]);
            this.storeWebViewEventSender.send((this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_RESULT : StoreEvent.PURCHASES_REQUEST_RESULT), Arrays.copyOf(arr_object, arr_object.length));
            return;
        }
        arrayList0.add(billingResultBridge0.getResponseCode());
        Object[] arr_object1 = arrayList0.toArray(new Object[0]);
        this.storeWebViewEventSender.send((this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_ERROR : StoreEvent.PURCHASES_REQUEST_ERROR), Arrays.copyOf(arr_object1, arr_object1.length));
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(@l BillingResultBridge billingResultBridge0, @m List list0) {
        JSONArray jSONArray0;
        L.p(billingResultBridge0, "billingResult");
        if(billingResultBridge0.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender0 = this.storeWebViewEventSender;
            StoreEvent storeEvent0 = StoreEvent.PURCHASES_UPDATED_RESULT;
            if(list0 == null) {
                jSONArray0 = new JSONArray();
            }
            else {
                jSONArray0 = JsonSerializableExtensionsKt.toJsonArray(list0);
                if(jSONArray0 == null) {
                    jSONArray0 = new JSONArray();
                }
            }
            storeWebViewEventSender0.send(storeEvent0, new Object[]{jSONArray0});
            return;
        }
        BillingResultResponseCode billingResultResponseCode0 = billingResultBridge0.getResponseCode();
        L.o(billingResultResponseCode0, "billingResult.responseCode");
        this.storeWebViewEventSender.send(StoreEvent.PURCHASES_UPDATED_ERROR, new Object[]{billingResultResponseCode0});
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(@l BillingResultBridge billingResultBridge0, @m List list0) {
        JSONArray jSONArray0;
        L.p(billingResultBridge0, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender0 = this.storeWebViewEventSender;
        StoreEvent storeEvent0 = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Integer integer0 = this.getOperationId();
        if(list0 == null) {
            jSONArray0 = new JSONArray();
        }
        else {
            jSONArray0 = JsonSerializableExtensionsKt.toJsonArray(list0);
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
        }
        storeWebViewEventSender0.send(storeEvent0, new Object[]{integer0, jSONArray0});
    }
}

