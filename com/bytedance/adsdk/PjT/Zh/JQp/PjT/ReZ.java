package com.bytedance.adsdk.PjT.Zh.JQp.PjT;

public class ReZ {
    private static Object PjT(double f, Number number0) {
        boolean z = false;
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                if(f > ((double)number0.longValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(number0 instanceof Float) {
                if(f > ((double)number0.floatValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            if(f > number0.doubleValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if(f > ((double)number0.intValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static Object PjT(float f, Number number0) {
        boolean z = false;
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                if(f > ((float)number0.longValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(number0 instanceof Float) {
                if(f > number0.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            if(((double)f) > number0.doubleValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if(f > ((float)number0.intValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static Object PjT(int v, Number number0) {
        boolean z = false;
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                if(((long)v) > number0.longValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(number0 instanceof Float) {
                if(((float)v) > number0.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            if(((double)v) > number0.doubleValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if(v > number0.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static Object PjT(long v, Number number0) {
        boolean z = false;
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                if(v > number0.longValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(number0 instanceof Float) {
                if(((float)v) > number0.floatValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            if(((double)v) > number0.doubleValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if(v > ((long)number0.intValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Object PjT(Object object0, Number number0) {
        if(!(object0 instanceof Integer) && !(object0 instanceof Short) && !(object0 instanceof Byte)) {
            if(object0 instanceof Long) {
                return ReZ.PjT(((long)(((Long)object0))), number0);
            }
            if(object0 instanceof Float) {
                return ReZ.PjT(((float)(((Float)object0))), number0);
            }
            if(object0 instanceof Double) {
                return ReZ.PjT(((double)(((Double)object0))), number0);
            }
            if(object0 instanceof String) {
                try {
                    return ReZ.PjT(Float.parseFloat(((String)object0)), number0);
                }
                catch(NumberFormatException unused_ex) {
                    throw new UnsupportedOperationException(object0.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(object0.getClass().getName() + "This type of addition operation is not supported");
        }
        return ReZ.PjT(((Number)object0).intValue(), number0);
    }
}

