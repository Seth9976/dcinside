package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
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

public final class InitializeStateError extends MetricTask {
    public static final class Params implements BaseParams {
        @l
        private final Configuration config;
        @l
        private final ErrorState errorState;
        @l
        private final Exception exception;

        public Params(@l ErrorState errorState0, @l Exception exception0, @l Configuration configuration0) {
            L.p(errorState0, "errorState");
            L.p(exception0, "exception");
            L.p(configuration0, "config");
            super();
            this.errorState = errorState0;
            this.exception = exception0;
            this.config = configuration0;
        }

        @l
        public final ErrorState component1() {
            return this.errorState;
        }

        @l
        public final Exception component2() {
            return this.exception;
        }

        @l
        public final Configuration component3() {
            return this.config;
        }

        @l
        public final Params copy(@l ErrorState errorState0, @l Exception exception0, @l Configuration configuration0) {
            L.p(errorState0, "errorState");
            L.p(exception0, "exception");
            L.p(configuration0, "config");
            return new Params(errorState0, exception0, configuration0);
        }

        public static Params copy$default(Params initializeStateError$Params0, ErrorState errorState0, Exception exception0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                errorState0 = initializeStateError$Params0.errorState;
            }
            if((v & 2) != 0) {
                exception0 = initializeStateError$Params0.exception;
            }
            if((v & 4) != 0) {
                configuration0 = initializeStateError$Params0.config;
            }
            return initializeStateError$Params0.copy(errorState0, exception0, configuration0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Params)) {
                return false;
            }
            if(this.errorState != ((Params)object0).errorState) {
                return false;
            }
            return L.g(this.exception, ((Params)object0).exception) ? L.g(this.config, ((Params)object0).config) : false;
        }

        @l
        public final Configuration getConfig() {
            return this.config;
        }

        @l
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @l
        public final Exception getException() {
            return this.exception;
        }

        @Override
        public int hashCode() {
            return (this.errorState.hashCode() * 0x1F + this.exception.hashCode()) * 0x1F + this.config.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Params(errorState=" + this.errorState + ", exception=" + this.exception + ", config=" + this.config + ')';
        }
    }

    @l
    private final ISDKDispatchers dispatchers;

    public InitializeStateError(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateError$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateError.doWork.1 initializeStateError$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateError.doWork.1) {
            initializeStateError$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateError.doWork.1)d0;
            int v = initializeStateError$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateError$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                initializeStateError$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateError$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = initializeStateError$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateError$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateError.doWork.2 initializeStateError$doWork$20 = new o(null) {
                    final Params $params;
                    int label;

                    {
                        this.$params = initializeStateError$Params0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.InitializeStateError.doWork.2(this.$params, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateError.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        S0 s00;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Params initializeStateError$Params0 = this.$params;
                        try {
                            DeviceLog.error(("Unity Ads init: halting init in " + initializeStateError$Params0.getErrorState().getMetricName() + ": " + initializeStateError$Params0.getException().getMessage()));
                            Class[] arr_class = initializeStateError$Params0.getConfig().getModuleConfigurationList();
                            if(arr_class == null) {
                                arr_class = new Class[0];
                            }
                            for(int v = 0; v < arr_class.length; ++v) {
                                IModuleConfiguration iModuleConfiguration0 = initializeStateError$Params0.getConfig().getModuleConfiguration(arr_class[v]);
                                if(iModuleConfiguration0 != null) {
                                    iModuleConfiguration0.initErrorState(initializeStateError$Params0.getConfig(), initializeStateError$Params0.getErrorState(), initializeStateError$Params0.getException().getMessage());
                                }
                            }
                            s00 = S0.a;
                            goto label_21;
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_20;
                        }
                        throw cancellationException0;
                    label_20:
                        s00 = e0.b(f0.a(throwable0));
                    label_21:
                        if(!e0.j(s00)) {
                            Throwable throwable1 = e0.e(s00);
                            if(throwable1 != null) {
                                s00 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(s00);
                    }
                };
                initializeStateError$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateError$doWork$20, initializeStateError$doWork$10);
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
        return "native_error_task_unknown_time";
    }
}

