public class Spread implements SpreadMBean {
    private String message;

    public Spread() {
        message = "JMX Report....";
    }

//    public Spread(String message) {
//        this.message = message;
//    }

//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getMessage() {
//        return message;
//    }

    public int generateReport() {
        int first = 10;
        int second = 20;

        int sum = first + second;
        return sum;
//      System.out.print(message);
    }
}