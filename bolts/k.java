package bolts;

public class k {
    private final j a;

    public k() {
        this.a = new j();
    }

    public j a() {
        return this.a;
    }

    public void b() {
        if(!this.e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exception0) {
        if(!this.f(exception0)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(Object object0) {
        if(!this.g(object0)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.a.V();
    }

    public boolean f(Exception exception0) {
        return this.a.W(exception0);
    }

    public boolean g(Object object0) {
        return this.a.X(object0);
    }
}

