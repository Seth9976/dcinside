package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import y4.l;

@ExperimentalComposeUiApi
public interface PointerInputModifierNode extends DelegatableNode {
    boolean i();

    void n();

    void r(@l PointerEvent arg1, @l PointerEventPass arg2, long arg3);

    boolean z();
}

