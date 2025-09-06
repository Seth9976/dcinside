package com.unity3d.ads.adplayer;

import A3.o;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import java.util.Set;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.k0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.u1;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.json.JSONArray;
import y4.l;
import y4.m;

@s0({"SMAP\nCommonWebViewBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWebViewBridge.kt\ncom/unity3d/ads/adplayer/CommonWebViewBridge\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n13579#2,2:137\n13579#2,2:144\n230#3,5:139\n230#3,5:147\n1#4:146\n*S KotlinDebug\n*F\n+ 1 CommonWebViewBridge.kt\ncom/unity3d/ads/adplayer/CommonWebViewBridge\n*L\n42#1:137,2\n60#1:144,2\n54#1:139,5\n87#1:147,5\n*E\n"})
public final class CommonWebViewBridge implements WebViewBridge {
    @l
    private final D _onInvocation;
    @l
    private final E callbacks;
    @l
    private final I onInvocation;
    @l
    private final O scope;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final WebViewContainer webViewContainer;

    public CommonWebViewBridge(@l K k0, @l WebViewContainer webViewContainer0, @l O o0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(k0, "dispatcher");
        L.p(webViewContainer0, "webViewContainer");
        L.p(o0, "adPlayerScope");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.webViewContainer = webViewContainer0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        O o1 = P.m(P.m(o0, k0), new N("CommonWebViewBridge"));
        this.scope = o1;
        this.callbacks = W.a(k0.k());
        D d0 = kotlinx.coroutines.flow.K.b(0, 0, null, 7, null);
        this._onInvocation = d0;
        this.onInvocation = k.l(d0);
        kotlinx.coroutines.k.f(o1, null, null, new o(null) {
            int label;

            {
                CommonWebViewBridge.this = commonWebViewBridge0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.CommonWebViewBridge.1(CommonWebViewBridge.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.CommonWebViewBridge.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        return CommonWebViewBridge.this.webViewContainer.addJavascriptInterface(CommonWebViewBridge.this, "webviewbridge", this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }

    public static final Object access$execute(CommonWebViewBridge commonWebViewBridge0, HandlerType handlerType0, String s, d d0) {
        return commonWebViewBridge0.execute(handlerType0, s, d0);
    }

    private final Object execute(HandlerType handlerType0, String s, d d0) {
        Object object0 = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType0.getJsPath() + '(' + s + ");", d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.WebViewBridge
    @l
    public I getOnInvocation() {
        return this.onInvocation;
    }

    @l
    public final O getScope() {
        return this.scope;
    }

    @Override  // com.unity3d.ads.adplayer.WebViewBridge
    public void handleCallback(@l String s, @l String s1, @l String s2) {
        Object object0 = null;
        L.p(s, "callbackId");
        L.p(s1, "callbackStatus");
        L.p(s2, "rawParameters");
        Object[] arr_object = JSONArrayExtensionsKt.toTypedArray(new JSONArray(s2));
        for(Object object1: ((Iterable)this.callbacks.getValue())) {
            if(L.g(((String)((V)object1).a()), s)) {
                object0 = object1;
                break;
            }
        }
        if(((V)object0) == null) {
            return;
        }
        x x0 = (x)((V)object0).b();
        if(k0.u(new String[]{"success", "error"}).contains(s1)) {
            DefaultImpls.invoke$default(this.sendDiagnosticEvent, "old_callback_status", null, null, null, null, 30, null);
        }
        switch(s1) {
            case "ERROR": 
            case "error": {
                Object object2 = arr_object[0];
                L.n(object2, "null cannot be cast to non-null type kotlin.String");
                x0.f(new Exception(((String)object2)));
                break;
            }
            case "OK": 
            case "success": {
                x0.Q(arr_object);
            }
        }
        E e0 = this.callbacks;
        do {
            Object object3 = e0.getValue();
        }
        while(!e0.compareAndSet(object3, k0.y(((Set)object3), ((V)object0))));
    }

    @Override  // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(@l String s) {
        L.p(s, "message");
        JSONArray jSONArray0 = new JSONArray(s);
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = jSONArray0.get(v1);
            L.n(object0, "null cannot be cast to non-null type org.json.JSONArray");
            Object object1 = ((JSONArray)object0).get(0);
            L.n(object1, "null cannot be cast to non-null type kotlin.String");
            Object object2 = ((JSONArray)object0).get(1);
            L.n(object2, "null cannot be cast to non-null type kotlin.String");
            Object object3 = ((JSONArray)object0).get(2);
            L.n(object3, "null cannot be cast to non-null type org.json.JSONArray");
            Object object4 = ((JSONArray)object0).get(3);
            L.n(object4, "null cannot be cast to non-null type kotlin.String");
            DeviceLog.debug(("Unity Ads WebView calling for: " + ((String)object1) + '.' + ((String)object2) + '(' + ((JSONArray)object3) + ')'));
            com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.1 commonWebViewBridge$handleInvocation$10 = new o(((JSONArray)object3), this, ((String)object4), null) {
                final String $callback;
                final String $location;
                final JSONArray $parameters;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                {
                    this.$location = s;
                    this.$parameters = jSONArray0;
                    CommonWebViewBridge.this = commonWebViewBridge0;
                    this.$callback = s1;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.1(this.$location, this.$parameters, CommonWebViewBridge.this, this.$callback, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    String s2;
                    Object[] arr_object1;
                    CommonWebViewBridge commonWebViewBridge0;
                    String s1;
                    String s;
                    Object[] arr_object;
                    int v;
                    Invocation invocation0;
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            Object[] arr_object2 = JSONArrayExtensionsKt.toTypedArray(this.$parameters);
                            Invocation invocation1 = new Invocation(this.$location, arr_object2);
                            this.L$0 = invocation1;
                            this.label = 1;
                            if(CommonWebViewBridge.this._onInvocation.emit(invocation1, this) == object1) {
                                return object1;
                            }
                            invocation0 = invocation1;
                            try {
                            label_29:
                                com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.1.1 commonWebViewBridge$handleInvocation$1$10 = new o(null) {
                                    final Invocation $invocation;
                                    int label;

                                    {
                                        this.$invocation = invocation0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.1.1(this.$invocation, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocation.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                this.label = 1;
                                                return this.$invocation.isHandled().o(this) == object1 ? object1 : S0.a;
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
                                this.L$0 = invocation0;
                                this.label = 2;
                                if(u1.c(5000L, commonWebViewBridge$handleInvocation$1$10, this) == object1) {
                                    return object1;
                                }
                            label_34:
                                commonWebViewBridge0 = CommonWebViewBridge.this;
                                s1 = this.$callback;
                                s = "OK";
                                Object[] arr_object3 = new Object[1];
                                this.L$0 = arr_object3;
                                this.L$1 = commonWebViewBridge0;
                                this.L$2 = s1;
                                this.L$3 = "OK";
                                this.L$4 = arr_object3;
                                this.I$0 = 0;
                                this.label = 3;
                                Object object2 = invocation0.getResult(this);
                                if(object2 == object1) {
                                    return object1;
                                }
                                arr_object = arr_object3;
                                arr_object1 = arr_object;
                                object0 = object2;
                                v = 0;
                            label_52:
                                arr_object[v] = object0;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 4;
                                return commonWebViewBridge0.respond(s1, s, arr_object1, this) == object1 ? object1 : S0.a;
                            }
                            catch(Exception exception0) {
                                break;
                            }
                        }
                        case 1: {
                            invocation0 = (Invocation)this.L$0;
                            f0.n(object0);
                            goto label_29;
                        }
                        case 2: {
                            invocation0 = (Invocation)this.L$0;
                            try {
                                f0.n(object0);
                                goto label_34;
                            }
                            catch(Exception exception0) {
                                break;
                            }
                        }
                        case 3: {
                            v = this.I$0;
                            arr_object = (Object[])this.L$4;
                            s = (String)this.L$3;
                            s1 = (String)this.L$2;
                            commonWebViewBridge0 = (CommonWebViewBridge)this.L$1;
                            arr_object1 = (Object[])this.L$0;
                            try {
                                f0.n(object0);
                                goto label_52;
                            }
                            catch(Exception exception0) {
                                break;
                            }
                        }
                        case 4: {
                            try {
                                f0.n(object0);
                                return S0.a;
                            }
                            catch(Exception exception0) {
                                break;
                            }
                        }
                        case 5: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    if(exception0 instanceof s1) {
                        s2 = "Invocation(" + this.$location + ") is not handled";
                    }
                    else {
                        s2 = exception0.getMessage();
                        if(s2 == null) {
                            s2 = "Unknown error";
                        }
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                    return CommonWebViewBridge.this.respond(this.$callback, "ERROR", new Object[]{s2}, this) == object1 ? object1 : S0.a;
                }
            };
            kotlinx.coroutines.k.f(this.scope, null, null, commonWebViewBridge$handleInvocation$10, 3, null);
        }
    }

    @Override  // com.unity3d.ads.adplayer.WebViewBridge
    @m
    public Object request(@l String s, @l String s1, @l Object[] arr_object, @l d d0) {
        x x1;
        com.unity3d.ads.adplayer.CommonWebViewBridge.request.1 commonWebViewBridge$request$10;
        if(d0 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.request.1) {
            commonWebViewBridge$request$10 = (com.unity3d.ads.adplayer.CommonWebViewBridge.request.1)d0;
            int v = commonWebViewBridge$request$10.label;
            if((v & 0x80000000) == 0) {
                commonWebViewBridge$request$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.request(null, null, null, this);
                    }
                };
            }
            else {
                commonWebViewBridge$request$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonWebViewBridge$request$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.request(null, null, null, this);
                }
            };
        }
        Object object0 = commonWebViewBridge$request$10.result;
        Object object1 = b.l();
        switch(commonWebViewBridge$request$10.label) {
            case 0: {
                f0.n(object0);
                x x0 = z.c(null, 1, null);
                String s2 = String.valueOf(x0.hashCode());
                E e0 = this.callbacks;
                do {
                    Object object2 = e0.getValue();
                }
                while(!e0.compareAndSet(object2, k0.D(((Set)object2), r0.a(s2, x0))));
                JSONArray jSONArray0 = new JSONArray();
                jSONArray0.put(s);
                jSONArray0.put(s1);
                jSONArray0.put(s2);
                for(int v1 = 0; v1 < arr_object.length; ++v1) {
                    jSONArray0.put(arr_object[v1]);
                }
                String s3 = jSONArray0.toString();
                L.o(s3, "arguments.toString()");
                commonWebViewBridge$request$10.L$0 = x0;
                commonWebViewBridge$request$10.label = 1;
                if(this.execute(HandlerType.INVOCATION, s3, commonWebViewBridge$request$10) == object1) {
                    return object1;
                }
                x1 = x0;
                break;
            }
            case 1: {
                x1 = (x)commonWebViewBridge$request$10.L$0;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        commonWebViewBridge$request$10.L$0 = null;
        commonWebViewBridge$request$10.label = 2;
        object0 = x1.o(commonWebViewBridge$request$10);
        return object0 == object1 ? object1 : object0;
    }

    private final Object respond(String s, String s1, Object[] arr_object, d d0) {
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put(s);
        jSONArray0.put(s1);
        jSONArray0.put(new JSONArray(arr_object));
        Object object0 = this.execute(HandlerType.CALLBACK, '[' + jSONArray0 + ']', d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.WebViewBridge
    @m
    public Object sendEvent(@l WebViewEvent webViewEvent0, @l d d0) {
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put(webViewEvent0.getCategory());
        jSONArray0.put(webViewEvent0.getName());
        Object[] arr_object = webViewEvent0.getParameters();
        for(int v = 0; v < arr_object.length; ++v) {
            jSONArray0.put(arr_object[v]);
        }
        String s = jSONArray0.toString();
        L.o(s, "arguments.toString()");
        Object object0 = this.execute(HandlerType.EVENT, s, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

