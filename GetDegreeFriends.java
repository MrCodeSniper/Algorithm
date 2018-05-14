package com.lexj.lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GetDegreeFriends {


    public static void main(String[] args){

        List<User> friends=new ArrayList<>();
        List<User> leverthree_one=new ArrayList<>();
        List<User> leverthree_two=new ArrayList<>();
        List<User> leverthree_three=new ArrayList<>();
        List<User> leveltwo=new ArrayList<>();
        List<User> levelfour=new ArrayList<>();
        User user=new User();
        user.setName("root");
        User user1=new User();
        user1.setName("A1");
        User user2=new User();
        user2.setName("A2");
        User user3=new User();
        user3.setName("A3");
        User user4=new User();
        user4.setName("B1");
        User user5=new User();
        user5.setName("B2");
        User user6=new User();
        user6.setName("B3");
        User user7=new User();
        user7.setName("B4");
        User user8=new User();
        user8.setName("B5");
        User user9=new User();
        user9.setName("C1");


        leveltwo.add(user1);
        leveltwo.add(user2);
        leveltwo.add(user3);


        leverthree_one.add(user4);
        leverthree_one.add(user5);

        leverthree_two.add(user6);

        leverthree_three.add(user7);

        levelfour.add(user9);

        user8.setRelateUsers(levelfour);

        leverthree_three.add(user8);




        user1.setRelateUsers(leverthree_one);
        user2.setRelateUsers(leverthree_two);
        user3.setRelateUsers(leverthree_three);




        user.setRelateUsers(leveltwo);



        List<User> degree=getXDegreeFriends(user,4);
        System.out.println(degree);

        }




        private static List<User> getXDegreeFriends(User root,int degree){

            List<User> result=new ArrayList<>();
            Queue<User> queue=new LinkedList<User>();


            queue.add(root);

            HashSet<User> visited=new HashSet<>();

            int count=degree;


            while (count>=1&&!queue.isEmpty()){
                int queueSize = queue.size();
                for (int i=0;i<queueSize;i++){
                    User visit=queue.poll();


                    if(!visited.contains(visit)){
                        result.add(visit);
                        if(visit.getRelateUsers()!=null){
                            queue.addAll(visit.getRelateUsers());
                        }

                            visited.add(visit);

                    }


                }

                count--;

            }

            return result;





        }






}
