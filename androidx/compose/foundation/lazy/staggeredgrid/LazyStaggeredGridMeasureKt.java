package androidx.compose.foundation.lazy.staggeredgrid;

import A3.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.collections.k;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1097:1\n50#1,9:1108\n72#1,4:1117\n884#1:1134\n885#1,3:1139\n72#1,4:1142\n72#1,4:1146\n72#1,4:1150\n884#1:1161\n885#1,3:1166\n72#1,4:1177\n72#1,4:1181\n884#1:1202\n885#1,3:1207\n72#1,4:1212\n72#1,4:1218\n72#1,4:1222\n884#1:1243\n885#1,3:1248\n72#1,4:1251\n72#1,4:1255\n944#1,4:1259\n72#1,4:1263\n72#1,4:1267\n855#1,4:1271\n859#1,3:1279\n862#1,8:1284\n871#1:1293\n855#1,4:1294\n859#1,3:1302\n862#1,8:1307\n871#1:1316\n72#1,4:1317\n60#1:1325\n917#1,11:1329\n884#1:1340\n885#1,3:1345\n884#1:1358\n885#1,3:1363\n480#2,4:1098\n485#2:1107\n122#3,5:1102\n220#4:1121\n217#4:1122\n217#4:1128\n220#4:1154\n217#4:1155\n217#4:1171\n220#4:1189\n217#4:1190\n217#4:1196\n220#4:1230\n217#4:1231\n217#4:1237\n880#5:1123\n879#5:1124\n878#5:1126\n880#5:1129\n879#5:1130\n878#5:1132\n878#5:1135\n879#5:1137\n880#5:1156\n879#5:1157\n878#5:1159\n878#5:1162\n879#5:1164\n878#5:1169\n880#5:1172\n879#5:1173\n878#5:1175\n880#5:1191\n879#5:1192\n878#5:1194\n880#5:1197\n879#5:1198\n878#5:1200\n878#5:1203\n879#5:1205\n878#5:1210\n880#5:1232\n879#5:1233\n878#5:1235\n880#5:1238\n879#5:1239\n878#5:1241\n878#5:1244\n879#5:1246\n878#5:1341\n879#5:1343\n878#5:1354\n879#5:1356\n878#5:1359\n879#5:1361\n62#6:1125\n55#6:1127\n62#6:1131\n55#6:1133\n55#6:1136\n62#6:1138\n62#6:1158\n55#6:1160\n55#6:1163\n62#6:1165\n55#6:1170\n62#6:1174\n55#6:1176\n62#6:1193\n55#6:1195\n62#6:1199\n55#6:1201\n55#6:1204\n62#6:1206\n55#6:1211\n62#6:1234\n55#6:1236\n62#6:1240\n55#6:1242\n55#6:1245\n62#6:1247\n55#6:1342\n62#6:1344\n55#6:1355\n62#6:1357\n55#6:1360\n62#6:1362\n12774#7,2:1185\n12541#7,2:1187\n12774#7,2:1216\n12583#7,2:1226\n12774#7,2:1228\n12583#7,2:1282\n12583#7,2:1305\n12774#7,2:1321\n12583#7,2:1323\n12744#7,2:1327\n33#8,4:1275\n38#8:1292\n33#8,4:1298\n38#8:1315\n33#8,6:1348\n1#9:1326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n230#1:1108,9\n288#1:1117,4\n333#1:1134\n333#1:1139,3\n339#1:1142,4\n381#1:1146,4\n419#1:1150,4\n447#1:1161\n447#1:1166,3\n464#1:1177,4\n467#1:1181,4\n500#1:1202\n500#1:1207,3\n518#1:1212,4\n540#1:1218,4\n543#1:1222,4\n607#1:1243\n607#1:1248,3\n645#1:1251,4\n648#1:1255,4\n665#1:1259,4\n669#1:1263,4\n692#1:1267,4\n716#1:1271,4\n716#1:1279,3\n716#1:1284,8\n716#1:1293\n741#1:1294,4\n741#1:1302,3\n741#1:1307,8\n741#1:1316\n763#1:1317,4\n230#1:1325\n818#1:1329,11\n843#1:1340\n843#1:1345,3\n897#1:1358\n897#1:1363,3\n111#1:1098,4\n111#1:1107\n111#1:1102,5\n325#1:1121\n325#1:1122\n332#1:1128\n445#1:1154\n445#1:1155\n457#1:1171\n491#1:1189\n491#1:1190\n495#1:1196\n599#1:1230\n599#1:1231\n606#1:1237\n325#1:1123\n325#1:1124\n325#1:1126\n332#1:1129\n332#1:1130\n332#1:1132\n333#1:1135\n333#1:1137\n445#1:1156\n445#1:1157\n445#1:1159\n447#1:1162\n447#1:1164\n453#1:1169\n457#1:1172\n457#1:1173\n457#1:1175\n491#1:1191\n491#1:1192\n491#1:1194\n495#1:1197\n495#1:1198\n495#1:1200\n500#1:1203\n500#1:1205\n510#1:1210\n599#1:1232\n599#1:1233\n599#1:1235\n606#1:1238\n606#1:1239\n606#1:1241\n607#1:1244\n607#1:1246\n843#1:1341\n843#1:1343\n884#1:1354\n884#1:1356\n897#1:1359\n897#1:1361\n325#1:1125\n325#1:1127\n332#1:1131\n332#1:1133\n333#1:1136\n333#1:1138\n445#1:1158\n445#1:1160\n447#1:1163\n447#1:1165\n453#1:1170\n457#1:1174\n457#1:1176\n491#1:1193\n491#1:1195\n495#1:1199\n495#1:1201\n500#1:1204\n500#1:1206\n510#1:1211\n599#1:1234\n599#1:1236\n606#1:1240\n606#1:1242\n607#1:1245\n607#1:1247\n843#1:1342\n843#1:1344\n884#1:1355\n884#1:1357\n897#1:1360\n897#1:1362\n476#1:1185,2\n479#1:1187,2\n536#1:1216,2\n550#1:1226,2\n558#1:1228,2\n725#1:1282,2\n754#1:1305,2\n772#1:1321,2\n773#1:1323,2\n816#1:1327,2\n716#1:1275,4\n716#1:1292\n741#1:1298,4\n741#1:1315\n858#1:1348,6\n*E\n"})
public final class LazyStaggeredGridMeasureKt {
    private static final boolean a = false;

