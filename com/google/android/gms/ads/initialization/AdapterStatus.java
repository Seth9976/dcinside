package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;

public interface AdapterStatus {
    public static enum State {
        @NonNull
        NOT_READY,
        @NonNull
        READY;

    }

    @NonNull
    String getDescription();

    @NonNull
    State getInitializationState();

    int getLatency();
}

