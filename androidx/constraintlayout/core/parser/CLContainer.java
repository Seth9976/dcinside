package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import j..util.Objects;
import java.util.ArrayList;

public class CLContainer extends CLElement {
    ArrayList h;

    public CLContainer(char[] arr_c) {
        super(arr_c);
        this.h = new ArrayList();
    }

    public void A(CLElement cLElement0) {
        this.h.add(cLElement0);
        if(CLParser.d) {
            System.out.println("added element " + cLElement0 + " to " + this);
        }
    }

    public static CLElement B(char[] arr_c) {
        return new CLContainer(arr_c);
    }

    @NonNull
    public CLContainer C() {
        CLContainer cLContainer0 = (CLContainer)super.b();
        ArrayList arrayList0 = new ArrayList(this.h.size());
        for(Object object0: this.h) {
            CLElement cLElement0 = ((CLElement)object0).b();
            cLElement0.t(cLContainer0);
            arrayList0.add(cLElement0);
        }
        cLContainer0.h = arrayList0;
        return cLContainer0;
    }

    public CLElement D(int v) throws CLParsingException {
        if(v < 0 || v >= this.h.size()) {
            throw new CLParsingException("no element at index " + v, this);
        }
        return (CLElement)this.h.get(v);
    }

    public CLElement E(String s) throws CLParsingException {
        for(Object object0: this.h) {
            CLKey cLKey0 = (CLKey)(((CLElement)object0));
            if(cLKey0.c().equals(s)) {
                return cLKey0.h0();
            }
            if(false) {
                break;
            }
        }
        throw new CLParsingException("no element for key <" + s + ">", this);
    }

    public CLArray F(int v) throws CLParsingException {
        CLElement cLElement0 = this.D(v);
        if(!(cLElement0 instanceof CLArray)) {
            throw new CLParsingException("no array at index " + v, this);
        }
        return (CLArray)cLElement0;
    }

    public CLArray G(String s) throws CLParsingException {
        CLElement cLElement0 = this.E(s);
        if(!(cLElement0 instanceof CLArray)) {
            throw new CLParsingException("no array found for key <" + s + ">, found [" + cLElement0.n() + "] : " + cLElement0, this);
        }
        return (CLArray)cLElement0;
    }

    public CLArray H(String s) {
        CLArray cLArray0 = this.I(s);
        if(cLArray0 != null) {
            return cLArray0;
        }
        CLArray cLArray1 = new CLArray(new char[0]);
        this.Z(s, cLArray1);
        return cLArray1;
    }

    public CLArray I(String s) {
        CLElement cLElement0 = this.S(s);
        return cLElement0 instanceof CLArray ? ((CLArray)cLElement0) : null;
    }

    public boolean J(String s) throws CLParsingException {
        CLElement cLElement0 = this.E(s);
        if(!(cLElement0 instanceof CLToken)) {
            throw new CLParsingException("no boolean found for key <" + s + ">, found [" + cLElement0.n() + "] : " + cLElement0, this);
        }
        return ((CLToken)cLElement0).B();
    }

    public float K(String s) throws CLParsingException {
        CLElement cLElement0 = this.E(s);
        if(cLElement0 == null) {
            throw new NullPointerException();
        }
        return cLElement0.j();
    }

    public float M(String s) {
        CLElement cLElement0 = this.S(s);
        return cLElement0 instanceof CLNumber ? cLElement0.j() : NaNf;
    }

    public int N(String s) throws CLParsingException {
        CLElement cLElement0 = this.E(s);
        if(cLElement0 == null) {
            throw new NullPointerException();
        }
        return cLElement0.k();
    }

    public CLObject O(int v) throws CLParsingException {
        CLElement cLElement0 = this.D(v);
        if(!(cLElement0 instanceof CLObject)) {
            throw new CLParsingException("no object at index " + v, this);
        }
        return (CLObject)cLElement0;
    }

    public CLObject P(String s) throws CLParsingException {
        CLElement cLElement0 = this.E(s);
        if(!(cLElement0 instanceof CLObject)) {
            throw new CLParsingException("no object found for key <" + s + ">, found [" + cLElement0.n() + "] : " + cLElement0, this);
        }
        return (CLObject)cLElement0;
    }

