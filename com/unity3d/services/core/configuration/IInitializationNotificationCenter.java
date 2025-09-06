package com.unity3d.services.core.configuration;

public interface IInitializationNotificationCenter {
    void addListener(IInitializationListener arg1);

    void removeListener(IInitializationListener arg1);

    void triggerOnSdkInitializationFailed(String arg1, ErrorState arg2, int arg3);

    void triggerOnSdkInitialized();
}

