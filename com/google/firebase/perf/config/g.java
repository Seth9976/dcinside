package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnFailureListener;

public final class g implements OnFailureListener {
    public final RemoteConfigManager a;

    public g(RemoteConfigManager remoteConfigManager0) {
        this.a = remoteConfigManager0;
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        this.a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exception0);
    }
}

