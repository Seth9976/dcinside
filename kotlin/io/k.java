package kotlin.io;

import A3.o;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.sequences.m;
import y4.l;

public final class k implements m {
    @s0({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    static abstract class a extends c {
        public a(@l File file0) {
            L.p(file0, "rootDir");
            super(file0);
        }
    }

    final class b extends kotlin.collections.b {
        final class kotlin.io.k.b.a extends a {
            private boolean b;
            @y4.m
            private File[] c;
            private int d;
            private boolean e;
            final b f;

            public kotlin.io.k.b.a(@l File file0) {
                L.p(file0, "rootDir");
                this.f = k$b0;
                super(file0);
            }

            @Override  // kotlin.io.k$c
            @y4.m
            public File b() {
                if(!this.e && this.c == null) {
                    Function1 function10 = k.this.c;
                    if(function10 != null && !((Boolean)function10.invoke(this.a())).booleanValue()) {
                        return null;
                    }
                    File[] arr_file = this.a().listFiles();
                    this.c = arr_file;
                    if(arr_file == null) {
                        o o0 = k.this.e;
                        if(o0 != null) {
                            o0.invoke(this.a(), new kotlin.io.a(this.a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] arr_file1 = this.c;
                if(arr_file1 != null) {
                    int v = this.d;
                    L.m(arr_file1);
                    if(v < arr_file1.length) {
                        File[] arr_file2 = this.c;
                        L.m(arr_file2);
                        int v1 = this.d;
                        this.d = v1 + 1;
                        return arr_file2[v1];
                    }
                }
                if(!this.b) {
                    this.b = true;
                    return this.a();
                }
                Function1 function11 = k.this.d;
                if(function11 != null) {
                    function11.invoke(this.a());
                }
                return null;
            }
        }

        @s0({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        final class kotlin.io.k.b.b extends c {
            private boolean b;
            final b c;

            public kotlin.io.k.b.b(@l File file0) {
                L.p(file0, "rootFile");
                this.c = k$b0;
                super(file0);
            }

            @Override  // kotlin.io.k$c
            @y4.m
            public File b() {
                if(this.b) {
                    return null;
                }
                this.b = true;
                return this.a();
            }
        }

        final class kotlin.io.k.b.c extends a {
            private boolean b;
            @y4.m
            private File[] c;
            private int d;
            final b e;

            public kotlin.io.k.b.c(@l File file0) {
                L.p(file0, "rootDir");
                this.e = k$b0;
                super(file0);
            }

            @Override  // kotlin.io.k$c
            @y4.m
            public File b() {
                if(!this.b) {
                    Function1 function10 = k.this.c;
                    if(function10 != null && !((Boolean)function10.invoke(this.a())).booleanValue()) {
                        return null;
                    }
                    this.b = true;
                    return this.a();
                }
                File[] arr_file = this.c;
                if(arr_file != null) {
                    int v = this.d;
                    L.m(arr_file);
                    if(v >= arr_file.length) {
                        Function1 function11 = k.this.d;
                        if(function11 != null) {
                            function11.invoke(this.a());
                        }
                        return null;
                    }
                }
                if(this.c == null) {
                    File[] arr_file1 = this.a().listFiles();
                    this.c = arr_file1;
                    if(arr_file1 == null) {
                        o o0 = k.this.e;
                        if(o0 != null) {
                            o0.invoke(this.a(), new kotlin.io.a(this.a(), null, "Cannot list files in a directory", 2, null));
                        }
                    }
                    File[] arr_file2 = this.c;
                    if(arr_file2 == null) {
                        goto label_26;
                    }
                    L.m(arr_file2);
                    if(arr_file2.length == 0) {
                    label_26:
                        Function1 function12 = k.this.d;
                        if(function12 != null) {
                            function12.invoke(this.a());
                        }
                        return null;
                    }
                }
                File[] arr_file3 = this.c;
                L.m(arr_file3);
                int v1 = this.d;
                this.d = v1 + 1;
                return arr_file3[v1];
            }
        }

        public final class d {
            public static final int[] a;

            static {
                int[] arr_v = new int[kotlin.io.l.values().length];
                try {
                    arr_v[kotlin.io.l.a.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[kotlin.io.l.b.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                d.a = arr_v;
            }
        }

        @l
        private final ArrayDeque c;
        final k d;

        public b() {
            ArrayDeque arrayDeque0 = new ArrayDeque();
            this.c = arrayDeque0;
            if(k0.a.isDirectory()) {
                arrayDeque0.push(this.f(k0.a));
                return;
            }
            if(k0.a.isFile()) {
                arrayDeque0.push(new kotlin.io.k.b.b(this, k0.a));
                return;
            }
            this.b();
        }

        @Override  // kotlin.collections.b
        protected void a() {
            File file0 = this.g();
            if(file0 != null) {
                this.c(file0);
                return;
            }
            this.b();
        }

        private final a f(File file0) {
            switch(k.this.b) {
                case 1: {
                    return new kotlin.io.k.b.c(this, file0);
                }
                case 2: {
                    return new kotlin.io.k.b.a(this, file0);
                }
                default: {
                    throw new J();
                }
            }
        }

        private final File g() {
            File file0;
            while(true) {
                c k$c0 = (c)this.c.peek();
                if(k$c0 == null) {
                    return null;
                }
                file0 = k$c0.b();
                if(file0 == null) {
                    this.c.pop();
                }
                else {
                    if(L.g(file0, k$c0.a()) || !file0.isDirectory() || this.c.size() >= k.this.f) {
                        break;
                    }
                    a k$a0 = this.f(file0);
                    this.c.push(k$a0);
                }
            }
            return file0;
        }
    }

    static abstract class c {
        @l
        private final File a;

        public c(@l File file0) {
            L.p(file0, "root");
            super();
            this.a = file0;
        }

        @l
        public final File a() {
            return this.a;
        }

        @y4.m
        public abstract File b();
    }

    @l
    private final File a;
    @l
    private final kotlin.io.l b;
    @y4.m
    private final Function1 c;
    @y4.m
    private final Function1 d;
    @y4.m
    private final o e;
    private final int f;

    public k(@l File file0, @l kotlin.io.l l0) {
        L.p(file0, "start");
        L.p(l0, "direction");
        this(file0, l0, null, null, null, 0, 0x20, null);
    }

    public k(File file0, kotlin.io.l l0, int v, w w0) {
        if((v & 2) != 0) {
            l0 = kotlin.io.l.a;
        }
        this(file0, l0);
    }

    private k(File file0, kotlin.io.l l0, Function1 function10, Function1 function11, o o0, int v) {
        this.a = file0;
        this.b = l0;
        this.c = function10;
        this.d = function11;
        this.e = o0;
        this.f = v;
    }

    k(File file0, kotlin.io.l l0, Function1 function10, Function1 function11, o o0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            l0 = kotlin.io.l.a;
        }
        this(file0, l0, function10, function11, o0, ((v1 & 0x20) == 0 ? v : 0x7FFFFFFF));
    }

    @l
    public final k i(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("depth must be positive, but was " + v + '.');
        }
        return new k(this.a, this.b, this.c, this.d, this.e, v);
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        return new b(this);
    }

    @l
    public final k j(@l Function1 function10) {
        L.p(function10, "function");
        return new k(this.a, this.b, function10, this.d, this.e, this.f);
    }

    @l
    public final k k(@l o o0) {
        L.p(o0, "function");
        return new k(this.a, this.b, this.c, this.d, o0, this.f);
    }

    @l
    public final k l(@l Function1 function10) {
        L.p(function10, "function");
        return new k(this.a, this.b, this.c, function10, this.e, this.f);
    }
}

