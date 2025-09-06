package com.fsn.cauly.blackdragoncore.utils;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class l {
    public static String a(Node node0) {
        Node node1 = node0.getFirstChild();
        String s = null;
        while(node1 != null) {
            switch(node1.getNodeType()) {
                case 3: 
                case 4: {
                    s = s == null ? node1.getNodeValue() : s + node1.getNodeValue();
                }
            }
            node1 = node1.getNextSibling();
        }
        return s;
    }

    public static String a(Node node0, String s) {
        if(node0.getNodeType() != 1) {
            return null;
        }
        NodeList nodeList0 = ((Element)node0).getElementsByTagName(s);
        return nodeList0.getLength() == 0 ? null : l.a(nodeList0.item(0));
    }

    public static String a(Node node0, String s, String s1) {
        if(node0.getNodeType() != 1) {
            return null;
        }
        NodeList nodeList0 = ((Element)node0).getElementsByTagName(s);
        if(nodeList0.getLength() == 0) {
            return null;
        }
        return nodeList0.item(0).getAttributes() == null || nodeList0.item(0).getAttributes().getNamedItem(s1) == null ? null : nodeList0.item(0).getAttributes().getNamedItem(s1).getNodeValue();
    }
}

