package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnSuccessListener;

public final class f implements OnSuccessListener {
    public final RemoteConfigManager a;

    public f(RemoteConfigManager remoteConfigManager0) {
        this.a = remoteConfigManager0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(((Boolean)object0));
    }
}

