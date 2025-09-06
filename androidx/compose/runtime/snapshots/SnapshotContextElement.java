package androidx.compose.runtime.snapshots;

import A3.o;
import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.coroutines.g.b.a;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalComposeApi
public interface SnapshotContextElement extends b {
    public static final class DefaultImpls {
        public static Object a(@l SnapshotContextElement snapshotContextElement0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return a.a(snapshotContextElement0, object0, o0);
        }

        @m
        public static b b(@l SnapshotContextElement snapshotContextElement0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.b(snapshotContextElement0, g$c0);
        }

        @l
        public static g c(@l SnapshotContextElement snapshotContextElement0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.c(snapshotContextElement0, g$c0);
        }

        @l
        public static g d(@l SnapshotContextElement snapshotContextElement0, @l g g0) {
            L.p(g0, "context");
            return a.d(snapshotContextElement0, g0);
        }
    }

    public static final class Key implements c {
        static final Key a;

        static {
            Key.a = new Key();
        }
    }

    @l
    public static final Key l0;

    static {
        SnapshotContextElement.l0 = Key.a;
    }
}

