package androidx.compose.runtime.snapshots;

import B3.e;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import y4.l;
import z3.i;

@Stable
@s0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n153#1:458\n189#1,6:460\n195#1:467\n153#1:468\n196#1,10:470\n149#1:480\n206#1,5:486\n214#1,6:494\n185#1,10:500\n195#1:511\n153#1:512\n196#1,10:514\n149#1:524\n206#1,5:530\n214#1,6:538\n186#1:544\n189#1,6:545\n195#1:552\n153#1:553\n196#1,10:555\n149#1:565\n206#1,5:571\n214#1,6:579\n149#1:586\n189#1,6:596\n195#1:603\n153#1:604\n196#1,10:606\n149#1:616\n206#1,5:622\n214#1,6:630\n189#1,6:636\n195#1:643\n153#1:644\n196#1,10:646\n149#1:656\n206#1,5:662\n214#1,6:670\n185#1,10:677\n195#1:688\n153#1:689\n196#1,10:691\n149#1:701\n206#1,5:707\n214#1,6:715\n186#1:721\n185#1,10:722\n195#1:733\n153#1:734\n196#1,10:736\n149#1:746\n206#1,5:752\n214#1,6:760\n186#1:766\n159#1,4:767\n163#1:772\n153#1:773\n164#1,8:775\n149#1:783\n172#1,5:789\n179#1,3:797\n159#1,4:800\n163#1:805\n153#1:806\n164#1,8:808\n149#1:816\n172#1,5:822\n179#1,3:830\n153#1:833\n159#1,4:845\n163#1:850\n153#1:851\n164#1,8:853\n149#1:861\n172#1,5:867\n179#1,3:875\n153#1:879\n149#1:882\n189#1,6:892\n195#1:899\n153#1:900\n196#1,10:902\n149#1:912\n206#1,5:918\n214#1,6:926\n153#1:933\n149#1:936\n2180#2:459\n2180#2:469\n2073#2,2:481\n1686#2:483\n2075#2,2:484\n2077#2,3:491\n2180#2:513\n2073#2,2:525\n1686#2:527\n2075#2,2:528\n2077#2,3:535\n2180#2:554\n2073#2,2:566\n1686#2:568\n2075#2,2:569\n2077#2,3:576\n2073#2,2:587\n1686#2:589\n2075#2,5:591\n2180#2:605\n2073#2,2:617\n1686#2:619\n2075#2,2:620\n2077#2,3:627\n2180#2:645\n2073#2,2:657\n1686#2:659\n2075#2,2:660\n2077#2,3:667\n2180#2:690\n2073#2,2:702\n1686#2:704\n2075#2,2:705\n2077#2,3:712\n2180#2:735\n2073#2,2:747\n1686#2:749\n2075#2,2:750\n2077#2,3:757\n2180#2:774\n2073#2,2:784\n1686#2:786\n2075#2,2:787\n2077#2,3:794\n2180#2:807\n2073#2,2:817\n1686#2:819\n2075#2,2:820\n2077#2,3:827\n2180#2:834\n2073#2,2:835\n1686#2:837\n2075#2,5:839\n2180#2:844\n2180#2:852\n2073#2,2:862\n1686#2:864\n2075#2,2:865\n2077#2,3:872\n2180#2:880\n2073#2,2:883\n1686#2:885\n2075#2,5:887\n2180#2:901\n2073#2,2:913\n1686#2:915\n2075#2,2:916\n2077#2,3:923\n2180#2:934\n2073#2,2:937\n1686#2:939\n2075#2,5:941\n70#3:466\n70#3:510\n70#3:551\n70#3:585\n70#3:590\n70#3:602\n70#3:642\n70#3:687\n70#3:732\n70#3:771\n70#3:804\n70#3:838\n70#3:849\n70#3:878\n70#3:881\n70#3:886\n70#3:898\n70#3:932\n70#3:935\n70#3:940\n1#4:676\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:458\n101#1:460,6\n101#1:467\n101#1:468\n101#1:470,10\n101#1:480\n101#1:486,5\n101#1:494,6\n102#1:500,10\n102#1:511\n102#1:512\n102#1:514,10\n102#1:524\n102#1:530,5\n102#1:538,6\n102#1:544\n107#1:545,6\n107#1:552\n107#1:553\n107#1:555,10\n107#1:565\n107#1:571,5\n107#1:579,6\n110#1:586\n116#1:596,6\n116#1:603\n116#1:604\n116#1:606,10\n116#1:616\n116#1:622,5\n116#1:630,6\n117#1:636,6\n117#1:643\n117#1:644\n117#1:646,10\n117#1:656\n117#1:662,5\n117#1:670,6\n118#1:677,10\n118#1:688\n118#1:689\n118#1:691,10\n118#1:701\n118#1:707,5\n118#1:715,6\n118#1:721\n121#1:722,10\n121#1:733\n121#1:734\n121#1:736,10\n121#1:746\n121#1:752,5\n121#1:760,6\n121#1:766\n125#1:767,4\n125#1:772\n125#1:773\n125#1:775,8\n125#1:783\n125#1:789,5\n125#1:797,3\n132#1:800,4\n132#1:805\n132#1:806\n132#1:808,8\n132#1:816\n132#1:822,5\n132#1:830,3\n145#1:833\n155#1:845,4\n155#1:850\n155#1:851\n155#1:853,8\n155#1:861\n155#1:867,5\n155#1:875,3\n163#1:879\n171#1:882\n185#1:892,6\n185#1:899\n185#1:900\n185#1:902,10\n185#1:912\n185#1:918,5\n185#1:926,6\n195#1:933\n205#1:936\n62#1:459\n101#1:469\n101#1:481,2\n101#1:483\n101#1:484,2\n101#1:491,3\n102#1:513\n102#1:525,2\n102#1:527\n102#1:528,2\n102#1:535,3\n107#1:554\n107#1:566,2\n107#1:568\n107#1:569,2\n107#1:576,3\n110#1:587,2\n110#1:589\n110#1:591,5\n116#1:605\n116#1:617,2\n116#1:619\n116#1:620,2\n116#1:627,3\n117#1:645\n117#1:657,2\n117#1:659\n117#1:660,2\n117#1:667,3\n118#1:690\n118#1:702,2\n118#1:704\n118#1:705,2\n118#1:712,3\n121#1:735\n121#1:747,2\n121#1:749\n121#1:750,2\n121#1:757,3\n125#1:774\n125#1:784,2\n125#1:786\n125#1:787,2\n125#1:794,3\n132#1:807\n132#1:817,2\n132#1:819\n132#1:820,2\n132#1:827,3\n145#1:834\n149#1:835,2\n149#1:837\n149#1:839,5\n153#1:844\n155#1:852\n155#1:862,2\n155#1:864\n155#1:865,2\n155#1:872,3\n163#1:880\n171#1:883,2\n171#1:885\n171#1:887,5\n185#1:901\n185#1:913,2\n185#1:915\n185#1:916,2\n185#1:923,3\n195#1:934\n205#1:937,2\n205#1:939\n205#1:941,5\n101#1:466\n102#1:510\n107#1:551\n109#1:585\n110#1:590\n116#1:602\n117#1:642\n118#1:687\n121#1:732\n125#1:771\n132#1:804\n149#1:838\n155#1:849\n162#1:878\n170#1:881\n171#1:886\n185#1:898\n194#1:932\n204#1:935\n205#1:940\n*E\n"})
public final class SnapshotStateList implements e, StateObject, List {
    @s0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,457:1\n70#2:458\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n76#1:458\n*E\n"})
    public static final class StateListStateRecord extends StateRecord {
        @l
        private PersistentList d;
        private int e;

