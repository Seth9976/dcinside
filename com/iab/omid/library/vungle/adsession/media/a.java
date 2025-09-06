package com.iab.omid.library.vungle.adsession.media;

public enum a {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    String a;

    private a(String s1) {
        this.a = s1;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

