package com.github.chrisbanes.photoview;

import android.widget.ImageView.ScaleType;
import android.widget.ImageView;

class m {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            a.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static void a(float f, float f1, float f2) {
        if(f >= f1) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if(f1 >= f2) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    static int b(int v) {
        return (v & 0xFF00) >> 8;
    }

    static boolean c(ImageView imageView0) {
        return imageView0.getDrawable() != null;
    }

    static boolean d(ImageView.ScaleType imageView$ScaleType0) {
        if(imageView$ScaleType0 == null) {
            return false;
        }
        if(a.a[imageView$ScaleType0.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        return true;
    }
}

