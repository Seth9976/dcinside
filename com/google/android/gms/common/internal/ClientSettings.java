package com.google.android.gms.common.internal;

import O1.a;
import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.signin.SignInOptions;
import j..util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o3.h;

@KeepForSdk
public final class ClientSettings {
    @KeepForSdk
    public static final class Builder {
        @h
        private Account zaa;
        private ArraySet zab;
        private String zac;
        private String zad;
        private final SignInOptions zae;

        public Builder() {
            this.zae = SignInOptions.zaa;
        }

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String s) {
            this.zac = s;
            return this;
        }

        @a
        @NonNull
        public final Builder zaa(@NonNull Collection collection0) {
            if(this.zab == null) {
                this.zab = new ArraySet();
            }
            this.zab.addAll(collection0);
            return this;
        }

        @a
        @NonNull
        public final Builder zab(@h Account account0) {
            this.zaa = account0;
            return this;
        }

        @a
        @NonNull
        public final Builder zac(@NonNull String s) {
            this.zad = s;
            return this;
        }
    }

    @h
    private final Account zaa;
    private final Set zab;
    private final Set zac;
    private final Map zad;
    private final int zae;
    @h
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    @KeepForSdk
    public ClientSettings(@NonNull Account account0, @NonNull Set set0, @NonNull Map map0, int v, @h View view0, @NonNull String s, @NonNull String s1, @h SignInOptions signInOptions0) {
        this(account0, set0, map0, v, view0, s, s1, signInOptions0, false);
    }

    public ClientSettings(@h Account account0, @NonNull Set set0, @NonNull Map map0, int v, @h View view0, @NonNull String s, @NonNull String s1, @h SignInOptions signInOptions0, boolean z) {
        this.zaa = account0;
        Set set1 = set0 == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(set0);
        this.zab = set1;
        if(map0 == null) {
            map0 = Collections.emptyMap();
        }
        this.zad = map0;
        this.zaf = view0;
        this.zae = v;
        this.zag = s;
        this.zah = s1;
        if(signInOptions0 == null) {
            signInOptions0 = SignInOptions.zaa;
        }
        this.zai = signInOptions0;
        HashSet hashSet0 = new HashSet(set1);
        for(Object object0: map0.values()) {
            hashSet0.addAll(((zab)object0).zaa);
        }
        this.zac = DesugarCollections.unmodifiableSet(hashSet0);
    }

    @NonNull
    @KeepForSdk
    public static ClientSettings createDefault(@NonNull Context context0) {
        return new com.google.android.gms.common.api.GoogleApiClient.Builder(context0).zaa();
    }

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.zaa;
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        return this.zaa == null ? null : this.zaa.name;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        return this.zaa == null ? new Account("<<default account>>", "com.google") : this.zaa;
    }

    @NonNull
    @KeepForSdk
    public Set getAllRequestedScopes() {
        return this.zac;
    }

    @NonNull
    @KeepForSdk
    public Set getApplicableScopes(@NonNull Api api0) {
        zab zab0 = (zab)this.zad.get(api0);
        if(zab0 != null && !zab0.zaa.isEmpty()) {
            Set set0 = new HashSet(this.zab);
            set0.addAll(zab0.zaa);
            return set0;
        }
        return this.zab;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @NonNull
    @KeepForSdk
    public Set getRequiredScopes() {
        return this.zab;
    }

    @Nullable
    @KeepForSdk
    public View getViewForPopups() {
        return this.zaf;
    }

    @NonNull
    public final SignInOptions zaa() {
        return this.zai;
    }

    @Nullable
    public final Integer zab() {
        return this.zaj;
    }

    @Nullable
    public final String zac() {
        return this.zah;
    }

    @NonNull
    public final Map zad() {
        return this.zad;
    }

    public final void zae(@NonNull Integer integer0) {
        this.zaj = integer0;
    }
}

