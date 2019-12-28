package oop.inheritance;

public class TestHierachy {
    public static void main(String[] args) {
        Parent child1 =new Parent();
        child1.parentsHeight();
        //Create an object from the Children Class
        Children child2 = new Children();
        child2.altheleticSkils();
        child2.parentsHeight();
        child2.grandFatherEducation();
        GrandParent child3 = new GrandParent();
        child3 .grandFatherEducation();


    }

}
