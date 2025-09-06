package javassist.runtime;

public class b {
    class a extends ThreadLocal {
        a() {
            super();
        }

        protected Boolean a() {
            return false;
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    public static boolean a = false;
    private static final ThreadLocal b;

    static {
        b.b = new a();
    }

    // 去混淆评级： 低(20)
    private static Class a(String s) throws ClassNotFoundException {
        return b.a || ((Boolean)b.b.get()).booleanValue() ? Class.forName(s, true, Thread.currentThread().getContextClassLoader()) : Class.forName(s);
    }

    private static Class[] b(String s, int v, int v1, int v2) {
        int v3 = v1;
        while(true) {
            switch(s.charAt(v3)) {
                case 76: {
                    v3 = s.indexOf(59, v3);
                    if(v3 < 0) {
                        throw new IndexOutOfBoundsException("bad descriptor");
                    }
                label_6:
                    Class[] arr_class = b.f(s, v, v3 + 1, v2 + 1);
                    try {
                        arr_class[v2] = b.a((s.charAt(v1) == 76 ? s.substring(v1 + 1, v3) : s.substring(v1, v3 + 1)).replace('/', '.'));
                        return arr_class;
                    }
                    catch(ClassNotFoundException classNotFoundException0) {
                        throw new RuntimeException(classNotFoundException0.getMessage());
                    }
                }
                case 91: {
                    break;
                }
                default: {
                    goto label_6;
                }
            }
            ++v3;
        }
    }

    public static Class c(String s) {
        try {
            return b.a(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("$class: internal error, could not find class \'" + s + "\' (Desc.useContextClassLoader: " + Boolean.toString(b.a) + ")", classNotFoundException0);
        }
    }

    public static Class[] d(String s) {
        if(s.charAt(0) != 40) {
            throw new RuntimeException("$sig: internal error");
        }
        return b.f(s, s.length(), 1, 0);
    }

    public static Class e(String s) {
        Class[] arr_class = b.f(s, s.length(), 0, 0);
        if(arr_class == null || arr_class.length != 1) {
            throw new RuntimeException("$type: internal error");
        }
        return arr_class[0];
    }

    private static Class[] f(String s, int v, int v1, int v2) {
        Class class0;
        if(v1 >= v) {
            return new Class[v2];
        }
        switch(s.charAt(v1)) {
            case 66: {
                class0 = Byte.TYPE;
                break;
            }
            case 67: {
                class0 = Character.TYPE;
                break;
            }
            case 68: {
                class0 = Double.TYPE;
                break;
            }
            case 70: {
                class0 = Float.TYPE;
                break;
            }
            case 73: {
                class0 = Integer.TYPE;
                break;
            }
            case 74: {
                class0 = Long.TYPE;
                break;
            }
            case 83: {
                class0 = Short.TYPE;
                break;
            }
            case 86: {
                class0 = Void.TYPE;
                break;
            }
            case 90: {
                class0 = Boolean.TYPE;
                break;
            }
            case 76: 
            case 91: {
                return b.b(s, v, v1, v2);
            }
            default: {
                return new Class[v2];
            }
        }
        Class[] arr_class = b.f(s, v, v1 + 1, v2 + 1);
        arr_class[v2] = class0;
        return arr_class;
    }

    public static void g() {
        b.b.remove();
    }

    public static void h() {
        b.b.set(Boolean.TRUE);
    }
}

