package com.bykv.vk.openvk.preload.b;

public abstract class k extends d {
    private Object d;

    private Object a(b b0, Throwable throwable0) throws Throwable {
        while(this.a(throwable0)) {
            try {
                return b0.a(this.a());
            }
            catch(a i$a0) {
                throwable0 = i$a0.getCause();
            }
            catch(Throwable throwable0) {
            }
        }
        throw throwable0;
    }

    protected Object a() {
        return this.d;
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        try {
            this.d = object0;
            return b0.a(this.a());
        }
        catch(a i$a0) {
            return this.a(b0, i$a0.getCause());
        }
        catch(Throwable throwable0) {
            return this.a(b0, throwable0);
        }
    }

    protected abstract boolean a(Throwable arg1);

    protected final Object g() {
        return this.d;
    }
}

