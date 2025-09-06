package androidx.work.impl.constraints.controllers;

import A3.a;
import A3.o;
import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsMet;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;

public abstract class BaseConstraintController implements ConstraintController {
    @l
    private final ConstraintTracker a;

    public BaseConstraintController(@l ConstraintTracker constraintTracker0) {
        L.p(constraintTracker0, "tracker");
        super();
        this.a = constraintTracker0;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    @l
    public i a(@l Constraints constraints0) {
        L.p(constraints0, "constraints");
        return k.s(new o(null) {
            int k;
            private Object l;
            final BaseConstraintController m;

            {
                this.m = baseConstraintController0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new androidx.work.impl.constraints.controllers.BaseConstraintController.track.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            public final Object invoke(D d0, d d1) {
                return ((androidx.work.impl.constraints.controllers.BaseConstraintController.track.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        androidx.work.impl.constraints.controllers.BaseConstraintController.track.1.listener.1 baseConstraintController$track$1$listener$10 = new ConstraintListener() {
                            @Override  // androidx.work.impl.constraints.ConstraintListener
                            public void a(Object object0) {
                                ConstraintsNotMet constraintsState$ConstraintsNotMet0 = d0.g(object0) ? new ConstraintsNotMet(d0.e()) : ConstraintsMet.a;
                                this.b.b().l(constraintsState$ConstraintsNotMet0);
                            }
                        };
                        this.m.a.c(baseConstraintController$track$1$listener$10);
                        androidx.work.impl.constraints.controllers.BaseConstraintController.track.1.1 baseConstraintController$track$1$10 = new a(baseConstraintController$track$1$listener$10) {
                            final BaseConstraintController e;
                            final androidx.work.impl.constraints.controllers.BaseConstraintController.track.1.listener.1 f;

                            {
                                this.e = baseConstraintController0;
                                this.f = baseConstraintController$track$1$listener$10;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                this.e.a.g(this.f);
                            }
                        };
                        this.k = 1;
                        return B.a(d0, baseConstraintController$track$1$10, this) == object1 ? object1 : S0.a;
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

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean b(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        return this.c(workSpec0) && this.g(this.a.f());
    }

    protected abstract int e();

    protected static void f() {
    }

    protected boolean g(Object object0) {
        return false;
    }
}

