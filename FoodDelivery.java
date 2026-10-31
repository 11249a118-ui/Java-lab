class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order is placed");
    }
}
class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order is delivered");
    }
}
class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement t1 = new OrderPlacement();
        OrderDelivery t2 = new OrderDelivery();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
