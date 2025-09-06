package androidx.activity;

import A3.a;
import A3.o;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import androidx.annotation.RequiresApi;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class PipHintTrackerKt {
    @RequiresApi(26)
    @m
    public static final Object b(@l Activity activity0, @l View view0, @l d d0) {
        Object object0 = k.s(new o(view0, null) {
            int k;
            private Object l;
            final View m;

            {
                this.m = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void g(D d0, View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

            // 检测为 Lambda 实现
            private static final void h(D d0, View view0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        s s0 = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> if(v != v4 || v2 != v6 || v1 != v5 || v3 != v7) {
                            L.o(view0, "v");
                            d0.l(PipHintTrackerKt.c(view0));
                        };
                        t t0 = () -> d0.l(PipHintTrackerKt.c(this.m));
                        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10 = new View.OnAttachStateChangeListener() {
                            @Override  // android.view.View$OnAttachStateChangeListener
                            public void onViewAttachedToWindow(@l View view0) {
                                L.p(view0, "v");
                                Rect rect0 = PipHintTrackerKt.c(t0);
                                this.m.l(rect0);
                                t0.getViewTreeObserver().addOnScrollChangedListener(s0);
                                t0.addOnLayoutChangeListener(this.d);
                            }

                            @Override  // android.view.View$OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(@l View view0) {
                                L.p(view0, "v");
                                view0.getViewTreeObserver().removeOnScrollChangedListener(s0);
                                view0.removeOnLayoutChangeListener(this.d);
                            }
                        };
                        if(this.m.isAttachedToWindow()) {
                            d0.l(PipHintTrackerKt.c(this.m));
                            this.m.getViewTreeObserver().addOnScrollChangedListener(t0);
                            this.m.addOnLayoutChangeListener(s0);
                        }
                        this.m.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10);
                        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$10 = new a(t0, s0, pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10) {
                            final View e;
                            final ViewTreeObserver.OnScrollChangedListener f;
                            final View.OnLayoutChangeListener g;
                            final androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1 h;

                            {
                                this.e = view0;
                                this.f = viewTreeObserver$OnScrollChangedListener0;
                                this.g = view$OnLayoutChangeListener0;
                                this.h = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                this.e.getViewTreeObserver().removeOnScrollChangedListener(this.f);
                                this.e.removeOnLayoutChangeListener(this.g);
                                this.e.removeOnAttachStateChangeListener(this.h);
                            }
                        };
                        this.k = 1;
                        return B.a(d0, pipHintTrackerKt$trackPipAnimationHintView$flow$1$10, this) == object1 ? object1 : S0.a;
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
        }).collect(new j() {
            @m
            public final Object a(@l Rect rect0, @l d d0) {
                Api26Impl.a.a(activity0, rect0);
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            public Object emit(Object object0, d d0) {
                return this.a(((Rect)object0), d0);
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final Rect c(View view0) {
        Rect rect0 = new Rect();
        view0.getGlobalVisibleRect(rect0);
        return rect0;
    }
}

