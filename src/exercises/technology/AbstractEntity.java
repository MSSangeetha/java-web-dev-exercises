package exercises.technology;

public class AbstractEntity {

    private static int nextId = 1;

//    public AbstractEntity(int nextId){
//        nextId++;
//    }

    //no argument constructor, which is automatically called in the child constructor
    public AbstractEntity() {
        nextId++;
    }


    //Getters
    public static int getNextId() {
        return nextId;
    }
}
