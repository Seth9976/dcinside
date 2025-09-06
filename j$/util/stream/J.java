package j$.util.stream;

import j..util.A;
import j..util.Map.-EL;
import j..util.Objects;
import j..util.StringJoiner;
import j..util.function.BiConsumer.-CC;
import j..util.function.BiFunction.-CC;
import j..util.function.Function.-CC;
import j..util.x;
import j..util.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public final class j implements BiConsumer, BinaryOperator, Function, IntFunction, LongFunction, ObjDoubleConsumer, Supplier {
    public final int a;

    public j(int v) {
        this.a = v;
        super();
    }

    @Override
    public void accept(Object object0, double f) {
        if(this.a != 6) {
            Collectors.a(((double[])object0), f);
            ((double[])object0)[2] += f;
            return;
        }
        ++((double[])object0)[2];
        Collectors.a(((double[])object0), f);
        ((double[])object0)[3] += f;
    }

    @Override
    public void accept(Object object0, Object object1) {
        switch(this.a) {
            case 5: {
                Collectors.a(((double[])object0), ((double[])object1)[0]);
                Collectors.a(((double[])object0), ((double[])object1)[1]);
                ((double[])object0)[2] += ((double[])object1)[2];
                return;
            }
            case 7: {
                Collectors.a(((double[])object0), ((double[])object1)[0]);
                Collectors.a(((double[])object0), ((double[])object1)[1]);
                ((double[])object0)[2] += ((double[])object1)[2];
                ((double[])object0)[3] += ((double[])object1)[3];
                return;
            }
            case 22: {
                ((Collection)object0).add(object1);
                return;
            }
            case 24: {
                ((List)object0).add(object1);
                return;
            }
            case 27: {
                ((Set)object0).add(object1);
                return;
            }
            default: {
                ((StringJoiner)object0).add(((CharSequence)object1));
            }
        }
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        switch(this.a) {
            case 5: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 7: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 22: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 24: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 27: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            default: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
        }
    }

    @Override
    public BiFunction andThen(Function function0) {
        switch(this.a) {
            case 0: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 1: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 2: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 4: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 14: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 16: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 18: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            default: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
        }
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(int v) {
        return new Object[v];
    }

    @Override
    public Object apply(long v) {
        switch(this.a) {
            case 13: {
                return x0.J(v);
            }
            case 15: {
                return x0.R(v);
            }
            default: {
                return x0.S(v);
            }
        }
    }

    @Override
    public Object apply(Object object0) {
        return object0;
    }

    @Override
    public Object apply(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                for(Object object2: ((Map)object1).entrySet()) {
                    Object object3 = ((Map.Entry)object2).getKey();
                    Object object4 = Objects.requireNonNull(((Map.Entry)object2).getValue());
                    Object object5 = Map.-EL.putIfAbsent(((Map)object0), object3, object4);
                    if(object5 != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", object3, object5, object4));
                    }
                    if(false) {
                        break;
                    }
                }
                return (Map)object0;
            }
            case 1: {
                ((Collection)object0).addAll(((Collection)object1));
                return (Collection)object0;
            }
            case 2: {
                ((List)object0).addAll(((List)object1));
                return (List)object0;
            }
            case 4: {
                if(((Set)object0).size() < ((Set)object1).size()) {
                    ((Set)object1).addAll(((Set)object0));
                    return (Set)object1;
                }
                ((Set)object0).addAll(((Set)object1));
                return (Set)object0;
            }
            case 14: {
                return new R0(((D0)object0), ((D0)object1));  // 初始化器: Lj$/util/stream/L0;-><init>(Lj$/util/stream/J0;Lj$/util/stream/J0;)V
            }
            case 16: {
                return new S0(((F0)object0), ((F0)object1));  // 初始化器: Lj$/util/stream/L0;-><init>(Lj$/util/stream/J0;Lj$/util/stream/J0;)V
            }
            case 18: {
                return new T0(((H0)object0), ((H0)object1));  // 初始化器: Lj$/util/stream/L0;-><init>(Lj$/util/stream/J0;Lj$/util/stream/J0;)V
            }
            default: {
                return new V0(((J0)object0), ((J0)object1));  // 初始化器: Lj$/util/stream/L0;-><init>(Lj$/util/stream/J0;Lj$/util/stream/J0;)V
            }
        }
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }

    @Override
    public Object get() {
        switch(this.a) {
            case 9: {
                return new H();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            case 10: {
                return new I();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            case 11: {
                return new J();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            case 12: {
                return new K();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            case 21: {
                return new x();
            }
            case 23: {
                return new ArrayList();
            }
            case 25: {
                return new y();
            }
            case 26: {
                return new HashSet();
            }
            default: {
                return new A();
            }
        }
    }
}

