package j$.util.stream;

import j..util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

final class m1 extends n1 {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        if(this.a == null) {
            return;
        }
        if(this.d == null) {
            Spliterator spliterator0 = this.c;
            if(spliterator0 == null) {
                ArrayDeque arrayDeque0 = this.b();
                J0 j00;
                while((j00 = n1.a(arrayDeque0)) != null) {
                    j00.forEach(consumer0);
                }
                this.a = null;
                return;
            }
            spliterator0.forEachRemaining(consumer0);
            return;
        }
        while(this.tryAdvance(consumer0)) {
        }
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        if(!this.c()) {
            return false;
        }
        boolean z = this.d.tryAdvance(consumer0);
        if(!z) {
            if(this.c == null) {
                J0 j00 = n1.a(this.e);
                if(j00 != null) {
                    Spliterator spliterator0 = j00.spliterator();
                    this.d = spliterator0;
                    return spliterator0.tryAdvance(consumer0);
                }
            }
            this.a = null;
        }
        return z;
    }
}

