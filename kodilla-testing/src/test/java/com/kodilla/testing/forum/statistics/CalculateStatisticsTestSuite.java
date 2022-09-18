package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            ForumUser theForumUser = new ForumUser("Name " + n, "realName " + n);
            resultList.add(theForumUser.getRealName());
        }
        return resultList;
    }

    @Test
    void testCalculateAdvStatisticsIfUsers0Posts0Comment0() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(0);
        int countOfPosts = 0;
        int countOfComments = 0;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(0, size);
        Assertions.assertEquals(0, quantityOfForumPosts);
        Assertions.assertEquals(0, quantityOfForumComments);
        Assertions.assertEquals(0.0, averageCperP, 0.01);
        Assertions.assertEquals(0.0, averageCperU, 0.01);
        Assertions.assertEquals(0.0, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfUsers100Posts0Comment0() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(100);
        int countOfPosts = 0;
        int countOfComments = 0;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(100, size);
        Assertions.assertEquals(0, quantityOfForumPosts);
        Assertions.assertEquals(0, quantityOfForumComments);
        Assertions.assertEquals(0.0, averageCperP, 0.01);
        Assertions.assertEquals(0.0, averageCperU, 0.01);
        Assertions.assertEquals(0.0, averagePperU, 0.01);
    }


    @Test
    void testCalculateAdvStatisticsIfUsers0Posts70Comment0() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(0);
        int countOfPosts = 70;
        int countOfComments = 0;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(0, size);
        Assertions.assertEquals(70, quantityOfForumPosts);
        Assertions.assertEquals(0, quantityOfForumComments);
        Assertions.assertEquals(0.0, averageCperP, 0.01);
        Assertions.assertEquals(0.0, averageCperU, 0.01);
        Assertions.assertEquals(0.0, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfUsers0Posts0Comment80() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(0);
        int countOfPosts = 0;
        int countOfComments = 80;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(0, size);
        Assertions.assertEquals(0, quantityOfForumPosts);
        Assertions.assertEquals(80, quantityOfForumComments);
        Assertions.assertEquals(0.0, averageCperP, 0.01);
        Assertions.assertEquals(0.0, averageCperU, 0.01);
        Assertions.assertEquals(0.0, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfUsers1000Posts600Comment0() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(1000);
        int countOfPosts = 600;
        int countOfComments = 0;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(1000, size);
        Assertions.assertEquals(600, quantityOfForumPosts);
        Assertions.assertEquals(0, quantityOfForumComments);
        Assertions.assertEquals(0.0, averageCperP, 0.01);
        Assertions.assertEquals(0.0, averageCperU, 0.01);
        Assertions.assertEquals(0.6, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfUsers0Posts600Comment800() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(0);
        int countOfPosts = 400;
        int countOfComments = 800;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(0, size);
        Assertions.assertEquals(400, quantityOfForumPosts);
        Assertions.assertEquals(800, quantityOfForumComments);
        Assertions.assertEquals(2.0, averageCperP, 0.01);
        Assertions.assertEquals(0.0, averageCperU, 0.01);
        Assertions.assertEquals(0.0, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfUsers1000Posts0Comment800() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(1000);
        int countOfPosts = 0;
        int countOfComments = 800;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When

        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(1000, size);
        Assertions.assertEquals(0, quantityOfForumPosts);
        Assertions.assertEquals(800, quantityOfForumComments);
        Assertions.assertEquals(0.0, averageCperP,0.01);
        Assertions.assertEquals(0.8, averageCperU, 0.01);
        Assertions.assertEquals(0.0, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfUsers1000Posts250Comment800() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(1000);
        int countOfPosts = 250;
        int countOfComments = 800;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(1000, size);
        Assertions.assertEquals(250, quantityOfForumPosts);
        Assertions.assertEquals(800, quantityOfForumComments);
        Assertions.assertEquals(3.2, averageCperP, 0.01);
        Assertions.assertEquals(0.8, averageCperU, 0.01);
        Assertions.assertEquals(0.25, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfCountOfCommentsGreaterThanCountOfPosts() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(1000);
        int countOfPosts = 250;
        int countOfComments = 1000;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);

        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(1000, size);
        Assertions.assertEquals(250, quantityOfForumPosts);
        Assertions.assertEquals(1000, quantityOfForumComments);
        Assertions.assertEquals(4.0, averageCperP, 0.01);
        Assertions.assertEquals(1.0, averageCperU, 0.01);
        Assertions.assertEquals(0.25, averagePperU, 0.01);
    }

    @Test
    void testCalculateAdvStatisticsIfCountOfPostsGreaterThanCountOfComments() {

        //Given
        List<String> resultForumUserList = generateListOfNUsers(1000);
        int countOfPosts = 2500;
        int countOfComments = 100;
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(countOfComments);
        when(statisticsMock.postsCount()).thenReturn(countOfPosts);
        when(statisticsMock.usersNames()).thenReturn(resultForumUserList);

        //When
        calculatorOfStatistics.calculateAdvStatistics(statisticsMock);
        double size = calculatorOfStatistics.getSize();
        double quantityOfForumPosts = calculatorOfStatistics.getPostsCount();
        double quantityOfForumComments = calculatorOfStatistics.getCommentsCount();
        double averageCperP = calculatorOfStatistics.getAverageOfCommentsPerPost();
        double averageCperU = calculatorOfStatistics.getAverageOfCommentsPerUSer();
        double averagePperU = calculatorOfStatistics.getAverageOfPostsPerUser();

        //Then
        Assertions.assertEquals(1000, size);
        Assertions.assertEquals(2500, quantityOfForumPosts);
        Assertions.assertEquals(100, quantityOfForumComments);
        Assertions.assertEquals(0.04, averageCperP, 0.01);
        Assertions.assertEquals(0.1, averageCperU, 0.01);
        Assertions.assertEquals(2.5, averagePperU, 0.01);
    }

}