        public StateListStateRecord(@l PersistentList persistentList0) {
            L.p(persistentList0, "list");
            super();
            this.d = persistentList0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void a(@l StateRecord stateRecord0) {
            L.p(stateRecord0, "value");
            synchronized(SnapshotStateListKt.a) {
                this.d = ((StateListStateRecord)stateRecord0).d;
                this.e = ((StateListStateRecord)stateRecord0).e;
            }
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord b() {
            return new StateListStateRecord(this.d);
        }

        @l
        public final PersistentList g() {
            return this.d;
        }

        public final int h() {
            return this.e;
        }

        public final void i(@l PersistentList persistentList0) {
            L.p(persistentList0, "<set-?>");
            this.d = persistentList0;
        }

        public final void j(int v) {
            this.e = v;
        }
    }

    @l
    private StateRecord a;
    public static final int b;

    static {
    }

    public SnapshotStateList() {
        this.a = new StateListStateRecord(ExtensionsKt.G());
    }

    private final boolean a(Function1 function10) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = (PersistentList)function10.invoke(persistentList0);
            boolean z = false;
            if(L.g(persistentList1, persistentList0)) {
                return false;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
        while(!z);
        return true;
    }

    @Override
    public void add(int v, Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v2 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.add(v, object0);
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v2) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
        while(!z);
    }

    @Override
    public boolean add(Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.add(object0);
            boolean z = false;
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(int v, @l Collection collection0) {
        L.p(collection0, "elements");
        return this.o(new Function1(collection0) {
            final int e;
            final Collection f;

            {
                this.e = v;
                this.f = collection0;
                super(1);
            }

            @l
            public final Boolean a(@l List list0) {
                L.p(list0, "it");
                return Boolean.valueOf(list0.addAll(this.e, this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        });
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        L.p(collection0, "elements");
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.addAll(collection0);
            boolean z = false;
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return true;
            }
        }
        return false;
    }

    @l
    @i(name = "getDebuggerDisplayValue")
    public final List b() {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0))).g();
    }

