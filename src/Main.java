import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //mia trapeza me 2 branches me 2 customers to ka8e branch
        // mia trapeza me 1 branch kai 1 customer
        // ftiaxnw menu monos mou 1)add Bank  2) add branch 3) add Customer 4) print banks
        // 5) print bank by name(na ektupwnei ta bracn tis ka8e trapezas
        // 6) print branch customers
        //7) exit


       ArrayList<Bank> banks = new ArrayList<>();



        while(true){
            System.out.println("Welcome to the banking system");
            System.out.println("press 1 to add Bank");
            System.out.println("press 2 to add Branch");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input){
                case "1": {
                    System.out.println("please provide Bank name ");
                    String bankName = scanner.nextLine();
                    Bank bank = new Bank(bankName);
                    banks.add(bank);
                    break;
                }

                case "2": {
                    System.out.println("please select Bank to add branch");
                    String bankName = scanner.nextLine();
                    boolean findIt = false ;
                    for(Bank searchBank :banks){
                        if( bankName.equals(searchBank.getName())){
                            System.out.println("please provide branch name ");
                            String branchName = scanner.nextLine();
                            searchBank.addBranch(branchName);
                            findIt = true;
                            break;
                        }
                    }
                    if (!findIt) {
                        System.out.println("please select number 1 , add bank ");
                    }
                    break;

                }

            }
        }




    }


}