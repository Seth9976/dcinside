package com.google.android.gms.common.api;

import O1.a;
import O1.l;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d4.c;
import java.util.Collections;
import java.util.Set;

public abstract class GoogleApi implements HasApiKey {
    @KeepForSdk
    public static class Settings {
        @KeepForSdk
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @NonNull
            @KeepForSdk
            public Settings build() {
                if(this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if(this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, null, this.zab, null);
            }

            @a
            @NonNull
            @KeepForSdk
            public Builder setLooper(@NonNull Looper looper0) {
                Preconditions.checkNotNull(looper0, "Looper must not be null.");
                this.zab = looper0;
                return this;
            }

            @a
            @NonNull
            @KeepForSdk
            public Builder setMapper(@NonNull StatusExceptionMapper statusExceptionMapper0) {
                Preconditions.checkNotNull(statusExceptionMapper0, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper0;
                return this;
            }
        }

        @NonNull
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS;
        @NonNull
        public final StatusExceptionMapper zaa;
        @NonNull
        public final Looper zab;

        static {
            Settings.DEFAULT_SETTINGS = new Builder().build();
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper0, Account account0, Looper looper0) {
            this.zaa = statusExceptionMapper0;
            this.zab = looper0;
        }

        Settings(StatusExceptionMapper statusExceptionMapper0, Account account0, Looper looper0, zae zae0) {
            this(statusExceptionMapper0, null, looper0);
        }
    }

