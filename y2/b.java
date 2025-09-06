package Y2;

import android.graphics.Bitmap;
import com.zomato.photofilters.imageprocessors.NativeImageProcessor;

public final class b {
    public static Bitmap a(int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3, Bitmap bitmap0) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int[] arr_v4 = new int[v * v1];
        bitmap0.getPixels(arr_v4, 0, v, 0, 0, v, v1);
        int[] arr_v5 = arr_v == null ? arr_v4 : NativeImageProcessor.applyRGBCurve(arr_v4, arr_v, v, v1);
        int[] arr_v6 = arr_v1 != null || arr_v2 != null || arr_v3 != null ? NativeImageProcessor.applyChannelCurves(arr_v5, arr_v1, arr_v2, arr_v3, v, v1) : arr_v5;
        try {
            bitmap0.setPixels(arr_v6, 0, v, 0, 0, v, v1);
        }
        catch(IllegalStateException unused_ex) {
        }
        return bitmap0;
    }

    public static Bitmap b(int v, Bitmap bitmap0) {
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        int[] arr_v = new int[v1 * v2];
        bitmap0.getPixels(arr_v, 0, v1, 0, 0, v1, v2);
        NativeImageProcessor.doBrightness(arr_v, v, v1, v2);
        bitmap0.setPixels(arr_v, 0, v1, 0, 0, v1, v2);
        return bitmap0;
    }

    public static Bitmap c(int v, float f, float f1, float f2, Bitmap bitmap0) {
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        int[] arr_v = new int[v1 * v2];
        bitmap0.getPixels(arr_v, 0, v1, 0, 0, v1, v2);
        NativeImageProcessor.doColorOverlay(arr_v, v, f, f1, f2, v1, v2);
        bitmap0.setPixels(arr_v, 0, v1, 0, 0, v1, v2);
        return bitmap0;
    }

    public static Bitmap d(float f, Bitmap bitmap0) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int[] arr_v = new int[v * v1];
        bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
        NativeImageProcessor.doContrast(arr_v, f, v, v1);
        bitmap0.setPixels(arr_v, 0, v, 0, 0, v, v1);
        return bitmap0;
    }

    public static Bitmap e(Bitmap bitmap0, float f) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int[] arr_v = new int[v * v1];
        bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
        NativeImageProcessor.doSaturation(arr_v, f, v, v1);
        bitmap0.setPixels(arr_v, 0, v, 0, 0, v, v1);
        return bitmap0;
    }
}

