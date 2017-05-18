package io.hydros.skyla.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by Armandovsky on 17/05/2017.
 */

public class MyPostsFragment extends PostListFragment{

    public MyPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("user-posts")
            .child(getUid());
    }


}
