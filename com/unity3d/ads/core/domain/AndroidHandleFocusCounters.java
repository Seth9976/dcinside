package com.unity3d.ads.core.domain;

import A3.o;
import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState.Focused;
import com.unity3d.ads.core.data.repository.FocusState.Unfocused;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import j..util.concurrent.ConcurrentHashMap;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.time.e;
import kotlin.time.s.b;
import kotlin.time.s.c;
import kotlinx.coroutines.K;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidHandleFocusCounters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHandleFocusCounters.kt\ncom/unity3d/ads/core/domain/AndroidHandleFocusCounters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,67:1\n1#2:68\n214#3,5:69\n*S KotlinDebug\n*F\n+ 1 AndroidHandleFocusCounters.kt\ncom/unity3d/ads/core/domain/AndroidHandleFocusCounters\n*L\n46#1:69,5\n*E\n"})
public final class AndroidHandleFocusCounters {
    @l
    private final K defaultDispatcher;
    @l
    private final FocusRepository focusRepository;
    @l
    private final ConcurrentHashMap focusTimesPerActivity;
    @l
    private final AndroidGetIsAdActivity isAdActivity;
    @m
    private volatile String latestKnownActivityResumed;
    @l
    private final E previousFocusState;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final c timeSource;

    public AndroidHandleFocusCounters(@l SessionRepository sessionRepository0, @l FocusRepository focusRepository0, @l AndroidGetIsAdActivity androidGetIsAdActivity0, @l K k0, @l c s$c0) {
        L.p(sessionRepository0, "sessionRepository");
        L.p(focusRepository0, "focusRepository");
        L.p(androidGetIsAdActivity0, "isAdActivity");
        L.p(k0, "defaultDispatcher");
        L.p(s$c0, "timeSource");
        super();
        this.sessionRepository = sessionRepository0;
        this.focusRepository = focusRepository0;
        this.isAdActivity = androidGetIsAdActivity0;
        this.defaultDispatcher = k0;
        this.timeSource = s$c0;
        this.focusTimesPerActivity = new ConcurrentHashMap();
        this.previousFocusState = W.a(null);
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository0, FocusRepository focusRepository0, AndroidGetIsAdActivity androidGetIsAdActivity0, K k0, c s$c0, int v, w w0) {
        if((v & 16) != 0) {
            s$c0 = b.b;
        }
        this(sessionRepository0, focusRepository0, androidGetIsAdActivity0, k0, s$c0);
    }

    @m
    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    @VisibleForTesting
    public static void getLatestKnownActivityResumed$annotations() {
    }

    public final void invoke() {
        k.U0(k.e1(this.focusRepository.getFocusState(), new o(null) {
            Object L$0;
            int label;

            {
                AndroidHandleFocusCounters.this = androidHandleFocusCounters0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.domain.AndroidHandleFocusCounters.invoke.1(AndroidHandleFocusCounters.this, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@l FocusState focusState0, @m d d0) {
                return ((com.unity3d.ads.core.domain.AndroidHandleFocusCounters.invoke.1)this.create(focusState0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((FocusState)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                String s;
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                FocusState focusState0 = (FocusState)this.L$0;
                AndroidHandleFocusCounters.this.onFocusStateChange(focusState0);
                Activity activity0 = (Activity)focusState0.getActivity().get();
                if(activity0 == null) {
                    s = "unknown_activity_name";
                }
                else {
                    s = m0.d(activity0.getClass()).g();
                    if(s == null) {
                        s = "unknown_activity_name";
                    }
                }
                if(!AndroidHandleFocusCounters.this.isAdActivity.invoke(s)) {
                    return S0.a;
                }
                AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
                if(focusState0 instanceof Focused) {
                    AndroidHandleFocusCounters.this.onResume(s);
                    return S0.a;
                }
                if(focusState0 instanceof Unfocused) {
                    AndroidHandleFocusCounters.this.onPause(s);
                }
                return S0.a;
            }
        }), P.a(this.defaultDispatcher));
    }

    private final void onFocusStateChange(FocusState focusState0) {
        E e0 = this.previousFocusState;
        do {
            Object object0 = e0.getValue();
            FocusState focusState1 = (FocusState)object0;
        }
        while(!e0.compareAndSet(object0, focusState0));
        if(focusState1 == null) {
            return;
        }
        if(focusState0.getClass() != focusState1.getClass()) {
            this.sessionRepository.incrementFocusChangeCount();
        }
    }

    private final void onPause(String s) {
        if(this.latestKnownActivityResumed == null || L.g(this.latestKnownActivityResumed, s)) {
            kotlin.time.d d0 = (kotlin.time.d)this.focusTimesPerActivity.remove(s);
            if(d0 == null) {
                d0 = this.timeSource.a();
            }
            L.o(d0, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            int v = (int)e.L(d0.a());
            this.sessionRepository.addTimeToGlobalAdsFocusTime(v);
        }
    }

    private final void onResume(String s) {
        this.latestKnownActivityResumed = s;
        kotlin.time.d d0 = this.timeSource.a();
        this.focusTimesPerActivity.put(s, d0);
    }

    public final void setLatestKnownActivityResumed(@m String s) {
        this.latestKnownActivityResumed = s;
    }
}

