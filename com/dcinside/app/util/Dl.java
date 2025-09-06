package com.dcinside.app.util;

import com.dcinside.app.post.j0.a;
import com.dcinside.app.read.P0;
import com.dcinside.app.settings.spoiler.c;
import com.dcinside.app.type.B;
import com.dcinside.app.type.C;
import com.dcinside.app.type.F;
import com.dcinside.app.type.J;
import com.dcinside.app.type.P;
import com.dcinside.app.type.g;
import com.dcinside.app.type.j;
import com.dcinside.app.type.p;
import com.dcinside.app.type.q;
import com.dcinside.app.type.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nPot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pot.kt\ncom/dcinside/app/util/Pot\n+ 2 PotCore.kt\ncom/dcinside/app/util/PotCore\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1377:1\n53#2:1378\n58#2,2:1379\n33#2:1381\n38#2,2:1382\n33#2:1384\n38#2,2:1385\n33#2:1387\n38#2,2:1388\n53#2:1390\n58#2,2:1391\n53#2:1393\n58#2,2:1394\n53#2:1396\n58#2,2:1397\n53#2:1399\n58#2,2:1400\n33#2:1402\n38#2,2:1403\n33#2:1405\n38#2,2:1406\n33#2:1408\n38#2,2:1409\n53#2:1411\n58#2,2:1412\n53#2:1414\n58#2,2:1415\n23#2:1417\n28#2,2:1418\n53#2:1420\n58#2,2:1421\n33#2:1423\n38#2,2:1424\n53#2:1426\n58#2,2:1427\n33#2:1429\n38#2,2:1430\n33#2:1432\n38#2,2:1433\n53#2:1435\n58#2,2:1436\n23#2:1438\n28#2,2:1439\n43#2:1441\n48#2,2:1442\n33#2:1444\n38#2,2:1445\n33#2:1447\n38#2,2:1448\n33#2:1450\n38#2,2:1451\n23#2:1453\n28#2,2:1455\n23#2:1457\n28#2,2:1458\n23#2:1460\n28#2,2:1461\n33#2:1463\n38#2,2:1464\n53#2:1466\n58#2,2:1467\n53#2:1469\n58#2,2:1470\n33#2:1472\n38#2,2:1473\n33#2:1475\n38#2,2:1476\n53#2:1478\n58#2,2:1479\n53#2:1481\n58#2,2:1482\n23#2:1484\n28#2,2:1485\n23#2:1487\n28#2,2:1488\n53#2:1490\n58#2,2:1491\n53#2:1493\n58#2,2:1494\n53#2:1496\n58#2,2:1497\n53#2:1499\n58#2,2:1500\n53#2:1502\n58#2,2:1503\n53#2:1505\n58#2,2:1506\n33#2:1508\n38#2,2:1509\n53#2:1511\n58#2,2:1512\n53#2:1514\n58#2,2:1515\n43#2:1517\n48#2,2:1518\n33#2:1520\n38#2,2:1521\n43#2:1523\n48#2,2:1524\n53#2:1526\n58#2,2:1527\n33#2:1529\n38#2,2:1530\n33#2:1532\n38#2,2:1533\n23#2:1535\n28#2,2:1536\n23#2:1538\n28#2,2:1539\n23#2:1541\n28#2,2:1542\n23#2:1544\n28#2,2:1545\n23#2:1547\n28#2,2:1548\n23#2:1550\n28#2,2:1551\n23#2:1553\n28#2,2:1554\n53#2:1556\n58#2,2:1557\n43#2:1559\n106#2:1560\n110#2:1561\n48#2,2:1562\n53#2:1564\n58#2,2:1565\n23#2:1567\n28#2,2:1568\n53#2:1570\n58#2,2:1571\n53#2:1573\n58#2,2:1574\n53#2:1576\n58#2,2:1577\n53#2:1579\n58#2,2:1580\n53#2:1582\n58#2,2:1583\n23#2:1585\n28#2,2:1586\n23#2:1588\n28#2,2:1589\n23#2:1591\n28#2,2:1592\n23#2:1594\n28#2,2:1595\n23#2:1597\n28#2,2:1598\n23#2:1600\n28#2,2:1601\n43#2:1603\n48#2,2:1604\n23#2:1606\n28#2,2:1607\n53#2:1609\n58#2,2:1610\n53#2:1612\n58#2,2:1613\n53#2:1615\n58#2,2:1616\n23#2:1618\n28#2,2:1619\n53#2:1621\n58#2,2:1622\n53#2:1624\n58#2,2:1625\n53#2:1627\n58#2,2:1628\n33#2:1630\n38#2,2:1631\n33#2:1633\n38#2,2:1634\n53#2:1636\n58#2,2:1637\n53#2:1639\n58#2,2:1640\n23#2:1642\n28#2,2:1643\n53#2:1645\n58#2,2:1646\n23#2:1648\n28#2,2:1649\n23#2:1651\n28#2,2:1652\n53#2:1654\n58#2,2:1655\n53#2:1657\n58#2,2:1658\n53#2:1660\n58#2,2:1661\n53#2:1663\n58#2,2:1664\n53#2:1666\n58#2,2:1667\n53#2:1669\n58#2,2:1670\n53#2:1672\n58#2,2:1673\n23#2:1675\n28#2,2:1676\n23#2:1678\n28#2,2:1679\n53#2:1681\n58#2,2:1682\n53#2:1684\n58#2,2:1685\n53#2:1687\n58#2,2:1688\n53#2:1690\n58#2,2:1691\n53#2:1693\n58#2,2:1694\n53#2:1696\n58#2,2:1697\n53#2:1699\n58#2,2:1700\n53#2:1702\n58#2,2:1703\n53#2:1705\n58#2,2:1706\n53#2:1708\n58#2,2:1709\n53#2:1711\n58#2,2:1712\n23#2:1714\n28#2,2:1715\n23#2:1717\n28#2,2:1718\n53#2:1720\n58#2,2:1721\n53#2:1723\n58#2,2:1724\n53#2:1726\n58#2,2:1727\n23#2:1729\n28#2,2:1730\n23#2:1732\n28#2,2:1733\n53#2:1735\n58#2,2:1736\n53#2:1738\n58#2,2:1739\n53#2:1741\n58#2,2:1742\n53#2:1744\n58#2,2:1745\n23#2:1747\n28#2,2:1748\n23#2:1750\n28#2,2:1751\n23#2:1753\n28#2,2:1754\n53#2:1756\n58#2,2:1757\n53#2:1759\n58#2,2:1760\n53#2:1762\n58#2,2:1763\n53#2:1765\n58#2,2:1766\n23#2:1768\n28#2,2:1769\n43#2:1771\n48#2,2:1772\n43#2:1774\n48#2,2:1775\n53#2:1777\n58#2,2:1778\n53#2:1780\n58#2,2:1781\n53#2:1783\n58#2,2:1784\n43#2:1786\n48#2,2:1787\n43#2:1789\n48#2,2:1790\n53#2:1792\n58#2,2:1793\n53#2:1795\n58#2,2:1796\n53#2:1798\n58#2,2:1799\n23#2:1801\n28#2,2:1802\n53#2:1804\n58#2,2:1805\n53#2:1807\n58#2,2:1808\n53#2:1810\n58#2,2:1811\n53#2:1813\n58#2,2:1814\n53#2:1816\n58#2,2:1817\n43#2:1819\n48#2,2:1820\n83#2,5:1822\n93#2,6:1827\n53#2:1833\n58#2,2:1834\n53#2:1836\n58#2,2:1837\n43#2:1839\n48#2,2:1840\n23#2:1842\n28#2,2:1843\n43#2:1845\n48#2,2:1846\n33#2:1848\n38#2,2:1849\n43#2:1851\n48#2,2:1852\n53#2:1854\n58#2,2:1855\n23#2:1857\n28#2,2:1858\n23#2:1860\n28#2,2:1861\n53#2:1863\n58#2,2:1864\n53#2:1866\n58#2,2:1867\n53#2:1869\n58#2,2:1870\n53#2:1872\n58#2,2:1873\n53#2:1875\n58#2,2:1876\n53#2:1878\n58#2,2:1879\n53#2:1881\n58#2,2:1882\n53#2:1884\n58#2,2:1885\n53#2:1887\n58#2,2:1888\n43#2:1890\n48#2,2:1904\n43#2:1906\n48#2,2:1907\n53#2:1909\n58#2,2:1910\n23#2:1912\n28#2,2:1913\n23#2:1915\n28#2,2:1916\n33#2:1918\n38#2,2:1919\n43#2:1921\n48#2,2:1935\n53#2:1937\n58#2,2:1938\n1#3:1454\n1#3:1901\n1#3:1932\n1611#4,9:1891\n1863#4:1900\n1864#4:1902\n1620#4:1903\n1611#4,9:1922\n1863#4:1931\n1864#4:1933\n1620#4:1934\n*S KotlinDebug\n*F\n+ 1 Pot.kt\ncom/dcinside/app/util/Pot\n*L\n38#1:1378\n39#1:1379,2\n45#1:1381\n46#1:1382,2\n52#1:1384\n53#1:1385,2\n59#1:1387\n60#1:1388,2\n66#1:1390\n67#1:1391,2\n73#1:1393\n74#1:1394,2\n80#1:1396\n81#1:1397,2\n87#1:1399\n88#1:1400,2\n95#1:1402\n96#1:1403,2\n103#1:1405\n104#1:1406,2\n111#1:1408\n112#1:1409,2\n118#1:1411\n119#1:1412,2\n125#1:1414\n126#1:1415,2\n132#1:1417\n133#1:1418,2\n139#1:1420\n140#1:1421,2\n146#1:1423\n147#1:1424,2\n153#1:1426\n154#1:1427,2\n160#1:1429\n161#1:1430,2\n167#1:1432\n168#1:1433,2\n174#1:1435\n175#1:1436,2\n181#1:1438\n182#1:1439,2\n190#1:1441\n192#1:1442,2\n200#1:1444\n202#1:1445,2\n210#1:1447\n212#1:1448,2\n219#1:1450\n220#1:1451,2\n226#1:1453\n227#1:1455,2\n233#1:1457\n234#1:1458,2\n241#1:1460\n242#1:1461,2\n248#1:1463\n249#1:1464,2\n255#1:1466\n256#1:1467,2\n262#1:1469\n263#1:1470,2\n269#1:1472\n270#1:1473,2\n278#1:1475\n279#1:1476,2\n287#1:1478\n288#1:1479,2\n296#1:1481\n297#1:1482,2\n303#1:1484\n304#1:1485,2\n310#1:1487\n311#1:1488,2\n317#1:1490\n318#1:1491,2\n324#1:1493\n325#1:1494,2\n331#1:1496\n332#1:1497,2\n338#1:1499\n339#1:1500,2\n345#1:1502\n346#1:1503,2\n352#1:1505\n353#1:1506,2\n358#1:1508\n359#1:1509,2\n367#1:1511\n368#1:1512,2\n374#1:1514\n375#1:1515,2\n378#1:1517\n379#1:1518,2\n382#1:1520\n383#1:1521,2\n386#1:1523\n387#1:1524,2\n390#1:1526\n391#1:1527,2\n397#1:1529\n398#1:1530,2\n404#1:1532\n405#1:1533,2\n411#1:1535\n412#1:1536,2\n419#1:1538\n420#1:1539,2\n426#1:1541\n427#1:1542,2\n433#1:1544\n434#1:1545,2\n463#1:1547\n464#1:1548,2\n470#1:1550\n471#1:1551,2\n478#1:1553\n479#1:1554,2\n485#1:1556\n486#1:1557,2\n494#1:1559\n494#1:1560\n495#1:1561\n495#1:1562,2\n502#1:1564\n503#1:1565,2\n512#1:1567\n513#1:1568,2\n519#1:1570\n520#1:1571,2\n526#1:1573\n527#1:1574,2\n533#1:1576\n534#1:1577,2\n540#1:1579\n541#1:1580,2\n547#1:1582\n548#1:1583,2\n557#1:1585\n558#1:1586,2\n568#1:1588\n569#1:1589,2\n575#1:1591\n576#1:1592,2\n584#1:1594\n585#1:1595,2\n591#1:1597\n592#1:1598,2\n598#1:1600\n599#1:1601,2\n605#1:1603\n606#1:1604,2\n614#1:1606\n615#1:1607,2\n622#1:1609\n623#1:1610,2\n629#1:1612\n630#1:1613,2\n636#1:1615\n637#1:1616,2\n644#1:1618\n645#1:1619,2\n651#1:1621\n652#1:1622,2\n658#1:1624\n659#1:1625,2\n665#1:1627\n666#1:1628,2\n672#1:1630\n673#1:1631,2\n681#1:1633\n682#1:1634,2\n689#1:1636\n690#1:1637,2\n696#1:1639\n697#1:1640,2\n704#1:1642\n705#1:1643,2\n711#1:1645\n712#1:1646,2\n720#1:1648\n721#1:1649,2\n728#1:1651\n729#1:1652,2\n736#1:1654\n737#1:1655,2\n744#1:1657\n745#1:1658,2\n752#1:1660\n753#1:1661,2\n760#1:1663\n761#1:1664,2\n767#1:1666\n768#1:1667,2\n774#1:1669\n775#1:1670,2\n781#1:1672\n782#1:1673,2\n788#1:1675\n789#1:1676,2\n795#1:1678\n796#1:1679,2\n802#1:1681\n803#1:1682,2\n809#1:1684\n810#1:1685,2\n817#1:1687\n818#1:1688,2\n824#1:1690\n825#1:1691,2\n831#1:1693\n832#1:1694,2\n838#1:1696\n839#1:1697,2\n845#1:1699\n846#1:1700,2\n852#1:1702\n853#1:1703,2\n859#1:1705\n860#1:1706,2\n866#1:1708\n867#1:1709,2\n873#1:1711\n874#1:1712,2\n880#1:1714\n881#1:1715,2\n887#1:1717\n888#1:1718,2\n894#1:1720\n895#1:1721,2\n901#1:1723\n902#1:1724,2\n908#1:1726\n909#1:1727,2\n916#1:1729\n917#1:1730,2\n924#1:1732\n925#1:1733,2\n931#1:1735\n932#1:1736,2\n938#1:1738\n939#1:1739,2\n945#1:1741\n946#1:1742,2\n952#1:1744\n953#1:1745,2\n959#1:1747\n960#1:1748,2\n966#1:1750\n967#1:1751,2\n974#1:1753\n981#1:1754,2\n988#1:1756\n989#1:1757,2\n995#1:1759\n996#1:1760,2\n1002#1:1762\n1003#1:1763,2\n1009#1:1765\n1010#1:1766,2\n1016#1:1768\n1017#1:1769,2\n1023#1:1771\n1024#1:1772,2\n1030#1:1774\n1031#1:1775,2\n1037#1:1777\n1038#1:1778,2\n1044#1:1780\n1045#1:1781,2\n1051#1:1783\n1052#1:1784,2\n1058#1:1786\n1059#1:1787,2\n1065#1:1789\n1066#1:1790,2\n1073#1:1792\n1074#1:1793,2\n1080#1:1795\n1081#1:1796,2\n1087#1:1798\n1088#1:1799,2\n1094#1:1801\n1095#1:1802,2\n1101#1:1804\n1102#1:1805,2\n1108#1:1807\n1109#1:1808,2\n1115#1:1810\n1116#1:1811,2\n1122#1:1813\n1123#1:1814,2\n1129#1:1816\n1130#1:1817,2\n1136#1:1819\n1137#1:1820,2\n1143#1:1822,5\n1144#1:1827,6\n1151#1:1833\n1152#1:1834,2\n1158#1:1836\n1159#1:1837,2\n1166#1:1839\n1167#1:1840,2\n1173#1:1842\n1174#1:1843,2\n1180#1:1845\n1181#1:1846,2\n1187#1:1848\n1188#1:1849,2\n1194#1:1851\n1195#1:1852,2\n1201#1:1854\n1202#1:1855,2\n1208#1:1857\n1209#1:1858,2\n1215#1:1860\n1216#1:1861,2\n1222#1:1863\n1223#1:1864,2\n1229#1:1866\n1230#1:1867,2\n1236#1:1869\n1237#1:1870,2\n1243#1:1872\n1244#1:1873,2\n1250#1:1875\n1251#1:1876,2\n1257#1:1878\n1258#1:1879,2\n1264#1:1881\n1265#1:1882,2\n1271#1:1884\n1272#1:1885,2\n1279#1:1887\n1280#1:1888,2\n1286#1:1890\n1297#1:1904,2\n1304#1:1906\n1308#1:1907,2\n1315#1:1909\n1319#1:1910,2\n1326#1:1912\n1330#1:1913,2\n1338#1:1915\n1342#1:1916,2\n1349#1:1918\n1353#1:1919,2\n1360#1:1921\n1366#1:1935,2\n1374#1:1937\n1375#1:1938,2\n1287#1:1901\n1361#1:1932\n1287#1:1891,9\n1287#1:1900\n1287#1:1902\n1287#1:1903\n1361#1:1922,9\n1361#1:1931\n1361#1:1933\n1361#1:1934\n*E\n"})
public final class dl extends el {
    @l
    public static final dl a = null;
    @l
    private static final String b = "MustRead";
    @l
    private static final String c = "DcconRecentTagKey";

