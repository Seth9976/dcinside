package com.unity3d.ads.core.data.repository;

import A3.a;
import A3.o;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent;
import gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration;
import j..util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.p;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidDiagnosticEventRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDiagnosticEventRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,95:1\n230#2,5:96\n230#2,5:101\n214#2,5:106\n230#2,5:111\n*S KotlinDebug\n*F\n+ 1 AndroidDiagnosticEventRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository\n*L\n45#1:96,5\n48#1:101,5\n57#1:106,5\n74#1:111,5\n*E\n"})
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    @l
    private final D _diagnosticEvents;
    private final Set allowedEvents;
    @l
    private final E batch;
    private final Set blockedEvents;
    @l
    private final E configured;
    @l
    private final O coroutineScope;
    @l
    private final I diagnosticEvents;
    @l
    private final E enabled;
    @l
    private final CoroutineTimer flushTimer;
    @l
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(@l CoroutineTimer coroutineTimer0, @l GetDiagnosticEventRequest getDiagnosticEventRequest0, @l K k0) {
        L.p(coroutineTimer0, "flushTimer");
        L.p(getDiagnosticEventRequest0, "getDiagnosticEventRequest");
        L.p(k0, "dispatcher");
        super();
        this.flushTimer = coroutineTimer0;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest0;
        this.coroutineScope = P.m(P.a(k0), new N("DiagnosticEventRepository"));
        this.batch = W.a(u.H());
        this.maxBatchSize = 0x7FFFFFFF;
        this.allowedEvents = DesugarCollections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = DesugarCollections.synchronizedSet(new LinkedHashSet());
        this.enabled = W.a(Boolean.FALSE);
        this.configured = W.a(Boolean.FALSE);
        D d0 = kotlinx.coroutines.flow.K.b(100, 0, null, 6, null);
        this._diagnosticEvents = d0;
        this.diagnosticEvents = k.l(d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(@l DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
        L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "diagnosticEvent");
        if(!((Boolean)this.configured.getValue()).booleanValue()) {
            E e0 = this.batch;
            do {
                Object object0 = e0.getValue();
            }
            while(!e0.compareAndSet(object0, u.E4(((List)object0), diagnosticEventRequestOuterClass$DiagnosticEvent0)));
            return;
        }
        if(!((Boolean)this.enabled.getValue()).booleanValue()) {
            return;
        }
        E e1 = this.batch;
        do {
            Object object1 = e1.getValue();
        }
        while(!e1.compareAndSet(object1, u.E4(((List)object1), diagnosticEventRequestOuterClass$DiagnosticEvent0)));
        if(((List)this.batch.getValue()).size() >= this.maxBatchSize) {
            this.flush();
        }
    }

    @Override  // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        E e0 = this.batch;
        do {
            Object object0 = e0.getValue();
            List list0 = (List)object0;
        }
        while(!e0.compareAndSet(object0, u.H()));
    }

    @Override  // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(@l DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
        L.p(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getEnabled()));
        if(!((Boolean)this.enabled.getValue()).booleanValue()) {
            this.clear();
            return;
        }
        this.maxBatchSize = nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getMaxBatchSize();
        List list0 = nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getAllowedEventsList();
        L.o(list0, "diagnosticsEventsConfiguration.allowedEventsList");
        this.allowedEvents.addAll(list0);
        List list1 = nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getBlockedEventsList();
        L.o(list1, "diagnosticsEventsConfiguration.blockedEventsList");
        this.blockedEvents.addAll(list1);
        com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure.1 androidDiagnosticEventRepository$configure$10 = new a() {
            {
                AndroidDiagnosticEventRepository.this = androidDiagnosticEventRepository0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                AndroidDiagnosticEventRepository.this.flush();
            }
        };
        this.flushTimer.start(0L, ((long)nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getMaxBatchIntervalMs()), androidDiagnosticEventRepository$configure$10);
    }

    @Override  // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        Object object0;
        if(!((Boolean)this.enabled.getValue()).booleanValue()) {
            return;
        }
        E e0 = this.batch;
        do {
            object0 = e0.getValue();
            List list0 = (List)object0;
        }
        while(!e0.compareAndSet(object0, u.H()));
        List list1 = p.c3(p.p0(p.p0(p.k1(u.A1(((Iterable)object0)), new Function1() {
            {
                AndroidDiagnosticEventRepository.this = androidDiagnosticEventRepository0;
                super(1);
            }

            @l
            public final DiagnosticEvent invoke(@m DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
                return diagnosticEventRequestOuterClass$DiagnosticEvent0 == null ? AndroidDiagnosticEventRepository.this.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null) : diagnosticEventRequestOuterClass$DiagnosticEvent0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DiagnosticEvent)object0));
            }
        }), new Function1() {
            {
                AndroidDiagnosticEventRepository.this = androidDiagnosticEventRepository0;
                super(1);
            }

            @l
            public final Boolean invoke(@l DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
                L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "it");
                return AndroidDiagnosticEventRepository.this.allowedEvents.isEmpty() || AndroidDiagnosticEventRepository.this.allowedEvents.contains(diagnosticEventRequestOuterClass$DiagnosticEvent0.getEventType());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DiagnosticEvent)object0));
            }
        }), new Function1() {
            {
                AndroidDiagnosticEventRepository.this = androidDiagnosticEventRepository0;
                super(1);
            }

            @l
            public final Boolean invoke(@l DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
                L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "it");
                return Boolean.valueOf(!AndroidDiagnosticEventRepository.this.blockedEvents.contains(diagnosticEventRequestOuterClass$DiagnosticEvent0.getEventType()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DiagnosticEvent)object0));
            }
        }));
        if(!list1.isEmpty()) {
            DeviceLog.debug(("Unity Ads Sending diagnostic batch enabled: " + ((Boolean)this.enabled.getValue()).booleanValue() + " size: " + list1.size() + " :: " + list1));
            com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush.1 androidDiagnosticEventRepository$flush$10 = new o(list1, null) {
                final List $events;
                int label;

                {
                    AndroidDiagnosticEventRepository.this = androidDiagnosticEventRepository0;
                    this.$events = list0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush.1(AndroidDiagnosticEventRepository.this, this.$events, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.flush.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            this.label = 1;
                            return AndroidDiagnosticEventRepository.this._diagnosticEvents.emit(this.$events, this) == object1 ? object1 : S0.a;
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
            kotlinx.coroutines.k.f(this.coroutineScope, null, null, androidDiagnosticEventRepository$flush$10, 3, null);
        }
    }

    @Override  // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    @l
    public I getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}

