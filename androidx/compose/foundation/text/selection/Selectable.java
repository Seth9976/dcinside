package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.V;
import y4.l;
import y4.m;

public interface Selectable {
    @l
    AnnotatedString a();

    @l
    Rect c(int arg1);

    @m
    LayoutCoordinates d();

    @l
    V e(long arg1, long arg2, @m Offset arg3, boolean arg4, @l LayoutCoordinates arg5, @l SelectionAdjustment arg6, @m Selection arg7);

    long f(@l Selection arg1, boolean arg2);

    int g();

    long h();

    @m
    Selection i();

    long j(int arg1);
}

