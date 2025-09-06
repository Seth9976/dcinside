package com.unity3d.services.core.domain;

import kotlinx.coroutines.K;
import y4.l;

public interface ISDKDispatchers {
    @l
    K getDefault();

    @l
    K getIo();

    @l
    K getMain();
}

