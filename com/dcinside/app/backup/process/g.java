package com.dcinside.app.backup.process;

import V.a;
import V.c;
import V.d;
import V.h;
import V.j;
import V.k;
import V.n;
import V.p;
import V.q;
import V.s;
import V.t;
import V.w;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Downloads;
import android.util.Base64InputStream;
import android.util.Base64OutputStream;
import androidx.annotation.RequiresApi;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints.Builder;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.dcinside.app.Application;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.d0;
import com.dcinside.app.realm.e;
import com.dcinside.app.realm.f;
import com.dcinside.app.realm.g0;
import com.dcinside.app.realm.h0;
import com.dcinside.app.realm.m;
import com.dcinside.app.realm.o;
import com.dcinside.app.realm.r;
import com.dcinside.app.realm.y0;
import com.dcinside.app.realm.y;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.T0;
import io.realm.W;
import io.realm.X0;
import io.realm.g1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.V;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nBackups.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Backups.kt\ncom/dcinside/app/backup/process/Backups\n+ 2 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequestKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1038:1\n368#2:1039\n1863#3,2:1040\n1557#3:1071\n1628#3,3:1072\n1611#3,9:1088\n1863#3:1097\n1864#3:1099\n1620#3:1100\n1611#3,9:1101\n1863#3:1110\n1864#3:1112\n1620#3:1113\n1611#3,9:1130\n1863#3:1139\n1864#3:1141\n1620#3:1142\n1611#3,9:1143\n1863#3:1152\n1864#3:1154\n1620#3:1155\n1557#3:1196\n1628#3,3:1197\n1611#3,9:1213\n1863#3:1222\n1864#3:1224\n1620#3:1225\n1611#3,9:1226\n1863#3:1235\n1864#3:1237\n1620#3:1238\n1611#3,9:1255\n1863#3:1264\n1864#3:1266\n1620#3:1267\n1611#3,9:1268\n1863#3:1277\n1864#3:1279\n1620#3:1280\n1557#3:1304\n1628#3,3:1305\n1557#3:1315\n1628#3,3:1316\n1557#3:1328\n1628#3,3:1329\n1557#3:1339\n1628#3,3:1340\n1557#3:1356\n1628#3,3:1357\n1557#3:1362\n1628#3,3:1363\n1557#3:1374\n1628#3,3:1375\n1557#3:1380\n1628#3,3:1381\n1557#3:1394\n1628#3,3:1395\n1557#3:1400\n1628#3,3:1401\n1557#3:1412\n1628#3,3:1413\n1557#3:1418\n1628#3,3:1419\n1557#3:1435\n1628#3,3:1436\n1557#3:1446\n1628#3,3:1447\n1557#3:1459\n1628#3,3:1460\n1557#3:1470\n1628#3,3:1471\n1557#3:1522\n1628#3,3:1523\n774#3:1527\n865#3,2:1528\n1557#3:1537\n1628#3,3:1538\n774#3:1541\n865#3,2:1542\n1557#3:1553\n1628#3,3:1554\n774#3:1557\n865#3,2:1558\n1557#3:1567\n1628#3,3:1568\n774#3:1571\n865#3,2:1572\n1557#3:1587\n1628#3,3:1588\n1557#3:1598\n1628#3,3:1599\n1557#3:1611\n1628#3,3:1612\n1557#3:1622\n1628#3,3:1623\n1557#3:1638\n1628#3,3:1639\n1557#3:1649\n1628#3,3:1650\n1557#3:1662\n1628#3,3:1663\n1557#3:1673\n1628#3,3:1674\n1557#3:1691\n1628#3,3:1692\n1557#3:1704\n1628#3,3:1705\n1557#3:1719\n1628#3,3:1720\n1557#3:1732\n1628#3,3:1733\n739#3,9:1760\n774#3:1769\n865#3,2:1770\n1557#3:1772\n1628#3,2:1773\n739#3,9:1775\n1630#3:1784\n774#3:1785\n865#3,2:1786\n1863#3,2:1788\n1611#3,9:1791\n1863#3:1800\n1864#3:1802\n1620#3:1803\n1611#3,9:1805\n1863#3:1814\n1864#3:1816\n1620#3:1817\n1611#3,9:1819\n1863#3:1828\n1864#3:1830\n1620#3:1831\n1611#3,9:1833\n1863#3:1842\n1864#3:1844\n1620#3:1845\n1611#3,9:1847\n1863#3:1856\n1864#3:1858\n1620#3:1859\n1611#3,9:1861\n1863#3:1870\n1864#3:1872\n1620#3:1873\n1611#3,9:1875\n1863#3:1884\n1864#3:1886\n1620#3:1887\n1611#3,9:1889\n1863#3:1898\n1864#3:1900\n1620#3:1901\n1611#3,9:1903\n1863#3:1912\n1864#3:1914\n1620#3:1915\n1611#3,9:1917\n1863#3:1926\n1864#3:1928\n1620#3:1929\n1611#3,9:1931\n1863#3:1940\n1864#3:1942\n1620#3:1943\n1611#3,9:1945\n1863#3:1954\n1864#3:1956\n1620#3:1957\n1557#3:1974\n1628#3,3:1975\n120#4,3:1042\n129#4,3:1046\n132#4,7:1053\n139#4,5:1063\n129#4,3:1068\n132#4,12:1075\n129#4,15:1114\n129#4,15:1156\n124#4:1171\n129#4,3:1172\n132#4,7:1178\n139#4,5:1188\n129#4,3:1193\n132#4,12:1200\n129#4,15:1239\n129#4,15:1281\n112#4,3:1296\n129#4,3:1300\n132#4,7:1308\n139#4,5:1319\n116#4:1324\n129#4,3:1325\n132#4,7:1332\n139#4,5:1343\n112#4,3:1348\n129#4,3:1352\n132#4,7:1366\n139#4,5:1384\n116#4:1389\n129#4,3:1390\n132#4,7:1404\n139#4,5:1422\n112#4,3:1427\n129#4,3:1431\n132#4,7:1439\n139#4,5:1450\n116#4:1455\n129#4,3:1456\n132#4,7:1463\n139#4,5:1474\n112#4,3:1479\n129#4,3:1483\n132#4,12:1487\n116#4:1499\n129#4,15:1500\n112#4,3:1515\n129#4,3:1519\n132#4,7:1530\n139#4,5:1544\n116#4:1549\n129#4,3:1550\n132#4,7:1560\n139#4,5:1574\n112#4,3:1579\n129#4,3:1583\n132#4,7:1591\n139#4,5:1602\n116#4:1607\n129#4,3:1608\n132#4,7:1615\n139#4,5:1626\n112#4,3:1631\n129#4,3:1635\n132#4,7:1642\n139#4,5:1653\n116#4:1658\n129#4,3:1659\n132#4,7:1666\n139#4,5:1677\n112#4,3:1682\n129#4,3:1686\n132#4,7:1695\n139#4,5:1708\n116#4:1713\n129#4,3:1714\n132#4,7:1723\n139#4,5:1736\n177#4,9:1741\n177#4,9:1750\n1#5:1045\n1#5:1098\n1#5:1111\n1#5:1140\n1#5:1153\n1#5:1223\n1#5:1236\n1#5:1265\n1#5:1278\n1#5:1299\n1#5:1351\n1#5:1430\n1#5:1482\n1#5:1518\n1#5:1582\n1#5:1634\n1#5:1685\n1#5:1759\n1#5:1801\n1#5:1815\n1#5:1829\n1#5:1843\n1#5:1857\n1#5:1871\n1#5:1885\n1#5:1899\n1#5:1913\n1#5:1927\n1#5:1941\n1#5:1955\n37#6:1049\n37#6:1050\n37#6:1051\n37#6:1052\n37#6:1060\n37#6:1061\n37#6:1062\n37#6:1087\n37#6:1129\n37#6:1175\n37#6:1176\n37#6:1177\n37#6:1185\n37#6:1186\n37#6:1187\n37#6:1212\n37#6:1254\n37#6:1303\n37#6:1355\n37#6:1360\n37#6:1361\n37#6:1373\n37#6:1378\n37#6:1379\n37#6:1393\n37#6:1398\n37#6:1399\n37#6:1411\n37#6:1416\n37#6:1417\n37#6:1434\n37#6:1486\n37#6:1526\n37#6:1586\n37#6:1689\n37#6:1690\n37#6:1702\n37#6:1703\n37#6:1717\n37#6:1718\n37#6:1730\n37#6:1731\n37#6:1790\n37#6:1804\n37#6:1818\n37#6:1832\n37#6:1846\n37#6:1860\n37#6:1874\n37#6:1888\n37#6:1902\n37#6:1916\n37#6:1930\n37#6:1944\n37#7,2:1958\n37#7,2:1960\n37#7,2:1962\n37#7,2:1964\n37#7,2:1966\n37#7,2:1968\n37#7,2:1970\n37#7,2:1978\n37#7,2:1980\n37#7,2:1982\n13346#8,2:1972\n*S KotlinDebug\n*F\n+ 1 Backups.kt\ncom/dcinside/app/backup/process/Backups\n*L\n104#1:1039\n126#1:1040,2\n148#1:1071\n148#1:1072,3\n164#1:1088,9\n164#1:1097\n164#1:1099\n164#1:1100\n168#1:1101,9\n168#1:1110\n168#1:1112\n168#1:1113\n187#1:1130,9\n187#1:1139\n187#1:1141\n187#1:1142\n191#1:1143,9\n191#1:1152\n191#1:1154\n191#1:1155\n148#1:1196\n148#1:1197,3\n164#1:1213,9\n164#1:1222\n164#1:1224\n164#1:1225\n168#1:1226,9\n168#1:1235\n168#1:1237\n168#1:1238\n187#1:1255,9\n187#1:1264\n187#1:1266\n187#1:1267\n191#1:1268,9\n191#1:1277\n191#1:1279\n191#1:1280\n216#1:1304\n216#1:1305,3\n216#1:1315\n216#1:1316,3\n216#1:1328\n216#1:1329,3\n216#1:1339\n216#1:1340,3\n231#1:1356\n231#1:1357,3\n249#1:1362\n249#1:1363,3\n231#1:1374\n231#1:1375,3\n249#1:1380\n249#1:1381,3\n231#1:1394\n231#1:1395,3\n249#1:1400\n249#1:1401,3\n231#1:1412\n231#1:1413,3\n249#1:1418\n249#1:1419,3\n263#1:1435\n263#1:1436,3\n263#1:1446\n263#1:1447,3\n263#1:1459\n263#1:1460,3\n263#1:1470\n263#1:1471,3\n320#1:1522\n320#1:1523,3\n333#1:1527\n333#1:1528,2\n320#1:1537\n320#1:1538,3\n333#1:1541\n333#1:1542,2\n320#1:1553\n320#1:1554,3\n333#1:1557\n333#1:1558,2\n320#1:1567\n320#1:1568,3\n333#1:1571\n333#1:1572,2\n350#1:1587\n350#1:1588,3\n350#1:1598\n350#1:1599,3\n350#1:1611\n350#1:1612,3\n350#1:1622\n350#1:1623,3\n361#1:1638\n361#1:1639,3\n361#1:1649\n361#1:1650,3\n361#1:1662\n361#1:1663,3\n361#1:1673\n361#1:1674,3\n380#1:1691\n380#1:1692,3\n380#1:1704\n380#1:1705,3\n380#1:1719\n380#1:1720,3\n380#1:1732\n380#1:1733,3\n504#1:1760,9\n512#1:1769\n512#1:1770,2\n513#1:1772\n513#1:1773,2\n513#1:1775,9\n513#1:1784\n514#1:1785\n514#1:1786,2\n536#1:1788,2\n612#1:1791,9\n612#1:1800\n612#1:1802\n612#1:1803\n616#1:1805,9\n616#1:1814\n616#1:1816\n616#1:1817\n620#1:1819,9\n620#1:1828\n620#1:1830\n620#1:1831\n624#1:1833,9\n624#1:1842\n624#1:1844\n624#1:1845\n628#1:1847,9\n628#1:1856\n628#1:1858\n628#1:1859\n632#1:1861,9\n632#1:1870\n632#1:1872\n632#1:1873\n636#1:1875,9\n636#1:1884\n636#1:1886\n636#1:1887\n641#1:1889,9\n641#1:1898\n641#1:1900\n641#1:1901\n646#1:1903,9\n646#1:1912\n646#1:1914\n646#1:1915\n650#1:1917,9\n650#1:1926\n650#1:1928\n650#1:1929\n654#1:1931,9\n654#1:1940\n654#1:1942\n654#1:1943\n658#1:1945,9\n658#1:1954\n658#1:1956\n658#1:1957\n930#1:1974\n930#1:1975,3\n129#1:1042,3\n137#1:1046,3\n137#1:1053,7\n137#1:1063,5\n147#1:1068,3\n147#1:1075,12\n179#1:1114,15\n202#1:1156,15\n129#1:1171\n137#1:1172,3\n137#1:1178,7\n137#1:1188,5\n147#1:1193,3\n147#1:1200,12\n179#1:1239,15\n202#1:1281,15\n209#1:1296,3\n209#1:1300,3\n209#1:1308,7\n209#1:1319,5\n209#1:1324\n209#1:1325,3\n209#1:1332,7\n209#1:1343,5\n224#1:1348,3\n224#1:1352,3\n224#1:1366,7\n224#1:1384,5\n224#1:1389\n224#1:1390,3\n224#1:1404,7\n224#1:1422,5\n256#1:1427,3\n256#1:1431,3\n256#1:1439,7\n256#1:1450,5\n256#1:1455\n256#1:1456,3\n256#1:1463,7\n256#1:1474,5\n271#1:1479,3\n271#1:1483,3\n271#1:1487,12\n271#1:1499\n271#1:1500,15\n317#1:1515,3\n317#1:1519,3\n317#1:1530,7\n317#1:1544,5\n317#1:1549\n317#1:1550,3\n317#1:1560,7\n317#1:1574,5\n340#1:1579,3\n340#1:1583,3\n340#1:1591,7\n340#1:1602,5\n340#1:1607\n340#1:1608,3\n340#1:1615,7\n340#1:1626,5\n358#1:1631,3\n358#1:1635,3\n358#1:1642,7\n358#1:1653,5\n358#1:1658\n358#1:1659,3\n358#1:1666,7\n358#1:1677,5\n368#1:1682,3\n368#1:1686,3\n368#1:1695,7\n368#1:1708,5\n368#1:1713\n368#1:1714,3\n368#1:1723,7\n368#1:1736,5\n447#1:1741,9\n492#1:1750,9\n129#1:1045\n164#1:1098\n168#1:1111\n187#1:1140\n191#1:1153\n164#1:1223\n168#1:1236\n187#1:1265\n191#1:1278\n209#1:1299\n224#1:1351\n256#1:1430\n271#1:1482\n317#1:1518\n340#1:1582\n358#1:1634\n368#1:1685\n612#1:1801\n616#1:1815\n620#1:1829\n624#1:1843\n628#1:1857\n632#1:1871\n636#1:1885\n641#1:1899\n646#1:1913\n650#1:1927\n654#1:1941\n658#1:1955\n139#1:1049\n140#1:1050\n141#1:1051\n142#1:1052\n140#1:1060\n141#1:1061\n142#1:1062\n164#1:1087\n187#1:1129\n140#1:1175\n141#1:1176\n142#1:1177\n140#1:1185\n141#1:1186\n142#1:1187\n164#1:1212\n187#1:1254\n214#1:1303\n229#1:1355\n242#1:1360\n245#1:1361\n229#1:1373\n242#1:1378\n245#1:1379\n229#1:1393\n242#1:1398\n245#1:1399\n229#1:1411\n242#1:1416\n245#1:1417\n261#1:1434\n276#1:1486\n323#1:1526\n345#1:1586\n373#1:1689\n376#1:1690\n373#1:1702\n376#1:1703\n373#1:1717\n376#1:1718\n373#1:1730\n376#1:1731\n610#1:1790\n614#1:1804\n618#1:1818\n622#1:1832\n626#1:1846\n630#1:1860\n634#1:1874\n638#1:1888\n643#1:1902\n648#1:1916\n652#1:1930\n656#1:1944\n800#1:1958,2\n809#1:1960,2\n829#1:1962,2\n830#1:1964,2\n831#1:1966,2\n832#1:1968,2\n846#1:1970,2\n930#1:1978,2\n997#1:1980,2\n1033#1:1982,2\n923#1:1972,2\n*E\n"})
public final class g {
    @l
    public static final g a = null;
    private static final int b = 4;
    @l
    private static final String c = "dcinside";
    @l
    private static final String d = "com.dcinside.app.AUTO_BACKUP";

