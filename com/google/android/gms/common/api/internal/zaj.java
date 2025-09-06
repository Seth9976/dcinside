package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;

final class zaj implements OnConnectionFailedListener {
    public final int zaa;
    public final GoogleApiClient zab;
    @Nullable
    public final OnConnectionFailedListener zac;
    final zak zad;

    public zaj(zak zak0, int v, @Nullable GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.zad = zak0;
        super();
        this.zaa = v;
        this.zab = googleApiClient0;
        this.zac = googleApiClient$OnConnectionFailedListener0;
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        Log.d("AutoManageHelper", "beginFailureResolution for " + connectionResult0);
        this.zad.zah(connectionResult0, this.zaa);
    }
}

