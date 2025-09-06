package com.unity3d.services.core.configuration;

public interface IInitializationListener {
    void onSdkInitializationFailed(String arg1, ErrorState arg2, int arg3);

    void onSdkInitialized();
}

