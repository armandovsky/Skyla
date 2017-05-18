package io.hydros.skyla.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Armandovsky on 17/05/2017.
 */
@IgnoreExtraProperties
public class Comment {

    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }

}
