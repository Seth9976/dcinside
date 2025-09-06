package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintSetParser {
    public static class DesignElement {
        String a;
        String b;
        HashMap c;

        DesignElement(String s, String s1, HashMap hashMap0) {
            this.a = s;
            this.b = s1;
            this.c = hashMap0;
        }

        public String a() {
            return this.a;
        }

        public HashMap b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }
    }

    static class FiniteGenerator implements GeneratedValue {
        float a;
        float b;
        float c;
        boolean d;
        String e;
        String f;
        float g;
        float h;
        float i;

        FiniteGenerator(float f, float f1, float f2, String s, String s1) {
            this.d = false;
            this.g = 0.0f;
            this.a = f;
            this.b = f1;
            this.c = f2;
            if(s == null) {
                s = "";
            }
            this.e = s;
            if(s1 == null) {
                s1 = "";
            }
            this.f = s1;
            this.i = f1;
            this.h = f;
        }

        public ArrayList a() {
            ArrayList arrayList0 = new ArrayList();
            int v = (int)this.h;
            int v1 = (int)this.i;
            int v2 = v;
            while(v <= v1) {
                arrayList0.add(this.e + v2 + this.f);
                v2 += (int)this.c;
                ++v;
            }
            return arrayList0;
        }

        @Override  // androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue
        public float value() {
            float f = this.g;
            if(f >= this.i) {
                this.d = true;
            }
            if(!this.d) {
                this.g = f + this.c;
            }
            return this.g;
        }
    }

    interface GeneratedValue {
        float value();
    }

    static class Generator implements GeneratedValue {
        float a;
        float b;
        float c;
        boolean d;

        Generator(float f, float f1) {
            this.d = false;
            this.a = f;
            this.b = f1;
            this.c = f;
        }

        @Override  // androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue
        public float value() {
            if(!this.d) {
                this.c += this.b;
            }
            return this.c;
        }
    }

    public static class LayoutVariables {
        HashMap a;
        HashMap b;
        HashMap c;

        public LayoutVariables() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
        }

        float a(Object object0) {
            if(object0 instanceof CLString) {
                String s = ((CLString)object0).c();
                if(this.b.containsKey(s)) {
                    return ((GeneratedValue)this.b.get(s)).value();
                }
                return this.a.containsKey(s) ? ((Integer)this.a.get(s)).floatValue() : 0.0f;
            }
            return object0 instanceof CLNumber ? ((CLNumber)object0).j() : 0.0f;
        }

        // 去混淆评级： 低(20)
        ArrayList b(String s) {
            return this.c.containsKey(s) ? ((ArrayList)this.c.get(s)) : null;
        }

        void c(String s, float f, float f1) {
            if(this.b.containsKey(s) && this.b.get(s) instanceof OverrideValue) {
                return;
            }
            this.b.put(s, new Generator(f, f1));
        }

        void d(String s, float f, float f1, float f2, String s1, String s2) {
            if(this.b.containsKey(s) && this.b.get(s) instanceof OverrideValue) {
                return;
            }
            FiniteGenerator constraintSetParser$FiniteGenerator0 = new FiniteGenerator(f, f1, f2, s1, s2);
            this.b.put(s, constraintSetParser$FiniteGenerator0);
            this.c.put(s, constraintSetParser$FiniteGenerator0.a());
        }

        void e(String s, int v) {
            this.a.put(s, v);
        }

        void f(String s, ArrayList arrayList0) {
            this.c.put(s, arrayList0);
        }

        public void g(String s, float f) {
            OverrideValue constraintSetParser$OverrideValue0 = new OverrideValue(f);
            this.b.put(s, constraintSetParser$OverrideValue0);
        }
    }

    public static enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN;

        private static MotionLayoutDebugFlags[] a() [...] // Inlined contents
    }

    static class OverrideValue implements GeneratedValue {
        float a;

        OverrideValue(float f) {
            this.a = f;
        }

        @Override  // androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue
        public float value() {
            return this.a;
        }
    }

    private static final boolean a = false;

    private static void A(State state0, LayoutVariables constraintSetParser$LayoutVariables0, CLObject cLObject0) throws CLParsingException {
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            String s = (String)object0;
            CLElement cLElement0 = cLObject0.E(s);
            if(cLElement0 instanceof CLNumber) {
                constraintSetParser$LayoutVariables0.e(s, cLElement0.k());
            }
            else if(!(cLElement0 instanceof CLObject)) {
            }
            else if(((CLObject)cLElement0).X("from") && ((CLObject)cLElement0).X("to")) {
                constraintSetParser$LayoutVariables0.d(s, constraintSetParser$LayoutVariables0.a(((CLObject)cLElement0).E("from")), constraintSetParser$LayoutVariables0.a(((CLObject)cLElement0).E("to")), 1.0f, ((CLObject)cLElement0).W("prefix"), ((CLObject)cLElement0).W("postfix"));
            }
            else if(((CLObject)cLElement0).X("from") && ((CLObject)cLElement0).X("step")) {
                constraintSetParser$LayoutVariables0.c(s, constraintSetParser$LayoutVariables0.a(((CLObject)cLElement0).E("from")), constraintSetParser$LayoutVariables0.a(((CLObject)cLElement0).E("step")));
            }
            else if(((CLObject)cLElement0).X("ids")) {
                CLArray cLArray0 = ((CLObject)cLElement0).G("ids");
                ArrayList arrayList1 = new ArrayList();
                for(int v = 0; v < cLArray0.size(); ++v) {
                    arrayList1.add(cLArray0.T(v));
                }
                constraintSetParser$LayoutVariables0.f(s, arrayList1);
            }
            else if(((CLObject)cLElement0).X("tag")) {
                constraintSetParser$LayoutVariables0.f(s, state0.p(((CLObject)cLElement0).U("tag")));
            }
        }
    }

    static void B(State state0, LayoutVariables constraintSetParser$LayoutVariables0, ConstraintReference constraintReference0, CLObject cLObject0) throws CLParsingException {
        if(constraintReference0.Y() == null) {
            constraintReference0.A0(Dimension.j());
        }
        if(constraintReference0.G() == null) {
            constraintReference0.t0(Dimension.j());
        }
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            ConstraintSetParser.a(state0, constraintSetParser$LayoutVariables0, constraintReference0, cLObject0, ((String)object0));
        }
    }

    static void C(State state0, LayoutVariables constraintSetParser$LayoutVariables0, String s, CLObject cLObject0) throws CLParsingException {
        ConstraintSetParser.B(state0, constraintSetParser$LayoutVariables0, state0.f(s), cLObject0);
    }

    // This method was un-flattened
    @RestrictTo({Scope.b})
    public static void D(@NonNull CLObject cLObject0, @NonNull State state0, @NonNull LayoutVariables constraintSetParser$LayoutVariables0) throws CLParsingException {
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            String s = (String)object0;
            CLElement cLElement0 = cLObject0.E(s);
            s.hashCode();
            switch(s) {
                case "Generate": {
                    if(!(cLElement0 instanceof CLObject)) {
                        continue;
                    }
                    ConstraintSetParser.p(state0, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
                    continue;
                }
                case "Helpers": {
                    if(!(cLElement0 instanceof CLArray)) {
                        continue;
                    }
                    ConstraintSetParser.u(state0, constraintSetParser$LayoutVariables0, ((CLArray)cLElement0));
                    continue;
                }
                case "Variables": {
                    if(cLElement0 instanceof CLObject) {
                        break;
                    }
                    continue;
                }
                default: {
                    if(cLElement0 instanceof CLObject) {
                        String s1 = ConstraintSetParser.c(((CLObject)cLElement0));
                        if(s1 == null) {
                            ConstraintSetParser.C(state0, constraintSetParser$LayoutVariables0, s, ((CLObject)cLElement0));
                        }
                        else {
                            switch(s1) {
                                case "barrier": {
                                    ConstraintSetParser.e(state0, s, ((CLObject)cLElement0));
                                    break;
                                }
                                case "column": {
                                    ConstraintSetParser.q(s1, state0, s, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
                                    break;
                                }
                                case "grid": 
                                case "row": {
                                    ConstraintSetParser.q(s1, state0, s, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
                                    break;
                                }
                                case "hChain": {
                                    ConstraintSetParser.g(s1, state0, s, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
                                    break;
                                }
                                case "hFlow": 
                                case "vFlow": {
                                    ConstraintSetParser.o(s1, state0, s, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
                                    break;
                                }
                                case "hGuideline": {
                                    ConstraintSetParser.s(0, state0, s, ((CLObject)cLElement0));
                                    break;
                                }
                                case "vChain": {
                                    ConstraintSetParser.g(s1, state0, s, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
                                    break;
                                }
                                case "vGuideline": {
                                    ConstraintSetParser.s(1, state0, s, ((CLObject)cLElement0));
                                }
                            }
                        }
                    }
                    else {
                        if(!(cLElement0 instanceof CLNumber)) {
                            continue;
                        }
                        constraintSetParser$LayoutVariables0.e(s, cLElement0.k());
                    }
                    continue;
                }
            }
            ConstraintSetParser.A(state0, constraintSetParser$LayoutVariables0, ((CLObject)cLElement0));
        }
    }

    private static float E(State state0, float f) {
        return state0.k().a(f);
    }

    static void a(State state0, LayoutVariables constraintSetParser$LayoutVariables0, ConstraintReference constraintReference0, CLObject cLObject0, String s) throws CLParsingException {
        s.hashCode();
        switch(s) {
            case "alpha": {
                constraintReference0.g(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "center": {
                String s2 = cLObject0.U(s);
                ConstraintReference constraintReference2 = s2.equals("parent") ? state0.f(State.o) : state0.f(s2);
                constraintReference0.D0(constraintReference2);
                constraintReference0.C(constraintReference2);
                constraintReference0.H0(constraintReference2);
                constraintReference0.q(constraintReference2);
                return;
            }
            case "centerHorizontally": {
                String s3 = cLObject0.U(s);
                if(s3.equals("parent")) {
                    s3 = State.o;
                }
                ConstraintReference constraintReference3 = state0.f(s3);
                constraintReference0.D0(constraintReference3);
                constraintReference0.C(constraintReference3);
                return;
            }
            case "centerVertically": {
                String s1 = cLObject0.U(s);
                if(s1.equals("parent")) {
                    s1 = State.o;
                }
                ConstraintReference constraintReference1 = state0.f(s1);
                constraintReference0.H0(constraintReference1);
                constraintReference0.q(constraintReference1);
                return;
            }
            case "custom": {
                ConstraintSetParser.k(cLObject0, constraintReference0, s);
                return;
            }
            case "hBias": {
                constraintReference0.a0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "hRtlBias": {
                float f = constraintSetParser$LayoutVariables0.a(cLObject0.E(s));
                if(state0.A()) {
                    f = 1.0f - f;
                }
                constraintReference0.a0(f);
                return;
            }
            case "hWeight": {
                constraintReference0.v0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "height": {
                constraintReference0.t0(ConstraintSetParser.m(cLObject0, s, state0, state0.k()));
                return;
            }
            case "motion": {
                ConstraintSetParser.x(cLObject0.E(s), constraintReference0);
                return;
            }
            case "pivotX": {
                constraintReference0.i0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "pivotY": {
                constraintReference0.j0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "rotationX": {
                constraintReference0.n0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "rotationY": {
                constraintReference0.o0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "rotationZ": {
                constraintReference0.p0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "scaleX": {
                constraintReference0.q0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "scaleY": {
                constraintReference0.r0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "translationX": {
                constraintReference0.I0(ConstraintSetParser.E(state0, constraintSetParser$LayoutVariables0.a(cLObject0.E(s))));
                return;
            }
            case "translationY": {
                constraintReference0.J0(ConstraintSetParser.E(state0, constraintSetParser$LayoutVariables0.a(cLObject0.E(s))));
                return;
            }
            case "translationZ": {
                constraintReference0.K0(ConstraintSetParser.E(state0, constraintSetParser$LayoutVariables0.a(cLObject0.E(s))));
                return;
            }
            case "vBias": {
                constraintReference0.M0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "vWeight": {
                constraintReference0.y0(constraintSetParser$LayoutVariables0.a(cLObject0.E(s)));
                return;
            }
            case "visibility": {
                String s4 = cLObject0.U(s);
                s4.hashCode();
                switch(s4) {
                    case "gone": {
                        constraintReference0.N0(8);
                        return;
                    }
                    case "invisible": {
                        constraintReference0.N0(4);
                        constraintReference0.g(0.0f);
                        return;
                    }
                    case "visible": {
                        constraintReference0.N0(0);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case "width": {
                constraintReference0.A0(ConstraintSetParser.m(cLObject0, s, state0, state0.k()));
                return;
            }
            default: {
                ConstraintSetParser.i(state0, constraintSetParser$LayoutVariables0, cLObject0, constraintReference0, s);
            }
        }
    }

    private static int b(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(s)) {
                return v;
            }
        }
        return -1;
    }

    static String c(CLObject cLObject0) throws CLParsingException {
        for(Object object0: cLObject0.Y()) {
            if(((String)object0).equals("type")) {
                return cLObject0.U("type");
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    static void d(CLObject cLObject0, String s, CLObject cLObject1) throws CLParsingException {
        if(!cLObject0.X(s)) {
            cLObject0.Z(s, cLObject1);
            return;
        }
        CLObject cLObject2 = cLObject0.P(s);
        for(Object object0: cLObject1.Y()) {
            String s1 = (String)object0;
            if(s1.equals("clear")) {
                CLArray cLArray0 = cLObject1.G("clear");
                for(int v = 0; v < cLArray0.size(); ++v) {
                    String s2 = cLArray0.V(v);
                    if(s2 != null) {
                        switch(s2) {
                            case "constraints": {
                                cLObject2.c0("start");
                                cLObject2.c0("end");
                                cLObject2.c0("top");
                                cLObject2.c0("bottom");
                                cLObject2.c0("baseline");
                                cLObject2.c0("center");
                                cLObject2.c0("centerHorizontally");
                                cLObject2.c0("centerVertically");
                                break;
                            }
                            case "dimensions": {
                                cLObject2.c0("width");
                                cLObject2.c0("height");
                                break;
                            }
                            case "transforms": {
                                cLObject2.c0("visibility");
                                cLObject2.c0("alpha");
                                cLObject2.c0("pivotX");
                                cLObject2.c0("pivotY");
                                cLObject2.c0("rotationX");
                                cLObject2.c0("rotationY");
                                cLObject2.c0("rotationZ");
                                cLObject2.c0("scaleX");
                                cLObject2.c0("scaleY");
                                cLObject2.c0("translationX");
                                cLObject2.c0("translationY");
                                break;
                            }
                            default: {
                                cLObject2.c0(s2);
                            }
                        }
                    }
                }
            }
            else {
                cLObject2.Z(s1, cLObject1.E(s1));
            }
        }
    }

    // This method was un-flattened
    static void e(State state0, String s, CLObject cLObject0) throws CLParsingException {
        boolean z = state0.A();
        BarrierReference barrierReference0 = state0.b(s, Direction.d);
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            s1.hashCode();
        alab1:
            switch(s1) {
                case "contains": {
                    CLArray cLArray0 = cLObject0.I(s1);
                    if(cLArray0 == null) {
                        continue;
                    }
                    for(int v = 0; true; ++v) {
                        if(v >= cLArray0.size()) {
                            break alab1;
                        }
                        barrierReference0.P0(new Object[]{state0.f(cLArray0.D(v).c())});
                    }
                }
                case "direction": {
                    String s2 = cLObject0.U(s1);
                    s2.hashCode();
                    switch(s2) {
                        case "bottom": {
                            barrierReference0.U0(Direction.f);
                            break;
                        }
                        case "end": {
                            if(z) {
                                barrierReference0.U0(Direction.a);
                            }
                            else {
                                barrierReference0.U0(Direction.b);
                            }
                            break;
                        }
                        case "left": {
                            barrierReference0.U0(Direction.a);
                            break;
                        }
                        case "right": {
                            barrierReference0.U0(Direction.b);
                            break;
                        }
                        case "start": {
                            if(z) {
                                barrierReference0.U0(Direction.b);
                            }
                            else {
                                barrierReference0.U0(Direction.a);
                            }
                            break;
                        }
                        case "top": {
                            barrierReference0.U0(Direction.e);
                        }
                    }
                    continue;
                }
                case "margin": {
                    float f = cLObject0.M(s1);
                    if(Float.isNaN(f)) {
                        continue;
                    }
                    barrierReference0.f0(ConstraintSetParser.E(state0, f));
                }
            }
        }
    }

    static void f(int v, State state0, LayoutVariables constraintSetParser$LayoutVariables0, CLArray cLArray0) throws CLParsingException {
        String s1;
        HorizontalChainReference horizontalChainReference0 = v == 0 ? state0.v() : state0.M();
        CLElement cLElement0 = cLArray0.D(1);
        if(cLElement0 instanceof CLArray && ((CLArray)cLElement0).size() >= 1) {
            for(int v1 = 0; v1 < ((CLArray)cLElement0).size(); ++v1) {
                horizontalChainReference0.P0(new Object[]{((CLArray)cLElement0).T(v1)});
            }
            if(cLArray0.size() > 2) {
                CLElement cLElement1 = cLArray0.D(2);
                if(!(cLElement1 instanceof CLObject)) {
                    return;
                }
                for(Object object0: ((CLObject)cLElement1).Y()) {
                    String s = (String)object0;
                    s.hashCode();
                    if(s.equals("style")) {
                        CLElement cLElement2 = ((CLObject)cLElement1).E(s);
                        if(!(cLElement2 instanceof CLArray) || ((CLArray)cLElement2).size() <= 1) {
                            s1 = cLElement2.c();
                        }
                        else {
                            s1 = ((CLArray)cLElement2).T(0);
                            horizontalChainReference0.W0(((CLArray)cLElement2).getFloat(1));
                        }
                        s1.hashCode();
                        if(s1.equals("packed")) {
                            horizontalChainReference0.e1(Chain.c);
                        }
                        else if(s1.equals("spread_inside")) {
                            horizontalChainReference0.e1(Chain.b);
                        }
                        else {
                            horizontalChainReference0.e1(Chain.a);
                        }
                    }
                    else {
                        ConstraintSetParser.i(state0, constraintSetParser$LayoutVariables0, ((CLObject)cLElement1), horizontalChainReference0, s);
                    }
                }
            }
        }
    }

    private static void g(String s, State state0, String s1, LayoutVariables constraintSetParser$LayoutVariables0, CLObject cLObject0) throws CLParsingException {
        String s4;
        CLArray cLArray1;
        int v1;
        float f4;
        float f3;
        float f2;
        float f1;
        HorizontalChainReference horizontalChainReference0 = s.charAt(0) == 104 ? state0.v() : state0.M();
        horizontalChainReference0.c(s1);
        for(Object object0: cLObject0.Y()) {
            String s2 = (String)object0;
            s2.hashCode();
            switch(s2) {
                case "bottom": {
                    ConstraintSetParser.i(state0, constraintSetParser$LayoutVariables0, cLObject0, horizontalChainReference0, s2);
                    continue;
                }
                case "contains": {
                    CLElement cLElement0 = cLObject0.E(s2);
                    if(cLElement0 instanceof CLArray) {
                        CLArray cLArray0 = (CLArray)cLElement0;
                        if(cLArray0.size() >= 1) {
                            int v = 0;
                            while(v < cLArray0.size()) {
                                CLElement cLElement1 = cLArray0.D(v);
                                if(!(cLElement1 instanceof CLArray)) {
                                    v1 = v;
                                    cLArray1 = cLArray0;
                                    horizontalChainReference0.P0(new Object[]{cLElement1.c()});
                                }
                                else if(((CLArray)cLElement1).size() > 0) {
                                    String s3 = ((CLArray)cLElement1).D(0).c();
                                    float f = NaNf;
                                    switch(((CLArray)cLElement1).size()) {
                                        case 2: {
                                            f3 = ((CLArray)cLElement1).getFloat(1);
                                            f1 = NaNf;
                                            f2 = NaNf;
                                            f4 = NaNf;
                                            break;
                                        }
                                        case 3: {
                                            float f5 = ((CLArray)cLElement1).getFloat(1);
                                            f2 = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(2));
                                            f3 = f5;
                                            f = f2;
                                            f1 = NaNf;
                                            f4 = NaNf;
                                            break;
                                        }
                                        case 4: {
                                            f3 = ((CLArray)cLElement1).getFloat(1);
                                            f = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(2));
                                            f2 = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(3));
                                            f1 = NaNf;
                                            f4 = NaNf;
                                            break;
                                        }
                                        case 6: {
                                            f3 = ((CLArray)cLElement1).getFloat(1);
                                            float f6 = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(2));
                                            float f7 = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(3));
                                            f = f6;
                                            f1 = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(4));
                                            f2 = f7;
                                            f4 = ConstraintSetParser.E(state0, ((CLArray)cLElement1).getFloat(5));
                                            break;
                                        }
                                        default: {
                                            f1 = NaNf;
                                            f2 = NaNf;
                                            f3 = NaNf;
                                            f4 = NaNf;
                                        }
                                    }
                                    v1 = v;
                                    cLArray1 = cLArray0;
                                    horizontalChainReference0.U0(s3, f3, f, f2, f1, f4);
                                }
                                else {
                                    v1 = v;
                                    cLArray1 = cLArray0;
                                }
                                v = v1 + 1;
                                cLArray0 = cLArray1;
                            }
                            continue;
                        }
                    }
                    System.err.println(s1 + " contains should be an array \"" + cLElement0.c() + "\"");
                    return;
                }
                case "end": 
                case "left": 
                case "right": 
                case "start": 
                case "top": {
                    ConstraintSetParser.i(state0, constraintSetParser$LayoutVariables0, cLObject0, horizontalChainReference0, s2);
                    continue;
                }
                case "style": {
                    break;
                }
                default: {
                    continue;
                }
            }
            CLElement cLElement2 = cLObject0.E(s2);
            if(!(cLElement2 instanceof CLArray) || ((CLArray)cLElement2).size() <= 1) {
                s4 = cLElement2.c();
            }
            else {
                s4 = ((CLArray)cLElement2).T(0);
                horizontalChainReference0.W0(((CLArray)cLElement2).getFloat(1));
            }
            s4.hashCode();
            if(s4.equals("packed")) {
                horizontalChainReference0.e1(Chain.c);
            }
            else if(s4.equals("spread_inside")) {
                horizontalChainReference0.e1(Chain.b);
            }
            else {
                horizontalChainReference0.e1(Chain.a);
            }
        }
    }

    static long h(String s) {
        if(s.startsWith("#")) {
            String s1 = s.substring(1);
            return Long.parseLong((s1.length() == 6 ? "FF" + s1 : s.substring(1)), 16);
        }
        return -1L;
    }

    static void i(State state0, LayoutVariables constraintSetParser$LayoutVariables0, CLObject cLObject0, ConstraintReference constraintReference0, String s) throws CLParsingException {
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z = state0.A();
        CLArray cLArray0 = cLObject0.I(s);
        if(cLArray0 != null && cLArray0.size() > 1) {
            String s1 = cLArray0.T(0);
            String s2 = cLArray0.V(1);
            float f = cLArray0.size() <= 2 ? 0.0f : ConstraintSetParser.E(state0, constraintSetParser$LayoutVariables0.a(cLArray0.R(2)));
            float f1 = cLArray0.size() <= 3 ? 0.0f : ConstraintSetParser.E(state0, constraintSetParser$LayoutVariables0.a(cLArray0.R(3)));
            ConstraintReference constraintReference1 = s1.equals("parent") ? state0.f(State.o) : state0.f(s1);
            s.hashCode();
            switch(s) {
                case "baseline": {
                    s2.hashCode();
                    switch(s2) {
                        case "baseline": {
                            state0.c(constraintReference0.getKey());
                            state0.c(constraintReference1.getKey());
                            constraintReference0.k(constraintReference1);
                            goto label_50;
                        }
                        case "bottom": {
                            state0.c(constraintReference0.getKey());
                            constraintReference0.l(constraintReference1);
                            goto label_50;
                        }
                        case "top": {
                            state0.c(constraintReference0.getKey());
                            constraintReference0.m(constraintReference1);
                            goto label_50;
                        }
                        default: {
                            goto label_50;
                        }
                    }
                }
                case "bottom": {
                    s2.hashCode();
                    switch(s2) {
                        case "baseline": {
                            state0.c(constraintReference1.getKey());
                            constraintReference0.p(constraintReference1);
                            goto label_50;
                        }
                        case "bottom": {
                            constraintReference0.q(constraintReference1);
                            goto label_50;
                        }
                        case "top": {
                            constraintReference0.r(constraintReference1);
                            goto label_50;
                        }
                        default: {
                            goto label_50;
                        }
                    }
                }
                case "circular": {
                    constraintReference0.u(constraintReference1, constraintSetParser$LayoutVariables0.a(cLArray0.D(1)), (cLArray0.size() <= 2 ? 0.0f : ConstraintSetParser.E(state0, constraintSetParser$LayoutVariables0.a(cLArray0.R(2)))));
                    z1 = true;
                    z2 = false;
                    break;
                }
                case "end": {
                    z1 = z;
                    z2 = true;
                    break;
                }
                case "left": {
                    z1 = true;
                    z2 = true;
                    break;
                }
                case "right": {
                    z1 = false;
                    z2 = true;
                    break;
                }
                case "start": {
                    z1 = !z;
                    z2 = true;
                    break;
                }
                case "top": {
                    s2.hashCode();
                    switch(s2) {
                        case "baseline": {
                            state0.c(constraintReference1.getKey());
                            constraintReference0.F0(constraintReference1);
                            break;
                        }
                        case "bottom": {
                            constraintReference0.G0(constraintReference1);
                            break;
                        }
                        case "top": {
                            constraintReference0.H0(constraintReference1);
                        }
                    }
                label_50:
                    z1 = true;
                    z2 = false;
                    break;
                }
                default: {
                    goto label_50;
                }
            }
            if(z2) {
                s2.hashCode();
                switch(s2) {
                    case "end": {
                        z3 = z;
                        break;
                    }
                    case "left": {
                        z3 = true;
                        break;
                    }
                    case "right": {
                        z3 = false;
                        break;
                    }
                    case "start": {
                        z3 = !z;
                        break;
                    }
                    default: {
                        z3 = true;
                    }
                }
                if(!z1) {
                    if(z3) {
                        constraintReference0.l0(constraintReference1);
                    }
                    else {
                        constraintReference0.m0(constraintReference1);
                    }
                }
                else if(z3) {
                    constraintReference0.c0(constraintReference1);
                }
                else {
                    constraintReference0.d0(constraintReference1);
                }
            }
            constraintReference0.f0(f).h0(f1);
            return;
        }
        String s3 = cLObject0.W(s);
        if(s3 != null) {
            ConstraintReference constraintReference2 = s3.equals("parent") ? state0.f(State.o) : state0.f(s3);
            s.hashCode();
            switch(s) {
                case "baseline": {
                    state0.c(constraintReference0.getKey());
                    state0.c(constraintReference2.getKey());
                    constraintReference0.k(constraintReference2);
                    break;
                }
                case "bottom": {
                    constraintReference0.q(constraintReference2);
                    return;
                }
                case "end": {
                    if(!z) {
                        constraintReference0.m0(constraintReference2);
                        return;
                    }
                    constraintReference0.c0(constraintReference2);
                    return;
                }
                case "start": {
                    if(!z) {
                        constraintReference0.c0(constraintReference2);
                        return;
                    }
                    constraintReference0.m0(constraintReference2);
                    return;
                }
                case "top": {
                    constraintReference0.H0(constraintReference2);
                }
            }
        }
    }

    static void j(CoreMotionScene coreMotionScene0, CLObject cLObject0) throws CLParsingException {
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            String s = (String)object0;
            CLObject cLObject1 = cLObject0.P(s);
            String s1 = cLObject1.W("Extends");
            if(s1 != null && !s1.isEmpty()) {
                String s2 = coreMotionScene0.d(s1);
                if(s2 == null) {
                    continue;
                }
                CLObject cLObject2 = CLParser.d(s2);
                ArrayList arrayList1 = cLObject1.Y();
                if(arrayList1 == null) {
                    continue;
                }
                for(Object object1: arrayList1) {
                    String s3 = (String)object1;
                    CLElement cLElement0 = cLObject1.E(s3);
                    if(cLElement0 instanceof CLObject) {
                        ConstraintSetParser.d(cLObject2, s3, ((CLObject)cLElement0));
                    }
                }
                coreMotionScene0.b(s, cLObject2.z());
            }
            else {
                coreMotionScene0.b(s, cLObject1.z());
            }
        }
    }

    static void k(CLObject cLObject0, ConstraintReference constraintReference0, String s) throws CLParsingException {
        CLObject cLObject1 = cLObject0.Q(s);
        if(cLObject1 == null) {
            return;
        }
        ArrayList arrayList0 = cLObject1.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            CLElement cLElement0 = cLObject1.E(s1);
            if(cLElement0 instanceof CLNumber) {
                constraintReference0.f(s1, cLElement0.j());
            }
            else if(cLElement0 instanceof CLString) {
                long v = ConstraintSetParser.h(cLElement0.c());
                if(v != -1L) {
                    constraintReference0.e(s1, ((int)v));
                }
            }
        }
    }

    public static void l(String s, ArrayList arrayList0) throws CLParsingException {
        CLObject cLObject0 = CLParser.d(s);
        ArrayList arrayList1 = cLObject0.Y();
        if(arrayList1 == null) {
            return;
        }
        if(arrayList1.size() > 0) {
            String s1 = (String)arrayList1.get(0);
            CLElement cLElement0 = cLObject0.E(s1);
            s1.hashCode();
            if(!s1.equals("Design") || !(cLElement0 instanceof CLObject)) {
                return;
            }
            ArrayList arrayList2 = ((CLObject)cLElement0).Y();
            for(int v = 0; v < arrayList2.size(); ++v) {
                String s2 = (String)arrayList2.get(v);
                CLObject cLObject1 = (CLObject)((CLObject)cLElement0).E(s2);
                System.out.printf("element found " + s2 + "", new Object[0]);
                String s3 = cLObject1.W("type");
                if(s3 != null) {
                    HashMap hashMap0 = new HashMap();
                    int v1 = cLObject1.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        CLKey cLKey0 = (CLKey)cLObject1.D(v);
                        String s4 = cLKey0.c();
                        String s5 = cLKey0.h0().c();
                        if(s5 != null) {
                            hashMap0.put(s4, s5);
                        }
                    }
                    arrayList0.add(new DesignElement(s1, s3, hashMap0));
                }
            }
        }
    }

    static Dimension m(CLObject cLObject0, String s, State state0, CorePixelDp corePixelDp0) throws CLParsingException {
        CLElement cLElement0 = cLObject0.E(s);
        Dimension dimension0 = Dimension.b(0);
        if(cLElement0 instanceof CLString) {
            return ConstraintSetParser.n(cLElement0.c());
        }
        if(cLElement0 instanceof CLNumber) {
            return Dimension.b(state0.g(corePixelDp0.a(cLObject0.K(s))));
        }
        if(cLElement0 instanceof CLObject) {
            String s1 = ((CLObject)cLElement0).W("value");
            if(s1 != null) {
                dimension0 = ConstraintSetParser.n(s1);
            }
            CLElement cLElement1 = ((CLObject)cLElement0).S("min");
            if(cLElement1 != null) {
                if(cLElement1 instanceof CLNumber) {
                    dimension0.q(state0.g(corePixelDp0.a(((CLNumber)cLElement1).j())));
                }
                else if(cLElement1 instanceof CLString) {
                    dimension0.r(Dimension.j);
                }
            }
            CLElement cLElement2 = ((CLObject)cLElement0).S("max");
            if(cLElement2 != null) {
                if(cLElement2 instanceof CLNumber) {
                    dimension0.o(state0.g(corePixelDp0.a(((CLNumber)cLElement2).j())));
                    return dimension0;
                }
                if(cLElement2 instanceof CLString) {
                    dimension0.p(Dimension.j);
                }
            }
        }
        return dimension0;
    }

    static Dimension n(String s) {
        Dimension dimension0 = Dimension.b(0);
        s.hashCode();
        switch(s) {
            case "parent": {
                return Dimension.d();
            }
            case "preferWrap": {
                return Dimension.i(Dimension.j);
            }
            case "spread": {
                return Dimension.i(Dimension.k);
            }
            case "wrap": {
                return Dimension.j();
            }
            default: {
                if(s.endsWith("%")) {
                    return Dimension.e(0, Float.parseFloat(s.substring(0, s.indexOf(37))) / 100.0f).v(0);
                }
                return s.contains(":") ? Dimension.f(s).w(Dimension.k) : dimension0;
            }
        }
    }

    // This method was un-flattened
    private static void o(String s, State state0, String s1, LayoutVariables constraintSetParser$LayoutVariables0, CLObject cLObject0) throws CLParsingException {
        String s10;
        String s9;
        String s8;
        Float float5;
        float f3;
        float f2;
        float f1;
        float f;
        String s6;
        String s5;
        String s4;
        Float float2;
        float f6;
        float f5;
        float f4;
        float f7;
        FlowReference flowReference0 = state0.l(s1, s.charAt(0) == 0x76);
        for(Object object0: cLObject0.Y()) {
            String s2 = (String)object0;
            s2.hashCode();
            switch(s2) {
                case "contains": {
                    CLElement cLElement5 = cLObject0.E(s2);
                    if(cLElement5 instanceof CLArray) {
                        CLArray cLArray0 = (CLArray)cLElement5;
                        if(cLArray0.size() >= 1) {
                            for(int v = 0; v < cLArray0.size(); ++v) {
                                CLElement cLElement6 = cLArray0.D(v);
                                if(!(cLElement6 instanceof CLArray)) {
                                    flowReference0.P0(new Object[]{cLElement6.c()});
                                }
                                else if(((CLArray)cLElement6).size() > 0) {
                                    String s11 = ((CLArray)cLElement6).D(0).c();
                                    switch(((CLArray)cLElement6).size()) {
                                        case 2: {
                                            f5 = ((CLArray)cLElement6).getFloat(1);
                                            f4 = NaNf;
                                            f6 = NaNf;
                                            break;
                                        }
                                        case 3: {
                                            f7 = ((CLArray)cLElement6).getFloat(1);
                                            f4 = ConstraintSetParser.E(state0, ((CLArray)cLElement6).getFloat(2));
                                            f6 = f4;
                                            f5 = f7;
                                            break;
                                        }
                                        case 4: {
                                            f7 = ((CLArray)cLElement6).getFloat(1);
                                            float f8 = ConstraintSetParser.E(state0, ((CLArray)cLElement6).getFloat(2));
                                            f4 = ConstraintSetParser.E(state0, ((CLArray)cLElement6).getFloat(3));
                                            f6 = f8;
                                            f5 = f7;
                                            break;
                                        }
                                        default: {
                                            f4 = NaNf;
                                            f5 = NaNf;
                                            f6 = NaNf;
                                        }
                                    }
                                    flowReference0.U0(s11, f5, f6, f4);
                                }
                            }
                            continue;
                        }
                    }
                    System.err.println(s1 + " contains should be an array \"" + cLElement5.c() + "\"");
                    return;
                }
                case "hAlign": {
                    String s3 = cLObject0.E(s2).c();
                    s3.hashCode();
                    if(s3.equals("end")) {
                        flowReference0.z1(1);
                        break;
                    }
                    else {
                        if(s3.equals("start")) {
                            flowReference0.z1(0);
                        }
                        else {
                            flowReference0.z1(2);
                        }
                        continue;
                    }
                    goto label_19;
                }
                case "hFlowBias": {
                    CLElement cLElement1 = cLObject0.E(s2);
                    Float float0 = 0.5f;
                    Float float1 = 0.5f;
                    if(!(cLElement1 instanceof CLArray) || ((CLArray)cLElement1).size() <= 1) {
                        float2 = cLElement1.j();
                    }
                    else {
                        float0 = ((CLArray)cLElement1).getFloat(0);
                        float2 = ((CLArray)cLElement1).getFloat(1);
                        if(((CLArray)cLElement1).size() > 2) {
                            float1 = ((CLArray)cLElement1).getFloat(2);
                        }
                    }
                    try {
                        flowReference0.a0(((float)float2));
                        if(((float)float0) != 0.5f) {
                            flowReference0.v1(((float)float0));
                        }
                        if(((float)float1) == 0.5f) {
                            continue;
                        }
                        flowReference0.C1(((float)float1));
                        break;
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_123;
                    }
                }
                case "hGap": {
                    flowReference0.A1(cLObject0.E(s2).k());
                    break;
                }
                case "hStyle": {
                label_19:
                    CLElement cLElement0 = cLObject0.E(s2);
                    if(!(cLElement0 instanceof CLArray) || ((CLArray)cLElement0).size() <= 1) {
                        s5 = cLElement0.c();
                        s4 = "";
                        s6 = "";
                    }
                    else {
                        s4 = ((CLArray)cLElement0).T(0);
                        s5 = ((CLArray)cLElement0).T(1);
                        s6 = ((CLArray)cLElement0).size() > 2 ? ((CLArray)cLElement0).T(2) : "";
                    }
                    if(!s5.equals("")) {
                        flowReference0.B1(Chain.c(s5));
                    }
                    if(!s4.equals("")) {
                        flowReference0.w1(Chain.c(s4));
                    }
                    if(s6.equals("")) {
                        continue;
                    }
                    flowReference0.D1(Chain.c(s6));
                    break;
                }
                case "maxElement": {
                    flowReference0.G1(cLObject0.E(s2).k());
                    break;
                }
                case "padding": {
                    CLElement cLElement3 = cLObject0.E(s2);
                    if(!(cLElement3 instanceof CLArray) || ((CLArray)cLElement3).size() <= 1) {
                        f = (float)cLElement3.k();
                        f3 = f;
                        f2 = f3;
                        f1 = f2;
                    }
                    else {
                        f = (float)((CLArray)cLElement3).getInt(0);
                        f1 = (float)((CLArray)cLElement3).getInt(1);
                        if(((CLArray)cLElement3).size() > 2) {
                            f2 = (float)((CLArray)cLElement3).getInt(2);
                            try {
                                f3 = (float)((CLArray)cLElement3).getInt(3);
                            }
                            catch(ArrayIndexOutOfBoundsException unused_ex) {
                                f3 = 0.0f;
                            }
                        }
                        else {
                            f2 = f;
                            f3 = f1;
                        }
                    }
                    flowReference0.J1(Math.round(ConstraintSetParser.E(state0, f)));
                    flowReference0.L1(Math.round(ConstraintSetParser.E(state0, f1)));
                    flowReference0.K1(Math.round(ConstraintSetParser.E(state0, f2)));
                    flowReference0.I1(Math.round(ConstraintSetParser.E(state0, f3)));
                    break;
                }
                case "type": {
                    if(cLObject0.E(s2).c().equals("hFlow")) {
                        flowReference0.H1(0);
                        continue;
                    }
                    else {
                        flowReference0.H1(1);
                        break;
                    }
                    flowReference0.N1(cLObject0.E(s2).k());
                    break;
                }
                case "vAlign": {
                    String s7 = cLObject0.E(s2).c();
                    s7.hashCode();
                    switch(s7) {
                        case "baseline": {
                            flowReference0.M1(3);
                            break;
                        }
                        case "bottom": {
                            flowReference0.M1(1);
                            break;
                        }
                        case "top": {
                            flowReference0.M1(0);
                            break;
                        }
                        default: {
                            flowReference0.M1(2);
                        }
                    }
                    break;
                }
                case "vFlowBias": {
                    CLElement cLElement4 = cLObject0.E(s2);
                    Float float3 = 0.5f;
                    Float float4 = 0.5f;
                    if(!(cLElement4 instanceof CLArray) || ((CLArray)cLElement4).size() <= 1) {
                        float5 = cLElement4.j();
                    }
                    else {
                        float3 = ((CLArray)cLElement4).getFloat(0);
                        float5 = ((CLArray)cLElement4).getFloat(1);
                        if(((CLArray)cLElement4).size() > 2) {
                            float4 = ((CLArray)cLElement4).getFloat(2);
                        }
                    }
                    try {
                        flowReference0.M0(((float)float5));
                        if(((float)float3) != 0.5f) {
                            flowReference0.x1(((float)float3));
                        }
                        if(((float)float4) == 0.5f) {
                            continue;
                        }
                        flowReference0.E1(((float)float4));
                    label_123:
                        break;
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_123;
                    }
                }
                case "vGap": {
                    flowReference0.N1(cLObject0.E(s2).k());
                    break;
                }
                case "vStyle": {
                    CLElement cLElement2 = cLObject0.E(s2);
                    if(!(cLElement2 instanceof CLArray) || ((CLArray)cLElement2).size() <= 1) {
                        s9 = cLElement2.c();
                        s8 = "";
                        s10 = "";
                    }
                    else {
                        s8 = ((CLArray)cLElement2).T(0);
                        s9 = ((CLArray)cLElement2).T(1);
                        s10 = ((CLArray)cLElement2).size() > 2 ? ((CLArray)cLElement2).T(2) : "";
                    }
                    if(!s9.equals("")) {
                        flowReference0.O1(Chain.c(s9));
                    }
                    if(!s8.equals("")) {
                        flowReference0.y1(Chain.c(s8));
                    }
                    if(s10.equals("")) {
                        continue;
                    }
                    flowReference0.F1(Chain.c(s10));
                    break;
                }
                case "wrap": {
                    flowReference0.P1(Wrap.c(cLObject0.E(s2).c()));
                    break;
                }
                default: {
                    ConstraintSetParser.a(state0, constraintSetParser$LayoutVariables0, state0.f(s1), cLObject0, s2);
                }
            }
        }
    }

    static void p(State state0, LayoutVariables constraintSetParser$LayoutVariables0, CLObject cLObject0) throws CLParsingException {
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            CLElement cLElement0 = cLObject0.E(((String)object0));
            ArrayList arrayList1 = constraintSetParser$LayoutVariables0.b(((String)object0));
            if(arrayList1 != null && cLElement0 instanceof CLObject) {
                for(Object object1: arrayList1) {
                    ConstraintSetParser.C(state0, constraintSetParser$LayoutVariables0, ((String)object1), ((CLObject)cLElement0));
                }
            }
        }
    }

    private static void q(String s, State state0, String s1, LayoutVariables constraintSetParser$LayoutVariables0, CLObject cLObject0) throws CLParsingException {
        float f3;
        float f2;
        float f1;
        float f;
        int v2;
        String s3;
        String s7;
        GridReference gridReference0 = state0.m(s1, s);
        for(Object object0: cLObject0.Y()) {
            String s2 = (String)object0;
            s2.hashCode();
            switch(s2) {
                case "columnWeights": {
                    s7 = cLObject0.E(s2).c();
                    if(s7 != null && s7.contains(",")) {
                        break;
                    }
                    continue;
                }
                case "columns": {
                    int v3 = cLObject0.E(s2).k();
                    if(v3 <= 0) {
                        continue;
                    }
                    gridReference0.j1(v3);
                    continue;
                }
                case "contains": {
                    CLArray cLArray0 = cLObject0.I(s2);
                    if(cLArray0 == null) {
                        continue;
                    }
                    for(int v = 0; v < cLArray0.size(); ++v) {
                        gridReference0.P0(new Object[]{state0.f(cLArray0.D(v).c())});
                    }
                    continue;
                }
                case "flags": {
                    try {
                        s3 = "";
                        CLElement cLElement1 = cLObject0.E(s2);
                        if(cLElement1 instanceof CLNumber) {
                            v2 = cLElement1.k();
                        }
                        else {
                            s3 = cLElement1.c();
                            goto label_58;
                        }
                        goto label_59;
                    }
                    catch(Exception exception0) {
                    }
                    System.err.println("Error parsing grid flags " + exception0);
                label_58:
                    v2 = 0;
                label_59:
                    if(s3 == null || s3.isEmpty()) {
                        gridReference0.k1(v2);
                    }
                    else {
                        gridReference0.l1(s3);
                    }
                    continue;
                }
                case "hGap": {
                    gridReference0.m1(ConstraintSetParser.E(state0, cLObject0.E(s2).j()));
                    continue;
                }
                case "orientation": {
                    gridReference0.n1(cLObject0.E(s2).k());
                    continue;
                }
                case "padding": {
                    CLElement cLElement0 = cLObject0.E(s2);
                    if(!(cLElement0 instanceof CLArray) || ((CLArray)cLElement0).size() <= 1) {
                        f = (float)cLElement0.k();
                        f3 = f;
                        f2 = f3;
                        f1 = f2;
                    }
                    else {
                        f = (float)((CLArray)cLElement0).getInt(0);
                        f1 = (float)((CLArray)cLElement0).getInt(1);
                        if(((CLArray)cLElement0).size() > 2) {
                            f2 = (float)((CLArray)cLElement0).getInt(2);
                            try {
                                f3 = (float)((CLArray)cLElement0).getInt(3);
                            }
                            catch(ArrayIndexOutOfBoundsException unused_ex) {
                                f3 = 0.0f;
                            }
                        }
                        else {
                            f2 = f;
                            f3 = f1;
                        }
                    }
                    gridReference0.q1(Math.round(ConstraintSetParser.E(state0, f)));
                    gridReference0.r1(Math.round(ConstraintSetParser.E(state0, f1)));
                    gridReference0.p1(Math.round(ConstraintSetParser.E(state0, f2)));
                    gridReference0.o1(Math.round(ConstraintSetParser.E(state0, f3)));
                    continue;
                }
                case "rowWeights": {
                    String s6 = cLObject0.E(s2).c();
                    if(s6 == null || !s6.contains(",")) {
                        continue;
                    }
                    gridReference0.s1(s6);
                    continue;
                }
                case "rows": {
                    int v1 = cLObject0.E(s2).k();
                    if(v1 <= 0) {
                        continue;
                    }
                    gridReference0.t1(v1);
                    continue;
                }
                case "skips": {
                    String s4 = cLObject0.E(s2).c();
                    if(s4 == null || !s4.contains(":")) {
                        continue;
                    }
                    gridReference0.u1(s4);
                    continue;
                }
                case "spans": {
                    String s5 = cLObject0.E(s2).c();
                    if(s5 == null || !s5.contains(":")) {
                        continue;
                    }
                    gridReference0.v1(s5);
                    continue;
                }
                case "vGap": {
                    gridReference0.w1(ConstraintSetParser.E(state0, cLObject0.E(s2).j()));
                    continue;
                }
                default: {
                    ConstraintSetParser.a(state0, constraintSetParser$LayoutVariables0, state0.f(s1), cLObject0, s2);
                    continue;
                }
            }
            gridReference0.i1(s7);
        }
    }

    static void r(int v, State state0, CLArray cLArray0) throws CLParsingException {
        CLElement cLElement0 = cLArray0.D(1);
        if(!(cLElement0 instanceof CLObject)) {
            return;
        }
        String s = ((CLObject)cLElement0).W("id");
        if(s == null) {
            return;
        }
        ConstraintSetParser.s(v, state0, s, ((CLObject)cLElement0));
    }

    // This method was un-flattened
    static void s(int v, State state0, String s, CLObject cLObject0) throws CLParsingException {
        String s1;
        int v2;
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        ConstraintReference constraintReference0 = state0.f(s);
        if(v == 0) {
            state0.x(s);
        }
        else {
            state0.O(s);
        }
        int v1 = !state0.A() || v == 0 ? 1 : 0;
        GuidelineReference guidelineReference0 = (GuidelineReference)constraintReference0.d();
        Iterator iterator0 = arrayList0.iterator();
        float f = 0.0f;
        boolean z = false;
    alab2:
        while(true) {
            v2 = 1;
        label_14:
            if(!iterator0.hasNext()) {
                goto label_56;
            }
            Object object0 = iterator0.next();
            s1 = (String)object0;
            s1.hashCode();
        alab1:
            switch(s1) {
                case "end": {
                    v2 = v1 ^ 1;
                    f = ConstraintSetParser.E(state0, cLObject0.K(s1));
                    goto label_14;
                }
                case "left": {
                    f = ConstraintSetParser.E(state0, cLObject0.K(s1));
                    break;
                }
                case "percent": {
                    CLArray cLArray0 = cLObject0.I(s1);
                    if(cLArray0 == null) {
                        f = cLObject0.K(s1);
                        z = true;
                        break;
                    }
                    else {
                        if(cLArray0.size() > 1) {
                            String s2 = cLArray0.T(0);
                            float f1 = cLArray0.getFloat(1);
                            s2.hashCode();
                            switch(s2) {
                                case "end": {
                                    v2 = v1 ^ 1;
                                    f = f1;
                                    break;
                                }
                                case "left": {
                                    f = f1;
                                    z = true;
                                    break alab1;
                                }
                                case "right": {
                                    f = f1;
                                    z = true;
                                    v2 = 0;
                                    goto label_14;
                                }
                                case "start": {
                                    f = f1;
                                    v2 = v1;
                                    break;
                                }
                                default: {
                                    f = f1;
                                }
                            }
                        }
                        z = true;
                        goto label_14;
                    }
                    v2 = v1 ^ 1;
                    f = ConstraintSetParser.E(state0, cLObject0.K(s1));
                    goto label_14;
                }
                case "right": {
                    break alab2;
                }
                case "start": {
                    f = ConstraintSetParser.E(state0, cLObject0.K(s1));
                    v2 = v1;
                    goto label_14;
                }
                default: {
                    goto label_14;
                }
            }
        }
        f = ConstraintSetParser.E(state0, cLObject0.K(s1));
        v2 = 0;
        goto label_14;
    label_56:
        if(z) {
            if(v2 != 0) {
                guidelineReference0.g(f);
                return;
            }
            guidelineReference0.g(1.0f - f);
            return;
        }
        if(v2 != 0) {
            guidelineReference0.i(f);
            return;
        }
        guidelineReference0.e(f);
    }

    static void t(CoreMotionScene coreMotionScene0, CLObject cLObject0) {
        String s = cLObject0.W("export");
        if(s != null) {
            coreMotionScene0.f(s);
        }
    }

    static void u(State state0, LayoutVariables constraintSetParser$LayoutVariables0, CLArray cLArray0) throws CLParsingException {
        for(int v = 0; v < cLArray0.size(); ++v) {
            CLElement cLElement0 = cLArray0.D(v);
            if(cLElement0 instanceof CLArray && ((CLArray)cLElement0).size() > 1) {
                String s = ((CLArray)cLElement0).T(0);
                s.hashCode();
                switch(s) {
                    case "hChain": {
                        ConstraintSetParser.f(0, state0, constraintSetParser$LayoutVariables0, ((CLArray)cLElement0));
                        break;
                    }
                    case "hGuideline": {
                        ConstraintSetParser.r(0, state0, ((CLArray)cLElement0));
                        break;
                    }
                    case "vChain": {
                        ConstraintSetParser.f(1, state0, constraintSetParser$LayoutVariables0, ((CLArray)cLElement0));
                        break;
                    }
                    case "vGuideline": {
                        ConstraintSetParser.r(1, state0, ((CLArray)cLElement0));
                    }
                }
            }
        }
    }

    public static void v(String s, State state0, LayoutVariables constraintSetParser$LayoutVariables0) throws CLParsingException {
        try {
            ConstraintSetParser.D(CLParser.d(s), state0, constraintSetParser$LayoutVariables0);
        }
        catch(CLParsingException cLParsingException0) {
            System.err.println("Error parsing JSON " + cLParsingException0);
        }
    }

    public static void w(String s, Transition transition0, int v) {
        try {
            CLObject cLObject0 = CLParser.d(s);
            ArrayList arrayList0 = cLObject0.Y();
            if(arrayList0 == null) {
                return;
            }
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                CLElement cLElement0 = cLObject0.E(s1);
                if(cLElement0 instanceof CLObject) {
                    CLObject cLObject1 = ((CLObject)cLElement0).Q("custom");
                    if(cLObject1 != null) {
                        for(Object object1: cLObject1.Y()) {
                            String s2 = (String)object1;
                            CLElement cLElement1 = cLObject1.E(s2);
                            if(cLElement1 instanceof CLNumber) {
                                transition0.o(v, s1, s2, cLElement1.j());
                            }
                            else if(cLElement1 instanceof CLString) {
                                long v1 = ConstraintSetParser.h(cLElement1.c());
                                if(v1 != -1L) {
                                    transition0.n(v, s1, s2, ((int)v1));
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        System.err.println("Error parsing JSON " + cLParsingException0);
    }

    // This method was un-flattened
    private static void x(CLElement cLElement0, ConstraintReference constraintReference0) throws CLParsingException {
        if(!(cLElement0 instanceof CLObject)) {
            return;
        }
        TypedBundle typedBundle0 = new TypedBundle();
        ArrayList arrayList0 = ((CLObject)cLElement0).Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            String s = (String)object0;
            s.hashCode();
            switch(s) {
                case "easing": {
                    typedBundle0.c(603, ((CLObject)cLElement0).U(s));
                    break;
                }
                case "pathArc": {
                label_29:
                    String s1 = ((CLObject)cLElement0).U(s);
                    int v1 = ConstraintSetParser.b(s1, new String[]{"none", "startVertical", "startHorizontal", "flip", "below", "above"});
                    if(v1 == -1) {
                        System.err.println(((CLObject)cLElement0).l() + " pathArc = \'" + s1 + "\'");
                        continue;
                    }
                    else {
                        typedBundle0.b(607, v1);
                        break;
                    }
                    typedBundle0.c(605, ((CLObject)cLElement0).U(s));
                    break;
                }
                case "quantize": {
                    CLElement cLElement1 = ((CLObject)cLElement0).E(s);
                    if(cLElement1 instanceof CLArray) {
                        int v = ((CLArray)cLElement1).size();
                        if(v <= 0) {
                            continue;
                        }
                        typedBundle0.b(610, ((CLArray)cLElement1).getInt(0));
                        if(v <= 1) {
                            continue;
                        }
                        typedBundle0.c(611, ((CLArray)cLElement1).T(1));
                        if(v <= 2) {
                            continue;
                        }
                        typedBundle0.a(602, ((CLArray)cLElement1).getFloat(2));
                        continue;
                    }
                    else {
                        typedBundle0.b(610, ((CLObject)cLElement0).N(s));
                        break;
                    }
                    goto label_29;
                }
                case "relativeTo": {
                    typedBundle0.c(605, ((CLObject)cLElement0).U(s));
                    break;
                }
                case "stagger": {
                    typedBundle0.a(600, ((CLObject)cLElement0).K(s));
                }
            }
        }
        constraintReference0.l0 = typedBundle0;
    }

    // This method was un-flattened
    public static void y(CoreMotionScene coreMotionScene0, String s) {
        try {
            CLObject cLObject0 = CLParser.d(s);
            ArrayList arrayList0 = cLObject0.Y();
            if(arrayList0 == null) {
                return;
            }
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                CLElement cLElement0 = cLObject0.E(s1);
                if(cLElement0 instanceof CLObject) {
                    switch(s1) {
                        case "ConstraintSets": {
                            ConstraintSetParser.j(coreMotionScene0, ((CLObject)cLElement0));
                            break;
                        }
                        case "Header": {
                            ConstraintSetParser.t(coreMotionScene0, ((CLObject)cLElement0));
                            break;
                        }
                        case "Transitions": {
                            ConstraintSetParser.z(coreMotionScene0, ((CLObject)cLElement0));
                        }
                    }
                }
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        System.err.println("Error parsing JSON " + cLParsingException0);
    }

    static void z(CoreMotionScene coreMotionScene0, CLObject cLObject0) throws CLParsingException {
        ArrayList arrayList0 = cLObject0.Y();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            coreMotionScene0.a(((String)object0), cLObject0.P(((String)object0)).z());
        }
    }
}

