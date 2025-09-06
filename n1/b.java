package N1;

import O1.j;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.t;
import com.google.crypto.tink.tinkkey.d;

@j
public final class b implements d {
    private final k2 a;
    private final boolean b;
    private final com.google.crypto.tink.t.b c;

    public b(k2 k20, com.google.crypto.tink.t.b t$b0) {
        this.b = b.e(k20);
        this.a = k20;
        this.c = t$b0;
    }

    @Override  // com.google.crypto.tink.tinkkey.d
    public boolean a() {
        return this.b;
    }

    @Override  // com.google.crypto.tink.tinkkey.d
    public t b() {
        throw new UnsupportedOperationException();
    }

    public com.google.crypto.tink.t.b c() {
        return this.c;
    }

    public k2 d() {
        return this.a;
    }

    private static boolean e(k2 k20) {
        return k20.E0() == c.b || k20.E0() == c.c || k20.E0() == c.d;
    }
}

