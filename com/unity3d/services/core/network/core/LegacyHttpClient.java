package com.unity3d.services.core.network.core;

import A3.o;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class LegacyHttpClient implements HttpClient {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    @l
    private final ISDKDispatchers dispatchers;

    static {
        LegacyHttpClient.Companion = new Companion(null);
    }

    public LegacyHttpClient(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.network.core.HttpClient
    @m
    public Object execute(@l HttpRequest httpRequest0, @l d d0) {
        return i.h(this.dispatchers.getIo(), new o(null) {
            final HttpRequest $request;
            int label;

            {
                this.$request = httpRequest0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.core.network.core.LegacyHttpClient.execute.2(this.$request, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.network.core.LegacyHttpClient.execute.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                WebRequest webRequest0 = HttpRequestToWebRequestKt.toWebRequest(this.$request);
                String s = webRequest0.makeRequest();
                int v = webRequest0.getResponseCode();
                Map map0 = webRequest0.getHeaders();
                String s1 = webRequest0.getUrl().toString();
                if(s == null) {
                    s = "";
                }
                L.o(map0, "headers");
                L.o(s1, "toString()");
                return new HttpResponse(s, v, map0, s1, null, "legacy", 0L, 80, null);
            }
        }, d0);
    }

    @Override  // com.unity3d.services.core.network.core.HttpClient
    @l
    public HttpResponse executeBlocking(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "request");
        return (HttpResponse)i.f(this.dispatchers.getIo(), new o(httpRequest0, null) {
            final HttpRequest $request;
            int label;

            {
                LegacyHttpClient.this = legacyHttpClient0;
                this.$request = httpRequest0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.core.network.core.LegacyHttpClient.executeBlocking.1(LegacyHttpClient.this, this.$request, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.network.core.LegacyHttpClient.executeBlocking.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = LegacyHttpClient.this.execute(this.$request, this);
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
}

