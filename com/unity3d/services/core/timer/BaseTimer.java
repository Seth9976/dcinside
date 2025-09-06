package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class BaseTimer implements IBaseTimer {
    final Integer _delayMs;
    private final AtomicBoolean _hasPaused;
    private final AtomicBoolean _isRunning;
    private final LifecycleCache _lifecycleCache;
    Integer _remainingDurationMs;
    private ScheduledFuture _task;
    private ITimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    final Integer _totalDurationMs;

    public BaseTimer(Integer integer0, ITimerListener iTimerListener0) {
        this(integer0, iTimerListener0, CachedLifecycle.getLifecycleListener());
    }

    public BaseTimer(Integer integer0, ITimerListener iTimerListener0, LifecycleCache lifecycleCache0) {
        this._delayMs = 1000;
        this._isRunning = new AtomicBoolean(false);
        this._hasPaused = new AtomicBoolean(false);
        this._totalDurationMs = integer0;
        this._remainingDurationMs = integer0;
        this._timerListener = iTimerListener0;
        this._lifecycleCache = lifecycleCache0;
        this.addLifecycleListener();
    }

    private void addLifecycleListener() {
        LifecycleCache lifecycleCache0 = this._lifecycleCache;
        if(lifecycleCache0 == null) {
            return;
        }
        lifecycleCache0.addActiveListener(new IAppActiveListener() {
            @Override  // com.unity3d.services.core.lifecycle.IAppActiveListener
            public void onAppStateChanged(boolean z) {
                if(z) {
                    if(BaseTimer.this._hasPaused.get()) {
                        BaseTimer.this._hasPaused.getAndSet(false);
                        BaseTimer.this.resume();
                    }
                }
                else if(BaseTimer.this.isRunning()) {
                    BaseTimer.this.pause();
                    BaseTimer.this._hasPaused.getAndSet(true);
                }
            }
        });
    }

    public boolean isRunning() {
        return this._isRunning.get();
    }

    @Override  // com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        this.stop();
        this._timerListener = null;
    }

    private void notifyListeners() {
        ITimerListener iTimerListener0 = this._timerListener;
        if(iTimerListener0 != null) {
            iTimerListener0.onTimerFinished();
        }
    }

    public void onStep() {
        if(((int)this._remainingDurationMs) <= 0) {
            this.notifyListeners();
            this.kill();
        }
    }

    @Override  // com.unity3d.services.core.timer.IBaseTimer
    public boolean pause() {
        boolean z;
        if(this._task == null || this._task.isCancelled()) {
            z = false;
        }
        else {
            z = true;
            this._task.cancel(true);
            this._task = null;
        }
        this._isRunning.getAndSet(false);
        return z;
    }

    public void restart(ScheduledExecutorService scheduledExecutorService0) {
        if(this._timerService == null || this._timerService.isShutdown()) {
            this._timerService = scheduledExecutorService0;
        }
        this._remainingDurationMs = this._totalDurationMs;
        this.schedule();
        this._isRunning.getAndSet(true);
    }

    @Override  // com.unity3d.services.core.timer.IBaseTimer
    public boolean resume() {
        boolean z;
        if(this._timerService == null || this._timerService.isShutdown()) {
            z = false;
        }
        else {
            this.schedule();
            z = true;
        }
        this._isRunning.getAndSet(z);
        return z;
    }

    private void schedule() {
        try {
            this._task = this._timerService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    BaseTimer.this._remainingDurationMs = (int)(((int)BaseTimer.this._remainingDurationMs) - ((int)BaseTimer.this._delayMs));
                    BaseTimer.this.onStep();
                }
            }, ((long)(((int)this._delayMs))), ((long)(((int)this._delayMs))), TimeUnit.MILLISECONDS);
        }
        catch(IllegalStateException | IllegalArgumentException | NullPointerException | RejectedExecutionException illegalStateException0) {
            DeviceLog.debug(("ERROR: IntervalTimer failed to start due to exception " + illegalStateException0.getLocalizedMessage()));
        }
    }

    @Override  // com.unity3d.services.core.timer.IBaseTimer
    public void start(ScheduledExecutorService scheduledExecutorService0) {
        if(this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService0;
            this.schedule();
        }
    }

    @Override  // com.unity3d.services.core.timer.IBaseTimer
    public void stop() {
        if(this._timerService != null && !this._timerService.isShutdown()) {
            this._timerService.shutdown();
            this._timerService = null;
        }
        this._isRunning.getAndSet(false);
    }
}

