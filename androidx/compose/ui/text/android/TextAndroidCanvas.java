package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas.EdgeType;
import android.graphics.Canvas.VertexMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@SuppressLint({"ClassVerificationFailure"})
public final class TextAndroidCanvas extends Canvas {
    private Canvas a;

    public final void a(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        this.a = canvas0;
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(@l Path path0) {
        L.p(path0, "path");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipOutPath(path0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float f, float f1, float f2, float f3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipOutRect(f, f1, f2, f3);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipOutRect(v, v1, v2, v3);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@l Rect rect0) {
        L.p(rect0, "rect");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipOutRect(rect0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@l RectF rectF0) {
        L.p(rectF0, "rect");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipOutRect(rectF0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipPath(@l Path path0) {
        L.p(path0, "path");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipPath(path0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean clipPath(@l Path path0, @l Region.Op region$Op0) {
        L.p(path0, "path");
        L.p(region$Op0, "op");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipPath(path0, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(float f, float f1, float f2, float f3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(f, f1, f2, f3);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean clipRect(float f, float f1, float f2, float f3, @l Region.Op region$Op0) {
        L.p(region$Op0, "op");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(f, f1, f2, f3, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(v, v1, v2, v3);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(@l Rect rect0) {
        L.p(rect0, "rect");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rect0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean clipRect(@l Rect rect0, @l Region.Op region$Op0) {
        L.p(rect0, "rect");
        L.p(region$Op0, "op");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rect0, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(@l RectF rectF0) {
        L.p(rectF0, "rect");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rectF0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean clipRect(@l RectF rectF0, @l Region.Op region$Op0) {
        L.p(rectF0, "rect");
        L.p(region$Op0, "op");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rectF0, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public void concat(@m Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.concat(matrix0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.disableZ();
    }

    @Override  // android.graphics.Canvas
    public void drawARGB(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawARGB(v, v1, v2, v3);
    }

    @Override  // android.graphics.Canvas
    public void drawArc(float f, float f1, float f2, float f3, float f4, float f5, boolean z, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawArc(f, f1, f2, f3, f4, f5, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawArc(@l RectF rectF0, float f, float f1, boolean z, @l Paint paint0) {
        L.p(rectF0, "oval");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawArc(rectF0, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@l Bitmap bitmap0, float f, float f1, @m Paint paint0) {
        L.p(bitmap0, "bitmap");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@l Bitmap bitmap0, @l Matrix matrix0, @m Paint paint0) {
        L.p(bitmap0, "bitmap");
        L.p(matrix0, "matrix");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, matrix0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@l Bitmap bitmap0, @m Rect rect0, @l Rect rect1, @m Paint paint0) {
        L.p(bitmap0, "bitmap");
        L.p(rect1, "dst");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, rect0, rect1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@l Bitmap bitmap0, @m Rect rect0, @l RectF rectF0, @m Paint paint0) {
        L.p(bitmap0, "bitmap");
        L.p(rectF0, "dst");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, rect0, rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public void drawBitmap(@l int[] arr_v, int v, int v1, float f, float f1, int v2, int v3, boolean z, @m Paint paint0) {
        L.p(arr_v, "colors");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(arr_v, v, v1, f, f1, v2, v3, z, paint0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public void drawBitmap(@l int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5, boolean z, @m Paint paint0) {
        L.p(arr_v, "colors");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(arr_v, v, v1, v2, v3, v4, v5, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmapMesh(@l Bitmap bitmap0, int v, int v1, @l float[] arr_f, int v2, @m int[] arr_v, int v3, @m Paint paint0) {
        L.p(bitmap0, "bitmap");
        L.p(arr_f, "verts");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmapMesh(bitmap0, v, v1, arr_f, v2, arr_v, v3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawCircle(float f, float f1, float f2, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawCircle(f, f1, f2, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawColor(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int v, @l BlendMode blendMode0) {
        L.p(blendMode0, "mode");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v, blendMode0);
    }

    @Override  // android.graphics.Canvas
    public void drawColor(int v, @l PorterDuff.Mode porterDuff$Mode0) {
        L.p(porterDuff$Mode0, "mode");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long v, @l BlendMode blendMode0) {
        L.p(blendMode0, "mode");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v, blendMode0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@l RectF rectF0, float f, float f1, @l RectF rectF1, float f2, float f3, @l Paint paint0) {
        L.p(rectF0, "outer");
        L.p(rectF1, "inner");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawDoubleRoundRect(rectF0, f, f1, rectF1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@l RectF rectF0, @l float[] arr_f, @l RectF rectF1, @l float[] arr_f1, @l Paint paint0) {
        L.p(rectF0, "outer");
        L.p(arr_f, "outerRadii");
        L.p(rectF1, "inner");
        L.p(arr_f1, "innerRadii");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawDoubleRoundRect(rectF0, arr_f, rectF1, arr_f1, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(0x1F)
    public void drawGlyphs(@l int[] arr_v, int v, @l float[] arr_f, int v1, int v2, @l Font font0, @l Paint paint0) {
        L.p(arr_v, "glyphIds");
        L.p(arr_f, "positions");
        L.p(font0, "font");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawGlyphs(arr_v, v, arr_f, v1, v2, font0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawLine(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawLine(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawLines(@l float[] arr_f, int v, int v1, @l Paint paint0) {
        L.p(arr_f, "pts");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawLines(arr_f, v, v1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawLines(@l float[] arr_f, @l Paint paint0) {
        L.p(arr_f, "pts");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawLines(arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawOval(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawOval(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawOval(@l RectF rectF0, @l Paint paint0) {
        L.p(rectF0, "oval");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawOval(rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPaint(@l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPaint(paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(0x1F)
    public void drawPatch(@l NinePatch ninePatch0, @l Rect rect0, @m Paint paint0) {
        L.p(ninePatch0, "patch");
        L.p(rect0, "dst");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPatch(ninePatch0, rect0, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(0x1F)
    public void drawPatch(@l NinePatch ninePatch0, @l RectF rectF0, @m Paint paint0) {
        L.p(ninePatch0, "patch");
        L.p(rectF0, "dst");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPatch(ninePatch0, rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPath(@l Path path0, @l Paint paint0) {
        L.p(path0, "path");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPath(path0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPicture(@l Picture picture0) {
        L.p(picture0, "picture");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPicture(picture0);
    }

    @Override  // android.graphics.Canvas
    public void drawPicture(@l Picture picture0, @l Rect rect0) {
        L.p(picture0, "picture");
        L.p(rect0, "dst");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPicture(picture0, rect0);
    }

    @Override  // android.graphics.Canvas
    public void drawPicture(@l Picture picture0, @l RectF rectF0) {
        L.p(picture0, "picture");
        L.p(rectF0, "dst");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPicture(picture0, rectF0);
    }

    @Override  // android.graphics.Canvas
    public void drawPoint(float f, float f1, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPoint(f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPoints(@m float[] arr_f, int v, int v1, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPoints(arr_f, v, v1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPoints(@l float[] arr_f, @l Paint paint0) {
        L.p(arr_f, "pts");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPoints(arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public void drawPosText(@l String s, @l float[] arr_f, @l Paint paint0) {
        L.p(s, "text");
        L.p(arr_f, "pos");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPosText(s, arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public void drawPosText(@l char[] arr_c, int v, int v1, @l float[] arr_f, @l Paint paint0) {
        L.p(arr_c, "text");
        L.p(arr_f, "pos");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPosText(arr_c, v, v1, arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRGB(int v, int v1, int v2) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRGB(v, v1, v2);
    }

    @Override  // android.graphics.Canvas
    public void drawRect(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRect(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRect(@l Rect rect0, @l Paint paint0) {
        L.p(rect0, "r");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRect(rect0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRect(@l RectF rectF0, @l Paint paint0) {
        L.p(rectF0, "rect");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRect(rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(@l RenderNode renderNode0) {
        L.p(renderNode0, "renderNode");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRenderNode(renderNode0);
    }

    @Override  // android.graphics.Canvas
    public void drawRoundRect(float f, float f1, float f2, float f3, float f4, float f5, @l Paint paint0) {
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRoundRect(f, f1, f2, f3, f4, f5, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRoundRect(@l RectF rectF0, float f, float f1, @l Paint paint0) {
        L.p(rectF0, "rect");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRoundRect(rectF0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@l CharSequence charSequence0, int v, int v1, float f, float f1, @l Paint paint0) {
        L.p(charSequence0, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(charSequence0, v, v1, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@l String s, float f, float f1, @l Paint paint0) {
        L.p(s, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(s, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@l String s, int v, int v1, float f, float f1, @l Paint paint0) {
        L.p(s, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(s, v, v1, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@l char[] arr_c, int v, int v1, float f, float f1, @l Paint paint0) {
        L.p(arr_c, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(arr_c, v, v1, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawTextOnPath(@l String s, @l Path path0, float f, float f1, @l Paint paint0) {
        L.p(s, "text");
        L.p(path0, "path");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextOnPath(s, path0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawTextOnPath(@l char[] arr_c, int v, int v1, @l Path path0, float f, float f1, @l Paint paint0) {
        L.p(arr_c, "text");
        L.p(path0, "path");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextOnPath(arr_c, v, v1, path0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(@l MeasuredText measuredText0, int v, int v1, int v2, int v3, float f, float f1, boolean z, @l Paint paint0) {
        L.p(measuredText0, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextRun(measuredText0, v, v1, v2, v3, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@l CharSequence charSequence0, int v, int v1, int v2, int v3, float f, float f1, boolean z, @l Paint paint0) {
        L.p(charSequence0, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextRun(charSequence0, v, v1, v2, v3, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@l char[] arr_c, int v, int v1, int v2, int v3, float f, float f1, boolean z, @l Paint paint0) {
        L.p(arr_c, "text");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextRun(arr_c, v, v1, v2, v3, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawVertices(@l Canvas.VertexMode canvas$VertexMode0, int v, @l float[] arr_f, int v1, @m float[] arr_f1, int v2, @m int[] arr_v, int v3, @m short[] arr_v1, int v4, int v5, @l Paint paint0) {
        L.p(canvas$VertexMode0, "mode");
        L.p(arr_f, "verts");
        L.p(paint0, "paint");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawVertices(canvas$VertexMode0, v, arr_f, v1, arr_f1, v2, arr_v, v3, arr_v1, v4, v5, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.enableZ();
    }

    @Override  // android.graphics.Canvas
    public boolean getClipBounds(@l Rect rect0) {
        L.p(rect0, "bounds");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        boolean z = canvas0.getClipBounds(rect0);
        if(z) {
            rect0.set(0, 0, rect0.width(), 0x7FFFFFFF);
        }
        return z;
    }

    @Override  // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getDensity();
    }

    @Override  // android.graphics.Canvas
    @m
    public DrawFilter getDrawFilter() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getDrawFilter();
    }

    @Override  // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getHeight();
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public void getMatrix(@l Matrix matrix0) {
        L.p(matrix0, "ctm");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.getMatrix(matrix0);
    }

    @Override  // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getMaximumBitmapHeight();
    }

    @Override  // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getMaximumBitmapWidth();
    }

    @Override  // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getSaveCount();
    }

    @Override  // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getWidth();
    }

    @Override  // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.isOpaque();
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float f, float f1, float f2, float f3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(f, f1, f2, f3);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean quickReject(float f, float f1, float f2, float f3, @l Canvas.EdgeType canvas$EdgeType0) {
        L.p(canvas$EdgeType0, "type");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(f, f1, f2, f3, canvas$EdgeType0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@l Path path0) {
        L.p(path0, "path");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(path0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean quickReject(@l Path path0, @l Canvas.EdgeType canvas$EdgeType0) {
        L.p(path0, "path");
        L.p(canvas$EdgeType0, "type");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(path0, canvas$EdgeType0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@l RectF rectF0) {
        L.p(rectF0, "rect");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(rectF0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public boolean quickReject(@l RectF rectF0, @l Canvas.EdgeType canvas$EdgeType0) {
        L.p(rectF0, "rect");
        L.p(canvas$EdgeType0, "type");
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(rectF0, canvas$EdgeType0);
    }

    @Override  // android.graphics.Canvas
    public void restore() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.restore();
    }

    @Override  // android.graphics.Canvas
    public void restoreToCount(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.restoreToCount(v);
    }

    @Override  // android.graphics.Canvas
    public void rotate(float f) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.rotate(f);
    }

    @Override  // android.graphics.Canvas
    public int save() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.save();
    }

    @Override  // android.graphics.Canvas
    public int saveLayer(float f, float f1, float f2, float f3, @m Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public int saveLayer(float f, float f1, float f2, float f3, @m Paint paint0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(f, f1, f2, f3, paint0, v);
    }

    @Override  // android.graphics.Canvas
    public int saveLayer(@m RectF rectF0, @m Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public int saveLayer(@m RectF rectF0, @m Paint paint0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(rectF0, paint0, v);
    }

    @Override  // android.graphics.Canvas
    public int saveLayerAlpha(float f, float f1, float f2, float f3, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(f, f1, f2, f3, v);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public int saveLayerAlpha(float f, float f1, float f2, float f3, int v, int v1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(f, f1, f2, f3, v, v1);
    }

    @Override  // android.graphics.Canvas
    public int saveLayerAlpha(@m RectF rectF0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(rectF0, v);
    }

    @Override  // android.graphics.Canvas
    @k(message = "Deprecated in Java")
    public int saveLayerAlpha(@m RectF rectF0, int v, int v1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(rectF0, v, v1);
    }

    @Override  // android.graphics.Canvas
    public void scale(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.scale(f, f1);
    }

    @Override  // android.graphics.Canvas
    public void setBitmap(@m Bitmap bitmap0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setBitmap(bitmap0);
    }

    @Override  // android.graphics.Canvas
    public void setDensity(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setDensity(v);
    }

    @Override  // android.graphics.Canvas
    public void setDrawFilter(@m DrawFilter drawFilter0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setDrawFilter(drawFilter0);
    }

    @Override  // android.graphics.Canvas
    public void setMatrix(@m Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setMatrix(matrix0);
    }

    @Override  // android.graphics.Canvas
    public void skew(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.skew(f, f1);
    }

    @Override  // android.graphics.Canvas
    public void translate(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            L.S("nativeCanvas");
            canvas0 = null;
        }
        canvas0.translate(f, f1);
    }
}

