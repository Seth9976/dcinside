package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateSet {
    static class State {
        int a;
        ArrayList b;
        int c;
        boolean d;

        State(Context context0, XmlPullParser xmlPullParser0) {
            this.b = new ArrayList();
            this.c = -1;
            this.d = false;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.State);
            int v1 = typedArray0.getIndexCount();
            for(int v = 0; v < v1; ++v) {
                int v2 = typedArray0.getIndex(v);
                if(v2 == styleable.State_android_id) {
                    this.a = typedArray0.getResourceId(v2, this.a);
                }
                else if(v2 == styleable.State_constraints) {
                    this.c = typedArray0.getResourceId(v2, this.c);
                    String s = context0.getResources().getResourceTypeName(this.c);
                    context0.getResources().getResourceName(this.c);
                    if("layout".equals(s)) {
                        this.d = true;
                    }
                }
            }
            typedArray0.recycle();
        }

        void a(Variant stateSet$Variant0) {
            this.b.add(stateSet$Variant0);
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
        boolean g;

        Variant(Context context0, XmlPullParser xmlPullParser0) {
            this.b = NaNf;
            this.c = NaNf;
            this.d = NaNf;
            this.e = NaNf;
            this.f = -1;
            this.g = false;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.Variant);
            int v1 = typedArray0.getIndexCount();
            for(int v = 0; v < v1; ++v) {
                int v2 = typedArray0.getIndex(v);
                if(v2 == styleable.Variant_constraints) {
                    this.f = typedArray0.getResourceId(v2, this.f);
                    String s = context0.getResources().getResourceTypeName(this.f);
                    context0.getResources().getResourceName(this.f);
                    if("layout".equals(s)) {
                        this.g = true;
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

    int a;
    int b;
    int c;
    private SparseArray d;
    private ConstraintsChangedListener e;
    public static final String f = "ConstraintLayoutStates";
    private static final boolean g = false;

    public StateSet(Context context0, XmlPullParser xmlPullParser0) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = new SparseArray();
        this.e = null;
        this.b(context0, xmlPullParser0);
    }

    public int a(int v, int v1, float f, float f1) {
        State stateSet$State0 = (State)this.d.get(v1);
        if(stateSet$State0 == null) {
            return v1;
        }
        if(f != -1.0f && f1 != -1.0f) {
            Variant stateSet$Variant0 = null;
            for(Object object0: stateSet$State0.b) {
                Variant stateSet$Variant1 = (Variant)object0;
                if(stateSet$Variant1.a(f, f1)) {
                    if(v == stateSet$Variant1.f) {
                        return v;
                    }
                    stateSet$Variant0 = stateSet$Variant1;
                }
            }
            return stateSet$Variant0 == null ? stateSet$State0.c : stateSet$Variant0.f;
        }
        if(stateSet$State0.c == v) {
            return v;
        }
        for(Object object1: stateSet$State0.b) {
            if(v == ((Variant)object1).f) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return stateSet$State0.c;
    }

    private void b(Context context0, XmlPullParser xmlPullParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.StateSet);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.StateSet_defaultState) {
                this.a = typedArray0.getResourceId(v2, this.a);
            }
        }
        typedArray0.recycle();
        try {
            int v3 = xmlPullParser0.getEventType();
            State stateSet$State0 = null;
            while(true) {
                if(v3 == 1) {
                    return;
                }
            alab1:
                switch(v3) {
                    case 2: {
                        switch(xmlPullParser0.getName()) {
                            case "LayoutDescription": {
                                break alab1;
                            }
                            case "State": {
                                stateSet$State0 = new State(context0, xmlPullParser0);
                                this.d.put(stateSet$State0.a, stateSet$State0);
                                break alab1;
                            }
                            case "StateSet": {
                                break alab1;
                            }
                            case "Variant": {
                                Variant stateSet$Variant0 = new Variant(context0, xmlPullParser0);
                                if(stateSet$State0 != null) {
                                    stateSet$State0.a(stateSet$Variant0);
                                }
                                break alab1;
                            }
                            default: {
                                break alab1;
                            }
                        }
                    }
                    case 3: {
                        if("StateSet".equals(xmlPullParser0.getName())) {
                            return;
                        }
                    }
                }
                v3 = xmlPullParser0.next();
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", iOException0);
            return;
        }
        Log.e("ConstraintLayoutStates", "Error parsing XML resource", xmlPullParserException0);
    }

    public boolean c(int v, float f, float f1) {
        int v1 = this.b;
        if(v1 != v) {
            return true;
        }
        Object object0 = v == -1 ? this.d.valueAt(0) : this.d.get(v1);
        return this.c == -1 || !((Variant)((State)object0).b.get(this.c)).a(f, f1) ? this.c != ((State)object0).b(f, f1) : false;
    }

    public void d(ConstraintsChangedListener constraintsChangedListener0) {
        this.e = constraintsChangedListener0;
    }

    public int e(int v, int v1, int v2) {
        return this.f(-1, v, ((float)v1), ((float)v2));
    }

    public int f(int v, int v1, float f, float f1) {
        if(v == v1) {
            State stateSet$State0 = v1 == -1 ? ((State)this.d.valueAt(0)) : ((State)this.d.get(this.b));
            if(stateSet$State0 == null) {
                return -1;
            }
            if(this.c != -1 && ((Variant)stateSet$State0.b.get(v)).a(f, f1)) {
                return v;
            }
            int v2 = stateSet$State0.b(f, f1);
            if(v == v2) {
                return v;
            }
            return v2 == -1 ? stateSet$State0.c : ((Variant)stateSet$State0.b.get(v2)).f;
        }
        State stateSet$State1 = (State)this.d.get(v1);
        if(stateSet$State1 == null) {
            return -1;
        }
        int v3 = stateSet$State1.b(f, f1);
        return v3 == -1 ? stateSet$State1.c : ((Variant)stateSet$State1.b.get(v3)).f;
    }
}

