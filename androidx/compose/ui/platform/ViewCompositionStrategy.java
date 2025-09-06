package androidx.compose.ui.platform;

import A3.a;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import y4.l;

public interface ViewCompositionStrategy {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @l
        public final ViewCompositionStrategy a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.b;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        @l
        public static final DisposeOnDetachedFromWindow b;
        public static final int c;

        static {
            DisposeOnDetachedFromWindow.b = new DisposeOnDetachedFromWindow();
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @l
        public a a(@l AbstractComposeView abstractComposeView0) {
            L.p(abstractComposeView0, "view");
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@l View view0) {
                    L.p(view0, "v");
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@l View view0) {
                    L.p(view0, "v");
                    this.a.e();
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10);
            return new a(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10) {
                final AbstractComposeView e;
                final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 f;

                {
                    this.e = abstractComposeView0;
                    this.f = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.removeOnAttachStateChangeListener(this.f);
                }
            };
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        @l
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool b;
        public static final int c;

        static {
            DisposeOnDetachedFromWindowOrReleasedFromPool.b = new DisposeOnDetachedFromWindowOrReleasedFromPool();
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @l
        public a a(@l AbstractComposeView abstractComposeView0) {
            L.p(abstractComposeView0, "view");
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@l View view0) {
                    L.p(view0, "v");
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@l View view0) {
                    L.p(view0, "v");
                    if(!PoolingContainer.f(this.a)) {
                        this.a.e();
                    }
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10);
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.installFor.poolingContainerListener.1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$10 = new PoolingContainerListener() {
                @Override  // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void i() {
                    this.a.e();
                }
            };
            PoolingContainer.a(abstractComposeView0, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$10);
            return new a(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$10) {
                final AbstractComposeView e;
                final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.installFor.listener.1 f;
                final PoolingContainerListener g;

                {
                    this.e = abstractComposeView0;
                    this.f = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10;
                    this.g = poolingContainerListener0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.removeOnAttachStateChangeListener(this.f);
                    PoolingContainer.g(this.e, this.g);
                }
            };
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        @l
        private final Lifecycle b;
        public static final int c = 8;

        static {
        }

        public DisposeOnLifecycleDestroyed(@l Lifecycle lifecycle0) {
            L.p(lifecycle0, "lifecycle");
            super();
            this.b = lifecycle0;
        }

        public DisposeOnLifecycleDestroyed(@l LifecycleOwner lifecycleOwner0) {
            L.p(lifecycleOwner0, "lifecycleOwner");
            this(lifecycleOwner0.getLifecycle());
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @l
        public a a(@l AbstractComposeView abstractComposeView0) {
            L.p(abstractComposeView0, "view");
            return ViewCompositionStrategy_androidKt.b(abstractComposeView0, this.b);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        @l
        public static final DisposeOnViewTreeLifecycleDestroyed b;
        public static final int c;

        static {
            DisposeOnViewTreeLifecycleDestroyed.b = new DisposeOnViewTreeLifecycleDestroyed();
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @l
        public a a(@l AbstractComposeView abstractComposeView0) {
            L.p(abstractComposeView0, "view");
            if(abstractComposeView0.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(abstractComposeView0);
                if(lifecycleOwner0 == null) {
                    throw new IllegalStateException(("View tree for " + abstractComposeView0 + " has no ViewTreeLifecycleOwner").toString());
                }
                return ViewCompositionStrategy_androidKt.b(abstractComposeView0, lifecycleOwner0.getLifecycle());
            }
            h l0$h0 = new h();
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.installFor.listener.1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@l View view0) {
                    L.p(view0, "v");
                    LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(l0$h0);
                    AbstractComposeView abstractComposeView0 = l0$h0;
                    if(lifecycleOwner0 == null) {
                        throw new IllegalStateException(("View tree for " + abstractComposeView0 + " has no ViewTreeLifecycleOwner").toString());
                    }
                    this.b.a = ViewCompositionStrategy_androidKt.b(abstractComposeView0, lifecycleOwner0.getLifecycle());
                    l0$h0.removeOnAttachStateChangeListener(this);
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@l View view0) {
                    L.p(view0, "v");
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10);
            l0$h0.a = new a(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10) {
                final AbstractComposeView e;
                final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.installFor.listener.1 f;

                {
                    this.e = abstractComposeView0;
                    this.f = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.removeOnAttachStateChangeListener(this.f);
                }
            };
            return new a() {
                final h e;

                {
                    this.e = l0$h0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    ((a)this.e.a).invoke();
                }
            };
        }
    }

    @l
    public static final Companion a;

    static {
        ViewCompositionStrategy.a = Companion.a;
    }

    @l
    a a(@l AbstractComposeView arg1);
}

