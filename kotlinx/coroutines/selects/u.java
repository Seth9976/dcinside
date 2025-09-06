package kotlinx.coroutines.selects;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.x0;
import y4.l;
import y4.m;

@s0({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,29:1\n51#2,8:30\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n27#1:30,8\n*E\n"})
public final class u {
    @x0
    @m
    public static final Object a(@l Function1 function10, @l d d0) {
        @f(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
        @s0({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1\n*L\n1#1,29:1\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return u.a(null, this);
            }
        }

        a u$a0;
        if(d0 instanceof a) {
            u$a0 = (a)d0;
            int v = u$a0.m;
            if((v & 0x80000000) == 0) {
                u$a0 = new a(d0);
            }
            else {
                u$a0.m = v ^ 0x80000000;
            }
        }
        else {
            u$a0 = new a(d0);
        }
        Object object0 = u$a0.l;
        Object object1 = b.l();
        switch(u$a0.m) {
            case 0: {
                f0.n(object0);
                goto label_19;
            }
            case 1: {
                function10 = (Function1)u$a0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(!((Boolean)object0).booleanValue()) {
                return S0.a;
            }
        label_19:
            kotlinx.coroutines.selects.l l0 = new kotlinx.coroutines.selects.l(u$a0.getContext());
            function10.invoke(l0);
            u$a0.k = function10;
            u$a0.m = 1;
            object0 = l0.w(u$a0);
        }
        while(object0 != object1);
        return object1;
    }

    @x0
    private static final Object b(Function1 function10, d d0) {
        throw null;
    }
}

