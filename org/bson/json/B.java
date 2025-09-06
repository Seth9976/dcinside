package org.bson.json;

import j..time.Instant;
import j..time.ZoneId;
import j..time.ZonedDateTime;
import j..time.format.DateTimeFormatter;
import j..time.format.DateTimeParseException;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..util.DesugarTimeZone;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import javax.xml.bind.DatatypeConverter;

final class b {
    interface a {
        String a(long arg1);

        long parse(String arg1);
    }

    static class org.bson.json.b.b implements a {
        static {
            try {
                Class.forName("j$.time.format.DateTimeFormatter");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new ExceptionInInitializerError(classNotFoundException0);
            }
        }

        @Override  // org.bson.json.b$a
        public String a(long v) {
            return ZonedDateTime.ofInstant(Instant.ofEpochMilli(v), ZoneId.of("Z")).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        @Override  // org.bson.json.b$a
        public long parse(String s) {
            class org.bson.json.b.b.a implements TemporalQuery {
                final org.bson.json.b.b a;

                public Instant a(TemporalAccessor temporalAccessor0) {
                    return Instant.from(temporalAccessor0);
                }

                @Override  // j$.time.temporal.TemporalQuery
                public Object queryFrom(TemporalAccessor temporalAccessor0) {
                    return this.a(temporalAccessor0);
                }
            }

            try {
                org.bson.json.b.b.a b$b$a0 = new org.bson.json.b.b.a(this);
                return ((Instant)DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(s, b$b$a0)).toEpochMilli();
            }
            catch(DateTimeParseException dateTimeParseException0) {
                throw new IllegalArgumentException(dateTimeParseException0.getMessage());
            }
        }
    }

    static class c implements a {
        private static final Method a;
        private static final Method b;

        static {
            try {
                c.a = DatatypeConverter.class.getDeclaredMethod("parseDateTime", String.class);
                c.b = DatatypeConverter.class.getDeclaredMethod("printDateTime", Calendar.class);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new ExceptionInInitializerError(noSuchMethodException0);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new ExceptionInInitializerError(classNotFoundException0);
            }
        }

        @Override  // org.bson.json.b$a
        public String a(long v) {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTimeInMillis(v);
            calendar0.setTimeZone(DesugarTimeZone.getTimeZone("Z"));
            try {
                return (String)c.b.invoke(null, calendar0);
            }
            catch(IllegalAccessException unused_ex) {
                throw new IllegalStateException();
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw (RuntimeException)invocationTargetException0.getCause();
            }
        }

        @Override  // org.bson.json.b$a
        public long parse(String s) {
            try {
                return ((Calendar)c.a.invoke(null, s)).getTimeInMillis();
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalStateException(illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw (RuntimeException)invocationTargetException0.getCause();
            }
        }
    }

    private static final a a;

    static {
        a b$a0;
        try {
            b$a0 = b.b("org.bson.json.DateTimeFormatter$Java8DateTimeFormatter");
        }
        catch(LinkageError unused_ex) {
            b$a0 = b.b("org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter");
        }
        b.a = b$a0;
    }

    static String a(long v) {
        return b.a.a(v);
    }

    private static a b(String s) {
        try {
            return (a)Class.forName(s).getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new ExceptionInInitializerError(classNotFoundException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new ExceptionInInitializerError(instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new ExceptionInInitializerError(illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new ExceptionInInitializerError(noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new ExceptionInInitializerError(invocationTargetException0);
        }
    }

    static long c(String s) {
        return b.a.parse(s);
    }
}

