package com.unity3d.services.core.properties;

public class InitializationStatusReader {
    private static final String STATE_INITIALIZED_FAILED = "initialized_failed";
    private static final String STATE_INITIALIZED_SUCCESSFULLY = "initialized_successfully";
    private static final String STATE_INITIALIZING = "initializing";
    private static final String STATE_NOT_INITIALIZED = "not_initialized";

    public String getInitializationStateString(InitializationState sdkProperties$InitializationState0) {
        switch(sdkProperties$InitializationState0) {
            case 1: {
                return "not_initialized";
            }
            case 2: {
                return "initializing";
            }
            case 3: {
                return "initialized_successfully";
            }
            case 4: {
                return "initialized_failed";
            }
            default: {
                return null;
            }
        }
    }
}

