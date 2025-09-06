package com.unity3d.ads.core.domain.work;

import A3.o;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import y4.l;
import y4.m;

@s0({"SMAP\nDownloadPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadPriorityQueue.kt\ncom/unity3d/ads/core/domain/work/DownloadPriorityQueue\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,41:1\n107#2,10:42\n107#2,10:52\n*S KotlinDebug\n*F\n+ 1 DownloadPriorityQueue.kt\ncom/unity3d/ads/core/domain/work/DownloadPriorityQueue\n*L\n22#1:42,10\n34#1:52,10\n*E\n"})
public final class DownloadPriorityQueue {
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int v) {
            this.priority = v;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    @l
    private final a mutex;
    @l
    private final E nextTurn;
    @l
    private final PriorityQueue queue;

    public DownloadPriorityQueue() {
        this.mutex = c.a(false);
        this.nextTurn = W.a(null);
        this.queue = new PriorityQueue(50, new com.unity3d.ads.core.domain.work.DownloadPriorityQueue.special..inlined.compareBy.1());

        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DownloadPriorityQueue.kt\ncom/unity3d/ads/core/domain/work/DownloadPriorityQueue\n*L\n1#1,328:1\n12#2:329\n*E\n"})
        public final class com.unity3d.ads.core.domain.work.DownloadPriorityQueue.special..inlined.compareBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((PriorityItem)object0).getPriority(), ((PriorityItem)object1).getPriority());
            }
        }

    }

    @m
    public final Object invoke(int v, @l Function1 function10, @l d d0) {
        DownloadPriorityQueue downloadPriorityQueue0;
        PriorityItem downloadPriorityQueue$PriorityItem0;
        a a0;
        DownloadPriorityQueue downloadPriorityQueue2;
        PriorityItem downloadPriorityQueue$PriorityItem1;
        Function1 function11;
        a a2;
        DownloadPriorityQueue downloadPriorityQueue3;
        Function1 function12;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke.1 downloadPriorityQueue$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke.1) {
            downloadPriorityQueue$invoke$10 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke.1)d0;
            int v1 = downloadPriorityQueue$invoke$10.label;
            if((v1 & 0x80000000) == 0) {
                downloadPriorityQueue$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(0, null, this);
                    }
                };
            }
            else {
                downloadPriorityQueue$invoke$10.label = v1 ^ 0x80000000;
            }
        }
        else {
            downloadPriorityQueue$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(0, null, this);
                }
            };
        }
        Object object0 = downloadPriorityQueue$invoke$10.result;
        Object object1 = b.l();
        switch(downloadPriorityQueue$invoke$10.label) {
            case 0: {
                f0.n(object0);
                PriorityItem downloadPriorityQueue$PriorityItem3 = new PriorityItem(v);
                a a3 = this.mutex;
                downloadPriorityQueue$invoke$10.L$0 = this;
                downloadPriorityQueue$invoke$10.L$1 = function10;
                downloadPriorityQueue$invoke$10.L$2 = downloadPriorityQueue$PriorityItem3;
                downloadPriorityQueue$invoke$10.L$3 = a3;
                downloadPriorityQueue$invoke$10.label = 1;
                if(a3.h(null, downloadPriorityQueue$invoke$10) == object1) {
                    return object1;
                }
                downloadPriorityQueue3 = this;
                function12 = function10;
                a2 = a3;
                downloadPriorityQueue$PriorityItem1 = downloadPriorityQueue$PriorityItem3;
                break;
            }
            case 1: {
                a a1 = (a)downloadPriorityQueue$invoke$10.L$3;
                PriorityItem downloadPriorityQueue$PriorityItem2 = (PriorityItem)downloadPriorityQueue$invoke$10.L$2;
                function12 = (Function1)downloadPriorityQueue$invoke$10.L$1;
                downloadPriorityQueue3 = (DownloadPriorityQueue)downloadPriorityQueue$invoke$10.L$0;
                f0.n(object0);
                a2 = a1;
                downloadPriorityQueue$PriorityItem1 = downloadPriorityQueue$PriorityItem2;
                break;
            }
            case 2: {
                downloadPriorityQueue$PriorityItem1 = (PriorityItem)downloadPriorityQueue$invoke$10.L$2;
                function11 = (Function1)downloadPriorityQueue$invoke$10.L$1;
                downloadPriorityQueue2 = (DownloadPriorityQueue)downloadPriorityQueue$invoke$10.L$0;
                f0.n(object0);
                goto label_67;
            }
            case 3: {
                downloadPriorityQueue$PriorityItem1 = (PriorityItem)downloadPriorityQueue$invoke$10.L$1;
                DownloadPriorityQueue downloadPriorityQueue1 = (DownloadPriorityQueue)downloadPriorityQueue$invoke$10.L$0;
                f0.n(object0);
                downloadPriorityQueue2 = downloadPriorityQueue1;
                goto label_73;
            }
            case 4: {
                a0 = (a)downloadPriorityQueue$invoke$10.L$2;
                downloadPriorityQueue$PriorityItem0 = (PriorityItem)downloadPriorityQueue$invoke$10.L$1;
                downloadPriorityQueue0 = (DownloadPriorityQueue)downloadPriorityQueue$invoke$10.L$0;
                f0.n(object0);
                goto label_82;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            downloadPriorityQueue3.queue.offer(downloadPriorityQueue$PriorityItem1);
            Object object2 = downloadPriorityQueue3.queue.peek();
            downloadPriorityQueue3.nextTurn.setValue(object2);
        }
        finally {
            a2.i(null);
        }
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke.3 downloadPriorityQueue$invoke$30 = new o(null) {
            final PriorityItem $priorityItem;
            Object L$0;
            int label;

            {
                this.$priorityItem = downloadPriorityQueue$PriorityItem0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke.3(this.$priorityItem, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@m PriorityItem downloadPriorityQueue$PriorityItem0, @m d d0) {
                return ((com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke.3)this.create(downloadPriorityQueue$PriorityItem0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((PriorityItem)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return ((PriorityItem)this.L$0) == this.$priorityItem ? kotlin.coroutines.jvm.internal.b.a(true) : kotlin.coroutines.jvm.internal.b.a(false);
            }
        };
        downloadPriorityQueue$invoke$10.L$0 = downloadPriorityQueue3;
        downloadPriorityQueue$invoke$10.L$1 = function12;
        downloadPriorityQueue$invoke$10.L$2 = downloadPriorityQueue$PriorityItem1;
        downloadPriorityQueue$invoke$10.L$3 = null;
        downloadPriorityQueue$invoke$10.label = 2;
        if(k.u0(downloadPriorityQueue3.nextTurn, downloadPriorityQueue$invoke$30, downloadPriorityQueue$invoke$10) == object1) {
            return object1;
        }
        function11 = function12;
        downloadPriorityQueue2 = downloadPriorityQueue3;
    label_67:
        downloadPriorityQueue$invoke$10.L$0 = downloadPriorityQueue2;
        downloadPriorityQueue$invoke$10.L$1 = downloadPriorityQueue$PriorityItem1;
        downloadPriorityQueue$invoke$10.L$2 = null;
        downloadPriorityQueue$invoke$10.label = 3;
        if(function11.invoke(downloadPriorityQueue$invoke$10) == object1) {
            return object1;
        }
    label_73:
        downloadPriorityQueue$PriorityItem0 = downloadPriorityQueue$PriorityItem1;
        a0 = downloadPriorityQueue2.mutex;
        downloadPriorityQueue$invoke$10.L$0 = downloadPriorityQueue2;
        downloadPriorityQueue$invoke$10.L$1 = downloadPriorityQueue$PriorityItem0;
        downloadPriorityQueue$invoke$10.L$2 = a0;
        downloadPriorityQueue$invoke$10.label = 4;
        if(a0.h(null, downloadPriorityQueue$invoke$10) == object1) {
            return object1;
        }
        downloadPriorityQueue0 = downloadPriorityQueue2;
    label_82:
        try {
            downloadPriorityQueue0.queue.remove(downloadPriorityQueue$PriorityItem0);
            Object object3 = downloadPriorityQueue0.queue.peek();
            downloadPriorityQueue0.nextTurn.setValue(object3);
            return S0.a;
        }
        finally {
            a0.i(null);
        }
    }
}

