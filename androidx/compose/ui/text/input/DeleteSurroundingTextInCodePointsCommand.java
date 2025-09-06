package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    private final int a;
    private final int b;
    public static final int c;

    static {
    }

    public DeleteSurroundingTextInCodePointsCommand(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively.").toString());
        }
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        int v = this.a;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            v3 = editingBuffer0.l() <= v3 + 1 || !EditCommandKt.b(editingBuffer0.d(editingBuffer0.l() - (v3 + 1) - 1), editingBuffer0.d(editingBuffer0.l() - (v3 + 1))) ? v3 + 1 : v3 + 2;
            if(v3 == editingBuffer0.l()) {
                break;
            }
        }
        int v4 = this.b;
        int v5 = 0;
        for(int v1 = 0; v1 < v4; ++v1) {
            v5 = editingBuffer0.k() + (v5 + 1) >= editingBuffer0.i() || !EditCommandKt.b(editingBuffer0.d(editingBuffer0.k() + (v5 + 1) - 1), editingBuffer0.d(editingBuffer0.k() + (v5 + 1))) ? v5 + 1 : v5 + 2;
            if(editingBuffer0.k() + v5 == editingBuffer0.i()) {
                break;
            }
        }
        editingBuffer0.c(editingBuffer0.k(), editingBuffer0.k() + v5);
        editingBuffer0.c(editingBuffer0.l() - v3, editingBuffer0.l());
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
        if(!(object0 instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        return this.a == ((DeleteSurroundingTextInCodePointsCommand)object0).a ? this.b == ((DeleteSurroundingTextInCodePointsCommand)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}

