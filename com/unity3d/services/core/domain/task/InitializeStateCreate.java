package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
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

public final class InitializeStateCreate extends MetricTask {
    public static final class Params implements BaseParams {
        @l
        private final Configuration config;
        @l
        private final String webViewData;

        public Params(@l Configuration configuration0, @l String s) {
            L.p(configuration0, "config");
            L.p(s, "webViewData");
            super();
            this.config = configuration0;
            this.webViewData = s;
        }

        @l
        public final Configuration component1() {
            return this.config;
        }

        @l
        public final String component2() {
            return this.webViewData;
        }

        @l
        public final Params copy(@l Configuration configuration0, @l String s) {
            L.p(configuration0, "config");
            L.p(s, "webViewData");
            return new Params(configuration0, s);
        }

        public static Params copy$default(Params initializeStateCreate$Params0, Configuration configuration0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateCreate$Params0.config;
            }
            if((v & 2) != 0) {
                s = initializeStateCreate$Params0.webViewData;
            }
            return initializeStateCreate$Params0.copy(configuration0, s);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Params)) {
                return false;
            }
            return L.g(this.config, ((Params)object0).config) ? L.g(this.webViewData, ((Params)object0).webViewData) : false;
        }

        @l
        public final Configuration getConfig() {
            return this.config;
        }

        @l
        public final String getWebViewData() {
            return this.webViewData;
        }

        @Override
        public int hashCode() {
            return this.config.hashCode() * 0x1F + this.webViewData.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Params(config=" + this.config + ", webViewData=" + this.webViewData + ')';
        }
    }

    @l
    private final ISDKDispatchers dispatchers;

    public InitializeStateCreate(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateCreate$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateCreate.doWork.1 initializeStateCreate$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateCreate.doWork.1) {
            initializeStateCreate$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateCreate.doWork.1)d0;
            int v = initializeStateCreate$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateCreate$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                initializeStateCreate$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateCreate$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = initializeStateCreate$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateCreate$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateCreate.doWork.2 initializeStateCreate$doWork$20 = new o(null) {
                    final Params $params;
                    int label;

                    {
                        this.$params = initializeStateCreate$Params0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.InitializeStateCreate.doWork.2(this.$params, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateCreate.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Configuration configuration1;
                        ErrorState errorState0;
                        String s;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        try {
                            DeviceLog.debug("Unity Ads init: creating webapp");
                            Configuration configuration0 = this.$params.getConfig();
                            configuration0.setWebViewData(this.$params.getWebViewData());
                            try {
                                s = "Unity Ads WebApp creation failed";
                                errorState0 = WebViewApp.create(configuration0, false);
                            }
                            catch(IllegalThreadStateException illegalThreadStateException0) {
                                DeviceLog.exception("Illegal Thread", illegalThreadStateException0);
                                throw new InitializationException(ErrorState.CreateWebApp, illegalThreadStateException0, configuration0);
                            }
                            if(errorState0 == null) {
                                configuration1 = configuration0;
                                goto label_23;
                            }
                            if(WebViewApp.getCurrentApp().getWebAppFailureMessage() != null) {
                                s = WebViewApp.getCurrentApp().getWebAppFailureMessage();
                            }
                            DeviceLog.error(s);
                            throw new InitializationException(errorState0, new Exception(s), configuration0);
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_22;
                        }
                        throw cancellationException0;
                    label_22:
                        configuration1 = e0.b(f0.a(throwable0));
                    label_23:
                        if(!e0.j(configuration1)) {
                            Throwable throwable1 = e0.e(configuration1);
                            if(throwable1 != null) {
                                configuration1 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(configuration1);
                    }
                };
                initializeStateCreate$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateCreate$doWork$20, initializeStateCreate$doWork$10);
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
        return "native_create_web_view_task_unknown_time";
    }
}

