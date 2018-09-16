package dataStructure;

public class linkList {

    private class node{
        public String e;
        public node next;

        public node( String value,node node){
            this.e=value;
            this.next=node;
        }
    }
}
