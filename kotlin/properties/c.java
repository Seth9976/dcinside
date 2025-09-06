package kotlin.properties;

import kotlin.jvm.internal.L;
import kotlin.reflect.o;
import y4.l;
import y4.m;

public abstract class c implements f {
    private Object value;

    public c(Object object0) {
        this.value = object0;
    }

    protected void afterChange(@l o o0, Object object0, Object object1) {
        L.p(o0, "property");
    }

    protected boolean beforeChange(@l o o0, Object object0, Object object1) {
        L.p(o0, "property");
        return true;
    }

    @Override  // kotlin.properties.f
    public Object getValue(@m Object object0, @l o o0) {
        L.p(o0, "property");
        return this.value;
    }

    @Override  // kotlin.properties.f
    public void setValue(@m Object object0, @l o o0, Object object1) {
        L.p(o0, "property");
        Object object2 = this.value;
        if(!this.beforeChange(o0, object2, object1)) {
            return;
        }
        this.value = object1;
        this.afterChange(o0, object2, object1);
    }

    @Override
    @l
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}

