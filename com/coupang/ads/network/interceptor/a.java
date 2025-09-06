package com.coupang.ads.network.interceptor;

import android.util.SparseArray;
import kotlin.jvm.internal.L;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import y4.l;

public final class a implements Interceptor {
    @l
    private final SparseArray a;

    public a() {
        this.a = new SparseArray();
    }

    public final void a(int v, @l b b0) {
        L.p(b0, "interceptor");
        synchronized(this.a) {
            this.a.put(v, b0);
        }
    }

    public final void b(int v) {
        synchronized(this.a) {
            this.a.remove(v);
        }
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) {
        L.p(interceptor$Chain0, "chain");
        Request request0 = interceptor$Chain0.request();
        L.o(request0, "chain.request()");
        boolean z = com.coupang.ads.a.o.b().g();
        if(z) {
            synchronized(this.a) {
                SparseArray sparseArray1 = this.a;
                int v2 = sparseArray1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    sparseArray1.keyAt(v3);
                    request0 = ((b)sparseArray1.valueAt(v3)).a(request0);
                }
            }
        }
        Response response0 = interceptor$Chain0.proceed(request0);
        L.o(response0, "chain.proceed(request)");
        if(z) {
            synchronized(this.a) {
                SparseArray sparseArray3 = this.a;
                int v5 = sparseArray3.size();
                for(int v = 0; v < v5; ++v) {
                    sparseArray3.keyAt(v);
                    response0 = ((b)sparseArray3.valueAt(v)).b(response0);
                }
                return response0;
            }
        }
        return response0;
    }
}

