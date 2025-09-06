package com.igaworks.ssp;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class u0 extends Thread {
    public interface b {
        void a();

        void onSuccess(String arg1);
    }

    private final b a;
    private String b;
    private static Handler c;

    static {
        u0.c = new Handler(Looper.getMainLooper());
    }

    public u0(String s, b u0$b0) {
        this.b = s;
        this.a = u0$b0;
    }

    private String a(String s) {
        String s1;
        URL uRL0 = new URL(s);
        HttpURLConnection httpURLConnection0 = null;
        try {
            httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection())));
            httpURLConnection0.setInstanceFollowRedirects(false);
            s1 = u0.a(s, httpURLConnection0);
        }
        catch(Throwable throwable0) {
            if(httpURLConnection0 != null) {
                try {
                    InputStream inputStream0 = httpURLConnection0.getInputStream();
                    if(inputStream0 != null) {
                        inputStream0.close();
                    }
                }
                catch(IOException unused_ex) {
                    com.igaworks.ssp.b.b(Thread.currentThread(), "IOException when closing httpUrlConnection. Ignoring.");
                }
                httpURLConnection0.disconnect();
            }
            throw throwable0;
        }
        try {
            InputStream inputStream1 = httpURLConnection0.getInputStream();
            if(inputStream1 != null) {
                inputStream1.close();
            }
        }
        catch(IOException unused_ex) {
            com.igaworks.ssp.b.b(Thread.currentThread(), "IOException when closing httpUrlConnection. Ignoring.");
        }
        httpURLConnection0.disconnect();
        return s1;
    }

    static String a(String s, HttpURLConnection httpURLConnection0) {
        URI uRI0 = new URI(s);
        int v = httpURLConnection0.getResponseCode();
        String s1 = httpURLConnection0.getHeaderField("Location");
        if(v >= 300 && v < 400) {
            try {
                return uRI0.resolve(s1).toString();
            }
            catch(IllegalArgumentException unused_ex) {
                com.igaworks.ssp.b.b(Thread.currentThread(), "Invalid URL redirection. baseUrl=" + s + "\n redirectUrl=" + s1);
                throw new URISyntaxException(s1, "Unable to parse invalid URL");
            }
            catch(NullPointerException nullPointerException0) {
                com.igaworks.ssp.b.b(Thread.currentThread(), "Invalid URL redirection. baseUrl=" + s + "\n redirectUrl=" + s1);
                throw nullPointerException0;
            }
        }
        return null;
    }

    private void b(String s) {
        class a implements Runnable {
            final String a;
            final u0 b;

            a(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                try {
                    if(this.a != null) {
                        u0.this.a.onSuccess(this.a);
                        return;
                    }
                    u0.this.a.a();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                u0.this.a.a();
            }
        }

        try {
            if(u0.c == null) {
                u0.c = new Handler(Looper.getMainLooper());
            }
            u0.c.post(new a(this, s));
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.a.a();
    }

    @Override
    public void run() {
        super.run();
        if(s0.b(this.b)) {
            this.b(null);
        }
        String s = this.b;
        int v = 0;
        String s1 = null;
        while(s != null && v < 10) {
            try {
                if(!s.contains("http://") && !s.contains("https://")) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "Redirect URL is not http(s) : " + s);
                    this.b(s);
                    break;
                }
                com.igaworks.ssp.b.c(Thread.currentThread(), "Redirect URL is : " + s);
                try {
                    ++v;
                    s1 = s;
                    s = this.a(s);
                    continue;
                }
                catch(IOException | NullPointerException | URISyntaxException unused_ex) {
                    s1 = s;
                }
            }
            catch(IOException | NullPointerException | URISyntaxException unused_ex) {
            }
            com.igaworks.ssp.b.b(Thread.currentThread(), "Exception occurred while resolving redirect URL");
            this.b(null);
            if(true) {
                break;
            }
        }
        this.b(s1);
    }
}

