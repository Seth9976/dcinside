package j$.util.stream;

import java.util.function.Supplier;

public final class o0 implements Supplier {
    public final int a;
    public final u0 b;

    public o0(u0 u00, int v) {
        this.a = v;
        this.b = u00;
        super();
    }

    @Override
    public final Object get() {
        switch(this.a) {
            case 0: {
                return new r0(this.b);  // 初始化器: Lj$/util/stream/t0;-><init>(Lj$/util/stream/u0;)V
            }
            case 1: {
                return new q0(this.b);  // 初始化器: Lj$/util/stream/t0;-><init>(Lj$/util/stream/u0;)V
            }
            default: {
                return new s0(this.b);  // 初始化器: Lj$/util/stream/t0;-><init>(Lj$/util/stream/u0;)V
            }
        }
    }
}

