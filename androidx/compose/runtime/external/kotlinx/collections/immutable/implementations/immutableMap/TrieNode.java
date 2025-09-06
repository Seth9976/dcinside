package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import A3.r;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,887:1\n10#2,9:888\n10#2,9:897\n10#2,9:906\n83#3:915\n1#4:916\n26#5:917\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n619#1:888,9\n636#1:897,9\n640#1:906,9\n688#1:915\n688#1:916\n885#1:917\n*E\n"})
public final class TrieNode {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TrieNode a() {
            return TrieNode.f;
        }
    }

    @s0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,887:1\n1#2:888\n*E\n"})
    public static final class ModificationResult {
        @l
        private TrieNode a;
        private final int b;

        public ModificationResult(@l TrieNode trieNode0, int v) {
            L.p(trieNode0, "node");
            super();
            this.a = trieNode0;
            this.b = v;
        }

        @l
        public final TrieNode a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final ModificationResult c(@l Function1 function10) {
            L.p(function10, "operation");
            this.d(((TrieNode)function10.invoke(this.a())));
            return this;
        }

        public final void d(@l TrieNode trieNode0) {
            L.p(trieNode0, "<set-?>");
            this.a = trieNode0;
        }
    }

    private int a;
    private int b;
    @m
    private final MutabilityOwnership c;
    @l
    private Object[] d;
    @l
    public static final Companion e;
    @l
    private static final TrieNode f;

    static {
        TrieNode.e = new Companion(null);
        TrieNode.f = new TrieNode(0, 0, new Object[0]);
    }

    public TrieNode(int v, int v1, @l Object[] arr_object) {
        L.p(arr_object, "buffer");
        this(v, v1, arr_object, null);
    }

    public TrieNode(int v, int v1, @l Object[] arr_object, @m MutabilityOwnership mutabilityOwnership0) {
        L.p(arr_object, "buffer");
        super();
        this.a = v;
        this.b = v1;
        this.c = mutabilityOwnership0;
        this.d = arr_object;
    }

    private final TrieNode A(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = Arrays.copyOf(this.d, this.d.length + trieNode0.d.length);
        L.o(arr_object, "copyOf(this, newSize)");
        int v = this.d.length;
        j j0 = s.B1(s.W1(0, trieNode0.d.length), 2);
        int v1 = j0.g();
        int v2 = j0.h();
        int v3 = j0.i();
        if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
            while(true) {
                if(this.h(trieNode0.d[v1])) {
                    deltaCounter0.f(deltaCounter0.d() + 1);
                }
                else {
                    Object[] arr_object1 = trieNode0.d;
                    arr_object[v] = arr_object1[v1];
                    arr_object[v + 1] = arr_object1[v1 + 1];
                    v += 2;
                }
                if(v1 == v2) {
                    break;
                }
                v1 += v3;
            }
        }
        if(v == this.d.length) {
            return this;
        }
        if(v != trieNode0.d.length) {
            if(v == arr_object.length) {
                return new TrieNode(0, 0, arr_object, mutabilityOwnership0);
            }
            Object[] arr_object2 = Arrays.copyOf(arr_object, v);
            L.o(arr_object2, "copyOf(this, newSize)");
            return new TrieNode(0, 0, arr_object2, mutabilityOwnership0);
        }
        return trieNode0;
    }

    private final TrieNode B(Object object0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v))) {
                    return this.D(v, persistentHashMapBuilder0);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode C(Object object0, Object object1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v)) && L.g(object1, this.a0(v))) {
                    return this.D(v, persistentHashMapBuilder0);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode D(int v, PersistentHashMapBuilder persistentHashMapBuilder0) {
        persistentHashMapBuilder0.q(persistentHashMapBuilder0.size() - 1);
        persistentHashMapBuilder0.o(this.a0(v));
        if(this.d.length == 2) {
            return null;
        }
        if(this.c == persistentHashMapBuilder0.j()) {
            this.d = TrieNodeKt.h(this.d, v);
            return this;
        }
        return new TrieNode(0, 0, TrieNodeKt.h(this.d, v), persistentHashMapBuilder0.j());
    }

    private final TrieNode E(int v, Object object0, Object object1, MutabilityOwnership mutabilityOwnership0) {
        int v1 = this.q(v);
        if(this.c == mutabilityOwnership0) {
            this.d = TrieNodeKt.g(this.d, v1, object0, object1);
            this.a |= v;
            return this;
        }
        Object[] arr_object = TrieNodeKt.g(this.d, v1, object0, object1);
        return new TrieNode(v | this.a, this.b, arr_object, mutabilityOwnership0);
    }

    private final TrieNode F(int v, int v1, int v2, Object object0, Object object1, int v3, MutabilityOwnership mutabilityOwnership0) {
        if(this.c == mutabilityOwnership0) {
            this.d = this.f(v, v1, v2, object0, object1, v3, mutabilityOwnership0);
            this.a ^= v1;
            this.b |= v1;
            return this;
        }
        Object[] arr_object = this.f(v, v1, v2, object0, object1, v3, mutabilityOwnership0);
        return new TrieNode(this.a ^ v1, v1 | this.b, arr_object, mutabilityOwnership0);
    }

    @l
    public final TrieNode G(int v, Object object0, Object object1, int v1, @l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            if(L.g(object0, this.w(v3))) {
                persistentHashMapBuilder0.o(this.a0(v3));
                return this.a0(v3) == object1 ? this : this.P(v3, object1, persistentHashMapBuilder0);
            }
            persistentHashMapBuilder0.q(persistentHashMapBuilder0.size() + 1);
            return this.F(v3, 1 << v2, v, object0, object1, v1, persistentHashMapBuilder0.j());
        }
        if(this.u(1 << v2)) {
            int v4 = this.R(1 << v2);
            TrieNode trieNode0 = this.Q(v4);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.z(object0, object1, persistentHashMapBuilder0) : trieNode0.G(v, object0, object1, v1 + 5, persistentHashMapBuilder0);
            return trieNode0 == trieNode1 ? this : this.O(v4, trieNode1, persistentHashMapBuilder0.j());
        }
        persistentHashMapBuilder0.q(persistentHashMapBuilder0.size() + 1);
        return this.E(1 << v2, object0, object1, persistentHashMapBuilder0.j());
    }

    @l
    public final TrieNode H(@l TrieNode trieNode0, int v, @l DeltaCounter deltaCounter0, @l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(trieNode0, "otherNode");
        L.p(deltaCounter0, "intersectionCounter");
        L.p(persistentHashMapBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.e(this.g());
            return this;
        }
        if(v > 30) {
            return this.A(trieNode0, deltaCounter0, persistentHashMapBuilder0.j());
        }
        int v1 = this.b | trieNode0.b;
        int v2 = this.a & trieNode0.a;
        int v3 = (this.a ^ trieNode0.a) & ~v1;
        while(v2 != 0) {
            int v4 = Integer.lowestOneBit(v2);
            if(L.g(this.w(this.q(v4)), trieNode0.w(trieNode0.q(v4)))) {
                v3 |= v4;
            }
            else {
                v1 |= v4;
            }
            v2 ^= v4;
        }
        if((v1 & v3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        TrieNode trieNode1 = !L.g(this.c, persistentHashMapBuilder0.j()) || this.a != v3 || this.b != v1 ? new TrieNode(v3, v1, new Object[Integer.bitCount(v3) * 2 + Integer.bitCount(v1)]) : this;
        int v5 = 0;
        int v6 = v1;
        int v7 = 0;
        while(v6 != 0) {
            int v8 = Integer.lowestOneBit(v6);
            int v9 = trieNode1.d.length - 1 - v7;
            Object[] arr_object = trieNode1.d;
            arr_object[v9] = this.I(trieNode0, v8, v, deltaCounter0, persistentHashMapBuilder0);
            ++v7;
            v6 ^= v8;
        }
        while(v3 != 0) {
            int v10 = Integer.lowestOneBit(v3);
            if(trieNode0.t(v10)) {
                int v12 = trieNode0.q(v10);
                trieNode1.d[v5 * 2] = trieNode0.w(v12);
                trieNode1.d[v5 * 2 + 1] = trieNode0.a0(v12);
                if(this.t(v10)) {
                    deltaCounter0.f(deltaCounter0.d() + 1);
                }
            }
            else {
                int v11 = this.q(v10);
                trieNode1.d[v5 * 2] = this.w(v11);
                trieNode1.d[v5 * 2 + 1] = this.a0(v11);
            }
            ++v5;
            v3 ^= v10;
        }
        if(this.o(trieNode1)) {
            return this;
        }
        return trieNode0.o(trieNode1) ? trieNode0 : trieNode1;
    }

    private final TrieNode I(TrieNode trieNode0, int v, int v1, DeltaCounter deltaCounter0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        int v2 = 0;
        if(this.u(v)) {
            TrieNode trieNode1 = this.Q(this.R(v));
            if(trieNode0.u(v)) {
                return trieNode1.H(trieNode0.Q(trieNode0.R(v)), v1 + 5, deltaCounter0, persistentHashMapBuilder0);
            }
            if(trieNode0.t(v)) {
                int v3 = trieNode0.q(v);
                Object object0 = trieNode0.w(v3);
                trieNode1 = trieNode1.G((object0 == null ? 0 : object0.hashCode()), object0, trieNode0.a0(v3), v1 + 5, persistentHashMapBuilder0);
                deltaCounter0.f(deltaCounter0.d() + 1);
                return trieNode1;
            }
            return trieNode1;
        }
        if(trieNode0.u(v)) {
            TrieNode trieNode2 = trieNode0.Q(trieNode0.R(v));
            if(this.t(v)) {
                int v4 = this.q(v);
                Object object1 = this.w(v4);
                if(trieNode2.n((object1 == null ? 0 : object1.hashCode()), object1, v1 + 5)) {
                    deltaCounter0.f(deltaCounter0.d() + 1);
                    return trieNode2;
                }
                Object object2 = this.a0(v4);
                return object1 == null ? trieNode2.G(0, null, object2, v1 + 5, persistentHashMapBuilder0) : trieNode2.G(object1.hashCode(), object1, object2, v1 + 5, persistentHashMapBuilder0);
            }
            return trieNode2;
        }
        int v5 = this.q(v);
        Object object3 = this.w(v5);
        Object object4 = this.a0(v5);
        int v6 = trieNode0.q(v);
        Object object5 = trieNode0.w(v6);
        Object object6 = trieNode0.a0(v6);
        int v7 = object3 == null ? 0 : object3.hashCode();
        if(object5 != null) {
            v2 = object5.hashCode();
        }
        return this.x(v7, object3, object4, v2, object5, object6, v1 + 5, persistentHashMapBuilder0.j());
    }

    @m
    public final TrieNode J(int v, Object object0, int v1, @l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            return L.g(object0, this.w(v3)) ? this.L(v3, 1 << v2, persistentHashMapBuilder0) : this;
        }
        if(this.u(1 << v2)) {
            int v4 = this.R(1 << v2);
            TrieNode trieNode0 = this.Q(v4);
            return v1 == 30 ? this.N(trieNode0, trieNode0.B(object0, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.j()) : this.N(trieNode0, trieNode0.J(v, object0, v1 + 5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.j());
        }
        return this;
    }

    @m
    public final TrieNode K(int v, Object object0, Object object1, int v1, @l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            return !L.g(object0, this.w(v3)) || !L.g(object1, this.a0(v3)) ? this : this.L(v3, 1 << v2, persistentHashMapBuilder0);
        }
        if(this.u(1 << v2)) {
            int v4 = this.R(1 << v2);
            TrieNode trieNode0 = this.Q(v4);
            return v1 == 30 ? this.N(trieNode0, trieNode0.C(object0, object1, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.j()) : this.N(trieNode0, trieNode0.K(v, object0, object1, v1 + 5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.j());
        }
        return this;
    }

    private final TrieNode L(int v, int v1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        persistentHashMapBuilder0.q(persistentHashMapBuilder0.size() - 1);
        persistentHashMapBuilder0.o(this.a0(v));
        if(this.d.length == 2) {
            return null;
        }
        if(this.c == persistentHashMapBuilder0.j()) {
            this.d = TrieNodeKt.h(this.d, v);
            this.a ^= v1;
            return this;
        }
        Object[] arr_object = TrieNodeKt.h(this.d, v);
        return new TrieNode(v1 ^ this.a, this.b, arr_object, persistentHashMapBuilder0.j());
    }

    private final TrieNode M(int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = this.d;
        if(arr_object.length == 1) {
            return null;
        }
        if(this.c == mutabilityOwnership0) {
            this.d = TrieNodeKt.i(arr_object, v);
            this.b ^= v1;
            return this;
        }
        Object[] arr_object1 = TrieNodeKt.i(arr_object, v);
        return new TrieNode(this.a, v1 ^ this.b, arr_object1, mutabilityOwnership0);
    }

    private final TrieNode N(TrieNode trieNode0, TrieNode trieNode1, int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        if(trieNode1 == null) {
            return this.M(v, v1, mutabilityOwnership0);
        }
        return this.c == mutabilityOwnership0 || trieNode0 != trieNode1 ? this.O(v, trieNode1, mutabilityOwnership0) : this;
    }

    private final TrieNode O(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = this.d;
        if(arr_object.length == 1 && trieNode0.d.length == 2 && trieNode0.b == 0) {
            trieNode0.a = this.b;
            return trieNode0;
        }
        if(this.c == mutabilityOwnership0) {
            arr_object[v] = trieNode0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        L.o(arr_object1, "copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.a, this.b, arr_object1, mutabilityOwnership0);
    }

    private final TrieNode P(int v, Object object0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        if(this.c == persistentHashMapBuilder0.j()) {
            this.d[v + 1] = object0;
            return this;
        }
        persistentHashMapBuilder0.l(persistentHashMapBuilder0.g() + 1);
        Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
        L.o(arr_object, "copyOf(this, size)");
        arr_object[v + 1] = object0;
        return new TrieNode(this.a, this.b, arr_object, persistentHashMapBuilder0.j());
    }

    @l
    public final TrieNode Q(int v) {
        Object object0 = this.d[v];
        L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode)object0;
    }

    public final int R(int v) {
        return this.d.length - 1 - Integer.bitCount(v - 1 & this.b);
    }

    @m
    public final ModificationResult S(int v, Object object0, Object object1, int v1) {
        ModificationResult trieNode$ModificationResult0;
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            if(L.g(object0, this.w(v3))) {
                return this.a0(v3) == object1 ? null : this.Z(v3, object1).e();
            }
            return this.y(v3, 1 << v2, v, object0, object1, v1).d();
        }
        if(this.u(1 << v2)) {
            int v4 = this.R(1 << v2);
            TrieNode trieNode0 = this.Q(v4);
            if(v1 == 30) {
                trieNode$ModificationResult0 = trieNode0.j(object0, object1);
                if(trieNode$ModificationResult0 == null) {
                    return null;
                }
            }
            else {
                trieNode$ModificationResult0 = trieNode0.S(v, object0, object1, v1 + 5);
                if(trieNode$ModificationResult0 == null) {
                    return null;
                }
            }
            trieNode$ModificationResult0.d(this.Y(v4, 1 << v2, trieNode$ModificationResult0.a()));
            return trieNode$ModificationResult0;
        }
        return this.v(1 << v2, object0, object1).d();
    }

    @m
    public final TrieNode T(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            return L.g(object0, this.w(v3)) ? this.V(v3, 1 << v2) : this;
        }
        if(this.u(1 << v2)) {
            int v4 = this.R(1 << v2);
            TrieNode trieNode0 = this.Q(v4);
            return v1 == 30 ? this.X(trieNode0, trieNode0.k(object0), v4, 1 << v2) : this.X(trieNode0, trieNode0.T(v, object0, v1 + 5), v4, 1 << v2);
        }
        return this;
    }

    @m
    public final TrieNode U(int v, Object object0, Object object1, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            return !L.g(object0, this.w(v3)) || !L.g(object1, this.a0(v3)) ? this : this.V(v3, 1 << v2);
        }
        if(this.u(1 << v2)) {
            int v4 = this.R(1 << v2);
            TrieNode trieNode0 = this.Q(v4);
            return v1 == 30 ? this.X(trieNode0, trieNode0.l(object0, object1), v4, 1 << v2) : this.X(trieNode0, trieNode0.U(v, object0, object1, v1 + 5), v4, 1 << v2);
        }
        return this;
    }

    private final TrieNode V(int v, int v1) {
        Object[] arr_object = this.d;
        if(arr_object.length == 2) {
            return null;
        }
        Object[] arr_object1 = TrieNodeKt.h(arr_object, v);
        return new TrieNode(v1 ^ this.a, this.b, arr_object1);
    }

    private final TrieNode W(int v, int v1) {
        Object[] arr_object = this.d;
        if(arr_object.length == 1) {
            return null;
        }
        Object[] arr_object1 = TrieNodeKt.i(arr_object, v);
        return new TrieNode(this.a, v1 ^ this.b, arr_object1);
    }

    private final TrieNode X(TrieNode trieNode0, TrieNode trieNode1, int v, int v1) {
        if(trieNode1 == null) {
            return this.W(v, v1);
        }
        return trieNode0 == trieNode1 ? this : this.Y(v, v1, trieNode1);
    }

    private final TrieNode Y(int v, int v1, TrieNode trieNode0) {
        Object[] arr_object = trieNode0.d;
        if(arr_object.length == 2 && trieNode0.b == 0) {
            if(this.d.length == 1) {
                trieNode0.a = this.b;
                return trieNode0;
            }
            Object[] arr_object1 = TrieNodeKt.k(this.d, v, this.q(v1), arr_object[0], arr_object[1]);
            return new TrieNode(this.a ^ v1, v1 ^ this.b, arr_object1);
        }
        Object[] arr_object2 = Arrays.copyOf(this.d, this.d.length);
        L.o(arr_object2, "copyOf(this, newSize)");
        arr_object2[v] = trieNode0;
        return new TrieNode(this.a, this.b, arr_object2);
    }

    private final TrieNode Z(int v, Object object0) {
        Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
        L.o(arr_object, "copyOf(this, size)");
        arr_object[v + 1] = object0;
        return new TrieNode(this.a, this.b, arr_object);
    }

    private final void a(r r0, int v, int v1) {
        r0.K0(this, v1, v, this.a, this.b);
        for(int v2 = this.b; v2 != 0; v2 -= v3) {
            int v3 = Integer.lowestOneBit(v2);
            this.Q(this.R(v3)).a(r0, (Integer.numberOfTrailingZeros(v3) << v1) + v, v1 + 5);
        }
    }

    private final Object a0(int v) {
        return this.d[v + 1];
    }

    public final void b(@l r r0) {
        L.p(r0, "visitor");
        this.a(r0, 0, 0);
    }

    private final ModificationResult d() {
        return new ModificationResult(this, 1);
    }

    private final ModificationResult e() {
        return new ModificationResult(this, 0);
    }

    private final Object[] f(int v, int v1, int v2, Object object0, Object object1, int v3, MutabilityOwnership mutabilityOwnership0) {
        Object object2 = this.w(v);
        TrieNode trieNode0 = this.x((object2 == null ? 0 : object2.hashCode()), object2, this.a0(v), v2, object0, object1, v3 + 5, mutabilityOwnership0);
        return TrieNodeKt.j(this.d, v, this.R(v1) + 1, trieNode0);
    }

    private final int g() {
        if(this.b == 0) {
            return this.d.length / 2;
        }
        int v = Integer.bitCount(this.a);
        for(int v1 = v * 2; v1 < this.d.length; ++v1) {
            v += this.Q(v1).g();
        }
        return v;
    }

    private final boolean h(Object object0) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.d[v])) {
                    return true;
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return false;
    }

    private final Object i(Object object0) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v))) {
                    return this.a0(v);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return null;
    }

    private final ModificationResult j(Object object0, Object object1) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v))) {
                    if(object1 == this.a0(v)) {
                        return null;
                    }
                    Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
                    L.o(arr_object, "copyOf(this, size)");
                    arr_object[v + 1] = object1;
                    return new TrieNode(0, 0, arr_object).e();
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return new TrieNode(0, 0, TrieNodeKt.g(this.d, 0, object0, object1)).d();
    }

    private final TrieNode k(Object object0) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v))) {
                    return this.m(v);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode l(Object object0, Object object1) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v)) && L.g(object1, this.a0(v))) {
                    return this.m(v);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode m(int v) {
        return this.d.length == 2 ? null : new TrieNode(0, 0, TrieNodeKt.h(this.d, v));
    }

    public final boolean n(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            return L.g(object0, this.w(this.q(1 << v2)));
        }
        if(this.u(1 << v2)) {
            TrieNode trieNode0 = this.Q(this.R(1 << v2));
            return v1 == 30 ? trieNode0.h(object0) : trieNode0.n(v, object0, v1 + 5);
        }
        return false;
    }

    private final boolean o(TrieNode trieNode0) {
        if(this == trieNode0) {
            return true;
        }
        if(this.b != trieNode0.b) {
            return false;
        }
        if(this.a != trieNode0.a) {
            return false;
        }
        for(int v = 0; v < this.d.length; ++v) {
            if(this.d[v] != trieNode0.d[v]) {
                return false;
            }
        }
        return true;
    }

    public final int p() {
        return Integer.bitCount(this.a);
    }

    public final int q(int v) {
        return Integer.bitCount(v - 1 & this.a) * 2;
    }

    @m
    public final Object r(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.t(1 << v2)) {
            int v3 = this.q(1 << v2);
            return L.g(object0, this.w(v3)) ? this.a0(v3) : null;
        }
        if(this.u(1 << v2)) {
            TrieNode trieNode0 = this.Q(this.R(1 << v2));
            return v1 == 30 ? trieNode0.i(object0) : trieNode0.r(v, object0, v1 + 5);
        }
        return null;
    }

    @l
    public final Object[] s() {
        return this.d;
    }

    public final boolean t(int v) {
        return (v & this.a) != 0;
    }

    private final boolean u(int v) {
        return (v & this.b) != 0;
    }

    private final TrieNode v(int v, Object object0, Object object1) {
        Object[] arr_object = TrieNodeKt.g(this.d, this.q(v), object0, object1);
        return new TrieNode(v | this.a, this.b, arr_object);
    }

    private final Object w(int v) {
        return this.d[v];
    }

    private final TrieNode x(int v, Object object0, Object object1, int v1, Object object2, Object object3, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, 0, new Object[]{object0, object1, object2, object3}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, 0, new Object[]{object2, object3, object0, object1}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, 0, new Object[]{object0, object1, object2, object3}, mutabilityOwnership0);
        }
        return new TrieNode(0, 1 << v3, new Object[]{this.x(v, object0, object1, v1, object2, object3, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    private final TrieNode y(int v, int v1, int v2, Object object0, Object object1, int v3) {
        Object[] arr_object = this.f(v, v1, v2, object0, object1, v3, null);
        return new TrieNode(this.a ^ v1, v1 | this.b, arr_object);
    }

    private final TrieNode z(Object object0, Object object1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        j j0 = s.B1(s.W1(0, this.d.length), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(object0, this.w(v))) {
                    persistentHashMapBuilder0.o(this.a0(v));
                    if(this.c == persistentHashMapBuilder0.j()) {
                        this.d[v + 1] = object1;
                        return this;
                    }
                    persistentHashMapBuilder0.l(persistentHashMapBuilder0.g() + 1);
                    Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
                    L.o(arr_object, "copyOf(this, size)");
                    arr_object[v + 1] = object1;
                    return new TrieNode(0, 0, arr_object, persistentHashMapBuilder0.j());
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        persistentHashMapBuilder0.q(persistentHashMapBuilder0.size() + 1);
        return new TrieNode(0, 0, TrieNodeKt.g(this.d, 0, object0, object1), persistentHashMapBuilder0.j());
    }
}

