package com.unity3d.services.core.configuration;

public interface IPrivacyConfigurationListener {
    void onError(PrivacyCallError arg1, String arg2);

    void onSuccess(PrivacyConfig arg1);
}

