package androidx.compose.ui.text.platform.style;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    @l
    private final DrawStyle a;

    public DrawStyleSpan(@l DrawStyle drawStyle0) {
        L.p(drawStyle0, "drawStyle");
        super();
        this.a = drawStyle0;
    }

    @l
    public final DrawStyle a() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    private final Paint.Cap b(int v) {
        if(StrokeCap.g(v, 0)) {
            return Paint.Cap.BUTT;
        }
        if(StrokeCap.g(v, 1)) {
            return Paint.Cap.ROUND;
        }
        return StrokeCap.g(v, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    // 去混淆评级： 低(20)
    private final Paint.Join c(int v) {
        if(StrokeJoin.g(v, 0)) {
            return Paint.Join.MITER;
        }
        if(StrokeJoin.g(v, 1)) {
            return Paint.Join.ROUND;
        }
        return StrokeJoin.g(v, 2) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@m TextPaint textPaint0) {
        if(textPaint0 != null) {
            DrawStyle drawStyle0 = this.a;
            if(L.g(drawStyle0, Fill.a)) {
                textPaint0.setStyle(Paint.Style.FILL);
                return;
            }
            if(drawStyle0 instanceof Stroke) {
                textPaint0.setStyle(Paint.Style.STROKE);
                textPaint0.setStrokeWidth(((Stroke)this.a).g());
                textPaint0.setStrokeMiter(((Stroke)this.a).e());
                textPaint0.setStrokeJoin(this.c(((Stroke)this.a).d()));
                textPaint0.setStrokeCap(this.b(((Stroke)this.a).c()));
                PathEffect pathEffect0 = ((Stroke)this.a).f();
                textPaint0.setPathEffect((pathEffect0 == null ? null : AndroidPathEffect_androidKt.e(pathEffect0)));
            }
        }
    }
}

