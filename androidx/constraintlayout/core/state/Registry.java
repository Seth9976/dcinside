package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

public class Registry {
    private HashMap a;
    private static final Registry b;

    static {
        Registry.b = new Registry();
    }

    public Registry() {
        this.a = new HashMap();
    }

    public String a(String s) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        return registryCallback0 == null ? null : registryCallback0.g();
    }

    public String b(String s) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        return registryCallback0 == null ? null : registryCallback0.h();
    }

    public static Registry c() {
        return Registry.b;
    }

    public long d(String s) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        return registryCallback0 == null ? 0x7FFFFFFFFFFFFFFFL : registryCallback0.f();
    }

    public Set e() {
        return this.a.keySet();
    }

    public void f(String s, RegistryCallback registryCallback0) {
        this.a.put(s, registryCallback0);
    }

    public void g(String s, int v) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        if(registryCallback0 != null) {
            registryCallback0.c(v);
        }
    }

    public void h(String s, int v) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        if(registryCallback0 != null) {
            registryCallback0.d(v);
        }
    }

    public void i(String s, RegistryCallback registryCallback0) {
        this.a.remove(s);
    }

    public void j(String s, String s1) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        if(registryCallback0 != null) {
            registryCallback0.b(s1);
        }
    }

    public void k(String s, int v, int v1) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        if(registryCallback0 != null) {
            registryCallback0.a(v, v1);
        }
    }

    public void l(String s, float f) {
        RegistryCallback registryCallback0 = (RegistryCallback)this.a.get(s);
        if(registryCallback0 != null) {
            registryCallback0.e(f);
        }
    }
}

