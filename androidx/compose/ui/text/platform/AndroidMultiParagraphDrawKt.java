package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidMultiParagraphDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n33#2,6:98\n33#2,6:104\n33#2,6:110\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n*L\n55#1:98,6\n62#1:104,6\n93#1:110,6\n*E\n"})
public final class AndroidMultiParagraphDrawKt {
    public static final void a(@l MultiParagraph multiParagraph0, @l Canvas canvas0, @l Brush brush0, float f, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v) {
        L.p(multiParagraph0, "$this$drawMultiParagraph");
        L.p(canvas0, "canvas");
        L.p(brush0, "brush");
        canvas0.f();
        if(multiParagraph0.B().size() <= 1) {
            AndroidMultiParagraphDrawKt.c(multiParagraph0, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
        }
        else if(brush0 instanceof SolidColor) {
            AndroidMultiParagraphDrawKt.c(multiParagraph0, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
        }
        else if(brush0 instanceof ShaderBrush) {
            List list0 = multiParagraph0.B();
            int v1 = list0.size();
            float f1 = 0.0f;
            float f2 = 0.0f;
            for(int v2 = 0; v2 < v1; ++v2) {
                ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
                f2 += paragraphInfo0.n().getHeight();
                f1 = Math.max(f1, paragraphInfo0.n().getWidth());
            }
            Shader shader0 = ((ShaderBrush)brush0).c(SizeKt.a(f1, f2));
            Matrix matrix0 = new Matrix();
            shader0.getLocalMatrix(matrix0);
            List list1 = multiParagraph0.B();
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Object object0 = list1.get(v4);
                ((ParagraphInfo)object0).n().w(canvas0, BrushKt.a(shader0), f, shadow0, textDecoration0, drawStyle0, v);
                canvas0.c(0.0f, ((ParagraphInfo)object0).n().getHeight());
                matrix0.setTranslate(0.0f, -((ParagraphInfo)object0).n().getHeight());
                shader0.setLocalMatrix(matrix0);
            }
        }
        canvas0.v();
    }

    public static void b(MultiParagraph multiParagraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
        AndroidMultiParagraphDrawKt.a(multiParagraph0, canvas0, brush0, ((v1 & 4) == 0 ? f : NaNf), ((v1 & 8) == 0 ? shadow0 : null), ((v1 & 16) == 0 ? textDecoration0 : null), ((v1 & 0x20) == 0 ? drawStyle0 : null), ((v1 & 0x40) == 0 ? v : 3));
    }

    private static final void c(MultiParagraph multiParagraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v) {
        List list0 = multiParagraph0.B();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
            paragraphInfo0.n().w(canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
            canvas0.c(0.0f, paragraphInfo0.n().getHeight());
        }
    }
}

