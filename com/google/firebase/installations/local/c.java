package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    public static enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR;

        private static a[] a() [...] // Inlined contents
    }

    private File a;
    @NonNull
    private final h b;
    private static final String c = "PersistedInstallation";
    private static final String d = "Fid";
    private static final String e = "AuthToken";
    private static final String f = "RefreshToken";
    private static final String g = "TokenCreationEpochInSecs";
    private static final String h = "ExpiresInSecs";
    private static final String i = "Status";
    private static final String j = "FisError";

    public c(@NonNull h h0) {
        this.b = h0;
    }

    public void a() {
        this.b().delete();
    }

    private File b() {
        if(this.a == null) {
            synchronized(this) {
                if(this.a == null) {
                    this.a = new File(this.b.n().getFilesDir(), "PersistedInstallation." + this.b.t() + ".json");
                }
            }
        }
        return this.a;
    }

    @NonNull
    public d c(@NonNull d d0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("Fid", d0.d());
            jSONObject0.put("Status", d0.g().ordinal());
            jSONObject0.put("AuthToken", d0.b());
            jSONObject0.put("RefreshToken", d0.f());
            jSONObject0.put("TokenCreationEpochInSecs", d0.h());
            jSONObject0.put("ExpiresInSecs", d0.c());
            jSONObject0.put("FisError", d0.e());
            File file0 = File.createTempFile("PersistedInstallation", "tmp", this.b.n().getFilesDir());
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            fileOutputStream0.write(jSONObject0.toString().getBytes("UTF-8"));
            fileOutputStream0.close();
            file0.renameTo(this.b());
        }
        catch(JSONException | IOException unused_ex) {
        }
        return d0;
    }

    private JSONObject d() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x4000];
        try(FileInputStream fileInputStream0 = new FileInputStream(this.b())) {
            while(true) {
                int v = fileInputStream0.read(arr_b, 0, 0x4000);
                if(v < 0) {
                    return new JSONObject(byteArrayOutputStream0.toString());
                }
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
        }
        catch(IOException | JSONException unused_ex) {
            return new JSONObject();
        }
    }

    @NonNull
    public d e() {
        JSONObject jSONObject0 = this.d();
        String s = jSONObject0.optString("Fid", null);
        int v = jSONObject0.optInt("Status", a.a.ordinal());
        String s1 = jSONObject0.optString("AuthToken", null);
        String s2 = jSONObject0.optString("RefreshToken", null);
        long v1 = jSONObject0.optLong("TokenCreationEpochInSecs", 0L);
        long v2 = jSONObject0.optLong("ExpiresInSecs", 0L);
        String s3 = jSONObject0.optString("FisError", null);
        return d.a().d(s).g(a.values()[v]).b(s1).f(s2).h(v1).c(v2).e(s3).a();
    }
}

