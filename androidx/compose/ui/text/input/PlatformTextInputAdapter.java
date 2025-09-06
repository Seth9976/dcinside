package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.ExperimentalTextApi;
import y4.l;
import y4.m;

@ExperimentalTextApi
public interface PlatformTextInputAdapter {
    @m
    TextInputForTests a();

    void b();

    @m
    InputConnection c(@l EditorInfo arg1);
}

