package androidx.collection;

import A3.a;
import A3.o;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.NoSuchElementException;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1074:1\n373#1,6:1077\n383#1,3:1084\n386#1,9:1088\n373#1,6:1097\n383#1,3:1104\n386#1,9:1108\n373#1,6:1117\n383#1,3:1124\n386#1,9:1128\n401#1,4:1137\n373#1,6:1141\n383#1,3:1148\n386#1,2:1152\n406#1,2:1154\n389#1,6:1156\n408#1:1162\n401#1,4:1163\n373#1,6:1167\n383#1,3:1174\n386#1,2:1178\n406#1,2:1180\n389#1,6:1182\n408#1:1188\n401#1,4:1189\n373#1,6:1193\n383#1,3:1200\n386#1,2:1204\n406#1,2:1206\n389#1,6:1208\n408#1:1214\n428#1,3:1215\n373#1,6:1218\n383#1,3:1225\n386#1,2:1229\n431#1,2:1231\n389#1,6:1233\n433#1:1239\n401#1,4:1240\n373#1,6:1244\n383#1,3:1251\n386#1,2:1255\n406#1,2:1257\n389#1,6:1259\n408#1:1265\n401#1,4:1266\n373#1,6:1270\n383#1,3:1277\n386#1,2:1281\n406#1,2:1283\n389#1,6:1285\n408#1:1291\n401#1,4:1292\n373#1,6:1296\n383#1,3:1303\n386#1,2:1307\n406#1,2:1309\n389#1,6:1311\n408#1:1317\n401#1,4:1318\n373#1,6:1322\n383#1,3:1329\n386#1,2:1333\n406#1,2:1335\n389#1,6:1337\n408#1:1343\n401#1,4:1344\n373#1,6:1348\n383#1,3:1355\n386#1,2:1359\n406#1,2:1361\n389#1,6:1363\n408#1:1369\n401#1,4:1370\n373#1,6:1374\n383#1,3:1381\n386#1,2:1385\n406#1,2:1387\n389#1,6:1389\n408#1:1395\n537#1,11:1412\n401#1,4:1423\n373#1,6:1427\n383#1,3:1434\n386#1,2:1438\n406#1:1440\n548#1,10:1441\n407#1:1451\n389#1,6:1452\n408#1:1458\n558#1,2:1459\n537#1,11:1461\n401#1,4:1472\n373#1,6:1476\n383#1,3:1483\n386#1,2:1487\n406#1:1489\n548#1,10:1490\n407#1:1500\n389#1,6:1501\n408#1:1507\n558#1,2:1508\n537#1,11:1510\n401#1,4:1521\n373#1,6:1525\n383#1,3:1532\n386#1,2:1536\n406#1:1538\n548#1,10:1539\n407#1:1549\n389#1,6:1550\n408#1:1556\n558#1,2:1557\n537#1,11:1559\n401#1,4:1570\n373#1,6:1574\n383#1,3:1581\n386#1,2:1585\n406#1:1587\n548#1,10:1588\n407#1:1598\n389#1,6:1599\n408#1:1605\n558#1,2:1606\n537#1,11:1608\n401#1,4:1619\n373#1,6:1623\n383#1,3:1630\n386#1,2:1634\n406#1:1636\n548#1,10:1637\n407#1:1647\n389#1,6:1648\n408#1:1654\n558#1,2:1655\n1826#2:1075\n1688#2:1076\n1826#2:1083\n1688#2:1087\n1826#2:1103\n1688#2:1107\n1826#2:1123\n1688#2:1127\n1826#2:1147\n1688#2:1151\n1826#2:1173\n1688#2:1177\n1826#2:1199\n1688#2:1203\n1826#2:1224\n1688#2:1228\n1826#2:1250\n1688#2:1254\n1826#2:1276\n1688#2:1280\n1826#2:1302\n1688#2:1306\n1826#2:1328\n1688#2:1332\n1826#2:1354\n1688#2:1358\n1826#2:1380\n1688#2:1384\n1605#2,3:1396\n1619#2:1399\n1615#2:1400\n1795#2,3:1401\n1809#2,3:1404\n1733#2:1407\n1721#2:1408\n1715#2:1409\n1728#2:1410\n1818#2:1411\n1826#2:1433\n1688#2:1437\n1826#2:1482\n1688#2:1486\n1826#2:1531\n1688#2:1535\n1826#2:1580\n1688#2:1584\n1826#2:1629\n1688#2:1633\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n*L\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n417#1:1097,6\n417#1:1104,3\n417#1:1108,9\n430#1:1117,6\n430#1:1124,3\n430#1:1128,9\n439#1:1137,4\n439#1:1141,6\n439#1:1148,3\n439#1:1152,2\n439#1:1154,2\n439#1:1156,6\n439#1:1162\n449#1:1163,4\n449#1:1167,6\n449#1:1174,3\n449#1:1178,2\n449#1:1180,2\n449#1:1182,6\n449#1:1188\n465#1:1189,4\n465#1:1193,6\n465#1:1200,3\n465#1:1204,2\n465#1:1206,2\n465#1:1208,6\n465#1:1214\n488#1:1215,3\n488#1:1218,6\n488#1:1225,3\n488#1:1229,2\n488#1:1231,2\n488#1:1233,6\n488#1:1239\n512#1:1240,4\n512#1:1244,6\n512#1:1251,3\n512#1:1255,2\n512#1:1257,2\n512#1:1259,6\n512#1:1265\n547#1:1266,4\n547#1:1270,6\n547#1:1277,3\n547#1:1281,2\n547#1:1283,2\n547#1:1285,6\n547#1:1291\n547#1:1292,4\n547#1:1296,6\n547#1:1303,3\n547#1:1307,2\n547#1:1309,2\n547#1:1311,6\n547#1:1317\n568#1:1318,4\n568#1:1322,6\n568#1:1329,3\n568#1:1333,2\n568#1:1335,2\n568#1:1337,6\n568#1:1343\n597#1:1344,4\n597#1:1348,6\n597#1:1355,3\n597#1:1359,2\n597#1:1361,2\n597#1:1363,6\n597#1:1369\n619#1:1370,4\n619#1:1374,6\n619#1:1381,3\n619#1:1385,2\n619#1:1387,2\n619#1:1389,6\n619#1:1395\n-1#1:1412,11\n-1#1:1423,4\n-1#1:1427,6\n-1#1:1434,3\n-1#1:1438,2\n-1#1:1440\n-1#1:1441,10\n-1#1:1451\n-1#1:1452,6\n-1#1:1458\n-1#1:1459,2\n-1#1:1461,11\n-1#1:1472,4\n-1#1:1476,6\n-1#1:1483,3\n-1#1:1487,2\n-1#1:1489\n-1#1:1490,10\n-1#1:1500\n-1#1:1501,6\n-1#1:1507\n-1#1:1508,2\n-1#1:1510,11\n-1#1:1521,4\n-1#1:1525,6\n-1#1:1532,3\n-1#1:1536,2\n-1#1:1538\n-1#1:1539,10\n-1#1:1549\n-1#1:1550,6\n-1#1:1556\n-1#1:1557,2\n-1#1:1559,11\n-1#1:1570,4\n-1#1:1574,6\n-1#1:1581,3\n-1#1:1585,2\n-1#1:1587\n-1#1:1588,10\n-1#1:1598\n-1#1:1599,6\n-1#1:1605\n-1#1:1606,2\n-1#1:1608,11\n-1#1:1619,4\n-1#1:1623,6\n-1#1:1630,3\n-1#1:1634,2\n-1#1:1636\n-1#1:1637,10\n-1#1:1647\n-1#1:1648,6\n-1#1:1654\n-1#1:1655,2\n378#1:1075\n385#1:1076\n404#1:1083\n404#1:1087\n417#1:1103\n417#1:1107\n430#1:1123\n430#1:1127\n439#1:1147\n439#1:1151\n449#1:1173\n449#1:1177\n465#1:1199\n465#1:1203\n488#1:1224\n488#1:1228\n512#1:1250\n512#1:1254\n547#1:1276\n547#1:1280\n547#1:1302\n547#1:1306\n568#1:1328\n568#1:1332\n597#1:1354\n597#1:1358\n619#1:1380\n619#1:1384\n638#1:1396,3\n639#1:1399\n642#1:1400\n646#1:1401,3\n647#1:1404,3\n648#1:1407\n649#1:1408\n649#1:1409\n653#1:1410\n656#1:1411\n-1#1:1433\n-1#1:1437\n-1#1:1482\n-1#1:1486\n-1#1:1531\n-1#1:1535\n-1#1:1580\n-1#1:1584\n-1#1:1629\n-1#1:1633\n*E\n"})
public abstract class ObjectLongMap {
    @l
    @f
    public long[] a;
    @l
    @f
    public Object[] b;
    @l
    @f
    public long[] c;
    @f
    public int d;
    @f
    public int e;

