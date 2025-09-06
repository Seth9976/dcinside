package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.LifecycleCache;
import java.util.concurrent.atomic.AtomicInteger;

public class IntervalTimer extends BaseTimer implements IIntervalTimer {
    private final AtomicInteger _currentPosition;
    private final Integer _intervalDuration;
    private Integer _nextInterval;
    private IIntervalTimerListener _timerListener;
    private final Integer _totalIntervals;

    public IntervalTimer(Integer integer0, Integer integer1, IIntervalTimerListener iIntervalTimerListener0, LifecycleCache lifecycleCache0) {
        super(integer0, null, lifecycleCache0);
        this._currentPosition = new AtomicInteger(0);
        this._totalIntervals = integer1;
        this._timerListener = iIntervalTimerListener0;
        int v = (int)integer0;
        if(((int)integer1) != 0) {
            v /= (int)integer1;
        }
        Integer integer2 = v;
        this._intervalDuration = integer2;
        this._nextInterval = integer2;
    }

    @Override  // com.unity3d.services.core.timer.BaseTimer, com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        super.kill();
        this._timerListener = null;
    }

    @Override  // com.unity3d.services.core.timer.IIntervalTimer
    public void onNextInterval() {
        IIntervalTimerListener iIntervalTimerListener0 = this._timerListener;
        if(iIntervalTimerListener0 != null) {
            iIntervalTimerListener0.onNextIntervalTriggered();
        }
        this._nextInterval = (int)(((int)this._nextInterval) + ((int)this._intervalDuration));
    }

    @Override  // com.unity3d.services.core.timer.BaseTimer
    public void onStep() {
        if(this._currentPosition.addAndGet(((int)this._delayMs)) >= ((int)this._nextInterval)) {
            this.onNextInterval();
        }
        super.onStep();
    }
}

