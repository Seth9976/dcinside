package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function1;
import kotlin.k;
import kotlin.m;

public final class o {
    @k(level = m.c, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final l a(int v) {
        return o.d(v, null, null, 6, null);
    }

    @y4.l
    public static final l b(int v, @y4.l i i0, @y4.m Function1 function10) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    if(i0 != i.a) {
                        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                    }
                    return new y(1, i.b, function10);
                }
                case 0: {
                    return i0 == i.a ? new j(0, function10) : new y(1, i0, function10);
                }
                default: {
                    if(v != 0x7FFFFFFF) {
                        return i0 == i.a ? new j(v, function10) : new y(v, i0, function10);
                    }
                    return new j(0x7FFFFFFF, function10);
                }
            }
        }
        return i0 == i.a ? new j(0x40, function10) : new y(1, i0, function10);
    }

    public static l c(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return o.a(v);
    }

    public static l d(int v, i i0, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            i0 = i.a;
        }
        if((v1 & 4) != 0) {
            function10 = null;
        }
        return o.b(v, i0, function10);
    }

    // 去混淆评级： 低(20)
    public static final Object e(@y4.l Object object0, @y4.l Function1 function10) {
        return object0 instanceof c ? function10.invoke(p.f(object0)) : object0;
    }

    @y4.l
    public static final Object f(@y4.l Object object0, @y4.l Function1 function10) {
        if(object0 instanceof a) {
            function10.invoke(p.f(object0));
        }
        return object0;
    }

    @y4.l
    public static final Object g(@y4.l Object object0, @y4.l Function1 function10) {
        if(object0 instanceof c) {
            function10.invoke(p.f(object0));
        }
        return object0;
    }

    @y4.l
    public static final Object h(@y4.l Object object0, @y4.l Function1 function10) {
        if(!(object0 instanceof c)) {
            function10.invoke(object0);
        }
        return object0;
    }
}

