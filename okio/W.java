package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;
import z3.i;

@s0({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class w extends v {
    @l
    private final v e;

    public w(@l v v0) {
        L.p(v0, "delegate");
        super();
        this.e = v0;
    }

    @Override  // okio.v
    @l
    public m B(@l e0 e00, boolean z) {
        static final class a extends N implements Function1 {
            final w e;

            a(w w0) {
                this.e = w0;
                super(1);
            }

            @l
            public final e0 a(@l e0 e00) {
                L.p(e00, "it");
                return this.e.P(e00, "listRecursively");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((e0)object0));
            }
        }

        L.p(e00, "dir");
        e0 e01 = this.O(e00, "listRecursively", "dir");
        return p.k1(this.e.B(e01, z), new a(this));
    }

    @Override  // okio.v
    @y4.m
    public u E(@l e0 e00) throws IOException {
        L.p(e00, "path");
        e0 e01 = this.O(e00, "metadataOrNull", "path");
        u u0 = this.e.E(e01);
        if(u0 == null) {
            return null;
        }
        return u0.i() == null ? u0 : u.b(u0, false, false, this.P(u0.i(), "metadataOrNull"), null, null, null, null, null, 0xFB, null);
    }

    @Override  // okio.v
    @l
    public t F(@l e0 e00) throws IOException {
        L.p(e00, "file");
        e0 e01 = this.O(e00, "openReadOnly", "file");
        return this.e.F(e01);
    }

    @Override  // okio.v
    @l
    public t H(@l e0 e00, boolean z, boolean z1) throws IOException {
        L.p(e00, "file");
        e0 e01 = this.O(e00, "openReadWrite", "file");
        return this.e.H(e01, z, z1);
    }

    @Override  // okio.v
    @l
    public m0 K(@l e0 e00, boolean z) throws IOException {
        L.p(e00, "file");
        e0 e01 = this.O(e00, "sink", "file");
        return this.e.K(e01, z);
    }

    @Override  // okio.v
    @l
    public o0 M(@l e0 e00) throws IOException {
        L.p(e00, "file");
        e0 e01 = this.O(e00, "source", "file");
        return this.e.M(e01);
    }

    @l
    @i(name = "delegate")
    public final v N() {
        return this.e;
    }

    @l
    public e0 O(@l e0 e00, @l String s, @l String s1) {
        L.p(e00, "path");
        L.p(s, "functionName");
        L.p(s1, "parameterName");
        return e00;
    }

    @l
    public e0 P(@l e0 e00, @l String s) {
        L.p(e00, "path");
        L.p(s, "functionName");
        return e00;
    }

    @Override  // okio.v
    @l
    public m0 e(@l e0 e00, boolean z) throws IOException {
        L.p(e00, "file");
        e0 e01 = this.O(e00, "appendingSink", "file");
        return this.e.e(e01, z);
    }

    @Override  // okio.v
    public void g(@l e0 e00, @l e0 e01) throws IOException {
        L.p(e00, "source");
        L.p(e01, "target");
        e0 e02 = this.O(e00, "atomicMove", "source");
        e0 e03 = this.O(e01, "atomicMove", "target");
        this.e.g(e02, e03);
    }

    @Override  // okio.v
    @l
    public e0 h(@l e0 e00) throws IOException {
        L.p(e00, "path");
        e0 e01 = this.O(e00, "canonicalize", "path");
        return this.P(this.e.h(e01), "canonicalize");
    }

    @Override  // okio.v
    public void n(@l e0 e00, boolean z) throws IOException {
        L.p(e00, "dir");
        e0 e01 = this.O(e00, "createDirectory", "dir");
        this.e.n(e01, z);
    }

    @Override  // okio.v
    public void p(@l e0 e00, @l e0 e01) throws IOException {
        L.p(e00, "source");
        L.p(e01, "target");
        e0 e02 = this.O(e00, "createSymlink", "source");
        e0 e03 = this.O(e01, "createSymlink", "target");
        this.e.p(e02, e03);
    }

    @Override  // okio.v
    public void r(@l e0 e00, boolean z) throws IOException {
        L.p(e00, "path");
        e0 e01 = this.O(e00, "delete", "path");
        this.e.r(e01, z);
    }

    @Override
    @l
    public String toString() {
        return kotlin.jvm.internal.m0.d(this.getClass()).u() + '(' + this.e + ')';
    }

    @Override  // okio.v
    @l
    public List y(@l e0 e00) throws IOException {
        L.p(e00, "dir");
        e0 e01 = this.O(e00, "list", "dir");
        Iterable iterable0 = this.e.y(e01);
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            list0.add(this.P(((e0)object0), "list"));
        }
        kotlin.collections.u.m0(list0);
        return list0;
    }

    @Override  // okio.v
    @y4.m
    public List z(@l e0 e00) {
        L.p(e00, "dir");
        e0 e01 = this.O(e00, "listOrNull", "dir");
        List list0 = this.e.z(e01);
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(this.P(((e0)object0), "listOrNull"));
        }
        kotlin.collections.u.m0(list1);
        return list1;
    }
}

