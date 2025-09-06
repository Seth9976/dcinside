package j$.util;

import java.io.Serializable;

public final class e extends RuntimeException {
    public static void a(String s, Serializable serializable0) {
        throw new e("Unsupported " + s + " :" + serializable0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }
}

