package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

@KeepForSdk
public abstract class GmsClient extends BaseGmsClient implements Client, zaj {
    @Nullable
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set zac;
    @Nullable
    private final Account zad;

    @VisibleForTesting
    @KeepForSdk
    protected GmsClient(@NonNull Context context0, @NonNull Handler handler0, int v, @NonNull ClientSettings clientSettings0) {
        super(context0, handler0, GmsClientSupervisor.getInstance(context0), GoogleApiAvailability.getInstance(), v, null, null);
        this.zab = (ClientSettings)Preconditions.checkNotNull(clientSettings0);
        this.zad = clientSettings0.getAccount();
        this.zac = this.zaa(clientSettings0.getAllRequestedScopes());
    }

    @KeepForSdk
    protected GmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @NonNull ClientSettings clientSettings0) {
        this(context0, looper0, GmsClientSupervisor.getInstance(context0), GoogleApiAvailability.getInstance(), v, clientSettings0, null, null);
    }

    @KeepForSdk
    @Deprecated
    protected GmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @NonNull ClientSettings clientSettings0, @NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0, @NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this(context0, looper0, v, clientSettings0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    @KeepForSdk
    protected GmsClient(@NonNull Context context0, @NonNull Looper looper0, int v, @NonNull ClientSettings clientSettings0, @NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks0, @NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, GmsClientSupervisor.getInstance(context0), GoogleApiAvailability.getInstance(), v, clientSettings0, ((com.google.android.gms.common.api.internal.ConnectionCallbacks)Preconditions.checkNotNull(connectionCallbacks0)), ((com.google.android.gms.common.api.internal.OnConnectionFailedListener)Preconditions.checkNotNull(onConnectionFailedListener0)));
    }

    @VisibleForTesting
    protected GmsClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull GmsClientSupervisor gmsClientSupervisor0, @NonNull GoogleApiAvailability googleApiAvailability0, int v, @NonNull ClientSettings clientSettings0, @Nullable com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks0, @Nullable com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener0) {
        super(context0, looper0, gmsClientSupervisor0, googleApiAvailability0, v, (connectionCallbacks0 == null ? null : new zah(connectionCallbacks0)), (onConnectionFailedListener0 == null ? null : new zai(onConnectionFailedListener0)), clientSettings0.zac());
        this.zab = clientSettings0;
        this.zad = clientSettings0.getAccount();
        this.zac = this.zaa(clientSettings0.getAllRequestedScopes());
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public final Account getAccount() {
        return this.zad;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    @KeepForSdk
    protected Executor getBindServiceExecutor() {
        return null;
    }

    @NonNull
    @KeepForSdk
    protected final ClientSettings getClientSettings() {
        return this.zab;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    @KeepForSdk
    protected final Set getScopes() {
        return this.zac;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    @KeepForSdk
    public Set getScopesForConnectionlessNonSignIn() {
        return this.requiresSignIn() ? this.zac : Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    protected Set validateScopes(@NonNull Set set0) [...] // Inlined contents

    private final Set zaa(@NonNull Set set0) {
        for(Object object0: set0) {
            if(!set0.contains(((Scope)object0))) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
            if(false) {
                break;
            }
        }
        return set0;
    }
}

