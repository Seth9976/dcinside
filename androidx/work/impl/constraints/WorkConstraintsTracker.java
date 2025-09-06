package androidx.work.impl.constraints;

import A3.a;
import A3.p;
import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nWorkConstraintsTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,205:1\n766#2:206\n857#2,2:207\n1549#2:209\n1620#2,3:210\n766#2:218\n857#2,2:219\n287#3:213\n288#3:216\n37#4,2:214\n107#5:217\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n92#1:206\n92#1:207,2\n92#1:209\n92#1:210,3\n100#1:218\n100#1:219,2\n93#1:213\n93#1:216\n93#1:214,2\n93#1:217\n*E\n"})
public final class WorkConstraintsTracker {
    @l
    private final List a;

    public WorkConstraintsTracker(@l Trackers trackers0) {
        L.p(trackers0, "trackers");
        this(u.Q(new ConstraintController[]{new BatteryChargingController(trackers0.a()), new BatteryNotLowController(trackers0.b()), new StorageNotLowController(trackers0.e()), new NetworkConnectedController(trackers0.d()), new NetworkUnmeteredController(trackers0.d()), new NetworkNotRoamingController(trackers0.d()), new NetworkMeteredController(trackers0.d()), (Build.VERSION.SDK_INT < 28 ? null : WorkConstraintsTrackerKt.a(trackers0.c()))}));
    }

    public WorkConstraintsTracker(@l List list0) {
        L.p(list0, "controllers");
        super();
        this.a = list0;
    }

    public final boolean a(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            if(((ConstraintController)object0).b(workSpec0)) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            Logger.e().a("WM-WorkConstraintsTrack", "Work " + workSpec0.a + " constrained by " + u.m3(arrayList0, null, null, null, 0, null, androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1.e, 0x1F, null));
        }
        return arrayList0.isEmpty();

        final class androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1 extends N implements Function1 {
            public static final androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1 e;

            static {
                androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1.e = new androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1();
            }

            androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1() {
                super(1);
            }

            public final CharSequence a(ConstraintController constraintController0) {
                L.p(constraintController0, "it");
                CharSequence charSequence0 = constraintController0.getClass().getSimpleName();
                L.o(charSequence0, "it.javaClass.simpleName");
                return charSequence0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((ConstraintController)object0));
            }
        }

    }

    @l
    public final i b(@l WorkSpec workSpec0) {
        L.p(workSpec0, "spec");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            if(((ConstraintController)object0).c(workSpec0)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(((ConstraintController)object1).a(workSpec0.j));
        }
        return k.g0(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.2 workConstraintsTracker$track$$inlined$combine$1$20 = new a() {
                    final i[] e;

                    {
                        this.e = arr_i;
                        super(0);
                    }

                    @m
                    public final Object[] b() {
                        return new ConstraintsState[this.e.length];
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                };
                androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.3 workConstraintsTracker$track$$inlined$combine$1$30 = new p() {
                    int k;
                    private Object l;
                    Object m;

                    {
                        super(3, d0);
                    }

                    @m
                    public final Object a(@l j j0, @l Object[] arr_object, @m d d0) {
                        androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.3 workConstraintsTracker$track$$inlined$combine$1$30 = new androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.3(d0);
                        workConstraintsTracker$track$$inlined$combine$1$30.l = j0;
                        workConstraintsTracker$track$$inlined$combine$1$30.m = arr_object;
                        return workConstraintsTracker$track$$inlined$combine$1$30.invokeSuspend(S0.a);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((j)object0), ((Object[])object1), ((d)object2));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        ConstraintsState constraintsState0;
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                j j0 = (j)this.l;
                                ConstraintsState[] arr_constraintsState = (ConstraintsState[])(((Object[])this.m));
                                for(int v = 0; true; ++v) {
                                    constraintsState0 = null;
                                    if(v >= arr_constraintsState.length) {
                                        break;
                                    }
                                    ConstraintsState constraintsState1 = arr_constraintsState[v];
                                    if(!L.g(constraintsState1, ConstraintsMet.a)) {
                                        constraintsState0 = constraintsState1;
                                        break;
                                    }
                                }
                                if(constraintsState0 == null) {
                                    constraintsState0 = ConstraintsMet.a;
                                }
                                this.k = 1;
                                return j0.emit(constraintsState0, this) == object1 ? object1 : S0.a;
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
                Object object0 = kotlinx.coroutines.flow.internal.m.a(j0, this.a, workConstraintsTracker$track$$inlined$combine$1$20, workConstraintsTracker$track$$inlined$combine$1$30, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        });
    }
}

