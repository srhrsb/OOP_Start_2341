public class Main {
    private Character character1;
    private Character character2;

    public Main(){
        character1 = new Character("Character 1");

        character2 = new Character(120, "Character 2");
        //Alle Daten der Character ausgeben mit print
        System.out.println( "Name: "+character1.getName() + " | HP: "+ character1.getHp() );
        System.out.println( "Name: "+character2.getName() + " | HP: "+ character2.getHp() );
        character1.setName("Character1.1");
        System.out.println( "Name: "+character1.getName() + " | HP: "+ character1.getHp() );
        System.out.println( "Name: "+character2.getName() + " | HP: "+ character2.getHp() );


        //Methoden von Character nutzen
        character1.talk();
        character1.talk("... und heiße Luca");

    }

    public static void main(String[] args) {
        new Main();
    }

}