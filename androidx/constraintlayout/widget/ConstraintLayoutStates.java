package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayoutStates {
    static class State {
        int a;
        ArrayList b;
        int c;
        ConstraintSet d;

        State(Context context0, XmlPullParser xmlPullParser0) {
            this.b = new ArrayList();
            this.c = -1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.State);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.State_android_id) {
                    this.a = typedArray0.getResourceId(v2, this.a);
                }
                else if(v2 == styleable.State_constraints) {
                    this.c = typedArray0.getResourceId(v2, this.c);
                    String s = context0.getResources().getResourceTypeName(this.c);
                    context0.getResources().getResourceName(this.c);
                    if("layout".equals(s)) {
                        ConstraintSet constraintSet0 = new ConstraintSet();
                        this.d = constraintSet0;
                        constraintSet0.G(context0, this.c);
                    }
                }
            }
            typedArray0.recycle();
        }

        void a(Variant constraintLayoutStates$Variant0) {
            this.b.add(constraintLayoutStates$Variant0);
        }

        public int b(float f, float f1) {
            for(int v = 0; v < this.b.size(); ++v) {
                if(((Variant)this.b.get(v)).a(f, f1)) {
                    return v;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int a;
        float b;
        float c;
        float d;
        float e;
        int f;
        ConstraintSet g;

        Variant(Context context0, XmlPullParser xmlPullParser0) {
            this.b = NaNf;
            this.c = NaNf;
            this.d = NaNf;
            this.e = NaNf;
            this.f = -1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.Variant);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.Variant_constraints) {
                    this.f = typedArray0.getResourceId(v2, this.f);
                    String s = context0.getResources().getResourceTypeName(this.f);
                    context0.getResources().getResourceName(this.f);
                    if("layout".equals(s)) {
                        ConstraintSet constraintSet0 = new ConstraintSet();
                        this.g = constraintSet0;
                        constraintSet0.G(context0, this.f);
                    }
                }
                else if(v2 == styleable.Variant_region_heightLessThan) {
                    this.e = typedArray0.getDimension(v2, this.e);
                }
                else if(v2 == styleable.Variant_region_heightMoreThan) {
                    this.c = typedArray0.getDimension(v2, this.c);
                }
                else if(v2 == styleable.Variant_region_widthLessThan) {
                    this.d = typedArray0.getDimension(v2, this.d);
                }
                else if(v2 == styleable.Variant_region_widthMoreThan) {
                    this.b = typedArray0.getDimension(v2, this.b);
                }
                else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArray0.recycle();
        }

        boolean a(float f, float f1) {
            if(!Float.isNaN(this.b) && f < this.b) {
                return false;
            }
            if(!Float.isNaN(this.c) && f1 < this.c) {
                return false;
            }
            return Float.isNaN(this.d) || f <= this.d ? Float.isNaN(this.e) || f1 <= this.e : false;
        }
    }

    private final ConstraintLayout a;
    ConstraintSet b;
    int c;
    int d;
    private SparseArray e;
    private SparseArray f;
    private ConstraintsChangedListener g;
    public static final String h = "ConstraintLayoutStates";
    private static final boolean i = false;

    ConstraintLayoutStates(Context context0, ConstraintLayout constraintLayout0, int v) {
        this.c = -1;
        this.d = -1;
        this.e = new SparseArray();
        this.f = new SparseArray();
        this.g = null;
        this.a = constraintLayout0;
        this.a(context0, v);
    }

    private void a(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            State constraintLayoutStates$State0 = null;
            while(true) {
                switch(v1) {
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlResourceParser0.getName()) {
                            case "ConstraintSet": {
                                this.c(context0, xmlResourceParser0);
                                break;
                            }
                            case "State": {
                                State constraintLayoutStates$State1 = new State(context0, xmlResourceParser0);
                                this.e.put(constraintLayoutStates$State1.a, constraintLayoutStates$State1);
                                constraintLayoutStates$State0 = constraintLayoutStates$State1;
                                break;
                            }
                            case "StateSet": {
                                break;
                            }
                            case "Variant": {
                                Variant constraintLayoutStates$Variant0 = new Variant(context0, xmlResourceParser0);
                                if(constraintLayoutStates$State0 != null) {
                                    constraintLayoutStates$State0.a(constraintLayoutStates$Variant0);
                                }
                                break;
                            }
                            case "layoutDescription": {
                            }
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    default: {
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_25;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_25;
        }
        Log.e("ConstraintLayoutStates", "Error parsing resource: " + v, xmlPullParserException0);
        return;
    label_25:
        Log.e("ConstraintLayoutStates", "Error parsing resource: " + v, iOException0);
    }

    public boolean b(int v, float f, float f1) {
        int v1 = this.c;
        if(v1 != v) {
            return true;
        }
        Object object0 = v == -1 ? this.e.valueAt(0) : this.e.get(v1);
        return this.d == -1 || !((Variant)((State)object0).b.get(this.d)).a(f, f1) ? this.d != ((State)object0).b(f, f1) : false;
    }

    private void c(Context context0, XmlPullParser xmlPullParser0) {
        ConstraintSet constraintSet0 = new ConstraintSet();
        int v = xmlPullParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = xmlPullParser0.getAttributeName(v1);
            String s1 = xmlPullParser0.getAttributeValue(v1);
            if(s != null && s1 != null && "id".equals(s)) {
                int v2 = s1.contains("/") ? context0.getResources().getIdentifier(s1.substring(s1.indexOf(0x2F) + 1), "id", "com.dcinside.app.android") : -1;
                if(v2 == -1) {
                    if(s1.length() > 1) {
                        v2 = Integer.parseInt(s1.substring(1));
                    }
                    else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet0.z0(context0, xmlPullParser0);
                this.f.put(v2, constraintSet0);
                return;
            }
        }
    }

    public void d(ConstraintsChangedListener constraintsChangedListener0) {
        this.g = constraintsChangedListener0;
    }

    public void e(int v, float f, float f1) {
        int v1 = this.c;
        if(v1 == v) {
            State constraintLayoutStates$State0 = v == -1 ? ((State)this.e.valueAt(0)) : ((State)this.e.get(v1));
            if(this.d != -1 && ((Variant)constraintLayoutStates$State0.b.get(this.d)).a(f, f1)) {
                return;
            }
            int v2 = constraintLayoutStates$State0.b(f, f1);
            if(this.d == v2) {
                return;
            }
            ConstraintSet constraintSet0 = v2 == -1 ? this.b : ((Variant)constraintLayoutStates$State0.b.get(v2)).g;
            if(v2 != -1) {
                int v3 = ((Variant)constraintLayoutStates$State0.b.get(v2)).f;
            }
            if(constraintSet0 == null) {
                return;
            }
            this.d = v2;
            constraintSet0.r(this.a);
            if(this.g != null) {
            }
        }
        else {
            this.c = v;
            State constraintLayoutStates$State1 = (State)this.e.get(v);
            int v4 = constraintLayoutStates$State1.b(f, f1);
            ConstraintSet constraintSet1 = v4 == -1 ? constraintLayoutStates$State1.d : ((Variant)constraintLayoutStates$State1.b.get(v4)).g;
            if(v4 != -1) {
                int v5 = ((Variant)constraintLayoutStates$State1.b.get(v4)).f;
            }
            if(constraintSet1 == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + v + ", dim =" + f + ", " + f1);
                return;
            }
            this.d = v4;
            constraintSet1.r(this.a);
        }
    }
}

