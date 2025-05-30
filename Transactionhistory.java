class Transactionhistory {

 
 
    String transactionId;
    String sender;
    String receiver;
    String status;
    String date;

    public Transactionhistory(String transactionId, String sender, String receiver, String status, String date) {
        this.transactionId = transactionId;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.date = date;
    }

    public void display() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
        System.out.println("------------------------------");
    }

  

    public static void main(String[] args) {
        Transactionhistory t1 = new Transactionhistory("T001", "xyz", "ram", "Successful", "14-05-2025");
        Transactionhistory t2 = new Transactionhistory("T002", "Abc", "harish","Failed", "13-025-2025");

        t1.display();
        t2.display();
    }
}
