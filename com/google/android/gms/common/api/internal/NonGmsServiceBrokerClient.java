package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public final class NonGmsServiceBrokerClient implements ServiceConnection, Client {
    private static final String zaa = "NonGmsServiceBrokerClient";
    @Nullable
    private final String zab;
    @Nullable
    private final String zac;
    @Nullable
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    @Nullable
    private IBinder zai;
    private boolean zaj;
    @Nullable
    private String zak;
    @Nullable
    private String zal;

    static {
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull ComponentName componentName0, @NonNull ConnectionCallbacks connectionCallbacks0, @NonNull OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, null, null, componentName0, connectionCallbacks0, onConnectionFailedListener0);
    }

    private NonGmsServiceBrokerClient(Context context0, Looper looper0, @Nullable String s, @Nullable String s1, @Nullable ComponentName componentName0, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        this.zaj = false;
        this.zak = null;
        this.zae = context0;
        this.zag = new zau(looper0);
        this.zaf = connectionCallbacks0;
        this.zah = onConnectionFailedListener0;
        if(s == null || s1 == null) {
            if(componentName0 != null) {
                this.zab = s;
                this.zac = s1;
                this.zad = componentName0;
                return;
            }
        }
        else if(componentName0 == null) {
            componentName0 = null;
            this.zab = s;
            this.zac = s1;
            this.zad = componentName0;
            return;
        }
        throw new AssertionError("Must specify either package or component, but not both");
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull String s, @NonNull String s1, @NonNull ConnectionCallbacks connectionCallbacks0, @NonNull OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, s, s1, null, connectionCallbacks0, onConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final void connect(@NonNull ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        this.zad();
        if(this.isConnected()) {
            try {
                this.disconnect("connect() called when already connected");
            }
            catch(Exception unused_ex) {
            }
        }
        try {
            Intent intent0 = new Intent();
            ComponentName componentName0 = this.zad;
            if(componentName0 == null) {
                intent0.setPackage(this.zab).setAction(this.zac);
            }
            else {
                intent0.setComponent(componentName0);
            }
            boolean z = this.zae.bindService(intent0, this, 0x1081);
            this.zaj = z;
        }
        catch(SecurityException securityException0) {
            this.zaj = false;
            this.zai = null;
            throw securityException0;
        }
        if(!z) {
            this.zai = null;
            ConnectionResult connectionResult0 = new ConnectionResult(16);
            this.zah.onConnectionFailed(connectionResult0);
        }
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final void disconnect() {
        this.zad();
        try {
            this.zae.unbindService(this);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.zaj = false;
        this.zai = null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final void disconnect(@NonNull String s) {
        this.zad();
        this.zak = s;
        this.disconnect();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Nullable
    @WorkerThread
    @KeepForSdk
    public IBinder getBinder() {
        this.zad();
        return this.zai;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final String getEndpointPackageName() {
        String s = this.zab;
        if(s != null) {
            return s;
        }
        Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @Nullable
    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void getRemoteService(@Nullable IAccountAccessor iAccountAccessor0, @Nullable Set set0) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Set getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @Nullable
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final boolean isConnected() {
        this.zad();
        return this.zai != null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final boolean isConnecting() {
        this.zad();
        return this.zaj;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName0, @NonNull IBinder iBinder0) {
        zacg zacg0 = () -> {
            this.zaj = false;
            this.zai = iBinder0;
            Bundle bundle0 = new Bundle();
            this.zaf.onConnected(bundle0);
        };
        this.zag.post(zacg0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName0) {
        zacf zacf0 = () -> {
            this.zaj = false;
            this.zai = null;
            this.zaf.onConnectionSuspended(1);
        };
        this.zag.post(zacf0);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void onUserSignOut(@NonNull SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresAccount() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresSignIn() {
        return false;
    }

    // 检测为 Lambda 实现
    final void zaa(IBinder iBinder0) [...]

    // 检测为 Lambda 实现
    final void zab() [...]

    public final void zac(@Nullable String s) {
        this.zal = s;
    }

    @WorkerThread
    private final void zad() {
        if(Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient\'s handler thread.");
        }
    }
}

