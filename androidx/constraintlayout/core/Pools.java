package androidx.constraintlayout.core;

final class Pools {
    interface Pool {
        boolean a(Object arg1);

        Object b();

        void c(Object[] arg1, int arg2);
    }

    static class SimplePool implements Pool {
        private final Object[] a;
        private int b;

        SimplePool(int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.a = new Object[v];
        }

        @Override  // androidx.constraintlayout.core.Pools$Pool
        public boolean a(Object object0) {
            int v = this.b;
            Object[] arr_object = this.a;
            if(v < arr_object.length) {
                arr_object[v] = object0;
                this.b = v + 1;
                return true;
            }
            return false;
        }

        @Override  // androidx.constraintlayout.core.Pools$Pool
        public Object b() {
            int v = this.b;
            if(v > 0) {
                Object object0 = this.a[v - 1];
                this.a[v - 1] = null;
                this.b = v - 1;
                return object0;
            }
            return null;
        }

        @Override  // androidx.constraintlayout.core.Pools$Pool
        public void c(Object[] arr_object, int v) {
            if(v > arr_object.length) {
                v = arr_object.length;
            }
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                int v2 = this.b;
                Object[] arr_object1 = this.a;
                if(v2 < arr_object1.length) {
                    arr_object1[v2] = object0;
                    this.b = v2 + 1;
                }
            }
        }

        private boolean d(Object object0) {
            for(int v = 0; v < this.b; ++v) {
                if(this.a[v] == object0) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final boolean a = false;

}

