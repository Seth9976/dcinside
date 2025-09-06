package k3;

public class a {
    public Object a;
    public Object b;

    public a(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public static a a(Object object0, Object object1) {
        return new a(object0, object1);
    }

    // 去混淆评级： 低(20)
    private boolean b(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof a ? this.b(((a)object0).a, this.a) && this.b(((a)object0).b, this.b) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}

