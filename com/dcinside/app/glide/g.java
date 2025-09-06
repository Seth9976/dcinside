package com.dcinside.app.glide;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d.a;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.util.c;
import com.bumptech.glide.util.m;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import okhttp3.Call.Factory;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class g implements d, Callback {
    private final Factory a;
    private final h b;
    private InputStream c;
    private ResponseBody d;
    private a e;
    private volatile Call f;
    private static final String g = "OkHttpFetcher";

    public g(Factory call$Factory0, h h0) {
        this.a = call$Factory0;
        this.b = h0;
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream0 = this.c;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException unused_ex) {
        }
        ResponseBody responseBody0 = this.d;
        if(responseBody0 != null) {
            responseBody0.close();
        }
        this.e = null;
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.b;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void cancel() {
        Call call0 = this.f;
        if(call0 != null) {
            call0.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.d
    public void d(@NonNull j j0, @NonNull a d$a0) {
        Builder request$Builder0 = new Builder().url(this.b.h());
        for(Object object0: this.b.e().entrySet()) {
            request$Builder0.addHeader(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        Request request0 = request$Builder0.build();
        this.e = d$a0;
        this.f = this.a.newCall(request0);
        FirebasePerfOkHttpClient.enqueue(this.f, this);
    }

    @Override  // okhttp3.Callback
    public void onFailure(@NonNull Call call0, @NonNull IOException iOException0) {
        if(Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException0);
        }
        this.e.f(iOException0);
    }

    @Override  // okhttp3.Callback
    public void onResponse(@NonNull Call call0, @NonNull Response response0) {
        this.d = response0.body();
        if(response0.isSuccessful()) {
            long v = ((ResponseBody)m.e(this.d)).contentLength();
            InputStream inputStream0 = c.b(this.d.byteStream(), v);
            this.c = inputStream0;
            this.e.e(inputStream0);
            return;
        }
        this.e.f(new e(response0.message(), response0.code()));
    }
}

