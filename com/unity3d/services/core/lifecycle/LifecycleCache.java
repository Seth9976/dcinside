package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
public class LifecycleCache implements Application.ActivityLifecycleCallbacks, LifecycleEventObserver {
    private boolean _appActive;
    private final Set _appActiveListeners;
    private final Set _appStateListeners;
    private LifecycleEvent _currentState;
    private boolean _lifecycleAppActive;
    private boolean _newLifecycle;
    private int _numStarted;

    LifecycleCache(ConfigurationReader configurationReader0) {
        this._currentState = LifecycleEvent.RESUMED;
        this._appActive = true;
        this._lifecycleAppActive = true;
        this._numStarted = 0;
        this._newLifecycle = false;
        this._appActiveListeners = new HashSet();
        this._appStateListeners = new HashSet();
        this._newLifecycle = configurationReader0.getCurrentConfiguration().getExperiments().isJetpackLifecycle();
        this.startProcessLifecycleObserving();
    }

    public void addActiveListener(IAppActiveListener iAppActiveListener0) {
        synchronized(this) {
            this._appActiveListeners.add(iAppActiveListener0);
        }
    }

    public void addStateListener(IAppEventListener iAppEventListener0) {
        synchronized(this) {
            this._appStateListeners.add(iAppEventListener0);
        }
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    // 去混淆评级： 低(20)
    public boolean isAppActive() {
        return this._newLifecycle ? this._lifecycleAppActive : this._appActive;
    }

    public void notifyActiveListeners() {
        synchronized(this) {
            for(Object object0: this._appActiveListeners) {
                ((IAppActiveListener)object0).onAppStateChanged(this._appActive);
            }
        }
    }

    public void notifyStateListeners(LifecycleEvent lifecycleEvent0) {
        synchronized(this) {
            for(Object object0: this._appStateListeners) {
                ((IAppEventListener)object0).onLifecycleEvent(lifecycleEvent0);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        this._currentState = LifecycleEvent.CREATED;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        this._currentState = LifecycleEvent.PAUSED;
        this.notifyStateListeners(LifecycleEvent.PAUSED);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        this._currentState = LifecycleEvent.RESUMED;
        this.notifyStateListeners(LifecycleEvent.RESUMED);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        this._currentState = LifecycleEvent.STARTED;
        if(this._numStarted == 0) {
            this._appActive = true;
            if(!this._newLifecycle) {
                this.notifyActiveListeners();
            }
        }
        ++this._numStarted;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        this._currentState = LifecycleEvent.STOPPED;
        int v = this._numStarted - 1;
        this._numStarted = v;
        if(v <= 0) {
            this._numStarted = 0;
            this._appActive = false;
            if(!this._newLifecycle) {
                this.notifyActiveListeners();
            }
        }
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
        switch(lifecycle$Event0) {
            case 1: {
                this._lifecycleAppActive = false;
                if(this._newLifecycle) {
                    this.notifyActiveListeners();
                    return;
                }
                break;
            }
            case 2: {
                this._lifecycleAppActive = true;
                if(this._newLifecycle) {
                    this.notifyActiveListeners();
                    return;
                }
                break;
            }
        }
    }

    // 检测为 Lambda 实现
    private void registerLifecycleObserver() [...]

    public void removeActiveListener(IAppActiveListener iAppActiveListener0) {
        synchronized(this) {
            this._appActiveListeners.remove(iAppActiveListener0);
        }
    }

    public void removeStateListener(IAppEventListener iAppEventListener0) {
        synchronized(this) {
            this._appStateListeners.remove(iAppEventListener0);
        }
    }

    private void startProcessLifecycleObserving() {
        m.a(() -> ProcessLifecycleOwner.l().getLifecycle().a(LifecycleCache.this));

        class com.unity3d.services.core.lifecycle.LifecycleCache.1 implements Runnable {
            @Override
            public void run() {
                LifecycleCache.this.registerLifecycleObserver();
            }
        }

    }
}

