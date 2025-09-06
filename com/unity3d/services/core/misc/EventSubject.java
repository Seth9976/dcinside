package com.unity3d.services.core.misc;

import com.unity3d.services.core.timer.IIntervalTimer;
import com.unity3d.services.core.timer.IIntervalTimerFactory;
import com.unity3d.services.core.timer.IIntervalTimerListener;
import java.util.Queue;
import java.util.concurrent.Executors;

public class EventSubject {
    private IEventListener _eventListener;
    Queue _eventQueue;
    IIntervalTimer _intervalTimer;

    public EventSubject(Queue queue0, Integer integer0, IIntervalTimerFactory iIntervalTimerFactory0) {
        this._eventQueue = queue0;
        this._intervalTimer = iIntervalTimerFactory0.createTimer(integer0, queue0.size(), () -> {
            IEventListener iEventListener0 = EventSubject.this._eventListener;
            if(iEventListener0 != null) {
                iEventListener0.onNextEvent(EventSubject.this._eventQueue.remove());
            }
            if(EventSubject.this._eventQueue.size() <= 0) {
                EventSubject.this.unsubscribe();
            }
        });

        class com.unity3d.services.core.misc.EventSubject.1 implements IIntervalTimerListener {
            @Override  // com.unity3d.services.core.timer.IIntervalTimerListener
            public void onNextIntervalTriggered() {
                EventSubject.this.sendNextEvent();
            }
        }

    }

    public boolean eventQueueIsEmpty() {
        return this._eventQueue.isEmpty();
    }

    private void killTimer() {
        IIntervalTimer iIntervalTimer0 = this._intervalTimer;
        if(iIntervalTimer0 != null) {
            iIntervalTimer0.kill();
            this._intervalTimer = null;
        }
    }

    // 检测为 Lambda 实现
    public void sendNextEvent() [...]

    private void startTimer() {
        IIntervalTimer iIntervalTimer0 = this._intervalTimer;
        if(iIntervalTimer0 != null) {
            iIntervalTimer0.start(Executors.newSingleThreadScheduledExecutor());
        }
    }

    public void subscribe(IEventListener iEventListener0) {
        if(this._eventQueue != null && this._eventQueue.size() > 0 && this._intervalTimer != null && iEventListener0 != null) {
            this._eventListener = iEventListener0;
            this.startTimer();
        }
    }

    public void unsubscribe() {
        this.killTimer();
        this._eventListener = null;
    }
}

