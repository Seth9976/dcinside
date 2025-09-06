package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class PathProperty extends Property {
    private final Property a;
    private final PathMeasure b;
    private final float c;
    private final float[] d;
    private final PointF e;
    private float f;

    PathProperty(Property property0, Path path0) {
        String s = property0.getName();
        super(Float.class, s);
        this.d = new float[2];
        this.e = new PointF();
        this.a = property0;
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        this.b = pathMeasure0;
        this.c = pathMeasure0.getLength();
    }

    public Float a(Object object0) {
        return this.f;
    }

    public void b(Object object0, Float float0) {
        this.f = (float)float0;
        this.b.getPosTan(this.c * ((float)float0), this.d, null);
        this.e.x = this.d[0];
        this.e.y = this.d[1];
        this.a.set(object0, this.e);
    }

    @Override  // android.util.Property
    public Object get(Object object0) {
        return this.a(object0);
    }

    @Override  // android.util.Property
    public void set(Object object0, Object object1) {
        this.b(object0, ((Float)object1));
    }
}

