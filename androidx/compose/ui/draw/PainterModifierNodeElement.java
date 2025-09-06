package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalComposeUiApi
final class PainterModifierNodeElement extends ModifierNodeElement {
    @l
    private final Painter c;
    private final boolean d;
    @l
    private final Alignment e;
    @l
    private final ContentScale f;
    private final float g;
    @m
    private final ColorFilter h;

    public PainterModifierNodeElement(@l Painter painter0, boolean z, @l Alignment alignment0, @l ContentScale contentScale0, float f, @m ColorFilter colorFilter0) {
        L.p(painter0, "painter");
        L.p(alignment0, "alignment");
        L.p(contentScale0, "contentScale");
        super();
        this.c = painter0;
        this.d = z;
        this.e = alignment0;
        this.f = contentScale0;
        this.g = f;
        this.h = colorFilter0;
    }

    @l
    public final Alignment A() {
        return this.e;
    }

    public final float C() {
        return this.g;
    }

    @m
    public final ColorFilter D() {
        return this.h;
    }

    @l
    public final ContentScale F() {
        return this.f;
    }

    @l
    public final Painter G() {
        return this.c;
    }

    public final boolean I() {
        return this.d;
    }

    @l
    public PainterModifierNode J(@l PainterModifierNode painterModifierNode0) {
        L.p(painterModifierNode0, "node");
        boolean z = painterModifierNode0.o0() != this.d || this.d && !Size.k(painterModifierNode0.n0().i(), this.c.i());
        painterModifierNode0.x0(this.c);
        painterModifierNode0.y0(this.d);
        painterModifierNode0.t0(this.e);
        painterModifierNode0.w0(this.f);
        painterModifierNode0.u0(this.g);
        painterModifierNode0.v0(this.h);
        if(z) {
            LayoutModifierNodeKt.c(painterModifierNode0);
        }
        DrawModifierNodeKt.a(painterModifierNode0);
        return painterModifierNode0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node a() {
        return this.z();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PainterModifierNodeElement)) {
            return false;
        }
        if(!L.g(this.c, ((PainterModifierNodeElement)object0).c)) {
            return false;
        }
        if(this.d != ((PainterModifierNodeElement)object0).d) {
            return false;
        }
        if(!L.g(this.e, ((PainterModifierNodeElement)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((PainterModifierNodeElement)object0).f)) {
            return false;
        }
        return Float.compare(this.g, ((PainterModifierNodeElement)object0).g) == 0 ? L.g(this.h, ((PainterModifierNodeElement)object0).h) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = this.c.hashCode();
        int v1 = this.d;
        if(v1) {
            v1 = 1;
        }
        int v2 = this.e.hashCode();
        int v3 = this.f.hashCode();
        int v4 = Float.floatToIntBits(this.g);
        return this.h == null ? ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F : ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + this.h.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean j() {
        return false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("paint");
        inspectorInfo0.b().c("painter", this.c);
        inspectorInfo0.b().c("sizeToIntrinsics", Boolean.valueOf(this.d));
        inspectorInfo0.b().c("alignment", this.e);
        inspectorInfo0.b().c("contentScale", this.f);
        inspectorInfo0.b().c("alpha", this.g);
        inspectorInfo0.b().c("colorFilter", this.h);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.J(((PainterModifierNode)modifier$Node0));
    }

    @l
    public final Painter p() {
        return this.c;
    }

    public final boolean q() {
        return this.d;
    }

    @l
    public final Alignment r() {
        return this.e;
    }

    @l
    public final ContentScale s() {
        return this.f;
    }

    public final float t() {
        return this.g;
    }

    @Override
    @l
    public String toString() {
        return "PainterModifierNodeElement(painter=" + this.c + ", sizeToIntrinsics=" + this.d + ", alignment=" + this.e + ", contentScale=" + this.f + ", alpha=" + this.g + ", colorFilter=" + this.h + ')';
    }

    @m
    public final ColorFilter w() {
        return this.h;
    }

    @l
    public final PainterModifierNodeElement x(@l Painter painter0, boolean z, @l Alignment alignment0, @l ContentScale contentScale0, float f, @m ColorFilter colorFilter0) {
        L.p(painter0, "painter");
        L.p(alignment0, "alignment");
        L.p(contentScale0, "contentScale");
        return new PainterModifierNodeElement(painter0, z, alignment0, contentScale0, f, colorFilter0);
    }

    public static PainterModifierNodeElement y(PainterModifierNodeElement painterModifierNodeElement0, Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 1) != 0) {
            painter0 = painterModifierNodeElement0.c;
        }
        if((v & 2) != 0) {
            z = painterModifierNodeElement0.d;
        }
        if((v & 4) != 0) {
            alignment0 = painterModifierNodeElement0.e;
        }
        if((v & 8) != 0) {
            contentScale0 = painterModifierNodeElement0.f;
        }
        if((v & 16) != 0) {
            f = painterModifierNodeElement0.g;
        }
        if((v & 0x20) != 0) {
            colorFilter0 = painterModifierNodeElement0.h;
        }
        return painterModifierNodeElement0.x(painter0, z, alignment0, contentScale0, f, colorFilter0);
    }

    @l
    public PainterModifierNode z() {
        return new PainterModifierNode(this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

