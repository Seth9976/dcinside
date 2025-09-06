package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorkerKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,168:1\n36#2:169\n21#2:170\n23#2:174\n50#3:171\n55#3:173\n107#4:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorkerKt\n*L\n159#1:169\n159#1:170\n159#1:174\n159#1:171\n159#1:173\n159#1:172\n*E\n"})
public final class ConstraintTrackingWorkerKt {
    @l
    private static final String a = null;
    @l
    public static final String b = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    // 去混淆评级： 低(20)
    static {
        L.o("WM-ConstraintTrkngWrkr", "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        ConstraintTrackingWorkerKt.a = "WM-ConstraintTrkngWrkr";
    }

    // 去混淆评级： 低(20)
    public static final String b() [...] // 潜在的解密器

    private static final Object c(WorkConstraintsTracker workConstraintsTracker0, WorkSpec workSpec0, d d0) {
        androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.1 constraintTrackingWorkerKt$awaitConstraintsNotMet$10;
        if(d0 instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.1) {
            constraintTrackingWorkerKt$awaitConstraintsNotMet$10 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.1)d0;
            int v = constraintTrackingWorkerKt$awaitConstraintsNotMet$10.l;
            if((v & 0x80000000) == 0) {
                constraintTrackingWorkerKt$awaitConstraintsNotMet$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    int l;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return ConstraintTrackingWorkerKt.c(null, null, this);
                    }
                };
            }
            else {
                constraintTrackingWorkerKt$awaitConstraintsNotMet$10.l = v ^ 0x80000000;
            }
        }
        else {
            constraintTrackingWorkerKt$awaitConstraintsNotMet$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                int l;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.l |= 0x80000000;
                    return ConstraintTrackingWorkerKt.c(null, null, this);
                }
            };
        }
        Object object0 = constraintTrackingWorkerKt$awaitConstraintsNotMet$10.k;
        Object object1 = b.l();
        switch(constraintTrackingWorkerKt$awaitConstraintsNotMet$10.l) {
            case 0: {
                f0.n(object0);
                androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet..inlined.filterIsInstance.1 constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$10 = new i() {
                    @Override  // kotlinx.coroutines.flow.i
                    @m
                    public Object collect(@l j j0, @l d d0) {
                        androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet..inlined.filterIsInstance.1.2 constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$20 = new j() {
                            @Override  // kotlinx.coroutines.flow.j
                            @m
                            public final Object emit(Object object0, @l d d0) {
                                androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet..inlined.filterIsInstance.1.2.1 constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10;
                                if(d0 instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet..inlined.filterIsInstance.1.2.1) {
                                    constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet..inlined.filterIsInstance.1.2.1)d0;
                                    int v = constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10.l;
                                    if((v & 0x80000000) == 0) {
                                        constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                            Object k;
                                            int l;
                                            Object m;
                                            Object n;

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                this.k = object0;
                                                this.l |= 0x80000000;
                                                return d0.emit(null, this);
                                            }
                                        };
                                    }
                                    else {
                                        constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10.l = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                        Object k;
                                        int l;
                                        Object m;
                                        Object n;

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            this.k = object0;
                                            this.l |= 0x80000000;
                                            return d0.emit(null, this);
                                        }
                                    };
                                }
                                Object object1 = constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10.k;
                                Object object2 = b.l();
                                switch(constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10.l) {
                                    case 0: {
                                        f0.n(object1);
                                        j j0 = this.a;
                                        if(object0 instanceof ConstraintsNotMet) {
                                            constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10.l = 1;
                                            if(j0.emit(object0, constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$10) == object2) {
                                                return object2;
                                            }
                                        }
                                        return S0.a;
                                    }
                                    case 1: {
                                        f0.n(object1);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        };
                        Object object0 = k.e1(workConstraintsTracker0.b(workSpec0), new androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.2(workSpec0, null)).collect(constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$20, d0);
                        return object0 == b.l() ? object0 : S0.a;
                    }
                };
                constraintTrackingWorkerKt$awaitConstraintsNotMet$10.l = 1;
                object0 = k.v0(constraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$10, constraintTrackingWorkerKt$awaitConstraintsNotMet$10);
                return object0 == object1 ? object1 : kotlin.coroutines.jvm.internal.b.f(((ConstraintsNotMet)object0).d());
            }
            case 1: {
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.f(((ConstraintsNotMet)object0).d());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }

        @f(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n19#2:169\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2\n*L\n158#1:169\n*E\n"})
        final class androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.2 extends o implements A3.o {
            int k;
            final WorkSpec l;

            androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.2(WorkSpec workSpec0, d d0) {
                this.l = workSpec0;
                super(2, d0);
            }

            public final Object a(ConstraintsState constraintsState0, d d0) {
                return ((androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.2)this.create(constraintsState0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet.2(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((ConstraintsState)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Logger.e().a("WM-ConstraintTrkngWrkr", "Constraints changed for " + this.l);
                return S0.a;
            }
        }

    }
}

