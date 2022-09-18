package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    private double averageOfCommentsPerUSer;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerPost;

    private double size;
    private double postsCount;
    private double commentsCount;

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> userNames = statistics.usersNames();
        size = userNames.size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (size == 0 && postsCount == 0) {
            averageOfCommentsPerPost = 0.0;
            averageOfPostsPerUser = 0.0;
            averageOfCommentsPerUSer = 0.0;
        } else if (size > 0 && postsCount == 0) {
            averageOfCommentsPerUSer = commentsCount / size;
            averageOfPostsPerUser = postsCount / size;
            averageOfCommentsPerPost = 0;
        } else if (size == 0 && postsCount > 0) {
            averageOfCommentsPerPost = commentsCount / postsCount;
            averageOfPostsPerUser = 0.0;
            averageOfCommentsPerUSer = 0.0;
        } else if (size > 0 && postsCount > 0) {
            averageOfCommentsPerUSer = commentsCount / size;
            averageOfPostsPerUser = postsCount / size;
            averageOfCommentsPerPost = commentsCount / postsCount;
        }
    }



    public double getSize() {
        return size;
    }

    public double getPostsCount() {
        return postsCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public double getAverageOfCommentsPerUSer() {
        return averageOfCommentsPerUSer;
    }

    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }

    public double getAverageOfPostsPerUser() {
        return averageOfPostsPerUser;
    }
}
