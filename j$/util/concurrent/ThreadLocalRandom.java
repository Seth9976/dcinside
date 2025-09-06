package j$.util.concurrent;

import j..util.stream.F;
import j..util.stream.IntStream.Wrapper;
import j..util.stream.StreamSupport;
import j..util.stream.n0;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ThreadLocalRandom extends Random {
    long a;
    int b;
    boolean c;
    private static final ThreadLocal d = null;
    private static final AtomicInteger e = null;
    private static final ThreadLocal f = null;
    private static final AtomicLong g = null;
    private static final ObjectStreamField[] serialPersistentFields = null;
    private static final long serialVersionUID = -5851777807851030925L;

    static {
        ThreadLocalRandom.serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
        ThreadLocalRandom.d = new ThreadLocal();
        ThreadLocalRandom.e = new AtomicInteger();
        ThreadLocalRandom.f = new v();  // 初始化器: Ljava/lang/ThreadLocal;-><init>()V
        ThreadLocalRandom.g = new AtomicLong(0xE2D0AD7217D96B00L);
        if(((Boolean)AccessController.doPrivileged(new w())).booleanValue()) {  // 初始化器: Ljava/lang/Object;-><init>()V
            byte[] arr_b = SecureRandom.getSeed(8);
            long v = ((long)arr_b[0]) & 0xFFL;
            for(int v1 = 1; v1 < 8; ++v1) {
                v = v << 8 | ((long)arr_b[v1]) & 0xFFL;
            }
            ThreadLocalRandom.g.set(v);
        }
    }

    private ThreadLocalRandom() {
        this.c = true;
    }

    ThreadLocalRandom(int v) {
    }

    static final int a(int v) {
        int v1 = v ^ v << 13;
        int v2 = v1 ^ v1 >>> 17;
        int v3 = v2 ^ v2 << 5;
        ((ThreadLocalRandom)ThreadLocalRandom.f.get()).b = v3;
        return v3;
    }

    static final int b() {
        return ((ThreadLocalRandom)ThreadLocalRandom.f.get()).b;
    }

    final double c(double f, double f1) {
        double f2 = ((double)(this.nextLong() >>> 11)) * 1.110223E-16;
        if(f < f1) {
            f2 = (f1 - f) * f2 + f;
            return f2 >= f1 ? Double.longBitsToDouble(Double.doubleToLongBits(f1) - 1L) : f2;
        }
        return f2;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom0 = (ThreadLocalRandom)ThreadLocalRandom.f.get();
        if(threadLocalRandom0.b == 0) {
            ThreadLocalRandom.f();
        }
        return threadLocalRandom0;
    }

    final int d(int v, int v1) {
        int v5;
        int v2 = ThreadLocalRandom.g(this.i());
        if(v < v1) {
            int v3 = v1 - v;
            if((v3 & v3 - 1) == 0) {
                return (v2 & v3 - 1) + v;
            }
            if(v3 > 0) {
                for(int v4 = v2 >>> 1; true; v4 = ThreadLocalRandom.g(this.i()) >>> 1) {
                    v5 = v4 % v3;
                    if(v4 + (v3 - 1) - v5 >= 0) {
                        break;
                    }
                }
                return v5 + v;
            }
            while(v2 < v || v2 >= v1) {
                v2 = ThreadLocalRandom.g(this.i());
            }
        }
        return v2;
    }

    @Override
    public final DoubleStream doubles() {
        return F.j(StreamSupport.a(new x(0L, 0x7FFFFFFFFFFFFFFFL, 1.797693E+308, 0.0)));
    }

    @Override
    public final DoubleStream doubles(double f, double f1) {
        if(f >= f1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return F.j(StreamSupport.a(new x(0L, 0x7FFFFFFFFFFFFFFFL, f, f1)));
    }

    @Override
    public final DoubleStream doubles(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return F.j(StreamSupport.a(new x(0L, v, 1.797693E+308, 0.0)));
    }

    @Override
    public final DoubleStream doubles(long v, double f, double f1) {
        if(v < 0L) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if(f >= f1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return F.j(StreamSupport.a(new x(0L, v, f, f1)));
    }

    final long e(long v, long v1) {
        long v4;
        long v2 = ThreadLocalRandom.h(this.i());
        if(v < v1) {
            long v3 = v1 - v;
            if((v3 & v3 - 1L) == 0L) {
                return (v2 & v3 - 1L) + v;
            }
            if(v3 > 0L) {
                while(true) {
                    v4 = (v2 >>> 1) % v3;
                    if((v2 >>> 1) + (v3 - 1L) - v4 >= 0L) {
                        break;
                    }
                    v2 = ThreadLocalRandom.h(this.i());
                }
                return v4 + v;
            }
            while(v2 < v || v2 >= v1) {
                v2 = ThreadLocalRandom.h(this.i());
            }
        }
        return v2;
    }

    static final void f() {
        int v = ThreadLocalRandom.e.addAndGet(-1640531527);
        if(v == 0) {
            v = 1;
        }
        long v1 = ThreadLocalRandom.h(ThreadLocalRandom.g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom0 = (ThreadLocalRandom)ThreadLocalRandom.f.get();
        threadLocalRandom0.a = v1;
        threadLocalRandom0.b = v;
    }

    private static int g(long v) {
        long v1 = (v ^ v >>> 33) * 0xFF51AFD7ED558CCDL;
        return (int)((v1 ^ v1 >>> 33) * 0xC4CEB9FE1A85EC53L >>> 0x20);
    }

    private static long h(long v) [...] // 潜在的解密器

    final long i() {
        long v = this.a - 0x61C8864680B583EBL;
        this.a = v;
        return v;
    }

    @Override
    public final IntStream ints() {
        return IntStream.Wrapper.convert(StreamSupport.b(new y(0L, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFF, 0)));
    }

    @Override
    public final IntStream ints(int v, int v1) {
        if(v >= v1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return IntStream.Wrapper.convert(StreamSupport.b(new y(0L, 0x7FFFFFFFFFFFFFFFL, v, v1)));
    }

    @Override
    public final IntStream ints(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return IntStream.Wrapper.convert(StreamSupport.b(new y(0L, v, 0x7FFFFFFF, 0)));
    }

    @Override
    public final IntStream ints(long v, int v1, int v2) {
        if(v < 0L) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if(v1 >= v2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return IntStream.Wrapper.convert(StreamSupport.b(new y(0L, v, v1, v2)));
    }

    @Override
    public final LongStream longs() {
        return n0.j(StreamSupport.c(new z(0L, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL, 0L)));
    }

    @Override
    public final LongStream longs(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return n0.j(StreamSupport.c(new z(0L, v, 0x7FFFFFFFFFFFFFFFL, 0L)));
    }

    @Override
    public final LongStream longs(long v, long v1) {
        if(v >= v1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return n0.j(StreamSupport.c(new z(0L, 0x7FFFFFFFFFFFFFFFL, v, v1)));
    }

    @Override
    public final LongStream longs(long v, long v1, long v2) {
        if(v < 0L) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if(v1 >= v2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return n0.j(StreamSupport.c(new z(0L, v, v1, v2)));
    }

    @Override
    protected final int next(int v) {
        return this.nextInt() >>> 0x20 - v;
    }

    @Override
    public final boolean nextBoolean() {
        return ThreadLocalRandom.g(this.i()) < 0;
    }

    @Override
    public final double nextDouble() {
        return ((double)(ThreadLocalRandom.h(this.i()) >>> 11)) * 1.110223E-16;
    }

    @Override
    public double nextDouble(double f) {
        if(f <= 0.0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double f1 = ((double)(ThreadLocalRandom.h(this.i()) >>> 11)) * 1.110223E-16 * f;
        return f1 < f ? f1 : Double.longBitsToDouble(Double.doubleToLongBits(f) - 1L);
    }

    @Override
    public final double nextDouble(double f, double f1) {
        if(f >= f1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return this.c(f, f1);
    }

    @Override
    public final float nextFloat() {
        return ((float)(ThreadLocalRandom.g(this.i()) >>> 8)) * 5.960464E-08f;
    }

    @Override
    public final double nextGaussian() {
        double f2;
        double f1;
        double f;
        ThreadLocal threadLocal0 = ThreadLocalRandom.d;
        Double double0 = (Double)threadLocal0.get();
        if(double0 != null) {
            threadLocal0.set(null);
            return (double)double0;
        }
        do {
            f = this.nextDouble() * 2.0 - 1.0;
            f1 = this.nextDouble() * 2.0 - 1.0;
            f2 = f1 * f1 + f * f;
        }
        while(f2 >= 1.0 || f2 == 0.0);
        double f3 = StrictMath.sqrt(StrictMath.log(f2) * -2.0 / f2);
        threadLocal0.set(((double)(f1 * f3)));
        return f * f3;
    }

    @Override
    public int nextInt() {
        return ThreadLocalRandom.g(this.i());
    }

    @Override
    public final int nextInt(int v) {
        int v2;
        if(v <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int v1 = ThreadLocalRandom.g(this.i());
        if((v & v - 1) == 0) {
            return v1 & v - 1;
        }
        while(true) {
            v2 = (v1 >>> 1) % v;
            if((v1 >>> 1) + (v - 1) - v2 >= 0) {
                break;
            }
            v1 = ThreadLocalRandom.g(this.i());
        }
        return v2;
    }

    @Override
    public int nextInt(int v, int v1) {
        if(v >= v1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return this.d(v, v1);
    }

    @Override
    public final long nextLong() {
        return ThreadLocalRandom.h(this.i());
    }

    @Override
    public long nextLong(long v) {
        long v2;
        if(v <= 0L) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long v1 = ThreadLocalRandom.h(this.i());
        if((v & v - 1L) == 0L) {
            return v1 & v - 1L;
        }
        while(true) {
            v2 = (v1 >>> 1) % v;
            if((v1 >>> 1) + (v - 1L) - v2 >= 0L) {
                break;
            }
            v1 = ThreadLocalRandom.h(this.i());
        }
        return v2;
    }

    @Override
    public long nextLong(long v, long v1) {
        if(v >= v1) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return this.e(v, v1);
    }

    private Object readResolve() {
        return ThreadLocalRandom.current();
    }

    @Override
    public final void setSeed(long v) {
        if(this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        ObjectOutputStream.PutField objectOutputStream$PutField0 = objectOutputStream0.putFields();
        objectOutputStream$PutField0.put("rnd", this.a);
        objectOutputStream$PutField0.put("initialized", true);
        objectOutputStream0.writeFields();
    }
}

