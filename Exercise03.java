;/**
 * Beschreiben Sie hier die Klasse Exercise03.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Exercise03 extends Exercise03Base
{
    //Hmaster output
    private void hmasterOutput() {
        paule.write("Hier sind " + territory.getTotalHamsterCount() + " Hamster.");
        paule.write("Das Territorium ist " + territory.getTerritorySize().getColumnCount() 
                    + " auf " + territory.getTerritorySize().getRowCount() + " Felder groß.");
        paule.write("Es existieren " + territory.getTotalGrainCount() + " Koerner.");
    }
    
    private void consoleOutput() {
        output.print("Hier sind ");
        output.print(territory.getTotalHamsterCount());
        output.println(" Hamster.");
        
        output.print("Das Territorium ist ");
        output.print(territory.getTerritorySize().getColumnCount()); 
        output.print(" auf ");
        output.print(territory.getTerritorySize().getRowCount());
        output.println(" Felder groß.");
        
        output.print("Es existieren ");
        output.print(territory.getTotalGrainCount());
        output.println(" Koerner.");
    }
    
    //Console output
    void run() {
        game.initialize();
        game.displayInNewGameWindow();
        
        hmasterOutput();
        consoleOutput();
        
        //Hamster will have done smth
        paule.move();
        paule.move();
        paule.pickGrain();
        paule.pickGrain();
        
        hmasterOutput();
        consoleOutput();
        
        // Leave this call intact for challenge 3!
        challenge3();
    }

    void printWithJavaFX() {
        // Only for Challenge 3! Ignore otherwise!
        // TODO: Put the code for challenge 3 here. You can assume that this is 
        // run on the JavaFX thread
    }
}