public class Les75 {

    public void setLes75() {
        int[] a = {0,1, 2, 3, 4, 5};
        int[] b= {5, 10, 20, 30, 40, 50};
        System.arraycopy(a,2,b,4,2);

        for (int t:b) {
            System.out.println(t);

        }
    }
}