package com.practice.collectionImplementations;

public class HashMap {
    static class Key{
        String key;
        public Key(String key){
            this.key=key;
        }
        @Override
        public int hashCode(){
            return this.key.charAt(0);
        }
        @Override
        public boolean equals(Object obj){
            return this.key.equals(((Key)obj).key);
        }
    }

    public static void main(String[] args) {
        //Index of HashMap Calculated as::::
        //index=hashCode(key)&(n-1);
        //Capacity Can be calculated as
        //capacity=loadFactor*numberOfBuckets;
        //Initial Size of Buckets is 16
        //initial load Factor is:::: 0.75

        //A Single Bucket can contain following
        //Node next
        //int hash
        //String key
        //String value
    }

}
