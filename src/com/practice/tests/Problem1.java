package com.practice.tests;

import java.io.*;
import java.util.*;

public class Problem1 {

    public static int getDimmestStar(int noStars, ArrayList<edge> edges, int brightStar){
        if(brightStar<=0 || edges == null || noStars <=0)
            return 0;

        int[] levels = new int[noStars+1];
        for(int i=0; i<=noStars; i++)
            levels[i] = 0;

        levels[brightStar] = 1;
        for(edge e:edges){
            if(levels[e.getEnd()] != 0){
                return 0;
            } else {
                levels[e.getEnd()] = levels[e.getStart()]+1;
            }
        }

        int max = 0;
        for(int i=1;i<=noStars;i++){
            if(levels[max]<levels[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        for (int tests=1;tests<=n;tests++){
//            int v=Integer.parseInt(br.readLine());
//            HashMap<Integer,Integer>map=new HashMap<>();
//            for (int ver=1;ver<v;ver++) {
//                String str = br.readLine();
//                String[] s=str.split(" ");
//                int key=Integer.parseInt(s[0]);
//                int value=Integer.parseInt(s[1]);
//                map.put(key,value);
//            }
//            int brightStar=Integer.parseInt(br.readLine());
//            int star=getDimmestStar(v,map,brightStar);
//            System.out.println(star);
//        }
        ArrayList<edge> map=new ArrayList<>();
        map.add(new edge(5,6));
        map.add(new edge(5,2));
        map.add(new edge(6,4));
        map.add(new edge(6,3));
        map.add(new edge(4,7));
        map.add(new edge(7,1));
        int star=getDimmestStar(7,map,5);
        System.out.println(star);
    }

    private static class edge{
        private int start;
        private int end;

        public edge(int a, int b){
            start=a;
            end=b;
        }
        public int getStart(){
            return start;
        }

        public int getEnd(){
            return end;
        }
    }
}