    @NonNull
    protected final GoogleApiManager zaa;
    private final Context zab;
    @Nullable
    private final String zac;
    private final Api zad;
    private final ApiOptions zae;
    private final ApiKey zaf;
    private final Looper zag;
    private final int zah;
    @c
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    @MainThread
    @KeepForSdk
    public GoogleApi(@NonNull Activity activity0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull Settings googleApi$Settings0) {
        this(activity0, activity0, api0, api$ApiOptions0, googleApi$Settings0);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        googleApi$Settings$Builder0.setLooper(activity0.getMainLooper());
        this(activity0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    private GoogleApi(@NonNull Context context0, @Nullable Activity activity0, Api api0, ApiOptions api$ApiOptions0, Settings googleApi$Settings0) {
        Preconditions.checkNotNull(context0, "Null context is not permitted.");
        Preconditions.checkNotNull(api0, "Api must not be null.");
        Preconditions.checkNotNull(googleApi$Settings0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context1 = (Context)Preconditions.checkNotNull(context0.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context1;
        String s = Build.VERSION.SDK_INT < 30 ? null : context0.getAttributionTag();
        this.zac = s;
        this.zad = api0;
        this.zae = api$ApiOptions0;
        this.zag = googleApi$Settings0.zab;
        ApiKey apiKey0 = ApiKey.getSharedApiKey(api0, api$ApiOptions0, s);
        this.zaf = apiKey0;
        this.zai = new zabv(this);
        GoogleApiManager googleApiManager0 = GoogleApiManager.zak(context1);
        this.zaa = googleApiManager0;
        this.zah = googleApiManager0.zaa();
        this.zaj = googleApi$Settings0.zaa;
        if(activity0 != null && !(activity0 instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity0, googleApiManager0, apiKey0);
        }
        googleApiManager0.zaz(this);
    }

    @l(imports = {"com.google.android.gms.common.api.GoogleApi.Settings"}, replacement = "this(context, api, options, new Settings.Builder().setLooper(looper).setMapper(mapper).build())")
    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull Looper looper0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setLooper(looper0);
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        this(context0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull Settings googleApi$Settings0) {
        this(context0, null, api0, api$ApiOptions0, googleApi$Settings0);
    }

    @l(imports = {"com.google.android.gms.common.api.GoogleApi.Settings"}, replacement = "this(context, api, options, new Settings.Builder().setMapper(mapper).build())")
    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context0, @NonNull Api api0, @NonNull ApiOptions api$ApiOptions0, @NonNull StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        this(context0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    @NonNull
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @NonNull
    @KeepForSdk
    protected com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        Set set0;
        Account account0;
        com.google.android.gms.common.internal.ClientSettings.Builder clientSettings$Builder0 = new com.google.android.gms.common.internal.ClientSettings.Builder();
        ApiOptions api$ApiOptions0 = this.zae;
        if(api$ApiOptions0 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount0 = ((HasGoogleSignInAccountOptions)api$ApiOptions0).getGoogleSignInAccount();
            if(googleSignInAccount0 == null) {
                account0 = this.zae instanceof HasAccountOptions ? ((HasAccountOptions)this.zae).getAccount() : null;
            }
            else {
                account0 = googleSignInAccount0.getAccount();
            }
        }
        else {
            account0 = this.zae instanceof HasAccountOptions ? ((HasAccountOptions)this.zae).getAccount() : null;
        }
        clientSettings$Builder0.zab(account0);
        ApiOptions api$ApiOptions1 = this.zae;
        if(api$ApiOptions1 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount1 = ((HasGoogleSignInAccountOptions)api$ApiOptions1).getGoogleSignInAccount();
            set0 = googleSignInAccount1 == null ? Collections.emptySet() : googleSignInAccount1.getRequestedScopes();
        }
        else {
            set0 = Collections.emptySet();
        }
        clientSettings$Builder0.zaa(set0);
        clientSettings$Builder0.zac(this.zab.getClass().getName());
        clientSettings$Builder0.setRealClientPackageName("com.dcinside.app.android");
        return clientSettings$Builder0;
    }

    @NonNull
    @KeepForSdk
    protected Task disconnectService() {
        return this.zaa.zan(this);
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl doBestEffortWrite(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.zad(2, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doBestEffortWrite(@NonNull TaskApiCall taskApiCall0) {
        return this.zae(2, taskApiCall0);
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl doRead(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.zad(0, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doRead(@NonNull TaskApiCall taskApiCall0) {
        return this.zae(0, taskApiCall0);
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    @Deprecated
    public Task doRegisterEventListener(@NonNull RegisterListenerMethod registerListenerMethod0, @NonNull UnregisterListenerMethod unregisterListenerMethod0) {
        Preconditions.checkNotNull(registerListenerMethod0);
        Preconditions.checkNotNull(unregisterListenerMethod0);
        Preconditions.checkNotNull(registerListenerMethod0.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(unregisterListenerMethod0.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(registerListenerMethod0.getListenerKey(), unregisterListenerMethod0.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zao(this, registerListenerMethod0, unregisterListenerMethod0, zad.zaa);
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doRegisterEventListener(@NonNull RegistrationMethods registrationMethods0) {
        Preconditions.checkNotNull(registrationMethods0);
        Preconditions.checkNotNull(registrationMethods0.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods0.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zao(this, registrationMethods0.register, registrationMethods0.zaa, registrationMethods0.zab);
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doUnregisterEventListener(@NonNull ListenerKey listenerHolder$ListenerKey0) {
        return this.doUnregisterEventListener(listenerHolder$ListenerKey0, 0);
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doUnregisterEventListener(@NonNull ListenerKey listenerHolder$ListenerKey0, int v) {
        Preconditions.checkNotNull(listenerHolder$ListenerKey0, "Listener key cannot be null.");
        return this.zaa.zap(this, listenerHolder$ListenerKey0, v);
    }

    @NonNull
    @KeepForSdk
    public ApiMethodImpl doWrite(@NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.zad(1, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @NonNull
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doWrite(@NonNull TaskApiCall taskApiCall0) {
        return this.zae(1, taskApiCall0);
    }

    @Nullable
    protected String getApiFallbackAttributionTag(@NonNull Context context0) [...] // Inlined contents

    @Override  // com.google.android.gms.common.api.HasApiKey
    @NonNull
    public final ApiKey getApiKey() {
        return this.zaf;
    }

    @NonNull
    @KeepForSdk
    public ApiOptions getApiOptions() {
        return this.zae;
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @Nullable
    @KeepForSdk
    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @NonNull
    @KeepForSdk
    public ListenerHolder registerListener(@NonNull Object object0, @NonNull String s) {
        return ListenerHolders.createListenerHolder(object0, this.zag, s);
    }

    public final int zaa() {
        return this.zah;
    }

    @WorkerThread
    public final Client zab(Looper looper0, zabq zabq0) {
        ClientSettings clientSettings0 = this.createClientSettingsBuilder().build();
        Client api$Client0 = ((AbstractClientBuilder)Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper0, clientSettings0, this.zae, zabq0, zabq0);
        String s = this.getContextAttributionTag();
        if(s != null && api$Client0 instanceof BaseGmsClient) {
            ((BaseGmsClient)api$Client0).setAttributionTag(s);
        }
        if(s != null && api$Client0 instanceof NonGmsServiceBrokerClient) {
            ((NonGmsServiceBrokerClient)api$Client0).zac(s);
        }
        return api$Client0;
    }

    public final zact zac(Context context0, Handler handler0) {
        return new zact(context0, handler0, this.createClientSettingsBuilder().build());
    }

    private final ApiMethodImpl zad(int v, @NonNull ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.zaa.zau(this, v, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    private final Task zae(int v, @NonNull TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.zaa.zav(this, v, taskApiCall0, taskCompletionSource0, this.zaj);
        return taskCompletionSource0.getTask();
    }
}

