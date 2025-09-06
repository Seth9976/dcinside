package com.facebook.common.memory;

import com.facebook.common.internal.s;
import java.io.IOException;
import java.io.OutputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public abstract class l extends OutputStream {
    public abstract i a();

    @Override
    public void close() {
        try {
            super.close();
        }
        catch(IOException iOException0) {
            s.d(iOException0);
        }
    }

    public abstract int size();
}

