package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StoreLifecycleListener implements Application.ActivityLifecycleCallbacks {
    @l
    private final ArrayList _purchaseTypes;
    @l
    private final StoreBilling _storeBilling;
    @l
    private final StoreEventListener _storeEventListener;

    public StoreLifecycleListener(@l ArrayList arrayList0, @l StoreBilling storeBilling0, @l StoreEventListener storeEventListener0) {
        L.p(arrayList0, "_purchaseTypes");
        L.p(storeBilling0, "_storeBilling");
        L.p(storeEventListener0, "_storeEventListener");
        super();
        this._purchaseTypes = arrayList0;
        this._storeBilling = storeBilling0;
        this._storeEventListener = storeEventListener0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(@l Activity activity0) {
        L.p(activity0, "activity");
        try {
            for(Object object0: this._purchaseTypes) {
                this._storeBilling.getPurchases(((String)object0), this._storeEventListener);
            }
        }
        catch(ClassNotFoundException classNotFoundException0) {
            DeviceLog.warning(("Couldn\'t fetch purchases onActivityResumed. " + classNotFoundException0.getMessage()));
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l Activity activity0, @l Bundle bundle0) {
        L.p(activity0, "activity");
        L.p(bundle0, "outState");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(@l Activity activity0) {
        L.p(activity0, "activity");
    }
}

