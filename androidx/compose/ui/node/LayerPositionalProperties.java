package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.L;
import y4.l;

final class LayerPositionalProperties {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private long i;

    public LayerPositionalProperties() {
        this.a = 1.0f;
        this.b = 1.0f;
        this.h = 8.0f;
        this.i = 0x3F0000003F000000L;
    }

    public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
        L.p(graphicsLayerScope0, "scope");
        this.a = graphicsLayerScope0.V();
        this.b = graphicsLayerScope0.b0();
        this.c = graphicsLayerScope0.G();
        this.d = graphicsLayerScope0.F();
        this.e = graphicsLayerScope0.Y();
        this.f = graphicsLayerScope0.N();
        this.g = graphicsLayerScope0.O();
        this.h = graphicsLayerScope0.t();
        this.i = graphicsLayerScope0.a1();
    }

    public final void b(@l LayerPositionalProperties layerPositionalProperties0) {
        L.p(layerPositionalProperties0, "other");
        this.a = layerPositionalProperties0.a;
        this.b = layerPositionalProperties0.b;
        this.c = layerPositionalProperties0.c;
        this.d = layerPositionalProperties0.d;
        this.e = layerPositionalProperties0.e;
        this.f = layerPositionalProperties0.f;
        this.g = layerPositionalProperties0.g;
        this.h = layerPositionalProperties0.h;
        this.i = layerPositionalProperties0.i;
    }

    public final boolean c(@l LayerPositionalProperties layerPositionalProperties0) {
        L.p(layerPositionalProperties0, "other");
        return this.a == layerPositionalProperties0.a && this.b == layerPositionalProperties0.b && this.c == layerPositionalProperties0.c && this.d == layerPositionalProperties0.d && this.e == layerPositionalProperties0.e && this.f == layerPositionalProperties0.f && this.g == layerPositionalProperties0.g && this.h == layerPositionalProperties0.h && TransformOrigin.i(this.i, layerPositionalProperties0.i);
    }
}

