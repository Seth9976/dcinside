package com.unity3d.ads.core.data.datasource;

import A3.o;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class AndroidLifecycleDataSource implements LifecycleEventObserver, LifecycleDataSource {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Event.values().length];
            try {
                arr_v[Event.ON_STOP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_START.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    private final E appActive;

    public AndroidLifecycleDataSource() {
        this.appActive = W.a(Boolean.TRUE);
        this.registerAppLifecycle();
    }

    @Override  // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean)this.appActive.getValue()).booleanValue();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        E e0 = this.appActive;
        int v = WhenMappings.$EnumSwitchMapping$0[lifecycle$Event0.ordinal()];
        boolean z = true;
        if(v == 1) {
            z = false;
        }
        else if(v != 2) {
            z = ((Boolean)this.appActive.getValue()).booleanValue();
        }
        e0.setValue(Boolean.valueOf(z));
    }

    private final void registerAppLifecycle() {
        k.f(P.b(), null, null, new o(null) {
            int label;

            {
                AndroidLifecycleDataSource.this = androidLifecycleDataSource0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.registerAppLifecycle.1(AndroidLifecycleDataSource.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.registerAppLifecycle.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ProcessLifecycleOwner.i.a().getLifecycle().a(AndroidLifecycleDataSource.this);
                return S0.a;
            }
        }, 3, null);
    }
}

