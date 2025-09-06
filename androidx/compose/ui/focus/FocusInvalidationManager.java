package androidx.compose.ui.focus;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class FocusInvalidationManager {
    @l
    private final Function1 a;
    @l
    private Set b;
    @l
    private Set c;
    @l
    private Set d;
    @l
    private final a e;

    public FocusInvalidationManager(@l Function1 function10) {
        L.p(function10, "onRequestApplyChangesListener");
        super();
        this.a = function10;
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new a() {
            final FocusInvalidationManager e;

            {
                this.e = focusInvalidationManager0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                FocusState focusState0;
                FocusInvalidationManager focusInvalidationManager0 = this.e;
                for(Object object0: this.e.d) {
                    FocusPropertiesModifierNode focusPropertiesModifierNode0 = (FocusPropertiesModifierNode)object0;
                    if(!focusPropertiesModifierNode0.getNode().Q()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
                    Node modifier$Node0 = focusPropertiesModifierNode0.getNode().F();
                    if(modifier$Node0 == null) {
                        DelegatableNodeKt.b(mutableVector0, focusPropertiesModifierNode0.getNode());
                    }
                    else {
                        mutableVector0.b(modifier$Node0);
                    }
                label_12:
                    while(mutableVector0.O()) {
                        Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
                        if((modifier$Node1.D() & 0x400) == 0) {
                            DelegatableNodeKt.b(mutableVector0, modifier$Node1);
                        }
                        else {
                            while(modifier$Node1 != null) {
                                if((modifier$Node1.J() & 0x400) != 0) {
                                    if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                                        continue label_12;
                                    }
                                    focusInvalidationManager0.b.add(((FocusTargetModifierNode)modifier$Node1));
                                    break;
                                }
                                modifier$Node1 = modifier$Node1.F();
                            }
                        }
                    }
                }
                this.e.d.clear();
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                FocusInvalidationManager focusInvalidationManager1 = this.e;
                for(Object object1: this.e.c) {
                    FocusEventModifierNode focusEventModifierNode0 = (FocusEventModifierNode)object1;
                    if(focusEventModifierNode0.getNode().Q()) {
                        if(!focusEventModifierNode0.getNode().Q()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
                        Node modifier$Node2 = focusEventModifierNode0.getNode().F();
                        if(modifier$Node2 == null) {
                            DelegatableNodeKt.b(mutableVector1, focusEventModifierNode0.getNode());
                        }
                        else {
                            mutableVector1.b(modifier$Node2);
                        }
                        FocusTargetModifierNode focusTargetModifierNode0 = null;
                        boolean z = true;
                        boolean z1 = false;
                    label_45:
                        while(mutableVector1.O()) {
                            Node modifier$Node3 = (Node)mutableVector1.e0(mutableVector1.J() - 1);
                            if((modifier$Node3.D() & 0x400) == 0) {
                                DelegatableNodeKt.b(mutableVector1, modifier$Node3);
                            }
                            else {
                                while(modifier$Node3 != null) {
                                    if((modifier$Node3.J() & 0x400) != 0) {
                                        if(!(modifier$Node3 instanceof FocusTargetModifierNode)) {
                                            continue label_45;
                                        }
                                        if(focusTargetModifierNode0 != null) {
                                            z1 = true;
                                        }
                                        if(focusInvalidationManager1.b.contains(((FocusTargetModifierNode)modifier$Node3))) {
                                            linkedHashSet0.add(((FocusTargetModifierNode)modifier$Node3));
                                            z = false;
                                        }
                                        focusTargetModifierNode0 = (FocusTargetModifierNode)modifier$Node3;
                                        break;
                                    }
                                    modifier$Node3 = modifier$Node3.F();
                                }
                            }
                        }
                        if(z) {
                            if(z1) {
                                focusState0 = FocusEventModifierNodeKt.a(focusEventModifierNode0);
                            }
                            else {
                                if(focusTargetModifierNode0 != null) {
                                    FocusState focusState1 = focusTargetModifierNode0.k0();
                                    if(focusState1 != null) {
                                        focusState0 = focusState1;
                                        goto label_73;
                                    }
                                }
                                focusState0 = FocusStateImpl.d;
                            }
                        label_73:
                            focusEventModifierNode0.K(focusState0);
                        }
                    }
                }
                this.e.c.clear();
                for(Object object2: this.e.b) {
                    FocusTargetModifierNode focusTargetModifierNode1 = (FocusTargetModifierNode)object2;
                    if(focusTargetModifierNode1.Q()) {
                        focusTargetModifierNode1.m0();
                        if(!L.g(focusTargetModifierNode1.k0(), focusTargetModifierNode1.k0()) || linkedHashSet0.contains(focusTargetModifierNode1)) {
                            FocusEventModifierNodeKt.b(focusTargetModifierNode1);
                        }
                    }
                }
                this.e.b.clear();
                linkedHashSet0.clear();
                if(!this.e.d.isEmpty() || !this.e.c.isEmpty() || !this.e.b.isEmpty()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        };
    }

    public final void d(@l FocusEventModifierNode focusEventModifierNode0) {
        L.p(focusEventModifierNode0, "node");
        this.g(this.c, focusEventModifierNode0);
    }

    public final void e(@l FocusPropertiesModifierNode focusPropertiesModifierNode0) {
        L.p(focusPropertiesModifierNode0, "node");
        this.g(this.d, focusPropertiesModifierNode0);
    }

    public final void f(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "node");
        this.g(this.b, focusTargetModifierNode0);
    }

    private final void g(Set set0, Object object0) {
        if(set0.contains(object0)) {
            return;
        }
        set0.add(object0);
        if(this.b.size() + this.c.size() + this.d.size() == 1) {
            this.a.invoke(this.e);
        }
    }
}