    static {
        dl.a = new dl();
    }

    public final boolean A() {
        return ll.a.getBoolean("aiResampleGuide", false);
    }

    public final int A0() {
        return ll.a.getInt("imagePickerTab", 0);
    }

    public final boolean A1() {
        return ll.a.getBoolean("quickWriteHideGuide", false);
    }

    public final boolean A2() {
        return ll.a.getBoolean("useGalleryNickname", true);
    }

    public final void A3(boolean z) {
        ll.a.edit().putBoolean("blockDcconHide", z).apply();
    }

    public final void A4(int v) {
        ll.a.edit().putInt("lastSelectedDcconIdx", v).apply();
    }

    public final void A5(int v) {
        ll.a.edit().putInt("recentDisplayCount", v).apply();
    }

    public final long B() {
        return ll.a.getLong("ArchivePostLastChooseFolder", -1L);
    }

    public final int B0() {
        return ll.a.getInt("imageWatermarkGuideCount", 0);
    }

    public final boolean B1() {
        return ll.a.getBoolean("quickWriteSettingPopup", false);
    }

    public final boolean B2() {
        return ll.a.getBoolean("useImageWatermark", true);
    }

    public final void B3(boolean z) {
        ll.a.edit().putBoolean("isBlockDcconListExpand", z).apply();
    }

