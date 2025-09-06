package com.unity3d.services.core.domain;

import kotlinx.coroutines.K;
import kotlinx.coroutines.h0;
import y4.l;

public final class SDKDispatchers implements ISDKDispatchers {
    @l
    private final K default;
    @l
    private final K io;
    @l
    private final K main;

    public SDKDispatchers() {
        this.io = h0.c();
        this.default = h0.a();
        this.main = h0.e();
    }

    @Override  // com.unity3d.services.core.domain.ISDKDispatchers
    @l
    public K getDefault() {
        return this.default;
    }

    @Override  // com.unity3d.services.core.domain.ISDKDispatchers
    @l
    public K getIo() {
        return this.io;
    }

    @Override  // com.unity3d.services.core.domain.ISDKDispatchers
    @l
    public K getMain() {
        return this.main;
    }
}

