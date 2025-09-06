package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import c2.a;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.json.e;
import org.json.JSONException;
import org.json.JSONObject;

@a
@AutoValue
public abstract class d {
    @AutoValue.Builder
    public static abstract class com.google.firebase.remoteconfig.interop.rollouts.d.a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract com.google.firebase.remoteconfig.interop.rollouts.d.a b(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.remoteconfig.interop.rollouts.d.a c(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.remoteconfig.interop.rollouts.d.a d(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.remoteconfig.interop.rollouts.d.a e(long arg1);

        @NonNull
        public abstract com.google.firebase.remoteconfig.interop.rollouts.d.a f(@NonNull String arg1);
    }

    private static final String a = "rolloutId";
    private static final String b = "variantId";
    private static final String c = "parameterKey";
    private static final String d = "parameterValue";
    private static final String e = "templateVersion";
    public static final com.google.firebase.encoders.a f;

    static {
        d.f = new e().k(com.google.firebase.remoteconfig.interop.rollouts.a.b).j();
    }

    @NonNull
    public static com.google.firebase.remoteconfig.interop.rollouts.d.a a() {
        return new b();
    }

    @NonNull
    public static d b(@NonNull String s) throws JSONException {
        return d.c(new JSONObject(s));
    }

    @NonNull
    public static d c(@NonNull JSONObject jSONObject0) throws JSONException {
        return d.a().d(jSONObject0.getString("rolloutId")).f(jSONObject0.getString("variantId")).b(jSONObject0.getString("parameterKey")).c(jSONObject0.getString("parameterValue")).e(jSONObject0.getLong("templateVersion")).a();
    }

    @NonNull
    public abstract String d();

    @NonNull
    public abstract String e();

    @NonNull
    public abstract String f();

    public abstract long g();

    @NonNull
    public abstract String h();
}

