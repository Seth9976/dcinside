package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.a;
import kotlin.k;
import kotlin.m;
import y4.l;
import z3.i;

@i(name = "Transformations")
public final class Transformations {
    @CheckResult
    @MainThread
    @l
    @i(name = "distinctUntilChanged")
    public static final LiveData a(@l LiveData liveData0) {
        L.p(liveData0, "<this>");
        LiveData liveData1 = new MediatorLiveData();
        a l0$a0 = new a();
        l0$a0.a = true;
        if(liveData0.j()) {
            ((MutableLiveData)liveData1).r(liveData0.f());
            l0$a0.a = false;
        }
        ((MediatorLiveData)liveData1).s(liveData0, new Transformations.sam.androidx_lifecycle_Observer.0(new Function1(((MediatorLiveData)liveData1), l0$a0) {
            final MediatorLiveData e;
            final a f;

            {
                this.e = mediatorLiveData0;
                this.f = l0$a0;
                super(1);
            }

            public final void a(Object object0) {
                Object object1 = this.e.f();
                if(this.f.a || object1 == null && object0 != null || object1 != null && !L.g(object1, object0)) {
                    this.f.a = false;
                    this.e.r(object0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        }));
        return liveData1;
    }

    @CheckResult
    @MainThread
    @k(level = m.c, message = "Use kotlin functions, instead of outdated arch core Functions")
    @i(name = "map")
    public static final LiveData b(LiveData liveData0, Function function0) {
        L.p(liveData0, "<this>");
        L.p(function0, "mapFunction");
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).s(liveData0, new Transformations.sam.androidx_lifecycle_Observer.0(new Function1(((MediatorLiveData)liveData1), function0) {
            final MediatorLiveData e;
            final Function f;

            {
                this.e = mediatorLiveData0;
                this.f = function0;
                super(1);
            }

            public final void a(Object object0) {
                Object object1 = this.f.apply(object0);
                this.e.r(object1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        }));
        return liveData1;
    }

    @CheckResult
    @MainThread
    @l
    @i(name = "map")
    public static final LiveData c(@l LiveData liveData0, @l Function1 function10) {
        L.p(liveData0, "<this>");
        L.p(function10, "transform");
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).s(liveData0, new Transformations.sam.androidx_lifecycle_Observer.0(new Function1(((MediatorLiveData)liveData1), function10) {
            final MediatorLiveData e;
            final Function1 f;

            {
                this.e = mediatorLiveData0;
                this.f = function10;
                super(1);
            }

            public final void a(Object object0) {
                Object object1 = this.f.invoke(object0);
                this.e.r(object1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        }));
        return liveData1;
    }

    @CheckResult
    @MainThread
    @k(level = m.c, message = "Use kotlin functions, instead of outdated arch core Functions")
    @i(name = "switchMap")
    public static final LiveData d(LiveData liveData0, Function function0) {
        L.p(liveData0, "<this>");
        L.p(function0, "switchMapFunction");
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).s(liveData0, new Observer() {
            @y4.m
            private LiveData a;

            @y4.m
            public final LiveData a() {
                return this.a;
            }

            public final void b(@y4.m LiveData liveData0) {
                this.a = liveData0;
            }

            @Override  // androidx.lifecycle.Observer
            public void onChanged(Object object0) {
                LiveData liveData0 = (LiveData)function0.apply(object0);
                LiveData liveData1 = this.a;
                if(liveData1 == liveData0) {
                    return;
                }
                if(liveData1 != null) {
                    L.m(liveData1);
                    ((MediatorLiveData)liveData1).t(liveData1);
                }
                this.a = liveData0;
                if(liveData0 != null) {
                    L.m(liveData0);
                    Transformations.sam.androidx_lifecycle_Observer.0 transformations$sam$androidx_lifecycle_Observer$00 = new Transformations.sam.androidx_lifecycle_Observer.0(new Function1() {
                        final MediatorLiveData e;

                        {
                            this.e = mediatorLiveData0;
                            super(1);
                        }

                        public final void a(Object object0) {
                            this.e.r(object0);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(object0);
                            return S0.a;
                        }
                    });
                    ((MediatorLiveData)liveData1).s(liveData0, transformations$sam$androidx_lifecycle_Observer$00);
                }
            }
        });
        return liveData1;
    }

    @CheckResult
    @MainThread
    @l
    @i(name = "switchMap")
    public static final LiveData e(@l LiveData liveData0, @l Function1 function10) {
        L.p(liveData0, "<this>");
        L.p(function10, "transform");
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).s(liveData0, new Observer() {
            @y4.m
            private LiveData a;

            @y4.m
            public final LiveData a() {
                return this.a;
            }

            public final void b(@y4.m LiveData liveData0) {
                this.a = liveData0;
            }

            @Override  // androidx.lifecycle.Observer
            public void onChanged(Object object0) {
                LiveData liveData0 = (LiveData)function10.invoke(object0);
                LiveData liveData1 = this.a;
                if(liveData1 == liveData0) {
                    return;
                }
                if(liveData1 != null) {
                    L.m(liveData1);
                    ((MediatorLiveData)liveData1).t(liveData1);
                }
                this.a = liveData0;
                if(liveData0 != null) {
                    L.m(liveData0);
                    Transformations.sam.androidx_lifecycle_Observer.0 transformations$sam$androidx_lifecycle_Observer$00 = new Transformations.sam.androidx_lifecycle_Observer.0(new Function1() {
                        final MediatorLiveData e;

                        {
                            this.e = mediatorLiveData0;
                            super(1);
                        }

                        public final void a(Object object0) {
                            this.e.r(object0);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(object0);
                            return S0.a;
                        }
                    });
                    ((MediatorLiveData)liveData1).s(liveData0, transformations$sam$androidx_lifecycle_Observer$00);
                }
            }
        });
        return liveData1;
    }
}

