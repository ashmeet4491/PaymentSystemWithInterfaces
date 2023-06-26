public class CreditCard {

    public void select(String paymentType)
    {

             Payment pay=PaymentProvider.PaymentPro(paymentType);//since this is static
             pay.pay();




    }


}
