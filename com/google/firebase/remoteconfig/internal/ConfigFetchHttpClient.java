package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.pm.PackageInfoCompat;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.q;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.u;
import j..util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private static final String h = "X-Goog-Api-Key";
    private static final String i = "ETag";
    private static final String j = "If-None-Match";
    private static final String k = "X-Android-Package";
    private static final String l = "X-Android-Cert";
    private static final String m = "X-Google-GFE-Can-Retry";
    private static final String n = "X-Goog-Firebase-Installations-Auth";
    private static final String o = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'";
    private static final Pattern p;

    static {
        ConfigFetchHttpClient.p = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }

    public ConfigFetchHttpClient(Context context0, String s, String s1, String s2, long v, long v1) {
        this.a = context0;
        this.b = s;
        this.c = s1;
        this.d = ConfigFetchHttpClient.f(s);
        this.e = s2;
        this.f = v;
        this.g = v1;
    }

    private boolean a(JSONObject jSONObject0) {
        try {
            return !jSONObject0.get("state").equals("NO_CHANGE");
        }
        catch(JSONException unused_ex) {
            return true;
        }
    }

    private String b(long v) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat0.format(v);
    }

    private JSONObject c(String s, String s1, Map map0, Long long0) throws q {
        HashMap hashMap0 = new HashMap();
        if(s == null) {
            throw new q("Fetch failed: Firebase installation id is null.");
        }
        hashMap0.put("appInstanceId", s);
        hashMap0.put("appInstanceIdToken", s1);
        hashMap0.put("appId", this.b);
        Locale locale0 = this.a.getResources().getConfiguration().locale;
        hashMap0.put("countryCode", locale0.getCountry());
        int v = Build.VERSION.SDK_INT;
        hashMap0.put("languageCode", locale0.toLanguageTag());
        hashMap0.put("platformVersion", Integer.toString(v));
        hashMap0.put("timeZone", "Asia/Shanghai");
        try {
            PackageInfo packageInfo0 = this.a.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
            if(packageInfo0 != null) {
                hashMap0.put("appVersion", packageInfo0.versionName);
                hashMap0.put("appBuild", Long.toString(PackageInfoCompat.c(packageInfo0)));
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        hashMap0.put("packageName", "com.dcinside.app.android");
        hashMap0.put("sdkVersion", "22.0.0");
        hashMap0.put("analyticsUserProperties", new JSONObject(map0));
        if(long0 != null) {
            hashMap0.put("firstOpenTime", this.b(((long)long0)));
        }
        return new JSONObject(hashMap0);
    }

    HttpURLConnection d() throws r {
        try {
            return (HttpURLConnection)new URL(this.i(this.d, this.e)).openConnection();
        }
        catch(IOException iOException0) {
            throw new r(iOException0.getMessage());
        }
    }

    private static h e(JSONObject jSONObject0, Date date0) throws q {
        JSONObject jSONObject2;
        JSONArray jSONArray1;
        JSONObject jSONObject1;
        try {
            b h$b0 = h.l().e(date0);
            JSONArray jSONArray0 = null;
            try {
                jSONObject1 = null;
                jSONObject1 = jSONObject0.getJSONObject("entries");
            }
            catch(JSONException unused_ex) {
            }
            if(jSONObject1 != null) {
                h$b0 = h$b0.c(jSONObject1);
            }
            try {
                jSONArray1 = null;
                jSONArray1 = jSONObject0.getJSONArray("experimentDescriptions");
            }
            catch(JSONException unused_ex) {
            }
            if(jSONArray1 != null) {
                h$b0 = h$b0.d(jSONArray1);
            }
            try {
                jSONObject2 = null;
                jSONObject2 = jSONObject0.getJSONObject("personalizationMetadata");
            }
            catch(JSONException unused_ex) {
            }
            if(jSONObject2 != null) {
                h$b0 = h$b0.f(jSONObject2);
            }
            String s = jSONObject0.has("templateVersion") ? jSONObject0.getString("templateVersion") : null;
            if(s != null) {
                h$b0.h(Long.parseLong(s));
            }
            try {
                jSONArray0 = jSONObject0.getJSONArray("rolloutMetadata");
            }
            catch(JSONException unused_ex) {
            }
            if(jSONArray0 != null) {
                h$b0 = h$b0.g(jSONArray0);
            }
            return h$b0.a();
        }
        catch(JSONException jSONException0) {
            throw new q("Fetch failed: fetch response could not be parsed.", jSONException0);
        }
    }

    private static String f(String s) {
        Matcher matcher0 = ConfigFetchHttpClient.p.matcher(s);
        return matcher0.matches() ? matcher0.group(1) : null;
    }

    @Keep
    a fetch(HttpURLConnection httpURLConnection0, String s, String s1, Map map0, String s2, Map map1, Long long0, Date date0) throws r {
        JSONObject jSONObject0;
        String s3;
        int v;
        this.o(httpURLConnection0, s2, s1, map1);
        try {
            v = FIN.finallyOpen$NT();
            this.n(httpURLConnection0, this.c(s, s1, map0, long0).toString().getBytes("utf-8"));
            httpURLConnection0.connect();
            int v1 = httpURLConnection0.getResponseCode();
            if(v1 != 200) {
                FIN.finallyExec$NT(v);
                throw new u(v1, httpURLConnection0.getResponseMessage());
            }
            s3 = httpURLConnection0.getHeaderField("ETag");
            jSONObject0 = this.h(httpURLConnection0);
        }
        catch(IOException | JSONException iOException0) {
            FIN.finallyExec$NT(v);
            throw new q("The client had an error while calling the backend!", iOException0);
        }
        FIN.finallyCodeBegin$NT(v);
        httpURLConnection0.disconnect();
        try {
            httpURLConnection0.getInputStream().close();
            FIN.finallyCodeEnd$NT(v);
        }
        catch(IOException unused_ex) {
        }
        h h0 = ConfigFetchHttpClient.e(jSONObject0, date0);
        return this.a(jSONObject0) ? a.b(h0, s3) : a.a(date0, h0);
    }

    @VisibleForTesting
    public long g() {
        return this.f;
    }

    private JSONObject h(URLConnection uRLConnection0) throws IOException, JSONException {
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(uRLConnection0.getInputStream(), "utf-8"));
        StringBuilder stringBuilder0 = new StringBuilder();
        int v;
        while((v = bufferedReader0.read()) != -1) {
            stringBuilder0.append(((char)v));
        }
        return new JSONObject(stringBuilder0.toString());
    }

    private String i(String s, String s1) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", s, s1);
    }

    private String j() {
        try {
            byte[] arr_b = AndroidUtilsLight.getPackageCertificateHashBytes(this.a, "com.dcinside.app.android");
            if(arr_b == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: com.dcinside.app.android");
                return null;
            }
            return Hex.bytesToStringUppercase(arr_b, false);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        Log.e("FirebaseRemoteConfig", "No such package: com.dcinside.app.android", packageManager$NameNotFoundException0);
        return null;
    }

    @VisibleForTesting
    public long k() {
        return this.g;
    }

    private void l(HttpURLConnection httpURLConnection0, String s) {
        httpURLConnection0.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection0.setRequestProperty("X-Android-Package", "com.dcinside.app.android");
        httpURLConnection0.setRequestProperty("X-Android-Cert", this.j());
        httpURLConnection0.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection0.setRequestProperty("X-Goog-Firebase-Installations-Auth", s);
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept", "application/json");
    }

    private void m(HttpURLConnection httpURLConnection0, Map map0) {
        for(Object object0: map0.entrySet()) {
            httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
    }

    private void n(HttpURLConnection httpURLConnection0, byte[] arr_b) throws IOException {
        httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
        bufferedOutputStream0.write(arr_b);
        bufferedOutputStream0.flush();
        bufferedOutputStream0.close();
    }

    private void o(HttpURLConnection httpURLConnection0, String s, String s1, Map map0) {
        httpURLConnection0.setDoOutput(true);
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        httpURLConnection0.setConnectTimeout(((int)timeUnit0.toMillis(this.f)));
        httpURLConnection0.setReadTimeout(((int)timeUnit0.toMillis(this.g)));
        httpURLConnection0.setRequestProperty("If-None-Match", s);
        this.l(httpURLConnection0, s1);
        this.m(httpURLConnection0, map0);
    }
}

