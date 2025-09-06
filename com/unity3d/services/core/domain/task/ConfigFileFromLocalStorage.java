package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import org.json.JSONObject;
import y4.l;
import y4.m;

public final class ConfigFileFromLocalStorage extends MetricTask {
    public static final class Params implements BaseParams {
        @l
        private final Configuration defaultConfiguration;

        public Params() {
            this(null, 1, null);
        }

        public Params(@l Configuration configuration0) {
            L.p(configuration0, "defaultConfiguration");
            super();
            this.defaultConfiguration = configuration0;
        }

        public Params(Configuration configuration0, int v, w w0) {
            if((v & 1) != 0) {
                configuration0 = new Configuration();
            }
            this(configuration0);
        }

        @l
        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }
    }

    @l
    private final ISDKDispatchers dispatchers;

    public ConfigFileFromLocalStorage(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params configFileFromLocalStorage$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.doWork.1 configFileFromLocalStorage$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.doWork.1) {
            configFileFromLocalStorage$doWork$10 = (com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.doWork.1)d0;
            int v = configFileFromLocalStorage$doWork$10.label;
            if((v & 0x80000000) == 0) {
                configFileFromLocalStorage$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                configFileFromLocalStorage$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            configFileFromLocalStorage$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = configFileFromLocalStorage$doWork$10.result;
        Object object1 = b.l();
        switch(configFileFromLocalStorage$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getIo();
                com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.doWork.2 configFileFromLocalStorage$doWork$20 = new o(null) {
                    final Params $params;
                    int label;

                    {
                        this.$params = configFileFromLocalStorage$Params0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.doWork.2(this.$params, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Configuration configuration0;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        try {
                            File file0 = new File("");
                            configuration0 = file0.exists() ? new Configuration(new JSONObject(kotlin.io.m.B(file0, null, 1, null))) : this.$params.getDefaultConfiguration();
                            goto label_10;
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_9;
                        }
                        throw cancellationException0;
                    label_9:
                        configuration0 = e0.b(f0.a(throwable0));
                    label_10:
                        if(!e0.j(configuration0)) {
                            Throwable throwable1 = e0.e(configuration0);
                            if(throwable1 != null) {
                                configuration0 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(configuration0);
                    }
                };
                configFileFromLocalStorage$doWork$10.label = 1;
                object0 = i.h(k0, configFileFromLocalStorage$doWork$20, configFileFromLocalStorage$doWork$10);
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
        return "native_read_local_config_task_unknown_time";
    }
}

