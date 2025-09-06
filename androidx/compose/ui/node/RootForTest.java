package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.input.TextInputForTests;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import y4.l;
import y4.m;

public interface RootForTest {
    @ExperimentalComposeUiApi
    void f();

    @l
    Density getDensity();

    @l
    SemanticsOwner getSemanticsOwner();

    @ExperimentalTextApi
    @m
    TextInputForTests getTextInputForTests();

    @l
    TextInputService getTextInputService();

    boolean k(@l KeyEvent arg1);
}

