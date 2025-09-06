package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

public class b {
    public static Drawable a(Drawable drawable0) {
        Bitmap bitmap0 = b.g(drawable0);
        if(bitmap0 == null) {
            Log.e("ContentValues", "Couldn\'t crop the Image");
            return drawable0;
        }
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        if(v > v1) {
            bitmap0 = Bitmap.createBitmap(bitmap0, v / 2 - v1 / 2, 0, v1, v1);
        }
        else if(v < v1) {
            bitmap0 = Bitmap.createBitmap(bitmap0, 0, v1 / 2 - v / 2, v, v);
        }
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setShader(bitmapShader0);
        float f = (float)(bitmap0.getWidth() / 2);
        new Canvas(bitmap1).drawCircle(f, f, f, paint0);
        Drawable drawable1 = b.h(bitmap1);
        if(drawable1 == null) {
            Log.e("ContentValues", "Couldn\'t crop the Image");
            return drawable0;
        }
        return drawable1;
    }

    public static int b(Context context0, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context0.getResources().getDisplayMetrics()));
    }

    public static void c(View view0, long v) {
        ViewCompat.h(view0).d();
        view0.setVisibility(0);
        Animation animation0 = AnimationUtils.loadAnimation(view0.getContext(), anim.sd_scale_fade_and_translate_in);
        animation0.setStartOffset(v);
        view0.startAnimation(animation0);
    }

    public static void d(View view0) {
        ViewCompat.h(view0).d();
        view0.setAlpha(0.0f);
        view0.setVisibility(0);
        ViewCompat.h(view0).b(1.0f).G().s(((long)view0.getContext().getResources().getInteger(integer.sd_open_animation_duration))).t(new FastOutSlowInInterpolator()).y();
    }

    public static void e(View view0) {
        class a implements Runnable {
            final View a;

            a(View view0) {
            }

            @Override
            public void run() {
                this.a.setVisibility(8);
            }
        }

        ViewCompat.h(view0).d();
        view0.setAlpha(1.0f);
        view0.setVisibility(0);
        ViewCompat.h(view0).b(0.0f).G().s(((long)view0.getContext().getResources().getInteger(integer.sd_close_animation_duration))).t(new FastOutSlowInInterpolator()).F(new a(view0)).y();
    }

    public static int f(Context context0) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010435, typedValue0, true);
        return typedValue0.data;
    }

    @Nullable
    public static Bitmap g(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        if(drawable0 instanceof BitmapDrawable && ((BitmapDrawable)drawable0).getBitmap() != null) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        Bitmap bitmap0 = drawable0.getIntrinsicWidth() <= 0 || drawable0.getIntrinsicHeight() <= 0 ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
        drawable0.draw(canvas0);
        return bitmap0;
    }

    @Nullable
    public static Drawable h(@Nullable Bitmap bitmap0) {
        return bitmap0 == null ? null : new BitmapDrawable(bitmap0);
    }

    public static int i(Context context0) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.colorOnSecondary, typedValue0, true);
        return typedValue0.data;
    }

    public static int j(Context context0) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010433, typedValue0, true);
        return typedValue0.data;
    }

    public static Drawable k(Drawable drawable0, float f) {
        class d extends LayerDrawable {
            final float a;
            final Drawable b;

            d(Drawable[] arr_drawable, float f, Drawable drawable0) {
                this.a = f;
                this.b = drawable0;
                super(arr_drawable);
            }

            @Override  // android.graphics.drawable.LayerDrawable
            public void draw(Canvas canvas0) {
                canvas0.save();
                float f = ((float)this.b.getIntrinsicWidth()) / 2.0f;
                float f1 = ((float)this.b.getIntrinsicHeight()) / 2.0f;
                canvas0.rotate(this.a, f, f1);
                super.draw(canvas0);
                canvas0.restore();
            }
        }

        return f == 0.0f ? drawable0 : new d(new Drawable[]{drawable0}, f, drawable0);
    }

    public static void l(View view0) {
        class e implements Runnable {
            final View a;

            e(View view0) {
            }

            @Override
            public void run() {
                this.a.setPressed(false);
                this.a.performClick();
            }
        }

        view0.setPressed(true);
        view0.postDelayed(new e(view0), 100L);
    }

    public static int m(float f) {
        return Math.round(f / Resources.getSystem().getDisplayMetrics().density);
    }

    public static void n(View view0, boolean z) {
        ViewCompat.h(view0).i(0.0f).G().s((z ? ((long)view0.getContext().getResources().getInteger(integer.sd_rotate_animation_duration)) : 0L)).t(new FastOutSlowInInterpolator()).y();
    }

    public static void o(View view0, float f, boolean z) {
        ViewCompat.h(view0).i(f).G().s((z ? ((long)view0.getContext().getResources().getInteger(integer.sd_rotate_animation_duration)) : 0L)).t(new FastOutSlowInInterpolator()).y();
    }

    public static void p(View view0, long v) {
        class com.leinardi.android.speeddial.b.b implements Animation.AnimationListener {
            final View a;

            com.leinardi.android.speeddial.b.b(View view0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                this.a.setVisibility(8);
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        ViewCompat.h(view0).d();
        view0.setVisibility(0);
        Animation animation0 = AnimationUtils.loadAnimation(view0.getContext(), anim.sd_scale_fade_and_translate_out);
        animation0.setStartOffset(v);
        animation0.setAnimationListener(new com.leinardi.android.speeddial.b.b(view0));
        view0.startAnimation(animation0);
    }

    public static void q(View view0, boolean z) {
        class c implements Runnable {
            final boolean a;
            final View b;

            c(boolean z, View view0) {
                this.b = view0;
                super();
            }

            @Override
            public void run() {
                if(this.a) {
                    ViewGroup viewGroup0 = (ViewGroup)this.b.getParent();
                    if(viewGroup0 != null) {
                        viewGroup0.removeView(this.b);
                    }
                }
                else {
                    this.b.setVisibility(8);
                }
            }
        }

        ViewCompat.h(view0).d();
        ViewCompat.h(view0).b(0.0f).G().s(((long)view0.getContext().getResources().getInteger(integer.sd_close_animation_duration))).t(new FastOutSlowInInterpolator()).F(new c(z, view0)).y();
    }
}

