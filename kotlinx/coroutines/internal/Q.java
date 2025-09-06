package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.V;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.I;
import y4.l;
import y4.m;

@s0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11065#3:114\n11400#3,3:115\n12634#3,3:132\n1963#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
public final class q {
    private static final int a;
    @l
    private static final kotlinx.coroutines.internal.l b;

    static {
        q.a = q.e(Throwable.class, -1);
        q.b = j0.a;
    }

    private static final Function1 b(Class class0) {
        static final class a extends N implements Function1 {
            final Constructor e;

            a(Constructor constructor0) {
                this.e = constructor0;
                super(1);
            }

            @l
            public final Throwable a(@l Throwable throwable0) {
                Object object0 = this.e.newInstance(throwable0.getMessage(), throwable0);
                L.n(object0, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        @s0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
        static final class b extends N implements Function1 {
            final Constructor e;

            b(Constructor constructor0) {
                this.e = constructor0;
                super(1);
            }

            @l
            public final Throwable a(@l Throwable throwable0) {
                Object object0 = this.e.newInstance(throwable0.getMessage());
                L.n(object0, "null cannot be cast to non-null type kotlin.Throwable");
                ((Throwable)object0).initCause(throwable0);
                return (Throwable)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class c extends N implements Function1 {
            final Constructor e;

            c(Constructor constructor0) {
                this.e = constructor0;
                super(1);
            }

            @l
            public final Throwable a(@l Throwable throwable0) {
                Object object0 = this.e.newInstance(throwable0);
                L.n(object0, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        @s0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
        static final class d extends N implements Function1 {
            final Constructor e;

            d(Constructor constructor0) {
                this.e = constructor0;
                super(1);
            }

            @l
            public final Throwable a(@l Throwable throwable0) {
                Object object0 = this.e.newInstance(null);
                L.n(object0, "null cannot be cast to non-null type kotlin.Throwable");
                ((Throwable)object0).initCause(throwable0);
                return (Throwable)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            @m
            public final Void a(@l Throwable throwable0) {
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        V v3;
        Object object0;
        Function1 function10 = e.e;
        int v = q.e(class0, 0);
        if(q.a != v) {
            return function10;
        }
        Constructor[] arr_constructor = class0.getConstructors();
        ArrayList arrayList0 = new ArrayList(arr_constructor.length);
        for(int v1 = 0; true; ++v1) {
            object0 = null;
            if(v1 >= arr_constructor.length) {
                break;
            }
            Constructor constructor0 = arr_constructor[v1];
            Class[] arr_class = constructor0.getParameterTypes();
            int v2 = arr_class.length;
            if(v2 == 0) {
                v3 = r0.a(q.f(new d(constructor0)), 0);
            }
            else {
                Class class1 = Throwable.class;
                Class class2 = String.class;
                switch(v2) {
                    case 1: {
                        Class class3 = arr_class[0];
                        if(L.g(class3, class2)) {
                            v3 = r0.a(q.f(new b(constructor0)), 2);
                        }
                        else if(L.g(class3, class1)) {
                            v3 = r0.a(q.f(new c(constructor0)), 1);
                        }
                        else {
                            v3 = r0.a(null, -1);
                        }
                        break;
                    }
                    case 2: {
                        v3 = !L.g(arr_class[0], class2) || !L.g(arr_class[1], class1) ? r0.a(null, -1) : r0.a(q.f(new a(constructor0)), 3);
                        break;
                    }
                    default: {
                        v3 = r0.a(null, -1);
                    }
                }
            }
            arrayList0.add(v3);
        }
        Iterator iterator0 = arrayList0.iterator();
        if(iterator0.hasNext()) {
            object0 = iterator0.next();
            if(iterator0.hasNext()) {
                int v4 = ((Number)((V)object0).f()).intValue();
                while(true) {
                    Object object1 = iterator0.next();
                    int v5 = ((Number)((V)object1).f()).intValue();
                    if(v4 < v5) {
                        object0 = object1;
                        v4 = v5;
                    }
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
            }
        }
        if(((V)object0) != null) {
            Function1 function11 = (Function1)((V)object0).e();
            return function11 == null ? function10 : function11;
        }
        return function10;
    }

    private static final int c(Class class0, int v) {
        do {
            Field[] arr_field = class0.getDeclaredFields();
            int v2 = 0;
            for(int v1 = 0; v1 < arr_field.length; ++v1) {
                if(!Modifier.isStatic(arr_field[v1].getModifiers())) {
                    ++v2;
                }
            }
            v += v2;
            class0 = class0.getSuperclass();
        }
        while(class0 != null);
        return v;
    }

    static int d(Class class0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return q.c(class0, v);
    }

    private static final int e(Class class0, int v) {
        Integer integer0;
        z3.b.i(class0);
        try {
            integer0 = e0.b(q.d(class0, 0, 1, null));
        }
        catch(Throwable throwable0) {
            integer0 = e0.b(f0.a(throwable0));
        }
        Integer integer1 = v;
        if(e0.i(integer0)) {
            integer0 = integer1;
        }
        return integer0.intValue();
    }

    private static final Function1 f(Function1 function10) {
        static final class f extends N implements Function1 {
            final Function1 e;

            f(Function1 function10) {
                this.e = function10;
                super(1);
            }

            @m
            public final Throwable a(@l Throwable throwable0) {
                try {
                    Throwable throwable2 = (Throwable)this.e.invoke(throwable0);
                    if(!L.g(throwable0.getMessage(), throwable2.getMessage()) && !L.g(throwable2.getMessage(), throwable0.toString())) {
                        return null;
                    }
                    return e0.i(throwable2) ? null : throwable2;
                }
                catch(Throwable throwable1) {
                }
                Throwable throwable3 = e0.b(f0.a(throwable1));
                return e0.i(throwable3) ? null : throwable3;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        return new f(function10);
    }

    @m
    public static final Throwable g(@l Throwable throwable0) {
        Object object0;
        if(throwable0 instanceof I) {
            try {
                object0 = e0.b(((I)throwable0).a());
            }
            catch(Throwable throwable1) {
                object0 = e0.b(f0.a(throwable1));
            }
            if(e0.i(object0)) {
                object0 = null;
            }
            return (Throwable)object0;
        }
        Class class0 = throwable0.getClass();
        return (Throwable)q.b.a(class0).invoke(throwable0);
    }
}

