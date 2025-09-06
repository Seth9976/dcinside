package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class w extends FileSystemException {
    public w(@l Path path0) {
        L.p(path0, "file");
        this(path0, null, null);
    }

    public w(@l Path path0, @m Path path1, @m String s) {
        L.p(path0, "file");
        super(path0.toString(), (path1 == null ? null : path1.toString()), s);
    }
}