    public CLObject Q(String s) {
        CLElement cLElement0 = this.S(s);
        return cLElement0 instanceof CLObject ? ((CLObject)cLElement0) : null;
    }

    public CLElement R(int v) {
        return v < 0 || v >= this.h.size() ? null : ((CLElement)this.h.get(v));
    }

    public CLElement S(String s) {
        for(Object object0: this.h) {
            CLKey cLKey0 = (CLKey)(((CLElement)object0));
            if(cLKey0.c().equals(s)) {
                return cLKey0.h0();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public String T(int v) throws CLParsingException {
        CLElement cLElement0 = this.D(v);
        if(!(cLElement0 instanceof CLString)) {
            throw new CLParsingException("no string at index " + v, this);
        }
        return cLElement0.c();
    }

    public String U(String s) throws CLParsingException {
        CLElement cLElement0 = this.E(s);
        if(!(cLElement0 instanceof CLString)) {
            throw new CLParsingException("no string found for key <" + s + ">, found [" + (cLElement0 == null ? null : cLElement0.n()) + "] : " + cLElement0, this);
        }
        return cLElement0.c();
    }

    public String V(int v) {
        CLElement cLElement0 = this.R(v);
        return cLElement0 instanceof CLString ? cLElement0.c() : null;
    }

    public String W(String s) {
        CLElement cLElement0 = this.S(s);
        return cLElement0 instanceof CLString ? cLElement0.c() : null;
    }

    public boolean X(String s) {
        for(Object object0: this.h) {
            if(((CLElement)object0) instanceof CLKey && ((CLKey)(((CLElement)object0))).c().equals(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public ArrayList Y() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.h) {
            CLElement cLElement0 = (CLElement)object0;
            if(cLElement0 instanceof CLKey) {
                arrayList0.add(((CLKey)cLElement0).c());
            }
        }
        return arrayList0;
    }

    public void Z(String s, CLElement cLElement0) {
        for(Object object0: this.h) {
            CLKey cLKey0 = (CLKey)(((CLElement)object0));
            if(cLKey0.c().equals(s)) {
                cLKey0.i0(cLElement0);
                return;
            }
            if(false) {
                break;
            }
        }
        CLKey cLKey1 = (CLKey)CLKey.d0(s, cLElement0);
        this.h.add(cLKey1);
    }

    public void a0(String s, float f) {
        this.Z(s, new CLNumber(f));
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    @NonNull
    public CLElement b() {
        return this.C();
    }

    public void b0(String s, String s1) {
        CLString cLString0 = new CLString(s1.toCharArray());
        cLString0.x(0L);
        cLString0.u(((long)(s1.length() - 1)));
        this.Z(s, cLString0);
    }

    public void c0(String s) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.h) {
            CLElement cLElement0 = (CLElement)object0;
            if(((CLKey)cLElement0).c().equals(s)) {
                arrayList0.add(cLElement0);
            }
        }
        for(Object object1: arrayList0) {
            this.h.remove(((CLElement)object1));
        }
    }

    public void clear() {
        this.h.clear();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return this.C();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof CLContainer ? this.h.equals(((CLContainer)object0).h) : false;
    }

    public boolean getBoolean(int v) throws CLParsingException {
        CLElement cLElement0 = this.D(v);
        if(!(cLElement0 instanceof CLToken)) {
            throw new CLParsingException("no boolean at index " + v, this);
        }
        return ((CLToken)cLElement0).B();
    }

    public float getFloat(int v) throws CLParsingException {
        CLElement cLElement0 = this.D(v);
        if(cLElement0 == null) {
            throw new CLParsingException("no float at index " + v, this);
        }
        return cLElement0.j();
    }

    public int getInt(int v) throws CLParsingException {
        CLElement cLElement0 = this.D(v);
        if(cLElement0 == null) {
            throw new CLParsingException("no int at index " + v, this);
        }
        return cLElement0.k();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(new Object[]{this.h, super.hashCode()});
    }

    public int size() {
        return this.h.size();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.h) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append("; ");
            }
            stringBuilder0.append(((CLElement)object0));
        }
        return super.toString() + " = <" + stringBuilder0 + " >";
    }
}

