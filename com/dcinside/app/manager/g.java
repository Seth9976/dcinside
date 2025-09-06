package com.dcinside.app.manager;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dcinside.app.Application;
import com.dcinside.app.util.Yk;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import timber.log.b;
import y4.l;
import y4.m;

@s0({"SMAP\nMinorExtWebClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorExtWebClient.kt\ncom/dcinside/app/manager/MinorExtWebClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,39:1\n1#2:40\n177#3,9:41\n177#3,9:50\n*S KotlinDebug\n*F\n+ 1 MinorExtWebClient.kt\ncom/dcinside/app/manager/MinorExtWebClient\n*L\n32#1:41,9\n35#1:50,9\n*E\n"})
public final class g extends WebViewClient {
    private long a;

    public final long a() {
        return this.a;
    }

    public final void b(long v) {
        this.a = v;
    }

    @Override  // android.webkit.WebViewClient
    @m
    public WebResourceResponse shouldInterceptRequest(@l WebView webView0, @m String s) {
        InputStream inputStream0;
        Exception exception1;
        Response response0;
        L.p(webView0, "view");
        try {
            if(s == null || (s.length() == 0 || !Yk.a.l().matcher(s).find())) {
                return super.shouldInterceptRequest(webView0, s);
            }
        }
        catch(Exception unused_ex) {
            return super.shouldInterceptRequest(webView0, s);
        }
        try {
            response0 = FirebasePerfOkHttpClient.execute(Application.e.a().newCall(new Builder().url(s).build()));
        }
        catch(Exception exception0) {
            response0 = null;
            exception1 = exception0;
            goto label_22;
        }
        try {
            Response response1 = response0.isSuccessful() ? response0 : null;
            if(response1 == null) {
                inputStream0 = null;
            }
            else {
                ResponseBody responseBody0 = response1.body();
                inputStream0 = responseBody0 == null ? null : responseBody0.byteStream();
            }
            if(inputStream0 == null) {
                goto label_26;
            }
            return new WebResourceResponse("image/*", null, inputStream0);
        }
        catch(Exception exception1) {
        }
    label_22:
        b.a.y(exception1);
        if(response0 != null) {
            try {
                response0.close();
                return super.shouldInterceptRequest(webView0, s);
            label_26:
                response0.close();
                return super.shouldInterceptRequest(webView0, s);
            }
            catch(Exception unused_ex) {
            }
        }
        return super.shouldInterceptRequest(webView0, s);
    }
}

