package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.pgl.ssdk.ces.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.json.JSONObject;

public abstract class k0 {
    class a implements Runnable {
        final k0 a;

        @Override
        public void run() {
            if(!k0.this.c() && k0.this.j < k0.this.k) {
                k0.c(k0.this);
                p0.a(this);
            }
        }
    }

    public static String a;
    private HttpURLConnection b;
    private Context c;
    private int d;
    private int e;
    private byte[] f;
    private int g;
    private byte[] h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private Runnable m;

    public k0(Context context0) {
        this.b = null;
        this.g = -1;
        this.h = null;
        this.i = 10000;
        this.j = 0;
        this.k = 2;
        this.l = true;
        this.m = new a(this);
        this.c = context0;
    }

    private void a(int v) throws ProtocolException {
        String s;
        switch(v) {
            case 1: {
                s = "POST";
                break;
            }
            case 3: {
                s = "PUT";
                break;
            }
            case 4: {
                s = "DELETE";
                break;
            }
            case 5: {
                s = "HEAD";
                break;
            }
            case 6: {
                s = "TRACE";
                break;
            }
            default: {
                s = "GET";
            }
        }
        this.b.setRequestMethod(s);
    }

    public static void a(String s) {
        synchronized(k0.class) {
            if(!TextUtils.isEmpty(s) && !s.equals(k0.a)) {
                k0.a = s;
            }
        }
    }

    private byte[] a(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b, 0, 0x400)) > 0) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    abstract String a();

    public void a(int v, int v1, byte[] arr_b) {
        this.b(v, v1, arr_b);
        p0.a(this.m);
    }

    abstract void a(int arg1, byte[] arg2);

    private void b() {
        if(this.b == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(!TextUtils.isEmpty(k0.a)) {
                jSONObject0.put("ipv6", k0.a);
            }
            if(!TextUtils.isEmpty(b.f())) {
                jSONObject0.put("gaid", b.f());
            }
            jSONObject0.put("region", "SG");
            Pair pair0 = o0.a("{\"region\":\"SG\"}");
            if(pair0 != null) {
                Object object0 = pair0.first;
                if(object0 != null && pair0.second != null) {
                    this.b.addRequestProperty("cypher", String.valueOf(object0));
                    this.b.addRequestProperty("transfer-param", ((String)pair0.second));
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void b(int v) {
        String s;
        switch(v) {
            case 1: {
                s = "application/json; charset=utf-8";
                break;
            }
            case 2: {
                s = "application/octet-stream";
                break;
            }
            default: {
                s = "";
            }
        }
        if(!s.isEmpty()) {
            this.b.addRequestProperty("Content-Type", s);
        }
        this.b();
        try {
            String s1 = Locale.getDefault().getLanguage();
            if(s1.equalsIgnoreCase("zh")) {
                this.b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + s1 + ";q=0.9");
                return;
            }
            this.b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + s1 + ";q=0.9,en-US;q=0.6,en;q=0.4");
        }
        catch(Throwable unused_ex) {
        }
    }

    private void b(int v, int v1, byte[] arr_b) {
        this.d = v;
        this.e = v1;
        this.f = arr_b;
    }

    static int c(k0 k00) {
        int v = k00.j;
        k00.j = v + 1;
        return v;
    }

    private boolean c() {
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        InputStream inputStream0;
        try {
            String s = l0.a(this.c);
            if(!TextUtils.isEmpty(s)) {
                String s1 = s + this.a();
                if(!s1.startsWith("https://") && !s1.startsWith("http://")) {
                    s1 = "https://" + s1;
                }
                URL uRL0 = new URL(s1);
                this.b = this.l ? ((HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection(Proxy.NO_PROXY))))) : ((HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection()))));
                this.b.setConnectTimeout(this.i);
                this.b.setReadTimeout(this.i);
                this.a(this.d);
                this.b(this.e);
                if(this.f != null && this.f.length > 0) {
                    this.b.setDoOutput(true);
                    OutputStream outputStream0 = this.b.getOutputStream();
                    outputStream0.write(this.f);
                    outputStream0.flush();
                    outputStream0.close();
                }
                this.b.connect();
                goto label_21;
            }
            goto label_37;
        }
        catch(Throwable unused_ex) {
            goto label_40;
        }
        try {
        label_21:
            this.g = this.b.getResponseCode();
            inputStream0 = null;
            inputStream0 = this.b.getInputStream();
            this.h = this.a(inputStream0);
            goto label_29;
        }
        catch(Throwable unused_ex) {
            try {
                if(inputStream0 != null) {
                    inputStream0.close();
                    goto label_31;
                label_29:
                    if(inputStream0 != null) {
                        inputStream0.close();
                    }
                }
            label_31:
                this.a(this.g, this.h);
                httpURLConnection0 = this.b;
                if(httpURLConnection0 != null) {
                    goto label_34;
                }
                return true;
            }
            catch(Throwable unused_ex) {
                goto label_40;
            }
        }
    label_34:
        httpURLConnection0.disconnect();
        this.b = null;
        return true;
        try {
        label_37:
            l0.b(this.c);
            httpURLConnection1 = this.b;
        }
        catch(Throwable unused_ex) {
        label_40:
            HttpURLConnection httpURLConnection2 = this.b;
            if(httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.b = null;
            }
            l0.b(this.c);
            return false;
        }
        if(httpURLConnection1 != null) {
            httpURLConnection1.disconnect();
            this.b = null;
        }
        return false;
    }
}

