package kotlinx.coroutines;

import kotlin.b0;
import y4.l;
import y4.m;
import z3.f;

@b0
public final class t extends K0 {
    @l
    @f
    public final p e;

    public t(@l p p0) {
        this.e = p0;
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@m Throwable throwable0) {
        Q0 q00 = this.H();
        Throwable throwable1 = this.e.v(q00);
        this.e.T(throwable1);
    }
}