    private ObjectLongMap() {
        this.a = ScatterMapKt.e;
        this.b = ContainerHelpersKt.c;
        this.c = LongSetKt.b();
    }

    public ObjectLongMap(w w0) {
    }

    @l
    @j
    public final String A(@l o o0) {
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        long v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(object0, v7)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_32:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_38;
            }
        }
        stringBuilder0.append("");
    label_38:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String B(@l CharSequence charSequence0) {
        L.p(charSequence0, "separator");
        return ObjectLongMap.L(this, charSequence0, null, null, 0, null, 30, null);
    }

    @l
    @j
    public final String C(@l CharSequence charSequence0, @l o o0) {
        L.p(charSequence0, "separator");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_33;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        long v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_39;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(object0, v7)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_33:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_39;
            }
        }
        stringBuilder0.append("");
    label_39:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String D(@l CharSequence charSequence0, @l CharSequence charSequence1) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        return ObjectLongMap.L(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @l
    @j
    public final String E(@l CharSequence charSequence0, @l CharSequence charSequence1, @l o o0) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_34;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        long v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_40;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(object0, v7)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_34:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_40;
            }
        }
        stringBuilder0.append("");
    label_40:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String F(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ObjectLongMap.L(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @l
    @j
    public final String G(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ObjectLongMap.L(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @l
    @j
    public final String H(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l o o0) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        Object object0 = arr_object[v7];
                        long v8 = arr_v[v7];
                        if(v3 == v) {
                            stringBuilder0.append("...");
                            goto label_41;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(object0, v8)));
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v6;
                }
                if(v5 == 8) {
                label_35:
                    if(v2 != v1) {
                        ++v2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_41;
            }
        }
        stringBuilder0.append(charSequence2);
    label_41:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String I(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3) {
        Object[] arr_object2;
        Object[] arr_object1;
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_object2 = arr_object;
                    goto label_43;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        Object object0 = arr_object[v7];
                        arr_object1 = arr_object;
                        long v8 = arr_v[v7];
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_50;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(object0);
                        stringBuilder0.append('=');
                        stringBuilder0.append(v8);
                        ++v3;
                    }
                    else {
                        arr_object1 = arr_object;
                    }
                    v4 >>= 8;
                    ++v6;
                    arr_object = arr_object1;
                }
                arr_object2 = arr_object;
                if(v5 == 8) {
                label_43:
                    if(v2 != v1) {
                        ++v2;
                        arr_object = arr_object2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_50;
            }
        }
        stringBuilder0.append(charSequence2);
    label_50:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String J(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @l o o0) {
        Object[] arr_object2;
        Object[] arr_object1;
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_object2 = arr_object;
                    goto label_43;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        Object object0 = arr_object[v8];
                        long v9 = arr_v[v8];
                        arr_object1 = arr_object;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_50;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(object0, v9)));
                        ++v3;
                    }
                    else {
                        arr_object1 = arr_object;
                    }
                    v4 >>= 8;
                    ++v7;
                    arr_object = arr_object1;
                }
                arr_object2 = arr_object;
                if(v6 == 8) {
                label_43:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        arr_object = arr_object2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_50;
            }
        }
        stringBuilder0.append(charSequence2);
    label_50:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    @j
    public final String K(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, @l o o0) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        long v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_41;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(object0, v7)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_35:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_41;
            }
        }
        stringBuilder0.append(charSequence2);
    label_41:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String L(ObjectLongMap objectLongMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
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
        return objectLongMap0.I(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3);
    }

    public static String M(ObjectLongMap objectLongMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, o o0, int v1, Object object0) {
        long[] arr_v3;
        long[] arr_v2;
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence charSequence4 = (v1 & 1) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence5 = charSequence2;
        }
        CharSequence charSequence7 = (v1 & 16) == 0 ? charSequence3 : "...";
        L.p(charSequence4, "separator");
        L.p(charSequence6, "prefix");
        L.p(charSequence5, "postfix");
        L.p(charSequence7, "truncated");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence6);
        Object[] arr_object = objectLongMap0.b;
        long[] arr_v = objectLongMap0.c;
        long[] arr_v1 = objectLongMap0.a;
        int v2 = arr_v1.length - 2;
        if(v2 >= 0) {
            int v3 = 0;
            int v4 = 0;
            while(true) {
                long v5 = arr_v1[v3];
                int v6 = v3;
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v3 = arr_v1;
                    goto label_59;
                }
                int v7 = 8 - (~(v6 - v2) >>> 0x1F);
                int v8 = 0;
                while(v8 < v7) {
                    if((v5 & 0xFFL) < 0x80L) {
                        int v9 = (v6 << 3) + v8;
                        Object object1 = arr_object[v9];
                        long v10 = arr_v[v9];
                        if(v4 == ((v1 & 8) == 0 ? v : -1)) {
                            stringBuilder0.append(charSequence7);
                            goto label_66;
                        }
                        if(v4 != 0) {
                            stringBuilder0.append(charSequence4);
                        }
                        arr_v2 = arr_v1;
                        stringBuilder0.append(((CharSequence)o0.invoke(object1, v10)));
                        ++v4;
                    }
                    else {
                        arr_v2 = arr_v1;
                    }
                    v5 >>= 8;
                    ++v8;
                    arr_v1 = arr_v2;
                }
                arr_v3 = arr_v1;
                if(v7 == 8) {
                label_59:
                    if(v6 != v2) {
                        v3 = v6 + 1;
                        arr_v1 = arr_v3;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence5);
                }
                goto label_66;
            }
        }
        stringBuilder0.append(charSequence5);
    label_66:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final boolean N() {
        return this.e == 0;
    }

    public final boolean a(@l o o0) {
        L.p(o0, "predicate");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(!((Boolean)o0.invoke(arr_object[v5], ((long)arr_v[v5]))).booleanValue()) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final boolean b() {
        return this.e != 0;
    }

    public final boolean c(@l o o0) {
        L.p(o0, "predicate");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)o0.invoke(arr_object[v5], ((long)arr_v[v5]))).booleanValue()) {
                                return true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    public final boolean d(Object object0) {
        return this.i(object0) >= 0;
    }

    public final boolean e(Object object0) {
        return this.i(object0) >= 0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ObjectLongMap)) {
            return false;
        }
        if(((ObjectLongMap)object0).t() != this.t()) {
            return false;
        }
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(arr_v[v5] != ((ObjectLongMap)object0).n(arr_object[v5])) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_25;
                    }
                    break;
                }
            label_25:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final boolean f(long v) {
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L && v == arr_v[(v2 << 3) + v5]) {
                            return true;
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        return false;
    }

    public final int g() {
        return this.t();
    }

    public final int h(@l o o0) {
        L.p(o0, "predicate");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            if(((Boolean)o0.invoke(arr_object[v6], ((long)arr_v[v6]))).booleanValue()) {
                                ++v2;
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            Object object0 = arr_object[v6];
                            long v7 = arr_v[v6];
                            v2 += (object0 == null ? 0 : object0.hashCode()) ^ ((int)(v7 ^ v7 >>> 0x20));
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    @b0
    public final int i(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.d;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.a[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(L.g(this.b[v10], object0)) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    public final void j(@l o o0) {
        L.p(o0, "block");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            o0.invoke(arr_object[v5], ((long)arr_v[v5]));
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @b0
    public final void k(@l Function1 function10) {
        L.p(function10, "block");
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(((int)((v1 << 3) + v4)));
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    public final void l(@l Function1 function10) {
        L.p(function10, "block");
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void m(@l Function1 function10) {
        L.p(function10, "block");
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(((long)arr_v[(v1 << 3) + v4]));
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final long n(Object object0) {
        int v = this.i(object0);
        if(v < 0) {
            throw new NoSuchElementException("There is no key " + object0 + " in the map");
        }
        return this.c[v];
    }

    public final int o() {
        return this.d;
    }

    @b0
    public static void p() {
    }

    @b0
    public static void q() {
    }

    public final long r(Object object0, long v) {
        int v1 = this.i(object0);
        return v1 < 0 ? v : this.c[v1];
    }

    public final long s(Object object0, @l a a0) {
        L.p(a0, "defaultValue");
        int v = this.i(object0);
        return v < 0 ? ((Number)a0.invoke()).longValue() : this.c[v];
    }

    public final int t() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        int v9;
        int v7;
        if(this.x()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('{');
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; v1 = v9 + 1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    int v5 = 0;
                    while(v5 < v4) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            String s = arr_object[v6];
                            v7 = v1;
                            long v8 = arr_v[v6];
                            if(s == this) {
                                s = "(this)";
                            }
                            stringBuilder0.append(s);
                            stringBuilder0.append("=");
                            stringBuilder0.append(v8);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(',');
                                stringBuilder0.append(' ');
                            }
                        }
                        else {
                            v7 = v1;
                        }
                        v3 >>= 8;
                        ++v5;
                        v1 = v7;
                    }
                    if(v4 != 8) {
                        break;
                    }
                }
                v9 = v1;
                if(v9 == v) {
                    break;
                }
            }
        }
        stringBuilder0.append('}');
        String s1 = stringBuilder0.toString();
        L.o(s1, "s.append(\'}\').toString()");
        return s1;
    }

    @b0
    public static void u() {
    }

    public static void v() {
    }

    public static void w() {
    }

    public final boolean x() {
        return this.e == 0;
    }

    public final boolean y() {
        return this.e != 0;
    }

    @l
    @j
    public final String z() {
        return ObjectLongMap.L(this, null, null, null, 0, null, 0x1F, null);
    }
}