    static {
        g.a = new g();
    }

    private final e A(c c0, F0 f00) {
        String[] arr_s = c0.e();
        HashSet hashSet0 = k0.m(Arrays.copyOf(arr_s, arr_s.length));
        String[] arr_s1 = c0.b();
        HashSet hashSet1 = k0.m(Arrays.copyOf(arr_s1, arr_s1.length));
        String[] arr_s2 = c0.d();
        HashSet hashSet2 = k0.m(Arrays.copyOf(arr_s2, arr_s2.length));
        String[] arr_s3 = c0.c();
        HashSet hashSet3 = k0.m(Arrays.copyOf(arr_s3, arr_s3.length));
        e e0 = (e)f00.C4(e.class).i0("galleryId", c0.a()).r0();
        if(e0 != null) {
            hashSet0.addAll(e0.X5());
            hashSet1.addAll(e0.U5());
            hashSet2.addAll(e0.W5());
            hashSet3.addAll(e0.V5());
        }
        e e1 = new e();
        e1.b6(c0.a());
        e1.a6(c0.f());
        e1.c6(c0.g());
        e1.X5().addAll(hashSet0);
        e1.U5().addAll(hashSet1);
        e1.W5().addAll(hashSet2);
        e1.V5().addAll(hashSet3);
        return e1;
    }

    private final f B(d d0, F0 f00) {
        f f0 = f.i.c(f00, d0.c());
        int v = 0;
        if(f0 == null) {
            f f1 = new f();
            f1.X5(d0.c());
            f1.W5(d0.b());
            f1.Y5(d0.d());
            f1.V5(new T0());
            f1.Z5(d0.e());
            V.e[] arr_e = d0.a();
            while(v < arr_e.length) {
                V.e e0 = arr_e[v];
                T0 t00 = f1.Q5();
                com.dcinside.app.realm.g g0 = new com.dcinside.app.realm.g();
                g0.T5((e0 == null ? null : e0.b()));
                g0.S5((e0 == null ? 0L : e0.a()));
                t00.add(g0);
                ++v;
            }
            return f1;
        }
        f0.Z5(d0.e());
        V.e[] arr_e1 = d0.a();
        while(v < arr_e1.length) {
            V.e e1 = arr_e1[v];
            T0 t01 = f0.Q5();
            if(t01.x4().i0("imageUrl", (e1 == null ? null : e1.b())).N() <= 0L) {
                com.dcinside.app.realm.g g1 = new com.dcinside.app.realm.g();
                g1.T5((e1 == null ? null : e1.b()));
                g1.S5((e1 == null ? 0L : e1.a()));
                t01.add(g1);
            }
            ++v;
        }
        return f0;
    }

    private final m C(V.f f0) {
        m m0 = new m();
        m0.V5(f0.b());
        m0.W5(f0.d());
        m0.X5(f0.e());
        m0.U5(f0.a());
        return m0;
    }

    private final o D(V.g g0, F0 f00) {
        static final class com.dcinside.app.backup.process.g.c extends N implements Function1 {
            public static final com.dcinside.app.backup.process.g.c e;

            static {
                com.dcinside.app.backup.process.g.c.e = new com.dcinside.app.backup.process.g.c();
            }

            com.dcinside.app.backup.process.g.c() {
                super(1);
            }

            @l
            public final Boolean a(@l o o0) {
                L.p(o0, "it");
                return o0.S5() == null ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((o)object0));
            }
        }

