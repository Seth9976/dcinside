package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Invocation {
    private static AtomicInteger _idCount;
    private IInvocationCallbackInvoker _invocationCallbackInvoker;
    private int _invocationId;
    private static Map _invocationSets;
    private ArrayList _invocations;
    private ArrayList _responses;
    private final IWebViewBridge _webViewBridge;

    static {
        Invocation._idCount = new AtomicInteger(0);
    }

    public Invocation() {
        this(SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), SharedInstances.INSTANCE.getWebViewBridge());
    }

    public Invocation(IInvocationCallbackInvoker iInvocationCallbackInvoker0, IWebViewBridge iWebViewBridge0) {
        this._invocationCallbackInvoker = iInvocationCallbackInvoker0;
        this._webViewBridge = iWebViewBridge0;
        this._invocationId = Invocation._idCount.getAndIncrement();
        if(Invocation._invocationSets == null) {
            Invocation._invocationSets = new HashMap();
        }
        Invocation._invocationSets.put(this._invocationId, this);
    }

    public Invocation(IWebViewBridge iWebViewBridge0) {
        this(SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iWebViewBridge0);
    }

    public void addInvocation(String s, String s1, Object[] arr_object, WebViewCallback webViewCallback0) {
        if(this._invocations == null) {
            this._invocations = new ArrayList();
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        arrayList0.add(s1);
        arrayList0.add(arr_object);
        arrayList0.add(webViewCallback0);
        this._invocations.add(arrayList0);
    }

    public int getId() {
        return this._invocationId;
    }

    public static Invocation getInvocationById(int v) {
        synchronized(Invocation.class) {
            return Invocation._invocationSets != null && Invocation._invocationSets.containsKey(v) ? ((Invocation)Invocation._invocationSets.get(v)) : null;
        }
    }

    public ArrayList getResponses() {
        return this._responses;
    }

    public boolean nextInvocation() {
        if(this._invocations != null && this._invocations.size() > 0) {
            ArrayList arrayList0 = (ArrayList)this._invocations.remove(0);
            String s = (String)arrayList0.get(0);
            String s1 = (String)arrayList0.get(1);
            Object[] arr_object = (Object[])arrayList0.get(2);
            WebViewCallback webViewCallback0 = (WebViewCallback)arrayList0.get(3);
            try {
                this._webViewBridge.handleInvocation(s, s1, arr_object, webViewCallback0);
            }
            catch(Exception exception0) {
                DeviceLog.exception(String.format("Error handling invocation %s.%s(%s)", s, s1, Arrays.toString(arr_object)), exception0);
            }
            return true;
        }
        return false;
    }

    public void sendInvocationCallback() {
        Invocation._invocationSets.remove(this.getId());
        this._invocationCallbackInvoker.invokeCallback(this);
    }

    public void setInvocationResponse(CallbackStatus callbackStatus0, Enum enum0, Object[] arr_object) {
        if(this._responses == null) {
            this._responses = new ArrayList();
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(callbackStatus0);
        arrayList0.add(enum0);
        arrayList0.add(arr_object);
        this._responses.add(arrayList0);
    }
}

