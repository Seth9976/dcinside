package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public class Y extends H {
    @Override  // okio.H
    @m
    public u E(@l e0 e00) {
        L.p(e00, "path");
        return this.Q(e00.G());
    }

    @m
    protected final u Q(@l Path path0) {
        BasicFileAttributes basicFileAttributes0;
        L.p(path0, "nioPath");
        Long long0 = null;
        try {
            basicFileAttributes0 = Files.readAttributes(path0, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        }
        catch(NoSuchFileException | FileSystemException unused_ex) {
            return null;
        }
        Path path1 = basicFileAttributes0.isSymbolicLink() ? Files.readSymbolicLink(path0) : null;
        boolean z = basicFileAttributes0.isRegularFile();
        boolean z1 = basicFileAttributes0.isDirectory();
        e0 e00 = path1 == null ? null : a.i(e0.b, path1, false, 1, null);
        Long long1 = basicFileAttributes0.size();
        FileTime fileTime0 = basicFileAttributes0.creationTime();
        Long long2 = fileTime0 == null ? null : this.R(fileTime0);
        FileTime fileTime1 = basicFileAttributes0.lastModifiedTime();
        Long long3 = fileTime1 == null ? null : this.R(fileTime1);
        FileTime fileTime2 = basicFileAttributes0.lastAccessTime();
        if(fileTime2 != null) {
            long0 = this.R(fileTime2);
        }
        return new u(z, z1, e00, long1, long2, long3, long0, null, 0x80, null);
    }

    private final Long R(FileTime fileTime0) {
        Long long0 = fileTime0.toMillis();
        return long0.longValue() == 0L ? null : long0;
    }

    @Override  // okio.H
    public void g(@l e0 e00, @l e0 e01) {
        L.p(e00, "source");
        L.p(e01, "target");
        try {
            Files.move(e00.G(), e01.G(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        }
        catch(NoSuchFileException noSuchFileException0) {
            throw new FileNotFoundException(noSuchFileException0.getMessage());
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new IOException("atomic move not supported");
        }
    }

    @Override  // okio.H
    public void p(@l e0 e00, @l e0 e01) {
        L.p(e00, "source");
        L.p(e01, "target");
        Files.createSymbolicLink(e00.G(), e01.G(), new FileAttribute[0]);
    }

    @Override  // okio.H
    @l
    public String toString() {
        return "NioSystemFileSystem";
    }
}

