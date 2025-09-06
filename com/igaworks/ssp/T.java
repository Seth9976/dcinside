package com.igaworks.ssp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

public class t {
    static abstract class a {
    }

    static class b extends Thread {
        private String a;
        private e b;
        private Context c;
        private JSONObject d;
        private String e;
        private String f;
        private boolean g;
        private L h;
        private l i;

        private b(Context context0, e t$e0, String s, JSONObject jSONObject0, l l0, L l1) {
            this.e = "";
            this.f = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.h = l1;
            this.d = jSONObject0;
            this.i = l0;
        }

        b(Context context0, e t$e0, String s, JSONObject jSONObject0, l l0, L l1, a t$a0) {
            this(context0, t$e0, s, jSONObject0, l0, l1);
        }

        private void a() {
            class com.igaworks.ssp.t.b.a implements Runnable {
                final b a;

                @Override
                public void run() {
                    if(b.this.h != null) {
                        try {
                            com.igaworks.ssp.b.c(Thread.currentThread(), b.this.b.name() + "\nPlacementID : " + b.this.f + "\nTimeOut : " + b.this.g + "\nURL : " + b.this.a + "\n==HttpResponseString==\n");
                            if(b.this.b != e.q) {
                                com.igaworks.ssp.b.c(Thread.currentThread(), new JSONObject(b.this.e).toString(4).trim());
                            }
                            goto label_7;
                        }
                        catch(Exception exception0) {
                            try {
                                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                            label_7:
                                b.this.h.onCallback(b.this.b, b.this.e, b.this.i, b.this.g);
                                return;
                            }
                            catch(Exception exception1) {
                            }
                        }
                        com.igaworks.ssp.b.a(Thread.currentThread(), exception1);
                    }
                }
            }

            try {
                if(t.a == null) {
                    t.a = new Handler(Looper.getMainLooper());
                }
                t.a.post(new com.igaworks.ssp.t.b.a(this));
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        }

        @Override
        public void run() {
            HttpURLConnection httpURLConnection0;
            super.run();
            InputStream inputStream0 = null;
            try {
                com.igaworks.ssp.b.c(Thread.currentThread(), "url = " + this.a);
                httpURLConnection0 = null;
                httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(this.a).openConnection())));
                goto label_12;
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                httpURLConnection0 = null;
                goto label_41;
            }
            catch(Exception exception0) {
                httpURLConnection0 = null;
                goto label_51;
                try {
                    try {
                    label_12:
                        httpURLConnection0.setRequestMethod("POST");
                        httpURLConnection0.setDoInput(true);
                        httpURLConnection0.setDoOutput(true);
                        httpURLConnection0.setReadTimeout(5000);
                        httpURLConnection0.setConnectTimeout(5000);
                        httpURLConnection0.setRequestProperty("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                        E.g().e();
                        if(this.d != null) {
                            goto label_21;
                        }
                        goto label_24;
                    }
                    catch(SocketTimeoutException socketTimeoutException0) {
                        goto label_41;
                    }
                    catch(Exception exception0) {
                        goto label_51;
                    }
                    try {
                    label_21:
                        com.igaworks.ssp.b.c(Thread.currentThread(), "Request Parameter : " + this.d.toString(4).trim());
                        goto label_24;
                    }
                    catch(Exception unused_ex) {
                        try {
                            com.igaworks.ssp.b.c(Thread.currentThread(), "Request Parameter : " + this.d.toString());
                        label_24:
                            OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                            outputStream0.write(this.d.toString().getBytes());
                            outputStream0.flush();
                            outputStream0.close();
                            inputStream0 = t.b(httpURLConnection0, this.d.toString());
                            if(inputStream0 != null) {
                                StringBuilder stringBuilder0 = new StringBuilder();
                                BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
                                String s;
                                while((s = bufferedReader0.readLine()) != null) {
                                    stringBuilder0.append(s);
                                }
                                this.e = stringBuilder0.toString();
                            }
                            goto label_68;
                        }
                        catch(SocketTimeoutException socketTimeoutException0) {
                        }
                        catch(Exception exception0) {
                            goto label_51;
                        }
                    }
                label_41:
                    this.g = true;
                    com.igaworks.ssp.b.a(Thread.currentThread(), socketTimeoutException0);
                    if(inputStream0 != null) {
                        goto label_44;
                    }
                    goto label_48;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
                try {
                label_44:
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    iOException0.printStackTrace();
                }
            label_48:
                if(httpURLConnection0 != null) {
                    httpURLConnection0.disconnect();
                    this.a();
                    return;
                    try {
                    label_51:
                        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                        if(inputStream0 != null) {
                            goto label_53;
                        }
                        goto label_57;
                    }
                    catch(Throwable throwable0) {
                        goto label_60;
                    }
                    try {
                    label_53:
                        inputStream0.close();
                    }
                    catch(IOException iOException1) {
                        iOException1.printStackTrace();
                    }
                label_57:
                    if(httpURLConnection0 != null) {
                        httpURLConnection0.disconnect();
                        this.a();
                        return;
                    }
                }
                this.a();
                return;
            }
            catch(Throwable throwable0) {
            label_60:
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException2) {
                        iOException2.printStackTrace();
                    }
                }
                if(httpURLConnection0 != null) {
                    httpURLConnection0.disconnect();
                }
                throw throwable0;
            }
        label_68:
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException3) {
                    iOException3.printStackTrace();
                }
            }
            httpURLConnection0.disconnect();
            this.a();
        }
    }

    static class c extends Thread {
        private String a;
        private String b;
        private e c;
        private String d;
        private Context e;
        private boolean f;
        private M g;

        private c(Context context0, e t$e0, String s, String s1, M m0) {
            this.a = "";
            this.c = t$e0;
            this.b = s;
            this.d = s1;
            this.f = false;
            this.g = m0;
            this.e = context0;
        }

        c(Context context0, e t$e0, String s, String s1, M m0, a t$a0) {
            this(context0, t$e0, s, s1, m0);
        }

        private String a() [...] // 潜在的解密器

        private void b() {
            class com.igaworks.ssp.t.c.a implements Runnable {
                final c a;

                @Override
                public void run() {
                    if(c.this.c != e.i && c.this.c != e.j && c.this.c != e.m && c.this.c != e.r && c.this.c != e.s && c.this.c != e.u && c.this.g != null) {
                        try {
                            com.igaworks.ssp.b.c(Thread.currentThread(), c.this.c.name() + "\nPlacementID : " + c.this.d + "\nTimeOut : " + c.this.f + "\nURL : " + c.this.b + "\n==HttpResponseString==\n");
                            com.igaworks.ssp.b.c(Thread.currentThread(), new JSONObject(c.this.a).toString(4).trim());
                            goto label_6;
                        }
                        catch(Exception exception0) {
                            try {
                                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                            label_6:
                                c.this.g.onNetResponseListener(c.this.c, c.this.a, c.this.d, c.this.f);
                                return;
                            }
                            catch(Exception exception1) {
                            }
                        }
                        com.igaworks.ssp.b.a(Thread.currentThread(), exception1);
                    }
                }
            }

            try {
                if(t.a == null) {
                    t.a = new Handler(Looper.getMainLooper());
                }
                t.a.post(new com.igaworks.ssp.t.c.a(this));
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        }

        @Override
        public void run() {
            InputStream inputStream1;
            HttpsURLConnection httpsURLConnection0;
            URL uRL0;
            super.run();
            InputStream inputStream0 = null;
            try {
                com.igaworks.ssp.b.c(Thread.currentThread(), "url = " + this.b);
                boolean z = this.b.startsWith("https://");
                uRL0 = new URL(this.b);
                if(z) {
                    httpsURLConnection0 = (HttpsURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection())));
                    goto label_7;
                }
                else {
                    goto label_22;
                }
                goto label_100;
            }
            catch(SocketTimeoutException unused_ex) {
                httpsURLConnection0 = null;
                goto label_64;
            }
            catch(Exception exception0) {
                httpsURLConnection0 = null;
                goto label_58;
            }
            catch(Throwable throwable0) {
                httpsURLConnection0 = null;
                goto label_81;
            }
            try {
            label_7:
                httpsURLConnection0.setRequestMethod("GET");
                httpsURLConnection0.setDoInput(true);
                httpsURLConnection0.setReadTimeout(5000);
                httpsURLConnection0.setConnectTimeout(5000);
                httpsURLConnection0.setRequestProperty("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                inputStream0 = t.b(httpsURLConnection0);
                if(inputStream0 != null) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
                    String s;
                    while((s = bufferedReader0.readLine()) != null) {
                        stringBuilder0.append(s);
                    }
                    this.a = stringBuilder0.toString();
                }
                goto label_93;
            }
            catch(SocketTimeoutException unused_ex) {
                goto label_64;
            }
            catch(Exception exception0) {
                goto label_63;
            }
            catch(Throwable throwable0) {
                goto label_81;
            }
            try {
            label_22:
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection())));
                httpURLConnection0.setRequestMethod("GET");
                httpURLConnection0.setDoInput(true);
                httpURLConnection0.setReadTimeout(5000);
                httpURLConnection0.setConnectTimeout(5000);
                httpURLConnection0.setRequestProperty("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                inputStream1 = t.b(httpURLConnection0);
            }
            catch(SocketTimeoutException unused_ex) {
                httpsURLConnection0 = null;
                goto label_64;
            }
            catch(Exception exception0) {
                httpsURLConnection0 = null;
                goto label_58;
            }
            catch(Throwable throwable0) {
                httpsURLConnection0 = null;
                goto label_81;
            }
            if(inputStream1 == null) {
                httpsURLConnection0 = null;
            label_93:
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException3) {
                        iOException3.printStackTrace();
                    }
                }
                if(httpsURLConnection0 != null) {
                    httpsURLConnection0.disconnect();
                }
            }
            else {
                try {
                    StringBuilder stringBuilder1 = new StringBuilder();
                    BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1));
                    String s1;
                    while((s1 = bufferedReader1.readLine()) != null) {
                        stringBuilder1.append(s1);
                    }
                    this.a = stringBuilder1.toString();
                    httpsURLConnection0 = null;
                    inputStream0 = inputStream1;
                    goto label_93;
                }
                catch(SocketTimeoutException unused_ex) {
                }
                catch(Exception exception0) {
                    httpsURLConnection0 = null;
                    inputStream0 = inputStream1;
                    goto label_58;
                }
                catch(Throwable throwable0) {
                    httpsURLConnection0 = null;
                    inputStream0 = inputStream1;
                    goto label_81;
                }
                httpsURLConnection0 = null;
                inputStream0 = inputStream1;
                goto label_64;
                try {
                    while(true) {
                    label_58:
                        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                        goto label_73;
                        try {
                            goto label_81;
                        label_63:
                        }
                        catch(SocketTimeoutException unused_ex) {
                            break;
                        }
                        catch(Exception exception0) {
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_81;
                }
            label_64:
                this.f = true;
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException0) {
                        iOException0.printStackTrace();
                    }
                }
                if(httpsURLConnection0 != null) {
                    httpsURLConnection0.disconnect();
                    goto label_100;
                label_73:
                    if(inputStream0 != null) {
                        try {
                            inputStream0.close();
                        }
                        catch(IOException iOException1) {
                            iOException1.printStackTrace();
                        }
                    }
                    if(httpsURLConnection0 != null) {
                        httpsURLConnection0.disconnect();
                        goto label_100;
                    label_81:
                        if(inputStream0 != null) {
                            try {
                                inputStream0.close();
                            }
                            catch(IOException iOException2) {
                                iOException2.printStackTrace();
                            }
                        }
                        if(httpsURLConnection0 != null) {
                            httpsURLConnection0.disconnect();
                        }
                        throw throwable0;
                    }
                }
            }
        label_100:
            this.b();
        }
    }

    static class d extends Thread {
        private String a;
        private e b;
        private Context c;
        private JSONObject d;
        private JSONObject e;
        private String f;
        private String g;
        private boolean h;
        private boolean i;
        private String j;
        private String k;
        private String l;
        private M m;
        private N n;
        private String o;
        private List p;
        private List q;
        private String r;
        private int s;
        private String t;
        private int u;
        private int v;
        private String w;
        private String x;

        private d(Context context0, e t$e0, String s, int v, String s1, M m0) {
            this.f = "";
            this.g = "";
            this.h = false;
            this.o = "";
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.m = m0;
            this.v = v;
            this.w = s1;
        }

        d(Context context0, e t$e0, String s, int v, String s1, M m0, a t$a0) {
            this(context0, t$e0, s, v, s1, m0);
        }

        private d(Context context0, e t$e0, String s, String s1, M m0) {
            this.f = "";
            this.g = "";
            this.h = false;
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.m = m0;
            this.o = s1;
        }

        d(Context context0, e t$e0, String s, String s1, M m0, a t$a0) {
            this(context0, t$e0, s, s1, m0);
        }

        private d(Context context0, e t$e0, String s, String s1, N n0) {
            this.f = "";
            this.g = "";
            this.h = false;
            this.o = "";
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.n = n0;
            this.x = s1;
        }

        d(Context context0, e t$e0, String s, String s1, N n0, a t$a0) {
            this(context0, t$e0, s, s1, n0);
        }

        private d(Context context0, e t$e0, String s, String s1, String s2, int v, M m0) {
            this.f = "";
            this.h = false;
            this.r = "";
            this.s = 0;
            this.t = "";
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.g = s1;
            this.m = m0;
            this.o = s2;
            this.u = v;
        }

        d(Context context0, e t$e0, String s, String s1, String s2, int v, M m0, a t$a0) {
            this(context0, t$e0, s, s1, s2, v, m0);
        }

        private d(Context context0, e t$e0, String s, String s1, String s2, String s3, M m0) {
            this.f = "";
            this.g = "";
            this.h = false;
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.j = s1;
            this.k = s2;
            this.l = s3;
            this.b = t$e0;
            this.m = m0;
            this.o = "";
        }

        d(Context context0, e t$e0, String s, String s1, String s2, String s3, M m0, a t$a0) {
            this(context0, t$e0, s, s1, s2, s3, m0);
        }

        private d(Context context0, e t$e0, String s, String s1, String s2, List list0, List list1, String s3, int v, M m0) {
            this.f = "";
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.g = s1;
            this.m = m0;
            this.h = false;
            this.o = s2;
            this.p = list0;
            this.q = list1;
            this.r = s3;
            this.s = v;
        }

        d(Context context0, e t$e0, String s, String s1, String s2, List list0, List list1, String s3, int v, M m0, a t$a0) {
            this(context0, t$e0, s, s1, s2, list0, list1, s3, v, m0);
        }

        private d(Context context0, e t$e0, String s, String s1, String s2, JSONObject jSONObject0, M m0) {
            this.f = "";
            this.h = false;
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.g = s1;
            this.m = m0;
            this.o = s2;
            this.e = jSONObject0;
        }

        d(Context context0, e t$e0, String s, String s1, String s2, JSONObject jSONObject0, M m0, a t$a0) {
            this(context0, t$e0, s, s1, s2, jSONObject0, m0);
        }

        private d(Context context0, e t$e0, String s, String s1, String s2, boolean z, M m0) {
            this.f = "";
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.g = s1;
            this.m = m0;
            this.h = z;
            this.o = s2;
        }

        d(Context context0, e t$e0, String s, String s1, String s2, boolean z, M m0, a t$a0) {
            this(context0, t$e0, s, s1, s2, z, m0);
        }

        private d(Context context0, e t$e0, String s, JSONObject jSONObject0, M m0) {
            this.f = "";
            this.g = "";
            this.h = false;
            this.o = "";
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.m = m0;
            this.d = jSONObject0;
        }

        d(Context context0, e t$e0, String s, JSONObject jSONObject0, M m0, a t$a0) {
            this(context0, t$e0, s, jSONObject0, m0);
        }

        private d(Context context0, e t$e0, String s, JSONObject jSONObject0, N n0) {
            this.f = "";
            this.g = "";
            this.h = false;
            this.o = "";
            this.r = "";
            this.s = 0;
            this.t = "";
            this.u = 0;
            this.v = 0;
            this.w = "";
            this.x = "";
            this.c = context0;
            this.a = s;
            this.b = t$e0;
            this.n = n0;
            this.d = jSONObject0;
        }

        d(Context context0, e t$e0, String s, JSONObject jSONObject0, N n0, a t$a0) {
            this(context0, t$e0, s, jSONObject0, n0);
        }

        private void a(int v) {
            class com.igaworks.ssp.t.d.a implements Runnable {
                final int a;
                final d b;

                com.igaworks.ssp.t.d.a(int v) {
                    this.a = v;
                    super();
                }

                @Override
                public void run() {
                    if(d.this.m != null || d.this.n != null) {
                        try {
                            com.igaworks.ssp.b.c(Thread.currentThread(), d.this.b.name() + "\nPlacementID : " + d.this.g + "\nTimeOut : " + d.this.i + "\nHttpStatusCode : " + this.a + "\nURL : " + d.this.a + "\n==HttpResponseString==\n");
                            if(d.this.b != e.q) {
                                com.igaworks.ssp.b.c(Thread.currentThread(), new JSONObject(d.this.f).toString(4).trim());
                            }
                            goto label_7;
                        }
                        catch(Exception exception0) {
                            try {
                                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                            label_7:
                                if(d.this.m != null) {
                                    d.this.m.onNetResponseListener(d.this.b, d.this.f, d.this.g, d.this.i);
                                    return;
                                }
                                if(d.this.n != null) {
                                    if(this.a != 200) {
                                        d.this.n.b(d.this.b, d.this.f, d.this.i);
                                        return;
                                    }
                                    d.this.n.a(d.this.b, d.this.f, d.this.i);
                                    return;
                                }
                                return;
                            }
                            catch(Exception exception1) {
                            }
                        }
                        com.igaworks.ssp.b.a(Thread.currentThread(), exception1);
                    }
                }
            }

            try {
                if(t.a == null) {
                    t.a = new Handler(Looper.getMainLooper());
                }
                t.a.post(new com.igaworks.ssp.t.d.a(this, v));
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        }

        @Override
        public void run() {
            StringBuilder stringBuilder0;
            u u0;
            Throwable throwable1;
            Exception exception1;
            int v;
            SocketTimeoutException socketTimeoutException1;
            HttpURLConnection httpURLConnection0;
            super.run();
            InputStream inputStream0 = null;
            try {
                com.igaworks.ssp.b.c(Thread.currentThread(), "url = " + this.a);
                httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(this.a).openConnection())));
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                socketTimeoutException1 = socketTimeoutException0;
                v = 200;
                httpURLConnection0 = null;
                goto label_270;
            }
            catch(Exception exception0) {
                exception1 = exception0;
                v = 200;
                httpURLConnection0 = null;
                goto label_280;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                httpURLConnection0 = null;
                goto label_288;
            }
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setDoInput(true);
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setReadTimeout(5000);
                httpURLConnection0.setConnectTimeout(5000);
                httpURLConnection0.setRequestProperty("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                u0 = E.g().e();
                e t$e0 = this.b;
                e t$e1 = e.b;
                if(t$e0 != t$e1 && t$e0 != e.e) {
                    e t$e2 = e.d;
                    if(t$e0 != t$e2 && t$e0 != e.g) {
                        e t$e3 = e.c;
                        if(t$e0 == t$e3) {
                            goto label_162;
                        }
                        else {
                            goto label_58;
                        }
                    }
                    else {
                        JSONObject jSONObject1 = u0.a(this.c, this.g, this.o);
                        this.d = jSONObject1;
                        jSONObject1.put("banner_size", AdSize.BANNER_320x100.getValue());
                        if(this.b == t$e2) {
                            this.d.put("only_ad", false);
                        }
                        else {
                            this.d.put("only_ad", true);
                        }
                        JSONArray jSONArray1 = new JSONArray();
                        jSONArray1.put(7);
                        jSONArray1.put(8);
                        jSONArray1.put(9);
                        this.d.put("available_templates", jSONArray1);
                    }
                }
                else {
                    JSONObject jSONObject0 = u0.a(this.c, this.g, this.o);
                    this.d = jSONObject0;
                    jSONObject0.put("banner_size", AdSize.BANNER_320x50.getValue());
                    if(this.b == t$e1) {
                        this.d.put("only_ad", false);
                    }
                    else {
                        this.d.put("only_ad", true);
                    }
                    JSONArray jSONArray0 = new JSONArray();
                    jSONArray0.put(6);
                    this.d.put("available_templates", jSONArray0);
                }
                goto label_177;
            }
            catch(SocketTimeoutException socketTimeoutException2) {
                socketTimeoutException1 = socketTimeoutException2;
                goto label_269;
            }
            catch(Exception exception2) {
                exception1 = exception2;
                v = 200;
                goto label_280;
            }
            catch(Throwable throwable2) {
                throwable1 = throwable2;
                goto label_288;
            }
            try {
            label_58:
                if(t$e0 == e.f) {
                    goto label_162;
                }
                else if(t$e0 == e.h) {
                    this.d = u0.a(this.c, this.g, this.o);
                    JSONArray jSONArray5 = new JSONArray();
                    jSONArray5.put(12);
                    jSONArray5.put(13);
                    this.d.put("available_templates", jSONArray5);
                }
                else if(t$e0 == e.l || t$e0 == e.F) {
                    this.d = u0.a(this.c, this.g, this.o);
                }
                else if(t$e0 == e.p) {
                    this.d = u0.a(this.c, this.g, this.o);
                }
                else if(t$e0 == e.n || t$e0 == e.w) {
                    this.d = u0.a(this.c, this.g, this.o);
                    JSONArray jSONArray4 = new JSONArray();
                    jSONArray4.put(14);
                    jSONArray4.put(15);
                    jSONArray4.put(16);
                    jSONArray4.put(17);
                    jSONArray4.put(18);
                    jSONArray4.put(19);
                    jSONArray4.put(20);
                    this.d.put("available_templates", jSONArray4);
                }
                else if(t$e0 == e.o) {
                    this.d = u0.a(this.c, this.g, this.o);
                    JSONArray jSONArray2 = new JSONArray();
                    if(this.p != null) {
                        for(int v1 = 0; v1 < this.p.size(); ++v1) {
                            jSONArray2.put(this.p.get(v1));
                        }
                    }
                    this.d.put("bcat", jSONArray2);
                    JSONArray jSONArray3 = new JSONArray();
                    if(this.q != null) {
                        for(int v2 = 0; v2 < this.q.size(); ++v2) {
                            jSONArray3.put(this.q.get(v2));
                        }
                    }
                    this.d.put("bapp", jSONArray3);
                    this.d.put("tag_id", this.r);
                    this.d.put("plcmtcnt", this.s);
                }
                else if(t$e0 == e.q) {
                    JSONObject jSONObject7 = new JSONObject();
                    this.d = jSONObject7;
                    jSONObject7.put("app_key", "");
                    this.d.put("adid", "");
                    this.d.put("usn", this.j);
                    this.d.put("email", this.k);
                    this.d.put("cs_text", this.l);
                }
                else if(t$e0 == e.t) {
                    this.d = u0.a(this.c, null, this.o);
                }
                else if(t$e0 == e.v) {
                    JSONObject jSONObject6 = u0.a(this.c, this.g, this.o);
                    this.d = jSONObject6;
                    jSONObject6.put("splash_template_no", this.u);
                }
                else if(t$e0 == e.x) {
                    JSONObject jSONObject5 = new JSONObject();
                    this.d = jSONObject5;
                    jSONObject5.put("identity_type", this.v);
                    this.d.put("identifier", f.a(this.w));
                }
                else if(t$e0 == e.y) {
                    this.d = u0.a(this.c, this.g, this.o);
                }
                else if(t$e0 != e.z) {
                    if(t$e0 == e.B) {
                        this.d.put("media_key", "");
                        this.d.put("usn", "");
                    }
                    else if(t$e0 == e.C) {
                        this.d.put("media_key", "");
                        this.d.put("usn", "");
                    }
                    else if(t$e0 == e.G) {
                        JSONObject jSONObject4 = new JSONObject();
                        this.d = jSONObject4;
                        jSONObject4.put("media_key", this.o);
                    }
                    else if(t$e0 == e.H) {
                        JSONObject jSONObject3 = new JSONObject();
                        this.d = jSONObject3;
                        jSONObject3.put("media_key", this.x);
                        this.d.put("usn", "");
                    }
                    else if(t$e0 == e.I) {
                        JSONObject jSONObject2 = new JSONObject();
                        this.d = jSONObject2;
                        jSONObject2.put("media_key", "");
                        this.d.put("usn", "");
                        this.d.put("placement_id", this.x);
                    }
                    else if(t$e0 == e.L) {
                        this.d.put("media_key", "");
                        this.d.put("usn", "");
                    }
                }
                goto label_177;
            }
            catch(SocketTimeoutException socketTimeoutException3) {
                goto label_268;
            }
            catch(Exception exception3) {
                exception1 = exception3;
                v = 200;
                goto label_280;
            }
            catch(Throwable throwable3) {
                throwable1 = throwable3;
                goto label_288;
            }
            try {
                try {
                label_162:
                    JSONObject jSONObject8 = u0.a(this.c, this.g, this.o);
                    this.d = jSONObject8;
                    jSONObject8.put("banner_size", AdSize.BANNER_300x250.getValue());
                    if(this.b == t$e3) {
                        this.d.put("only_ad", false);
                    }
                    else {
                        this.d.put("only_ad", true);
                    }
                    JSONArray jSONArray6 = new JSONArray();
                    jSONArray6.put(10);
                    jSONArray6.put(11);
                    jSONArray6.put(21);
                    jSONArray6.put(22);
                    jSONArray6.put(23);
                    jSONArray6.put(24);
                    this.d.put("available_templates", jSONArray6);
                label_177:
                    JSONObject jSONObject9 = this.e;
                    if(jSONObject9 != null) {
                        this.d.put("bidding_token_list", jSONObject9);
                    }
                    boolean z = E.g().j();
                    if(this.b != e.x && this.b != e.z && this.b != e.B && this.b != e.C && this.b != e.D && this.b != e.G && this.b != e.H && this.b != e.I && this.b != e.J && this.b != e.K && this.b != e.L) {
                        goto label_182;
                    }
                    goto label_200;
                }
                catch(SocketTimeoutException socketTimeoutException2) {
                    socketTimeoutException1 = socketTimeoutException2;
                    goto label_269;
                }
                catch(Exception exception2) {
                    exception1 = exception2;
                    v = 200;
                    goto label_280;
                }
                try {
                label_182:
                    if(t.b == null) {
                        t.b = new AppLovinMaxDynamicBidAdapter();
                    }
                    ((BaseMediationAdapter)Class.forName("").cast(t.b)).checkValidMediation();
                    this.d.put("applovin_installed", true);
                    goto label_194;
                }
                catch(ClassNotFoundException unused_ex) {
                }
                catch(NoClassDefFoundError unused_ex) {
                    goto label_189;
                }
                catch(NoSuchMethodError unused_ex) {
                    goto label_191;
                }
                catch(Exception unused_ex) {
                    goto label_193;
                }
                try {
                    this.d.put("applovin_installed", false);
                    goto label_194;
                label_189:
                    this.d.put("applovin_installed", false);
                    goto label_194;
                label_191:
                    this.d.put("applovin_installed", false);
                    goto label_194;
                label_193:
                    this.d.put("applovin_installed", false);
                label_194:
                    if(z) {
                        this.d.put("tag_for_child", 1);
                    }
                    else {
                        this.d.put("tag_for_child", 0);
                    }
                }
                catch(SocketTimeoutException socketTimeoutException2) {
                    socketTimeoutException1 = socketTimeoutException2;
                    goto label_269;
                }
                catch(Exception exception2) {
                    exception1 = exception2;
                    v = 200;
                    goto label_280;
                }
                try {
                    if(t0.a() && !E.g().d("")) {
                        this.d.put("dfinery_id_used", true);
                    }
                label_200:
                    if(z) {
                        goto label_201;
                    }
                    goto label_207;
                }
                catch(Exception unused_ex) {
                    goto label_200;
                }
                try {
                label_201:
                    com.igaworks.ssp.b.c(Thread.currentThread(), "Request tagForChild : true");
                    if(this.d != null && this.d.has("adid")) {
                        this.d.put("adid", "");
                    }
                    else if(this.d != null && this.d.has("gaid")) {
                        this.d.put("gaid", "");
                    }
                label_207:
                    if(this.d != null) {
                        goto label_208;
                    }
                    goto label_211;
                }
                catch(SocketTimeoutException socketTimeoutException2) {
                    socketTimeoutException1 = socketTimeoutException2;
                    goto label_269;
                }
                catch(Exception exception2) {
                    exception1 = exception2;
                    v = 200;
                    goto label_280;
                }
                try {
                label_208:
                    com.igaworks.ssp.b.c(Thread.currentThread(), "Request Parameter : " + this.d.toString(4).trim());
                    goto label_211;
                }
                catch(Exception unused_ex) {
                    try {
                        try {
                            com.igaworks.ssp.b.c(Thread.currentThread(), "Request Parameter : " + this.d.toString());
                        label_211:
                            OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                            outputStream0.write(this.d.toString().getBytes());
                            outputStream0.flush();
                            outputStream0.close();
                        }
                        catch(SocketTimeoutException socketTimeoutException2) {
                            socketTimeoutException1 = socketTimeoutException2;
                            goto label_269;
                        }
                        try {
                            v = httpURLConnection0.getResponseCode();
                        }
                        catch(IOException iOException0) {
                            try {
                                throw new RuntimeException(iOException0);
                            }
                            catch(SocketTimeoutException socketTimeoutException2) {
                                socketTimeoutException1 = socketTimeoutException2;
                                goto label_269;
                            }
                        }
                    }
                    catch(Exception exception2) {
                        exception1 = exception2;
                        v = 200;
                        goto label_280;
                    }
                }
                try {
                    stringBuilder0 = new StringBuilder();
                    if(v == 422) {
                        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(httpURLConnection0.getErrorStream(), "utf-8"));
                        String s;
                        while((s = bufferedReader0.readLine()) != null) {
                            stringBuilder0.append(s);
                        }
                        this.f = stringBuilder0.toString();
                        bufferedReader0.close();
                        goto label_296;
                    }
                    else {
                        inputStream0 = t.b(httpURLConnection0, this.d.toString());
                        goto label_246;
                    }
                    goto label_302;
                }
                catch(SocketTimeoutException socketTimeoutException4) {
                    socketTimeoutException1 = socketTimeoutException4;
                    goto label_270;
                }
                catch(Exception exception4) {
                    exception1 = exception4;
                    goto label_280;
                }
                try {
                    throwable1 = throwable2;
                    goto label_288;
                }
                catch(SocketTimeoutException socketTimeoutException2) {
                    socketTimeoutException1 = socketTimeoutException2;
                    goto label_269;
                }
                catch(Exception exception2) {
                    exception1 = exception2;
                    v = 200;
                    goto label_280;
                }
            }
            catch(Throwable throwable2) {
                throwable1 = throwable2;
                goto label_288;
            }
        label_246:
            if(inputStream0 == null) {
            label_296:
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException4) {
                        iOException4.printStackTrace();
                    }
                }
                httpURLConnection0.disconnect();
            }
            else {
                try {
                    try {
                        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream0));
                        String s1;
                        while((s1 = bufferedReader1.readLine()) != null) {
                            stringBuilder0.append(s1);
                        }
                        this.f = stringBuilder0.toString();
                        goto label_296;
                    }
                    catch(SocketTimeoutException socketTimeoutException5) {
                        socketTimeoutException1 = socketTimeoutException5;
                        goto label_270;
                    }
                    catch(Exception exception5) {
                        exception1 = exception5;
                        goto label_280;
                    }
                    try {
                        throwable1 = throwable3;
                        goto label_288;
                    label_268:
                        socketTimeoutException1 = socketTimeoutException3;
                    label_269:
                        v = 200;
                    }
                    catch(SocketTimeoutException socketTimeoutException3) {
                        goto label_268;
                    }
                    catch(Exception exception3) {
                        exception1 = exception3;
                        v = 200;
                        goto label_280;
                    }
                label_270:
                    this.i = true;
                    com.igaworks.ssp.b.a(Thread.currentThread(), socketTimeoutException1);
                    if(inputStream0 != null) {
                        goto label_273;
                    }
                    goto label_277;
                }
                catch(Throwable throwable3) {
                    throwable1 = throwable3;
                    goto label_288;
                }
                try {
                label_273:
                    inputStream0.close();
                }
                catch(IOException iOException1) {
                    iOException1.printStackTrace();
                }
            label_277:
                if(httpURLConnection0 != null) {
                    httpURLConnection0.disconnect();
                    goto label_302;
                    try {
                    label_280:
                        com.igaworks.ssp.b.a(Thread.currentThread(), exception1);
                        if(inputStream0 != null) {
                            goto label_282;
                        }
                        goto label_286;
                    }
                    catch(Throwable throwable3) {
                        throwable1 = throwable3;
                        goto label_288;
                    }
                    try {
                    label_282:
                        inputStream0.close();
                    }
                    catch(IOException iOException2) {
                        iOException2.printStackTrace();
                    }
                label_286:
                    if(httpURLConnection0 != null) {
                        httpURLConnection0.disconnect();
                        this.a(v);
                        return;
                    label_288:
                        if(inputStream0 != null) {
                            try {
                                inputStream0.close();
                            }
                            catch(IOException iOException3) {
                                iOException3.printStackTrace();
                            }
                        }
                        if(httpURLConnection0 != null) {
                            httpURLConnection0.disconnect();
                        }
                        throw throwable1;
                    }
                }
            }
        label_302:
            this.a(v);
        }
    }

    public static enum e {
        POST_BANNER_320x50(1),
        POST_BANNER_300x250(2),
        POST_BANNER_320x100(3),
        POST_BANNER_320x50_ONLY_AD(4),
        POST_BANNER_300x250_ONLY_AD(5),
        POST_BANNER_320x100_ONLY_AD(6),
        POST_INTERSTITIAL(7),
        IMPRESSION(8),
        CLICK_REPORT_URL(9),
        POST_COLLECT_INSTALLED_APP(10),
        POST_REWARD_VIDEO_AD(11),
        COMPLETE_URL(12),
        NATIVE_AD(13),
        ONESTORE_AD(14),
        POST_INTERSTITIAL_VIDEO_AD(15),
        SEND_CS_MESSAGE(16),
        RV_COMPLETE_REPORT_URL(17),
        VAST_TRACKER(18),
        INIT(19),
        WIN_NOTICE(20),
        SPLASH_AD(21),
        REACT_NATIVE_AD(22),
        UID_TOKEN(23),
        POST_MODAL_AD(24),
        POST_CONTENTS_AD_COMPLETE(25),
        POST_LOAD_AD_AND_CONTENTS_COMPLETE(26),
        NPAY_GET_USER(27),
        NPAY_ADD_USER(28),
        NPAY_POINT(29),
        POPCONTENTS_METADATA(30),
        POST_VIDEO_MIX(0x1F),
        REWARD_AD_PLUS_INIT_PLACEMENTS(0x20),
        REWARD_AD_PLUS_MEDIA_SUMMARY(33),
        REWARD_AD_PLUS_PLACEMENT_SUMMARY(34),
        REWARD_AD_PLUS_CLAIM_POINT_BOX(35),
        REWARD_AD_PLUS_CLAIM_NPAY(36),
        NPAY_REGISTER_V15(37);

        private int a;

        private e(int v1) {
            this.a = v1;
        }

        private static e[] a() [...] // Inlined contents
    }

    private static Handler a;
    private static AppLovinMaxDynamicBidAdapter b;

    static {
        t.a = new Handler(Looper.getMainLooper());
    }

    public void a(Context context0, int v, String s, M m0) {
        new d(context0, e.x, "https://sspapi-uid2.adpopcorn.com/token", v, s, m0, null).start();
    }

    public void a(Context context0, e t$e0, String s) {
        switch(t$e0.ordinal()) {
            case 7: 
            case 8: 
            case 11: 
            case 16: 
            case 17: 
            case 19: {
                new c(context0, t$e0, s, "", null, null).start();
            }
        }
    }

    public void a(Context context0, e t$e0, String s, N n0) {
        if(t$e0 == e.H) {
            new d(context0, t$e0, "https://ssp-rv-plus.adpopcorn.com/v1/info/summary/media", s, n0, null).start();
            return;
        }
        if(t$e0 == e.I) {
            new d(context0, t$e0, "https://ssp-rv-plus.adpopcorn.com/v1/info/summary/placement", s, n0, null).start();
        }
    }

    public void a(Context context0, e t$e0, String s, String s1, int v, M m0) {
        if(t$e0.ordinal() == 20) {
            new d(context0, e.v, "https://sspi.adpopcorn.com/v2_sdk/rev1/splash", s, s1, v, m0, null).start();
        }
    }

    public void a(Context context0, e t$e0, String s, String s1, JSONObject jSONObject0, M m0) {
        switch(t$e0.ordinal()) {
            case 0: {
                new d(context0, e.b, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 1: {
                new d(context0, e.c, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 2: {
                new d(context0, e.d, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 3: {
                new d(context0, e.e, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 4: {
                new d(context0, e.f, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 5: {
                new d(context0, e.g, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 6: {
                new d(context0, e.h, "https://sspi.adpopcorn.com/v2_sdk/rev1/interstitial", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 10: {
                new d(context0, e.l, "https://sspi.adpopcorn.com/v2_sdk/rev1/video", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 12: {
                new d(context0, e.n, "https://sspi.adpopcorn.com/v2_sdk/rev1/native", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 14: {
                new d(context0, e.p, "https://sspi.adpopcorn.com/v2_sdk/rev1/interstitial", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 23: {
                new d(context0, e.y, "https://sspi.adpopcorn.com/v2_sdk/rev1/modal", s, s1, jSONObject0, m0, null).start();
                return;
            }
            case 30: {
                new d(context0, e.F, "https://sspi.adpopcorn.com/v2_sdk/rev1/video", s, s1, jSONObject0, m0, null).start();
            }
        }
    }

    public void a(Context context0, e t$e0, String s, String s1, boolean z, M m0) {
        switch(t$e0.ordinal()) {
            case 0: {
                new d(context0, e.b, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, z, m0, null).start();
                return;
            }
            case 1: {
                new d(context0, e.c, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, z, m0, null).start();
                return;
            }
            case 2: {
                new d(context0, e.d, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, z, m0, null).start();
                return;
            }
            case 3: {
                new d(context0, e.e, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, z, m0, null).start();
                return;
            }
            case 4: {
                new d(context0, e.f, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, z, m0, null).start();
                return;
            }
            case 5: {
                new d(context0, e.g, "https://sspi.adpopcorn.com/v2_sdk/rev1/banner", s, s1, z, m0, null).start();
                return;
            }
            case 6: {
                new d(context0, e.h, "https://sspi.adpopcorn.com/v2_sdk/rev1/interstitial", s, s1, z, m0, null).start();
                return;
            }
            case 10: {
                new d(context0, e.l, "https://sspi.adpopcorn.com/v2_sdk/rev1/video", s, s1, z, m0, null).start();
                return;
            }
            case 12: {
                new d(context0, e.n, "https://sspi.adpopcorn.com/v2_sdk/rev1/native", s, s1, z, m0, null).start();
                return;
            }
            case 14: {
                new d(context0, e.p, "https://sspi.adpopcorn.com/v2_sdk/rev1/interstitial", s, s1, z, m0, null).start();
                return;
            }
            case 21: {
                new d(context0, e.w, "https://sspi.adpopcorn.com/v2_sdk/rev1/native", s, s1, z, m0, null).start();
                return;
            }
            case 23: {
                new d(context0, e.y, "https://sspi.adpopcorn.com/v2_sdk/rev1/modal", s, s1, z, m0, null).start();
            }
        }
    }

    public void a(Context context0, e t$e0, JSONObject jSONObject0, M m0) {
        if(E.g().n()) {
            switch(t$e0.ordinal()) {
                case 26: {
                    new d(context0, e.B, "https://ssp-reward-plus-dev.adpopcorn.com/naverpay/getuser", jSONObject0, m0, null).start();
                    return;
                }
                case 27: {
                    new d(context0, e.C, "https://ssp-reward-plus-dev.adpopcorn.com/naverpay/adduser", jSONObject0, m0, null).start();
                    return;
                }
                case 28: {
                    new d(context0, e.D, "https://ssp-reward-plus-dev.adpopcorn.com/naverpay/point", jSONObject0, m0, null).start();
                    return;
                }
                default: {
                    return;
                }
            }
        }
        switch(t$e0.ordinal()) {
            case 26: {
                new d(context0, e.B, "https://ssp-reward-plus.adpopcorn.com/naverpay/getuser", jSONObject0, m0, null).start();
                return;
            }
            case 27: {
                new d(context0, e.C, "https://ssp-reward-plus.adpopcorn.com/naverpay/adduser", jSONObject0, m0, null).start();
                return;
            }
            case 28: {
                new d(context0, e.D, "https://ssp-reward-plus.adpopcorn.com/naverpay/point", jSONObject0, m0, null).start();
            }
        }
    }

    public void a(Context context0, e t$e0, JSONObject jSONObject0, N n0) {
        switch(t$e0.ordinal()) {
            case 34: {
                new d(context0, t$e0, "https://ssp-rv-plus.adpopcorn.com/v1/pointbox/claim", jSONObject0, n0, null).start();
                return;
            }
            case 35: {
                new d(context0, t$e0, "https://ssp-rv-plus.adpopcorn.com/v1/naverpay/claim", jSONObject0, n0, null).start();
                return;
            }
            case 36: {
                new d(context0, t$e0, "https://ssp-rv-plus.adpopcorn.com/v1/naverpay/register", jSONObject0, n0, null).start();
            }
        }
    }

    public void a(Context context0, e t$e0, boolean z, JSONObject jSONObject0, l l0, L l1) {
        if(z) {
            new b(context0, t$e0, "https://benefits-api-dev.adpopcorn.com/complete", jSONObject0, l0, l1, null).start();
            return;
        }
        new b(context0, t$e0, "https://benefits-api-prod.adpopcorn.com/complete", jSONObject0, l0, l1, null).start();
    }

    public void a(Context context0, String s, M m0) {
        new d(context0, e.t, "https://sspi.adpopcorn.com/v2_sdk/init", s, m0, null).start();
    }

    public void a(Context context0, String s, String s1, String s2, M m0) {
        new d(context0, e.q, "https://sspi-reward-cs.adpopcorn.com/live", s, s1, s2, m0, null).start();
    }

    public void a(Context context0, String s, String s1, List list0, List list1, String s2, int v, M m0) {
        new d(context0, e.o, "https://sspi.adpopcorn.com/v2_sdk/rev1/onestore_multi", s, s1, list0, list1, s2, v, m0, null).start();
    }

    // This method was un-flattened
    private static InputStream b(URLConnection uRLConnection0) {
        InputStream inputStream0 = null;
        for(int v = 0; true; ++v) {
            try {
                if(uRLConnection0 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
                }
                else if(uRLConnection0 instanceof HttpURLConnection) {
                    ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
                }
                inputStream0 = uRLConnection0.getInputStream();
                if(uRLConnection0 instanceof HttpsURLConnection) {
                    int v2 = ((HttpsURLConnection)uRLConnection0).getResponseCode();
                    if(v2 < 300 || v2 > 307 || v2 == 306 || v2 == 304) {
                        return inputStream0;
                    }
                }
                else if(uRLConnection0 instanceof HttpURLConnection) {
                    int v1 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                    if(v1 >= 300 && v1 <= 307 && v1 != 306 && v1 != 304) {
                        URL uRL0 = ((HttpURLConnection)uRLConnection0).getURL();
                        String s = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
                        URL uRL1 = s == null ? null : new URL(uRL0, s);
                        ((HttpURLConnection)uRLConnection0).disconnect();
                        if(uRL1 == null || !uRL1.getProtocol().equals("http") && !uRL1.getProtocol().equals("https") || v >= 5) {
                            return null;
                        }
                        uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL1.openConnection());
                        continue;
                    }
                }
                else {
                    return inputStream0;
                }
                URL uRL2 = ((HttpsURLConnection)uRLConnection0).getURL();
                String s1 = ((HttpsURLConnection)uRLConnection0).getHeaderField("Location");
                URL uRL3 = s1 == null ? null : new URL(uRL2, s1);
                ((HttpsURLConnection)uRLConnection0).disconnect();
                if(uRL3 == null || !uRL3.getProtocol().equals("http") && !uRL3.getProtocol().equals("https") || v >= 5) {
                    return null;
                }
                uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL3.openConnection());
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                return inputStream0;
            }
        }
    }

    // This method was un-flattened
    private static InputStream b(URLConnection uRLConnection0, String s) {
        URLConnection uRLConnection2;
        int v = 0;
        InputStream inputStream0 = null;
        for(URLConnection uRLConnection1 = uRLConnection0; true; uRLConnection1 = uRLConnection2) {
            try {
                if(uRLConnection1 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection)uRLConnection1).setInstanceFollowRedirects(false);
                }
                else if(uRLConnection1 instanceof HttpURLConnection) {
                    ((HttpURLConnection)uRLConnection1).setInstanceFollowRedirects(false);
                }
                inputStream0 = uRLConnection1.getInputStream();
                if(uRLConnection1 instanceof HttpsURLConnection) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "openConnectionCheckRedirectsJsonBody https url : " + ((HttpsURLConnection)uRLConnection1).getURL());
                    int v1 = ((HttpsURLConnection)uRLConnection1).getResponseCode();
                    if(v1 < 300 || v1 > 307 || v1 == 306 || v1 == 304) {
                        break;
                    }
                    URL uRL0 = ((HttpsURLConnection)uRLConnection1).getURL();
                    String s1 = ((HttpsURLConnection)uRLConnection1).getHeaderField("Location");
                    URL uRL1 = s1 == null ? null : new URL(uRL0, s1);
                    ((HttpsURLConnection)uRLConnection1).disconnect();
                    if(uRL1 == null || !uRL1.getProtocol().equals("http") && !uRL1.getProtocol().equals("https") || v >= 5) {
                        return null;
                    }
                    uRLConnection2 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL1.openConnection());
                    ((HttpURLConnection)uRLConnection2).setRequestMethod("POST");
                    uRLConnection2.setDoInput(true);
                    uRLConnection2.setDoOutput(true);
                    uRLConnection2.setReadTimeout(5000);
                    uRLConnection2.setConnectTimeout(5000);
                    uRLConnection2.setRequestProperty("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                    uRLConnection2.setRequestProperty("Content-Type", "application/json");
                    OutputStream outputStream0 = uRLConnection2.getOutputStream();
                    outputStream0.write(s.getBytes());
                    outputStream0.flush();
                    outputStream0.close();
                }
                else {
                    if(!(uRLConnection1 instanceof HttpURLConnection)) {
                        break;
                    }
                    com.igaworks.ssp.b.c(Thread.currentThread(), "openConnectionCheckRedirectsJsonBody http url : " + ((HttpURLConnection)uRLConnection1).getURL());
                    int v2 = ((HttpURLConnection)uRLConnection1).getResponseCode();
                    if(v2 < 300 || v2 > 307 || v2 == 306 || v2 == 304) {
                        break;
                    }
                    URL uRL2 = ((HttpURLConnection)uRLConnection1).getURL();
                    String s2 = ((HttpURLConnection)uRLConnection1).getHeaderField("Location");
                    URL uRL3 = s2 == null ? null : new URL(uRL2, s2);
                    ((HttpURLConnection)uRLConnection1).disconnect();
                    if(uRL3 == null || !uRL3.getProtocol().equals("http") && !uRL3.getProtocol().equals("https") || v >= 5) {
                        return null;
                    }
                    uRLConnection2 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL3.openConnection());
                    ((HttpURLConnection)uRLConnection2).setRequestMethod("POST");
                    uRLConnection2.setDoInput(true);
                    uRLConnection2.setDoOutput(true);
                    uRLConnection2.setReadTimeout(5000);
                    uRLConnection2.setConnectTimeout(5000);
                    uRLConnection2.setRequestProperty("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                    uRLConnection2.setRequestProperty("Content-Type", "application/json");
                    OutputStream outputStream1 = uRLConnection2.getOutputStream();
                    outputStream1.write(s.getBytes());
                    outputStream1.flush();
                    outputStream1.close();
                }
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                return inputStream0;
            }
            ++v;
        }
        return inputStream0;
    }

    public void b(Context context0, String s, M m0) {
        new c(context0, e.E, s, null, m0, null).start();
    }

    public void c(Context context0, String s, M m0) {
        new d(context0, e.G, "https://ssp-rv-plus.adpopcorn.com/v1/info/placements", s, m0, null).start();
    }
}

