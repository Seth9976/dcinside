package kotlinx.coroutines;

import y4.l;
import y4.m;

final class n0 implements B0 {
    private final boolean a;

    public n0(boolean z) {
        this.a = z;
    }

    @Override  // kotlinx.coroutines.B0
    @m
    public V0 c() {
        return null;
    }

    @Override  // kotlinx.coroutines.B0
    public boolean isActive() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    @l
    public String toString() {
        return "Empty{" + (this.isActive() ? "Active" : "New") + '}';
    }
}

