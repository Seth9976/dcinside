package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.unit.LayoutDirection;
import y4.l;
import y4.m;

public interface FocusOwner extends FocusManager {
    void a(@l LayoutDirection arg1);

    @l
    Modifier b();

    void c();

    void d(@l FocusTargetModifierNode arg1);

    boolean e(@l RotaryScrollEvent arg1);

    boolean f(@l KeyEvent arg1);

    void g(@l FocusEventModifierNode arg1);

    @l
    LayoutDirection getLayoutDirection();

    void h(boolean arg1, boolean arg2);

    void j(@l FocusPropertiesModifierNode arg1);

    @m
    Rect k();

    void l();
}

