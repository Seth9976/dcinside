package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import okio.m0;
import okio.x;
import y4.l;

public class FaultHidingSink extends x {
    private boolean hasErrors;
    @l
    private final Function1 onException;

    public FaultHidingSink(@l m0 m00, @l Function1 function10) {
        L.p(m00, "delegate");
        L.p(function10, "onException");
        super(m00);
        this.onException = function10;
    }

    @Override  // okio.x
    public void close() {
        if(this.hasErrors) {
            return;
        }
        try {
            super.close();
        }
        catch(IOException iOException0) {
            this.hasErrors = true;
            this.onException.invoke(iOException0);
        }
    }

    @Override  // okio.x
    public void flush() {
        if(this.hasErrors) {
            return;
        }
        try {
            super.flush();
        }
        catch(IOException iOException0) {
            this.hasErrors = true;
            this.onException.invoke(iOException0);
        }
    }

    @l
    public final Function1 getOnException() {
        return this.onException;
    }

    @Override  // okio.x
    public void write(@l okio.l l0, long v) {
        L.p(l0, "source");
        if(this.hasErrors) {
            l0.skip(v);
            return;
        }
        try {
            super.write(l0, v);
        }
        catch(IOException iOException0) {
            this.hasErrors = true;
            this.onException.invoke(iOException0);
        }
    }
}

