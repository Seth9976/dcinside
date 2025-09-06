package com.bykv.vk.openvk.preload.b;

public interface e {
    public static final class a implements e {
        @Override  // com.bykv.vk.openvk.preload.b.e
        public final Object a(Class class0) {
            try {
                return class0.newInstance();
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
    }

    Object a(Class arg1);
}

