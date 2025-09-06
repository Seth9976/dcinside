package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;

public class DefaultIntervalTimerFactory implements IIntervalTimerFactory {
    @Override  // com.unity3d.services.core.timer.IIntervalTimerFactory
    public IIntervalTimer createTimer(Integer integer0, Integer integer1, IIntervalTimerListener iIntervalTimerListener0) {
        return new IntervalTimer(integer0, integer1, iIntervalTimerListener0, CachedLifecycle.getLifecycleListener());
    }
}

