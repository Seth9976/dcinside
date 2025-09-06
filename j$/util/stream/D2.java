package j$.util.stream;

import java.util.function.Consumer;

final class d2 extends f2 {
    @Override  // j$.util.stream.b
    final boolean R() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.f2
    public final void forEach(Consumer consumer0) {
        if(!this.isParallel()) {
            this.U().forEachRemaining(consumer0);
            return;
        }
        super.forEach(consumer0);
    }

    @Override  // j$.util.stream.f2
    public final void forEachOrdered(Consumer consumer0) {
        if(!this.isParallel()) {
            this.U().forEachRemaining(consumer0);
            return;
        }
        super.forEachOrdered(consumer0);
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !this.L() ? this : new c2(this, c3.r, 1);  // 初始化器: Lj$/util/stream/e2;-><init>(Lj$/util/stream/b;II)V
    }
}

