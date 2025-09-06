package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {
    public static enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE;

        private static AttributeType[] a() [...] // Inlined contents
    }

    private boolean a;
    String b;
    private AttributeType c;
    private int d;
    private float e;
    private String f;
    boolean g;
    private int h;
    private static final String i = "TransitionLayout";
    private static final boolean j = false;

    public ConstraintAttribute(ConstraintAttribute constraintAttribute0, Object object0) {
        this.a = false;
        this.b = constraintAttribute0.b;
        this.c = constraintAttribute0.c;
        this.w(object0);
    }

    public ConstraintAttribute(String s, AttributeType constraintAttribute$AttributeType0) {
        this.a = false;
        this.b = s;
        this.c = constraintAttribute$AttributeType0;
    }

    public ConstraintAttribute(String s, AttributeType constraintAttribute$AttributeType0, Object object0, boolean z) {
        this.b = s;
        this.c = constraintAttribute$AttributeType0;
        this.a = z;
        this.w(object0);
    }

    public void a(View view0) {
        Class class0 = view0.getClass();
        String s = this.b;
        String s1 = this.a ? s : "set" + s;
        try {
            switch(this.c.ordinal()) {
                case 1: {
                    class0.getMethod(s1, Float.TYPE).invoke(view0, this.e);
                    return;
                }
                case 2: {
                    class0.getMethod(s1, Integer.TYPE).invoke(view0, this.h);
                    return;
                }
                case 3: {
                    Method method0 = class0.getMethod(s1, Drawable.class);
                    ColorDrawable colorDrawable0 = new ColorDrawable();
                    colorDrawable0.setColor(this.h);
                    method0.invoke(view0, colorDrawable0);
                    return;
                }
                case 4: {
                    class0.getMethod(s1, CharSequence.class).invoke(view0, this.f);
                    return;
                }
                case 5: {
                    class0.getMethod(s1, Boolean.TYPE).invoke(view0, Boolean.valueOf(this.g));
                    return;
                }
                case 6: {
                    class0.getMethod(s1, Float.TYPE).invoke(view0, this.e);
                    return;
                }
                case 0: 
                case 7: {
                    class0.getMethod(s1, Integer.TYPE).invoke(view0, this.d);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch(NoSuchMethodException noSuchMethodException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), illegalAccessException0);
            return;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), invocationTargetException0);
            return;
        }
        Log.e("TransitionLayout", class0.getName() + " must have a method " + s1, noSuchMethodException0);
    }

    private static int b(int v) {
        int v1 = (v & ~(v >> 0x1F)) - 0xFF;
        return (v1 & v1 >> 0x1F) + 0xFF;
    }

    public boolean c(ConstraintAttribute constraintAttribute0) {
        if(constraintAttribute0 != null) {
            AttributeType constraintAttribute$AttributeType0 = this.c;
            if(constraintAttribute$AttributeType0 == constraintAttribute0.c) {
                switch(constraintAttribute$AttributeType0.ordinal()) {
                    case 1: {
                        return this.e == constraintAttribute0.e;
                    }
                    case 2: 
                    case 3: {
                        return this.h == constraintAttribute0.h;
                    }
                    case 4: {
                        return this.d == constraintAttribute0.d;
                    }
                    case 5: {
                        return this.g == constraintAttribute0.g;
                    }
                    case 6: {
                        return this.e == constraintAttribute0.e;
                    }
                    case 0: 
                    case 7: {
                        return this.d == constraintAttribute0.d;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static HashMap d(HashMap hashMap0, View view0) {
        HashMap hashMap1 = new HashMap();
        Class class0 = view0.getClass();
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap0.get(s);
            try {
                if(s.equals("BackgroundColor")) {
                    hashMap1.put(s, new ConstraintAttribute(constraintAttribute0, ((ColorDrawable)view0.getBackground()).getColor()));
                    continue;
                }
                hashMap1.put(s, new ConstraintAttribute(constraintAttribute0, class0.getMethod("getMap" + s, null).invoke(view0, null)));
                continue;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), illegalAccessException0);
                continue;
            }
            catch(InvocationTargetException invocationTargetException0) {
                goto label_21;
            }
            Log.e("TransitionLayout", class0.getName() + " must have a method " + s, noSuchMethodException0);
            continue;
        label_21:
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), invocationTargetException0);
        }
        return hashMap1;
    }

    public int e() {
        return this.h;
    }

    public float f() {
        return this.e;
    }

    public int g() {
        return this.d;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.f;
    }

    public AttributeType j() {
        return this.c;
    }

    public float k() {
        switch(this.c.ordinal()) {
            case 0: {
                return (float)this.d;
            }
            case 2: 
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 4: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 5: {
                return this.g ? 1.0f : 0.0f;
            }
            case 1: 
            case 6: {
                return this.e;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void l(float[] arr_f) {
        switch(this.c.ordinal()) {
            case 0: {
                arr_f[0] = (float)this.d;
                return;
            }
            case 1: {
                arr_f[0] = this.e;
                return;
            }
            case 2: 
            case 3: {
                int v = this.h >> 24 & 0xFF;
                float f = (float)Math.pow(((float)(this.h >> 8 & 0xFF)) / 255.0f, 2.2);
                float f1 = (float)Math.pow(((float)(this.h & 0xFF)) / 255.0f, 2.2);
                arr_f[0] = (float)Math.pow(((float)(this.h >> 16 & 0xFF)) / 255.0f, 2.2);
                arr_f[1] = f;
                arr_f[2] = f1;
                arr_f[3] = ((float)v) / 255.0f;
                return;
            }
            case 4: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 5: {
                arr_f[0] = this.g ? 1.0f : 0.0f;
                return;
            }
            case 6: {
                arr_f[0] = this.e;
            }
        }
    }

    public boolean m() {
        return this.g;
    }

    public boolean n() {
        switch(this.c.ordinal()) {
            case 4: 
            case 5: 
            case 7: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public boolean o() {
        return this.a;
    }

    public int p() {
        switch(this.c.ordinal()) {
            case 2: 
            case 3: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }

    public static void q(Context context0, XmlPullParser xmlPullParser0, HashMap hashMap0) {
        Integer integer0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.CustomAttribute);
        int v = typedArray0.getIndexCount();
        String s = null;
        Object object0 = null;
        AttributeType constraintAttribute$AttributeType0 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.CustomAttribute_attributeName) {
                s = typedArray0.getString(v2);
                if(s != null && s.length() > 0) {
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                }
            }
            else if(v2 == styleable.CustomAttribute_methodName) {
                s = typedArray0.getString(v2);
                z = true;
            }
            else if(v2 == styleable.CustomAttribute_customBoolean) {
                object0 = Boolean.valueOf(typedArray0.getBoolean(v2, false));
                constraintAttribute$AttributeType0 = AttributeType.f;
            }
            else if(v2 == styleable.CustomAttribute_customColorValue) {
                integer0 = typedArray0.getColor(v2, 0);
                constraintAttribute$AttributeType0 = AttributeType.c;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customColorDrawableValue) {
                integer0 = typedArray0.getColor(v2, 0);
                constraintAttribute$AttributeType0 = AttributeType.d;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customPixelDimension) {
                integer0 = TypedValue.applyDimension(1, typedArray0.getDimension(v2, 0.0f), context0.getResources().getDisplayMetrics());
                constraintAttribute$AttributeType0 = AttributeType.g;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customDimension) {
                integer0 = typedArray0.getDimension(v2, 0.0f);
                constraintAttribute$AttributeType0 = AttributeType.g;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customFloatValue) {
                integer0 = typedArray0.getFloat(v2, NaNf);
                constraintAttribute$AttributeType0 = AttributeType.b;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customIntegerValue) {
                integer0 = typedArray0.getInteger(v2, -1);
                constraintAttribute$AttributeType0 = AttributeType.a;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customStringValue) {
                integer0 = typedArray0.getString(v2);
                constraintAttribute$AttributeType0 = AttributeType.e;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customReference) {
                AttributeType constraintAttribute$AttributeType1 = AttributeType.h;
                int v3 = typedArray0.getResourceId(v2, -1);
                if(v3 == -1) {
                    v3 = typedArray0.getInt(v2, -1);
                }
                constraintAttribute$AttributeType0 = constraintAttribute$AttributeType1;
                object0 = v3;
            }
        }
        if(s != null && object0 != null) {
            hashMap0.put(s, new ConstraintAttribute(s, constraintAttribute$AttributeType0, object0, z));
        }
        typedArray0.recycle();
    }

    public static void r(View view0, HashMap hashMap0) {
        Class class0 = view0.getClass();
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap0.get(s);
            String s1 = constraintAttribute0.a ? s : "set" + s;
            try {
                switch(constraintAttribute0.c.ordinal()) {
                    case 0: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, constraintAttribute0.d);
                        continue;
                    }
                    case 1: {
                        class0.getMethod(s1, Float.TYPE).invoke(view0, constraintAttribute0.e);
                        continue;
                    }
                    case 2: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, constraintAttribute0.h);
                        continue;
                    }
                    case 3: {
                        Method method0 = class0.getMethod(s1, Drawable.class);
                        ColorDrawable colorDrawable0 = new ColorDrawable();
                        colorDrawable0.setColor(constraintAttribute0.h);
                        method0.invoke(view0, colorDrawable0);
                        continue;
                    }
                    case 4: {
                        class0.getMethod(s1, CharSequence.class).invoke(view0, constraintAttribute0.f);
                        continue;
                    }
                    case 5: {
                        class0.getMethod(s1, Boolean.TYPE).invoke(view0, Boolean.valueOf(constraintAttribute0.g));
                        continue;
                    }
                    case 6: {
                        class0.getMethod(s1, Float.TYPE).invoke(view0, constraintAttribute0.e);
                        continue;
                    }
                    case 7: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, constraintAttribute0.d);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), illegalAccessException0);
                continue;
            }
            catch(InvocationTargetException invocationTargetException0) {
                goto label_38;
            }
            Log.e("TransitionLayout", class0.getName() + " must have a method " + s1, noSuchMethodException0);
            continue;
        label_38:
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), invocationTargetException0);
        }
    }

    public void s(int v) {
        this.h = v;
    }

    public void t(float f) {
        this.e = f;
    }

    public void u(int v) {
        this.d = v;
    }

    public void v(String s) {
        this.f = s;
    }

    public void w(Object object0) {
        switch(this.c.ordinal()) {
            case 1: {
                this.e = (float)(((Float)object0));
                return;
            }
            case 2: 
            case 3: {
                this.h = (int)(((Integer)object0));
                return;
            }
            case 4: {
                this.f = (String)object0;
                return;
            }
            case 5: {
                this.g = ((Boolean)object0).booleanValue();
                return;
            }
            case 6: {
                this.e = (float)(((Float)object0));
                return;
            }
            case 0: 
            case 7: {
                this.d = (int)(((Integer)object0));
            }
        }
    }

    public void x(float[] arr_f) {
        boolean z = false;
        switch(this.c.ordinal()) {
            case 1: {
                this.e = arr_f[0];
                return;
            }
            case 2: 
            case 3: {
                int v = Color.HSVToColor(arr_f);
                this.h = ConstraintAttribute.b(((int)(arr_f[3] * 255.0f))) << 24 | v & 0xFFFFFF;
                return;
            }
            case 4: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 5: {
                if(((double)arr_f[0]) > 0.5) {
                    z = true;
                }
                this.g = z;
                return;
            }
            case 6: {
                this.e = arr_f[0];
                return;
            }
            case 0: 
            case 7: {
                this.d = (int)arr_f[0];
            }
        }
    }
}

