import java.util.ArrayList;

public class Bank {
    private final String name ;
    private final ArrayList<Branch> branches ;

    public Bank(String name){
        this.name= name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch (String branchName){
        if (findBranch(branchName)== null){
            System.out.println("branch will be added");
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return  true;
        }
        System.out.println("branch already exists");
        return  false;
    }
    public Branch findBranch(String branchName){
        for(Branch branchF :branches){
            if (branchName.equals(branchF.getName())) {
                return branchF;
            }
        }
        return null;
    }

//    public boolean addCustomer(String brachesName , String customerName, double initialAmount){
//        Branch branch = findBranches(brachesName);
//        if(branch != null){
//            return  branch.newCustomer(customerName, initialAmount);
//        }
//        return  false;
//    }
//
//    public boolean addCustomerTransaction (String branchName, String customerName, double amount){
//        Branch branch = findBranches(branchName);
//        if( branch != null){
//            return branch.addCustomerTransaction(customerName, amount);
//        }
//        return  false;
//    }
//    private Branch findBranches(String branchName){
//        for ( int i=0 ; i <this.branches.size(); i++){
//            Branch checkedBranch = this.branches.get(i);
//            if ( checkedBranch.getName().equals(branchName)){
//                return checkedBranch;
//            }
//        }
//        return null;
//    }
//
//    public boolean listCustomer(String branchName, boolean showTransactions){
//        Branch branch = findBranches(branchName);
//        if(branch != null){
//            System.out.println("Customer details for branch"+branch.getName());
//
//            ArrayList<Customer> branchCustomers = branch.getCustomers();
//            for (int i=0 ; i<branchCustomers.size(); i++){
//                Customer branchCustomer = branchCustomers.get(i);
//                System.out.println("Customer "+ branchCustomer.getName()+ "["+ i + "]");
//                if( showTransactions){
//                    System.out.println("Transactions");
//                    ArrayList<Double> transactions = branchCustomer.getTransactions();
//                    for(int j=0; j<transactions.size(); j++){
//                        System.out.println("["+ (J+1) + "]  Amount"+ transactions.get(j));
//                    }
//                }
//
//            }
//            return  true;
//
//        }else {
//            return false;
//        }
}

