package com.unity3d.services.core.network.core;

import A3.o;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p;
import kotlinx.coroutines.w0;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import y4.l;
import y4.m;

@s0({"SMAP\nCronetClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CronetClient.kt\ncom/unity3d/services/core/network/core/CronetClient\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n314#2,9:139\n323#2,2:152\n215#3:148\n216#3:151\n1855#4,2:149\n*S KotlinDebug\n*F\n+ 1 CronetClient.kt\ncom/unity3d/services/core/network/core/CronetClient\n*L\n35#1:139,9\n35#1:152,2\n89#1:148\n89#1:151\n90#1:149,2\n*E\n"})
public final class CronetClient implements HttpClient {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    @l
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    @l
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final CronetEngine engine;

    static {
        CronetClient.Companion = new Companion(null);
    }

    public CronetClient(@l CronetEngine cronetEngine0, @l ISDKDispatchers iSDKDispatchers0) {
        L.p(cronetEngine0, "engine");
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.engine = cronetEngine0;
        this.dispatchers = iSDKDispatchers0;
    }

    private final String buildUrl(HttpRequest httpRequest0) {
        return v.k4((v.L5(httpRequest0.getBaseURL(), new char[]{'/'}) + '/' + v.L5(httpRequest0.getPath(), new char[]{'/'})), "/");
    }

    @Override  // com.unity3d.services.core.network.core.HttpClient
    @m
    public Object execute(@l HttpRequest httpRequest0, @l d d0) {
        byte[] arr_b;
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        com.unity3d.services.core.network.core.CronetClient.execute.2.callback.1 cronetClient$execute$2$callback$10 = new UnityAdsUrlRequestCallback(((long)httpRequest0.getReadTimeout())/*ERROR_MISSING_ARG_3/*) {
            @Override  // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onCanceled(@m UrlRequest urlRequest0, @m UrlResponseInfo urlResponseInfo0) {
                super.onCanceled(urlRequest0, urlResponseInfo0);
                Object object0 = e0.b(f0.a(new NetworkTimeoutException("Network request timed out", null, null, (urlResponseInfo0 == null ? null : urlResponseInfo0.getUrl()), (urlResponseInfo0 == null ? null : urlResponseInfo0.getNegotiatedProtocol()), null, "cronet", 38, null)));
                this.resumeWith(object0);
            }

            @Override  // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onFailed(@m UrlRequest urlRequest0, @m UrlResponseInfo urlResponseInfo0, @m CronetException cronetException0) {
                super.onFailed(urlRequest0, urlResponseInfo0, cronetException0);
                String s = null;
                NetworkException networkException0 = cronetException0 instanceof NetworkException ? ((NetworkException)cronetException0) : null;
                Integer integer0 = networkException0 == null ? null : networkException0.getCronetInternalErrorCode();
                Integer integer1 = urlResponseInfo0 == null ? null : urlResponseInfo0.getHttpStatusCode();
                String s1 = urlResponseInfo0 == null ? null : urlResponseInfo0.getUrl();
                if(urlResponseInfo0 != null) {
                    s = urlResponseInfo0.getNegotiatedProtocol();
                }
                Object object0 = e0.b(f0.a(new UnityAdsNetworkException("Network request failed", null, integer1, s1, s, integer0, "cronet", 2, null)));
                this.resumeWith(object0);
            }

            @Override  // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(@l UrlRequest urlRequest0, @l UrlResponseInfo urlResponseInfo0, @l byte[] arr_b) {
                L.p(urlRequest0, "request");
                L.p(urlResponseInfo0, "info");
                L.p(arr_b, "bodyBytes");
                int v = urlResponseInfo0.getHttpStatusCode();
                Map map0 = urlResponseInfo0.getAllHeaders();
                String s = urlResponseInfo0.getUrl();
                String s1 = urlResponseInfo0.getNegotiatedProtocol();
                long v1 = this.dispatchers.getContentSize(urlResponseInfo0);
                L.o(map0, "allHeaders");
                L.o(s, "url");
                L.o(s1, "negotiatedProtocol");
                HttpResponse httpResponse0 = new HttpResponse(arr_b, v, map0, s, s1, "cronet", v1);
                this.resumeWith(httpResponse0);
            }
        };
        Builder urlRequest$Builder0 = this.engine.newUrlRequestBuilder(this.buildUrl(httpRequest0), cronetClient$execute$2$callback$10, w0.b(this.dispatchers.getIo()));
        for(Object object0: httpRequest0.getHeaders().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                urlRequest$Builder0.addHeader(s, ((String)object1));
            }
        }
        if(httpRequest0.getMethod() == RequestType.POST) {
            Object object2 = httpRequest0.getBody();
            if(object2 instanceof byte[]) {
                arr_b = (byte[])httpRequest0.getBody();
            }
            else if(object2 instanceof String) {
                arr_b = ((String)httpRequest0.getBody()).getBytes(f.b);
                L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            }
            else {
                arr_b = new byte[0];
            }
            urlRequest$Builder0.setUploadDataProvider(UploadDataProviders.create(arr_b), w0.b(this.dispatchers.getIo()));
        }
        UrlRequest urlRequest0 = urlRequest$Builder0.setHttpMethod(httpRequest0.getMethod().toString()).setPriority(this.getPriority(httpRequest0.getPriority())).build();
        p0.K(new Function1() {
            final UrlRequest $req;

            {
                this.$req = urlRequest0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.$req.cancel();
            }
        });
        L.o(urlRequest0, "req");
        cronetClient$execute$2$callback$10.startTimer(urlRequest0);
        urlRequest0.start();
        Object object3 = p0.x();
        if(object3 == b.l()) {
            h.c(d0);
        }
        return object3;
    }

    @Override  // com.unity3d.services.core.network.core.HttpClient
    @l
    public HttpResponse executeBlocking(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "request");
        return (HttpResponse)i.f(this.dispatchers.getIo(), new o(httpRequest0, null) {
            final HttpRequest $request;
            int label;

            {
                CronetClient.this = cronetClient0;
                this.$request = httpRequest0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.core.network.core.CronetClient.executeBlocking.1(CronetClient.this, this.$request, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.network.core.CronetClient.executeBlocking.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = CronetClient.this.execute(this.$request, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
    }

    private final long getContentSize(UrlResponseInfo urlResponseInfo0) {
        List list0 = (List)urlResponseInfo0.getAllHeaders().get("Content-Length");
        if(list0 != null) {
            String s = (String)list0.get(0);
            if(s != null) {
                Long long0 = v.d1(s);
                return long0 == null ? -1L : ((long)long0);
            }
        }
        return -1L;
    }

    private final int getPriority(int v) {
        switch(v) {
            case 0: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 2: {
                return 2;
            }
            default: {
                return 1;
            }
        }
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}

