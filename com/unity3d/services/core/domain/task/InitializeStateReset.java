package com.unity3d.services.core.domain.task;

import A3.o;
import android.app.Application;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.WebView;
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
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

public class InitializeStateReset extends MetricTask {
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

        public static Params copy$default(Params initializeStateReset$Params0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateReset$Params0.config;
            }
            return initializeStateReset$Params0.copy(configuration0);
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

    public InitializeStateReset(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateReset$Params0, @l d d0) {
        return InitializeStateReset.doWork-gIAlu-s$suspendImpl(this, initializeStateReset$Params0, d0);
    }

    static Object doWork-gIAlu-s$suspendImpl(InitializeStateReset initializeStateReset0, Params initializeStateReset$Params0, d d0) {
        com.unity3d.services.core.domain.task.InitializeStateReset.doWork.1 initializeStateReset$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateReset.doWork.1) {
            initializeStateReset$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateReset.doWork.1)d0;
            int v = initializeStateReset$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateReset$doWork$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        Object object1 = InitializeStateReset.doWork-gIAlu-s$suspendImpl(initializeStateReset0, null, this);
                        return object1 == b.l() ? object1 : e0.a(object1);
                    }
                };
            }
            else {
                initializeStateReset$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateReset$doWork$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    Object object1 = InitializeStateReset.doWork-gIAlu-s$suspendImpl(initializeStateReset0, null, this);
                    return object1 == b.l() ? object1 : e0.a(object1);
                }
            };
        }
        Object object0 = initializeStateReset$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateReset$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = initializeStateReset0.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2 initializeStateReset$doWork$20 = new o(initializeStateReset$Params0, initializeStateReset0, null) {
                    final Params $params;
                    Object L$0;
                    Object L$1;
                    int label;

                    {
                        this.$params = initializeStateReset$Params0;
                        InitializeStateReset.this = initializeStateReset0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2(this.$params, InitializeStateReset.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Configuration configuration0;
                        InitializeStateReset initializeStateReset1;
                        InitializeStateReset initializeStateReset0;
                        Params initializeStateReset$Params0;
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                initializeStateReset$Params0 = this.$params;
                                initializeStateReset0 = InitializeStateReset.this;
                                try {
                                    DeviceLog.debug("Unity Ads init: starting init");
                                    WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
                                    if(webViewApp0 != null) {
                                        webViewApp0.resetWebViewAppInitialization();
                                    }
                                    if((webViewApp0 == null ? null : webViewApp0.getWebView()) != null) {
                                        long v = initializeStateReset$Params0.getConfig().getWebViewAppCreateTimeout();
                                        com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2.1.success.1 initializeStateReset$doWork$2$1$success$10 = new o(webViewApp0, null) {
                                            final WebViewApp $currentApp;
                                            int label;

                                            {
                                                InitializeStateReset.this = initializeStateReset0;
                                                this.$currentApp = webViewApp0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2.1.success.1(InitializeStateReset.this, this.$currentApp, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2.1.success.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                Object object1 = b.l();
                                                switch(this.label) {
                                                    case 0: {
                                                        f0.n(object0);
                                                        K k0 = InitializeStateReset.this.dispatchers.getMain();
                                                        com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2.1.success.1.1 initializeStateReset$doWork$2$1$success$1$10 = new o(null) {
                                                            final WebViewApp $currentApp;
                                                            int label;

                                                            {
                                                                this.$currentApp = webViewApp0;
                                                                super(2, d0);
                                                            }

                                                            @Override  // kotlin.coroutines.jvm.internal.a
                                                            @l
                                                            public final d create(@m Object object0, @l d d0) {
                                                                return new com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2.1.success.1.1(this.$currentApp, d0);
                                                            }

                                                            @Override  // A3.o
                                                            public Object invoke(Object object0, Object object1) {
                                                                return this.invoke(((O)object0), ((d)object1));
                                                            }

                                                            @m
                                                            public final Object invoke(@l O o0, @m d d0) {
                                                                return ((com.unity3d.services.core.domain.task.InitializeStateReset.doWork.2.1.success.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                            }

                                                            @Override  // kotlin.coroutines.jvm.internal.a
                                                            @m
                                                            public final Object invokeSuspend(@l Object object0) {
                                                                if(this.label != 0) {
                                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                }
                                                                f0.n(object0);
                                                                WebView webView0 = this.$currentApp.getWebView();
                                                                if(webView0 != null) {
                                                                    webView0.destroy();
                                                                }
                                                                this.$currentApp.setWebView(null);
                                                                return S0.a;
                                                            }
                                                        };
                                                        this.label = 1;
                                                        return i.h(k0, initializeStateReset$doWork$2$1$success$1$10, this) == object1 ? object1 : S0.a;
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
                                        this.L$0 = initializeStateReset$Params0;
                                        this.L$1 = initializeStateReset0;
                                        this.label = 1;
                                        Object object2 = u1.e(v, initializeStateReset$doWork$2$1$success$10, this);
                                        if(object2 == object1) {
                                            return object1;
                                        }
                                        initializeStateReset1 = initializeStateReset0;
                                        object0 = object2;
                                        goto label_25;
                                    }
                                    goto label_28;
                                }
                                catch(CancellationException cancellationException0) {
                                    break;
                                }
                                catch(Throwable throwable0) {
                                    goto label_51;
                                }
                            }
                            case 1: {
                                initializeStateReset1 = (InitializeStateReset)this.L$1;
                                initializeStateReset$Params0 = (Params)this.L$0;
                                try {
                                    f0.n(object0);
                                label_25:
                                    if(((S0)object0) == null) {
                                        throw new Exception("Reset failed on opening ConditionVariable");
                                    }
                                    initializeStateReset0 = initializeStateReset1;
                                label_28:
                                    initializeStateReset0.unregisterLifecycleCallbacks();
                                    SdkProperties.setCacheDirectory(null);
                                    SdkProperties.setWebViewCacheDirectory(null);
                                    if(SdkProperties.getCacheDirectory() == null) {
                                        throw new Exception("Cache directory is NULL");
                                    }
                                    if(SdkProperties.getWebViewCacheDirectory() == null) {
                                        throw new Exception("WebView cache directory is NULL");
                                    }
                                    SdkProperties.setInitialized(false);
                                    Class[] arr_class = initializeStateReset$Params0.getConfig().getModuleConfigurationList();
                                    if(arr_class == null) {
                                        arr_class = new Class[0];
                                    }
                                    for(int v1 = 0; v1 < arr_class.length; ++v1) {
                                        IModuleConfiguration iModuleConfiguration0 = initializeStateReset$Params0.getConfig().getModuleConfiguration(arr_class[v1]);
                                        if(iModuleConfiguration0 != null) {
                                            iModuleConfiguration0.resetState(initializeStateReset$Params0.getConfig());
                                        }
                                    }
                                    configuration0 = initializeStateReset$Params0.getConfig();
                                    goto label_52;
                                }
                                catch(CancellationException cancellationException0) {
                                    break;
                                }
                                catch(Throwable throwable0) {
                                    goto label_51;
                                }
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        throw cancellationException0;
                    label_51:
                        configuration0 = e0.b(f0.a(throwable0));
                    label_52:
                        if(!e0.j(configuration0)) {
                            Throwable throwable1 = e0.e(configuration0);
                            if(throwable1 != null) {
                                configuration0 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(configuration0);
                    }
                };
                initializeStateReset$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateReset$doWork$20, initializeStateReset$doWork$10);
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
        return "native_reset_task_unknown_time";
    }

    private final void unregisterLifecycleCallbacks() {
        if(Lifecycle.getLifecycleListener() != null) {
            Application application0 = ClientProperties.getApplication();
            if(application0 != null) {
                application0.unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
            }
            Lifecycle.setLifecycleListener(null);
        }
    }
}

