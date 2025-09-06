package org.bson.codecs.pojo;

import java.lang.reflect.Modifier;

final class i implements e {
    static class a {
    }

    static final class b implements D {
        private final E a;

        private b(E e0) {
            this.a = e0;
            try {
                e0.b().f().setAccessible(true);
            }
            catch(Exception exception0) {
                throw new org.bson.codecs.configuration.a(String.format("Unable to make private field accessible \'%s\' in %s", e0.b().h(), e0.b().d()), exception0);
            }
        }

        b(E e0, a i$a0) {
            this(e0);
        }

        @Override  // org.bson.codecs.pojo.D
        public void Q(Object object0, Object object1) {
            try {
                this.a.b().f().set(object0, object1);
            }
            catch(Exception exception0) {
                throw new org.bson.codecs.configuration.a(String.format("Unable to set value for property \'%s\' in %s", this.a.b().h(), this.a.b().d()), exception0);
            }
        }

        @Override  // org.bson.codecs.pojo.D
        public Object get(Object object0) {
            return this.a.get(object0);
        }
    }

    @Override  // org.bson.codecs.pojo.e
    public void a(c c0) {
        for(Object object0: c0.q()) {
            K k0 = (K)object0;
            if(!(k0.f() instanceof E)) {
                throw new org.bson.codecs.configuration.a(String.format("The SET_PRIVATE_FIELDS_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", k0.f().getClass().getName()));
            }
            I i0 = ((E)k0.f()).b();
            if(!i0.o() && i0.f() != null && Modifier.isPrivate(i0.f().getModifiers())) {
                this.b(k0);
            }
        }
    }

    private void b(K k0) {
        k0.p(new b(((E)k0.f()), null));
    }
}

