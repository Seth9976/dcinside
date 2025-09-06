package com.unity3d.services.core.configuration;

public interface IModuleConfiguration {
    Class[] getWebAppApiClassList();

    boolean initCompleteState(Configuration arg1);

    boolean initErrorState(Configuration arg1, ErrorState arg2, String arg3);

    boolean resetState(Configuration arg1);
}

