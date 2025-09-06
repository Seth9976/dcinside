package com.vungle.ads.internal.downloader;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.vungle.ads.K0;
import com.vungle.ads.N0;
import com.vungle.ads.W0;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.r;
import com.vungle.ads.s;
import com.vungle.ads.t;
import com.vungle.ads.u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.B;
import okio.Z;
import okio.a0;
import okio.m0;
import okio.o0;
import y4.l;
import y4.m;

public final class c implements e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b {
        @l
        public static final b INSTANCE;
        @m
        private static OkHttpClient client;

        static {
            b.INSTANCE = new b();
        }

        @l
        public final OkHttpClient createOkHttpClient(@l q q0) {
            L.p(q0, "pathProvider");
            OkHttpClient okHttpClient0 = b.client;
            if(okHttpClient0 == null) {
                Builder okHttpClient$Builder0 = new Builder();
                TimeUnit timeUnit0 = TimeUnit.SECONDS;
                okHttpClient0 = okHttpClient$Builder0.readTimeout(60L, timeUnit0).connectTimeout(60L, timeUnit0).cache(null).followRedirects(true).followSslRedirects(true).build();
                b.client = okHttpClient0;
            }
            return okHttpClient0;
        }
    }

    @l
    private static final String CONTENT_ENCODING = "Content-Encoding";
    @l
    private static final String CONTENT_TYPE = "Content-Type";
    @l
    public static final a Companion = null;
    private static final int DOWNLOAD_CHUNK_SIZE = 0x800;
    @l
    private static final String GZIP = "gzip";
    private static final int MINIMUM_SPACE_REQUIRED_MB = 0x1400000;
    @l
    private static final String TAG = "AssetDownloader";
    @l
    private final i downloadExecutor;
    @l
    private final D okHttpClient$delegate;
    @l
    private final q pathProvider;
    @l
    private final List transitioning;

    static {
        c.Companion = new a(null);
    }

    public c(@l i i0, @l q q0) {
        static final class d extends N implements A3.a {
            d(c c0) {
                c.this = c0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final OkHttpClient invoke() {
                q q0 = c.this.pathProvider;
                return b.INSTANCE.createOkHttpClient(q0);
            }
        }

        L.p(i0, "downloadExecutor");
        L.p(q0, "pathProvider");
        super();
        this.downloadExecutor = i0;
        this.pathProvider = q0;
        this.okHttpClient$delegate = E.a(new d(this));
        this.transitioning = new ArrayList();
    }

    @Override  // com.vungle.ads.internal.downloader.e
    public void cancel(@m com.vungle.ads.internal.downloader.d d0) {
        if(d0 != null && !d0.isCancelled()) {
            d0.cancel();
        }
    }

    @Override  // com.vungle.ads.internal.downloader.e
    public void cancelAll() {
        for(Object object0: this.transitioning) {
            this.cancel(((com.vungle.ads.internal.downloader.d)object0));
        }
        this.transitioning.clear();
    }

    private final boolean checkSpaceAvailable(com.vungle.ads.internal.downloader.d d0) {
        String s = this.pathProvider.getVungleDir().getAbsolutePath();
        L.o(s, "pathProvider.getVungleDir().absolutePath");
        long v = this.pathProvider.getAvailableBytes(s);
        if(v < 0x1400000L) {
            new K0("Insufficient space " + v).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            return false;
        }
        return true;
    }

    private final ResponseBody decodeGzipIfNeeded(Response response0) {
        ResponseBody responseBody0 = response0.body();
        if(v.O1("gzip", Response.header$default(response0, "Content-Encoding", null, 2, null), true) && responseBody0 != null) {
            B b0 = new B(responseBody0.source());
            return new RealResponseBody(Response.header$default(response0, "Content-Type", null, 2, null), -1L, Z.e(b0));
        }
        return responseBody0;
    }

    private final void deliverError(com.vungle.ads.internal.downloader.d d0, com.vungle.ads.internal.downloader.a a0, com.vungle.ads.internal.downloader.a.a a$a0) {
        if(a0 != null) {
            a0.onError(a$a0, d0);
        }
    }

    private final void deliverSuccess(File file0, com.vungle.ads.internal.downloader.d d0, com.vungle.ads.internal.downloader.a a0) {
        p.Companion.d("AssetDownloader", "On success " + d0);
        if(a0 != null) {
            a0.onSuccess(file0, d0);
        }
    }

    @Override  // com.vungle.ads.internal.downloader.e
    public void download(@m com.vungle.ads.internal.downloader.d d0, @m com.vungle.ads.internal.downloader.a a0) {
        public static final class com.vungle.ads.internal.downloader.c.c extends com.vungle.ads.internal.task.i {
            final com.vungle.ads.internal.downloader.a $downloadListener;
            final com.vungle.ads.internal.downloader.d $downloadRequest;

            com.vungle.ads.internal.downloader.c.c(c c0, com.vungle.ads.internal.downloader.d d0, com.vungle.ads.internal.downloader.a a0) {
                c.this = c0;
                this.$downloadRequest = d0;
                this.$downloadListener = a0;
                super();
            }

            @Override  // com.vungle.ads.internal.task.i
            public int getPriority() {
                return this.$downloadRequest.getPriority();
            }

            @Override
            public void run() {
                c.this.launchRequest(this.$downloadRequest, this.$downloadListener);
            }
        }

        if(d0 == null) {
            return;
        }
        this.transitioning.add(d0);
        com.vungle.ads.internal.downloader.c.c c$c0 = new com.vungle.ads.internal.downloader.c.c(this, d0, a0);
        com.vungle.ads.internal.downloader.b b0 = () -> {
            L.p(this, "this$0");
            this.deliverError(d0, a0, new com.vungle.ads.internal.downloader.a.a(-1, new N0("Cannot complete " + d0 + " : Out of Memory"), 4));
        };
        this.downloadExecutor.execute(c$c0, b0);
    }

    // 检测为 Lambda 实现
    private static final void download$lambda-0(c c0, com.vungle.ads.internal.downloader.d d0, com.vungle.ads.internal.downloader.a a0) [...]

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient)this.okHttpClient$delegate.getValue();
    }

    private final boolean isValidUrl(String s) {
        return s != null && s.length() != 0 && HttpUrl.Companion.parse(s) != null;
    }

    // This method was un-flattened
    private final void launchRequest(com.vungle.ads.internal.downloader.d d0, com.vungle.ads.internal.downloader.a a0) {
        com.vungle.ads.internal.downloader.a.a a$a0;
        com.vungle.ads.internal.util.p.a p$a2;
        int v6;
        long v4;
        long v3;
        m0 m00;
        ResponseBody responseBody0;
        int v2;
        File file2;
        Closeable closeable1;
        int v1;
        Response response0;
        Closeable closeable0;
        long v;
        File file1;
        com.vungle.ads.internal.util.p.a p$a0 = p.Companion;
        p$a0.d("AssetDownloader", "launch request in thread: " + Thread.currentThread().getId() + " request: " + d0.getAsset().getServerPath());
        if(d0.isCancelled()) {
            p$a0.d("AssetDownloader", "Request " + d0.getAsset().getServerPath() + " is cancelled before starting");
            new com.vungle.ads.internal.downloader.a.b().setStatus(3);
            return;
        }
        Call call0 = null;
        com.vungle.ads.internal.downloader.a.b a$b0 = new com.vungle.ads.internal.downloader.a.b();
        a$b0.setTimestampDownloadStart(System.currentTimeMillis());
        String s = d0.getAsset().getServerPath();
        String s1 = d0.getAsset().getLocalPath();
        if(s.length() == 0 || !this.isValidUrl(s)) {
            this.deliverError(d0, a0, new com.vungle.ads.internal.downloader.a.a(-1, new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_ASSET_URL, "invalid url: " + s).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), 4));
            return;
        }
        if(s1.length() == 0) {
            this.deliverError(d0, a0, new com.vungle.ads.internal.downloader.a.a(-1, new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_WRITE_ERROR, "invalid path: " + s1).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), 3));
            return;
        }
        if(!this.checkSpaceAvailable(d0)) {
            this.deliverError(d0, a0, new com.vungle.ads.internal.downloader.a.a(-1, new K0(null, 1, null).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), 2));
            return;
        }
        File file0 = new File(s1);
        try {
            file1 = file0.getParentFile();
            if(file1 != null) {
                goto label_23;
            }
            goto label_25;
        }
        catch(Exception exception0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            v1 = -1;
            goto label_187;
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            goto label_225;
        }
        try {
        label_23:
            if(!file1.exists()) {
                file1.mkdirs();
            }
        }
        catch(Exception exception0) {
            goto label_29;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        try {
        label_25:
            if(file0.exists()) {
                v = file0.length();
            }
            else {
                goto label_40;
            }
            goto label_41;
        }
        catch(Exception exception0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            v1 = -1;
            goto label_187;
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            goto label_225;
        }
        try {
            v = file0.length();
            goto label_41;
        }
        catch(Exception exception0) {
        label_29:
            closeable0 = null;
            response0 = null;
            v1 = -1;
            closeable1 = null;
            goto label_187;
        }
        catch(Throwable throwable0) {
        label_35:
            closeable0 = null;
            response0 = null;
            file2 = file0;
            closeable1 = null;
            goto label_226;
        }
    label_40:
        v = 0L;
        try {
        label_41:
            okhttp3.Request.Builder request$Builder0 = new okhttp3.Request.Builder().url(s);
            call0 = this.getOkHttpClient().newCall(request$Builder0.build());
        }
        catch(Exception exception0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            v1 = -1;
            goto label_187;
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            goto label_225;
        }
        try {
            response0 = FirebasePerfOkHttpClient.execute(call0);
            v1 = response0.code();
            goto label_71;
        }
        catch(Exception exception0) {
            closeable1 = null;
            closeable0 = null;
            response0 = null;
            v1 = -1;
            goto label_187;
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            closeable0 = null;
        }
        response0 = null;
        goto label_225;
        try {
            v1 = response0.code();
            goto label_71;
        }
        catch(Exception exception0) {
            closeable1 = null;
            closeable0 = null;
            v1 = -1;
            goto label_187;
            try {
            label_71:
                if(response0.isSuccessful()) {
                    goto label_75;
                }
                goto label_180;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_223;
            }
            goto label_185;
        label_75:
            if(response0.cacheResponse() == null) {
                v2 = v1;
            }
            else {
                try {
                    v2 = v1;
                    W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CACHED_ASSETS_USED);
                    r.INSTANCE.logMetric$vungle_ads_release(w00, d0.getLogEntry$vungle_ads_release(), s);
                }
                catch(Exception exception0) {
                    v1 = v2;
                    closeable0 = null;
                    closeable1 = null;
                    goto label_187;
                }
                catch(Throwable throwable0) {
                    closeable0 = null;
                    file2 = file0;
                    closeable1 = null;
                    goto label_226;
                }
            }
            try {
                responseBody0 = this.decodeGzipIfNeeded(response0);
                goto label_88;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_223;
            }
            v1 = v2;
            closeable1 = null;
            closeable0 = null;
            goto label_187;
        label_88:
            if(responseBody0 == null) {
                closeable0 = null;
            }
            else {
                try {
                    closeable0 = responseBody0.source();
                }
                catch(Exception exception0) {
                    v1 = v2;
                    closeable0 = null;
                    closeable1 = null;
                    goto label_187;
                }
                catch(Throwable throwable0) {
                    closeable0 = null;
                    file2 = file0;
                    closeable1 = null;
                    goto label_226;
                }
            }
            try {
                p.Companion.d("AssetDownloader", "Start download from bytes:" + v + ", url: " + s);
                if(v != 0L) {
                    m00 = Z.a(file0);
                    goto label_115;
                }
            }
            catch(Exception exception0) {
                v1 = v2;
                closeable1 = null;
                goto label_187;
            }
            catch(Throwable throwable0) {
                closeable1 = null;
                goto label_225;
            }
            try {
                m00 = a0.q(file0, false, 1, null);
            }
            catch(Exception exception0) {
                closeable1 = null;
                v1 = v2;
                goto label_187;
            }
            catch(Throwable throwable0) {
                closeable1 = null;
                goto label_225;
            }
            try {
            label_115:
                closeable1 = Z.d(m00);
            }
            catch(Exception exception0) {
                v1 = v2;
                closeable1 = null;
                goto label_187;
            }
            catch(Throwable throwable0) {
                closeable1 = null;
                goto label_225;
            }
            try {
                try {
                    a$b0.setStatus(0);
                    if(responseBody0 == null) {
                        goto label_131;
                    }
                    else {
                        v3 = responseBody0.contentLength();
                    }
                    goto label_132;
                }
                catch(Exception exception0) {
                    v1 = v2;
                    goto label_187;
                }
                try {
                    v3 = responseBody0.contentLength();
                    goto label_132;
                }
                catch(Exception exception0) {
                }
            }
            catch(Throwable throwable0) {
                goto label_225;
            }
            v1 = v2;
            goto label_187;
        label_131:
            v3 = 0L;
            try {
            label_132:
                a$b0.setSizeBytes(v3);
                a$b0.setStartBytes(v);
            }
            catch(Exception exception0) {
                v1 = v2;
                goto label_187;
            }
            catch(Throwable throwable0) {
                goto label_225;
            }
            while(true) {
                if(closeable0 == null) {
                    v4 = -1L;
                }
                else {
                    try {
                        v4 = ((o0)closeable0).read(((okio.m)closeable1).E(), 0x800L);
                    }
                    catch(Exception exception0) {
                        v1 = v2;
                        goto label_187;
                    }
                    catch(Throwable throwable0) {
                        goto label_225;
                    }
                }
                if(v4 <= 0L) {
                    goto label_148;
                }
                try {
                    try {
                        if(!file0.exists()) {
                            new com.vungle.ads.w("Asset save error " + s).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                            throw new com.vungle.ads.internal.downloader.e.b("File is not existing");
                        }
                        if(d0.isCancelled()) {
                            a$b0.setStatus(3);
                            goto label_148;
                        }
                        a$b0.setStatus(1);
                        ((okio.m)closeable1).X1();
                        continue;
                    }
                    catch(Exception exception0) {
                        v1 = v2;
                        goto label_187;
                    }
                    try {
                    label_148:
                        ((okio.m)closeable1).flush();
                        goto label_153;
                    }
                    catch(Exception exception0) {
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_225;
                }
            }
            v1 = v2;
            goto label_187;
        label_153:
            if(a$b0.getStatus() == 1) {
                try {
                    a$b0.setStatus(4);
                }
                catch(Exception exception0) {
                    v1 = v2;
                    goto label_187;
                }
                catch(Throwable throwable0) {
                    goto label_225;
                }
            }
            if(response0.body() != null) {
                ResponseBody responseBody1 = response0.body();
                if(responseBody1 != null) {
                    responseBody1.close();
                }
            }
            if(call0 != null) {
                call0.cancel();
            }
            h.INSTANCE.closeQuietly(closeable1);
            h.INSTANCE.closeQuietly(closeable0);
            com.vungle.ads.internal.util.p.a p$a1 = p.Companion;
            p$a1.d("AssetDownloader", "download status: " + a$b0.getStatus());
            int v5 = a$b0.getStatus();
            if(v5 != 7) {
                switch(v5) {
                    case 0: {
                        break;
                    }
                    case 3: {
                        p$a1.d("AssetDownloader", "On cancel " + d0);
                        return;
                    }
                    default: {
                        this.deliverSuccess(file0, d0, a0);
                        return;
                    }
                }
            }
            this.deliverError(d0, a0, null);
            return;
            try {
            label_180:
                new t(s, v1, "Asset download does not success: " + response0.message()).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                v6 = v1;
                throw new com.vungle.ads.internal.downloader.e.b("Code: " + v6);
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_223;
            }
            v1 = v6;
        label_185:
            closeable1 = null;
            closeable0 = null;
            try {
            label_187:
                p$a2 = p.Companion;
                p$a2.e("AssetDownloader", String.valueOf(exception0));
                goto label_193;
            }
            catch(Throwable throwable0) {
                try {
                    file2 = file0;
                    goto label_226;
                label_193:
                    if(exception0 instanceof ProtocolException) {
                        new u("Failed to load asset: " + d0.getAsset().getServerPath()).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    else if(exception0 instanceof UnknownHostException || exception0 instanceof IOException) {
                        new t(s, v1, exception0.getMessage()).setLogEntry$vungle_ads_release(d0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    a$b0.setStatus(7);
                    a$a0 = new com.vungle.ads.internal.downloader.a.a(v1, exception0, 1);
                    goto label_204;
                }
                catch(Throwable throwable0) {
                }
            }
            file2 = file0;
            goto label_226;
        label_204:
            if((response0 == null ? null : response0.body()) != null) {
                ResponseBody responseBody2 = response0.body();
                if(responseBody2 != null) {
                    responseBody2.close();
                }
            }
            if(call0 != null) {
                call0.cancel();
            }
            h.INSTANCE.closeQuietly(closeable1);
            h.INSTANCE.closeQuietly(closeable0);
            p$a2.d("AssetDownloader", "download status: " + a$b0.getStatus());
            int v7 = a$b0.getStatus();
            if(v7 != 7) {
                switch(v7) {
                    case 0: {
                        break;
                    }
                    case 3: {
                        p$a2.d("AssetDownloader", "On cancel " + d0);
                        return;
                    }
                    default: {
                        this.deliverSuccess(file0, d0, a0);
                        return;
                    }
                }
            }
            this.deliverError(d0, a0, a$a0);
            return;
        }
        catch(Throwable throwable0) {
        label_223:
            closeable1 = null;
            closeable0 = null;
        }
    label_225:
        file2 = file0;
    label_226:
        if((response0 == null ? null : response0.body()) != null) {
            ResponseBody responseBody3 = response0.body();
            if(responseBody3 != null) {
                responseBody3.close();
            }
        }
        if(call0 != null) {
            call0.cancel();
        }
        h.INSTANCE.closeQuietly(closeable1);
        h.INSTANCE.closeQuietly(closeable0);
        com.vungle.ads.internal.util.p.a p$a3 = p.Companion;
        p$a3.d("AssetDownloader", "download status: " + a$b0.getStatus());
        int v8 = a$b0.getStatus();
        if(v8 == 7 || v8 == 0) {
            this.deliverError(d0, a0, null);
        }
        else if(v8 == 3) {
            p$a3.d("AssetDownloader", "On cancel " + d0);
        }
        else {
            this.deliverSuccess(file2, d0, a0);
        }
        throw throwable0;
    }
}

