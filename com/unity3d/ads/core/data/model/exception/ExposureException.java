package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.L;
import y4.l;

public final class ExposureException extends Exception {
    @l
    private final Object[] parameters;

    public ExposureException(@l String s, @l Object[] arr_object) {
        L.p(s, "message");
        L.p(arr_object, "parameters");
        super(s);
        this.parameters = arr_object;
    }

    @l
    public final Object[] getParameters() {
        return this.parameters;
    }
}

