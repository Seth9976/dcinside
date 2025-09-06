package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.h0;
import y4.l;
import y4.m;

@h0(version = "1.3")
public abstract class j extends a {
    public j(@m d d0) {
        super(d0);
        if(d0 != null && d0.getContext() != i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return i.a;
    }
}

