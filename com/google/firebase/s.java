package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class s {
    static class a {
    }

    public static final class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        public b() {
        }

        public b(@NonNull s s0) {
            this.b = s0.b;
            this.a = s0.a;
            this.c = s0.c;
            this.d = s0.d;
            this.e = s0.e;
            this.f = s0.f;
            this.g = s0.g;
        }

        @NonNull
        public s a() {
            return new s(this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
        }

        @NonNull
        public b b(@NonNull String s) {
            this.a = Preconditions.checkNotEmpty(s, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public b c(@NonNull String s) {
            this.b = Preconditions.checkNotEmpty(s, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public b d(@Nullable String s) {
            this.c = s;
            return this;
        }

        @NonNull
        @KeepForSdk
        public b e(@Nullable String s) {
            this.d = s;
            return this;
        }

        @NonNull
        public b f(@Nullable String s) {
            this.e = s;
            return this;
        }

        @NonNull
        public b g(@Nullable String s) {
            this.g = s;
            return this;
        }

        @NonNull
        public b h(@Nullable String s) {
            this.f = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private static final String h = "google_api_key";
    private static final String i = "google_app_id";
    private static final String j = "firebase_database_url";
    private static final String k = "ga_trackingId";
    private static final String l = "gcm_defaultSenderId";
    private static final String m = "google_storage_bucket";
    private static final String n = "project_id";

    private s(@NonNull String s, @NonNull String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(s), "ApplicationId must be set.");
        this.b = s;
        this.a = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
    }

    s(String s, String s1, String s2, String s3, String s4, String s5, String s6, a s$a0) {
        this(s, s1, s2, s3, s4, s5, s6);
    }

    // 去混淆评级： 中等(80)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof s ? Objects.equal(this.b, ((s)object0).b) && Objects.equal(this.a, ((s)object0).a) && Objects.equal(this.c, ((s)object0).c) && Objects.equal(this.d, ((s)object0).d) && Objects.equal(this.e, ((s)object0).e) && Objects.equal(this.f, ((s)object0).f) && Objects.equal(this.g, ((s)object0).g) : false;
    }

    @Nullable
    public static s h(@NonNull Context context0) {
        StringResourceValueReader stringResourceValueReader0 = new StringResourceValueReader(context0);
        String s = stringResourceValueReader0.getString("google_app_id");
        return TextUtils.isEmpty(s) ? null : new s(s, stringResourceValueReader0.getString("google_api_key"), stringResourceValueReader0.getString("firebase_database_url"), stringResourceValueReader0.getString("ga_trackingId"), stringResourceValueReader0.getString("gcm_defaultSenderId"), stringResourceValueReader0.getString("google_storage_bucket"), stringResourceValueReader0.getString("project_id"));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    @NonNull
    public String i() {
        return this.a;
    }

    @NonNull
    public String j() {
        return this.b;
    }

    @Nullable
    public String k() {
        return this.c;
    }

    @Nullable
    @KeepForSdk
    public String l() {
        return this.d;
    }

    @Nullable
    public String m() {
        return this.e;
    }

    @Nullable
    public String n() {
        return this.g;
    }

    @Nullable
    public String o() {
        return this.f;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}

