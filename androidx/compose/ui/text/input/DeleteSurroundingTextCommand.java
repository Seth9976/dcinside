package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class DeleteSurroundingTextCommand implements EditCommand {
    private final int a;
    private final int b;
    public static final int c;

    static {
    }

    public DeleteSurroundingTextCommand(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively.").toString());
        }
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        int v = editingBuffer0.i();
        editingBuffer0.c(editingBuffer0.k(), Math.min(editingBuffer0.k() + this.b, v));
        editingBuffer0.c(Math.max(0, editingBuffer0.l() - this.a), editingBuffer0.l());
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
        if(!(object0 instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        return this.a == ((DeleteSurroundingTextCommand)object0).a ? this.b == ((DeleteSurroundingTextCommand)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}

