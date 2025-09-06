package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.LayoutCoordinates;
import y4.l;

@ExperimentalComposeUiApi
public interface GlobalPositionAwareModifierNode extends DelegatableNode {
    void X(@l LayoutCoordinates arg1);
}

