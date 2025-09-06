package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.h;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    @GuardedBy("iidPrefs")
    private final SharedPreferences a;
    private final String b;
    private static final String c = "com.google.android.gms.appid";
    private static final String d = "|S||P|";
    private static final String e = "|S|id";
    private static final String f = "|T|";
    private static final String g = "|";
    private static final String h = "token";
    private static final String i = "{";
    private static final String[] j;

    static {
        b.j = new String[]{"*", "FCM", "GCM", ""};
    }

    @VisibleForTesting
    public b(@NonNull SharedPreferences sharedPreferences0, @Nullable String s) {
        this.a = sharedPreferences0;
        this.b = s;
    }

    public b(@NonNull h h0) {
        this.a = h0.n().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b.b(h0);
    }

    private String a(@NonNull String s, @NonNull String s1) {
        return "|T|" + s + "|" + s1;
    }

    private static String b(h h0) {
        String s = h0.s().m();
        if(s != null) {
            return s;
        }
        String s1 = h0.s().j();
        if(!s1.startsWith("1:") && !s1.startsWith("2:")) {
            return s1;
        }
        String[] arr_s = s1.split(":");
        if(arr_s.length != 4) {
            return null;
        }
        String s2 = arr_s[1];
        return s2.isEmpty() ? null : s2;
    }

    @Nullable
    private static String c(@NonNull PublicKey publicKey0) {
        byte[] arr_b = publicKey0.getEncoded();
        try {
            byte[] arr_b1 = MessageDigest.getInstance("SHA1").digest(arr_b);
            arr_b1[0] = (byte)((arr_b1[0] & 15) + 0x70 & 0xFF);
            return Base64.encodeToString(arr_b1, 0, 8, 11);
        }
        catch(NoSuchAlgorithmException unused_ex) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String s) {
        try {
            return new JSONObject(s).getString("token");
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Nullable
    private PublicKey e(String s) {
        try {
            byte[] arr_b = Base64.decode(s, 8);
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
        }
        catch(IllegalArgumentException | InvalidKeySpecException | NoSuchAlgorithmException illegalArgumentException0) {
            Log.w("ContentValues", "Invalid key stored " + illegalArgumentException0);
            return null;
        }
    }

    @Nullable
    public String f() {
        synchronized(this.a) {
            String s = this.g();
            if(s != null) {
                return s;
            }
        }
        return this.h();
    }

    @Nullable
    private String g() {
        synchronized(this.a) {
        }
        return this.a.getString("|S|id", null);
    }

    @Nullable
    private String h() {
        PublicKey publicKey0;
        synchronized(this.a) {
            String s = this.a.getString("|S||P|", null);
            if(s == null) {
                return null;
            }
            publicKey0 = this.e(s);
            if(publicKey0 == null) {
                return null;
            }
        }
        return b.c(publicKey0);
    }

    @Nullable
    public String i() {
        synchronized(this.a) {
            String[] arr_s = b.j;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s = this.a(this.b, arr_s[v1]);
                String s1 = this.a.getString(s, null);
                if(s1 != null && !s1.isEmpty()) {
                    if(s1.startsWith("{")) {
                        s1 = this.d(s1);
                    }
                    return s1;
                }
            }
            return null;
        }
    }
}

