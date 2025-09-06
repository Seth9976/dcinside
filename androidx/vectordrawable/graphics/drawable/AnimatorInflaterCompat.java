package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser.PathDataNode;
import androidx.core.graphics.PathParser;
import java.io.IOException;
import java.util.ArrayList;
import jeb.synthetic.TWR;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.c})
public class AnimatorInflaterCompat {
    static class PathDataEvaluator implements TypeEvaluator {
        private PathDataNode[] a;

        PathDataEvaluator() {
        }

        PathDataEvaluator(PathDataNode[] arr_pathParser$PathDataNode) {
            this.a = arr_pathParser$PathDataNode;
        }

        public PathDataNode[] a(float f, PathDataNode[] arr_pathParser$PathDataNode, PathDataNode[] arr_pathParser$PathDataNode1) {
            if(!PathParser.b(arr_pathParser$PathDataNode, arr_pathParser$PathDataNode1)) {
                throw new IllegalArgumentException("Can\'t interpolate between two incompatible pathData");
            }
            if(!PathParser.b(this.a, arr_pathParser$PathDataNode)) {
                this.a = PathParser.f(arr_pathParser$PathDataNode);
            }
            for(int v = 0; v < arr_pathParser$PathDataNode.length; ++v) {
                this.a[v].j(arr_pathParser$PathDataNode[v], arr_pathParser$PathDataNode1[v], f);
            }
            return this.a;
        }

        @Override  // android.animation.TypeEvaluator
        public Object evaluate(float f, Object object0, Object object1) {
            return this.a(f, ((PathDataNode[])object0), ((PathDataNode[])object1));
        }
    }

    private static final String a = "AnimatorInflater";
    private static final int b = 0;
    private static final int c = 100;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final boolean i = false;

    private static Animator a(Context context0, Resources resources0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0, float f) throws XmlPullParserException, IOException {
        return AnimatorInflaterCompat.b(context0, resources0, resources$Theme0, xmlPullParser0, Xml.asAttributeSet(xmlPullParser0), null, 0, f);
    }

