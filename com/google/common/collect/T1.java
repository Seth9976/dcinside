package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.util.Queue;
import o3.a;

@b
@C1
final class t1 extends c {
    private final Queue c;

    t1(Queue queue0) {
        this.c = (Queue)H.E(queue0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.c
    @a
    protected Object a() {
        return this.c.isEmpty() ? this.b() : this.c.remove();
    }
}

