package mohammed.hatoon.hadeety.classes;

import java.util.Date;

/**
 * Created by Hatoon Mo on 8/31/2016.
 */
public class Following extends User {

    private User userFollowing;
    private int followedUserId;

    public Following(int userId, String userName, String userEmail, Date userDateofBirth, String userPicture, String userBio, String userFavColor, Following[] followings, Follower[] followers, User userFollowing, int followedUserId) {
        super(userId, userName, userEmail, userDateofBirth, userPicture, userBio, userFavColor, followings, followers);
        this.userFollowing = userFollowing;
        this.followedUserId = followedUserId;
    }

    public User getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(User userFollowing) {
        this.userFollowing = userFollowing;
    }

    public int getFollowedUserId() {
        return followedUserId;
    }

    public void setFollowedUserId(int followedUserId) {
        this.followedUserId = followedUserId;
    }
}
