package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    static Object a(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpHost0.toURI() + httpRequest0.getRequestLine().getUri()).s(httpRequest0.getRequestLine().getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            return httpClient0.execute(httpHost0, httpRequest0, new h(responseHandler0, timer0, j0));
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static Object b(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0, HttpContext httpContext0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpHost0.toURI() + httpRequest0.getRequestLine().getUri()).s(httpRequest0.getRequestLine().getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            return httpClient0.execute(httpHost0, httpRequest0, new h(responseHandler0, timer0, j0), httpContext0);
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static Object c(HttpClient httpClient0, HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpUriRequest0.getURI().toString()).s(httpUriRequest0.getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            return httpClient0.execute(httpUriRequest0, new h(responseHandler0, timer0, j0));
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static Object d(HttpClient httpClient0, HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0, HttpContext httpContext0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpUriRequest0.getURI().toString()).s(httpUriRequest0.getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            return httpClient0.execute(httpUriRequest0, new h(responseHandler0, timer0, j0), httpContext0);
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static HttpResponse e(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpHost0.toURI() + httpRequest0.getRequestLine().getUri()).s(httpRequest0.getRequestLine().getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpHost0, httpRequest0);
            j0.C(timer0.d());
            j0.t(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = com.google.firebase.perf.network.j.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                j0.A(((long)long1));
            }
            String s = com.google.firebase.perf.network.j.b(httpResponse0);
            if(s != null) {
                j0.z(s);
            }
            j0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0) throws IOException {
        return FirebasePerfHttpClient.a(httpClient0, httpHost0, httpRequest0, responseHandler0, new Timer(), k.l());
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0, HttpContext httpContext0) throws IOException {
        return FirebasePerfHttpClient.b(httpClient0, httpHost0, httpRequest0, responseHandler0, httpContext0, new Timer(), k.l());
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0) throws IOException {
        return FirebasePerfHttpClient.c(httpClient0, httpUriRequest0, responseHandler0, new Timer(), k.l());
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0, HttpContext httpContext0) throws IOException {
        return FirebasePerfHttpClient.d(httpClient0, httpUriRequest0, responseHandler0, httpContext0, new Timer(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0) throws IOException {
        return FirebasePerfHttpClient.e(httpClient0, httpHost0, httpRequest0, new Timer(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, HttpContext httpContext0) throws IOException {
        return FirebasePerfHttpClient.f(httpClient0, httpHost0, httpRequest0, httpContext0, new Timer(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0) throws IOException {
        return FirebasePerfHttpClient.g(httpClient0, httpUriRequest0, new Timer(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0, HttpContext httpContext0) throws IOException {
        return FirebasePerfHttpClient.h(httpClient0, httpUriRequest0, httpContext0, new Timer(), k.l());
    }

    static HttpResponse f(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, HttpContext httpContext0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpHost0.toURI() + httpRequest0.getRequestLine().getUri()).s(httpRequest0.getRequestLine().getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpHost0, httpRequest0, httpContext0);
            j0.C(timer0.d());
            j0.t(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = com.google.firebase.perf.network.j.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                j0.A(((long)long1));
            }
            String s = com.google.firebase.perf.network.j.b(httpResponse0);
            if(s != null) {
                j0.z(s);
            }
            j0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static HttpResponse g(HttpClient httpClient0, HttpUriRequest httpUriRequest0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpUriRequest0.getURI().toString()).s(httpUriRequest0.getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpUriRequest0);
            j0.C(timer0.d());
            j0.t(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = com.google.firebase.perf.network.j.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                j0.A(((long)long1));
            }
            String s = com.google.firebase.perf.network.j.b(httpResponse0);
            if(s != null) {
                j0.z(s);
            }
            j0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static HttpResponse h(HttpClient httpClient0, HttpUriRequest httpUriRequest0, HttpContext httpContext0, Timer timer0, k k0) throws IOException {
        j j0 = j.d(k0);
        try {
            j0.E(httpUriRequest0.getURI().toString()).s(httpUriRequest0.getMethod());
            Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                j0.x(((long)long0));
            }
            timer0.h();
            j0.y(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpUriRequest0, httpContext0);
            j0.C(timer0.d());
            j0.t(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = com.google.firebase.perf.network.j.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                j0.A(((long)long1));
            }
            String s = com.google.firebase.perf.network.j.b(httpResponse0);
            if(s != null) {
                j0.z(s);
            }
            j0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        j0.C(timer0.d());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }
}

