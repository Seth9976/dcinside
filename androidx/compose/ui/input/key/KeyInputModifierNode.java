package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNode;
import y4.l;

@ExperimentalComposeUiApi
public interface KeyInputModifierNode extends DelegatableNode {
    boolean m(@l KeyEvent arg1);

    boolean w(@l KeyEvent arg1);
}

