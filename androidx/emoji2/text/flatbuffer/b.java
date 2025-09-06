package androidx.emoji2.text.flatbuffer;

import java.util.function.Supplier;

public final class b extends ThreadLocal {
    public final Supplier a;

    public b(Supplier supplier0) {
        this.a = supplier0;
    }

    @Override
    protected Object initialValue() {
        return this.a.get();
    }
}

