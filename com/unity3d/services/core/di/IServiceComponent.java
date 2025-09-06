package com.unity3d.services.core.di;

import y4.l;

public interface IServiceComponent {
    public static final class DefaultImpls {
        @l
        public static IServiceProvider getServiceProvider(@l IServiceComponent iServiceComponent0) {
            return ServiceProvider.INSTANCE;
        }
    }

    @l
    IServiceProvider getServiceProvider();
}

