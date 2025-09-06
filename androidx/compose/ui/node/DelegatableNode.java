package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import y4.l;

@ExperimentalComposeUiApi
public interface DelegatableNode {
    @l
    Node getNode();
}

