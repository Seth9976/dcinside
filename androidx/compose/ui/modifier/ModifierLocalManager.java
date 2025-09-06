package androidx.compose.ui.modifier;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Set;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,121:1\n1182#2:122\n1161#2,2:123\n1182#2:125\n1161#2,2:126\n1182#2:128\n1161#2,2:129\n1182#2:131\n1161#2,2:132\n1182#2:164\n1161#2,2:165\n476#3,7:134\n523#3:141\n483#3,4:142\n476#3,7:146\n523#3:153\n483#3,4:154\n728#3,2:187\n728#3,2:189\n728#3,2:191\n728#3,2:193\n728#3,2:195\n728#3,2:197\n1855#4,2:158\n77#5:160\n346#6:161\n237#6,2:162\n239#6,20:167\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:122\n44#1:123,2\n45#1:125\n45#1:126,2\n46#1:128\n46#1:129,2\n47#1:131\n47#1:132,2\n93#1:164\n93#1:165,2\n64#1:134,7\n65#1:141\n64#1:142,4\n77#1:146,7\n78#1:153\n77#1:154,4\n105#1:187,2\n106#1:189,2\n111#1:191,2\n112#1:193,2\n117#1:195,2\n118#1:197,2\n85#1:158,2\n93#1:160\n93#1:161\n93#1:162,2\n93#1:167,20\n*E\n"})
public final class ModifierLocalManager {
    @l
    private final Owner a;
    @l
    private final MutableVector b;
    @l
    private final MutableVector c;
    @l
    private final MutableVector d;
    @l
    private final MutableVector e;
    private boolean f;

    public ModifierLocalManager(@l Owner owner0) {
        L.p(owner0, "owner");
        super();
        this.a = owner0;
        this.b = new MutableVector(new BackwardsCompatNode[16], 0);
        this.c = new MutableVector(new ModifierLocal[16], 0);
        this.d = new MutableVector(new LayoutNode[16], 0);
        this.e = new MutableVector(new ModifierLocal[16], 0);
    }

    @l
    public final Owner a() {
        return this.a;
    }

    public final void b(@l BackwardsCompatNode backwardsCompatNode0, @l ModifierLocal modifierLocal0) {
        L.p(backwardsCompatNode0, "node");
        L.p(modifierLocal0, "key");
        this.b.b(backwardsCompatNode0);
        this.c.b(modifierLocal0);
        this.c();
    }

    public final void c() {
        if(!this.f) {
            this.f = true;
            androidx.compose.ui.modifier.ModifierLocalManager.invalidate.1 modifierLocalManager$invalidate$10 = new a() {
                final ModifierLocalManager e;

                {
                    this.e = modifierLocalManager0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.f();
                }
            };
            this.a.d(modifierLocalManager$invalidate$10);
        }
    }

    private final void d(Node modifier$Node0, ModifierLocal modifierLocal0, Set set0) {
        int v;
        if(!modifier$Node0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node1 = modifier$Node0.getNode().F();
        if(modifier$Node1 == null) {
            DelegatableNodeKt.b(mutableVector0, modifier$Node0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node1);
        }
    label_7:
        while(mutableVector0.O()) {
            Node modifier$Node2 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node2.D() & 0x20) != 0) {
                Node modifier$Node3 = modifier$Node2;
                while(modifier$Node3 != null) {
                    if((modifier$Node3.J() & 0x20) != 0) {
                        if(modifier$Node3 instanceof ModifierLocalNode) {
                            if(((ModifierLocalNode)modifier$Node3) instanceof BackwardsCompatNode && ((BackwardsCompatNode)(((ModifierLocalNode)modifier$Node3))).j0() instanceof ModifierLocalConsumer && ((BackwardsCompatNode)(((ModifierLocalNode)modifier$Node3))).k0().contains(modifierLocal0)) {
                                set0.add(((ModifierLocalNode)modifier$Node3));
                            }
                            v = !((ModifierLocalNode)modifier$Node3).j().a(modifierLocal0);
                        }
                        else {
                            v = 1;
                        }
                        if(v != 0) {
                            goto label_20;
                        }
                        continue label_7;
                    }
                label_20:
                    modifier$Node3 = modifier$Node3.F();
                }
            }
            DelegatableNodeKt.b(mutableVector0, modifier$Node2);
        }
    }

    public final void e(@l BackwardsCompatNode backwardsCompatNode0, @l ModifierLocal modifierLocal0) {
        L.p(backwardsCompatNode0, "node");
        L.p(modifierLocal0, "key");
        LayoutNode layoutNode0 = DelegatableNodeKt.p(backwardsCompatNode0);
        this.d.b(layoutNode0);
        this.e.b(modifierLocal0);
        this.c();
    }

    public final void f() {
        int v = 0;
        this.f = false;
        HashSet hashSet0 = new HashSet();
        MutableVector mutableVector0 = this.d;
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v2];
                ModifierLocal modifierLocal0 = (ModifierLocal)this.e.F()[v2];
                if(layoutNode0.x0().m().Q()) {
                    this.d(layoutNode0.x0().m(), modifierLocal0, hashSet0);
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        this.d.l();
        this.e.l();
        MutableVector mutableVector1 = this.b;
        int v3 = mutableVector1.J();
        if(v3 > 0) {
            Object[] arr_object1 = mutableVector1.F();
            while(true) {
                BackwardsCompatNode backwardsCompatNode0 = (BackwardsCompatNode)arr_object1[v];
                ModifierLocal modifierLocal1 = (ModifierLocal)this.c.F()[v];
                if(backwardsCompatNode0.Q()) {
                    this.d(backwardsCompatNode0, modifierLocal1, hashSet0);
                }
                ++v;
                if(v >= v3) {
                    break;
                }
            }
        }
        this.b.l();
        this.c.l();
        for(Object object0: hashSet0) {
            ((BackwardsCompatNode)object0).r0();
        }
    }

    public final void g(@l BackwardsCompatNode backwardsCompatNode0, @l ModifierLocal modifierLocal0) {
        L.p(backwardsCompatNode0, "node");
        L.p(modifierLocal0, "key");
        this.b.b(backwardsCompatNode0);
        this.c.b(modifierLocal0);
        this.c();
    }
}

