import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("uppgift a)");
        Scanner in = new Scanner(System.in);
        int points = 0;
        System.out.println("Fråga 1: \nHur många race har DUH DUH DUH DUH MAX VERSTAPPEN vunnit? \n1. Osama Bin laden \n2. För många \n3. 51");
        String ans = "";
    while(!ans.equals("1")&&!ans.equals("2")&&!ans.equals("3")){
            ans = in.nextLine();
            if(ans.equals("1")){
                System.out.println("Jag önskar");
            }
            else if(ans.equals("2")){
                System.out.println("Korrekt!!!");
                points++;
            }
            else if(ans.equals("3")){
                System.out.println("Nej, för många är rätt svar");
            }
            else{
                System.out.println("Var snäll att svara 1, 2 eller 3");
            }
        }
        ans = "";
        System.out.println("Fråga 2: \nWhopper whopper whopper whopper \n1. Flame grilled taste with perfect toppers \n2. Lettuce, Mayo, Pickle, Ketchup \n3. Junior, Double, Triple Whopper");
        while(!ans.equals("1")&&!ans.equals("2")&&!ans.equals("3")){
            ans = in.nextLine();
            if(ans.equals("1")){
                System.out.println("Borde gått till specsavers");
            }
            else if(ans.equals("2")){
                System.out.println("Nja inte riktigt");
            }
            else if(ans.equals("3")){
                System.out.println("Du är tjock för du kunde men det är korrekt!!!");
                points++;
            }
            else{
                System.out.println("Var snäll att svara 1, 2 eller 3");
            }
        }
        System.out.println("Din slutpoäng blev: "+points);
    }
}
