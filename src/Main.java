public class Main {
    Character character1;
    Character character2;

    public Main(){
        this.character1 = new Character("Character 1");
        this.character2 = new Character(120, "Character 2");

        //Alle Daten der Character ausgeben mit print

        System.out.println( "Name: "+character1.getName() + " | HP: "+ character1.getHp() );
        System.out.println( "Name: "+character2.getName() + " | HP: "+ character2.getHp() );

        character1.setName("Character1.1");

        System.out.println( "Name: "+character1.getName() + " | HP: "+ character1.getHp() );
        System.out.println( "Name: "+character2.getName() + " | HP: "+ character2.getHp() );


    }

    public static void main(String[] args) {
        new Main();
    }

}