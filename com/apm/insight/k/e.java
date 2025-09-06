package com.apm.insight.k;

import android.text.TextUtils;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.l.f;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class a extends Enum {
        public static final enum a a;
        public static final enum a b;
        private static enum a c;
        private int d;

        static {
            a.c = new a("NONE", 0, 0);
            a.a = new a("GZIP", 1, 1);
            a.b = new a("DEFLATER", 2, 2);
        }

        private a(String s, int v, int v1) {
            super(s, v);
            this.d = v1;
        }
    }

    public static enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);

        private int l;

        private b(int v1) {
            this.l = v1;
        }

        public static b[] a() {
            return (b[])b.m.clone();
        }
    }

    public static boolean a = false;
    private static com.apm.insight.b.h.a b;

    static {
    }

    public static f a(String s, String s1) {
        return e.d(s, s1);
    }

    public static f a(String s, String s1, File[] arr_file) {
        return e.b(s, s1, arr_file);
    }

    private static f a(String s, byte[] arr_b, a e$a0, String s1) throws IOException {
        if(s == null) {
            return new f(201);
        }
        if(arr_b == null) {
            arr_b = new byte[0];
        }
        if(a.a == e$a0 && arr_b.length > 0x80) {
            arr_b = e.a(arr_b);
            return arr_b == null ? new f(202) : e.a(s, arr_b, s1, "gzip", "POST");
        }
        if(a.b == e$a0 && arr_b.length > 0x80) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x2000);
            Deflater deflater0 = new Deflater();
            deflater0.setInput(arr_b);
            deflater0.finish();
            byte[] arr_b1 = new byte[0x2000];
            while(!deflater0.finished()) {
                byteArrayOutputStream0.write(arr_b1, 0, deflater0.deflate(arr_b1));
            }
            deflater0.end();
            arr_b = byteArrayOutputStream0.toByteArray();
            return arr_b == null ? new f(202) : e.a(s, arr_b, s1, "deflate", "POST");
        }
        return arr_b == null ? new f(202) : e.a(s, arr_b, s1, null, "POST");
    }

    private static f a(String s, byte[] arr_b, String s1, String s2, String s3) {
        DataOutputStream dataOutputStream0;
        f f2;
        f f1;
        f f0;
        GZIPInputStream gZIPInputStream0;
        byte[] arr_b1;
        InputStream inputStream0;
        int v1;
        Closeable closeable0;
        HttpURLConnection httpURLConnection1;
        com.apm.insight.b.h.a h$a0;
        HttpURLConnection httpURLConnection0 = null;
        try {
            h$a0 = e.b;
            if(h$a0 != null) {
                goto label_3;
            }
            goto label_4;
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            goto label_59;
        }
        try {
        label_3:
            s = h$a0.c();
        }
        catch(Throwable unused_ex) {
        }
        try {
        label_4:
            httpURLConnection1 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            goto label_59;
        }
        try {
            httpURLConnection1.setDoOutput(true);
            CustomRequestHeader customRequestHeader0 = MonitorCrash.mCustomRequestHeader;
            if(customRequestHeader0 != null) {
                customRequestHeader0.addRequestHeader(httpURLConnection1);
            }
            if(s1 != null) {
                httpURLConnection1.setRequestProperty("Content-Type", s1);
            }
            if(s2 != null) {
                httpURLConnection1.setRequestProperty("Content-Encoding", s2);
            }
            httpURLConnection1.setRequestProperty("Accept-Encoding", "gzip");
            httpURLConnection1.setRequestMethod(s3);
            if(arr_b != null && arr_b.length > 0) {
                try {
                    dataOutputStream0 = new DataOutputStream(httpURLConnection1.getOutputStream());
                    dataOutputStream0.write(arr_b);
                    dataOutputStream0.flush();
                }
                finally {
                    com.apm.insight.a.a(dataOutputStream0);
                }
            }
            v1 = httpURLConnection1.getResponseCode();
            if(v1 == 200) {
                inputStream0 = httpURLConnection1.getInputStream();
                goto label_30;
            }
            f1 = new f("http response code " + v1);
            goto label_71;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
        try {
        label_30:
            if(!"gzip".equalsIgnoreCase(httpURLConnection1.getContentEncoding())) {
                arr_b1 = e.a(inputStream0);
                f0 = new f(arr_b1);
                goto label_51;
            }
        }
        catch(Throwable throwable1) {
            httpURLConnection0 = httpURLConnection1;
            closeable0 = inputStream0;
            throwable0 = throwable1;
            goto label_59;
        }
        try {
            gZIPInputStream0 = new GZIPInputStream(inputStream0);
        }
        catch(Throwable throwable2) {
            try {
                goto label_41;
            }
            catch(Throwable throwable1) {
                httpURLConnection0 = httpURLConnection1;
                closeable0 = inputStream0;
                throwable0 = throwable1;
                goto label_59;
            }
        }
        try {
            arr_b1 = e.a(gZIPInputStream0);
            goto label_43;
        }
        catch(Throwable throwable2) {
            try {
                httpURLConnection0 = gZIPInputStream0;
            label_41:
                com.apm.insight.a.a(((Closeable)httpURLConnection0));
                throw throwable2;
            label_43:
                com.apm.insight.a.a(gZIPInputStream0);
                f0 = new f(arr_b1);
                goto label_51;
            }
            catch(Throwable throwable1) {
            }
        }
        httpURLConnection0 = httpURLConnection1;
        closeable0 = inputStream0;
        throwable0 = throwable1;
        goto label_59;
        try {
        label_51:
            httpURLConnection1.disconnect();
        }
        catch(Exception unused_ex) {
        }
        com.apm.insight.a.a(inputStream0);
        return f0;
        try {
            f1 = new f("http response code " + v1);
            goto label_71;
        }
        catch(Throwable throwable0) {
        label_57:
            httpURLConnection0 = httpURLConnection1;
            closeable0 = null;
        }
        try {
        label_59:
            com.apm.insight.a.a(throwable0);
            f2 = new f(0xCF, throwable0);
        }
        catch(Throwable throwable3) {
            if(httpURLConnection0 != null) {
                try {
                    httpURLConnection0.disconnect();
                }
                catch(Exception unused_ex) {
                }
            }
            com.apm.insight.a.a(closeable0);
            throw throwable3;
        }
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception unused_ex) {
            }
        }
        com.apm.insight.a.a(closeable0);
        return f2;
        try {
        label_71:
            httpURLConnection1.disconnect();
        }
        catch(Exception unused_ex) {
        }
        com.apm.insight.a.a(null);
        return f1;
    }

    public static void a(com.apm.insight.b.h.a h$a0) {
        e.b = h$a0;
    }

    public static boolean a() [...] // Inlined contents

    public static boolean a(String s, String s1, String s2, String s3, List list0) {
        try {
            i i0 = new i(s, "UTF-8", false);
            i0.a("aid", s1);
            i0.a("device_id", s2);
            i0.a("os", "Android");
            i0.a("process_name", s3);
            for(Object object0: list0) {
                File file0 = new File(((String)object0));
                if(file0.exists()) {
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("logtype", "alog");
                    hashMap0.put("scene", "Crash");
                    i0.a(file0.getName(), file0, hashMap0);
                }
            }
            String s4 = i0.a();
            try {
                if(new JSONObject(s4).optInt("errno", -1) == 200) {
                    return true;
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
        }
        return false;
    }

    private static byte[] a(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x2000];
        while(true) {
            int v = inputStream0.read(arr_b);
            if(-1 == v) {
                break;
            }
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        inputStream0.close();
        try {
            return byteArrayOutputStream0.toByteArray();
        }
        finally {
            com.apm.insight.a.a(byteArrayOutputStream0);
        }
    }

    public static byte[] a(String s, byte[] arr_b) {
        try {
            TextUtils.isDigitsOnly(s);
            return e.a(s, arr_b, a.a, "application/json; charset=utf-8").b();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return null;
        }
    }

    private static byte[] a(byte[] arr_b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x2000);
        GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
        try {
            gZIPOutputStream0.write(arr_b);
        }
        catch(Throwable throwable0) {
            try {
                com.apm.insight.a.b(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(gZIPOutputStream0, throwable1);
                throw throwable1;
            }
            gZIPOutputStream0.close();
            return null;
        }
        gZIPOutputStream0.close();
        return byteArrayOutputStream0.toByteArray();
    }

    public static f b(String s, String s1) {
        return e.d(s, s1);
    }

    private static f b(String s, String s1, File[] arr_file) {
        try {
            i i0 = new i(e.c(s, "have_dump=true"), "UTF-8", true);
            i0.b("json", s1);
            i0.a("file", arr_file);
            String s2 = i0.a();
            try {
                return new f(new JSONObject(s2));
            }
            catch(JSONException jSONException0) {
                return new f(0, jSONException0);
            }
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return new f(0xCF);
        }
    }

    public static boolean b() [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static String c() [...] // 潜在的解密器

    private static String c(String s, String s1) {
        try {
            if(TextUtils.isEmpty(new URL(s).getQuery())) {
                return s.endsWith("?") ? s + s1 : s + "?" + s1;
            }
            if(!s.endsWith("&")) {
                s = s + "&";
            }
            return s + s1;
        }
        catch(Throwable unused_ex) {
            return s;
        }
    }

    private static f d(String s, String s1) {
        try {
            return TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) ? new f(201) : e.a(s, s1.getBytes(), a.a, "application/json; charset=utf-8");
        }
        catch(Throwable throwable0) {
        }
        com.apm.insight.a.b(throwable0);
        return new f(0xCF, throwable0);
    }

    // 去混淆评级： 低(20)
    public static String d() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String e() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String f() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String g() [...] // 潜在的解密器
}

