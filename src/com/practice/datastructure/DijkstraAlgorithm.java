package com.practice.datastructure;

public class DijkstraAlgorithm {
    public int min(int []disp,boolean []disv){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<disp.length;i++){
            if(disp[i]<=min && disv[i]==false){
                min=disp[i];
                index=i;
            }
        }
        return index;
    }
    public void printArray(int []disp){
        for(int i:disp){
            System.out.print(i+" ");
        }
    }
    public void djkstra(int [][]graph,int src){
        int []disp=new int[graph.length];
        boolean []disv=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            disp[i]=Integer.MAX_VALUE;
            disv[i]=false;
        }
        disp[src]=0;
        for (int i=0;i<graph.length-1;i++){
            int u=min(disp,disv);
            System.out.println("DisTanceis::::"+u);
            disv[u]=true;
            for(int v=0;v<graph.length;i++){
                if (!disv[v] && graph[u][v]!=0 && disp[u] !=Integer.MAX_VALUE && disp[u]+graph[u][v]<disp[v]){
                    disp[v]=disp[u]+graph[u][v];
                }
            }
        }
        printArray(disp);
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        DijkstraAlgorithm path=new DijkstraAlgorithm();
        path.djkstra(graph,0);
    }
}
