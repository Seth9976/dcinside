package com.unity3d.services.ads.offerwall;

import A3.o;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class OfferwallAdapterBridge {
    @l
    private final D _offerwallEventFlow;
    @m
    private String currentPlacementName;
    @l
    private final I offerwallEventFlow;
    @l
    private final O scope;

    public OfferwallAdapterBridge(@l O o0) {
        L.p(o0, "scope");
        super();
        this.scope = o0;
        D d0 = K.b(0, 0, null, 7, null);
        this._offerwallEventFlow = d0;
        this.offerwallEventFlow = k.l(d0);
    }

    @l
    public final I getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    private final Object getPlacement(String s) {
        Class class0 = Class.forName("com.tapjoy.Tapjoy");
        Class class1 = Class.forName("com.tapjoy.TJPlacementListener");
        return class0.getDeclaredMethod("getPlacement", String.class, class1).invoke(null, s, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, this.tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object object0) {
        return (String)object0.getClass().getDeclaredMethod("getName", null).invoke(object0, null);
    }

    @l
    public final String getVersion() [...] // 潜在的解密器

    public final boolean isConnected() {
        try {
            Boolean boolean0 = (Boolean)Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", null).invoke(null, null);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public final boolean isContentReady() {
        String s = this.currentPlacementName;
        if(s == null) {
            return false;
        }
        Object object0 = this.getPlacement(s);
        Object object1 = null;
        Method method0 = object0 == null ? null : object0.getClass().getDeclaredMethod("isContentReady", null);
        if(method0 != null) {
            object1 = method0.invoke(object0, null);
        }
        return ((Boolean)object1) == null ? false : ((Boolean)object1).booleanValue();
    }

    public final void loadAd(@l String s) {
        L.p(s, "placementName");
        this.currentPlacementName = s;
        Object object0 = this.getPlacement(s);
        Method method0 = object0 == null ? null : object0.getClass().getDeclaredMethod("requestContent", null);
        if(method0 != null) {
            method0.invoke(object0, null);
        }
    }

    public final void showAd(@l String s) {
        L.p(s, "placementName");
        Object object0 = this.getPlacement(s);
        Method method0 = object0 == null ? null : object0.getClass().getDeclaredMethod("isContentAvailable", null);
        Object object1 = method0 == null ? null : method0.invoke(object0, null);
        if((((Boolean)object1) == null ? false : ((Boolean)object1).booleanValue())) {
            Method method1 = object0 == null ? null : object0.getClass().getDeclaredMethod("showContent", null);
            if(method1 != null) {
                method1.invoke(object0, null);
            }
        }
        else {
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.showAd.1 offerwallAdapterBridge$showAd$10 = new o(s, null) {
                final String $placementName;
                int label;

                {
                    OfferwallAdapterBridge.this = offerwallAdapterBridge0;
                    this.$placementName = s;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.showAd.1(OfferwallAdapterBridge.this, this.$placementName, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.showAd.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            OfferwallEventData offerwallEventData0 = new OfferwallEventData(OfferwallEvent.SHOW_FAILED, this.$placementName, null, null, 12, null);
                            this.label = 1;
                            return OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData0, this) == object1 ? object1 : S0.a;
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
            kotlinx.coroutines.k.f(this.scope, null, null, offerwallAdapterBridge$showAd$10, 3, null);
        }
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return (Object object0, Method method0, Object[] arr_object) -> {
            L.p(this, "this$0");
            String s = method0.getName();
            if(s != null) {
                boolean z = false;
                switch(s) {
                    case "onContentDismiss": {
                        Object object1 = arr_object[0];
                        L.o(object1, "args[0]");
                        String s1 = this.getPlacementName(object1);
                        DeviceLog.debug(("Placement content dismissed: " + s1));
                        com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.5 offerwallAdapterBridge$tapjoyPlacementListener$1$50 = new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.5(this, s1, null);
                        kotlinx.coroutines.k.f(this.scope, null, null, offerwallAdapterBridge$tapjoyPlacementListener$1$50, 3, null);
                        return null;
                    }
                    case "onContentReady": {
                        Object object6 = arr_object[0];
                        L.o(object6, "args[0]");
                        String s5 = this.getPlacementName(object6);
                        DeviceLog.debug(("Placement content ready: " + s5));
                        com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.3 offerwallAdapterBridge$tapjoyPlacementListener$1$30 = new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.3(this, s5, null);
                        kotlinx.coroutines.k.f(this.scope, null, null, offerwallAdapterBridge$tapjoyPlacementListener$1$30, 3, null);
                        break;
                    }
                    case "onContentShow": {
                        Object object2 = arr_object[0];
                        L.o(object2, "args[0]");
                        String s2 = this.getPlacementName(object2);
                        DeviceLog.debug(("Placement content shown: " + s2));
                        com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.4 offerwallAdapterBridge$tapjoyPlacementListener$1$40 = new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.4(this, s2, null);
                        kotlinx.coroutines.k.f(this.scope, null, null, offerwallAdapterBridge$tapjoyPlacementListener$1$40, 3, null);
                        return null;
                    }
                    case "onRequestFailure": {
                        Object object4 = arr_object[0];
                        L.o(object4, "args[0]");
                        String s4 = this.getPlacementName(object4);
                        Object object5 = arr_object[1];
                        DeviceLog.error(("Placement request failed: " + s4 + " - errorCode: " + ((Integer)object5.getClass().getField("code").get(object5)) + ", errorMessage: " + ((String)object5.getClass().getField("message").get(object5))));
                        com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.2 offerwallAdapterBridge$tapjoyPlacementListener$1$20 = new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.2(this, s4, null);
                        kotlinx.coroutines.k.f(this.scope, null, null, offerwallAdapterBridge$tapjoyPlacementListener$1$20, 3, null);
                        return null;
                    }
                    case "onRequestSuccess": {
                        Object object3 = arr_object[0];
                        L.o(object3, "placementObj");
                        String s3 = this.getPlacementName(object3);
                        Boolean boolean0 = (Boolean)object3.getClass().getDeclaredMethod("isContentAvailable", null).invoke(object3, null);
                        if(boolean0 != null) {
                            z = boolean0.booleanValue();
                        }
                        DeviceLog.debug(("Placement request succeeded: " + s3 + " - isContentAvailable: " + z));
                        com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.1 offerwallAdapterBridge$tapjoyPlacementListener$1$10 = new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.1(z, this, s3, null);
                        kotlinx.coroutines.k.f(this.scope, null, null, offerwallAdapterBridge$tapjoyPlacementListener$1$10, 3, null);
                        return null;
                    }
                    default: {
                        return null;
                    }
                }
            }
            return null;
        };

        @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", i = {}, l = {76, 81}, m = "invokeSuspend", n = {}, s = {})
        final class com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.1 extends kotlin.coroutines.jvm.internal.o implements o {
            final boolean $placementAvailable;
            final String $placementName;
            int label;

            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.1(boolean z, OfferwallAdapterBridge offerwallAdapterBridge0, String s, d d0) {
                this.$placementAvailable = z;
                OfferwallAdapterBridge.this = offerwallAdapterBridge0;
                this.$placementName = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.1(this.$placementAvailable, OfferwallAdapterBridge.this, this.$placementName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        if(this.$placementAvailable) {
                            OfferwallEventData offerwallEventData0 = new OfferwallEventData(OfferwallEvent.REQUEST_SUCCESS, (this.$placementName == null ? "" : this.$placementName), null, null, 12, null);
                            this.label = 1;
                            if(OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData0, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            OfferwallEventData offerwallEventData1 = new OfferwallEventData(OfferwallEvent.REQUEST_FAILED, (this.$placementName == null ? "" : this.$placementName), null, null, 12, null);
                            this.label = 2;
                            if(OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData1, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$2", f = "OfferwallAdapterBridge.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
        final class com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.2 extends kotlin.coroutines.jvm.internal.o implements o {
            final String $placementName;
            int label;

            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.2(OfferwallAdapterBridge offerwallAdapterBridge0, String s, d d0) {
                OfferwallAdapterBridge.this = offerwallAdapterBridge0;
                this.$placementName = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.2(OfferwallAdapterBridge.this, this.$placementName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        OfferwallEventData offerwallEventData0 = new OfferwallEventData(OfferwallEvent.REQUEST_FAILED, (this.$placementName == null ? "" : this.$placementName), null, null, 12, null);
                        this.label = 1;
                        return OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData0, this) == object1 ? object1 : S0.a;
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
        }


        @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$3", f = "OfferwallAdapterBridge.kt", i = {}, l = {0x6F}, m = "invokeSuspend", n = {}, s = {})
        final class com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.3 extends kotlin.coroutines.jvm.internal.o implements o {
            final String $placementName;
            int label;

            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.3(OfferwallAdapterBridge offerwallAdapterBridge0, String s, d d0) {
                OfferwallAdapterBridge.this = offerwallAdapterBridge0;
                this.$placementName = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.3(OfferwallAdapterBridge.this, this.$placementName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.3)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        OfferwallEventData offerwallEventData0 = new OfferwallEventData(OfferwallEvent.ON_CONTENT_READY, (this.$placementName == null ? "" : this.$placementName), null, null, 12, null);
                        this.label = 1;
                        return OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData0, this) == object1 ? object1 : S0.a;
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
        }


        @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$4", f = "OfferwallAdapterBridge.kt", i = {}, l = {0x7C}, m = "invokeSuspend", n = {}, s = {})
        final class com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.4 extends kotlin.coroutines.jvm.internal.o implements o {
            final String $placementName;
            int label;

            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.4(OfferwallAdapterBridge offerwallAdapterBridge0, String s, d d0) {
                OfferwallAdapterBridge.this = offerwallAdapterBridge0;
                this.$placementName = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.4(OfferwallAdapterBridge.this, this.$placementName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.4)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        OfferwallEventData offerwallEventData0 = new OfferwallEventData(OfferwallEvent.ON_CONTENT_SHOW, (this.$placementName == null ? "" : this.$placementName), null, null, 12, null);
                        this.label = 1;
                        return OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData0, this) == object1 ? object1 : S0.a;
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
        }


        @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$5", f = "OfferwallAdapterBridge.kt", i = {}, l = {0x89}, m = "invokeSuspend", n = {}, s = {})
        final class com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.5 extends kotlin.coroutines.jvm.internal.o implements o {
            final String $placementName;
            int label;

            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.5(OfferwallAdapterBridge offerwallAdapterBridge0, String s, d d0) {
                OfferwallAdapterBridge.this = offerwallAdapterBridge0;
                this.$placementName = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.5(OfferwallAdapterBridge.this, this.$placementName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener.1.5)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        OfferwallEventData offerwallEventData0 = new OfferwallEventData(OfferwallEvent.ON_CONTENT_DISMISS, (this.$placementName == null ? "" : this.$placementName), null, null, 12, null);
                        this.label = 1;
                        return OfferwallAdapterBridge.this._offerwallEventFlow.emit(offerwallEventData0, this) == object1 ? object1 : S0.a;
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
        }

    }

    // 检测为 Lambda 实现
    private static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge offerwallAdapterBridge0, Object object0, Method method0, Object[] arr_object) [...]
}

