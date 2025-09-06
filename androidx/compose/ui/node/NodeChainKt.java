package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ActualKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,753:1\n1162#2:754\n1#3:755\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n737#1:754\n*E\n"})
public final class NodeChainKt {
    @l
    private static final NodeChainKt.SentinelHead.1 a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;

    static {
        NodeChainKt.SentinelHead.1 nodeChainKt$SentinelHead$10 = new NodeChainKt.SentinelHead.1();
        nodeChainKt$SentinelHead$10.W(-1);
        NodeChainKt.a = nodeChainKt$SentinelHead$10;
    }

    public static final int d(@l Element modifier$Element0, @l Element modifier$Element1) {
        L.p(modifier$Element0, "prev");
        L.p(modifier$Element1, "next");
        if(L.g(modifier$Element0, modifier$Element1)) {
            return 2;
        }
        return ActualKt.a(modifier$Element0, modifier$Element1) ? 1 : 0;
    }

    private static final MutableVector e(Modifier modifier0, MutableVector mutableVector0) {
        MutableVector mutableVector1 = new MutableVector(new Modifier[mutableVector0.J()], 0);
        mutableVector1.b(modifier0);
        while(mutableVector1.O()) {
            Modifier modifier1 = (Modifier)mutableVector1.e0(mutableVector1.J() - 1);
            if(modifier1 instanceof CombinedModifier) {
                mutableVector1.b(((CombinedModifier)modifier1).a());
                mutableVector1.b(((CombinedModifier)modifier1).b());
            }
            else if(modifier1 instanceof Element) {
                mutableVector0.b(modifier1);
            }
            else {
                modifier1.u(new Function1(mutableVector0) {
                    final MutableVector e;

                    {
                        this.e = mutableVector0;
                        super(1);
                    }

                    @l
                    public final Boolean a(@l Element modifier$Element0) {
                        L.p(modifier$Element0, "it");
                        this.e.b(modifier$Element0);
                        return true;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Element)object0));
                    }
                });
            }
        }
        return mutableVector0;
    }

    private static final Node f(ModifierNodeElement modifierNodeElement0, Node modifier$Node0) {
        L.n(modifier$Node0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        return modifierNodeElement0.n(modifier$Node0);
    }
}

