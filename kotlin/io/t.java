package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class t extends j {
    public t(@l File file0, @m File file1, @m String s) {
        L.p(file0, "file");
        super(file0, file1, s);
    }

    public t(File file0, File file1, String s, int v, w w0) {
        if((v & 2) != 0) {
            file1 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        this(file0, file1, s);
    }
}

