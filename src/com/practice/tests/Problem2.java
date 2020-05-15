package com.practice.tests;

import java.io.*;
import java.util.*;

public class Problem2 {

    public static int getTotalMarkers(ArrayList<pair> cars){
        if(cars == null)
            return 0;

        ArrayList<pair> markers = new ArrayList<>();
        cars.sort(new Comparator<pair>() {
            @Override
            public int compare(pair pair1, pair pair2) {
                return pair1.getStart() - pair2.getStart();
            }
        });
        pair t = cars.get(0);
        cars.remove(0);
        for(pair p : cars) {
            if(t.getEnd()>=p.getStart() && t.getEnd()<=p.getEnd()){
                t = new pair(t.getStart(), p.getEnd());
            } else if(t.getEnd()< p.getStart()) {
                markers.add(t);
                t=p;
            }
        }
        markers.add(t);
        int count = 0;
        for(pair m : markers) {
            count += (m.getEnd()-m.getStart()+1);
        }
        return count;
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
        ArrayList<pair> map=new ArrayList<>();
        map.add(new pair(1,4));
        map.add(new pair(8,13));
//        map.add(new pair(3,6));
        int star= getTotalMarkers(map);
        System.out.println(star);
    }

    private static class pair {
        private int start;
        private int end;

        public pair(int a, int b){
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
