package Sub2016Ex;

public class AdapterCont2Account implements BankAccount {

    ContBankcar contBankcar;

    public AdapterCont2Account(ContBankcar cont){
        this.contBankcar = cont;
    }

    @Override
    public void accountTransfer(BankAccount account, double amount) {
        ContBancarDebit contDebit = (ContBancarDebit) conversieLaBankAcc(account);
        contBankcar.transfer(contDebit, amount);
    }

    private ContBancarDebit conversieLaBankAcc(BankAccount account){
        DebitAccount debit = (DebitAccount) account;
        ContBancarDebit cont = new ContBancarDebit(debit.value, debit.id+"");
        return cont;
    }

}
