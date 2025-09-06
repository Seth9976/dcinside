package androidx.compose.ui.platform;

import A3.o;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings.Global;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R.id;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.y;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n34#2:427\n361#3,7:428\n1#4:435\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:427\n99#1:428,7\n*E\n"})
public final class WindowRecomposer_androidKt {
    @l
    private static final Map a;

    static {
        WindowRecomposer_androidKt.a = new LinkedHashMap();
    }

    @ExperimentalComposeUiApi
    @l
    public static final Recomposer b(@l View view0, @l g g0, @m Lifecycle lifecycle0) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock1;
        L.p(view0, "<this>");
        L.p(g0, "coroutineContext");
        if(g0.get(e.z8) == null || g0.get(MonotonicFrameClock.k0) == null) {
            g0 = AndroidUiDispatcher.l.a().plus(g0);
        }
        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)g0.get(MonotonicFrameClock.k0);
        if(monotonicFrameClock0 == null) {
            pausableMonotonicFrameClock1 = null;
        }
        else {
            PausableMonotonicFrameClock pausableMonotonicFrameClock0 = new PausableMonotonicFrameClock(monotonicFrameClock0);
            pausableMonotonicFrameClock0.d();
            pausableMonotonicFrameClock1 = pausableMonotonicFrameClock0;
        }
        h l0$h0 = new h();
        MotionDurationScale motionDurationScale0 = (MotionDurationScale)g0.get(MotionDurationScale.n0);
        if(motionDurationScale0 == null) {
            motionDurationScale0 = new MotionDurationScaleImpl();
            l0$h0.a = motionDurationScale0;
        }
        PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock1 == null ? i.a : pausableMonotonicFrameClock1;
        g g1 = g0.plus(pausableMonotonicFrameClock2).plus(motionDurationScale0);
        Recomposer recomposer0 = new Recomposer(g1);
        O o0 = P.a(g1);
        if(lifecycle0 == null) {
            LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(view0);
            lifecycle0 = lifecycleOwner0 == null ? null : lifecycleOwner0.getLifecycle();
        }
        if(lifecycle0 == null) {
            throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view0).toString());
        }
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@l View view0) {
                L.p(view0, "v");
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@l View view0) {
                L.p(view0, "v");
                view0.removeOnAttachStateChangeListener(this);
                recomposer0.j0();
            }
        });
        lifecycle0.a(new LifecycleEventObserver() {
            public final class WhenMappings {
                public static final int[] a;

                static {
                    int[] arr_v = new int[Event.values().length];
                    try {
                        arr_v[Event.ON_CREATE.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_START.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_STOP.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_DESTROY.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_PAUSE.ordinal()] = 5;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_RESUME.ordinal()] = 6;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_ANY.ordinal()] = 7;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.a = arr_v;
                }
            }

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
                L.p(lifecycleOwner0, "source");
                L.p(lifecycle$Event0, "event");
                switch(lifecycle$Event0) {
                    case 1: {
                        androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2.onStateChanged.1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$10 = new o(recomposer0, lifecycleOwner0, this, view0, null) {
                            int k;
                            private Object l;
                            final h m;
                            final Recomposer n;
                            final LifecycleOwner o;
                            final androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2 p;
                            final View q;

                            {
                                this.m = l0$h0;
                                this.n = recomposer0;
                                this.o = lifecycleOwner0;
                                this.p = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$20;
                                this.q = view0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2.onStateChanged.1(this.m, this.n, this.o, this.p, this.q, d0);
                                d1.l = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2.onStateChanged.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                I0 i01;
                                I0 i00;
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        O o0 = (O)this.l;
                                        try {
                                            MotionDurationScaleImpl motionDurationScaleImpl0 = (MotionDurationScaleImpl)this.m.a;
                                            if(motionDurationScaleImpl0 == null) {
                                                i00 = null;
                                            }
                                            else {
                                                Context context0 = this.q.getContext().getApplicationContext();
                                                L.o(context0, "context.applicationContext");
                                                U u0 = WindowRecomposer_androidKt.e(context0);
                                                motionDurationScaleImpl0.b(((Number)u0.getValue()).floatValue());
                                                i00 = k.f(o0, null, null, new o(motionDurationScaleImpl0, null) {
                                                    int k;
                                                    final U l;
                                                    final MotionDurationScaleImpl m;

                                                    {
                                                        this.l = u0;
                                                        this.m = motionDurationScaleImpl0;
                                                        super(2, d0);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @l
                                                    public final d create(@m Object object0, @l d d0) {
                                                        return new androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2.onStateChanged.1.1.1(this.l, this.m, d0);
                                                    }

                                                    @Override  // A3.o
                                                    public Object invoke(Object object0, Object object1) {
                                                        return this.invoke(((O)object0), ((d)object1));
                                                    }

                                                    @m
                                                    public final Object invoke(@l O o0, @m d d0) {
                                                        return ((androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2.onStateChanged.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        Object object1 = b.l();
                                                        switch(this.k) {
                                                            case 0: {
                                                                f0.n(object0);
                                                                androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2.onStateChanged.1.1.1.1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1$10 = new j() {
                                                                    @m
                                                                    public final Object a(float f, @l d d0) {
                                                                        this.a.b(f);
                                                                        return S0.a;
                                                                    }

                                                                    @Override  // kotlinx.coroutines.flow.j
                                                                    public Object emit(Object object0, d d0) {
                                                                        return this.a(((Number)object0).floatValue(), d0);
                                                                    }
                                                                };
                                                                this.k = 1;
                                                                if(this.l.collect(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1$10, this) == object1) {
                                                                    return object1;
                                                                }
                                                                break;
                                                            }
                                                            case 1: {
                                                                f0.n(object0);
                                                                break;
                                                            }
                                                            default: {
                                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                            }
                                                        }
                                                        throw new y();
                                                    }
                                                }, 3, null);
                                            }
                                        }
                                        catch(Throwable throwable0) {
                                            i01 = null;
                                            goto label_33;
                                        }
                                        try {
                                            this.l = i00;
                                            this.k = 1;
                                            if(this.n.M0(this) == object1) {
                                                return object1;
                                            }
                                        }
                                        catch(Throwable throwable1) {
                                            i01 = i00;
                                            throwable0 = throwable1;
                                            goto label_33;
                                        }
                                        i01 = i00;
                                        break;
                                    }
                                    case 1: {
                                        i01 = (I0)this.l;
                                        try {
                                            f0.n(object0);
                                            break;
                                        }
                                        catch(Throwable throwable0) {
                                        }
                                    label_33:
                                        if(i01 != null) {
                                            a.b(i01, null, 1, null);
                                        }
                                        this.o.getLifecycle().d(this.p);
                                        throw throwable0;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                if(i01 != null) {
                                    a.b(i01, null, 1, null);
                                }
                                this.o.getLifecycle().d(this.p);
                                return S0.a;
                            }
                        };
                        k.f(o0, null, Q.d, windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$10, 1, null);
                        return;
                    }
                    case 2: {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock0 = pausableMonotonicFrameClock1;
                        if(pausableMonotonicFrameClock0 != null) {
                            pausableMonotonicFrameClock0.g();
                            return;
                        }
                        break;
                    }
                    case 3: {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock1 = pausableMonotonicFrameClock1;
                        if(pausableMonotonicFrameClock1 != null) {
                            pausableMonotonicFrameClock1.d();
                            return;
                        }
                        break;
                    }
                    case 4: {
                        recomposer0.j0();
                    }
                }
            }
        });
        return recomposer0;
    }

    public static Recomposer c(View view0, g g0, Lifecycle lifecycle0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = i.a;
        }
        if((v & 2) != 0) {
            lifecycle0 = null;
        }
        return WindowRecomposer_androidKt.b(view0, g0, lifecycle0);
    }

    @m
    public static final CompositionContext d(@l View view0) {
        L.p(view0, "<this>");
        CompositionContext compositionContext0 = WindowRecomposer_androidKt.f(view0);
        if(compositionContext0 != null) {
            return compositionContext0;
        }
        for(ViewParent viewParent0 = view0.getParent(); compositionContext0 == null && viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            compositionContext0 = WindowRecomposer_androidKt.f(((View)viewParent0));
        }
        return compositionContext0;
    }

    private static final U e(Context context0) {
        Map map0 = WindowRecomposer_androidKt.a;
        synchronized(map0) {
            U u0 = map0.get(context0);
            if(u0 == null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                Uri uri0 = Settings.Global.getUriFor("animator_duration_scale");
                kotlinx.coroutines.channels.l l0 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
                u0 = kotlinx.coroutines.flow.k.N1(kotlinx.coroutines.flow.k.I0(new o(contentResolver0, uri0, new ContentObserver(HandlerCompat.a(Looper.getMainLooper())) {
                    @Override  // android.database.ContentObserver
                    public void onChange(boolean z, @m Uri uri0) {
                        l0.l(S0.a);
                    }
                }, l0, context0, null) {
                    Object k;
                    int l;
                    private Object m;
                    final ContentResolver n;
                    final Uri o;
                    final androidx.compose.ui.platform.WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1 p;
                    final kotlinx.coroutines.channels.l q;
                    final Context r;

                    {
                        this.n = contentResolver0;
                        this.o = uri0;
                        this.p = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10;
                        this.q = l0;
                        this.r = context0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.ui.platform.WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.1(this.n, this.o, this.p, this.q, this.r, d0);
                        d1.m = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((j)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l j j0, @m d d0) {
                        return ((androidx.compose.ui.platform.WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.1)this.create(j0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        j j1;
                        n n0;
                        j j0;
                        Object object1 = b.l();
                        switch(this.l) {
                            case 0: {
                                f0.n(object0);
                                j0 = (j)this.m;
                                this.n.registerContentObserver(this.o, false, this.p);
                                try {
                                    n0 = this.q.iterator();
                                    goto label_16;
                                }
                                catch(Throwable throwable0) {
                                    break;
                                }
                            }
                            case 1: {
                                n0 = (n)this.k;
                                j1 = (j)this.m;
                                try {
                                    f0.n(object0);
                                    goto label_24;
                                }
                                catch(Throwable throwable0) {
                                    break;
                                }
                            }
                            case 2: {
                                n0 = (n)this.k;
                                j1 = (j)this.m;
                                try {
                                    f0.n(object0);
                                    while(true) {
                                        j0 = j1;
                                    label_16:
                                        this.m = j0;
                                        this.k = n0;
                                        this.l = 1;
                                        Object object2 = n0.b(this);
                                        if(object2 == object1) {
                                            return object1;
                                        }
                                        j1 = j0;
                                        object0 = object2;
                                    label_24:
                                        if(!((Boolean)object0).booleanValue()) {
                                            goto label_36;
                                        }
                                        n0.next();
                                        Float float0 = kotlin.coroutines.jvm.internal.b.e(Settings.Global.getFloat(this.r.getContentResolver(), "animator_duration_scale", 1.0f));
                                        this.m = j1;
                                        this.k = n0;
                                        this.l = 2;
                                        if(j1.emit(float0, this) != object1) {
                                            continue;
                                        }
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    break;
                                }
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        this.n.unregisterContentObserver(this.p);
                        throw throwable0;
                    label_36:
                        this.n.unregisterContentObserver(this.p);
                        return S0.a;
                    }
                }), P.b(), kotlinx.coroutines.flow.O.a.b(kotlinx.coroutines.flow.O.a, 0L, 0L, 3, null), Settings.Global.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f));
                map0.put(context0, u0);
            }
            return u0;
        }
    }

    @m
    public static final CompositionContext f(@l View view0) {
        L.p(view0, "<this>");
        Object object0 = view0.getTag(id.androidx_compose_ui_view_composition_context);
        return object0 instanceof CompositionContext ? ((CompositionContext)object0) : null;
    }

    private static final View g(View view0) {
        ViewParent viewParent0 = view0.getParent();
        while(viewParent0 instanceof View && ((View)viewParent0).getId() != 0x1020002) {
            ViewParent viewParent1 = ((View)viewParent0).getParent();
            View view1 = (View)viewParent0;
            viewParent0 = viewParent1;
            view0 = view1;
        }
        return view0;
    }

    @l
    public static final Recomposer h(@l View view0) {
        L.p(view0, "<this>");
        if(!view0.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view0 + " is not attached to a window").toString());
        }
        View view1 = WindowRecomposer_androidKt.g(view0);
        CompositionContext compositionContext0 = WindowRecomposer_androidKt.f(view1);
        if(compositionContext0 == null) {
            return WindowRecomposerPolicy.a.b(view1);
        }
        if(!(compositionContext0 instanceof Recomposer)) {
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        return (Recomposer)compositionContext0;
    }

    public static void i(View view0) {
    }

    public static final void j(@l View view0, @m CompositionContext compositionContext0) {
        L.p(view0, "<this>");
        view0.setTag(id.androidx_compose_ui_view_composition_context, compositionContext0);
    }
}

