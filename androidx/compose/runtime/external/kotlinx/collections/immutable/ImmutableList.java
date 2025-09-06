package androidx.compose.runtime.external.kotlinx.collections.immutable;

import B3.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.collections.c;
import kotlin.jvm.internal.L;
import y4.l;

public interface ImmutableList extends a, ImmutableCollection, List {
    static final class SubList extends c implements ImmutableList {
        @l
        private final ImmutableList c;
        private final int d;
        private final int e;
        private int f;

        public SubList(@l ImmutableList immutableList0, int v, int v1) {
            L.p(immutableList0, "source");
            super();
            this.c = immutableList0;
            this.d = v;
            this.e = v1;
            ListImplementation.c(v, v1, immutableList0.size());
            this.f = v1 - v;
        }

        @Override  // kotlin.collections.c
        public int a() {
            return this.f;
        }

        @Override  // kotlin.collections.c
        public Object get(int v) {
            ListImplementation.a(v, this.f);
            return this.c.get(this.d + v);
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        @l
        public ImmutableList subList(int v, int v1) {
            ListImplementation.c(v, v1, this.f);
            return new SubList(this.c, v + this.d, this.d + v1);
        }

        @Override  // kotlin.collections.c, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public List subList(int v, int v1) {
            return this.subList(v, v1);
        }
    }

    @l
    ImmutableList subList(int arg1, int arg2);

    @Override
    List subList(int arg1, int arg2);
}

