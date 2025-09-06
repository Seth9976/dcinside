package com.bytedance.adsdk.PjT.Zh.JQp.PjT;

public class Au {
    private static Object PjT(double f, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return (double)(f + ((double)number0.longValue()));
            }
            if(number0 instanceof Float) {
                return (double)(f + ((double)number0.floatValue()));
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return (double)(f + number0.doubleValue());
        }
        return (double)(f + ((double)number0.intValue()));
    }

    private static Object PjT(float f, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return (float)(f + ((float)number0.longValue()));
            }
            if(number0 instanceof Float) {
                return (float)(f + number0.floatValue());
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return (double)(((double)f) + number0.doubleValue());
        }
        return (float)(f + ((float)number0.intValue()));
    }

    private static Object PjT(int v, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return (long)(((long)v) + number0.longValue());
            }
            if(number0 instanceof Float) {
                return (float)(((float)v) + number0.floatValue());
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return (double)(((double)v) + number0.doubleValue());
        }
        return (int)(v + number0.intValue());
    }

    private static Object PjT(long v, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return (long)(v + number0.longValue());
            }
            if(number0 instanceof Float) {
                return (float)(((float)v) + number0.floatValue());
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return (double)(((double)v) + number0.doubleValue());
        }
        return (long)(v + ((long)number0.intValue()));
    }

    public static Object PjT(Number number0, Number number1) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return Au.PjT(number0.longValue(), number1);
            }
            if(number0 instanceof Float) {
                return Au.PjT(number0.floatValue(), number1);
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return Au.PjT(number0.doubleValue(), number1);
        }
        return Au.PjT(number0.intValue(), number1);
    }
}

