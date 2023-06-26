public class PaymentProvider
{



    public static Payment PaymentPro(String PaymentType){
        if(PaymentType==null)
        {
            return  null;
        }
        switch(PaymentType)
        {
            case "Debit Card":return  new DebitCard();
            case "NetBanking":return  new NetBanking();
            case "Upi":return new Upi();
            case "Wallet":return  new Paytm();
        }
        return null;

    }


}
