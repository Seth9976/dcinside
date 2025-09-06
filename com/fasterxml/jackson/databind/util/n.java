package com.fasterxml.jackson.databind.util;

import java.io.IOException;

public class n {
    private static void a(Throwable throwable0) throws Throwable {
        throw throwable0;
    }

    // 去混淆评级： 中等(80)
    private static boolean b(Throwable throwable0) {
        return throwable0 instanceof VirtualMachineError || throwable0 instanceof ThreadDeath || throwable0 instanceof InterruptedException || throwable0 instanceof ClassCircularityError || throwable0 instanceof ClassFormatError || throwable0 instanceof IncompatibleClassChangeError || m.a(throwable0) || throwable0 instanceof VerifyError;
    }

    public static void c(Throwable throwable0) throws Error, RuntimeException {
        if(n.b(throwable0)) {
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
        }
        return;
    }

    public static Object d(IOException iOException0) {
        n.a(iOException0);
        return null;
    }
}

