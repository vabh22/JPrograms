interface Player {
    void play();
}

class Chile implements Player {
    @Override
    public void play() {
        System.out.println("This is play() method for Chile.");
    }
}

class Musician implements Player {
    @Override
    public void play() {
        System.out.println("This is play() method for Musician.");
    }
}

class Actor implements Player {
    @Override
    public void play() {
        System.out.println("This is play() method for Actor.");
    }
}

public class PlayerInterface {
    public static void main(String[] args) {
        Player newChile = new Chile();
        newChile.play();
        Player newMusician = new Musician();
        newMusician.play();
        Player newActor = new Actor();
        newActor.play();
    }
}