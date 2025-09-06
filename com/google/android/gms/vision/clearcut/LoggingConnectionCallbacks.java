package com.google.android.gms.vision.clearcut;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

@Keep
public class LoggingConnectionCallbacks implements ConnectionCallbacks, OnConnectionFailedListener {
    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(@RecentlyNonNull Bundle bundle0) {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(@RecentlyNonNull ConnectionResult connectionResult0) {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int v) {
        throw new NoSuchMethodError();
    }
}

