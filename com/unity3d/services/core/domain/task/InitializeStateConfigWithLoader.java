package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationLoader;
import com.unity3d.services.core.configuration.ConfigurationRequestFactory;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.configuration.PrivacyConfigurationLoader;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class InitializeStateConfigWithLoader implements BaseTask {
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

        public static Params copy$default(Params initializeStateConfigWithLoader$Params0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateConfigWithLoader$Params0.config;
            }
            return initializeStateConfigWithLoader$Params0.copy(configuration0);
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
    private final InitializeStateNetworkError initializeStateNetworkError;
    @l
    private final SDKMetricsSender sdkMetricsSender;
    @l
    private final TokenStorage tokenStorage;

    public InitializeStateConfigWithLoader(@l ISDKDispatchers iSDKDispatchers0, @l InitializeStateNetworkError initializeStateNetworkError0, @l TokenStorage tokenStorage0, @l SDKMetricsSender sDKMetricsSender0) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(initializeStateNetworkError0, "initializeStateNetworkError");
        L.p(tokenStorage0, "tokenStorage");
        L.p(sDKMetricsSender0, "sdkMetricsSender");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.initializeStateNetworkError = initializeStateNetworkError0;
        this.tokenStorage = tokenStorage0;
        this.sdkMetricsSender = sDKMetricsSender0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateConfigWithLoader$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.1 initializeStateConfigWithLoader$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.1) {
            initializeStateConfigWithLoader$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.1)d0;
            int v = initializeStateConfigWithLoader$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateConfigWithLoader$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                initializeStateConfigWithLoader$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateConfigWithLoader$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = initializeStateConfigWithLoader$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateConfigWithLoader$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2 initializeStateConfigWithLoader$doWork$20 = new o(initializeStateConfigWithLoader$Params0, null) {
                    final Params $params;
                    private Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    {
                        InitializeStateConfigWithLoader.this = initializeStateConfigWithLoader0;
                        this.$params = initializeStateConfigWithLoader$Params0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2(InitializeStateConfigWithLoader.this, this.$params, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object4;
                        h l0$h9;
                        h l0$h8;
                        Object object3;
                        h l0$h7;
                        Object object2;
                        h l0$h6;
                        Configuration configuration0;
                        h l0$h5;
                        Params initializeStateConfigWithLoader$Params2;
                        InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
                        S0 s00;
                        Params initializeStateConfigWithLoader$Params1;
                        InitializeStateConfigWithLoader initializeStateConfigWithLoader1;
                        h l0$h4;
                        h l0$h3;
                        h l0$h2;
                        h l0$h1;
                        h l0$h0;
                        Class class0 = HttpClient.class;
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                O o0 = (O)this.L$0;
                                InitializeStateConfigWithLoader initializeStateConfigWithLoader0 = InitializeStateConfigWithLoader.this;
                                Params initializeStateConfigWithLoader$Params0 = this.$params;
                                try {
                                    PrivacyConfigStorage privacyConfigStorage0 = PrivacyConfigStorage.getInstance();
                                    DeviceInfoDataFactory deviceInfoDataFactory0 = new DeviceInfoDataFactory(initializeStateConfigWithLoader0.sdkMetricsSender);
                                    l0$h0 = new h();
                                    l0$h0.a = new PrivacyConfigurationLoader(new ConfigurationLoader(new ConfigurationRequestFactory(initializeStateConfigWithLoader$Params0.getConfig(), deviceInfoDataFactory0.getDeviceInfoData(InitRequestType.TOKEN)), initializeStateConfigWithLoader0.sdkMetricsSender, ((HttpClient)initializeStateConfigWithLoader0.getServiceProvider().getRegistry().getService("", m0.d(class0)))), new ConfigurationRequestFactory(initializeStateConfigWithLoader$Params0.getConfig(), deviceInfoDataFactory0.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage0, ((HttpClient)initializeStateConfigWithLoader0.getServiceProvider().getRegistry().getService("", m0.d(class0))));
                                    l0$h1 = new h();
                                    l0$h1.a = new Configuration();
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_114;
                                }
                                try {
                                    InitializationException initializationException0 = new InitializationException(ErrorState.NetworkConfigRequest, new Exception(), initializeStateConfigWithLoader$Params0.getConfig());
                                    l0$h2 = l0$h0;
                                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$10 = new o(l0$h0, l0$h1, null) {
                                        final h $config;
                                        final h $configurationLoader;
                                        int I$0;
                                        int label;

                                        {
                                            InitializeStateConfigWithLoader.this = initializeStateConfigWithLoader0;
                                            this.$configurationLoader = l0$h0;
                                            this.$config = l0$h1;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            d d1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1(InitializeStateConfigWithLoader.this, this.$configurationLoader, this.$config, d0);
                                            d1.I$0 = ((Number)object0).intValue();
                                            return d1;
                                        }

                                        @m
                                        public final Object invoke(int v, @m d d0) {
                                            return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1)this.create(v, d0)).invokeSuspend(S0.a);
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
                                                        InitializeEventsMetricSender.getInstance().onRetryConfig();
                                                    }
                                                    K k0 = InitializeStateConfigWithLoader.this.dispatchers.getIo();
                                                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1$10 = new o(this.$config, InitializeStateConfigWithLoader.this, null) {
                                                        final h $config;
                                                        final h $configurationLoader;
                                                        int label;

                                                        {
                                                            this.$configurationLoader = l0$h0;
                                                            this.$config = l0$h1;
                                                            InitializeStateConfigWithLoader.this = initializeStateConfigWithLoader0;
                                                            super(2, d0);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @l
                                                        public final d create(@m Object object0, @l d d0) {
                                                            return new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1(this.$configurationLoader, this.$config, InitializeStateConfigWithLoader.this, d0);
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.invoke(((O)object0), ((d)object1));
                                                        }

                                                        @m
                                                        public final Object invoke(@l O o0, @m d d0) {
                                                            return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            if(this.label != 0) {
                                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                            }
                                                            f0.n(object0);
                                                            ((IConfigurationLoader)this.$configurationLoader.a).loadConfiguration(new IConfigurationLoaderListener() {
                                                                @Override  // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                                                                public void onError(@l String s) {
                                                                    L.p(s, "errorMsg");
                                                                    Metric metric0 = TSIMetric.newEmergencySwitchOff();
                                                                    L.o(metric0, "newEmergencySwitchOff()");
                                                                    InitializeStateConfigWithLoader.this.sdkMetricsSender.sendMetric(metric0);
                                                                    throw new AbortRetryException(s);
                                                                }

                                                                @Override  // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                                                                public void onSuccess(@l Configuration configuration0) {
                                                                    L.p(configuration0, "configuration");
                                                                    InitializeStateConfigWithLoader.this.a = configuration0;
                                                                    configuration0.saveToDisk();
                                                                    InitializeStateConfigWithLoader.this.tokenStorage.setInitToken(((Configuration)InitializeStateConfigWithLoader.this.a).getUnifiedAuctionToken());
                                                                }
                                                            });
                                                            return S0.a;
                                                        }
                                                    };
                                                    this.label = 1;
                                                    return i.h(k0, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1$10, this) == object1 ? object1 : S0.a;
                                                }
                                                case 1: {
                                                    f0.n(object0);
                                                    return S0.a;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    };
                                    this.L$0 = o0;
                                    this.L$1 = initializeStateConfigWithLoader0;
                                    this.L$2 = initializeStateConfigWithLoader$Params0;
                                    this.L$3 = l0$h0;
                                    this.L$4 = l0$h1;
                                    this.label = 1;
                                    l0$h2 = l0$h0;
                                    if(TaskExtensionsKt.withRetry(initializeStateConfigWithLoader$Params0.getConfig().getRetryDelay(), initializeStateConfigWithLoader$Params0.getConfig().getMaxRetries(), initializeStateConfigWithLoader$Params0.getConfig().getRetryScalingFactor(), initializationException0, initializeStateConfigWithLoader$doWork$2$1$configResult$1$10, this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable1) {
                                    l0$h3 = l0$h1;
                                    l0$h4 = l0$h2;
                                    initializeStateConfigWithLoader1 = initializeStateConfigWithLoader0;
                                    initializeStateConfigWithLoader$Params1 = initializeStateConfigWithLoader$Params0;
                                    goto label_47;
                                }
                                l0$h3 = l0$h1;
                                l0$h4 = l0$h2;
                                initializeStateConfigWithLoader1 = initializeStateConfigWithLoader0;
                                initializeStateConfigWithLoader$Params1 = initializeStateConfigWithLoader$Params0;
                                s00 = S0.a;
                                goto label_48;
                            }
                            case 1: {
                                l0$h3 = (h)this.L$4;
                                l0$h4 = (h)this.L$3;
                                initializeStateConfigWithLoader$Params1 = (Params)this.L$2;
                                initializeStateConfigWithLoader1 = (InitializeStateConfigWithLoader)this.L$1;
                                O o1 = (O)this.L$0;
                                try {
                                    f0.n(object0);
                                    s00 = S0.a;
                                    goto label_48;
                                }
                                catch(Throwable throwable1) {
                                }
                                try {
                                label_47:
                                    s00 = e0.b(f0.a(throwable1));
                                label_48:
                                    initializeStateConfigWithLoader2 = initializeStateConfigWithLoader1;
                                    initializeStateConfigWithLoader$Params2 = initializeStateConfigWithLoader$Params1;
                                    l0$h5 = l0$h4;
                                    if(e0.i(s00)) {
                                        Throwable throwable2 = e0.e(s00);
                                        if(throwable2 instanceof AbortRetryException) {
                                            throw new InitializationException(ErrorState.NetworkConfigRequest, ((Exception)throwable2), initializeStateConfigWithLoader$Params2.getConfig());
                                        }
                                        goto label_58;
                                    }
                                    else {
                                        configuration0 = (Configuration)l0$h3.a;
                                        l0$h6 = l0$h3;
                                    }
                                    goto label_108;
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_114;
                                }
                                try {
                                label_58:
                                    com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params initializeStateNetworkError$Params0 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(initializeStateConfigWithLoader$Params2.getConfig());
                                    this.L$0 = initializeStateConfigWithLoader2;
                                    this.L$1 = initializeStateConfigWithLoader$Params2;
                                    this.L$2 = l0$h5;
                                    this.L$3 = l0$h3;
                                    this.L$4 = l0$h3;
                                    this.label = 2;
                                    object2 = initializeStateConfigWithLoader2.initializeStateNetworkError.invoke-gIAlu-s(initializeStateNetworkError$Params0, this);
                                }
                                catch(Throwable throwable3) {
                                    l0$h7 = l0$h3;
                                    goto label_84;
                                }
                                if(object2 == object1) {
                                    return object1;
                                }
                                l0$h7 = l0$h3;
                                object3 = e0.b(e0.a(object2));
                                goto label_85;
                            }
                            case 2: {
                                l0$h3 = (h)this.L$4;
                                l0$h7 = (h)this.L$3;
                                l0$h5 = (h)this.L$2;
                                initializeStateConfigWithLoader$Params2 = (Params)this.L$1;
                                initializeStateConfigWithLoader2 = (InitializeStateConfigWithLoader)this.L$0;
                                try {
                                    f0.n(object0);
                                    object2 = ((e0)object0).l();
                                    object3 = e0.b(e0.a(object2));
                                    goto label_85;
                                }
                                catch(Throwable throwable3) {
                                }
                                try {
                                label_84:
                                    object3 = e0.b(f0.a(throwable3));
                                label_85:
                                    if(!e0.j(object3)) {
                                        Exception exception0 = new Exception("No connected events within the timeout!");
                                        throw new InitializationException(ErrorState.NetworkConfigRequest, exception0, initializeStateConfigWithLoader$Params2.getConfig());
                                    }
                                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                                    K k0 = initializeStateConfigWithLoader2.dispatchers.getIo();
                                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.1 initializeStateConfigWithLoader$doWork$2$1$10 = new o(l0$h7, initializeStateConfigWithLoader2, initializeStateConfigWithLoader$Params2, null) {
                                        final h $config;
                                        final h $configurationLoader;
                                        final Params $params;
                                        int label;

                                        {
                                            this.$configurationLoader = l0$h0;
                                            this.$config = l0$h1;
                                            InitializeStateConfigWithLoader.this = initializeStateConfigWithLoader0;
                                            this.$params = initializeStateConfigWithLoader$Params0;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            return new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.1(this.$configurationLoader, this.$config, InitializeStateConfigWithLoader.this, this.$params, d0);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@l O o0, @m d d0) {
                                            return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            if(this.label != 0) {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                            f0.n(object0);
                                            ((IConfigurationLoader)this.$configurationLoader.a).loadConfiguration(new IConfigurationLoaderListener() {
                                                @Override  // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                                                public void onError(@l String s) {
                                                    L.p(s, "errorMsg");
                                                    Metric metric0 = TSIMetric.newEmergencySwitchOff();
                                                    L.o(metric0, "newEmergencySwitchOff()");
                                                    this.$params.sdkMetricsSender.sendMetric(metric0);
                                                    Exception exception0 = new Exception(s);
                                                    throw new InitializationException(ErrorState.NetworkConfigRequest, exception0, this.$params.getConfig());
                                                }

                                                @Override  // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                                                public void onSuccess(@l Configuration configuration0) {
                                                    L.p(configuration0, "configuration");
                                                    InitializeStateConfigWithLoader.this.a = configuration0;
                                                    configuration0.saveToDisk();
                                                    this.$params.tokenStorage.setInitToken(((Configuration)InitializeStateConfigWithLoader.this.a).getUnifiedAuctionToken());
                                                }
                                            });
                                            return S0.a;
                                        }
                                    };
                                    this.L$0 = l0$h7;
                                    this.L$1 = l0$h3;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 3;
                                    if(i.h(k0, initializeStateConfigWithLoader$doWork$2$1$10, this) == object1) {
                                        return object1;
                                    }
                                    l0$h8 = l0$h3;
                                    l0$h9 = l0$h7;
                                    goto label_105;
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_114;
                                }
                            }
                            case 3: {
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        l0$h8 = (h)this.L$1;
                        l0$h9 = (h)this.L$0;
                        try {
                            f0.n(object0);
                        label_105:
                            configuration0 = (Configuration)l0$h9.a;
                            l0$h3 = l0$h8;
                            l0$h6 = l0$h9;
                        label_108:
                            l0$h3.a = configuration0;
                            object4 = e0.b(((Configuration)l0$h6.a));
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                        label_114:
                            object4 = e0.b(f0.a(throwable0));
                        }
                        if(!e0.j(object4)) {
                            Throwable throwable4 = e0.e(object4);
                            if(throwable4 != null) {
                                object4 = e0.b(f0.a(throwable4));
                            }
                        }
                        return e0.a(object4);
                    }
                };
                initializeStateConfigWithLoader$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateConfigWithLoader$doWork$20, initializeStateConfigWithLoader$doWork$10);
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

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object invoke-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.invoke-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object invoke-gIAlu-s(@l Params initializeStateConfigWithLoader$Params0, @l d d0) {
        return DefaultImpls.invoke-gIAlu-s(this, initializeStateConfigWithLoader$Params0, d0);
    }
}

