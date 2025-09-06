package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n151#2,3:215\n33#2,4:218\n154#2,2:222\n38#2:224\n156#2:225\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n96#1:209,6\n99#1:215,3\n99#1:218,4\n99#1:222,2\n99#1:224\n99#1:225\n*E\n"})
public final class PointerEvent {
    @l
    private final List a;
    @m
    private final InternalPointerEvent b;
    private final int c;
    private final int d;
    private int e;
    public static final int f = 8;

    static {
    }

    public PointerEvent(@l List list0) {
        L.p(list0, "changes");
        this(list0, null);
    }

    public PointerEvent(@l List list0, @m InternalPointerEvent internalPointerEvent0) {
        L.p(list0, "changes");
        super();
        this.a = list0;
        this.b = internalPointerEvent0;
        MotionEvent motionEvent0 = this.h();
        int v = 0;
        this.c = motionEvent0 == null ? 0 : motionEvent0.getButtonState();
        MotionEvent motionEvent1 = this.h();
        if(motionEvent1 != null) {
            v = motionEvent1.getMetaState();
        }
        this.d = v;
        this.e = this.a();
    }

    private final int a() {
        MotionEvent motionEvent0 = this.h();
        if(motionEvent0 != null) {
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 5: {
                    return 1;
                }
                case 1: 
                case 6: {
                    return 2;
                }
                case 2: 
                case 7: {
                    return 3;
                }
                case 8: {
                    return 6;
                }
                case 9: {
                    return 4;
                }
                case 10: {
                    return 5;
                }
                default: {
                    return 0;
                }
            }
        }
        List list0 = this.a;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
            if(PointerEventKt.e(pointerInputChange0)) {
                return 2;
            }
            if(PointerEventKt.c(pointerInputChange0)) {
                return 1;
            }
        }
        return 3;
    }

    @l
    public final List b() {
        return this.a;
    }

    @l
    public final PointerEvent c(@l List list0, @m MotionEvent motionEvent0) {
        L.p(list0, "changes");
        if(motionEvent0 == null) {
            return new PointerEvent(list0, null);
        }
        if(L.g(motionEvent0, this.h())) {
            return new PointerEvent(list0, this.b);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
            linkedHashMap0.put(PointerId.a(pointerInputChange0.p()), pointerInputChange0);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            boolean z = true;
            PointerInputChange pointerInputChange1 = (PointerInputChange)list0.get(v3);
            long v4 = pointerInputChange1.p();
            long v5 = pointerInputChange1.z();
            long v6 = pointerInputChange1.q();
            long v7 = pointerInputChange1.q();
            boolean z1 = pointerInputChange1.r();
            float f = pointerInputChange1.s();
            int v8 = pointerInputChange1.y();
            if(this.b == null || !this.b.e(pointerInputChange1.p())) {
                z = false;
            }
            arrayList0.add(new PointerInputEventData(v4, v5, v6, v7, z1, f, v8, z, null, 0L, 0x300, null));
        }
        return new PointerEvent(list0, new InternalPointerEvent(linkedHashMap0, new PointerInputEvent(motionEvent0.getEventTime(), arrayList0, motionEvent0)));
    }

    public final int d() {
        return this.c;
    }

    @l
    public final List e() {
        return this.a;
    }

    @m
    public final InternalPointerEvent f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    @m
    public final MotionEvent h() {
        return this.b == null ? null : this.b.b();
    }

    public final int i() {
        return this.e;
    }

    public final void j(int v) {
        this.e = v;
    }
}

