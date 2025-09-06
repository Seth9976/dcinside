package androidx.compose.ui;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeOwnerScope;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
public interface Modifier {
    public static final class Companion implements Modifier {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @Override  // androidx.compose.ui.Modifier
        public boolean H(@l Function1 function10) {
            L.p(function10, "predicate");
            return false;
        }

        @Override  // androidx.compose.ui.Modifier
        public Object P(Object object0, @l o o0) {
            L.p(o0, "operation");
            return object0;
        }

        @Override  // androidx.compose.ui.Modifier
        public Object U(Object object0, @l o o0) {
            L.p(o0, "operation");
            return object0;
        }

        @Override  // androidx.compose.ui.Modifier
        @l
        public Modifier r0(@l Modifier modifier0) {
            L.p(modifier0, "other");
            return modifier0;
        }

        @Override
        @l
        public String toString() {
            return "Modifier";
        }

        @Override  // androidx.compose.ui.Modifier
        public boolean u(@l Function1 function10) {
            L.p(function10, "predicate");
            return true;
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        @l
        public static Modifier a(@l Modifier modifier0, @l Modifier modifier1) {
            L.p(modifier1, "other");
            return a.a(modifier0, modifier1);
        }
    }

    public interface Element extends Modifier {
        public static final class androidx.compose.ui.Modifier.Element.DefaultImpls {
            @Deprecated
            public static boolean a(@l Element modifier$Element0, @l Function1 function10) {
                L.p(function10, "predicate");
                return b.a(modifier$Element0, function10);
            }

            @Deprecated
            public static boolean b(@l Element modifier$Element0, @l Function1 function10) {
                L.p(function10, "predicate");
                return b.b(modifier$Element0, function10);
            }

            @Deprecated
            public static Object c(@l Element modifier$Element0, Object object0, @l o o0) {
                L.p(o0, "operation");
                return b.c(modifier$Element0, object0, o0);
            }

            @Deprecated
            public static Object d(@l Element modifier$Element0, Object object0, @l o o0) {
                L.p(o0, "operation");
                return b.d(modifier$Element0, object0, o0);
            }

            @Deprecated
            @l
            public static Modifier e(@l Element modifier$Element0, @l Modifier modifier0) {
                L.p(modifier0, "other");
                return a.a(modifier$Element0, modifier0);
            }
        }

        @Override  // androidx.compose.ui.Modifier
        boolean H(@l Function1 arg1);

        @Override  // androidx.compose.ui.Modifier
        Object P(Object arg1, @l o arg2);

        @Override  // androidx.compose.ui.Modifier
        Object U(Object arg1, @l o arg2);

        @Override  // androidx.compose.ui.Modifier
        boolean u(@l Function1 arg1);
    }

    @StabilityInferred(parameters = 0)
    @ExperimentalComposeUiApi
    public static abstract class Node implements DelegatableNode {
        @l
        private Node a;
        private int b;
        private int c;
        @m
        private Node d;
        @m
        private Node e;
        @m
        private ModifierNodeOwnerScope f;
        @m
        private NodeCoordinator g;
        private boolean h;
        private boolean i;
        private boolean j;
        public static final int k = 8;

        static {
        }

        public Node() {
            this.a = this;
        }

        public void A() {
            if(this.j || this.g == null) {
                throw new IllegalStateException("Check failed.");
            }
            this.j = true;
            this.S();
        }

        public void C() {
            if(!this.j || this.g == null) {
                throw new IllegalStateException("Check failed.");
            }
            this.T();
            this.j = false;
        }

        public final int D() {
            return this.c;
        }

        @m
        public final Node F() {
            return this.e;
        }

        @m
        public final NodeCoordinator G() {
            return this.g;
        }

        public final boolean I() {
            return this.h;
        }

        public final int J() {
            return this.b;
        }

        public static void M() {
        }

        @m
        public final ModifierNodeOwnerScope N() {
            return this.f;
        }

        @m
        public final Node O() {
            return this.d;
        }

        public final boolean P() {
            return this.i;
        }

        public final boolean Q() {
            return this.j;
        }

        public final boolean R(int v) {
            return (v & this.J()) != 0;
        }

        public void S() {
        }

        public void T() {
        }

        public void U() {
        }

        public void V() {
            if(!this.j) {
                throw new IllegalStateException("Check failed.");
            }
            this.U();
        }

        public final void W(int v) {
            this.c = v;
        }

        public final void Y(@l Node modifier$Node0) {
            L.p(modifier$Node0, "owner");
            this.a = modifier$Node0;
        }

        public final void Z(@m Node modifier$Node0) {
            this.e = modifier$Node0;
        }

        public final void a0(boolean z) {
            this.h = z;
        }

        public final void b0(int v) {
            this.b = v;
        }

        public final void d0(@m ModifierNodeOwnerScope modifierNodeOwnerScope0) {
            this.f = modifierNodeOwnerScope0;
        }

        public final void e0(@m Node modifier$Node0) {
            this.d = modifier$Node0;
        }

        public final void f0(boolean z) {
            this.i = z;
        }

        public final void g0(@l A3.a a0) {
            L.p(a0, "effect");
            DelegatableNodeKt.q(this).d(a0);
        }

        @Override  // androidx.compose.ui.node.DelegatableNode
        @l
        public final Node getNode() {
            return this.a;
        }

        public void h0(@m NodeCoordinator nodeCoordinator0) {
            this.g = nodeCoordinator0;
        }
    }

    @l
    public static final Companion m0;

    static {
        Modifier.m0 = Companion.a;
    }

    boolean H(@l Function1 arg1);

    Object P(Object arg1, @l o arg2);

    Object U(Object arg1, @l o arg2);

    @l
    Modifier r0(@l Modifier arg1);

    boolean u(@l Function1 arg1);
}

