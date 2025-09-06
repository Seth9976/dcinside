package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.ISDKDispatchers;
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

public final class InitializeStateComplete extends MetricTask {
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

        public static Params copy$default(Params initializeStateComplete$Params0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateComplete$Params0.config;
            }
            return initializeStateComplete$Params0.copy(configuration0);
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

    public InitializeStateComplete(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateComplete$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateComplete.doWork.1 initializeStateComplete$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateComplete.doWork.1) {
            initializeStateComplete$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateComplete.doWork.1)d0;
            int v = initializeStateComplete$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateComplete$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                initializeStateComplete$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateComplete$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = initializeStateComplete$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateComplete$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateComplete.doWork.2 initializeStateComplete$doWork$20 = new o(null) {
                    final Params $params;
                    int label;

                    {
                        this.$params = initializeStateComplete$Params0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.InitializeStateComplete.doWork.2(this.$params, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateComplete.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        S0 s00;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Params initializeStateComplete$Params0 = this.$params;
                        try {
                            Class[] arr_class = initializeStateComplete$Params0.getConfig().getModuleConfigurationList();
                            L.o(arr_class, "params.config.moduleConfigurationList");
                            for(int v = 0; v < arr_class.length; ++v) {
                                IModuleConfiguration iModuleConfiguration0 = initializeStateComplete$Params0.getConfig().getModuleConfiguration(arr_class[v]);
                                if(iModuleConfiguration0 != null) {
                                    iModuleConfiguration0.initCompleteState(initializeStateComplete$Params0.getConfig());
                                }
                            }
                            s00 = S0.a;
                            goto label_19;
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_18;
                        }
                        throw cancellationException0;
                    label_18:
                        s00 = e0.b(f0.a(throwable0));
                    label_19:
                        if(!e0.j(s00)) {
                            Throwable throwable1 = e0.e(s00);
                            if(throwable1 != null) {
                                s00 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(s00);
                    }
                };
                initializeStateComplete$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateComplete$doWork$20, initializeStateComplete$doWork$10);
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
        return "native_completion_task_unknown_time";
    }
}

