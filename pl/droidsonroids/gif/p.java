package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

public class p implements Drawable.Callback {
    static final class a extends WeakReference {
        a(Drawable.Callback drawable$Callback0) {
            super(drawable$Callback0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return a.class == class0 && this.get() == ((a)object0).get();
            }
            return false;
        }

        @Override
        public int hashCode() {
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.get();
            return drawable$Callback0 == null ? 0 : drawable$Callback0.hashCode();
        }
    }

    private final CopyOnWriteArrayList a;
    private final boolean b;

    public p() {
        this(false);
    }

    public p(boolean z) {
        this.a = new CopyOnWriteArrayList();
        this.b = z;
    }

    public void a(Drawable.Callback drawable$Callback0) {
        for(int v = 0; v < this.a.size(); ++v) {
            a p$a0 = (a)this.a.get(v);
            if(((Drawable.Callback)p$a0.get()) == null) {
                this.a.remove(p$a0);
            }
        }
        a p$a1 = new a(drawable$Callback0);
        this.a.addIfAbsent(p$a1);
    }

    public void b(Drawable.Callback drawable$Callback0) {
        for(int v = 0; v < this.a.size(); ++v) {
            a p$a0 = (a)this.a.get(v);
            Drawable.Callback drawable$Callback1 = (Drawable.Callback)p$a0.get();
            if(drawable$Callback1 == null || drawable$Callback1 == drawable$Callback0) {
                this.a.remove(p$a0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NonNull Drawable drawable0) {
        for(int v = 0; v < this.a.size(); ++v) {
            a p$a0 = (a)this.a.get(v);
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)p$a0.get();
            if(drawable$Callback0 == null) {
                this.a.remove(p$a0);
            }
            else if(!this.b || !(drawable$Callback0 instanceof View)) {
                drawable$Callback0.invalidateDrawable(drawable0);
            }
            else {
                ((View)drawable$Callback0).invalidate();
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0, long v) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            a p$a0 = (a)this.a.get(v1);
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)p$a0.get();
            if(drawable$Callback0 == null) {
                this.a.remove(p$a0);
            }
            else {
                drawable$Callback0.scheduleDrawable(drawable0, runnable0, v);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0) {
        for(int v = 0; v < this.a.size(); ++v) {
            a p$a0 = (a)this.a.get(v);
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)p$a0.get();
            if(drawable$Callback0 == null) {
                this.a.remove(p$a0);
            }
            else {
                drawable$Callback0.unscheduleDrawable(drawable0, runnable0);
            }
        }
    }
}

