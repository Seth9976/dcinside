package androidx.compose.ui.layout;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import y4.l;
import y4.m;

public interface LayoutInfo {
    @l
    Density getDensity();

    int getHeight();

    @l
    LayoutDirection getLayoutDirection();

    @l
    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean o();

    boolean u();

    @l
    LayoutCoordinates v();

    int w();

    @m
    LayoutInfo x();

    @l
    List y();
}

