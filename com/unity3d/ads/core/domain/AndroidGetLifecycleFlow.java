package com.unity3d.ads.core.domain;

import A3.a;
import A3.o;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetLifecycleFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetLifecycleFlow.kt\ncom/unity3d/ads/core/domain/AndroidGetLifecycleFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class AndroidGetLifecycleFlow {
    @l
    private final Context applicationContext;

    public AndroidGetLifecycleFlow(@l Context context0) {
        L.p(context0, "applicationContext");
        super();
        this.applicationContext = context0;
    }

    @l
    public final i invoke() {
        if(!(this.applicationContext instanceof Application)) {
            throw new IllegalArgumentException("Application context is required");
        }
        return k.w(new o(null) {
            private Object L$0;
            int label;

            {
                AndroidGetLifecycleFlow.this = androidGetLifecycleFlow0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2(AndroidGetLifecycleFlow.this, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.L$0;
                        com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1 androidGetLifecycleFlow$invoke$2$listener$10 = new Application.ActivityLifecycleCallbacks() {
                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
                                L.p(activity0, "activity");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityCreated.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$10 = new o(activity0, bundle0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    final Bundle $bundle;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        this.$bundle = bundle0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityCreated.1(this.$$this$channelFlow, this.$activity, this.$bundle, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityCreated.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Created lifecycleEvent$Created0 = new Created(new WeakReference(this.$activity), this.$bundle);
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$Created0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$10, 3, null);
                            }

                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivityDestroyed(@l Activity activity0) {
                                L.p(activity0, "activity");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityDestroyed.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$10 = new o(activity0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityDestroyed.1(this.$$this$channelFlow, this.$activity, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityDestroyed.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Destroyed lifecycleEvent$Destroyed0 = new Destroyed(new WeakReference(this.$activity));
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$Destroyed0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$10, 3, null);
                            }

                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivityPaused(@l Activity activity0) {
                                L.p(activity0, "activity");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityPaused.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$10 = new o(activity0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityPaused.1(this.$$this$channelFlow, this.$activity, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityPaused.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Paused lifecycleEvent$Paused0 = new Paused(new WeakReference(this.$activity));
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$Paused0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$10, 3, null);
                            }

                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivityResumed(@l Activity activity0) {
                                L.p(activity0, "activity");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityResumed.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$10 = new o(activity0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityResumed.1(this.$$this$channelFlow, this.$activity, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityResumed.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Resumed lifecycleEvent$Resumed0 = new Resumed(new WeakReference(this.$activity));
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$Resumed0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$10, 3, null);
                            }

                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivitySaveInstanceState(@l Activity activity0, @l Bundle bundle0) {
                                L.p(activity0, "activity");
                                L.p(bundle0, "bundle");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivitySaveInstanceState.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$10 = new o(activity0, bundle0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    final Bundle $bundle;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        this.$bundle = bundle0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivitySaveInstanceState.1(this.$$this$channelFlow, this.$activity, this.$bundle, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivitySaveInstanceState.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                SaveInstanceState lifecycleEvent$SaveInstanceState0 = new SaveInstanceState(new WeakReference(this.$activity), this.$bundle);
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$SaveInstanceState0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$10, 3, null);
                            }

                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivityStarted(@l Activity activity0) {
                                L.p(activity0, "activity");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityStarted.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$10 = new o(activity0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityStarted.1(this.$$this$channelFlow, this.$activity, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityStarted.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Started lifecycleEvent$Started0 = new Started(new WeakReference(this.$activity));
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$Started0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$10, 3, null);
                            }

                            @Override  // android.app.Application$ActivityLifecycleCallbacks
                            public void onActivityStopped(@l Activity activity0) {
                                L.p(activity0, "activity");
                                com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityStopped.1 androidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$10 = new o(activity0, null) {
                                    final D $$this$channelFlow;
                                    final Activity $activity;
                                    int label;

                                    {
                                        this.$$this$channelFlow = d0;
                                        this.$activity = activity0;
                                        super(2, d1);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityStopped.1(this.$$this$channelFlow, this.$activity, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1.onActivityStopped.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Stopped lifecycleEvent$Stopped0 = new Stopped(new WeakReference(this.$activity));
                                                this.label = 1;
                                                return this.$$this$channelFlow.I(lifecycleEvent$Stopped0, this) == object1 ? object1 : S0.a;
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
                                kotlinx.coroutines.k.f(this.$$this$channelFlow, null, null, androidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$10, 3, null);
                            }
                        };
                        ((Application)AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(androidGetLifecycleFlow$invoke$2$listener$10);
                        com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.1 androidGetLifecycleFlow$invoke$2$10 = new a(androidGetLifecycleFlow$invoke$2$listener$10) {
                            final com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.listener.1 $listener;

                            {
                                AndroidGetLifecycleFlow.this = androidGetLifecycleFlow0;
                                this.$listener = androidGetLifecycleFlow$invoke$2$listener$10;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                ((Application)AndroidGetLifecycleFlow.this.applicationContext).unregisterActivityLifecycleCallbacks(this.$listener);
                            }
                        };
                        this.label = 1;
                        return B.a(d0, androidGetLifecycleFlow$invoke$2$10, this) == object1 ? object1 : S0.a;
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
        });
    }
}

