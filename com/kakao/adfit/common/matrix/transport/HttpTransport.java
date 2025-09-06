package com.kakao.adfit.common.matrix.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kakao.adfit.common.matrix.MatrixItemType;
import com.kakao.adfit.j.c;
import com.kakao.adfit.k.d;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.t;
import j..util.concurrent.ConcurrentHashMap;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;

public final class HttpTransport implements c {
    @t
    static enum DataCategory {
        public static final class a {
            private a() {
            }

            public a(w w0) {
            }

            public final DataCategory a(String s) {
                L.p(s, "category");
                try {
                    return DataCategory.valueOf(v.q1(s));
                }
                catch(IllegalArgumentException unused_ex) {
                    f.e(("Unknown category: " + s));
                    return DataCategory.Unknown;
                }
            }
        }

        All("__all__"),
        Default("default"),
        Error("error"),
        Session("session"),
        Attachment("attachment"),
        Transaction("transaction"),
        Security("security"),
        Unknown("unknown");

        @l
        public static final a Companion;
        private final String a;

        static {
            DataCategory.Companion = new a(null);
        }

        private DataCategory(String s1) {
            this.a = s1;
        }

        private static final DataCategory[] a() [...] // Inlined contents

        @l
        public final String getCategory() {
            return this.a;
        }
    }

    public static final class com.kakao.adfit.common.matrix.transport.HttpTransport.a {
        private com.kakao.adfit.common.matrix.transport.HttpTransport.a() {
        }

        public com.kakao.adfit.common.matrix.transport.HttpTransport.a(w w0) {
        }

        private final String a(com.kakao.adfit.common.matrix.a a0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Sentry sentry_version=");
            stringBuilder0.append(7);
            stringBuilder0.append(",sentry_client=");
            stringBuilder0.append("com.kakao.adfit.ads/3.17.2");
            stringBuilder0.append(",sentry_key=");
            stringBuilder0.append(a0.a());
            String s = a0.b();
            if(s != null && s.length() > 0) {
                stringBuilder0.append(",sentry_secret=");
                stringBuilder0.append(a0.b());
            }
            String s1 = stringBuilder0.toString();
            L.o(s1, "StringBuilder().apply(builderAction).toString()");
            return s1;
        }

        private final URL b(com.kakao.adfit.common.matrix.a a0) {
            try {
                URI uRI0 = a0.c();
                URL uRL0 = uRI0.resolve(uRI0.getPath() + "/store/").toURL();
                L.o(uRL0, "uri.let { it.resolve(it.…th + \"/store/\").toURL() }");
                return uRL0;
            }
            catch(URISyntaxException uRISyntaxException0) {
                throw new IllegalArgumentException("Failed to compose the Sentry\'s server URL.", uRISyntaxException0);
            }
            catch(MalformedURLException malformedURLException0) {
                throw new IllegalArgumentException("Failed to compose the Sentry\'s server URL.", malformedURLException0);
            }
        }
    }

