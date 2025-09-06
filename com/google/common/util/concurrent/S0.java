package com.google.common.util.concurrent;

import J1.b;
import java.util.logging.Logger;

@b
@N
final class s0 {
    private final String a;
    private volatile Logger b;

    s0(Class class0) {
        this.a = class0.getName();
    }

    Logger a() {
        Logger logger0 = this.b;
        if(logger0 != null) {
            return logger0;
        }
        synchronized(this) {
            Logger logger1 = this.b;
            if(logger1 != null) {
                return logger1;
            }
            Logger logger2 = Logger.getLogger(this.a);
            this.b = logger2;
            return logger2;
        }
    }
}

