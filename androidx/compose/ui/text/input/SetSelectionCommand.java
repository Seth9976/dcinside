package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class SetSelectionCommand implements EditCommand {
    private final int a;
    private final int b;
    public static final int c;

    static {
    }

    public SetSelectionCommand(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        int v = editingBuffer0.i();
        int v1 = s.I(this.a, 0, v);
        int v2 = editingBuffer0.i();
        int v3 = s.I(this.b, 0, v2);
        if(v1 < v3) {
            editingBuffer0.r(v1, v3);
            return;
        }
        editingBuffer0.r(v3, v1);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SetSelectionCommand)) {
            return false;
        }
        return this.a == ((SetSelectionCommand)object0).a ? this.b == ((SetSelectionCommand)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}

