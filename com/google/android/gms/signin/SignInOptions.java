package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;

public final class SignInOptions implements Optional {
    @NonNull
    public static final SignInOptions zaa;
    private final boolean zab;
    private final boolean zac;
    @Nullable
    private final String zad;
    private final boolean zae;
    @Nullable
    private final String zaf;
    @Nullable
    private final String zag;
    private final boolean zah;
    @Nullable
    private final Long zai;
    @Nullable
    private final Long zaj;

    static {
        SignInOptions.zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
    }

    SignInOptions(boolean z, boolean z1, String s, boolean z2, String s1, String s2, boolean z3, Long long0, Long long1, zaf zaf0) {
        this.zab = false;
        this.zac = false;
        this.zad = null;
        this.zae = false;
        this.zah = false;
        this.zaf = null;
        this.zag = null;
        this.zai = null;
        this.zaj = null;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof SignInOptions)) {
            return false;
        }
        SignInOptions signInOptions0 = (SignInOptions)object0;
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.FALSE, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null});
    }
}

