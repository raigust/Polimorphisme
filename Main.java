package notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "raihangusti066@gmail.com";
        String nomerHp = "+62 813-5884-1769";
        String mobileId = "android-7200982";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Hi there! Im using Whatsapp";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}