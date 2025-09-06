package e2;

import com.google.firebase.components.J;

public class a {
    private final Class a;
    private final Object b;

    public a(Class class0, Object object0) {
        this.a = (Class)J.b(class0);
        this.b = J.b(object0);
    }

    public Object a() {
        return this.b;
    }

    public Class b() {
        return this.a;
    }

    @Override
    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}

