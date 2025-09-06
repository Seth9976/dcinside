package j$.util;

import java.security.AccessController;

abstract class s0 {
    static final boolean a;

    static {
        s0.a = ((Boolean)AccessController.doPrivileged(new r0())).booleanValue();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    static void a(Class class0, String s) {
        throw new UnsupportedOperationException(class0 + " tripwire tripped but logging not supported: " + s);
    }
}

