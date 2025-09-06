package r0;

import com.facebook.common.internal.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class c implements a {
    @s0({"SMAP\nFileBinaryResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileBinaryResource.kt\ncom/facebook/binaryresource/FileBinaryResource$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class r0.c.a {
        private r0.c.a() {
        }

        public r0.c.a(w w0) {
        }

        @l
        @n
        public final c a(@l File file0) {
            L.p(file0, "file");
            return new c(file0, null);
        }

        @m
        @n
        public final c b(@m File file0) {
            return file0 == null ? null : new c(file0, null);
        }
    }

    @l
    private final File a;
    @l
    public static final r0.c.a b;

    static {
        c.b = new r0.c.a(null);
    }

    private c(File file0) {
        this.a = file0;
    }

    public c(File file0, w w0) {
        this(file0);
    }

    @Override  // r0.a
    @l
    public InputStream a() throws IOException {
        return new FileInputStream(this.a);
    }

    @l
    @n
    public static final c b(@l File file0) {
        return c.b.a(file0);
    }

    @m
    @n
    public static final c c(@m File file0) {
        return c.b.b(file0);
    }

    @l
    public final File d() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 == null || !(object0 instanceof c) ? false : L.g(this.a, ((c)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // r0.a
    @l
    public byte[] read() throws IOException {
        byte[] arr_b = g.b(this.a);
        L.o(arr_b, "toByteArray(...)");
        return arr_b;
    }

    @Override  // r0.a
    public long size() {
        return this.a.length();
    }
}

