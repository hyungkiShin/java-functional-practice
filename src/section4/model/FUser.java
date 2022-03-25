package section4.model;

import java.util.List;

public class FUser {
    private Long id;
    private String name;
    private boolean verified;
    private String emailAddress;
    private List<Integer> friendUserIds;

    public FUser(final Long id,
                 final String name,
                 final boolean verified,
                 final String emailAddress,
                 final List<Integer> friendUserIds) {
        this.id = id;
        this.name = name;
        this.verified = verified;
        this.emailAddress = emailAddress;
        this.friendUserIds = friendUserIds;
    }

    public FUser() {

    }

    public Long getId() {
        return id;
    }

    public FUser setId(final Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public FUser setName(final String name) {
        this.name = name;
        return this;
    }

    public boolean isVerified() {
        return verified;
    }

    public FUser setVerified(final boolean verified) {
        this.verified = verified;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public FUser setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public List<Integer> getFriendUserIds() {
        return friendUserIds;
    }

    public FUser setFriendUserIds(final List<Integer> friendUserIds) {
        this.friendUserIds = friendUserIds;
        return this;
    }

    @Override
    public String toString() {
        return "FUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", verified=" + verified +
                ", emailAddress='" + emailAddress + '\'' +
                ", friendUserIds=" + friendUserIds +
                '}';
    }
}
