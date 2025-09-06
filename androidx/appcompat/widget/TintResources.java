package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

class TintResources extends ResourcesWrapper {
    private final WeakReference b;

    public TintResources(@NonNull Context context0, @NonNull Resources resources0) {
        super(resources0);
        this.b = new WeakReference(context0);
    }

    @Override  // androidx.appcompat.widget.ResourcesWrapper
    public Drawable getDrawable(int v) throws Resources.NotFoundException {
        Drawable drawable0 = this.a(v);
        Context context0 = (Context)this.b.get();
        if(drawable0 != null && context0 != null) {
            ResourceManagerInternal.h().x(context0, v, drawable0);
        }
        return drawable0;
    }
}

