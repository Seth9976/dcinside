package com.google.crypto.tink.util;

import O1.a;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport.Builder;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.Instant;

public class b {
    public static class com.google.crypto.tink.util.b.b {
        private HttpTransport a;
        private Executor b;
        private String c;

        public com.google.crypto.tink.util.b.b() {
            this.a = b.k;
            this.b = b.l;
        }

        public b a() {
            if(this.c == null) {
                throw new IllegalArgumentException("must provide a url with {#setUrl}");
            }
            return new b(this.b, this.a, this.c);
        }

        @a
        public com.google.crypto.tink.util.b.b b(Executor executor0) {
            this.b = executor0;
            return this;
        }

        @a
        public com.google.crypto.tink.util.b.b c(HttpTransport httpTransport0) {
            this.a = httpTransport0;
            return this;
        }

        @a
        public com.google.crypto.tink.util.b.b d(String s) {
            this.c = s;
            return this;
        }
    }

    private final Executor a;
    private final HttpTransport b;
    private final Object c;
    private final Object d;
    private final String e;
    @p3.a("instanceStateLock")
    private Runnable f;
    @p3.a("instanceStateLock")
    private String g;
    @p3.a("instanceStateLock")
    private long h;
    @p3.a("instanceStateLock")
    private long i;
    private static final Charset j;
    private static final NetHttpTransport k;
    private static final Executor l;
    private static final Pattern m;

    static {
        b.j = Charset.forName("UTF-8");
        b.k = new NetHttpTransport.Builder().build();
        b.l = Executors.newCachedThreadPool();
        b.m = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");
    }

    public b(Executor executor0, HttpTransport httpTransport0, String s) {
        b.s(s);
        this.a = executor0;
        this.b = httpTransport0;
        this.d = new Object();
        this.c = new Object();
        this.e = s;
        this.h = 0x8000000000000000L;
        this.i = 0L;
    }

    public String h() throws IOException {
        String s;
        synchronized(this.d) {
            if(this.n()) {
                if(this.r()) {
                    this.q();
                }
                return this.g;
            }
        }
        synchronized(this.c) {
            synchronized(this.d) {
                return this.n() ? this.g : this.i();
            }
            return s;
        }
    }

    @a
    @p3.a("fetchDataLock")
    private String i() throws IOException {
        String s;
        long v = this.j();
        HttpResponse httpResponse0 = this.b.createRequestFactory().buildGetRequest(new GenericUrl(this.e)).execute();
        if(httpResponse0.getStatusCode() == 200) {
            try(InputStream inputStream0 = httpResponse0.getContent()) {
                s = b.p(new InputStreamReader(inputStream0, b.j));
            }
            synchronized(this.d) {
                this.h = v;
                this.i = this.k(httpResponse0.getHeaders()) * 1000L;
                this.g = s;
                return s;
            }
        }
        throw new IOException("Unexpected status code = " + httpResponse0.getStatusCode());
    }

    long j() {
        return Instant.now().getMillis();
    }

    long k(HttpHeaders httpHeaders0) {
        long v = 0L;
        if(httpHeaders0.getCacheControl() != null) {
            String[] arr_s = httpHeaders0.getCacheControl().split(",");
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                Matcher matcher0 = b.m.matcher(arr_s[v1]);
                if(matcher0.matches()) {
                    v = (long)Long.valueOf(matcher0.group(1));
                    break;
                }
            }
        }
        if(httpHeaders0.getAge() != null) {
            v -= (long)httpHeaders0.getAge();
        }
        return Math.max(0L, v);
    }

    public HttpTransport l() {
        return this.b;
    }

    public String m() {
        return this.e;
    }

    @p3.a("instanceStateLock")
    private boolean n() {
        long v = this.j();
        return this.h + this.i > v && this.h <= v;
    }

    private Runnable o() {
        class com.google.crypto.tink.util.b.a implements Runnable {
            final b a;

            @Override
            public void run() {
                synchronized(b.this.c) {
                    try {
                        b.this.i();
                    }
                    catch(IOException unused_ex) {
                        Object object1 = b.this.d;
                        synchronized(object1) {
                            if(b.this.f == this) {
                                b.this.f = null;
                            }
                        }
                        return;
                    }
                    catch(Throwable throwable0) {
                        Object object2 = b.this.d;
                        synchronized(object2) {
                            if(b.this.f == this) {
                                b.this.f = null;
                            }
                        }
                        throw throwable0;
                    }
                }
                synchronized(b.this.d) {
                    if(b.this.f == this) {
                        b.this.f = null;
                    }
                }
            }
        }

        return new com.google.crypto.tink.util.b.a(this);
    }

    private static String p(Reader reader0) throws IOException {
        BufferedReader bufferedReader0 = new BufferedReader(reader0);
        StringBuilder stringBuilder0 = new StringBuilder();
        int v;
        while((v = bufferedReader0.read()) != -1) {
            stringBuilder0.append(((char)v));
        }
        return stringBuilder0.toString();
    }

    public void q() {
        Runnable runnable0 = this.o();
        synchronized(this.d) {
            if(this.f != null) {
                return;
            }
            this.f = runnable0;
        }
        try {
            this.a.execute(runnable0);
        }
        catch(Throwable throwable0) {
            synchronized(this.d) {
                if(this.f == runnable0) {
                    this.f = null;
                }
            }
            throw throwable0;
        }
    }

    @p3.a("instanceStateLock")
    private boolean r() {
        return this.h + this.i / 2L <= this.j();
    }

    private static void s(String s) {
        try {
            if(!new URL(s).getProtocol().toLowerCase(Locale.US).equals("https")) {
                throw new IllegalArgumentException("url must point to a HTTPS server");
            }
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException(malformedURLException0);
        }
    }
}

