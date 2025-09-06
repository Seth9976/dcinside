package kotlin.io.path;

import A3.o;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class v extends SimpleFileVisitor {
    @m
    private final o a;
    @m
    private final o b;
    @m
    private final o c;
    @m
    private final o d;

    public v(@m o o0, @m o o1, @m o o2, @m o o3) {
        this.a = o0;
        this.b = o1;
        this.c = o2;
        this.d = o3;
    }

    @l
    public FileVisitResult a(@l Path path0, @m IOException iOException0) {
        FileVisitResult fileVisitResult0;
        L.p(path0, "dir");
        o o0 = this.d;
        if(o0 == null) {
            fileVisitResult0 = super.postVisitDirectory(path0, iOException0);
            L.o(fileVisitResult0, "postVisitDirectory(...)");
        }
        else {
            fileVisitResult0 = u.a(o0.invoke(path0, iOException0));
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.postVisitDirectory(path0, iOException0);
                L.o(fileVisitResult0, "postVisitDirectory(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @l
    public FileVisitResult b(@l Path path0, @l BasicFileAttributes basicFileAttributes0) {
        FileVisitResult fileVisitResult0;
        L.p(path0, "dir");
        L.p(basicFileAttributes0, "attrs");
        o o0 = this.a;
        if(o0 == null) {
            fileVisitResult0 = super.preVisitDirectory(path0, basicFileAttributes0);
            L.o(fileVisitResult0, "preVisitDirectory(...)");
        }
        else {
            fileVisitResult0 = u.a(o0.invoke(path0, basicFileAttributes0));
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.preVisitDirectory(path0, basicFileAttributes0);
                L.o(fileVisitResult0, "preVisitDirectory(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @l
    public FileVisitResult c(@l Path path0, @l BasicFileAttributes basicFileAttributes0) {
        FileVisitResult fileVisitResult0;
        L.p(path0, "file");
        L.p(basicFileAttributes0, "attrs");
        o o0 = this.b;
        if(o0 == null) {
            fileVisitResult0 = super.visitFile(path0, basicFileAttributes0);
            L.o(fileVisitResult0, "visitFile(...)");
        }
        else {
            fileVisitResult0 = u.a(o0.invoke(path0, basicFileAttributes0));
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.visitFile(path0, basicFileAttributes0);
                L.o(fileVisitResult0, "visitFile(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @l
    public FileVisitResult d(@l Path path0, @l IOException iOException0) {
        FileVisitResult fileVisitResult0;
        L.p(path0, "file");
        L.p(iOException0, "exc");
        o o0 = this.c;
        if(o0 == null) {
            fileVisitResult0 = super.visitFileFailed(path0, iOException0);
            L.o(fileVisitResult0, "visitFileFailed(...)");
        }
        else {
            fileVisitResult0 = u.a(o0.invoke(path0, iOException0));
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.visitFileFailed(path0, iOException0);
                L.o(fileVisitResult0, "visitFileFailed(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @Override
    public FileVisitResult postVisitDirectory(Object object0, IOException iOException0) {
        return this.a(((Path)object0), iOException0);
    }

    @Override
    public FileVisitResult preVisitDirectory(Object object0, BasicFileAttributes basicFileAttributes0) {
        return this.b(((Path)object0), basicFileAttributes0);
    }

    @Override
    public FileVisitResult visitFile(Object object0, BasicFileAttributes basicFileAttributes0) {
        return this.c(((Path)object0), basicFileAttributes0);
    }

    @Override
    public FileVisitResult visitFileFailed(Object object0, IOException iOException0) {
        return this.d(((Path)object0), iOException0);
    }
}

