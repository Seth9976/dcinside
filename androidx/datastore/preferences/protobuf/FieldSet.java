package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class FieldSet {
    static final class Builder {
        private SmallSortedMap a;
        private boolean b;
        private boolean c;
        private boolean d;

        private Builder() {
            this(SmallSortedMap.u(16));
        }

        Builder(androidx.datastore.preferences.protobuf.FieldSet.1 fieldSet$10) {
        }

        private Builder(SmallSortedMap smallSortedMap0) {
            this.a = smallSortedMap0;
            this.c = true;
        }

        public void a(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
            List list0;
            this.d();
            if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || object0 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder;
            Builder.v(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
            Object object1 = this.g(fieldSet$FieldDescriptorLite0);
            if(object1 == null) {
                list0 = new ArrayList();
                this.a.w(fieldSet$FieldDescriptorLite0, list0);
            }
            else {
                list0 = (List)object1;
            }
            list0.add(object0);
        }

        public FieldSet b() {
            if(this.a.isEmpty()) {
                return FieldSet.s();
            }
            this.c = false;
            SmallSortedMap smallSortedMap0 = this.a;
            if(this.d) {
                smallSortedMap0 = FieldSet.l(smallSortedMap0, false);
                Builder.r(smallSortedMap0);
            }
            FieldSet fieldSet0 = new FieldSet(smallSortedMap0, null);
            fieldSet0.c = this.b;
            return fieldSet0;
        }

        public void c(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
            this.d();
            this.a.remove(fieldSet$FieldDescriptorLite0);
            if(this.a.isEmpty()) {
                this.b = false;
            }
        }

        private void d() {
            if(!this.c) {
                this.a = FieldSet.l(this.a, true);
                this.c = true;
            }
        }

        public static Builder e(FieldSet fieldSet0) {
            Builder fieldSet$Builder0 = new Builder(FieldSet.l(fieldSet0.a, true));
            fieldSet$Builder0.b = fieldSet0.c;
            return fieldSet$Builder0;
        }

        public Map f() {
            if(this.b) {
                Map map0 = FieldSet.l(this.a, false);
                if(this.a.s()) {
                    ((SmallSortedMap)map0).t();
                    return map0;
                }
                Builder.r(((SmallSortedMap)map0));
                return map0;
            }
            return this.a.s() ? this.a : DesugarCollections.unmodifiableMap(this.a);
        }

        public Object g(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
            return Builder.q(fieldSet$FieldDescriptorLite0, this.h(fieldSet$FieldDescriptorLite0));
        }

        Object h(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
            MessageLite messageLite0 = this.a.get(fieldSet$FieldDescriptorLite0);
            return messageLite0 instanceof LazyField ? ((LazyField)messageLite0).p() : messageLite0;
        }

        public Object i(FieldDescriptorLite fieldSet$FieldDescriptorLite0, int v) {
            if(this.d) {
                this.d();
            }
            return Builder.p(this.j(fieldSet$FieldDescriptorLite0, v));
        }

        Object j(FieldDescriptorLite fieldSet$FieldDescriptorLite0, int v) {
            if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = this.h(fieldSet$FieldDescriptorLite0);
            if(object0 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List)object0).get(v);
        }

        public int k(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
            if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = this.g(fieldSet$FieldDescriptorLite0);
            return object0 == null ? 0 : ((List)object0).size();
        }

        public boolean l(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
            if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.a.get(fieldSet$FieldDescriptorLite0) != null;
        }

        public boolean m() {
            for(int v = 0; v < this.a.l(); ++v) {
                if(!FieldSet.F(this.a.j(v))) {
                    return false;
                }
            }
            for(Object object0: this.a.o()) {
                if(!FieldSet.F(((Map.Entry)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public void n(FieldSet fieldSet0) {
            this.d();
            for(int v = 0; v < fieldSet0.a.l(); ++v) {
                this.o(fieldSet0.a.j(v));
            }
            for(Object object0: fieldSet0.a.o()) {
                this.o(((Map.Entry)object0));
            }
        }

        private void o(Map.Entry map$Entry0) {
            FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
            MessageLite messageLite0 = map$Entry0.getValue();
            if(messageLite0 instanceof LazyField) {
                messageLite0 = ((LazyField)messageLite0).p();
            }
            if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                ArrayList arrayList0 = this.g(fieldSet$FieldDescriptorLite0);
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                for(Object object0: ((List)messageLite0)) {
                    arrayList0.add(FieldSet.n(object0));
                }
                this.a.w(fieldSet$FieldDescriptorLite0, arrayList0);
                return;
            }
            if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.j) {
                Object object1 = this.g(fieldSet$FieldDescriptorLite0);
                if(object1 == null) {
                    this.a.w(fieldSet$FieldDescriptorLite0, FieldSet.n(messageLite0));
                    return;
                }
                if(object1 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder) {
                    fieldSet$FieldDescriptorLite0.u0(((androidx.datastore.preferences.protobuf.MessageLite.Builder)object1), messageLite0);
                    return;
                }
                MessageLite messageLite1 = fieldSet$FieldDescriptorLite0.u0(((MessageLite)object1).toBuilder(), messageLite0).build();
                this.a.w(fieldSet$FieldDescriptorLite0, messageLite1);
                return;
            }
            this.a.w(fieldSet$FieldDescriptorLite0, FieldSet.n(messageLite0));
        }

        private static Object p(Object object0) {
            return object0 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder ? ((androidx.datastore.preferences.protobuf.MessageLite.Builder)object0).build() : object0;
        }

        private static Object q(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
            if(object0 == null) {
                return null;
            }
            if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.j) {
                if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                    if(!(object0 instanceof List)) {
                        throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + object0.getClass());
                    }
                    List list0 = (List)object0;
                    for(int v = 0; v < list0.size(); ++v) {
                        Object object1 = list0.get(v);
                        Object object2 = Builder.p(object1);
                        if(object2 != object1) {
                            if(list0 == object0) {
                                list0 = new ArrayList(list0);
                            }
                            list0.set(v, object2);
                        }
                    }
                    return list0;
                }
                return Builder.p(object0);
            }
            return object0;
        }

        private static void r(SmallSortedMap smallSortedMap0) {
            for(int v = 0; v < smallSortedMap0.l(); ++v) {
                Builder.s(smallSortedMap0.j(v));
            }
            for(Object object0: smallSortedMap0.o()) {
                Builder.s(((Map.Entry)object0));
            }
        }

        private static void s(Map.Entry map$Entry0) {
            map$Entry0.setValue(Builder.q(((FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue()));
        }

        public void t(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
            this.d();
            boolean z = false;
            if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                if(!(object0 instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList0 = new ArrayList();
                arrayList0.addAll(((List)object0));
                for(Object object1: arrayList0) {
                    Builder.v(fieldSet$FieldDescriptorLite0.getLiteType(), object1);
                    this.d = this.d || object1 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder;
                }
                object0 = arrayList0;
            }
            else {
                Builder.v(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
            }
            if(object0 instanceof LazyField) {
                this.b = true;
            }
            if(this.d || object0 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder) {
                z = true;
            }
            this.d = z;
            this.a.w(fieldSet$FieldDescriptorLite0, object0);
        }

        public void u(FieldDescriptorLite fieldSet$FieldDescriptorLite0, int v, Object object0) {
            this.d();
            if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || object0 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder;
            Object object1 = this.g(fieldSet$FieldDescriptorLite0);
            if(object1 == null) {
                throw new IndexOutOfBoundsException();
            }
            Builder.v(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
            ((List)object1).set(v, object0);
        }

        private static void v(FieldType wireFormat$FieldType0, Object object0) {
            if(!FieldSet.G(wireFormat$FieldType0, object0) && (wireFormat$FieldType0.a() != JavaType.j || !(object0 instanceof androidx.datastore.preferences.protobuf.MessageLite.Builder))) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
    }

    public interface FieldDescriptorLite extends Comparable {
        EnumLiteMap getEnumType();

        JavaType getLiteJavaType();

        FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        androidx.datastore.preferences.protobuf.MessageLite.Builder u0(androidx.datastore.preferences.protobuf.MessageLite.Builder arg1, MessageLite arg2);
    }

    private final SmallSortedMap a;
    private boolean b;
    private boolean c;
    private static final int d = 16;
    private static final FieldSet e;

    static {
        FieldSet.e = new FieldSet(true);
    }

    private FieldSet() {
        this.a = SmallSortedMap.u(16);
    }

    private FieldSet(SmallSortedMap smallSortedMap0) {
        this.a = smallSortedMap0;
        this.I();
    }

    FieldSet(SmallSortedMap smallSortedMap0, androidx.datastore.preferences.protobuf.FieldSet.1 fieldSet$10) {
        this(smallSortedMap0);
    }

    private FieldSet(boolean z) {
        this(SmallSortedMap.u(0));
        this.I();
    }

    // 去混淆评级： 低(20)
    static int A(FieldType wireFormat$FieldType0, boolean z) {
        return z ? 2 : wireFormat$FieldType0.b();
    }

    public boolean B(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.a.get(fieldSet$FieldDescriptorLite0) != null;
    }

    boolean C() {
        return this.a.isEmpty();
    }

    public boolean D() {
        return this.b;
    }

    public boolean E() {
        for(int v = 0; v < this.a.l(); ++v) {
            if(!FieldSet.F(this.a.j(v))) {
                return false;
            }
        }
        for(Object object0: this.a.o()) {
            if(!FieldSet.F(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static boolean F(Map.Entry map$Entry0) {
        FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.j) {
            if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(((MessageLite)object0).isInitialized()) {
                        continue;
                    }
                    return false;
                }
            }
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof MessageLite) {
                return ((MessageLite)object1).isInitialized();
            }
            if(!(object1 instanceof LazyField)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    private static boolean G(FieldType wireFormat$FieldType0, Object object0) {
        Internal.d(object0);
        switch(wireFormat$FieldType0.a()) {
            case 1: {
                return object0 instanceof Integer;
            }
            case 2: {
                return object0 instanceof Long;
            }
            case 3: {
                return object0 instanceof Float;
            }
            case 4: {
                return object0 instanceof Double;
            }
            case 5: {
                return object0 instanceof Boolean;
            }
            case 6: {
                return object0 instanceof String;
            }
            case 7: {
                return object0 instanceof ByteString || object0 instanceof byte[];
            }
            case 8: {
                return object0 instanceof Integer || object0 instanceof EnumLite;
            }
            case 9: {
                return object0 instanceof MessageLite || object0 instanceof LazyField;
            }
            default: {
                return false;
            }
        }
    }

    public Iterator H() {
        return this.c ? new LazyIterator(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void I() {
        if(this.b) {
            return;
        }
        this.a.t();
        this.b = true;
    }

    public void J(FieldSet fieldSet0) {
        for(int v = 0; v < fieldSet0.a.l(); ++v) {
            this.K(fieldSet0.a.j(v));
        }
        for(Object object0: fieldSet0.a.o()) {
            this.K(((Map.Entry)object0));
        }
    }

    private void K(Map.Entry map$Entry0) {
        FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
        MessageLite messageLite0 = map$Entry0.getValue();
        if(messageLite0 instanceof LazyField) {
            messageLite0 = ((LazyField)messageLite0).p();
        }
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            ArrayList arrayList0 = this.u(fieldSet$FieldDescriptorLite0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(Object object0: ((List)messageLite0)) {
                arrayList0.add(FieldSet.n(object0));
            }
            this.a.w(fieldSet$FieldDescriptorLite0, arrayList0);
            return;
        }
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.j) {
            Object object1 = this.u(fieldSet$FieldDescriptorLite0);
            if(object1 == null) {
                Object object2 = FieldSet.n(messageLite0);
                this.a.w(fieldSet$FieldDescriptorLite0, object2);
                return;
            }
            MessageLite messageLite1 = fieldSet$FieldDescriptorLite0.u0(((MessageLite)object1).toBuilder(), messageLite0).build();
            this.a.w(fieldSet$FieldDescriptorLite0, messageLite1);
            return;
        }
        Object object3 = FieldSet.n(messageLite0);
        this.a.w(fieldSet$FieldDescriptorLite0, object3);
    }

    public static Builder L() {
        return new Builder(null);
    }

    public static FieldSet M() {
        return new FieldSet();
    }

    // 去混淆评级： 低(20)
    public static Object N(CodedInputStream codedInputStream0, FieldType wireFormat$FieldType0, boolean z) throws IOException {
        return z ? WireFormat.d(codedInputStream0, wireFormat$FieldType0, Utf8Validation.b) : WireFormat.d(codedInputStream0, wireFormat$FieldType0, Utf8Validation.a);
    }

    public void O(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            for(Object object1: arrayList0) {
                this.Q(fieldSet$FieldDescriptorLite0.getLiteType(), object1);
            }
            object0 = arrayList0;
        }
        else {
            this.Q(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
        }
        if(object0 instanceof LazyField) {
            this.c = true;
        }
        this.a.w(fieldSet$FieldDescriptorLite0, object0);
    }

    public void P(FieldDescriptorLite fieldSet$FieldDescriptorLite0, int v, Object object0) {
        if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object object1 = this.u(fieldSet$FieldDescriptorLite0);
        if(object1 == null) {
            throw new IndexOutOfBoundsException();
        }
        this.Q(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
        ((List)object1).set(v, object0);
    }

    private void Q(FieldType wireFormat$FieldType0, Object object0) {
        if(!FieldSet.G(wireFormat$FieldType0, object0)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void R(CodedOutputStream codedOutputStream0, FieldType wireFormat$FieldType0, int v, Object object0) throws IOException {
        if(wireFormat$FieldType0 == FieldType.l) {
            codedOutputStream0.S0(v, ((MessageLite)object0));
            return;
        }
        codedOutputStream0.t1(v, FieldSet.A(wireFormat$FieldType0, false));
        FieldSet.S(codedOutputStream0, wireFormat$FieldType0, object0);
    }

    static void S(CodedOutputStream codedOutputStream0, FieldType wireFormat$FieldType0, Object object0) throws IOException {
        switch(wireFormat$FieldType0) {
            case 1: {
                codedOutputStream0.N0(((double)(((Double)object0))));
                return;
            }
            case 2: {
                codedOutputStream0.R0(((float)(((Float)object0))));
                return;
            }
            case 3: {
                codedOutputStream0.X0(((long)(((Long)object0))));
                return;
            }
            case 4: {
                codedOutputStream0.v1(((long)(((Long)object0))));
                return;
            }
            case 5: {
                codedOutputStream0.W0(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                codedOutputStream0.Q0(((long)(((Long)object0))));
                return;
            }
            case 7: {
                codedOutputStream0.P0(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                codedOutputStream0.G0(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                codedOutputStream0.U0(((MessageLite)object0));
                return;
            }
            case 10: {
                codedOutputStream0.a1(((MessageLite)object0));
                return;
            }
            case 11: {
                if(object0 instanceof ByteString) {
                    codedOutputStream0.M0(((ByteString)object0));
                    return;
                }
                codedOutputStream0.s1(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof ByteString) {
                    codedOutputStream0.M0(((ByteString)object0));
                    return;
                }
                codedOutputStream0.J0(((byte[])object0));
                return;
            }
            case 13: {
                codedOutputStream0.u1(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                codedOutputStream0.o1(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                codedOutputStream0.p1(((long)(((Long)object0))));
                return;
            }
            case 16: {
                codedOutputStream0.q1(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                codedOutputStream0.r1(((long)(((Long)object0))));
                return;
            }
            case 18: {
                if(object0 instanceof EnumLite) {
                    codedOutputStream0.O0(((EnumLite)object0).getNumber());
                    return;
                }
                codedOutputStream0.O0(((int)(((Integer)object0))));
            }
        }
    }

    public static void T(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0, CodedOutputStream codedOutputStream0) throws IOException {
        FieldType wireFormat$FieldType0 = fieldSet$FieldDescriptorLite0.getLiteType();
        int v = fieldSet$FieldDescriptorLite0.getNumber();
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(fieldSet$FieldDescriptorLite0.isPacked()) {
                codedOutputStream0.t1(v, 2);
                int v1 = 0;
                for(Object object1: ((List)object0)) {
                    v1 += FieldSet.p(wireFormat$FieldType0, object1);
                }
                codedOutputStream0.m1(v1);
                for(Object object2: ((List)object0)) {
                    FieldSet.S(codedOutputStream0, wireFormat$FieldType0, object2);
                }
                return;
            }
            for(Object object3: ((List)object0)) {
                FieldSet.R(codedOutputStream0, wireFormat$FieldType0, v, object3);
            }
            return;
        }
        if(object0 instanceof LazyField) {
            FieldSet.R(codedOutputStream0, wireFormat$FieldType0, v, ((LazyField)object0).p());
            return;
        }
        FieldSet.R(codedOutputStream0, wireFormat$FieldType0, v, object0);
    }

    public void U(CodedOutputStream codedOutputStream0) throws IOException {
        for(int v = 0; v < this.a.l(); ++v) {
            this.V(this.a.j(v), codedOutputStream0);
        }
        for(Object object0: this.a.o()) {
            this.V(((Map.Entry)object0), codedOutputStream0);
        }
    }

    private void V(Map.Entry map$Entry0, CodedOutputStream codedOutputStream0) throws IOException {
        FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.j && !fieldSet$FieldDescriptorLite0.isRepeated() && !fieldSet$FieldDescriptorLite0.isPacked()) {
            MessageLite messageLite0 = map$Entry0.getValue();
            if(messageLite0 instanceof LazyField) {
                messageLite0 = ((LazyField)messageLite0).p();
            }
            codedOutputStream0.c1(((FieldDescriptorLite)map$Entry0.getKey()).getNumber(), messageLite0);
            return;
        }
        FieldSet.T(fieldSet$FieldDescriptorLite0, map$Entry0.getValue(), codedOutputStream0);
    }

    public void W(CodedOutputStream codedOutputStream0) throws IOException {
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            FieldSet.T(((FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue(), codedOutputStream0);
        }
        for(Object object0: this.a.o()) {
            FieldSet.T(((FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue(), codedOutputStream0);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.k();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FieldSet ? this.a.equals(((FieldSet)object0).a) : false;
    }

    public void h(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        List list0;
        if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.Q(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
        Object object1 = this.u(fieldSet$FieldDescriptorLite0);
        if(object1 == null) {
            list0 = new ArrayList();
            this.a.w(fieldSet$FieldDescriptorLite0, list0);
        }
        else {
            list0 = (List)object1;
        }
        list0.add(object0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public void i() {
        this.a.clear();
        this.c = false;
    }

    public void j(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
        this.a.remove(fieldSet$FieldDescriptorLite0);
        if(this.a.isEmpty()) {
            this.c = false;
        }
    }

    public FieldSet k() {
        FieldSet fieldSet0 = FieldSet.M();
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            fieldSet0.O(((FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.a.o()) {
            fieldSet0.O(((FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        fieldSet0.c = this.c;
        return fieldSet0;
    }

    private static SmallSortedMap l(SmallSortedMap smallSortedMap0, boolean z) {
        SmallSortedMap smallSortedMap1 = SmallSortedMap.u(16);
        for(int v = 0; v < smallSortedMap0.l(); ++v) {
            FieldSet.m(smallSortedMap1, smallSortedMap0.j(v), z);
        }
        for(Object object0: smallSortedMap0.o()) {
            FieldSet.m(smallSortedMap1, ((Map.Entry)object0), z);
        }
        return smallSortedMap1;
    }

    private static void m(Map map0, Map.Entry map$Entry0, boolean z) {
        FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(object0 instanceof LazyField) {
            map0.put(fieldSet$FieldDescriptorLite0, ((LazyField)object0).p());
            return;
        }
        if(z && object0 instanceof List) {
            map0.put(fieldSet$FieldDescriptorLite0, new ArrayList(((List)object0)));
            return;
        }
        map0.put(fieldSet$FieldDescriptorLite0, object0);
    }

    private static Object n(Object object0) {
        if(object0 instanceof byte[]) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    static int o(FieldType wireFormat$FieldType0, int v, Object object0) {
        return (wireFormat$FieldType0 == FieldType.l ? CodedOutputStream.k0(v) * 2 : CodedOutputStream.k0(v)) + FieldSet.p(wireFormat$FieldType0, object0);
    }

    static int p(FieldType wireFormat$FieldType0, Object object0) {
        switch(wireFormat$FieldType0) {
            case 1: {
                return CodedOutputStream.w(((double)(((Double)object0))));
            }
            case 2: {
                return CodedOutputStream.E(((float)(((Float)object0))));
            }
            case 3: {
                return CodedOutputStream.M(((long)(((Long)object0))));
            }
            case 4: {
                return CodedOutputStream.o0(((long)(((Long)object0))));
            }
            case 5: {
                return CodedOutputStream.K(((int)(((Integer)object0))));
            }
            case 6: {
                return CodedOutputStream.C(((long)(((Long)object0))));
            }
            case 7: {
                return CodedOutputStream.A(((int)(((Integer)object0))));
            }
            case 8: {
                return CodedOutputStream.o(((Boolean)object0).booleanValue());
            }
            case 9: {
                return CodedOutputStream.H(((MessageLite)object0));
            }
            case 10: {
                return object0 instanceof LazyField ? CodedOutputStream.P(((LazyField)object0)) : CodedOutputStream.U(((MessageLite)object0));
            }
            case 11: {
                return object0 instanceof ByteString ? CodedOutputStream.u(((ByteString)object0)) : CodedOutputStream.j0(((String)object0));
            }
            case 12: {
                return object0 instanceof ByteString ? CodedOutputStream.u(((ByteString)object0)) : CodedOutputStream.q(((byte[])object0));
            }
            case 13: {
                return CodedOutputStream.m0(((int)(((Integer)object0))));
            }
            case 14: {
                return CodedOutputStream.b0(((int)(((Integer)object0))));
            }
            case 15: {
                return CodedOutputStream.d0(((long)(((Long)object0))));
            }
            case 16: {
                return CodedOutputStream.f0(((int)(((Integer)object0))));
            }
            case 17: {
                return CodedOutputStream.h0(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof EnumLite ? CodedOutputStream.y(((EnumLite)object0).getNumber()) : CodedOutputStream.y(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public static int q(FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        int v = 0;
        FieldType wireFormat$FieldType0 = fieldSet$FieldDescriptorLite0.getLiteType();
        int v1 = fieldSet$FieldDescriptorLite0.getNumber();
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(fieldSet$FieldDescriptorLite0.isPacked()) {
                for(Object object1: ((List)object0)) {
                    v += FieldSet.p(wireFormat$FieldType0, object1);
                }
                return CodedOutputStream.k0(v1) + v + CodedOutputStream.Y(v);
            }
            for(Object object2: ((List)object0)) {
                v += FieldSet.o(wireFormat$FieldType0, v1, object2);
            }
            return v;
        }
        return FieldSet.o(wireFormat$FieldType0, v1, object0);
    }

    Iterator r() {
        return this.c ? new LazyIterator(this.a.h().iterator()) : this.a.h().iterator();
    }

    public static FieldSet s() {
        return FieldSet.e;
    }

    public Map t() {
        if(this.c) {
            Map map0 = FieldSet.l(this.a, false);
            if(this.a.s()) {
                ((SmallSortedMap)map0).t();
            }
            return map0;
        }
        return this.a.s() ? this.a : DesugarCollections.unmodifiableMap(this.a);
    }

    public Object u(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
        MessageLite messageLite0 = this.a.get(fieldSet$FieldDescriptorLite0);
        return messageLite0 instanceof LazyField ? ((LazyField)messageLite0).p() : messageLite0;
    }

    public int v() {
        int v1 = 0;
        for(int v = 0; v < this.a.l(); ++v) {
            v1 += this.w(this.a.j(v));
        }
        for(Object object0: this.a.o()) {
            v1 += this.w(((Map.Entry)object0));
        }
        return v1;
    }

    private int w(Map.Entry map$Entry0) {
        FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldDescriptorLite)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.j && !fieldSet$FieldDescriptorLite0.isRepeated() && !fieldSet$FieldDescriptorLite0.isPacked()) {
            return object0 instanceof LazyField ? CodedOutputStream.N(((FieldDescriptorLite)map$Entry0.getKey()).getNumber(), ((LazyField)object0)) : CodedOutputStream.R(((FieldDescriptorLite)map$Entry0.getKey()).getNumber(), ((MessageLite)object0));
        }
        return FieldSet.q(fieldSet$FieldDescriptorLite0, object0);
    }

    public Object x(FieldDescriptorLite fieldSet$FieldDescriptorLite0, int v) {
        if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object object0 = this.u(fieldSet$FieldDescriptorLite0);
        if(object0 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List)object0).get(v);
    }

    public int y(FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
        if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object object0 = this.u(fieldSet$FieldDescriptorLite0);
        return object0 == null ? 0 : ((List)object0).size();
    }

    public int z() {
        int v1 = 0;
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            v1 += FieldSet.q(((FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.a.o()) {
            v1 += FieldSet.q(((FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return v1;
    }
}

