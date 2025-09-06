package kotlinx.coroutines.channels;

import kotlin.S0;
import kotlin.collections.P;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import y4.l;
import y4.m;

@f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
final class u.L extends o implements A3.o {
    Object k;
    int l;
    int m;
    private Object n;
    final F o;

    u.L(F f0, d d0) {
        this.o = f0;
        super(2, d0);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @l
    public final d create(@m Object object0, @l d d0) {
        d d1 = new u.L(this.o, d0);
        d1.n = object0;
        return d1;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((D)object0), ((d)object1));
    }

    @m
    public final Object invoke(@l D d0, @m d d1) {
        return ((u.L)this.create(d0, d1)).invokeSuspend(S0.a);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object object0) {
        D d1;
        n n1;
        int v1;
        int v;
        n n0;
        D d0;
        Object object1 = b.l();
        switch(this.m) {
            case 0: {
                f0.n(object0);
                d0 = (D)this.n;
                n0 = this.o.iterator();
                v = 0;
                break;
            }
            case 1: {
                v1 = this.l;
                n1 = (n)this.k;
                d1 = (D)this.n;
                f0.n(object0);
                goto label_31;
            }
            case 2: {
                int v2 = this.l;
                n n2 = (n)this.k;
                D d2 = (D)this.n;
                f0.n(object0);
                d0 = d2;
                v = v2;
                n0 = n2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            this.n = d0;
            this.k = n0;
            this.l = v;
            this.m = 1;
            Object object2 = n0.b(this);
            if(object2 == object1) {
                return object1;
            }
            d1 = d0;
            object0 = object2;
            n1 = n0;
            v1 = v;
        label_31:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            P p0 = new P(v1, n1.next());
            this.n = d1;
            this.k = n1;
            this.l = v1 + 1;
            this.m = 2;
            if(d1.I(p0, this) == object1) {
                return object1;
            }
            n0 = n1;
            d0 = d1;
            v = v1 + 1;
        }
        return S0.a;
    }
}

