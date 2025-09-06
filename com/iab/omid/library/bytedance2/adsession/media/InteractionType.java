package com.iab.omid.library.bytedance2.adsession.media;

public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    private InteractionType(String s1) {
        this.interactionType = s1;
    }

    @Override
    public String toString() {
        return this.interactionType;
    }
}

