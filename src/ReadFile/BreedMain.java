package ReadFile;

public class BreedMain {
    public static void main(String[] args) {
        for (Breed dogs : Breed.values()) ;
        Breed dog1 = Breed.BULLDOG;
        System.out.println(dog1);
    }
}