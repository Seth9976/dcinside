package androidx.constraintlayout.core.parser;

import j..util.Objects;
import java.util.ArrayList;

public class CLKey extends CLContainer {
    private static ArrayList i;

    static {
        ArrayList arrayList0 = new ArrayList();
        CLKey.i = arrayList0;
        arrayList0.add("ConstraintSets");
        CLKey.i.add("Variables");
        CLKey.i.add("Generate");
        CLKey.i.add("Transitions");
        CLKey.i.add("KeyFrames");
        CLKey.i.add("KeyAttributes");
        CLKey.i.add("KeyPositions");
        CLKey.i.add("KeyCycles");
    }

    public CLKey(char[] arr_c) {
        super(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    public static CLElement B(char[] arr_c) {
        return new CLKey(arr_c);
    }

    public static CLElement d0(String s, CLElement cLElement0) {
        CLElement cLElement1 = new CLKey(s.toCharArray());
        cLElement1.x(0L);
        cLElement1.u(((long)(s.length() - 1)));
        ((CLKey)cLElement1).i0(cLElement0);
        return cLElement1;
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return !(object0 instanceof CLKey) || Objects.equals(this.g0(), ((CLKey)object0).g0()) ? super.equals(object0) : false;
    }

    public String g0() {
        return this.c();
    }

    public CLElement h0() {
        return this.h.size() <= 0 ? null : ((CLElement)this.h.get(0));
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    public int hashCode() {
        return super.hashCode();
    }

    public void i0(CLElement cLElement0) {
        if(this.h.size() > 0) {
            this.h.set(0, cLElement0);
            return;
        }
        this.h.add(cLElement0);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String y(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder("");
        this.a(stringBuilder0, v);
        String s = this.c();
        if(this.h.size() > 0) {
            stringBuilder0.append(s);
            stringBuilder0.append(": ");
            if(CLKey.i.contains(s)) {
                v1 = 3;
            }
            if(v1 > 0) {
                stringBuilder0.append(((CLElement)this.h.get(0)).y(v, v1 - 1));
                return stringBuilder0.toString();
            }
            if(v < CLElement.f) {
                stringBuilder0.append("");
                return stringBuilder0.toString();
            }
            stringBuilder0.append(((CLElement)this.h.get(0)).y(v, v1 - 1));
            return stringBuilder0.toString();
        }
        return s + ": <> ";
    }

    // 去混淆评级： 中等(60)
    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String z() {
        return this.h.size() <= 0 ? "" + this.c() + ": <> " : "" + this.c() + ": " + "";
    }
}