    public abstract class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[MatrixItemType.values().length];
            try {
                arr_v[MatrixItemType.Event.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MatrixItemType.Session.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MatrixItemType.Attachment.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MatrixItemType.Transaction.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    private final d a;
    private final com.kakao.adfit.k.c b;
    private final Proxy c;
    private final int d;
    private final int e;
    private final URL f;
    private final String g;
    private final Map h;
    public static final com.kakao.adfit.common.matrix.transport.HttpTransport.a i;

    static {
        HttpTransport.i = new com.kakao.adfit.common.matrix.transport.HttpTransport.a(null);
    }

    public HttpTransport(com.kakao.adfit.common.matrix.a a0, d d0, com.kakao.adfit.k.c c0, Proxy proxy0, int v, int v1) {
        L.p(a0, "dsn");
        L.p(d0, "serializer");
        L.p(c0, "currentDateProvider");
        super();
        this.a = d0;
        this.b = c0;
        this.c = proxy0;
        this.d = v;
        this.e = v1;
        this.f = HttpTransport.i.b(a0);
        this.g = HttpTransport.i.a(a0);
        this.h = new ConcurrentHashMap();
    }

    public HttpTransport(com.kakao.adfit.common.matrix.a a0, d d0, com.kakao.adfit.k.c c0, Proxy proxy0, int v, int v1, int v2, w w0) {
        if((v2 & 8) != 0) {
            proxy0 = null;
        }
        this(a0, d0, c0, proxy0, ((v2 & 16) == 0 ? v : 5000), ((v2 & 0x20) == 0 ? v1 : 5000));
    }

    private final long a(String s) {
        if(s != null) {
            Double double0 = v.L0(s);
            return double0 == null ? 60000L : ((long)(((double)double0) * 1000.0));
        }
        return 60000L;
    }

    private final e a(HttpURLConnection httpURLConnection0, String s) {
        try {
            int v1 = httpURLConnection0.getResponseCode();
            this.a(httpURLConnection0, v1);
            if(this.a(v1)) {
                return e.c.b(v1);
            }
            f.b(("Request failed, API returned " + v1));
            return e.c.a(v1);
        }
        catch(IOException unused_ex) {
            f.b("Error reading and logging the response stream");
            return com.kakao.adfit.common.matrix.transport.e.a.a(e.c, 0, 1, null);
        }
        finally {
            this.a(httpURLConnection0);
        }
    }

    private final Object a(HttpURLConnection httpURLConnection0, Function1 function10) {
        Object object0;
        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0);
            try {
                BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream0, kotlin.text.f.b), 0x2000);
                try {
                    object0 = function10.invoke(bufferedWriter0);
                }
                catch(Throwable throwable2) {
                    kotlin.io.c.a(bufferedWriter0, throwable2);
                    throw throwable2;
                }
                kotlin.io.c.a(bufferedWriter0, null);
            }
            catch(Throwable throwable1) {
                kotlin.io.c.a(gZIPOutputStream0, throwable1);
                throw throwable1;
            }
            kotlin.io.c.a(gZIPOutputStream0, null);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(outputStream0, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(outputStream0, null);
        return object0;
    }

    private final HttpURLConnection a() {
        HttpURLConnection httpURLConnection0 = this.a(this.c);
        httpURLConnection0.setRequestMethod("POST");
        httpURLConnection0.setDoOutput(true);
        httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.setRequestProperty("Accept", "application/json");
        httpURLConnection0.setRequestProperty("X-Sentry-Auth", this.g);
        httpURLConnection0.setRequestProperty("Connection", "close");
        httpURLConnection0.setConnectTimeout(this.d);
        httpURLConnection0.setReadTimeout(this.e);
        httpURLConnection0.connect();
        return httpURLConnection0;
    }

    private final void a(DataCategory httpTransport$DataCategory0, Date date0) {
        Date date1 = (Date)this.h.get(httpTransport$DataCategory0);
        if(date1 == null || date0.after(date1)) {
            this.h.put(httpTransport$DataCategory0, date0);
        }
    }

