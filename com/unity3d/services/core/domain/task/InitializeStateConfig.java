package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.NetworkIOException;
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

public final class InitializeStateConfig extends MetricTask {
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

        public static Params copy$default(Params initializeStateConfig$Params0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateConfig$Params0.config;
            }
            return initializeStateConfig$Params0.copy(configuration0);
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
    private final InitializeStateConfigWithLoader initializeStateConfigWithLoader;

    public InitializeStateConfig(@l ISDKDispatchers iSDKDispatchers0, @l InitializeStateConfigWithLoader initializeStateConfigWithLoader0) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(initializeStateConfigWithLoader0, "initializeStateConfigWithLoader");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.initializeStateConfigWithLoader = initializeStateConfigWithLoader0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateConfig$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateConfig.doWork.1 initializeStateConfig$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateConfig.doWork.1) {
            initializeStateConfig$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateConfig.doWork.1)d0;
            int v = initializeStateConfig$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateConfig$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                initializeStateConfig$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateConfig$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = initializeStateConfig$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateConfig$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateConfig.doWork.2 initializeStateConfig$doWork$20 = new o(this, null) {
                    final Params $params;
                    Object L$0;
                    int label;

                    {
                        this.$params = initializeStateConfig$Params0;
                        InitializeStateConfig.this = initializeStateConfig0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.InitializeStateConfig.doWork.2(this.$params, InitializeStateConfig.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateConfig.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Configuration configuration3;
                        Configuration configuration2;
                        Configuration configuration1;
                        Object object2;
                        Configuration configuration0;
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                InitializeStateConfig initializeStateConfig0 = InitializeStateConfig.this;
                                try {
                                    DeviceLog.info("Unity Ads init: load configuration from https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json");
                                    configuration0 = new Configuration("https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json", this.$params.getConfig().getExperimentsReader());
                                    try {
                                        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params initializeStateConfigWithLoader$Params0 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params(configuration0);
                                        this.L$0 = configuration0;
                                        this.label = 1;
                                        object2 = initializeStateConfig0.initializeStateConfigWithLoader.invoke-gIAlu-s(initializeStateConfigWithLoader$Params0, this);
                                    }
                                    catch(NetworkIOException networkIOException0) {
                                        configuration1 = configuration0;
                                        break;
                                    }
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_32;
                                }
                                if(object2 == object1) {
                                    return object1;
                                }
                                configuration1 = configuration0;
                                goto label_22;
                            }
                            case 1: {
                                configuration1 = (Configuration)this.L$0;
                                try {
                                    f0.n(object0);
                                    object2 = ((e0)object0).l();
                                label_22:
                                    f0.n(object2);
                                    configuration2 = (Configuration)object2;
                                    goto label_27;
                                }
                                catch(NetworkIOException networkIOException0) {
                                    break;
                                }
                                catch(CancellationException cancellationException0) {
                                    throw cancellationException0;
                                }
                                catch(Throwable throwable0) {
                                    goto label_32;
                                }
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        try {
                            throw new InitializationException(ErrorState.NetworkConfigRequest, networkIOException0, configuration1);
                        label_27:
                            configuration3 = configuration2;
                        }
                        catch(CancellationException cancellationException0) {
                            throw cancellationException0;
                        }
                        catch(Throwable throwable0) {
                        label_32:
                            configuration3 = e0.b(f0.a(throwable0));
                        }
                        if(!e0.j(configuration3)) {
                            Throwable throwable1 = e0.e(configuration3);
                            if(throwable1 != null) {
                                configuration3 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(configuration3);
                    }
                };
                initializeStateConfig$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateConfig$doWork$20, initializeStateConfig$doWork$10);
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
        return "native_config_fetch_task_unknown_time";
    }
}

