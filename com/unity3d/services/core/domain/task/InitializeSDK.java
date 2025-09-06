package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.ResultExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class InitializeSDK extends MetricTask {
    @l
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final InitializeStateComplete initializeStateComplete;
    @l
    private final InitializeStateConfig initializeStateConfig;
    @l
    private final InitializeStateCreate initializeStateCreate;
    @l
    private final InitializeStateError initializeStateError;
    @l
    private final InitializeStateLoadCache initializeStateLoadCache;
    @l
    private final InitializeStateLoadWeb initializeStateLoadWeb;
    @l
    private final InitializeStateReset initializeStateReset;

    public InitializeSDK(@l ISDKDispatchers iSDKDispatchers0, @l ConfigFileFromLocalStorage configFileFromLocalStorage0, @l InitializeStateReset initializeStateReset0, @l InitializeStateError initializeStateError0, @l InitializeStateConfig initializeStateConfig0, @l InitializeStateCreate initializeStateCreate0, @l InitializeStateLoadCache initializeStateLoadCache0, @l InitializeStateLoadWeb initializeStateLoadWeb0, @l InitializeStateComplete initializeStateComplete0) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(configFileFromLocalStorage0, "configFileFromLocalStorage");
        L.p(initializeStateReset0, "initializeStateReset");
        L.p(initializeStateError0, "initializeStateError");
        L.p(initializeStateConfig0, "initializeStateConfig");
        L.p(initializeStateCreate0, "initializeStateCreate");
        L.p(initializeStateLoadCache0, "initializeStateLoadCache");
        L.p(initializeStateLoadWeb0, "initializeStateLoadWeb");
        L.p(initializeStateComplete0, "initializeStateComplete");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.configFileFromLocalStorage = configFileFromLocalStorage0;
        this.initializeStateReset = initializeStateReset0;
        this.initializeStateError = initializeStateError0;
        this.initializeStateConfig = initializeStateConfig0;
        this.initializeStateCreate = initializeStateCreate0;
        this.initializeStateLoadCache = initializeStateLoadCache0;
        this.initializeStateLoadWeb = initializeStateLoadWeb0;
        this.initializeStateComplete = initializeStateComplete0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((EmptyParams)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l EmptyParams emptyParams0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeSDK.doWork.1 initializeSDK$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeSDK.doWork.1) {
            initializeSDK$doWork$10 = (com.unity3d.services.core.domain.task.InitializeSDK.doWork.1)d0;
            int v = initializeSDK$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeSDK$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                initializeSDK$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeSDK$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = initializeSDK$doWork$10.result;
        Object object1 = b.l();
        switch(initializeSDK$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeSDK.doWork.2 initializeSDK$doWork$20 = new o(null) {
                    private Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;

                    {
                        InitializeSDK.this = initializeSDK0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.services.core.domain.task.InitializeSDK.doWork.2(InitializeSDK.this, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeSDK.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        S0 s00;
                        InitializeSDK initializeSDK4;
                        Object object11;
                        String s1;
                        Object object10;
                        Object object9;
                        Object object7;
                        Object object6;
                        Object object5;
                        Configuration configuration4;
                        InitializeSDK initializeSDK2;
                        O o2;
                        Object object4;
                        Object object3;
                        Object object2;
                        Configuration configuration3;
                        InitializeSDK initializeSDK1;
                        Configuration configuration1;
                        Object object1 = b.l();
                        try {
                            switch(this.label) {
                                case 0: {
                                    goto label_3;
                                }
                                case 1: {
                                    goto label_19;
                                }
                                case 2: {
                                    goto label_30;
                                }
                                case 3: {
                                    goto label_51;
                                }
                                case 4: {
                                    goto label_74;
                                }
                                case 5: {
                                    goto label_80;
                                }
                                case 6: {
                                    goto label_98;
                                }
                                case 7: {
                                    goto label_113;
                                }
                                case 8: {
                                    goto label_152;
                                }
                                case 9: {
                                    goto label_158;
                                }
                                case 10: {
                                    goto label_172;
                                }
                                case 11: {
                                    goto label_191;
                                }
                                case 12: {
                                    goto label_202;
                                }
                                case 13: {
                                    goto label_213;
                                }
                            }
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    label_3:
                        f0.n(object0);
                        O o0 = (O)this.L$0;
                        InitializeSDK initializeSDK0 = InitializeSDK.this;
                        try {
                            SdkProperties.setInitializationTime(Device.getElapsedRealtime());
                            SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
                            InitializeEventsMetricSender.getInstance().didInitStart();
                            String s = ClientProperties.getGameId();
                            if(s == null || v.b1(s) == null) {
                                Exception exception0 = new Exception("gameId \"" + s + "\" should be a number.");
                                Configuration configuration0 = new Configuration();
                                InitializationException initializationException0 = new InitializationException(ErrorState.InvalidGameId, exception0, configuration0);
                                this.L$0 = o0;
                                this.L$1 = initializeSDK0;
                                this.label = 1;
                                if(initializeSDK0.handleInitializationException(initializationException0, this) == object1) {
                                    return object1;
                                }
                            }
                            goto label_22;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_19:
                        initializeSDK0 = (InitializeSDK)this.L$1;
                        o0 = (O)this.L$0;
                        try {
                            f0.n(object0);
                        label_22:
                            DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                            Params configFileFromLocalStorage$Params0 = new Params(null, 1, null);
                            this.L$0 = o0;
                            this.L$1 = initializeSDK0;
                            this.label = 2;
                            configuration1 = initializeSDK0.configFileFromLocalStorage.invoke-gIAlu-s(configFileFromLocalStorage$Params0, this);
                            if(configuration1 == object1) {
                                return object1;
                            }
                            goto label_35;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_30:
                        initializeSDK0 = (InitializeSDK)this.L$1;
                        O o1 = (O)this.L$0;
                        try {
                            f0.n(object0);
                            configuration1 = ((e0)object0).l();
                            o0 = o1;
                        label_35:
                            initializeSDK1 = initializeSDK0;
                            Throwable throwable1 = e0.e(configuration1);
                            if(throwable1 != null) {
                                DeviceLog.debug(("Unity Ads Init: Could not load config file from local storage: " + throwable1.getMessage()));
                            }
                            Configuration configuration2 = new Configuration();
                            if(e0.i(configuration1)) {
                                configuration1 = configuration2;
                            }
                            configuration3 = configuration1;
                            com.unity3d.services.core.domain.task.InitializeStateReset.Params initializeStateReset$Params0 = new com.unity3d.services.core.domain.task.InitializeStateReset.Params(configuration3);
                            this.L$0 = o0;
                            this.L$1 = initializeSDK1;
                            this.L$2 = configuration3;
                            this.label = 3;
                            object2 = initializeSDK1.initializeStateReset.invoke-gIAlu-s(initializeStateReset$Params0, this);
                            if(object2 == object1) {
                                return object1;
                            }
                            goto label_56;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_51:
                        configuration3 = (Configuration)this.L$2;
                        initializeSDK1 = (InitializeSDK)this.L$1;
                        o0 = (O)this.L$0;
                        try {
                            f0.n(object0);
                            object2 = ((e0)object0).l();
                        label_56:
                            if(e0.i(object2)) {
                                Throwable throwable2 = e0.e(object2);
                                this.L$0 = object2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                                if(initializeSDK1.executeErrorState-BWLJW6A(ErrorState.ResetWebApp, throwable2, configuration3, this) == object1) {
                                    return object1;
                                }
                                object3 = object2;
                                goto label_76;
                            }
                            com.unity3d.services.core.domain.task.InitializeStateConfig.Params initializeStateConfig$Params0 = new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(configuration3);
                            this.L$0 = o0;
                            this.L$1 = initializeSDK1;
                            this.L$2 = configuration3;
                            this.label = 5;
                            object4 = initializeSDK1.initializeStateConfig.invoke-gIAlu-s(initializeStateConfig$Params0, this);
                            if(object4 == object1) {
                                return object1;
                            label_74:
                                object3 = this.L$0;
                                f0.n(object0);
                            label_76:
                                Throwable throwable3 = e0.e(object3);
                                if(throwable3 == null) {
                                    throwable3 = new Exception("ResetWebApp");
                                }
                                throw throwable3;
                            }
                            goto label_85;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_80:
                        configuration3 = (Configuration)this.L$2;
                        initializeSDK1 = (InitializeSDK)this.L$1;
                        o0 = (O)this.L$0;
                        try {
                            f0.n(object0);
                            object4 = ((e0)object0).l();
                        label_85:
                            o2 = o0;
                            initializeSDK2 = initializeSDK1;
                            configuration4 = configuration3;
                            object5 = object4;
                            if(e0.i(object5)) {
                                InitializationException initializationException1 = ResultExtensionsKt.getInitializationExceptionOrThrow(object5);
                                this.L$0 = o2;
                                this.L$1 = initializeSDK2;
                                this.L$2 = configuration4;
                                this.L$3 = object5;
                                this.label = 6;
                                if(initializeSDK2.handleInitializationException(initializationException1, this) == object1) {
                                    return object1;
                                }
                            }
                            goto label_103;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_98:
                        object5 = this.L$3;
                        configuration4 = (Configuration)this.L$2;
                        initializeSDK2 = (InitializeSDK)this.L$1;
                        o2 = (O)this.L$0;
                        try {
                            f0.n(object0);
                        label_103:
                            f0.n(object5);
                            com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params initializeStateLoadCache$Params0 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params(((Configuration)object5));
                            this.L$0 = o2;
                            this.L$1 = initializeSDK2;
                            this.L$2 = configuration4;
                            this.L$3 = object5;
                            this.label = 7;
                            object6 = initializeSDK2.initializeStateLoadCache.invoke-gIAlu-s(initializeStateLoadCache$Params0, this);
                            if(object6 == object1) {
                                return object1;
                            }
                            goto label_119;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_113:
                        object5 = this.L$3;
                        configuration4 = (Configuration)this.L$2;
                        initializeSDK2 = (InitializeSDK)this.L$1;
                        o2 = (O)this.L$0;
                        try {
                            f0.n(object0);
                            object6 = ((e0)object0).l();
                        label_119:
                            if(e0.i(object6)) {
                                Throwable throwable4 = e0.e(object6);
                                this.L$0 = object6;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 8;
                                if(initializeSDK2.executeErrorState-BWLJW6A(ErrorState.LoadCache, throwable4, configuration4, this) == object1) {
                                    return object1;
                                }
                                object7 = object6;
                                goto label_154;
                            }
                            f0.n(object6);
                            if(!((LoadCacheResult)object6).getHasHashMismatch()) {
                                s1 = ((LoadCacheResult)object6).getWebViewData();
                                if(s1 == null) {
                                    throw new IllegalStateException("WebView is missing.");
                                label_152:
                                    object7 = this.L$0;
                                    f0.n(object0);
                                label_154:
                                    Throwable throwable5 = e0.e(object7);
                                    if(throwable5 == null) {
                                        throwable5 = new Exception("LoadCache");
                                    }
                                    throw throwable5;
                                }
                            }
                            else if(!configuration4.getExperiments().isWebViewAsyncDownloadEnabled() || ((LoadCacheResult)object6).getWebViewData() == null) {
                                f0.n(object5);
                                com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params initializeStateLoadWeb$Params0 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params(((Configuration)object5));
                                this.L$0 = initializeSDK2;
                                this.L$1 = object5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 9;
                                Object object8 = initializeSDK2.initializeStateLoadWeb.invoke-gIAlu-s(initializeStateLoadWeb$Params0, this);
                                if(object8 == object1) {
                                    return object1;
                                }
                                object9 = object5;
                                object10 = object8;
                                goto label_164;
                            }
                            else {
                                k.f(o2, new N("LaunchLoadWeb"), null, new o(object5, null) {
                                    final Object $configResult;
                                    int label;

                                    {
                                        InitializeSDK.this = initializeSDK0;
                                        this.$configResult = object0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.services.core.domain.task.InitializeSDK.doWork.2.1.webViewData.1(InitializeSDK.this, this.$configResult, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.services.core.domain.task.InitializeSDK.doWork.2.1.webViewData.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                f0.n(this.$configResult);
                                                com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params initializeStateLoadWeb$Params0 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params(((Configuration)this.$configResult));
                                                this.label = 1;
                                                return InitializeSDK.this.initializeStateLoadWeb.invoke-gIAlu-s(initializeStateLoadWeb$Params0, this) == object1 ? object1 : S0.a;
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
                                }, 2, null);
                                s1 = ((LoadCacheResult)object6).getWebViewData();
                            }
                            goto label_179;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_158:
                        object5 = this.L$1;
                        InitializeSDK initializeSDK3 = (InitializeSDK)this.L$0;
                        try {
                            f0.n(object0);
                            initializeSDK2 = initializeSDK3;
                            object9 = object5;
                            object10 = ((e0)object0).l();
                        label_164:
                            if(e0.i(object10)) {
                                InitializationException initializationException2 = ResultExtensionsKt.getInitializationExceptionOrThrow(object10);
                                this.L$0 = initializeSDK2;
                                this.L$1 = object9;
                                this.L$2 = object10;
                                this.label = 10;
                                if(initializeSDK2.handleInitializationException(initializationException2, this) == object1) {
                                    return object1;
                                }
                            }
                            goto label_176;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_172:
                        object10 = this.L$2;
                        object9 = this.L$1;
                        initializeSDK2 = (InitializeSDK)this.L$0;
                        try {
                            f0.n(object0);
                        label_176:
                            f0.n(object10);
                            s1 = ((LoadWebResult)object10).getWebViewDataString();
                            object5 = object9;
                        label_179:
                            f0.n(object5);
                            com.unity3d.services.core.domain.task.InitializeStateCreate.Params initializeStateCreate$Params0 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params(((Configuration)object5), s1);
                            this.L$0 = initializeSDK2;
                            this.L$1 = object5;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 11;
                            object11 = initializeSDK2.initializeStateCreate.invoke-gIAlu-s(initializeStateCreate$Params0, this);
                            if(object11 == object1) {
                                return object1;
                            }
                            initializeSDK4 = initializeSDK2;
                            goto label_195;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_191:
                        object5 = this.L$1;
                        initializeSDK4 = (InitializeSDK)this.L$0;
                        try {
                            f0.n(object0);
                            object11 = ((e0)object0).l();
                        label_195:
                            if(e0.i(object11)) {
                                InitializationException initializationException3 = ResultExtensionsKt.getInitializationExceptionOrThrow(object11);
                                this.L$0 = initializeSDK4;
                                this.L$1 = object5;
                                this.label = 12;
                                if(initializeSDK4.handleInitializationException(initializationException3, this) == object1) {
                                    return object1;
                                }
                            }
                            goto label_205;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                            goto label_221;
                        }
                    label_202:
                        object5 = this.L$1;
                        initializeSDK4 = (InitializeSDK)this.L$0;
                        try {
                            f0.n(object0);
                        label_205:
                            f0.n(object5);
                            com.unity3d.services.core.domain.task.InitializeStateComplete.Params initializeStateComplete$Params0 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params(((Configuration)object5));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 13;
                            Object object12 = initializeSDK4.initializeStateComplete.invoke-gIAlu-s(initializeStateComplete$Params0, this);
                            if(object12 == object1) {
                                return object1;
                            label_213:
                                f0.n(object0);
                                object12 = ((e0)object0).l();
                            }
                            f0.n(object12);
                            s00 = S0.a;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                        label_221:
                            s00 = e0.b(f0.a(throwable0));
                        }
                        if(!e0.j(s00)) {
                            Throwable throwable6 = e0.e(s00);
                            if(throwable6 != null) {
                                s00 = e0.b(f0.a(throwable6));
                            }
                        }
                        return e0.a(s00);
                    }
                };
                initializeSDK$doWork$10.label = 1;
                object0 = i.h(k0, initializeSDK$doWork$20, initializeSDK$doWork$10);
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

    private final Object executeErrorState-BWLJW6A(ErrorState errorState0, Throwable throwable0, Configuration configuration0, d d0) {
        com.unity3d.services.core.domain.task.InitializeSDK.executeErrorState.1 initializeSDK$executeErrorState$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeSDK.executeErrorState.1) {
            initializeSDK$executeErrorState$10 = (com.unity3d.services.core.domain.task.InitializeSDK.executeErrorState.1)d0;
            int v = initializeSDK$executeErrorState$10.label;
            if((v & 0x80000000) == 0) {
                initializeSDK$executeErrorState$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        Object object1 = d0.executeErrorState-BWLJW6A(null, null, null, this);
                        return object1 == b.l() ? object1 : e0.a(object1);
                    }
                };
            }
            else {
                initializeSDK$executeErrorState$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeSDK$executeErrorState$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    Object object1 = d0.executeErrorState-BWLJW6A(null, null, null, this);
                    return object1 == b.l() ? object1 : e0.a(object1);
                }
            };
        }
        Object object0 = initializeSDK$executeErrorState$10.result;
        Object object1 = b.l();
        switch(initializeSDK$executeErrorState$10.label) {
            case 0: {
                f0.n(object0);
                com.unity3d.services.core.domain.task.InitializeStateError.Params initializeStateError$Params0 = new com.unity3d.services.core.domain.task.InitializeStateError.Params(errorState0, new Exception((throwable0 == null ? null : throwable0.getMessage())), configuration0);
                initializeSDK$executeErrorState$10.label = 1;
                Object object2 = this.initializeStateError.invoke-gIAlu-s(initializeStateError$Params0, initializeSDK$executeErrorState$10);
                return object2 == object1 ? object1 : object2;
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
        return "native_initialize_task_unknown_time";
    }

    private final Object handleInitializationException(InitializationException initializationException0, d d0) {
        com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException.1 initializeSDK$handleInitializationException$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException.1) {
            initializeSDK$handleInitializationException$10 = (com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException.1)d0;
            int v = initializeSDK$handleInitializationException$10.label;
            if((v & 0x80000000) == 0) {
                initializeSDK$handleInitializationException$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.handleInitializationException(null, this);
                    }
                };
            }
            else {
                initializeSDK$handleInitializationException$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeSDK$handleInitializationException$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.handleInitializationException(null, this);
                }
            };
        }
        Object object0 = initializeSDK$handleInitializationException$10.result;
        Object object1 = b.l();
        switch(initializeSDK$handleInitializationException$10.label) {
            case 0: {
                f0.n(object0);
                initializeSDK$handleInitializationException$10.L$0 = initializationException0;
                initializeSDK$handleInitializationException$10.label = 1;
                if(this.executeErrorState-BWLJW6A(initializationException0.getErrorState(), initializationException0.getOriginalException(), initializationException0.getConfig(), initializeSDK$handleInitializationException$10) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                initializationException0 = (InitializationException)initializeSDK$handleInitializationException$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw initializationException0;
    }
}

