package com.google.common.collect;

import J1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.t;
import java.io.Serializable;
import o3.a;

@b(serializable = true)
@C1
final class z extends c4 implements Serializable {
    final t c;
    final c4 d;
    private static final long e;

    z(t t0, c4 c40) {
        this.c = (t)H.E(t0);
        this.d = (c4)H.E(c40);
    }

    @Override  // com.google.common.collect.c4
    public int compare(@d4 Object object0, @d4 Object object1) {
        Object object2 = this.c.apply(object0);
        Object object3 = this.c.apply(object1);
        return this.d.compare(object2, object3);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@a Object object0) {
        return object0 == this ? true : object0 instanceof z && (this.c.equals(((z)object0).c) && this.d.equals(((z)object0).d));
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.c, this.d});
    }

    @Override
    public String toString() {
        return this.d + ".onResultOf(" + this.c + ")";
    }
}

