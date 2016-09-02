package mohammed.hatoon.hadeety.classes;

import java.util.Date;

/**
 * Created by Hatoon Mo on 8/31/2016.
 */
public class Follower extends User {

    private User userFollower;
    private int followedUserId;

    public Follower(int userId, String userName, String userEmail, Date userDateofBirth, String userPicture, String userBio, String userFavColor, Following[] followings, Follower[] followers, User userFollower, int followedUserId) {
        super(userId, userName, userEmail, userDateofBirth, userPicture, userBio, userFavColor, followings, followers);
        this.userFollower = userFollower;
        this.followedUserId = followedUserId;
    }

    public User getUserFollower() {
        return userFollower;
    }

    public void setUserFollower(User userFollower) {
        this.userFollower = userFollower;
    }

    public int getFollowedUserId() {
        return followedUserId;
    }

    public void setFollowedUserId(int followedUserId) {
        this.followedUserId = followedUserId;
    }
}