    public final void B4(@l p p0) {
        L.p(p0, "value");
        ll.a.edit().putInt("lastSelectedMainDcBest", p0.d()).apply();
    }

    public final void B5(@l F f0) {
        L.p(f0, "value");
        ll.a.edit().putInt("RecentMode", f0.c()).apply();
    }

    @k(message = "글 보관함 최근 사용 폴더 방식이 변경되어 사용되지 않음")
    public static void C() {
    }

    @k(message = "가이드 표시 제거되어 사용안함")
    public static void C0() {
    }

    public final int C1() {
        return ll.a.getInt("quickWriteViewType", C.b.c());
    }

    public final boolean C2() {
        return ll.a.getBoolean("useQuickWrite", true);
    }

    public final void C3(boolean z) {
        ll.a.edit().putBoolean("isBlockImageListExpand", z).apply();
    }

    public final void C4(@l q q0) {
        L.p(q0, "value");
        ll.a.edit().putInt("lastSelectedMainDcBestSort", q0.d()).apply();
    }

    public final void C5(boolean z) {
        ll.a.edit().putBoolean("recentSaveSearch", z).apply();
    }

    public final long D() {
        return ll.a.getLong("ArchiveVoiceLastChooseFolder", -1L);
    }

    public final long D0() {
        return ll.a.getLong("keywordPopupDateTime", 0L);
    }

    public final int D1() {
        return ll.a.getInt("readBestBoxStatus", 0);
    }

    public final long D2() {
        return ll.a.getLong("webContentCrashTimeMs", 0L);
    }

    public final void D3(boolean z) {
        ll.a.edit().putBoolean("blockPostImageEnable", z).apply();
    }

    public final void D4(long v) {
        ll.a.edit().putLong("launcherCustomIcon", v).apply();
    }

    public final void D5(@l String s, @m String s1) {
        L.p(s, "userId");
        ll.a.edit().putString("DcconRecentTagKey + " + s, s1).apply();
    }

    @k(message = "글 보관함 최근 사용 폴더 방식이 변경되어 사용되지 않음")
    public static void E() {
    }

    public final int E0() {
        return ll.a.getInt("lastAlbumsSortType", 0);
    }

    public final long E1() {
        return ll.a.getLong("ReadCount", 0L);
    }

    @m
    public final String E2() {
        return ll.a.getString("wordFilterEditList", null);
    }

    public final void E3(boolean z) {
        ll.a.edit().putBoolean("blockPostImageHide", z).apply();
    }

    public final void E4(int v) {
        ll.a.edit().putInt("listContentsMode", v).apply();
    }

    public final void E5(long v) {
        ll.a.edit().putLong("remoteConfigInitMs", v).apply();
    }

    public final long F() {
        return ll.a.getLong("autoBackupMediaStoreId", 0L);
    }

    @l
    public final String F0() {
        String s = ll.a.getString("lastCopiedUrl", "");
        return s == null ? "" : s;
    }

    @k(message = "ReadLog 를 사용하도록 기능이 변경되어 필요없어진 설정값.")
    public static void F1() {
    }

    public final boolean F2() {
        return ll.a.getBoolean("wordFilterGuideShown", false);
    }

    public final void F3(boolean z) {
        ll.a.edit().putBoolean("isBlockReportListExpand", z).apply();
    }

    public final void F4(int v) {
        ll.a.edit().putInt("listContentsModeDcBest", v).apply();
    }

    public final void F5(boolean z) {
        ll.a.edit().putBoolean("replyInputHintGuideSkip", z).apply();
    }

    public final boolean G() {
        return ll.a.getBoolean("backupAutoEnable", true);
    }

    public final int G0() {
        return ll.a.getInt("lastImagesSortType", 0);
    }

    public final int G1() {
        return ll.a.getInt("readImgNoteDisplayOption", 0);
    }

    public final boolean G2() {
        return ll.a.getBoolean("isAlbumGridMode", false);
    }

