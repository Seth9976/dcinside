package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public interface Animatable2Compat extends Animatable {
    public static abstract class AnimationCallback {
        Animatable2.AnimationCallback a;

        @RequiresApi(23)
        Animatable2.AnimationCallback a() {
            if(this.a == null) {
                this.a = new Animatable2.AnimationCallback() {
                    final AnimationCallback a;

                    @Override  // android.graphics.drawable.Animatable2$AnimationCallback
                    public void onAnimationEnd(Drawable drawable0) {
                        AnimationCallback.this.b(drawable0);
                    }

                    @Override  // android.graphics.drawable.Animatable2$AnimationCallback
                    public void onAnimationStart(Drawable drawable0) {
                        AnimationCallback.this.c(drawable0);
                    }
                };
            }
            return this.a;
        }

        public void b(Drawable drawable0) {
        }

        public void c(Drawable drawable0) {
        }
    }

    boolean b(@NonNull AnimationCallback arg1);

    void d(@NonNull AnimationCallback arg1);

    void e();
}

