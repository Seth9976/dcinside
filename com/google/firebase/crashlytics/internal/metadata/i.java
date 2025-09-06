package com.google.firebase.crashlytics.internal.metadata;

import c2.a;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.json.e;
import org.json.JSONException;
import org.json.JSONObject;

@a
@AutoValue
public abstract class i {
    private static final int a = 0x100;
    public static final com.google.firebase.encoders.a b;

    static {
        i.b = new e().k(com.google.firebase.crashlytics.internal.metadata.a.b).j();
    }

    static i a(String s) throws JSONException {
        JSONObject jSONObject0 = new JSONObject(s);
        return i.b(jSONObject0.getString("rolloutId"), jSONObject0.getString("parameterKey"), jSONObject0.getString("parameterValue"), jSONObject0.getString("variantId"), jSONObject0.getLong("templateVersion"));
    }

    public static i b(String s, String s1, String s2, String s3, long v) {
        return new b(s, s1, i.i(s2), s3, v);
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public com.google.firebase.crashlytics.internal.model.F.f.d.e h() {
        return com.google.firebase.crashlytics.internal.model.F.f.d.e.a().d(com.google.firebase.crashlytics.internal.model.F.f.d.e.b.a().c(this.g()).b(this.e()).a()).b(this.c()).c(this.d()).e(this.f()).a();
    }

    private static String i(String s) {
        return s.length() <= 0x100 ? s : s.substring(0, 0x100);
    }
}

