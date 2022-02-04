package assignment.q3.SpringCoreAssignment;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountController implements ApplicationContextAware {
    private ApplicationContext context;
    public double withdraw(long accountId, double balanceToBeWithdraw){
        double newBalance=0;
        BankAccountRepositoryImpl acc=(BankAccountRepositoryImpl) context.getBean("BankRepo");
        if(acc.getBalance(accountId)>=balanceToBeWithdraw)
            newBalance = acc.getBalance(accountId)-balanceToBeWithdraw;
        acc.updateBalance(accountId,newBalance);
        return newBalance;
    }
    public double deposit(long accountId, double balance){
        BankAccountRepositoryImpl acc=(BankAccountRepositoryImpl) context.getBean("BankRepo");
        double Newbalance = acc.getBalance(accountId)+balance;
        return acc.updateBalance(accountId,Newbalance);

    }
    public double getBalance(long accountId){

        BankAccountRepositoryImpl balance=(BankAccountRepositoryImpl) context.getBean("BankRepo");
       return balance.getBalance(accountId);

    }
    public boolean fundTransfer(long fromAccount, long toAccount, double amount){
        BankAccountRepositoryImpl accountRepository=(BankAccountRepositoryImpl) context.getBean("BankRepo");
        if(accountRepository.getBalance(fromAccount)>=amount){
           double updatedAmt= amount+accountRepository.getBalance(toAccount);

           // updating both the accounts
            accountRepository.updateBalance(fromAccount,accountRepository.getBalance(fromAccount)-amount);
            accountRepository.updateBalance(toAccount,updatedAmt);
            return true;
        }
        return false;
    }

    
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}