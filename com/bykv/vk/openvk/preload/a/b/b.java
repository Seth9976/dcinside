package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.f;
import com.bykv.vk.openvk.preload.a.j;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class b {
    private final Map a;
    private final com.bykv.vk.openvk.preload.a.b.b.b b;

    public b(Map map0) {
        this.b = com.bykv.vk.openvk.preload.a.b.b.b.a();
        this.a = map0;
    }

    private h a(Class class0) {
        try {
            Constructor constructor0 = class0.getDeclaredConstructor(null);
            if(!constructor0.isAccessible()) {
                this.b.a(constructor0);
            }
            return new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    try {
                        return this.a.newInstance(null);
                    }
                    catch(InstantiationException instantiationException0) {
                        throw new RuntimeException("Failed to invoke " + this.a + " with no args", instantiationException0);
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        throw new RuntimeException("Failed to invoke " + this.a + " with no args", invocationTargetException0.getTargetException());
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        throw new AssertionError(illegalAccessException0);
                    }
                }
            };
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
    }

    public final h a(a a0) {
        h h1;
        Type type0 = a0.b();
        Class class0 = a0.a();
        f f0 = (f)this.a.get(type0);
        if(f0 != null) {
            return new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    return this.a.a();
                }
            };
        }
        f f1 = (f)this.a.get(class0);
        if(f1 != null) {
            return new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    return this.a.a();
                }
            };
        }
        h h0 = this.a(class0);
        if(h0 != null) {
            return h0;
        }
        if(!Collection.class.isAssignableFrom(class0)) {
            if(!Map.class.isAssignableFrom(class0)) {
                h1 = null;
            }
            else if(ConcurrentNavigableMap.class.isAssignableFrom(class0)) {
                h1 = new h() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.h
                    public final Object a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            else if(ConcurrentMap.class.isAssignableFrom(class0)) {
                h1 = new h() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.h
                    public final Object a() {
                        return new ConcurrentHashMap();
                    }
                };
            }
            else if(SortedMap.class.isAssignableFrom(class0)) {
                h1 = new h() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.h
                    public final Object a() {
                        return new TreeMap();
                    }
                };
            }
            else if(type0 instanceof ParameterizedType) {
                Class class1 = a.a(((ParameterizedType)type0).getActualTypeArguments()[0]).a();
                h1 = String.class.isAssignableFrom(class1) ? new h() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.h
                    public final Object a() {
                        return new g();
                    }
                } : new h() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.h
                    public final Object a() {
                        return new LinkedHashMap();
                    }
                };
            }
            else {
                h1 = new h() {
                    @Override  // com.bykv.vk.openvk.preload.a.b.h
                    public final Object a() {
                        return new g();
                    }
                };
            }
        }
        else if(SortedSet.class.isAssignableFrom(class0)) {
            h1 = new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    return new TreeSet();
                }
            };
        }
        else if(EnumSet.class.isAssignableFrom(class0)) {
            h1 = new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    Type type0 = this.a;
                    if(!(type0 instanceof ParameterizedType)) {
                        throw new j("Invalid EnumSet type: " + this.a.toString());
                    }
                    Type type1 = ((ParameterizedType)type0).getActualTypeArguments()[0];
                    if(!(type1 instanceof Class)) {
                        throw new j("Invalid EnumSet type: " + this.a.toString());
                    }
                    return EnumSet.noneOf(((Class)type1));
                }
            };
        }
        else if(Set.class.isAssignableFrom(class0)) {
            h1 = new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    return new LinkedHashSet();
                }
            };
        }
        else if(Queue.class.isAssignableFrom(class0)) {
            h1 = new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    return new ArrayDeque();
                }
            };
        }
        else {
            h1 = new h() {
                @Override  // com.bykv.vk.openvk.preload.a.b.h
                public final Object a() {
                    return new ArrayList();
                }
            };
        }
        return h1 != null ? h1 : new h() {
            private final i a;

            {
                Class class0 = type0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = i.a();
            }

            @Override  // com.bykv.vk.openvk.preload.a.b.h
            public final Object a() {
                try {
                    return this.a.a(type0);
                }
                catch(Exception exception0) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", exception0);
                }
            }
        };
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

