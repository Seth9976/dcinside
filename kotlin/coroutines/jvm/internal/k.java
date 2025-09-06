package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.d;
import kotlin.h0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import y4.l;
import y4.m;

@h0(version = "1.3")
public abstract class k extends j implements n, E {
    private final int k;

    public k(int v) {
        this(v, null);
    }

    public k(int v, @m d d0) {
        super(d0);
        this.k = v;
    }

    @Override  // kotlin.jvm.internal.E
    public int getArity() {
        return this.k;
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @l
    public String toString() {
        if(this.getCompletion() == null) {
            String s = m0.w(this);
            L.o(s, "renderLambdaToString(...)");
            return s;
        }
        return super.toString();
    }
}

