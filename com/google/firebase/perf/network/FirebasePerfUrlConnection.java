package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    static Object a(l l0, k k0, Timer timer0) throws IOException {
        timer0.h();
        long v = timer0.f();
        j j0 = j.d(k0);
        try {
            URLConnection uRLConnection0 = l0.a();
            if(uRLConnection0 instanceof HttpsURLConnection) {
                return new d(((HttpsURLConnection)uRLConnection0), timer0, j0).getContent();
            }
            return uRLConnection0 instanceof HttpURLConnection ? new c(((HttpURLConnection)uRLConnection0), timer0, j0).getContent() : uRLConnection0.getContent();
        }
        catch(IOException iOException0) {
        }
        j0.y(v);
        j0.C(timer0.d());
        j0.E(l0.toString());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static Object b(l l0, Class[] arr_class, k k0, Timer timer0) throws IOException {
        timer0.h();
        long v = timer0.f();
        j j0 = j.d(k0);
        try {
            URLConnection uRLConnection0 = l0.a();
            if(uRLConnection0 instanceof HttpsURLConnection) {
                return new d(((HttpsURLConnection)uRLConnection0), timer0, j0).getContent(arr_class);
            }
            return uRLConnection0 instanceof HttpURLConnection ? new c(((HttpURLConnection)uRLConnection0), timer0, j0).getContent(arr_class) : uRLConnection0.getContent(arr_class);
        }
        catch(IOException iOException0) {
        }
        j0.y(v);
        j0.C(timer0.d());
        j0.E(l0.toString());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    static InputStream c(l l0, k k0, Timer timer0) throws IOException {
        if(!k.l().x()) {
            return l0.a().getInputStream();
        }
        timer0.h();
        long v = timer0.f();
        j j0 = j.d(k0);
        try {
            URLConnection uRLConnection0 = l0.a();
            if(uRLConnection0 instanceof HttpsURLConnection) {
                return new d(((HttpsURLConnection)uRLConnection0), timer0, j0).getInputStream();
            }
            return uRLConnection0 instanceof HttpURLConnection ? new c(((HttpURLConnection)uRLConnection0), timer0, j0).getInputStream() : uRLConnection0.getInputStream();
        }
        catch(IOException iOException0) {
        }
        j0.y(v);
        j0.C(timer0.d());
        j0.E(l0.toString());
        com.google.firebase.perf.network.j.d(j0);
        throw iOException0;
    }

    @Keep
    public static Object getContent(URL uRL0) throws IOException {
        return FirebasePerfUrlConnection.a(new l(uRL0), k.l(), new Timer());
    }

    @Keep
    public static Object getContent(URL uRL0, Class[] arr_class) throws IOException {
        return FirebasePerfUrlConnection.b(new l(uRL0), arr_class, k.l(), new Timer());
    }

    @Keep
    public static Object instrument(Object object0) throws IOException {
        if(object0 instanceof HttpsURLConnection) {
            return new d(((HttpsURLConnection)object0), new Timer(), j.d(k.l()));
        }
        return object0 instanceof HttpURLConnection ? new c(((HttpURLConnection)object0), new Timer(), j.d(k.l())) : object0;
    }

    @Keep
    public static InputStream openStream(URL uRL0) throws IOException {
        return FirebasePerfUrlConnection.c(new l(uRL0), k.l(), new Timer());
    }
}