    private final void a(String s, String s1, int v) {
        if(s != null) {
            for(Object object0: v.V4(s, new String[]{","}, false, 0, 6, null)) {
                List list0 = v.V4(v.l2(((String)object0), " ", "", false, 4, null), new String[]{":"}, false, 0, 6, null);
                if(!list0.isEmpty()) {
                    long v1 = this.a(((String)list0.get(0)));
                    if(list0.size() > 1) {
                        Date date0 = new Date(this.b.a() + v1);
                        String s2 = (String)list0.get(1);
                        if(s2.length() == 0) {
                            this.a(DataCategory.All, date0);
                        }
                        else {
                            for(Object object1: v.V4(s2, new String[]{";"}, false, 0, 6, null)) {
                                DataCategory httpTransport$DataCategory0 = DataCategory.Companion.a(((String)object1));
                                if(DataCategory.Unknown != httpTransport$DataCategory0) {
                                    this.a(httpTransport$DataCategory0, date0);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        if(v == 429) {
            long v2 = this.a(s1);
            Date date1 = new Date(this.b.a() + v2);
            this.a(DataCategory.All, date1);
        }
    }

    private final void a(HttpURLConnection httpURLConnection0) {
        try {
            httpURLConnection0.getInputStream().close();
        }
        catch(IOException unused_ex) {
        }
        finally {
            httpURLConnection0.disconnect();
        }
    }

    private final void a(HttpURLConnection httpURLConnection0, int v) {
        String s = httpURLConnection0.getHeaderField("Retry-After");
        this.a(httpURLConnection0.getHeaderField("X-Sentry-Rate-Limits"), s, v);
    }

    private final boolean a(int v) {
        return v == 200 || 200 <= v && v < 300;
    }

    @Override  // com.kakao.adfit.j.c
    public e a(com.kakao.adfit.common.matrix.e e0) {
        static final class com.kakao.adfit.common.matrix.transport.HttpTransport.c extends N implements Function1 {
            final HttpTransport a;
            final com.kakao.adfit.common.matrix.e b;

            com.kakao.adfit.common.matrix.transport.HttpTransport.c(HttpTransport httpTransport0, com.kakao.adfit.common.matrix.e e0) {
                this.a = httpTransport0;
                this.b = e0;
                super(1);
            }

            public final void a(BufferedWriter bufferedWriter0) {
                L.p(bufferedWriter0, "writer");
                this.a.a.a(this.b, bufferedWriter0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((BufferedWriter)object0));
                return S0.a;
            }
        }

        L.p(e0, "event");
        HttpURLConnection httpURLConnection0 = this.a();
        try {
            try {
                this.a(httpURLConnection0, new com.kakao.adfit.common.matrix.transport.HttpTransport.c(this, e0));
                return this.a(httpURLConnection0, "Event sent " + e0.g() + " successfully");
            }
            catch(IOException iOException0) {
            }
            f.b("An exception occurred while submitting the event to the Sentry server.", iOException0);
        }
        catch(Throwable unused_ex) {
            return this.a(httpURLConnection0, "Event sent " + e0.g() + " successfully");
        }
        return this.a(httpURLConnection0, "Event sent " + e0.g() + " successfully");
    }

    public final HttpURLConnection a(Proxy proxy0) {
        return this.a(this.f, proxy0);
    }

    public final HttpURLConnection a(URL uRL0, Proxy proxy0) {
        L.p(uRL0, "url");
        if(proxy0 == null) {
            proxy0 = Proxy.NO_PROXY;
        }
        URLConnection uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection(proxy0));
        L.n(uRLConnection0, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection)uRLConnection0;
    }

    @Override  // com.kakao.adfit.j.c
    public boolean a(MatrixItemType matrixItemType0) {
        L.p(matrixItemType0, "itemType");
        Date date0 = new Date(this.b.a());
        Date date1 = (Date)this.h.get(DataCategory.All);
        if(date1 != null && !date0.after(date1)) {
            return true;
        }
        DataCategory httpTransport$DataCategory0 = this.b(matrixItemType0);
        if(httpTransport$DataCategory0 == DataCategory.Unknown) {
            return false;
        }
        Date date2 = (Date)this.h.get(httpTransport$DataCategory0);
        return date2 == null ? false : !date0.after(date2);
    }

    private final DataCategory b(MatrixItemType matrixItemType0) {
        switch(matrixItemType0) {
            case 1: {
                return DataCategory.Error;
            }
            case 2: {
                return DataCategory.Session;
            }
            case 3: {
                return DataCategory.Attachment;
            }
            case 4: {
                return DataCategory.Transaction;
            }
            default: {
                return DataCategory.Unknown;
            }
        }
    }

    @Override
    public void close() {
    }
}

