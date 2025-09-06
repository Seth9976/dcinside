package com.tiktok.util;

import androidx.annotation.Nullable;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tiktok.appevents.u;
import com.tiktok.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public class a {
    public static class com.tiktok.util.a.a {
        public int a;
        public int b;
        private static int c = -1;

        static {
        }

        public com.tiktok.util.a.a() {
            this.a = com.tiktok.util.a.a.c;
            this.b = com.tiktok.util.a.a.c;
        }

        public void a(HttpURLConnection httpURLConnection0) {
            int v = this.a;
            if(v != com.tiktok.util.a.a.c) {
                httpURLConnection0.setConnectTimeout(v);
            }
            int v1 = this.b;
            if(v1 != com.tiktok.util.a.a.c) {
                httpURLConnection0.setReadTimeout(v1);
            }
        }
    }

    private static final String a = "monitor";
    private static final String b = "api_err";
    private static final String c = "com.tiktok.util.a";
    private static final f d;

    static {
        a.d = new f(a.class.getCanonicalName(), b.o());
    }

    public static HttpsURLConnection a(String s, Map map0, com.tiktok.util.a.a a$a0, String s1, String s2) {
        HttpsURLConnection httpsURLConnection0 = null;
        try {
            httpsURLConnection0 = (HttpsURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
            httpsURLConnection0.setRequestMethod(s1);
            a$a0.a(httpsURLConnection0);
            httpsURLConnection0.setDoInput(true);
            httpsURLConnection0.setUseCaches(false);
            if(s1.equals("GET")) {
                httpsURLConnection0.setDoOutput(false);
            }
            else if(s1.equals("POST")) {
                httpsURLConnection0.setDoOutput(true);
                httpsURLConnection0.setRequestProperty("Content-Length", s2);
            }
            for(Object object0: map0.entrySet()) {
                httpsURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpsURLConnection0.connect();
        }
        catch(Exception exception0) {
            u.b("com.tiktok.util.a", exception0, 1);
            if(httpsURLConnection0 != null) {
                try {
                    httpsURLConnection0.disconnect();
                    return httpsURLConnection0;
                }
                catch(Exception exception1) {
                    u.b("com.tiktok.util.a", exception1, 1);
                }
            }
        }
        return httpsURLConnection0;
    }

    public static String b(String s, Map map0) {
        com.tiktok.util.a.a a$a0 = new com.tiktok.util.a.a();
        a$a0.a = 2000;
        a$a0.b = 5000;
        return a.c(s, map0, a$a0);
    }

    public static String c(String s, Map map0, com.tiktok.util.a.a a$a0) {
        String s4;
        String s2;
        String s1;
        long v;
        try {
            v = System.currentTimeMillis();
            s1 = new URL(s).getPath().split("/app_sdk/")[1];
            s2 = "";
        }
        catch(Throwable throwable0) {
            s1 = "";
            s2 = throwable0.getMessage();
        }
        int v1 = 0;
        HttpsURLConnection httpsURLConnection0 = a.a(s, map0, a$a0, "GET", null);
        if(httpsURLConnection0 == null) {
            return null;
        }
        try {
            try {
                if(a.i(httpsURLConnection0.getResponseCode())) {
                    String s3 = httpsURLConnection0.getHeaderField("Location");
                    httpsURLConnection0.disconnect();
                    httpsURLConnection0 = a.a(s3, map0, a$a0, "GET", null);
                }
                v1 = httpsURLConnection0.getResponseCode();
                s4 = v1 == 200 ? a.j(httpsURLConnection0.getInputStream()) : null;
                goto label_41;
            }
            catch(Exception exception0) {
            }
            s2 = exception0.getMessage();
            u.b("com.tiktok.util.a", exception0, 1);
            if(httpsURLConnection0 != null) {
                goto label_27;
            }
            s4 = null;
            goto label_46;
        }
        catch(Throwable throwable1) {
            goto label_34;
        }
        try {
        label_27:
            httpsURLConnection0.disconnect();
        }
        catch(Exception exception1) {
            s2 = exception1.getMessage();
            u.b("com.tiktok.util.a", exception1, 1);
        }
        s4 = null;
        goto label_46;
    label_34:
        if(httpsURLConnection0 != null) {
            try {
                httpsURLConnection0.disconnect();
            }
            catch(Exception exception2) {
                exception2.getMessage();
                u.b("com.tiktok.util.a", exception2, 1);
            }
        }
        throw throwable1;
        try {
        label_41:
            httpsURLConnection0.disconnect();
        }
        catch(Exception exception3) {
            s2 = exception3.getMessage();
            u.b("com.tiktok.util.a", exception3, 1);
        }
        try {
        label_46:
            long v2 = System.currentTimeMillis();
            int v3 = a.f(s4);
            if(v3 != 0) {
                if(v1 == 200) {
                    s2 = a.h(s4);
                    v1 = v3;
                }
                JSONObject jSONObject0 = g.c(v).put("latency", v2 - v).put("api_type", s1).put("status_code", v1).put("message", s2).put("log_id", a.g(s4));
                b.j().I("api_err", jSONObject0, null);
            }
        }
        catch(Exception unused_ex) {
        }
        return s4;
    }

    public static String d(String s, Map map0, String s1) {
        com.tiktok.util.a.a a$a0 = new com.tiktok.util.a.a();
        a$a0.a = 2000;
        a$a0.b = 5000;
        return a.e(s, map0, s1, a$a0);
    }

    public static String e(String s, Map map0, String s1, com.tiktok.util.a.a a$a0) {
        String s7;
        int v2;
        Throwable throwable2;
        OutputStream outputStream0;
        int v1;
        String s5;
        HttpsURLConnection httpsURLConnection0;
        String s4;
        byte[] arr_b;
        String s3;
        String s2;
        long v;
        try {
            v = System.currentTimeMillis();
            s2 = new URL(s).getPath().split("/app_sdk/")[1];
            s3 = "";
        }
        catch(Throwable throwable0) {
            s2 = "";
            s3 = throwable0.getMessage();
        }
        try {
            arr_b = s1.getBytes("UTF-8");
            s4 = String.valueOf(arr_b.length);
            httpsURLConnection0 = a.a(s, map0, a$a0, "POST", s4);
        }
        catch(Exception exception0) {
            s5 = null;
            v1 = 0;
            outputStream0 = null;
            httpsURLConnection0 = null;
            goto label_64;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            outputStream0 = null;
            httpsURLConnection0 = null;
            goto label_84;
        }
        if(httpsURLConnection0 == null) {
            return null;
        }
        try {
            outputStream0 = httpsURLConnection0.getOutputStream();
        }
        catch(Exception exception0) {
            s5 = null;
            v1 = 0;
            outputStream0 = null;
            goto label_64;
        }
        catch(Throwable throwable3) {
            throwable2 = throwable3;
            outputStream0 = null;
            goto label_84;
        }
        try {
            outputStream0.write(arr_b);
            outputStream0.flush();
            if(a.i(httpsURLConnection0.getResponseCode())) {
                String s6 = httpsURLConnection0.getHeaderField("Location");
                httpsURLConnection0.disconnect();
                httpsURLConnection0 = a.a(s6, map0, a$a0, "POST", s4);
                outputStream0 = httpsURLConnection0.getOutputStream();
                outputStream0.write(arr_b);
                outputStream0.flush();
            }
            v2 = httpsURLConnection0.getResponseCode();
            goto label_50;
        }
        catch(Exception exception0) {
            s5 = null;
            v1 = 0;
            goto label_64;
        label_50:
            if(v2 == 200) {
                try {
                    s5 = a.j(httpsURLConnection0.getInputStream());
                    goto label_58;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable4) {
                    goto label_83;
                }
                v1 = 200;
                s5 = null;
                goto label_64;
            }
            else {
                s5 = null;
            }
            try {
                try {
                label_58:
                    if(b.A().booleanValue()) {
                        a.d.c("doPost request body: %s", new Object[]{s1});
                        a.d.c("doPost result: %s", new Object[]{(s5 == null ? String.valueOf(v2) : s5)});
                    }
                    goto label_97;
                }
                catch(Exception exception0) {
                    v1 = v2;
                }
            label_64:
                s7 = exception0.getMessage();
                u.b("com.tiktok.util.a", exception0, 1);
                if(outputStream0 != null) {
                    goto label_67;
                }
                goto label_73;
            }
            catch(Throwable throwable4) {
                goto label_83;
            }
            try {
            label_67:
                outputStream0.close();
            }
            catch(IOException iOException0) {
                s3 = iOException0.getMessage();
                u.b("com.tiktok.util.a", iOException0, 1);
                goto label_74;
            }
        label_73:
            s3 = s7;
        label_74:
            if(httpsURLConnection0 != null) {
                try {
                    httpsURLConnection0.disconnect();
                }
                catch(Exception exception1) {
                    s3 = exception1.getMessage();
                    u.b("com.tiktok.util.a", exception1, 1);
                }
            }
            v2 = v1;
            goto label_107;
        }
        catch(Throwable throwable4) {
        label_83:
            throwable2 = throwable4;
        }
    label_84:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException1) {
                iOException1.getMessage();
                u.b("com.tiktok.util.a", iOException1, 1);
            }
        }
        if(httpsURLConnection0 != null) {
            try {
                httpsURLConnection0.disconnect();
            }
            catch(Exception exception2) {
                exception2.getMessage();
                u.b("com.tiktok.util.a", exception2, 1);
            }
        }
        throw throwable2;
        try {
        label_97:
            outputStream0.close();
        }
        catch(IOException iOException2) {
            s3 = iOException2.getMessage();
            u.b("com.tiktok.util.a", iOException2, 1);
        }
        try {
            httpsURLConnection0.disconnect();
        }
        catch(Exception exception3) {
            s3 = exception3.getMessage();
            u.b("com.tiktok.util.a", exception3, 1);
        }
        try {
        label_107:
            long v3 = System.currentTimeMillis();
            int v4 = a.f(s5);
            if(v4 != 0 && v2 == 200) {
                s3 = a.h(s5);
                v2 = v4;
            }
            if(v4 != 0 && !s.contains("monitor")) {
                JSONObject jSONObject0 = g.c(v).put("latency", v3 - v).put("api_type", s2).put("status_code", v2).put("message", s3).put("log_id", a.g(s5));
                b.j().I("api_err", jSONObject0, null);
            }
        }
        catch(Exception unused_ex) {
        }
        return s5;
    }

    public static int f(@Nullable String s) {
        if(s != null) {
            try {
                return new JSONObject(s).getInt("code");
            }
            catch(Exception unused_ex) {
                return -2;
            }
        }
        return -1;
    }

    public static String g(@Nullable String s) {
        if(s != null) {
            try {
                return new JSONObject(s).getString("request_id");
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static String h(@Nullable String s) {
        if(s != null) {
            try {
                return new JSONObject(s).getString("message");
            }
            catch(Exception exception0) {
                return exception0.getMessage();
            }
        }
        return "result is empty";
    }

    public static boolean i(int v) {
        return v == 301 || v == 302 || v == 303 || v == 307;
    }

    private static String j(InputStream inputStream0) {
        String s1;
        BufferedReader bufferedReader0;
        try {
            bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, "UTF-8"));
        }
        catch(Exception exception0) {
            u.b("com.tiktok.util.a", exception0, 1);
            return null;
        }
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
            }
            s1 = stringBuilder0.toString().trim();
            goto label_16;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            try {
                bufferedReader0.close();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    throwable0.addSuppressed(throwable2);
                    throw throwable1;
                label_16:
                    bufferedReader0.close();
                    return s1;
                }
                catch(Exception exception0) {
                }
            }
        }
        u.b("com.tiktok.util.a", exception0, 1);
        return null;
    }
}

