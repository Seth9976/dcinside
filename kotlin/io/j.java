package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class j extends IOException {
    @l
    private final File a;
    @m
    private final File b;
    @m
    private final String c;

    public j(@l File file0, @m File file1, @m String s) {
        L.p(file0, "file");
        super(f.b(file0, file1, s));
        this.a = file0;
        this.b = file1;
        this.c = s;
    }

    public j(File file0, File file1, String s, int v, w w0) {
        if((v & 2) != 0) {
            file1 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        this(file0, file1, s);
    }

    @l
    public final File a() {
        return this.a;
    }

    @m
    public final File b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }
}

