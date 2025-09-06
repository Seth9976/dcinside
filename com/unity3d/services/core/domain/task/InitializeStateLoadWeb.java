package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class InitializeStateLoadWeb extends MetricTask {
    public static final class LoadWebResult {
        @l
        private final Configuration config;
        @l
        private final String webViewDataString;

        public LoadWebResult(@l Configuration configuration0, @l String s) {
            L.p(configuration0, "config");
            L.p(s, "webViewDataString");
            super();
            this.config = configuration0;
            this.webViewDataString = s;
        }

        @l
        public final Configuration component1() {
            return this.config;
        }

        @l
        public final String component2() {
            return this.webViewDataString;
        }

        @l
        public final LoadWebResult copy(@l Configuration configuration0, @l String s) {
            L.p(configuration0, "config");
            L.p(s, "webViewDataString");
            return new LoadWebResult(configuration0, s);
        }

        public static LoadWebResult copy$default(LoadWebResult initializeStateLoadWeb$LoadWebResult0, Configuration configuration0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateLoadWeb$LoadWebResult0.config;
            }
            if((v & 2) != 0) {
                s = initializeStateLoadWeb$LoadWebResult0.webViewDataString;
            }
            return initializeStateLoadWeb$LoadWebResult0.copy(configuration0, s);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadWebResult)) {
                return false;
            }
            return L.g(this.config, ((LoadWebResult)object0).config) ? L.g(this.webViewDataString, ((LoadWebResult)object0).webViewDataString) : false;
        }

        @l
        public final Configuration getConfig() {
            return this.config;
        }

        @l
        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        @Override
        public int hashCode() {
            return this.config.hashCode() * 0x1F + this.webViewDataString.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ')';
        }
    }

    public static final class Params implements BaseParams {
        @l
        private final Configuration config;

        public Params(@l Configuration configuration0) {
            L.p(configuration0, "config");
            super();
            this.config = configuration0;
        }

        @l
        public final Configuration component1() {
            return this.config;
        }

        @l
        public final Params copy(@l Configuration configuration0) {
            L.p(configuration0, "config");
            return new Params(configuration0);
        }

        public static Params copy$default(Params initializeStateLoadWeb$Params0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateLoadWeb$Params0.config;
            }
            return initializeStateLoadWeb$Params0.copy(configuration0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Params ? L.g(this.config, ((Params)object0).config) : false;
        }

        @l
        public final Configuration getConfig() {
            return this.config;
        }

        @Override
        public int hashCode() {
            return this.config.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final HttpClient httpClient;
    @l
    private final InitializeStateNetworkError initializeStateNetworkError;

    public InitializeStateLoadWeb(@l ISDKDispatchers iSDKDispatchers0, @l InitializeStateNetworkError initializeStateNetworkError0, @l HttpClient httpClient0) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(initializeStateNetworkError0, "initializeStateNetworkError");
        L.p(httpClient0, "httpClient");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.initializeStateNetworkError = initializeStateNetworkError0;
        this.httpClient = httpClient0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateLoadWeb$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.1 initializeStateLoadWeb$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.1) {
            initializeStateLoadWeb$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.1)d0;
            int v = initializeStateLoadWeb$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateLoadWeb$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        Object object1 = d0.doWork-gIAlu-s(null, this);
                        return object1 == b.l() ? object1 : e0.a(object1);
                    }
                };
            }
            else {
                initializeStateLoadWeb$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateLoadWeb$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    Object object1 = d0.doWork-gIAlu-s(null, this);
                    return object1 == b.l() ? object1 : e0.a(object1);
                }
            };
        }
        Object object0 = initializeStateLoadWeb$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateLoadWeb$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2 initializeStateLoadWeb$doWork$20 = new o(this, null) {
                    final Params $params;
                    private Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;

                    {
                        this.$params = initializeStateLoadWeb$Params0;
                        InitializeStateLoadWeb.this = initializeStateLoadWeb0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2(this.$params, InitializeStateLoadWeb.this, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object7;
                        Object object6;
                        Object object5;
                        String s1;
                        Object object4;
                        Object object3;
                        InitializeStateLoadWeb initializeStateLoadWeb1;
                        Params initializeStateLoadWeb$Params1;
                        HttpRequest httpRequest2;
                        Object object2;
                        HttpRequest httpRequest1;
                        HttpRequest httpRequest0;
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                O o0 = (O)this.L$0;
                                Params initializeStateLoadWeb$Params0 = this.$params;
                                InitializeStateLoadWeb initializeStateLoadWeb0 = InitializeStateLoadWeb.this;
                                try {
                                    DeviceLog.info(("Unity Ads init: loading webapp from " + initializeStateLoadWeb$Params0.getConfig().getWebViewUrl()));
                                    String s = initializeStateLoadWeb$Params0.getConfig().getWebViewUrl();
                                    L.o(s, "params.config.webViewUrl");
                                    httpRequest0 = new HttpRequest(s, null, RequestType.GET, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFFA, null);
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_94;
                                }
                                try {
                                    InitializationException initializationException0 = new InitializationException(ErrorState.NetworkWebviewRequest, new Exception(), initializeStateLoadWeb$Params0.getConfig());
                                    httpRequest1 = httpRequest0;
                                    com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewDataResult.1.1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$10 = new o(httpRequest0, null) {
                                        final HttpRequest $request;
                                        int I$0;
                                        int label;

                                        {
                                            InitializeStateLoadWeb.this = initializeStateLoadWeb0;
                                            this.$request = httpRequest0;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            d d1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewDataResult.1.1(InitializeStateLoadWeb.this, this.$request, d0);
                                            d1.I$0 = ((Number)object0).intValue();
                                            return d1;
                                        }

                                        @m
                                        public final Object invoke(int v, @m d d0) {
                                            return ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewDataResult.1.1)this.create(v, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((Number)object0).intValue(), ((d)object1));
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            Object object1 = b.l();
                                            switch(this.label) {
                                                case 0: {
                                                    f0.n(object0);
                                                    if(this.I$0 > 0) {
                                                        InitializeEventsMetricSender.getInstance().onRetryWebview();
                                                    }
                                                    K k0 = InitializeStateLoadWeb.this.dispatchers.getIo();
                                                    com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewDataResult.1.1.1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$10 = new o(this.$request, null) {
                                                        final HttpRequest $request;
                                                        int label;

                                                        {
                                                            InitializeStateLoadWeb.this = initializeStateLoadWeb0;
                                                            this.$request = httpRequest0;
                                                            super(2, d0);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @l
                                                        public final d create(@m Object object0, @l d d0) {
                                                            return new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewDataResult.1.1.1(InitializeStateLoadWeb.this, this.$request, d0);
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.invoke(((O)object0), ((d)object1));
                                                        }

                                                        @m
                                                        public final Object invoke(@l O o0, @m d d0) {
                                                            return ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewDataResult.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            Object object1 = b.l();
                                                            switch(this.label) {
                                                                case 0: {
                                                                    f0.n(object0);
                                                                    this.label = 1;
                                                                    object0 = InitializeStateLoadWeb.this.httpClient.execute(this.$request, this);
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
                                                    };
                                                    this.label = 1;
                                                    object0 = i.h(k0, initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$10, this);
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
                                    };
                                    this.L$0 = o0;
                                    this.L$1 = initializeStateLoadWeb$Params0;
                                    this.L$2 = initializeStateLoadWeb0;
                                    this.L$3 = httpRequest0;
                                    this.label = 1;
                                    httpRequest1 = httpRequest0;
                                    object2 = TaskExtensionsKt.withRetry(initializeStateLoadWeb$Params0.getConfig().getRetryDelay(), initializeStateLoadWeb$Params0.getConfig().getMaxRetries(), initializeStateLoadWeb$Params0.getConfig().getRetryScalingFactor(), initializationException0, initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$10, this);
                                }
                                catch(Throwable throwable1) {
                                    httpRequest2 = httpRequest1;
                                    initializeStateLoadWeb$Params1 = initializeStateLoadWeb$Params0;
                                    initializeStateLoadWeb1 = initializeStateLoadWeb0;
                                    goto label_42;
                                }
                                if(object2 == object1) {
                                    return object1;
                                }
                                httpRequest2 = httpRequest1;
                                initializeStateLoadWeb$Params1 = initializeStateLoadWeb$Params0;
                                initializeStateLoadWeb1 = initializeStateLoadWeb0;
                                object3 = e0.b(((HttpResponse)object2));
                                goto label_43;
                            }
                            case 1: {
                                httpRequest2 = (HttpRequest)this.L$3;
                                initializeStateLoadWeb1 = (InitializeStateLoadWeb)this.L$2;
                                initializeStateLoadWeb$Params1 = (Params)this.L$1;
                                O o1 = (O)this.L$0;
                                try {
                                    f0.n(object0);
                                    object2 = object0;
                                    object3 = e0.b(((HttpResponse)object2));
                                    goto label_43;
                                }
                                catch(Throwable throwable1) {
                                }
                                try {
                                label_42:
                                    object3 = e0.b(f0.a(throwable1));
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_94;
                                }
                            label_43:
                                if(e0.i(object3)) {
                                    try {
                                        com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params initializeStateNetworkError$Params0 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(initializeStateLoadWeb$Params1.getConfig());
                                        this.L$0 = initializeStateLoadWeb$Params1;
                                        this.L$1 = initializeStateLoadWeb1;
                                        this.L$2 = httpRequest2;
                                        this.L$3 = null;
                                        this.label = 2;
                                        object4 = initializeStateLoadWeb1.initializeStateNetworkError.invoke-gIAlu-s(initializeStateNetworkError$Params0, this);
                                        if(object4 == object1) {
                                            return object1;
                                        }
                                        object5 = e0.b(e0.a(object4));
                                        goto label_65;
                                    }
                                    catch(Throwable throwable2) {
                                        goto label_64;
                                    }
                                }
                                else {
                                    try {
                                        f0.n(object3);
                                        s1 = ((HttpResponse)object3).getBody().toString();
                                    }
                                    catch(CancellationException cancellationException0) {
                                        throw cancellationException0;
                                    }
                                    catch(Throwable throwable0) {
                                        goto label_94;
                                    }
                                }
                                goto label_83;
                            }
                            case 2: {
                                httpRequest2 = (HttpRequest)this.L$2;
                                initializeStateLoadWeb1 = (InitializeStateLoadWeb)this.L$1;
                                initializeStateLoadWeb$Params1 = (Params)this.L$0;
                                try {
                                    f0.n(object0);
                                    object4 = ((e0)object0).l();
                                    object5 = e0.b(e0.a(object4));
                                    goto label_65;
                                }
                                catch(Throwable throwable2) {
                                    try {
                                    label_64:
                                        object5 = e0.b(f0.a(throwable2));
                                    label_65:
                                        if(!e0.j(object5)) {
                                            Exception exception0 = new Exception("No connected events within the timeout!");
                                            throw new InitializationException(ErrorState.NetworkWebviewRequest, exception0, initializeStateLoadWeb$Params1.getConfig());
                                        }
                                        K k0 = initializeStateLoadWeb1.dispatchers.getIo();
                                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewData.1 initializeStateLoadWeb$doWork$2$1$webViewData$10 = new o(httpRequest2, null) {
                                            final HttpRequest $request;
                                            int label;

                                            {
                                                InitializeStateLoadWeb.this = initializeStateLoadWeb0;
                                                this.$request = httpRequest0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewData.1(InitializeStateLoadWeb.this, this.$request, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork.2.1.webViewData.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                Object object1 = b.l();
                                                switch(this.label) {
                                                    case 0: {
                                                        f0.n(object0);
                                                        this.label = 1;
                                                        object0 = InitializeStateLoadWeb.this.httpClient.execute(this.$request, this);
                                                        return object0 == object1 ? object1 : ((HttpResponse)object0).getBody().toString();
                                                    }
                                                    case 1: {
                                                        f0.n(object0);
                                                        return ((HttpResponse)object0).getBody().toString();
                                                    }
                                                    default: {
                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                    }
                                                }
                                            }
                                        };
                                        this.L$0 = initializeStateLoadWeb$Params1;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 3;
                                        object6 = i.h(k0, initializeStateLoadWeb$doWork$2$1$webViewData$10, this);
                                        if(object6 == object1) {
                                            return object1;
                                        }
                                        goto label_82;
                                    }
                                    catch(CancellationException cancellationException0) {
                                        throw cancellationException0;
                                    }
                                    catch(Throwable throwable0) {
                                        goto label_94;
                                    }
                                }
                            }
                            case 3: {
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        Params initializeStateLoadWeb$Params2 = (Params)this.L$0;
                        try {
                            f0.n(object0);
                            initializeStateLoadWeb$Params1 = initializeStateLoadWeb$Params2;
                            object6 = object0;
                        label_82:
                            s1 = (String)object6;
                        label_83:
                            String s2 = initializeStateLoadWeb$Params1.getConfig().getWebViewHash();
                            if(s2 != null && !L.g(Utilities.Sha256(s1), s2)) {
                                Exception exception1 = new Exception("Invalid webViewHash");
                                throw new InitializationException(ErrorState.InvalidHash, exception1, initializeStateLoadWeb$Params1.getConfig());
                            }
                            if(s2 != null) {
                                Utilities.writeFile(new File(""), s1);
                            }
                            object7 = e0.b(new LoadWebResult(initializeStateLoadWeb$Params1.getConfig(), s1));
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                        label_94:
                            object7 = e0.b(f0.a(throwable0));
                        }
                        if(!e0.j(object7)) {
                            Throwable throwable3 = e0.e(object7);
                            if(throwable3 != null) {
                                object7 = e0.b(f0.a(throwable3));
                            }
                        }
                        return e0.a(object7);
                    }
                };
                initializeStateLoadWeb$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateLoadWeb$doWork$20, initializeStateLoadWeb$doWork$10);
                return object0 == object1 ? object1 : ((e0)object0).l();
            }
            case 1: {
                f0.n(object0);
                return ((e0)object0).l();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.core.domain.task.MetricTask
    @l
    public String getMetricName() {
        return "native_download_web_view_task_unknown_time";
    }
}

