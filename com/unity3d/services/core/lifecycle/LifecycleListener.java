package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.util.ArrayList;

public class LifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final IEventSender _eventSender;
    private final ArrayList _events;

    public LifecycleListener(ArrayList arrayList0) {
        this(arrayList0, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public LifecycleListener(ArrayList arrayList0, IEventSender iEventSender0) {
        this._events = arrayList0;
        this._eventSender = iEventSender0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        if(this._events.contains("onActivityCreated") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.CREATED, arr_object);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        if(this._events.contains("onActivityDestroyed") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.DESTROYED, arr_object);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        if(this._events.contains("onActivityPaused") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.PAUSED, arr_object);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        if(this._events.contains("onActivityResumed") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.RESUMED, arr_object);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        if(this._events.contains("onActivitySaveInstanceState") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.SAVE_INSTANCE_STATE, arr_object);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        if(this._events.contains("onActivityStarted") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.STARTED, arr_object);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        if(this._events.contains("onActivityStopped") && this._eventSender.canSend()) {
            Object[] arr_object = {activity0.getClass().getName()};
            this._eventSender.sendEvent(WebViewEventCategory.LIFECYCLE, LifecycleEvent.STOPPED, arr_object);
        }
    }
}

