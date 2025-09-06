package com.unity3d.ads.core.domain.events;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class EventObservers {
    @l
    private final DiagnosticEventObserver diagnosticEventObserver;
    @l
    private final OperativeEventObserver operativeEventObserver;
    @l
    private final TransactionEventObserver transactionEventObserver;

    public EventObservers(@l OperativeEventObserver operativeEventObserver0, @l DiagnosticEventObserver diagnosticEventObserver0, @l TransactionEventObserver transactionEventObserver0) {
        L.p(operativeEventObserver0, "operativeEventObserver");
        L.p(diagnosticEventObserver0, "diagnosticEventObserver");
        L.p(transactionEventObserver0, "transactionEventObserver");
        super();
        this.operativeEventObserver = operativeEventObserver0;
        this.diagnosticEventObserver = diagnosticEventObserver0;
        this.transactionEventObserver = transactionEventObserver0;
    }

    @l
    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    @l
    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    @l
    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    @m
    public final Object invoke(@l d d0) {
        EventObservers eventObservers0;
        com.unity3d.ads.core.domain.events.EventObservers.invoke.1 eventObservers$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.events.EventObservers.invoke.1) {
            eventObservers$invoke$10 = (com.unity3d.ads.core.domain.events.EventObservers.invoke.1)d0;
            int v = eventObservers$invoke$10.label;
            if((v & 0x80000000) == 0) {
                eventObservers$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                eventObservers$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            eventObservers$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = eventObservers$invoke$10.result;
        Object object1 = b.l();
        switch(eventObservers$invoke$10.label) {
            case 0: {
                f0.n(object0);
                eventObservers$invoke$10.L$0 = this;
                eventObservers$invoke$10.label = 1;
                if(this.operativeEventObserver.invoke(eventObservers$invoke$10) == object1) {
                    return object1;
                }
                eventObservers0 = this;
                goto label_24;
            }
            case 1: {
                eventObservers0 = (EventObservers)eventObservers$invoke$10.L$0;
                f0.n(object0);
            label_24:
                eventObservers$invoke$10.L$0 = eventObservers0;
                eventObservers$invoke$10.label = 2;
                if(eventObservers0.diagnosticEventObserver.invoke(eventObservers$invoke$10) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                eventObservers0 = (EventObservers)eventObservers$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            case 3: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        eventObservers$invoke$10.L$0 = null;
        eventObservers$invoke$10.label = 3;
        return eventObservers0.transactionEventObserver.invoke(eventObservers$invoke$10) == object1 ? object1 : S0.a;
    }
}

