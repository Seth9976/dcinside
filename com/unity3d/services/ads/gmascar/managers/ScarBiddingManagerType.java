package com.unity3d.services.ads.gmascar.managers;

public enum ScarBiddingManagerType {
    static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

    }

    DISABLED("dis"),
    EAGER("eag");

    private final String name;

    private static ScarBiddingManagerType[] $values() [...] // Inlined contents

    private ScarBiddingManagerType(String s1) {
        this.name = s1;
    }

    public static ScarBiddingManagerType fromName(String s) {
        return s.hashCode() != 100171 || !s.equals("eag") ? ScarBiddingManagerType.DISABLED : ScarBiddingManagerType.EAGER;
    }

    public String getName() {
        return this.name;
    }
}

