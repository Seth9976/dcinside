package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import y4.l;

@ExperimentalComposeUiApi
public interface LayoutAwareModifierNode extends DelegatableNode {
    void L(long arg1);

    void o(@l LayoutCoordinates arg1);

    void s(@l LookaheadLayoutCoordinates arg1);
}

