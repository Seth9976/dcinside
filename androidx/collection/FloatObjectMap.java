package androidx.collection;

import A3.a;
import A3.o;
import androidx.collection.internal.ContainerHelpersKt;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 2 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1034:1\n619#1:1035\n620#1:1039\n622#1,2:1041\n624#1,4:1044\n628#1:1051\n629#1:1055\n630#1:1057\n631#1,4:1060\n637#1:1065\n638#1,8:1067\n619#1:1075\n620#1:1079\n622#1,2:1081\n624#1,4:1084\n628#1:1091\n629#1:1095\n630#1:1097\n631#1,4:1100\n637#1:1105\n638#1,8:1107\n354#1,6:1117\n364#1,3:1124\n367#1,9:1128\n354#1,6:1137\n364#1,3:1144\n367#1,9:1148\n354#1,6:1157\n364#1,3:1164\n367#1,9:1168\n382#1,4:1177\n354#1,6:1181\n364#1,3:1188\n367#1,2:1192\n387#1,2:1194\n370#1,6:1196\n389#1:1202\n382#1,4:1203\n354#1,6:1207\n364#1,3:1214\n367#1,2:1218\n387#1,2:1220\n370#1,6:1222\n389#1:1228\n382#1,4:1229\n354#1,6:1233\n364#1,3:1240\n367#1,2:1244\n387#1,2:1246\n370#1,6:1248\n389#1:1254\n619#1:1255\n620#1:1259\n622#1,2:1261\n624#1,4:1264\n628#1:1271\n629#1:1275\n630#1:1277\n631#1,4:1280\n637#1:1285\n638#1,8:1287\n619#1:1295\n620#1:1299\n622#1,2:1301\n624#1,4:1304\n628#1:1311\n629#1:1315\n630#1:1317\n631#1,4:1320\n637#1:1325\n638#1,8:1327\n408#1,3:1335\n354#1,6:1338\n364#1,3:1345\n367#1,2:1349\n412#1,2:1351\n370#1,6:1353\n414#1:1359\n382#1,4:1360\n354#1,6:1364\n364#1,3:1371\n367#1,2:1375\n387#1,2:1377\n370#1,6:1379\n389#1:1385\n382#1,4:1386\n354#1,6:1390\n364#1,3:1397\n367#1,2:1401\n387#1,2:1403\n370#1,6:1405\n389#1:1411\n382#1,4:1412\n354#1,6:1416\n364#1,3:1423\n367#1,2:1427\n387#1,2:1429\n370#1,6:1431\n389#1:1437\n382#1,4:1438\n354#1,6:1442\n364#1,3:1449\n367#1,2:1453\n387#1,2:1455\n370#1,6:1457\n389#1:1463\n382#1,4:1464\n354#1,6:1468\n364#1,3:1475\n367#1,2:1479\n387#1,2:1481\n370#1,6:1483\n389#1:1489\n382#1,4:1490\n354#1,6:1494\n364#1,3:1501\n367#1,2:1505\n387#1,2:1507\n370#1,6:1509\n389#1:1515\n518#1,11:1532\n382#1,4:1543\n354#1,6:1547\n364#1,3:1554\n367#1,2:1558\n387#1:1560\n529#1,10:1561\n388#1:1571\n370#1,6:1572\n389#1:1578\n539#1,2:1579\n518#1,11:1581\n382#1,4:1592\n354#1,6:1596\n364#1,3:1603\n367#1,2:1607\n387#1:1609\n529#1,10:1610\n388#1:1620\n370#1,6:1621\n389#1:1627\n539#1,2:1628\n518#1,11:1630\n382#1,4:1641\n354#1,6:1645\n364#1,3:1652\n367#1,2:1656\n387#1:1658\n529#1,10:1659\n388#1:1669\n370#1,6:1670\n389#1:1676\n539#1,2:1677\n518#1,11:1679\n382#1,4:1690\n354#1,6:1694\n364#1,3:1701\n367#1,2:1705\n387#1:1707\n529#1,10:1708\n388#1:1718\n370#1,6:1719\n389#1:1725\n539#1,2:1726\n518#1,11:1728\n382#1,4:1739\n354#1,6:1743\n364#1,3:1750\n367#1,2:1754\n387#1:1756\n529#1,10:1757\n388#1:1767\n370#1,6:1768\n389#1:1774\n539#1,2:1775\n849#2,3:1036\n849#2,3:1076\n849#2,3:1256\n849#2,3:1296\n849#2,3:1516\n1619#3:1040\n1615#3:1043\n1795#3,3:1048\n1809#3,3:1052\n1733#3:1056\n1721#3:1058\n1715#3:1059\n1728#3:1064\n1818#3:1066\n1619#3:1080\n1615#3:1083\n1795#3,3:1088\n1809#3,3:1092\n1733#3:1096\n1721#3:1098\n1715#3:1099\n1728#3:1104\n1818#3:1106\n1826#3:1115\n1688#3:1116\n1826#3:1123\n1688#3:1127\n1826#3:1143\n1688#3:1147\n1826#3:1163\n1688#3:1167\n1826#3:1187\n1688#3:1191\n1826#3:1213\n1688#3:1217\n1826#3:1239\n1688#3:1243\n1619#3:1260\n1615#3:1263\n1795#3,3:1268\n1809#3,3:1272\n1733#3:1276\n1721#3:1278\n1715#3:1279\n1728#3:1284\n1818#3:1286\n1619#3:1300\n1615#3:1303\n1795#3,3:1308\n1809#3,3:1312\n1733#3:1316\n1721#3:1318\n1715#3:1319\n1728#3:1324\n1818#3:1326\n1826#3:1344\n1688#3:1348\n1826#3:1370\n1688#3:1374\n1826#3:1396\n1688#3:1400\n1826#3:1422\n1688#3:1426\n1826#3:1448\n1688#3:1452\n1826#3:1474\n1688#3:1478\n1826#3:1500\n1688#3:1504\n1619#3:1519\n1615#3:1520\n1795#3,3:1521\n1809#3,3:1524\n1733#3:1527\n1721#3:1528\n1715#3:1529\n1728#3:1530\n1818#3:1531\n1826#3:1553\n1688#3:1557\n1826#3:1602\n1688#3:1606\n1826#3:1651\n1688#3:1655\n1826#3:1700\n1688#3:1704\n1826#3:1749\n1688#3:1753\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n*L\n321#1:1035\n321#1:1039\n321#1:1041,2\n321#1:1044,4\n321#1:1051\n321#1:1055\n321#1:1057\n321#1:1060,4\n321#1:1065\n321#1:1067,8\n331#1:1075\n331#1:1079\n331#1:1081,2\n331#1:1084,4\n331#1:1091\n331#1:1095\n331#1:1097\n331#1:1100,4\n331#1:1105\n331#1:1107,8\n385#1:1117,6\n385#1:1124,3\n385#1:1128,9\n398#1:1137,6\n398#1:1144,3\n398#1:1148,9\n410#1:1157,6\n410#1:1164,3\n410#1:1168,9\n420#1:1177,4\n420#1:1181,6\n420#1:1188,3\n420#1:1192,2\n420#1:1194,2\n420#1:1196,6\n420#1:1202\n430#1:1203,4\n430#1:1207,6\n430#1:1214,3\n430#1:1218,2\n430#1:1220,2\n430#1:1222,6\n430#1:1228\n446#1:1229,4\n446#1:1233,6\n446#1:1240,3\n446#1:1244,2\n446#1:1246,2\n446#1:1248,6\n446#1:1254\n456#1:1255\n456#1:1259\n456#1:1261,2\n456#1:1264,4\n456#1:1271\n456#1:1275\n456#1:1277\n456#1:1280,4\n456#1:1285\n456#1:1287,8\n462#1:1295\n462#1:1299\n462#1:1301,2\n462#1:1304,4\n462#1:1311\n462#1:1315\n462#1:1317\n462#1:1320,4\n462#1:1325\n462#1:1327,8\n469#1:1335,3\n469#1:1338,6\n469#1:1345,3\n469#1:1349,2\n469#1:1351,2\n469#1:1353,6\n469#1:1359\n493#1:1360,4\n493#1:1364,6\n493#1:1371,3\n493#1:1375,2\n493#1:1377,2\n493#1:1379,6\n493#1:1385\n528#1:1386,4\n528#1:1390,6\n528#1:1397,3\n528#1:1401,2\n528#1:1403,2\n528#1:1405,6\n528#1:1411\n528#1:1412,4\n528#1:1416,6\n528#1:1423,3\n528#1:1427,2\n528#1:1429,2\n528#1:1431,6\n528#1:1437\n549#1:1438,4\n549#1:1442,6\n549#1:1449,3\n549#1:1453,2\n549#1:1455,2\n549#1:1457,6\n549#1:1463\n575#1:1464,4\n575#1:1468,6\n575#1:1475,3\n575#1:1479,2\n575#1:1481,2\n575#1:1483,6\n575#1:1489\n601#1:1490,4\n601#1:1494,6\n601#1:1501,3\n601#1:1505,2\n601#1:1507,2\n601#1:1509,6\n601#1:1515\n-1#1:1532,11\n-1#1:1543,4\n-1#1:1547,6\n-1#1:1554,3\n-1#1:1558,2\n-1#1:1560\n-1#1:1561,10\n-1#1:1571\n-1#1:1572,6\n-1#1:1578\n-1#1:1579,2\n-1#1:1581,11\n-1#1:1592,4\n-1#1:1596,6\n-1#1:1603,3\n-1#1:1607,2\n-1#1:1609\n-1#1:1610,10\n-1#1:1620\n-1#1:1621,6\n-1#1:1627\n-1#1:1628,2\n-1#1:1630,11\n-1#1:1641,4\n-1#1:1645,6\n-1#1:1652,3\n-1#1:1656,2\n-1#1:1658\n-1#1:1659,10\n-1#1:1669\n-1#1:1670,6\n-1#1:1676\n-1#1:1677,2\n-1#1:1679,11\n-1#1:1690,4\n-1#1:1694,6\n-1#1:1701,3\n-1#1:1705,2\n-1#1:1707\n-1#1:1708,10\n-1#1:1718\n-1#1:1719,6\n-1#1:1725\n-1#1:1726,2\n-1#1:1728,11\n-1#1:1739,4\n-1#1:1743,6\n-1#1:1750,3\n-1#1:1754,2\n-1#1:1756\n-1#1:1757,10\n-1#1:1767\n-1#1:1768,6\n-1#1:1774\n-1#1:1775,2\n321#1:1036,3\n331#1:1076,3\n456#1:1256,3\n462#1:1296,3\n619#1:1516,3\n321#1:1040\n321#1:1043\n321#1:1048,3\n321#1:1052,3\n321#1:1056\n321#1:1058\n321#1:1059\n321#1:1064\n321#1:1066\n331#1:1080\n331#1:1083\n331#1:1088,3\n331#1:1092,3\n331#1:1096\n331#1:1098\n331#1:1099\n331#1:1104\n331#1:1106\n359#1:1115\n366#1:1116\n385#1:1123\n385#1:1127\n398#1:1143\n398#1:1147\n410#1:1163\n410#1:1167\n420#1:1187\n420#1:1191\n430#1:1213\n430#1:1217\n446#1:1239\n446#1:1243\n456#1:1260\n456#1:1263\n456#1:1268,3\n456#1:1272,3\n456#1:1276\n456#1:1278\n456#1:1279\n456#1:1284\n456#1:1286\n462#1:1300\n462#1:1303\n462#1:1308,3\n462#1:1312,3\n462#1:1316\n462#1:1318\n462#1:1319\n462#1:1324\n462#1:1326\n469#1:1344\n469#1:1348\n493#1:1370\n493#1:1374\n528#1:1396\n528#1:1400\n528#1:1422\n528#1:1426\n549#1:1448\n549#1:1452\n575#1:1474\n575#1:1478\n601#1:1500\n601#1:1504\n620#1:1519\n623#1:1520\n627#1:1521,3\n628#1:1524,3\n629#1:1527\n630#1:1528\n630#1:1529\n634#1:1530\n637#1:1531\n-1#1:1553\n-1#1:1557\n-1#1:1602\n-1#1:1606\n-1#1:1651\n-1#1:1655\n-1#1:1700\n-1#1:1704\n-1#1:1749\n-1#1:1753\n*E\n"})
public abstract class FloatObjectMap {
    @l
    @f
    public long[] a;
    @l
    @f
    public float[] b;
    @l
    @f
    public Object[] c;
    @f
    public int d;
    @f
    public int e;

