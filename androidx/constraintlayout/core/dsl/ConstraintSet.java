package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

public class ConstraintSet {
    private final String a;
    ArrayList b;
    ArrayList c;

    public ConstraintSet(String s) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = s;
    }

    public void a(Constraint constraint0) {
        this.b.add(constraint0);
    }

    public void b(Helper helper0) {
        this.c.add(helper0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.a + ":{\n");
        if(!this.b.isEmpty()) {
            for(Object object0: this.b) {
                stringBuilder0.append(((Constraint)object0).toString());
            }
        }
        if(!this.c.isEmpty()) {
            for(Object object1: this.c) {
                stringBuilder0.append(((Helper)object1).toString());
            }
        }
        stringBuilder0.append("},\n");
        return stringBuilder0.toString();
    }
}

