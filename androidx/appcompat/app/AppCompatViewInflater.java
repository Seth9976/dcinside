package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppCompatViewInflater {
    static class DeclaredOnClickListener implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public DeclaredOnClickListener(@NonNull View view0, @NonNull String s) {
            this.a = view0;
            this.b = s;
        }

        private void a(@Nullable Context context0) {
            while(context0 != null) {
                try {
                    if(!context0.isRestricted()) {
                        Method method0 = context0.getClass().getMethod(this.b, View.class);
                        if(method0 != null) {
                            this.c = method0;
                            this.d = context0;
                            return;
                        }
                    }
                }
                catch(NoSuchMethodException unused_ex) {
                }
                context0 = context0 instanceof ContextWrapper ? ((ContextWrapper)context0).getBaseContext() : null;
            }
            int v = this.a.getId();
            String s = v == -1 ? "" : " with id \'" + this.a.getContext().getResources().getResourceEntryName(v) + "\'";
            throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + s);
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(@NonNull View view0) {
            if(this.c == null) {
                this.a(this.a.getContext());
            }
            try {
                this.c.invoke(this.d, view0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException0);
            }
        }
    }

    private final Object[] a;
    private static final Class[] b = null;
    private static final int[] c = null;
    private static final int[] d = null;
    private static final int[] e = null;
    private static final int[] f = null;
    private static final String[] g = null;
    private static final String h = "AppCompatViewInflater";
    private static final SimpleArrayMap i;

    static {
        AppCompatViewInflater.b = new Class[]{Context.class, AttributeSet.class};
        AppCompatViewInflater.c = new int[]{0x101026F};
        AppCompatViewInflater.d = new int[]{0x1010580};
        AppCompatViewInflater.e = new int[]{0x101057C};
        AppCompatViewInflater.f = new int[]{0x1010574};
        AppCompatViewInflater.g = new String[]{"android.widget.", "android.view.", "android.webkit."};
        AppCompatViewInflater.i = new SimpleArrayMap();
    }

    public AppCompatViewInflater() {
        this.a = new Object[2];
    }

    private void a(@NonNull Context context0, @NonNull View view0, @NonNull AttributeSet attributeSet0) {
        if(Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.d);
        if(typedArray0.hasValue(0)) {
            ViewCompat.K1(view0, typedArray0.getBoolean(0, false));
        }
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.e);
        if(typedArray1.hasValue(0)) {
            ViewCompat.M1(view0, typedArray1.getString(0));
        }
        typedArray1.recycle();
        TypedArray typedArray2 = context0.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.f);
        if(typedArray2.hasValue(0)) {
            ViewCompat.z2(view0, typedArray2.getBoolean(0, false));
        }
        typedArray2.recycle();
    }

    private void b(View view0, AttributeSet attributeSet0) {
        Context context0 = view0.getContext();
        if(context0 instanceof ContextWrapper && view0.hasOnClickListeners()) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.c);
            String s = typedArray0.getString(0);
            if(s != null) {
                view0.setOnClickListener(new DeclaredOnClickListener(view0, s));
            }
            typedArray0.recycle();
        }
    }

    @NonNull
    protected AppCompatAutoCompleteTextView c(Context context0, AttributeSet attributeSet0) {
        return new AppCompatAutoCompleteTextView(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatButton d(Context context0, AttributeSet attributeSet0) {
        return new AppCompatButton(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatCheckBox e(Context context0, AttributeSet attributeSet0) {
        return new AppCompatCheckBox(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatCheckedTextView f(Context context0, AttributeSet attributeSet0) {
        return new AppCompatCheckedTextView(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatEditText g(Context context0, AttributeSet attributeSet0) {
        return new AppCompatEditText(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatImageButton h(Context context0, AttributeSet attributeSet0) {
        return new AppCompatImageButton(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatImageView i(Context context0, AttributeSet attributeSet0) {
        return new AppCompatImageView(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatMultiAutoCompleteTextView j(Context context0, AttributeSet attributeSet0) {
        return new AppCompatMultiAutoCompleteTextView(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatRadioButton k(Context context0, AttributeSet attributeSet0) {
        return new AppCompatRadioButton(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatRatingBar l(Context context0, AttributeSet attributeSet0) {
        return new AppCompatRatingBar(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatSeekBar m(Context context0, AttributeSet attributeSet0) {
        return new AppCompatSeekBar(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatSpinner n(Context context0, AttributeSet attributeSet0) {
        return new AppCompatSpinner(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatTextView o(Context context0, AttributeSet attributeSet0) {
        return new AppCompatTextView(context0, attributeSet0);
    }

    @NonNull
    protected AppCompatToggleButton p(Context context0, AttributeSet attributeSet0) {
        return new AppCompatToggleButton(context0, attributeSet0);
    }

    @Nullable
    protected View q(Context context0, String s, AttributeSet attributeSet0) [...] // Inlined contents

    @Nullable
    public final View r(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0, boolean z, boolean z1, boolean z2, boolean z3) {
        View view1;
        Context context1 = !z || view0 == null ? context0 : view0.getContext();
        if(z1 || z2) {
            context1 = AppCompatViewInflater.u(context1, attributeSet0, z1, z2);
        }
        if(z3) {
            context1 = TintContextWrapper.b(context1);
        }
        s.hashCode();
        switch(s) {
            case "AutoCompleteTextView": {
                view1 = this.c(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "Button": {
                view1 = this.d(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "CheckBox": {
                view1 = this.e(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "CheckedTextView": {
                view1 = this.f(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "EditText": {
                view1 = this.g(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "ImageButton": {
                view1 = this.h(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "ImageView": {
                view1 = this.i(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "MultiAutoCompleteTextView": {
                view1 = this.j(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "RadioButton": {
                view1 = this.k(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "RatingBar": {
                view1 = this.l(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "SeekBar": {
                view1 = this.m(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "Spinner": {
                view1 = this.n(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "TextView": {
                view1 = this.o(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            case "ToggleButton": {
                view1 = this.p(context1, attributeSet0);
                this.v(view1, s);
                break;
            }
            default: {
                view1 = null;
            }
        }
        if(view1 == null && context0 != context1) {
            view1 = this.t(context1, s, attributeSet0);
        }
        if(view1 != null) {
            this.b(view1, attributeSet0);
            this.a(context1, view1, attributeSet0);
        }
        return view1;
    }

    private View s(Context context0, String s, String s1) throws ClassNotFoundException, InflateException {
        SimpleArrayMap simpleArrayMap0 = AppCompatViewInflater.i;
        Constructor constructor0 = (Constructor)simpleArrayMap0.get(s);
        try {
            if(constructor0 == null) {
                constructor0 = Class.forName((s1 == null ? s : s1 + s), false, context0.getClassLoader()).asSubclass(View.class).getConstructor(AppCompatViewInflater.b);
                simpleArrayMap0.put(s, constructor0);
            }
            constructor0.setAccessible(true);
            return (View)constructor0.newInstance(this.a);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private View t(Context context0, String s, AttributeSet attributeSet0) {
        View view0;
        if(s.equals("view")) {
            s = attributeSet0.getAttributeValue(null, "class");
        }
        try {
            this.a[0] = context0;
            this.a[1] = attributeSet0;
            if(-1 == s.indexOf(46)) {
                for(int v1 = 0; true; ++v1) {
                    String[] arr_s = AppCompatViewInflater.g;
                    if(v1 >= arr_s.length) {
                        return null;
                    }
                    view0 = this.s(context0, s, arr_s[v1]);
                    if(view0 != null) {
                        break;
                    }
                }
                return view0;
            }
            return this.s(context0, s, null);
        }
        catch(Exception unused_ex) {
            return null;
        }
        finally {
            this.a[0] = null;
            this.a[1] = null;
        }
    }

    private static Context u(Context context0, AttributeSet attributeSet0, boolean z, boolean z1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.View, 0, 0);
        int v = z ? typedArray0.getResourceId(styleable.View_android_theme, 0) : 0;
        if(z1 && v == 0) {
            v = typedArray0.getResourceId(styleable.View_theme, 0);
            if(v != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        typedArray0.recycle();
        return v != 0 && (!(context0 instanceof ContextThemeWrapper) || ((ContextThemeWrapper)context0).c() != v) ? new ContextThemeWrapper(context0, v) : context0;
    }

    private void v(View view0, String s) {
        if(view0 == null) {
            throw new IllegalStateException(this.getClass().getName() + " asked to inflate view for <" + s + ">, but returned null");
        }
    }
}

