package kotlinx.coroutines.channels;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.k;
import kotlin.m;
import y4.l;
import z3.i;

public interface n {
    public static final class a {
        @k(level = m.c, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @i(name = "next")
        public static Object a(n n0, d d0) {
            @f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {599}, m = "next", n = {"$this"}, s = {"L$0"})
            static final class kotlinx.coroutines.channels.n.a.a extends kotlin.coroutines.jvm.internal.d {
                Object k;
                Object l;
                int m;

                kotlinx.coroutines.channels.n.a.a(d d0) {
                    super(d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @y4.m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return a.a(null, this);
                }
            }

            kotlinx.coroutines.channels.n.a.a n$a$a0;
            if(d0 instanceof kotlinx.coroutines.channels.n.a.a) {
                n$a$a0 = (kotlinx.coroutines.channels.n.a.a)d0;
                int v = n$a$a0.m;
                if((v & 0x80000000) == 0) {
                    n$a$a0 = new kotlinx.coroutines.channels.n.a.a(d0);
                }
                else {
                    n$a$a0.m = v ^ 0x80000000;
                }
            }
            else {
                n$a$a0 = new kotlinx.coroutines.channels.n.a.a(d0);
            }
            Object object0 = n$a$a0.l;
            Object object1 = b.l();
            switch(n$a$a0.m) {
                case 0: {
                    f0.n(object0);
                    n$a$a0.k = n0;
                    n$a$a0.m = 1;
                    object0 = n0.b(n$a$a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                case 1: {
                    n0 = (n)n$a$a0.k;
                    f0.n(object0);
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            if(!((Boolean)object0).booleanValue()) {
                throw new v("Channel was closed");
            }
            return n0.next();
        }
    }

    @k(level = m.c, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @i(name = "next")
    Object a(d arg1);

    @y4.m
    Object b(@l d arg1);

    Object next();
}

