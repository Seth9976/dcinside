package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.e0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ResultExtensionsKt {
    public static final Exception getCustomExceptionOrNull(Object object0) {
        Throwable throwable0 = e0.e(object0);
        L.y(3, "E");
        return throwable0 instanceof Exception ? ((Exception)throwable0) : null;
    }

    public static final Exception getCustomExceptionOrThrow(Object object0) {
        Throwable throwable0 = e0.e(object0);
        L.y(3, "E");
        if(!(throwable0 instanceof Exception)) {
            throw new IllegalArgumentException("Wrong Exception type found");
        }
        return (Exception)throwable0;
    }

    @m
    public static final InitializationException getInitializationExceptionOrNull(@l Object object0) {
        Throwable throwable0 = e0.e(object0);
        return throwable0 instanceof InitializationException ? ((InitializationException)throwable0) : null;
    }

    @l
    public static final InitializationException getInitializationExceptionOrThrow(@l Object object0) {
        Throwable throwable0 = e0.e(object0);
        if(!(throwable0 instanceof InitializationException)) {
            throw new IllegalArgumentException("Wrong Exception type found");
        }
        return (InitializationException)throwable0;
    }
}

