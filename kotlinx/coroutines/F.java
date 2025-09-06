package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n37#2,2:120\n13309#3,2:122\n1855#4,2:124\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:120,2\n47#1:122,2\n58#1:124,2\n*E\n"})
public final class f {
    @m
    public static final Object a(@l Collection collection0, @l d d0) {
        return collection0.isEmpty() ? u.H() : new e(((X[])collection0.toArray(new X[0]))).c(d0);
    }

    @m
    public static final Object b(@l X[] arr_x, @l d d0) {
        return arr_x.length == 0 ? u.H() : new e(arr_x).c(d0);
    }

    @m
    public static final Object c(@l Collection collection0, @l d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            b(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return f.c(null, this);
            }
        }

        Iterator iterator0;
        b f$b0;
        if(d0 instanceof b) {
            f$b0 = (b)d0;
            int v = f$b0.m;
            if((v & 0x80000000) == 0) {
                f$b0 = new b(d0);
            }
            else {
                f$b0.m = v ^ 0x80000000;
            }
        }
        else {
            f$b0 = new b(d0);
        }
        Object object0 = f$b0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(f$b0.m) {
            case 0: {
                f0.n(object0);
                iterator0 = collection0.iterator();
                break;
            }
            case 1: {
                iterator0 = (Iterator)f$b0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            f$b0.k = iterator0;
            f$b0.m = 1;
            if(((I0)object2).c1(f$b0) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return S0.a;
    }

    @m
    public static final Object d(@l I0[] arr_i0, @l d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {0x2F}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            int l;
            int m;
            Object n;
            int o;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return f.d(null, this);
            }
        }

        int v2;
        I0[] arr_i01;
        int v1;
        a f$a0;
        if(d0 instanceof a) {
            f$a0 = (a)d0;
            int v = f$a0.o;
            if((v & 0x80000000) == 0) {
                f$a0 = new a(d0);
            }
            else {
                f$a0.o = v ^ 0x80000000;
            }
        }
        else {
            f$a0 = new a(d0);
        }
        Object object0 = f$a0.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(f$a0.o) {
            case 0: {
                f0.n(object0);
                v1 = 0;
                arr_i01 = arr_i0;
                v2 = arr_i0.length;
                goto label_24;
            }
            case 1: {
                v2 = f$a0.m;
                v1 = f$a0.l;
                I0[] arr_i02 = (I0[])f$a0.k;
                f0.n(object0);
                arr_i01 = arr_i02;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ++v1;
        label_24:
            if(v1 >= v2) {
                break;
            }
            f$a0.k = arr_i01;
            f$a0.l = v1;
            f$a0.m = v2;
            f$a0.o = 1;
            if(arr_i01[v1].c1(f$a0) != object1) {
                continue;
            }
            return object1;
        }
        return S0.a;
    }
}

