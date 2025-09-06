package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class i implements Callback {
    private final Callback a;
    private final j b;
    private final Timer c;
    private final long d;

    public i(Callback callback0, k k0, Timer timer0, long v) {
        this.a = callback0;
        this.b = j.d(k0);
        this.d = v;
        this.c = timer0;
    }

    @Override  // okhttp3.Callback
    public void onFailure(Call call0, IOException iOException0) {
        Request request0 = call0.request();
        if(request0 != null) {
            HttpUrl httpUrl0 = request0.url();
            if(httpUrl0 != null) {
                String s = httpUrl0.url().toString();
                this.b.E(s);
            }
            if(request0.method() != null) {
                this.b.s(request0.method());
            }
        }
        this.b.y(this.d);
        long v = this.c.d();
        this.b.C(v);
        com.google.firebase.perf.network.j.d(this.b);
        this.a.onFailure(call0, iOException0);
    }

    @Override  // okhttp3.Callback
    public void onResponse(Call call0, Response response0) throws IOException {
        long v = this.c.d();
        FirebasePerfOkHttpClient.a(response0, this.b, this.d, v);
        this.a.onResponse(call0, response0);
    }
}

