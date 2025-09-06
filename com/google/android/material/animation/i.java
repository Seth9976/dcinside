package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

public class i {
    private final SimpleArrayMap a;
    private final SimpleArrayMap b;
    private static final String c = "MotionSpec";

    public i() {
        this.a = new SimpleArrayMap();
        this.b = new SimpleArrayMap();
    }

    private static void a(@NonNull i i0, Animator animator0) {
        if(!(animator0 instanceof ObjectAnimator)) {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator0);
        }
        i0.l(((ObjectAnimator)animator0).getPropertyName(), ((ObjectAnimator)animator0).getValues());
        i0.m(((ObjectAnimator)animator0).getPropertyName(), j.b(((ObjectAnimator)animator0)));
    }

    @NonNull
    private PropertyValuesHolder[] b(@NonNull PropertyValuesHolder[] arr_propertyValuesHolder) {
        PropertyValuesHolder[] arr_propertyValuesHolder1 = new PropertyValuesHolder[arr_propertyValuesHolder.length];
        for(int v = 0; v < arr_propertyValuesHolder.length; ++v) {
            arr_propertyValuesHolder1[v] = arr_propertyValuesHolder[v].clone();
        }
        return arr_propertyValuesHolder1;
    }

    @Nullable
    public static i c(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : i.d(context0, v1);
        }
        return null;
    }

    @Nullable
    public static i d(@NonNull Context context0, @AnimatorRes int v) {
        try {
            Animator animator0 = AnimatorInflater.loadAnimator(context0, v);
            if(animator0 instanceof AnimatorSet) {
                return i.e(((AnimatorSet)animator0).getChildAnimations());
            }
            if(animator0 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(animator0);
                return i.e(arrayList0);
            }
            return null;
        }
        catch(Exception exception0) {
        }
        Log.w("MotionSpec", "Can\'t load animation resource ID #0x" + Integer.toHexString(v), exception0);
        return null;
    }

    @NonNull
    private static i e(@NonNull List list0) {
        i i0 = new i();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            i.a(i0, ((Animator)list0.get(v1)));
        }
        return i0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i ? this.a.equals(((i)object0).a) : false;
    }

    @NonNull
    public ObjectAnimator f(@NonNull String s, @NonNull Object object0, @NonNull Property property0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(object0, this.g(s));
        objectAnimator0.setProperty(property0);
        this.h(s).a(objectAnimator0);
        return objectAnimator0;
    }

    @NonNull
    public PropertyValuesHolder[] g(String s) {
        if(!this.j(s)) {
            throw new IllegalArgumentException();
        }
        return this.b(((PropertyValuesHolder[])this.b.get(s)));
    }

    public j h(String s) {
        if(!this.k(s)) {
            throw new IllegalArgumentException();
        }
        return (j)this.a.get(s);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public long i() {
        int v = this.a.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            j j0 = (j)this.a.l(v2);
            v1 = Math.max(v1, j0.c() + j0.d());
        }
        return v1;
    }

    public boolean j(String s) {
        return this.b.get(s) != null;
    }

    public boolean k(String s) {
        return this.a.get(s) != null;
    }

    public void l(String s, PropertyValuesHolder[] arr_propertyValuesHolder) {
        this.b.put(s, arr_propertyValuesHolder);
    }

    public void m(String s, @Nullable j j0) {
        this.a.put(s, j0);
    }

    @Override
    @NonNull
    public String toString() {
        return '\n' + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}

