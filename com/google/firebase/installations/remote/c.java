package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.j;
import com.google.firebase.installations.l.a;
import com.google.firebase.installations.l;
import h2.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static final String A = "x-goog-api-key";
    private static final int B = 10000;
    private static final Pattern C = null;
    private static final int D = 1;
    private static final Charset E = null;
    private static final String F = "a:";
    private static final String G = "Firebase-Installations";
    @VisibleForTesting
    static final String H = "Invalid Expiration Timestamp.";
    private boolean a;
    private final Context b;
    private final b c;
    private final e d;
    private static final int e = 0x8000;
    private static final int f = 0x8001;
    private static final int g = 0x8002;
    private static final int h = 0x8003;
    private static final String i = "firebaseinstallations.googleapis.com";
    private static final String j = "projects/%s/installations";
    private static final String k = "projects/%s/installations/%s/authTokens:generate";
    private static final String l = "projects/%s/installations/%s";
    private static final String m = "v1";
    private static final String n = "FIS_v2";
    private static final String o = "Content-Type";
    private static final String p = "Accept";
    private static final String q = "application/json";
    private static final String r = "Content-Encoding";
    private static final String s = "gzip";
    private static final String t = "Cache-Control";
    private static final String u = "no-cache";
    private static final String v = "fire-installations-id";
    private static final String w = "x-firebase-client";
    private static final String x = "X-Android-Package";
    private static final String y = "X-Android-Cert";
    private static final String z = "x-goog-fis-android-iid-migration-auth";

    static {
        c.C = Pattern.compile("[0-9]+s");
        c.E = Charset.forName("UTF-8");
    }

    public c(@NonNull Context context0, @NonNull b b0) {
        this.b = context0;
        this.c = b0;
        this.d = new e();
    }

    // 去混淆评级： 低(20)
    private static String a(@Nullable String s, @NonNull String s1, @NonNull String s2) {
        return TextUtils.isEmpty(s) ? String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", s1, s2, "") : String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", s1, s2, ", " + s);
    }

    private static JSONObject b(@Nullable String s, @NonNull String s1) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("fid", s);
            jSONObject0.put("appId", s1);
            jSONObject0.put("authVersion", "FIS_v2");
            jSONObject0.put("sdkVersion", "a:18.0.0");
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("installation", jSONObject0);
            return jSONObject1;
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
    }

    @NonNull
    public d d(@NonNull String s, @Nullable String s1, @NonNull String s2, @NonNull String s3, @Nullable String s4) throws l {
        d d0;
        int v = 0;
        if(!this.d.b()) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", a.b);
        }
        URL uRL0 = this.h(String.format("projects/%s/installations", s2));
        while(v <= 1) {
            TrafficStats.setThreadStatsTag(0x8001);
            HttpURLConnection httpURLConnection0 = this.m(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setDoOutput(true);
                if(s4 != null) {
                    httpURLConnection0.addRequestProperty("x-goog-fis-android-iid-migration-auth", s4);
                }
                this.r(httpURLConnection0, s1, s3);
                int v1 = httpURLConnection0.getResponseCode();
                this.d.f(v1);
                if(c.j(v1)) {
                    d0 = this.o(httpURLConnection0);
                }
                else {
                    c.l(httpURLConnection0, s3, s, s2);
                    if(v1 == 429) {
                        throw new l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", a.c);
                    }
                    if(v1 >= 500 && v1 < 600) {
                        goto label_30;
                    }
                    else {
                        c.k();
                        d0 = d.a().e(com.google.firebase.installations.remote.d.b.b).a();
                    }
                }
                goto label_27;
            }
            catch(AssertionError | IOException unused_ex) {
                goto label_30;
            }
            catch(Throwable throwable0) {
            }
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        label_27:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            return d0;
        label_30:
            httpURLConnection0.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++v;
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", a.b);
    }

    @NonNull
    public void e(@NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull String s3) throws l {
        URL uRL0 = this.h(String.format("projects/%s/installations/%s", s2, s1));
        for(int v = 0; v <= 1; ++v) {
            TrafficStats.setThreadStatsTag(0x8002);
            HttpURLConnection httpURLConnection0 = this.m(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("DELETE");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s3);
                int v2 = httpURLConnection0.getResponseCode();
                if(v2 == 200 || v2 == 401 || v2 == 404) {
                    return;
                }
                c.l(httpURLConnection0, null, s, s2);
                if(v2 != 429 && (v2 < 500 || v2 >= 600)) {
                    c.k();
                    throw new l("Bad config while trying to delete FID", a.a);
                }
            }
            catch(IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", a.b);
    }

    @NonNull
    public f f(@NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull String s3) throws l {
        int v = 0;
        if(!this.d.b()) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", a.b);
        }
        URL uRL0 = this.h(String.format("projects/%s/installations/%s/authTokens:generate", s2, s1));
        while(v <= 1) {
            TrafficStats.setThreadStatsTag(0x8003);
            HttpURLConnection httpURLConnection0 = this.m(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s3);
                httpURLConnection0.setDoOutput(true);
                this.s(httpURLConnection0);
                int v2 = httpURLConnection0.getResponseCode();
                this.d.f(v2);
                if(c.j(v2)) {
                    return this.q(httpURLConnection0);
                }
                c.l(httpURLConnection0, null, s, s2);
                switch(v2) {
                    case 401: 
                    case 404: {
                        return f.a().b(com.google.firebase.installations.remote.f.b.c).a();
                    }
                    case 429: {
                        throw new l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", a.c);
                    label_21:
                        if(v2 < 500 || v2 >= 600) {
                            c.k();
                            return f.a().b(com.google.firebase.installations.remote.f.b.b).a();
                        }
                        break;
                    }
                    default: {
                        goto label_21;
                    }
                }
            }
            catch(AssertionError | IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            ++v;
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", a.b);
    }

    private String g() {
        try {
            byte[] arr_b = AndroidUtilsLight.getPackageCertificateHashBytes(this.b, "com.dcinside.app.android");
            if(arr_b == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: com.dcinside.app.android");
                return null;
            }
            return Hex.bytesToStringUppercase(arr_b, false);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        Log.e("ContentValues", "No such package: com.dcinside.app.android", packageManager$NameNotFoundException0);
        return null;
    }

    private URL h(String s) throws l {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", s));
        }
        catch(MalformedURLException malformedURLException0) {
            throw new l(malformedURLException0.getMessage(), a.b);
        }
    }

    private static byte[] i(JSONObject jSONObject0) throws IOException [...] // 潜在的解密器

    private static boolean j(int v) {
        return v >= 200 && v < 300;
    }

    private static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void l(HttpURLConnection httpURLConnection0, @Nullable String s, @NonNull String s1, @NonNull String s2) {
        String s3 = c.p(httpURLConnection0);
        if(!TextUtils.isEmpty(s3)) {
            Log.w("Firebase-Installations", s3);
            Log.w("Firebase-Installations", c.a(s, s1, s2));
        }
    }

    private HttpURLConnection m(URL uRL0, String s) throws l {
        HttpURLConnection httpURLConnection0;
        try {
            httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        }
        catch(IOException unused_ex) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", a.b);
        }
        httpURLConnection0.setConnectTimeout(10000);
        httpURLConnection0.setUseCaches(false);
        httpURLConnection0.setReadTimeout(10000);
        httpURLConnection0.addRequestProperty("Content-Type", "application/json");
        httpURLConnection0.addRequestProperty("Accept", "application/json");
        httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.addRequestProperty("Cache-Control", "no-cache");
        httpURLConnection0.addRequestProperty("X-Android-Package", "com.dcinside.app.android");
        j j0 = (j)this.c.get();
        if(j0 != null) {
            try {
                httpURLConnection0.addRequestProperty("x-firebase-client", ((String)Tasks.await(j0.b())));
            }
            catch(ExecutionException executionException0) {
                Log.w("ContentValues", "Failed to get heartbeats header", executionException0);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                Log.w("ContentValues", "Failed to get heartbeats header", interruptedException0);
            }
        }
        httpURLConnection0.addRequestProperty("X-Android-Cert", this.g());
        httpURLConnection0.addRequestProperty("x-goog-api-key", s);
        return httpURLConnection0;
    }

    @VisibleForTesting
    static long n(String s) {
        Preconditions.checkArgument(c.C.matcher(s).matches(), "Invalid Expiration Timestamp.");
        return s == null || s.length() == 0 ? 0L : Long.parseLong(s.substring(0, s.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection0) throws AssertionError, IOException {
        InputStream inputStream0 = httpURLConnection0.getInputStream();
        JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, c.E));
        com.google.firebase.installations.remote.f.a f$a0 = f.a();
        com.google.firebase.installations.remote.d.a d$a0 = d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("name")) {
                d$a0.f(jsonReader0.nextString());
            }
            else if(s.equals("fid")) {
                d$a0.c(jsonReader0.nextString());
            }
            else if(s.equals("refreshToken")) {
                d$a0.d(jsonReader0.nextString());
            }
            else if(s.equals("authToken")) {
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    if(s1.equals("token")) {
                        f$a0.c(jsonReader0.nextString());
                    }
                    else if(s1.equals("expiresIn")) {
                        f$a0.d(c.n(jsonReader0.nextString()));
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                d$a0.b(f$a0.a());
                jsonReader0.endObject();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        jsonReader0.close();
        inputStream0.close();
        return d$a0.e(com.google.firebase.installations.remote.d.b.a).a();
    }

    @Nullable
    private static String p(HttpURLConnection httpURLConnection0) {
        String s1;
        InputStream inputStream0 = httpURLConnection0.getErrorStream();
        if(inputStream0 == null) {
            return null;
        }
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, c.E));
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
                stringBuilder0.append('\n');
            }
            s1 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", httpURLConnection0.getResponseCode(), httpURLConnection0.getResponseMessage(), stringBuilder0);
        }
        catch(IOException unused_ex) {
            try {
                bufferedReader0.close();
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        finally {
            bufferedReader0.close();
        }
        try {
        }
        catch(IOException unused_ex) {
        }
        return s1;
    }

    private f q(HttpURLConnection httpURLConnection0) throws AssertionError, IOException {
        InputStream inputStream0 = httpURLConnection0.getInputStream();
        JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, c.E));
        com.google.firebase.installations.remote.f.a f$a0 = f.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("token")) {
                f$a0.c(jsonReader0.nextString());
            }
            else if(s.equals("expiresIn")) {
                f$a0.d(c.n(jsonReader0.nextString()));
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        jsonReader0.close();
        inputStream0.close();
        return f$a0.b(com.google.firebase.installations.remote.f.b.a).a();
    }

    private void r(HttpURLConnection httpURLConnection0, @Nullable String s, @NonNull String s1) throws IOException {
        c.t(httpURLConnection0, c.i(c.b(s, s1)));
    }

    private void s(HttpURLConnection httpURLConnection0) throws IOException {
        c.t(httpURLConnection0, new byte[]{0x7B, 34, 105, 110, 0x73, 0x74, 97, 108, 108, 97, 0x74, 105, 0x6F, 110, 34, 58, 0x7B, 34, 0x73, 100, 107, 86, 101, 0x72, 0x73, 105, 0x6F, 110, 34, 58, 34, 97, 58, 49, 56, 46, 0x30, 46, 0x30, 34, 0x7D, 0x7D});
    }

    private static void t(URLConnection uRLConnection0, byte[] arr_b) throws IOException {
        OutputStream outputStream0 = uRLConnection0.getOutputStream();
        if(outputStream0 == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0);
        int v = FIN.finallyOpen$NT();
        gZIPOutputStream0.write(arr_b);
        try {
            FIN.finallyCodeBegin$NT(v);
            gZIPOutputStream0.close();
            outputStream0.close();
            FIN.finallyCodeEnd$NT(v);
        }
        catch(IOException unused_ex) {
        }
    }
}