    public final void G3(int v) {
        ll.a.edit().putInt("boardType", v).apply();
    }

    public final void G4(boolean z) {
        ll.a.edit().putBoolean("listContentsModeGuideHitNew", z).apply();
    }

    public final void G5(@l P0 p00) {
        L.p(p00, "value");
        ll.a.edit().putInt("replyInputHintType", p00.c()).apply();
    }

    public final long H() {
        return ll.a.getLong("ArchiveBackupAutoTime", 0L);
    }

    public final long H0() {
        return ll.a.getLong("lastReplySort", 0L);
    }

    public final int H1() {
        return ll.a.getInt("readLogOption", 0);
    }

    public final boolean H2() {
        return ll.a.getBoolean("isAutoImageAddBalloonShown", false);
    }

    public final void H3(int v) {
        ll.a.edit().putInt("colorPickerLastTabType", v).apply();
    }

    public final void H4(boolean z) {
        ll.a.edit().putBoolean("listContentsModeGuideLiveBestNew", z).apply();
    }

    public final void H5(@l j j0) {
        L.p(j0, "value");
        ll.a.edit().putInt("ReplyTextSize", j0.d()).apply();
    }

    public final boolean I() {
        return ll.a.getBoolean("bestReplyFilterEnable", false);
    }

    public final int I0() {
        return ll.a.getInt("lastSelectedDcconIdx", -1);
    }

    public final boolean I1() {
        return ll.a.getBoolean("readLogOptionAllow", false);
    }

    public final boolean I2() {
        return ll.a.getBoolean("isAutoImageBalloonShown", false);
    }

    public final void I3(@l String s) {
        L.p(s, "value");
        ll.a.edit().putString("colorPickerRecentColors", s).apply();
    }

    public final void I4(@l j j0) {
        L.p(j0, "value");
        ll.a.edit().putInt("ListTextSize", j0.d()).apply();
    }

    public final void I5(boolean z) {
        ll.a.edit().putBoolean("reportGuide", z).apply();
    }

    public final long J(@l String s) {
        L.p(s, "realId");
        return ll.a.getLong("bigDcconExpireTime|" + s, 0L);
    }

    @l
    public final p J0() {
        int v = ll.a.getInt("lastSelectedMainDcBest", 1);
        return p.c.a(v);
    }

    @k(message = "게시물 목록에서 설정 팝업을 표시하지 않도록 변경됨.")
    public static void J1() {
    }

    public final boolean J2() {
        return ll.a.getBoolean("isAutoImageGuideShown", false);
    }

    public final void J3(boolean z) {
        ll.a.edit().putBoolean("isCrowdExpend", z).apply();
    }

    public final void J4(long v) {
        ll.a.edit().putLong("loginActiveUserTimeMs", v).apply();
    }

    public final void J5(boolean z) {
        ll.a.edit().putBoolean("reportGuideAlert", z).apply();
    }

