import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {
    private List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double calculateTotalAmount(){
        double total = 0;

        return total;
    }

    public double calculateTotalInMounth(final Month month){
        double total = 0;

        return total;
    }

    public double calculateTotalForCategory(final String category){
        double total = 0;

        return total;
    }

    public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter){
        final List<BankTransaction> result = new ArrayList<>();
        for (final BankTransaction bankTransaction: bankTransactions) {
            if(bankTransactionFilter.test(bankTransaction)){
                result.add(bankTransaction);
            }
        }

        return  result;
    }
}
