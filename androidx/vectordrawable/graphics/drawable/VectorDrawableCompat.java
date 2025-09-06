package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser.PathDataNode;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VectorDrawableCompat extends VectorDrawableCommon {
    static class VClipPath extends VPath {
        VClipPath() {
        }

        VClipPath(VClipPath vectorDrawableCompat$VClipPath0) {
            super(vectorDrawableCompat$VClipPath0);
        }

        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath
        public boolean e() {
            return true;
        }

        public void i(Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0) {
            if(!TypedArrayUtils.r(xmlPullParser0, "pathData")) {
                return;
            }
            TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.I);
            this.j(typedArray0, xmlPullParser0);
            typedArray0.recycle();
        }

        private void j(TypedArray typedArray0, XmlPullParser xmlPullParser0) {
            String s = typedArray0.getString(0);
            if(s != null) {
                this.b = s;
            }
            String s1 = typedArray0.getString(1);
            if(s1 != null) {
                this.a = PathParser.d(s1);
            }
            this.c = TypedArrayUtils.k(typedArray0, xmlPullParser0, "fillType", 2, 0);
        }
    }

    static class VFullPath extends VPath {
        private int[] f;
        ComplexColorCompat g;
        float h;
        ComplexColorCompat i;
        float j;
        float k;
        float l;
        float m;
        float n;
        Paint.Cap o;
        Paint.Join p;
        float q;

        VFullPath() {
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
        }

        VFullPath(VFullPath vectorDrawableCompat$VFullPath0) {
            super(vectorDrawableCompat$VFullPath0);
            this.f = vectorDrawableCompat$VFullPath0.f;
            this.g = vectorDrawableCompat$VFullPath0.g;
            this.h = vectorDrawableCompat$VFullPath0.h;
            this.j = vectorDrawableCompat$VFullPath0.j;
            this.i = vectorDrawableCompat$VFullPath0.i;
            this.c = vectorDrawableCompat$VFullPath0.c;
            this.k = vectorDrawableCompat$VFullPath0.k;
            this.l = vectorDrawableCompat$VFullPath0.l;
            this.m = vectorDrawableCompat$VFullPath0.m;
            this.n = vectorDrawableCompat$VFullPath0.n;
            this.o = vectorDrawableCompat$VFullPath0.o;
            this.p = vectorDrawableCompat$VFullPath0.p;
            this.q = vectorDrawableCompat$VFullPath0.q;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject
        public boolean a() {
            return this.i.i() || this.g.i();
        }

        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject
        public boolean b(int[] arr_v) {
            boolean z = this.i.j(arr_v);
            return this.g.j(arr_v) | z;
        }

        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath
        public void c(Resources.Theme resources$Theme0) {
        }

        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath
        public boolean d() {
            return this.f != null;
        }

        float getFillAlpha() {
            return this.k;
        }

        @ColorInt
        int getFillColor() {
            return this.i.e();
        }

        float getStrokeAlpha() {
            return this.j;
        }

        @ColorInt
        int getStrokeColor() {
            return this.g.e();
        }

        float getStrokeWidth() {
            return this.h;
        }

        float getTrimPathEnd() {
            return this.m;
        }

        float getTrimPathOffset() {
            return this.n;
        }

        float getTrimPathStart() {
            return this.l;
        }

        private Paint.Cap i(int v, Paint.Cap paint$Cap0) {
            switch(v) {
                case 0: {
                    return Paint.Cap.BUTT;
                }
                case 1: {
                    return Paint.Cap.ROUND;
                }
                case 2: {
                    return Paint.Cap.SQUARE;
                }
                default: {
                    return paint$Cap0;
                }
            }
        }

        private Paint.Join j(int v, Paint.Join paint$Join0) {
            switch(v) {
                case 0: {
                    return Paint.Join.MITER;
                }
                case 1: {
                    return Paint.Join.ROUND;
                }
                case 2: {
                    return Paint.Join.BEVEL;
                }
                default: {
                    return paint$Join0;
                }
            }
        }

        public void k(Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0) {
            TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.t);
            this.l(typedArray0, xmlPullParser0, resources$Theme0);
            typedArray0.recycle();
        }

        private void l(TypedArray typedArray0, XmlPullParser xmlPullParser0, Resources.Theme resources$Theme0) {
            this.f = null;
            if(!TypedArrayUtils.r(xmlPullParser0, "pathData")) {
                return;
            }
            String s = typedArray0.getString(0);
            if(s != null) {
                this.b = s;
            }
            String s1 = typedArray0.getString(2);
            if(s1 != null) {
                this.a = PathParser.d(s1);
            }
            this.i = TypedArrayUtils.i(typedArray0, xmlPullParser0, resources$Theme0, "fillColor", 1, 0);
            this.k = TypedArrayUtils.j(typedArray0, xmlPullParser0, "fillAlpha", 12, this.k);
            this.o = this.i(TypedArrayUtils.k(typedArray0, xmlPullParser0, "strokeLineCap", 8, -1), this.o);
            this.p = this.j(TypedArrayUtils.k(typedArray0, xmlPullParser0, "strokeLineJoin", 9, -1), this.p);
            this.q = TypedArrayUtils.j(typedArray0, xmlPullParser0, "strokeMiterLimit", 10, this.q);
            this.g = TypedArrayUtils.i(typedArray0, xmlPullParser0, resources$Theme0, "strokeColor", 3, 0);
            this.j = TypedArrayUtils.j(typedArray0, xmlPullParser0, "strokeAlpha", 11, this.j);
            this.h = TypedArrayUtils.j(typedArray0, xmlPullParser0, "strokeWidth", 4, this.h);
            this.m = TypedArrayUtils.j(typedArray0, xmlPullParser0, "trimPathEnd", 6, this.m);
            this.n = TypedArrayUtils.j(typedArray0, xmlPullParser0, "trimPathOffset", 7, this.n);
            this.l = TypedArrayUtils.j(typedArray0, xmlPullParser0, "trimPathStart", 5, this.l);
            this.c = TypedArrayUtils.k(typedArray0, xmlPullParser0, "fillType", 13, this.c);
        }

        void setFillAlpha(float f) {
            this.k = f;
        }

        void setFillColor(int v) {
            this.i.k(v);
        }

        void setStrokeAlpha(float f) {
            this.j = f;
        }

        void setStrokeColor(int v) {
            this.g.k(v);
        }

        void setStrokeWidth(float f) {
            this.h = f;
        }

        void setTrimPathEnd(float f) {
            this.m = f;
        }

        void setTrimPathOffset(float f) {
            this.n = f;
        }

        void setTrimPathStart(float f) {
            this.l = f;
        }
    }

    static class VGroup extends VObject {
        final Matrix a;
        final ArrayList b;
        float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public VGroup() {
            super(null);
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public VGroup(VGroup vectorDrawableCompat$VGroup0, ArrayMap arrayMap0) {
            super(null);
            VFullPath vectorDrawableCompat$VFullPath0;
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix0 = new Matrix();
            this.j = matrix0;
            this.c = vectorDrawableCompat$VGroup0.c;
            this.d = vectorDrawableCompat$VGroup0.d;
            this.e = vectorDrawableCompat$VGroup0.e;
            this.f = vectorDrawableCompat$VGroup0.f;
            this.g = vectorDrawableCompat$VGroup0.g;
            this.h = vectorDrawableCompat$VGroup0.h;
            this.i = vectorDrawableCompat$VGroup0.i;
            this.l = vectorDrawableCompat$VGroup0.l;
            String s = vectorDrawableCompat$VGroup0.m;
            this.m = s;
            this.k = vectorDrawableCompat$VGroup0.k;
            if(s != null) {
                arrayMap0.put(s, this);
            }
            matrix0.set(vectorDrawableCompat$VGroup0.j);
            ArrayList arrayList0 = vectorDrawableCompat$VGroup0.b;
            for(int v = 0; v < arrayList0.size(); ++v) {
                Object object0 = arrayList0.get(v);
                if(object0 instanceof VGroup) {
                    VGroup vectorDrawableCompat$VGroup1 = new VGroup(((VGroup)object0), arrayMap0);
                    this.b.add(vectorDrawableCompat$VGroup1);
                }
                else {
                    if(object0 instanceof VFullPath) {
                        vectorDrawableCompat$VFullPath0 = new VFullPath(((VFullPath)object0));
                    }
                    else {
                        if(!(object0 instanceof VClipPath)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        vectorDrawableCompat$VFullPath0 = new VClipPath(((VClipPath)object0));
                    }
                    this.b.add(vectorDrawableCompat$VFullPath0);
                    String s1 = vectorDrawableCompat$VFullPath0.b;
                    if(s1 != null) {
                        arrayMap0.put(s1, vectorDrawableCompat$VFullPath0);
                    }
                }
            }
        }

        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject
        public boolean a() {
            for(int v = 0; v < this.b.size(); ++v) {
                if(((VObject)this.b.get(v)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject
        public boolean b(int[] arr_v) {
            boolean z = false;
            for(int v = 0; v < this.b.size(); ++v) {
                z |= ((VObject)this.b.get(v)).b(arr_v);
            }
            return z;
        }

        public void c(Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0) {
            TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.k);
            this.e(typedArray0, xmlPullParser0);
            typedArray0.recycle();
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray0, XmlPullParser xmlPullParser0) {
            this.l = null;
            this.c = TypedArrayUtils.j(typedArray0, xmlPullParser0, "rotation", 5, this.c);
            this.d = typedArray0.getFloat(1, this.d);
            this.e = typedArray0.getFloat(2, this.e);
            this.f = TypedArrayUtils.j(typedArray0, xmlPullParser0, "scaleX", 3, this.f);
            this.g = TypedArrayUtils.j(typedArray0, xmlPullParser0, "scaleY", 4, this.g);
            this.h = TypedArrayUtils.j(typedArray0, xmlPullParser0, "translateX", 6, this.h);
            this.i = TypedArrayUtils.j(typedArray0, xmlPullParser0, "translateY", 7, this.i);
            String s = typedArray0.getString(0);
            if(s != null) {
                this.m = s;
            }
            this.d();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if(f != this.d) {
                this.d = f;
                this.d();
            }
        }

        public void setPivotY(float f) {
            if(f != this.e) {
                this.e = f;
                this.d();
            }
        }

        public void setRotation(float f) {
            if(f != this.c) {
                this.c = f;
                this.d();
            }
        }

        public void setScaleX(float f) {
            if(f != this.f) {
                this.f = f;
                this.d();
            }
        }

        public void setScaleY(float f) {
            if(f != this.g) {
                this.g = f;
                this.d();
            }
        }

        public void setTranslateX(float f) {
            if(f != this.h) {
                this.h = f;
                this.d();
            }
        }

        public void setTranslateY(float f) {
            if(f != this.i) {
                this.i = f;
                this.d();
            }
        }
    }

    static abstract class VObject {
        private VObject() {
        }

        VObject(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.1 vectorDrawableCompat$10) {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] arr_v) {
            return false;
        }
    }

    static abstract class VPath extends VObject {
        protected PathDataNode[] a;
        String b;
        int c;
        int d;
        protected static final int e;

        public VPath() {
            super(null);
            this.a = null;
            this.c = 0;
        }

        public VPath(VPath vectorDrawableCompat$VPath0) {
            super(null);
            this.c = 0;
            this.b = vectorDrawableCompat$VPath0.b;
            this.d = vectorDrawableCompat$VPath0.d;
            this.a = PathParser.f(vectorDrawableCompat$VPath0.a);
        }

        public void c(Resources.Theme resources$Theme0) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(PathDataNode[] arr_pathParser$PathDataNode) {
            String s = " ";
            for(int v = 0; v < arr_pathParser$PathDataNode.length; ++v) {
                s = s + arr_pathParser$PathDataNode[v].a + ":";
                float[] arr_f = arr_pathParser$PathDataNode[v].b;
                for(int v1 = 0; v1 < arr_f.length; ++v1) {
                    s = s + arr_f[v1] + ",";
                }
            }
            return s;
        }

        public void g(int v) {
            String s = "";
            for(int v1 = 0; v1 < v; ++v1) {
                s = s + "    ";
            }
            Log.v("VectorDrawableCompat", s + "current path is :" + this.b + " pathData is " + this.f(this.a));
        }

        public PathDataNode[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void h(Path path0) {
            path0.reset();
            PathDataNode[] arr_pathParser$PathDataNode = this.a;
            if(arr_pathParser$PathDataNode != null) {
                PathDataNode.k(arr_pathParser$PathDataNode, path0);
            }
        }

        public void setPathData(PathDataNode[] arr_pathParser$PathDataNode) {
            if(!PathParser.b(this.a, arr_pathParser$PathDataNode)) {
                this.a = PathParser.f(arr_pathParser$PathDataNode);
                return;
            }
            PathParser.m(this.a, arr_pathParser$PathDataNode);
        }
    }

    static class VPathRenderer {
        private final Path a;
        private final Path b;
        private final Matrix c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final VGroup h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final ArrayMap p;
        private static final Matrix q;

        static {
            VPathRenderer.q = new Matrix();
        }

        public VPathRenderer() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0xFF;
            this.n = null;
            this.o = null;
            this.p = new ArrayMap();
            this.h = new VGroup();
            this.a = new Path();
            this.b = new Path();
        }

        public VPathRenderer(VPathRenderer vectorDrawableCompat$VPathRenderer0) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0xFF;
            this.n = null;
            this.o = null;
            ArrayMap arrayMap0 = new ArrayMap();
            this.p = arrayMap0;
            this.h = new VGroup(vectorDrawableCompat$VPathRenderer0.h, arrayMap0);
            this.a = new Path(vectorDrawableCompat$VPathRenderer0.a);
            this.b = new Path(vectorDrawableCompat$VPathRenderer0.b);
            this.i = vectorDrawableCompat$VPathRenderer0.i;
            this.j = vectorDrawableCompat$VPathRenderer0.j;
            this.k = vectorDrawableCompat$VPathRenderer0.k;
            this.l = vectorDrawableCompat$VPathRenderer0.l;
            this.g = vectorDrawableCompat$VPathRenderer0.g;
            this.m = vectorDrawableCompat$VPathRenderer0.m;
            this.n = vectorDrawableCompat$VPathRenderer0.n;
            String s = vectorDrawableCompat$VPathRenderer0.n;
            if(s != null) {
                arrayMap0.put(s, this);
            }
            this.o = vectorDrawableCompat$VPathRenderer0.o;
        }

        private static float a(float f, float f1, float f2, float f3) [...] // Inlined contents

        public void b(Canvas canvas0, int v, int v1, ColorFilter colorFilter0) {
            this.c(this.h, VPathRenderer.q, canvas0, v, v1, colorFilter0);
        }

        private void c(VGroup vectorDrawableCompat$VGroup0, Matrix matrix0, Canvas canvas0, int v, int v1, ColorFilter colorFilter0) {
            vectorDrawableCompat$VGroup0.a.set(matrix0);
            vectorDrawableCompat$VGroup0.a.preConcat(vectorDrawableCompat$VGroup0.j);
            canvas0.save();
            for(int v2 = 0; v2 < vectorDrawableCompat$VGroup0.b.size(); ++v2) {
                VObject vectorDrawableCompat$VObject0 = (VObject)vectorDrawableCompat$VGroup0.b.get(v2);
                if(vectorDrawableCompat$VObject0 instanceof VGroup) {
                    this.c(((VGroup)vectorDrawableCompat$VObject0), vectorDrawableCompat$VGroup0.a, canvas0, v, v1, colorFilter0);
                }
                else if(vectorDrawableCompat$VObject0 instanceof VPath) {
                    this.d(vectorDrawableCompat$VGroup0, ((VPath)vectorDrawableCompat$VObject0), canvas0, v, v1, colorFilter0);
                }
            }
            canvas0.restore();
        }

        private void d(VGroup vectorDrawableCompat$VGroup0, VPath vectorDrawableCompat$VPath0, Canvas canvas0, int v, int v1, ColorFilter colorFilter0) {
            float f = ((float)v) / this.k;
            float f1 = ((float)v1) / this.l;
            float f2 = Math.min(f, f1);
            this.c.set(vectorDrawableCompat$VGroup0.a);
            this.c.postScale(f, f1);
            float f3 = this.e(vectorDrawableCompat$VGroup0.a);
            if(f3 == 0.0f) {
                return;
            }
            vectorDrawableCompat$VPath0.h(this.a);
            Path path0 = this.a;
            this.b.reset();
            if(vectorDrawableCompat$VPath0.e()) {
                this.b.setFillType((vectorDrawableCompat$VPath0.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                this.b.addPath(path0, this.c);
                canvas0.clipPath(this.b);
                return;
            }
            float f4 = ((VFullPath)vectorDrawableCompat$VPath0).l;
            if(f4 != 0.0f || ((VFullPath)vectorDrawableCompat$VPath0).m != 1.0f) {
                float f5 = ((VFullPath)vectorDrawableCompat$VPath0).n;
                float f6 = (((VFullPath)vectorDrawableCompat$VPath0).m + f5) % 1.0f;
                if(this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                float f7 = this.f.getLength();
                float f8 = (f4 + f5) % 1.0f * f7;
                float f9 = f6 * f7;
                path0.reset();
                if(f8 > f9) {
                    this.f.getSegment(f8, f7, path0, true);
                    this.f.getSegment(0.0f, f9, path0, true);
                }
                else {
                    this.f.getSegment(f8, f9, path0, true);
                }
                path0.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path0, this.c);
            if(((VFullPath)vectorDrawableCompat$VPath0).i.l()) {
                ComplexColorCompat complexColorCompat0 = ((VFullPath)vectorDrawableCompat$VPath0).i;
                if(this.e == null) {
                    Paint paint0 = new Paint(1);
                    this.e = paint0;
                    paint0.setStyle(Paint.Style.FILL);
                }
                Paint paint1 = this.e;
                if(complexColorCompat0.h()) {
                    Shader shader0 = complexColorCompat0.f();
                    shader0.setLocalMatrix(this.c);
                    paint1.setShader(shader0);
                    paint1.setAlpha(Math.round(((VFullPath)vectorDrawableCompat$VPath0).k * 255.0f));
                }
                else {
                    paint1.setShader(null);
                    paint1.setAlpha(0xFF);
                    paint1.setColor(VectorDrawableCompat.a(complexColorCompat0.e(), ((VFullPath)vectorDrawableCompat$VPath0).k));
                }
                paint1.setColorFilter(colorFilter0);
                this.b.setFillType((((VFullPath)vectorDrawableCompat$VPath0).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                canvas0.drawPath(this.b, paint1);
            }
            if(((VFullPath)vectorDrawableCompat$VPath0).g.l()) {
                ComplexColorCompat complexColorCompat1 = ((VFullPath)vectorDrawableCompat$VPath0).g;
                if(this.d == null) {
                    Paint paint2 = new Paint(1);
                    this.d = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                }
                Paint paint3 = this.d;
                Paint.Join paint$Join0 = ((VFullPath)vectorDrawableCompat$VPath0).p;
                if(paint$Join0 != null) {
                    paint3.setStrokeJoin(paint$Join0);
                }
                Paint.Cap paint$Cap0 = ((VFullPath)vectorDrawableCompat$VPath0).o;
                if(paint$Cap0 != null) {
                    paint3.setStrokeCap(paint$Cap0);
                }
                paint3.setStrokeMiter(((VFullPath)vectorDrawableCompat$VPath0).q);
                if(complexColorCompat1.h()) {
                    Shader shader1 = complexColorCompat1.f();
                    shader1.setLocalMatrix(this.c);
                    paint3.setShader(shader1);
                    paint3.setAlpha(Math.round(((VFullPath)vectorDrawableCompat$VPath0).j * 255.0f));
                }
                else {
                    paint3.setShader(null);
                    paint3.setAlpha(0xFF);
                    paint3.setColor(VectorDrawableCompat.a(complexColorCompat1.e(), ((VFullPath)vectorDrawableCompat$VPath0).j));
                }
                paint3.setColorFilter(colorFilter0);
                paint3.setStrokeWidth(((VFullPath)vectorDrawableCompat$VPath0).h * (f2 * f3));
                canvas0.drawPath(this.b, paint3);
            }
        }

        private float e(Matrix matrix0) {
            float[] arr_f = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix0.mapVectors(arr_f);
            float f = Math.max(((float)Math.hypot(arr_f[0], arr_f[1])), ((float)Math.hypot(arr_f[2], arr_f[3])));
            return f > 0.0f ? Math.abs(arr_f[0] * arr_f[3] - arr_f[1] * arr_f[2]) / f : 0.0f;
        }

        public boolean f() {
            if(this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] arr_v) {
            return this.h.b(arr_v);
        }

        public float getAlpha() {
            return ((float)this.getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            this.setRootAlpha(((int)(f * 255.0f)));
        }

        public void setRootAlpha(int v) {
            this.m = v;
        }
    }

    static class VectorDrawableCompatState extends Drawable.ConstantState {
        int a;
        VPathRenderer b;
        ColorStateList c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        int[] g;
        ColorStateList h;
        PorterDuff.Mode i;
        int j;
        boolean k;
        boolean l;
        Paint m;

        public VectorDrawableCompatState() {
            this.c = null;
            this.d = VectorDrawableCompat.l;
            this.b = new VPathRenderer();
        }

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0) {
            this.c = null;
            this.d = VectorDrawableCompat.l;
            if(vectorDrawableCompat$VectorDrawableCompatState0 != null) {
                this.a = vectorDrawableCompat$VectorDrawableCompatState0.a;
                VPathRenderer vectorDrawableCompat$VPathRenderer0 = new VPathRenderer(vectorDrawableCompat$VectorDrawableCompatState0.b);
                this.b = vectorDrawableCompat$VPathRenderer0;
                if(vectorDrawableCompat$VectorDrawableCompatState0.b.e != null) {
                    vectorDrawableCompat$VPathRenderer0.e = new Paint(vectorDrawableCompat$VectorDrawableCompatState0.b.e);
                }
                if(vectorDrawableCompat$VectorDrawableCompatState0.b.d != null) {
                    VPathRenderer vectorDrawableCompat$VPathRenderer1 = this.b;
                    vectorDrawableCompat$VPathRenderer1.d = new Paint(vectorDrawableCompat$VectorDrawableCompatState0.b.d);
                }
                this.c = vectorDrawableCompat$VectorDrawableCompatState0.c;
                this.d = vectorDrawableCompat$VectorDrawableCompatState0.d;
                this.e = vectorDrawableCompat$VectorDrawableCompatState0.e;
            }
        }

        public boolean a(int v, int v1) {
            return v == this.f.getWidth() && v1 == this.f.getHeight();
        }

        public boolean b() {
            return !this.l && this.h == this.c && this.i == this.d && this.k == this.e && this.j == this.b.getRootAlpha();
        }

        public void c(int v, int v1) {
            if(this.f == null || !this.a(v, v1)) {
                this.f = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                this.l = true;
            }
        }

        public void d(Canvas canvas0, ColorFilter colorFilter0, Rect rect0) {
            Paint paint0 = this.e(colorFilter0);
            canvas0.drawBitmap(this.f, null, rect0, paint0);
        }

        public Paint e(ColorFilter colorFilter0) {
            if(!this.f() && colorFilter0 == null) {
                return null;
            }
            if(this.m == null) {
                Paint paint0 = new Paint();
                this.m = paint0;
                paint0.setFilterBitmap(true);
            }
            this.m.setAlpha(this.b.getRootAlpha());
            this.m.setColorFilter(colorFilter0);
            return this.m;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 0xFF;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] arr_v) {
            boolean z = this.b.g(arr_v);
            this.l |= z;
            return z;
        }

        public void i() {
            this.h = this.c;
            this.i = this.d;
            this.j = this.b.getRootAlpha();
            this.k = this.e;
            this.l = false;
        }

        public void j(int v, int v1) {
            this.f.eraseColor(0);
            Canvas canvas0 = new Canvas(this.f);
            this.b.b(canvas0, v, v1, null);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources0) {
            return new VectorDrawableCompat(this);
        }
    }

    @RequiresApi(24)
    static class VectorDrawableDelegateState extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public VectorDrawableDelegateState(Drawable.ConstantState drawable$ConstantState0) {
            this.a = drawable$ConstantState0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            Drawable drawable0 = new VectorDrawableCompat();
            drawable0.a = (VectorDrawable)this.a.newDrawable();
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            Drawable drawable0 = new VectorDrawableCompat();
            drawable0.a = (VectorDrawable)this.a.newDrawable(resources0);
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
            Drawable drawable0 = new VectorDrawableCompat();
            drawable0.a = (VectorDrawable)this.a.newDrawable(resources0, resources$Theme0);
            return drawable0;
        }
    }

    private VectorDrawableCompatState b;
    private PorterDuffColorFilter c;
    private ColorFilter d;
    private boolean e;
    private boolean f;
    private Drawable.ConstantState g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;
    static final String k = "VectorDrawableCompat";
    static final PorterDuff.Mode l = null;
    private static final String m = "clip-path";
    private static final String n = "group";
    private static final String o = "path";
    private static final String p = "vector";
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 0x800;
    private static final boolean x = false;

    static {
        VectorDrawableCompat.l = PorterDuff.Mode.SRC_IN;
    }

    VectorDrawableCompat() {
        this.f = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new VectorDrawableCompatState();
    }

    VectorDrawableCompat(@NonNull VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0) {
        this.f = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = vectorDrawableCompat$VectorDrawableCompatState0;
        this.c = this.o(this.c, vectorDrawableCompat$VectorDrawableCompatState0.c, vectorDrawableCompat$VectorDrawableCompatState0.d);
    }

    static int a(int v, float f) {
        return v & 0xFFFFFF | ((int)(((float)Color.alpha(v)) * f)) << 24;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void applyTheme(Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
    }

    @Nullable
    public static VectorDrawableCompat c(@NonNull Resources resources0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        if(Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat0 = new VectorDrawableCompat();
            vectorDrawableCompat0.a = ResourcesCompat.g(resources0, v, resources$Theme0);
            vectorDrawableCompat0.g = new VectorDrawableDelegateState(vectorDrawableCompat0.a.getConstantState());
            return vectorDrawableCompat0;
        }
        try {
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return VectorDrawableCompat.f(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("VectorDrawableCompat", "parser error", iOException0);
            return null;
        }
        Log.e("VectorDrawableCompat", "parser error", xmlPullParserException0);
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.b(drawable0);
        }
        return false;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        this.copyBounds(this.j);
        if(this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter0 = this.d;
            if(colorFilter0 == null) {
                colorFilter0 = this.c;
            }
            canvas0.getMatrix(this.i);
            this.i.getValues(this.h);
            float f = Math.abs(this.h[0]);
            float f1 = Math.abs(this.h[4]);
            if(Math.abs(this.h[1]) != 0.0f || Math.abs(this.h[3]) != 0.0f) {
                f = 1.0f;
                f1 = 1.0f;
            }
            int v = Math.min(0x800, ((int)(((float)this.j.width()) * f)));
            int v1 = Math.min(0x800, ((int)(((float)this.j.height()) * f1)));
            if(v > 0 && v1 > 0) {
                int v2 = canvas0.save();
                canvas0.translate(((float)this.j.left), ((float)this.j.top));
                if(this.j()) {
                    canvas0.translate(((float)this.j.width()), 0.0f);
                    canvas0.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.b.c(v, v1);
                if(!this.f) {
                    this.b.j(v, v1);
                }
                else if(!this.b.b()) {
                    this.b.j(v, v1);
                    this.b.i();
                }
                this.b.d(canvas0, colorFilter0, this.j);
                canvas0.restoreToCount(v2);
            }
        }
    }

    public static VectorDrawableCompat f(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat0 = new VectorDrawableCompat();
        vectorDrawableCompat0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return vectorDrawableCompat0;
    }

    @RestrictTo({Scope.c})
    public float g() {
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        if(vectorDrawableCompat$VectorDrawableCompatState0 != null) {
            VPathRenderer vectorDrawableCompat$VPathRenderer0 = vectorDrawableCompat$VectorDrawableCompatState0.b;
            if(vectorDrawableCompat$VPathRenderer0 != null) {
                float f = vectorDrawableCompat$VPathRenderer0.i;
                if(f != 0.0f) {
                    float f1 = vectorDrawableCompat$VPathRenderer0.j;
                    if(f1 != 0.0f) {
                        float f2 = vectorDrawableCompat$VPathRenderer0.l;
                        if(f2 != 0.0f) {
                            return vectorDrawableCompat$VPathRenderer0.k == 0.0f ? 1.0f : Math.min(vectorDrawableCompat$VPathRenderer0.k / f, f2 / f1);
                        }
                    }
                }
            }
        }
        return 1.0f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a == null ? this.b.b.getRootAlpha() : DrawableCompat.d(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? super.getChangingConfigurations() | this.b.getChangingConfigurations() : drawable0.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.a == null ? this.d : DrawableCompat.e(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if(this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new VectorDrawableDelegateState(this.a.getConstantState());
        }
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        vectorDrawableCompat$VectorDrawableCompatState0.a = this.getChangingConfigurations();
        return this.b;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a == null ? ((int)this.b.b.j) : this.a.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a == null ? ((int)this.b.b.i) : this.a.getIntrinsicWidth();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a == null ? -3 : this.a.getOpacity();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public boolean getPadding(Rect rect0) {
        return super.getPadding(rect0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public int[] getState() {
        return super.getState();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    Object h(String s) {
        return this.b.b.p.get(s);
    }

    private void i(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        VPathRenderer vectorDrawableCompat$VPathRenderer0 = vectorDrawableCompat$VectorDrawableCompatState0.b;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.push(vectorDrawableCompat$VPathRenderer0.h);
        int v = xmlPullParser0.getEventType();
        int v1 = xmlPullParser0.getDepth();
        boolean z = true;
        while(v != 1 && (xmlPullParser0.getDepth() >= v1 + 1 || v != 3)) {
            switch(v) {
                case 2: {
                    String s = xmlPullParser0.getName();
                    VGroup vectorDrawableCompat$VGroup0 = (VGroup)arrayDeque0.peek();
                    if("path".equals(s)) {
                        VFullPath vectorDrawableCompat$VFullPath0 = new VFullPath();
                        vectorDrawableCompat$VFullPath0.k(resources0, attributeSet0, resources$Theme0, xmlPullParser0);
                        vectorDrawableCompat$VGroup0.b.add(vectorDrawableCompat$VFullPath0);
                        if(vectorDrawableCompat$VFullPath0.getPathName() != null) {
                            vectorDrawableCompat$VPathRenderer0.p.put(vectorDrawableCompat$VFullPath0.getPathName(), vectorDrawableCompat$VFullPath0);
                        }
                        vectorDrawableCompat$VectorDrawableCompatState0.a |= vectorDrawableCompat$VFullPath0.d;
                        z = false;
                    }
                    else if("clip-path".equals(s)) {
                        VClipPath vectorDrawableCompat$VClipPath0 = new VClipPath();
                        vectorDrawableCompat$VClipPath0.i(resources0, attributeSet0, resources$Theme0, xmlPullParser0);
                        vectorDrawableCompat$VGroup0.b.add(vectorDrawableCompat$VClipPath0);
                        if(vectorDrawableCompat$VClipPath0.getPathName() != null) {
                            vectorDrawableCompat$VPathRenderer0.p.put(vectorDrawableCompat$VClipPath0.getPathName(), vectorDrawableCompat$VClipPath0);
                        }
                        vectorDrawableCompat$VectorDrawableCompatState0.a |= vectorDrawableCompat$VClipPath0.d;
                    }
                    else if("group".equals(s)) {
                        VGroup vectorDrawableCompat$VGroup1 = new VGroup();
                        vectorDrawableCompat$VGroup1.c(resources0, attributeSet0, resources$Theme0, xmlPullParser0);
                        vectorDrawableCompat$VGroup0.b.add(vectorDrawableCompat$VGroup1);
                        arrayDeque0.push(vectorDrawableCompat$VGroup1);
                        if(vectorDrawableCompat$VGroup1.getGroupName() != null) {
                            vectorDrawableCompat$VPathRenderer0.p.put(vectorDrawableCompat$VGroup1.getGroupName(), vectorDrawableCompat$VGroup1);
                        }
                        vectorDrawableCompat$VectorDrawableCompatState0.a |= vectorDrawableCompat$VGroup1.k;
                    }
                    break;
                }
                case 3: {
                    if("group".equals(xmlPullParser0.getName())) {
                        arrayDeque0.pop();
                    }
                }
            }
            v = xmlPullParser0.next();
        }
        if(z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) throws XmlPullParserException, IOException {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0);
            return;
        }
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.g(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        vectorDrawableCompat$VectorDrawableCompatState0.b = new VPathRenderer();
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.a);
        this.n(typedArray0, xmlPullParser0, resources$Theme0);
        typedArray0.recycle();
        vectorDrawableCompat$VectorDrawableCompatState0.a = this.getChangingConfigurations();
        vectorDrawableCompat$VectorDrawableCompatState0.l = true;
        this.i(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        this.c = this.o(this.c, vectorDrawableCompat$VectorDrawableCompatState0.c, vectorDrawableCompat$VectorDrawableCompatState0.d);
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a == null ? this.b.e : DrawableCompat.h(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.isStateful();
        }
        if(!super.isStateful()) {
            VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
            if(vectorDrawableCompat$VectorDrawableCompatState0 == null) {
                return false;
            }
            if(!vectorDrawableCompat$VectorDrawableCompatState0.g()) {
                ColorStateList colorStateList0 = this.b.c;
                return colorStateList0 != null && colorStateList0.isStateful();
            }
        }
        return true;
    }

    private boolean j() {
        return this.isAutoMirrored() && DrawableCompat.f(this) == 1;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    private static PorterDuff.Mode k(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }

    private void l(VGroup vectorDrawableCompat$VGroup0, int v) {
        String s = "";
        for(int v2 = 0; v2 < v; ++v2) {
            s = s + "    ";
        }
        Log.v("VectorDrawableCompat", s + "current group is :" + vectorDrawableCompat$VGroup0.getGroupName() + " rotation is " + vectorDrawableCompat$VGroup0.c);
        Log.v("VectorDrawableCompat", s + "matrix is :" + vectorDrawableCompat$VGroup0.getLocalMatrix().toString());
        for(int v1 = 0; v1 < vectorDrawableCompat$VGroup0.b.size(); ++v1) {
            VObject vectorDrawableCompat$VObject0 = (VObject)vectorDrawableCompat$VGroup0.b.get(v1);
            if(vectorDrawableCompat$VObject0 instanceof VGroup) {
                this.l(((VGroup)vectorDrawableCompat$VObject0), v + 1);
            }
            else {
                ((VPath)vectorDrawableCompat$VObject0).g(v + 1);
            }
        }
    }

    void m(boolean z) {
        this.f = z;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.mutate();
            return this;
        }
        if(!this.e && super.mutate() == this) {
            this.b = new VectorDrawableCompatState(this.b);
            this.e = true;
        }
        return this;
    }

    private void n(TypedArray typedArray0, XmlPullParser xmlPullParser0, Resources.Theme resources$Theme0) throws XmlPullParserException {
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        VPathRenderer vectorDrawableCompat$VPathRenderer0 = vectorDrawableCompat$VectorDrawableCompatState0.b;
        vectorDrawableCompat$VectorDrawableCompatState0.d = VectorDrawableCompat.k(TypedArrayUtils.k(typedArray0, xmlPullParser0, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList0 = TypedArrayUtils.g(typedArray0, xmlPullParser0, resources$Theme0, "tint", 1);
        if(colorStateList0 != null) {
            vectorDrawableCompat$VectorDrawableCompatState0.c = colorStateList0;
        }
        vectorDrawableCompat$VectorDrawableCompatState0.e = TypedArrayUtils.e(typedArray0, xmlPullParser0, "autoMirrored", 5, vectorDrawableCompat$VectorDrawableCompatState0.e);
        vectorDrawableCompat$VPathRenderer0.k = TypedArrayUtils.j(typedArray0, xmlPullParser0, "viewportWidth", 7, vectorDrawableCompat$VPathRenderer0.k);
        float f = TypedArrayUtils.j(typedArray0, xmlPullParser0, "viewportHeight", 8, vectorDrawableCompat$VPathRenderer0.l);
        vectorDrawableCompat$VPathRenderer0.l = f;
        if(vectorDrawableCompat$VPathRenderer0.k <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if(f <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vectorDrawableCompat$VPathRenderer0.i = typedArray0.getDimension(3, vectorDrawableCompat$VPathRenderer0.i);
        float f1 = typedArray0.getDimension(2, vectorDrawableCompat$VPathRenderer0.j);
        vectorDrawableCompat$VPathRenderer0.j = f1;
        if(vectorDrawableCompat$VPathRenderer0.i <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        vectorDrawableCompat$VPathRenderer0.setAlpha(TypedArrayUtils.j(typedArray0, xmlPullParser0, "alpha", 4, vectorDrawableCompat$VPathRenderer0.getAlpha()));
        String s = typedArray0.getString(0);
        if(s != null) {
            vectorDrawableCompat$VPathRenderer0.n = s;
            vectorDrawableCompat$VPathRenderer0.p.put(s, vectorDrawableCompat$VPathRenderer0);
        }
    }

    PorterDuffColorFilter o(PorterDuffColorFilter porterDuffColorFilter0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        boolean z;
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        ColorStateList colorStateList0 = vectorDrawableCompat$VectorDrawableCompatState0.c;
        if(colorStateList0 == null) {
            z = false;
        }
        else {
            PorterDuff.Mode porterDuff$Mode0 = vectorDrawableCompat$VectorDrawableCompatState0.d;
            if(porterDuff$Mode0 == null) {
                z = false;
            }
            else {
                this.c = this.o(this.c, colorStateList0, porterDuff$Mode0);
                this.invalidateSelf();
                z = true;
            }
        }
        if(vectorDrawableCompat$VectorDrawableCompatState0.g() && vectorDrawableCompat$VectorDrawableCompatState0.h(arr_v)) {
            this.invalidateSelf();
            return true;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable0, long v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.scheduleSelf(runnable0, v);
            return;
        }
        super.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        if(this.b.b.getRootAlpha() != v) {
            this.b.b.setRootAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.j(drawable0, z);
            return;
        }
        this.b.e = z;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setChangingConfigurations(int v) {
        super.setChangingConfigurations(v);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        super.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
            return;
        }
        this.d = colorFilter0;
        this.invalidateSelf();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setHotspot(float f, float f1) {
        super.setHotspot(f, f1);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        super.setHotspotBounds(v, v1, v2, v3);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public boolean setState(int[] arr_v) {
        return super.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.n(drawable0, v);
            return;
        }
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.o(drawable0, colorStateList0);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        if(vectorDrawableCompat$VectorDrawableCompatState0.c != colorStateList0) {
            vectorDrawableCompat$VectorDrawableCompatState0.c = colorStateList0;
            this.c = this.o(this.c, colorStateList0, vectorDrawableCompat$VectorDrawableCompatState0.d);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.p(drawable0, porterDuff$Mode0);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompat$VectorDrawableCompatState0 = this.b;
        if(vectorDrawableCompat$VectorDrawableCompatState0.d != porterDuff$Mode0) {
            vectorDrawableCompat$VectorDrawableCompatState0.d = porterDuff$Mode0;
            this.c = this.o(this.c, vectorDrawableCompat$VectorDrawableCompatState0.c, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.a;
        return drawable0 == null ? super.setVisible(z, z1) : drawable0.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.unscheduleSelf(runnable0);
            return;
        }
        super.unscheduleSelf(runnable0);
    }

    class androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.1 {
    }

}

