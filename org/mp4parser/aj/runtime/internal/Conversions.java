package org.mp4parser.aj.runtime.internal;

public final class Conversions {
    public static Object booleanObject(boolean z) {
        return new Boolean(z);
    }

    public static boolean booleanValue(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof Boolean)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to boolean");
        }
        return ((Boolean)object0).booleanValue();
    }

    public static Object byteObject(byte b) {
        return new Byte(b);
    }

    public static byte byteValue(Object object0) {
        if(object0 == null) {
            return 0;
        }
        if(!(object0 instanceof Number)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to byte");
        }
        return ((Number)object0).byteValue();
    }

    public static Object charObject(char c) {
        return new Character(c);
    }

    public static char charValue(Object object0) {
        if(object0 == null) {
            return '\u0000';
        }
        if(!(object0 instanceof Character)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to char");
        }
        return ((Character)object0).charValue();
    }

    public static Object doubleObject(double f) {
        return new Double(f);
    }

    public static double doubleValue(Object object0) {
        if(object0 == null) {
            return 0.0;
        }
        if(!(object0 instanceof Number)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to double");
        }
        return ((Number)object0).doubleValue();
    }

    public static Object floatObject(float f) {
        return new Float(f);
    }

    public static float floatValue(Object object0) {
        if(object0 == null) {
            return 0.0f;
        }
        if(!(object0 instanceof Number)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to float");
        }
        return ((Number)object0).floatValue();
    }

    public static Object intObject(int v) {
        return new Integer(v);
    }

    public static int intValue(Object object0) {
        if(object0 == null) {
            return 0;
        }
        if(!(object0 instanceof Number)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to int");
        }
        return ((Number)object0).intValue();
    }

    public static Object longObject(long v) {
        return new Long(v);
    }

    public static long longValue(Object object0) {
        if(object0 == null) {
            return 0L;
        }
        if(!(object0 instanceof Number)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to long");
        }
        return ((Number)object0).longValue();
    }

    public static Object shortObject(short v) {
        return new Short(v);
    }

    public static short shortValue(Object object0) {
        if(object0 == null) {
            return 0;
        }
        if(!(object0 instanceof Number)) {
            throw new ClassCastException(object0.getClass().getName() + " can not be converted to short");
        }
        return ((Number)object0).shortValue();
    }

    public static Object voidObject() {
        return null;
    }

    public static Object voidValue(Object object0) {
        return object0;
    }
}

