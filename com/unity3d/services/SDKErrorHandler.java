package com.unity3d.services;

import A3.o;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.CoroutineExceptionHandler.a;
import kotlinx.coroutines.CoroutineExceptionHandler.b;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class SDKErrorHandler implements CoroutineExceptionHandler {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String UNITY_PACKAGE = "com.unity3d";
    @l
    public static final String UNKNOWN_FILE = "unknown";
    @l
    private final AlternativeFlowReader alternativeFlowReader;
    @l
    private final K ioDispatcher;
    @l
    private final b key;
    @l
    private final O scope;
    @l
    private final SDKMetricsSender sdkMetricsSender;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    static {
        SDKErrorHandler.Companion = new Companion(null);
    }

    public SDKErrorHandler(@l K k0, @l AlternativeFlowReader alternativeFlowReader0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l SDKMetricsSender sDKMetricsSender0) {
        L.p(k0, "ioDispatcher");
        L.p(alternativeFlowReader0, "alternativeFlowReader");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(sDKMetricsSender0, "sdkMetricsSender");
        super();
        this.ioDispatcher = k0;
        this.alternativeFlowReader = alternativeFlowReader0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.sdkMetricsSender = sDKMetricsSender0;
        this.scope = P.m(P.a(k0), new N("SDKErrorHandler"));
        this.key = CoroutineExceptionHandler.A8;
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return a.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public kotlin.coroutines.g.b get(@l c g$c0) {
        return a.b(this, g$c0);
    }

    @Override  // kotlin.coroutines.g$b
    public c getKey() {
        return this.getKey();
    }

    @l
    public b getKey() {
        return this.key;
    }

    @Override  // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@l g g0, @l Throwable throwable0) {
        String s1;
        L.p(g0, "context");
        L.p(throwable0, "exception");
        String s = this.retrieveCoroutineName(g0);
        if(throwable0 instanceof NullPointerException) {
            s1 = "native_exception_npe";
        }
        else if(throwable0 instanceof OutOfMemoryError) {
            s1 = "native_exception_oom";
        }
        else if(throwable0 instanceof IllegalStateException) {
            s1 = "native_exception_ise";
        }
        else if(throwable0 instanceof SecurityException) {
            s1 = "native_exception_se";
        }
        else {
            s1 = throwable0 instanceof RuntimeException ? "native_exception_re" : "native_exception";
        }
        boolean z = this.alternativeFlowReader.invoke();
        String s2 = ExceptionExtensionsKt.retrieveUnityCrashValue(throwable0);
        DeviceLog.error(("Unity Ads SDK encountered an exception: " + s2));
        if(z) {
            this.sendDiagnostic(s1, s2, s, ExceptionExtensionsKt.getShortenedStackTrace(throwable0, 15));
            return;
        }
        this.sendMetric(new Metric(s1, s2, null, 4, null));
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return a.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return a.d(this, g0);
    }

    private final String retrieveCoroutineName(g g0) {
        N n0 = (N)g0.get(N.b);
        if(n0 != null) {
            String s = n0.j1();
            return s == null ? "unknown" : s;
        }
        return "unknown";
    }

    private final void sendDiagnostic(String s, String s1, String s2, String s3) {
        com.unity3d.services.SDKErrorHandler.sendDiagnostic.1 sDKErrorHandler$sendDiagnostic$10 = new o(s, s1, s3, s2, null) {
            final String $name;
            final String $reason;
            final String $scopeName;
            final String $stackTrace;
            int label;

            {
                SDKErrorHandler.this = sDKErrorHandler0;
                this.$name = s;
                this.$reason = s1;
                this.$stackTrace = s2;
                this.$scopeName = s3;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.SDKErrorHandler.sendDiagnostic.1(SDKErrorHandler.this, this.$name, this.$reason, this.$stackTrace, this.$scopeName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.SDKErrorHandler.sendDiagnostic.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Map map0 = Y.W(new V[]{r0.a("reason", this.$reason), r0.a("reason_debug", this.$stackTrace), r0.a("coroutine_name", this.$scopeName)});
                DefaultImpls.invoke$default(SDKErrorHandler.this.sendDiagnosticEvent, this.$name, null, map0, null, null, 26, null);
                return S0.a;
            }
        };
        k.f(this.scope, null, null, sDKErrorHandler$sendDiagnostic$10, 3, null);
    }

    private final void sendMetric(Metric metric0) {
        this.sdkMetricsSender.sendMetric(metric0);
    }
}

