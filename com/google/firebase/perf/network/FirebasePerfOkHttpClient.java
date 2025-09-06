package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FirebasePerfOkHttpClient {
    static void a(Response response0, j j0, long v, long v1) throws IOException {
        Request request0 = response0.request();
        if(request0 == null) {
            return;
        }
        j0.E(request0.url().url().toString());
        j0.s(request0.method());
        if(request0.body() != null) {
            long v2 = request0.body().contentLength();
            if(v2 != -1L) {
                j0.x(v2);
            }
        }
        ResponseBody responseBody0 = response0.body();
        if(responseBody0 != null) {
            long v3 = responseBody0.contentLength();
            if(v3 != -1L) {
                j0.A(v3);
            }
            MediaType mediaType0 = responseBody0.contentType();
            if(mediaType0 != null) {
                j0.z(mediaType0.toString());
            }
        }
        j0.t(response0.code());
        j0.y(v);
        j0.C(v1);
        j0.c();
    }

    @Keep
    public static void enqueue(Call call0, Callback callback0) {
        Timer timer0 = new Timer();
        call0.enqueue(new i(callback0, k.l(), timer0, timer0.f()));
    }

    @Keep
    public static Response execute(Call call0) throws IOException {
        j j0 = j.d(k.l());
        Timer timer0 = new Timer();
        long v = timer0.f();
        try {
            Response response0 = call0.execute();
            FirebasePerfOkHttpClient.a(response0, j0, v, timer0.d());
            return response0;
        }
        catch(IOException iOException0) {
            Request request0 = call0.request();
            if(request0 != null) {
                HttpUrl httpUrl0 = request0.url();
                if(httpUrl0 != null) {
                    j0.E(httpUrl0.url().toString());
                }
                if(request0.method() != null) {
                    j0.s(request0.method());
                }
            }
            j0.y(v);
            j0.C(timer0.d());
            com.google.firebase.perf.network.j.d(j0);
            throw iOException0;
        }
    }
}

