package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo.State;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.json.JSONArray;

public class f0 {
    private static void a(LinkProperties linkProperties0, JSONArray jSONArray0) {
        for(Object object0: linkProperties0.getDnsServers()) {
            InetAddress inetAddress0 = (InetAddress)object0;
            if(inetAddress0 != null) {
                jSONArray0.put(inetAddress0.getHostAddress());
            }
        }
    }

    public static String[] a(Context context0) {
        String[] arr_s = new String[5];
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        if(connectivityManager0 != null) {
            Network[] arr_network = connectivityManager0.getAllNetworks();
            if(arr_network != null) {
                JSONArray jSONArray0 = new JSONArray();
                JSONArray jSONArray1 = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                for(int v = 0; v < arr_network.length; ++v) {
                    Network network0 = arr_network[v];
                    if(network0 != null) {
                        NetworkInfo networkInfo0 = connectivityManager0.getNetworkInfo(network0);
                        if(networkInfo0 != null && networkInfo0.getState() == NetworkInfo.State.CONNECTED) {
                            LinkProperties linkProperties0 = connectivityManager0.getLinkProperties(network0);
                            if(linkProperties0 != null) {
                                int v1 = networkInfo0.getType();
                                if(v1 == 0 || v1 == 1) {
                                    f0.a(linkProperties0, jSONArray4);
                                    if(v1 == 0) {
                                        f0.c(linkProperties0, jSONArray0);
                                        f0.b(linkProperties0, jSONArray1);
                                    }
                                    else {
                                        f0.c(linkProperties0, jSONArray2);
                                        f0.b(linkProperties0, jSONArray3);
                                    }
                                }
                            }
                        }
                    }
                }
                arr_s[0] = jSONArray2.toString();
                arr_s[1] = jSONArray3.toString();
                arr_s[2] = jSONArray0.toString();
                arr_s[3] = jSONArray1.toString();
                arr_s[4] = jSONArray4.toString();
            }
        }
        return arr_s;
    }

    public static String b(Context context0) {
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        String s = "0";
        if(wifiManager0 != null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("");
            if(wifiManager0.isWifiEnabled()) {
                s = "1";
            }
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
        return "0";
    }

    private static void b(LinkProperties linkProperties0, JSONArray jSONArray0) {
        for(Object object0: linkProperties0.getRoutes()) {
            RouteInfo routeInfo0 = (RouteInfo)object0;
            if(routeInfo0 != null && routeInfo0.isDefaultRoute()) {
                InetAddress inetAddress0 = routeInfo0.getGateway();
                if(inetAddress0 != null && (!(inetAddress0 instanceof Inet6Address) || !"::".equals(inetAddress0.getHostAddress()))) {
                    jSONArray0.put(inetAddress0.getHostAddress());
                }
            }
        }
    }

    private static void c(LinkProperties linkProperties0, JSONArray jSONArray0) {
        for(Object object0: linkProperties0.getLinkAddresses()) {
            LinkAddress linkAddress0 = (LinkAddress)object0;
            if(linkAddress0 != null && linkAddress0.getAddress() != null && !linkAddress0.getAddress().isLoopbackAddress()) {
                jSONArray0.put(linkAddress0.getAddress().getHostAddress());
            }
        }
    }
}

