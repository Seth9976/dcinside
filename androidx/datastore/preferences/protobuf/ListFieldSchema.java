package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class ListFieldSchema {
    static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class c;

        static {
            ListFieldSchemaFull.c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();
        }

        private ListFieldSchemaFull() {
            super(null);
        }

        ListFieldSchemaFull(androidx.datastore.preferences.protobuf.ListFieldSchema.1 listFieldSchema$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.ListFieldSchema
        void c(Object object0, long v) {
            List list1;
            List list0 = (List)UnsafeUtil.O(object0, v);
            if(list0 instanceof LazyStringList) {
                list1 = ((LazyStringList)list0).getUnmodifiableView();
            }
            else {
                Class class0 = list0.getClass();
                if(ListFieldSchemaFull.c.isAssignableFrom(class0)) {
                    return;
                }
                if(list0 instanceof PrimitiveNonBoxingCollection && list0 instanceof ProtobufList) {
                    if(((ProtobufList)list0).isModifiable()) {
                        ((ProtobufList)list0).makeImmutable();
                    }
                    return;
                }
                list1 = DesugarCollections.unmodifiableList(list0);
            }
            UnsafeUtil.q0(object0, v, list1);
        }

        @Override  // androidx.datastore.preferences.protobuf.ListFieldSchema
        void d(Object object0, Object object1, long v) {
            List list0 = ListFieldSchemaFull.f(object1, v);
            List list1 = ListFieldSchemaFull.g(object0, v, list0.size());
            int v1 = list1.size();
            if(v1 > 0 && list0.size() > 0) {
                list1.addAll(list0);
            }
            if(v1 > 0) {
                list0 = list1;
            }
            UnsafeUtil.q0(object0, v, list0);
        }

        @Override  // androidx.datastore.preferences.protobuf.ListFieldSchema
        List e(Object object0, long v) {
            return ListFieldSchemaFull.g(object0, v, 10);
        }

        static List f(Object object0, long v) {
            return (List)UnsafeUtil.O(object0, v);
        }

        private static List g(Object object0, long v, int v1) {
            ArrayList arrayList0;
            List list0 = ListFieldSchemaFull.f(object0, v);
            if(list0.isEmpty()) {
                if(list0 instanceof LazyStringList) {
                    list0 = new LazyStringArrayList(v1);
                }
                else if(!(list0 instanceof PrimitiveNonBoxingCollection) || !(list0 instanceof ProtobufList)) {
                    list0 = new ArrayList(v1);
                }
                else {
                    list0 = ((ProtobufList)list0).mutableCopyWithCapacity(v1);
                }
                UnsafeUtil.q0(object0, v, list0);
                return list0;
            }
            Class class0 = list0.getClass();
            if(ListFieldSchemaFull.c.isAssignableFrom(class0)) {
                arrayList0 = new ArrayList(list0.size() + v1);
                arrayList0.addAll(list0);
                UnsafeUtil.q0(object0, v, arrayList0);
                return arrayList0;
            }
            if(list0 instanceof UnmodifiableLazyStringList) {
                arrayList0 = new LazyStringArrayList(list0.size() + v1);
                ((LazyStringArrayList)arrayList0).addAll(((UnmodifiableLazyStringList)list0));
                UnsafeUtil.q0(object0, v, arrayList0);
                return arrayList0;
            }
            if(list0 instanceof PrimitiveNonBoxingCollection && list0 instanceof ProtobufList && !((ProtobufList)list0).isModifiable()) {
                list0 = ((ProtobufList)list0).mutableCopyWithCapacity(list0.size() + v1);
                UnsafeUtil.q0(object0, v, list0);
            }
            return list0;
        }
    }

    static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super(null);
        }

        ListFieldSchemaLite(androidx.datastore.preferences.protobuf.ListFieldSchema.1 listFieldSchema$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.ListFieldSchema
        void c(Object object0, long v) {
            ListFieldSchemaLite.f(object0, v).makeImmutable();
        }

        @Override  // androidx.datastore.preferences.protobuf.ListFieldSchema
        void d(Object object0, Object object1, long v) {
            ProtobufList internal$ProtobufList0 = ListFieldSchemaLite.f(object0, v);
            ProtobufList internal$ProtobufList1 = ListFieldSchemaLite.f(object1, v);
            int v1 = internal$ProtobufList0.size();
            int v2 = internal$ProtobufList1.size();
            if(v1 > 0 && v2 > 0) {
                if(!internal$ProtobufList0.isModifiable()) {
                    internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity(v2 + v1);
                }
                internal$ProtobufList0.addAll(internal$ProtobufList1);
            }
            if(v1 > 0) {
                internal$ProtobufList1 = internal$ProtobufList0;
            }
            UnsafeUtil.q0(object0, v, internal$ProtobufList1);
        }

        @Override  // androidx.datastore.preferences.protobuf.ListFieldSchema
        List e(Object object0, long v) {
            List list0 = ListFieldSchemaLite.f(object0, v);
            if(!((ProtobufList)list0).isModifiable()) {
                int v1 = list0.size();
                list0 = ((ProtobufList)list0).mutableCopyWithCapacity((v1 == 0 ? 10 : v1 * 2));
                UnsafeUtil.q0(object0, v, list0);
            }
            return list0;
        }

        static ProtobufList f(Object object0, long v) {
            return (ProtobufList)UnsafeUtil.O(object0, v);
        }
    }

    private static final ListFieldSchema a;
    private static final ListFieldSchema b;

    static {
        ListFieldSchema.a = new ListFieldSchemaFull(null);
        ListFieldSchema.b = new ListFieldSchemaLite(null);
    }

    private ListFieldSchema() {
    }

    ListFieldSchema(androidx.datastore.preferences.protobuf.ListFieldSchema.1 listFieldSchema$10) {
    }

    static ListFieldSchema a() {
        return ListFieldSchema.a;
    }

    static ListFieldSchema b() {
        return ListFieldSchema.b;
    }

    abstract void c(Object arg1, long arg2);

    abstract void d(Object arg1, Object arg2, long arg3);

    abstract List e(Object arg1, long arg2);

    class androidx.datastore.preferences.protobuf.ListFieldSchema.1 {
    }

}

