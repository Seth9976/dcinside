package rx.exceptions;

import java.util.HashSet;
import rx.plugins.c;

public final class a extends RuntimeException {
    private static final long a = 0x1C4B7C27E9C0EFFCL;

    public a(String s) {
        super(s);
    }

    public void a(Throwable throwable0) {
        HashSet hashSet0 = new HashSet();
        do {
            if(throwable0.getCause() == null) {
                try {
                    throwable0.initCause(this);
                }
                catch(IllegalStateException unused_ex) {
                    c.I(new RuntimeException("Received an exception with a cause set to null, instead of being unset. To fix this, look down the chain of causes. The last exception had a cause explicitly set to null. It should be unset instead.", throwable0));
                }
                return;
            }
            throwable0 = throwable0.getCause();
        }
        while(hashSet0.add(throwable0));
        c.I(this);
    }

    public static a b(Throwable throwable0) {
        HashSet hashSet0 = new HashSet();
        do {
            if(throwable0 instanceof a) {
                return (a)throwable0;
            }
            if(throwable0 == null || throwable0.getCause() == null) {
                break;
            }
            throwable0 = throwable0.getCause();
        }
        while(hashSet0.add(throwable0));
        return null;
    }

    @Override
    public Throwable fillInStackTrace() {
        synchronized(this) {
        }
        return this;
    }
}

