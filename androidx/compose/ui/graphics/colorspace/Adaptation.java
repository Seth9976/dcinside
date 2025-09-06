package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.w;
import y4.l;

public abstract class Adaptation {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Adaptation a() {
            return Adaptation.c;
        }

        @l
        public final Adaptation b() {
            return Adaptation.e;
        }

        @l
        public final Adaptation c() {
            return Adaptation.d;
        }
    }

    @l
    private final float[] a;
    @l
    public static final Companion b;
    @l
    private static final Adaptation c;
    @l
    private static final Adaptation d;
    @l
    private static final Adaptation e;

    static {
        Adaptation.b = new Companion(null);
        Adaptation.c = new Adaptation.Companion.Bradford.1(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        Adaptation.d = new Adaptation.Companion.VonKries.1(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
        Adaptation.e = new Adaptation.Companion.Ciecat02.1(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    }

    private Adaptation(float[] arr_f) {
        this.a = arr_f;
    }

    public Adaptation(float[] arr_f, w w0) {
        this(arr_f);
    }

    @l
    public final float[] d() {
        return this.a;
    }
}

