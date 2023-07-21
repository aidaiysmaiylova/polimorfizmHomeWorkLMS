public class Main {
    public static void main(String[] args)
    {
        Shark shark=new Shark();
        Eagle eagle=new Eagle();
        Turtle turtle=new Turtle();
        Animal []animals={shark,eagle,turtle};
        for (Animal animal:animals) {
            if(animal instanceof Shark){
                ((Shark) animal).attack();
            }
            if(animal instanceof Eagle){
                ((Eagle) animal).fly();
            }
            if(animal instanceof Turtle){
                ((Turtle) animal).swim();
            }

            }

        }
    }

