package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import J1.e;
import java.io.PrintStream;
import java.util.Locale;
import java.util.logging.Level;

@c
@d
@N
public final class e1 {
    @e
    static final class a implements Thread.UncaughtExceptionHandler {
        private final Runtime a;
        private static final s0 b;

        static {
            a.b = new s0(a.class);
        }

        a(Runtime runtime0) {
            this.a = runtime0;
        }

        @Override
        public void uncaughtException(Thread thread0, Throwable throwable0) {
            try {
                a.b.a().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread0), throwable0);
            }
            catch(Throwable throwable1) {
                PrintStream printStream0 = System.err;
                printStream0.println(throwable0.getMessage());
                printStream0.println(throwable1.getMessage());
            }
            finally {
                this.a.exit(1);
            }
        }
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}

