package com.unity3d.services.core.domain.task;

import y4.l;

public final class EmptyParams implements BaseParams {
    @l
    public static final EmptyParams INSTANCE;

    static {
        EmptyParams.INSTANCE = new EmptyParams();
    }
}

