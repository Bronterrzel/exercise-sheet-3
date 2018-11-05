/**
 * Beschreiben Sie hier die Klasse Exercise03.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Exercise03 extends Exercise03Base
{
    void run() {
        game.initialize();
        game.displayInNewGameWindow();

        // TODO: Implement me!
        //Hmaster output
        paule.write("Hier sind " + territory.getTotalHamsterCount() + " Hamster.");
        paule.write("Das Territorium ist " + territory.getTerritorySize().getColumnCount() 
        + " auf " + territory.getTerritorySize().getRowCount() + " Felder groß.");
        paule.write("Es existieren " + territory.getTotalGrainCount() + " Koerner.");
        
        //Console output
        paule.write("Hier sind " + territory.getTotalHamsterCount() + " Hamster.");
        paule.write("Das Territorium ist " + territory.getTerritorySize().getColumnCount() 
        + " auf " + territory.getTerritorySize().getRowCount() + " Felder groß.");
        paule.write("Es existieren " + territory.getTotalGrainCount() + " Koerner.");
        
        
        // Leave this call intact for challenge 3!
        challenge3();
    }

    void printWithJavaFX() {
        // Only for Challenge 3! Ignore otherwise!
        // TODO: Put the code for challenge 3 here. You can assume that this is 
        // run on the JavaFX thread
    }
}