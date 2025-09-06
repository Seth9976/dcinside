package com.unity3d.services.core.timer;

public interface IIntervalTimerFactory {
    IIntervalTimer createTimer(Integer arg1, Integer arg2, IIntervalTimerListener arg3);
}

