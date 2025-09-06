package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewUtilsApi19 {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static float a(View view0) {
            return view0.getTransitionAlpha();
        }

        @DoNotInline
        static void b(View view0, float f) {
            view0.setTransitionAlpha(f);
        }
    }

    private float[] a;
    private static final String b = "ViewUtilsApi19";
    private static boolean c = true;
    private static Method d = null;
    private static boolean e = false;
    private static Field f = null;
    private static boolean g = false;
    private static final int h = 12;

    static {
    }

    public void a(@NonNull View view0) {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if(!ViewUtilsApi19.e) {
            try {
                Method method0 = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                ViewUtilsApi19.d = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", noSuchMethodException0);
            }
            ViewUtilsApi19.e = true;
        }
    }

    @SuppressLint({"NewApi"})
    public float c(@NonNull View view0) {
        if(ViewUtilsApi19.c) {
            try {
                return Api29Impl.a(view0);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi19.c = false;
            }
        }
        return view0.getAlpha();
    }

    public void d(@NonNull View view0) {
    }

    public void e(@NonNull View view0, @Nullable Matrix matrix0) {
        if(matrix0 != null && !matrix0.isIdentity()) {
            float[] arr_f = this.a;
            if(arr_f == null) {
                arr_f = new float[9];
                this.a = arr_f;
            }
            matrix0.getValues(arr_f);
            float f = arr_f[3];
            float f1 = ((float)Math.sqrt(1.0f - f * f)) * ((float)(arr_f[0] < 0.0f ? -1 : 1));
            float f2 = arr_f[0] / f1;
            float f3 = arr_f[4] / f1;
            float f4 = arr_f[2];
            float f5 = arr_f[5];
            view0.setPivotX(0.0f);
            view0.setPivotY(0.0f);
            view0.setTranslationX(f4);
            view0.setTranslationY(f5);
            view0.setRotation(((float)Math.toDegrees(Math.atan2(f, f1))));
            view0.setScaleX(f2);
            view0.setScaleY(f3);
            return;
        }
        view0.setPivotX(((float)(view0.getWidth() / 2)));
        view0.setPivotY(((float)(view0.getHeight() / 2)));
        view0.setTranslationX(0.0f);
        view0.setTranslationY(0.0f);
        view0.setScaleX(1.0f);
        view0.setScaleY(1.0f);
        view0.setRotation(0.0f);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void f(@NonNull View view0, int v, int v1, int v2, int v3) {
        this.b();
        Method method0 = ViewUtilsApi19.d;
        if(method0 != null) {
            try {
                method0.invoke(view0, v, v1, v2, v3);
                return;
            }
            catch(IllegalAccessException invocationTargetException0) {
            }
            catch(InvocationTargetException unused_ex) {
                return;
            }
            throw new RuntimeException(invocationTargetException0.getCause());
        }
    }

    @SuppressLint({"NewApi"})
    public void g(@NonNull View view0, float f) {
        if(ViewUtilsApi19.c) {
            try {
                Api29Impl.b(view0, f);
                return;
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi19.c = false;
            }
        }
        view0.setAlpha(f);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void h(@NonNull View view0, int v) {
        if(!ViewUtilsApi19.g) {
            try {
                Field field0 = View.class.getDeclaredField("mViewFlags");
                ViewUtilsApi19.f = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException unused_ex) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            ViewUtilsApi19.g = true;
        }
        Field field1 = ViewUtilsApi19.f;
        if(field1 != null) {
            try {
                int v1 = field1.getInt(view0);
                ViewUtilsApi19.f.setInt(view0, v | v1 & -13);
            }
            catch(IllegalAccessException unused_ex) {
            }
        }
    }

    public void i(@NonNull View view0, @NonNull Matrix matrix0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            this.i(((View)viewParent0), matrix0);
            matrix0.preTranslate(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
        }
        matrix0.preTranslate(((float)view0.getLeft()), ((float)view0.getTop()));
        Matrix matrix1 = view0.getMatrix();
        if(!matrix1.isIdentity()) {
            matrix0.preConcat(matrix1);
        }
    }

    public void j(@NonNull View view0, @NonNull Matrix matrix0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            this.j(((View)viewParent0), matrix0);
            matrix0.postTranslate(((float)((View)viewParent0).getScrollX()), ((float)((View)viewParent0).getScrollY()));
        }
        matrix0.postTranslate(((float)(-view0.getLeft())), ((float)(-view0.getTop())));
        Matrix matrix1 = view0.getMatrix();
        if(!matrix1.isIdentity()) {
            Matrix matrix2 = new Matrix();
            if(matrix1.invert(matrix2)) {
                matrix0.postConcat(matrix2);
            }
        }
    }
}

