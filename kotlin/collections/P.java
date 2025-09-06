package kotlin.collections;

import B3.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.D0;
import kotlin.H0;
import kotlin.U;
import kotlin.V;
import kotlin.W0;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24423:1\n12561#1,2:24424\n12571#1,2:24426\n1310#1,2:24428\n1318#1,2:24430\n1326#1,2:24432\n1334#1,2:24434\n1342#1,2:24436\n1350#1,2:24438\n1358#1,2:24440\n1366#1,2:24442\n1374#1,2:24444\n2353#1,5:24446\n2366#1,5:24451\n2379#1,5:24456\n2392#1,5:24461\n2405#1,5:24466\n2418#1,5:24471\n2431#1,5:24476\n2444#1,5:24481\n2457#1,5:24486\n4344#1,2:24492\n4354#1,2:24494\n4364#1,2:24496\n4374#1,2:24498\n4384#1,2:24500\n4394#1,2:24502\n4404#1,2:24504\n4414#1,2:24506\n4424#1,2:24508\n4011#1:24510\n13411#1,2:24511\n4012#1,2:24513\n13413#1:24515\n4014#1:24516\n4025#1:24517\n13421#1,2:24518\n4026#1,2:24520\n13423#1:24522\n4028#1:24523\n4039#1:24524\n13431#1,2:24525\n4040#1,2:24527\n13433#1:24529\n4042#1:24530\n4053#1:24531\n13441#1,2:24532\n4054#1,2:24534\n13443#1:24536\n4056#1:24537\n4067#1:24538\n13451#1,2:24539\n4068#1,2:24541\n13453#1:24543\n4070#1:24544\n4081#1:24545\n13461#1,2:24546\n4082#1,2:24548\n13463#1:24550\n4084#1:24551\n4095#1:24552\n13471#1,2:24553\n4096#1,2:24555\n13473#1:24557\n4098#1:24558\n4109#1:24559\n13481#1,2:24560\n4110#1,2:24562\n13483#1:24564\n4112#1:24565\n4123#1:24566\n13491#1,2:24567\n4124#1,2:24569\n13493#1:24571\n4126#1:24572\n13411#1,3:24573\n13421#1,3:24576\n13431#1,3:24579\n13441#1,3:24582\n13451#1,3:24585\n13461#1,3:24588\n13471#1,3:24591\n13481#1,3:24594\n13491#1,3:24597\n4144#1,2:24600\n4254#1,2:24602\n4264#1,2:24604\n4274#1,2:24606\n4284#1,2:24608\n4294#1,2:24610\n4304#1,2:24612\n4314#1,2:24614\n4324#1,2:24616\n4334#1,2:24618\n9125#1,4:24620\n9140#1,4:24624\n9155#1,4:24628\n9170#1,4:24632\n9185#1,4:24636\n9200#1,4:24640\n9215#1,4:24644\n9230#1,4:24648\n9245#1,4:24652\n8838#1,4:24656\n8854#1,4:24660\n8870#1,4:24664\n8886#1,4:24668\n8902#1,4:24672\n8918#1,4:24676\n8934#1,4:24680\n8950#1,4:24684\n8966#1,4:24688\n8982#1,4:24692\n8998#1,4:24696\n9014#1,4:24700\n9030#1,4:24704\n9046#1,4:24708\n9062#1,4:24712\n9078#1,4:24716\n9094#1,4:24720\n9110#1,4:24724\n9413#1,4:24728\n10431#1,5:24732\n10442#1,5:24737\n10453#1,5:24742\n10464#1,5:24747\n10475#1,5:24752\n10486#1,5:24757\n10497#1,5:24762\n10508#1,5:24767\n10519#1,5:24772\n10534#1,5:24777\n10775#1,3:24782\n10778#1,3:24792\n10792#1,3:24795\n10795#1,3:24805\n10809#1,3:24808\n10812#1,3:24818\n10826#1,3:24821\n10829#1,3:24831\n10843#1,3:24834\n10846#1,3:24844\n10860#1,3:24847\n10863#1,3:24857\n10877#1,3:24860\n10880#1,3:24870\n10894#1,3:24873\n10897#1,3:24883\n10911#1,3:24886\n10914#1,3:24896\n10929#1,3:24899\n10932#1,3:24909\n10947#1,3:24912\n10950#1,3:24922\n10965#1,3:24925\n10968#1,3:24935\n10983#1,3:24938\n10986#1,3:24948\n11001#1,3:24951\n11004#1,3:24961\n11019#1,3:24964\n11022#1,3:24974\n11037#1,3:24977\n11040#1,3:24987\n11055#1,3:24990\n11058#1,3:25000\n11073#1,3:25003\n11076#1,3:25013\n11437#1,3:25142\n11447#1,3:25145\n11457#1,3:25148\n11467#1,3:25151\n11477#1,3:25154\n11487#1,3:25157\n11497#1,3:25160\n11507#1,3:25163\n11517#1,3:25166\n11303#1,4:25169\n11316#1,4:25173\n11329#1,4:25177\n11342#1,4:25181\n11355#1,4:25185\n11368#1,4:25189\n11381#1,4:25193\n11394#1,4:25197\n11407#1,4:25201\n11292#1:25205\n13411#1,2:25206\n13413#1:25209\n11293#1:25210\n13411#1,3:25211\n11428#1:25214\n13346#1:25215\n13347#1:25217\n11429#1:25218\n13346#1,2:25219\n13411#1,3:25221\n13421#1,3:25224\n13431#1,3:25227\n13441#1,3:25230\n13451#1,3:25233\n13461#1,3:25236\n13471#1,3:25239\n13481#1,3:25242\n13491#1,3:25245\n20642#1,2:25248\n20644#1,6:25251\n20858#1,2:25257\n20860#1,6:25260\n23035#1,6:25266\n23051#1,6:25272\n23067#1,6:25278\n23083#1,6:25284\n23099#1,6:25290\n23115#1,6:25296\n23131#1,6:25302\n23147#1,6:25308\n23163#1,6:25314\n23269#1,8:25320\n23287#1,8:25328\n23305#1,8:25336\n23323#1,8:25344\n23341#1,8:25352\n23359#1,8:25360\n23377#1,8:25368\n23395#1,8:25376\n23413#1,8:25384\n23511#1,6:25392\n23527#1,6:25398\n23543#1,6:25404\n23559#1,6:25410\n23575#1,6:25416\n23591#1,6:25422\n23607#1,6:25428\n23623#1,6:25434\n1#2:24491\n1#2:25208\n1#2:25216\n1#2:25250\n1#2:25259\n381#3,7:24785\n381#3,7:24798\n381#3,7:24811\n381#3,7:24824\n381#3,7:24837\n381#3,7:24850\n381#3,7:24863\n381#3,7:24876\n381#3,7:24889\n381#3,7:24902\n381#3,7:24915\n381#3,7:24928\n381#3,7:24941\n381#3,7:24954\n381#3,7:24967\n381#3,7:24980\n381#3,7:24993\n381#3,7:25006\n381#3,7:25016\n381#3,7:25023\n381#3,7:25030\n381#3,7:25037\n381#3,7:25044\n381#3,7:25051\n381#3,7:25058\n381#3,7:25065\n381#3,7:25072\n381#3,7:25079\n381#3,7:25086\n381#3,7:25093\n381#3,7:25100\n381#3,7:25107\n381#3,7:25114\n381#3,7:25121\n381#3,7:25128\n381#3,7:25135\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n557#1:24424,2\n566#1:24426,2\n860#1:24428,2\n870#1:24430,2\n880#1:24432,2\n890#1:24434,2\n900#1:24436,2\n910#1:24438,2\n920#1:24440,2\n930#1:24442,2\n940#1:24444,2\n950#1:24446,5\n960#1:24451,5\n970#1:24456,5\n980#1:24461,5\n990#1:24466,5\n1000#1:24471,5\n1010#1:24476,5\n1020#1:24481,5\n1030#1:24486,5\n3829#1:24492,2\n3838#1:24494,2\n3847#1:24496,2\n3856#1:24498,2\n3865#1:24500,2\n3874#1:24502,2\n3883#1:24504,2\n3892#1:24506,2\n3901#1:24508,2\n3912#1:24510\n3912#1:24511,2\n3912#1:24513,2\n3912#1:24515\n3912#1:24516\n3923#1:24517\n3923#1:24518,2\n3923#1:24520,2\n3923#1:24522\n3923#1:24523\n3934#1:24524\n3934#1:24525,2\n3934#1:24527,2\n3934#1:24529\n3934#1:24530\n3945#1:24531\n3945#1:24532,2\n3945#1:24534,2\n3945#1:24536\n3945#1:24537\n3956#1:24538\n3956#1:24539,2\n3956#1:24541,2\n3956#1:24543\n3956#1:24544\n3967#1:24545\n3967#1:24546,2\n3967#1:24548,2\n3967#1:24550\n3967#1:24551\n3978#1:24552\n3978#1:24553,2\n3978#1:24555,2\n3978#1:24557\n3978#1:24558\n3989#1:24559\n3989#1:24560,2\n3989#1:24562,2\n3989#1:24564\n3989#1:24565\n4000#1:24566\n4000#1:24567,2\n4000#1:24569,2\n4000#1:24571\n4000#1:24572\n4011#1:24573,3\n4025#1:24576,3\n4039#1:24579,3\n4053#1:24582,3\n4067#1:24585,3\n4081#1:24588,3\n4095#1:24591,3\n4109#1:24594,3\n4123#1:24597,3\n4135#1:24600,2\n4154#1:24602,2\n4163#1:24604,2\n4172#1:24606,2\n4181#1:24608,2\n4190#1:24610,2\n4199#1:24612,2\n4208#1:24614,2\n4217#1:24616,2\n4226#1:24618,2\n8444#1:24620,4\n8459#1:24624,4\n8474#1:24628,4\n8489#1:24632,4\n8504#1:24636,4\n8519#1:24640,4\n8534#1:24644,4\n8549#1:24648,4\n8564#1:24652,4\n8579#1:24656,4\n8594#1:24660,4\n8609#1:24664,4\n8624#1:24668,4\n8639#1:24672,4\n8654#1:24676,4\n8669#1:24680,4\n8684#1:24684,4\n8699#1:24688,4\n8713#1:24692,4\n8727#1:24696,4\n8741#1:24700,4\n8755#1:24704,4\n8769#1:24708,4\n8783#1:24712,4\n8797#1:24716,4\n8811#1:24720,4\n8825#1:24724,4\n9264#1:24728,4\n10009#1:24732,5\n10018#1:24737,5\n10027#1:24742,5\n10036#1:24747,5\n10045#1:24752,5\n10054#1:24757,5\n10063#1:24762,5\n10072#1:24767,5\n10081#1:24772,5\n10094#1:24777,5\n10550#1:24782,3\n10550#1:24792,3\n10562#1:24795,3\n10562#1:24805,3\n10574#1:24808,3\n10574#1:24818,3\n10586#1:24821,3\n10586#1:24831,3\n10598#1:24834,3\n10598#1:24844,3\n10610#1:24847,3\n10610#1:24857,3\n10622#1:24860,3\n10622#1:24870,3\n10634#1:24873,3\n10634#1:24883,3\n10646#1:24886,3\n10646#1:24896,3\n10659#1:24899,3\n10659#1:24909,3\n10672#1:24912,3\n10672#1:24922,3\n10685#1:24925,3\n10685#1:24935,3\n10698#1:24938,3\n10698#1:24948,3\n10711#1:24951,3\n10711#1:24961,3\n10724#1:24964,3\n10724#1:24974,3\n10737#1:24977,3\n10737#1:24987,3\n10750#1:24990,3\n10750#1:25000,3\n10763#1:25003,3\n10763#1:25013,3\n11102#1:25142,3\n11112#1:25145,3\n11122#1:25148,3\n11132#1:25151,3\n11142#1:25154,3\n11152#1:25157,3\n11162#1:25160,3\n11172#1:25163,3\n11182#1:25166,3\n11192#1:25169,4\n11202#1:25173,4\n11212#1:25177,4\n11222#1:25181,4\n11232#1:25185,4\n11242#1:25189,4\n11252#1:25193,4\n11262#1:25197,4\n11272#1:25201,4\n11282#1:25205\n11282#1:25206,2\n11282#1:25209\n11282#1:25210\n11292#1:25211,3\n11420#1:25214\n11420#1:25215\n11420#1:25217\n11420#1:25218\n11428#1:25219,2\n18928#1:25221,3\n18940#1:25224,3\n18952#1:25227,3\n18964#1:25230,3\n18976#1:25233,3\n18988#1:25236,3\n19000#1:25239,3\n19012#1:25242,3\n19024#1:25245,3\n21472#1:25248,2\n21472#1:25251,6\n21625#1:25257,2\n21625#1:25260,6\n22944#1:25266,6\n22954#1:25272,6\n22964#1:25278,6\n22974#1:25284,6\n22984#1:25290,6\n22994#1:25296,6\n23004#1:25302,6\n23014#1:25308,6\n23024#1:25314,6\n23178#1:25320,8\n23188#1:25328,8\n23198#1:25336,8\n23208#1:25344,8\n23218#1:25352,8\n23228#1:25360,8\n23238#1:25368,8\n23248#1:25376,8\n23258#1:25384,8\n23430#1:25392,6\n23440#1:25398,6\n23450#1:25404,6\n23460#1:25410,6\n23470#1:25416,6\n23480#1:25422,6\n23490#1:25428,6\n23500#1:25434,6\n11282#1:25208\n11420#1:25216\n21472#1:25250\n21625#1:25259\n10550#1:24785,7\n10562#1:24798,7\n10574#1:24811,7\n10586#1:24824,7\n10598#1:24837,7\n10610#1:24850,7\n10622#1:24863,7\n10634#1:24876,7\n10646#1:24889,7\n10659#1:24902,7\n10672#1:24915,7\n10685#1:24928,7\n10698#1:24941,7\n10711#1:24954,7\n10724#1:24967,7\n10737#1:24980,7\n10750#1:24993,7\n10763#1:25006,7\n10777#1:25016,7\n10794#1:25023,7\n10811#1:25030,7\n10828#1:25037,7\n10845#1:25044,7\n10862#1:25051,7\n10879#1:25058,7\n10896#1:25065,7\n10913#1:25072,7\n10931#1:25079,7\n10949#1:25086,7\n10967#1:25093,7\n10985#1:25100,7\n11003#1:25107,7\n11021#1:25114,7\n11039#1:25121,7\n11057#1:25128,7\n11075#1:25135,7\n*E\n"})
class p extends o {
    @l
    public static final Iterable A5(@l long[] arr_v) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n23998#2:18\n*E\n"})
        public static final class e implements a, Iterable {
            final long[] a;

            public e(long[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.g(this.a);
            }
        }

        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? u.H() : new e(arr_v);
    }

    @l
    public static final Map A6(@l Object[] arr_object, @l Map map0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    @f
    private static final short A7(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[0];
    }

    public static final int A8(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List A9(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = p.te(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return p.yx(arr_f, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List AA(@l short[] arr_v, @l short[] arr_v1) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "other");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((short)arr_v[v1]), ((short)arr_v1[v1])));
        }
        return list0;
    }

    @l
    public static final Collection Aa(@l char[] arr_c, @l Collection collection0, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            int v2 = arr_c[v];
            if(((Boolean)o0.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                collection0.add(Character.valueOf(((char)v2)));
            }
            ++v;
        }
        return collection0;
    }

