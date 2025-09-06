package kotlin.collections.unsigned;

import A3.o;
import A3.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.A0;
import kotlin.D0;
import kotlin.E0;
import kotlin.H0;
import kotlin.I0;
import kotlin.N0;
import kotlin.O0;
import kotlin.U;
import kotlin.W0;
import kotlin.c0;
import kotlin.collections.Q;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.r0;
import kotlin.ranges.s;
import kotlin.t;
import kotlin.y0;
import kotlin.z0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10734:1\n3792#1:10784\n3800#1:10785\n3808#1:10786\n3816#1:10787\n3792#1:10788\n3800#1:10789\n3808#1:10790\n3816#1:10791\n3792#1:10792\n3800#1:10793\n3808#1:10794\n3816#1:10795\n3792#1:10852\n3800#1:10853\n3808#1:10854\n3816#1:10855\n3792#1:10856\n3800#1:10857\n3808#1:10858\n3816#1:10859\n3792#1:10860\n3800#1:10861\n3808#1:10862\n3816#1:10863\n3792#1:10864\n3800#1:10865\n3808#1:10866\n3816#1:10867\n3792#1:10868\n3800#1:10869\n3808#1:10870\n3816#1:10871\n3792#1:10872\n3800#1:10873\n3808#1:10874\n3816#1:10875\n3792#1:10876\n3800#1:10877\n3808#1:10878\n3816#1:10879\n3792#1:10880\n3800#1:10881\n3808#1:10882\n3816#1:10883\n3792#1:10884\n3800#1:10885\n3808#1:10886\n3816#1:10887\n3792#1:10888\n3800#1:10889\n3808#1:10890\n3816#1:10891\n3792#1:10892\n3800#1:10893\n3808#1:10894\n3816#1:10895\n3792#1:10896\n3800#1:10897\n3808#1:10898\n3816#1:10899\n3792#1:10900\n3800#1:10901\n3808#1:10902\n3816#1:10903\n3792#1:10904\n3800#1:10905\n3808#1:10906\n3816#1:10907\n3792#1:10908\n3800#1:10909\n3808#1:10910\n3816#1:10911\n3792#1:10912\n3800#1:10913\n3808#1:10914\n3816#1:10915\n3792#1:10916\n3800#1:10917\n3808#1:10918\n3816#1:10919\n3792#1:10920\n3800#1:10921\n3808#1:10922\n3816#1:10923\n3792#1:10924\n3800#1:10925\n3808#1:10926\n3816#1:10927\n3792#1:10928\n3800#1:10929\n3808#1:10930\n3816#1:10931\n3792#1:10932\n3800#1:10933\n3808#1:10934\n3816#1:10935\n3792#1:10936\n3800#1:10937\n3808#1:10938\n3816#1:10939\n3792#1:10940\n3800#1:10941\n3808#1:10942\n3816#1:10943\n3792#1:10944\n3800#1:10945\n3808#1:10946\n3816#1:10947\n3792#1:10948\n3800#1:10949\n3808#1:10950\n3816#1:10951\n3792#1:10952\n3800#1:10953\n3808#1:10954\n3816#1:10955\n3792#1:10956\n3800#1:10957\n3808#1:10958\n3816#1:10959\n3792#1:10960\n3800#1:10961\n3808#1:10962\n3816#1:10963\n3792#1:10964\n3800#1:10965\n3808#1:10966\n3816#1:10967\n3792#1:10968\n3800#1:10969\n3808#1:10970\n3816#1:10971\n3792#1:10972\n3800#1:10973\n3808#1:10974\n3816#1:10975\n3792#1:10976\n3800#1:10977\n3808#1:10978\n3816#1:10979\n3792#1:10980\n3800#1:10981\n3808#1:10982\n3816#1:10983\n3792#1:10984\n3800#1:10985\n3808#1:10986\n3816#1:10987\n3792#1:10988\n3800#1:10989\n3808#1:10990\n3816#1:10991\n3792#1:10992\n3800#1:10993\n3808#1:10994\n3816#1:10995\n3792#1:10996\n3800#1:10997\n3808#1:10998\n3816#1:10999\n3792#1:11000\n3800#1:11001\n3808#1:11002\n3816#1:11003\n1718#2,6:10735\n1730#2,6:10741\n1694#2,6:10747\n1706#2,6:10753\n1826#2,6:10759\n1838#2,6:10765\n1802#2,6:10771\n1814#2,6:10777\n1#3:10783\n381#4,7:10796\n381#4,7:10803\n381#4,7:10810\n381#4,7:10817\n381#4,7:10824\n381#4,7:10831\n381#4,7:10838\n381#4,7:10845\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n1735#1:10784\n1752#1:10785\n1769#1:10786\n1786#1:10787\n2563#1:10788\n2580#1:10789\n2597#1:10790\n2614#1:10791\n2930#1:10792\n2946#1:10793\n2962#1:10794\n2978#1:10795\n5590#1:10852\n5610#1:10853\n5630#1:10854\n5650#1:10855\n5671#1:10856\n5693#1:10857\n5715#1:10858\n5737#1:10859\n5850#1:10860\n5869#1:10861\n5888#1:10862\n5907#1:10863\n5929#1:10864\n5958#1:10865\n5987#1:10866\n6016#1:10867\n6041#1:10868\n6066#1:10869\n6091#1:10870\n6116#1:10871\n6146#1:10872\n6169#1:10873\n6192#1:10874\n6215#1:10875\n6238#1:10876\n6261#1:10877\n6284#1:10878\n6307#1:10879\n6328#1:10880\n6351#1:10881\n6374#1:10882\n6397#1:10883\n6420#1:10884\n6441#1:10885\n6462#1:10886\n6483#1:10887\n6504#1:10888\n6525#1:10889\n6546#1:10890\n6567#1:10891\n6586#1:10892\n6607#1:10893\n6628#1:10894\n6649#1:10895\n6672#1:10896\n6695#1:10897\n6718#1:10898\n6741#1:10899\n6762#1:10900\n6783#1:10901\n6804#1:10902\n6825#1:10903\n6842#1:10904\n6857#1:10905\n6872#1:10906\n6887#1:10907\n6906#1:10908\n6925#1:10909\n6944#1:10910\n6963#1:10911\n6978#1:10912\n6993#1:10913\n7008#1:10914\n7023#1:10915\n7042#1:10916\n7061#1:10917\n7080#1:10918\n7099#1:10919\n7121#1:10920\n7150#1:10921\n7179#1:10922\n7208#1:10923\n7233#1:10924\n7258#1:10925\n7283#1:10926\n7308#1:10927\n7338#1:10928\n7361#1:10929\n7384#1:10930\n7407#1:10931\n7430#1:10932\n7453#1:10933\n7476#1:10934\n7499#1:10935\n7520#1:10936\n7543#1:10937\n7566#1:10938\n7589#1:10939\n7612#1:10940\n7633#1:10941\n7654#1:10942\n7675#1:10943\n7696#1:10944\n7717#1:10945\n7738#1:10946\n7759#1:10947\n7778#1:10948\n7799#1:10949\n7820#1:10950\n7841#1:10951\n7864#1:10952\n7887#1:10953\n7910#1:10954\n7933#1:10955\n7954#1:10956\n7975#1:10957\n7996#1:10958\n8017#1:10959\n8034#1:10960\n8049#1:10961\n8064#1:10962\n8079#1:10963\n8098#1:10964\n8117#1:10965\n8136#1:10966\n8155#1:10967\n8170#1:10968\n8185#1:10969\n8200#1:10970\n8215#1:10971\n8433#1:10972\n8458#1:10973\n8483#1:10974\n8508#1:10975\n8533#1:10976\n8558#1:10977\n8583#1:10978\n8608#1:10979\n8632#1:10980\n8656#1:10981\n8680#1:10982\n8704#1:10983\n8728#1:10984\n8752#1:10985\n8776#1:10986\n8800#1:10987\n8822#1:10988\n8847#1:10989\n8872#1:10990\n8897#1:10991\n8922#1:10992\n8948#1:10993\n8974#1:10994\n9000#1:10995\n9025#1:10996\n9050#1:10997\n9075#1:10998\n9100#1:10999\n9125#1:11000\n9149#1:11001\n9173#1:11002\n9197#1:11003\n841#1:10735,6\n851#1:10741,6\n861#1:10747,6\n871#1:10753,6\n881#1:10759,6\n891#1:10765,6\n901#1:10771,6\n911#1:10777,6\n4808#1:10796,7\n4828#1:10803,7\n4848#1:10810,7\n4868#1:10817,7\n4889#1:10824,7\n4910#1:10831,7\n4931#1:10838,7\n4952#1:10845,7\n*E\n"})
class c extends b {
    @h0(version = "1.3")
    @f
    @t
    private static final long A0(long[] arr_v) {
        L.p(arr_v, "$this$component1");
        return I0.l(arr_v, 0);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int A1(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$count");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(D0.b(E0.l(arr_v, v1)))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection A2(int[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$filterNotTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                collection0.add(D0.b(v2));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object A3(long[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$foldIndexed");
        L.p(p0, "operation");
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            object0 = p0.invoke(v2, object0, H0.b(I0.l(arr_v, v1)));
            ++v1;
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map A4(int[] arr_v, Map map0, Function1 function10, Function1 function11) {
        L.p(arr_v, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            Object object0 = function10.invoke(D0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(D0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection A5(int[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$mapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(D0.b(E0.l(arr_v, v1))));
        }
        return collection0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final N0 A6(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$maxWithOrNull");
        L.p(comparator0, "comparator");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = O0.l(arr_v, v2);
                if(comparator0.compare(N0.b(((short)v)), N0.b(((short)v3))) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.7")
    @t
    @i(name = "minOrThrow-U")
    public static final long A7(@l long[] arr_v) {
        L.p(arr_v, "$this$min");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(androidx.collection.b.a(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 A8(short[] arr_v) {
        L.p(arr_v, "$this$randomOrNull");
        return c.B8(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List A9(int[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$runningFold");
        L.p(o0, "operation");
        if(E0.r(arr_v)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(E0.o(arr_v) + 1);
        ((ArrayList)list0).add(object0);
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, D0.b(E0.l(arr_v, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Aa(@l byte[] arr_b, @l kotlin.ranges.l l0) {
        L.p(arr_b, "$this$slice");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : b.b(A0.d(kotlin.collections.l.f1(arr_b, ((int)l0.q()), ((int)l0.p()) + 1)));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final int Ab(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumBy");
        L.p(function10, "selector");
        int v = E0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = D0.h(v2 + ((D0)function10.invoke(D0.b(E0.l(arr_v, v1)))).l0());
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final H0[] Ac(@l long[] arr_v) {
        L.p(arr_v, "$this$toTypedArray");
        int v = I0.o(arr_v);
        H0[] arr_h0 = new H0[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_h0[v1] = H0.b(I0.l(arr_v, v1));
        }
        return arr_h0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short B0(short[] arr_v) {
        L.p(arr_v, "$this$component1");
        return O0.l(arr_v, 0);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int B1(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$count");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(N0.b(O0.l(arr_v, v1)))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection B2(byte[] arr_b, Collection collection0, Function1 function10) {
        L.p(arr_b, "$this$filterNotTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(!((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                collection0.add(z0.b(((byte)v2)));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object B3(int[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$foldIndexed");
        L.p(p0, "operation");
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            object0 = p0.invoke(v2, object0, D0.b(E0.l(arr_v, v1)));
            ++v1;
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map B4(long[] arr_v, Map map0, Function1 function10, Function1 function11) {
        L.p(arr_v, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            Object object0 = function10.invoke(H0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(H0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection B5(byte[] arr_b, Collection collection0, Function1 function10) {
        L.p(arr_b, "$this$mapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(z0.b(A0.l(arr_b, v1))));
        }
        return collection0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final H0 B6(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$maxWithOrNull");
        L.p(comparator0, "comparator");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(comparator0.compare(H0.b(v), H0.b(v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.7")
    @t
    @i(name = "minOrThrow-U")
    public static final short B7(@l short[] arr_v) {
        L.p(arr_v, "$this$min");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = O0.l(arr_v, v2);
                if(L.t(v & 0xFFFF, 0xFFFF & v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final N0 B8(@l short[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$randomOrNull");
        L.p(f0, "random");
        return O0.r(arr_v) ? null : N0.b(O0.l(arr_v, f0.m(O0.o(arr_v))));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List B9(short[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$runningFold");
        L.p(o0, "operation");
        if(O0.r(arr_v)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(O0.o(arr_v) + 1);
        ((ArrayList)list0).add(object0);
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, N0.b(O0.l(arr_v, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Ba(@l int[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "$this$slice");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : b.a(E0.d(kotlin.collections.l.j1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1)));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final int Bb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumBy");
        L.p(function10, "selector");
        int v = O0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = D0.h(v2 + ((D0)function10.invoke(N0.b(O0.l(arr_v, v1)))).l0());
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final N0[] Bc(@l short[] arr_v) {
        L.p(arr_v, "$this$toTypedArray");
        int v = O0.o(arr_v);
        N0[] arr_n0 = new N0[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_n0[v1] = N0.b(O0.l(arr_v, v1));
        }
        return arr_n0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int C0(int[] arr_v) {
        L.p(arr_v, "$this$component2");
        return E0.l(arr_v, 1);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List C1(@l byte[] arr_b, int v) {
        L.p(arr_b, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.ic(arr_b, s.u(A0.o(arr_b) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection C2(long[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$filterTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                collection0.add(H0.b(v2));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object C3(long[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$foldRight");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.ve(arr_v); v >= 0; --v) {
            object0 = o0.invoke(H0.b(I0.l(arr_v, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map C4(long[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            Object object0 = function10.invoke(H0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(H0.b(v2));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 C5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxByOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 == 0) {
            return z0.b(((byte)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(((byte)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = A0.l(arr_b, v2);
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(((byte)v3)));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxWithOrThrow-U")
    public static final byte C6(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "$this$maxWith");
        L.p(comparator0, "comparator");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = A0.l(arr_b, v1);
                if(comparator0.compare(z0.b(b), z0.b(b1)) < 0) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final z0 C7(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "$this$minWithOrNull");
        L.p(comparator0, "comparator");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = A0.l(arr_b, v2);
                if(comparator0.compare(z0.b(((byte)v)), z0.b(((byte)v3))) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte C8(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$reduce");
        L.p(o0, "operation");
        if(A0.r(arr_b)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                b = ((z0)o0.invoke(z0.b(b), z0.b(A0.l(arr_b, v1)))).j0();
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List C9(byte[] arr_b, Object object0, p p0) {
        L.p(arr_b, "$this$runningFoldIndexed");
        L.p(p0, "operation");
        if(A0.r(arr_b)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(A0.o(arr_b) + 1);
        ((ArrayList)list0).add(object0);
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, z0.b(A0.l(arr_b, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] Ca(@l int[] arr_v, @l Collection collection0) {
        L.p(arr_v, "$this$sliceArray");
        L.p(collection0, "indices");
        return E0.d(kotlin.collections.l.fu(arr_v, collection0));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final double Cb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumByDouble");
        L.p(function10, "selector");
        int v = A0.o(arr_b);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] Cc(byte[] arr_b) {
        L.p(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        return A0.d(arr_b1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte D0(byte[] arr_b) {
        L.p(arr_b, "$this$component2");
        return A0.l(arr_b, 1);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List D1(@l short[] arr_v, int v) {
        L.p(arr_v, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.jc(arr_v, s.u(O0.o(arr_v) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection D2(short[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$filterTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                collection0.add(N0.b(((short)v2)));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object D3(byte[] arr_b, Object object0, o o0) {
        L.p(arr_b, "$this$foldRight");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.qe(arr_b); v >= 0; --v) {
            object0 = o0.invoke(z0.b(A0.l(arr_b, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map D4(short[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            Object object0 = function10.invoke(N0.b(((short)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(N0.b(((short)v2)));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 D5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxByOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return H0.b(v);
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxWithOrThrow-U")
    public static final int D6(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$maxWith");
        L.p(comparator0, "comparator");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(comparator0.compare(D0.b(v), D0.b(v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final D0 D7(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$minWithOrNull");
        L.p(comparator0, "comparator");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(comparator0.compare(D0.b(v), D0.b(v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int D8(int[] arr_v, o o0) {
        L.p(arr_v, "$this$reduce");
        L.p(o0, "operation");
        if(E0.r(arr_v)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((D0)o0.invoke(D0.b(v), D0.b(E0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List D9(short[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$runningFoldIndexed");
        L.p(p0, "operation");
        if(O0.r(arr_v)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(O0.o(arr_v) + 1);
        ((ArrayList)list0).add(object0);
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, N0.b(O0.l(arr_v, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] Da(@l short[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "$this$sliceArray");
        L.p(l0, "indices");
        return O0.d(kotlin.collections.l.mu(arr_v, l0));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final double Db(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumByDouble");
        L.p(function10, "selector");
        int v = I0.o(arr_v);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] Dc(@l z0[] arr_z0) {
        L.p(arr_z0, "<this>");
        byte[] arr_b = new byte[arr_z0.length];
        for(int v = 0; v < arr_z0.length; ++v) {
            arr_b[v] = arr_z0[v].j0();
        }
        return A0.d(arr_b);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long E0(long[] arr_v) {
        L.p(arr_v, "$this$component2");
        return I0.l(arr_v, 1);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List E1(@l int[] arr_v, int v) {
        L.p(arr_v, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.kc(arr_v, s.u(E0.o(arr_v) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection E2(int[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$filterTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                collection0.add(D0.b(v2));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object E3(int[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$foldRight");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.ue(arr_v); v >= 0; --v) {
            object0 = o0.invoke(D0.b(E0.l(arr_v, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map E4(short[] arr_v, Map map0, Function1 function10, Function1 function11) {
        L.p(arr_v, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            Object object0 = function10.invoke(N0.b(((short)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(N0.b(((short)v2))));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 E5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxByOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return D0.b(v);
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxWithOrThrow-U")
    public static final long E6(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$maxWith");
        L.p(comparator0, "comparator");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(comparator0.compare(H0.b(v), H0.b(v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final N0 E7(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$minWithOrNull");
        L.p(comparator0, "comparator");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = O0.l(arr_v, v2);
                if(comparator0.compare(N0.b(((short)v)), N0.b(((short)v3))) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long E8(long[] arr_v, o o0) {
        L.p(arr_v, "$this$reduce");
        L.p(o0, "operation");
        if(I0.r(arr_v)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((H0)o0.invoke(H0.b(v), H0.b(I0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List E9(long[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$runningFoldIndexed");
        L.p(p0, "operation");
        if(I0.r(arr_v)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(I0.o(arr_v) + 1);
        ((ArrayList)list0).add(object0);
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, H0.b(I0.l(arr_v, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] Ea(@l long[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "$this$sliceArray");
        L.p(l0, "indices");
        return I0.d(kotlin.collections.l.iu(arr_v, l0));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final double Eb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumByDouble");
        L.p(function10, "selector");
        int v = E0.o(arr_v);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] Ec(int[] arr_v) {
        L.p(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return E0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short F0(short[] arr_v) {
        L.p(arr_v, "$this$component2");
        return O0.l(arr_v, 1);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List F1(@l long[] arr_v, int v) {
        L.p(arr_v, "$this$drop");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.lc(arr_v, s.u(I0.o(arr_v) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection F2(byte[] arr_b, Collection collection0, Function1 function10) {
        L.p(arr_b, "$this$filterTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                collection0.add(z0.b(((byte)v2)));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object F3(short[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$foldRight");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.xe(arr_v); v >= 0; --v) {
            object0 = o0.invoke(N0.b(O0.l(arr_v, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map F4(byte[] arr_b, Map map0, Function1 function10, Function1 function11) {
        L.p(arr_b, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            Object object0 = function10.invoke(z0.b(((byte)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(z0.b(((byte)v2))));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 F5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxByOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return N0.b(((short)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(((short)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = O0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(((short)v3)));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxWithOrThrow-U")
    public static final short F6(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$maxWith");
        L.p(comparator0, "comparator");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = O0.l(arr_v, v2);
                if(comparator0.compare(N0.b(v), N0.b(v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final H0 F7(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$minWithOrNull");
        L.p(comparator0, "comparator");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(comparator0.compare(H0.b(v), H0.b(v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short F8(short[] arr_v, o o0) {
        L.p(arr_v, "$this$reduce");
        L.p(o0, "operation");
        if(O0.r(arr_v)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((N0)o0.invoke(N0.b(v), N0.b(O0.l(arr_v, v2)))).j0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List F9(int[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$runningFoldIndexed");
        L.p(p0, "operation");
        if(E0.r(arr_v)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(E0.o(arr_v) + 1);
        ((ArrayList)list0).add(object0);
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, D0.b(E0.l(arr_v, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] Fa(@l byte[] arr_b, @l kotlin.ranges.l l0) {
        L.p(arr_b, "$this$sliceArray");
        L.p(l0, "indices");
        return A0.d(kotlin.collections.l.Yt(arr_b, l0));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final double Fb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumByDouble");
        L.p(function10, "selector");
        int v = O0.o(arr_v);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] Fc(@l D0[] arr_d0) {
        L.p(arr_d0, "<this>");
        int[] arr_v = new int[arr_d0.length];
        for(int v = 0; v < arr_d0.length; ++v) {
            arr_v[v] = arr_d0[v].l0();
        }
        return E0.d(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int G0(int[] arr_v) {
        L.p(arr_v, "$this$component3");
        return E0.l(arr_v, 2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List G1(@l byte[] arr_b, int v) {
        L.p(arr_b, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.ec(arr_b, s.u(A0.o(arr_b) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final z0 G2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$find");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                return z0.b(((byte)v2));
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object G3(byte[] arr_b, Object object0, p p0) {
        L.p(arr_b, "$this$foldRightIndexed");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.qe(arr_b); v >= 0; --v) {
            object0 = p0.invoke(v, z0.b(A0.l(arr_b, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int G4(long[] arr_v, long v) {
        L.p(arr_v, "$this$indexOf");
        return kotlin.collections.l.Hf(arr_v, v);
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "maxByOrThrow-U")
    private static final byte G5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxBy");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(v == 0) {
            return b;
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(b));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = A0.l(arr_b, v1);
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(b1));
                if(comparable0.compareTo(comparable1) < 0) {
                    b = b1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 G6(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minByOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 == 0) {
            return z0.b(((byte)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(((byte)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = A0.l(arr_b, v2);
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(((byte)v3)));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.7")
    @t
    @i(name = "minWithOrThrow-U")
    public static final byte G7(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "$this$minWith");
        L.p(comparator0, "comparator");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = A0.l(arr_b, v1);
                if(comparator0.compare(z0.b(b), z0.b(b1)) > 0) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int G8(int[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceIndexed");
        L.p(p0, "operation");
        if(E0.r(arr_v)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((D0)p0.invoke(v2, D0.b(v), D0.b(E0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List G9(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$runningReduce");
        L.p(o0, "operation");
        if(A0.r(arr_b)) {
            return u.H();
        }
        int v = A0.l(arr_b, 0);
        List list0 = new ArrayList(A0.o(arr_b));
        ((ArrayList)list0).add(z0.b(((byte)v)));
        int v1 = A0.o(arr_b);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((z0)o0.invoke(z0.b(((byte)v)), z0.b(A0.l(arr_b, v2)))).j0();
            ((ArrayList)list0).add(z0.b(((byte)v)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] Ga(@l long[] arr_v, @l Collection collection0) {
        L.p(arr_v, "$this$sliceArray");
        L.p(collection0, "indices");
        return I0.d(kotlin.collections.l.hu(arr_v, collection0));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfDouble")
    private static final double Gb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        int v = A0.o(arr_b);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] Gc(long[] arr_v) {
        L.p(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return I0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte H0(byte[] arr_b) {
        L.p(arr_b, "$this$component3");
        return A0.l(arr_b, 2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List H1(@l short[] arr_v, int v) {
        L.p(arr_v, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.fc(arr_v, s.u(O0.o(arr_v) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final H0 H2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$find");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                return H0.b(v2);
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object H3(short[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$foldRightIndexed");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.xe(arr_v); v >= 0; --v) {
            object0 = p0.invoke(v, N0.b(O0.l(arr_v, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int H4(short[] arr_v, short v) {
        L.p(arr_v, "$this$indexOf");
        return kotlin.collections.l.Jf(arr_v, v);
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "maxByOrThrow-U")
    private static final int H5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxBy");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 H6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minByOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return H0.b(v);
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.7")
    @t
    @i(name = "minWithOrThrow-U")
    public static final int H7(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$minWith");
        L.p(comparator0, "comparator");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(comparator0.compare(D0.b(v), D0.b(v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte H8(byte[] arr_b, p p0) {
        L.p(arr_b, "$this$reduceIndexed");
        L.p(p0, "operation");
        if(A0.r(arr_b)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                b = ((z0)p0.invoke(v1, z0.b(b), z0.b(A0.l(arr_b, v1)))).j0();
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List H9(int[] arr_v, o o0) {
        L.p(arr_v, "$this$runningReduce");
        L.p(o0, "operation");
        if(E0.r(arr_v)) {
            return u.H();
        }
        int v = E0.l(arr_v, 0);
        List list0 = new ArrayList(E0.o(arr_v));
        ((ArrayList)list0).add(D0.b(v));
        int v1 = E0.o(arr_v);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((D0)o0.invoke(D0.b(v), D0.b(E0.l(arr_v, v2)))).l0();
            ((ArrayList)list0).add(D0.b(v));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] Ha(@l short[] arr_v, @l Collection collection0) {
        L.p(arr_v, "$this$sliceArray");
        L.p(collection0, "indices");
        return O0.d(kotlin.collections.l.lu(arr_v, collection0));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfDouble")
    private static final double Hb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = E0.o(arr_v);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] Hc(@l H0[] arr_h0) {
        L.p(arr_h0, "<this>");
        long[] arr_v = new long[arr_h0.length];
        for(int v = 0; v < arr_h0.length; ++v) {
            arr_v[v] = arr_h0[v].l0();
        }
        return I0.d(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long I0(long[] arr_v) {
        L.p(arr_v, "$this$component3");
        return I0.l(arr_v, 2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List I1(@l int[] arr_v, int v) {
        L.p(arr_v, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.gc(arr_v, s.u(E0.o(arr_v) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final D0 I2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$find");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                return D0.b(v2);
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object I3(long[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$foldRightIndexed");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.ve(arr_v); v >= 0; --v) {
            object0 = p0.invoke(v, H0.b(I0.l(arr_v, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int I4(byte[] arr_b, byte b) {
        L.p(arr_b, "$this$indexOf");
        return kotlin.collections.l.Cf(arr_b, b);
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "maxByOrThrow-U")
    private static final long I5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxBy");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 I6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minByOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return D0.b(v);
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.7")
    @t
    @i(name = "minWithOrThrow-U")
    public static final long I7(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$minWith");
        L.p(comparator0, "comparator");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(comparator0.compare(H0.b(v), H0.b(v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short I8(short[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceIndexed");
        L.p(p0, "operation");
        if(O0.r(arr_v)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((N0)p0.invoke(v2, N0.b(v), N0.b(O0.l(arr_v, v2)))).j0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List I9(long[] arr_v, o o0) {
        L.p(arr_v, "$this$runningReduce");
        L.p(o0, "operation");
        if(I0.r(arr_v)) {
            return u.H();
        }
        long v = I0.l(arr_v, 0);
        List list0 = new ArrayList(I0.o(arr_v));
        ((ArrayList)list0).add(H0.b(v));
        int v1 = I0.o(arr_v);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((H0)o0.invoke(H0.b(v), H0.b(I0.l(arr_v, v2)))).l0();
            ((ArrayList)list0).add(H0.b(v));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] Ia(@l int[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "$this$sliceArray");
        L.p(l0, "indices");
        return E0.d(kotlin.collections.l.gu(arr_v, l0));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfDouble")
    private static final double Ib(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = I0.o(arr_v);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] Ic(@l N0[] arr_n0) {
        L.p(arr_n0, "<this>");
        short[] arr_v = new short[arr_n0.length];
        for(int v = 0; v < arr_n0.length; ++v) {
            arr_v[v] = arr_n0[v].j0();
        }
        return O0.d(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short J0(short[] arr_v) {
        L.p(arr_v, "$this$component3");
        return O0.l(arr_v, 2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List J1(@l long[] arr_v, int v) {
        L.p(arr_v, "$this$dropLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return c.hc(arr_v, s.u(I0.o(arr_v) - v, 0));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final N0 J2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$find");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                return N0.b(((short)v2));
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object J3(int[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$foldRightIndexed");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.ue(arr_v); v >= 0; --v) {
            object0 = p0.invoke(v, D0.b(E0.l(arr_v, v)), object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int J4(int[] arr_v, int v) {
        L.p(arr_v, "$this$indexOf");
        return kotlin.collections.l.Gf(arr_v, v);
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "maxByOrThrow-U")
    private static final short J5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxBy");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = O0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 J6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minByOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return N0.b(((short)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(((short)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = O0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(((short)v3)));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.7")
    @t
    @i(name = "minWithOrThrow-U")
    public static final short J7(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$minWith");
        L.p(comparator0, "comparator");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = O0.l(arr_v, v2);
                if(comparator0.compare(N0.b(v), N0.b(v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long J8(long[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceIndexed");
        L.p(p0, "operation");
        if(I0.r(arr_v)) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((H0)p0.invoke(v2, H0.b(v), H0.b(I0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List J9(short[] arr_v, o o0) {
        L.p(arr_v, "$this$runningReduce");
        L.p(o0, "operation");
        if(O0.r(arr_v)) {
            return u.H();
        }
        int v = O0.l(arr_v, 0);
        List list0 = new ArrayList(O0.o(arr_v));
        ((ArrayList)list0).add(N0.b(((short)v)));
        int v1 = O0.o(arr_v);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((N0)o0.invoke(N0.b(((short)v)), N0.b(O0.l(arr_v, v2)))).j0();
            ((ArrayList)list0).add(N0.b(((short)v)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] Ja(@l byte[] arr_b, @l Collection collection0) {
        L.p(arr_b, "$this$sliceArray");
        L.p(collection0, "indices");
        return A0.d(kotlin.collections.l.Xt(arr_b, collection0));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfDouble")
    private static final double Jb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = O0.o(arr_v);
        double f = 0.0;
        for(int v1 = 0; v1 < v; ++v1) {
            f += ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).doubleValue();
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] Jc(short[] arr_v) {
        L.p(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return O0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int K0(int[] arr_v) {
        L.p(arr_v, "$this$component4");
        return E0.l(arr_v, 3);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List K1(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$dropLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.qe(arr_b); -1 < v; --v) {
            if(!((Boolean)function10.invoke(z0.b(A0.l(arr_b, v)))).booleanValue()) {
                return c.ec(arr_b, v + 1);
            }
        }
        return u.H();
    }

    @h0(version = "1.3")
    @f
    @t
    private static final z0 K2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$findLast");
        L.p(function10, "predicate");
        int v = A0.o(arr_b) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = A0.l(arr_b, v);
                if(((Boolean)function10.invoke(z0.b(((byte)v1)))).booleanValue()) {
                    return z0.b(((byte)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void K3(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$forEach");
        L.p(function10, "action");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(z0.b(A0.l(arr_b, v1)));
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int K4(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$indexOfFirst");
        L.p(function10, "predicate");
        int v = 0;
        while(v < arr_b.length) {
            if(!((Boolean)function10.invoke(z0.b(z0.h(arr_b[v])))).booleanValue()) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double K5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxOf");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "minByOrThrow-U")
    private static final byte K6(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minBy");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(v == 0) {
            return b;
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(b));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = A0.l(arr_b, v1);
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(b1));
                if(comparable0.compareTo(comparable1) > 0) {
                    b = b1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean K7(int[] arr_v) {
        L.p(arr_v, "$this$none");
        return E0.r(arr_v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 K8(int[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceIndexedOrNull");
        L.p(p0, "operation");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((D0)p0.invoke(v2, D0.b(v), D0.b(E0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List K9(int[] arr_v, p p0) {
        L.p(arr_v, "$this$runningReduceIndexed");
        L.p(p0, "operation");
        if(E0.r(arr_v)) {
            return u.H();
        }
        int v = E0.l(arr_v, 0);
        List list0 = new ArrayList(E0.o(arr_v));
        ((ArrayList)list0).add(D0.b(v));
        int v1 = E0.o(arr_v);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((D0)p0.invoke(v2, D0.b(v), D0.b(E0.l(arr_v, v2)))).l0();
            ((ArrayList)list0).add(D0.b(v));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    public static final void Ka(@l int[] arr_v) {
        L.p(arr_v, "$this$sort");
        if(E0.o(arr_v) > 1) {
            kotlin.collections.s0.l(arr_v, 0, E0.o(arr_v));
        }
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfInt")
    private static final int Kb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        int v = A0.o(arr_b);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).intValue();
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final Iterable Kc(@l int[] arr_v) {
        static final class a extends N implements A3.a {
            final int[] e;

            a(int[] arr_v) {
                this.e = arr_v;
                super(0);
            }

            public final Iterator b() {
                return E0.t(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_v, "$this$withIndex");
        return new Q(new a(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte L0(byte[] arr_b) {
        L.p(arr_b, "$this$component4");
        return A0.l(arr_b, 3);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List L1(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$dropLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ve(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(H0.b(I0.l(arr_v, v)))).booleanValue()) {
                return c.hc(arr_v, v + 1);
            }
        }
        return u.H();
    }

    @h0(version = "1.3")
    @f
    @t
    private static final H0 L2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$findLast");
        L.p(function10, "predicate");
        int v = I0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                long v1 = I0.l(arr_v, v);
                if(((Boolean)function10.invoke(H0.b(v1))).booleanValue()) {
                    return H0.b(v1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void L3(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$forEach");
        L.p(function10, "action");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(H0.b(I0.l(arr_v, v1)));
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int L4(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$indexOfFirst");
        L.p(function10, "predicate");
        int v = 0;
        while(v < arr_v.length) {
            if(!((Boolean)function10.invoke(H0.b(H0.h(arr_v[v])))).booleanValue()) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float L5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxOf");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "minByOrThrow-U")
    private static final int L6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minBy");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean L7(byte[] arr_b) {
        L.p(arr_b, "$this$none");
        return A0.r(arr_b);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 L8(byte[] arr_b, p p0) {
        L.p(arr_b, "$this$reduceIndexedOrNull");
        L.p(p0, "operation");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((z0)p0.invoke(v2, z0.b(((byte)v)), z0.b(A0.l(arr_b, v2)))).j0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List L9(byte[] arr_b, p p0) {
        L.p(arr_b, "$this$runningReduceIndexed");
        L.p(p0, "operation");
        if(A0.r(arr_b)) {
            return u.H();
        }
        int v = A0.l(arr_b, 0);
        List list0 = new ArrayList(A0.o(arr_b));
        ((ArrayList)list0).add(z0.b(((byte)v)));
        int v1 = A0.o(arr_b);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((z0)p0.invoke(v2, z0.b(((byte)v)), z0.b(A0.l(arr_b, v2)))).j0();
            ((ArrayList)list0).add(z0.b(((byte)v)));
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    public static final void La(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$sort");
        kotlin.collections.c.a.d(v, v1, I0.o(arr_v));
        kotlin.collections.s0.i(arr_v, v, v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfInt")
    private static final int Lb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = E0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).intValue();
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final Iterable Lc(@l byte[] arr_b) {
        static final class kotlin.collections.unsigned.c.c extends N implements A3.a {
            final byte[] e;

            kotlin.collections.unsigned.c.c(byte[] arr_b) {
                this.e = arr_b;
                super(0);
            }

            public final Iterator b() {
                return A0.t(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_b, "$this$withIndex");
        return new Q(new kotlin.collections.unsigned.c.c(arr_b));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long M0(long[] arr_v) {
        L.p(arr_v, "$this$component4");
        return I0.l(arr_v, 3);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List M1(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$dropLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ue(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(D0.b(E0.l(arr_v, v)))).booleanValue()) {
                return c.gc(arr_v, v + 1);
            }
        }
        return u.H();
    }

    @h0(version = "1.3")
    @f
    @t
    private static final D0 M2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$findLast");
        L.p(function10, "predicate");
        int v = E0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = E0.l(arr_v, v);
                if(((Boolean)function10.invoke(D0.b(v1))).booleanValue()) {
                    return D0.b(v1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void M3(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$forEach");
        L.p(function10, "action");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(D0.b(E0.l(arr_v, v1)));
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int M4(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$indexOfFirst");
        L.p(function10, "predicate");
        int v = 0;
        while(v < arr_v.length) {
            if(!((Boolean)function10.invoke(D0.b(D0.h(arr_v[v])))).booleanValue()) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable M5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxOf");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "minByOrThrow-U")
    private static final long M6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minBy");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean M7(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$none");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(z0.b(A0.l(arr_b, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 M8(short[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceIndexedOrNull");
        L.p(p0, "operation");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((N0)p0.invoke(v2, N0.b(((short)v)), N0.b(O0.l(arr_v, v2)))).j0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List M9(short[] arr_v, p p0) {
        L.p(arr_v, "$this$runningReduceIndexed");
        L.p(p0, "operation");
        if(O0.r(arr_v)) {
            return u.H();
        }
        int v = O0.l(arr_v, 0);
        List list0 = new ArrayList(O0.o(arr_v));
        ((ArrayList)list0).add(N0.b(((short)v)));
        int v1 = O0.o(arr_v);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((N0)p0.invoke(v2, N0.b(((short)v)), N0.b(O0.l(arr_v, v2)))).j0();
            ((ArrayList)list0).add(N0.b(((short)v)));
        }
        return list0;
    }

    public static void Ma(long[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = I0.o(arr_v);
        }
        c.La(arr_v, v, v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfInt")
    private static final int Mb(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = I0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).intValue();
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final Iterable Mc(@l long[] arr_v) {
        static final class kotlin.collections.unsigned.c.b extends N implements A3.a {
            final long[] e;

            kotlin.collections.unsigned.c.b(long[] arr_v) {
                this.e = arr_v;
                super(0);
            }

            public final Iterator b() {
                return I0.t(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_v, "$this$withIndex");
        return new Q(new kotlin.collections.unsigned.c.b(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short N0(short[] arr_v) {
        L.p(arr_v, "$this$component4");
        return O0.l(arr_v, 3);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List N1(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$dropLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.xe(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(N0.b(O0.l(arr_v, v)))).booleanValue()) {
                return c.fc(arr_v, v + 1);
            }
        }
        return u.H();
    }

    @h0(version = "1.3")
    @f
    @t
    private static final N0 N2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$findLast");
        L.p(function10, "predicate");
        int v = O0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = O0.l(arr_v, v);
                if(((Boolean)function10.invoke(N0.b(((short)v1)))).booleanValue()) {
                    return N0.b(((short)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void N3(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$forEach");
        L.p(function10, "action");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(N0.b(O0.l(arr_v, v1)));
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int N4(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$indexOfFirst");
        L.p(function10, "predicate");
        int v = 0;
        while(v < arr_v.length) {
            if(!((Boolean)function10.invoke(N0.b(N0.h(arr_v[v])))).booleanValue()) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double N5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @f
    @t
    @i(name = "minByOrThrow-U")
    private static final short N6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minBy");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = O0.l(arr_v, v2);
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean N7(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$none");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(H0.b(I0.l(arr_v, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 N8(long[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceIndexedOrNull");
        L.p(p0, "operation");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((H0)p0.invoke(v2, H0.b(v), H0.b(I0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List N9(long[] arr_v, p p0) {
        L.p(arr_v, "$this$runningReduceIndexed");
        L.p(p0, "operation");
        if(I0.r(arr_v)) {
            return u.H();
        }
        long v = I0.l(arr_v, 0);
        List list0 = new ArrayList(I0.o(arr_v));
        ((ArrayList)list0).add(H0.b(v));
        int v1 = I0.o(arr_v);
        for(int v2 = 1; v2 < v1; ++v2) {
            v = ((H0)p0.invoke(v2, H0.b(v), H0.b(I0.l(arr_v, v2)))).l0();
            ((ArrayList)list0).add(H0.b(v));
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    public static final void Na(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "$this$sort");
        kotlin.collections.c.a.d(v, v1, A0.o(arr_b));
        kotlin.collections.s0.j(arr_b, v, v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfInt")
    private static final int Nb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = O0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).intValue();
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final Iterable Nc(@l short[] arr_v) {
        static final class d extends N implements A3.a {
            final short[] e;

            d(short[] arr_v) {
                this.e = arr_v;
                super(0);
            }

            public final Iterator b() {
                return O0.t(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_v, "$this$withIndex");
        return new Q(new d(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int O0(int[] arr_v) {
        L.p(arr_v, "$this$component5");
        return E0.l(arr_v, 4);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List O1(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$dropWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(z) {
                ((ArrayList)list0).add(z0.b(((byte)v2)));
            }
            else if(!((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                ((ArrayList)list0).add(z0.b(((byte)v2)));
                z = true;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int O2(int[] arr_v) {
        L.p(arr_v, "$this$first");
        return D0.h(kotlin.collections.l.Nb(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void O3(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$forEachIndexed");
        L.p(o0, "action");
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, z0.b(A0.l(arr_b, v1)));
            ++v1;
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int O4(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$indexOfLast");
        L.p(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(z0.b(z0.h(arr_b[v])))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float O5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double O6(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minOf");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean O7(long[] arr_v) {
        L.p(arr_v, "$this$none");
        return I0.r(arr_v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 O8(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$reduceOrNull");
        L.p(o0, "operation");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((z0)o0.invoke(z0.b(((byte)v)), z0.b(A0.l(arr_b, v2)))).j0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List O9(long[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$scan");
        L.p(o0, "operation");
        if(I0.r(arr_v)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(I0.o(arr_v) + 1);
        arrayList0.add(object0);
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, H0.b(I0.l(arr_v, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static void Oa(byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = A0.o(arr_b);
        }
        c.Na(arr_b, v, v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfLong")
    private static final long Ob(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        int v = A0.o(arr_b);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((Number)function10.invoke(z0.b(A0.l(arr_b, v2)))).longValue();
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Oc(int[] arr_v, Iterable iterable0, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        int v = E0.o(arr_v);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(D0.b(E0.l(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte P0(byte[] arr_b) {
        L.p(arr_b, "$this$component5");
        return A0.l(arr_b, 4);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List P1(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$dropWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(z) {
                ((ArrayList)list0).add(H0.b(v2));
            }
            else if(!((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                ((ArrayList)list0).add(H0.b(v2));
                z = true;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte P2(byte[] arr_b) {
        L.p(arr_b, "$this$first");
        return z0.h(kotlin.collections.l.Fb(arr_b));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void P3(int[] arr_v, o o0) {
        L.p(arr_v, "$this$forEachIndexed");
        L.p(o0, "action");
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, D0.b(E0.l(arr_v, v1)));
            ++v1;
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int P4(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$indexOfLast");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(H0.b(H0.h(arr_v[v])))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable P5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float P6(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minOf");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean P7(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$none");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(D0.b(E0.l(arr_v, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 P8(int[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceOrNull");
        L.p(o0, "operation");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((D0)o0.invoke(D0.b(v), D0.b(E0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List P9(byte[] arr_b, Object object0, o o0) {
        L.p(arr_b, "$this$scan");
        L.p(o0, "operation");
        if(A0.r(arr_b)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(A0.o(arr_b) + 1);
        arrayList0.add(object0);
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, z0.b(A0.l(arr_b, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @h0(version = "1.4")
    @t
    public static final void Pa(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$sort");
        kotlin.collections.c.a.d(v, v1, O0.o(arr_v));
        kotlin.collections.s0.k(arr_v, v, v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfLong")
    private static final long Pb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = E0.o(arr_v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((Number)function10.invoke(D0.b(E0.l(arr_v, v2)))).longValue();
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Pc(long[] arr_v, Object[] arr_object, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(I0.o(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(H0.b(I0.l(arr_v, v1)), arr_object[v1]));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long Q0(long[] arr_v) {
        L.p(arr_v, "$this$component5");
        return I0.l(arr_v, 4);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Q1(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$dropWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(z) {
                ((ArrayList)list0).add(D0.b(v2));
            }
            else if(!((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                ((ArrayList)list0).add(D0.b(v2));
                z = true;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte Q2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$first");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            byte b = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(b))).booleanValue()) {
                return b;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void Q3(long[] arr_v, o o0) {
        L.p(arr_v, "$this$forEachIndexed");
        L.p(o0, "action");
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, H0.b(I0.l(arr_v, v1)));
            ++v1;
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int Q4(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$indexOfLast");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(D0.b(D0.h(arr_v[v])))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double Q5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable Q6(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minOf");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean Q7(short[] arr_v) {
        L.p(arr_v, "$this$none");
        return O0.r(arr_v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 Q8(long[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceOrNull");
        L.p(o0, "operation");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((H0)o0.invoke(H0.b(v), H0.b(I0.l(arr_v, v2)))).l0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List Q9(int[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$scan");
        L.p(o0, "operation");
        if(E0.r(arr_v)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(E0.o(arr_v) + 1);
        arrayList0.add(object0);
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, D0.b(E0.l(arr_v, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static void Qa(short[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = O0.o(arr_v);
        }
        c.Pa(arr_v, v, v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfLong")
    private static final long Qb(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = I0.o(arr_v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((Number)function10.invoke(H0.b(I0.l(arr_v, v2)))).longValue();
        }
        return v1;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Qc(@l int[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "$this$zip");
        L.p(arr_object, "other");
        int v = Math.min(E0.o(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(r0.a(D0.b(v2), object0));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short R0(short[] arr_v) {
        L.p(arr_v, "$this$component5");
        return O0.l(arr_v, 4);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List R1(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$dropWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(z) {
                ((ArrayList)list0).add(N0.b(((short)v2)));
            }
            else if(!((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                ((ArrayList)list0).add(N0.b(((short)v2)));
                z = true;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long R2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$first");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                return v2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void R3(short[] arr_v, o o0) {
        L.p(arr_v, "$this$forEachIndexed");
        L.p(o0, "action");
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, N0.b(O0.l(arr_v, v1)));
            ++v1;
        }
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int R4(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$indexOfLast");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(N0.b(N0.h(arr_v[v])))).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float R5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double R6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean R7(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$none");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(N0.b(O0.l(arr_v, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 R8(short[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceOrNull");
        L.p(o0, "operation");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((N0)o0.invoke(N0.b(((short)v)), N0.b(O0.l(arr_v, v2)))).j0();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List R9(short[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$scan");
        L.p(o0, "operation");
        if(O0.r(arr_v)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(O0.o(arr_v) + 1);
        arrayList0.add(object0);
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, N0.b(O0.l(arr_v, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @h0(version = "1.3")
    @t
    public static final void Ra(@l byte[] arr_b) {
        L.p(arr_b, "$this$sort");
        if(A0.o(arr_b) > 1) {
            kotlin.collections.s0.j(arr_b, 0, A0.o(arr_b));
        }
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfLong")
    private static final long Rb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v = O0.o(arr_v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((Number)function10.invoke(N0.b(O0.l(arr_v, v2)))).longValue();
        }
        return v1;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Rc(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "$this$zip");
        L.p(iterable0, "other");
        int v = I0.o(arr_v);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(r0.a(H0.b(I0.l(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    public static boolean S0(@m short[] arr_v, @m short[] arr_v1) {
        if(arr_v == null) {
            arr_v = null;
        }
        if(arr_v1 == null) {
            arr_v1 = null;
        }
        return Arrays.equals(arr_v, arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short S1(short[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "$this$elementAtOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= O0.o(arr_v) ? ((N0)function10.invoke(v)).j0() : O0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long S2(long[] arr_v) {
        L.p(arr_v, "$this$first");
        return H0.h(kotlin.collections.l.Pb(arr_v));
    }

    @l
    public static final kotlin.ranges.l S3(@l int[] arr_v) {
        L.p(arr_v, "$this$indices");
        return kotlin.collections.l.le(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int S4(int[] arr_v) {
        L.p(arr_v, "$this$last");
        return D0.h(kotlin.collections.l.wh(arr_v));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable S5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float S6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final byte[] S7(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$onEach");
        L.p(function10, "action");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(z0.b(A0.l(arr_b, v1)));
        }
        return arr_b;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte S8(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$reduceRight");
        L.p(o0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        byte b = A0.l(arr_b, v);
        while(v1 >= 0) {
            b = ((z0)o0.invoke(z0.b(A0.l(arr_b, v1)), z0.b(b))).j0();
            --v1;
        }
        return b;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List S9(byte[] arr_b, Object object0, p p0) {
        L.p(arr_b, "$this$scanIndexed");
        L.p(p0, "operation");
        if(A0.r(arr_b)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(A0.o(arr_b) + 1);
        arrayList0.add(object0);
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, z0.b(A0.l(arr_b, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @h0(version = "1.3")
    @t
    public static final void Sa(@l long[] arr_v) {
        L.p(arr_v, "$this$sort");
        if(I0.o(arr_v) > 1) {
            kotlin.collections.s0.i(arr_v, 0, I0.o(arr_v));
        }
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfUByte")
    public static final int Sb(@l z0[] arr_z0) {
        L.p(arr_z0, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_z0.length; ++v) {
            v1 = D0.h(v1 + D0.h(arr_z0[v].j0() & 0xFF));
        }
        return v1;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Sc(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "$this$zip");
        L.p(iterable0, "other");
        int v = E0.o(arr_v);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(r0.a(D0.b(E0.l(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    public static boolean T0(@m int[] arr_v, @m int[] arr_v1) {
        if(arr_v == null) {
            arr_v = null;
        }
        if(arr_v1 == null) {
            arr_v1 = null;
        }
        return Arrays.equals(arr_v, arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int T1(int[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "$this$elementAtOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= E0.o(arr_v) ? ((D0)function10.invoke(v)).l0() : E0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int T2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$first");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                return v2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h0(version = "1.3")
    @t
    public static void T3(int[] arr_v) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte T4(byte[] arr_b) {
        L.p(arr_b, "$this$last");
        return z0.h(kotlin.collections.l.oh(arr_b));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double T5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable T6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final long[] T7(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$onEach");
        L.p(function10, "action");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(H0.b(I0.l(arr_v, v1)));
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int T8(int[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceRight");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        int v2 = E0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((D0)o0.invoke(D0.b(E0.l(arr_v, v1)), D0.b(v2))).l0();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List T9(short[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$scanIndexed");
        L.p(p0, "operation");
        if(O0.r(arr_v)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(O0.o(arr_v) + 1);
        arrayList0.add(object0);
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, N0.b(O0.l(arr_v, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @h0(version = "1.4")
    @t
    public static final void Ta(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$sort");
        kotlin.collections.c.a.d(v, v1, E0.o(arr_v));
        kotlin.collections.s0.l(arr_v, v, v1);
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfUInt")
    private static final int Tb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        int v1 = 0;
        int v2 = A0.o(arr_b);
        for(int v = 0; v < v2; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(z0.b(A0.l(arr_b, v)))).l0());
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Tc(byte[] arr_b, byte[] arr_b1, o o0) {
        L.p(arr_b, "$this$zip");
        L.p(arr_b1, "other");
        L.p(o0, "transform");
        int v = Math.min(A0.o(arr_b), A0.o(arr_b1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(z0.b(A0.l(arr_b, v1)), z0.b(A0.l(arr_b1, v1))));
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    public static boolean U0(@m byte[] arr_b, @m byte[] arr_b1) {
        if(arr_b == null) {
            arr_b = null;
        }
        if(arr_b1 == null) {
            arr_b1 = null;
        }
        return Arrays.equals(arr_b, arr_b1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long U1(long[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "$this$elementAtOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= I0.o(arr_v) ? ((H0)function10.invoke(v)).l0() : I0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short U2(short[] arr_v) {
        L.p(arr_v, "$this$first");
        return N0.h(kotlin.collections.l.Tb(arr_v));
    }

    @l
    public static final kotlin.ranges.l U3(@l byte[] arr_b) {
        L.p(arr_b, "$this$indices");
        return kotlin.collections.l.he(arr_b);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte U4(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$last");
        L.p(function10, "predicate");
        int v = A0.o(arr_b) - 1;
        if(v >= 0) {
            while(true) {
                byte b = A0.l(arr_b, v);
                if(((Boolean)function10.invoke(z0.b(b))).booleanValue()) {
                    return b;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float U5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double U6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final int[] U7(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$onEach");
        L.p(function10, "action");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(D0.b(E0.l(arr_v, v1)));
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long U8(long[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceRight");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        long v2 = I0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((H0)o0.invoke(H0.b(I0.l(arr_v, v1)), H0.b(v2))).l0();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List U9(long[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$scanIndexed");
        L.p(p0, "operation");
        if(I0.r(arr_v)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(I0.o(arr_v) + 1);
        arrayList0.add(object0);
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, H0.b(I0.l(arr_v, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static void Ua(int[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = E0.o(arr_v);
        }
        c.Ta(arr_v, v, v1);
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfUInt")
    private static final int Ub(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v1 = 0;
        int v2 = E0.o(arr_v);
        for(int v = 0; v < v2; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(D0.b(E0.l(arr_v, v)))).l0());
        }
        return v1;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Uc(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "$this$zip");
        L.p(iterable0, "other");
        int v = O0.o(arr_v);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(r0.a(N0.b(O0.l(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    public static boolean V0(@m long[] arr_v, @m long[] arr_v1) {
        if(arr_v == null) {
            arr_v = null;
        }
        if(arr_v1 == null) {
            arr_v1 = null;
        }
        return Arrays.equals(arr_v, arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte V1(byte[] arr_b, int v, Function1 function10) {
        L.p(arr_b, "$this$elementAtOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= A0.o(arr_b) ? ((z0)function10.invoke(v)).j0() : A0.l(arr_b, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short V2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$first");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            short v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(v2))).booleanValue()) {
                return v2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h0(version = "1.3")
    @t
    public static void V3(byte[] arr_b) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long V4(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$last");
        L.p(function10, "predicate");
        int v = I0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                long v1 = I0.l(arr_v, v);
                if(((Boolean)function10.invoke(H0.b(v1))).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable V5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOf");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float V6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final short[] V7(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$onEach");
        L.p(function10, "action");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(N0.b(O0.l(arr_v, v1)));
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short V8(short[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceRight");
        L.p(o0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        short v2 = O0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((N0)o0.invoke(N0.b(O0.l(arr_v, v1)), N0.b(v2))).j0();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List V9(int[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$scanIndexed");
        L.p(p0, "operation");
        if(E0.r(arr_v)) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(E0.o(arr_v) + 1);
        arrayList0.add(object0);
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = p0.invoke(v1, object0, D0.b(E0.l(arr_v, v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @h0(version = "1.3")
    @t
    public static final void Va(@l short[] arr_v) {
        L.p(arr_v, "$this$sort");
        if(O0.o(arr_v) > 1) {
            kotlin.collections.s0.k(arr_v, 0, O0.o(arr_v));
        }
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfUInt")
    private static final int Vb(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v1 = 0;
        int v2 = I0.o(arr_v);
        for(int v = 0; v < v2; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(H0.b(I0.l(arr_v, v)))).l0());
        }
        return v1;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List Vc(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "$this$zip");
        L.p(iterable0, "other");
        int v = A0.o(arr_b);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(r0.a(z0.b(A0.l(arr_b, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean W(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$all");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(z0.b(A0.l(arr_b, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @t
    public static final int W0(@m byte[] arr_b) {
        if(arr_b == null) {
            arr_b = null;
        }
        return Arrays.hashCode(arr_b);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final z0 W1(byte[] arr_b, int v) {
        L.p(arr_b, "$this$elementAtOrNull");
        return c.m4(arr_b, v);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final D0 W2(@l int[] arr_v) {
        L.p(arr_v, "$this$firstOrNull");
        return E0.r(arr_v) ? null : D0.b(E0.l(arr_v, 0));
    }

    @l
    public static final kotlin.ranges.l W3(@l long[] arr_v) {
        L.p(arr_v, "$this$indices");
        return kotlin.collections.l.me(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long W4(long[] arr_v) {
        L.p(arr_v, "$this$last");
        return H0.h(kotlin.collections.l.yh(arr_v));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable W5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable W6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final byte[] W7(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$onEachIndexed");
        L.p(o0, "action");
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, z0.b(A0.l(arr_b, v1)));
            ++v1;
        }
        return arr_b;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int W8(int[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceRightIndexed");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        int v2 = E0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((D0)p0.invoke(v1, D0.b(E0.l(arr_v, v1)), D0.b(v2))).l0();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @t
    public static final void W9(@l int[] arr_v) {
        L.p(arr_v, "$this$shuffle");
        c.X9(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @t
    public static final void Wa(@l int[] arr_v) {
        L.p(arr_v, "$this$sortDescending");
        if(E0.o(arr_v) > 1) {
            c.Ka(arr_v);
            kotlin.collections.l.Yq(arr_v);
        }
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfUInt")
    public static final int Wb(@l D0[] arr_d0) {
        L.p(arr_d0, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_d0.length; ++v) {
            v1 = D0.h(v1 + arr_d0[v].l0());
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Wc(int[] arr_v, int[] arr_v1, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(arr_v1, "other");
        L.p(o0, "transform");
        int v = Math.min(E0.o(arr_v), E0.o(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(D0.b(E0.l(arr_v, v1)), D0.b(E0.l(arr_v1, v1))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean X(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$all");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(H0.b(I0.l(arr_v, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @t
    public static final int X0(@m int[] arr_v) {
        if(arr_v == null) {
            arr_v = null;
        }
        return Arrays.hashCode(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final N0 X1(short[] arr_v, int v) {
        L.p(arr_v, "$this$elementAtOrNull");
        return c.n4(arr_v, v);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final z0 X2(@l byte[] arr_b) {
        L.p(arr_b, "$this$firstOrNull");
        return A0.r(arr_b) ? null : z0.b(A0.l(arr_b, 0));
    }

    @h0(version = "1.3")
    @t
    public static void X3(long[] arr_v) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int X4(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$last");
        L.p(function10, "predicate");
        int v = E0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = E0.l(arr_v, v);
                if(((Boolean)function10.invoke(D0.b(v1))).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double X5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        double f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final double X6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final int[] X7(int[] arr_v, o o0) {
        L.p(arr_v, "$this$onEachIndexed");
        L.p(o0, "action");
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, D0.b(E0.l(arr_v, v1)));
            ++v1;
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte X8(byte[] arr_b, p p0) {
        L.p(arr_b, "$this$reduceRightIndexed");
        L.p(p0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        byte b = A0.l(arr_b, v);
        while(v1 >= 0) {
            b = ((z0)p0.invoke(v1, z0.b(A0.l(arr_b, v1)), z0.b(b))).j0();
            --v1;
        }
        return b;
    }

    @h0(version = "1.4")
    @t
    public static final void X9(@l int[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$shuffle");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.ue(arr_v); v > 0; --v) {
            int v1 = f0.m(v + 1);
            int v2 = E0.l(arr_v, v);
            E0.u(arr_v, v, E0.l(arr_v, v1));
            E0.u(arr_v, v1, v2);
        }
    }

    @h0(version = "1.4")
    @t
    public static final void Xa(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$sortDescending");
        c.La(arr_v, v, v1);
        kotlin.collections.l.br(arr_v, v, v1);
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfUInt")
    private static final int Xb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        int v1 = 0;
        int v2 = O0.o(arr_v);
        for(int v = 0; v < v2; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(N0.b(O0.l(arr_v, v)))).l0());
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Xc(byte[] arr_b, Object[] arr_object, o o0) {
        L.p(arr_b, "$this$zip");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(A0.o(arr_b), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(z0.b(A0.l(arr_b, v1)), arr_object[v1]));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean Y(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$all");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(D0.b(E0.l(arr_v, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @t
    public static final int Y0(@m short[] arr_v) {
        if(arr_v == null) {
            arr_v = null;
        }
        return Arrays.hashCode(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final D0 Y1(int[] arr_v, int v) {
        L.p(arr_v, "$this$elementAtOrNull");
        return c.o4(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final z0 Y2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$firstOrNull");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                return z0.b(((byte)v2));
            }
        }
        return null;
    }

    @l
    public static final kotlin.ranges.l Y3(@l short[] arr_v) {
        L.p(arr_v, "$this$indices");
        return kotlin.collections.l.oe(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short Y4(short[] arr_v) {
        L.p(arr_v, "$this$last");
        return N0.h(kotlin.collections.l.Ch(arr_v));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float Y5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        float f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final float Y6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final long[] Y7(long[] arr_v, o o0) {
        L.p(arr_v, "$this$onEachIndexed");
        L.p(o0, "action");
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, H0.b(I0.l(arr_v, v1)));
            ++v1;
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short Y8(short[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceRightIndexed");
        L.p(p0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        short v2 = O0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((N0)p0.invoke(v1, N0.b(O0.l(arr_v, v1)), N0.b(v2))).j0();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @t
    public static final void Y9(@l byte[] arr_b) {
        L.p(arr_b, "$this$shuffle");
        c.ba(arr_b, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @t
    public static final void Ya(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "$this$sortDescending");
        c.Na(arr_b, v, v1);
        kotlin.collections.l.Rq(arr_b, v, v1);
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfULong")
    private static final long Yb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        long v = 0L;
        int v1 = A0.o(arr_b);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = H0.h(v + ((H0)function10.invoke(z0.b(A0.l(arr_b, v2)))).l0());
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Yc(long[] arr_v, long[] arr_v1, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(arr_v1, "other");
        L.p(o0, "transform");
        int v = Math.min(I0.o(arr_v), I0.o(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(H0.b(I0.l(arr_v, v1)), H0.b(I0.l(arr_v1, v1))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean Z(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$all");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(N0.b(O0.l(arr_v, v1)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @t
    public static final int Z0(@m long[] arr_v) {
        if(arr_v == null) {
            arr_v = null;
        }
        return Arrays.hashCode(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final H0 Z1(long[] arr_v, int v) {
        L.p(arr_v, "$this$elementAtOrNull");
        return c.p4(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final H0 Z2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$firstOrNull");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                return H0.b(v2);
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @t
    public static void Z3(short[] arr_v) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short Z4(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$last");
        L.p(function10, "predicate");
        int v = O0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                short v1 = O0.l(arr_v, v);
                if(((Boolean)function10.invoke(N0.b(v1))).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable Z5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable Z6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOf");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final short[] Z7(short[] arr_v, o o0) {
        L.p(arr_v, "$this$onEachIndexed");
        L.p(o0, "action");
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            o0.invoke(v2, N0.b(O0.l(arr_v, v1)));
            ++v1;
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long Z8(long[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceRightIndexed");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        long v2 = I0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((H0)p0.invoke(v1, H0.b(I0.l(arr_v, v1)), H0.b(v2))).l0();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @t
    public static final void Z9(@l long[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$shuffle");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.ve(arr_v); v > 0; --v) {
            int v1 = f0.m(v + 1);
            long v2 = I0.l(arr_v, v);
            I0.u(arr_v, v, I0.l(arr_v, v1));
            I0.u(arr_v, v1, v2);
        }
    }

    @h0(version = "1.4")
    @t
    public static final void Za(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$sortDescending");
        c.Pa(arr_v, v, v1);
        kotlin.collections.l.fr(arr_v, v, v1);
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfULong")
    private static final long Zb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        long v = 0L;
        int v1 = E0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = H0.h(v + ((H0)function10.invoke(D0.b(E0.l(arr_v, v2)))).l0());
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List Zc(long[] arr_v, Iterable iterable0, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        int v = I0.o(arr_v);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(H0.b(I0.l(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean a0(int[] arr_v) {
        L.p(arr_v, "$this$any");
        return kotlin.collections.l.l5(arr_v);
    }

    @h0(version = "1.4")
    @t
    @l
    public static String a1(@m byte[] arr_b) {
        if(arr_b != null) {
            String s = u.m3(A0.b(arr_b), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    @h0(version = "1.3")
    @t
    public static final void a2(@l int[] arr_v, int v, int v1, int v2) {
        L.p(arr_v, "$this$fill");
        kotlin.collections.l.K1(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final H0 a3(@l long[] arr_v) {
        L.p(arr_v, "$this$firstOrNull");
        return I0.r(arr_v) ? null : H0.b(I0.l(arr_v, 0));
    }

    public static final int a4(@l int[] arr_v) {
        L.p(arr_v, "$this$lastIndex");
        return kotlin.collections.l.ue(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int a5(long[] arr_v, long v) {
        L.p(arr_v, "$this$lastIndexOf");
        return kotlin.collections.l.Lh(arr_v, v);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double a6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        double f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable a7(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] a8(long[] arr_v, long v) {
        L.p(arr_v, "$this$plus");
        return I0.d(kotlin.collections.l.t3(arr_v, v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 a9(int[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceRightIndexedOrNull");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = E0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((D0)p0.invoke(v1, D0.b(E0.l(arr_v, v1)), D0.b(v2))).l0();
            --v1;
        }
        return D0.b(v2);
    }

    @h0(version = "1.4")
    @t
    public static final void aa(@l long[] arr_v) {
        L.p(arr_v, "$this$shuffle");
        c.Z9(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @t
    public static final void ab(@l byte[] arr_b) {
        L.p(arr_b, "$this$sortDescending");
        if(A0.o(arr_b) > 1) {
            c.Ra(arr_b);
            kotlin.collections.l.Qq(arr_b);
        }
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfULong")
    private static final long ac(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        long v = 0L;
        int v1 = I0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = H0.h(v + ((H0)function10.invoke(H0.b(I0.l(arr_v, v2)))).l0());
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List ad(byte[] arr_b, Iterable iterable0, o o0) {
        L.p(arr_b, "$this$zip");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        int v = A0.o(arr_b);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(z0.b(A0.l(arr_b, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean b0(byte[] arr_b) {
        L.p(arr_b, "$this$any");
        return kotlin.collections.l.d5(arr_b);
    }

    @h0(version = "1.4")
    @t
    @l
    public static String b1(@m int[] arr_v) {
        if(arr_v != null) {
            String s = u.m3(E0.b(arr_v), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    public static void b2(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = E0.o(arr_v);
        }
        c.a2(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final D0 b3(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$firstOrNull");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                return D0.b(v2);
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @t
    public static void b4(int[] arr_v) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int b5(short[] arr_v, short v) {
        L.p(arr_v, "$this$lastIndexOf");
        return kotlin.collections.l.Nh(arr_v, v);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float b6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        float f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double b7(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        double f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] b8(@l int[] arr_v, @l Collection collection0) {
        L.p(arr_v, "$this$plus");
        L.p(collection0, "elements");
        int v = E0.o(arr_v);
        int[] arr_v1 = Arrays.copyOf(arr_v, E0.o(arr_v) + collection0.size());
        L.o(arr_v1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_v1[v] = ((D0)object0).l0();
            ++v;
        }
        return E0.d(arr_v1);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 b9(byte[] arr_b, p p0) {
        L.p(arr_b, "$this$reduceRightIndexedOrNull");
        L.p(p0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = A0.l(arr_b, v);
        while(v1 >= 0) {
            v2 = ((z0)p0.invoke(v1, z0.b(A0.l(arr_b, v1)), z0.b(((byte)v2)))).j0();
            --v1;
        }
        return z0.b(((byte)v2));
    }

    @h0(version = "1.4")
    @t
    public static final void ba(@l byte[] arr_b, @l kotlin.random.f f0) {
        L.p(arr_b, "$this$shuffle");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.qe(arr_b); v > 0; --v) {
            int v1 = f0.m(v + 1);
            int v2 = A0.l(arr_b, v);
            A0.u(arr_b, v, A0.l(arr_b, v1));
            A0.u(arr_b, v1, ((byte)v2));
        }
    }

    @h0(version = "1.3")
    @t
    public static final void bb(@l long[] arr_v) {
        L.p(arr_v, "$this$sortDescending");
        if(I0.o(arr_v) > 1) {
            c.Sa(arr_v);
            kotlin.collections.l.ar(arr_v);
        }
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfULong")
    public static final long bc(@l H0[] arr_h0) {
        L.p(arr_h0, "<this>");
        long v = 0L;
        for(int v1 = 0; v1 < arr_h0.length; ++v1) {
            v = H0.h(v + arr_h0[v1].l0());
        }
        return v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List bd(int[] arr_v, Object[] arr_object, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(E0.o(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(D0.b(E0.l(arr_v, v1)), arr_object[v1]));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean c0(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$any");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(z0.b(A0.l(arr_b, v1)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h0(version = "1.4")
    @t
    @l
    public static String c1(@m short[] arr_v) {
        if(arr_v != null) {
            String s = u.m3(O0.b(arr_v), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    @h0(version = "1.3")
    @t
    public static final void c2(@l short[] arr_v, short v, int v1, int v2) {
        L.p(arr_v, "$this$fill");
        kotlin.collections.l.N1(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final N0 c3(@l short[] arr_v) {
        L.p(arr_v, "$this$firstOrNull");
        return O0.r(arr_v) ? null : N0.b(O0.l(arr_v, 0));
    }

    public static final int c4(@l byte[] arr_b) {
        L.p(arr_b, "$this$lastIndex");
        return kotlin.collections.l.qe(arr_b);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int c5(byte[] arr_b, byte b) {
        L.p(arr_b, "$this$lastIndexOf");
        return kotlin.collections.l.Gh(arr_b, b);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable c6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float c7(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        float f = ((Number)function10.invoke(z0.b(A0.l(arr_b, 0)))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(z0.b(A0.l(arr_b, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] c8(short[] arr_v, short v) {
        L.p(arr_v, "$this$plus");
        return O0.d(kotlin.collections.l.A3(arr_v, v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 c9(short[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceRightIndexedOrNull");
        L.p(p0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = O0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((N0)p0.invoke(v1, N0.b(O0.l(arr_v, v1)), N0.b(((short)v2)))).j0();
            --v1;
        }
        return N0.b(((short)v2));
    }

    @h0(version = "1.4")
    @t
    public static final void ca(@l short[] arr_v) {
        L.p(arr_v, "$this$shuffle");
        c.da(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @t
    public static final void cb(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$sortDescending");
        c.Ta(arr_v, v, v1);
        kotlin.collections.l.Zq(arr_v, v, v1);
    }

    @U
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    @t
    @i(name = "sumOfULong")
    private static final long cc(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        long v = 0L;
        int v1 = O0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = H0.h(v + ((H0)function10.invoke(N0.b(O0.l(arr_v, v2)))).l0());
        }
        return v;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List cd(@l int[] arr_v, @l int[] arr_v1) {
        L.p(arr_v, "$this$zip");
        L.p(arr_v1, "other");
        int v = Math.min(E0.o(arr_v), E0.o(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            int v3 = E0.l(arr_v1, v1);
            ((ArrayList)list0).add(r0.a(D0.b(v2), D0.b(v3)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean d0(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$any");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(H0.b(I0.l(arr_v, v1)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h0(version = "1.4")
    @t
    @l
    public static String d1(@m long[] arr_v) {
        if(arr_v != null) {
            String s = u.m3(I0.b(arr_v), ", ", "[", "]", 0, null, null, 56, null);
            return s == null ? "null" : s;
        }
        return "null";
    }

    public static void d2(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = O0.o(arr_v);
        }
        c.c2(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final N0 d3(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$firstOrNull");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                return N0.b(((short)v2));
            }
        }
        return null;
    }

    @h0(version = "1.3")
    @t
    public static void d4(byte[] arr_b) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int d5(int[] arr_v, int v) {
        L.p(arr_v, "$this$lastIndexOf");
        return kotlin.collections.l.Kh(arr_v, v);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double d6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        double f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable d7(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] d8(int[] arr_v, int[] arr_v1) {
        L.p(arr_v, "$this$plus");
        L.p(arr_v1, "elements");
        return E0.d(kotlin.collections.l.s3(arr_v, arr_v1));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 d9(long[] arr_v, p p0) {
        L.p(arr_v, "$this$reduceRightIndexedOrNull");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        long v2 = I0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((H0)p0.invoke(v1, H0.b(I0.l(arr_v, v1)), H0.b(v2))).l0();
            --v1;
        }
        return H0.b(v2);
    }

    @h0(version = "1.4")
    @t
    public static final void da(@l short[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$shuffle");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.xe(arr_v); v > 0; --v) {
            int v1 = f0.m(v + 1);
            int v2 = O0.l(arr_v, v);
            O0.u(arr_v, v, O0.l(arr_v, v1));
            O0.u(arr_v, v1, ((short)v2));
        }
    }

    @h0(version = "1.3")
    @t
    public static final void db(@l short[] arr_v) {
        L.p(arr_v, "$this$sortDescending");
        if(O0.o(arr_v) > 1) {
            c.Va(arr_v);
            kotlin.collections.l.er(arr_v);
        }
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfUShort")
    public static final int dc(@l N0[] arr_n0) {
        L.p(arr_n0, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_n0.length; ++v) {
            v1 = D0.h(v1 + D0.h(arr_n0[v].j0() & 0xFFFF));
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List dd(short[] arr_v, Object[] arr_object, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(O0.o(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(N0.b(O0.l(arr_v, v1)), arr_object[v1]));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean e0(long[] arr_v) {
        L.p(arr_v, "$this$any");
        return kotlin.collections.l.n5(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] e1(long[] arr_v, long[] arr_v1, int v, int v1, int v2) {
        L.p(arr_v, "$this$copyInto");
        L.p(arr_v1, "destination");
        kotlin.collections.l.A0(arr_v, arr_v1, v, v1, v2);
        return arr_v1;
    }

    @h0(version = "1.3")
    @t
    public static final void e2(@l long[] arr_v, long v, int v1, int v2) {
        L.p(arr_v, "$this$fill");
        kotlin.collections.l.L1(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List e3(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$flatMap");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(list0, ((Iterable)function10.invoke(z0.b(A0.l(arr_b, v1)))));
        }
        return list0;
    }

    public static final int e4(@l long[] arr_v) {
        L.p(arr_v, "$this$lastIndex");
        return kotlin.collections.l.ve(arr_v);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final D0 e5(@l int[] arr_v) {
        L.p(arr_v, "$this$lastOrNull");
        return E0.r(arr_v) ? null : D0.b(E0.l(arr_v, E0.o(arr_v) - 1));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float e6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        float f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double e7(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        double f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] e8(byte[] arr_b, byte b) {
        L.p(arr_b, "$this$plus");
        return A0.d(kotlin.collections.l.e3(arr_b, b));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 e9(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$reduceRightOrNull");
        L.p(o0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = A0.l(arr_b, v);
        while(v1 >= 0) {
            v2 = ((z0)o0.invoke(z0.b(A0.l(arr_b, v1)), z0.b(((byte)v2)))).j0();
            --v1;
        }
        return z0.b(((byte)v2));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int ea(int[] arr_v) {
        L.p(arr_v, "$this$single");
        return D0.h(kotlin.collections.l.ct(arr_v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List eb(@l int[] arr_v) {
        L.p(arr_v, "$this$sorted");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        int[] arr_v2 = E0.d(arr_v1);
        c.Ka(arr_v2);
        return b.a(arr_v2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List ec(@l byte[] arr_b, int v) {
        L.p(arr_b, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= A0.o(arr_b)) {
            return u.V5(A0.b(arr_b));
        }
        if(v == 1) {
            return u.k(z0.b(A0.l(arr_b, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = A0.o(arr_b);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(z0.b(A0.l(arr_b, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List ed(@l long[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "$this$zip");
        L.p(arr_object, "other");
        int v = Math.min(I0.o(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(r0.a(H0.b(v2), object0));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean f0(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$any");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(D0.b(E0.l(arr_v, v1)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    static long[] f1(long[] arr_v, long[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = I0.o(arr_v);
        }
        L.p(arr_v, "$this$copyInto");
        L.p(arr_v1, "destination");
        kotlin.collections.l.A0(arr_v, arr_v1, v, v1, v2);
        return arr_v1;
    }

    public static void f2(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = I0.o(arr_v);
        }
        c.e2(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List f3(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$flatMap");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(list0, ((Iterable)function10.invoke(H0.b(I0.l(arr_v, v1)))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    public static void f4(long[] arr_v) {
    }

    @h0(version = "1.3")
    @t
    @m
    public static final z0 f5(@l byte[] arr_b) {
        L.p(arr_b, "$this$lastOrNull");
        return A0.r(arr_b) ? null : z0.b(A0.l(arr_b, A0.o(arr_b) - 1));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable f6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) < 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float f7(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        float f = ((Number)function10.invoke(H0.b(I0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(H0.b(I0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] f8(byte[] arr_b, byte[] arr_b1) {
        L.p(arr_b, "$this$plus");
        L.p(arr_b1, "elements");
        return A0.d(kotlin.collections.l.g3(arr_b, arr_b1));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 f9(int[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceRightOrNull");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = E0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((D0)o0.invoke(D0.b(E0.l(arr_v, v1)), D0.b(v2))).l0();
            --v1;
        }
        return D0.b(v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte fa(byte[] arr_b) {
        L.p(arr_b, "$this$single");
        return z0.h(kotlin.collections.l.Us(arr_b));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List fb(@l byte[] arr_b) {
        L.p(arr_b, "$this$sorted");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        byte[] arr_b2 = A0.d(arr_b1);
        c.Ra(arr_b2);
        return b.b(arr_b2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List fc(@l short[] arr_v, int v) {
        L.p(arr_v, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= O0.o(arr_v)) {
            return u.V5(O0.b(arr_v));
        }
        if(v == 1) {
            return u.k(N0.b(O0.l(arr_v, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = O0.o(arr_v);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(N0.b(O0.l(arr_v, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List fd(short[] arr_v, short[] arr_v1, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(arr_v1, "other");
        L.p(o0, "transform");
        int v = Math.min(O0.o(arr_v), O0.o(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(N0.b(O0.l(arr_v, v1)), N0.b(O0.l(arr_v1, v1))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean g0(short[] arr_v) {
        L.p(arr_v, "$this$any");
        return kotlin.collections.l.r5(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] g1(short[] arr_v, short[] arr_v1, int v, int v1, int v2) {
        L.p(arr_v, "$this$copyInto");
        L.p(arr_v1, "destination");
        kotlin.collections.l.C0(arr_v, arr_v1, v, v1, v2);
        return arr_v1;
    }

    @h0(version = "1.3")
    @t
    public static final void g2(@l byte[] arr_b, byte b, int v, int v1) {
        L.p(arr_b, "$this$fill");
        kotlin.collections.l.G1(arr_b, b, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List g3(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$flatMap");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(list0, ((Iterable)function10.invoke(D0.b(E0.l(arr_v, v1)))));
        }
        return list0;
    }

    public static final int g4(@l short[] arr_v) {
        L.p(arr_v, "$this$lastIndex");
        return kotlin.collections.l.xe(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final z0 g5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$lastOrNull");
        L.p(function10, "predicate");
        int v = A0.o(arr_b) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = A0.l(arr_b, v);
                if(((Boolean)function10.invoke(z0.b(((byte)v1)))).booleanValue()) {
                    return z0.b(((byte)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double g6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        double f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable g7(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] g8(@l long[] arr_v, @l Collection collection0) {
        L.p(arr_v, "$this$plus");
        L.p(collection0, "elements");
        int v = I0.o(arr_v);
        long[] arr_v1 = Arrays.copyOf(arr_v, I0.o(arr_v) + collection0.size());
        L.o(arr_v1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_v1[v] = ((H0)object0).l0();
            ++v;
        }
        return I0.d(arr_v1);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 g9(long[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceRightOrNull");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        long v2 = I0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((H0)o0.invoke(H0.b(I0.l(arr_v, v1)), H0.b(v2))).l0();
            --v1;
        }
        return H0.b(v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte ga(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$single");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        z0 z00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z00 = z0.b(((byte)v2));
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return z00.j0();
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List gb(@l long[] arr_v) {
        L.p(arr_v, "$this$sorted");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        long[] arr_v2 = I0.d(arr_v1);
        c.Sa(arr_v2);
        return b.c(arr_v2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List gc(@l int[] arr_v, int v) {
        L.p(arr_v, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= E0.o(arr_v)) {
            return u.V5(E0.b(arr_v));
        }
        if(v == 1) {
            return u.k(D0.b(E0.l(arr_v, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = E0.o(arr_v);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(D0.b(E0.l(arr_v, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List gd(short[] arr_v, Iterable iterable0, o o0) {
        L.p(arr_v, "$this$zip");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        int v = O0.o(arr_v);
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), v));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 >= v) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(N0.b(O0.l(arr_v, v1)), object0));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final boolean h0(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$any");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(N0.b(O0.l(arr_v, v1)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    static short[] h1(short[] arr_v, short[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = O0.o(arr_v);
        }
        L.p(arr_v, "$this$copyInto");
        L.p(arr_v1, "destination");
        kotlin.collections.l.C0(arr_v, arr_v1, v, v1, v2);
        return arr_v1;
    }

    public static void h2(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = A0.o(arr_b);
        }
        c.g2(arr_b, b, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List h3(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$flatMap");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(list0, ((Iterable)function10.invoke(N0.b(O0.l(arr_v, v1)))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    public static void h4(short[] arr_v) {
    }

    @h0(version = "1.3")
    @f
    @t
    private static final H0 h5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$lastOrNull");
        L.p(function10, "predicate");
        int v = I0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                long v1 = I0.l(arr_v, v);
                if(((Boolean)function10.invoke(H0.b(v1))).booleanValue()) {
                    return H0.b(v1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float h6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxOfOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        float f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double h7(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        double f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] h8(short[] arr_v, short[] arr_v1) {
        L.p(arr_v, "$this$plus");
        L.p(arr_v1, "elements");
        return O0.d(kotlin.collections.l.B3(arr_v, arr_v1));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final N0 h9(short[] arr_v, o o0) {
        L.p(arr_v, "$this$reduceRightOrNull");
        L.p(o0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = O0.l(arr_v, v);
        while(v1 >= 0) {
            v2 = ((N0)o0.invoke(N0.b(O0.l(arr_v, v1)), N0.b(((short)v2)))).j0();
            --v1;
        }
        return N0.b(((short)v2));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long ha(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$single");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        H0 h00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                h00 = H0.b(v2);
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return h00.l0();
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List hb(@l short[] arr_v) {
        L.p(arr_v, "$this$sorted");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        short[] arr_v2 = O0.d(arr_v1);
        c.Va(arr_v2);
        return b.d(arr_v2);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List hc(@l long[] arr_v, int v) {
        L.p(arr_v, "$this$take");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= I0.o(arr_v)) {
            return u.V5(I0.b(arr_v));
        }
        if(v == 1) {
            return u.k(H0.b(I0.l(arr_v, 0)));
        }
        List list0 = new ArrayList(v);
        int v2 = I0.o(arr_v);
        int v3 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((ArrayList)list0).add(H0.b(I0.l(arr_v, v1)));
            ++v3;
            if(v3 == v) {
                break;
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List hd(@l byte[] arr_b, @l byte[] arr_b1) {
        L.p(arr_b, "$this$zip");
        L.p(arr_b1, "other");
        int v = Math.min(A0.o(arr_b), A0.o(arr_b1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            int v3 = A0.l(arr_b1, v1);
            ((ArrayList)list0).add(r0.a(z0.b(((byte)v2)), z0.b(((byte)v3))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] i0(byte[] arr_b) {
        L.p(arr_b, "$this$asByteArray");
        return arr_b;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] i1(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2) {
        L.p(arr_b, "$this$copyInto");
        L.p(arr_b1, "destination");
        kotlin.collections.l.v0(arr_b, arr_b1, v, v1, v2);
        return arr_b1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List i2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$filter");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                list0.add(z0.b(((byte)v2)));
            }
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final List i3(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$flatMapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(list0, ((Iterable)o0.invoke(v2, z0.b(A0.l(arr_b, v1)))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short i4(short[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "$this$getOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= O0.o(arr_v) ? ((N0)function10.invoke(v)).j0() : O0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final H0 i5(@l long[] arr_v) {
        L.p(arr_v, "$this$lastOrNull");
        return I0.r(arr_v) ? null : H0.b(I0.l(arr_v, I0.o(arr_v) - 1));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object i6(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$maxOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float i7(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        float f = ((Number)function10.invoke(D0.b(E0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(D0.b(E0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] i8(@l short[] arr_v, @l Collection collection0) {
        L.p(arr_v, "$this$plus");
        L.p(collection0, "elements");
        int v = O0.o(arr_v);
        short[] arr_v1 = Arrays.copyOf(arr_v, O0.o(arr_v) + collection0.size());
        L.o(arr_v1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_v1[v] = ((N0)object0).j0();
            ++v;
        }
        return O0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void i9(int[] arr_v) {
        L.p(arr_v, "$this$reverse");
        kotlin.collections.l.Yq(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long ia(long[] arr_v) {
        L.p(arr_v, "$this$single");
        return H0.h(kotlin.collections.l.et(arr_v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] ib(@l int[] arr_v) {
        L.p(arr_v, "$this$sortedArray");
        if(E0.r(arr_v)) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        int[] arr_v2 = E0.d(arr_v1);
        c.Ka(arr_v2);
        return arr_v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List ic(@l byte[] arr_b, int v) {
        L.p(arr_b, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        int v1 = A0.o(arr_b);
        if(v >= v1) {
            return u.V5(A0.b(arr_b));
        }
        if(v == 1) {
            return u.k(z0.b(A0.l(arr_b, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(z0.b(A0.l(arr_b, v2)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List id(@l short[] arr_v, @l short[] arr_v1) {
        L.p(arr_v, "$this$zip");
        L.p(arr_v1, "other");
        int v = Math.min(O0.o(arr_v), O0.o(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            int v3 = O0.l(arr_v1, v1);
            ((ArrayList)list0).add(r0.a(N0.b(((short)v2)), N0.b(((short)v3))));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] j0(int[] arr_v) {
        L.p(arr_v, "$this$asIntArray");
        return arr_v;
    }

    static byte[] j1(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = A0.o(arr_b);
        }
        L.p(arr_b, "$this$copyInto");
        L.p(arr_b1, "destination");
        kotlin.collections.l.v0(arr_b, arr_b1, v, v1, v2);
        return arr_b1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List j2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$filter");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                list0.add(H0.b(v2));
            }
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final List j3(int[] arr_v, o o0) {
        L.p(arr_v, "$this$flatMapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(list0, ((Iterable)o0.invoke(v2, D0.b(E0.l(arr_v, v1)))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int j4(int[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "$this$getOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= E0.o(arr_v) ? ((D0)function10.invoke(v)).l0() : E0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final D0 j5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$lastOrNull");
        L.p(function10, "predicate");
        int v = E0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = E0.l(arr_v, v);
                if(((Boolean)function10.invoke(D0.b(v1))).booleanValue()) {
                    return D0.b(v1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object j6(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "$this$maxOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Comparable j7(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] j8(int[] arr_v, int v) {
        L.p(arr_v, "$this$plus");
        return E0.d(kotlin.collections.l.q3(arr_v, v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final void j9(long[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$reverse");
        kotlin.collections.l.br(arr_v, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int ja(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$single");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        D0 d00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                d00 = D0.b(v2);
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return d00.l0();
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] jb(@l byte[] arr_b) {
        L.p(arr_b, "$this$sortedArray");
        if(A0.r(arr_b)) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        byte[] arr_b2 = A0.d(arr_b1);
        c.Ra(arr_b2);
        return arr_b2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List jc(@l short[] arr_v, int v) {
        L.p(arr_v, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        int v1 = O0.o(arr_v);
        if(v >= v1) {
            return u.V5(O0.b(arr_v));
        }
        if(v == 1) {
            return u.k(N0.b(O0.l(arr_v, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(N0.b(O0.l(arr_v, v2)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List jd(@l byte[] arr_b, @l Object[] arr_object) {
        L.p(arr_b, "$this$zip");
        L.p(arr_object, "other");
        int v = Math.min(A0.o(arr_b), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(r0.a(z0.b(((byte)v2)), object0));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] k0(long[] arr_v) {
        L.p(arr_v, "$this$asLongArray");
        return arr_v;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] k1(int[] arr_v, int[] arr_v1, int v, int v1, int v2) {
        L.p(arr_v, "$this$copyInto");
        L.p(arr_v1, "destination");
        kotlin.collections.l.z0(arr_v, arr_v1, v, v1, v2);
        return arr_v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List k2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$filter");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                list0.add(D0.b(v2));
            }
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final List k3(long[] arr_v, o o0) {
        L.p(arr_v, "$this$flatMapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(list0, ((Iterable)o0.invoke(v2, H0.b(I0.l(arr_v, v1)))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long k4(long[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "$this$getOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= I0.o(arr_v) ? ((H0)function10.invoke(v)).l0() : I0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final N0 k5(@l short[] arr_v) {
        L.p(arr_v, "$this$lastOrNull");
        return O0.r(arr_v) ? null : N0.b(O0.l(arr_v, O0.o(arr_v) - 1));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object k6(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$maxOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Double k7(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        double f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] k8(long[] arr_v, long[] arr_v1) {
        L.p(arr_v, "$this$plus");
        L.p(arr_v1, "elements");
        return I0.d(kotlin.collections.l.v3(arr_v, arr_v1));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final void k9(byte[] arr_b, int v, int v1) {
        L.p(arr_b, "$this$reverse");
        kotlin.collections.l.Rq(arr_b, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short ka(short[] arr_v) {
        L.p(arr_v, "$this$single");
        return N0.h(kotlin.collections.l.jt(arr_v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] kb(@l long[] arr_v) {
        L.p(arr_v, "$this$sortedArray");
        if(I0.r(arr_v)) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        long[] arr_v2 = I0.d(arr_v1);
        c.Sa(arr_v2);
        return arr_v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List kc(@l int[] arr_v, int v) {
        L.p(arr_v, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        int v1 = E0.o(arr_v);
        if(v >= v1) {
            return u.V5(E0.b(arr_v));
        }
        if(v == 1) {
            return u.k(D0.b(E0.l(arr_v, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(D0.b(E0.l(arr_v, v2)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List kd(@l short[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "$this$zip");
        L.p(arr_object, "other");
        int v = Math.min(O0.o(arr_v), arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            Object object0 = arr_object[v1];
            ((ArrayList)list0).add(r0.a(N0.b(((short)v2)), object0));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] l0(short[] arr_v) {
        L.p(arr_v, "$this$asShortArray");
        return arr_v;
    }

    static int[] l1(int[] arr_v, int[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = E0.o(arr_v);
        }
        L.p(arr_v, "$this$copyInto");
        L.p(arr_v1, "destination");
        kotlin.collections.l.z0(arr_v, arr_v1, v, v1, v2);
        return arr_v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List l2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$filter");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                list0.add(N0.b(((short)v2)));
            }
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final List l3(short[] arr_v, o o0) {
        L.p(arr_v, "$this$flatMapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(list0, ((Iterable)o0.invoke(v2, N0.b(O0.l(arr_v, v1)))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte l4(byte[] arr_b, int v, Function1 function10) {
        L.p(arr_b, "$this$getOrElse");
        L.p(function10, "defaultValue");
        return v < 0 || v >= A0.o(arr_b) ? ((z0)function10.invoke(v)).j0() : A0.l(arr_b, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final N0 l5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$lastOrNull");
        L.p(function10, "predicate");
        int v = O0.o(arr_v) - 1;
        if(v >= 0) {
            while(true) {
                int v1 = O0.l(arr_v, v);
                if(((Boolean)function10.invoke(N0.b(((short)v1)))).booleanValue()) {
                    return N0.b(((short)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object l6(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$maxOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Float l7(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minOfOrNull");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        float f = ((Number)function10.invoke(N0.b(O0.l(arr_v, 0)))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(N0.b(O0.l(arr_v, v1)))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] l8(@l byte[] arr_b, @l Collection collection0) {
        L.p(arr_b, "$this$plus");
        L.p(collection0, "elements");
        int v = A0.o(arr_b);
        byte[] arr_b1 = Arrays.copyOf(arr_b, A0.o(arr_b) + collection0.size());
        L.o(arr_b1, "copyOf(...)");
        for(Object object0: collection0) {
            arr_b1[v] = ((z0)object0).j0();
            ++v;
        }
        return A0.d(arr_b1);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final void l9(short[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$reverse");
        kotlin.collections.l.fr(arr_v, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short la(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$single");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        N0 n00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                n00 = N0.b(((short)v2));
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return n00.j0();
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] lb(@l short[] arr_v) {
        L.p(arr_v, "$this$sortedArray");
        if(O0.r(arr_v)) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        short[] arr_v2 = O0.d(arr_v1);
        c.Va(arr_v2);
        return arr_v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List lc(@l long[] arr_v, int v) {
        L.p(arr_v, "$this$takeLast");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        int v1 = I0.o(arr_v);
        if(v >= v1) {
            return u.V5(I0.b(arr_v));
        }
        if(v == 1) {
            return u.k(H0.b(I0.l(arr_v, v1 - 1)));
        }
        List list0 = new ArrayList(v);
        for(int v2 = v1 - v; v2 < v1; ++v2) {
            ((ArrayList)list0).add(H0.b(I0.l(arr_v, v2)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List ld(@l long[] arr_v, @l long[] arr_v1) {
        L.p(arr_v, "$this$zip");
        L.p(arr_v1, "other");
        int v = Math.min(I0.o(arr_v), I0.o(arr_v1));
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            long v3 = I0.l(arr_v1, v1);
            ((ArrayList)list0).add(r0.a(H0.b(v2), H0.b(v3)));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] m0(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return A0.d(arr_b);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] m1(int[] arr_v) {
        L.p(arr_v, "$this$copyOf");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return E0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List m2(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$filterIndexed");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = A0.l(arr_b, v1);
            if(((Boolean)o0.invoke(v2, z0.b(((byte)v3)))).booleanValue()) {
                list0.add(z0.b(((byte)v3)));
            }
            ++v1;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Collection m3(int[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$flatMapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(collection0, ((Iterable)o0.invoke(v2, D0.b(E0.l(arr_v, v1)))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @t
    @m
    public static final z0 m4(@l byte[] arr_b, int v) {
        L.p(arr_b, "$this$getOrNull");
        return v < 0 || v >= A0.o(arr_b) ? null : z0.b(A0.l(arr_b, v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List m5(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$map");
        L.p(function10, "transform");
        List list0 = new ArrayList(A0.o(arr_b));
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(function10.invoke(z0.b(A0.l(arr_b, v1))));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object m6(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$maxOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        Object object0 = function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object m7(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$minOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int m8(int[] arr_v) {
        L.p(arr_v, "$this$random");
        return c.n8(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void m9(byte[] arr_b) {
        L.p(arr_b, "$this$reverse");
        kotlin.collections.l.Qq(arr_b);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final D0 ma(@l int[] arr_v) {
        L.p(arr_v, "$this$singleOrNull");
        return E0.o(arr_v) == 1 ? D0.b(E0.l(arr_v, 0)) : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] mb(@l int[] arr_v) {
        L.p(arr_v, "$this$sortedArrayDescending");
        if(E0.r(arr_v)) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        int[] arr_v2 = E0.d(arr_v1);
        c.Wa(arr_v2);
        return arr_v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List mc(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$takeLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.qe(arr_b); -1 < v; --v) {
            if(!((Boolean)function10.invoke(z0.b(A0.l(arr_b, v)))).booleanValue()) {
                return c.C1(arr_b, v + 1);
            }
        }
        return u.V5(A0.b(arr_b));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] n0(int[] arr_v) {
        L.p(arr_v, "<this>");
        return E0.d(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] n1(byte[] arr_b) {
        L.p(arr_b, "$this$copyOf");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        return A0.d(arr_b1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List n2(int[] arr_v, o o0) {
        L.p(arr_v, "$this$filterIndexed");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = E0.l(arr_v, v1);
            if(((Boolean)o0.invoke(v2, D0.b(v3))).booleanValue()) {
                list0.add(D0.b(v3));
            }
            ++v1;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Collection n3(short[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$flatMapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(collection0, ((Iterable)o0.invoke(v2, N0.b(O0.l(arr_v, v1)))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @t
    @m
    public static final N0 n4(@l short[] arr_v, int v) {
        L.p(arr_v, "$this$getOrNull");
        return v < 0 || v >= O0.o(arr_v) ? null : N0.b(O0.l(arr_v, v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List n5(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$map");
        L.p(function10, "transform");
        List list0 = new ArrayList(I0.o(arr_v));
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(function10.invoke(H0.b(I0.l(arr_v, v1))));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object n6(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "$this$maxOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        Object object0 = function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object n7(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "$this$minOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @t
    public static final int n8(@l int[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$random");
        L.p(f0, "random");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return E0.l(arr_v, f0.m(E0.o(arr_v)));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void n9(long[] arr_v) {
        L.p(arr_v, "$this$reverse");
        kotlin.collections.l.ar(arr_v);
    }

    @h0(version = "1.3")
    @t
    @m
    public static final z0 na(@l byte[] arr_b) {
        L.p(arr_b, "$this$singleOrNull");
        return A0.o(arr_b) == 1 ? z0.b(A0.l(arr_b, 0)) : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] nb(@l byte[] arr_b) {
        L.p(arr_b, "$this$sortedArrayDescending");
        if(A0.r(arr_b)) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        byte[] arr_b2 = A0.d(arr_b1);
        c.ab(arr_b2);
        return arr_b2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List nc(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$takeLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ve(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(H0.b(I0.l(arr_v, v)))).booleanValue()) {
                return c.F1(arr_v, v + 1);
            }
        }
        return u.V5(I0.b(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] o0(long[] arr_v) {
        L.p(arr_v, "<this>");
        return I0.d(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] o1(byte[] arr_b, int v) {
        L.p(arr_b, "$this$copyOf");
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        L.o(arr_b1, "copyOf(...)");
        return A0.d(arr_b1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List o2(long[] arr_v, o o0) {
        L.p(arr_v, "$this$filterIndexed");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            long v3 = I0.l(arr_v, v1);
            if(((Boolean)o0.invoke(v2, H0.b(v3))).booleanValue()) {
                list0.add(H0.b(v3));
            }
            ++v1;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Collection o3(byte[] arr_b, Collection collection0, o o0) {
        L.p(arr_b, "$this$flatMapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(collection0, ((Iterable)o0.invoke(v2, z0.b(A0.l(arr_b, v1)))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @t
    @m
    public static final D0 o4(@l int[] arr_v, int v) {
        L.p(arr_v, "$this$getOrNull");
        return v < 0 || v >= E0.o(arr_v) ? null : D0.b(E0.l(arr_v, v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List o5(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$map");
        L.p(function10, "transform");
        List list0 = new ArrayList(E0.o(arr_v));
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(function10.invoke(D0.b(E0.l(arr_v, v1))));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object o6(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$maxOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        Object object0 = function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object o7(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$minOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte o8(byte[] arr_b) {
        L.p(arr_b, "$this$random");
        return c.r8(arr_b, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final void o9(int[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$reverse");
        kotlin.collections.l.Zq(arr_v, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final z0 oa(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$singleOrNull");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        z0 z00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                if(z) {
                    return null;
                }
                z00 = z0.b(((byte)v2));
                z = true;
            }
        }
        return z ? z00 : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] ob(@l long[] arr_v) {
        L.p(arr_v, "$this$sortedArrayDescending");
        if(I0.r(arr_v)) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        long[] arr_v2 = I0.d(arr_v1);
        c.bb(arr_v2);
        return arr_v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List oc(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$takeLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ue(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(D0.b(E0.l(arr_v, v)))).booleanValue()) {
                return c.E1(arr_v, v + 1);
            }
        }
        return u.V5(E0.b(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] p0(short[] arr_v) {
        L.p(arr_v, "<this>");
        return O0.d(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] p1(long[] arr_v) {
        L.p(arr_v, "$this$copyOf");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return I0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List p2(short[] arr_v, o o0) {
        L.p(arr_v, "$this$filterIndexed");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = O0.l(arr_v, v1);
            if(((Boolean)o0.invoke(v2, N0.b(((short)v3)))).booleanValue()) {
                list0.add(N0.b(((short)v3)));
            }
            ++v1;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Collection p3(long[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$flatMapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            u.q0(collection0, ((Iterable)o0.invoke(v2, H0.b(I0.l(arr_v, v1)))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @t
    @m
    public static final H0 p4(@l long[] arr_v, int v) {
        L.p(arr_v, "$this$getOrNull");
        return v < 0 || v >= I0.o(arr_v) ? null : H0.b(I0.l(arr_v, v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List p5(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$map");
        L.p(function10, "transform");
        List list0 = new ArrayList(O0.o(arr_v));
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(function10.invoke(N0.b(O0.l(arr_v, v1))));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object p6(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$maxOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        Object object0 = function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object p7(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$minOfWith");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @t
    public static final long p8(@l long[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$random");
        L.p(f0, "random");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return I0.l(arr_v, f0.m(I0.o(arr_v)));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final void p9(short[] arr_v) {
        L.p(arr_v, "$this$reverse");
        kotlin.collections.l.er(arr_v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final H0 pa(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$singleOrNull");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        H0 h00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                if(z) {
                    return null;
                }
                h00 = H0.b(v2);
                z = true;
            }
        }
        return z ? h00 : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] pb(@l short[] arr_v) {
        L.p(arr_v, "$this$sortedArrayDescending");
        if(O0.r(arr_v)) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        short[] arr_v2 = O0.d(arr_v1);
        c.db(arr_v2);
        return arr_v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List pc(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$takeLastWhile");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.xe(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(N0.b(O0.l(arr_v, v)))).booleanValue()) {
                return c.D1(arr_v, v + 1);
            }
        }
        return u.V5(O0.b(arr_v));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map q0(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$associateWith");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(s.u(Y.j(A0.o(arr_b)), 16));
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            map0.put(z0.b(((byte)v2)), function10.invoke(z0.b(((byte)v2))));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] q1(short[] arr_v, int v) {
        L.p(arr_v, "$this$copyOf");
        short[] arr_v1 = Arrays.copyOf(arr_v, v);
        L.o(arr_v1, "copyOf(...)");
        return O0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection q2(int[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$filterIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = E0.l(arr_v, v1);
            if(((Boolean)o0.invoke(v2, D0.b(v3))).booleanValue()) {
                collection0.add(D0.b(v3));
            }
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection q3(long[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$flatMapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(collection0, ((Iterable)function10.invoke(H0.b(I0.l(arr_v, v1)))));
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map q4(long[] arr_v, Function1 function10, Function1 function11) {
        L.p(arr_v, "$this$groupBy");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            Object object0 = function10.invoke(H0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(H0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List q5(byte[] arr_b, o o0) {
        L.p(arr_b, "$this$mapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList(A0.o(arr_b));
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            list0.add(o0.invoke(v2, z0.b(A0.l(arr_b, v1))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final D0 q6(@l int[] arr_v) {
        L.p(arr_v, "$this$maxOrNull");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(y0.a(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object q7(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$minOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        Object object0 = function10.invoke(H0.b(I0.l(arr_v, 0)));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(H0.b(I0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long q8(long[] arr_v) {
        L.p(arr_v, "$this$random");
        return c.p8(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List q9(@l int[] arr_v) {
        L.p(arr_v, "$this$reversed");
        if(E0.r(arr_v)) {
            return u.H();
        }
        List list0 = u.Y5(E0.b(arr_v));
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.3")
    @t
    @m
    public static final H0 qa(@l long[] arr_v) {
        L.p(arr_v, "$this$singleOrNull");
        return I0.o(arr_v) == 1 ? H0.b(I0.l(arr_v, 0)) : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List qb(@l int[] arr_v) {
        L.p(arr_v, "$this$sortedDescending");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        int[] arr_v2 = E0.d(arr_v1);
        c.Ka(arr_v2);
        return c.q9(arr_v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List qc(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$takeWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(!((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(z0.b(((byte)v2)));
        }
        return list0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map r0(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$associateWith");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(s.u(Y.j(I0.o(arr_v)), 16));
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            map0.put(H0.b(v2), function10.invoke(H0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] r1(int[] arr_v, int v) {
        L.p(arr_v, "$this$copyOf");
        int[] arr_v1 = Arrays.copyOf(arr_v, v);
        L.o(arr_v1, "copyOf(...)");
        return E0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection r2(short[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$filterIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = O0.l(arr_v, v1);
            if(((Boolean)o0.invoke(v2, N0.b(((short)v3)))).booleanValue()) {
                collection0.add(N0.b(((short)v3)));
            }
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection r3(short[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$flatMapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(collection0, ((Iterable)function10.invoke(N0.b(O0.l(arr_v, v1)))));
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map r4(short[] arr_v, Function1 function10, Function1 function11) {
        L.p(arr_v, "$this$groupBy");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            Object object0 = function10.invoke(N0.b(((short)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(N0.b(((short)v2))));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List r5(int[] arr_v, o o0) {
        L.p(arr_v, "$this$mapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList(E0.o(arr_v));
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            list0.add(o0.invoke(v2, D0.b(E0.l(arr_v, v1))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final z0 r6(@l byte[] arr_b) {
        L.p(arr_b, "$this$maxOrNull");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = A0.l(arr_b, v2);
                if(L.t(v & 0xFF, v3 & 0xFF) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object r7(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "$this$minOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        Object object0 = function10.invoke(z0.b(A0.l(arr_b, 0)));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(z0.b(A0.l(arr_b, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @t
    public static final byte r8(@l byte[] arr_b, @l kotlin.random.f f0) {
        L.p(arr_b, "$this$random");
        L.p(f0, "random");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return A0.l(arr_b, f0.m(A0.o(arr_b)));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List r9(@l byte[] arr_b) {
        L.p(arr_b, "$this$reversed");
        if(A0.r(arr_b)) {
            return u.H();
        }
        List list0 = u.Y5(A0.b(arr_b));
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final D0 ra(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$singleOrNull");
        L.p(function10, "predicate");
        int v = E0.o(arr_v);
        D0 d00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                if(z) {
                    return null;
                }
                d00 = D0.b(v2);
                z = true;
            }
        }
        return z ? d00 : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List rb(@l byte[] arr_b) {
        L.p(arr_b, "$this$sortedDescending");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        byte[] arr_b2 = A0.d(arr_b1);
        c.Ra(arr_b2);
        return c.r9(arr_b2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List rc(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$takeWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(H0.b(v2));
        }
        return list0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map s0(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$associateWith");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(s.u(Y.j(E0.o(arr_v)), 16));
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            map0.put(D0.b(v2), function10.invoke(D0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] s1(long[] arr_v, int v) {
        L.p(arr_v, "$this$copyOf");
        long[] arr_v1 = Arrays.copyOf(arr_v, v);
        L.o(arr_v1, "copyOf(...)");
        return I0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection s2(byte[] arr_b, Collection collection0, o o0) {
        L.p(arr_b, "$this$filterIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = A0.l(arr_b, v1);
            if(((Boolean)o0.invoke(v2, z0.b(((byte)v3)))).booleanValue()) {
                collection0.add(z0.b(((byte)v3)));
            }
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection s3(int[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$flatMapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(collection0, ((Iterable)function10.invoke(D0.b(E0.l(arr_v, v1)))));
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map s4(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$groupBy");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            Object object0 = function10.invoke(z0.b(((byte)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(z0.b(((byte)v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List s5(long[] arr_v, o o0) {
        L.p(arr_v, "$this$mapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList(I0.o(arr_v));
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            list0.add(o0.invoke(v2, H0.b(I0.l(arr_v, v1))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final H0 s6(@l long[] arr_v) {
        L.p(arr_v, "$this$maxOrNull");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(androidx.collection.b.a(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object s7(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$minOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        Object object0 = function10.invoke(N0.b(O0.l(arr_v, 0)));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(N0.b(O0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short s8(short[] arr_v) {
        L.p(arr_v, "$this$random");
        return c.t8(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List s9(@l long[] arr_v) {
        L.p(arr_v, "$this$reversed");
        if(I0.r(arr_v)) {
            return u.H();
        }
        List list0 = u.Y5(I0.b(arr_v));
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.3")
    @t
    @m
    public static final N0 sa(@l short[] arr_v) {
        L.p(arr_v, "$this$singleOrNull");
        return O0.o(arr_v) == 1 ? N0.b(O0.l(arr_v, 0)) : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List sb(@l long[] arr_v) {
        L.p(arr_v, "$this$sortedDescending");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        long[] arr_v2 = I0.d(arr_v1);
        c.Sa(arr_v2);
        return c.s9(arr_v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List sc(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$takeWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(D0.b(v2));
        }
        return list0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map t0(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$associateWith");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(s.u(Y.j(O0.o(arr_v)), 16));
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            map0.put(N0.b(((short)v2)), function10.invoke(N0.b(((short)v2))));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] t1(short[] arr_v) {
        L.p(arr_v, "$this$copyOf");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return O0.d(arr_v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection t2(long[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$filterIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            long v3 = I0.l(arr_v, v1);
            if(((Boolean)o0.invoke(v2, H0.b(v3))).booleanValue()) {
                collection0.add(H0.b(v3));
            }
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection t3(byte[] arr_b, Collection collection0, Function1 function10) {
        L.p(arr_b, "$this$flatMapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(collection0, ((Iterable)function10.invoke(z0.b(A0.l(arr_b, v1)))));
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map t4(int[] arr_v, Function1 function10, Function1 function11) {
        L.p(arr_v, "$this$groupBy");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            Object object0 = function10.invoke(D0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(D0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List t5(short[] arr_v, o o0) {
        L.p(arr_v, "$this$mapIndexed");
        L.p(o0, "transform");
        List list0 = new ArrayList(O0.o(arr_v));
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            list0.add(o0.invoke(v2, N0.b(O0.l(arr_v, v1))));
            ++v1;
        }
        return list0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final N0 t6(@l short[] arr_v) {
        L.p(arr_v, "$this$maxOrNull");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = O0.l(arr_v, v2);
                if(L.t(v & 0xFFFF, 0xFFFF & v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    private static final Object t7(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "$this$minOfWithOrNull");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        Object object0 = function10.invoke(D0.b(E0.l(arr_v, 0)));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(D0.b(E0.l(arr_v, v1)));
                if(comparator0.compare(object0, object1) > 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @t
    public static final short t8(@l short[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$random");
        L.p(f0, "random");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return O0.l(arr_v, f0.m(O0.o(arr_v)));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List t9(@l short[] arr_v) {
        L.p(arr_v, "$this$reversed");
        if(O0.r(arr_v)) {
            return u.H();
        }
        List list0 = u.Y5(O0.b(arr_v));
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final N0 ta(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$singleOrNull");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        N0 n00 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                if(z) {
                    return null;
                }
                n00 = N0.b(((short)v2));
                z = true;
            }
        }
        return z ? n00 : null;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List tb(@l short[] arr_v) {
        L.p(arr_v, "$this$sortedDescending");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        short[] arr_v2 = O0.d(arr_v1);
        c.Va(arr_v2);
        return c.t9(arr_v2);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List tc(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$takeWhile");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(N0.b(((short)v2)));
        }
        return list0;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map u0(int[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "$this$associateWithTo");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            map0.put(D0.b(v2), function10.invoke(D0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] u1(long[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$copyOfRange");
        return I0.d(kotlin.collections.l.k1(arr_v, v, v1));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List u2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$filterNot");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            if(!((Boolean)function10.invoke(z0.b(((byte)v2)))).booleanValue()) {
                list0.add(z0.b(((byte)v2)));
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object u3(long[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$fold");
        L.p(o0, "operation");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, H0.b(I0.l(arr_v, v1)));
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map u4(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$groupBy");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            Object object0 = function10.invoke(H0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(H0.b(v2));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection u5(int[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$mapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = E0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            collection0.add(o0.invoke(v2, D0.b(E0.l(arr_v, v1))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxOrThrow-U")
    public static final byte u6(@l byte[] arr_b) {
        L.p(arr_b, "$this$max");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = A0.l(arr_b, v1);
                if(L.t(b & 0xFF, b1 & 0xFF) < 0) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final D0 u7(@l int[] arr_v) {
        L.p(arr_v, "$this$minOrNull");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(y0.a(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final D0 u8(int[] arr_v) {
        L.p(arr_v, "$this$randomOrNull");
        return c.v8(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] u9(int[] arr_v) {
        L.p(arr_v, "$this$reversedArray");
        return E0.d(kotlin.collections.l.vr(arr_v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List ua(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "$this$slice");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(H0.b(I0.l(arr_v, ((Number)object0).intValue())));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int ub(int[] arr_v) {
        L.p(arr_v, "$this$sum");
        return D0.h(kotlin.collections.l.bw(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] uc(byte[] arr_b) {
        L.p(arr_b, "$this$toByteArray");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        return arr_b1;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map v0(byte[] arr_b, Map map0, Function1 function10) {
        L.p(arr_b, "$this$associateWithTo");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            map0.put(z0.b(((byte)v2)), function10.invoke(z0.b(((byte)v2))));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] v1(byte[] arr_b, int v, int v1) {
        L.p(arr_b, "$this$copyOfRange");
        return A0.d(kotlin.collections.l.f1(arr_b, v, v1));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List v2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$filterNot");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                list0.add(H0.b(v2));
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object v3(byte[] arr_b, Object object0, o o0) {
        L.p(arr_b, "$this$fold");
        L.p(o0, "operation");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, z0.b(A0.l(arr_b, v1)));
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map v4(byte[] arr_b, Function1 function10, Function1 function11) {
        L.p(arr_b, "$this$groupBy");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            Object object0 = function10.invoke(z0.b(((byte)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(z0.b(((byte)v2))));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection v5(short[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$mapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            collection0.add(o0.invoke(v2, N0.b(O0.l(arr_v, v1))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxOrThrow-U")
    public static final int v6(@l int[] arr_v) {
        L.p(arr_v, "$this$max");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(y0.a(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final z0 v7(@l byte[] arr_b) {
        L.p(arr_b, "$this$minOrNull");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = A0.l(arr_b, v2);
                if(L.t(v & 0xFF, v3 & 0xFF) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.4")
    @t
    @m
    public static final D0 v8(@l int[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$randomOrNull");
        L.p(f0, "random");
        return E0.r(arr_v) ? null : D0.b(E0.l(arr_v, f0.m(E0.o(arr_v))));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte[] v9(byte[] arr_b) {
        L.p(arr_b, "$this$reversedArray");
        return A0.d(kotlin.collections.l.rr(arr_b));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List va(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "$this$slice");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(D0.b(E0.l(arr_v, ((Number)object0).intValue())));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int vb(byte[] arr_b) {
        L.p(arr_b, "$this$sum");
        int v1 = 0;
        int v2 = A0.o(arr_b);
        for(int v = 0; v < v2; ++v) {
            v1 = D0.h(v1 + D0.h(A0.l(arr_b, v) & 0xFF));
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] vc(int[] arr_v) {
        L.p(arr_v, "$this$toIntArray");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map w0(long[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "$this$associateWithTo");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            map0.put(H0.b(v2), function10.invoke(H0.b(v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] w1(short[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$copyOfRange");
        return O0.d(kotlin.collections.l.m1(arr_v, v, v1));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List w2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$filterNot");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(D0.b(v2))).booleanValue()) {
                list0.add(D0.b(v2));
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object w3(int[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$fold");
        L.p(o0, "operation");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, D0.b(E0.l(arr_v, v1)));
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map w4(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$groupBy");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            Object object0 = function10.invoke(D0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(D0.b(v2));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection w5(byte[] arr_b, Collection collection0, o o0) {
        L.p(arr_b, "$this$mapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            collection0.add(o0.invoke(v2, z0.b(A0.l(arr_b, v1))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxOrThrow-U")
    public static final long w6(@l long[] arr_v) {
        L.p(arr_v, "$this$max");
        if(I0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(androidx.collection.b.a(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final H0 w7(@l long[] arr_v) {
        L.p(arr_v, "$this$minOrNull");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = I0.l(arr_v, v2);
                if(androidx.collection.b.a(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final z0 w8(byte[] arr_b) {
        L.p(arr_b, "$this$randomOrNull");
        return c.z8(arr_b, kotlin.random.f.a);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] w9(long[] arr_v) {
        L.p(arr_v, "$this$reversedArray");
        return I0.d(kotlin.collections.l.wr(arr_v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List wa(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "$this$slice");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(N0.b(O0.l(arr_v, ((Number)object0).intValue())));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long wb(long[] arr_v) {
        L.p(arr_v, "$this$sum");
        return H0.h(kotlin.collections.l.dw(arr_v));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long[] wc(long[] arr_v) {
        L.p(arr_v, "$this$toLongArray");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final Map x0(short[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "$this$associateWithTo");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            map0.put(N0.b(((short)v2)), function10.invoke(N0.b(((short)v2))));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int[] x1(int[] arr_v, int v, int v1) {
        L.p(arr_v, "$this$copyOfRange");
        return E0.d(kotlin.collections.l.j1(arr_v, v, v1));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final List x2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$filterNot");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                list0.add(N0.b(((short)v2)));
            }
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object x3(short[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$fold");
        L.p(o0, "operation");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, N0.b(O0.l(arr_v, v1)));
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map x4(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$groupBy");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            Object object0 = function10.invoke(N0.b(((short)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(N0.b(((short)v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection x5(long[] arr_v, Collection collection0, o o0) {
        L.p(arr_v, "$this$mapIndexedTo");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = I0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            collection0.add(o0.invoke(v2, H0.b(I0.l(arr_v, v1))));
            ++v1;
        }
        return collection0;
    }

    @h0(version = "1.7")
    @t
    @i(name = "maxOrThrow-U")
    public static final short x6(@l short[] arr_v) {
        L.p(arr_v, "$this$max");
        if(O0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        short v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = O0.l(arr_v, v2);
                if(L.t(v & 0xFFFF, 0xFFFF & v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final N0 x7(@l short[] arr_v) {
        L.p(arr_v, "$this$minOrNull");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = O0.l(arr_v, v2);
                if(L.t(v & 0xFFFF, 0xFFFF & v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.4")
    @t
    @m
    public static final H0 x8(@l long[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "$this$randomOrNull");
        L.p(f0, "random");
        return I0.r(arr_v) ? null : H0.b(I0.l(arr_v, f0.m(I0.o(arr_v))));
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] x9(short[] arr_v) {
        L.p(arr_v, "$this$reversedArray");
        return O0.d(kotlin.collections.l.yr(arr_v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List xa(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "$this$slice");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(z0.b(A0.l(arr_b, ((Number)object0).intValue())));
        }
        return list0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int xb(short[] arr_v) {
        L.p(arr_v, "$this$sum");
        int v1 = 0;
        int v2 = O0.o(arr_v);
        for(int v = 0; v < v2; ++v) {
            v1 = D0.h(v1 + D0.h(O0.l(arr_v, v) & 0xFFFF));
        }
        return v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short[] xc(short[] arr_v) {
        L.p(arr_v, "$this$toShortArray");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int y0(int[] arr_v) {
        L.p(arr_v, "$this$component1");
        return E0.l(arr_v, 0);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int y1(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$count");
        L.p(function10, "predicate");
        int v = A0.o(arr_b);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(z0.b(A0.l(arr_b, v1)))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection y2(long[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$filterNotTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = I0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(H0.b(v2))).booleanValue()) {
                collection0.add(H0.b(v2));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object y3(byte[] arr_b, Object object0, p p0) {
        L.p(arr_b, "$this$foldIndexed");
        L.p(p0, "operation");
        int v = A0.o(arr_b);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            object0 = p0.invoke(v2, object0, z0.b(A0.l(arr_b, v1)));
            ++v1;
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map y4(int[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = E0.l(arr_v, v1);
            Object object0 = function10.invoke(D0.b(v2));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(D0.b(v2));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection y5(long[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$mapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(H0.b(I0.l(arr_v, v1))));
        }
        return collection0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final z0 y6(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "$this$maxWithOrNull");
        L.p(comparator0, "comparator");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = A0.l(arr_b, v2);
                if(comparator0.compare(z0.b(((byte)v)), z0.b(((byte)v3))) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.7")
    @t
    @i(name = "minOrThrow-U")
    public static final byte y7(@l byte[] arr_b) {
        L.p(arr_b, "$this$min");
        if(A0.r(arr_b)) {
            throw new NoSuchElementException();
        }
        byte b = A0.l(arr_b, 0);
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = A0.l(arr_b, v1);
                if(L.t(b & 0xFF, b1 & 0xFF) > 0) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @f
    @t
    private static final H0 y8(long[] arr_v) {
        L.p(arr_v, "$this$randomOrNull");
        return c.x8(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List y9(long[] arr_v, Object object0, o o0) {
        L.p(arr_v, "$this$runningFold");
        L.p(o0, "operation");
        if(I0.r(arr_v)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(I0.o(arr_v) + 1);
        ((ArrayList)list0).add(object0);
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, H0.b(I0.l(arr_v, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List ya(@l short[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "$this$slice");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : b.d(O0.d(kotlin.collections.l.m1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1)));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final int yb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumBy");
        L.p(function10, "selector");
        int v = A0.o(arr_b);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = D0.h(v2 + ((D0)function10.invoke(z0.b(A0.l(arr_b, v1)))).l0());
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final D0[] yc(@l int[] arr_v) {
        L.p(arr_v, "$this$toTypedArray");
        int v = E0.o(arr_v);
        D0[] arr_d0 = new D0[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_d0[v1] = D0.b(E0.l(arr_v, v1));
        }
        return arr_d0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte z0(byte[] arr_b) {
        L.p(arr_b, "$this$component1");
        return A0.l(arr_b, 0);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int z1(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$count");
        L.p(function10, "predicate");
        int v = I0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(H0.b(I0.l(arr_v, v1)))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection z2(short[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$filterNotTo");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = O0.l(arr_v, v1);
            if(!((Boolean)function10.invoke(N0.b(((short)v2)))).booleanValue()) {
                collection0.add(N0.b(((short)v2)));
            }
        }
        return collection0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Object z3(short[] arr_v, Object object0, p p0) {
        L.p(arr_v, "$this$foldIndexed");
        L.p(p0, "operation");
        int v = O0.o(arr_v);
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            object0 = p0.invoke(v2, object0, N0.b(O0.l(arr_v, v1)));
            ++v1;
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Map z4(byte[] arr_b, Map map0, Function1 function10) {
        L.p(arr_b, "$this$groupByTo");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = A0.l(arr_b, v1);
            Object object0 = function10.invoke(z0.b(((byte)v2)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(z0.b(((byte)v2)));
        }
        return map0;
    }

    @h0(version = "1.3")
    @f
    @t
    private static final Collection z5(short[] arr_v, Collection collection0, Function1 function10) {
        L.p(arr_v, "$this$mapTo");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(N0.b(O0.l(arr_v, v1))));
        }
        return collection0;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final D0 z6(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "$this$maxWithOrNull");
        L.p(comparator0, "comparator");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(comparator0.compare(D0.b(v), D0.b(v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.7")
    @t
    @i(name = "minOrThrow-U")
    public static final int z7(@l int[] arr_v) {
        L.p(arr_v, "$this$min");
        if(E0.r(arr_v)) {
            throw new NoSuchElementException();
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = E0.l(arr_v, v2);
                if(y0.a(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    @m
    public static final z0 z8(@l byte[] arr_b, @l kotlin.random.f f0) {
        L.p(arr_b, "$this$randomOrNull");
        L.p(f0, "random");
        return A0.r(arr_b) ? null : z0.b(A0.l(arr_b, f0.m(A0.o(arr_b))));
    }

    @h0(version = "1.4")
    @f
    @t
    private static final List z9(byte[] arr_b, Object object0, o o0) {
        L.p(arr_b, "$this$runningFold");
        L.p(o0, "operation");
        if(A0.r(arr_b)) {
            return u.k(object0);
        }
        List list0 = new ArrayList(A0.o(arr_b) + 1);
        ((ArrayList)list0).add(object0);
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, z0.b(A0.l(arr_b, v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final List za(@l long[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "$this$slice");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : b.c(I0.d(kotlin.collections.l.k1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1)));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @t
    private static final int zb(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumBy");
        L.p(function10, "selector");
        int v = I0.o(arr_v);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = D0.h(v2 + ((D0)function10.invoke(H0.b(I0.l(arr_v, v1)))).l0());
        }
        return v2;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final z0[] zc(@l byte[] arr_b) {
        L.p(arr_b, "$this$toTypedArray");
        int v = A0.o(arr_b);
        z0[] arr_z0 = new z0[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_z0[v1] = z0.b(A0.l(arr_b, v1));
        }
        return arr_z0;
    }
}

