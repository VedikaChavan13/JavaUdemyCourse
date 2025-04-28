//In this challenge, we'll be using NATO alphabet to replace a character on letter,with NATO's standardized word for that letter.
//In radio transmissions, the word car, "C","A","R", would be read,"Charlie Able Roger", for clarity.
// We'll just do this for the letters A, through E.
// A= Able, B= Baker,C = Charlie, D= Dog, E= Easy
//To Do this:
//Create a new char variable.
//Use the traditional switch statement(with a colon in case labels) that tests the value in the variable from STEP 1.
//Create cases for the characters,A,B,C,D and E.
//Display a message in each case block, with the letter and the NATO word, then break.
//Add a default block which displays the letter with a message saying not found.

public class SwitchCode {
    

    public static void main(String[] args) {
       
        char variable= 'F';
        switch (variable) {
            case 'A':
              System.out.println("Able");
              break;

            case 'B':
              System.out.println("Baker");
              break;
            case 'C': 
              System.out.println("Charlie"); 
                break;
            case 'D':
              System.out.println("Dog");
              break;
            case 'E':
              System.out.println("Easy");  
            default:
              System.out.println(variable+ " not found");
                break;
        }
    }


}
