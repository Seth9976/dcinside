package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public class TintContextWrapper extends ContextWrapper {
    private final Resources a;
    private final Resources.Theme b;
    private static final Object c;
    private static ArrayList d;

    static {
        TintContextWrapper.c = new Object();
    }

    private TintContextWrapper(@NonNull Context context0) {
        super(context0);
        this.a = new TintResources(this, context0.getResources());
        this.b = null;
    }

    // 去混淆评级： 低(30)
    private static boolean a(@NonNull Context context0) {
        return context0 instanceof TintContextWrapper || context0.getResources() instanceof TintResources || context0.getResources() instanceof VectorEnabledTintResources ? false : false;
    }

    public static Context b(@NonNull Context context0) {
        if(TintContextWrapper.a(context0)) {
            Object object0 = TintContextWrapper.c;
            synchronized(object0) {
                ArrayList arrayList0 = TintContextWrapper.d;
                if(arrayList0 == null) {
                    TintContextWrapper.d = new ArrayList();
                }
                else {
                    for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                        WeakReference weakReference0 = (WeakReference)TintContextWrapper.d.get(v1);
                        if(weakReference0 == null || weakReference0.get() == null) {
                            TintContextWrapper.d.remove(v1);
                        }
                    }
                    for(int v2 = TintContextWrapper.d.size() - 1; v2 >= 0; --v2) {
                        WeakReference weakReference1 = (WeakReference)TintContextWrapper.d.get(v2);
                        Context context1 = weakReference1 == null ? null : ((TintContextWrapper)weakReference1.get());
                        if(context1 != null && ((ContextWrapper)context1).getBaseContext() == context0) {
                            return context1;
                        }
                    }
                }
                Context context2 = new TintContextWrapper(context0);
                TintContextWrapper.d.add(new WeakReference(context2));
                return context2;
            }
        }
        return context0;
    }

    @Override  // android.content.ContextWrapper
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override  // android.content.ContextWrapper
    public Resources getResources() {
        return this.a;
    }

    @Override  // android.content.ContextWrapper
    public Resources.Theme getTheme() {
        return this.b == null ? super.getTheme() : this.b;
    }

    @Override  // android.content.ContextWrapper
    public void setTheme(int v) {
        Resources.Theme resources$Theme0 = this.b;
        if(resources$Theme0 == null) {
            super.setTheme(v);
            return;
        }
        resources$Theme0.applyStyle(v, true);
    }
}