        boolean z = o.h.d(g0.a(), com.dcinside.app.backup.process.g.c.e);
        o o0 = o.h.e(g0.a(), f00);
        if(o0 == null) {
            o0 = new o();
            o0.U5(g0.a());
            o0.V5(g0.b());
            r r0 = new r();
            r0.Z5(g0.e());
            r0.X5(g0.c());
            r0.b6(g0.g());
            r0.a6(g0.f());
            r0.d6(g0.i());
            r0.c6(g0.h());
            r0.Y5(g0.d());
            o0.W5(r0);
            return o0;
        }
        if(!z) {
            r r1 = (r)f00.i3(r.class);
            r1.Z5(g0.e());
            r1.X5(g0.c());
            r1.b6(g0.g());
            r1.a6(g0.f());
            r1.d6(g0.i());
            r1.c6(g0.h());
            r1.Y5(g0.d());
            o0.W5(r1);
        }
        return o0;
    }

    private final y E(h h0, F0 f00) {
        String[] arr_s = h0.c();
        HashSet hashSet0 = k0.m(Arrays.copyOf(arr_s, arr_s.length));
        y y0 = (y)f00.C4(y.class).i0("galleryId", h0.a()).r0();
        if(y0 != null) {
            hashSet0.addAll(y0.T5());
        }
        y y1 = new y();
        y1.W5(h0.d());
        y1.X5(h0.b());
        y1.T5().addAll(hashSet0);
        return y1;
    }

    private final d0 F(k k0, String s, com.dcinside.app.realm.c c0) {
        d0 d00 = new d0();
        d00.g6(s);
        d00.e6(k0.c());
        d00.f6(k0.d());
        d00.h6(k0.e());
        d00.i6(k0.f());
        d00.c6(k0.a());
        d00.k6(k0.h());
        d00.d6(c0);
        d00.j6(k0.g());
        return d00;
    }

    @l
    public final g0 G(@l p p0) {
        L.p(p0, "<this>");
        g0 g00 = new g0();
        g00.V5(p0.c());
        g00.T5(p0.b());
        g00.U5(new T0());
        q[] arr_q = p0.a();
        for(int v = 0; v < arr_q.length; ++v) {
            q q0 = arr_q[v];
            g00.R5().add(g.a.H(q0));
        }
        return g00;
    }

    private final h0 H(q q0) {
        h0 h00 = new h0();
        h00.X5(q0.a());
        h00.Y5(q0.b());
        h00.a6(q0.d());
        h00.c6(q0.f());
        h00.Z5(q0.c());
        h00.b6(q0.e());
        h00.d6(q0.g());
        return h00;
    }

    private final com.dcinside.app.realm.s0 I(n n0) {
        com.dcinside.app.realm.s0 s00 = new com.dcinside.app.realm.s0();
        s00.Y5(n0.a());
        s00.Z5(n0.b());
        s00.c6(n0.e());
        s00.a6(n0.c());
        s00.b6(n0.d());
        return s00;
    }

    private final A0 J(w w0, com.dcinside.app.realm.c c0) {
        A0 a00 = new A0();
        a00.g6(w0.g());
        a00.c6(w0.c());
        a00.d6(w0.d());
        a00.f6(w0.f());
        a00.h6(w0.h());
        a00.a6(w0.a());
        a00.j6(w0.j());
        a00.b6(c0);
        a00.i6(w0.i());
        a00.e6(w0.e());
        return a00;
    }

    @RequiresApi(29)
    private final Uri a(ContentResolver contentResolver0, String s) {
        Uri uri0;
        Cursor cursor0 = contentResolver0.query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "relative_path=\'" + Environment.DIRECTORY_DOWNLOADS + "/dcinside/\'" + " AND " + ("_display_name=\'" + s + "\' "), null, null);
        if(cursor0 != null) {
            try {
                if(cursor0.getCount() >= 1) {
                    cursor0.moveToFirst();
                    uri0 = ContentUris.withAppendedId(MediaStore.Downloads.EXTERNAL_CONTENT_URI, cursor0.getLong(cursor0.getColumnIndexOrThrow("_id")));
                    goto label_9;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(cursor0, throwable0);
                throw throwable0;
            }
        label_9:
            kotlin.io.c.a(cursor0, null);
            return uri0;
        }
    label_11:
        kotlin.io.c.a(cursor0, null);
        return dl.a.F() <= 0L ? null : ContentUris.withAppendedId(MediaStore.Downloads.EXTERNAL_CONTENT_URI, dl.a.F());
    }

    @l
    public final s b(@l F0 f00, @y4.m V.l l0) throws Exception {
        List list8;
        L.p(f00, "realm");
        List list0 = u.Y5(com.dcinside.app.backup.process.e.a.a());
        RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.s0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        g1 g10 = realmQuery0.p0();
        L.o(g10, "findAll(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: g10) {
            L.m(((com.dcinside.app.realm.s0)object0));
            n n0 = g.a.t(((com.dcinside.app.realm.s0)object0));
            if(n0 != null) {
                arrayList0.add(n0);
            }
        }
        List list1 = u.Y5(arrayList0);
        RealmQuery realmQuery1 = f00.C4(com.dcinside.app.memo.n.class);
        L.o(realmQuery1, "this.where(T::class.java)");
        g1 g11 = realmQuery1.p0();
        L.o(g11, "findAll(...)");
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: g11) {
            L.m(((com.dcinside.app.memo.n)object1));
            j j0 = g.a.r(((com.dcinside.app.memo.n)object1));
            if(j0 != null) {
                arrayList1.add(j0);
            }
        }
        List list2 = u.Y5(arrayList1);
        RealmQuery realmQuery2 = f00.C4(e.class);
        L.o(realmQuery2, "this.where(T::class.java)");
        g1 g12 = realmQuery2.p0();
        L.o(g12, "findAll(...)");
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: g12) {
            L.m(((e)object2));
            c c0 = g.a.m(((e)object2));
            if(c0 != null) {
                arrayList2.add(c0);
            }
        }
        List list3 = u.Y5(arrayList2);
        RealmQuery realmQuery3 = f00.C4(com.dcinside.app.realm.d.class);
        L.o(realmQuery3, "this.where(T::class.java)");
        g1 g13 = realmQuery3.p0();
        L.o(g13, "findAll(...)");
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: g13) {
            L.m(((com.dcinside.app.realm.d)object3));
            a a0 = g.a.l(((com.dcinside.app.realm.d)object3));
            if(a0 != null) {
                arrayList3.add(a0);
            }
        }
        List list4 = u.Y5(arrayList3);
        RealmQuery realmQuery4 = f00.C4(y.class);
        L.o(realmQuery4, "this.where(T::class.java)");
        g1 g14 = realmQuery4.p0();
        L.o(g14, "findAll(...)");
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: g14) {
            L.m(((y)object4));
            h h0 = g.a.q(((y)object4));
            if(h0 != null) {
                arrayList4.add(h0);
            }
        }
        List list5 = u.Y5(arrayList4);
        RealmQuery realmQuery5 = f00.C4(d0.class);
        L.o(realmQuery5, "this.where(T::class.java)");
        g1 g15 = realmQuery5.p0();
        L.o(g15, "findAll(...)");
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: g15) {
            L.m(((d0)object5));
            k k0 = g.a.s(((d0)object5));
            if(k0 != null) {
                arrayList5.add(k0);
            }
        }
        List list6 = u.Y5(arrayList5);
        RealmQuery realmQuery6 = f00.C4(A0.class);
        L.o(realmQuery6, "this.where(T::class.java)");
        g1 g16 = realmQuery6.p0();
        L.o(g16, "findAll(...)");
        ArrayList arrayList6 = new ArrayList();
        for(Object object6: g16) {
            L.m(((A0)object6));
            w w0 = g.a.x(((A0)object6));
            if(w0 != null) {
                arrayList6.add(w0);
            }
        }
        List list7 = u.Y5(arrayList6);
        RealmQuery realmQuery7 = f00.C4(y0.class);
        L.o(realmQuery7, "this.where(T::class.java)");
        y0 y00 = (y0)realmQuery7.i0("userId", "").r0();
        if(y00 == null) {
            list8 = null;
        }
        else {
            T0 t00 = y00.Q5();
            if(t00 == null) {
                list8 = null;
            }
            else {
                ArrayList arrayList7 = new ArrayList();
                for(Object object7: t00) {
                    L.m(((m)object7));
                    V.f f0 = g.a.o(((m)object7));
                    if(f0 != null) {
                        arrayList7.add(f0);
                    }
                }
                list8 = u.Y5(arrayList7);
            }
        }
        RealmQuery realmQuery8 = f00.C4(o.class);
        L.o(realmQuery8, "this.where(T::class.java)");
        g1 g17 = realmQuery8.W1("galleryId", "__DC_GLOBAL_DEF_IMAGE_ID").p0();
        L.o(g17, "findAll(...)");
        ArrayList arrayList8 = new ArrayList();
        for(Object object8: g17) {
            L.m(((o)object8));
            V.g g0 = g.a.p(((o)object8));
            if(g0 != null) {
                arrayList8.add(g0);
            }
        }
        List list9 = u.Y5(arrayList8);
        RealmQuery realmQuery9 = f00.C4(f.class);
        L.o(realmQuery9, "this.where(T::class.java)");
        g1 g18 = realmQuery9.p0();
        L.o(g18, "findAll(...)");
        ArrayList arrayList9 = new ArrayList();
        for(Object object9: g18) {
            L.m(((f)object9));
            d d0 = g.a.n(((f)object9));
            if(d0 != null) {
                arrayList9.add(d0);
            }
        }
        List list10 = u.Y5(arrayList9);
        RealmQuery realmQuery10 = f00.C4(g0.class);
        L.o(realmQuery10, "this.where(T::class.java)");
        g1 g19 = realmQuery10.p0();
        L.o(g19, "findAll(...)");
        ArrayList arrayList10 = new ArrayList();
        for(Object object10: g19) {
            L.m(((g0)object10));
            p p0 = g.a.u(((g0)object10));
            if(p0 != null) {
                arrayList10.add(p0);
            }
        }
        List list11 = u.Y5(arrayList10);
        RealmQuery realmQuery11 = f00.C4(com.dcinside.app.dccon.setting.tag.a.class);
        L.o(realmQuery11, "this.where(T::class.java)");
        g1 g110 = realmQuery11.p0();
        L.o(g110, "findAll(...)");
        ArrayList arrayList11 = new ArrayList();
        for(Object object11: g110) {
            L.m(((com.dcinside.app.dccon.setting.tag.a)object11));
            t t0 = g.a.w(((com.dcinside.app.dccon.setting.tag.a)object11));
            if(t0 != null) {
                arrayList11.add(t0);
            }
        }
        return new s(list0, list1, l0, list2, list3, list5, list4, list6, list7, list8, list9, list10, list11, u.Y5(arrayList11), 4, "dcinside");
    }

    public static s c(g g0, F0 f00, V.l l0, int v, Object object0) throws Exception {
        if((v & 2) != 0) {
            l0 = null;
        }
        return g0.b(f00, l0);
    }

    @l
    public final s d(@l String s) throws Exception {
        List list6;
        V v0;
        List list4;
        s s1;
        L.p(s, "path");
        List list0 = null;
        try {
            com.google.gson.stream.a a0 = new com.google.gson.stream.a(new InputStreamReader(new Base64InputStream(new FileInputStream(new File(s)), 2), kotlin.text.f.b));
            try {
                s1 = (s)uk.a.m(a0, s.class);
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(a0, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(a0, null);
        }
        catch(Exception unused_ex) {
            s1 = null;
        }
        if(s1 == null) {
            List list1 = v.N3(new String(kotlin.io.m.x(new File(s)), kotlin.text.f.b));
            List list2 = list1.isEmpty() ? null : list1;
            if(list2 != null) {
                String s2 = (String)u.G2(list2);
                if(s2 != null) {
                    List list3 = new kotlin.text.r(",").p(s2, 0);
                    if(list3 != null) {
                        if(!list3.isEmpty()) {
                            ListIterator listIterator0 = list3.listIterator(list3.size());
                            while(listIterator0.hasPrevious()) {
                                if(((String)listIterator0.previous()).length() == 0) {
                                    continue;
                                }
                                list4 = u.J5(list3, listIterator0.nextIndex() + 1);
                                goto label_26;
                            }
                        }
                        list4 = u.H();
                    label_26:
                        if(list4 != null && list4.size() >= 2) {
                            list0 = list4;
                        }
                    }
                }
            }
            if(list0 == null) {
                v0 = r0.a(0, "");
            }
            else {
                Integer integer0 = v.b1(com.dcinside.app.internal.c.b(((String)list0.get(0))));
                v0 = r0.a(((int)(integer0 == null ? 0 : ((int)integer0))), com.dcinside.app.internal.c.b(((String)list0.get(1))));
                if(v0 == null) {
                    v0 = r0.a(0, "");
                }
            }
            int v1 = ((Number)v0.a()).intValue();
            String s3 = (String)v0.b();
            if(!s.q.a(v1) || !L.g("dcinside", s3)) {
                throw new W.d("Unknown Backup file format.");
            }
            Iterable iterable0 = list1.subList(1, list1.size());
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(((String)object0).length() > 0) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
            for(Object object1: arrayList0) {
                List list5 = new kotlin.text.r(",").p(((String)object1), 0);
                if(!list5.isEmpty()) {
                    ListIterator listIterator1 = list5.listIterator(list5.size());
                    while(listIterator1.hasPrevious()) {
                        if(((String)listIterator1.previous()).length() == 0) {
                            continue;
                        }
                        list6 = u.J5(list5, listIterator1.nextIndex() + 1);
                        goto label_58;
                    }
                }
                list6 = u.H();
            label_58:
                arrayList1.add(list6);
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: arrayList1) {
                if(((List)object2).size() >= 6) {
                    arrayList2.add(object2);
                }
            }
            return this.i(v1, s3, arrayList2);
        }
        if(!s1.t() || !L.g(s1.l(), "dcinside")) {
            throw new W.e("Unsupported version: " + s1.q() + ", " + s1.l());
        }
        return s1;
    }

    public final void e(@l Context context0) {
        L.p(context0, "context");
        Constraints constraints0 = new Builder().e(true).d(NetworkType.b).h(true).b();
        androidx.work.PeriodicWorkRequest.Builder periodicWorkRequest$Builder0 = new androidx.work.PeriodicWorkRequest.Builder(AutoBackupWorker.class, 1L, TimeUnit.DAYS);
        Calendar calendar0 = Calendar.getInstance();
        if(calendar0.get(11) > 12) {
            calendar0.add(5, 1);
        }
        calendar0.set(11, 12);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        long v = calendar0.getTimeInMillis();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        PeriodicWorkRequest periodicWorkRequest0 = (PeriodicWorkRequest)((androidx.work.PeriodicWorkRequest.Builder)((androidx.work.PeriodicWorkRequest.Builder)((androidx.work.PeriodicWorkRequest.Builder)periodicWorkRequest$Builder0.s(v - System.currentTimeMillis(), timeUnit0)).o(constraints0)).l(BackoffPolicy.a, 10000L, timeUnit0)).b();
        WorkManager.a.b(context0).l("com.dcinside.app.AUTO_BACKUP", ExistingPeriodicWorkPolicy.b, periodicWorkRequest0);
    }

    public final void f(@l s s0, boolean z) throws Exception {
        static final class com.dcinside.app.backup.process.g.a extends N implements Function1 {
            public static final com.dcinside.app.backup.process.g.a e;

            static {
                com.dcinside.app.backup.process.g.a.e = new com.dcinside.app.backup.process.g.a();
            }

            com.dcinside.app.backup.process.g.a() {
                super(1);
            }

            @l
            public final List a(@l List list0) {
                L.p(list0, "it");
                return u.Y5(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @l
            public final List a(@l List list0) {
                L.p(list0, "it");
                return u.Y5(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }

        ArrayList arrayList23;
        ArrayList arrayList24;
        ArrayList arrayList20;
        ArrayList arrayList21;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList14;
        ArrayList arrayList16;
        Class class10;
        j j2;
        com.dcinside.app.memo.n n4;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList11;
        ArrayList arrayList10;
        ArrayList arrayList9;
        ArrayList arrayList8;
        ArrayList arrayList6;
        ArrayList arrayList7;
        d0 d00;
        List list9;
        A0 a00;
        List list12;
        ArrayList arrayList1;
        ArrayList arrayList0;
        L.p(s0, "data");
        List list0 = s0.c();
        if(list0 != null) {
            for(Object object0: list0) {
                com.dcinside.app.backup.process.e.a.b(((V.r)object0), z);
            }
        }
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            List list1 = s0.d();
            if(list1 != null && !list1.isEmpty() == 1) {
            label_16:
                Class class0 = d0.class;
                Class class1 = A0.class;
                if(z) {
                    boolean z1 = f00.E0();
                    Class class2 = g0.class;
                    Class class3 = com.dcinside.app.realm.c.class;
                    if(z1) {
                        RealmQuery realmQuery0 = f00.C4(class3);
                        L.o(realmQuery0, "this.where(T::class.java)");
                        realmQuery0.p0().L0();
                        RealmQuery realmQuery1 = f00.C4(class1);
                        L.o(realmQuery1, "this.where(T::class.java)");
                        realmQuery1.p0().L0();
                        RealmQuery realmQuery2 = f00.C4(class0);
                        L.o(realmQuery2, "this.where(T::class.java)");
                        realmQuery2.p0().L0();
                        RealmQuery realmQuery3 = f00.C4(class2);
                        L.o(realmQuery3, "this.where(T::class.java)");
                        realmQuery3.p0().L0();
                    }
                    else {
                        f00.beginTransaction();
                        try {
                            RealmQuery realmQuery4 = f00.C4(class3);
                            L.o(realmQuery4, "this.where(T::class.java)");
                            realmQuery4.p0().L0();
                            RealmQuery realmQuery5 = f00.C4(class1);
                            L.o(realmQuery5, "this.where(T::class.java)");
                            realmQuery5.p0().L0();
                            RealmQuery realmQuery6 = f00.C4(class0);
                            L.o(realmQuery6, "this.where(T::class.java)");
                            realmQuery6.p0().L0();
                            RealmQuery realmQuery7 = f00.C4(class2);
                            L.o(realmQuery7, "this.where(T::class.java)");
                            realmQuery7.p0().L0();
                            f00.p();
                        }
                        catch(Throwable throwable1) {
                            if(f00.E0()) {
                                f00.e();
                            }
                            throw throwable1;
                        }
                    }
                }
                List list4 = s0.d();
                if(list4 != null && !list4.isEmpty() == 1) {
                    if(f00.E0()) {
                        List list5 = s0.d();
                        if(list5 == null) {
                            arrayList0 = null;
                        }
                        else {
                            arrayList0 = new ArrayList(u.b0(list5, 10));
                            for(Object object1: list5) {
                                arrayList0.add(g.a.z(((a)object1), f00));
                            }
                        }
                        s0.v(null);
                        if(arrayList0 != null && !arrayList0.isEmpty() == 1) {
                            f00.A2(arrayList0, new W[0]);
                        }
                    }
                    else {
                        f00.beginTransaction();
                        try {
                            List list6 = s0.d();
                            if(list6 == null) {
                                arrayList1 = null;
                            }
                            else {
                                arrayList1 = new ArrayList(u.b0(list6, 10));
                                for(Object object2: list6) {
                                    arrayList1.add(g.a.z(((a)object2), f00));
                                }
                            }
                            s0.v(null);
                            if(arrayList1 != null && !arrayList1.isEmpty() == 1) {
                                f00.A2(arrayList1, new W[0]);
                            }
                            f00.p();
                        }
                        catch(Throwable throwable2) {
                            if(f00.E0()) {
                                f00.e();
                            }
                            throw throwable2;
                        }
                    }
                }
                HashMap hashMap0 = new HashMap();
                List list7 = s0.h();
                if(list7 == null || !list7.isEmpty() != 1) {
                label_150:
                    List list10 = s0.r();
                    if(list10 == null || !list10.isEmpty() != 1) {
                        goto label_208;
                    }
                    else {
                        RealmQuery realmQuery9 = f00.C4(class1);
                        L.o(realmQuery9, "this.where(T::class.java)");
                        g1 g11 = realmQuery9.p0();
                        L.o(g11, "findAll(...)");
                        ArrayList arrayList4 = new ArrayList();
                        for(Object object6: g11) {
                            String s3 = ((A0)object6).W5();
                            if(s3 != null) {
                                arrayList4.add(s3);
                            }
                        }
                        HashSet hashSet1 = u.T5(arrayList4);
                        List list11 = s0.r();
                        if(list11 == null) {
                            list12 = u.H();
                        }
                        else {
                            list12 = u.Q1(list11, 1000, b.e);
                            if(list12 == null) {
                                list12 = u.H();
                            }
                        }
                        s0.H(null);
                        Iterator iterator7 = list12.iterator();
                        while(true) {
                        label_174:
                            if(!iterator7.hasNext()) {
                                goto label_208;
                            }
                            Object object7 = iterator7.next();
                            ArrayList arrayList5 = new ArrayList();
                            for(Object object8: ((List)object7)) {
                                w w0 = (w)object8;
                                String s4 = w0.g();
                                if(hashSet1.contains(s4)) {
                                    a00 = null;
                                }
                                else {
                                    hashSet1.add(s4);
                                    com.dcinside.app.realm.c c1 = g.h(hashMap0, f00, w0.b());
                                    a00 = g.a.J(w0, c1);
                                }
                                if(a00 != null) {
                                    arrayList5.add(a00);
                                }
                            }
                            ((List)object7).clear();
                            if(!arrayList5.isEmpty()) {
                                if(f00.E0()) {
                                    f00.p2(arrayList5, new W[0]);
                                    continue;
                                }
                                else {
                                    f00.beginTransaction();
                                    try {
                                        f00.p2(arrayList5, new W[0]);
                                        f00.p();
                                        continue;
                                    }
                                    catch(Throwable throwable4) {
                                        if(f00.E0()) {
                                            f00.e();
                                        }
                                        throw throwable4;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                else {
                    RealmQuery realmQuery8 = f00.C4(class0);
                    L.o(realmQuery8, "this.where(T::class.java)");
                    g1 g10 = realmQuery8.p0();
                    L.o(g10, "findAll(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object3: g10) {
                        String s1 = ((d0)object3).W5();
                        if(s1 != null) {
                            arrayList2.add(s1);
                        }
                    }
                    HashSet hashSet0 = u.T5(arrayList2);
                    List list8 = s0.h();
                    if(list8 == null) {
                        list9 = u.H();
                    }
                    else {
                        list9 = u.Q1(list8, 1000, com.dcinside.app.backup.process.g.a.e);
                        if(list9 == null) {
                            list9 = u.H();
                        }
                    }
                    s0.z(null);
                    Iterator iterator4 = list9.iterator();
                    while(true) {
                        if(!iterator4.hasNext()) {
                            goto label_150;
                        }
                        Object object4 = iterator4.next();
                        ArrayList arrayList3 = new ArrayList();
                        for(Object object5: ((List)object4)) {
                            k k0 = (k)object5;
                            String s2 = d0.m.c(k0.c(), k0.e());
                            if(hashSet0.contains(s2)) {
                                d00 = null;
                            }
                            else {
                                hashSet0.add(s2);
                                com.dcinside.app.realm.c c0 = g.h(hashMap0, f00, k0.b());
                                d00 = g.a.F(k0, s2, c0);
                            }
                            if(d00 != null) {
                                arrayList3.add(d00);
                            }
                        }
                        ((List)object4).clear();
                        if(arrayList3.isEmpty()) {
                        }
                        else if(f00.E0()) {
                            f00.p2(arrayList3, new W[0]);
                        }
                        else {
                            f00.beginTransaction();
                            try {
                                f00.p2(arrayList3, new W[0]);
                                f00.p();
                            }
                            catch(Throwable throwable3) {
                                if(f00.E0()) {
                                    f00.e();
                                }
                                throw throwable3;
                            }
                        }
                    }
                }
            }
            else {
                List list2 = s0.h();
                if(list2 != null && !list2.isEmpty() == 1) {
                    goto label_16;
                }
                else {
                    List list3 = s0.r();
                    if(list3 == null || !list3.isEmpty() != 1) {
                        goto label_208;
                    }
                    else {
                        goto label_16;
                    }
                }
            }
            goto label_210;
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
        goto label_174;
    label_208:
        kotlin.io.c.a(f00, null);
        F0 f01 = F0.g4();
        try {
        label_210:
            L.m(f01);
            boolean z2 = f01.E0();
            Class class4 = com.dcinside.app.realm.s0.class;
            if(z2) {
                List list15 = s0.j();
                if(list15 != null && !list15.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery11 = f01.C4(class4);
                        L.o(realmQuery11, "this.where(T::class.java)");
                        realmQuery11.p0().L0();
                    }
                    List list16 = s0.j();
                    if(list16 == null) {
                        arrayList7 = null;
                    }
                    else {
                        arrayList7 = new ArrayList(u.b0(list16, 10));
                        for(Object object10: list16) {
                            arrayList7.add(g.a.I(((n)object10)));
                        }
                    }
                    s0.B(null);
                    if(arrayList7 != null && !arrayList7.isEmpty() == 1) {
                        f01.A2(arrayList7, new W[0]);
                    }
                }
            }
            else {
                f01.beginTransaction();
                try {
                    List list13 = s0.j();
                    if(list13 != null && !list13.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery10 = f01.C4(class4);
                            L.o(realmQuery10, "this.where(T::class.java)");
                            realmQuery10.p0().L0();
                        }
                        List list14 = s0.j();
                        if(list14 == null) {
                            arrayList6 = null;
                        }
                        else {
                            arrayList6 = new ArrayList(u.b0(list14, 10));
                            for(Object object9: list14) {
                                arrayList6.add(g.a.I(((n)object9)));
                            }
                        }
                        s0.B(null);
                        if(arrayList6 != null && !arrayList6.isEmpty() == 1) {
                            f01.A2(arrayList6, new W[0]);
                        }
                    }
                    f01.p();
                }
                catch(Throwable throwable6) {
                    if(f01.E0()) {
                        f01.e();
                    }
                    throw throwable6;
                }
            }
        }
        catch(Throwable throwable5) {
            kotlin.io.c.a(f01, throwable5);
            throw throwable5;
        }
        kotlin.io.c.a(f01, null);
        F0 f02 = F0.g4();
        try {
            L.m(f02);
            boolean z3 = f02.E0();
            Class class5 = f.class;
            Class class6 = com.dcinside.app.realm.g.class;
            Class class7 = e.class;
            if(z3) {
                List list17 = s0.m();
                if(list17 != null && !list17.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery12 = f02.C4(class7);
                        L.o(realmQuery12, "this.where(T::class.java)");
                        realmQuery12.p0().L0();
                    }
                    List list18 = s0.m();
                    if(list18 == null) {
                        arrayList8 = null;
                    }
                    else {
                        arrayList8 = new ArrayList(u.b0(list18, 10));
                        for(Object object11: list18) {
                            arrayList8.add(g.a.A(((c)object11), f02));
                        }
                    }
                    s0.D(null);
                    if(arrayList8 != null && !arrayList8.isEmpty() == 1) {
                        f02.A2(arrayList8, new W[0]);
                    }
                }
                List list19 = s0.n();
                if(list19 != null && !list19.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery13 = f02.C4(class6);
                        L.o(realmQuery13, "this.where(T::class.java)");
                        realmQuery13.p0().L0();
                        RealmQuery realmQuery14 = f02.C4(class5);
                        L.o(realmQuery14, "this.where(T::class.java)");
                        realmQuery14.p0().L0();
                    }
                    List list20 = s0.n();
                    if(list20 == null) {
                        arrayList9 = null;
                    }
                    else {
                        arrayList9 = new ArrayList(u.b0(list20, 10));
                        for(Object object12: list20) {
                            arrayList9.add(g.a.B(((d)object12), f02));
                        }
                    }
                    s0.E(null);
                    if(arrayList9 != null && !arrayList9.isEmpty() == 1) {
                        f02.A2(arrayList9, new W[0]);
                    }
                }
            }
            else {
                f02.beginTransaction();
                try {
                    List list21 = s0.m();
                    if(list21 != null && !list21.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery15 = f02.C4(class7);
                            L.o(realmQuery15, "this.where(T::class.java)");
                            realmQuery15.p0().L0();
                        }
                        List list22 = s0.m();
                        if(list22 == null) {
                            arrayList10 = null;
                        }
                        else {
                            arrayList10 = new ArrayList(u.b0(list22, 10));
                            for(Object object13: list22) {
                                arrayList10.add(g.a.A(((c)object13), f02));
                            }
                        }
                        s0.D(null);
                        if(arrayList10 != null && !arrayList10.isEmpty() == 1) {
                            f02.A2(arrayList10, new W[0]);
                        }
                    }
                    List list23 = s0.n();
                    if(list23 != null && !list23.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery16 = f02.C4(class6);
                            L.o(realmQuery16, "this.where(T::class.java)");
                            realmQuery16.p0().L0();
                            RealmQuery realmQuery17 = f02.C4(class5);
                            L.o(realmQuery17, "this.where(T::class.java)");
                            realmQuery17.p0().L0();
                        }
                        List list24 = s0.n();
                        if(list24 == null) {
                            arrayList11 = null;
                        }
                        else {
                            arrayList11 = new ArrayList(u.b0(list24, 10));
                            for(Object object14: list24) {
                                arrayList11.add(g.a.B(((d)object14), f02));
                            }
                        }
                        s0.E(null);
                        if(arrayList11 != null && !arrayList11.isEmpty() == 1) {
                            f02.A2(arrayList11, new W[0]);
                        }
                    }
                    f02.p();
                }
                catch(Throwable throwable8) {
                    if(f02.E0()) {
                        f02.e();
                    }
                    throw throwable8;
                }
            }
        }
        catch(Throwable throwable7) {
            kotlin.io.c.a(f02, throwable7);
            throw throwable7;
        }
        kotlin.io.c.a(f02, null);
        F0 f03 = F0.g4();
        try {
            L.m(f03);
            boolean z4 = f03.E0();
            Class class8 = y.class;
            if(z4) {
                List list27 = s0.g();
                if(list27 != null && !list27.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery19 = f03.C4(class8);
                        L.o(realmQuery19, "this.where(T::class.java)");
                        realmQuery19.p0().L0();
                    }
                    List list28 = s0.g();
                    if(list28 == null) {
                        arrayList13 = null;
                    }
                    else {
                        arrayList13 = new ArrayList(u.b0(list28, 10));
                        for(Object object16: list28) {
                            arrayList13.add(g.a.E(((h)object16), f03));
                        }
                    }
                    s0.y(null);
                    if(arrayList13 != null && !arrayList13.isEmpty() == 1) {
                        f03.A2(arrayList13, new W[0]);
                    }
                }
            }
            else {
                f03.beginTransaction();
                try {
                    List list25 = s0.g();
                    if(list25 != null && !list25.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery18 = f03.C4(class8);
                            L.o(realmQuery18, "this.where(T::class.java)");
                            realmQuery18.p0().L0();
                        }
                        List list26 = s0.g();
                        if(list26 == null) {
                            arrayList12 = null;
                        }
                        else {
                            arrayList12 = new ArrayList(u.b0(list26, 10));
                            for(Object object15: list26) {
                                arrayList12.add(g.a.E(((h)object15), f03));
                            }
                        }
                        s0.y(null);
                        if(arrayList12 != null && !arrayList12.isEmpty() == 1) {
                            f03.A2(arrayList12, new W[0]);
                        }
                    }
                    f03.p();
                }
                catch(Throwable throwable10) {
                    if(f03.E0()) {
                        f03.e();
                    }
                    throw throwable10;
                }
            }
        }
        catch(Throwable throwable9) {
            kotlin.io.c.a(f03, throwable9);
            throw throwable9;
        }
        kotlin.io.c.a(f03, null);
        F0 f04 = F0.g4();
        try {
            L.m(f04);
            boolean z5 = f04.E0();
            Class class9 = com.dcinside.app.memo.n.class;
            if(z5) {
                List list31 = s0.o();
                if(list31 != null && !list31.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery21 = f04.C4(class9);
                        L.o(realmQuery21, "this.where(T::class.java)");
                        realmQuery21.p0().L0();
                    }
                    List list32 = s0.o();
                    if(list32 == null) {
                        list32 = new ArrayList();
                    }
                    Iterator iterator19 = list32.iterator();
                    s0.F(null);
                    while(iterator19.hasNext()) {
                        Object object19 = iterator19.next();
                        j j1 = (j)object19;
                        com.dcinside.app.memo.n n2 = (com.dcinside.app.memo.n)f04.C4(class9).i0("galleryId", j1.b()).r0();
                        HashSet hashSet3 = new HashSet();
                        if(n2 == null) {
                            com.dcinside.app.memo.n n3 = new com.dcinside.app.memo.n();
                            n3.S5(j1.b());
                            X0 x01 = f04.o2(n3, new W[0]);
                            L.o(x01, "copyToRealm(...)");
                            n2 = (com.dcinside.app.memo.n)x01;
                        }
                        else {
                            for(Object object20: n2.R5()) {
                                String s7 = ((com.dcinside.app.memo.q)object20).S5();
                                if(s7 != null) {
                                    hashSet3.add(s7);
                                }
                            }
                        }
                        int v2 = Math.min(j1.d().length, j1.c().length);
                        int v3 = 0;
                        while(v3 < v2) {
                            if(hashSet3.contains(j1.d()[v3])) {
                                j2 = j1;
                                n4 = n2;
                            }
                            else {
                                hashSet3.add(j1.d()[v3]);
                                T0 t01 = n2.R5();
                                com.dcinside.app.memo.q q1 = new com.dcinside.app.memo.q();
                                n4 = n2;
                                q1.V5(j1.d()[v3]);
                                q1.U5(j1.c()[v3]);
                                String[] arr_s1 = j1.a();
                                if(arr_s1 == null) {
                                    j2 = j1;
                                }
                                else {
                                    j2 = j1;
                                    String s8 = (String)kotlin.collections.l.Pe(arr_s1, v3);
                                    Integer integer1 = com.dcinside.app.memo.q.g.a(s8);
                                    if(integer1 != null) {
                                        q1.T5(com.dcinside.app.internal.c.i(((int)integer1)));
                                    }
                                }
                                t01.add(q1);
                            }
                            ++v3;
                            j1 = j2;
                            n2 = n4;
                        }
                        iterator19.remove();
                    }
                }
            }
            else {
                f04.beginTransaction();
                try {
                    List list29 = s0.o();
                    if(list29 != null && !list29.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery20 = f04.C4(class9);
                            L.o(realmQuery20, "this.where(T::class.java)");
                            realmQuery20.p0().L0();
                        }
                        List list30 = s0.o();
                        if(list30 == null) {
                            list30 = new ArrayList();
                        }
                        Iterator iterator17 = list30.iterator();
                        s0.F(null);
                        while(iterator17.hasNext()) {
                            Object object17 = iterator17.next();
                            j j0 = (j)object17;
                            com.dcinside.app.memo.n n0 = (com.dcinside.app.memo.n)f04.C4(class9).i0("galleryId", j0.b()).r0();
                            HashSet hashSet2 = new HashSet();
                            if(n0 == null) {
                                com.dcinside.app.memo.n n1 = new com.dcinside.app.memo.n();
                                n1.S5(j0.b());
                                X0 x00 = f04.o2(n1, new W[0]);
                                L.o(x00, "copyToRealm(...)");
                                n0 = (com.dcinside.app.memo.n)x00;
                            }
                            else {
                                for(Object object18: n0.R5()) {
                                    String s5 = ((com.dcinside.app.memo.q)object18).S5();
                                    if(s5 != null) {
                                        hashSet2.add(s5);
                                    }
                                }
                            }
                            int v = Math.min(j0.d().length, j0.c().length);
                            int v1 = 0;
                            while(v1 < v) {
                                if(hashSet2.contains(j0.d()[v1])) {
                                    class10 = class9;
                                }
                                else {
                                    hashSet2.add(j0.d()[v1]);
                                    T0 t00 = n0.R5();
                                    com.dcinside.app.memo.q q0 = new com.dcinside.app.memo.q();
                                    q0.V5(j0.d()[v1]);
                                    q0.U5(j0.c()[v1]);
                                    String[] arr_s = j0.a();
                                    if(arr_s == null) {
                                        class10 = class9;
                                    }
                                    else {
                                        class10 = class9;
                                        String s6 = (String)kotlin.collections.l.Pe(arr_s, v1);
                                        Integer integer0 = com.dcinside.app.memo.q.g.a(s6);
                                        if(integer0 != null) {
                                            q0.T5(com.dcinside.app.internal.c.i(((int)integer0)));
                                        }
                                    }
                                    t00.add(q0);
                                }
                                ++v1;
                                class9 = class10;
                            }
                            iterator17.remove();
                        }
                    }
                    f04.p();
                }
                catch(Throwable throwable12) {
                    if(f04.E0()) {
                        f04.e();
                    }
                    throw throwable12;
                }
            }
        }
        catch(Throwable throwable11) {
            kotlin.io.c.a(f04, throwable11);
            throw throwable11;
        }
        kotlin.io.c.a(f04, null);
        F0 f05 = F0.g4();
        try {
            L.m(f05);
            boolean z6 = f05.E0();
            Class class11 = y0.class;
            if(z6) {
                List list35 = s0.e();
                if(list35 != null && !list35.isEmpty() == 1) {
                    List list36 = s0.e();
                    if(list36 == null) {
                        arrayList16 = null;
                    }
                    else {
                        arrayList16 = new ArrayList(u.b0(list36, 10));
                        for(Object object23: list36) {
                            arrayList16.add(g.a.C(((V.f)object23)));
                        }
                    }
                    s0.w(null);
                    if(arrayList16 != null && !arrayList16.isEmpty() == 1) {
                        RealmQuery realmQuery23 = f05.C4(class11);
                        L.o(realmQuery23, "this.where(T::class.java)");
                        X0 x03 = realmQuery23.i0("userId", "").r0();
                        if(x03 == null) {
                            x03 = f05.n3(class11, "");
                            L.m(x03);
                        }
                        if(z) {
                            ((y0)x03).Q5().L0();
                        }
                        ArrayList arrayList17 = new ArrayList();
                        for(Object object24: arrayList16) {
                            if(((y0)x03).Q5().x4().i0("id", ((m)object24).R5()).N() < 1L) {
                                arrayList17.add(object24);
                            }
                        }
                        ((y0)x03).Q5().addAll(arrayList17);
                    }
                }
            }
            else {
                f05.beginTransaction();
                try {
                    List list33 = s0.e();
                    if(list33 != null && !list33.isEmpty() == 1) {
                        List list34 = s0.e();
                        if(list34 == null) {
                            arrayList14 = null;
                        }
                        else {
                            arrayList14 = new ArrayList(u.b0(list34, 10));
                            for(Object object21: list34) {
                                arrayList14.add(g.a.C(((V.f)object21)));
                            }
                        }
                        s0.w(null);
                        if(arrayList14 != null && !arrayList14.isEmpty() == 1) {
                            RealmQuery realmQuery22 = f05.C4(class11);
                            L.o(realmQuery22, "this.where(T::class.java)");
                            X0 x02 = realmQuery22.i0("userId", "").r0();
                            if(x02 == null) {
                                x02 = f05.n3(class11, "");
                                L.m(x02);
                            }
                            if(z) {
                                ((y0)x02).Q5().L0();
                            }
                            ArrayList arrayList15 = new ArrayList();
                            for(Object object22: arrayList14) {
                                if(((y0)x02).Q5().x4().i0("id", ((m)object22).R5()).N() < 1L) {
                                    arrayList15.add(object22);
                                }
                            }
                            ((y0)x02).Q5().addAll(arrayList15);
                        }
                    }
                    f05.p();
                }
                catch(Throwable throwable14) {
                    if(f05.E0()) {
                        f05.e();
                    }
                    throw throwable14;
                }
            }
        }
        catch(Throwable throwable13) {
            kotlin.io.c.a(f05, throwable13);
            throw throwable13;
        }
        kotlin.io.c.a(f05, null);
        F0 f06 = F0.g4();
        try {
            L.m(f06);
            if(f06.E0()) {
                List list39 = s0.f();
                if(list39 != null && !list39.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery25 = f06.C4(o.class);
                        L.o(realmQuery25, "this.where(T::class.java)");
                        realmQuery25.W1("galleryId", "__DC_GLOBAL_DEF_IMAGE_ID").p0().L0();
                    }
                    List list40 = s0.f();
                    if(list40 == null) {
                        arrayList19 = null;
                    }
                    else {
                        arrayList19 = new ArrayList(u.b0(list40, 10));
                        for(Object object26: list40) {
                            arrayList19.add(g.a.D(((V.g)object26), f06));
                        }
                    }
                    s0.x(null);
                    if(arrayList19 != null && !arrayList19.isEmpty() == 1) {
                        f06.A2(arrayList19, new W[0]);
                    }
                }
            }
            else {
                f06.beginTransaction();
                try {
                    List list37 = s0.f();
                    if(list37 != null && !list37.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery24 = f06.C4(o.class);
                            L.o(realmQuery24, "this.where(T::class.java)");
                            realmQuery24.W1("galleryId", "__DC_GLOBAL_DEF_IMAGE_ID").p0().L0();
                        }
                        List list38 = s0.f();
                        if(list38 == null) {
                            arrayList18 = null;
                        }
                        else {
                            arrayList18 = new ArrayList(u.b0(list38, 10));
                            for(Object object25: list38) {
                                arrayList18.add(g.a.D(((V.g)object25), f06));
                            }
                        }
                        s0.x(null);
                        if(arrayList18 != null && !arrayList18.isEmpty() == 1) {
                            f06.A2(arrayList18, new W[0]);
                        }
                    }
                    f06.p();
                }
                catch(Throwable throwable16) {
                    if(f06.E0()) {
                        f06.e();
                    }
                    throw throwable16;
                }
            }
        }
        catch(Throwable throwable15) {
            kotlin.io.c.a(f06, throwable15);
            throw throwable15;
        }
        kotlin.io.c.a(f06, null);
        F0 f07 = F0.g4();
        try {
            L.m(f07);
            if(f07.E0()) {
                List list43 = s0.k();
                if(list43 != null && !list43.isEmpty() == 1) {
                    List list44 = s0.k();
                    if(list44 == null) {
                        arrayList21 = null;
                    }
                    else {
                        arrayList21 = new ArrayList(u.b0(list44, 10));
                        for(Object object28: list44) {
                            arrayList21.add(g.a.G(((p)object28)));
                        }
                    }
                    s0.C(null);
                    if(arrayList21 != null && !arrayList21.isEmpty() == 1) {
                        f07.p2(arrayList21, new W[0]);
                    }
                }
            }
            else {
                f07.beginTransaction();
                try {
                    List list41 = s0.k();
                    if(list41 != null && !list41.isEmpty() == 1) {
                        List list42 = s0.k();
                        if(list42 == null) {
                            arrayList20 = null;
                        }
                        else {
                            arrayList20 = new ArrayList(u.b0(list42, 10));
                            for(Object object27: list42) {
                                arrayList20.add(g.a.G(((p)object27)));
                            }
                        }
                        s0.C(null);
                        if(arrayList20 != null && !arrayList20.isEmpty() == 1) {
                            f07.p2(arrayList20, new W[0]);
                        }
                    }
                    f07.p();
                }
                catch(Throwable throwable18) {
                    if(f07.E0()) {
                        f07.e();
                    }
                    throw throwable18;
                }
            }
        }
        catch(Throwable throwable17) {
            kotlin.io.c.a(f07, throwable17);
            throw throwable17;
        }
        kotlin.io.c.a(f07, null);
        F0 f08 = F0.g4();
        try {
            L.m(f08);
            if(f08.E0()) {
                List list47 = s0.p();
                if(list47 != null && !list47.isEmpty() == 1) {
                    if(z) {
                        RealmQuery realmQuery28 = f08.C4(com.dcinside.app.dccon.setting.tag.b.class);
                        L.o(realmQuery28, "this.where(T::class.java)");
                        realmQuery28.p0().L0();
                        RealmQuery realmQuery29 = f08.C4(com.dcinside.app.dccon.setting.tag.a.class);
                        L.o(realmQuery29, "this.where(T::class.java)");
                        realmQuery29.p0().L0();
                    }
                    List list48 = s0.p();
                    if(list48 == null) {
                        arrayList24 = null;
                    }
                    else {
                        arrayList24 = new ArrayList(u.b0(list48, 10));
                        for(Object object30: list48) {
                            arrayList24.add(g.a.y(((t)object30), f08));
                        }
                    }
                    s0.G(null);
                    if(arrayList24 != null && !arrayList24.isEmpty() == 1) {
                        f08.A2(arrayList24, new W[0]);
                    }
                }
            }
            else {
                f08.beginTransaction();
                try {
                    List list45 = s0.p();
                    if(list45 != null && !list45.isEmpty() == 1) {
                        if(z) {
                            RealmQuery realmQuery26 = f08.C4(com.dcinside.app.dccon.setting.tag.b.class);
                            L.o(realmQuery26, "this.where(T::class.java)");
                            realmQuery26.p0().L0();
                            RealmQuery realmQuery27 = f08.C4(com.dcinside.app.dccon.setting.tag.a.class);
                            L.o(realmQuery27, "this.where(T::class.java)");
                            realmQuery27.p0().L0();
                        }
                        List list46 = s0.p();
                        if(list46 == null) {
                            arrayList23 = null;
                        }
                        else {
                            ArrayList arrayList22 = new ArrayList(u.b0(list46, 10));
                            for(Object object29: list46) {
                                arrayList22.add(g.a.y(((t)object29), f08));
                            }
                            arrayList23 = arrayList22;
                        }
                        s0.G(null);
                        if(arrayList23 != null && !arrayList23.isEmpty() == 1) {
                            f08.A2(arrayList23, new W[0]);
                        }
                    }
                    f08.p();
                }
                catch(Throwable throwable20) {
                    if(f08.E0()) {
                        f08.e();
                    }
                    throw throwable20;
                }
            }
        }
        catch(Throwable throwable19) {
            kotlin.io.c.a(f08, throwable19);
            throw throwable19;
        }
        kotlin.io.c.a(f08, null);
    }

    public static void g(g g0, s s0, boolean z, int v, Object object0) throws Exception {
        if((v & 2) != 0) {
            z = false;
        }
        g0.f(s0, z);
    }

    private static final com.dcinside.app.realm.c h(HashMap hashMap0, F0 f00, String s) {
        com.dcinside.app.realm.c c0 = (com.dcinside.app.realm.c)hashMap0.get(s);
        if(c0 == null) {
            c0 = com.dcinside.app.realm.d.f.a(f00, 0, s);
        }
        L.m(c0);
        hashMap0.put(s, c0);
        return c0;
    }

    private final s i(int v, String s, List list0) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: list0) {
            List list1 = (List)object0;
            switch(list1.size()) {
                case 6: {
                    arrayList0.add(new k(com.dcinside.app.internal.c.b(((String)list1.get(0))), com.dcinside.app.internal.c.b(((String)list1.get(1))), Integer.parseInt(com.dcinside.app.internal.c.b(((String)list1.get(2)))), com.dcinside.app.internal.c.b(((String)list1.get(3))), com.dcinside.app.internal.c.b(((String)list1.get(4))), com.dcinside.app.internal.c.b(((String)list1.get(5))), "", System.currentTimeMillis()));
                    continue;
                }
                case 8: {
                    if(!L.g("cA==", list1.get(7))) {
                        continue;
                    }
                    arrayList0.add(new k(com.dcinside.app.internal.c.b(((String)list1.get(0))), com.dcinside.app.internal.c.b(((String)list1.get(1))), Integer.parseInt(com.dcinside.app.internal.c.b(((String)list1.get(2)))), com.dcinside.app.internal.c.b(((String)list1.get(3))), com.dcinside.app.internal.c.b(((String)list1.get(4))), com.dcinside.app.internal.c.b(((String)list1.get(5))), com.dcinside.app.internal.c.b(((String)list1.get(6))), System.currentTimeMillis()));
                    continue;
                }
                case 10: {
                    if(L.g("dg==", list1.get(9))) {
                        break;
                    }
                    continue;
                }
                default: {
                    continue;
                }
            }
            arrayList1.add(new w(com.dcinside.app.internal.c.b(((String)list1.get(0))), com.dcinside.app.internal.c.b(((String)list1.get(1))), Integer.parseInt(com.dcinside.app.internal.c.b(((String)list1.get(2)))), com.dcinside.app.internal.c.b(((String)list1.get(3))), com.dcinside.app.internal.c.b(((String)list1.get(4))), com.dcinside.app.internal.c.b(((String)list1.get(5))), com.dcinside.app.internal.c.b(((String)list1.get(6))), System.currentTimeMillis(), com.dcinside.app.internal.c.b(((String)list1.get(7))), com.dcinside.app.internal.c.b(((String)list1.get(8)))));
        }
        return new s(new ArrayList(), new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), arrayList0, arrayList1, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), v, s);
    }

    @l
    public final Uri j(@l File file0, @l String s, boolean z, @l A3.a a0) throws Exception {
        Long long0;
        Uri uri1;
        L.p(file0, "toDir");
        L.p(s, "name");
        L.p(a0, "getter");
        FileOutputStream fileOutputStream0 = null;
        if(Build.VERSION.SDK_INT >= 29) {
            Context context0 = Application.e.c();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("_display_name", s);
            contentValues0.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/dcinside");
            contentValues0.put("mime_type", "text/plain");
            ContentResolver contentResolver0 = context0.getContentResolver();
            if(z) {
                L.m(contentResolver0);
                Uri uri0 = this.a(contentResolver0, s);
                if(uri0 != null) {
                    contentResolver0.delete(uri0, null, null);
                }
                uri1 = contentResolver0.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
                uri1.getClass();
                try {
                    String s1 = uri1.getLastPathSegment();
                    long0 = null;
                    if(s1 != null) {
                        L.m(s1);
                        long0 = v.d1(s1);
                    }
                }
                catch(Exception unused_ex) {
                }
                long v = long0 == null ? 0L : ((long)long0);
                dl dl0 = dl.a;
                if(dl0.F() != v) {
                    dl0.o3(v);
                }
            }
            else {
                uri1 = contentResolver0 == null ? null : contentResolver0.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
                uri1.getClass();
            }
            OutputStream outputStream0 = contentResolver0.openOutputStream(uri1);
            if(outputStream0 != null) {
                try {
                    g.k(a0, outputStream0);
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(outputStream0, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(outputStream0, null);
                return uri1;
            }
            return uri1;
        }
        File file1 = new File(file0, s);
        File file2 = file1.getParentFile();
        if(file2 != null && !file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Directory create failed.");
        }
        File file3 = new File(file2, file1.getName() + "_temp");
        if(file3.exists() && !file3.canWrite()) {
            throw new IOException("Can\'t write a File.");
        }
        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream(file3, false);
            try {
                g.k(a0, fileOutputStream1);
                fileOutputStream1.flush();
                fileOutputStream1.close();
            }
            catch(Throwable throwable2) {
                fileOutputStream0 = fileOutputStream1;
                throwable1 = throwable2;
                goto label_59;
            }
            if(!file3.renameTo(file1)) {
                throw new IOException("File rename failed.");
            }
            goto label_62;
        }
        catch(Throwable throwable1) {
        }
    label_59:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable1;
    label_62:
        Uri uri2 = Uri.fromFile(file1);
        L.o(uri2, "fromFile(...)");
        return uri2;
    }

    private static final void k(A3.a a0, OutputStream outputStream0) {
        com.google.gson.stream.d d0 = new com.google.gson.stream.d(new OutputStreamWriter(new Base64OutputStream(outputStream0, 2), "UTF-8"));
        Object object0 = a0.invoke();
        uk.a.I(object0, s.class, d0);
        d0.close();
    }

    private final a l(com.dcinside.app.realm.d d0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: d0.S5()) {
            String s = ((com.dcinside.app.realm.c)object0).R5();
            if(s != null) {
                arrayList0.add(s);
            }
        }
        return new a(d0.Y5(), ((String[])arrayList0.toArray(new String[0])));
    }

    private final c m(e e0) {
        String s = e0.T5();
        return s == null ? null : new c(s, e0.Y5(), e0.Z5(), ((String[])e0.X5().toArray(new String[0])), ((String[])e0.U5().toArray(new String[0])), ((String[])e0.W5().toArray(new String[0])), ((String[])e0.V5().toArray(new String[0])));
    }

    private final d n(f f0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: f0.Q5()) {
            arrayList0.add(new V.e(((com.dcinside.app.realm.g)object0).Q5(), ""));
        }
        return new d(f0.S5(), "", "", ((V.e[])arrayList0.toArray(new V.e[0])), f0.U5());
    }

    private final V.f o(m m0) {
        String s = m0.R5();
        String s1 = m0.R5();
        if(s1 == null) {
            return null;
        }
        String s2 = m0.S5();
        if(s2 == null) {
            s2 = "";
        }
        return new V.f("0" + s, s1, s2, m0.T5(), m0.Q5());
    }

    private final V.g p(o o0) {
        String s9;
        String s7;
        String s5;
        String s3;
        String s = o0.Q5();
        if(s == null) {
            return null;
        }
        String s1 = o0.R5();
        if(s1 == null) {
            return null;
        }
        r r0 = o0.S5();
        boolean z = r0 == null ? false : r0.S5();
        r r1 = o0.S5();
        boolean z1 = r1 == null ? false : r1.Q5();
        r r2 = o0.S5();
        if(r2 == null) {
            s3 = "";
        }
        else {
            String s2 = r2.U5();
            s3 = s2 == null ? "" : s2;
        }
        r r3 = o0.S5();
        if(r3 == null) {
            s5 = "";
        }
        else {
            String s4 = r3.T5();
            s5 = s4 == null ? "" : s4;
        }
        r r4 = o0.S5();
        if(r4 == null) {
            s7 = "";
        }
        else {
            String s6 = r4.W5();
            s7 = s6 == null ? "" : s6;
        }
        r r5 = o0.S5();
        if(r5 == null) {
            s9 = "";
        }
        else {
            String s8 = r5.V5();
            s9 = s8 == null ? "" : s8;
        }
        r r6 = o0.S5();
        if(r6 != null) {
            String s10 = r6.R5();
            return s10 == null ? new V.g(s, s1, z, z1, s3, s5, s7, s9, "") : new V.g(s, s1, z, z1, s3, s5, s7, s9, s10);
        }
        return new V.g(s, s1, z, z1, s3, s5, s7, s9, "");
    }

    private final h q(y y0) {
        String s = y0.Q5();
        if(s == null) {
            s = "";
        }
        return new h(s, y0.R5(), y0.S5(), ((String[])y0.T5().toArray(new String[0])));
    }

    private final j r(com.dcinside.app.memo.n n0) {
        String s = n0.Q5();
        if(s == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(Object object0: n0.R5()) {
            String s1 = ((com.dcinside.app.memo.q)object0).S5();
            String s2 = "";
            if(s1 == null) {
                s1 = "";
            }
            arrayList0.add(s1);
            String s3 = ((com.dcinside.app.memo.q)object0).R5();
            if(s3 == null) {
                s3 = "";
            }
            arrayList1.add(s3);
            String s4 = ((com.dcinside.app.memo.q)object0).Q5();
            if(s4 != null) {
                s2 = s4;
            }
            arrayList2.add(s2);
        }
        return new j(s, ((String[])arrayList0.toArray(new String[0])), ((String[])arrayList1.toArray(new String[0])), ((String[])arrayList2.toArray(new String[0])));
    }

    private final k s(d0 d00) {
        String s = d00.U5();
        if(s == null) {
            return null;
        }
        String s1 = d00.V5();
        String s2 = s1 == null ? "" : s1;
        int v = d00.X5();
        String s3 = d00.Y5();
        String s4 = s3 == null ? "" : s3;
        String s5 = d00.S5();
        String s6 = s5 == null ? "" : s5;
        String s7 = d00.a6();
        String s8 = s7 == null ? "" : s7;
        com.dcinside.app.realm.c c0 = d00.T5();
        if(c0 != null) {
            String s9 = c0.R5();
            return s9 == null ? new k(s, s2, v, s4, s6, s8, "", d00.Z5()) : new k(s, s2, v, s4, s6, s8, s9, d00.Z5());
        }
        return new k(s, s2, v, s4, s6, s8, "", d00.Z5());
    }

    private final n t(com.dcinside.app.realm.s0 s00) {
        String s = s00.R5();
        if(s == null) {
            return null;
        }
        String s1 = s00.S5();
        return s1 == null ? null : new n(s, s1, s00.W5(), s00.T5(), s00.U5());
    }

    @l
    public final p u(@l g0 g00) {
        L.p(g00, "<this>");
        T0 t00 = g00.R5();
        ArrayList arrayList0 = new ArrayList(u.b0(t00, 10));
        for(Object object0: t00) {
            L.m(((h0)object0));
            arrayList0.add(g.a.v(((h0)object0)));
        }
        q[] arr_q = (q[])arrayList0.toArray(new q[0]);
        return new p(g00.S5(), g00.Q5(), arr_q);
    }

    private final q v(h0 h00) {
        return new q(h00.Q5(), h00.R5(), h00.T5(), h00.V5(), h00.S5(), h00.W5(), h00.U5());
    }

    private final t w(com.dcinside.app.dccon.setting.tag.a a0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: a0.Q5()) {
            arrayList0.add(new V.u(((com.dcinside.app.dccon.setting.tag.b)object0).S5(), ""));
        }
        return new t(a0.R5(), ((V.u[])arrayList0.toArray(new V.u[0])));
    }

    private final w x(A0 a00) {
        String s7;
        String s = a00.W5();
        if(s == null) {
            return null;
        }
        String s1 = a00.S5();
        if(s1 == null) {
            return null;
        }
        String s2 = a00.T5();
        int v = a00.V5();
        String s3 = a00.X5();
        String s4 = a00.Q5();
        String s5 = a00.Z5();
        com.dcinside.app.realm.c c0 = a00.R5();
        if(c0 == null) {
            s7 = "";
        }
        else {
            String s6 = c0.R5();
            s7 = s6 == null ? "" : s6;
        }
        long v1 = a00.Y5();
        String s8 = a00.U5();
        if(s8 == null) {
            s8 = "";
        }
        return new w(s1, (s2 == null ? "" : s2), v, (s3 == null ? "" : s3), (s4 == null ? "" : s4), (s5 == null ? "" : s5), s7, v1, s, s8);
    }

    private final com.dcinside.app.dccon.setting.tag.a y(t t0, F0 f00) {
        String s3;
        String s1;
        com.dcinside.app.dccon.setting.tag.a a0 = com.dcinside.app.dccon.setting.tag.a.f.e(f00, t0.b());
        if(a0 == null) {
            com.dcinside.app.dccon.setting.tag.a a1 = new com.dcinside.app.dccon.setting.tag.a();
            a1.T5(t0.b());
            a1.S5(new T0());
            V.u[] arr_u = t0.a();
            for(int v = 0; v < arr_u.length; ++v) {
                V.u u0 = arr_u[v];
                T0 t00 = a1.Q5();
                com.dcinside.app.dccon.setting.tag.b b0 = new com.dcinside.app.dccon.setting.tag.b();
                b0.X5(t0.b());
                b0.W5((u0 == null ? 0 : u0.b()));
                if(u0 == null) {
                    s1 = "";
                }
                else {
                    String s = u0.a();
                    if(s != null) {
                        s1 = s;
                    }
                }
                b0.U5(s1);
                t00.add(b0);
            }
            return a1;
        }
        V.u[] arr_u1 = t0.a();
        for(int v1 = 0; v1 < arr_u1.length; ++v1) {
            V.u u1 = arr_u1[v1];
            T0 t01 = a0.Q5();
            if(t01.x4().f0("detailIdx", (u1 == null ? null : u1.b())).N() <= 0L) {
                com.dcinside.app.dccon.setting.tag.b b1 = new com.dcinside.app.dccon.setting.tag.b();
                b1.X5(t0.b());
                b1.W5((u1 == null ? 0 : u1.b()));
                if(u1 == null) {
                    s3 = "";
                }
                else {
                    String s2 = u1.a();
                    if(s2 != null) {
                        s3 = s2;
                    }
                }
                b1.U5(s3);
                t01.add(b1);
            }
        }
        return a0;
    }

    private final com.dcinside.app.realm.d z(a a0, F0 f00) {
        com.dcinside.app.realm.d d0 = com.dcinside.app.realm.d.f.c(f00, a0.b());
        String[] arr_s = a0.a();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            com.dcinside.app.realm.d.a d$a0 = com.dcinside.app.realm.d.f;
            if(!d$a0.f(f00, a0.b(), s)) {
                T0 t00 = d0.S5();
                com.dcinside.app.realm.c c0 = new com.dcinside.app.realm.c();
                c0.T5(d$a0.e());
                c0.U5(s);
                t00.add(c0);
            }
        }
        return d0;
    }
}