    @f
    private static final Float Ab(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                float f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
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
    @i(name = "flatMapIndexedIterable")
    private static final List Ac(byte[] arr_b, A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, ((byte)arr_b[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Ad(@l float[] arr_f, Object object0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        for(int v = p.te(arr_f); v >= 0; --v) {
            object0 = o0.invoke(((float)arr_f[v]), object0);
        }
        return object0;
    }

    @f
    private static final char Ae(char[] arr_c, int v, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_c.length ? ((Character)function10.invoke(v)).charValue() : arr_c[v];
    }

    @l
    public static final Map Af(@l boolean[] arr_z, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_z, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @f
    private static final boolean Ag(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    public static Object Ah(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        if(arr_object.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_object[kotlin.collections.l.we(arr_object)];
    }

    @l
    public static final Collection Ai(@l Object[] arr_object, @l Collection collection0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = o0.invoke(v1, arr_object[v]);
            if(object0 != null) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Aj(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((int)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((int)arr_v[v1]))).floatValue());
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
    private static final Object Ak(double[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((double)arr_f[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Object Al(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) > 0) {
                    object0 = object1;
                    comparable0 = comparable1;
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
    private static final Double Am(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((long)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((long)arr_v[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Byte An(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                if(comparator0.compare(((byte)v), ((byte)v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @h0(version = "1.4")
    @f
    private static final short[] Ao(short[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            o0.invoke(v1, ((short)arr_v[v]));
            ++v;
        }
        return arr_v;
    }

    public static final long Ap(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(v, ((long)arr_v[v2]))).longValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @m
    public static final Double Aq(@l double[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        int v = p.se(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)p0.invoke(v1, ((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final List Ar(byte[] arr_b, Object object0, A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        if(arr_b.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_b.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_b.length; ++v) {
            object0 = o0.invoke(object0, ((byte)arr_b[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List As(short[] arr_v, Object object0, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = p0.invoke(v, object0, ((short)arr_v[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Long At(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        Long long0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    return null;
                }
                long0 = v1;
                z = true;
            }
        }
        return z ? long0 : null;
    }

    @h0(version = "1.4")
    public static void Au(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        kotlin.collections.l.P3(arr_v, v, v1);
        kotlin.collections.l.Zq(arr_v, v, v1);
    }

    @l
    public static final List Av(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        o.K3(arr_f1);
        return p.kr(arr_f1);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double Aw(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += ((Number)function10.invoke(((float)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List Ax(@l long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_v.length) {
            return p.Jy(arr_v);
        }
        if(v == 1) {
            return u.k(((long)arr_v[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((long)arr_v[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet Ay(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return (HashSet)p.py(arr_object, new HashSet(Y.j(arr_object.length)));
    }

    @l
    public static final Iterable Az(@l char[] arr_c) {
        static final class B extends N implements A3.a {
            final char[] e;

            B(char[] arr_c) {
                this.e = arr_c;
                super(0);
            }

            public final Iterator b() {
                return j.c(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_c, "<this>");
        return new Q(new B(arr_c));
    }

    @l
    public static Iterable B5(@l Object[] arr_object) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n23966#2:18\n*E\n"})
        public static final class kotlin.collections.p.a implements a, Iterable {
            final Object[] a;

            public kotlin.collections.p.a(Object[] arr_object) {
                this.a = arr_object;
                super();
            }

            @Override
            public Iterator iterator() {
                return kotlin.jvm.internal.i.a(this.a);
            }
        }

        L.p(arr_object, "<this>");
        return arr_object.length == 0 ? u.H() : new kotlin.collections.p.a(arr_object);
    }

    @l
    public static final Map B6(@l Object[] arr_object, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_object, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @f
    private static final boolean B7(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z[0];
    }

    @f
    private static final int B8(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length;
    }

    @l
    public static final List B9(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ue(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return p.zx(arr_v, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List BA(@l short[] arr_v, @l short[] arr_v1, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((short)arr_v[v1]), ((short)arr_v1[v1])));
        }
        return list0;
    }

    @l
    public static final Collection Ba(@l double[] arr_f, @l Collection collection0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            double f = arr_f[v];
            if(((Boolean)o0.invoke(v1, f)).booleanValue()) {
                collection0.add(f);
            }
            ++v;
        }
        return collection0;
    }

    @f
    private static final Integer Bb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
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
    @i(name = "flatMapIndexedIterable")
    private static final List Bc(char[] arr_c, A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, Character.valueOf(arr_c[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Bd(@l int[] arr_v, Object object0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.ue(arr_v); v >= 0; --v) {
            object0 = o0.invoke(((int)arr_v[v]), object0);
        }
        return object0;
    }

    @f
    private static final double Be(double[] arr_f, int v, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_f.length ? ((Number)function10.invoke(v)).doubleValue() : arr_f[v];
    }

    @h0(version = "1.1")
    @l
    public static final kotlin.collections.L Bf(@l Object[] arr_object, @l Function1 function10) {
        public static final class s implements kotlin.collections.L {
            final Object[] a;
            final Function1 b;

            public s(Object[] arr_object, Function1 function10) {
                this.a = arr_object;
                this.b = function10;
                super();
            }

            @Override  // kotlin.collections.L
            public Object a(Object object0) {
                return this.b.invoke(object0);
            }

            @Override  // kotlin.collections.L
            public Iterator b() {
                return kotlin.jvm.internal.i.a(this.a);
            }
        }

        L.p(arr_object, "<this>");
        L.p(function10, "keySelector");
        return new s(arr_object, function10);
    }

    @f
    private static final boolean Bg(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 0 ? 0 : 1;
    }

    public static final Object Bh(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                Object object0 = arr_object[v];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l
    public static final Collection Bi(@l byte[] arr_b, @l Collection collection0, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            collection0.add(o0.invoke(v1, ((byte)arr_b[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Bj(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((long)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((long)arr_v[v1]))).floatValue());
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
    private static final Object Bk(float[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((float)arr_f[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Short Bl(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((short)v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double Bm(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(arr_object[0])).doubleValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(arr_object[v1])).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Character Bn(@l char[] arr_c, @l Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                if(comparator0.compare(Character.valueOf(((char)v)), Character.valueOf(((char)v3))) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @h0(version = "1.4")
    @f
    private static final boolean[] Bo(boolean[] arr_z, A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            o0.invoke(v1, Boolean.valueOf(arr_z[v]));
            ++v;
        }
        return arr_z;
    }

    public static final Object Bp(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        if(arr_object.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = o0.invoke(object0, arr_object[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.4")
    @m
    public static final Float Bq(@l float[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        int v = p.te(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)p0.invoke(v1, ((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final List Br(char[] arr_c, Object object0, A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        if(arr_c.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_c.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_c.length; ++v) {
            object0 = o0.invoke(object0, Character.valueOf(arr_c[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List Bs(boolean[] arr_z, Object object0, A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        if(arr_z.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_z.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_z.length; ++v) {
            object0 = p0.invoke(v, object0, Boolean.valueOf(arr_z[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static Object Bt(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 1 ? arr_object[0] : null;
    }

    public static final void Bu(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length > 1) {
            o.Q3(arr_v);
            kotlin.collections.l.ar(arr_v);
        }
    }

    @l
    public static final List Bv(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        o.M3(arr_f1);
        return p.lr(arr_f1);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double Bw(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((int)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List Bx(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_object.length) {
            return kotlin.collections.l.Ky(arr_object);
        }
        if(v == 1) {
            return u.k(arr_object[0]);
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            ((ArrayList)list0).add(arr_object[v1]);
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet By(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return (HashSet)p.qy(arr_v, new HashSet(Y.j(arr_v.length)));
    }

    @l
    public static final Iterable Bz(@l double[] arr_f) {
        static final class z extends N implements A3.a {
            final double[] e;

            z(double[] arr_f) {
                this.e = arr_f;
                super(0);
            }

            public final Iterator b() {
                return j.d(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_f, "<this>");
        return new Q(new z(arr_f));
    }

    @l
    public static final Iterable C5(@l short[] arr_v) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n23982#2:18\n*E\n"})
        public static final class c implements a, Iterable {
            final short[] a;

            public c(short[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.h(this.a);
            }
        }

        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? u.H() : new c(arr_v);
    }

    @l
    public static final Map C6(@l short[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), ((short)v1));
        }
        return map0;
    }

    @f
    private static final byte C7(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b[1];
    }

    public static final int C8(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List C9(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ve(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return p.Ax(arr_v, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List CA(@l boolean[] arr_z, @l Iterable iterable0) {
        L.p(arr_z, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_z.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_z.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(Boolean.valueOf(arr_z[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final Collection Ca(@l float[] arr_f, @l Collection collection0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            float f = arr_f[v];
            if(((Boolean)o0.invoke(v1, f)).booleanValue()) {
                collection0.add(f);
            }
            ++v;
        }
        return collection0;
    }

    @f
    private static final Long Cb(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                long v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
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
    @i(name = "flatMapIndexedIterable")
    private static final List Cc(double[] arr_f, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, ((double)arr_f[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Cd(@l long[] arr_v, Object object0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.ve(arr_v); v >= 0; --v) {
            object0 = o0.invoke(((long)arr_v[v]), object0);
        }
        return object0;
    }

    @f
    private static final float Ce(float[] arr_f, int v, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_f.length ? ((Number)function10.invoke(v)).floatValue() : arr_f[v];
    }

    public static int Cf(@l byte[] arr_b, byte b) {
        L.p(arr_b, "<this>");
        for(int v = 0; v < arr_b.length; ++v) {
            if(b == arr_b[v]) {
                return v;
            }
        }
        return -1;
    }

    @f
    private static final boolean Cg(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    public static short Ch(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[kotlin.collections.l.xe(arr_v)];
    }

    @l
    public static final Collection Ci(@l char[] arr_c, @l Collection collection0, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            collection0.add(o0.invoke(v1, Character.valueOf(arr_c[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Cj(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(arr_object[0])).floatValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(arr_object[v1])).floatValue());
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
    private static final Object Ck(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((int)arr_v[v1]));
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

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final byte Cl(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(v == 0) {
            return b;
        }
        Comparable comparable0 = (Comparable)function10.invoke(b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = arr_b[v1];
                Comparable comparable1 = (Comparable)function10.invoke(b1);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Double Cm(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((short)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((short)arr_v[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Double Cn(@l double[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                if(comparator0.compare(f, f1) > 0) {
                    f = f1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @l
    public static final V Co(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                arrayList0.add(((byte)v1));
            }
            else {
                arrayList1.add(((byte)v1));
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final short Cp(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(v, ((short)arr_v[v2]))).shortValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @m
    public static final Integer Cq(@l int[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Cr(double[] arr_f, Object object0, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_f.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = o0.invoke(object0, ((double)arr_f[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Cs(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        p.Ds(arr_b, kotlin.random.f.a);
    }

    @m
    public static final Object Ct(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        Object object0 = null;
        boolean z = false;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    return null;
                }
                z = true;
                object0 = object1;
            }
        }
        return z ? object0 : null;
    }

    @h0(version = "1.4")
    public static void Cu(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        kotlin.collections.l.R3(arr_v, v, v1);
        kotlin.collections.l.br(arr_v, v, v1);
    }

    @l
    public static final List Cv(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        o.O3(arr_v1);
        return p.mr(arr_v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double Cw(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((long)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List Cx(@l short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_v.length) {
            return p.Ly(arr_v);
        }
        if(v == 1) {
            return u.k(((short)arr_v[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((short)arr_v[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet Cy(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return (HashSet)p.ry(arr_z, new HashSet(Y.j(arr_z.length)));
    }

    @l
    public static final Iterable Cz(@l float[] arr_f) {
        static final class y extends N implements A3.a {
            final float[] e;

            y(float[] arr_f) {
                this.e = arr_f;
                super(0);
            }

            public final Iterator b() {
                return j.e(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_f, "<this>");
        return new Q(new y(arr_f));
    }

    @l
    public static final Iterable D5(@l boolean[] arr_z) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24022#2:18\n*E\n"})
        public static final class h implements a, Iterable {
            final boolean[] a;

            public h(boolean[] arr_z) {
                this.a = arr_z;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.a(this.a);
            }
        }

        L.p(arr_z, "<this>");
        return arr_z.length == 0 ? u.H() : new h(arr_z);
    }

    @l
    public static final Map D6(@l short[] arr_v, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), function11.invoke(((short)v1)));
        }
        return map0;
    }

    @f
    private static final char D7(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c[1];
    }

    @f
    private static final int D8(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length;
    }

    @l
    public static final List D9(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.we(arr_object); -1 < v; --v) {
            if(!((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return p.Bx(arr_object, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List DA(@l boolean[] arr_z, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_z.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_z.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(Boolean.valueOf(arr_z[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final Collection Da(@l int[] arr_v, @l Collection collection0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)o0.invoke(v1, v2)).booleanValue()) {
                collection0.add(v2);
            }
            ++v;
        }
        return collection0;
    }

    @f
    private static final Object Db(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                Object object0 = arr_object[v];
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                    continue;
                }
                return object0;
            }
        }
        return null;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterable")
    private static final List Dc(float[] arr_f, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, ((float)arr_f[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Dd(@l Object[] arr_object, Object object0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.we(arr_object); v >= 0; --v) {
            object0 = o0.invoke(arr_object[v], object0);
        }
        return object0;
    }

    @f
    private static final int De(int[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_v.length ? ((Number)function10.invoke(v)).intValue() : arr_v[v];
    }

    public static final int Df(@l char[] arr_c, char c) {
        L.p(arr_c, "<this>");
        for(int v = 0; v < arr_c.length; ++v) {
            if(c == arr_c[v]) {
                return v;
            }
        }
        return -1;
    }

    @f
    private static final boolean Dg(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 0 ? 0 : 1;
    }

    public static final short Dh(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                short v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
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

    @l
    public static final Collection Di(@l double[] arr_f, @l Collection collection0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            collection0.add(o0.invoke(v1, ((double)arr_f[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Dj(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((short)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((short)arr_v[v1]))).floatValue());
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
    private static final Object Dk(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((long)arr_v[v1]));
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

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final char Dl(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(v == 0) {
            return c;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(c));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                char c1 = arr_c[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(c1));
                if(comparable0.compareTo(comparable1) > 0) {
                    c = c1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double Dm(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).doubleValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Float Dn(@l float[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                if(comparator0.compare(f, f1) > 0) {
                    f = f1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @l
    public static final V Do(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                arrayList0.add(Character.valueOf(((char)v1)));
            }
            else {
                arrayList1.add(Character.valueOf(((char)v1)));
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final boolean Dp(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        if(arr_z.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                z = ((Boolean)o0.invoke(Boolean.valueOf(z), Boolean.valueOf(arr_z[v1]))).booleanValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return z;
    }

    @h0(version = "1.4")
    @m
    public static final Long Dq(@l long[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Dr(float[] arr_f, Object object0, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_f.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = o0.invoke(object0, ((float)arr_f[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ds(@l byte[] arr_b, @l kotlin.random.f f0) {
        L.p(arr_b, "<this>");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.qe(arr_b); v > 0; --v) {
            int v1 = f0.m(v + 1);
            byte b = arr_b[v];
            arr_b[v] = arr_b[v1];
            arr_b[v1] = b;
        }
    }

    @m
    public static final Short Dt(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 1 ? ((short)arr_v[0]) : null;
    }

    public static final void Du(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        kotlin.collections.l.h4(arr_comparable, kotlin.comparisons.a.x());
    }

    @l
    public static final List Dv(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        o.Q3(arr_v1);
        return p.nr(arr_v1);
    }

    @i(name = "sumOfDouble")
    public static final double Dw(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        double f = 0.0;
        for(int v = 0; v < arr_double.length; ++v) {
            f += (double)arr_double[v];
        }
        return f;
    }

    @l
    public static final List Dx(@l boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_z.length) {
            return p.My(arr_z);
        }
        if(v == 1) {
            return u.k(Boolean.valueOf(arr_z[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final int[] Dy(@l Integer[] arr_integer) {
        L.p(arr_integer, "<this>");
        int[] arr_v = new int[arr_integer.length];
        for(int v = 0; v < arr_integer.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
        return arr_v;
    }

    @l
    public static final Iterable Dz(@l int[] arr_v) {
        static final class w extends N implements A3.a {
            final int[] e;

            w(int[] arr_v) {
                this.e = arr_v;
                super(0);
            }

            public final Iterator b() {
                return j.f(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_v, "<this>");
        return new Q(new w(arr_v));
    }

    @l
    public static final kotlin.sequences.m E5(@l byte[] arr_b) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24050#2:23\n*E\n"})
        public static final class k implements kotlin.sequences.m {
            final byte[] a;

            public k(byte[] arr_b) {
                this.a = arr_b;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.b(this.a);
            }
        }

        L.p(arr_b, "<this>");
        return arr_b.length == 0 ? kotlin.sequences.p.g() : new k(arr_b);
    }

    @l
    public static final Map E6(@l boolean[] arr_z, @l Map map0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return map0;
    }

    @f
    private static final double E7(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[1];
    }

    public static final int E8(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List E9(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.xe(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return p.Cx(arr_v, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List EA(@l boolean[] arr_z, @l Object[] arr_object) {
        L.p(arr_z, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_z.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(Boolean.valueOf(arr_z[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final Collection Ea(@l long[] arr_v, @l Collection collection0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            long v2 = arr_v[v];
            if(((Boolean)o0.invoke(v1, v2)).booleanValue()) {
                collection0.add(v2);
            }
            ++v;
        }
        return collection0;
    }

    @f
    private static final Short Eb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                    return (short)v1;
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
    @i(name = "flatMapIndexedIterable")
    private static final List Ec(int[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, ((int)arr_v[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Ed(@l short[] arr_v, Object object0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.xe(arr_v); v >= 0; --v) {
            object0 = o0.invoke(((short)arr_v[v]), object0);
        }
        return object0;
    }

    @f
    private static final long Ee(long[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_v.length ? ((Number)function10.invoke(v)).longValue() : arr_v[v];
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfFirst { it == element }\' instead to continue using this behavior, or \'.asList().indexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @c0(expression = "indexOfFirst { it == element }", imports = {}))
    @kotlin.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int Ef(double[] arr_f, double f) {
        L.p(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(f == arr_f[v]) {
                return v;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Eg(@l byte[] arr_b, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            int v3 = arr_b[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(((byte)v3))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static final boolean Eh(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        if(arr_z.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_z[p.ye(arr_z)];
    }

    @l
    public static final Collection Ei(@l float[] arr_f, @l Collection collection0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            collection0.add(o0.invoke(v1, ((float)arr_f[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Ej(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).floatValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).floatValue());
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
    private static final Object Ek(Object[] arr_object, Comparator comparator0, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(arr_object[v1]);
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

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final double El(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) > 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Float Em(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((byte)arr_b[0]))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((byte)arr_b[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Integer En(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(comparator0.compare(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @l
    public static final V Eo(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                arrayList0.add(f);
            }
            else {
                arrayList1.add(f);
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final byte Ep(@l byte[] arr_b, @l A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        if(arr_b.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                b = ((Number)p0.invoke(v1, b, ((byte)arr_b[v1]))).byteValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @h0(version = "1.4")
    @m
    public static final Object Eq(@l Object[] arr_object, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.we(arr_object);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = p0.invoke(v1, arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    @h0(version = "1.4")
    @f
    private static final List Er(int[] arr_v, Object object0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_v.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((int)arr_v[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Es(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        p.Fs(arr_c, kotlin.random.f.a);
    }

    @m
    public static final Short Et(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        Short short0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                if(z) {
                    return null;
                }
                short0 = (short)v1;
                z = true;
            }
        }
        return z ? short0 : null;
    }

    @h0(version = "1.4")
    public static final void Eu(@l Comparable[] arr_comparable, int v, int v1) {
        L.p(arr_comparable, "<this>");
        kotlin.collections.l.i4(arr_comparable, kotlin.comparisons.a.x(), v, v1);
    }

    @l
    public static final List Ev(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        return kotlin.collections.l.Mv(arr_comparable, kotlin.comparisons.a.x());
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double Ew(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_object.length; ++v) {
            f += ((Number)function10.invoke(arr_object[v])).doubleValue();
        }
        return f;
    }

    @l
    public static final List Ex(@l byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_b.length) {
            return p.Ey(arr_b);
        }
        if(v == 1) {
            return u.k(((byte)arr_b[arr_b.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_b.length - v; v1 < arr_b.length; ++v1) {
            ((ArrayList)list0).add(((byte)arr_b[v1]));
        }
        return list0;
    }

    @l
    public static final List Ey(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        switch(arr_b.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(((byte)arr_b[0]));
            }
            default: {
                return p.Oy(arr_b);
            }
        }
    }

    @l
    public static final Iterable Ez(@l long[] arr_v) {
        static final class x extends N implements A3.a {
            final long[] e;

            x(long[] arr_v) {
                this.e = arr_v;
                super(0);
            }

            public final Iterator b() {
                return j.g(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_v, "<this>");
        return new Q(new x(arr_v));
    }

    @l
    public static final kotlin.sequences.m F5(@l char[] arr_c) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24120#2:23\n*E\n"})
        public static final class r implements kotlin.sequences.m {
            final char[] a;

            public r(char[] arr_c) {
                this.a = arr_c;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.c(this.a);
            }
        }

        L.p(arr_c, "<this>");
        return arr_c.length == 0 ? kotlin.sequences.p.g() : new r(arr_c);
    }

    @l
    public static final Map F6(@l boolean[] arr_z, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_z, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @f
    private static final float F7(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[1];
    }

    @f
    private static final int F8(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length;
    }

    @l
    public static final List F9(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = p.ye(arr_z); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return p.Dx(arr_z, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List FA(@l boolean[] arr_z, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_z.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(Boolean.valueOf(arr_z[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final Collection Fa(@l Object[] arr_object, @l Collection collection0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = arr_object[v];
            if(((Boolean)o0.invoke(v1, object0)).booleanValue()) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    public static byte Fb(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_b[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterable")
    private static final List Fc(long[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, ((long)arr_v[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Fd(@l boolean[] arr_z, Object object0, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        for(int v = p.ye(arr_z); v >= 0; --v) {
            object0 = o0.invoke(Boolean.valueOf(arr_z[v]), object0);
        }
        return object0;
    }

    @f
    private static final Object Fe(Object[] arr_object, int v, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_object.length ? function10.invoke(v) : arr_object[v];
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfFirst { it == element }\' instead to continue using this behavior, or \'.asList().indexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @c0(expression = "indexOfFirst { it == element }", imports = {}))
    @kotlin.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int Ff(float[] arr_f, float f) {
        L.p(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(f == arr_f[v]) {
                return v;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Fg(@l char[] arr_c, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            int v3 = arr_c[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(((char)v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(Character.valueOf(((char)v3)))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static final boolean Fh(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                boolean z = arr_z[v];
                if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                    return z;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l
    public static final Collection Fi(@l int[] arr_v, @l Collection collection0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            collection0.add(o0.invoke(v1, ((int)arr_v[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Fj(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((byte)arr_b[v1]));
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
    private static final Object Fk(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((short)arr_v[v1]));
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

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final float Fl(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) > 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Float Fm(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).floatValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Long Fn(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(comparator0.compare(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @l
    public static final V Fo(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                arrayList0.add(f);
            }
            else {
                arrayList1.add(f);
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final char Fp(@l char[] arr_c, @l A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        if(arr_c.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                c = ((Character)p0.invoke(v1, Character.valueOf(c), Character.valueOf(arr_c[v1]))).charValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @h0(version = "1.4")
    @m
    public static final Short Fq(@l short[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((short)arr_v[v1]), ((short)v2))).shortValue();
            --v1;
        }
        return (short)v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Fr(long[] arr_v, Object object0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_v.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((long)arr_v[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Fs(@l char[] arr_c, @l kotlin.random.f f0) {
        L.p(arr_c, "<this>");
        L.p(f0, "random");
        for(int v = p.re(arr_c); v > 0; --v) {
            int v1 = f0.m(v + 1);
            char c = arr_c[v];
            arr_c[v] = arr_c[v1];
            arr_c[v1] = c;
        }
    }

    @l
    public static final List Ft(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((byte)arr_b[((Number)object0).intValue()]));
        }
        return list0;
    }

    public static final void Fu(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length > 1) {
            o.W3(arr_v);
            kotlin.collections.l.er(arr_v);
        }
    }

    @l
    public static final List Fv(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        o.W3(arr_v1);
        return p.pr(arr_v1);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double Fw(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((short)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List Fx(@l char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_c.length) {
            return p.Fy(arr_c);
        }
        if(v == 1) {
            return u.k(Character.valueOf(arr_c[arr_c.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_c.length - v; v1 < arr_c.length; ++v1) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[v1]));
        }
        return list0;
    }

    @l
    public static final List Fy(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(Character.valueOf(arr_c[0]));
            }
            default: {
                return p.Py(arr_c);
            }
        }
    }

    @l
    public static Iterable Fz(@l Object[] arr_object) {
        static final class t extends N implements A3.a {
            final Object[] e;

            t(Object[] arr_object) {
                this.e = arr_object;
                super(0);
            }

            public final Iterator b() {
                return kotlin.jvm.internal.i.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_object, "<this>");
        return new Q(new t(arr_object));
    }

    @l
    public static final kotlin.sequences.m G5(@l double[] arr_f) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24100#2:23\n*E\n"})
        public static final class kotlin.collections.p.p implements kotlin.sequences.m {
            final double[] a;

            public kotlin.collections.p.p(double[] arr_f) {
                this.a = arr_f;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.d(this.a);
            }
        }

        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? kotlin.sequences.p.g() : new kotlin.collections.p.p(arr_f);
    }

    @l
    public static final Map G6(@l byte[] arr_b, @l Map map0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_b.length; ++v) {
            V v1 = (V)function10.invoke(((byte)arr_b[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final int G7(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[1];
    }

    public static final int G8(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List G9(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(z) {
                ((ArrayList)list0).add(((byte)v1));
            }
            else if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                ((ArrayList)list0).add(((byte)v1));
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List GA(@l boolean[] arr_z, @l boolean[] arr_z1) {
        L.p(arr_z, "<this>");
        L.p(arr_z1, "other");
        int v = Math.min(arr_z.length, arr_z1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(arr_z1[v1])));
        }
        return list0;
    }

    @l
    public static final Collection Ga(@l short[] arr_v, @l Collection collection0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)o0.invoke(v1, ((short)v2))).booleanValue()) {
                collection0.add(((short)v2));
            }
            ++v;
        }
        return collection0;
    }

    public static final byte Gb(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            byte b = arr_b[v];
            if(((Boolean)function10.invoke(b)).booleanValue()) {
                return b;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterable")
    private static final List Gc(Object[] arr_object, A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, arr_object[v])));
            ++v;
        }
        return list0;
    }

    public static final Object Gd(@l byte[] arr_b, Object object0, @l A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.qe(arr_b); v >= 0; --v) {
            object0 = p0.invoke(v, ((byte)arr_b[v]), object0);
        }
        return object0;
    }

    @f
    private static final short Ge(short[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_v.length ? ((Number)function10.invoke(v)).shortValue() : arr_v[v];
    }

    public static int Gf(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v1;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Gg(@l double[] arr_f, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            double f = arr_f[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(f));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(f)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static int Gh(@l byte[] arr_b, byte b) {
        L.p(arr_b, "<this>");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                if(b == arr_b[v]) {
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

    @l
    public static final Collection Gi(@l long[] arr_v, @l Collection collection0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            collection0.add(o0.invoke(v1, ((long)arr_v[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Gj(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(arr_c[v1]));
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
    private static final Object Gk(boolean[] arr_z, Comparator comparator0, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Boolean.valueOf(arr_z[v1]));
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

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final int Gl(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Float Gm(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((double)arr_f[0]))).floatValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((double)arr_f[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Object Gn(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
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

    @l
    public static final V Go(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                arrayList0.add(v1);
            }
            else {
                arrayList1.add(v1);
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final double Gp(@l double[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)p0.invoke(v1, f, ((double)arr_f[v1]))).doubleValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Boolean Gq(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        int v = p.ye(arr_z);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)o0.invoke(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return Boolean.valueOf(z);
    }

    @h0(version = "1.4")
    @l
    public static final List Gr(@l Object[] arr_object, Object object0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        if(arr_object.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_object.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = o0.invoke(object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Gs(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        p.Hs(arr_f, kotlin.random.f.a);
    }

    @l
    public static final List Gt(@l byte[] arr_b, @l kotlin.ranges.l l0) {
        L.p(arr_b, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : o.n(kotlin.collections.l.f1(arr_b, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @h0(version = "1.4")
    public static final void Gu(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        o.X3(arr_v, v, v1);
        kotlin.collections.l.fr(arr_v, v, v1);
    }

    @l
    public static final List Gv(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        Byte[] arr_byte = o.N4(arr_b);
        kotlin.collections.l.h4(arr_byte, comparator0);
        return kotlin.collections.l.t(arr_byte);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double Gw(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_z.length; ++v) {
            f += ((Number)function10.invoke(Boolean.valueOf(arr_z[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List Gx(@l double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_f.length) {
            return p.Gy(arr_f);
        }
        if(v == 1) {
            return u.k(((double)arr_f[arr_f.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_f.length - v; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((double)arr_f[v1]));
        }
        return list0;
    }

    @l
    public static final List Gy(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(((double)arr_f[0]));
            }
            default: {
                return p.Qy(arr_f);
            }
        }
    }

    @l
    public static final Iterable Gz(@l short[] arr_v) {
        static final class v extends N implements A3.a {
            final short[] e;

            v(short[] arr_v) {
                this.e = arr_v;
                super(0);
            }

            public final Iterator b() {
                return j.h(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_v, "<this>");
        return new Q(new v(arr_v));
    }

    @l
    public static final kotlin.sequences.m H5(@l float[] arr_f) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24090#2:23\n*E\n"})
        public static final class kotlin.collections.p.o implements kotlin.sequences.m {
            final float[] a;

            public kotlin.collections.p.o(float[] arr_f) {
                this.a = arr_f;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.e(this.a);
            }
        }

        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? kotlin.sequences.p.g() : new kotlin.collections.p.o(arr_f);
    }

    @l
    public static final Map H6(@l char[] arr_c, @l Map map0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_c.length; ++v) {
            V v1 = (V)function10.invoke(Character.valueOf(arr_c[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final long H7(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[1];
    }

    @f
    private static final int H8(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length;
    }

    @l
    public static final List H9(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(z) {
                ((ArrayList)list0).add(Character.valueOf(((char)v1)));
            }
            else if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                ((ArrayList)list0).add(Character.valueOf(((char)v1)));
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List HA(@l boolean[] arr_z, @l boolean[] arr_z1, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(arr_z1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_z.length, arr_z1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(arr_z1[v1])));
        }
        return list0;
    }

    @l
    public static final Collection Ha(@l boolean[] arr_z, @l Collection collection0, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            boolean z = arr_z[v];
            if(((Boolean)o0.invoke(v1, Boolean.valueOf(z))).booleanValue()) {
                collection0.add(Boolean.valueOf(z));
            }
            ++v;
        }
        return collection0;
    }

    public static final char Hb(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_c[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterable")
    private static final List Hc(short[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, ((short)arr_v[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Hd(@l char[] arr_c, Object object0, @l A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        for(int v = p.re(arr_c); v >= 0; --v) {
            object0 = p0.invoke(v, Character.valueOf(arr_c[v]), object0);
        }
        return object0;
    }

    @f
    private static final boolean He(boolean[] arr_z, int v, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_z.length ? ((Boolean)function10.invoke(v)).booleanValue() : arr_z[v];
    }

    public static int Hf(@l long[] arr_v, long v) {
        L.p(arr_v, "<this>");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v1;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Hg(@l float[] arr_f, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            float f = arr_f[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(f));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(f)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static final int Hh(@l char[] arr_c, char c) {
        L.p(arr_c, "<this>");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                if(c == arr_c[v]) {
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

    @l
    public static final Collection Hi(@l Object[] arr_object, @l Collection collection0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            collection0.add(o0.invoke(v1, arr_object[v]));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Hj(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((double)arr_f[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Byte Hk(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final long Hl(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Float Hm(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((float)arr_f[0]))).floatValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((float)arr_f[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Short Hn(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(comparator0.compare(((short)v), ((short)v3)) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @l
    public static final V Ho(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                arrayList0.add(v1);
            }
            else {
                arrayList1.add(v1);
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final float Hp(@l float[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)p0.invoke(v1, f, ((float)arr_f[v1]))).floatValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Byte Hq(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_b[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((byte)arr_b[v1]), ((byte)v2))).byteValue();
            --v1;
        }
        return (byte)v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Hr(short[] arr_v, Object object0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_v.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((short)arr_v[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Hs(@l double[] arr_f, @l kotlin.random.f f0) {
        L.p(arr_f, "<this>");
        L.p(f0, "random");
        for(int v = p.se(arr_f); v > 0; --v) {
            int v1 = f0.m(v + 1);
            double f1 = arr_f[v];
            arr_f[v] = arr_f[v1];
            arr_f[v1] = f1;
        }
    }

    @l
    public static final List Ht(@l char[] arr_c, @l Iterable iterable0) {
        L.p(arr_c, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final List Hu(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        Byte[] arr_byte = o.N4(arr_b);
        kotlin.collections.l.U3(arr_byte);
        return kotlin.collections.l.t(arr_byte);
    }

    @l
    public static final List Hv(@l char[] arr_c, @l Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        Character[] arr_character = o.O4(arr_c);
        kotlin.collections.l.h4(arr_character, comparator0);
        return kotlin.collections.l.t(arr_character);
    }

    @i(name = "sumOfFloat")
    public static final float Hw(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        float f = 0.0f;
        for(int v = 0; v < arr_float.length; ++v) {
            f += (float)arr_float[v];
        }
        return f;
    }

    @l
    public static final List Hx(@l float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_f.length) {
            return p.Hy(arr_f);
        }
        if(v == 1) {
            return u.k(((float)arr_f[arr_f.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_f.length - v; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((float)arr_f[v1]));
        }
        return list0;
    }

    @l
    public static final List Hy(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(((float)arr_f[0]));
            }
            default: {
                return p.Ry(arr_f);
            }
        }
    }

    @l
    public static final Iterable Hz(@l boolean[] arr_z) {
        static final class A extends N implements A3.a {
            final boolean[] e;

            A(boolean[] arr_z) {
                this.e = arr_z;
                super(0);
            }

            public final Iterator b() {
                return j.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_z, "<this>");
        return new Q(new A(arr_z));
    }

    @l
    public static final kotlin.sequences.m I5(@l int[] arr_v) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24070#2:23\n*E\n"})
        public static final class kotlin.collections.p.m implements kotlin.sequences.m {
            final int[] a;

            public kotlin.collections.p.m(int[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.f(this.a);
            }
        }

        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? kotlin.sequences.p.g() : new kotlin.collections.p.m(arr_v);
    }

    @l
    public static final Map I6(@l double[] arr_f, @l Map map0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            V v1 = (V)function10.invoke(((double)arr_f[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final Object I7(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object[1];
    }

    public static final int I8(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List I9(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(z) {
                ((ArrayList)list0).add(f);
            }
            else if(!((Boolean)function10.invoke(f)).booleanValue()) {
                ((ArrayList)list0).add(f);
                z = true;
            }
        }
        return list0;
    }

    public static final List Ia(Object[] arr_object) {
        L.p(arr_object, "<this>");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            L.y(3, "R");
            if(object0 instanceof Object) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public static final char Ib(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            char c = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(c))).booleanValue()) {
                return c;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterable")
    private static final List Ic(boolean[] arr_z, A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            u.q0(list0, ((Iterable)o0.invoke(v1, Boolean.valueOf(arr_z[v]))));
            ++v;
        }
        return list0;
    }

    public static final Object Id(@l double[] arr_f, Object object0, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        for(int v = p.se(arr_f); v >= 0; --v) {
            object0 = p0.invoke(v, ((double)arr_f[v]), object0);
        }
        return object0;
    }

    @m
    public static final Boolean Ie(@l boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        return v < 0 || v >= arr_z.length ? null : Boolean.valueOf(arr_z[v]);
    }

    public static int If(@l Object[] arr_object, Object object0) {
        L.p(arr_object, "<this>");
        int v = 0;
        if(object0 == null) {
            while(v < arr_object.length) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        while(v < arr_object.length) {
            if(L.g(object0, arr_object[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @l
    public static final Appendable Ig(@l int[] arr_v, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(v3)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfLast { it == element }\' instead to continue using this behavior, or \'.asList().lastIndexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @c0(expression = "indexOfLast { it == element }", imports = {}))
    @kotlin.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int Ih(double[] arr_f, double f) {
        L.p(arr_f, "<this>");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(f == arr_f[v]) {
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

    @l
    public static final Collection Ii(@l short[] arr_v, @l Collection collection0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            collection0.add(o0.invoke(v1, ((short)arr_v[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Ij(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((float)arr_f[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Character Ik(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                if(L.t(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final Object Il(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) > 0) {
                    object0 = object1;
                    comparable0 = comparable1;
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
    private static final Float Im(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((int)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((int)arr_v[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final byte In(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = arr_b[v1];
                if(comparator0.compare(b, b1) > 0) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @l
    public static final V Io(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final int Ip(@l int[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, v, ((int)arr_v[v2]))).intValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @m
    public static final Character Iq(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        int v = p.re(arr_c);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_c[v];
        while(v1 >= 0) {
            v2 = ((Character)o0.invoke(Character.valueOf(arr_c[v1]), Character.valueOf(((char)v2)))).charValue();
            --v1;
        }
        return Character.valueOf(((char)v2));
    }

    @h0(version = "1.4")
    @f
    private static final List Ir(boolean[] arr_z, Object object0, A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        if(arr_z.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_z.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_z.length; ++v) {
            object0 = o0.invoke(object0, Boolean.valueOf(arr_z[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Is(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        p.Js(arr_f, kotlin.random.f.a);
    }

    @l
    public static final List It(@l char[] arr_c, @l kotlin.ranges.l l0) {
        L.p(arr_c, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : o.o(o.g1(arr_c, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final List Iu(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        Character[] arr_character = o.O4(arr_c);
        kotlin.collections.l.U3(arr_character);
        return kotlin.collections.l.t(arr_character);
    }

    @l
    public static final List Iv(@l double[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        Double[] arr_double = o.P4(arr_f);
        kotlin.collections.l.h4(arr_double, comparator0);
        return kotlin.collections.l.t(arr_double);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Iw(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 += ((Number)function10.invoke(((byte)arr_b[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Ix(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_v.length) {
            return p.Iy(arr_v);
        }
        if(v == 1) {
            return u.k(((int)arr_v[arr_v.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_v.length - v; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((int)arr_v[v1]));
        }
        return list0;
    }

    @l
    public static final List Iy(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(((int)arr_v[0]));
            }
            default: {
                return kotlin.collections.l.Sy(arr_v);
            }
        }
    }

    @l
    public static final List Iz(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_b.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_b.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(((byte)arr_b[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final kotlin.sequences.m J5(@l long[] arr_v) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24080#2:23\n*E\n"})
        public static final class n implements kotlin.sequences.m {
            final long[] a;

            public n(long[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.g(this.a);
            }
        }

        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? kotlin.sequences.p.g() : new n(arr_v);
    }

    @l
    public static final Map J6(@l float[] arr_f, @l Map map0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            V v1 = (V)function10.invoke(((float)arr_f[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final short J7(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[1];
    }

    @f
    private static final int J8(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length;
    }

    @l
    public static final List J9(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(z) {
                ((ArrayList)list0).add(f);
            }
            else if(!((Boolean)function10.invoke(f)).booleanValue()) {
                ((ArrayList)list0).add(f);
                z = true;
            }
        }
        return list0;
    }

    public static final Collection Ja(Object[] arr_object, Collection collection0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            L.y(3, "R");
            if(object0 instanceof Object) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    public static final double Jb(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Jc(byte[] arr_b, Collection collection0, A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, ((byte)arr_b[v]))));
            ++v;
        }
        return collection0;
    }

    public static final Object Jd(@l float[] arr_f, Object object0, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        for(int v = p.te(arr_f); v >= 0; --v) {
            object0 = p0.invoke(v, ((float)arr_f[v]), object0);
        }
        return object0;
    }

    @m
    public static final Byte Je(@l byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        return v < 0 || v >= arr_b.length ? null : ((byte)arr_b[v]);
    }

    public static int Jf(@l short[] arr_v, short v) {
        L.p(arr_v, "<this>");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v1;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Jg(@l long[] arr_v, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            long v3 = arr_v[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(v3)));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'indexOfLast { it == element }\' instead to continue using this behavior, or \'.asList().lastIndexOf(element: T)\' to get the same search behavior as in a list.", replaceWith = @c0(expression = "indexOfLast { it == element }", imports = {}))
    @kotlin.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final int Jh(float[] arr_f, float f) {
        L.p(arr_f, "<this>");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(f == arr_f[v]) {
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

    @l
    public static final Collection Ji(@l boolean[] arr_z, @l Collection collection0, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            collection0.add(o0.invoke(v1, Boolean.valueOf(arr_z[v])));
            ++v;
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Jj(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((int)arr_v[v1]));
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

    @h0(version = "1.4")
    @m
    public static Comparable Jk(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return null;
        }
        Comparable comparable0 = arr_comparable[0];
        int v = kotlin.collections.l.we(arr_comparable);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = arr_comparable[v1];
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
    @i(name = "minByOrThrow")
    public static final short Jl(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Float Jm(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((long)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((long)arr_v[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final char Jn(@l char[] arr_c, @l Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                char c1 = arr_c[v1];
                if(comparator0.compare(Character.valueOf(c), Character.valueOf(c1)) > 0) {
                    c = c1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @l
    public static final V Jo(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                arrayList0.add(((short)v1));
            }
            else {
                arrayList1.add(((short)v1));
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final long Jp(@l long[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, v, ((long)arr_v[v2]))).longValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @m
    public static final Double Jq(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        int v = p.se(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)o0.invoke(((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final List Jr(byte[] arr_b, Object object0, A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        if(arr_b.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_b.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_b.length; ++v) {
            object0 = p0.invoke(v, object0, ((byte)arr_b[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Js(@l float[] arr_f, @l kotlin.random.f f0) {
        L.p(arr_f, "<this>");
        L.p(f0, "random");
        for(int v = p.te(arr_f); v > 0; --v) {
            int v1 = f0.m(v + 1);
            float f1 = arr_f[v];
            arr_f[v] = arr_f[v1];
            arr_f[v1] = f1;
        }
    }

    @l
    public static final List Jt(@l double[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((double)arr_f[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final List Ju(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        Double[] arr_double = o.P4(arr_f);
        kotlin.collections.l.U3(arr_double);
        return kotlin.collections.l.t(arr_double);
    }

    @l
    public static final List Jv(@l float[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        Float[] arr_float = o.Q4(arr_f);
        kotlin.collections.l.h4(arr_float, comparator0);
        return kotlin.collections.l.t(arr_float);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Jw(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            v1 += ((Number)function10.invoke(Character.valueOf(arr_c[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Jx(@l long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_v.length) {
            return p.Jy(arr_v);
        }
        if(v == 1) {
            return u.k(((long)arr_v[arr_v.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_v.length - v; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((long)arr_v[v1]));
        }
        return list0;
    }

    @l
    public static final List Jy(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(((long)arr_v[0]));
            }
            default: {
                return p.Ty(arr_v);
            }
        }
    }

    @l
    public static final List Jz(@l byte[] arr_b, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_b.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_b.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(((byte)arr_b[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static kotlin.sequences.m K5(@l Object[] arr_object) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24040#2:23\n*E\n"})
        public static final class kotlin.collections.p.j implements kotlin.sequences.m {
            final Object[] a;

            public kotlin.collections.p.j(Object[] arr_object) {
                this.a = arr_object;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return kotlin.jvm.internal.i.a(this.a);
            }
        }

        L.p(arr_object, "<this>");
        return arr_object.length == 0 ? kotlin.sequences.p.g() : new kotlin.collections.p.j(arr_object);
    }

    @l
    public static final Map K6(@l int[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = (V)function10.invoke(((int)arr_v[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final boolean K7(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z[1];
    }

    public static final int K8(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List K9(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(z) {
                ((ArrayList)list0).add(v1);
            }
            else if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                ((ArrayList)list0).add(v1);
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List Ka(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                list0.add(((byte)v1));
            }
        }
        return list0;
    }

    public static final double Kb(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Kc(char[] arr_c, Collection collection0, A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, Character.valueOf(arr_c[v]))));
            ++v;
        }
        return collection0;
    }

    public static final Object Kd(@l int[] arr_v, Object object0, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.ue(arr_v); v >= 0; --v) {
            object0 = p0.invoke(v, ((int)arr_v[v]), object0);
        }
        return object0;
    }

    @m
    public static final Character Ke(@l char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        return v < 0 || v >= arr_c.length ? null : Character.valueOf(arr_c[v]);
    }

    public static final int Kf(@l boolean[] arr_z, boolean z) {
        L.p(arr_z, "<this>");
        for(int v = 0; v < arr_z.length; ++v) {
            if(z == arr_z[v]) {
                return v;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Kg(@l Object[] arr_object, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            kotlin.text.v.b(appendable0, object0, function10);
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static int Kh(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(v == arr_v[v1]) {
                    return v1;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return -1;
    }

    @l
    public static final List Ki(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = function10.invoke(arr_object[v]);
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Kj(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((long)arr_v[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Double Kk(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, arr_f[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final boolean Kl(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(v == 0) {
            return z;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
                if(comparable0.compareTo(comparable1) > 0) {
                    z = z1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return z;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Float Km(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(arr_object[0])).floatValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(arr_object[v1])).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final double Kn(@l double[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                if(comparator0.compare(f, f1) > 0) {
                    f = f1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @l
    public static final V Ko(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                arrayList0.add(Boolean.valueOf(z));
            }
            else {
                arrayList1.add(Boolean.valueOf(z));
            }
        }
        return new V(arrayList0, arrayList1);
    }

    public static final Object Kp(@l Object[] arr_object, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        if(arr_object.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = p0.invoke(v1, object0, arr_object[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.4")
    @m
    public static final Float Kq(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        int v = p.te(arr_f);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)o0.invoke(((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final List Kr(char[] arr_c, Object object0, A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        if(arr_c.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_c.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_c.length; ++v) {
            object0 = p0.invoke(v, object0, Character.valueOf(arr_c[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ks(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        p.Ls(arr_v, kotlin.random.f.a);
    }

    @l
    public static final List Kt(@l double[] arr_f, @l kotlin.ranges.l l0) {
        L.p(arr_f, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : kotlin.collections.l.p(o.h1(arr_f, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final List Ku(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        Float[] arr_float = o.Q4(arr_f);
        kotlin.collections.l.U3(arr_float);
        return kotlin.collections.l.t(arr_float);
    }

    @l
    public static final List Kv(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        Integer[] arr_integer = o.R4(arr_v);
        kotlin.collections.l.h4(arr_integer, comparator0);
        return kotlin.collections.l.t(arr_integer);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Kw(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 += ((Number)function10.invoke(((double)arr_f[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Kx(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_object.length) {
            return kotlin.collections.l.Ky(arr_object);
        }
        if(v == 1) {
            return u.k(arr_object[arr_object.length - 1]);
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_object.length - v; v1 < arr_object.length; ++v1) {
            ((ArrayList)list0).add(arr_object[v1]);
        }
        return list0;
    }

    @l
    public static List Ky(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(arr_object[0]);
            }
            default: {
                return kotlin.collections.l.Uy(arr_object);
            }
        }
    }

    @l
    public static final List Kz(@l byte[] arr_b, @l byte[] arr_b1) {
        L.p(arr_b, "<this>");
        L.p(arr_b1, "other");
        int v = Math.min(arr_b.length, arr_b1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((byte)arr_b[v1]), ((byte)arr_b1[v1])));
        }
        return list0;
    }

    @l
    public static final kotlin.sequences.m L5(@l short[] arr_v) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24060#2:23\n*E\n"})
        public static final class kotlin.collections.p.l implements kotlin.sequences.m {
            final short[] a;

            public kotlin.collections.p.l(short[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.h(this.a);
            }
        }

        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? kotlin.sequences.p.g() : new kotlin.collections.p.l(arr_v);
    }

    @l
    public static final Map L6(@l long[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = (V)function10.invoke(((long)arr_v[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final byte L7(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b[2];
    }

    @f
    private static final int L8(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length;
    }

    @l
    public static final List L9(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(z) {
                ((ArrayList)list0).add(v1);
            }
            else if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                ((ArrayList)list0).add(v1);
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List La(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                list0.add(Character.valueOf(((char)v1)));
            }
        }
        return list0;
    }

    public static final float Lb(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Lc(double[] arr_f, Collection collection0, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, ((double)arr_f[v]))));
            ++v;
        }
        return collection0;
    }

    public static final Object Ld(@l long[] arr_v, Object object0, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.ve(arr_v); v >= 0; --v) {
            object0 = p0.invoke(v, ((long)arr_v[v]), object0);
        }
        return object0;
    }

    @m
    public static final Double Le(@l double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        return v < 0 || v >= arr_f.length ? null : ((double)arr_f[v]);
    }

    public static final int Lf(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Lg(@l short[] arr_v, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(v3));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(((short)v3))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static int Lh(@l long[] arr_v, long v) {
        L.p(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(v == arr_v[v1]) {
                    return v1;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return -1;
    }

    @l
    public static final Collection Li(@l Object[] arr_object, @l Collection collection0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = function10.invoke(arr_object[v]);
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Lj(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(arr_object[v1]);
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

    @h0(version = "1.4")
    @m
    public static final Double Lk(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        if(arr_double.length == 0) {
            return null;
        }
        double f = (double)arr_double[0];
        int v = kotlin.collections.l.we(arr_double);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((double)arr_double[v1]));
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
    private static final double Ll(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((byte)arr_b[0]))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((byte)arr_b[v1]))).doubleValue());
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
    private static final Float Lm(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((short)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((short)arr_v[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final float Ln(@l float[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                if(comparator0.compare(f, f1) > 0) {
                    f = f1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.3")
    @f
    private static final byte Lo(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return p.Mo(arr_b, kotlin.random.f.a);
    }

    public static final short Lp(@l short[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, v, ((short)arr_v[v2]))).shortValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @m
    public static final Integer Lq(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Lr(double[] arr_f, Object object0, A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_f.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = p0.invoke(v, object0, ((double)arr_f[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ls(@l int[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.ue(arr_v); v > 0; --v) {
            int v1 = f0.m(v + 1);
            int v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
        }
    }

    @l
    public static final List Lt(@l float[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((float)arr_f[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final List Lu(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        Integer[] arr_integer = o.R4(arr_v);
        kotlin.collections.l.U3(arr_integer);
        return kotlin.collections.l.t(arr_integer);
    }

    @l
    public static final List Lv(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        Long[] arr_long = o.S4(arr_v);
        kotlin.collections.l.h4(arr_long, comparator0);
        return kotlin.collections.l.t(arr_long);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Lw(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 += ((Number)function10.invoke(((float)arr_f[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Lx(@l short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_v.length) {
            return p.Ly(arr_v);
        }
        if(v == 1) {
            return u.k(((short)arr_v[arr_v.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_v.length - v; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((short)arr_v[v1]));
        }
        return list0;
    }

    @l
    public static final List Ly(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(((short)arr_v[0]));
            }
            default: {
                return p.Vy(arr_v);
            }
        }
    }

    @l
    public static final List Lz(@l byte[] arr_b, @l byte[] arr_b1, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(arr_b1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_b.length, arr_b1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((byte)arr_b[v1]), ((byte)arr_b1[v1])));
        }
        return list0;
    }

    @l
    public static final kotlin.sequences.m M5(@l boolean[] arr_z) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24110#2:23\n*E\n"})
        public static final class q implements kotlin.sequences.m {
            final boolean[] a;

            public q(boolean[] arr_z) {
                this.a = arr_z;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return j.a(this.a);
            }
        }

        L.p(arr_z, "<this>");
        return arr_z.length == 0 ? kotlin.sequences.p.g() : new q(arr_z);
    }

    @l
    public static final Map M6(@l Object[] arr_object, @l Map map0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            V v1 = (V)function10.invoke(arr_object[v]);
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final char M7(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c[2];
    }

    public static final int M8(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List M9(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(z) {
                ((ArrayList)list0).add(object0);
            }
            else if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                ((ArrayList)list0).add(object0);
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List Ma(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    public static final float Mb(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Mc(float[] arr_f, Collection collection0, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, ((float)arr_f[v]))));
            ++v;
        }
        return collection0;
    }

    public static final Object Md(@l Object[] arr_object, Object object0, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.we(arr_object); v >= 0; --v) {
            object0 = p0.invoke(v, arr_object[v], object0);
        }
        return object0;
    }

    @m
    public static final Float Me(@l float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        return v < 0 || v >= arr_f.length ? null : ((float)arr_f[v]);
    }

    public static final int Mf(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    @l
    public static final Appendable Mg(@l boolean[] arr_z, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            boolean z = arr_z[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            if(function10 == null) {
                appendable0.append(String.valueOf(z));
            }
            else {
                appendable0.append(((CharSequence)function10.invoke(Boolean.valueOf(z))));
            }
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static int Mh(@l Object[] arr_object, Object object0) {
        L.p(arr_object, "<this>");
        if(object0 == null) {
            int v = arr_object.length - 1;
            if(v >= 0) {
                while(true) {
                    if(arr_object[v] == null) {
                        return v;
                    }
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                }
            }
        }
        else {
            int v1 = arr_object.length - 1;
            if(v1 >= 0) {
                while(true) {
                    if(L.g(object0, arr_object[v1])) {
                        return v1;
                    }
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
        }
        return -1;
    }

    @l
    public static final Collection Mi(@l byte[] arr_b, @l Collection collection0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_b.length; ++v) {
            collection0.add(function10.invoke(((byte)arr_b[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Mj(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((short)arr_v[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Float Mk(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, arr_f[v1]);
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
    private static final double Ml(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).doubleValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).doubleValue());
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
    private static final Float Mm(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).floatValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final int Mn(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(comparator0.compare(v, v3) > 0) {
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
    public static final byte Mo(@l byte[] arr_b, @l kotlin.random.f f0) {
        L.p(arr_b, "<this>");
        L.p(f0, "random");
        if(arr_b.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_b[f0.m(arr_b.length)];
    }

    public static final boolean Mp(@l boolean[] arr_z, @l A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        if(arr_z.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                z = ((Boolean)p0.invoke(v1, Boolean.valueOf(z), Boolean.valueOf(arr_z[v1]))).booleanValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return z;
    }

    @h0(version = "1.4")
    @m
    public static final Long Mq(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Mr(float[] arr_f, Object object0, A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_f.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = p0.invoke(v, object0, ((float)arr_f[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ms(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        p.Ns(arr_v, kotlin.random.f.a);
    }

    @l
    public static final List Mt(@l float[] arr_f, @l kotlin.ranges.l l0) {
        L.p(arr_f, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : o.q(kotlin.collections.l.i1(arr_f, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final List Mu(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        Long[] arr_long = o.S4(arr_v);
        kotlin.collections.l.U3(arr_long);
        return kotlin.collections.l.t(arr_long);
    }

    @l
    public static List Mv(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        return kotlin.collections.l.t(p.fv(arr_object, comparator0));
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Mw(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((int)arr_v[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Mx(@l boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_z.length) {
            return p.My(arr_z);
        }
        if(v == 1) {
            return u.k(Boolean.valueOf(arr_z[arr_z.length - 1]));
        }
        List list0 = new ArrayList(v);
        for(int v1 = arr_z.length - v; v1 < arr_z.length; ++v1) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[v1]));
        }
        return list0;
    }

    @l
    public static final List My(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        switch(arr_z.length) {
            case 0: {
                return u.H();
            }
            case 1: {
                return u.k(Boolean.valueOf(arr_z[0]));
            }
            default: {
                return p.Wy(arr_z);
            }
        }
    }

    @l
    public static final List Mz(@l byte[] arr_b, @l Object[] arr_object) {
        L.p(arr_b, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_b.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((byte)arr_b[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final Map N5(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            V v1 = (V)function10.invoke(((byte)arr_b[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @l
    public static final Map N6(@l short[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = (V)function10.invoke(((short)arr_v[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final double N7(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[2];
    }

    @l
    public static final List N8(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return u.V5(p.Xy(arr_b));
    }

    @l
    public static final List N9(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(z) {
                ((ArrayList)list0).add(((short)v1));
            }
            else if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                ((ArrayList)list0).add(((short)v1));
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List Na(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    public static int Nb(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Nc(int[] arr_v, Collection collection0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, ((int)arr_v[v]))));
            ++v;
        }
        return collection0;
    }

    public static final Object Nd(@l short[] arr_v, Object object0, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        for(int v = kotlin.collections.l.xe(arr_v); v >= 0; --v) {
            object0 = p0.invoke(v, ((short)arr_v[v]), object0);
        }
        return object0;
    }

    @m
    public static Integer Ne(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return v < 0 || v >= arr_v.length ? null : ((int)arr_v[v]);
    }

    public static final int Nf(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Ng(byte[] arr_b, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Eg(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Eg(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Eg(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Eg(arr_b, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static int Nh(@l short[] arr_v, short v) {
        L.p(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(v == arr_v[v1]) {
                    return v1;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return -1;
    }

    @l
    public static final Collection Ni(@l char[] arr_c, @l Collection collection0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_c.length; ++v) {
            collection0.add(function10.invoke(Character.valueOf(arr_c[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Nj(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[v1]));
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

    @h0(version = "1.4")
    @m
    public static Float Nk(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        if(arr_float.length == 0) {
            return null;
        }
        float f = (float)arr_float[0];
        int v = kotlin.collections.l.we(arr_float);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((float)arr_float[v1]));
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
    private static final double Nl(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((double)arr_f[0]))).doubleValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((double)arr_f[v1]))).doubleValue());
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
    private static final Object Nm(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((byte)arr_b[v1]));
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

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final long Nn(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(comparator0.compare(v, v3) > 0) {
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
    private static final char No(char[] arr_c) {
        L.p(arr_c, "<this>");
        return p.Oo(arr_c, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Boolean Np(@l boolean[] arr_z, @l A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                z = ((Boolean)p0.invoke(v1, Boolean.valueOf(z), Boolean.valueOf(arr_z[v1]))).booleanValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @h0(version = "1.4")
    @m
    public static final Object Nq(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.we(arr_object);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = o0.invoke(arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    @h0(version = "1.4")
    @f
    private static final List Nr(int[] arr_v, Object object0, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_v.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = p0.invoke(v, object0, ((int)arr_v[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ns(@l long[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.ve(arr_v); v > 0; --v) {
            int v1 = f0.m(v + 1);
            long v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
        }
    }

    @l
    public static final List Nt(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((int)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final List Nu(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        return kotlin.collections.l.t(p.Vu(arr_comparable));
    }

    @l
    public static final List Nv(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        Short[] arr_short = o.T4(arr_v);
        kotlin.collections.l.h4(arr_short, comparator0);
        return kotlin.collections.l.t(arr_short);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Nw(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((long)arr_v[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Nx(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.qe(arr_b); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return p.f9(arr_b, v + 1);
            }
        }
        return p.Ey(arr_b);
    }

    @l
    public static final long[] Ny(@l Long[] arr_long) {
        L.p(arr_long, "<this>");
        long[] arr_v = new long[arr_long.length];
        for(int v = 0; v < arr_long.length; ++v) {
            arr_v[v] = (long)arr_long[v];
        }
        return arr_v;
    }

    @l
    public static final List Nz(@l byte[] arr_b, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_b.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((byte)arr_b[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final Map O5(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_c.length), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            V v1 = (V)function10.invoke(Character.valueOf(arr_c[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @l
    public static final Map O6(@l boolean[] arr_z, @l Map map0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_z.length; ++v) {
            V v1 = (V)function10.invoke(Boolean.valueOf(arr_z[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @f
    private static final float O7(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[2];
    }

    @l
    public static final List O8(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return u.V5(p.Yy(arr_c));
    }

    @l
    public static final List O9(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        boolean z = false;
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z1 = arr_z[v];
            if(z) {
                ((ArrayList)list0).add(Boolean.valueOf(z1));
            }
            else if(!((Boolean)function10.invoke(Boolean.valueOf(z1))).booleanValue()) {
                ((ArrayList)list0).add(Boolean.valueOf(z1));
                z = true;
            }
        }
        return list0;
    }

    @l
    public static final List Oa(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    public static final int Ob(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Oc(long[] arr_v, Collection collection0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, ((long)arr_v[v]))));
            ++v;
        }
        return collection0;
    }

    public static final Object Od(@l boolean[] arr_z, Object object0, @l A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        for(int v = p.ye(arr_z); v >= 0; --v) {
            object0 = p0.invoke(v, Boolean.valueOf(arr_z[v]), object0);
        }
        return object0;
    }

    @m
    public static final Long Oe(@l long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return v < 0 || v >= arr_v.length ? null : ((long)arr_v[v]);
    }

    public static final int Of(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Og(char[] arr_c, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Fg(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Fg(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Fg(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Fg(arr_c, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static final int Oh(@l boolean[] arr_z, boolean z) {
        L.p(arr_z, "<this>");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                if(z == arr_z[v]) {
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

    @l
    public static final Collection Oi(@l double[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(function10.invoke(((double)arr_f[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Oj(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((byte)arr_b[v1]));
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

    @h0(version = "1.4")
    @m
    public static Integer Ok(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double Ol(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((float)arr_f[0]))).doubleValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((float)arr_f[v1]))).doubleValue());
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
    private static final Object Om(char[] arr_c, Comparator comparator0, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Character.valueOf(arr_c[v1]));
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

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final Object On(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
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
    public static final char Oo(@l char[] arr_c, @l kotlin.random.f f0) {
        L.p(arr_c, "<this>");
        L.p(f0, "random");
        if(arr_c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_c[f0.m(arr_c.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Byte Op(@l byte[] arr_b, @l A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, ((byte)v), ((byte)arr_b[v2]))).byteValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @h0(version = "1.4")
    @m
    public static final Short Oq(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((short)arr_v[v1]), ((short)v2))).shortValue();
            --v1;
        }
        return (short)v2;
    }

    @h0(version = "1.4")
    @f
    private static final List Or(long[] arr_v, Object object0, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_v.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = p0.invoke(v, object0, ((long)arr_v[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Os(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        p.Ps(arr_object, kotlin.random.f.a);
    }

    @l
    public static final List Ot(@l int[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : kotlin.collections.l.r(kotlin.collections.l.j1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final List Ou(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        Short[] arr_short = o.T4(arr_v);
        kotlin.collections.l.U3(arr_short);
        return kotlin.collections.l.t(arr_short);
    }

    @l
    public static final List Ov(@l boolean[] arr_z, @l Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        Boolean[] arr_boolean = o.M4(arr_z);
        kotlin.collections.l.h4(arr_boolean, comparator0);
        return kotlin.collections.l.t(arr_boolean);
    }

    @i(name = "sumOfInt")
    public static final int Ow(@l Integer[] arr_integer) {
        L.p(arr_integer, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_integer.length; ++v) {
            v1 += (int)arr_integer[v];
        }
        return v1;
    }

    @l
    public static final List Ox(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = p.re(arr_c); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return p.g9(arr_c, v + 1);
            }
        }
        return p.Fy(arr_c);
    }

    @l
    public static final List Oy(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        List list0 = new ArrayList(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            ((ArrayList)list0).add(((byte)arr_b[v]));
        }
        return list0;
    }

    @l
    public static final List Oz(@l char[] arr_c, @l Iterable iterable0) {
        L.p(arr_c, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_c.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_c.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(Character.valueOf(arr_c[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final Map P5(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            V v1 = (V)function10.invoke(((double)arr_f[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map P6(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(((byte)v1), function10.invoke(((byte)v1)));
        }
        return map0;
    }

    @f
    private static final int P7(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[2];
    }

    @l
    public static final List P8(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return u.V5(p.Zy(arr_f));
    }

    @f
    private static final byte P9(byte[] arr_b, int v, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_b.length ? ((Number)function10.invoke(v)).byteValue() : arr_b[v];
    }

    @l
    public static final List Pa(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    public static long Pb(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Pc(Object[] arr_object, Collection collection0, A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, arr_object[v])));
            ++v;
        }
        return collection0;
    }

    public static final void Pd(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_b.length; ++v) {
            function10.invoke(((byte)arr_b[v]));
        }
    }

    @m
    public static Object Pe(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        return v < 0 || v >= arr_object.length ? null : arr_object[v];
    }

    public static final int Pf(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Pg(double[] arr_f, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Gg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Gg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Gg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Gg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Boolean Ph(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 0 ? null : Boolean.valueOf(arr_z[arr_z.length - 1]);
    }

    @l
    public static final Collection Pi(@l float[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(function10.invoke(((float)arr_f[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Pj(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(arr_c[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Long Pk(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double Pl(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((int)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((int)arr_v[v1]))).doubleValue());
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
    private static final Object Pm(double[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((double)arr_f[v1]));
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

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final short Pn(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = arr_v[v2];
                if(comparator0.compare(v, v3) > 0) {
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
    private static final double Po(double[] arr_f) {
        L.p(arr_f, "<this>");
        return p.Qo(arr_f, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Character Pp(@l char[] arr_c, @l A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Character)p0.invoke(v2, Character.valueOf(((char)v)), Character.valueOf(arr_c[v2]))).charValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @l
    public static final Object[] Pq(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        for(int v = 0; v < arr_object.length; ++v) {
            if(arr_object[v] == null) {
                throw new IllegalArgumentException("null element found in " + arr_object + '.');
            }
        }
        return arr_object;
    }

    @h0(version = "1.4")
    @l
    public static final List Pr(@l Object[] arr_object, Object object0, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        if(arr_object.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_object.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = p0.invoke(v, object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ps(@l Object[] arr_object, @l kotlin.random.f f0) {
        L.p(arr_object, "<this>");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.we(arr_object); v > 0; --v) {
            int v1 = f0.m(v + 1);
            Object object0 = arr_object[v];
            arr_object[v] = arr_object[v1];
            arr_object[v1] = object0;
        }
    }

    @l
    public static final List Pt(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((long)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final byte[] Pu(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        o.G3(arr_b1);
        return arr_b1;
    }

    @l
    public static final Set Pv(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Xy(arr_b);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Pw(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            v1 += ((Number)function10.invoke(arr_object[v])).intValue();
        }
        return v1;
    }

    @l
    public static final List Px(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = p.se(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return p.h9(arr_f, v + 1);
            }
        }
        return p.Gy(arr_f);
    }

    @l
    public static final List Py(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        List list0 = new ArrayList(arr_c.length);
        for(int v = 0; v < arr_c.length; ++v) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[v]));
        }
        return list0;
    }

    @l
    public static final List Pz(@l char[] arr_c, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_c.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_c.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(Character.valueOf(arr_c[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final Map Q5(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            V v1 = (V)function10.invoke(((float)arr_f[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map Q6(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(kotlin.ranges.s.B(arr_c.length, 0x80)), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(Character.valueOf(((char)v1)), function10.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @f
    private static final long Q7(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[2];
    }

    @l
    public static final List Q8(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return u.V5(p.az(arr_f));
    }

    @f
    private static final char Q9(char[] arr_c, int v, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_c.length ? ((Character)function10.invoke(v)).charValue() : arr_c[v];
    }

    @l
    public static final List Qa(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public static final long Qb(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Qc(short[] arr_v, Collection collection0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, ((short)arr_v[v]))));
            ++v;
        }
        return collection0;
    }

    public static final void Qd(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_c.length; ++v) {
            function10.invoke(Character.valueOf(arr_c[v]));
        }
    }

    @m
    public static final Short Qe(@l short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return v < 0 || v >= arr_v.length ? null : ((short)arr_v[v]);
    }

    public static final int Qf(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Qg(float[] arr_f, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Hg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Hg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Hg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Hg(arr_f, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Boolean Qh(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                boolean z = arr_z[v];
                if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                    return Boolean.valueOf(z);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final Collection Qi(@l int[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(function10.invoke(((int)arr_v[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Qj(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((double)arr_f[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Short Qk(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double Ql(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((long)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((long)arr_v[v1]))).doubleValue());
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
    private static final Object Qm(float[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((float)arr_f[v1]));
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

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final boolean Qn(@l boolean[] arr_z, @l Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) > 0) {
                    z = z1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return z;
    }

    @h0(version = "1.3")
    public static final double Qo(@l double[] arr_f, @l kotlin.random.f f0) {
        L.p(arr_f, "<this>");
        L.p(f0, "random");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[f0.m(arr_f.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Double Qp(@l double[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)p0.invoke(v1, f, ((double)arr_f[v1]))).doubleValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    public static void Qq(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        int v = arr_b.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = kotlin.collections.l.qe(arr_b);
        for(int v2 = 0; true; ++v2) {
            byte b = arr_b[v2];
            arr_b[v2] = arr_b[v1];
            arr_b[v1] = b;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Qr(short[] arr_v, Object object0, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_v.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = p0.invoke(v, object0, ((short)arr_v[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Qs(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        p.Rs(arr_v, kotlin.random.f.a);
    }

    @l
    public static final List Qt(@l long[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : kotlin.collections.l.s(kotlin.collections.l.k1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final char[] Qu(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            return arr_c;
        }
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        L.o(arr_c1, "copyOf(...)");
        o.I3(arr_c1);
        return arr_c1;
    }

    @l
    public static final Set Qv(@l char[] arr_c, @l Iterable iterable0) {
        L.p(arr_c, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Yy(arr_c);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Qw(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((short)arr_v[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Qx(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = p.te(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return p.i9(arr_f, v + 1);
            }
        }
        return p.Hy(arr_f);
    }

    @l
    public static final List Qy(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            ((ArrayList)list0).add(((double)arr_f[v]));
        }
        return list0;
    }

    @l
    public static final List Qz(@l char[] arr_c, @l char[] arr_c1) {
        L.p(arr_c, "<this>");
        L.p(arr_c1, "other");
        int v = Math.min(arr_c.length, arr_c1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(Character.valueOf(arr_c[v1]), Character.valueOf(arr_c1[v1])));
        }
        return list0;
    }

    @l
    public static final Map R5(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = (V)function10.invoke(((int)arr_v[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map R6(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(f, function10.invoke(f));
        }
        return map0;
    }

    @f
    private static final Object R7(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object[2];
    }

    @l
    public static final List R8(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return u.V5(kotlin.collections.l.bz(arr_v));
    }

    @f
    private static final double R9(double[] arr_f, int v, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_f.length ? ((Number)function10.invoke(v)).doubleValue() : arr_f[v];
    }

    @l
    public static final List Ra(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                list0.add(((short)v1));
            }
        }
        return list0;
    }

    public static Object Rb(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        if(arr_object.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_object[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection Rc(boolean[] arr_z, Collection collection0, A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            u.q0(collection0, ((Iterable)o0.invoke(v1, Boolean.valueOf(arr_z[v]))));
            ++v;
        }
        return collection0;
    }

    public static final void Rd(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_f.length; ++v) {
            function10.invoke(((double)arr_f[v]));
        }
    }

    @l
    public static final Map Re(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(((byte)v1));
        }
        return map0;
    }

    public static final int Rf(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Rg(int[] arr_v, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Ig(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Ig(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Ig(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Ig(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Byte Rh(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 0 ? null : ((byte)arr_b[arr_b.length - 1]);
    }

    @l
    public static final Collection Ri(@l long[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(function10.invoke(((long)arr_v[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Rj(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((float)arr_f[v1]));
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
    @i(name = "maxOrThrow")
    public static final byte Rk(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = arr_b[v1];
                if(b < b1) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double Rl(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(arr_object[0])).doubleValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(arr_object[v1])).doubleValue());
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
    private static final Object Rm(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((int)arr_v[v1]));
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

    public static final boolean Rn(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 0;
    }

    @h0(version = "1.3")
    @f
    private static final float Ro(float[] arr_f) {
        L.p(arr_f, "<this>");
        return p.So(arr_f, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Float Rp(@l float[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)p0.invoke(v1, f, ((float)arr_f[v1]))).floatValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    public static void Rq(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_b.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            byte b = arr_b[v];
            arr_b[v] = arr_b[v3];
            arr_b[v3] = b;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Rr(boolean[] arr_z, Object object0, A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        if(arr_z.length == 0) {
            return u.k(object0);
        }
        List list0 = new ArrayList(arr_z.length + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < arr_z.length; ++v) {
            object0 = p0.invoke(v, object0, Boolean.valueOf(arr_z[v]));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Rs(@l short[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        for(int v = kotlin.collections.l.xe(arr_v); v > 0; --v) {
            int v1 = f0.m(v + 1);
            short v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
        }
    }

    @l
    public static final List Rt(@l Object[] arr_object, @l Iterable iterable0) {
        L.p(arr_object, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(arr_object[((Number)object0).intValue()]);
        }
        return list0;
    }

    @l
    public static final double[] Ru(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        o.K3(arr_f1);
        return arr_f1;
    }

    @l
    public static final Set Rv(@l double[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Zy(arr_f);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfInt")
    private static final int Rw(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            v1 += ((Number)function10.invoke(Boolean.valueOf(arr_z[v]))).intValue();
        }
        return v1;
    }

    @l
    public static final List Rx(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ue(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return p.j9(arr_v, v + 1);
            }
        }
        return p.Iy(arr_v);
    }

    @l
    public static final List Ry(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            ((ArrayList)list0).add(((float)arr_f[v]));
        }
        return list0;
    }

    @l
    public static final List Rz(@l char[] arr_c, @l char[] arr_c1, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(arr_c1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_c.length, arr_c1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(Character.valueOf(arr_c[v1]), Character.valueOf(arr_c1[v1])));
        }
        return list0;
    }

    @l
    public static final Map S5(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = (V)function10.invoke(((long)arr_v[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map S6(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(f, function10.invoke(f));
        }
        return map0;
    }

    @f
    private static final short S7(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[2];
    }

    @l
    public static final List S8(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return u.V5(p.cz(arr_v));
    }

    @f
    private static final float S9(float[] arr_f, int v, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_f.length ? ((Number)function10.invoke(v)).floatValue() : arr_f[v];
    }

    @l
    public static final List Sa(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(!((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                list0.add(Boolean.valueOf(z));
            }
        }
        return list0;
    }

    public static final Object Sb(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedSequence")
    private static final List Sc(Object[] arr_object, A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            u.r0(list0, ((kotlin.sequences.m)o0.invoke(v1, arr_object[v])));
            ++v;
        }
        return list0;
    }

    public static final void Sd(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_f.length; ++v) {
            function10.invoke(((float)arr_f[v]));
        }
    }

    @l
    public static final Map Se(@l byte[] arr_b, @l Function1 function10, @l Function1 function11) {
        L.p(arr_b, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(((byte)v1)));
        }
        return map0;
    }

    public static final int Sf(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Sg(long[] arr_v, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Jg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Jg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Jg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Jg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Byte Sh(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_b[v];
                if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                    return (byte)v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final Collection Si(@l Object[] arr_object, @l Collection collection0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            collection0.add(function10.invoke(arr_object[v]));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Sj(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((int)arr_v[v1]));
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
    @i(name = "maxOrThrow")
    public static final char Sk(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                char c1 = arr_c[v1];
                if(L.t(c, c1) < 0) {
                    c = c1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double Sl(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((short)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((short)arr_v[v1]))).doubleValue());
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
    private static final Object Sm(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((long)arr_v[v1]));
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

    public static final boolean Sn(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.3")
    public static final float So(@l float[] arr_f, @l kotlin.random.f f0) {
        L.p(arr_f, "<this>");
        L.p(f0, "random");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[f0.m(arr_f.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Integer Sp(@l int[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, v, ((int)arr_v[v2]))).intValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    public static final void Sq(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        int v = arr_c.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = p.re(arr_c);
        for(int v2 = 0; true; ++v2) {
            char c = arr_c[v2];
            arr_c[v2] = arr_c[v1];
            arr_c[v1] = c;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Sr(byte[] arr_b, A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        if(arr_b.length == 0) {
            return u.H();
        }
        int v = arr_b[0];
        List list0 = new ArrayList(arr_b.length);
        ((ArrayList)list0).add(((byte)v));
        for(int v1 = 1; v1 < arr_b.length; ++v1) {
            v = ((Number)o0.invoke(((byte)v), ((byte)arr_b[v1]))).byteValue();
            ((ArrayList)list0).add(((byte)v));
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ss(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        p.Ts(arr_z, kotlin.random.f.a);
    }

    @l
    public static List St(@l Object[] arr_object, @l kotlin.ranges.l l0) {
        L.p(arr_object, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : kotlin.collections.l.t(kotlin.collections.l.l1(arr_object, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final float[] Su(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        o.M3(arr_f1);
        return arr_f1;
    }

    @l
    public static final Set Sv(@l float[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.az(arr_f);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Sw(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            v += ((Number)function10.invoke(((byte)arr_b[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List Sx(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.ve(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return p.k9(arr_v, v + 1);
            }
        }
        return p.Jy(arr_v);
    }

    @l
    public static List Sy(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ((ArrayList)list0).add(((int)arr_v[v]));
        }
        return list0;
    }

    @l
    public static final List Sz(@l char[] arr_c, @l Object[] arr_object) {
        L.p(arr_c, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_c.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(Character.valueOf(arr_c[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final Map T5(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            V v1 = (V)function10.invoke(arr_object[v]);
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map T6(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(v1, function10.invoke(v1));
        }
        return map0;
    }

    @f
    private static final boolean T7(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z[2];
    }

    @l
    public static List T8(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return u.V5(p.dz(arr_object));
    }

    @f
    private static final int T9(int[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_v.length ? ((Number)function10.invoke(v)).intValue() : arr_v[v];
    }

    @l
    public static List Ta(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return (List)kotlin.collections.l.Ua(arr_object, new ArrayList());
    }

    public static short Tb(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[0];
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedSequenceTo")
    private static final Collection Tc(Object[] arr_object, Collection collection0, A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            u.r0(collection0, ((kotlin.sequences.m)o0.invoke(v1, arr_object[v])));
            ++v;
        }
        return collection0;
    }

    public static final void Td(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((int)arr_v[v]));
        }
    }

    @l
    public static final Map Te(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(Character.valueOf(((char)v1)));
        }
        return map0;
    }

    public static final int Tf(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public static Appendable Tg(Object[] arr_object, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Kg(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Kg(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Kg(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Kg(arr_object, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Character Th(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 0 ? null : Character.valueOf(arr_c[arr_c.length - 1]);
    }

    @l
    public static final Collection Ti(@l short[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(function10.invoke(((short)arr_v[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Tj(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((long)arr_v[v1]));
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
    @i(name = "maxOrThrow")
    public static final double Tk(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, arr_f[v1]);
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
    private static final double Tl(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).doubleValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).doubleValue());
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
    private static final Object Tm(Object[] arr_object, Comparator comparator0, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(arr_object[v1]);
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

    public static final boolean Tn(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 0;
    }

    @h0(version = "1.3")
    @f
    private static final int To(int[] arr_v) {
        L.p(arr_v, "<this>");
        return p.Uo(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Long Tp(@l long[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, v, ((long)arr_v[v2]))).longValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    public static final void Tq(@l char[] arr_c, int v, int v1) {
        L.p(arr_c, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_c.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            char c = arr_c[v];
            arr_c[v] = arr_c[v3];
            arr_c[v3] = c;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Tr(char[] arr_c, A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        if(arr_c.length == 0) {
            return u.H();
        }
        int v = arr_c[0];
        List list0 = new ArrayList(arr_c.length);
        ((ArrayList)list0).add(Character.valueOf(((char)v)));
        int v1 = 1;
        while(v1 < arr_c.length) {
            Character character0 = (Character)o0.invoke(Character.valueOf(((char)v)), Character.valueOf(arr_c[v1]));
            ((ArrayList)list0).add(character0);
            ++v1;
            v = character0.charValue();
        }
        return list0;
    }

    @h0(version = "1.4")
    public static final void Ts(@l boolean[] arr_z, @l kotlin.random.f f0) {
        L.p(arr_z, "<this>");
        L.p(f0, "random");
        for(int v = p.ye(arr_z); v > 0; --v) {
            int v1 = f0.m(v + 1);
            boolean z = arr_z[v];
            arr_z[v] = arr_z[v1];
            arr_z[v1] = z;
        }
    }

    @l
    public static final List Tt(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(((short)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final int[] Tu(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        o.O3(arr_v1);
        return arr_v1;
    }

    @l
    public static final Set Tv(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = kotlin.collections.l.bz(arr_v);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Tw(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            v += ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List Tx(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.we(arr_object); -1 < v; --v) {
            if(!((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return kotlin.collections.l.l9(arr_object, v + 1);
            }
        }
        return kotlin.collections.l.Ky(arr_object);
    }

    @l
    public static final List Ty(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ((ArrayList)list0).add(((long)arr_v[v]));
        }
        return list0;
    }

    @l
    public static final List Tz(@l char[] arr_c, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_c.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(Character.valueOf(arr_c[v1]), arr_object[v1]));
        }
        return list0;
    }

    public static final boolean U4(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(!((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map U5(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = (V)function10.invoke(((short)arr_v[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map U6(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(v1, function10.invoke(v1));
        }
        return map0;
    }

    @f
    private static final byte U7(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b[3];
    }

    @l
    public static final List U8(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return u.V5(p.ez(arr_v));
    }

    @f
    private static final long U9(long[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_v.length ? ((Number)function10.invoke(v)).longValue() : arr_v[v];
    }

    @l
    public static Collection Ua(@l Object[] arr_object, @l Collection collection0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    public static final short Ub(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            short v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapSequence")
    public static final List Uc(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            u.r0(list0, ((kotlin.sequences.m)function10.invoke(arr_object[v])));
        }
        return list0;
    }

    public static final void Ud(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((long)arr_v[v]));
        }
    }

    @l
    public static final Map Ue(@l char[] arr_c, @l Function1 function10, @l Function1 function11) {
        L.p(arr_c, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    public static final int Uf(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
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

    public static Appendable Ug(short[] arr_v, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Lg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Lg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Lg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Lg(arr_v, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Character Uh(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_c[v];
                if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                    return Character.valueOf(((char)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final Collection Ui(@l boolean[] arr_z, @l Collection collection0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_z.length; ++v) {
            collection0.add(function10.invoke(Boolean.valueOf(arr_z[v])));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Uj(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(arr_object[v1]);
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
    @i(name = "maxOrThrow")
    public static final double Uk(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        if(arr_double.length == 0) {
            throw new NoSuchElementException();
        }
        double f = (double)arr_double[0];
        int v = kotlin.collections.l.we(arr_double);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((double)arr_double[v1]));
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
    private static final float Ul(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((byte)arr_b[0]))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((byte)arr_b[v1]))).floatValue());
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
    private static final Object Um(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((short)arr_v[v1]));
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

    public static final boolean Un(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.3")
    public static final int Uo(@l int[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[f0.m(arr_v.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Object Up(@l Object[] arr_object, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = p0.invoke(v1, object0, arr_object[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final void Uq(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        int v = arr_f.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = p.se(arr_f);
        for(int v2 = 0; true; ++v2) {
            double f = arr_f[v2];
            arr_f[v2] = arr_f[v1];
            arr_f[v1] = f;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Ur(double[] arr_f, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return u.H();
        }
        double f = arr_f[0];
        List list0 = new ArrayList(arr_f.length);
        ((ArrayList)list0).add(f);
        for(int v = 1; v < arr_f.length; ++v) {
            f = ((Number)o0.invoke(f, ((double)arr_f[v]))).doubleValue();
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    public static byte Us(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        switch(arr_b.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_b[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static final List Ut(@l short[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : o.u(kotlin.collections.l.m1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final long[] Uu(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        o.Q3(arr_v1);
        return arr_v1;
    }

    @l
    public static final Set Uv(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.cz(arr_v);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Uw(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            v += ((Number)function10.invoke(((double)arr_f[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List Ux(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.xe(arr_v); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return p.m9(arr_v, v + 1);
            }
        }
        return p.Ly(arr_v);
    }

    @l
    public static List Uy(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return new ArrayList(kotlin.collections.w.t(arr_object));
    }

    @l
    public static final List Uz(@l double[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(((double)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    public static final boolean V4(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(!((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map V5(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            V v1 = (V)function10.invoke(Boolean.valueOf(arr_z[v]));
            map0.put(v1.e(), v1.f());
        }
        return map0;
    }

    @h0(version = "1.4")
    @l
    public static final Map V6(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @f
    private static final char V7(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c[3];
    }

    @l
    public static final List V8(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return u.V5(p.fz(arr_z));
    }

    @f
    private static final Object V9(Object[] arr_object, int v, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_object.length ? function10.invoke(v) : arr_object[v];
    }

    @l
    public static final Collection Va(@l byte[] arr_b, @l Collection collection0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                collection0.add(((byte)v1));
            }
        }
        return collection0;
    }

    public static final boolean Vb(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        if(arr_z.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_z[0];
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapSequenceTo")
    public static final Collection Vc(@l Object[] arr_object, @l Collection collection0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            u.r0(collection0, ((kotlin.sequences.m)function10.invoke(arr_object[v])));
        }
        return collection0;
    }

    public static final void Vd(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_object.length; ++v) {
            function10.invoke(arr_object[v]);
        }
    }

    @l
    public static final Map Ve(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    public static final int Vf(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
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

    public static Appendable Vg(boolean[] arr_z, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? p.Mg(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : p.Mg(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? p.Mg(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : p.Mg(arr_z, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @m
    public static final Double Vh(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((double)arr_f[arr_f.length - 1]);
    }

    @h0(version = "1.4")
    @m
    public static final Boolean Vi(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
                if(comparable0.compareTo(comparable1) < 0) {
                    z = z1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Vj(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((short)arr_v[v1]));
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
    @i(name = "maxOrThrow")
    public static final float Vk(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, arr_f[v1]);
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
    private static final float Vl(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).floatValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).floatValue());
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
    private static final Object Vm(boolean[] arr_z, Comparator comparator0, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Boolean.valueOf(arr_z[v1]));
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

    public static final boolean Vn(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0;
    }

    @h0(version = "1.3")
    @f
    private static final long Vo(long[] arr_v) {
        L.p(arr_v, "<this>");
        return p.Wo(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Short Vp(@l short[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)p0.invoke(v2, ((short)v), ((short)arr_v[v2]))).shortValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @h0(version = "1.4")
    public static final void Vq(@l double[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_f.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            double f = arr_f[v];
            arr_f[v] = arr_f[v3];
            arr_f[v3] = f;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Vr(float[] arr_f, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return u.H();
        }
        float f = arr_f[0];
        List list0 = new ArrayList(arr_f.length);
        ((ArrayList)list0).add(f);
        for(int v = 1; v < arr_f.length; ++v) {
            f = ((Number)o0.invoke(f, ((float)arr_f[v]))).floatValue();
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    public static final byte Vs(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        Byte byte0 = null;
        boolean z = false;
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                byte0 = (byte)v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(byte0, "null cannot be cast to non-null type kotlin.Byte");
        return (byte)byte0;
    }

    @l
    public static final List Vt(@l boolean[] arr_z, @l Iterable iterable0) {
        L.p(arr_z, "<this>");
        L.p(iterable0, "indices");
        int v = u.b0(iterable0, 10);
        if(v == 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[((Number)object0).intValue()]));
        }
        return list0;
    }

    @l
    public static final Comparable[] Vu(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return arr_comparable;
        }
        Object[] arr_object = Arrays.copyOf(arr_comparable, arr_comparable.length);
        L.o(arr_object, "copyOf(...)");
        kotlin.collections.l.U3(((Comparable[])arr_object));
        return (Comparable[])arr_object;
    }

    @l
    public static final Set Vv(@l Object[] arr_object, @l Iterable iterable0) {
        L.p(arr_object, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.dz(arr_object);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Vw(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            v += ((Number)function10.invoke(((float)arr_f[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List Vx(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = p.ye(arr_z); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return p.n9(arr_z, v + 1);
            }
        }
        return p.My(arr_z);
    }

    @l
    public static final List Vy(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ((ArrayList)list0).add(((short)arr_v[v]));
        }
        return list0;
    }

    @l
    public static final List Vz(@l double[] arr_f, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(((double)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    public static final boolean W4(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(!((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map W5(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), ((byte)v1));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map W6(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(((short)v1), function10.invoke(((short)v1)));
        }
        return map0;
    }

    @f
    private static final double W7(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[3];
    }

    @l
    public static final List W8(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(hashSet0.add(function10.invoke(((byte)v1)))) {
                ((ArrayList)list0).add(((byte)v1));
            }
        }
        return list0;
    }

    @f
    private static final short W9(short[] arr_v, int v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_v.length ? ((Number)function10.invoke(v)).shortValue() : arr_v[v];
    }

    @l
    public static final Collection Wa(@l char[] arr_c, @l Collection collection0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                collection0.add(Character.valueOf(((char)v1)));
            }
        }
        return collection0;
    }

    public static final boolean Wb(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                return z;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l
    public static final Collection Wc(@l byte[] arr_b, @l Collection collection0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_b.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(((byte)arr_b[v]))));
        }
        return collection0;
    }

    public static final void Wd(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((short)arr_v[v]));
        }
    }

    @l
    public static final Map We(@l double[] arr_f, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    public static final int Wf(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
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

    @l
    public static final String Wg(@l byte[] arr_b, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Eg(arr_b, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Double Wh(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                double f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.4")
    @m
    public static final Byte Wi(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((byte)v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable Wj(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[v1]));
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
    @i(name = "maxOrThrow")
    public static final float Wk(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        if(arr_float.length == 0) {
            throw new NoSuchElementException();
        }
        float f = (float)arr_float[0];
        int v = kotlin.collections.l.we(arr_float);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((float)arr_float[v1]));
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
    private static final float Wl(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((double)arr_f[0]))).floatValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((double)arr_f[v1]))).floatValue());
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
    private static final Object Wm(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((byte)arr_b[v1]));
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

    public static final boolean Wn(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.3")
    public static final long Wo(@l long[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[f0.m(arr_v.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Boolean Wp(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                z = ((Boolean)o0.invoke(Boolean.valueOf(z), Boolean.valueOf(arr_z[v1]))).booleanValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final void Wq(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        int v = arr_f.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = p.te(arr_f);
        for(int v2 = 0; true; ++v2) {
            float f = arr_f[v2];
            arr_f[v2] = arr_f[v1];
            arr_f[v1] = f;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Wr(int[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.H();
        }
        int v = arr_v[0];
        List list0 = new ArrayList(arr_v.length);
        ((ArrayList)list0).add(v);
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = ((Number)o0.invoke(v, ((int)arr_v[v1]))).intValue();
            ((ArrayList)list0).add(v);
        }
        return list0;
    }

    public static char Ws(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_c[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static final List Wt(@l boolean[] arr_z, @l kotlin.ranges.l l0) {
        L.p(arr_z, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? u.H() : o.v(o.n1(arr_z, ((int)l0.q()), ((int)l0.p()) + 1));
    }

    @l
    public static final short[] Wu(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        o.W3(arr_v1);
        return arr_v1;
    }

    @l
    public static final Set Wv(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.ez(arr_v);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Ww(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v += ((Number)function10.invoke(((int)arr_v[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List Wx(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(!((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(((byte)v1));
        }
        return list0;
    }

    @l
    public static final List Wy(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        List list0 = new ArrayList(arr_z.length);
        for(int v = 0; v < arr_z.length; ++v) {
            ((ArrayList)list0).add(Boolean.valueOf(arr_z[v]));
        }
        return list0;
    }

    @l
    public static final List Wz(@l double[] arr_f, @l double[] arr_f1) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "other");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((double)arr_f[v1]), ((double)arr_f1[v1])));
        }
        return list0;
    }

    public static final boolean X4(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(!((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map X5(@l byte[] arr_b, @l Function1 function10, @l Function1 function11) {
        L.p(arr_b, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_b.length), 16));
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map X6(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(Boolean.valueOf(z), function10.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @f
    private static final float X7(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[3];
    }

    @l
    public static final List X8(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(hashSet0.add(function10.invoke(Character.valueOf(((char)v1))))) {
                ((ArrayList)list0).add(Character.valueOf(((char)v1)));
            }
        }
        return list0;
    }

    @f
    private static final boolean X9(boolean[] arr_z, int v, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_z.length ? ((Boolean)function10.invoke(v)).booleanValue() : arr_z[v];
    }

    @l
    public static final Collection Xa(@l double[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @h0(version = "1.5")
    @f
    private static final Object Xb(Object[] arr_object, Function1 function10) {
        Object object0;
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        for(int v = 0; true; ++v) {
            object0 = null;
            if(v >= arr_object.length) {
                break;
            }
            Object object1 = function10.invoke(arr_object[v]);
            if(object1 != null) {
                object0 = object1;
                break;
            }
        }
        if(object0 == null) {
            throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
        }
        return object0;
    }

    @l
    public static final Collection Xc(@l char[] arr_c, @l Collection collection0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_c.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(Character.valueOf(arr_c[v]))));
        }
        return collection0;
    }

    public static final void Xd(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_z.length; ++v) {
            function10.invoke(Boolean.valueOf(arr_z[v]));
        }
    }

    @l
    public static final Map Xe(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    public static final int Xf(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
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

    @l
    public static final String Xg(@l char[] arr_c, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Fg(arr_c, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Float Xh(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((float)arr_f[arr_f.length - 1]);
    }

    @h0(version = "1.4")
    @m
    public static final Character Xi(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v3)));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double Xj(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((byte)arr_b[0]))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((byte)arr_b[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxOrThrow")
    public static int Xk(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Xl(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((float)arr_f[0]))).floatValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((float)arr_f[v1]))).floatValue());
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
    private static final Object Xm(char[] arr_c, Comparator comparator0, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Character.valueOf(arr_c[v1]));
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

    public static final boolean Xn(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0;
    }

    @h0(version = "1.3")
    @f
    private static final Object Xo(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return p.Yo(arr_object, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Byte Xp(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(((byte)v), ((byte)arr_b[v2]))).byteValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @h0(version = "1.4")
    public static final void Xq(@l float[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_f.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            float f = arr_f[v];
            arr_f[v] = arr_f[v3];
            arr_f[v3] = f;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Xr(long[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.H();
        }
        long v = arr_v[0];
        List list0 = new ArrayList(arr_v.length);
        ((ArrayList)list0).add(v);
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = ((Number)o0.invoke(v, ((long)arr_v[v1]))).longValue();
            ((ArrayList)list0).add(v);
        }
        return list0;
    }

    public static final char Xs(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        Character character0 = null;
        boolean z = false;
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                character0 = Character.valueOf(((char)v1));
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(character0, "null cannot be cast to non-null type kotlin.Char");
        return character0.charValue();
    }

    @l
    public static byte[] Xt(@l byte[] arr_b, @l Collection collection0) {
        L.p(arr_b, "<this>");
        L.p(collection0, "indices");
        byte[] arr_b1 = new byte[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_b1[v] = arr_b[((Number)object0).intValue()];
            ++v;
        }
        return arr_b1;
    }

    @l
    public static final byte[] Xu(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        p.ru(arr_b1);
        return arr_b1;
    }

    @l
    public static final Set Xv(@l boolean[] arr_z, @l Iterable iterable0) {
        L.p(arr_z, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.fz(arr_z);
        u.H0(set0, iterable0);
        return set0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Xw(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v += ((Number)function10.invoke(((long)arr_v[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List Xx(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(Character.valueOf(((char)v1)));
        }
        return list0;
    }

    @l
    public static final Set Xy(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return (Set)p.jy(arr_b, new LinkedHashSet(Y.j(arr_b.length)));
    }

    @l
    public static final List Xz(@l double[] arr_f, @l double[] arr_f1, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((double)arr_f[v1]), ((double)arr_f1[v1])));
        }
        return list0;
    }

    public static final boolean Y4(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(!((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map Y5(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_c.length), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map Y6(byte[] arr_b, Map map0, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(((byte)v1), function10.invoke(((byte)v1)));
        }
        return map0;
    }

    @f
    private static final int Y7(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[3];
    }

    @l
    public static final List Y8(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(hashSet0.add(function10.invoke(f))) {
                ((ArrayList)list0).add(f);
            }
        }
        return list0;
    }

    @f
    private static final Boolean Y9(boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        return p.Ie(arr_z, v);
    }

    @l
    public static final Collection Ya(@l float[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @h0(version = "1.5")
    @f
    private static final Object Yb(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = function10.invoke(arr_object[v]);
            if(object0 != null) {
                return object0;
            }
        }
        return null;
    }

    @l
    public static final Collection Yc(@l double[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(((double)arr_f[v]))));
        }
        return collection0;
    }

    public static final void Yd(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            o0.invoke(v1, ((byte)arr_b[v]));
            ++v;
        }
    }

    @l
    public static final Map Ye(@l float[] arr_f, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    public static final int Yf(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
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

    @l
    public static final String Yg(@l double[] arr_f, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Gg(arr_f, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Float Yh(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                float f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.4")
    @m
    public static final Double Yi(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) < 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Double Yj(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).doubleValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxOrThrow")
    public static final long Yk(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float Yl(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((int)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((int)arr_v[v1]))).floatValue());
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
    private static final Object Ym(double[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((double)arr_f[v1]));
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

    public static final boolean Yn(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.3")
    public static final Object Yo(@l Object[] arr_object, @l kotlin.random.f f0) {
        L.p(arr_object, "<this>");
        L.p(f0, "random");
        if(arr_object.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_object[f0.m(arr_object.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Character Yp(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Character)o0.invoke(Character.valueOf(((char)v)), Character.valueOf(arr_c[v2]))).charValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    public static void Yq(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        int v = arr_v.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = kotlin.collections.l.ue(arr_v);
        for(int v2 = 0; true; ++v2) {
            int v3 = arr_v[v2];
            arr_v[v2] = arr_v[v1];
            arr_v[v1] = v3;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @l
    public static final List Yr(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        if(arr_object.length == 0) {
            return u.H();
        }
        Object object0 = arr_object[0];
        List list0 = new ArrayList(arr_object.length);
        ((ArrayList)list0).add(object0);
        for(int v = 1; v < arr_object.length; ++v) {
            object0 = o0.invoke(object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    public static final double Ys(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_f[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static byte[] Yt(@l byte[] arr_b, @l kotlin.ranges.l l0) {
        L.p(arr_b, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new byte[0] : kotlin.collections.l.f1(arr_b, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final char[] Yu(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            return arr_c;
        }
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        L.o(arr_c1, "copyOf(...)");
        p.tu(arr_c1);
        return arr_c1;
    }

    public static final double Yv(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
        }
        return f;
    }

    @i(name = "sumOfLong")
    public static final long Yw(@l Long[] arr_long) {
        L.p(arr_long, "<this>");
        long v = 0L;
        for(int v1 = 0; v1 < arr_long.length; ++v1) {
            v += (long)arr_long[v1];
        }
        return v;
    }

    @l
    public static final List Yx(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    @l
    public static final Set Yy(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return (Set)p.ky(arr_c, new LinkedHashSet(Y.j(kotlin.ranges.s.B(arr_c.length, 0x80))));
    }

    @l
    public static final List Yz(@l double[] arr_f, @l Object[] arr_object) {
        L.p(arr_f, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((double)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    public static final boolean Z4(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(!((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map Z5(@l char[] arr_c, @l Function1 function10, @l Function1 function11) {
        L.p(arr_c, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_c.length), 16));
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map Z6(char[] arr_c, Map map0, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(Character.valueOf(((char)v1)), function10.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @f
    private static final long Z7(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[3];
    }

    @l
    public static final List Z8(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(hashSet0.add(function10.invoke(f))) {
                ((ArrayList)list0).add(f);
            }
        }
        return list0;
    }

    @f
    private static final Byte Z9(byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        return p.Je(arr_b, v);
    }

    @l
    public static final Collection Za(@l int[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @m
    public static final Boolean Zb(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 0 ? null : Boolean.valueOf(arr_z[0]);
    }

    @l
    public static final Collection Zc(@l float[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_f.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(((float)arr_f[v]))));
        }
        return collection0;
    }

    public static final void Zd(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            o0.invoke(v1, Character.valueOf(arr_c[v]));
            ++v;
        }
    }

    @l
    public static final Map Ze(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    public static final int Zf(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
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

    @l
    public static final String Zg(@l float[] arr_f, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Hg(arr_f, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Integer Zh(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((int)arr_v[arr_v.length - 1]);
    }

    @h0(version = "1.4")
    @m
    public static final Float Zi(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) < 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Double Zj(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((double)arr_f[0]))).doubleValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((double)arr_f[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @l
    @i(name = "maxOrThrow")
    public static final Comparable Zk(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = arr_comparable[0];
        int v = kotlin.collections.l.we(arr_comparable);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = arr_comparable[v1];
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
    private static final float Zl(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((long)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((long)arr_v[v1]))).floatValue());
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
    private static final Object Zm(float[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((float)arr_f[v1]));
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

    public static final boolean Zn(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0;
    }

    @h0(version = "1.3")
    @f
    private static final short Zo(short[] arr_v) {
        L.p(arr_v, "<this>");
        return p.ap(arr_v, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Double Zp(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)o0.invoke(f, ((double)arr_f[v1]))).doubleValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    public static void Zq(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_v.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            int v4 = arr_v[v];
            arr_v[v] = arr_v[v3];
            arr_v[v3] = v4;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List Zr(short[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.H();
        }
        int v = arr_v[0];
        List list0 = new ArrayList(arr_v.length);
        ((ArrayList)list0).add(((short)v));
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = ((Number)o0.invoke(((short)v), ((short)arr_v[v1]))).shortValue();
            ((ArrayList)list0).add(((short)v));
        }
        return list0;
    }

    public static final double Zs(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        Double double0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                double0 = f;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(double0, "null cannot be cast to non-null type kotlin.Double");
        return (double)double0;
    }

    @l
    public static final char[] Zt(@l char[] arr_c, @l Collection collection0) {
        L.p(arr_c, "<this>");
        L.p(collection0, "indices");
        char[] arr_c1 = new char[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_c1[v] = arr_c[((Number)object0).intValue()];
            ++v;
        }
        return arr_c1;
    }

    @l
    public static final double[] Zu(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        p.vu(arr_f1);
        return arr_f1;
    }

    public static final float Zv(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        float f = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long Zw(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            v += ((Number)function10.invoke(arr_object[v1])).longValue();
        }
        return v;
    }

    @l
    public static final List Zx(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(!((Boolean)function10.invoke(f)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    @l
    public static final Set Zy(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return (Set)p.ly(arr_f, new LinkedHashSet(Y.j(arr_f.length)));
    }

    @l
    public static final List Zz(@l double[] arr_f, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((double)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    public static final boolean a5(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(!((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map a6(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map a7(double[] arr_f, Map map0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(f, function10.invoke(f));
        }
        return map0;
    }

    @f
    private static final Object a8(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object[3];
    }

    @l
    public static final List a9(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(hashSet0.add(function10.invoke(v1))) {
                ((ArrayList)list0).add(v1);
            }
        }
        return list0;
    }

    @l
    public static final List aA(@l float[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(((float)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    @f
    private static final Character aa(char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        return p.Ke(arr_c, v);
    }

    @l
    public static final Collection ab(@l long[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @m
    public static final Boolean ac(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @l
    public static final Collection ad(@l int[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(((int)arr_v[v]))));
        }
        return collection0;
    }

    public static final void ae(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            o0.invoke(v1, ((double)arr_f[v]));
            ++v;
        }
    }

    @l
    public static final Map af(@l int[] arr_v, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    public static final int ag(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
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

    @l
    public static final String ah(@l int[] arr_v, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Ig(arr_v, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Integer ai(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.4")
    @m
    public static final Integer aj(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Double ak(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((float)arr_f[0]))).doubleValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((float)arr_f[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxOrThrow")
    public static final short al(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = arr_v[v2];
                if(v < v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float am(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(arr_object[0])).floatValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(arr_object[v1])).floatValue());
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
    private static final Object an(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((int)arr_v[v1]));
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

    public static final boolean ao(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.3")
    public static final short ap(@l short[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[f0.m(arr_v.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Float aq(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)o0.invoke(f, ((float)arr_f[v1]))).floatValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    public static void ar(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        int v = arr_v.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = kotlin.collections.l.ve(arr_v);
        for(int v2 = 0; true; ++v2) {
            long v3 = arr_v[v2];
            arr_v[v2] = arr_v[v1];
            arr_v[v1] = v3;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List as(boolean[] arr_z, A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        if(arr_z.length == 0) {
            return u.H();
        }
        boolean z = arr_z[0];
        List list0 = new ArrayList(arr_z.length);
        ((ArrayList)list0).add(Boolean.valueOf(z));
        int v = 1;
        while(v < arr_z.length) {
            Boolean boolean0 = (Boolean)o0.invoke(Boolean.valueOf(z), Boolean.valueOf(arr_z[v]));
            ((ArrayList)list0).add(boolean0);
            ++v;
            z = boolean0.booleanValue();
        }
        return list0;
    }

    public static final float at(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_f[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static final char[] au(@l char[] arr_c, @l kotlin.ranges.l l0) {
        L.p(arr_c, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new char[0] : o.g1(arr_c, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final float[] av(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        p.xu(arr_f1);
        return arr_f1;
    }

    public static final int aw(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 += arr_b[v];
        }
        return v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long ax(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v += ((Number)function10.invoke(((short)arr_v[v1]))).longValue();
        }
        return v;
    }

    @l
    public static final List ay(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(v1);
        }
        return list0;
    }

    @l
    public static final Set az(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return (Set)p.my(arr_f, new LinkedHashSet(Y.j(arr_f.length)));
    }

    public static final boolean b5(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(!((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map b6(@l double[] arr_f, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map b7(float[] arr_f, Map map0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(f, function10.invoke(f));
        }
        return map0;
    }

    @f
    private static final short b8(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[3];
    }

    @l
    public static final List b9(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(hashSet0.add(function10.invoke(v1))) {
                ((ArrayList)list0).add(v1);
            }
        }
        return list0;
    }

    @l
    public static final List bA(@l float[] arr_f, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_f.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_f.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(((float)arr_f[v]), object0));
            ++v;
        }
        return list0;
    }

    @f
    private static final Double ba(double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        return p.Le(arr_f, v);
    }

    @l
    public static final Collection bb(@l Object[] arr_object, @l Collection collection0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @m
    public static final Byte bc(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 0 ? null : ((byte)arr_b[0]);
    }

    @l
    public static final Collection bd(@l long[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(((long)arr_v[v]))));
        }
        return collection0;
    }

    public static final void be(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            o0.invoke(v1, ((float)arr_f[v]));
            ++v;
        }
    }

    @l
    public static final Map bf(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    public static final int bg(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
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

    @l
    public static final String bh(@l long[] arr_v, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Jg(arr_v, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Long bi(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((long)arr_v[arr_v.length - 1]);
    }

    @h0(version = "1.4")
    @m
    public static final Long bj(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Double bk(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((int)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((int)arr_v[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Boolean bl(@l boolean[] arr_z, @l Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) < 0) {
                    z = z1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float bm(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((short)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((short)arr_v[v1]))).floatValue());
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
    private static final Object bn(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((long)arr_v[v1]));
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

    public static final boolean bo(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0;
    }

    @h0(version = "1.3")
    @f
    private static final boolean bp(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return p.cp(arr_z, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Integer bq(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(v, ((int)arr_v[v2]))).intValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    public static void br(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_v.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            long v4 = arr_v[v];
            arr_v[v] = arr_v[v3];
            arr_v[v3] = v4;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List bs(byte[] arr_b, A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        if(arr_b.length == 0) {
            return u.H();
        }
        int v = arr_b[0];
        List list0 = new ArrayList(arr_b.length);
        ((ArrayList)list0).add(((byte)v));
        for(int v1 = 1; v1 < arr_b.length; ++v1) {
            v = ((Number)p0.invoke(v1, ((byte)v), ((byte)arr_b[v1]))).byteValue();
            ((ArrayList)list0).add(((byte)v));
        }
        return list0;
    }

    public static final float bt(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        Float float0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                float0 = f;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(float0, "null cannot be cast to non-null type kotlin.Float");
        return (float)float0;
    }

    @l
    public static final double[] bu(@l double[] arr_f, @l Collection collection0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "indices");
        double[] arr_f1 = new double[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_f1[v] = arr_f[((Number)object0).intValue()];
            ++v;
        }
        return arr_f1;
    }

    @l
    public static final int[] bv(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        p.zu(arr_v1);
        return arr_v1;
    }

    public static int bw(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        return v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long bx(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            v += ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).longValue();
        }
        return v;
    }

    @l
    public static Set bz(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return (Set)p.ny(arr_v, new LinkedHashSet(Y.j(arr_v.length)));
    }

    public static final boolean c5(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(!((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Map c6(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map c7(int[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(v1, function10.invoke(v1));
        }
        return map0;
    }

    @f
    private static final boolean c8(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z[3];
    }

    @l
    public static final List c9(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(hashSet0.add(function10.invoke(object0))) {
                ((ArrayList)list0).add(object0);
            }
        }
        return list0;
    }

    @l
    public static final List cA(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "other");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((float)arr_f[v1]), ((float)arr_f1[v1])));
        }
        return list0;
    }

    @f
    private static final Float ca(float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        return p.Me(arr_f, v);
    }

    @l
    public static final Collection cb(@l short[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                collection0.add(((short)v1));
            }
        }
        return collection0;
    }

    @m
    public static final Byte cc(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                return (byte)v1;
            }
        }
        return null;
    }

    @l
    public static final Collection cd(@l Object[] arr_object, @l Collection collection0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_object.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(arr_object[v])));
        }
        return collection0;
    }

    public static final void ce(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            o0.invoke(v1, ((int)arr_v[v]));
            ++v;
        }
    }

    @l
    public static final Map cf(@l long[] arr_v, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    public static final int cg(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
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

    @l
    public static final String ch(@l Object[] arr_object, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Kg(arr_object, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Long ci(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                long v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
                    return v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.4")
    @m
    public static final Object cj(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
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
    private static final Double ck(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((long)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((long)arr_v[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Byte cl(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                if(comparator0.compare(((byte)v), ((byte)v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float cm(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).floatValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).floatValue());
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
    private static final Object cn(Object[] arr_object, Comparator comparator0, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(arr_object[v1]);
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

    public static final boolean co(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.3")
    public static final boolean cp(@l boolean[] arr_z, @l kotlin.random.f f0) {
        L.p(arr_z, "<this>");
        L.p(f0, "random");
        if(arr_z.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_z[f0.m(arr_z.length)];
    }

    @h0(version = "1.4")
    @m
    public static final Long cq(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(v, ((long)arr_v[v2]))).longValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    public static final void cr(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        int v = arr_object.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = kotlin.collections.l.we(arr_object);
        for(int v2 = 0; true; ++v2) {
            Object object0 = arr_object[v2];
            arr_object[v2] = arr_object[v1];
            arr_object[v1] = object0;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List cs(char[] arr_c, A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        if(arr_c.length == 0) {
            return u.H();
        }
        int v = arr_c[0];
        List list0 = new ArrayList(arr_c.length);
        ((ArrayList)list0).add(Character.valueOf(((char)v)));
        int v1 = 1;
        while(v1 < arr_c.length) {
            Character character0 = (Character)p0.invoke(v1, Character.valueOf(((char)v)), Character.valueOf(arr_c[v1]));
            ((ArrayList)list0).add(character0);
            ++v1;
            v = character0.charValue();
        }
        return list0;
    }

    public static int ct(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_v[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static final double[] cu(@l double[] arr_f, @l kotlin.ranges.l l0) {
        L.p(arr_f, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new double[0] : o.h1(arr_f, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final long[] cv(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        p.Bu(arr_v1);
        return arr_v1;
    }

    public static final int cw(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        return v1;
    }

    @i(name = "sumOfShort")
    public static final int cx(@l Short[] arr_short) {
        L.p(arr_short, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_short.length; ++v) {
            v1 += (short)arr_short[v];
        }
        return v1;
    }

    @l
    public static final List cy(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(!((Boolean)function10.invoke(v1)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(v1);
        }
        return list0;
    }

    @l
    public static final Set cz(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return (Set)p.oy(arr_v, new LinkedHashSet(Y.j(arr_v.length)));
    }

    public static boolean d5(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 0 ? 0 : 1;
    }

    @l
    public static final Map d6(@l float[] arr_f, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_f.length), 16));
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map d7(long[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(v1, function10.invoke(v1));
        }
        return map0;
    }

    @f
    private static final byte d8(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b[4];
    }

    @l
    public static final List d9(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(hashSet0.add(function10.invoke(((short)v1)))) {
                ((ArrayList)list0).add(((short)v1));
            }
        }
        return list0;
    }

    @l
    public static final List dA(@l float[] arr_f, @l float[] arr_f1, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_f.length, arr_f1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((float)arr_f[v1]), ((float)arr_f1[v1])));
        }
        return list0;
    }

    @f
    private static final Integer da(int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.Ne(arr_v, v);
    }

    @l
    public static final Collection db(@l boolean[] arr_z, @l Collection collection0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(!((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                collection0.add(Boolean.valueOf(z));
            }
        }
        return collection0;
    }

    @m
    public static final Character dc(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 0 ? null : Character.valueOf(arr_c[0]);
    }

    @l
    public static final Collection dd(@l short[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_v.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(((short)arr_v[v]))));
        }
        return collection0;
    }

    public static final void de(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            o0.invoke(v1, ((long)arr_v[v]));
            ++v;
        }
    }

    @l
    public static final Map df(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    @l
    public static final Set dg(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Xy(arr_b);
        u.R0(set0, iterable0);
        return set0;
    }

    @l
    public static final String dh(@l short[] arr_v, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Lg(arr_v, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static Object di(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 0 ? null : arr_object[arr_object.length - 1];
    }

    @h0(version = "1.4")
    @m
    public static final Short dj(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((short)v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double dk(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(arr_object[0])).doubleValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(arr_object[v1])).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Character dl(@l char[] arr_c, @l Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                if(comparator0.compare(Character.valueOf(((char)v)), Character.valueOf(((char)v3))) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable dm(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((byte)arr_b[v1]));
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

    @U
    @h0(version = "1.4")
    @f
    private static final Object dn(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((short)arr_v[v1]));
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

    @h0(version = "1.4")
    @f
    private static final Boolean dp(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return p.ep(arr_z, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @m
    public static final Object dq(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = o0.invoke(object0, arr_object[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @h0(version = "1.4")
    public static final void dr(@l Object[] arr_object, int v, int v1) {
        L.p(arr_object, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_object.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            Object object0 = arr_object[v];
            arr_object[v] = arr_object[v3];
            arr_object[v3] = object0;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List ds(double[] arr_f, A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return u.H();
        }
        double f = arr_f[0];
        List list0 = new ArrayList(arr_f.length);
        ((ArrayList)list0).add(f);
        for(int v = 1; v < arr_f.length; ++v) {
            f = ((Number)p0.invoke(v, f, ((double)arr_f[v]))).doubleValue();
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    public static final int dt(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        Integer integer0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                integer0 = v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(integer0, "null cannot be cast to non-null type kotlin.Int");
        return (int)integer0;
    }

    @l
    public static final float[] du(@l float[] arr_f, @l Collection collection0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "indices");
        float[] arr_f1 = new float[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_f1[v] = arr_f[((Number)object0).intValue()];
            ++v;
        }
        return arr_f1;
    }

    @l
    public static final Comparable[] dv(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return arr_comparable;
        }
        Object[] arr_object = Arrays.copyOf(arr_comparable, arr_comparable.length);
        L.o(arr_object, "copyOf(...)");
        kotlin.collections.l.h4(((Comparable[])arr_object), kotlin.comparisons.a.x());
        return (Comparable[])arr_object;
    }

    public static long dw(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v += arr_v[v1];
        }
        return v;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int dx(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(((byte)arr_b[v]))).l0());
        }
        return v1;
    }

    @l
    public static final List dy(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @l
    public static final Set dz(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return (Set)p.py(arr_object, new LinkedHashSet(Y.j(arr_object.length)));
    }

    public static final boolean e5(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map e6(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @h0(version = "1.4")
    @l
    public static final Map e7(@l Object[] arr_object, @l Map map0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @f
    private static final char e8(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c[4];
    }

    @l
    public static final List e9(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet();
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(hashSet0.add(function10.invoke(Boolean.valueOf(z)))) {
                ((ArrayList)list0).add(Boolean.valueOf(z));
            }
        }
        return list0;
    }

    @l
    public static final List eA(@l float[] arr_f, @l Object[] arr_object) {
        L.p(arr_f, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((float)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    @f
    private static final Long ea(long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return p.Oe(arr_v, v);
    }

    @l
    public static final Collection eb(@l byte[] arr_b, @l Collection collection0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                collection0.add(((byte)v1));
            }
        }
        return collection0;
    }

    @m
    public static final Character ec(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                return Character.valueOf(((char)v1));
            }
        }
        return null;
    }

    @l
    public static final Collection ed(@l boolean[] arr_z, @l Collection collection0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(int v = 0; v < arr_z.length; ++v) {
            u.q0(collection0, ((Iterable)function10.invoke(Boolean.valueOf(arr_z[v]))));
        }
        return collection0;
    }

    public static final void ee(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            o0.invoke(v1, arr_object[v]);
            ++v;
        }
    }

    @l
    public static final Map ef(@l Object[] arr_object, @l Function1 function10, @l Function1 function11) {
        L.p(arr_object, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @l
    public static final Set eg(@l char[] arr_c, @l Iterable iterable0) {
        L.p(arr_c, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Yy(arr_c);
        u.R0(set0, iterable0);
        return set0;
    }

    @l
    public static final String eh(@l boolean[] arr_z, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)p.Mg(arr_z, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @m
    public static final Object ei(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        int v = arr_object.length - 1;
        if(v >= 0) {
            while(true) {
                Object object0 = arr_object[v];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final byte ej(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(v == 0) {
            return b;
        }
        Comparable comparable0 = (Comparable)function10.invoke(b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = arr_b[v1];
                Comparable comparable1 = (Comparable)function10.invoke(b1);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Double ek(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((short)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((short)arr_v[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Double el(@l double[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                if(comparator0.compare(f, f1) < 0) {
                    f = f1;
                }
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
    private static final Comparable em(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(arr_c[v1]));
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

    @U
    @h0(version = "1.4")
    @f
    private static final Object en(boolean[] arr_z, Comparator comparator0, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Boolean.valueOf(arr_z[v1]));
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

    public static final boolean eo(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 0;
    }

    @h0(version = "1.4")
    @m
    public static final Boolean ep(@l boolean[] arr_z, @l kotlin.random.f f0) {
        L.p(arr_z, "<this>");
        L.p(f0, "random");
        return arr_z.length == 0 ? null : Boolean.valueOf(arr_z[f0.m(arr_z.length)]);
    }

    @h0(version = "1.4")
    @m
    public static final Short eq(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(((short)v), ((short)arr_v[v2]))).shortValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    public static void er(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        int v = arr_v.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = kotlin.collections.l.xe(arr_v);
        for(int v2 = 0; true; ++v2) {
            short v3 = arr_v[v2];
            arr_v[v2] = arr_v[v1];
            arr_v[v1] = v3;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List es(float[] arr_f, A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return u.H();
        }
        float f = arr_f[0];
        List list0 = new ArrayList(arr_f.length);
        ((ArrayList)list0).add(f);
        for(int v = 1; v < arr_f.length; ++v) {
            f = ((Number)p0.invoke(v, f, ((float)arr_f[v]))).floatValue();
            ((ArrayList)list0).add(f);
        }
        return list0;
    }

    public static long et(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_v[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static final float[] eu(@l float[] arr_f, @l kotlin.ranges.l l0) {
        L.p(arr_f, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new float[0] : kotlin.collections.l.i1(arr_f, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final short[] ev(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        p.Fu(arr_v1);
        return arr_v1;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int ew(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 += ((Number)function10.invoke(((byte)arr_b[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int ex(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(Character.valueOf(arr_c[v]))).l0());
        }
        return v1;
    }

    @l
    public static final List ey(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(!((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(((short)v1));
        }
        return list0;
    }

    @l
    public static final Set ez(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return (Set)p.qy(arr_v, new LinkedHashSet(Y.j(arr_v.length)));
    }

    public static final boolean f5(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 0 ? 0 : 1;
    }

    @l
    public static final Map f6(@l int[] arr_v, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map f7(short[] arr_v, Map map0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(((short)v1), function10.invoke(((short)v1)));
        }
        return map0;
    }

    @f
    private static final double f8(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[4];
    }

    @l
    public static final List f9(@l byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Ex(arr_b, kotlin.ranges.s.u(arr_b.length - v, 0));
    }

    @l
    public static final List fA(@l float[] arr_f, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_f.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((float)arr_f[v1]), arr_object[v1]));
        }
        return list0;
    }

    @f
    private static final Object fa(Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        return kotlin.collections.l.Pe(arr_object, v);
    }

    @l
    public static final Collection fb(@l char[] arr_c, @l Collection collection0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                collection0.add(Character.valueOf(((char)v1)));
            }
        }
        return collection0;
    }

    @m
    public static final Double fc(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((double)arr_f[0]);
    }

    public static final Object fd(@l byte[] arr_b, Object object0, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_b.length; ++v) {
            object0 = o0.invoke(object0, ((byte)arr_b[v]));
        }
        return object0;
    }

    public static final void fe(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            o0.invoke(v1, ((short)arr_v[v]));
            ++v;
        }
    }

    @l
    public static final Map ff(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(((short)v1));
        }
        return map0;
    }

    @l
    public static final Set fg(@l double[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Zy(arr_f);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String fh(byte[] arr_b, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.Wg(arr_b, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @m
    public static final Short fi(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((short)arr_v[arr_v.length - 1]);
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final char fj(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(v == 0) {
            return c;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(c));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                char c1 = arr_c[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(c1));
                if(comparable0.compareTo(comparable1) < 0) {
                    c = c1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double fk(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).doubleValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Float fl(@l float[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                if(comparator0.compare(f, f1) < 0) {
                    f = f1;
                }
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
    private static final Comparable fm(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((double)arr_f[v1]));
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
    @m
    public static final Byte fn(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                if(v > v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    public static final boolean fo(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    private static final Byte fp(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return p.gp(arr_b, kotlin.random.f.a);
    }

    public static final byte fq(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        byte b = arr_b[v];
        while(v1 >= 0) {
            b = ((Number)o0.invoke(((byte)arr_b[v1]), b)).byteValue();
            --v1;
        }
        return b;
    }

    @h0(version = "1.4")
    public static void fr(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_v.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            short v4 = arr_v[v];
            arr_v[v] = arr_v[v3];
            arr_v[v3] = v4;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @f
    private static final List fs(int[] arr_v, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.H();
        }
        int v = arr_v[0];
        List list0 = new ArrayList(arr_v.length);
        ((ArrayList)list0).add(v);
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = ((Number)p0.invoke(v1, v, ((int)arr_v[v1]))).intValue();
            ((ArrayList)list0).add(v);
        }
        return list0;
    }

    public static final long ft(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        Long long0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                long0 = v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(long0, "null cannot be cast to non-null type kotlin.Long");
        return (long)long0;
    }

    @l
    public static int[] fu(@l int[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "indices");
        int[] arr_v1 = new int[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v1[v] = arr_v[((Number)object0).intValue()];
            ++v;
        }
        return arr_v1;
    }

    @l
    public static final Object[] fv(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        if(arr_object.length == 0) {
            return arr_object;
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        L.o(arr_object1, "copyOf(...)");
        kotlin.collections.l.h4(arr_object1, comparator0);
        return arr_object1;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int fw(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            v1 += ((Number)function10.invoke(Character.valueOf(arr_c[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int fx(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(((double)arr_f[v]))).l0());
        }
        return v1;
    }

    @l
    public static final List fy(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(!((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                break;
            }
            ((ArrayList)list0).add(Boolean.valueOf(z));
        }
        return list0;
    }

    @l
    public static final Set fz(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return (Set)p.ry(arr_z, new LinkedHashSet(Y.j(arr_z.length)));
    }

    public static final boolean g5(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map g6(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @h0(version = "1.4")
    @f
    private static final Map g7(boolean[] arr_z, Map map0, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(Boolean.valueOf(z), function10.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @f
    private static final float g8(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[4];
    }

    @l
    public static final List g9(@l char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Fx(arr_c, kotlin.ranges.s.u(arr_c.length - v, 0));
    }

    @l
    public static final List gA(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(((int)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @f
    private static final Short ga(short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return p.Qe(arr_v, v);
    }

    @l
    public static final Collection gb(@l double[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @m
    public static final Double gc(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        return null;
    }

    public static final Object gd(@l char[] arr_c, Object object0, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_c.length; ++v) {
            object0 = o0.invoke(object0, Character.valueOf(arr_c[v]));
        }
        return object0;
    }

    public static final void ge(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            o0.invoke(v1, Boolean.valueOf(arr_z[v]));
            ++v;
        }
    }

    @l
    public static final Map gf(@l short[] arr_v, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(((short)v1)));
        }
        return map0;
    }

    @l
    public static final Set gg(@l float[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.az(arr_f);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String gh(char[] arr_c, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.Xg(arr_c, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @m
    public static final Short gi(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                    return (short)v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final double gj(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) < 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Float gk(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((byte)arr_b[0]))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((byte)arr_b[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Integer gl(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(comparator0.compare(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable gm(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((float)arr_f[v1]));
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
    @m
    public static final Character gn(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                if(L.t(v, v3) > 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    public static final boolean go(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0;
    }

    @h0(version = "1.4")
    @m
    public static final Byte gp(@l byte[] arr_b, @l kotlin.random.f f0) {
        L.p(arr_b, "<this>");
        L.p(f0, "random");
        return arr_b.length == 0 ? null : ((byte)arr_b[f0.m(arr_b.length)]);
    }

    public static final char gq(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        int v = p.re(arr_c);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        char c = arr_c[v];
        while(v1 >= 0) {
            c = ((Character)o0.invoke(Character.valueOf(arr_c[v1]), Character.valueOf(c))).charValue();
            --v1;
        }
        return c;
    }

    public static final void gr(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        int v = arr_z.length / 2 - 1;
        if(v < 0) {
            return;
        }
        int v1 = p.ye(arr_z);
        for(int v2 = 0; true; ++v2) {
            boolean z = arr_z[v2];
            arr_z[v2] = arr_z[v1];
            arr_z[v1] = z;
            --v1;
            if(v2 == v) {
                break;
            }
        }
    }

    @h0(version = "1.4")
    @f
    private static final List gs(long[] arr_v, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.H();
        }
        long v = arr_v[0];
        List list0 = new ArrayList(arr_v.length);
        ((ArrayList)list0).add(v);
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = ((Number)p0.invoke(v1, v, ((long)arr_v[v1]))).longValue();
            ((ArrayList)list0).add(v);
        }
        return list0;
    }

    public static final Object gt(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_object[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static int[] gu(@l int[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new int[0] : kotlin.collections.l.j1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final List gv(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        return p.Gv(arr_b, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int gw(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 += ((Number)function10.invoke(((double)arr_f[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int gx(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(((float)arr_f[v]))).l0());
        }
        return v1;
    }

    @l
    public static final boolean[] gy(@l Boolean[] arr_boolean) {
        L.p(arr_boolean, "<this>");
        boolean[] arr_z = new boolean[arr_boolean.length];
        for(int v = 0; v < arr_boolean.length; ++v) {
            arr_z[v] = arr_boolean[v].booleanValue();
        }
        return arr_z;
    }

    @l
    public static final Set gz(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        switch(arr_b.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(((byte)arr_b[0]));
            }
            default: {
                return (Set)p.jy(arr_b, new LinkedHashSet(Y.j(arr_b.length)));
            }
        }
    }

    public static final boolean h5(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? 0 : 1;
    }

    @l
    public static final Map h6(@l long[] arr_v, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    public static final double h7(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            f += (double)arr_b[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @f
    private static final int h8(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[4];
    }

    @l
    public static final List h9(@l double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Gx(arr_f, kotlin.ranges.s.u(arr_f.length - v, 0));
    }

    @l
    public static final List hA(@l int[] arr_v, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(((int)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List ha(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                list0.add(((byte)v1));
            }
        }
        return list0;
    }

    @l
    public static final Collection hb(@l float[] arr_f, @l Collection collection0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                collection0.add(f);
            }
        }
        return collection0;
    }

    @m
    public static final Float hc(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? null : ((float)arr_f[0]);
    }

    public static final Object hd(@l double[] arr_f, Object object0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = o0.invoke(object0, ((double)arr_f[v]));
        }
        return object0;
    }

    @l
    public static kotlin.ranges.l he(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return new kotlin.ranges.l(0, kotlin.collections.l.qe(arr_b));
    }

    @l
    public static final Map hf(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(Boolean.valueOf(z));
        }
        return map0;
    }

    @l
    public static final Set hg(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = kotlin.collections.l.bz(arr_v);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String hh(double[] arr_f, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.Yg(arr_f, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List hi(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            list0.add(function10.invoke(((byte)arr_b[v])));
        }
        return list0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final float hj(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) < 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Float hk(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).floatValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Long hl(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(comparator0.compare(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable hm(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((int)arr_v[v1]));
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
    @m
    public static final Comparable hn(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            return null;
        }
        Comparable comparable0 = arr_comparable[0];
        int v = kotlin.collections.l.we(arr_comparable);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = arr_comparable[v1];
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

    public static final boolean ho(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    private static final Character hp(char[] arr_c) {
        L.p(arr_c, "<this>");
        return p.ip(arr_c, kotlin.random.f.a);
    }

    public static final double hq(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        int v = p.se(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)o0.invoke(((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    @h0(version = "1.4")
    public static final void hr(@l boolean[] arr_z, int v, int v1) {
        L.p(arr_z, "<this>");
        kotlin.collections.c.a.d(v, v1, arr_z.length);
        int v2 = (v + v1) / 2;
        if(v == v2) {
            return;
        }
        int v3 = v1 - 1;
        while(v < v2) {
            boolean z = arr_z[v];
            arr_z[v] = arr_z[v3];
            arr_z[v3] = z;
            --v3;
            ++v;
        }
    }

    @h0(version = "1.4")
    @l
    public static final List hs(@l Object[] arr_object, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        if(arr_object.length == 0) {
            return u.H();
        }
        Object object0 = arr_object[0];
        List list0 = new ArrayList(arr_object.length);
        ((ArrayList)list0).add(object0);
        for(int v = 1; v < arr_object.length; ++v) {
            object0 = p0.invoke(v, object0, arr_object[v]);
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    public static final Object ht(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        Object object0 = null;
        boolean z = false;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                object0 = object1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return object0;
    }

    @l
    public static long[] hu(@l long[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "indices");
        long[] arr_v1 = new long[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v1[v] = arr_v[((Number)object0).intValue()];
            ++v;
        }
        return arr_v1;
    }

    @l
    public static final List hv(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        return p.Hv(arr_c, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int hw(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            v1 += ((Number)function10.invoke(((float)arr_f[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int hx(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(((int)arr_v[v]))).l0());
        }
        return v1;
    }

    @l
    public static final byte[] hy(@l Byte[] arr_byte) {
        L.p(arr_byte, "<this>");
        byte[] arr_b = new byte[arr_byte.length];
        for(int v = 0; v < arr_byte.length; ++v) {
            arr_b[v] = (byte)arr_byte[v];
        }
        return arr_b;
    }

    @l
    public static final Set hz(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(Character.valueOf(arr_c[0]));
            }
            default: {
                return (Set)p.ky(arr_c, new LinkedHashSet(Y.j(kotlin.ranges.s.B(arr_c.length, 0x80))));
            }
        }
    }

    public static final boolean i5(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map i6(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    public static final double i7(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @f
    private static final long i8(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[4];
    }

    @l
    public static final List i9(@l float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Hx(arr_f, kotlin.ranges.s.u(arr_f.length - v, 0));
    }

    @l
    public static final List iA(@l int[] arr_v, @l int[] arr_v1) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "other");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((int)arr_v[v1]), ((int)arr_v1[v1])));
        }
        return list0;
    }

    @l
    public static final List ia(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                list0.add(Character.valueOf(((char)v1)));
            }
        }
        return list0;
    }

    @l
    public static final Collection ib(@l int[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @m
    public static final Float ic(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        return null;
    }

    public static final Object id(@l float[] arr_f, Object object0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = o0.invoke(object0, ((float)arr_f[v]));
        }
        return object0;
    }

    @l
    public static final kotlin.ranges.l ie(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return new kotlin.ranges.l(0, p.re(arr_c));
    }

    @l
    public static final Map if(@l boolean[] arr_z, @l Function1 function10, @l Function1 function11) {
        L.p(arr_z, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @l
    public static final Set ig(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.cz(arr_v);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String ih(float[] arr_f, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.Zg(arr_f, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List ii(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_c.length);
        for(int v = 0; v < arr_c.length; ++v) {
            list0.add(function10.invoke(Character.valueOf(arr_c[v])));
        }
        return list0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final int ij(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Float ik(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((double)arr_f[0]))).floatValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((double)arr_f[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Object il(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
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
    private static final Comparable im(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((long)arr_v[v1]));
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
    @m
    public static final Double in(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, arr_f[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    public static final boolean io(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 0;
    }

    @h0(version = "1.4")
    @m
    public static final Character ip(@l char[] arr_c, @l kotlin.random.f f0) {
        L.p(arr_c, "<this>");
        L.p(f0, "random");
        return arr_c.length == 0 ? null : Character.valueOf(arr_c[f0.m(arr_c.length)]);
    }

    public static final float iq(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        int v = p.te(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)o0.invoke(((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    @l
    public static final List ir(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            return u.H();
        }
        List list0 = p.Oy(arr_b);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List is(short[] arr_v, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.H();
        }
        int v = arr_v[0];
        List list0 = new ArrayList(arr_v.length);
        ((ArrayList)list0).add(((short)v));
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            v = ((Number)p0.invoke(v1, ((short)v), ((short)arr_v[v1]))).shortValue();
            ((ArrayList)list0).add(((short)v));
        }
        return list0;
    }

    @l
    public static long[] iu(@l long[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new long[0] : kotlin.collections.l.k1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final List iv(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        return p.Iv(arr_f, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int iw(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((int)arr_v[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int ix(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(((long)arr_v[v]))).l0());
        }
        return v1;
    }

    @l
    public static final char[] iy(@l Character[] arr_character) {
        L.p(arr_character, "<this>");
        char[] arr_c = new char[arr_character.length];
        for(int v = 0; v < arr_character.length; ++v) {
            arr_c[v] = arr_character[v].charValue();
        }
        return arr_c;
    }

    @l
    public static final Set iz(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(((double)arr_f[0]));
            }
            default: {
                return (Set)p.ly(arr_f, new LinkedHashSet(Y.j(arr_f.length)));
            }
        }
    }

    public static final boolean j5(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? 0 : 1;
    }

    @l
    public static final Map j6(@l Object[] arr_object, @l Function1 function10, @l Function1 function11) {
        L.p(arr_object, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_object.length), 16));
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    public static final double j7(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += (double)arr_f[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @f
    private static final Object j8(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object[4];
    }

    @l
    public static final List j9(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Ix(arr_v, kotlin.ranges.s.u(arr_v.length - v, 0));
    }

    @l
    public static final List jA(@l int[] arr_v, @l int[] arr_v1, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((int)arr_v[v1]), ((int)arr_v1[v1])));
        }
        return list0;
    }

    @l
    public static final List ja(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    @l
    public static final Collection jb(@l long[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                collection0.add(v1);
            }
        }
        return collection0;
    }

    @m
    public static final Integer jc(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((int)arr_v[0]);
    }

    public static final Object jd(@l int[] arr_v, Object object0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((int)arr_v[v]));
        }
        return object0;
    }

    @l
    public static final kotlin.ranges.l je(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return new kotlin.ranges.l(0, p.se(arr_f));
    }

    @l
    public static final Map jf(@l byte[] arr_b, @l Map map0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(((byte)v1));
        }
        return map0;
    }

    @l
    public static final Set jg(@l Object[] arr_object, @l Iterable iterable0) {
        L.p(arr_object, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.dz(arr_object);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String jh(int[] arr_v, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.ah(arr_v, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List ji(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            list0.add(function10.invoke(((double)arr_f[v])));
        }
        return list0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final long jj(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Float jk(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((float)arr_f[0]))).floatValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((float)arr_f[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Short jl(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(comparator0.compare(((short)v), ((short)v3)) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable jm(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(arr_object[v1]);
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
    @m
    public static final Double jn(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        if(arr_double.length == 0) {
            return null;
        }
        double f = (double)arr_double[0];
        int v = kotlin.collections.l.we(arr_double);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((double)arr_double[v1]));
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    public static final boolean jo(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h0(version = "1.4")
    @f
    private static final Double jp(double[] arr_f) {
        L.p(arr_f, "<this>");
        return p.kp(arr_f, kotlin.random.f.a);
    }

    public static final int jq(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    @l
    public static final List jr(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            return u.H();
        }
        List list0 = p.Py(arr_c);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List js(boolean[] arr_z, A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        if(arr_z.length == 0) {
            return u.H();
        }
        boolean z = arr_z[0];
        List list0 = new ArrayList(arr_z.length);
        ((ArrayList)list0).add(Boolean.valueOf(z));
        int v = 1;
        while(v < arr_z.length) {
            Boolean boolean0 = (Boolean)p0.invoke(v, Boolean.valueOf(z), Boolean.valueOf(arr_z[v]));
            ((ArrayList)list0).add(boolean0);
            ++v;
            z = boolean0.booleanValue();
        }
        return list0;
    }

    public static short jt(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_v[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static final Object[] ju(@l Object[] arr_object, @l Collection collection0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "indices");
        Object[] arr_object1 = kotlin.collections.m.a(arr_object, collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            arr_object1[v] = arr_object[((Number)object0).intValue()];
            ++v;
        }
        return arr_object1;
    }

    @l
    public static final List jv(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        return p.Jv(arr_f, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int jw(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((long)arr_v[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int jx(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(arr_object[v])).l0());
        }
        return v1;
    }

    @l
    public static final Collection jy(@l byte[] arr_b, @l Collection collection0) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_b.length; ++v) {
            collection0.add(((byte)arr_b[v]));
        }
        return collection0;
    }

    @l
    public static final Set jz(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        switch(arr_f.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(((float)arr_f[0]));
            }
            default: {
                return (Set)p.my(arr_f, new LinkedHashSet(Y.j(arr_f.length)));
            }
        }
    }

    public static final boolean k5(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            if(((Boolean)function10.invoke(((float)arr_f[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map k6(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), ((short)v1));
        }
        return map0;
    }

    public static final double k7(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += (double)arr_v[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @f
    private static final short k8(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[4];
    }

    @l
    public static final List k9(@l long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Jx(arr_v, kotlin.ranges.s.u(arr_v.length - v, 0));
    }

    @l
    public static final List kA(@l int[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((int)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final List ka(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                list0.add(f);
            }
        }
        return list0;
    }

    @l
    public static final Collection kb(@l Object[] arr_object, @l Collection collection0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @m
    public static final Integer kc(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        return null;
    }

    public static final Object kd(@l long[] arr_v, Object object0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((long)arr_v[v]));
        }
        return object0;
    }

    @l
    public static final kotlin.ranges.l ke(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return new kotlin.ranges.l(0, p.te(arr_f));
    }

    @l
    public static final Map kf(@l byte[] arr_b, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_b, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            Object object0 = function10.invoke(((byte)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @l
    public static final Set kg(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.ez(arr_v);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String kh(long[] arr_v, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.bh(arr_v, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List ki(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            list0.add(function10.invoke(((float)arr_f[v])));
        }
        return list0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final Object kj(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(v == 0) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
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
    private static final Float kk(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((int)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((int)arr_v[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final byte kl(@l byte[] arr_b, @l Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = arr_b[v1];
                if(comparator0.compare(b, b1) < 0) {
                    b = b1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable km(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((short)arr_v[v1]));
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
    @m
    public static final Float kn(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, arr_f[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final byte[] ko(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_b.length; ++v) {
            function10.invoke(((byte)arr_b[v]));
        }
        return arr_b;
    }

    @h0(version = "1.4")
    @m
    public static final Double kp(@l double[] arr_f, @l kotlin.random.f f0) {
        L.p(arr_f, "<this>");
        L.p(f0, "random");
        return arr_f.length == 0 ? null : ((double)arr_f[f0.m(arr_f.length)]);
    }

    public static final long kq(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    @l
    public static final List kr(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return u.H();
        }
        List list0 = p.Qy(arr_f);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List ks(byte[] arr_b, Object object0, A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        if(arr_b.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_b.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_b.length; ++v) {
            object0 = o0.invoke(object0, ((byte)arr_b[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static final short kt(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        Short short0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                short0 = (short)v1;
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(short0, "null cannot be cast to non-null type kotlin.Short");
        return (short)short0;
    }

    @l
    public static final Object[] ku(@l Object[] arr_object, @l kotlin.ranges.l l0) {
        L.p(arr_object, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? kotlin.collections.l.l1(arr_object, 0, 0) : kotlin.collections.l.l1(arr_object, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final List kv(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        return p.Kv(arr_v, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int kw(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            v1 += ((Number)function10.invoke(arr_object[v])).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int kx(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(((short)arr_v[v]))).l0());
        }
        return v1;
    }

    @l
    public static final Collection ky(@l char[] arr_c, @l Collection collection0) {
        L.p(arr_c, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_c.length; ++v) {
            collection0.add(Character.valueOf(arr_c[v]));
        }
        return collection0;
    }

    @l
    public static final Set kz(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(((int)arr_v[0]));
            }
            default: {
                return (Set)p.ny(arr_v, new LinkedHashSet(Y.j(arr_v.length)));
            }
        }
    }

    public static boolean l5(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    @l
    public static final Map l6(@l short[] arr_v, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_v.length), 16));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(((short)v1)), function11.invoke(((short)v1)));
        }
        return map0;
    }

    public static final double l7(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += (double)arr_v[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @f
    private static final boolean l8(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z[4];
    }

    @l
    public static List l9(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Kx(arr_object, kotlin.ranges.s.u(arr_object.length - v, 0));
    }

    @l
    public static final List lA(@l int[] arr_v, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((int)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final List la(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @l
    public static final Collection lb(@l short[] arr_v, @l Collection collection0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                collection0.add(((short)v1));
            }
        }
        return collection0;
    }

    @m
    public static final Long lc(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((long)arr_v[0]);
    }

    public static final Object ld(@l Object[] arr_object, Object object0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = o0.invoke(object0, arr_object[v]);
        }
        return object0;
    }

    @l
    public static kotlin.ranges.l le(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return new kotlin.ranges.l(0, kotlin.collections.l.ue(arr_v));
    }

    @l
    public static final Map lf(@l char[] arr_c, @l Map map0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @l
    public static final Set lg(@l boolean[] arr_z, @l Iterable iterable0) {
        L.p(arr_z, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.fz(arr_z);
        u.R0(set0, iterable0);
        return set0;
    }

    public static String lh(Object[] arr_object, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.ch(arr_object, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List li(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(function10.invoke(((int)arr_v[v])));
        }
        return list0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final short lj(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Float lk(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((long)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((long)arr_v[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final char ll(@l char[] arr_c, @l Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                char c1 = arr_c[v1];
                if(comparator0.compare(Character.valueOf(c), Character.valueOf(c1)) < 0) {
                    c = c1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable lm(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[v1]));
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
    @m
    public static final Float ln(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        if(arr_float.length == 0) {
            return null;
        }
        float f = (float)arr_float[0];
        int v = kotlin.collections.l.we(arr_float);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((float)arr_float[v1]));
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final char[] lo(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_c.length; ++v) {
            function10.invoke(Character.valueOf(arr_c[v]));
        }
        return arr_c;
    }

    @h0(version = "1.4")
    @f
    private static final Float lp(float[] arr_f) {
        L.p(arr_f, "<this>");
        return p.mp(arr_f, kotlin.random.f.a);
    }

    public static final Object lq(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.we(arr_object);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = o0.invoke(arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    @l
    public static final List lr(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return u.H();
        }
        List list0 = p.Ry(arr_f);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List ls(char[] arr_c, Object object0, A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        if(arr_c.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_c.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_c.length; ++v) {
            object0 = o0.invoke(object0, Character.valueOf(arr_c[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static final boolean lt(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        switch(arr_z.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_z[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    @l
    public static short[] lu(@l short[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "indices");
        short[] arr_v1 = new short[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v1[v] = arr_v[((Number)object0).intValue()];
            ++v;
        }
        return arr_v1;
    }

    @l
    public static final List lv(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        return p.Lv(arr_v, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int lw(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += ((Number)function10.invoke(((short)arr_v[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int lx(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            v1 = D0.h(v1 + ((D0)function10.invoke(Boolean.valueOf(arr_z[v]))).l0());
        }
        return v1;
    }

    @l
    public static final Collection ly(@l double[] arr_f, @l Collection collection0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(((double)arr_f[v]));
        }
        return collection0;
    }

    @l
    public static final Set lz(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(((long)arr_v[0]));
            }
            default: {
                return (Set)p.oy(arr_v, new LinkedHashSet(Y.j(arr_v.length)));
            }
        }
    }

    public static final boolean m5(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map m6(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return map0;
    }

    public static final double m7(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += (double)arr_v[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static boolean m8(@l byte[] arr_b, byte b) {
        L.p(arr_b, "<this>");
        return kotlin.collections.l.Cf(arr_b, b) >= 0;
    }

    @l
    public static final List m9(@l short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Lx(arr_v, kotlin.ranges.s.u(arr_v.length - v, 0));
    }

    @l
    public static final List mA(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(((long)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List ma(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @l
    public static final Collection mb(@l boolean[] arr_z, @l Collection collection0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                collection0.add(Boolean.valueOf(z));
            }
        }
        return collection0;
    }

    @m
    public static final Long mc(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        return null;
    }

    public static final Object md(@l short[] arr_v, Object object0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((short)arr_v[v]));
        }
        return object0;
    }

    @l
    public static kotlin.ranges.l me(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return new kotlin.ranges.l(0, kotlin.collections.l.ve(arr_v));
    }

    @l
    public static final Map mf(@l char[] arr_c, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_c, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @f
    private static final boolean mg(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 0;
    }

    public static String mh(short[] arr_v, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.dh(arr_v, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List mi(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(function10.invoke(((long)arr_v[v])));
        }
        return list0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final boolean mj(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(v == 0) {
            return z;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
                if(comparable0.compareTo(comparable1) < 0) {
                    z = z1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return z;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Float mk(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(arr_object[0])).floatValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(arr_object[v1])).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final double ml(@l double[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                if(comparator0.compare(f, f1) < 0) {
                    f = f1;
                }
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
    private static final Comparable mm(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((byte)arr_b[v1]));
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
    @m
    public static Integer mn(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(v > v3) {
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
    private static final double[] mo(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_f.length; ++v) {
            function10.invoke(((double)arr_f[v]));
        }
        return arr_f;
    }

    @h0(version = "1.4")
    @m
    public static final Float mp(@l float[] arr_f, @l kotlin.random.f f0) {
        L.p(arr_f, "<this>");
        L.p(f0, "random");
        return arr_f.length == 0 ? null : ((float)arr_f[f0.m(arr_f.length)]);
    }

    public static final short mq(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        short v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)o0.invoke(((short)arr_v[v1]), v2)).shortValue();
            --v1;
        }
        return v2;
    }

    @l
    public static final List mr(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return u.H();
        }
        List list0 = kotlin.collections.l.Sy(arr_v);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List ms(double[] arr_f, Object object0, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_f.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = o0.invoke(object0, ((double)arr_f[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static final boolean mt(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        Boolean boolean0 = null;
        boolean z = false;
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z1 = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z1))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                boolean0 = Boolean.valueOf(z1);
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        L.n(boolean0, "null cannot be cast to non-null type kotlin.Boolean");
        return boolean0.booleanValue();
    }

    @l
    public static short[] mu(@l short[] arr_v, @l kotlin.ranges.l l0) {
        L.p(arr_v, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new short[0] : kotlin.collections.l.m1(arr_v, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final List mv(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        return kotlin.collections.l.Mv(arr_object, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int mw(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            v1 += ((Number)function10.invoke(Boolean.valueOf(arr_z[v]))).intValue();
        }
        return v1;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long mx(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(((byte)arr_b[v1]))).l0());
        }
        return v;
    }

    @l
    public static final Collection my(@l float[] arr_f, @l Collection collection0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_f.length; ++v) {
            collection0.add(((float)arr_f[v]));
        }
        return collection0;
    }

    @l
    public static Set mz(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(arr_object[0]);
            }
            default: {
                return (Set)p.py(arr_object, new LinkedHashSet(Y.j(arr_object.length)));
            }
        }
    }

    public static boolean n5(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    @l
    public static final Map n6(@l boolean[] arr_z, @l Function1 function10, @l Function1 function11) {
        L.p(arr_z, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap(kotlin.ranges.s.u(Y.j(arr_z.length), 16));
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            map0.put(function10.invoke(Boolean.valueOf(z)), function11.invoke(Boolean.valueOf(z)));
        }
        return map0;
    }

    @i(name = "averageOfByte")
    public static final double n7(@l Byte[] arr_byte) {
        L.p(arr_byte, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_byte.length; ++v) {
            f += (double)(((byte)arr_byte[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static boolean n8(@l char[] arr_c, char c) {
        L.p(arr_c, "<this>");
        return p.Df(arr_c, c) >= 0;
    }

    @l
    public static final List n9(@l boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Mx(arr_z, kotlin.ranges.s.u(arr_z.length - v, 0));
    }

    @l
    public static final List nA(@l long[] arr_v, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(((long)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List na(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @f
    private static final Boolean nb(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @m
    public static Object nc(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 0 ? null : arr_object[0];
    }

    public static final Object nd(@l boolean[] arr_z, Object object0, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        for(int v = 0; v < arr_z.length; ++v) {
            object0 = o0.invoke(object0, Boolean.valueOf(arr_z[v]));
        }
        return object0;
    }

    @l
    public static final kotlin.ranges.l ne(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return new kotlin.ranges.l(0, kotlin.collections.l.we(arr_object));
    }

    @l
    public static final Map nf(@l double[] arr_f, @l Map map0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    @f
    private static final boolean ng(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 0;
    }

    public static String nh(boolean[] arr_z, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return p.eh(arr_z, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List ni(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            list0.add(function10.invoke(arr_object[v]));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double nj(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((byte)arr_b[0]))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((byte)arr_b[v1]))).doubleValue());
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
    private static final Float nk(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(((short)arr_v[0]))).floatValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((short)arr_v[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final float nl(@l float[] arr_f, @l Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                if(comparator0.compare(f, f1) < 0) {
                    f = f1;
                }
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
    private static final Comparable nm(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(arr_c[v1]));
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
    @m
    public static final Long nn(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(v > v3) {
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
    private static final float[] no(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_f.length; ++v) {
            function10.invoke(((float)arr_f[v]));
        }
        return arr_f;
    }

    @h0(version = "1.4")
    @f
    private static final Integer np(int[] arr_v) {
        L.p(arr_v, "<this>");
        return p.op(arr_v, kotlin.random.f.a);
    }

    public static final boolean nq(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        int v = p.ye(arr_z);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)o0.invoke(Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return z;
    }

    @l
    public static final List nr(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return u.H();
        }
        List list0 = p.Ty(arr_v);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List ns(float[] arr_f, Object object0, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_f.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = o0.invoke(object0, ((float)arr_f[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Boolean nt(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 1 ? Boolean.valueOf(arr_z[0]) : null;
    }

    @l
    public static final boolean[] nu(@l boolean[] arr_z, @l Collection collection0) {
        L.p(arr_z, "<this>");
        L.p(collection0, "indices");
        boolean[] arr_z1 = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_z1[v] = arr_z[((Number)object0).intValue()];
            ++v;
        }
        return arr_z1;
    }

    @l
    public static final List nv(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        return p.Nv(arr_v, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double nw(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_b.length; ++v) {
            f += ((Number)function10.invoke(((byte)arr_b[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long nx(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(Character.valueOf(arr_c[v1]))).l0());
        }
        return v;
    }

    @l
    public static final Collection ny(@l int[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(((int)arr_v[v]));
        }
        return collection0;
    }

    @l
    public static final Set nz(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(((short)arr_v[0]));
            }
            default: {
                return (Set)p.qy(arr_v, new LinkedHashSet(Y.j(arr_v.length)));
            }
        }
    }

    public static final boolean o5(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((long)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map o6(@l byte[] arr_b, @l Map map0, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), ((byte)v1));
        }
        return map0;
    }

    @i(name = "averageOfDouble")
    public static final double o7(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_double.length; ++v) {
            f += (double)arr_double[v];
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'any { it == element }\' instead to continue using this behavior, or \'.asList().contains(element: T)\' to get the same search behavior as in a list.", replaceWith = @c0(expression = "any { it == element }", imports = {}))
    @kotlin.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final boolean o8(double[] arr_f, double f) {
        L.p(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] == f) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final List o9(@l byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.vx(arr_b, kotlin.ranges.s.u(arr_b.length - v, 0));
    }

    @l
    public static final List oA(@l long[] arr_v, @l long[] arr_v1) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "other");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((long)arr_v[v1]), ((long)arr_v1[v1])));
        }
        return list0;
    }

    @l
    public static final List oa(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                list0.add(((short)v1));
            }
        }
        return list0;
    }

    @f
    private static final Byte ob(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                return (byte)v1;
            }
        }
        return null;
    }

    @m
    public static final Object oc(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    public static final Object od(@l byte[] arr_b, Object object0, @l A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            object0 = p0.invoke(v1, object0, ((byte)arr_b[v]));
            ++v;
        }
        return object0;
    }

    @l
    public static kotlin.ranges.l oe(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return new kotlin.ranges.l(0, kotlin.collections.l.xe(arr_v));
    }

    @l
    public static final Map of(@l double[] arr_f, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    @f
    private static final boolean og(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0;
    }

    public static byte oh(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_b[kotlin.collections.l.qe(arr_b)];
    }

    @l
    public static final List oi(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(function10.invoke(((short)arr_v[v])));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double oj(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).doubleValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).doubleValue());
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
    private static final Float ok(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        float f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).floatValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).floatValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final int ol(@l int[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(comparator0.compare(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable om(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((double)arr_f[v1]));
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
    @m
    public static final Short on(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(v > v3) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @h0(version = "1.4")
    @f
    private static final int[] oo(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((int)arr_v[v]));
        }
        return arr_v;
    }

    @h0(version = "1.4")
    @m
    public static final Integer op(@l int[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        return arr_v.length == 0 ? null : ((int)arr_v[f0.m(arr_v.length)]);
    }

    public static final byte oq(@l byte[] arr_b, @l A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        byte b = arr_b[v];
        while(v1 >= 0) {
            b = ((Number)p0.invoke(v1, ((byte)arr_b[v1]), b)).byteValue();
            --v1;
        }
        return b;
    }

    @l
    public static final List or(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        if(arr_object.length == 0) {
            return u.H();
        }
        List list0 = kotlin.collections.l.Uy(arr_object);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List os(int[] arr_v, Object object0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((int)arr_v[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Boolean ot(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        Boolean boolean0 = null;
        boolean z = false;
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z1 = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z1))).booleanValue()) {
                if(z) {
                    return null;
                }
                boolean0 = Boolean.valueOf(z1);
                z = true;
            }
        }
        return z ? boolean0 : null;
    }

    @l
    public static final boolean[] ou(@l boolean[] arr_z, @l kotlin.ranges.l l0) {
        L.p(arr_z, "<this>");
        L.p(l0, "indices");
        return l0.isEmpty() ? new boolean[0] : o.n1(arr_z, ((int)l0.q()), ((int)l0.p()) + 1);
    }

    @l
    public static final List ov(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        return p.Ov(arr_z, new kotlin.comparisons.g.a(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double ow(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_c.length; ++v) {
            f += ((Number)function10.invoke(Character.valueOf(arr_c[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long ox(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(((double)arr_f[v1]))).l0());
        }
        return v;
    }

    @l
    public static final Collection oy(@l long[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(((long)arr_v[v]));
        }
        return collection0;
    }

    @l
    public static final Set oz(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        switch(arr_z.length) {
            case 0: {
                return k0.k();
            }
            case 1: {
                return k0.f(Boolean.valueOf(arr_z[0]));
            }
            default: {
                return (Set)p.ry(arr_z, new LinkedHashSet(Y.j(arr_z.length)));
            }
        }
    }

    public static final boolean p5(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 0 ? 0 : 1;
    }

    @l
    public static final Map p6(@l byte[] arr_b, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_b, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            map0.put(function10.invoke(((byte)v1)), function11.invoke(((byte)v1)));
        }
        return map0;
    }

    @i(name = "averageOfFloat")
    public static final double p7(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_float.length; ++v) {
            f += (double)(((float)arr_float[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    @kotlin.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use \'any { it == element }\' instead to continue using this behavior, or \'.asList().contains(element: T)\' to get the same search behavior as in a list.", replaceWith = @c0(expression = "any { it == element }", imports = {}))
    @kotlin.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final boolean p8(float[] arr_f, float f) {
        L.p(arr_f, "<this>");
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] == f) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final List p9(@l char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.wx(arr_c, kotlin.ranges.s.u(arr_c.length - v, 0));
    }

    @l
    public static final List pA(@l long[] arr_v, @l long[] arr_v1, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_v.length, arr_v1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((long)arr_v[v1]), ((long)arr_v1[v1])));
        }
        return list0;
    }

    @l
    public static final List pa(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                list0.add(Boolean.valueOf(z));
            }
        }
        return list0;
    }

    @f
    private static final Character pb(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                return Character.valueOf(((char)v1));
            }
        }
        return null;
    }

    @m
    public static final Short pc(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? null : ((short)arr_v[0]);
    }

    public static final Object pd(@l char[] arr_c, Object object0, @l A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            object0 = p0.invoke(v1, object0, Character.valueOf(arr_c[v]));
            ++v;
        }
        return object0;
    }

    @l
    public static final kotlin.ranges.l pe(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return new kotlin.ranges.l(0, p.ye(arr_z));
    }

    @l
    public static final Map pf(@l float[] arr_f, @l Map map0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(f);
        }
        return map0;
    }

    @f
    private static final boolean pg(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0;
    }

    public static final byte ph(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                byte b = arr_b[v];
                if(((Boolean)function10.invoke(b)).booleanValue()) {
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

    @l
    public static final List pi(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(arr_z.length);
        for(int v = 0; v < arr_z.length; ++v) {
            list0.add(function10.invoke(Boolean.valueOf(arr_z[v])));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double pj(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((double)arr_f[0]))).doubleValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((double)arr_f[v1]))).doubleValue());
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
    private static final Object pk(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((byte)arr_b[v1]));
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

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final long pl(@l long[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(comparator0.compare(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable pm(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((float)arr_f[v1]));
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

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final byte pn(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                byte b1 = arr_b[v1];
                if(b > b1) {
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
    private static final long[] po(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((long)arr_v[v]));
        }
        return arr_v;
    }

    @h0(version = "1.4")
    @f
    private static final Long pp(long[] arr_v) {
        L.p(arr_v, "<this>");
        return p.qp(arr_v, kotlin.random.f.a);
    }

    public static final char pq(@l char[] arr_c, @l A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        int v = p.re(arr_c);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        char c = arr_c[v];
        while(v1 >= 0) {
            c = ((Character)p0.invoke(v1, Character.valueOf(arr_c[v1]), Character.valueOf(c))).charValue();
            --v1;
        }
        return c;
    }

    @l
    public static final List pr(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return u.H();
        }
        List list0 = p.Vy(arr_v);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final List ps(long[] arr_v, Object object0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((long)arr_v[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Byte pt(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 1 ? ((byte)arr_b[0]) : null;
    }

    public static final void pu(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length > 1) {
            kotlin.collections.l.h4(arr_object, new kotlin.comparisons.g.a(function10));
        }
    }

    @l
    public static final List pv(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        return p.Gv(arr_b, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double pw(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += ((Number)function10.invoke(((double)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long px(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(((float)arr_f[v1]))).l0());
        }
        return v;
    }

    @l
    public static final Collection py(@l Object[] arr_object, @l Collection collection0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            collection0.add(arr_object[v]);
        }
        return collection0;
    }

    @l
    public static final short[] pz(@l Short[] arr_short) {
        L.p(arr_short, "<this>");
        short[] arr_v = new short[arr_short.length];
        for(int v = 0; v < arr_short.length; ++v) {
            arr_v[v] = (short)arr_short[v];
        }
        return arr_v;
    }

    public static final boolean q5(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_object.length; ++v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map q6(@l char[] arr_c, @l Map map0, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @i(name = "averageOfInt")
    public static final double q7(@l Integer[] arr_integer) {
        L.p(arr_integer, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_integer.length; ++v) {
            f += (double)(((int)arr_integer[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static boolean q8(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.Gf(arr_v, v) >= 0;
    }

    @l
    public static final List q9(@l double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.xx(arr_f, kotlin.ranges.s.u(arr_f.length - v, 0));
    }

    @l
    public static final List qA(@l long[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((long)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final List qa(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            int v2 = arr_b[v];
            if(((Boolean)o0.invoke(v1, ((byte)v2))).booleanValue()) {
                list0.add(((byte)v2));
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Double qb(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        return null;
    }

    @m
    public static final Short qc(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                return (short)v1;
            }
        }
        return null;
    }

    public static final Object qd(@l double[] arr_f, Object object0, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            object0 = p0.invoke(v1, object0, ((double)arr_f[v]));
            ++v;
        }
        return object0;
    }

    public static int qe(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length - 1;
    }

    @l
    public static final Map qf(@l float[] arr_f, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            Object object0 = function10.invoke(f);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(f));
        }
        return map0;
    }

    @f
    private static final boolean qg(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0;
    }

    public static final char qh(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_c[p.re(arr_c)];
    }

    @l
    public static final List qi(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_b.length);
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            list0.add(o0.invoke(v1, ((byte)arr_b[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double qj(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((float)arr_f[0]))).doubleValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((float)arr_f[v1]))).doubleValue());
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
    private static final Object qk(char[] arr_c, Comparator comparator0, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Character.valueOf(arr_c[v1]));
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

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final Object ql(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = arr_object[v1];
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
    private static final Comparable qm(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((int)arr_v[v1]));
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

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final char qn(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                char c1 = arr_c[v1];
                if(L.t(c, c1) > 0) {
                    c = c1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    @h0(version = "1.4")
    @f
    private static final Object[] qo(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_object.length; ++v) {
            function10.invoke(arr_object[v]);
        }
        return arr_object;
    }

    @h0(version = "1.4")
    @m
    public static final Long qp(@l long[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        return arr_v.length == 0 ? null : ((long)arr_v[f0.m(arr_v.length)]);
    }

    public static final double qq(@l double[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        int v = p.se(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        double f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)p0.invoke(v1, ((double)arr_f[v1]), f)).doubleValue();
            --v1;
        }
        return f;
    }

    @l
    public static final List qr(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        if(arr_z.length == 0) {
            return u.H();
        }
        List list0 = p.Wy(arr_z);
        u.r1(list0);
        return list0;
    }

    @h0(version = "1.4")
    @l
    public static final List qs(@l Object[] arr_object, Object object0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "operation");
        if(arr_object.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_object.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = o0.invoke(object0, arr_object[v]);
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Byte qt(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        Byte byte0 = null;
        boolean z = false;
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                if(z) {
                    return null;
                }
                byte0 = (byte)v1;
                z = true;
            }
        }
        return z ? byte0 : null;
    }

    public static final void qu(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length > 1) {
            kotlin.collections.l.h4(arr_object, new kotlin.comparisons.g.c(function10));
        }
    }

    @l
    public static final List qv(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        return p.Hv(arr_c, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double qw(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += ((Number)function10.invoke(((float)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long qx(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(((int)arr_v[v1]))).l0());
        }
        return v;
    }

    @l
    public static final Collection qy(@l short[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_v.length; ++v) {
            collection0.add(((short)arr_v[v]));
        }
        return collection0;
    }

    @l
    public static final Set qz(@l byte[] arr_b, @l Iterable iterable0) {
        L.p(arr_b, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Xy(arr_b);
        u.q0(set0, iterable0);
        return set0;
    }

    public static boolean r5(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    @l
    public static final Map r6(@l char[] arr_c, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_c, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            map0.put(function10.invoke(Character.valueOf(((char)v1))), function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @i(name = "averageOfLong")
    public static final double r7(@l Long[] arr_long) {
        L.p(arr_long, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_long.length; ++v) {
            f += (double)(((long)arr_long[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static boolean r8(@l long[] arr_v, long v) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.Hf(arr_v, v) >= 0;
    }

    @l
    public static final List r9(@l float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.yx(arr_f, kotlin.ranges.s.u(arr_f.length - v, 0));
    }

    @l
    public static final List rA(@l long[] arr_v, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((long)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final List ra(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            int v2 = arr_c[v];
            if(((Boolean)o0.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                list0.add(Character.valueOf(((char)v2)));
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Float rb(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                return f;
            }
        }
        return null;
    }

    @l
    public static final List rc(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(((byte)arr_b[v]))));
        }
        return list0;
    }

    public static final Object rd(@l float[] arr_f, Object object0, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            object0 = p0.invoke(v1, object0, ((float)arr_f[v]));
            ++v;
        }
        return object0;
    }

    public static final int re(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length - 1;
    }

    @l
    public static final Map rf(@l int[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    @f
    private static final boolean rg(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0;
    }

    public static final char rh(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                char c = arr_c[v];
                if(((Boolean)function10.invoke(Character.valueOf(c))).booleanValue()) {
                    return c;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l
    public static final List ri(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_c.length);
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            list0.add(o0.invoke(v1, Character.valueOf(arr_c[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double rj(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((int)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((int)arr_v[v1]))).doubleValue());
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
    private static final Object rk(double[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((double)arr_f[0]));
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((double)arr_f[v1]));
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

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final short rl(@l short[] arr_v, @l Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = arr_v[v2];
                if(comparator0.compare(v, v3) < 0) {
                    v = v3;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable rm(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((long)arr_v[v1]));
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

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final double rn(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, arr_f[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final short[] ro(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_v.length; ++v) {
            function10.invoke(((short)arr_v[v]));
        }
        return arr_v;
    }

    @h0(version = "1.4")
    @f
    private static final Object rp(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return p.sp(arr_object, kotlin.random.f.a);
    }

    public static final float rq(@l float[] arr_f, @l A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        int v = p.te(arr_f);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        float f = arr_f[v];
        while(v1 >= 0) {
            f = ((Number)p0.invoke(v1, ((float)arr_f[v1]), f)).floatValue();
            --v1;
        }
        return f;
    }

    @l
    public static byte[] rr(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length == 0) {
            return arr_b;
        }
        byte[] arr_b1 = new byte[arr_b.length];
        int v = kotlin.collections.l.qe(arr_b);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_b1[v - v1] = arr_b[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_b1;
    }

    @h0(version = "1.4")
    @f
    private static final List rs(short[] arr_v, Object object0, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = o0.invoke(object0, ((short)arr_v[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Character rt(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 1 ? Character.valueOf(arr_c[0]) : null;
    }

    public static final void ru(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length > 1) {
            o.G3(arr_b);
            kotlin.collections.l.Qq(arr_b);
        }
    }

    @l
    public static final List rv(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        return p.Iv(arr_f, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double rw(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((int)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long rx(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(((long)arr_v[v1]))).l0());
        }
        return v;
    }

    @l
    public static final Collection ry(@l boolean[] arr_z, @l Collection collection0) {
        L.p(arr_z, "<this>");
        L.p(collection0, "destination");
        for(int v = 0; v < arr_z.length; ++v) {
            collection0.add(Boolean.valueOf(arr_z[v]));
        }
        return collection0;
    }

    @l
    public static final Set rz(@l char[] arr_c, @l Iterable iterable0) {
        L.p(arr_c, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Yy(arr_c);
        u.q0(set0, iterable0);
        return set0;
    }

    public static final boolean s5(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            if(((Boolean)function10.invoke(((short)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map s6(@l double[] arr_f, @l Map map0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @i(name = "averageOfShort")
    public static final double s7(@l Short[] arr_short) {
        L.p(arr_short, "<this>");
        double f = 0.0;
        int v1 = 0;
        for(int v = 0; v < arr_short.length; ++v) {
            f += (double)(((short)arr_short[v]));
            ++v1;
        }
        return v1 == 0 ? NaN : f / ((double)v1);
    }

    public static boolean s8(@l Object[] arr_object, Object object0) {
        L.p(arr_object, "<this>");
        return kotlin.collections.l.If(arr_object, object0) >= 0;
    }

    @l
    public static final List s9(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.zx(arr_v, kotlin.ranges.s.u(arr_v.length - v, 0));
    }

    @l
    public static final List sA(@l Object[] arr_object, @l Iterable iterable0) {
        L.p(arr_object, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_object.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_object.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(arr_object[v], object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List sa(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            double f = arr_f[v];
            if(((Boolean)o0.invoke(v1, f)).booleanValue()) {
                list0.add(f);
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Integer sb(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        return null;
    }

    @l
    public static final List sc(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_c.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(Character.valueOf(arr_c[v]))));
        }
        return list0;
    }

    public static final Object sd(@l int[] arr_v, Object object0, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            object0 = p0.invoke(v1, object0, ((int)arr_v[v]));
            ++v;
        }
        return object0;
    }

    public static final int se(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length - 1;
    }

    @l
    public static final Map sf(@l int[] arr_v, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    @f
    private static final boolean sg(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length == 0;
    }

    public static final double sh(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[p.se(arr_f)];
    }

    @l
    public static final List si(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_f.length);
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            list0.add(o0.invoke(v1, ((double)arr_f[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double sj(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((long)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((long)arr_v[v1]))).doubleValue());
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
    private static final Object sk(float[] arr_f, Comparator comparator0, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((float)arr_f[0]));
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((float)arr_f[v1]));
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

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final boolean sl(@l boolean[] arr_z, @l Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) < 0) {
                    z = z1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return z;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable sm(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(arr_object[v1]);
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

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final double sn(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        if(arr_double.length == 0) {
            throw new NoSuchElementException();
        }
        double f = (double)arr_double[0];
        int v = kotlin.collections.l.we(arr_double);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((double)arr_double[v1]));
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final boolean[] so(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "action");
        for(int v = 0; v < arr_z.length; ++v) {
            function10.invoke(Boolean.valueOf(arr_z[v]));
        }
        return arr_z;
    }

    @h0(version = "1.4")
    @m
    public static final Object sp(@l Object[] arr_object, @l kotlin.random.f f0) {
        L.p(arr_object, "<this>");
        L.p(f0, "random");
        return arr_object.length == 0 ? null : arr_object[f0.m(arr_object.length)];
    }

    public static final int sq(@l int[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ue(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        int v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((int)arr_v[v1]), v2)).intValue();
            --v1;
        }
        return v2;
    }

    @l
    public static final char[] sr(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length == 0) {
            return arr_c;
        }
        char[] arr_c1 = new char[arr_c.length];
        int v = p.re(arr_c);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_c1[v - v1] = arr_c[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_c1;
    }

    @h0(version = "1.4")
    @f
    private static final List ss(boolean[] arr_z, Object object0, A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "operation");
        if(arr_z.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_z.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_z.length; ++v) {
            object0 = o0.invoke(object0, Boolean.valueOf(arr_z[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Character st(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        Character character0 = null;
        boolean z = false;
        for(int v = 0; v < arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                if(z) {
                    return null;
                }
                character0 = Character.valueOf(((char)v1));
                z = true;
            }
        }
        return z ? character0 : null;
    }

    @h0(version = "1.4")
    public static final void su(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        o.H3(arr_b, v, v1);
        kotlin.collections.l.Rq(arr_b, v, v1);
    }

    @l
    public static final List sv(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        return p.Jv(arr_f, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double sw(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((long)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long sx(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(arr_object[v1])).l0());
        }
        return v;
    }

    @l
    public static final double[] sy(@l Double[] arr_double) {
        L.p(arr_double, "<this>");
        double[] arr_f = new double[arr_double.length];
        for(int v = 0; v < arr_double.length; ++v) {
            arr_f[v] = (double)arr_double[v];
        }
        return arr_f;
    }

    @l
    public static final Set sz(@l double[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.Zy(arr_f);
        u.q0(set0, iterable0);
        return set0;
    }

    public static final boolean t5(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 0 ? 0 : 1;
    }

    @l
    public static final Map t6(@l double[] arr_f, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @f
    private static final byte t7(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b[0];
    }

    public static boolean t8(@l short[] arr_v, short v) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.Jf(arr_v, v) >= 0;
    }

    @l
    public static final List t9(@l long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Ax(arr_v, kotlin.ranges.s.u(arr_v.length - v, 0));
    }

    @l
    public static final List tA(@l Object[] arr_object, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_object.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_object.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(arr_object[v], object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List ta(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            float f = arr_f[v];
            if(((Boolean)o0.invoke(v1, f)).booleanValue()) {
                list0.add(f);
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Long tb(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        return null;
    }

    @l
    public static final List tc(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(((double)arr_f[v]))));
        }
        return list0;
    }

    public static final Object td(@l long[] arr_v, Object object0, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            object0 = p0.invoke(v1, object0, ((long)arr_v[v]));
            ++v;
        }
        return object0;
    }

    public static final int te(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length - 1;
    }

    @l
    public static final Map tf(@l long[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(v1);
        }
        return map0;
    }

    @f
    private static final boolean tg(short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0;
    }

    public static final double th(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                double f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l
    public static final List ti(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_f.length);
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            list0.add(o0.invoke(v1, ((float)arr_f[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double tj(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(arr_object[0])).doubleValue();
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(arr_object[v1])).doubleValue());
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
    private static final Object tk(int[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((int)arr_v[0]));
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((int)arr_v[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Boolean tl(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
                if(comparable0.compareTo(comparable1) > 0) {
                    z = z1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable tm(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(((short)arr_v[v1]));
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

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final float tn(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, arr_f[v1]);
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final byte[] to(byte[] arr_b, A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            o0.invoke(v1, ((byte)arr_b[v]));
            ++v;
        }
        return arr_b;
    }

    @h0(version = "1.4")
    @f
    private static final Short tp(short[] arr_v) {
        L.p(arr_v, "<this>");
        return p.up(arr_v, kotlin.random.f.a);
    }

    public static final long tq(@l long[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.ve(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        long v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((long)arr_v[v1]), v2)).longValue();
            --v1;
        }
        return v2;
    }

    @l
    public static final double[] tr(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        double[] arr_f1 = new double[arr_f.length];
        int v = p.se(arr_f);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_f1[v - v1] = arr_f[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_f1;
    }

    @h0(version = "1.4")
    @f
    private static final List ts(byte[] arr_b, Object object0, A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        if(arr_b.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_b.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_b.length; ++v) {
            object0 = p0.invoke(v, object0, ((byte)arr_b[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Double tt(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 1 ? ((double)arr_f[0]) : null;
    }

    public static final void tu(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length > 1) {
            o.I3(arr_c);
            p.Sq(arr_c);
        }
    }

    @l
    public static final List tv(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        return p.Kv(arr_v, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double tw(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_object.length; ++v) {
            f += ((Number)function10.invoke(arr_object[v])).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long tx(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(((short)arr_v[v1]))).l0());
        }
        return v;
    }

    @l
    public static final float[] ty(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        float[] arr_f = new float[arr_float.length];
        for(int v = 0; v < arr_float.length; ++v) {
            arr_f[v] = (float)arr_float[v];
        }
        return arr_f;
    }

    @l
    public static final Set tz(@l float[] arr_f, @l Iterable iterable0) {
        L.p(arr_f, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.az(arr_f);
        u.q0(set0, iterable0);
        return set0;
    }

    public static final boolean u5(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_z.length; ++v) {
            if(((Boolean)function10.invoke(Boolean.valueOf(arr_z[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final Map u6(@l float[] arr_f, @l Map map0, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), f);
        }
        return map0;
    }

    @f
    private static final char u7(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c[0];
    }

    public static final boolean u8(@l boolean[] arr_z, boolean z) {
        L.p(arr_z, "<this>");
        return p.Kf(arr_z, z) >= 0;
    }

    @l
    public static final List u9(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Bx(arr_object, kotlin.ranges.s.u(arr_object.length - v, 0));
    }

    @l
    public static List uA(@l Object[] arr_object, @l Object[] arr_object1) {
        L.p(arr_object, "<this>");
        L.p(arr_object1, "other");
        int v = Math.min(arr_object.length, arr_object1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(arr_object[v1], arr_object1[v1]));
        }
        return list0;
    }

    @l
    public static final List ua(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)o0.invoke(v1, v2)).booleanValue()) {
                list0.add(v2);
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Object ub(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "predicate");
        int v = 0;
        while(v < arr_object.length) {
            Object object0 = arr_object[v];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                ++v;
                continue;
            }
            return object0;
        }
        return null;
    }

    @l
    public static final List uc(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(((float)arr_f[v]))));
        }
        return list0;
    }

    public static final Object ud(@l Object[] arr_object, Object object0, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            object0 = p0.invoke(v1, object0, arr_object[v]);
            ++v;
        }
        return object0;
    }

    public static int ue(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length - 1;
    }

    @l
    public static final Map uf(@l long[] arr_v, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            Object object0 = function10.invoke(v1);
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(v1));
        }
        return map0;
    }

    @f
    private static final boolean ug(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length == 0;
    }

    public static final float uh(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_f[p.te(arr_f)];
    }

    @l
    public static final List ui(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_v.length);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            list0.add(o0.invoke(v1, ((int)arr_v[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double uj(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(((short)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((short)arr_v[v1]))).doubleValue());
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
    private static final Object uk(long[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((long)arr_v[0]));
        int v = kotlin.collections.l.ve(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((long)arr_v[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Byte ul(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((byte)v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable um(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(arr_z[v1]));
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

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final float un(@l Float[] arr_float) {
        L.p(arr_float, "<this>");
        if(arr_float.length == 0) {
            throw new NoSuchElementException();
        }
        float f = (float)arr_float[0];
        int v = kotlin.collections.l.we(arr_float);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((float)arr_float[v1]));
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @f
    private static final char[] uo(char[] arr_c, A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_c.length; ++v1) {
            o0.invoke(v1, Character.valueOf(arr_c[v]));
            ++v;
        }
        return arr_c;
    }

    @h0(version = "1.4")
    @m
    public static final Short up(@l short[] arr_v, @l kotlin.random.f f0) {
        L.p(arr_v, "<this>");
        L.p(f0, "random");
        return arr_v.length == 0 ? null : ((short)arr_v[f0.m(arr_v.length)]);
    }

    public static final Object uq(@l Object[] arr_object, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.we(arr_object);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        Object object0 = arr_object[v];
        while(v1 >= 0) {
            object0 = p0.invoke(v1, arr_object[v1], object0);
            --v1;
        }
        return object0;
    }

    @l
    public static final float[] ur(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length == 0) {
            return arr_f;
        }
        float[] arr_f1 = new float[arr_f.length];
        int v = p.te(arr_f);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_f1[v - v1] = arr_f[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_f1;
    }

    @h0(version = "1.4")
    @f
    private static final List us(char[] arr_c, Object object0, A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        if(arr_c.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_c.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_c.length; ++v) {
            object0 = p0.invoke(v, object0, Character.valueOf(arr_c[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Double ut(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        Double double0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            double f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    return null;
                }
                double0 = f;
                z = true;
            }
        }
        return z ? double0 : null;
    }

    @h0(version = "1.4")
    public static final void uu(@l char[] arr_c, int v, int v1) {
        L.p(arr_c, "<this>");
        o.J3(arr_c, v, v1);
        p.Tq(arr_c, v, v1);
    }

    @l
    public static final List uv(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        return p.Lv(arr_v, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double uw(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_v.length; ++v) {
            f += ((Number)function10.invoke(((short)arr_v[v]))).doubleValue();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long ux(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(int v1 = 0; v1 < arr_z.length; ++v1) {
            v = H0.h(v + ((H0)function10.invoke(Boolean.valueOf(arr_z[v1]))).l0());
        }
        return v;
    }

    @l
    public static final HashSet uy(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return (HashSet)p.jy(arr_b, new HashSet(Y.j(arr_b.length)));
    }

    @l
    public static final Set uz(@l int[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = kotlin.collections.l.bz(arr_v);
        u.q0(set0, iterable0);
        return set0;
    }

    @l
    public static final Iterable v5(@l byte[] arr_b) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n23974#2:18\n*E\n"})
        public static final class b implements a, Iterable {
            final byte[] a;

            public b(byte[] arr_b) {
                this.a = arr_b;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.b(this.a);
            }
        }

        L.p(arr_b, "<this>");
        return arr_b.length == 0 ? u.H() : new b(arr_b);
    }

    @l
    public static final Map v6(@l float[] arr_f, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_f, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            map0.put(function10.invoke(f), function11.invoke(f));
        }
        return map0;
    }

    @f
    private static final double v7(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[0];
    }

    @f
    private static final int v8(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length;
    }

    @l
    public static final List v9(@l short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Cx(arr_v, kotlin.ranges.s.u(arr_v.length - v, 0));
    }

    @l
    public static final List vA(@l Object[] arr_object, @l Object[] arr_object1, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(arr_object1, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_object.length, arr_object1.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(arr_object[v1], arr_object1[v1]));
        }
        return list0;
    }

    @l
    public static final List va(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            long v2 = arr_v[v];
            if(((Boolean)o0.invoke(v1, v2)).booleanValue()) {
                list0.add(v2);
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Short vb(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(((short)v1))).booleanValue()) {
                return (short)v1;
            }
        }
        return null;
    }

    @l
    public static final List vc(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(((int)arr_v[v]))));
        }
        return list0;
    }

    public static final Object vd(@l short[] arr_v, Object object0, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            object0 = p0.invoke(v1, object0, ((short)arr_v[v]));
            ++v;
        }
        return object0;
    }

    public static int ve(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length - 1;
    }

    @l
    public static final Map vf(@l Object[] arr_object, @l Map map0, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    @f
    private static final boolean vg(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length == 0 ? 0 : 1;
    }

    public static final float vh(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                float f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @l
    public static final List vi(@l long[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_v.length);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            list0.add(o0.invoke(v1, ((long)arr_v[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double vj(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        double f = ((Number)function10.invoke(Boolean.valueOf(arr_z[0]))).doubleValue();
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Boolean.valueOf(arr_z[v1]))).doubleValue());
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
    private static final Object vk(Object[] arr_object, Comparator comparator0, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(arr_object[0]);
        int v = kotlin.collections.l.we(arr_object);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(arr_object[v1]);
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

    @h0(version = "1.4")
    @m
    public static final Character vl(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v3)));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double vm(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((byte)arr_b[0]))).doubleValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((byte)arr_b[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final int vn(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                if(v > v3) {
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
    private static final double[] vo(double[] arr_f, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            o0.invoke(v1, ((double)arr_f[v]));
            ++v;
        }
        return arr_f;
    }

    public static final byte vp(@l byte[] arr_b, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        if(arr_b.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        byte b = arr_b[0];
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                b = ((Number)o0.invoke(b, ((byte)arr_b[v1]))).byteValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return b;
    }

    public static final short vq(@l short[] arr_v, @l A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.xe(arr_v);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        short v2 = arr_v[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((short)arr_v[v1]), v2)).shortValue();
            --v1;
        }
        return v2;
    }

    @l
    public static int[] vr(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        int[] arr_v1 = new int[arr_v.length];
        int v = kotlin.collections.l.ue(arr_v);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_v1[v - v1] = arr_v[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_v1;
    }

    @h0(version = "1.4")
    @f
    private static final List vs(double[] arr_f, Object object0, A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_f.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = p0.invoke(v, object0, ((double)arr_f[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Float vt(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 1 ? ((float)arr_f[0]) : null;
    }

    public static final void vu(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length > 1) {
            o.K3(arr_f);
            p.Uq(arr_f);
        }
    }

    @l
    public static final List vv(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        return kotlin.collections.l.Mv(arr_object, new kotlin.comparisons.g.c(function10));
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double vw(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_z.length; ++v) {
            f += ((Number)function10.invoke(Boolean.valueOf(arr_z[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List vx(@l byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_b.length) {
            return p.Ey(arr_b);
        }
        if(v == 1) {
            return u.k(((byte)arr_b[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            ((ArrayList)list0).add(((byte)arr_b[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet vy(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return (HashSet)p.ky(arr_c, new HashSet(Y.j(kotlin.ranges.s.B(arr_c.length, 0x80))));
    }

    @l
    public static final Set vz(@l long[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.cz(arr_v);
        u.q0(set0, iterable0);
        return set0;
    }

    @l
    public static final Iterable w5(@l char[] arr_c) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24030#2:18\n*E\n"})
        public static final class kotlin.collections.p.i implements a, Iterable {
            final char[] a;

            public kotlin.collections.p.i(char[] arr_c) {
                this.a = arr_c;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.c(this.a);
            }
        }

        L.p(arr_c, "<this>");
        return arr_c.length == 0 ? u.H() : new kotlin.collections.p.i(arr_c);
    }

    @l
    public static final Map w6(@l int[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @f
    private static final float w7(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f[0];
    }

    public static final int w8(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            if(((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List w9(@l boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        return p.Dx(arr_z, kotlin.ranges.s.u(arr_z.length - v, 0));
    }

    @l
    public static final List wA(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(r0.a(((short)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List wa(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = arr_object[v];
            if(((Boolean)o0.invoke(v1, object0)).booleanValue()) {
                list0.add(object0);
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Boolean wb(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "predicate");
        int v = arr_z.length - 1;
        if(v >= 0) {
            while(true) {
                boolean z = arr_z[v];
                if(((Boolean)function10.invoke(Boolean.valueOf(z))).booleanValue()) {
                    return Boolean.valueOf(z);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final List wc(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(((long)arr_v[v]))));
        }
        return list0;
    }

    public static final Object wd(@l boolean[] arr_z, Object object0, @l A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            object0 = p0.invoke(v1, object0, Boolean.valueOf(arr_z[v]));
            ++v;
        }
        return object0;
    }

    public static int we(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object.length - 1;
    }

    @l
    public static final Map wf(@l Object[] arr_object, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_object, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @f
    private static final boolean wg(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length == 0 ? 0 : 1;
    }

    public static int wh(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[kotlin.collections.l.ue(arr_v)];
    }

    @l
    public static final List wi(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_object.length);
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            list0.add(o0.invoke(v1, arr_object[v]));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float wj(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((byte)arr_b[0]))).floatValue();
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((byte)arr_b[v1]))).floatValue());
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
    private static final Object wk(short[] arr_v, Comparator comparator0, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(((short)arr_v[0]));
        int v = kotlin.collections.l.xe(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((short)arr_v[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Double wl(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) > 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Double wm(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).doubleValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final long wn(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                if(v > v3) {
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
    private static final float[] wo(float[] arr_f, A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_f.length; ++v1) {
            o0.invoke(v1, ((float)arr_f[v]));
            ++v;
        }
        return arr_f;
    }

    public static final char wp(@l char[] arr_c, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        if(arr_c.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        char c = arr_c[0];
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                c = ((Character)o0.invoke(Character.valueOf(c), Character.valueOf(arr_c[v1]))).charValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return c;
    }

    public static final boolean wq(@l boolean[] arr_z, @l A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        int v = p.ye(arr_z);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)p0.invoke(v1, Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return z;
    }

    @l
    public static long[] wr(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        long[] arr_v1 = new long[arr_v.length];
        int v = kotlin.collections.l.ve(arr_v);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_v1[v - v1] = arr_v[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_v1;
    }

    @h0(version = "1.4")
    @f
    private static final List ws(float[] arr_f, Object object0, A3.p p0) {
        L.p(arr_f, "<this>");
        L.p(p0, "operation");
        if(arr_f.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_f.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_f.length; ++v) {
            object0 = p0.invoke(v, object0, ((float)arr_f[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Float wt(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        Float float0 = null;
        boolean z = false;
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            if(((Boolean)function10.invoke(f)).booleanValue()) {
                if(z) {
                    return null;
                }
                float0 = f;
                z = true;
            }
        }
        return z ? float0 : null;
    }

    @h0(version = "1.4")
    public static final void wu(@l double[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        o.L3(arr_f, v, v1);
        p.Vq(arr_f, v, v1);
    }

    @l
    public static final List wv(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        return p.Nv(arr_v, new kotlin.comparisons.g.c(function10));
    }

    @i(name = "sumOfByte")
    public static final int ww(@l Byte[] arr_byte) {
        L.p(arr_byte, "<this>");
        int v1 = 0;
        for(int v = 0; v < arr_byte.length; ++v) {
            v1 += (byte)arr_byte[v];
        }
        return v1;
    }

    @l
    public static final List wx(@l char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_c.length) {
            return p.Fy(arr_c);
        }
        if(v == 1) {
            return u.k(Character.valueOf(arr_c[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            ((ArrayList)list0).add(Character.valueOf(arr_c[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet wy(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return (HashSet)p.ly(arr_f, new HashSet(Y.j(arr_f.length)));
    }

    @l
    public static final Set wz(@l Object[] arr_object, @l Iterable iterable0) {
        L.p(arr_object, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.dz(arr_object);
        u.q0(set0, iterable0);
        return set0;
    }

    @l
    public static final Iterable x5(@l double[] arr_f) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24014#2:18\n*E\n"})
        public static final class g implements a, Iterable {
            final double[] a;

            public g(double[] arr_f) {
                this.a = arr_f;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.d(this.a);
            }
        }

        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? u.H() : new g(arr_f);
    }

    @l
    public static final Map x6(@l int[] arr_v, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @f
    private static final int x7(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[0];
    }

    @f
    private static final int x8(char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length;
    }

    @l
    public static final List x9(@l byte[] arr_b, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        for(int v = kotlin.collections.l.qe(arr_b); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((byte)arr_b[v]))).booleanValue()) {
                return p.vx(arr_b, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List xA(@l short[] arr_v, @l Iterable iterable0, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        L.p(o0, "transform");
        List list0 = new ArrayList(Math.min(u.b0(iterable0, 10), arr_v.length));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= arr_v.length) {
                break;
            }
            ((ArrayList)list0).add(o0.invoke(((short)arr_v[v]), object0));
            ++v;
        }
        return list0;
    }

    @l
    public static final List xa(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            int v2 = arr_v[v];
            if(((Boolean)o0.invoke(v1, ((short)v2))).booleanValue()) {
                list0.add(((short)v2));
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Byte xb(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "predicate");
        int v = arr_b.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_b[v];
                if(((Boolean)function10.invoke(((byte)v1))).booleanValue()) {
                    return (byte)v1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final List xc(@l Object[] arr_object, @l Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_object.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(arr_object[v])));
        }
        return list0;
    }

    public static final Object xd(@l byte[] arr_b, Object object0, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(o0, "operation");
        for(int v = kotlin.collections.l.qe(arr_b); v >= 0; --v) {
            object0 = o0.invoke(((byte)arr_b[v]), object0);
        }
        return object0;
    }

    public static int xe(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length - 1;
    }

    @l
    public static final Map xf(@l short[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(((short)v1));
        }
        return map0;
    }

    @f
    private static final boolean xg(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? 0 : 1;
    }

    public static final int xh(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
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

    @l
    public static final List xi(@l short[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_v.length);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            list0.add(o0.invoke(v1, ((short)arr_v[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float xj(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(Character.valueOf(arr_c[0]))).floatValue();
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(Character.valueOf(arr_c[v1]))).floatValue());
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
    private static final Object xk(boolean[] arr_z, Comparator comparator0, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = function10.invoke(Boolean.valueOf(arr_z[0]));
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Boolean.valueOf(arr_z[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Float xl(@l float[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) > 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
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
    private static final Double xm(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((double)arr_f[0]))).doubleValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((double)arr_f[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @l
    @i(name = "minOrThrow")
    public static final Comparable xn(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        if(arr_comparable.length == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable0 = arr_comparable[0];
        int v = kotlin.collections.l.we(arr_comparable);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = arr_comparable[v1];
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
    private static final int[] xo(int[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            o0.invoke(v1, ((int)arr_v[v]));
            ++v;
        }
        return arr_v;
    }

    public static final double xp(@l double[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)o0.invoke(f, ((double)arr_f[v1]))).doubleValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Boolean xq(@l boolean[] arr_z, @l A3.p p0) {
        L.p(arr_z, "<this>");
        L.p(p0, "operation");
        int v = p.ye(arr_z);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        boolean z = arr_z[v];
        while(v1 >= 0) {
            z = ((Boolean)p0.invoke(v1, Boolean.valueOf(arr_z[v1]), Boolean.valueOf(z))).booleanValue();
            --v1;
        }
        return Boolean.valueOf(z);
    }

    @l
    public static final Object[] xr(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        if(arr_object.length == 0) {
            return arr_object;
        }
        Object[] arr_object1 = kotlin.collections.m.a(arr_object, arr_object.length);
        int v = kotlin.collections.l.we(arr_object);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_object1[v - v1] = arr_object[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_object1;
    }

    @h0(version = "1.4")
    @f
    private static final List xs(int[] arr_v, Object object0, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = p0.invoke(v, object0, ((int)arr_v[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Integer xt(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 1 ? ((int)arr_v[0]) : null;
    }

    public static final void xu(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length > 1) {
            o.M3(arr_f);
            p.Wq(arr_f);
        }
    }

    @l
    public static final List xv(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        return p.Ov(arr_z, new kotlin.comparisons.g.c(function10));
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double xw(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_b.length; ++v) {
            f += ((Number)function10.invoke(((byte)arr_b[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List xx(@l double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_f.length) {
            return p.Gy(arr_f);
        }
        if(v == 1) {
            return u.k(((double)arr_f[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((double)arr_f[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet xy(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return (HashSet)p.my(arr_f, new HashSet(Y.j(arr_f.length)));
    }

    @l
    public static final Set xz(@l short[] arr_v, @l Iterable iterable0) {
        L.p(arr_v, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.ez(arr_v);
        u.q0(set0, iterable0);
        return set0;
    }

    @l
    public static final Iterable y5(@l float[] arr_f) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24006#2:18\n*E\n"})
        public static final class kotlin.collections.p.f implements a, Iterable {
            final float[] a;

            public kotlin.collections.p.f(float[] arr_f) {
                this.a = arr_f;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.e(this.a);
            }
        }

        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? u.H() : new kotlin.collections.p.f(arr_f);
    }

    @l
    public static final Map y6(@l long[] arr_v, @l Map map0, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), v1);
        }
        return map0;
    }

    @f
    private static final long y7(long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v[0];
    }

    public static final int y8(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            if(((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @l
    public static final List y9(@l char[] arr_c, @l Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        for(int v = p.re(arr_c); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Character.valueOf(arr_c[v]))).booleanValue()) {
                return p.wx(arr_c, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List yA(@l short[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "<this>");
        L.p(arr_object, "other");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(r0.a(((short)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final List ya(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "predicate");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            boolean z = arr_z[v];
            if(((Boolean)o0.invoke(v1, Boolean.valueOf(z))).booleanValue()) {
                list0.add(Boolean.valueOf(z));
            }
            ++v;
        }
        return list0;
    }

    @f
    private static final Character yb(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "predicate");
        int v = arr_c.length - 1;
        if(v >= 0) {
            while(true) {
                int v1 = arr_c[v];
                if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                    return Character.valueOf(((char)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final List yc(@l short[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(((short)arr_v[v]))));
        }
        return list0;
    }

    public static final Object yd(@l char[] arr_c, Object object0, @l A3.o o0) {
        L.p(arr_c, "<this>");
        L.p(o0, "operation");
        for(int v = p.re(arr_c); v >= 0; --v) {
            object0 = o0.invoke(Character.valueOf(arr_c[v]), object0);
        }
        return object0;
    }

    public static final int ye(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length - 1;
    }

    @l
    public static final Map yf(@l short[] arr_v, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            Object object0 = function10.invoke(((short)v1));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(function11.invoke(((short)v1)));
        }
        return map0;
    }

    @f
    private static final boolean yg(float[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length == 0 ? 0 : 1;
    }

    public static long yh(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return arr_v[kotlin.collections.l.ve(arr_v)];
    }

    @l
    public static final List yi(@l boolean[] arr_z, @l A3.o o0) {
        L.p(arr_z, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList(arr_z.length);
        int v = 0;
        for(int v1 = 0; v < arr_z.length; ++v1) {
            list0.add(o0.invoke(v1, Boolean.valueOf(arr_z[v])));
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float yj(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((double)arr_f[0]))).floatValue();
        int v = p.se(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((double)arr_f[v1]))).floatValue());
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
    private static final Object yk(byte[] arr_b, Comparator comparator0, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(((byte)arr_b[0]));
        int v = kotlin.collections.l.qe(arr_b);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(((byte)arr_b[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Integer yl(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Double ym(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((float)arr_f[0]))).doubleValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((float)arr_f[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final short yn(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        short v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                short v3 = arr_v[v2];
                if(v > v3) {
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
    private static final long[] yo(long[] arr_v, A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_v.length; ++v1) {
            o0.invoke(v1, ((long)arr_v[v]));
            ++v;
        }
        return arr_v;
    }

    public static final float yp(@l float[] arr_f, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        if(arr_f.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = ((Number)o0.invoke(f, ((float)arr_f[v1]))).floatValue();
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Byte yq(@l byte[] arr_b, @l A3.p p0) {
        L.p(arr_b, "<this>");
        L.p(p0, "operation");
        int v = kotlin.collections.l.qe(arr_b);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_b[v];
        while(v1 >= 0) {
            v2 = ((Number)p0.invoke(v1, ((byte)arr_b[v1]), ((byte)v2))).byteValue();
            --v1;
        }
        return (byte)v2;
    }

    @l
    public static short[] yr(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length == 0) {
            return arr_v;
        }
        short[] arr_v1 = new short[arr_v.length];
        int v = kotlin.collections.l.xe(arr_v);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_v1[v - v1] = arr_v[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_v1;
    }

    @h0(version = "1.4")
    @f
    private static final List ys(long[] arr_v, Object object0, A3.p p0) {
        L.p(arr_v, "<this>");
        L.p(p0, "operation");
        if(arr_v.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_v.length; ++v) {
            object0 = p0.invoke(v, object0, ((long)arr_v[v]));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Integer yt(@l int[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        Integer integer0 = null;
        boolean z = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                if(z) {
                    return null;
                }
                integer0 = v1;
                z = true;
            }
        }
        return z ? integer0 : null;
    }

    @h0(version = "1.4")
    public static void yu(@l float[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        kotlin.collections.l.N3(arr_f, v, v1);
        p.Xq(arr_f, v, v1);
    }

    @l
    public static final List yv(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        o.G3(arr_b1);
        return p.ir(arr_b1);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double yw(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_c.length; ++v) {
            f += ((Number)function10.invoke(Character.valueOf(arr_c[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List yx(@l float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_f.length) {
            return p.Hy(arr_f);
        }
        if(v == 1) {
            return u.k(((float)arr_f[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            ((ArrayList)list0).add(((float)arr_f[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet yy(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return (HashSet)p.ny(arr_v, new HashSet(Y.j(arr_v.length)));
    }

    @l
    public static final Set yz(@l boolean[] arr_z, @l Iterable iterable0) {
        L.p(arr_z, "<this>");
        L.p(iterable0, "other");
        Set set0 = p.fz(arr_z);
        u.q0(set0, iterable0);
        return set0;
    }

    @l
    public static final Iterable z5(@l int[] arr_v) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n23990#2:18\n*E\n"})
        public static final class d implements a, Iterable {
            final int[] a;

            public d(int[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override
            public Iterator iterator() {
                return j.f(this.a);
            }
        }

        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? u.H() : new d(arr_v);
    }

    @l
    public static final Map z6(@l long[] arr_v, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            map0.put(function10.invoke(v1), function11.invoke(v1));
        }
        return map0;
    }

    @f
    private static final Object z7(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return arr_object[0];
    }

    @f
    private static final int z8(double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length;
    }

    @l
    public static final List z9(@l double[] arr_f, @l Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        for(int v = p.se(arr_f); -1 < v; --v) {
            if(!((Boolean)function10.invoke(((double)arr_f[v]))).booleanValue()) {
                return p.xx(arr_f, v + 1);
            }
        }
        return u.H();
    }

    @l
    public static final List zA(@l short[] arr_v, @l Object[] arr_object, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(arr_object, "other");
        L.p(o0, "transform");
        int v = Math.min(arr_v.length, arr_object.length);
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(o0.invoke(((short)arr_v[v1]), arr_object[v1]));
        }
        return list0;
    }

    @l
    public static final Collection za(@l byte[] arr_b, @l Collection collection0, @l A3.o o0) {
        L.p(arr_b, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(int v1 = 0; v < arr_b.length; ++v1) {
            int v2 = arr_b[v];
            if(((Boolean)o0.invoke(v1, ((byte)v2))).booleanValue()) {
                collection0.add(((byte)v2));
            }
            ++v;
        }
        return collection0;
    }

    @f
    private static final Double zb(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "predicate");
        int v = arr_f.length - 1;
        if(v >= 0) {
            while(true) {
                double f = arr_f[v];
                if(((Boolean)function10.invoke(f)).booleanValue()) {
                    return f;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @l
    public static final List zc(@l boolean[] arr_z, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_z.length; ++v) {
            u.q0(list0, ((Iterable)function10.invoke(Boolean.valueOf(arr_z[v]))));
        }
        return list0;
    }

    public static final Object zd(@l double[] arr_f, Object object0, @l A3.o o0) {
        L.p(arr_f, "<this>");
        L.p(o0, "operation");
        for(int v = p.se(arr_f); v >= 0; --v) {
            object0 = o0.invoke(((double)arr_f[v]), object0);
        }
        return object0;
    }

    @f
    private static final byte ze(byte[] arr_b, int v, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "defaultValue");
        return v < 0 || v >= arr_b.length ? ((Number)function10.invoke(v)).byteValue() : arr_b[v];
    }

    @l
    public static final Map zf(@l boolean[] arr_z, @l Map map0, @l Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(int v = 0; v < arr_z.length; ++v) {
            boolean z = arr_z[v];
            Object object0 = function10.invoke(Boolean.valueOf(z));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object0, arrayList0);
            }
            arrayList0.add(Boolean.valueOf(z));
        }
        return map0;
    }

    @f
    private static final boolean zg(int[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 0 ? 0 : 1;
    }

    public static final long zh(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "predicate");
        int v = arr_v.length - 1;
        if(v >= 0) {
            while(true) {
                long v1 = arr_v[v];
                if(((Boolean)function10.invoke(v1)).booleanValue()) {
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

    @l
    public static final List zi(@l Object[] arr_object, @l A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            Object object0 = o0.invoke(v1, arr_object[v]);
            if(object0 != null) {
                list0.add(object0);
            }
            ++v;
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float zj(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            throw new NoSuchElementException();
        }
        float f = ((Number)function10.invoke(((float)arr_f[0]))).floatValue();
        int v = p.te(arr_f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.max(f, ((Number)function10.invoke(((float)arr_f[v1]))).floatValue());
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
    private static final Object zk(char[] arr_c, Comparator comparator0, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        Object object0 = function10.invoke(Character.valueOf(arr_c[0]));
        int v = p.re(arr_c);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = function10.invoke(Character.valueOf(arr_c[v1]));
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

    @h0(version = "1.4")
    @m
    public static final Long zl(@l long[] arr_v, @l Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
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

    @U
    @h0(version = "1.4")
    @f
    private static final Double zm(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        double f = ((Number)function10.invoke(((int)arr_v[0]))).doubleValue();
        int v = kotlin.collections.l.ue(arr_v);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                f = Math.min(f, ((Number)function10.invoke(((int)arr_v[v1]))).doubleValue());
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @h0(version = "1.4")
    @m
    public static final Boolean zn(@l boolean[] arr_z, @l Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                if(comparator0.compare(Boolean.valueOf(z), Boolean.valueOf(z1)) > 0) {
                    z = z1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @h0(version = "1.4")
    @f
    private static final Object[] zo(Object[] arr_object, A3.o o0) {
        L.p(arr_object, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(int v1 = 0; v < arr_object.length; ++v1) {
            o0.invoke(v1, arr_object[v]);
            ++v;
        }
        return arr_object;
    }

    public static final int zp(@l int[] arr_v, @l A3.o o0) {
        L.p(arr_v, "<this>");
        L.p(o0, "operation");
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                v = ((Number)o0.invoke(v, ((int)arr_v[v2]))).intValue();
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @h0(version = "1.4")
    @m
    public static final Character zq(@l char[] arr_c, @l A3.p p0) {
        L.p(arr_c, "<this>");
        L.p(p0, "operation");
        int v = p.re(arr_c);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = arr_c[v];
        while(v1 >= 0) {
            v2 = ((Character)p0.invoke(v1, Character.valueOf(arr_c[v1]), Character.valueOf(((char)v2)))).charValue();
            --v1;
        }
        return Character.valueOf(((char)v2));
    }

    @l
    public static final boolean[] zr(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        if(arr_z.length == 0) {
            return arr_z;
        }
        boolean[] arr_z1 = new boolean[arr_z.length];
        int v = p.ye(arr_z);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_z1[v - v1] = arr_z[v1];
                if(v1 == v) {
                    break;
                }
            }
        }
        return arr_z1;
    }

    @h0(version = "1.4")
    @l
    public static final List zs(@l Object[] arr_object, Object object0, @l A3.p p0) {
        L.p(arr_object, "<this>");
        L.p(p0, "operation");
        if(arr_object.length == 0) {
            return u.k(object0);
        }
        ArrayList arrayList0 = new ArrayList(arr_object.length + 1);
        arrayList0.add(object0);
        for(int v = 0; v < arr_object.length; ++v) {
            object0 = p0.invoke(v, object0, arr_object[v]);
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @m
    public static final Long zt(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length == 1 ? ((long)arr_v[0]) : null;
    }

    public static final void zu(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length > 1) {
            o.O3(arr_v);
            kotlin.collections.l.Yq(arr_v);
        }
    }

    @l
    public static final List zv(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        L.o(arr_c1, "copyOf(...)");
        o.I3(arr_c1);
        return p.jr(arr_c1);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfDouble")
    private static final double zw(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += ((Number)function10.invoke(((double)arr_f[v]))).doubleValue();
        }
        return f;
    }

    @l
    public static final List zx(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return u.H();
        }
        if(v >= arr_v.length) {
            return p.Iy(arr_v);
        }
        if(v == 1) {
            return u.k(((int)arr_v[0]));
        }
        List list0 = new ArrayList(v);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ((ArrayList)list0).add(((int)arr_v[v1]));
            ++v2;
            if(v2 == v) {
                break;
            }
        }
        return list0;
    }

    @l
    public static final HashSet zy(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return (HashSet)p.oy(arr_v, new HashSet(Y.j(arr_v.length)));
    }

    @l
    public static final Iterable zz(@l byte[] arr_b) {
        static final class kotlin.collections.p.u extends N implements A3.a {
            final byte[] e;

            kotlin.collections.p.u(byte[] arr_b) {
                this.e = arr_b;
                super(0);
            }

            public final Iterator b() {
                return j.b(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(arr_b, "<this>");
        return new Q(new kotlin.collections.p.u(arr_b));
    }
}