    @ExperimentalFoundationApi
    private static final List a(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, Function1 function10, Function1 function11) {
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList0 = lazyStaggeredGridMeasureContext0.q().z();
        int v = lazyLayoutPinnedItemList0.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v1);
            int v2 = LazyLayoutItemProviderKt.c(lazyStaggeredGridMeasureContext0.f(), lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            if(((Boolean)function11.invoke(v2)).booleanValue()) {
                long v3 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v2, 0);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(function10.invoke(lazyStaggeredGridMeasureContext0.m().b(v2, v3)));
            }
        }
        return list0 == null ? u.H() : list0;
    }

    private static final List b(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, k[] arr_k, int[] arr_v, int v) {
        int v11;
        int v10;
        int v9;
        long v8;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem1;
        int v4;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_k.length; ++v1) {
            v2 += arr_k[v1].size();
        }
        List list0 = new ArrayList(v2);
    alab1:
        while(true) {
            do {
            alab2:
                while(true) {
                    int v3 = 0;
                    while(true) {
                        if(v3 >= arr_k.length) {
                            break alab1;
                        }
                        if(arr_k[v3].isEmpty()) {
                            ++v3;
                            continue;
                        }
                        v4 = -1;
                        int v6 = 0x7FFFFFFF;
                        for(int v5 = 0; v5 < arr_k.length; ++v5) {
                            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem0 = (LazyStaggeredGridMeasuredItem)arr_k[v5].j();
                            int v7 = lazyStaggeredGridMeasuredItem0 == null ? 0x7FFFFFFF : lazyStaggeredGridMeasuredItem0.b();
                            if(v6 > v7) {
                                v4 = v5;
                                v6 = v7;
                            }
                        }
                        lazyStaggeredGridMeasuredItem1 = (LazyStaggeredGridMeasuredItem)arr_k[v4].removeFirst();
                        if(lazyStaggeredGridMeasuredItem1.d() == v4) {
                            v8 = SpanRange.b(lazyStaggeredGridMeasuredItem1.d(), lazyStaggeredGridMeasuredItem1.i());
                            v9 = LazyStaggeredGridMeasureKt.l(arr_v, v8);
                            v10 = v4 == 0 ? 0 : lazyStaggeredGridMeasureContext0.n()[v4 - 1] + lazyStaggeredGridMeasureContext0.e() * v4;
                            if(lazyStaggeredGridMeasuredItem1.f().isEmpty()) {
                                break;
                            }
                            break alab2;
                        }
                        continue alab1;
                    }
                }
                list0.add(lazyStaggeredGridMeasuredItem1.l(v4, v9, v10, v));
                v11 = (int)(v8 >> 0x20);
                int v12 = (int)(v8 & 0xFFFFFFFFL);
            label_32:
            }
            while(v11 >= v12);
            arr_v[v11] = lazyStaggeredGridMeasuredItem1.g() + v9;
            ++v11;
            goto label_32;
        }
        return list0;
    }

    private static final void c(a a0) {
    }

    private static final String d(k[] arr_k) {
        return "";
    }

    private static final void e(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, int[] arr_v, int v) {
        int v1 = arr_v.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(arr_v[v1] >= v || !lazyStaggeredGridMeasureContext0.h().a(arr_v[v1], v1)) {
                    arr_v[v1] = LazyStaggeredGridMeasureKt.f(lazyStaggeredGridMeasureContext0, arr_v[v1], v1);
                }
                else {
                    if(arr_v[v1] >= 0 && !lazyStaggeredGridMeasureContext0.r(lazyStaggeredGridMeasureContext0.f(), arr_v[v1])) {
                        lazyStaggeredGridMeasureContext0.h().l(arr_v[v1], v1);
                    }
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
        }
    }

    private static final int f(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, int v, int v1) {
        return lazyStaggeredGridMeasureContext0.h().f(v, v1);
    }

    private static final void g(long v, Function1 function10) {
        for(int v1 = (int)(v >> 0x20); v1 < ((int)(v & 0xFFFFFFFFL)); ++v1) {
            function10.invoke(v1);
        }
    }

    private static final int h(int[] arr_v) {
        int v = -1;
        int v1 = 0x80000000;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v3 = arr_v[v2];
            if(v1 < v3) {
                v = v2;
                v1 = v3;
            }
        }
        return v;
    }

    private static final int i(Object[] arr_object, Function1 function10) {
        int v = -1;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            int v3 = ((Number)function10.invoke(arr_object[v2])).intValue();
            if(v1 > v3) {
                v = v2;
                v1 = v3;
            }
        }
        return v;
    }

    public static final int j(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        int v1 = -1;
        int v2 = 0x7FFFFFFF;
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            int v4 = arr_v[v3];
            if(v + 1 <= v4 && v4 < v2) {
                v1 = v3;
                v2 = v4;
            }
        }
        return v1;
    }

    public static int k(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x80000000;
        }
        return LazyStaggeredGridMeasureKt.j(arr_v, v);
    }

    private static final int l(int[] arr_v, long v) {
        int v1 = (int)(v >> 0x20);
        int v2 = 0x80000000;
        while(v1 < ((int)(v & 0xFFFFFFFFL))) {
            v2 = Math.max(v2, arr_v[v1]);
            ++v1;
        }
        return v2;
    }

    // This method was un-flattened
    @ExperimentalFoundationApi
    private static final LazyStaggeredGridMeasureResult m(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, int v, int[] arr_v, int[] arr_v1, boolean z) {
        int[] arr_v25;
        int v87;
        List list3;
        int v90;
        int[] arr_v24;
        int[] arr_v20;
        int v58;
        int v49;
        int[] arr_v17;
        int[] arr_v16;
        int v48;
        int v47;
        int v46;
        int[] arr_v15;
        int[] arr_v14;
        int[] arr_v12;
        int v37;
        int v36;
        int[] arr_v10;
        int[] arr_v9;
        int v29;
        int v27;
        int v11;
        int v4;
        LazyLayoutMeasureScope lazyLayoutMeasureScope0 = lazyStaggeredGridMeasureContext0.l();
        int v1 = lazyStaggeredGridMeasureContext0.f().getItemCount();
        if(v1 <= 0 || lazyStaggeredGridMeasureContext0.g() == 0) {
            return new LazyStaggeredGridMeasureResult(arr_v, arr_v1, 0.0f, MeasureScope.-CC.p(lazyLayoutMeasureScope0, Constraints.r(lazyStaggeredGridMeasureContext0.c()), Constraints.q(lazyStaggeredGridMeasureContext0.c()), null, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure.1.1.e, 4, null), false, false, lazyStaggeredGridMeasureContext0.t(), v1, u.H(), IntSizeKt.a(Constraints.r(lazyStaggeredGridMeasureContext0.c()), Constraints.q(lazyStaggeredGridMeasureContext0.c())), -lazyStaggeredGridMeasureContext0.b(), lazyStaggeredGridMeasureContext0.j() + lazyStaggeredGridMeasureContext0.a(), lazyStaggeredGridMeasureContext0.b(), lazyStaggeredGridMeasureContext0.a(), lazyStaggeredGridMeasureContext0.k(), null);
        }
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v2, "copyOf(this, size)");
        int[] arr_v3 = Arrays.copyOf(arr_v1, arr_v1.length);
        L.o(arr_v3, "copyOf(this, size)");
        LazyStaggeredGridMeasureKt.e(lazyStaggeredGridMeasureContext0, arr_v2, v1);
        LazyStaggeredGridMeasureKt.q(arr_v3, -v);
        int v2 = lazyStaggeredGridMeasureContext0.g();
        k[] arr_k = new k[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_k[v3] = new k(16);
        }
        LazyStaggeredGridMeasureKt.q(arr_v3, -lazyStaggeredGridMeasureContext0.b());
        while(true) {
            if(!LazyStaggeredGridMeasureKt.n(arr_v2, arr_v3, lazyStaggeredGridMeasureContext0)) {
                goto label_48;
            }
            v4 = LazyStaggeredGridMeasureKt.h(arr_v2);
            int v5 = arr_v2[v4];
            int v6 = arr_v3.length;
            for(int v7 = 0; v7 < v6; ++v7) {
                if(arr_v2[v7] != arr_v2[v4]) {
                    int v8 = arr_v3[v7];
                    int v9 = arr_v3[v4];
                    if(v8 < v9) {
                        arr_v3[v7] = v9;
                    }
                }
            }
            int v10 = LazyStaggeredGridMeasureKt.f(lazyStaggeredGridMeasureContext0, v5, v4);
            if(v10 < 0) {
                v11 = v1;
            }
            else {
                long v12 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v10, v4);
                int v13 = (int)(v12 >> 0x20);
                int v14 = ((int)(0xFFFFFFFFL & v12)) - v13;
                lazyStaggeredGridMeasureContext0.h().l(v10, (v14 == 1 ? v13 : -2));
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem0 = lazyStaggeredGridMeasureContext0.m().b(v10, v12);
                int v15 = LazyStaggeredGridMeasureKt.l(arr_v3, v12);
                int[] arr_v4 = v14 == 1 ? null : lazyStaggeredGridMeasureContext0.h().g(v10);
                while(v13 < ((int)(0xFFFFFFFFL & v12))) {
                    arr_v2[v13] = v10;
                    arr_v3[v13] = lazyStaggeredGridMeasuredItem0.g() + v15 + (arr_v4 == null ? 0 : arr_v4[v13]);
                    ++v13;
                }
                continue;
            label_48:
                v11 = v1;
                v4 = -1;
            }
            break;
        }
        int v16 = -lazyStaggeredGridMeasureContext0.b();
        int v17 = arr_v3[0];
        if(v17 < v16) {
            v += v17;
            LazyStaggeredGridMeasureKt.q(arr_v3, v16 - v17);
        }
        LazyStaggeredGridMeasureKt.q(arr_v3, lazyStaggeredGridMeasureContext0.b());
        if(v4 == -1) {
            v4 = kotlin.collections.l.Gf(arr_v2, 0);
        }
        if(v4 != -1 && LazyStaggeredGridMeasureKt.o(arr_v2, lazyStaggeredGridMeasureContext0, arr_v3, v4) && z) {
            lazyStaggeredGridMeasureContext0.h().j();
            int[] arr_v5 = new int[arr_v2.length];
            for(int v18 = 0; v18 < arr_v2.length; ++v18) {
                arr_v5[v18] = -1;
            }
            int[] arr_v6 = new int[arr_v3.length];
            for(int v19 = 0; v19 < arr_v3.length; ++v19) {
                arr_v6[v19] = arr_v3[v4];
            }
            return LazyStaggeredGridMeasureKt.m(lazyStaggeredGridMeasureContext0, v, arr_v5, arr_v6, false);
        }
        int[] arr_v7 = Arrays.copyOf(arr_v2, arr_v2.length);
        L.o(arr_v7, "copyOf(this, size)");
        int v20 = arr_v3.length;
        int[] arr_v8 = new int[v20];
        for(int v21 = 0; v21 < v20; ++v21) {
            arr_v8[v21] = -arr_v3[v21];
        }
        int v22 = s.u(lazyStaggeredGridMeasureContext0.j() + lazyStaggeredGridMeasureContext0.a(), 0);
        int v23 = LazyStaggeredGridMeasureKt.k(arr_v7, 0, 1, null);
        int v24 = 0;
        while(v23 != -1 && v24 < lazyStaggeredGridMeasureContext0.g()) {
            int v25 = arr_v7[v23];
            int v26 = LazyStaggeredGridMeasureKt.j(arr_v7, v25);
            if(v25 >= 0) {
                v27 = v24 + 1;
                long v28 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v25, v23);
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem1 = lazyStaggeredGridMeasureContext0.m().b(v25, v28);
                v29 = v;
                arr_v9 = arr_v2;
                arr_v10 = arr_v3;
                int v30 = ((int)(v28 & 0xFFFFFFFFL)) - ((int)(v28 >> 0x20));
                lazyStaggeredGridMeasureContext0.h().l(v25, (v30 == 1 ? ((int)(v28 >> 0x20)) : -2));
                int v31 = LazyStaggeredGridMeasureKt.l(arr_v8, v28) + lazyStaggeredGridMeasuredItem1.g();
                for(int v32 = (int)(v28 >> 0x20); v32 < ((int)(v28 & 0xFFFFFFFFL)); ++v32) {
                    arr_v8[v32] = v31;
                    arr_v7[v32] = v25;
                    arr_k[v32].addLast(lazyStaggeredGridMeasuredItem1);
                }
                if(arr_v8[((int)(v28 >> 0x20))] <= lazyStaggeredGridMeasureContext0.k() + v16) {
                    lazyStaggeredGridMeasuredItem1.m(false);
                }
                if(v30 != 1) {
                    v24 = lazyStaggeredGridMeasureContext0.g();
                    goto label_116;
                }
            }
            else {
                v29 = v;
                v27 = v24 + 1;
                arr_v9 = arr_v2;
                arr_v10 = arr_v3;
            }
            v24 = v27;
        label_116:
            v23 = v26;
            v = v29;
            arr_v2 = arr_v9;
            arr_v3 = arr_v10;
        }
    alab1:
        while(true) {
            int v33 = 0;
            while(v33 < v20) {
                int v34 = arr_v8[v33];
                if(v34 < v22 || v34 <= 0) {
                    goto label_135;
                }
                ++v33;
            }
            for(int v35 = 0; v35 < v2; ++v35) {
                if(!arr_k[v35].isEmpty()) {
                    v36 = v11;
                    v37 = 0;
                    break alab1;
                }
            }
        label_135:
            int v38 = LazyStaggeredGridMeasureKt.k(arr_v8, 0, 1, null);
            int v39 = kotlin.collections.l.Xk(arr_v7) + 1;
            v36 = v11;
            if(v39 < v36) {
                long v40 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v39, v38);
                int v41 = ((int)(v40 & 0xFFFFFFFFL)) - ((int)(v40 >> 0x20));
                lazyStaggeredGridMeasureContext0.h().l(v39, (v41 == 1 ? -2 : ((int)(v40 >> 0x20))));
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasureContext0.m().b(v39, v40);
                int v42 = LazyStaggeredGridMeasureKt.l(arr_v8, v40);
                if(v41 == 1) {
                    arr_v12 = null;
                }
                else {
                    int[] arr_v11 = lazyStaggeredGridMeasureContext0.h().g(v39);
                    arr_v12 = arr_v11 == null ? new int[lazyStaggeredGridMeasureContext0.g()] : arr_v11;
                }
                for(int v43 = (int)(v40 >> 0x20); v43 < ((int)(v40 & 0xFFFFFFFFL)); ++v43) {
                    if(arr_v12 != null) {
                        arr_v12[v43] = v42 - arr_v8[v43];
                    }
                    arr_v7[v43] = v39;
                    arr_v8[v43] = v42 + lazyStaggeredGridMeasuredItem2.g();
                    arr_k[v43].addLast(lazyStaggeredGridMeasuredItem2);
                }
                lazyStaggeredGridMeasureContext0.h().k(v39, arr_v12);
                if(arr_v8[((int)(v40 >> 0x20))] <= v16 + lazyStaggeredGridMeasureContext0.k()) {
                    lazyStaggeredGridMeasuredItem2.m(false);
                }
                v11 = v36;
                continue;
            }
            else {
                v37 = 0;
            }
            break;
        }
        while(v37 < v2) {
            k k0 = arr_k[v37];
            while(k0.size() > 1 && !((LazyStaggeredGridMeasuredItem)k0.first()).k()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem)k0.removeFirst();
                int[] arr_v13 = lazyStaggeredGridMeasuredItem3.i() == 1 ? null : lazyStaggeredGridMeasureContext0.h().g(lazyStaggeredGridMeasuredItem3.b());
                arr_v3[v37] -= lazyStaggeredGridMeasuredItem3.g() + (arr_v13 == null ? 0 : arr_v13[v37]);
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem)k0.j();
            arr_v2[v37] = lazyStaggeredGridMeasuredItem4 == null ? -1 : lazyStaggeredGridMeasuredItem4.b();
            ++v37;
        }
        for(int v44 = 0; v44 < arr_v7.length; ++v44) {
            if(arr_v7[v44] == v36 - 1) {
                LazyStaggeredGridMeasureKt.q(arr_v8, -lazyStaggeredGridMeasureContext0.k());
                break;
            }
        }
        int v45 = 0;
        while(v45 < v20) {
            if(arr_v8[v45] < lazyStaggeredGridMeasureContext0.j()) {
                ++v45;
                continue;
            }
            arr_v14 = arr_v7;
            arr_v15 = arr_v8;
            v46 = v22;
            v47 = v16;
            v48 = v;
            arr_v16 = arr_v2;
            arr_v17 = arr_v3;
            v49 = v20;
            goto label_277;
        }
        int v50 = lazyStaggeredGridMeasureContext0.j() - arr_v8[LazyStaggeredGridMeasureKt.h(arr_v8)];
        arr_v17 = arr_v3;
        LazyStaggeredGridMeasureKt.q(arr_v17, -v50);
        LazyStaggeredGridMeasureKt.q(arr_v8, v50);
        int v51 = 0;
    alab2:
        while(true) {
            int v52 = 0;
            while(v52 < arr_v17.length) {
                if(arr_v17[v52] >= lazyStaggeredGridMeasureContext0.b()) {
                    ++v52;
                    continue;
                }
                int v53 = LazyStaggeredGridMeasureKt.k(arr_v17, 0, 1, null);
                if(v53 != LazyStaggeredGridMeasureKt.h(arr_v2)) {
                    v51 = 1;
                }
                int v54 = arr_v2[v53];
                if(v54 == -1) {
                    v54 = v36;
                }
                int v55 = LazyStaggeredGridMeasureKt.f(lazyStaggeredGridMeasureContext0, v54, v53);
                if(v55 < 0) {
                    arr_v16 = arr_v2;
                    if((v51 != 0 || LazyStaggeredGridMeasureKt.o(arr_v16, lazyStaggeredGridMeasureContext0, arr_v17, v53)) && z) {
                        lazyStaggeredGridMeasureContext0.h().j();
                        int[] arr_v18 = new int[arr_v16.length];
                        for(int v56 = 0; v56 < arr_v16.length; ++v56) {
                            arr_v18[v56] = -1;
                        }
                        int[] arr_v19 = new int[arr_v17.length];
                        for(int v57 = 0; v57 < arr_v17.length; ++v57) {
                            arr_v19[v57] = arr_v17[v53];
                        }
                        return LazyStaggeredGridMeasureKt.m(lazyStaggeredGridMeasureContext0, v, arr_v18, arr_v19, false);
                    }
                    v58 = v;
                    arr_v14 = arr_v7;
                    v49 = v20;
                    arr_v20 = arr_v8;
                    v46 = v22;
                    v47 = v16;
                }
                else {
                    long v59 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v55, v53);
                    int v60 = ((int)(v59 & 0xFFFFFFFFL)) - ((int)(v59 >> 0x20));
                    lazyStaggeredGridMeasureContext0.h().l(v55, (v60 == 1 ? ((int)(v59 >> 0x20)) : -2));
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = lazyStaggeredGridMeasureContext0.m().b(v55, v59);
                    int v61 = LazyStaggeredGridMeasureKt.l(arr_v17, v59);
                    int[] arr_v21 = v60 == 1 ? null : lazyStaggeredGridMeasureContext0.h().g(v55);
                    int v62 = (int)(v59 >> 0x20);
                    int v63 = v51;
                    while(v62 < ((int)(v59 & 0xFFFFFFFFL))) {
                        if(arr_v17[v62] != v61) {
                            v63 = 1;
                        }
                        arr_k[v62].addFirst(lazyStaggeredGridMeasuredItem5);
                        arr_v2[v62] = v55;
                        arr_v17[v62] = v61 + lazyStaggeredGridMeasuredItem5.g() + (arr_v21 == null ? 0 : arr_v21[v62]);
                        ++v62;
                    }
                    v51 = v63;
                    continue alab2;
                }
                break alab2;
            }
            arr_v14 = arr_v7;
            v46 = v22;
            v47 = v16;
            v58 = v;
            arr_v16 = arr_v2;
            v49 = v20;
            arr_v20 = arr_v8;
            break;
        }
        if(v51 != 0 && z) {
            lazyStaggeredGridMeasureContext0.h().j();
            return LazyStaggeredGridMeasureKt.m(lazyStaggeredGridMeasureContext0, v58, arr_v16, arr_v17, false);
        }
        v48 = v50 + v58;
        int v64 = arr_v17[LazyStaggeredGridMeasureKt.k(arr_v17, 0, 1, null)];
        if(v64 < 0) {
            v48 += v64;
            arr_v15 = arr_v20;
            LazyStaggeredGridMeasureKt.q(arr_v15, v64);
            LazyStaggeredGridMeasureKt.q(arr_v17, -v64);
        }
        else {
            arr_v15 = arr_v20;
        }
    label_277:
        float f = b.U(b.L0(lazyStaggeredGridMeasureContext0.q().E())) != b.U(v48) || Math.abs(b.L0(lazyStaggeredGridMeasureContext0.q().E())) < Math.abs(v48) ? lazyStaggeredGridMeasureContext0.q().E() : ((float)v48);
        int[] arr_v22 = Arrays.copyOf(arr_v17, arr_v17.length);
        L.o(arr_v22, "copyOf(this, size)");
        for(int v65 = 0; v65 < arr_v22.length; ++v65) {
            arr_v22[v65] = -arr_v22[v65];
        }
        if(lazyStaggeredGridMeasureContext0.b() > 0) {
            for(int v66 = 0; v66 < v2; ++v66) {
                k k1 = arr_k[v66];
                int v67 = k1.size();
                int v68 = 0;
                while(v68 < v67) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (LazyStaggeredGridMeasuredItem)k1.get(v68);
                    int[] arr_v23 = lazyStaggeredGridMeasureContext0.h().g(lazyStaggeredGridMeasuredItem6.b());
                    int v69 = lazyStaggeredGridMeasuredItem6.g() + (arr_v23 == null ? 0 : arr_v23[v66]);
                    if(v68 == u.J(k1)) {
                        break;
                    }
                    int v70 = arr_v17[v66];
                    if(v70 == 0 || v70 < v69) {
                        break;
                    }
                    arr_v17[v66] = v70 - v69;
                    ++v68;
                    arr_v16[v66] = ((LazyStaggeredGridMeasuredItem)k1.get(v68)).b();
                }
            }
        }
        int v71 = lazyStaggeredGridMeasureContext0.t() ? Constraints.p(lazyStaggeredGridMeasureContext0.c()) : ConstraintsKt.g(lazyStaggeredGridMeasureContext0.c(), kotlin.collections.l.Xk(arr_v15));
        int v72 = lazyStaggeredGridMeasureContext0.t() ? ConstraintsKt.f(lazyStaggeredGridMeasureContext0.c(), kotlin.collections.l.Xk(arr_v15)) : Constraints.o(lazyStaggeredGridMeasureContext0.c());
        int v73 = Math.min((lazyStaggeredGridMeasureContext0.t() ? v72 : v71), lazyStaggeredGridMeasureContext0.j());
        int v74 = arr_v22[0];
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList0 = lazyStaggeredGridMeasureContext0.q().z();
        int v75 = lazyLayoutPinnedItemList0.size();
        int v76 = v74;
        List list0 = null;
        int v77 = 0;
        while(v77 < v75) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v77);
            int v78 = LazyLayoutItemProviderKt.c(lazyStaggeredGridMeasureContext0.f(), lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            int v79 = lazyStaggeredGridMeasureContext0.h().h(v78);
            if(v79 == -2 || v79 == -1) {
                int v80 = 0;
                while(v80 < arr_v16.length) {
                    if(arr_v16[v80] > v78) {
                        ++v80;
                        continue;
                    }
                    arr_v24 = arr_v15;
                    goto label_336;
                }
            }
            else if(arr_v16[v79] <= v78) {
                arr_v24 = arr_v15;
                goto label_336;
            }
            arr_v24 = arr_v15;
            long v81 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v78, 0);
            if(list0 == null) {
                list0 = new ArrayList();
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem7 = lazyStaggeredGridMeasureContext0.m().b(v78, v81);
            v76 -= lazyStaggeredGridMeasuredItem7.g();
            list0.add(lazyStaggeredGridMeasuredItem7.l(0, v76, 0, v73));
        label_336:
            ++v77;
            arr_v15 = arr_v24;
        }
        if(list0 == null) {
            list0 = u.H();
        }
        List list1 = LazyStaggeredGridMeasureKt.b(lazyStaggeredGridMeasureContext0, arr_k, arr_v22, v73);
        int v82 = arr_v22[0];
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList1 = lazyStaggeredGridMeasureContext0.q().z();
        int v83 = lazyLayoutPinnedItemList1.size();
        List list2 = null;
        int v84 = 0;
        while(v84 < v83) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem1 = (PinnedItem)lazyLayoutPinnedItemList1.get(v84);
            int v85 = LazyLayoutItemProviderKt.c(lazyStaggeredGridMeasureContext0.f(), lazyLayoutPinnedItemList$PinnedItem1.getKey(), lazyLayoutPinnedItemList$PinnedItem1.getIndex());
            if(v85 < v36) {
                int v86 = lazyStaggeredGridMeasureContext0.h().h(v85);
                if(v86 == -2 || v86 == -1) {
                    arr_v25 = arr_v14;
                    int v88 = arr_v25.length;
                    v87 = v83;
                    int v89 = 0;
                    while(v89 < v88) {
                        if(arr_v25[v89] >= v85) {
                            goto label_378;
                        }
                        ++v89;
                    }
                label_366:
                    v90 = v72;
                    list3 = list1;
                    long v91 = lazyStaggeredGridMeasureContext0.p(lazyStaggeredGridMeasureContext0.f(), v85, 0);
                    if(list2 == null) {
                        list2 = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem8 = lazyStaggeredGridMeasureContext0.m().b(v85, v91);
                    LazyStaggeredGridPositionedItem lazyStaggeredGridPositionedItem0 = lazyStaggeredGridMeasuredItem8.l(0, v82, 0, v73);
                    v82 += lazyStaggeredGridMeasuredItem8.g();
                    list2.add(lazyStaggeredGridPositionedItem0);
                }
                else if(arr_v14[v86] < v85) {
                    v87 = v83;
                    arr_v25 = arr_v14;
                    goto label_366;
                }
            }
            else {
                v87 = v83;
                arr_v25 = arr_v14;
            label_378:
                v90 = v72;
                list3 = list1;
            }
            ++v84;
            v83 = v87;
            arr_v14 = arr_v25;
            v72 = v90;
            list1 = list3;
        }
        if(list2 == null) {
            list2 = u.H();
        }
        boolean z1 = arr_v16[0] != 0 || arr_v17[0] > 0;
        for(int v92 = 0; true; ++v92) {
            boolean z2 = false;
            if(v92 >= v49) {
                break;
            }
            if(arr_v15[v92] > lazyStaggeredGridMeasureContext0.j()) {
                z2 = true;
                break;
            }
        }
        if(!z2) {
            for(int v93 = 0; v93 < arr_v14.length; ++v93) {
                if(arr_v14[v93] >= v36 - 1) {
                    return new LazyStaggeredGridMeasureResult(arr_v16, arr_v17, f, MeasureScope.-CC.p(lazyLayoutMeasureScope0, v71, v72, null, new Function1(list0, list1, list2, lazyStaggeredGridMeasureContext0) {
                        final List e;
                        final List f;
                        final List g;
                        final LazyStaggeredGridMeasureContext h;

                        {
                            this.e = list0;
                            this.f = list1;
                            this.g = list2;
                            this.h = lazyStaggeredGridMeasureContext0;
                            super(1);
                        }

                        public final void a(@l PlacementScope placeable$PlacementScope0) {
                            L.p(placeable$PlacementScope0, "$this$layout");
                            List list0 = this.e;
                            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0 = this.h;
                            int v = list0.size();
                            for(int v2 = 0; v2 < v; ++v2) {
                                ((LazyStaggeredGridPositionedItem)list0.get(v2)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext0);
                            }
                            List list1 = this.f;
                            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext1 = this.h;
                            int v3 = list1.size();
                            for(int v4 = 0; v4 < v3; ++v4) {
                                ((LazyStaggeredGridPositionedItem)list1.get(v4)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext1);
                            }
                            List list2 = this.g;
                            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = this.h;
                            int v5 = list2.size();
                            for(int v1 = 0; v1 < v5; ++v1) {
                                ((LazyStaggeredGridPositionedItem)list2.get(v1)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext2);
                            }
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((PlacementScope)object0));
                            return S0.a;
                        }
                    }, 4, null), false, z1, lazyStaggeredGridMeasureContext0.t(), v36, list1, IntSizeKt.a(v71, v72), v47, v46, lazyStaggeredGridMeasureContext0.b(), lazyStaggeredGridMeasureContext0.a(), lazyStaggeredGridMeasureContext0.k(), null);
                }
            }
            return new LazyStaggeredGridMeasureResult(arr_v16, arr_v17, f, MeasureScope.-CC.p(lazyLayoutMeasureScope0, v71, v72, null, new Function1(list0, list1, list2, lazyStaggeredGridMeasureContext0) {
                final List e;
                final List f;
                final List g;
                final LazyStaggeredGridMeasureContext h;

                {
                    this.e = list0;
                    this.f = list1;
                    this.g = list2;
                    this.h = lazyStaggeredGridMeasureContext0;
                    super(1);
                }

                public final void a(@l PlacementScope placeable$PlacementScope0) {
                    L.p(placeable$PlacementScope0, "$this$layout");
                    List list0 = this.e;
                    LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0 = this.h;
                    int v = list0.size();
                    for(int v2 = 0; v2 < v; ++v2) {
                        ((LazyStaggeredGridPositionedItem)list0.get(v2)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext0);
                    }
                    List list1 = this.f;
                    LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext1 = this.h;
                    int v3 = list1.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        ((LazyStaggeredGridPositionedItem)list1.get(v4)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext1);
                    }
                    List list2 = this.g;
                    LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = this.h;
                    int v5 = list2.size();
                    for(int v1 = 0; v1 < v5; ++v1) {
                        ((LazyStaggeredGridPositionedItem)list2.get(v1)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext2);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((PlacementScope)object0));
                    return S0.a;
                }
            }, 4, null), true, z1, lazyStaggeredGridMeasureContext0.t(), v36, list1, IntSizeKt.a(v71, v72), v47, v46, lazyStaggeredGridMeasureContext0.b(), lazyStaggeredGridMeasureContext0.a(), lazyStaggeredGridMeasureContext0.k(), null);
        }
        return new LazyStaggeredGridMeasureResult(arr_v16, arr_v17, f, MeasureScope.-CC.p(lazyLayoutMeasureScope0, v71, v72, null, new Function1(list0, list1, list2, lazyStaggeredGridMeasureContext0) {
            final List e;
            final List f;
            final List g;
            final LazyStaggeredGridMeasureContext h;

            {
                this.e = list0;
                this.f = list1;
                this.g = list2;
                this.h = lazyStaggeredGridMeasureContext0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                List list0 = this.e;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0 = this.h;
                int v = list0.size();
                for(int v2 = 0; v2 < v; ++v2) {
                    ((LazyStaggeredGridPositionedItem)list0.get(v2)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext0);
                }
                List list1 = this.f;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext1 = this.h;
                int v3 = list1.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    ((LazyStaggeredGridPositionedItem)list1.get(v4)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext1);
                }
                List list2 = this.g;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = this.h;
                int v5 = list2.size();
                for(int v1 = 0; v1 < v5; ++v1) {
                    ((LazyStaggeredGridPositionedItem)list2.get(v1)).f(placeable$PlacementScope0, lazyStaggeredGridMeasureContext2);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null), true, z1, lazyStaggeredGridMeasureContext0.t(), v36, list1, IntSizeKt.a(v71, v72), v47, v46, lazyStaggeredGridMeasureContext0.b(), lazyStaggeredGridMeasureContext0.a(), lazyStaggeredGridMeasureContext0.k(), null);

        final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure.1.1 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure.1.1 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure.1.1.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure.1.1();
            }

            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure.1.1() {
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }

    }

    private static final boolean n(int[] arr_v, int[] arr_v1, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0) {
        for(int v = 0; v < arr_v.length; ++v) {
            if(arr_v1[v] < Math.max(-lazyStaggeredGridMeasureContext0.k(), 0) && arr_v[v] > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean o(int[] arr_v, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, int[] arr_v1, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(LazyStaggeredGridMeasureKt.f(lazyStaggeredGridMeasureContext0, arr_v[v1], v1) == -1 && arr_v1[v1] != arr_v1[v]) {
                return true;
            }
        }
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            if(LazyStaggeredGridMeasureKt.f(lazyStaggeredGridMeasureContext0, arr_v[v2], v2) != -1 && arr_v1[v2] >= arr_v1[v]) {
                return true;
            }
        }
        int v3 = lazyStaggeredGridMeasureContext0.h().h(0);
        return v3 != -1 && v3 != 0 && v3 != -2;
    }

    @ExperimentalFoundationApi
    @l
    public static final LazyStaggeredGridMeasureResult p(@l LazyLayoutMeasureScope lazyLayoutMeasureScope0, @l LazyStaggeredGridState lazyStaggeredGridState0, @l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, @l int[] arr_v, long v, boolean z, boolean z1, long v1, int v2, int v3, int v4, int v5, int v6) {
        int v13;
        int v11;
        L.p(lazyLayoutMeasureScope0, "$this$measureStaggeredGrid");
        L.p(lazyStaggeredGridState0, "state");
        L.p(lazyStaggeredGridItemProvider0, "itemProvider");
        L.p(arr_v, "resolvedSlotSums");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0 = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState0, lazyStaggeredGridItemProvider0, arr_v, v, z, lazyLayoutMeasureScope0, v2, v1, v5, v6, z1, v3, v4, null);
        h l0$h0 = new h();
        h l0$h1 = new h();
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                int[] arr_v1 = lazyStaggeredGridState0.D().a();
                int[] arr_v2 = lazyStaggeredGridState0.D().b();
                if(arr_v1.length != arr_v.length) {
                    lazyStaggeredGridMeasureContext0.h().j();
                    int[] arr_v3 = new int[arr_v.length];
                    for(int v9 = 0; v9 < arr_v.length; ++v9) {
                        if(v9 < arr_v1.length) {
                            int v10 = arr_v1[v9];
                            if(v10 != -1) {
                                v11 = v10;
                            }
                        }
                        else {
                            v11 = v9 == 0 ? 0 : LazyStaggeredGridMeasureKt.l(arr_v3, SpanRange.b(0, v9)) + 1;
                        }
                        arr_v3[v9] = v11;
                        lazyStaggeredGridMeasureContext0.h().l(arr_v3[v9], v9);
                    }
                    arr_v1 = arr_v3;
                }
                l0$h0.a = arr_v1;
                if(arr_v2.length != arr_v.length) {
                    int[] arr_v4 = new int[arr_v.length];
                    for(int v12 = 0; v12 < arr_v.length; ++v12) {
                        if(v12 < arr_v2.length) {
                            v13 = arr_v2[v12];
                        }
                        else {
                            v13 = v12 == 0 ? 0 : arr_v4[v12 - 1];
                        }
                        arr_v4[v12] = v13;
                    }
                    arr_v2 = arr_v4;
                }
                l0$h1.a = arr_v2;
            }
            finally {
                snapshot0.w(snapshot1);
            }
        }
        finally {
            snapshot0.d();
        }
        return LazyStaggeredGridMeasureKt.m(lazyStaggeredGridMeasureContext0, b.L0(lazyStaggeredGridState0.E()), ((int[])l0$h0.a), ((int[])l0$h1.a), true);
    }

    private static final void q(int[] arr_v, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            arr_v[v1] += v;
        }
    }

    private static final int[] r(int[] arr_v, Function1 function10) {
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v[v] = ((Number)function10.invoke(((int)arr_v[v]))).intValue();
        }
        return arr_v;
    }

    @ExperimentalFoundationApi
    private static final Object s(LazyLayoutMeasureScope lazyLayoutMeasureScope0, Function1 function10) {
        return function10.invoke(lazyLayoutMeasureScope0);
    }
}