    public static void c() {
    }

    @Override
    public void clear() {
        Snapshot snapshot0;
        synchronized(SnapshotStateListKt.a) {
            StateRecord stateRecord0 = this.h();
            L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)stateRecord0;
            synchronized(SnapshotKt.E()) {
                snapshot0 = Snapshot.e.b();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(snapshotStateList$StateListStateRecord0, this, snapshot0);
                snapshotStateList$StateListStateRecord1.i(ExtensionsKt.G());
                snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
            }
            SnapshotKt.O(snapshot0, this);
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.j().g().contains(object0);
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.j().g().containsAll(collection0);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void d(@l StateRecord stateRecord0) {
        L.p(stateRecord0, "value");
        stateRecord0.e(this.h());
        this.a = (StateListStateRecord)stateRecord0;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord g(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        return a.a(this, stateRecord0, stateRecord1, stateRecord2);
    }

    @Override
    public Object get(int v) {
        return this.j().g().get(v);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord h() {
        return this.a;
    }

    public final int i() {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0))).h();
    }

    @Override
    public int indexOf(Object object0) {
        return this.j().g().indexOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.j().g().isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.listIterator();
    }

    @l
    public final StateListStateRecord j() {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord)SnapshotKt.V(((StateListStateRecord)stateRecord0), this);
    }

    public static void k() {
    }

    public int l() {
        return this.j().g().size();
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.j().g().lastIndexOf(object0);
    }

    @Override
    @l
    public ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        return new StateListIterator(this, v);
    }

    private final Object m(Function1 function10) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object1;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            object1 = function10.invoke(persistentList$Builder0);
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return object1;
            }
        }
        return object1;
    }

    private final boolean o(Function1 function10) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object1;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            object1 = function10.invoke(persistentList$Builder0);
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return ((Boolean)object1).booleanValue();
            }
        }
        return ((Boolean)object1).booleanValue();
    }

    public Object p(int v) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object0 = this.get(v);
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v2 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.o2(v);
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v2) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
        while(!z);
        return object0;
    }

    public final void q(int v, int v1) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v3 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            persistentList$Builder0.subList(v, v1).clear();
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v3) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return;
            }
        }
    }

    public final int r(@l Collection collection0, int v, int v1) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        L.p(collection0, "elements");
        int v2 = this.size();
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v4 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            persistentList$Builder0.subList(v, v1).retainAll(collection0);
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v4) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return v2 - this.size();
            }
        }
        return v2 - this.size();
    }

    @Override
    public final Object remove(int v) {
        return this.p(v);
    }

    @Override
    public boolean remove(Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.remove(object0);
            boolean z = false;
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        L.p(collection0, "elements");
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.removeAll(collection0);
            boolean z = false;
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.o(new Function1() {
            final Collection e;

            {
                this.e = collection0;
                super(1);
            }

            @l
            public final Boolean a(@l List list0) {
                L.p(list0, "it");
                return Boolean.valueOf(list0.retainAll(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        });
    }

    @Override
    public Object set(int v, Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object1 = this.get(v);
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v2 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = persistentList0.set(v, object0);
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v2) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
        while(!z);
        return object1;
    }

    @Override
    public final int size() {
        return this.l();
    }

    @Override
    @l
    public List subList(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new SubList(this, v, v1);
    }

    @l
    public final List t() {
        return this.j().g();
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }

    private final void u(Function1 function10) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.B(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.h();
                persistentList0 = snapshotStateList$StateListStateRecord0.g();
            }
            L.m(persistentList0);
            PersistentList persistentList1 = (PersistentList)function10.invoke(persistentList0);
            if(L.g(persistentList1, persistentList0)) {
                break;
            }
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.k0(((StateListStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateList$StateListStateRecord1.h() == v1) {
                        snapshotStateList$StateListStateRecord1.i(persistentList1);
                        snapshotStateList$StateListStateRecord1.j(snapshotStateList$StateListStateRecord1.h() + 1);
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
        while(!z);
    }

    private final Object v(Function1 function10) {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return function10.invoke(SnapshotKt.B(((StateListStateRecord)stateRecord0)));
    }

    private final Object x(Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized(SnapshotKt.E()) {
            snapshot0 = Snapshot.e.b();
            object1 = function10.invoke(SnapshotKt.k0(((StateListStateRecord)stateRecord0), this, snapshot0));
        }
        SnapshotKt.O(snapshot0, this);
        return object1;
    }
}

