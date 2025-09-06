package androidx.media3.datasource.cache;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class ReusableBufferedOutputStream extends BufferedOutputStream {
    private boolean a;

    public ReusableBufferedOutputStream(OutputStream outputStream0) {
        super(outputStream0);
    }

    public ReusableBufferedOutputStream(OutputStream outputStream0, int v) {
        super(outputStream0, v);
    }

    public void a(OutputStream outputStream0) {
        Assertions.i(this.a);
        this.out = outputStream0;
        this.count = 0;
        this.a = false;
    }

    @Override
    public void close() throws IOException {
        try {
            this.a = true;
            this.flush();
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
        try {
            this.out.close();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        if(throwable0 != null) {
            Util.k2(throwable0);
        }
    }
}

