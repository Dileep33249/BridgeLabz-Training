package multi_threading;

class Chef extends Thread {

    private String dish;
    private int totalTime; // in milliseconds

    public Chef(String name, String dish, int totalTime) {
        super(name);
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dish);

        int[] progress = {25, 50, 75, 100};
        int sleepTime = totalTime / 4;

        for (int p : progress) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
        }
    }
}
