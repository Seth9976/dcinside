package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PainterModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Painter painter0, boolean z, @l Alignment alignment0, @l ContentScale contentScale0, float f, @m ColorFilter colorFilter0) {
        L.p(modifier0, "<this>");
        L.p(painter0, "painter");
        L.p(alignment0, "alignment");
        L.p(contentScale0, "contentScale");
        return modifier0.r0(new PainterModifierNodeElement(painter0, z, alignment0, contentScale0, f, colorFilter0));
    }

    public static Modifier b(Modifier modifier0, Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 4) != 0) {
            alignment0 = Alignment.a.i();
        }
        if((v & 8) != 0) {
            contentScale0 = ContentScale.a.k();
        }
        if((v & 0x20) != 0) {
            colorFilter0 = null;
        }
        return PainterModifierKt.a(modifier0, painter0, ((v & 2) == 0 ? z : true), alignment0, contentScale0, ((v & 16) == 0 ? f : 1.0f), colorFilter0);
    }
}

