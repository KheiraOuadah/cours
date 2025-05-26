public class Main {
    public static void main(String[] args){
        Animal[] animaux = {new Chien(),new Chat(), new Canard(), new Serpent()};
        cacophonie(animaux);
    }

    public static void cacophonie(Animal[] animals){
        for (Animal animal : animals){
            animal.crier();
        }
    }
}

