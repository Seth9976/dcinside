package com.unity3d.services.core.configuration;

public interface IConfigurationLoaderListener {
    void onError(String arg1);

    void onSuccess(Configuration arg1);
}