    @l
    public final List K() {
        String s = ll.a.getString("bigDcconLimits", null);
        if(s == null) {
            s = "";
        }
        Iterable iterable0 = v.U4(s, new char[]{','}, false, 0, 6, null);
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            Integer integer0 = v.b1(((String)object0));
            if(integer0 != null) {
                list0.add(integer0);
            }
        }
        return list0;
    }

    @l
    public final q K0() {
        int v = ll.a.getInt("lastSelectedMainDcBestSort", 0);
        return q.d.a(v);
    }

    public final boolean K1() {
        return ll.a.getBoolean("readLogOptionGuide", true);
    }

    public final boolean K2() {
        return ll.a.getBoolean("isBigDcconActive", false);
    }

    public final void K3(boolean z) {
        ll.a.edit().putBoolean("crowdExpend", z).apply();
    }

    public final void K4(long v) {
        ll.a.edit().putLong("loginAutoInactiveFailCount", v).apply();
    }

    public final void K5(@m String s) {
        ll.a.edit().putString("serverAppVersion", s).apply();
    }

    public final boolean L() {
        return ll.a.getBoolean("blockDcconEnable", true);
    }

    public final long L0() {
        return ll.a.getLong("launcherCustomIcon", 0L);
    }

    @k(message = "게시물 목록에서 설정 팝업을 표시하지 않도록 변경됨.")
    public static void L1() {
    }

    public final boolean L2() {
        return ll.a.getBoolean("isBigDcconGuideShown", false);
    }

    public final void L3(boolean z) {
        ll.a.edit().putBoolean("editProfileDialogShown", z).apply();
    }

    public final void L4(boolean z) {
        ll.a.edit().putBoolean("loginNormalCheck", z).apply();
    }

    public final void L5(boolean z) {
        ll.a.edit().putBoolean("settingDownloadVideoEnable", z).apply();
    }

    public final boolean M() {
        return ll.a.getBoolean("blockDcconHide", true);
    }

    public final int M0() {
        return ll.a.getInt("listContentsMode", 0);
    }

    @l
    public final com.dcinside.app.type.k M1() {
        int v = ll.a.getInt("ReadTextSize", 0);
        return com.dcinside.app.type.k.c.a(v);
    }

    public final boolean M2() {
        return ll.a.getBoolean("isBlockDcconListExpand", false);
    }

    public final void M3(boolean z) {
        ll.a.edit().putBoolean("enableAddUserMemoAllGallery", z).apply();
    }

    public final void M4(boolean z) {
        ll.a.edit().putBoolean("isMainHitBestReverse", z).apply();
    }

    public final void M5(int v) {
        ll.a.edit().putInt("settingImageResizeSizeType", v).apply();
    }

    public final boolean N() {
        return ll.a.getBoolean("blockPostImageEnable", true);
    }

    public final int N0() {
        return ll.a.getInt("listContentsModeDcBest", x.d.c());
    }

    public final int N1() {
        return ll.a.getInt("recentDisplayCount", 5);
    }

    public final boolean N2() {
        return ll.a.getBoolean("isBlockImageListExpand", false);
    }

    public final void N3(boolean z) {
        ll.a.edit().putBoolean("enableAddUserMemoCurrentGallery", z).apply();
    }

    public final void N4(boolean z) {
        ll.a.edit().putBoolean("membershipGuide", z).apply();
    }

    public final void N5(boolean z) {
        ll.a.edit().putBoolean("settingSlideEnable", z).apply();
    }

    public final boolean O() {
        return ll.a.getBoolean("blockPostImageHide", true);
    }

    public final boolean O0() {
        return ll.a.getBoolean("listContentsModeGuideHitNew", false);
    }

    @l
    public final F O1() {
        return ll.a.getInt("RecentMode", F.b.c()) == F.b.c() ? F.b : F.c;
    }

    public final boolean O2() {
        return ll.a.getBoolean("isBlockReportListExpand", false);
    }

    public final void O3(boolean z) {
        ll.a.edit().putBoolean("enableAiEasyMake", z).apply();
    }

    public final void O4(int v) {
        ll.a.edit().putInt("nameWebDataDirIndex", v).apply();
    }

    public final void O5(boolean z) {
        ll.a.edit().putBoolean("shieldHeadWriteGuideShown", z).apply();
    }

    public final int P() {
        return ll.a.getInt("boardType", 0);
    }

    public final boolean P0() {
        return ll.a.getBoolean("listContentsModeGuideLiveBestNew", false);
    }

    public final boolean P1() {
        return ll.a.getBoolean("recentSaveSearch", true);
    }

    public final boolean P2() {
        return ll.a.getBoolean("isCrowdExpend", false);
    }

    public final void P3(boolean z) {
        ll.a.edit().putBoolean("enableAutoSave", z).apply();
    }

    public final void P4(boolean z) {
        ll.a.edit().putBoolean("newIconSpoilerSetting", z).apply();
    }

    public final void P5(long v) {
        ll.a.edit().putLong("showArchiveBalloonCount", v).apply();
    }

    public final int Q() {
        return ll.a.getInt("colorPickerLastTabType", 0);
    }

    @l
    public final j Q0() {
        int v = ll.a.getInt("ListTextSize", 1);
        return j.d.a(v);
    }

    @m
    public final String Q1(@l String s) {
        L.p(s, "userId");
        return ll.a.getString("DcconRecentTagKey + " + s, null);
    }

    public final boolean Q2() {
        return ll.a.getBoolean("isGuideGifPlayConfig", true);
    }

    public final void Q3(boolean z) {
        ll.a.edit().putBoolean("enableReportPostBlock", z).apply();
    }

    public final void Q4(boolean z) {
        ll.a.edit().putBoolean("newIconWriteSetting", z).apply();
    }

    public final void Q5(boolean z) {
        ll.a.edit().putBoolean("simpleLoginEditGuide", z).apply();
    }

    @l
    public final String R() {
        String s = ll.a.getString("colorPickerRecentColors", null);
        return s == null ? "" : s;
    }

    public final long R0() {
        return ll.a.getLong("loginActiveUserTimeMs", 0L);
    }

    public final long R1() {
        return ll.a.getLong("remoteConfigInitMs", 0L);
    }

    public final boolean R2() {
        return ll.a.getBoolean("isMainHitBestReverse", false);
    }

    public final void R3(boolean z) {
        ll.a.edit().putBoolean("wordFilterBasic", z).apply();
    }

    public final void R4(long v) {
        ll.a.edit().putLong("IntroAlertTime", v).apply();
    }

    public final void R5(long v) {
        ll.a.edit().putLong("skipChromeVersionMs", v).apply();
    }

    public final boolean S() {
        return ll.a.getBoolean("crowdExpend", false);
    }

    public final long S0() {
        return ll.a.getLong("loginAutoInactiveFailCount", 0L);
    }

    @k(message = "원격 설정 처리 방식 변경되어 불필요해진 설정값.")
    public static void S1() {
    }

    public final boolean S2() {
        return ll.a.getBoolean("isSplitModeEnable", true);
    }

    public final void S3(boolean z) {
        ll.a.edit().putBoolean("wordFilterEdit", z).apply();
    }

    public final void S4(long v) {
        ll.a.edit().putLong("oldLauncherCustomIcon", v).apply();
    }

    public final void S5(boolean z) {
        ll.a.edit().putBoolean("skipProviderInstaller", z).apply();
    }

    public final boolean T() {
        return ll.a.getBoolean("editProfileDialogShown", false);
    }

    public final boolean T0() {
        return ll.a.getBoolean("loginNormalCheck", false);
    }

    public final boolean T1() {
        return ll.a.getBoolean("replyInputHintGuideSkip", false);
    }

    public final boolean T2() {
        return ll.a.getBoolean("isSplitModeGuide", true);
    }

    public final void T3(int v) {
        ll.a.edit().putInt("FavoriteDisplayCount", v).apply();
    }

    public final void T4(long v) {
        ll.a.edit().putLong("otpManagerGuideTime", v).apply();
    }

    public final void T5(boolean z) {
        ll.a.edit().putBoolean("isSplitModeEnable", z).apply();
    }

    public final boolean U() {
        return ll.a.getBoolean("enableAddUserMemoAllGallery", false);
    }

    public final boolean U0() {
        return ll.a.getBoolean("membershipGuide", false);
    }

    @l
    public final P0 U1() {
        int v = ll.a.getInt("replyInputHintType", P0.d.c());
        return P0.b.a(v);
    }

    public final boolean U2() {
        return ll.a.getBoolean("isSplitModeLandscapeEnable", true);
    }

    public final void U3(@m String s) {
        ll.a.edit().putString("firebaseInstanceToken", s).apply();
    }

    public final void U4(@l a j0$a0, @l String s, int v) {
        L.p(j0$a0, "option");
        L.p(s, "galleryId");
        ll.a.edit().putInt(j0$a0.d() + "Count|" + s, v).apply();
    }

    public final void U5(boolean z) {
        ll.a.edit().putBoolean("isSplitModeGuide", z).apply();
    }

    public final boolean V() {
        return ll.a.getBoolean("enableAddUserMemoCurrentGallery", true);
    }

    public final int V0() {
        return ll.a.getInt("nameWebDataDirIndex", 0);
    }

    @l
    public final j V1() {
        int v = ll.a.getInt("ReplyTextSize", 1);
        return j.d.a(v);
    }

    public final boolean V2() {
        return ll.a.getBoolean("isSplitModePortraitEnable", true);
    }

    public final void V3(boolean z) {
        ll.a.edit().putBoolean("fixReadTextSize", z).apply();
    }

    public final void V4(@l a j0$a0, @l String s, boolean z) {
        L.p(j0$a0, "option");
        L.p(s, "galleryId");
        ll.a.edit().putBoolean(j0$a0.d() + "Enable|" + s, z).apply();
    }

    public final void V5(boolean z) {
        ll.a.edit().putBoolean("isSplitModeLandscapeEnable", z).apply();
    }

    public final boolean W() {
        return ll.a.getBoolean("enableAiEasyMake", true);
    }

    public final boolean W0() {
        return ll.a.getBoolean("newIconSpoilerSetting", true);
    }

    public final boolean W1() {
        return ll.a.getBoolean("reportGuide", false);
    }

    public final boolean W2() {
        return ll.a.getBoolean("isSplitPostFullEnable", true);
    }

    public final void W3(boolean z) {
        ll.a.edit().putBoolean("forceRemoteConfig", z).apply();
    }

    public final void W4(@l String s, int v) {
        L.p(s, "galleryId");
        ll.a.edit().putInt("PostFilterType|" + s, v).apply();
    }

    public final void W5(boolean z) {
        ll.a.edit().putBoolean("isSplitModePortraitEnable", z).apply();
    }

    public final boolean X() {
        return ll.a.getBoolean("enableAutoSave", false);
    }

    public final boolean X0() {
        return ll.a.getBoolean("newIconWriteSetting", false);
    }

    public final boolean X1() {
        return ll.a.getBoolean("reportGuideAlert", false);
    }

    public final boolean X2() {
        return ll.a.getBoolean("isTempPostMaxGuideVisible", true);
    }

    public final void X3(boolean z) {
        ll.a.edit().putBoolean("gallNicknameUseGuide", z).apply();
    }

    public final void X4(boolean z) {
        ll.a.edit().putBoolean("postFullIconGuide", z).apply();
    }

    public final void X5(boolean z) {
        ll.a.edit().putBoolean("isSplitPostFullEnable", z).apply();
    }

    public final boolean Y() {
        return ll.a.getBoolean("enableReportPostBlock", false);
    }

    public final long Y0() {
        return ll.a.getLong("IntroAlertTime", 0L);
    }

    @m
    public final String Y1() {
        return ll.a.getString("serverAppVersion", null);
    }

    public final boolean Y2() {
        return ll.a.getBoolean("isUsedQuickWrite", false);
    }

    public final void Y3(@m Date date0) {
        if(date0 == null) {
            ll.a.edit().putLong("gallerPickShowDate", 0L).apply();
            return;
        }
        ll.a.edit().putLong("gallerPickShowDate", date0.getTime()).apply();
    }

    public final void Y4(boolean z) {
        ll.a.edit().putBoolean("postHistoryEnabled", z).apply();
    }

    public final void Y5(int v) {
        ll.a.edit().putInt("splitRatioIndex", v).apply();
    }

    public final boolean Z() {
        return ll.a.getBoolean("wordFilterBasic", false);
    }

    public static void Z0() {
    }

    public final boolean Z1() {
        return ll.a.getBoolean("settingDownloadVideoEnable", true);
    }

    public final boolean Z2() {
        return ll.a.getBoolean("wordFilterTypeWide", false);
    }

    public final void Z3(long v) {
        ll.a.edit().putLong("galleryInitMs2", v).apply();
    }

    public final void Z4(boolean z) {
        ll.a.edit().putBoolean("postHistoryLastLike", z).apply();
    }

    public final void Z5(boolean z) {
        ll.a.edit().putBoolean("spoilerGuideShown", z).apply();
    }

    public final boolean a0() {
        return ll.a.getBoolean("wordFilterEdit", false);
    }

    public final long a1() {
        return ll.a.getLong("oldLauncherCustomIcon", 0L);
    }

    public final int a2() {
        return ll.a.getInt("settingImageResizeSizeType", 0);
    }

    public final boolean a3() {
        return ll.a.getBoolean("isWriteChangeLoginEnable", true);
    }

    public final void a4(boolean z) {
        ll.a.edit().putBoolean("galleryPushSettingNew", z).apply();
    }

    public final void a5(boolean z) {
        ll.a.edit().putBoolean("postHistoryLastReply", z).apply();
    }

    public final void a6(int v) {
        ll.a.edit().putInt("spoilerWarnType", v).apply();
    }

    public final int b0() {
        return Math.min(ll.a.getInt("FavoriteDisplayCount", 5), 15);
    }

    public final long b1() {
        return ll.a.getLong("otpManagerGuideTime", 0L);
    }

    public final boolean b2() {
        return ll.a.getBoolean("settingSlideEnable", true);
    }

    @l
    public final List b3(@l String s) {
        L.p(s, "galleryId");
        String s1 = ll.a.getString("MustRead+" + s, null);
        if(s1 != null) {
            List list0 = v.U4(s1, new char[]{','}, false, 0, 6, null);
            if(list0 != null) {
                List list1 = new ArrayList();
                for(Object object0: list0) {
                    Integer integer0 = v.b1(((String)object0));
                    if(integer0 != null) {
                        list1.add(integer0);
                    }
                }
                return list1;
            }
        }
        return u.H();
    }

    public final void b4(int v) {
        ll.a.edit().putInt("gallerySearchSelectionType", v).apply();
    }

    public final void b5(boolean z) {
        ll.a.edit().putBoolean("postHistoryLastWrite", z).apply();
    }

    public final void b6(boolean z) {
        ll.a.edit().putBoolean("subscribeTopic_0", z).apply();
    }

    @m
    public final String c0() {
        return ll.a.getString("firebaseInstanceToken", null);
    }

    public final int c1(@l a j0$a0, @l String s) {
        L.p(j0$a0, "option");
        L.p(s, "galleryId");
        return ll.a.getInt(j0$a0.d() + "Count|" + s, j0$a0.b());
    }

    public final boolean c2() {
        return ll.a.getBoolean("shieldHeadWriteGuideShown", false);
    }

    public final void c3(@l String s, int v) {
        L.p(s, "galleryId");
        List list0 = u.Y5(this.b3(s));
        if(list0.contains(v)) {
            return;
        }
        if(list0.size() >= 20) {
            list0.remove(0);
        }
        list0.add(v);
        String s1 = u.m3(list0, ",", null, null, 0, null, null, 62, null);
        ll.a.edit().putString("MustRead+" + s, s1).apply();
    }

    public final void c4(long v) {
        ll.a.edit().putLong("GifPlayConfig", v).apply();
    }

    public final void c5(int v) {
        ll.a.edit().putInt("postImageBlockRangeType", v).apply();
    }

    public final void c6(int v) {
        ll.a.edit().putInt("SwipeSensitivity", v).apply();
    }

    public final boolean d0() {
        return ll.a.getBoolean("fixReadTextSize", false);
    }

    public final boolean d1(@l a j0$a0, @l String s) {
        L.p(j0$a0, "option");
        L.p(s, "galleryId");
        return ll.a.getBoolean(j0$a0.d() + "Enable|" + s, false);
    }

    public final long d2() {
        return ll.a.getLong("showArchiveBalloonCount", 0L);
    }

    public final void d3(boolean z) {
        ll.a.edit().putBoolean("aiImageCollapseLoraPrompt", z).apply();
    }

    public final void d4(@l String s) {
        L.p(s, "value");
        ll.a.edit().putString("guestAdultCode", s).apply();
    }

    public final void d5(boolean z) {
        ll.a.edit().putBoolean("postImageNumberCheck", z).apply();
    }

    public final void d6(boolean z) {
        ll.a.edit().putBoolean("isTempPostMaxGuideVisible", z).apply();
    }

    public final boolean e0() {
        return ll.a.getBoolean("forceRemoteConfig", false);
    }

    public final int e1(@l String s) {
        L.p(s, "galleryId");
        return ll.a.getInt("PostFilterType|" + s, 0);
    }

    @k(message = "글 보관함 안내 가이드 제거됨")
    public static void e2() {
    }

    public final void e3(boolean z) {
        ll.a.edit().putBoolean("aiImageCollapseNegativePrompt", z).apply();
    }

    public final void e4(long v) {
        ll.a.edit().putLong("guestAdultCodeExpireDate", v).apply();
    }

    public final void e5(int v) {
        ll.a.edit().putInt("postImageNumberGuideCount", v).apply();
    }

    public final void e6(boolean z) {
        ll.a.edit().putBoolean("termUseAccept", z).apply();
    }

    public final boolean f0() {
        return ll.a.getBoolean("gallNicknameUseGuide", false);
    }

    public final boolean f1() {
        return ll.a.getBoolean("postFullIconGuide", false);
    }

    public final boolean f2() {
        return ll.a.getBoolean("simpleLoginEditGuide", false);
    }

    public final void f3(@m String s) {
        ll.a.edit().putString("aiImageGuestLimitCheckDate", s).apply();
    }

    public final void f4(boolean z) {
        ll.a.edit().putBoolean("isGuideGifPlayConfig", z).apply();
    }

    public final void f5(boolean z) {
        ll.a.edit().putBoolean("postMiniMenuGuide", z).apply();
    }

    public final void f6(int v) {
        ll.a.edit().putInt("ThemeDark", v).apply();
    }

    @m
    public final Date g0() {
        long v = ll.a.getLong("gallerPickShowDate", 0L);
        return v > 0L ? new Date(v) : null;
    }

    public final boolean g1() {
        return ll.a.getBoolean("postHistoryEnabled", true);
    }

    public final long g2() {
        return ll.a.getLong("skipChromeVersionMs", 0L);
    }

    public final void g3(@m String s) {
        ll.a.edit().putString("aiImageLoginLimitCheckDate", s).apply();
    }

    public final void g4(boolean z) {
        ll.a.edit().putBoolean("guideHateWord", z).apply();
    }

    public final void g5(boolean z) {
        ll.a.edit().putBoolean("postReadWriterCheck", z).apply();
    }

    public final void g6(int v) {
        ll.a.edit().putInt("ThemeLight", v).apply();
    }

    public final long h0() {
        return ll.a.getLong("galleryInitMs2", 0L);
    }

    public final boolean h1() {
        return ll.a.getBoolean("postHistoryLastLike", false);
    }

    public final boolean h2() {
        return ll.a.getBoolean("skipProviderInstaller", false);
    }

    public final void h3(int v) {
        ll.a.edit().putInt("lastSelectModelIndex", v).apply();
    }

    public final void h4(boolean z) {
        ll.a.edit().putBoolean("guideListMenuAutoNew", z).apply();
    }

    public final void h5(boolean z) {
        ll.a.edit().putBoolean("postSeriesGuide", z).apply();
    }

    public final void h6(@l P p0) {
        L.p(p0, "value");
        ll.a.edit().putInt("themeMode", p0.d()).apply();
    }

    public final boolean i0() {
        return ll.a.getBoolean("galleryPushSettingNew", false);
    }

    public final boolean i1() {
        return ll.a.getBoolean("postHistoryLastReply", false);
    }

    public final int i2() {
        return ll.a.getInt("splitRatioIndex", J.c.c());
    }

    public final void i3(@m String s) {
        ll.a.edit().putString("aiResampleCheckDate", s).apply();
    }

    public final void i4(boolean z) {
        ll.a.edit().putBoolean("guideListMenuBlockNew", z).apply();
    }

    public final void i5(@m ArrayList arrayList0) {
        String s = arrayList0 == null ? null : uk.a.D(arrayList0);
        ll.a.edit().putString("postWriteOrderSetting", s).apply();
    }

    public final void i6(boolean z) {
        ll.a.edit().putBoolean("themeModeSystemGuide", z).apply();
    }

    public final int j0() {
        return ll.a.getInt("gallerySearchSelectionType", 0);
    }

    public final boolean j1() {
        return ll.a.getBoolean("postHistoryLastWrite", false);
    }

    public final boolean j2() {
        return ll.a.getBoolean("spoilerGuideShown", false);
    }

    public final void j3(@m String s) {
        ll.a.edit().putString("aiResampleGuestCheckDate", s).apply();
    }

    public final void j4(boolean z) {
        ll.a.edit().putBoolean("guideListMenuMemoNew", z).apply();
    }

    public final void j5(boolean z) {
        ll.a.edit().putBoolean("prNetworkDialogShown", z).apply();
    }

    public final void j6(boolean z) {
        ll.a.edit().putBoolean("unReadPushSideMenuCheck", z).apply();
    }

    public final long k0() {
        return ll.a.getLong("GifPlayConfig", 1L);
    }

    public final int k1() {
        return ll.a.getInt("postImageBlockRangeType", 0);
    }

    public final int k2() {
        return ll.a.getInt("spoilerWarnType", c.e.c());
    }

    public final void k3(boolean z) {
        ll.a.edit().putBoolean("aiResampleGuide", z).apply();
    }

    public final void k4(boolean z) {
        ll.a.edit().putBoolean("guidePinDialogShown", z).apply();
    }

    public final void k5(int v) {
        ll.a.edit().putInt("pushContentsTypeMode", v).apply();
    }

    public final void k6(@m String s) {
        ll.a.edit().putString("updateIgnoreCase", s).apply();
    }

    @l
    public final String l0() {
        String s = ll.a.getString("guestAdultCode", null);
        return s == null ? "" : s;
    }

    public final boolean l1() {
        return ll.a.getBoolean("postImageNumberCheck", true);
    }

    public final boolean l2() {
        return ll.a.getBoolean("subscribeTopic_0", true);
    }

    public final void l3(boolean z) {
        ll.a.edit().putBoolean("isAlbumGridMode", z).apply();
    }

    public final void l4(boolean z) {
        ll.a.edit().putBoolean("guidePushNoticeLikeMyPost", z).apply();
    }

    public final void l5(int v) {
        ll.a.edit().putInt("pushNoticeLastSelectedTab", v).apply();
    }

    public final void l6(long v) {
        ll.a.edit().putLong("updateIgnoreMs", v).apply();
    }

    public final long m0() {
        return ll.a.getLong("guestAdultCodeExpireDate", 0L);
    }

    public final int m1() {
        return ll.a.getInt("postImageNumberGuideCount", 0);
    }

    @k(message = "토픽 설정 방식 변경으로 불필요해진 설정값.")
    public static void m2() {
    }

    public final void m3(long v) {
        ll.a.edit().putLong("ArchivePostLastChooseFolder", v).apply();
    }

    public final void m4(boolean z) {
        ll.a.edit().putBoolean("guideUserBlockAllShown", z).apply();
    }

    public final void m5(int v) {
        ll.a.edit().putInt("pushNotificationUnreadCount", Math.max(0, v)).apply();
    }

    public final void m6(boolean z) {
        ll.a.edit().putBoolean("useGalleryNickname", z).apply();
    }

    public final boolean n0() {
        return ll.a.getBoolean("guideHateWord", true);
    }

    public final boolean n1() {
        return ll.a.getBoolean("postMiniMenuGuide", false);
    }

    public final int n2() {
        return ll.a.getInt("SwipeSensitivity", 3);
    }

    public final void n3(long v) {
        ll.a.edit().putLong("ArchiveVoiceLastChooseFolder", v).apply();
    }

    public final void n4(boolean z) {
        ll.a.edit().putBoolean("guideUserMemoAllShown", z).apply();
    }

    public final void n5(int v) {
        ll.a.edit().putInt("pushTouchMode", v).apply();
    }

    public final void n6(boolean z) {
        ll.a.edit().putBoolean("useImageWatermark", z).apply();
    }

    public final boolean o0() {
        return ll.a.getBoolean("guideListMenuAutoNew", false);
    }

    @k(message = "미니갤러리 세부 메뉴 안내 가이드 제거됨")
    public static void o1() {
    }

    public final float o2() {
        float f = ((float)this.n2()) * 0.1f + 0.2f;
        if(f > 0.8f) {
            return 0.8f;
        }
        return f < 0.2f ? 0.2f : f;
    }

    public final void o3(long v) {
        ll.a.edit().putLong("autoBackupMediaStoreId", v).apply();
    }

    public final void o4(boolean z) {
        ll.a.edit().putBoolean("hideImageMobile", z).apply();
    }

    public final void o5(int v) {
        ll.a.edit().putInt("quickWriteAfterAction", v).apply();
    }

    public final void o6(boolean z) {
        ll.a.edit().putBoolean("useQuickWrite", z).apply();
    }

    public final boolean p0() {
        return ll.a.getBoolean("guideListMenuBlockNew", false);
    }

    public final boolean p1() {
        return ll.a.getBoolean("postReadWriterCheck", true);
    }

    public final boolean p2() {
        return ll.a.getBoolean("termUseAccept", false);
    }

    public final void p3(boolean z) {
        ll.a.edit().putBoolean("isAutoImageAddBalloonShown", z).apply();
    }

    public final void p4(@m String s) {
        ll.a.edit().putString("hitGallConSettingDate", s).apply();
    }

    public final void p5(boolean z) {
        ll.a.edit().putBoolean("quickWriteGuestGuide", z).apply();
    }

    public final void p6(boolean z) {
        ll.a.edit().putBoolean("isUsedQuickWrite", z).apply();
    }

    public final boolean q0() {
        return ll.a.getBoolean("guideListMenuMemoNew", false);
    }

    public final boolean q1() {
        return ll.a.getBoolean("postSeriesGuide", false);
    }

    @l
    public final g q2() {
        int v;
        if(P.b.h()) {
            v = this.r2();
            return g.a.c(v);
        }
        v = this.s2();
        return g.a.c(v);
    }

    public final void q3(boolean z) {
        ll.a.edit().putBoolean("isAutoImageBalloonShown", z).apply();
    }

    public final void q4(int v) {
        ll.a.edit().putInt("idChangeGuideCount", v).apply();
    }

    public final void q5(boolean z) {
        ll.a.edit().putBoolean("quickWriteHideGuide", z).apply();
    }

    public final void q6(long v) {
        ll.a.edit().putLong("webContentCrashTimeMs", v).apply();
    }

    public final boolean r0() {
        return ll.a.getBoolean("guidePinDialogShown", false);
    }

    @k(message = "표시기능 제거되어 사용안함")
    public static void r1() {
    }

    public final int r2() {
        return ll.a.getInt("ThemeDark", 6);
    }

    public final void r3(boolean z) {
        ll.a.edit().putBoolean("isAutoImageGuideShown", z).apply();
    }

    public final void r4(long v) {
        ll.a.edit().putLong("imageDownloadGroup", v).apply();
    }

    public final void r5(boolean z) {
        ll.a.edit().putBoolean("quickWriteSettingPopup", z).apply();
    }

    public final void r6(@m String s) {
        ll.a.edit().putString("wordFilterEditList", s).apply();
    }

    public final boolean s0() {
        return ll.a.getBoolean("guidePushNoticeLikeMyPost", false);
    }

    @m
    public final ArrayList s1() {
        String s = ll.a.getString("postWriteOrderSetting", null);
        return s != null && s.length() != 0 ? uk.a.r(s, ArrayList.class) : null;
    }

    public final int s2() {
        return ll.a.getInt("ThemeLight", 0);
    }

    public final void s3(boolean z) {
        ll.a.edit().putBoolean("backupAutoEnable", z).apply();
    }

    public final void s4(boolean z) {
        ll.a.edit().putBoolean("imageNoteGuide", z).apply();
    }

    public final void s5(int v) {
        ll.a.edit().putInt("quickWriteViewType", v).apply();
    }

    public final void s6(boolean z) {
        ll.a.edit().putBoolean("wordFilterGuideShown", z).apply();
    }

    public final boolean t() {
        return ll.a.getBoolean("aiImageCollapseLoraPrompt", false);
    }

    public final boolean t0() {
        return ll.a.getBoolean("guideUserBlockAllShown", false);
    }

    public final boolean t1() {
        return ll.a.getBoolean("prNetworkDialogShown", false);
    }

    @l
    public final P t2() {
        int v = ll.a.getInt("themeMode", 0);
        return P.b.o(v);
    }

    public final void t3(long v) {
        ll.a.edit().putLong("ArchiveBackupAutoTime", v).apply();
    }

    public final void t4(int v) {
        ll.a.edit().putInt("imagePickerTab", v).apply();
    }

    public final void t5(int v) {
        ll.a.edit().putInt("readBestBoxStatus", v).apply();
    }

    public final void t6(boolean z) {
        ll.a.edit().putBoolean("wordFilterTypeWide", z).apply();
    }

    public final boolean u() {
        return ll.a.getBoolean("aiImageCollapseNegativePrompt", false);
    }

    public final boolean u0() {
        return ll.a.getBoolean("guideUserMemoAllShown", false);
    }

    public final int u1() {
        return ll.a.getInt("pushContentsTypeMode", 0);
    }

    public final boolean u2() {
        return ll.a.getBoolean("themeModeSystemGuide", true);
    }

    public final void u3(boolean z) {
        ll.a.edit().putBoolean("bestReplyFilterEnable", z).apply();
    }

    public final void u4(int v) {
        ll.a.edit().putInt("imageWatermarkGuideCount", v).apply();
    }

    public final void u5(long v) {
        ll.a.edit().putLong("ReadCount", v).apply();
    }

    public final void u6(boolean z) {
        ll.a.edit().putBoolean("isWriteChangeLoginEnable", z).apply();
    }

    @m
    public final String v() {
        return ll.a.getString("aiImageGuestLimitCheckDate", null);
    }

    public final boolean v0() {
        return ll.a.getBoolean("hideImageMobile", false);
    }

    public final int v1() {
        return ll.a.getInt("pushNoticeLastSelectedTab", 0);
    }

    public final boolean v2() {
        return ll.a.getBoolean("unReadPushSideMenuCheck", true);
    }

    public final void v3(boolean z) {
        ll.a.edit().putBoolean("isBigDcconActive", z).apply();
    }

    public final void v4(long v) {
        ll.a.edit().putLong("keywordPopupDateTime", v).apply();
    }

    public final void v5(int v) {
        ll.a.edit().putInt("readImgNoteDisplayOption", v).apply();
    }

    @m
    public final String w() {
        return ll.a.getString("aiImageLoginLimitCheckDate", null);
    }

    @m
    public final String w0() {
        return ll.a.getString("hitGallConSettingDate", null);
    }

    public final int w1() {
        return ll.a.getInt("pushNotificationUnreadCount", 0);
    }

    @m
    public final String w2() {
        return ll.a.getString("updateIgnoreCase", null);
    }

    public final void w3(@l String s, long v) {
        L.p(s, "realId");
        ll.a.edit().putLong("bigDcconExpireTime|" + s, v).apply();
    }

    public final void w4(int v) {
        ll.a.edit().putInt("lastAlbumsSortType", v).apply();
    }

    public final void w5(int v) {
        ll.a.edit().putInt("readLogOption", v).apply();
    }

    public final int x() {
        return ll.a.getInt("lastSelectModelIndex", -1);
    }

    public final int x0() {
        return ll.a.getInt("idChangeGuideCount", 0);
    }

    public final int x1() {
        return ll.a.getInt("pushTouchMode", 0);
    }

    public static void x2() {
    }

    public final void x3(boolean z) {
        ll.a.edit().putBoolean("isBigDcconGuideShown", z).apply();
    }

    public final void x4(@l String s) {
        L.p(s, "value");
        ll.a.edit().putString("lastCopiedUrl", s).apply();
    }

    public final void x5(boolean z) {
        ll.a.edit().putBoolean("readLogOptionAllow", z).apply();
    }

    @m
    public final String y() {
        return ll.a.getString("aiResampleCheckDate", null);
    }

    public final long y0() {
        return ll.a.getLong("imageDownloadGroup", 0L);
    }

    public final int y1() {
        return ll.a.getInt("quickWriteAfterAction", B.b.c());
    }

    public final long y2() {
        return ll.a.getLong("updateIgnoreMs", 0L);
    }

    public final void y3(@l Integer[] arr_integer) {
        L.p(arr_integer, "limits");
        String s = kotlin.collections.l.lh(arr_integer, ",", null, null, 0, null, null, 62, null);
        ll.a.edit().putString("bigDcconLimits", s).apply();
    }

    public final void y4(int v) {
        ll.a.edit().putInt("lastImagesSortType", v).apply();
    }

    public final void y5(boolean z) {
        ll.a.edit().putBoolean("readLogOptionGuide", z).apply();
    }

    @m
    public final String z() {
        return ll.a.getString("aiResampleGuestCheckDate", null);
    }

    public final boolean z0() {
        return ll.a.getBoolean("imageNoteGuide", false);
    }

    public final boolean z1() {
        return ll.a.getBoolean("quickWriteGuestGuide", false);
    }

    public static void z2() {
    }

    public final void z3(boolean z) {
        ll.a.edit().putBoolean("blockDcconEnable", z).apply();
    }

    public final void z4(long v) {
        ll.a.edit().putLong("lastReplySort", v).apply();
    }

    public final void z5(@l com.dcinside.app.type.k k0) {
        L.p(k0, "value");
        ll.a.edit().putInt("ReadTextSize", k0.c()).apply();
    }
}

