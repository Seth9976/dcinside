package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class h implements ResponseHandler {
    private final ResponseHandler a;
    private final Timer b;
    private final j c;

    public h(ResponseHandler responseHandler0, Timer timer0, j j0) {
        this.a = responseHandler0;
        this.b = timer0;
        this.c = j0;
    }

    public Object handleResponse(HttpResponse httpResponse0) throws IOException {
        long v = this.b.d();
        this.c.C(v);
        int v1 = httpResponse0.getStatusLine().getStatusCode();
        this.c.t(v1);
        Long long0 = com.google.firebase.perf.network.j.a(((HttpMessage)httpResponse0));
        if(long0 != null) {
            this.c.A(((long)long0));
        }
        String s = com.google.firebase.perf.network.j.b(httpResponse0);
        if(s != null) {
            this.c.z(s);
        }
        this.c.c();
        return this.a.handleResponse(httpResponse0);
    }
}

