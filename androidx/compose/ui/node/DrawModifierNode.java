package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import y4.l;

@ExperimentalComposeUiApi
public interface DrawModifierNode extends DelegatableNode {
    void p();

    void v(@l ContentDrawScope arg1);
}

