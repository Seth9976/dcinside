package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class CanvasKt {
    public static final void a(@l Canvas canvas0, float f, float f1, float f2, float f3, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.clipRect(f, f1, f2, f3);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static final void b(@l Canvas canvas0, int v, int v1, int v2, int v3, @l Function1 function10) {
        int v4 = canvas0.save();
        canvas0.clipRect(v, v1, v2, v3);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v4);
        }
    }

    public static final void c(@l Canvas canvas0, @l Path path0, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.clipPath(path0);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static final void d(@l Canvas canvas0, @l Rect rect0, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.clipRect(rect0);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static final void e(@l Canvas canvas0, @l RectF rectF0, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.clipRect(rectF0);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static final void f(@l Canvas canvas0, @l Matrix matrix0, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.concat(matrix0);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static void g(Canvas canvas0, Matrix matrix0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            matrix0 = new Matrix();
        }
        int v1 = canvas0.save();
        canvas0.concat(matrix0);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v1);
        }
    }

    public static final void h(@l Canvas canvas0, float f, float f1, float f2, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.rotate(f, f1, f2);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static void i(Canvas canvas0, float f, float f1, float f2, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        int v1 = canvas0.save();
        canvas0.rotate(f, f1, f2);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v1);
        }
    }

    public static final void j(@l Canvas canvas0, @l Function1 function10) {
        int v = canvas0.save();
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static final void k(@l Canvas canvas0, float f, float f1, float f2, float f3, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.scale(f, f1, f2, f3);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static void l(Canvas canvas0, float f, float f1, float f2, float f3, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        int v1 = canvas0.save();
        canvas0.scale(f, f1, f2, f3);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v1);
        }
    }

    public static final void m(@l Canvas canvas0, float f, float f1, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.skew(f, f1);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static void n(Canvas canvas0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        int v1 = canvas0.save();
        canvas0.skew(f, f1);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v1);
        }
    }

    public static final void o(@l Canvas canvas0, float f, float f1, @l Function1 function10) {
        int v = canvas0.save();
        canvas0.translate(f, f1);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v);
        }
    }

    public static void p(Canvas canvas0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        int v1 = canvas0.save();
        canvas0.translate(f, f1);
        try {
            function10.invoke(canvas0);
        }
        finally {
            canvas0.restoreToCount(v1);
        }
    }
}

