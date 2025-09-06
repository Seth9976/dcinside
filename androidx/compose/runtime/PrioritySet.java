package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.y;
import y4.l;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n4492#2,5:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3392#1:3444,5\n*E\n"})
public final class PrioritySet {
    @l
    private final List a;

    public PrioritySet() {
        this(null, 1, null);
    }

    public PrioritySet(@l List list0) {
        L.p(list0, "list");
        super();
        this.a = list0;
    }

    public PrioritySet(List list0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        this(list0);
    }

    public final void a(int v) {
        if(!this.a.isEmpty() && (((Number)this.a.get(0)).intValue() == v || ((Number)this.a.get(this.a.size() - 1)).intValue() == v)) {
            return;
        }
        int v1 = this.a.size();
        this.a.add(v);
        while(v1 > 0) {
            int v2 = (v1 + 1 >>> 1) - 1;
            int v3 = ((Number)this.a.get(v2)).intValue();
            if(v <= v3) {
                break;
            }
            this.a.set(v1, v3);
            v1 = v2;
        }
        this.a.set(v1, v);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c() {
        return !this.a.isEmpty();
    }

    public final int d() {
        return ((Number)u.B2(this.a)).intValue();
    }

    public final int e() {
        if(this.a.size() > 0) {
            int v = ((Number)this.a.get(0)).intValue();
        label_2:
            while(!this.a.isEmpty() && ((Number)this.a.get(0)).intValue() == v) {
                Object object0 = u.p3(this.a);
                this.a.set(0, object0);
                this.a.remove(this.a.size() - 1);
                int v1 = this.a.size();
                int v2 = this.a.size();
                int v3 = 0;
                while(v3 < v2 >>> 1) {
                    int v4 = ((Number)this.a.get(v3)).intValue();
                    int v5 = (v3 + 1) * 2;
                    int v6 = v5 - 1;
                    int v7 = ((Number)this.a.get(v6)).intValue();
                    if(v5 < v1) {
                        int v8 = ((Number)this.a.get(v5)).intValue();
                        if(v8 > v7) {
                            if(v8 <= v4) {
                                continue label_2;
                            }
                            this.a.set(v3, v8);
                            this.a.set(v5, v4);
                            v3 = v5;
                            continue;
                        }
                    }
                    if(v7 > v4) {
                        this.a.set(v3, v7);
                        this.a.set(v6, v4);
                        v3 = v6;
                        continue;
                    }
                    continue label_2;
                }
            }
            return v;
        }
        ComposerKt.A("Set is empty");
        throw new y();
    }

    public final void f() {
        int v = this.a.size();
        for(int v1 = 0; v1 < v / 2; ++v1) {
            int v2 = (v1 + 1) * 2;
            if(((Number)this.a.get(v1)).intValue() < ((Number)this.a.get(v2 - 1)).intValue() || v2 < v && ((Number)this.a.get(v1)).intValue() < ((Number)this.a.get(v2)).intValue()) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}

