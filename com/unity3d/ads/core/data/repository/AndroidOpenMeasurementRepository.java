package com.unity3d.ads.core.data.repository;

import A3.o;
import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.a;
import com.iab.omid.library.unity3d.adsession.b;
import com.iab.omid.library.unity3d.adsession.c;
import com.iab.omid.library.unity3d.adsession.f;
import com.iab.omid.library.unity3d.adsession.j;
import com.iab.omid.library.unity3d.adsession.m;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult.Failure;
import com.unity3d.ads.core.data.model.OMResult.Success;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.i;
import y4.l;

@s0({"SMAP\nAndroidOpenMeasurementRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOpenMeasurementRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,168:1\n230#2,5:169\n230#2,5:174\n230#2,5:179\n230#2,5:184\n*S KotlinDebug\n*F\n+ 1 AndroidOpenMeasurementRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository\n*L\n39#1:169,5\n145#1:174,5\n149#1:179,5\n154#1:184,5\n*E\n"})
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    @l
    private final E _isOMActive;
    @l
    private final E activeSessions;
    @l
    private final E finishedSessions;
    @l
    private final K mainDispatcher;
    @l
    private final OmidManager omidManager;
    private final m partner;

    public AndroidOpenMeasurementRepository(@l K k0, @l OmidManager omidManager0) {
        L.p(k0, "mainDispatcher");
        L.p(omidManager0, "omidManager");
        super();
        this.mainDispatcher = k0;
        this.omidManager = omidManager0;
        this.partner = m.a("Unity3d", "4.14.1");
        this.activeSessions = W.a(Y.z());
        this.finishedSessions = W.a(k0.k());
        this._isOMActive = W.a(Boolean.FALSE);
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @y4.m
    public Object activateOM(@l Context context0, @l d d0) {
        com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.activateOM.2 androidOpenMeasurementRepository$activateOM$20 = new o(context0, null) {
            final Context $context;
            int label;

            {
                AndroidOpenMeasurementRepository.this = androidOpenMeasurementRepository0;
                this.$context = context0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.activateOM.2(AndroidOpenMeasurementRepository.this, this.$context, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.activateOM.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label == 0) {
                    f0.n(object0);
                    if(AndroidOpenMeasurementRepository.this.isOMActive()) {
                        return new Failure("om_already_active", null, 2, null);
                    }
                    try {
                        AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                        boolean z = AndroidOpenMeasurementRepository.this.omidManager.isActive();
                        AndroidOpenMeasurementRepository.this.setOMActive(z);
                        return AndroidOpenMeasurementRepository.this.isOMActive() ? Success.INSTANCE : new Failure("om_activate_failure_time", null, 2, null);
                    }
                    catch(Throwable throwable0) {
                        return new Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(throwable0, 0, 1, null));
                    }
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        };
        return i.h(this.mainDispatcher, androidOpenMeasurementRepository$activateOM$20, d0);
    }

    private final void addSession(ByteString byteString0, b b0) {
        E e0 = this.activeSessions;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, Y.o0(((Map)object0), r0.a(byteString0.toStringUtf8(), b0))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), "Unity3d", "1");
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @y4.m
    public Object finishSession(@l ByteString byteString0, @l d d0) {
        com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.finishSession.2 androidOpenMeasurementRepository$finishSession$20 = new o(byteString0, null) {
            final ByteString $opportunityId;
            int label;

            {
                AndroidOpenMeasurementRepository.this = androidOpenMeasurementRepository0;
                this.$opportunityId = byteString0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.finishSession.2(AndroidOpenMeasurementRepository.this, this.$opportunityId, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.finishSession.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(!AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new Failure("om_not_active", null, 2, null);
                }
                b b0 = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
                if(b0 == null) {
                    return new Failure("om_session_not_found", null, 2, null);
                }
                b0.d();
                AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
                return Success.INSTANCE;
            }
        };
        return i.h(this.mainDispatcher, androidOpenMeasurementRepository$finishSession$20, d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @l
    public OMData getOmData() {
        return this.buildOmData();
    }

    private final b getSession(ByteString byteString0) {
        return (b)((Map)this.activeSessions.getValue()).get(byteString0.toStringUtf8());
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(@l ByteString byteString0) {
        L.p(byteString0, "opportunityId");
        return ((Set)this.finishedSessions.getValue()).contains(byteString0.toStringUtf8());
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @y4.m
    public Object impressionOccurred(@l ByteString byteString0, boolean z, @l d d0) {
        com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.impressionOccurred.2 androidOpenMeasurementRepository$impressionOccurred$20 = new o(byteString0, z, null) {
            final ByteString $opportunityId;
            final boolean $signalLoaded;
            int label;

            {
                AndroidOpenMeasurementRepository.this = androidOpenMeasurementRepository0;
                this.$opportunityId = byteString0;
                this.$signalLoaded = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.impressionOccurred.2(AndroidOpenMeasurementRepository.this, this.$opportunityId, this.$signalLoaded, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.impressionOccurred.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                b b0 = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
                if(b0 == null) {
                    return new Failure("om_session_not_found", null, 2, null);
                }
                a a0 = AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(b0);
                if(this.$signalLoaded) {
                    a0.c();
                }
                a0.b();
                return Success.INSTANCE;
            }
        };
        return i.h(this.mainDispatcher, androidOpenMeasurementRepository$impressionOccurred$20, d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean)this._isOMActive.getValue()).booleanValue();
    }

    private final void removeSession(ByteString byteString0) {
        E e0 = this.activeSessions;
        do {
            Object object0 = e0.getValue();
            String s = byteString0.toStringUtf8();
            L.o(s, "opportunityId.toStringUtf8()");
        }
        while(!e0.compareAndSet(object0, Y.a0(((Map)object0), s)));
    }

    private final void sessionFinished(ByteString byteString0) {
        E e0 = this.finishedSessions;
        do {
            Object object0 = e0.getValue();
            String s = byteString0.toStringUtf8();
            L.o(s, "opportunityId.toStringUtf8()");
        }
        while(!e0.compareAndSet(object0, k0.D(((Set)object0), s)));
        this.removeSession(byteString0);
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        E e0 = this._isOMActive;
        do {
            Object object0 = e0.getValue();
            ((Boolean)object0).booleanValue();
        }
        while(!e0.compareAndSet(object0, Boolean.valueOf(z)));
    }

    @Override  // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    @y4.m
    public Object startSession(@l ByteString byteString0, @y4.m WebView webView0, @l OmidOptions omidOptions0, @l d d0) {
        com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.startSession.2 androidOpenMeasurementRepository$startSession$20 = new o(byteString0, omidOptions0, webView0, null) {
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[f.values().length];
                    try {
                        arr_v[f.c.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[f.e.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            final ByteString $opportunityId;
            final OmidOptions $options;
            final WebView $webView;
            int label;

            {
                AndroidOpenMeasurementRepository.this = androidOpenMeasurementRepository0;
                this.$opportunityId = byteString0;
                this.$options = omidOptions0;
                this.$webView = webView0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.startSession.2(AndroidOpenMeasurementRepository.this, this.$opportunityId, this.$options, this.$webView, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.startSession.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                com.iab.omid.library.unity3d.adsession.d d0;
                if(this.label == 0) {
                    f0.n(object0);
                    try {
                        if(!AndroidOpenMeasurementRepository.this.isOMActive()) {
                            return new Failure("om_not_active", null, 2, null);
                        }
                        if(((Map)AndroidOpenMeasurementRepository.this.activeSessions.getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                            return new Failure("om_session_already_exists", null, 2, null);
                        }
                        f f0 = this.$options.getCreativeType();
                        if(f0 == null) {
                            return new Failure("om_creative_type_null", null, 2, null);
                        }
                        OmidManager omidManager0 = AndroidOpenMeasurementRepository.this.omidManager;
                        j j0 = this.$options.getImpressionType();
                        if(j0 == null) {
                            j0 = j.b;
                        }
                        com.iab.omid.library.unity3d.adsession.l l0 = this.$options.getImpressionOwner();
                        if(l0 == null) {
                            l0 = com.iab.omid.library.unity3d.adsession.l.c;
                        }
                        com.iab.omid.library.unity3d.adsession.l l1 = this.$options.getVideoEventsOwner();
                        if(l1 == null) {
                            l1 = com.iab.omid.library.unity3d.adsession.l.c;
                        }
                        c c0 = omidManager0.createAdSessionConfiguration(f0, j0, l0, l1, this.$options.getIsolateVerificationScripts());
                        switch(f0) {
                            case 1: {
                                d0 = AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                                break;
                            }
                            case 2: {
                                d0 = AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                                break;
                            }
                            default: {
                                return new Failure("om_creative_type_invalid", null, 2, null);
                            }
                        }
                        b b0 = AndroidOpenMeasurementRepository.this.omidManager.createAdSession(c0, d0);
                        b0.g(this.$webView);
                        b0.k();
                        AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, b0);
                        return Success.INSTANCE;
                    }
                    catch(Throwable throwable0) {
                        return new Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(throwable0, 0, 1, null));
                    }
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        };
        return i.h(this.mainDispatcher, androidOpenMeasurementRepository$startSession$20, d0);
    }
}