    private static Animator b(Context context0, Resources resources0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, AnimatorSet animatorSet0, int v, float f) throws XmlPullParserException, IOException {
        int v3;
        int v1 = xmlPullParser0.getDepth();
        Animator animator0 = null;
        ArrayList arrayList0 = null;
        while(true) {
            int v2 = xmlPullParser0.next();
            v3 = 0;
            if(v2 == 3 && xmlPullParser0.getDepth() <= v1 || v2 == 1) {
                break;
            }
            if(v2 == 2) {
                String s = xmlPullParser0.getName();
                if(s.equals("objectAnimator")) {
                    animator0 = AnimatorInflaterCompat.o(context0, resources0, resources$Theme0, attributeSet0, f, xmlPullParser0);
                }
                else if(s.equals("animator")) {
                    animator0 = AnimatorInflaterCompat.m(context0, resources0, resources$Theme0, attributeSet0, null, f, xmlPullParser0);
                }
                else if(s.equals("set")) {
                    AnimatorSet animatorSet1 = new AnimatorSet();
                    TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.a0);
                    AnimatorInflaterCompat.b(context0, resources0, resources$Theme0, xmlPullParser0, attributeSet0, animatorSet1, TypedArrayUtils.k(typedArray0, xmlPullParser0, "ordering", 0, 0), f);
                    typedArray0.recycle();
                    animator0 = animatorSet1;
                }
                else {
                    if(!s.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser0.getName());
                    }
                    PropertyValuesHolder[] arr_propertyValuesHolder = AnimatorInflaterCompat.q(context0, resources0, resources$Theme0, xmlPullParser0, Xml.asAttributeSet(xmlPullParser0));
                    if(arr_propertyValuesHolder != null && animator0 instanceof ValueAnimator) {
                        ((ValueAnimator)animator0).setValues(arr_propertyValuesHolder);
                    }
                    v3 = 1;
                }
                if(animatorSet0 != null && v3 == 0) {
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    arrayList0.add(animator0);
                }
            }
        }
        if(animatorSet0 != null && arrayList0 != null) {
            Animator[] arr_animator = new Animator[arrayList0.size()];
            for(Object object0: arrayList0) {
                arr_animator[v3] = (Animator)object0;
                ++v3;
            }
            if(v == 0) {
                animatorSet0.playTogether(arr_animator);
                return animator0;
            }
            animatorSet0.playSequentially(arr_animator);
        }
        return animator0;
    }

    private static Keyframe c(Keyframe keyframe0, float f) {
        if(keyframe0.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        return keyframe0.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    private static void d(Keyframe[] arr_keyframe, float f, int v, int v1) {
        float f1 = f / ((float)(v1 - v + 2));
        while(v <= v1) {
            arr_keyframe[v].setFraction(arr_keyframe[v - 1].getFraction() + f1);
            ++v;
        }
    }

    private static void e(Object[] arr_object, String s) {
        if(arr_object != null && arr_object.length != 0) {
            Log.d("AnimatorInflater", s);
            for(int v = 0; v < arr_object.length; ++v) {
                Keyframe keyframe0 = (Keyframe)arr_object[v];
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("Keyframe ");
                stringBuilder0.append(v);
                stringBuilder0.append(": fraction ");
                String s1 = "null";
                String s2 = keyframe0.getFraction() < 0.0f ? "null" : keyframe0.getFraction();
                stringBuilder0.append(s2);
                stringBuilder0.append(", , value : ");
                if(keyframe0.hasValue()) {
                    s1 = keyframe0.getValue();
                }
                stringBuilder0.append(s1);
                Log.d("AnimatorInflater", stringBuilder0.toString());
            }
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray0, int v, int v1, int v2, String s) {
        int v7;
        int v6;
        int v5;
        PropertyValuesHolder propertyValuesHolder1;
        TypedValue typedValue0 = typedArray0.peekValue(v1);
        int v3 = typedValue0 == null ? typedValue0.type : 0;
        TypedValue typedValue1 = typedArray0.peekValue(v2);
        int v4 = typedValue1 == null ? typedValue1.type : 0;
        if(v == 4) {
            v = (typedValue0 == null || !AnimatorInflaterCompat.i(v3)) && (typedValue1 == null || !AnimatorInflaterCompat.i(v4)) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder0 = null;
        if(v == 2) {
            String s1 = typedArray0.getString(v1);
            String s2 = typedArray0.getString(v2);
            PathDataNode[] arr_pathParser$PathDataNode = PathParser.d(s1);
            PathDataNode[] arr_pathParser$PathDataNode1 = PathParser.d(s2);
            if(arr_pathParser$PathDataNode != null || arr_pathParser$PathDataNode1 != null) {
                if(arr_pathParser$PathDataNode != null) {
                    PathDataEvaluator animatorInflaterCompat$PathDataEvaluator0 = new PathDataEvaluator();
                    if(arr_pathParser$PathDataNode1 != null) {
                        if(!PathParser.b(arr_pathParser$PathDataNode, arr_pathParser$PathDataNode1)) {
                            throw new InflateException(" Can\'t morph from " + s1 + " to " + s2);
                        }
                        return PropertyValuesHolder.ofObject(s, animatorInflaterCompat$PathDataEvaluator0, new Object[]{arr_pathParser$PathDataNode, arr_pathParser$PathDataNode1});
                    }
                    return PropertyValuesHolder.ofObject(s, animatorInflaterCompat$PathDataEvaluator0, new Object[]{arr_pathParser$PathDataNode});
                }
                return arr_pathParser$PathDataNode1 == null ? null : PropertyValuesHolder.ofObject(s, new PathDataEvaluator(), new Object[]{arr_pathParser$PathDataNode1});
            }
        }
        else {
            ArgbEvaluator argbEvaluator0 = v == 3 ? ArgbEvaluator.a() : null;
            if(v == 0) {
                if(typedValue0 == null) {
                    propertyValuesHolder1 = PropertyValuesHolder.ofFloat(s, new float[]{(v4 == 5 ? typedArray0.getDimension(v2, 0.0f) : typedArray0.getFloat(v2, 0.0f))});
                }
                else {
                    float f = v3 == 5 ? typedArray0.getDimension(v1, 0.0f) : typedArray0.getFloat(v1, 0.0f);
                    propertyValuesHolder1 = typedValue1 == null ? PropertyValuesHolder.ofFloat(s, new float[]{f}) : PropertyValuesHolder.ofFloat(s, new float[]{f, (v4 == 5 ? typedArray0.getDimension(v2, 0.0f) : typedArray0.getFloat(v2, 0.0f))});
                }
                propertyValuesHolder0 = propertyValuesHolder1;
            }
            else if(typedValue0 != null) {
                if(v3 == 5) {
                    v5 = (int)typedArray0.getDimension(v1, 0.0f);
                }
                else {
                    v5 = AnimatorInflaterCompat.i(v3) ? typedArray0.getColor(v1, 0) : typedArray0.getInt(v1, 0);
                }
                if(typedValue1 == null) {
                    propertyValuesHolder0 = PropertyValuesHolder.ofInt(s, new int[]{v5});
                }
                else {
                    if(v4 == 5) {
                        v6 = (int)typedArray0.getDimension(v2, 0.0f);
                    }
                    else {
                        v6 = AnimatorInflaterCompat.i(v4) ? typedArray0.getColor(v2, 0) : typedArray0.getInt(v2, 0);
                    }
                    propertyValuesHolder0 = PropertyValuesHolder.ofInt(s, new int[]{v5, v6});
                }
            }
            else if(typedValue1 != null) {
                if(v4 == 5) {
                    v7 = (int)typedArray0.getDimension(v2, 0.0f);
                }
                else {
                    v7 = AnimatorInflaterCompat.i(v4) ? typedArray0.getColor(v2, 0) : typedArray0.getInt(v2, 0);
                }
                propertyValuesHolder0 = PropertyValuesHolder.ofInt(s, new int[]{v7});
            }
            if(propertyValuesHolder0 != null && argbEvaluator0 != null) {
                propertyValuesHolder0.setEvaluator(argbEvaluator0);
            }
        }
        return propertyValuesHolder0;
    }

    private static int g(TypedArray typedArray0, int v, int v1) {
        TypedValue typedValue0 = typedArray0.peekValue(v);
        int v2 = typedValue0 == null ? typedValue0.type : 0;
        TypedValue typedValue1 = typedArray0.peekValue(v1);
        if(typedValue1 == null) {
            return typedValue0 != null && AnimatorInflaterCompat.i(v2) ? 3 : 0;
        }
        return (typedValue0 == null || !AnimatorInflaterCompat.i(v2)) && !AnimatorInflaterCompat.i(typedValue1.type) ? 0 : 3;
    }

    private static int h(Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, XmlPullParser xmlPullParser0) {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.h0);
        int v = 0;
        TypedValue typedValue0 = TypedArrayUtils.t(typedArray0, xmlPullParser0, "value", 0);
        if(typedValue0 != null && AnimatorInflaterCompat.i(typedValue0.type)) {
            v = 3;
        }
        typedArray0.recycle();
        return v;
    }

    private static boolean i(int v) {
        return v >= 28 && v <= 0x1F;
    }

    public static Animator j(Context context0, @AnimatorRes int v) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT < 24 ? AnimatorInflaterCompat.k(context0, context0.getResources(), context0.getTheme(), v) : AnimatorInflater.loadAnimator(context0, v);
    }

    public static Animator k(Context context0, Resources resources0, Resources.Theme resources$Theme0, @AnimatorRes int v) throws Resources.NotFoundException {
        return AnimatorInflaterCompat.l(context0, resources0, resources$Theme0, v, 1.0f);
    }

    public static Animator l(Context context0, Resources resources0, Resources.Theme resources$Theme0, @AnimatorRes int v, float f) throws Resources.NotFoundException {
        Animator animator0;
        XmlResourceParser xmlResourceParser0;
        try {
            try {
                xmlResourceParser0 = null;
                xmlResourceParser0 = resources0.getAnimation(v);
                animator0 = AnimatorInflaterCompat.a(context0, resources0, resources$Theme0, xmlResourceParser0, f);
            }
            catch(XmlPullParserException xmlPullParserException0) {
                Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException("Can\'t load animation resource ID #0x" + Integer.toHexString(v));
                resources$NotFoundException0.initCause(xmlPullParserException0);
                throw resources$NotFoundException0;
            }
            catch(IOException iOException0) {
                Resources.NotFoundException resources$NotFoundException1 = new Resources.NotFoundException("Can\'t load animation resource ID #0x" + Integer.toHexString(v));
                resources$NotFoundException1.initCause(iOException0);
                throw resources$NotFoundException1;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(xmlResourceParser0, throwable0);
            throw throwable0;
        }
        if(xmlResourceParser0 != null) {
            xmlResourceParser0.close();
        }
        return animator0;
    }

    private static ValueAnimator m(Context context0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, ValueAnimator valueAnimator0, float f, XmlPullParser xmlPullParser0) throws Resources.NotFoundException {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.R);
        TypedArray typedArray1 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.m0);
        if(valueAnimator0 == null) {
            valueAnimator0 = new ValueAnimator();
        }
        AnimatorInflaterCompat.r(valueAnimator0, typedArray0, typedArray1, f, xmlPullParser0);
        int v = TypedArrayUtils.l(typedArray0, xmlPullParser0, "interpolator", 0, 0);
        if(v > 0) {
            valueAnimator0.setInterpolator(AnimationUtilsCompat.b(context0, v));
        }
        typedArray0.recycle();
        if(typedArray1 != null) {
            typedArray1.recycle();
        }
        return valueAnimator0;
    }

    private static Keyframe n(Context context0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, int v, XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        Keyframe keyframe0;
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.h0);
        float f = TypedArrayUtils.j(typedArray0, xmlPullParser0, "fraction", 3, -1.0f);
        TypedValue typedValue0 = TypedArrayUtils.t(typedArray0, xmlPullParser0, "value", 0);
        if(v == 4) {
            v = typedValue0 == null || !AnimatorInflaterCompat.i(typedValue0.type) ? 0 : 3;
        }
        if(typedValue0 == null) {
            keyframe0 = v == 0 ? Keyframe.ofFloat(f) : Keyframe.ofInt(f);
        }
        else {
            switch(v) {
                case 0: {
                    keyframe0 = Keyframe.ofFloat(f, TypedArrayUtils.j(typedArray0, xmlPullParser0, "value", 0, 0.0f));
                    break;
                }
                case 1: 
                case 3: {
                    keyframe0 = Keyframe.ofInt(f, TypedArrayUtils.k(typedArray0, xmlPullParser0, "value", 0, 0));
                    break;
                }
                default: {
                    keyframe0 = null;
                }
            }
        }
        int v1 = TypedArrayUtils.l(typedArray0, xmlPullParser0, "interpolator", 1, 0);
        if(v1 > 0) {
            keyframe0.setInterpolator(AnimationUtilsCompat.b(context0, v1));
        }
        typedArray0.recycle();
        return keyframe0;
    }

    private static ObjectAnimator o(Context context0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, float f, XmlPullParser xmlPullParser0) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator0 = new ObjectAnimator();
        AnimatorInflaterCompat.m(context0, resources0, resources$Theme0, attributeSet0, objectAnimator0, f, xmlPullParser0);
        return objectAnimator0;
    }

    private static PropertyValuesHolder p(Context context0, Resources resources0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0, String s, int v) throws XmlPullParserException, IOException {
        PropertyValuesHolder propertyValuesHolder0 = null;
        ArrayList arrayList0 = null;
    alab1:
        while(true) {
            switch(xmlPullParser0.next()) {
                case 1: 
                case 3: {
                    break alab1;
                }
                default: {
                    if(!xmlPullParser0.getName().equals("keyframe")) {
                        break;
                    }
                    if(v == 4) {
                        v = AnimatorInflaterCompat.h(resources0, resources$Theme0, Xml.asAttributeSet(xmlPullParser0), xmlPullParser0);
                    }
                    Keyframe keyframe0 = AnimatorInflaterCompat.n(context0, resources0, resources$Theme0, Xml.asAttributeSet(xmlPullParser0), v, xmlPullParser0);
                    if(keyframe0 != null) {
                        if(arrayList0 == null) {
                            arrayList0 = new ArrayList();
                        }
                        arrayList0.add(keyframe0);
                    }
                    xmlPullParser0.next();
                }
            }
        }
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            if(v1 > 0) {
                Keyframe keyframe1 = (Keyframe)arrayList0.get(0);
                Keyframe keyframe2 = (Keyframe)arrayList0.get(v1 - 1);
                float f = keyframe2.getFraction();
                if(f < 1.0f) {
                    if(f < 0.0f) {
                        keyframe2.setFraction(1.0f);
                    }
                    else {
                        arrayList0.add(arrayList0.size(), AnimatorInflaterCompat.c(keyframe2, 1.0f));
                        ++v1;
                    }
                }
                float f1 = keyframe1.getFraction();
                if(f1 != 0.0f) {
                    if(f1 < 0.0f) {
                        keyframe1.setFraction(0.0f);
                    }
                    else {
                        arrayList0.add(0, AnimatorInflaterCompat.c(keyframe1, 0.0f));
                        ++v1;
                    }
                }
                Keyframe[] arr_keyframe = new Keyframe[v1];
                arrayList0.toArray(arr_keyframe);
                for(int v2 = 0; v2 < v1; ++v2) {
                    Keyframe keyframe3 = arr_keyframe[v2];
                    if(keyframe3.getFraction() < 0.0f) {
                        if(v2 == 0) {
                            keyframe3.setFraction(0.0f);
                        }
                        else if(v2 == v1 - 1) {
                            keyframe3.setFraction(1.0f);
                        }
                        else {
                            int v3 = v2 + 1;
                            int v4 = v2;
                            while(v3 < v1 - 1 && arr_keyframe[v3].getFraction() < 0.0f) {
                                v4 = v3;
                                ++v3;
                            }
                            AnimatorInflaterCompat.d(arr_keyframe, arr_keyframe[v4 + 1].getFraction() - arr_keyframe[v2 - 1].getFraction(), v2, v4);
                        }
                    }
                }
                propertyValuesHolder0 = PropertyValuesHolder.ofKeyframe(s, arr_keyframe);
                if(v == 3) {
                    propertyValuesHolder0.setEvaluator(ArgbEvaluator.a());
                }
            }
        }
        return propertyValuesHolder0;
    }

    private static PropertyValuesHolder[] q(Context context0, Resources resources0, Resources.Theme resources$Theme0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] arr_propertyValuesHolder = null;
        ArrayList arrayList0 = null;
    alab1:
        while(true) {
            switch(xmlPullParser0.getEventType()) {
                case 2: {
                    if(xmlPullParser0.getName().equals("propertyValuesHolder")) {
                        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.c0);
                        String s = TypedArrayUtils.m(typedArray0, xmlPullParser0, "propertyName", 3);
                        int v1 = TypedArrayUtils.k(typedArray0, xmlPullParser0, "valueType", 2, 4);
                        int v2 = v1;
                        PropertyValuesHolder propertyValuesHolder0 = AnimatorInflaterCompat.p(context0, resources0, resources$Theme0, xmlPullParser0, s, v1);
                        if(propertyValuesHolder0 == null) {
                            propertyValuesHolder0 = AnimatorInflaterCompat.f(typedArray0, v2, 0, 1, s);
                        }
                        if(propertyValuesHolder0 != null) {
                            if(arrayList0 == null) {
                                arrayList0 = new ArrayList();
                            }
                            arrayList0.add(propertyValuesHolder0);
                        }
                        typedArray0.recycle();
                    }
                    xmlPullParser0.next();
                    break;
                }
                case 1: 
                case 3: {
                    break alab1;
                }
                default: {
                    xmlPullParser0.next();
                }
            }
        }
        if(arrayList0 != null) {
            int v3 = arrayList0.size();
            arr_propertyValuesHolder = new PropertyValuesHolder[v3];
            for(int v = 0; v < v3; ++v) {
                arr_propertyValuesHolder[v] = (PropertyValuesHolder)arrayList0.get(v);
            }
        }
        return arr_propertyValuesHolder;
    }

    private static void r(ValueAnimator valueAnimator0, TypedArray typedArray0, TypedArray typedArray1, float f, XmlPullParser xmlPullParser0) {
        long v = (long)TypedArrayUtils.k(typedArray0, xmlPullParser0, "duration", 1, 300);
        long v1 = (long)TypedArrayUtils.k(typedArray0, xmlPullParser0, "startOffset", 2, 0);
        int v2 = TypedArrayUtils.k(typedArray0, xmlPullParser0, "valueType", 7, 4);
        if(TypedArrayUtils.r(xmlPullParser0, "valueFrom") && TypedArrayUtils.r(xmlPullParser0, "valueTo")) {
            if(v2 == 4) {
                v2 = AnimatorInflaterCompat.g(typedArray0, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolder0 = AnimatorInflaterCompat.f(typedArray0, v2, 5, 6, "");
            if(propertyValuesHolder0 != null) {
                valueAnimator0.setValues(new PropertyValuesHolder[]{propertyValuesHolder0});
            }
        }
        valueAnimator0.setDuration(v);
        valueAnimator0.setStartDelay(v1);
        valueAnimator0.setRepeatCount(TypedArrayUtils.k(typedArray0, xmlPullParser0, "repeatCount", 3, 0));
        valueAnimator0.setRepeatMode(TypedArrayUtils.k(typedArray0, xmlPullParser0, "repeatMode", 4, 1));
        if(typedArray1 != null) {
            AnimatorInflaterCompat.s(valueAnimator0, typedArray1, v2, f, xmlPullParser0);
        }
    }

    private static void s(ValueAnimator valueAnimator0, TypedArray typedArray0, int v, float f, XmlPullParser xmlPullParser0) {
        String s = TypedArrayUtils.m(typedArray0, xmlPullParser0, "pathData", 1);
        if(s != null) {
            String s1 = TypedArrayUtils.m(typedArray0, xmlPullParser0, "propertyXName", 2);
            String s2 = TypedArrayUtils.m(typedArray0, xmlPullParser0, "propertyYName", 3);
            if(s1 == null && s2 == null) {
                throw new InflateException(typedArray0.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            AnimatorInflaterCompat.t(PathParser.e(s), ((ObjectAnimator)valueAnimator0), f * 0.5f, s1, s2);
            return;
        }
        ((ObjectAnimator)valueAnimator0).setPropertyName(TypedArrayUtils.m(typedArray0, xmlPullParser0, "propertyName", 0));
    }

    private static void t(Path path0, ObjectAnimator objectAnimator0, float f, String s, String s1) {
        PropertyValuesHolder propertyValuesHolder0;
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        ArrayList arrayList0 = new ArrayList();
        float f1 = 0.0f;
        arrayList0.add(0.0f);
        float f2 = 0.0f;
        do {
            f2 += pathMeasure0.getLength();
            arrayList0.add(f2);
        }
        while(pathMeasure0.nextContour());
        PathMeasure pathMeasure1 = new PathMeasure(path0, false);
        int v = Math.min(100, ((int)(f2 / f)) + 1);
        float[] arr_f = new float[v];
        float[] arr_f1 = new float[v];
        float[] arr_f2 = new float[2];
        int v2 = 0;
        for(int v1 = 0; true; ++v1) {
            propertyValuesHolder0 = null;
            if(v1 >= v) {
                break;
            }
            pathMeasure1.getPosTan(f1 - ((float)(((Float)arrayList0.get(v2)))), arr_f2, null);
            arr_f[v1] = arr_f2[0];
            arr_f1[v1] = arr_f2[1];
            f1 += f2 / ((float)(v - 1));
            if(v2 + 1 < arrayList0.size() && f1 > ((float)(((Float)arrayList0.get(v2 + 1))))) {
                pathMeasure1.nextContour();
                ++v2;
            }
        }
        PropertyValuesHolder propertyValuesHolder1 = s == null ? null : PropertyValuesHolder.ofFloat(s, arr_f);
        if(s1 != null) {
            propertyValuesHolder0 = PropertyValuesHolder.ofFloat(s1, arr_f1);
        }
        if(propertyValuesHolder1 == null) {
            objectAnimator0.setValues(new PropertyValuesHolder[]{propertyValuesHolder0});
            return;
        }
        if(propertyValuesHolder0 == null) {
            objectAnimator0.setValues(new PropertyValuesHolder[]{propertyValuesHolder1});
            return;
        }
        objectAnimator0.setValues(new PropertyValuesHolder[]{propertyValuesHolder1, propertyValuesHolder0});
    }
}

