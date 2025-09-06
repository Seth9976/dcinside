package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.L;

public final class f {
    private static final String b(File file0, File file1, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(file0.toString());
        if(file1 != null) {
            stringBuilder0.append(" -> " + file1);
        }
        if(s != null) {
            stringBuilder0.append(": " + s);
        }
        String s1 = stringBuilder0.toString();
        L.o(s1, "toString(...)");
        return s1;
    }
}

