package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
public final class TrieNode {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TrieNode a() {
            return TrieNode.e;
        }
    }

    private int a;
    @l
    private Object[] b;
    @m
    private MutabilityOwnership c;
    @l
    public static final Companion d;
    @l
    private static final TrieNode e;

    static {
        TrieNode.d = new Companion(null);
        TrieNode.e = new TrieNode(0, new Object[0]);
    }

    public TrieNode(int v, @l Object[] arr_object) {
        L.p(arr_object, "buffer");
        this(v, arr_object, null);
    }

    public TrieNode(int v, @l Object[] arr_object, @m MutabilityOwnership mutabilityOwnership0) {
        L.p(arr_object, "buffer");
        super();
        this.a = v;
        this.b = arr_object;
        this.c = mutabilityOwnership0;
    }

    private final Object A(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        if(this == trieNode0) {
            deltaCounter0.e(this.b.length);
            return TrieNode.e;
        }
        Object[] arr_object = L.g(mutabilityOwnership0, this.c) ? this.b : new Object[this.b.length];
        Object[] arr_object1 = this.b;
        int v1 = 0;
        for(int v = 0; v < arr_object1.length; ++v) {
            if(!trieNode0.f(arr_object1[v])) {
                arr_object[v1] = arr_object1[v];
                ++v1;
            }
        }
        deltaCounter0.e(this.b.length - v1);
        if(v1 == 0) {
            return TrieNode.e;
        }
        if(v1 == 1) {
            return arr_object[0];
        }
        if(v1 == this.b.length) {
            return this;
        }
        if(v1 == arr_object.length) {
            return new TrieNode(0, arr_object, mutabilityOwnership0);
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, v1);
        L.o(arr_object2, "copyOf(this, newSize)");
        return new TrieNode(0, arr_object2, mutabilityOwnership0);
    }

    private final TrieNode B(int v, MutabilityOwnership mutabilityOwnership0) {
        if(this.c == mutabilityOwnership0) {
            this.b = TrieNodeKt.g(this.b, v);
            return this;
        }
        return new TrieNode(0, TrieNodeKt.g(this.b, v), mutabilityOwnership0);
    }

    private final Object C(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        if(this == trieNode0) {
            deltaCounter0.e(this.b.length);
            return this;
        }
        Object[] arr_object = L.g(mutabilityOwnership0, this.c) ? this.b : new Object[Math.min(this.b.length, trieNode0.b.length)];
        Object[] arr_object1 = this.b;
        int v1 = 0;
        for(int v = 0; v < arr_object1.length; ++v) {
            if(trieNode0.f(arr_object1[v])) {
                arr_object[v1] = arr_object1[v];
                ++v1;
            }
        }
        deltaCounter0.e(v1);
        if(v1 == 0) {
            return TrieNode.e;
        }
        if(v1 == 1) {
            return arr_object[0];
        }
        if(v1 == this.b.length) {
            return this;
        }
        if(v1 != trieNode0.b.length) {
            if(v1 == arr_object.length) {
                return new TrieNode(0, arr_object, mutabilityOwnership0);
            }
            Object[] arr_object2 = Arrays.copyOf(arr_object, v1);
            L.o(arr_object2, "copyOf(this, newSize)");
            return new TrieNode(0, arr_object2, mutabilityOwnership0);
        }
        return trieNode0;
    }

    private final TrieNode D(int v, int v1, Object object0, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(this.c == mutabilityOwnership0) {
            Object[] arr_object = this.b;
            arr_object[v] = this.s(v, v1, object0, v2, mutabilityOwnership0);
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(this.b, this.b.length);
        L.o(arr_object1, "copyOf(this, size)");
        arr_object1[v] = this.s(v, v1, object0, v2, mutabilityOwnership0);
        return new TrieNode(this.a, arr_object1, mutabilityOwnership0);
    }

    @l
    public final TrieNode E(int v, Object object0, int v1, @l PersistentHashSetBuilder persistentHashSetBuilder0) {
        L.p(persistentHashSetBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.p(1 << v2)) {
            return this;
        }
        int v3 = this.q(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.J(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.z(object0, persistentHashSetBuilder0) : trieNode0.E(v, object0, v1 + 5, persistentHashSetBuilder0);
            return this.c == persistentHashSetBuilder0.g() || trieNode0 != trieNode1 ? this.I(v3, trieNode1, persistentHashSetBuilder0.g()) : this;
        }
        if(L.g(object0, object1)) {
            persistentHashSetBuilder0.h(persistentHashSetBuilder0.size() - 1);
            return this.G(v3, 1 << v2, persistentHashSetBuilder0.g());
        }
        return this;
    }

    @m
    public final Object F(@l TrieNode trieNode0, int v, @l DeltaCounter deltaCounter0, @l PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode1;
        L.p(trieNode0, "otherNode");
        L.p(deltaCounter0, "intersectionSizeRef");
        L.p(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.e(this.d());
            return TrieNode.e;
        }
        if(v > 30) {
            return this.A(trieNode0, deltaCounter0, persistentHashSetBuilder0.g());
        }
        int v1 = this.a & trieNode0.a;
        if(v1 == 0) {
            return this;
        }
        if(L.g(this.c, persistentHashSetBuilder0.g())) {
            trieNode1 = this;
        }
        else {
            int v2 = this.a;
            Object[] arr_object = Arrays.copyOf(this.b, this.b.length);
            L.o(arr_object, "copyOf(this, size)");
            trieNode1 = new TrieNode(v2, arr_object, persistentHashSetBuilder0.g());
        }
        int v3 = this.a;
        while(v1 != 0) {
            int v4 = Integer.lowestOneBit(v1);
            int v5 = this.q(v4);
            TrieNode trieNode2 = this.b[v5];
            Object object0 = trieNode0.b[trieNode0.q(v4)];
            boolean z = trieNode2 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                L.n(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                trieNode2 = trieNode2.F(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                L.n(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                trieNode2.E((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
            }
            else if(z1) {
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                if(((TrieNode)object0).i((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, v + 5)) {
                    deltaCounter0.e(1);
                    trieNode2 = TrieNode.e;
                }
            }
            else if(L.g(trieNode2, object0)) {
                deltaCounter0.e(1);
                trieNode2 = TrieNode.e;
            }
            if(trieNode2 == TrieNode.e) {
                v3 ^= v4;
            }
            trieNode1.b[v5] = trieNode2;
            v1 ^= v4;
        }
        int v6 = Integer.bitCount(v3);
        if(v3 == 0) {
            return TrieNode.e;
        }
        if(v3 == this.a) {
            return trieNode1.l(this) ? this : trieNode1;
        }
        if(v6 == 1 && v != 0) {
            trieNode1 = trieNode1.b[trieNode1.q(v3)];
            return trieNode1 instanceof TrieNode ? new TrieNode(v3, new Object[]{trieNode1}, persistentHashSetBuilder0.g()) : trieNode1;
        }
        Object[] arr_object1 = new Object[v6];
        Object[] arr_object2 = trieNode1.b;
        int v8 = 0;
        for(int v7 = 0; v7 < arr_object2.length; ++v7) {
            if(arr_object2[v7] != TrieNode.d.a()) {
                arr_object1[v8] = arr_object2[v7];
                ++v8;
            }
        }
        return new TrieNode(v3, arr_object1, persistentHashSetBuilder0.g());
    }

    private final TrieNode G(int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        if(this.c == mutabilityOwnership0) {
            this.b = TrieNodeKt.g(this.b, v);
            this.a ^= v1;
            return this;
        }
        Object[] arr_object = TrieNodeKt.g(this.b, v);
        return new TrieNode(v1 ^ this.a, arr_object, mutabilityOwnership0);
    }

    @m
    public final Object H(@l TrieNode trieNode0, int v, @l DeltaCounter deltaCounter0, @l PersistentHashSetBuilder persistentHashSetBuilder0) {
        L.p(trieNode0, "otherNode");
        L.p(deltaCounter0, "intersectionSizeRef");
        L.p(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.e(this.d());
            return this;
        }
        if(v > 30) {
            return this.C(trieNode0, deltaCounter0, persistentHashSetBuilder0.g());
        }
        int v1 = this.a & trieNode0.a;
        if(v1 == 0) {
            return TrieNode.e;
        }
        TrieNode trieNode1 = !L.g(this.c, persistentHashSetBuilder0.g()) || v1 != this.a ? new TrieNode(v1, new Object[Integer.bitCount(v1)], persistentHashSetBuilder0.g()) : this;
        int v2 = v1;
        int v3 = 0;
        int v4 = 0;
        while(v2 != 0) {
            int v5 = Integer.lowestOneBit(v2);
            TrieNode trieNode2 = this.b[this.q(v5)];
            Object object0 = trieNode0.b[trieNode0.q(v5)];
            boolean z = trieNode2 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                L.n(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                trieNode2 = trieNode2.H(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                L.n(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if(trieNode2.i((object0 == null ? 0 : object0.hashCode()), object0, v + 5)) {
                    deltaCounter0.e(1);
                    trieNode2 = object0;
                }
                else {
                    trieNode2 = TrieNode.e;
                }
            }
            else if(z1) {
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if(((TrieNode)object0).i((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, v + 5)) {
                    deltaCounter0.e(1);
                }
                else {
                    trieNode2 = TrieNode.e;
                }
            }
            else if(L.g(trieNode2, object0)) {
                deltaCounter0.e(1);
            }
            else {
                trieNode2 = TrieNode.e;
            }
            if(trieNode2 != TrieNode.e) {
                v3 |= v5;
            }
            trieNode1.b[v4] = trieNode2;
            ++v4;
            v2 ^= v5;
        }
        int v6 = Integer.bitCount(v3);
        if(v3 == 0) {
            return TrieNode.e;
        }
        if(v3 == v1) {
            if(trieNode1.l(this)) {
                return this;
            }
            return trieNode1.l(trieNode0) ? trieNode0 : trieNode1;
        }
        if(v6 == 1 && v != 0) {
            TrieNode trieNode3 = trieNode1.b[trieNode1.q(v3)];
            return trieNode3 instanceof TrieNode ? new TrieNode(v3, new Object[]{trieNode3}, persistentHashSetBuilder0.g()) : trieNode3;
        }
        Object[] arr_object = new Object[v6];
        Object[] arr_object1 = trieNode1.b;
        int v8 = 0;
        for(int v7 = 0; v7 < arr_object1.length; ++v7) {
            if(arr_object1[v7] != TrieNode.d.a()) {
                arr_object[v8] = arr_object1[v7];
                ++v8;
            }
        }
        return new TrieNode(v3, arr_object, persistentHashSetBuilder0.g());
    }

    private final TrieNode I(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = trieNode0.b;
        if(arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(!(object0 instanceof TrieNode)) {
                if(this.b.length == 1) {
                    trieNode0.a = this.a;
                    return trieNode0;
                }
                trieNode0 = object0;
            }
        }
        if(this.c == mutabilityOwnership0) {
            this.b[v] = trieNode0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(this.b, this.b.length);
        L.o(arr_object1, "copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.a, arr_object1, mutabilityOwnership0);
    }

    private final TrieNode J(int v) {
        Object object0 = this.b[v];
        L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode)object0;
    }

    @l
    public final TrieNode K(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.p(1 << v2)) {
            return this;
        }
        int v3 = this.q(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.J(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.g(object0) : trieNode0.K(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.P(v3, trieNode1);
        }
        return L.g(object0, object1) ? this.L(v3, 1 << v2) : this;
    }

    private final TrieNode L(int v, int v1) {
        Object[] arr_object = TrieNodeKt.g(this.b, v);
        return new TrieNode(v1 ^ this.a, arr_object);
    }

    public final void M(int v) {
        this.a = v;
    }

    public final void N(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.b = arr_object;
    }

    public final void O(@m MutabilityOwnership mutabilityOwnership0) {
        this.c = mutabilityOwnership0;
    }

    private final TrieNode P(int v, TrieNode trieNode0) {
        Object[] arr_object = trieNode0.b;
        if(arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(!(object0 instanceof TrieNode)) {
                if(this.b.length == 1) {
                    trieNode0.a = this.a;
                    return trieNode0;
                }
                trieNode0 = object0;
            }
        }
        Object[] arr_object1 = Arrays.copyOf(this.b, this.b.length);
        L.o(arr_object1, "copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.a, arr_object1);
    }

    @l
    public final TrieNode b(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.p(1 << v2)) {
            return this.c(1 << v2, object0);
        }
        int v3 = this.q(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.J(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.e(object0) : trieNode0.b(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.P(v3, trieNode1);
        }
        return L.g(object0, object1) ? this : this.t(v3, v, object0, v1);
    }

    private final TrieNode c(int v, Object object0) {
        Object[] arr_object = TrieNodeKt.c(this.b, this.q(v), object0);
        return new TrieNode(v | this.a, arr_object);
    }

    private final int d() {
        if(this.a == 0) {
            return this.b.length;
        }
        Object[] arr_object = this.b;
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            v1 += (object0 instanceof TrieNode ? ((TrieNode)object0).d() : 1);
        }
        return v1;
    }

    // 去混淆评级： 低(20)
    private final TrieNode e(Object object0) {
        return this.f(object0) ? this : new TrieNode(0, TrieNodeKt.c(this.b, 0, object0));
    }

    private final boolean f(Object object0) {
        return kotlin.collections.l.s8(this.b, object0);
    }

    private final TrieNode g(Object object0) {
        int v = kotlin.collections.l.If(this.b, object0);
        return v == -1 ? this : this.h(v);
    }

    private final TrieNode h(int v) {
        return new TrieNode(0, TrieNodeKt.g(this.b, v));
    }

    public final boolean i(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.p(1 << v2)) {
            return false;
        }
        int v3 = this.q(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.J(v3);
            return v1 == 30 ? trieNode0.f(object0) : trieNode0.i(v, object0, v1 + 5);
        }
        return L.g(object0, object1);
    }

    public final boolean j(@l TrieNode trieNode0, int v) {
        L.p(trieNode0, "otherNode");
        if(this == trieNode0) {
            return true;
        }
        if(v > 30) {
            Object[] arr_object = trieNode0.b;
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                if(!kotlin.collections.l.s8(this.b, arr_object[v1])) {
                    return false;
                }
            }
            return true;
        }
        int v2 = this.a & trieNode0.a;
        if(v2 != trieNode0.a) {
            return false;
        }
        while(v2 != 0) {
            int v3 = Integer.lowestOneBit(v2);
            Object object0 = this.b[this.q(v3)];
            Object object1 = trieNode0.b[trieNode0.q(v3)];
            boolean z = object0 instanceof TrieNode;
            boolean z1 = object1 instanceof TrieNode;
            if(z && z1) {
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if(!((TrieNode)object0).j(((TrieNode)object1), v + 5)) {
                    return false;
                }
            }
            else if(z) {
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if(!((TrieNode)object0).i((object1 == null ? 0 : object1.hashCode()), object1, v + 5)) {
                    return false;
                }
            }
            else {
                if(z1) {
                    return false;
                }
                if(!L.g(object0, object1)) {
                    return false;
                }
            }
            v2 ^= v3;
        }
        return true;
    }

    private final Object k(int v) {
        return this.b[v];
    }

    private final boolean l(TrieNode trieNode0) {
        if(this == trieNode0) {
            return true;
        }
        if(this.a != trieNode0.a) {
            return false;
        }
        for(int v = 0; v < this.b.length; ++v) {
            if(this.b[v] != trieNode0.b[v]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return this.a;
    }

    @l
    public final Object[] n() {
        return this.b;
    }

    @m
    public final MutabilityOwnership o() {
        return this.c;
    }

    private final boolean p(int v) {
        return (v & this.a) == 0;
    }

    public final int q(int v) {
        return Integer.bitCount(v - 1 & this.a);
    }

    private final TrieNode r(int v, Object object0, int v1, Object object1, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, new Object[]{object1, object0}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        return new TrieNode(1 << v3, new Object[]{this.r(v, object0, v1, object1, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    private final TrieNode s(int v, int v1, Object object0, int v2, MutabilityOwnership mutabilityOwnership0) {
        Object object1 = this.k(v);
        return object1 == null ? this.r(0, null, v1, object0, v2 + 5, mutabilityOwnership0) : this.r(object1.hashCode(), object1, v1, object0, v2 + 5, mutabilityOwnership0);
    }

    private final TrieNode t(int v, int v1, Object object0, int v2) {
        Object[] arr_object = Arrays.copyOf(this.b, this.b.length);
        L.o(arr_object, "copyOf(this, size)");
        arr_object[v] = this.s(v, v1, object0, v2, null);
        return new TrieNode(this.a, arr_object);
    }

    @l
    public final TrieNode u(int v, Object object0, int v1, @l PersistentHashSetBuilder persistentHashSetBuilder0) {
        L.p(persistentHashSetBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.p(1 << v2)) {
            persistentHashSetBuilder0.h(persistentHashSetBuilder0.size() + 1);
            return this.w(1 << v2, object0, persistentHashSetBuilder0.g());
        }
        int v3 = this.q(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.J(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.x(object0, persistentHashSetBuilder0) : trieNode0.u(v, object0, v1 + 5, persistentHashSetBuilder0);
            return trieNode0 == trieNode1 ? this : this.I(v3, trieNode1, persistentHashSetBuilder0.g());
        }
        if(L.g(object0, object1)) {
            return this;
        }
        persistentHashSetBuilder0.h(persistentHashSetBuilder0.size() + 1);
        return this.D(v3, v, object0, v1, persistentHashSetBuilder0.g());
    }

    @l
    public final TrieNode v(@l TrieNode trieNode0, int v, @l DeltaCounter deltaCounter0, @l PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode3;
        int v7;
        Object[] arr_object1;
        TrieNode trieNode2;
        L.p(trieNode0, "otherNode");
        L.p(deltaCounter0, "intersectionSizeRef");
        L.p(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.f(deltaCounter0.d() + this.d());
            return this;
        }
        if(v > 30) {
            return this.y(trieNode0, deltaCounter0, persistentHashSetBuilder0.g());
        }
        int v1 = trieNode0.a | this.a;
        TrieNode trieNode1 = v1 != this.a || !L.g(this.c, persistentHashSetBuilder0.g()) ? new TrieNode(v1, new Object[Integer.bitCount(v1)], persistentHashSetBuilder0.g()) : this;
        int v2 = v1;
        int v3 = 0;
        while(v2 != 0) {
            int v4 = Integer.lowestOneBit(v2);
            int v5 = this.q(v4);
            int v6 = trieNode0.q(v4);
            Object[] arr_object = trieNode1.b;
            if(this.p(v4)) {
                trieNode2 = trieNode0.b[v6];
                arr_object1 = arr_object;
                v7 = v4;
            }
            else if(trieNode0.p(v4)) {
                trieNode2 = this.b[v5];
                arr_object1 = arr_object;
                v7 = v4;
            }
            else {
                Object object0 = this.b[v5];
                Object object1 = trieNode0.b[v6];
                boolean z = object0 instanceof TrieNode;
                boolean z1 = object1 instanceof TrieNode;
                if(z && z1) {
                    L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = ((TrieNode)object0).v(((TrieNode)object1), v + 5, deltaCounter0, persistentHashSetBuilder0);
                    arr_object1 = arr_object;
                    v7 = v4;
                }
                else if(z) {
                    L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode3 = ((TrieNode)object0).u((object1 == null ? 0 : object1.hashCode()), object1, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.f(deltaCounter0.d() + 1);
                    trieNode2 = trieNode3;
                    arr_object1 = arr_object;
                    v7 = v4;
                }
                else if(z1) {
                    L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode3 = ((TrieNode)object1).u((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.f(deltaCounter0.d() + 1);
                    trieNode2 = trieNode3;
                    arr_object1 = arr_object;
                    v7 = v4;
                }
                else if(L.g(object0, object1)) {
                    deltaCounter0.f(deltaCounter0.d() + 1);
                    trieNode2 = object0;
                    arr_object1 = arr_object;
                    v7 = v4;
                }
                else {
                    arr_object1 = arr_object;
                    v7 = v4;
                    trieNode2 = this.r((object0 == null ? 0 : object0.hashCode()), object0, (object1 == null ? 0 : object1.hashCode()), object1, v + 5, persistentHashSetBuilder0.g());
                }
            }
            arr_object1[v3] = trieNode2;
            ++v3;
            v2 ^= v7;
        }
        if(this.l(trieNode1)) {
            return this;
        }
        return trieNode0.l(trieNode1) ? trieNode0 : trieNode1;
    }

    private final TrieNode w(int v, Object object0, MutabilityOwnership mutabilityOwnership0) {
        int v1 = this.q(v);
        if(this.c == mutabilityOwnership0) {
            this.b = TrieNodeKt.c(this.b, v1, object0);
            this.a |= v;
            return this;
        }
        Object[] arr_object = TrieNodeKt.c(this.b, v1, object0);
        return new TrieNode(v | this.a, arr_object, mutabilityOwnership0);
    }

    private final TrieNode x(Object object0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        if(this.f(object0)) {
            return this;
        }
        persistentHashSetBuilder0.h(persistentHashSetBuilder0.size() + 1);
        if(this.c == persistentHashSetBuilder0.g()) {
            this.b = TrieNodeKt.c(this.b, 0, object0);
            return this;
        }
        return new TrieNode(0, TrieNodeKt.c(this.b, 0, object0), persistentHashSetBuilder0.g());
    }

    private final TrieNode y(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        if(this == trieNode0) {
            deltaCounter0.e(this.b.length);
            return this;
        }
        Object[] arr_object = Arrays.copyOf(this.b, this.b.length + trieNode0.b.length);
        L.o(arr_object, "copyOf(this, newSize)");
        Object[] arr_object1 = trieNode0.b;
        int v1 = 0;
        for(int v = 0; v < arr_object1.length; ++v) {
            if(!this.f(arr_object1[v])) {
                arr_object[this.b.length + v1] = arr_object1[v];
                ++v1;
            }
        }
        int v2 = v1 + this.b.length;
        deltaCounter0.e(arr_object.length - v2);
        if(v2 == this.b.length) {
            return this;
        }
        if(v2 == trieNode0.b.length) {
            return trieNode0;
        }
        if(v2 != arr_object.length) {
            arr_object = Arrays.copyOf(arr_object, v2);
            L.o(arr_object, "copyOf(this, newSize)");
        }
        if(L.g(this.c, mutabilityOwnership0)) {
            this.b = arr_object;
            return this;
        }
        return new TrieNode(0, arr_object, mutabilityOwnership0);
    }

    private final TrieNode z(Object object0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        int v = kotlin.collections.l.If(this.b, object0);
        if(v != -1) {
            persistentHashSetBuilder0.h(persistentHashSetBuilder0.size() - 1);
            return this.B(v, persistentHashSetBuilder0.g());
        }
        return this;
    }
}