    private FloatObjectMap() {
        this.a = ScatterMapKt.e;
        this.b = FloatSetKt.g();
        this.c = ContainerHelpersKt.c;
    }

    public FloatObjectMap(w w0) {
    }

    @l
    @j
    public final String A(@l o o0) {
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        float f = arr_f[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object0)));
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
        return FloatObjectMap.L(this, charSequence0, null, null, 0, null, 30, null);
    }

    @l
    @j
    public final String C(@l CharSequence charSequence0, @l o o0) {
        L.p(charSequence0, "separator");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_33;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        float f = arr_f[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_39;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object0)));
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
        return FloatObjectMap.L(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @l
    @j
    public final String E(@l CharSequence charSequence0, @l CharSequence charSequence1, @l o o0) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_34;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        float f = arr_f[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_40;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object0)));
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
        return FloatObjectMap.L(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @l
    @j
    public final String G(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return FloatObjectMap.L(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
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
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        float f = arr_f[v7];
                        Object object0 = arr_object[v7];
                        if(v3 == v) {
                            stringBuilder0.append("...");
                            goto label_41;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object0)));
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
        float[] arr_f2;
        float[] arr_f1;
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_f2 = arr_f;
                    goto label_43;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        float f = arr_f[v7];
                        Object object0 = arr_object[v7];
                        arr_f1 = arr_f;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_50;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(f);
                        stringBuilder0.append('=');
                        stringBuilder0.append(object0);
                        ++v3;
                    }
                    else {
                        arr_f1 = arr_f;
                    }
                    v4 >>= 8;
                    ++v6;
                    arr_f = arr_f1;
                }
                arr_f2 = arr_f;
                if(v5 == 8) {
                label_43:
                    if(v2 != v1) {
                        ++v2;
                        arr_f = arr_f2;
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
        float[] arr_f2;
        float[] arr_f1;
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        L.p(o0, "transform");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_f2 = arr_f;
                    goto label_43;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        float f = arr_f[v8];
                        Object object0 = arr_object[v8];
                        arr_f1 = arr_f;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_50;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object0)));
                        ++v3;
                    }
                    else {
                        arr_f1 = arr_f;
                    }
                    v4 >>= 8;
                    ++v7;
                    arr_f = arr_f1;
                }
                arr_f2 = arr_f;
                if(v6 == 8) {
                label_43:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        arr_f = arr_f2;
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
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        float f = arr_f[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_41;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object0)));
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

    public static String L(FloatObjectMap floatObjectMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return floatObjectMap0.I(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3);
    }

    public static String M(FloatObjectMap floatObjectMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, o o0, int v1, Object object0) {
        long[] arr_v2;
        long[] arr_v1;
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
        float[] arr_f = floatObjectMap0.b;
        Object[] arr_object = floatObjectMap0.c;
        long[] arr_v = floatObjectMap0.a;
        int v2 = arr_v.length - 2;
        if(v2 >= 0) {
            int v3 = 0;
            int v4 = 0;
            while(true) {
                long v5 = arr_v[v3];
                int v6 = v3;
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v2 = arr_v;
                    goto label_59;
                }
                int v7 = 8 - (~(v6 - v2) >>> 0x1F);
                int v8 = 0;
                while(v8 < v7) {
                    if((v5 & 0xFFL) < 0x80L) {
                        int v9 = (v6 << 3) + v8;
                        float f = arr_f[v9];
                        Object object1 = arr_object[v9];
                        if(v4 == ((v1 & 8) == 0 ? v : -1)) {
                            stringBuilder0.append(charSequence7);
                            goto label_66;
                        }
                        if(v4 != 0) {
                            stringBuilder0.append(charSequence4);
                        }
                        arr_v1 = arr_v;
                        stringBuilder0.append(((CharSequence)o0.invoke(f, object1)));
                        ++v4;
                    }
                    else {
                        arr_v1 = arr_v;
                    }
                    v5 >>= 8;
                    ++v8;
                    arr_v = arr_v1;
                }
                arr_v2 = arr_v;
                if(v7 == 8) {
                label_59:
                    if(v6 != v2) {
                        v3 = v6 + 1;
                        arr_v = arr_v2;
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
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
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
                            int v5 = (v1 << 3) + v4;
                            if(!((Boolean)o0.invoke(((float)arr_f[v5]), arr_object[v5])).booleanValue()) {
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
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
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
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)o0.invoke(((float)arr_f[v5]), arr_object[v5])).booleanValue()) {
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

    public final boolean d(float f) {
        int v = Float.floatToIntBits(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == f) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean e(float f) {
        int v = Float.floatToIntBits(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == f) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof FloatObjectMap)) {
            return false;
        }
        if(((FloatObjectMap)object0).t() != this.t()) {
            return false;
        }
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
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
                            int v5 = (v1 << 3) + v4;
                            float f = arr_f[v5];
                            Object object1 = arr_object[v5];
                            if(object1 == null) {
                                if(((FloatObjectMap)object0).n(f) != null || !((FloatObjectMap)object0).e(f)) {
                                    return false;
                                }
                            }
                            else if(!L.g(object1, ((FloatObjectMap)object0).n(f))) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_30;
                    }
                    break;
                }
            label_30:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final boolean f(Object object0) {
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && L.g(object0, arr_object[(v1 << 3) + v4])) {
                            return true;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    public final int g() {
        return this.t();
    }

    public final int h(@l o o0) {
        L.p(o0, "predicate");
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            if(((Boolean)o0.invoke(((float)arr_f[v6]), arr_object[v6])).booleanValue()) {
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
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            float f = arr_f[v6];
                            Object object0 = arr_object[v6];
                            v2 += (object0 == null ? 0 : object0.hashCode()) ^ Float.floatToIntBits(f);
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

    public final int i(float f) {
        int v = Float.floatToIntBits(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == f) {
                    return v9;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void j(@l o o0) {
        L.p(o0, "block");
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
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
                            int v5 = (v1 << 3) + v4;
                            o0.invoke(((float)arr_f[v5]), arr_object[v5]);
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
        float[] arr_f = this.b;
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
                            function10.invoke(((float)arr_f[(v1 << 3) + v4]));
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
        Object[] arr_object = this.c;
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

    @m
    public final Object n(float f) {
        int v = Float.floatToIntBits(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == f) {
                    return v9 < 0 ? null : this.c[v9];
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
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

    public final Object r(float f, Object object0) {
        int v = Float.floatToIntBits(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == f) {
                    return v9 < 0 ? object0 : this.c[v9];
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final Object s(float f, @l a a0) {
        L.p(a0, "defaultValue");
        Object object0 = this.n(f);
        return object0 == null ? a0.invoke() : object0;
    }

    public final int t() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        if(this.x()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('{');
        float[] arr_f = this.b;
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            float f = arr_f[v6];
                            String s = arr_object[v6];
                            stringBuilder0.append(f);
                            stringBuilder0.append("=");
                            if(s == this) {
                                s = "(this)";
                            }
                            stringBuilder0.append(s);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(',');
                                stringBuilder0.append(' ');
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_33;
                    }
                    break;
                }
            label_33:
                if(v1 == v) {
                    break;
                }
                ++v1;
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
        return FloatObjectMap.L(this, null, null, null, 0, null, 0x1F, null);
    }
}

