package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
final class j extends SimpleFileVisitor {
    private final boolean a;
    @m
    private A b;
    @l
    private k c;

    public j(boolean z) {
        this.a = z;
        this.c = new k();
    }

    public final boolean a() {
        return this.a;
    }

    @l
    public FileVisitResult b(@l Path path0, @l BasicFileAttributes basicFileAttributes0) {
        L.p(path0, "dir");
        L.p(basicFileAttributes0, "attrs");
        A a0 = new A(path0, basicFileAttributes0.fileKey(), this.b);
        this.c.add(a0);
        FileVisitResult fileVisitResult0 = super.preVisitDirectory(path0, basicFileAttributes0);
        L.o(fileVisitResult0, "preVisitDirectory(...)");
        return fileVisitResult0;
    }

    @l
    public final List c(@l A a0) {
        L.p(a0, "directoryNode");
        this.b = a0;
        Files.walkFileTree(a0.d(), y.a.b(this.a), 1, this);
        this.c.removeFirst();
        List list0 = this.c;
        this.c = new k();
        return list0;
    }

    @l
    public FileVisitResult d(@l Path path0, @l BasicFileAttributes basicFileAttributes0) {
        L.p(path0, "file");
        L.p(basicFileAttributes0, "attrs");
        A a0 = new A(path0, null, this.b);
        this.c.add(a0);
        FileVisitResult fileVisitResult0 = super.visitFile(path0, basicFileAttributes0);
        L.o(fileVisitResult0, "visitFile(...)");
        return fileVisitResult0;
    }

    @Override
    public FileVisitResult preVisitDirectory(Object object0, BasicFileAttributes basicFileAttributes0) {
        return this.b(((Path)object0), basicFileAttributes0);
    }

    @Override
    public FileVisitResult visitFile(Object object0, BasicFileAttributes basicFileAttributes0) {
        return this.d(((Path)object0), basicFileAttributes0);
    }
}

