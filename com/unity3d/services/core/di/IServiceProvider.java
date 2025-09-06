package com.unity3d.services.core.di;

import y4.l;

public interface IServiceProvider {
    @l
    IServicesRegistry getRegistry();

    @l
    IServicesRegistry initialize();
}

