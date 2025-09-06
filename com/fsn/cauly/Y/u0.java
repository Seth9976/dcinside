package com.fsn.cauly.Y;

import com.fsn.cauly.blackdragoncore.utils.e;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class u0 extends v0 {
    protected boolean j;
    protected String k;
    protected String l;
    protected String m;
    protected boolean n;
    protected String o;
    protected boolean p;
    protected String q;
    protected int r;

    public u0() {
        this.r = 3;
    }

    public static boolean a(String s, String s1, boolean z) {
        u0 u00 = new u0();
        u00.b(s);
        u00.a(s1);
        u00.a(z);
        u00.c();
        return u00.c == 0;
    }

    protected void a(File file0) {
    }

    public void a(String s) {
        this.k = s;
        if(s != null) {
            this.l = s + "__";
            return;
        }
        this.l = null;
    }

    public void a(boolean z) {
        this.n = z;
    }

    protected boolean a(byte[] arr_b) {
        return false;
    }

    public void b(int v) {
        this.r = v;
    }

    public void b(String s) {
        this.m = s;
    }

    public void b(boolean z) {
        this.j = z;
    }

    @Override  // com.fsn.cauly.Y.v0
    public void c() {
        class a implements HostnameVerifier {
            final u0 a;

            // 去混淆评级： 中等(60)
            @Override  // javax.net.ssl.HostnameVerifier
            public boolean verify(String s, SSLSession sSLSession0) {
                return s.equalsIgnoreCase("ad.cauly.co.kr") || s.equalsIgnoreCase("uat-ad.fsnsys.com") || s.equalsIgnoreCase("tracker.cauly.co.kr") || s.equalsIgnoreCase("xconf.cauly.co.kr") || s.equalsIgnoreCase("click.cauly.co.kr") || s.equalsIgnoreCase("image.cauly.co.kr") ? HttpsURLConnection.getDefaultHostnameVerifier().verify(s, sSLSession0) : false;
            }
        }

        InputStream inputStream1;
        HttpURLConnection httpURLConnection0;
        InputStream inputStream0 = null;
        g.a(b.d, "HTTP Request : " + this.m);
        if(!this.n || !e.b(this.k)) {
            try {
                if(this.j) {
                    this.h();
                    a u0$a0 = new a(this);
                    httpURLConnection0 = (HttpsURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(this.m).openConnection())));
                    ((HttpsURLConnection)httpURLConnection0).setHostnameVerifier(u0$a0);
                }
                else {
                    httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(this.m).openConnection())));
                }
                goto label_30;
            }
            catch(MalformedURLException malformedURLException0) {
                inputStream1 = null;
                goto label_53;
            }
            catch(NoClassDefFoundError noClassDefFoundError0) {
            }
            catch(Exception exception0) {
                inputStream1 = null;
                goto label_84;
            }
            catch(Throwable throwable0) {
                inputStream1 = null;
                goto label_98;
            }
            NoClassDefFoundError noClassDefFoundError1 = noClassDefFoundError0;
            InputStream inputStream2 = null;
            goto label_67;
            try {
            label_30:
                httpURLConnection0.setConnectTimeout(this.r * 1000);
                httpURLConnection0.setReadTimeout(this.r * 1000);
                httpURLConnection0.setUseCaches(false);
                httpURLConnection0.connect();
                inputStream0 = httpURLConnection0.getInputStream();
                int v = httpURLConnection0.getResponseCode();
                if(v == 200) {
                    this.d(inputStream0, httpURLConnection0.getContentLength());
                }
                else {
                    this.c = 500;
                    this.q = "HTTP Error : " + v;
                }
                goto label_106;
            }
            catch(MalformedURLException malformedURLException0) {
                inputStream1 = inputStream0;
                inputStream0 = httpURLConnection0;
            }
            catch(NoClassDefFoundError noClassDefFoundError2) {
                goto label_64;
            }
            catch(Exception exception0) {
                goto label_82;
            }
            catch(Throwable throwable0) {
                inputStream1 = inputStream0;
                inputStream0 = httpURLConnection0;
                goto label_98;
            }
            try {
            label_53:
                malformedURLException0.printStackTrace();
                this.c = 500;
                this.q = "java.net.MalformedURLException";
                if(inputStream0 != null) {
                    goto label_57;
                }
                goto label_58;
            }
            catch(Throwable throwable0) {
                goto label_98;
            }
            try {
            label_57:
                ((HttpURLConnection)inputStream0).disconnect();
            label_58:
                if(inputStream1 != null) {
                    inputStream1.close();
                }
                goto label_112;
            }
            catch(IOException iOException0) {
            }
            iOException0.printStackTrace();
            goto label_112;
        label_64:
            noClassDefFoundError1 = noClassDefFoundError2;
            inputStream2 = inputStream0;
            inputStream0 = httpURLConnection0;
            try {
            label_67:
                noClassDefFoundError1.printStackTrace();
                this.c = 200;
                this.q = "No filled AD";
            }
            catch(Throwable throwable0) {
                inputStream1 = inputStream2;
                goto label_98;
            }
            if(inputStream0 == null) {
                goto label_76;
            }
            else {
                try {
                    ((HttpURLConnection)inputStream0).disconnect();
                label_76:
                    if(inputStream2 != null) {
                        inputStream2.close();
                    }
                    goto label_112;
                }
                catch(IOException iOException1) {
                }
            }
            iOException1.printStackTrace();
            goto label_112;
        label_82:
            inputStream1 = inputStream0;
            inputStream0 = httpURLConnection0;
            try {
            label_84:
                exception0.printStackTrace();
                this.c = 500;
                this.q = exception0.toString();
            }
            catch(Throwable throwable0) {
                goto label_98;
            }
            if(inputStream0 == null) {
                goto label_92;
            }
            else {
                try {
                    ((HttpURLConnection)inputStream0).disconnect();
                label_92:
                    if(inputStream1 != null) {
                        inputStream1.close();
                    }
                    goto label_112;
                }
                catch(IOException iOException2) {
                }
            }
            iOException2.printStackTrace();
            goto label_112;
            try {
            label_98:
                if(inputStream0 != null) {
                    ((HttpURLConnection)inputStream0).disconnect();
                }
                if(inputStream1 != null) {
                    inputStream1.close();
                }
            }
            catch(IOException iOException3) {
                iOException3.printStackTrace();
            }
            throw throwable0;
            try {
            label_106:
                httpURLConnection0.disconnect();
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            catch(IOException iOException4) {
                iOException4.printStackTrace();
            }
        }
        else {
            this.p = true;
            g.a(b.e, "Cache hit");
        }
    label_112:
        g.a(b.e, "cancelled: " + this.h + " errorCode: " + this.c);
        if(!this.h && this.c == 0) {
            this.g();
        }
    }

    public String d() {
        return this.q;
    }

    void d(InputStream inputStream0, int v) {
        int v2;
        byte[] arr_b;
        Throwable throwable1;
        BufferedOutputStream bufferedOutputStream1;
        ByteArrayOutputStream byteArrayOutputStream0;
        int v1;
        BufferedOutputStream bufferedOutputStream0 = null;
        try {
            v1 = -100;
            byteArrayOutputStream0 = new ByteArrayOutputStream();
        }
        catch(Throwable throwable0) {
            bufferedOutputStream1 = null;
            throwable1 = throwable0;
            byteArrayOutputStream0 = null;
            goto label_55;
        }
        try {
            bufferedOutputStream1 = new BufferedOutputStream(byteArrayOutputStream0);
        }
        catch(Throwable throwable2) {
            goto label_53;
        }
        try {
            arr_b = new byte[0x400];
        }
        catch(Throwable throwable3) {
            throwable2 = throwable3;
            bufferedOutputStream0 = bufferedOutputStream1;
            goto label_53;
        }
        while(!this.h) {
            try {
                v2 = inputStream0.read(arr_b);
            }
            catch(Throwable throwable3) {
                v1 = 500;
                throwable2 = throwable3;
                bufferedOutputStream0 = bufferedOutputStream1;
                goto label_53;
            }
            if(v2 <= 0) {
                break;
            }
            try {
                bufferedOutputStream1.write(arr_b, 0, v2);
            }
            catch(Throwable throwable1) {
                goto label_55;
            }
        }
        try {
            bufferedOutputStream1.close();
            goto label_28;
        }
        catch(Throwable throwable3) {
        }
        throwable2 = throwable3;
        bufferedOutputStream0 = bufferedOutputStream1;
        goto label_53;
        try {
        label_28:
            if(this.k == null) {
                this.o = byteArrayOutputStream0.toString("UTF-8");
            }
            else {
                byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                boolean z = this.a(arr_b1);
                if(this.c == 0) {
                    try {
                        e.d(e.a(this.k));
                        File file0 = new File(this.l);
                        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                        fileOutputStream0.write(arr_b1);
                        fileOutputStream0.close();
                        this.a(file0);
                        if(this.c == 0) {
                            File file1 = new File(this.k);
                            file1.delete();
                            if(!file0.renameTo(file1)) {
                                throw new Exception("Can\'t write HTTP response.");
                            }
                        }
                    }
                    catch(Exception exception0) {
                        this.c = -100;
                        this.q = exception0.getMessage();
                    }
                    if(z) {
                        this.c = 0;
                        this.q = null;
                    }
                }
            }
            goto label_58;
        }
        catch(Throwable throwable2) {
        }
    label_53:
        bufferedOutputStream1 = bufferedOutputStream0;
        throwable1 = throwable2;
    label_55:
        this.c = v1;
        this.q = throwable1.getMessage();
        bufferedOutputStream0 = bufferedOutputStream1;
    label_58:
        if(bufferedOutputStream0 != null) {
            try {
                bufferedOutputStream0.close();
            }
            catch(Exception exception1) {
                exception1.printStackTrace();
            }
        }
        if(byteArrayOutputStream0 != null) {
            try {
                byteArrayOutputStream0.close();
            }
            catch(Exception exception2) {
                exception2.printStackTrace();
            }
        }
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
            }
        }
    }

    public String e() {
        return this.k;
    }

    @Override  // com.fsn.cauly.Y.v0
    public void execute() {
        super.execute();
    }

    public String f() {
        if((this.o == null || this.o.length() == 0) && this.c == 0) {
            String s = this.k;
            if(s != null) {
                this.o = e.c(s);
            }
        }
        return this.o;
    }

    protected void g() {
    }

    private void h() {
        class com.fsn.cauly.Y.u0.b implements X509TrustManager {
            final u0 a;

            @Override  // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] arr_x509Certificate, String s) {
            }

            @Override  // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] arr_x509Certificate, String s) {
            }

            @Override  // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        TrustManager[] arr_trustManager = {new com.fsn.cauly.Y.u0.b(this)};
        try {
            SSLContext sSLContext0 = SSLContext.getInstance("TLS");
            sSLContext0.init(null, arr_trustManager, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext0.getSocketFactory());
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }
}

