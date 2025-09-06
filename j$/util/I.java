package j$.util;

import java.util.List;
import java.util.RandomAccess;

final class i extends g implements RandomAccess {
    private static final long serialVersionUID = 0x153E0C6C865668D2L;

    @Override  // j$.util.g
    public final List subList(int v, int v1) {
        synchronized(this.b) {
        }
        return new i(this.c.subList(v, v1), this.b);  // 初始化器: Lj$/util/g;-><init>(Ljava/util/List;Ljava/lang/Object;)V
    }

    private Object writeReplace() {
        return new g(this.c);
    }
}

