package androidx.datastore.core;

import A3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class DataMigrationInitializer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final o b(@l List list0) {
            L.p(list0, "migrations");
            return new o(null) {
                int k;
                Object l;
                final List m;

                {
                    this.m = list0;
                    super(2, d0);
                }

                @m
                public final Object a(@l InitializerApi initializerApi0, @m d d0) {
                    return ((androidx.datastore.core.DataMigrationInitializer.Companion.getInitializer.1)this.create(initializerApi0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.datastore.core.DataMigrationInitializer.Companion.getInitializer.1(this.m, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((InitializerApi)object0), ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return DataMigrationInitializer.a.c(this.m, ((InitializerApi)this.l), this) == object1 ? object1 : S0.a;
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
        }

        private final Object c(List list0, InitializerApi initializerApi0, d d0) {
            Iterator iterator0;
            h l0$h0;
            androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.1 dataMigrationInitializer$Companion$runMigrations$10;
            if(d0 instanceof androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.1) {
                dataMigrationInitializer$Companion$runMigrations$10 = (androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.1)d0;
                int v = dataMigrationInitializer$Companion$runMigrations$10.o;
                if((v & 0x80000000) == 0) {
                    dataMigrationInitializer$Companion$runMigrations$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object k;
                        Object l;
                        Object m;
                        int o;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.m = object0;
                            this.o |= 0x80000000;
                            return d0.c(null, null, this);
                        }
                    };
                }
                else {
                    dataMigrationInitializer$Companion$runMigrations$10.o = v ^ 0x80000000;
                }
            }
            else {
                dataMigrationInitializer$Companion$runMigrations$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.c(null, null, this);
                    }
                };
            }
            Object object0 = dataMigrationInitializer$Companion$runMigrations$10.m;
            Object object1 = b.l();
            switch(dataMigrationInitializer$Companion$runMigrations$10.o) {
                case 0: {
                    f0.n(object0);
                    ArrayList arrayList0 = new ArrayList();
                    androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.2 dataMigrationInitializer$Companion$runMigrations$20 = new o(arrayList0, null) {
                        Object k;
                        Object l;
                        Object m;
                        int n;
                        Object o;
                        final List p;
                        final List q;

                        {
                            this.p = list0;
                            this.q = list1;
                            super(2, d0);
                        }

                        @m
                        public final Object a(Object object0, @m d d0) {
                            return ((androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.2)this.create(object0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.2(this.p, this.q, d0);
                            d1.o = object0;
                            return d1;
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.a(object0, ((d)object1));
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            DataMigration dataMigration1;
                            Iterator iterator1;
                            Object object2;
                            Iterator iterator0;
                            List list0;
                            Object object1 = b.l();
                            switch(this.n) {
                                case 0: {
                                    f0.n(object0);
                                    object0 = this.o;
                                    list0 = this.q;
                                    iterator0 = this.p.iterator();
                                    break;
                                }
                                case 1: {
                                    object2 = this.m;
                                    DataMigration dataMigration0 = (DataMigration)this.l;
                                    iterator1 = (Iterator)this.k;
                                    List list1 = (List)this.o;
                                    f0.n(object0);
                                    dataMigration1 = dataMigration0;
                                    list0 = list1;
                                    goto label_33;
                                }
                                case 2: {
                                    iterator0 = (Iterator)this.k;
                                    list0 = (List)this.o;
                                    f0.n(object0);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            while(iterator0.hasNext()) {
                                Object object3 = iterator0.next();
                                this.o = list0;
                                this.k = iterator0;
                                this.l = (DataMigration)object3;
                                this.m = object0;
                                this.n = 1;
                                Object object4 = ((DataMigration)object3).shouldMigrate(object0, this);
                                if(object4 == object1) {
                                    return object1;
                                }
                                object2 = object0;
                                object0 = object4;
                                dataMigration1 = (DataMigration)object3;
                                iterator1 = iterator0;
                            label_33:
                                if(((Boolean)object0).booleanValue()) {
                                    list0.add(new Function1(null) {
                                        int k;
                                        final DataMigration l;

                                        {
                                            this.l = dataMigration0;
                                            super(1, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@l d d0) {
                                            return new androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.2.1.1(this.l, d0);
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            return this.invoke(((d)object0));
                                        }

                                        @m
                                        public final Object invoke(@m d d0) {
                                            return ((androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations.2.1.1)this.create(d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            Object object1 = b.l();
                                            switch(this.k) {
                                                case 0: {
                                                    f0.n(object0);
                                                    this.k = 1;
                                                    return this.l.cleanUp(this) == object1 ? object1 : S0.a;
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
                                    this.o = list0;
                                    this.k = iterator1;
                                    this.l = null;
                                    this.m = null;
                                    this.n = 2;
                                    object0 = dataMigration1.migrate(object2, this);
                                    if(object0 == object1) {
                                        return object1;
                                    }
                                }
                                else {
                                    object0 = object2;
                                }
                                iterator0 = iterator1;
                            }
                            return object0;
                        }
                    };
                    dataMigrationInitializer$Companion$runMigrations$10.k = arrayList0;
                    dataMigrationInitializer$Companion$runMigrations$10.o = 1;
                    if(initializerApi0.a(dataMigrationInitializer$Companion$runMigrations$20, dataMigrationInitializer$Companion$runMigrations$10) == object1) {
                        return object1;
                    }
                    l0$h0 = new h();
                    iterator0 = arrayList0.iterator();
                    break;
                }
                case 1: {
                    List list1 = (List)dataMigrationInitializer$Companion$runMigrations$10.k;
                    f0.n(object0);
                    l0$h0 = new h();
                    iterator0 = list1.iterator();
                    break;
                }
                case 2: {
                    iterator0 = (Iterator)dataMigrationInitializer$Companion$runMigrations$10.l;
                    l0$h0 = (h)dataMigrationInitializer$Companion$runMigrations$10.k;
                    try {
                        f0.n(object0);
                        break;
                    }
                    catch(Throwable throwable0) {
                        goto label_40;
                    }
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                Function1 function10 = (Function1)object2;
                try {
                    dataMigrationInitializer$Companion$runMigrations$10.k = l0$h0;
                    dataMigrationInitializer$Companion$runMigrations$10.l = iterator0;
                    dataMigrationInitializer$Companion$runMigrations$10.o = 2;
                    if(function10.invoke(dataMigrationInitializer$Companion$runMigrations$10) != object1) {
                        continue;
                    }
                }
                catch(Throwable throwable0) {
                label_40:
                    Object object3 = l0$h0.a;
                    if(object3 == null) {
                        l0$h0.a = throwable0;
                        continue;
                    }
                    L.m(object3);
                    kotlin.o.a(((Throwable)l0$h0.a), throwable0);
                    continue;
                }
                return object1;
            }
            Throwable throwable1 = (Throwable)l0$h0.a;
            if(throwable1 != null) {
                throw throwable1;
            }
            return S0.a;
        }
    }

    @l
    public static final Companion a;

    static {
        DataMigrationInitializer.a = new Companion(null);
    }
}

