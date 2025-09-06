package com.kakao.adfit.common.matrix.exception;

import com.kakao.adfit.i.i;
import kotlin.jvm.internal.w;

public final class ExceptionMechanismException extends RuntimeException {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final i a;
    private final Throwable b;
    private final Thread c;
    public static final a d;

    static {
        ExceptionMechanismException.d = new a(null);
    }

    public ExceptionMechanismException(i i0, Throwable throwable0, Thread thread0) {
        this.a = i0;
        this.b = throwable0;
        this.c = thread0;
    }

    public final i a() {
        return this.a;
    }

    public final Thread b() {
        return this.c;
    }

    public final Throwable c() {
        return this.b;
    }
}

