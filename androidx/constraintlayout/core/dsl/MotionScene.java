package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

public class MotionScene {
    ArrayList a;
    ArrayList b;

    public MotionScene() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public void a(ConstraintSet constraintSet0) {
        this.b.add(constraintSet0);
    }

    public void b(Transition transition0) {
        this.a.add(transition0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("{\n");
        if(!this.a.isEmpty()) {
            stringBuilder0.append("Transitions:{\n");
            for(Object object0: this.a) {
                stringBuilder0.append(((Transition)object0).toString());
            }
            stringBuilder0.append("},\n");
        }
        if(!this.b.isEmpty()) {
            stringBuilder0.append("ConstraintSets:{\n");
            for(Object object1: this.b) {
                stringBuilder0.append(((ConstraintSet)object1).toString());
            }
            stringBuilder0.append("},\n");
        }
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }
}

