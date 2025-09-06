package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.util.c;
import com.bumptech.glide.util.i;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;

public class j implements d {
    static class a implements b {
        @Override  // com.bumptech.glide.load.data.j$b
        public HttpURLConnection a(URL uRL0) throws IOException {
            return (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection())));
        }
    }

    interface b {
        HttpURLConnection a(URL arg1) throws IOException;
    }

    private final h a;
    private final int b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;
    private static final String g = "HttpUrlFetcher";
    private static final int h = 5;
    @VisibleForTesting
    static final String i = "Location";
    @VisibleForTesting
    static final b j = null;
    @VisibleForTesting
    static final int k = -1;

    static {
        j.j = new a();
    }

    public j(h h0, int v) {
        this(h0, v, j.j);
    }

    @VisibleForTesting
    j(h h0, int v, b j$b0) {
        this.a = h0;
        this.b = v;
        this.c = j$b0;
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream0 = this.e;
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        HttpURLConnection httpURLConnection0 = this.d;
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.d = null;
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.b;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f = true;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void d(@NonNull com.bumptech.glide.j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
        long v = i.b();
        try {
            try {
                d$a0.e(this.j(this.a.i(), 0, null, this.a.e()));
                goto label_14;
            }
            catch(IOException iOException0) {
            }
            if(Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", iOException0);
            }
            d$a0.f(iOException0);
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
        if(Log.isLoggable("HttpUrlFetcher", 2)) {
            Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + i.a(v));
            return;
        label_11:
            if(Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + i.a(v));
            }
            throw throwable0;
        label_14:
            if(Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + i.a(v));
            }
        }
    }

    private HttpURLConnection e(URL uRL0, Map map0) throws e {
        HttpURLConnection httpURLConnection0;
        try {
            httpURLConnection0 = this.c.a(uRL0);
        }
        catch(IOException iOException0) {
            throw new e("URL.openConnection threw", 0, iOException0);
        }
        for(Object object0: map0.entrySet()) {
            httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        httpURLConnection0.setConnectTimeout(this.b);
        httpURLConnection0.setReadTimeout(this.b);
        httpURLConnection0.setUseCaches(false);
        httpURLConnection0.setDoInput(true);
        httpURLConnection0.setInstanceFollowRedirects(false);
        return httpURLConnection0;
    }

    private static int f(HttpURLConnection httpURLConnection0) {
        try {
            return httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", iOException0);
            }
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection0) throws e {
        try {
            if(TextUtils.isEmpty(httpURLConnection0.getContentEncoding())) {
                int v = httpURLConnection0.getContentLength();
                this.e = c.b(httpURLConnection0.getInputStream(), ((long)v));
                return this.e;
            }
            if(Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection0.getContentEncoding());
            }
            this.e = httpURLConnection0.getInputStream();
            return this.e;
        }
        catch(IOException iOException0) {
        }
        throw new e("Failed to obtain InputStream", j.f(httpURLConnection0), iOException0);
    }

    private static boolean h(int v) {
        return v / 100 == 2;
    }

    private static boolean i(int v) {
        return v / 100 == 3;
    }

    private InputStream j(URL uRL0, int v, URL uRL1, Map map0) throws e {
        URL uRL2;
        if(v < 5) {
            if(uRL1 != null) {
                try {
                    if(uRL0.toURI().equals(uRL1.toURI())) {
                        throw new e("In re-direct loop", -1);
                    }
                }
                catch(URISyntaxException unused_ex) {
                }
            }
            HttpURLConnection httpURLConnection0 = this.e(uRL0, map0);
            this.d = httpURLConnection0;
            try {
                httpURLConnection0.connect();
                this.e = this.d.getInputStream();
            }
            catch(IOException iOException0) {
                throw new e("Failed to connect or obtain data", j.f(this.d), iOException0);
            }
            if(this.f) {
                return null;
            }
            int v1 = j.f(this.d);
            if(j.h(v1)) {
                return this.g(this.d);
            }
            if(j.i(v1)) {
                String s = this.d.getHeaderField("Location");
                if(TextUtils.isEmpty(s)) {
                    throw new e("Received empty or null redirect url", v1);
                }
                try {
                    uRL2 = new URL(uRL0, s);
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new e("Bad redirect url: " + s, v1, malformedURLException0);
                }
                this.b();
                return this.j(uRL2, v + 1, uRL0, map0);
            }
            if(v1 == -1) {
                throw new e(-1);
            }
            try {
                throw new e(this.d.getResponseMessage(), v1);
            }
            catch(IOException iOException1) {
                throw new e("Failed to get a response message", v1, iOException1);
            }
        }
        throw new e("Too many (> 5) redirects!", -1);
    }
}

