package org.bson.codecs.pojo;

import java.util.Collection;
import java.util.Map;

final class j implements e {
    static class a {
    }

    static final class b implements D {
        private final E a;

        private b(E e0) {
            this.a = e0;
        }

        b(E e0, a j$a0) {
            this(e0);
        }

        @Override  // org.bson.codecs.pojo.D
        public void Q(Object object0, Object object1) {
            if(object1 instanceof Collection) {
                this.a(object0, ((Collection)object1));
                return;
            }
            if(object1 instanceof Map) {
                this.b(object0, ((Map)object1));
                return;
            }
            this.c(String.format("Unexpected type: \'%s\'", object1.getClass()), null);
        }

        private void a(Object object0, Collection collection0) {
            Collection collection1 = (Collection)this.get(object0);
            if(collection1 == null) {
                this.c("The getter returned null.", null);
                return;
            }
            if(!collection1.isEmpty()) {
                this.c("The getter returned a non empty collection.", null);
                return;
            }
            try {
                collection1.addAll(collection0);
            }
            catch(Exception exception0) {
                this.c("collection#addAll failed.", exception0);
            }
        }

        private void b(Object object0, Map map0) {
            Map map1 = (Map)this.get(object0);
            if(map1 == null) {
                this.c("The getter returned null.", null);
                return;
            }
            if(!map1.isEmpty()) {
                this.c("The getter returned a non empty map.", null);
                return;
            }
            try {
                map1.putAll(map0);
            }
            catch(Exception exception0) {
                this.c("map#putAll failed.", exception0);
            }
        }

        private void c(String s, Exception exception0) {
            throw new org.bson.codecs.configuration.a(String.format("Cannot use getter in \'%s\' to set \'%s\'. %s", this.a.b().d(), this.a.b().h(), s), exception0);
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
                throw new org.bson.codecs.configuration.a(String.format("The USE_GETTER_AS_SETTER_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", k0.f().getClass().getName()));
            }
            I i0 = ((E)k0.f()).b();
            if(!i0.o() && i0.q() && this.b(i0.k().getType())) {
                this.c(k0);
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean b(Class class0) {
        return Collection.class.isAssignableFrom(class0) || Map.class.isAssignableFrom(class0);
    }

    private void c(K k0) {
        k0.p(new b(((E)k0.f()), null));
    }
}

