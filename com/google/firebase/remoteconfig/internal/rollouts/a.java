package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.interop.rollouts.d;
import com.google.firebase.remoteconfig.interop.rollouts.e;
import com.google.firebase.remoteconfig.q;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    g a;
    g b;

    a(g g0, g g1) {
        this.a = g0;
        this.b = g1;
    }

    @NonNull
    public static a a(@NonNull g g0, @NonNull g g1) {
        return new a(g0, g1);
    }

    @NonNull
    e b(@NonNull h h0) throws q {
        JSONArray jSONArray0 = h0.j();
        long v = h0.k();
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        while(v1 < jSONArray0.length()) {
            try {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v1);
                String s = jSONObject0.getString("rolloutId");
                JSONArray jSONArray1 = jSONObject0.getJSONArray("affectedParameterKeys");
                if(jSONArray1.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", s, jSONArray1));
                }
                String s1 = jSONArray1.optString(0, "");
                String s2 = this.c(s1);
                hashSet0.add(d.a().d(s).f(jSONObject0.getString("variantId")).b(s1).c(s2).e(v).a());
                ++v1;
                continue;
            }
            catch(JSONException jSONException0) {
            }
            throw new q("Exception parsing rollouts metadata to create RolloutsState.", jSONException0);
        }
        return e.a(hashSet0);
    }

    @NonNull
    private String c(@NonNull String s) {
        String s1 = a.d(this.a, s);
        if(s1 != null) {
            return s1;
        }
        String s2 = a.d(this.b, s);
        return s2 == null ? "" : s2;
    }

    @Nullable
    private static String d(@NonNull g g0, @NonNull String s) {
        h h0 = g0.g();
        if(h0 == null) {
            return null;
        }
        try {
            return h0.g().getString(s);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }
}

