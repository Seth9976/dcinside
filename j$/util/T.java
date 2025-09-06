package j$.util;

import java.util.List;
import java.util.RandomAccess;

final class t extends n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override  // j$.util.n
    public final List subList(int v, int v1) {
        return new t(this.b.subList(v, v1));  // 初始化器: Lj$/util/n;-><init>(Ljava/util/List;)V
    }

    private Object writeReplace() {
        return new n(this.b);
    }
}

