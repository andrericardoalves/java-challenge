package org.example;


import org.junit.Test;

public class JoinNumberTest{

    @Test
    public void shouldNumberTheSame( ){
       FindJoinPoint join = new FindJoinPoint();
       int result = join.findJoinPointMyVersion(471, 480);
       System.out.println(result);
    }



    @Test
    public void shouldFindJoinPoint( ){
        FindJoinPoint join = new FindJoinPoint();
        int result = join.findJoinPoint(471, 480);
        System.out.println(result);
    }
}